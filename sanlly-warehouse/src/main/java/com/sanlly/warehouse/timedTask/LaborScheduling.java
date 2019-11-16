package com.sanlly.warehouse.timedTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.warehouse.dao.WareLaborAdvanceReceiveMapper;
import com.sanlly.warehouse.dao.WareLaborInformationStaffMapper;
import com.sanlly.warehouse.dao.WareLaborReceiveDetailMapper;
import com.sanlly.warehouse.entity.WareLaborAdvanceReceive;
import com.sanlly.warehouse.entity.WareLaborInformationStaff;
import com.sanlly.warehouse.entity.WareLaborInformationStaffExample;
import com.sanlly.warehouse.entity.WareLaborReceiveDetail;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import com.sanlly.warehouse.enums.TermEnum;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeOutput;
import com.sanlly.warehouse.service.LaborInsuranceSchemeService;

/**
 * ClassName: LaborScheduling
 * Description: 劳保申请定时任务
 * date: 2019/8/31 10:39
 *
 * @author zhh
 */
@Component
@Configuration
@EnableScheduling   //开启定时任务
public class LaborScheduling implements SchedulingConfigurer{
	
	@Autowired
	private WareLaborInformationStaffMapper staffDao;
	
	@Autowired
	private LaborInsuranceSchemeService schemeService;
	
	@Autowired
	private WareLaborReceiveDetailMapper receiveDetailDao;
	
	@Autowired
	private WareLaborAdvanceReceiveMapper advanceReceiveDao;
	
	 @Override
	 public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
		 scheduledTaskRegistrar.addTriggerTask(
	                //添加任务内容
	                () -> addLaborReceive(),
	                //2.设置执行周期
	                triggerContext -> {
	                    //从数据库获取执行周期 一小时执行一次
	                    String trigger = "0 0 */1 * * ?";
	                    //合法性校验.
	                    if (StringUtils.isEmpty(trigger)) {

	                    }
	                    //返回执行周期(Date)
	                    return new CronTrigger(trigger).nextExecutionTime(triggerContext);
	                }
	        );
	 }
	 /**
	  * 添加劳保申请明细单
	  * 
	  */
	 public void addLaborReceive(){
		 //查询员工对应劳保方案
		 WareLaborInformationStaffExample example = new WareLaborInformationStaffExample();
		 WareLaborInformationStaffExample.Criteria criteria = example.createCriteria();
		 criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		 //劳保福利状态是否开启
		 criteria.andIsEnabledEqualTo(CommonEnum.YES.getCode());
		 //员工是否离职
		 criteria.andIsLeaveEqualTo(CommonEnum.NO.getCode());
		 //是否分配劳保方案
		 criteria.andLabaorInsuranceNoIsNotNull();
	     List<WareLaborInformationStaff> staffs = staffDao.selectByExample(example);
	     for(WareLaborInformationStaff staff :staffs){
	    	 //根据方案号查询方案明细
	    	 if(StringUtils.isNotEmpty(staff.getLabaorInsuranceNo())){
	    	     LaborInsuranceSchemeOutput output = schemeService.getInfoByNo(staff.getLabaorInsuranceNo());
	    	     if(output!=null&&output.getDetailList()!=null){
	    	    	 for(LaborInsuranceSchemeDetailOutput detailOutput : output.getDetailList()){
	    	    		 //查询之前的自动生成的劳保申请明细
	    	    		 WareLaborReceiveDetailExample receiveExample = new WareLaborReceiveDetailExample();
	    	    		 receiveExample.createCriteria().andSparePartsEqualTo(detailOutput.getSpareParts()).andUserEqualTo(staff.getUser()).andIsLaborApplyEqualTo(CommonEnum.YES.getCode());
	    	    		 receiveExample.setOrderByClause("create_time desc");
	    	    		 List<WareLaborReceiveDetail> receiveDetails = receiveDetailDao.selectByExample(receiveExample);
	    	    		 int count = (int)receiveDetailDao.countByExample(receiveExample);
	                     if(receiveDetails!=null&&receiveDetails.size()>0){
	                    	 //获得当前时间
	        	    		 Calendar rightNow = Calendar.getInstance();
	        	    		 Date date = new Date();
	        	    		 if(receiveDetails.get(0).getCreateTime()!=null){
	        	    			 rightNow.setTime(receiveDetails.get(0).getCreateTime());
        	    	    		 //若为第二次添加则取首次分配期限
        	    	    		 if(count==1){
        	    	    			if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getFirstTerm())){
        	    	    				rightNow.add(Calendar.HOUR,4);
        	    	    			}else if(TermEnum.HALFMOON.getCode().equals(detailOutput.getFirstTerm())){
        	    	    				rightNow.add(Calendar.DATE,15);
        	    	    			}else{
        	    	    				rightNow.add(Calendar.MONTH,detailOutput.getFirstTerm());
        	    	    			}
        	    	    			 //比较一段时间后的值与当前时间的毫秒值，若超过则生成申请单明细
        	    	    			 if(date.getTime() >= rightNow.getTimeInMillis()){
        	    	    				 WareLaborReceiveDetail receiveDetail = new WareLaborReceiveDetail();
        	    	    	    		 //调用接口，获取员工备件型号
        	    	    	    		 receiveDetail.setModel(schemeService.getModel(staff.getUser(),detailOutput.getSpareParts()));
        	    	    	    		 receiveDetail.setSpareParts(detailOutput.getSpareParts());
        	    	        	    	 receiveDetail.setCreateTime(new Date());
        	    	        	    	 receiveDetail.setLastAssignDate(receiveDetails.get(0).getCreateTime());
        	    	        	    	 receiveDetail.setIsDel(PlatformConstants.ISDEL_NO);
        	    	        	    	 receiveDetail.setUser(staff.getUser());
        	    	        	    	 receiveDetail.setIsLaborApply(CommonEnum.YES.getCode());
        	    	        	    	 receiveDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
        	    	    				 receiveDetail.setApplicantNum(detailOutput.getCycleNum());
        	    	    				 if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getCycleTerm())){
        	    	    	    			rightNow.add(Calendar.HOUR,4);
        	    	    	    		 }else if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
        	    	    	    			 rightNow.add(Calendar.DATE,15);
        	    	    	    		 }else{
        	    	    	    			rightNow.add(Calendar.MONTH,detailOutput.getCycleTerm());
        	    	    	    		 }
        	    	    				 receiveDetail.setNextAssignDate(rightNow.getTime());
        	    	        	    	 receiveDetailDao.insertSelective(receiveDetail);
        	    	        	    	 //生成劳保预领单
        	    	        	    	 WareLaborAdvanceReceive advanceReceive = new WareLaborAdvanceReceive();
        	    						 advanceReceive.setUser(staff.getUser());
        	    						 advanceReceive.setSpareParts(detailOutput.getSpareParts());
        	    						 advanceReceive.setIsReceive(CommonEnum.NO.getCode());
        	    						 advanceReceive.setModel(schemeService.getModel(staff.getUser(),detailOutput.getSpareParts()));
        	    						 advanceReceive.setReceiveNum(detailOutput.getCycleNum());
        	    						 advanceReceive.setCreateTime(new Date());
        	    						 advanceReceive.setIsDel(PlatformConstants.ISDEL_NO);
        	    						 advanceReceiveDao.insertSelective(advanceReceive);
        	    	    			 }
        	    	    		//若为两次之上添加则取周期分配期限
        	    	    	    }else if(count>1){
        	    	    	    	//比较一段时间后的值与当前时间的毫秒值，若超过则生成申请单明细
        	    	    	    	if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getCycleTerm())){
        	    	    				rightNow.add(Calendar.HOUR,4);
        	    	    			}else if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
        	    	    				rightNow.add(Calendar.DATE,15);
        	    	    			}else{
        	    	    				rightNow.add(Calendar.MONTH,detailOutput.getCycleTerm());
        	    	    			}
        	    	    			 if(date.getTime() >= rightNow.getTimeInMillis()){
        	    	    				 WareLaborReceiveDetail receiveDetail = new WareLaborReceiveDetail();
        	    	    	    		 //调用接口，获取员工备件型号
        	    	    	    		 receiveDetail.setModel(schemeService.getModel(staff.getUser(),detailOutput.getSpareParts()));
        	    	    	    		 receiveDetail.setSpareParts(detailOutput.getSpareParts());
        	    	        	    	 receiveDetail.setCreateTime(new Date());
        	    	        	    	 receiveDetail.setLastAssignDate(receiveDetails.get(0).getCreateTime());
        	    	        	    	 if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getCycleTerm())){
         	    	    	    			rightNow.add(Calendar.HOUR,4);
         	    	    	    		 }else if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
             	    	    				rightNow.add(Calendar.DATE,15);
             	    	    			 }else{
         	    	    	    			rightNow.add(Calendar.MONTH,detailOutput.getCycleTerm());
         	    	    	    		 }
        	    	        	    	 receiveDetail.setNextAssignDate(rightNow.getTime());
        	    	        	    	 receiveDetail.setIsDel(PlatformConstants.ISDEL_NO);
        	    	        	    	 receiveDetail.setUser(staff.getUser());
        	    	        	    	 receiveDetail.setIsLaborApply(CommonEnum.YES.getCode());
        	    	        	    	 receiveDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
        	    	    				 receiveDetail.setApplicantNum(detailOutput.getCycleNum());
        	    	        	    	 receiveDetailDao.insertSelective(receiveDetail);
        	    	        	    	 //生成劳保预领单
        	    	        	    	 WareLaborAdvanceReceive advanceReceive = new WareLaborAdvanceReceive();
        	    						 advanceReceive.setUser(staff.getUser());
        	    						 advanceReceive.setSpareParts(detailOutput.getSpareParts());
        	    						 advanceReceive.setIsReceive(CommonEnum.NO.getCode());
        	    						 advanceReceive.setModel(schemeService.getModel(staff.getUser(),detailOutput.getSpareParts()));
        	    						 advanceReceive.setReceiveNum(detailOutput.getCycleNum());
        	    						 advanceReceive.setCreateTime(new Date());
        	    						 advanceReceive.setIsDel(PlatformConstants.ISDEL_NO);
        	    						 advanceReceiveDao.insertSelective(advanceReceive);
        	    	    			 }
        	    	    	     }
	        	    		 }
	        	    		 
	    	    		 }
	    	    	 }
	    	     }
	    	 
	    	 }
	     }
	 }
}


