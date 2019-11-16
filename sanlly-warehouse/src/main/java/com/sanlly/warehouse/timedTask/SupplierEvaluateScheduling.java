package com.sanlly.warehouse.timedTask;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.WareStockinMapper;
import com.sanlly.warehouse.entity.WareStockin;
import com.sanlly.warehouse.entity.WareStockinExample;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;

/**
 * 
* @Package com.sanlly.warehouse.timedTask 
* @Description: 收货人员验收后15天后系统自动满分评价 
* @author jlx   
* @date 2019年10月29日 下午4:03:20 
* @version V1.0   
 */
@Component
@Configuration
@EnableScheduling   //开启定时任务
public class SupplierEvaluateScheduling implements SchedulingConfigurer{
	

	@Autowired
	private WareStockinMapper stockinMapper;
	@Autowired
	private PurchaseFeignClient purchaseFeignClient;
	
	 @Override
	 public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
		 scheduledTaskRegistrar.addTriggerTask(
	                //添加任务内容
	                () -> autoSupplierEvaluate(),
	                //2.设置执行周期
	                triggerContext -> {
	                    //每天凌晨1点执行一次
	                    String trigger = "0 0 1 * * ?";
	                	// 测试
//	                    String trigger = "0 0,10,20,30,40,50 * * * ?";
	                    //合法性校验.
	                    if (StringUtils.isEmpty(trigger)) {

	                    }
	                    //返回执行周期(Date)
	                    return new CronTrigger(trigger).nextExecutionTime(triggerContext);
	                }
	        );
	 }
	 /**
	  * 收货人员验收后15天后系统自动满分评价 
	  * 
	  */
	 public void autoSupplierEvaluate(){
			// 组装查询条件
			WareStockinExample example = new WareStockinExample();
			WareStockinExample.Criteria criteria = example.createCriteria();
			criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			// 采购送货单
			criteria.andBillTypeEqualTo(BillTypeConstants.SHDH);
			// 入库单已审核
			criteria.andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
			// 未评价
			criteria.andEvaluateStatusEqualTo(CommonEnum.NO.getCode());

			// 组装返回数据
			List<WareStockin> wareStockins = stockinMapper.selectByExample(example);
			for(WareStockin wareStockin:wareStockins) {
				if(DateUtil.differentDays(wareStockin.getCreateTime(), new Date())>15) {
//					wareStockinService.evaluateQualityAndService(wareStockin.getNo(), 10d, 10d);
					Result rs = purchaseFeignClient.evaluateQualityAndService(wareStockin.getNo(), 10d, 10d,0);
					
					if(rs.getCode()==0) {
						example.clear();
						criteria = example.createCriteria();
						criteria.andNoEqualTo(wareStockin.getNo());
						criteria.andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
						WareStockin stockin = new WareStockin();
						stockin.setEvaluateStatus(CommonEnum.YES.getCode());
						stockinMapper.updateByExampleSelective(stockin, example);
					}else {
						throw new RuntimeException("evaluateError");
					}
				}
			}
		
	 }
}


