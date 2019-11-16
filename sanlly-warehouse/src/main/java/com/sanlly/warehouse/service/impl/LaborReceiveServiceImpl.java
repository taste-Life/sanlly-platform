package com.sanlly.warehouse.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareLaborReceiveDetailMapper;
import com.sanlly.warehouse.dao.WareLaborReceiveMapper;
import com.sanlly.warehouse.dao.WareReturnWarehouseDetailLaborMapper;
import com.sanlly.warehouse.dao.WareReturnWarehouseLaborMapper;
import com.sanlly.warehouse.dao.WareStockoutDetailLabaorMapper;
import com.sanlly.warehouse.entity.WareLaborReceive;
import com.sanlly.warehouse.entity.WareLaborReceiveDetail;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import com.sanlly.warehouse.entity.WareLaborReceiveExample;
import com.sanlly.warehouse.enums.ApplyTypeEnum;
import com.sanlly.warehouse.enums.TermEnum;
import com.sanlly.warehouse.entity.WareLaborReceiveExample.Criteria;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailLabor;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailLaborExample;
import com.sanlly.warehouse.entity.WareReturnWarehouseLabor;
import com.sanlly.warehouse.entity.WareReturnWarehouseLaborExample;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.EditLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceiveInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborReceivePageInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.output.laborInsurance.PersonalReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborStaff.userSchemeOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.PersonalLaborStockoutOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.LaborInsuranceSchemeService;
import com.sanlly.warehouse.service.LaborInsuranceStockService;
import com.sanlly.warehouse.service.LaborReceiveService;
import com.sanlly.warehouse.service.LaborStockOutService;
import com.sanlly.warehouse.service.WareSparePartsService;

import net.bytebuddy.asm.Advice.Return;
/**
 * 劳保申请接口实现类
 * 
 * @author zhh
 *
 */
@Service
public class LaborReceiveServiceImpl extends BaseServiceImpl implements LaborReceiveService {

	@Autowired
	private WareLaborReceiveMapper wareLaborReceiveDao;
	
	@Autowired
	private WareLaborReceiveDetailMapper wareLaborReceiveDetailDao;
	
	@Autowired
	private WareSparePartsService sparePartsService;
	
	@Autowired
    private BillTypeService billTypeService;
	
	@Autowired
	private WareSparePartsService wareSparePartsService;
	
	@Autowired
	private LaborInsuranceStockService laborStockService;
	
	@Autowired
	private LaborInsuranceSchemeService schemeService;
	
	@Autowired
	private LaborStockOutService stockoutService;
	
	@Autowired
	private WareReturnWarehouseDetailLaborMapper returnDetailDao;
	
	@Autowired
	private WareReturnWarehouseLaborMapper returnDao;
	
	/**
     * 分页查询劳保申请单
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborReceiveOutput> getLaborReceivePageList(SearchLaborReceiveInput input) {
		// TODO Auto-generated method stub
		WareLaborReceiveExample example =new WareLaborReceiveExample();
		Criteria criteria = example.createCriteria();
		//筛选条件
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAdvanceWarehouseReceiptNoIsNotNull();
		//截止时间范围
		if(input.getStartDate()!=null && input.getEndDate()!=null){
			Calendar date = Calendar.getInstance();
			date.setTime(input.getEndDate());
			date.add(Calendar.DATE, 1);
            criteria.andCreateTimeBetween(input.getStartDate(),date.getTime());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }
		if(StringUtils.isNotEmpty(input.getApplicantDepartment())){
			criteria.andApplicantDepartmentEqualTo(input.getApplicantDepartment());
		}
		if(StringUtils.isNotEmpty(input.getApplicantType())){
			criteria.andApplicantTypeEqualTo(input.getApplicantType());
		}
		if(StringUtils.isNotEmpty(input.getStockoutStatus())){
			criteria.andStockoutStatusEqualTo(input.getStockoutStatus());
		}
		if(StringUtils.isNotEmpty(input.getSparePartsName())||StringUtils.isNotEmpty(input.getSparePartsNo())) {
			List<String> spares = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), input.getSparePartsName());
			if(spares!=null&&spares.size()>0) {
				WareLaborReceiveDetailExample detailExample = new WareLaborReceiveDetailExample();
				detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsIn(spares);
				List<WareLaborReceiveDetail> receiveDetails = wareLaborReceiveDetailDao.selectByExample(detailExample);
				List<Integer> ids = new ArrayList<Integer>();
				if(receiveDetails!=null&&receiveDetails.size()>0) {
					for(WareLaborReceiveDetail detail : receiveDetails) {
						ids.add(detail.getWareLaborReceive());
					} 
					criteria.andWareLaborReceiveIdIn(ids);
				}else {
					return new PagedList<LaborReceiveOutput>(input.getPageIndex(), input.getPageSize(), 0);
				}
			}else {
				return new PagedList<LaborReceiveOutput>(input.getPageIndex(), input.getPageSize(), 0);
			}
			
			
		}
		//总条数
        Integer totalItemCount=(int) wareLaborReceiveDao.countByExample(example);
        PagedList<LaborReceiveOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<WareLaborReceive> wareLaborReceives = wareLaborReceiveDao.selectByExample(example);
        //结果返回数据
        List<LaborReceiveOutput> dataList = new ArrayList<>();
        for(WareLaborReceive wareLaborReceive : wareLaborReceives){
        	LaborReceiveOutput output = new LaborReceiveOutput();
        	//封装数据
        	BeanUtils.copyProperties(wareLaborReceive, output);
        	output.setCompanyLangLang(wareLaborReceive.getCompany());
        	output.setApplicantDepartmentLangLang(wareLaborReceive.getApplicantDepartment());
        	output.setApplicantTypeLangLang(wareLaborReceive.getApplicantType());
        	output.setAuditStatusLangLang(wareLaborReceive.getAuditStatus());
        	output.setStockoutStatusLangLang(wareLaborReceive.getStockoutStatus());
        	if(wareLaborReceive.getApplicantDate()!=null){
        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setApplicantDate(sdf.format(wareLaborReceive.getApplicantDate()));
			}
        	if(wareLaborReceive.getApplicantUser()!=null){
        		//调用接口，根据id获得用户名
				output.setApplicantUserName(getUserNameByUserId(wareLaborReceive.getApplicantUser()));
        	}
        	//明细列表数据
        	List<LaborReceiveDetailOutput> detailList = new ArrayList<>();
        	//根据id查找对象
        	WareLaborReceiveDetailExample wExample = new WareLaborReceiveDetailExample();
        	wExample.createCriteria().andWareLaborReceiveEqualTo(wareLaborReceive.getWareLaborReceiveId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        	List<WareLaborReceiveDetail> wareLaborReceiveDetails = wareLaborReceiveDetailDao.selectByExample(wExample);
            if(wareLaborReceiveDetails!=null&&wareLaborReceiveDetails.size()>0){
            	for(WareLaborReceiveDetail wDetail : wareLaborReceiveDetails){
            		//封装数据
            		LaborReceiveDetailOutput detailOutput = new LaborReceiveDetailOutput();
            		BeanUtils.copyProperties(wDetail, detailOutput);
            		detailOutput.setSpareParts(wDetail.getSpareParts());
            		detailOutput.setSparePartsLangLang(wDetail.getSpareParts());
            		detailOutput.setPrice(wDetail.getPrice());
            		detailOutput.setStockoutStatusLangLang(wDetail.getStockoutStatus());
            		detailOutput.setModel(wDetail.getModel());
            		detailOutput.setUserName(getUserNameByUserId(wDetail.getUser()));
            		
            		//查询备件信息
            		detailOutput.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetail.getSpareParts())).getSparePartsNo());
                	//查询备件及型号库存数量
            		if(wDetail.getModel()!=null){
            			detailOutput.setTotalNum(laborStockService.getStockNumByKAndM(wDetail.getSpareParts(),wDetail.getModel()));
            		}
            		//查询已出库数量
                	Double stockoutNum = 0D;
                	//获得剩余出库数量
            		//获得退库数量
                	Double surplusNum = 0D;
                	
                	detailOutput.setStockoutNum(stockoutNum);
                	//根据原单号查询出库明细
                	List<LaborStockoutDetailOutput> sList = stockoutService.getStockDetailListByNo(wareLaborReceive.getAdvanceWarehouseReceiptNo());
                	if(sList!=null&&sList.size()>0){
                		for(LaborStockoutDetailOutput sdOutput : sList){
                			if(sdOutput.getNoDetailId()!=null&&sdOutput.getNoDetailId().equals(wDetail.getWareLaborReceiveDetailId())){
                				//设置已出库数量
                				stockoutNum += sdOutput.getStockoutNum();
                				WareReturnWarehouseLaborExample returnExample = new WareReturnWarehouseLaborExample();
                				returnExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
                				List<WareReturnWarehouseLabor> returnWarehouseLabors = returnDao.selectByExample(returnExample);
                				if(returnWarehouseLabors!=null&&returnWarehouseLabors.size()>0){
                					for(WareReturnWarehouseLabor returnWarehouseLabor : returnWarehouseLabors){
                						WareReturnWarehouseDetailLaborExample detailLaborExample = new WareReturnWarehouseDetailLaborExample();
                                    	detailLaborExample.createCriteria().andStockoutDetailIdEqualTo(sdOutput.getWareStockoutDetailLabaorId()).andReturnIdEqualTo(returnWarehouseLabor.getWareReturnWarehouseLaborId());
                                    	List<WareReturnWarehouseDetailLabor> list = returnDetailDao.selectByExample(detailLaborExample);
                                    	if(list!=null&&list.size()>0){
                                    		for(WareReturnWarehouseDetailLabor returnWarehouseDetailLabor : list){
                                    			surplusNum+=returnWarehouseDetailLabor.getReturnNum();
                                    		}
                                    	}
                					}
                					
                				}
                				
                			}
                		}
                	}
                	detailOutput.setStockoutNum(stockoutNum);
                	detailOutput.setSurplusNum(detailOutput.getApplicantNum()-detailOutput.getStockoutNum()-surplusNum);
                	
            	    detailList.add(detailOutput);
            	}
            	output.setDetailList(detailList);
            }
            dataList.add(output);
        }
        pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	

	/**
     * 添加劳保申请单
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addLaborReceive(AddLaborReceiveInput input) {
		// TODO Auto-generated method stub
		WareLaborReceive wareLaborReceive = new WareLaborReceive();
		//封装数据
		BeanUtils.copyProperties(input, wareLaborReceive);
		wareLaborReceive.setAdvanceWarehouseReceiptNo(billTypeService.getBillNumberByKey(input.getBillType()));
		wareLaborReceive.setCreateTime(new Date());
		wareLaborReceive.setCreateUser(getCurrentUserId());
		wareLaborReceive.setIsDel(PlatformConstants.ISDEL_NO);
		wareLaborReceive.setApplicantDate(new Date());
		//设置出库状态为未出库
		wareLaborReceive.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
		//设置审核状态为未审核
		wareLaborReceive.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		//若申请类型为劳保申请则不需要进行审核
		if(StringUtils.isNotEmpty(input.getApplicantType())&&input.getApplicantType().equals(ApplyTypeEnum.APPLY.getCode())){
			wareLaborReceive.setAuditStatus("");
		}
		wareLaborReceive.setCompany(getCurrentCompanyKey());
		wareLaborReceiveDao.insertSelective(wareLaborReceive);
		//封装申请明细
		//BigDecimal billAmount = BigDecimal.ZERO;
		if(input.getDetailList()!=null&&input.getDetailList().size()>0){
			for(LaborReceiveDetailOutput output : input.getDetailList()){
				if(!input.getApplicantType().equals(ApplyTypeEnum.APPLY.getCode())){
					WareLaborReceiveDetail wDetail = new WareLaborReceiveDetail();
					BeanUtils.copyProperties(output, wDetail);
					wDetail.setUser(input.getApplicantUser());
					wDetail.setWareLaborReceive(wareLaborReceive.getWareLaborReceiveId());
					wDetail.setCreateTime(new Date());
					wDetail.setCreateUser(getCurrentUserId());
					wDetail.setIsDel(PlatformConstants.ISDEL_NO);
					wDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
					wDetail.setPrice(output.getPrice());
					wareLaborReceiveDetailDao.insertSelective(wDetail);
				}else{
					WareLaborReceiveDetail wDetail = new WareLaborReceiveDetail();
					BeanUtils.copyProperties(output, wDetail);
					wDetail.setWareLaborReceive(wareLaborReceive.getWareLaborReceiveId());
					wDetail.setUpdateTime(new Date());
					wDetail.setUpdateUser(getCurrentUserId());
					wareLaborReceiveDetailDao.updateByPrimaryKeySelective(wDetail);
				}
				
//				//计算单据金额
//				if(output.getApplicantNum()!=null&&output.getPurchasingReferencePrice()!=null){
//					billAmount=billAmount.add(output.getPurchasingReferencePrice().multiply(new BigDecimal(output.getApplicantNum())));
//				}
			}
		}
//		//若申请类型为有偿申请，添加单据金额
//		if(StringUtils.isNotEmpty(input.getApplicantType())&&input.getApplicantType().equals(ApplyTypeEnum.PAID.getCode())){
//			wareLaborReceive.setBillAmount(billAmount);
//			wareLaborReceiveDao.updateByPrimaryKey(wareLaborReceive);
//		}
	}


	/**
     * 入库单批量审核通过
     * @param ids
     */
    @Override
    @Transactional
	public void auditPass(Integer[] ids) {
		// TODO Auto-generated method stub
		WareLaborReceiveExample example = new WareLaborReceiveExample();
		example.createCriteria().andWareLaborReceiveIdIn(Arrays.asList(ids));
		WareLaborReceive wareLaborReceive = new WareLaborReceive();
		wareLaborReceive.setUpdateTime(new Date());
		wareLaborReceive.setUpdateUser(getCurrentUserId());
		wareLaborReceive.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		wareLaborReceiveDao.updateByExampleSelective(wareLaborReceive, example);
	}


    /**
     * 入库单批量驳回
     * @param ids
     * @param reasonsRejection
     */
    @Override
    @Transactional
	public void auditReject(Integer[] ids, String reasonsRejection) {
		// TODO Auto-generated method stub
    	WareLaborReceiveExample example = new WareLaborReceiveExample();
		example.createCriteria().andWareLaborReceiveIdIn(Arrays.asList(ids));
		WareLaborReceive wareLaborReceive = new WareLaborReceive();
		wareLaborReceive.setUpdateTime(new Date());
		wareLaborReceive.setUpdateUser(getCurrentUserId());
		wareLaborReceive.setReasonsRejection(reasonsRejection);
		wareLaborReceive.setAuditStatus(AuditStateEnum.REJECTED.getCode());
		wareLaborReceiveDao.updateByExampleSelective(wareLaborReceive, example);
	}
    
    
    /**
     * 查询自动生成劳保申请单信息分页
     * @param input
     * @return
     */
    @Override
	public PagedList<LaborReceiveDetailOutput> getLaborReceiveDetailList(SearchLaborReceivePageInput input) {
		// TODO Auto-generated method stub
    	//返回数据
    	List<LaborReceiveDetailOutput> dataList = new ArrayList<>();
    	//找到生成的劳保申请类型的申请单
    	WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
    	WareLaborReceiveDetailExample.Criteria criteria = example.createCriteria();
    	
    	criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
    	criteria.andWareLaborReceiveIsNull();
    	criteria.andIsLaborApplyEqualTo(CommonEnum.YES.getCode());
    	if(input.getDepartment()!=null){
    		
    	}
    	if(input.getUser()!=null){
    		criteria.andUserEqualTo(input.getUser());
    	} 
    	if(StringUtils.isNotEmpty(input.getSparePartsName())||StringUtils.isNotEmpty(input.getSparePartsNo())){
    		List<String> keys = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), input.getSparePartsName());
    	    if(keys!=null&&keys.size()>0){
    	    	criteria.andSparePartsIn(keys);
    	    }
    	    else{
    	    	return new PagedList<>(input.getPageIndex(), input.getPageSize(), 0);
    	    }
    	}
    	//总条数
        Integer totalItemCount=(int) wareLaborReceiveDetailDao.countByExample(example);
        PagedList<LaborReceiveDetailOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
    	List<WareLaborReceiveDetail> wList = wareLaborReceiveDetailDao.selectByExample(example);
    	if(wList!=null&&wList.size()>0){
    		for(WareLaborReceiveDetail wDetail : wList){
    			LaborReceiveDetailOutput output = new LaborReceiveDetailOutput();
    			BeanUtils.copyProperties(wDetail, output);
    			SparePartsBriefOutput sBriefOutput = wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetail.getSpareParts()));
				output.setSparePartsLangLang(wDetail.getSpareParts());
				output.setSparePartsNo(sBriefOutput.getSparePartsNo());
				output.setUserName(getUserNameByUserId(wDetail.getUser()));
				//部门待完善;
				output.setDepartment("LKDEPT000001");
				output.setDepartmentLangLang("LKDEPT000001");
				output.setModel(wDetail.getModel());
				//output.setTotalNum(laborStockService.getStockNumByKAndM(wDetail.getSpareParts(), wDetail.getModel()));
				output.setSparePartsName(sBriefOutput.getSparePartsName());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setLastAssignDate(sdf.format(wDetail.getLastAssignDate()));
				output.setAssignDate(sdf.format(wDetail.getCreateTime()));
				if(wDetail.getNextAssignDate()!=null){
					output.setAfterAssignDate(sdf.format(wDetail.getNextAssignDate()));
				}
				
//				WareLaborReceiveDetailExample detailExample = new WareLaborReceiveDetailExample();
//				detailExample.createCriteria().andSparePartsEqualTo(wDetail.getSpareParts()).andUserEqualTo(wDetail.getUser()).andIsLaborApplyEqualTo(CommonEnum.YES.getCode());
//				//查询申请记录数
//				int count =(int)wareLaborReceiveDetailDao.countByExample(detailExample);
//				
//				//查询员工劳保方案分配信息
//				userSchemeOutput schemeOutput = schemeService.userLaborDetail(wDetail.getUser());
//				List<LaborInsuranceSchemeDetailOutput> schemeList=schemeService.getLaborInsuranceScheme(new EditLaborInsuranceSchemeInput(schemeOutput.getLaborScheme()));
//				for(LaborInsuranceSchemeDetailOutput scheme : schemeList){
//					
//					if(scheme.getSpareParts().equals(wDetail.getSpareParts())){
//						Calendar rightNow = Calendar.getInstance();
//						rightNow.setTime(wDetail.getCreateTime());
//						
//						if(count==1){
//							if(TermEnum.IMMEDIATE.getCode().equals(scheme.getFirstTerm())){
//	    	    				rightNow.add(Calendar.HOUR,4);
//	    	    			}else if(TermEnum.HALFMOON.getCode().equals(scheme.getFirstTerm())){
//	    	    				rightNow.add(Calendar.DATE,15);
//	    	    			}else{
//	    	    				rightNow.add(Calendar.MONTH,scheme.getFirstTerm());
//	    	    			}
//							output.setAfterAssignDate(sdf.format(rightNow.getTime()));
//						}else if(count>1){
//							if(TermEnum.IMMEDIATE.getCode().equals(scheme.getCycleTerm())){
//	    	    				rightNow.add(Calendar.HOUR,4);
//	    	    			}else if(TermEnum.HALFMOON.getCode().equals(scheme.getCycleTerm())){
//	    	    				rightNow.add(Calendar.DATE,15);
//	    	    			}else{
//	    	    				rightNow.add(Calendar.MONTH,scheme.getCycleTerm());
//	    	    			}
//							output.setAfterAssignDate(sdf.format(rightNow.getTime()));
//						}
//					}
//				}
    		    dataList.add(output);
    		}
    	}
    	pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
    
    /**
     * 已废弃
     * 查询劳保申请单信息  
     * @param input
     * @return
     */
    @Override
	public List<LaborReceiveDetailOutput> getReceiveDetailList(){
    	//返回数据
    	List<LaborReceiveDetailOutput> dataList = new ArrayList<>();
    	//找到生成的劳保申请类型的申请单
    	WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
    	example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareLaborReceiveIsNull().andIsLaborApplyEqualTo(CommonEnum.YES.getCode());
    	example.setOrderByClause("create_time desc");
    	List<WareLaborReceiveDetail> wList = wareLaborReceiveDetailDao.selectByExample(example);
    	if(wList!=null&&wList.size()>0){
    		for(WareLaborReceiveDetail wDetail : wList){
    			LaborReceiveDetailOutput output = new LaborReceiveDetailOutput();
    			BeanUtils.copyProperties(wDetail, output);
    			SparePartsBriefOutput sBriefOutput = wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetail.getSpareParts()));
				output.setSparePartsLangLang(wDetail.getSpareParts());
				output.setSparePartsNo(sBriefOutput.getSparePartsNo());
				output.setUserName(getUserNameByUserId(wDetail.getUser()));
				output.setModel(wDetail.getModel());
				output.setSparePartsName(sBriefOutput.getSparePartsName());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setLastAssignDate(sdf.format(wDetail.getLastAssignDate()));
				output.setAssignDate(sdf.format(wDetail.getCreateTime()));
				
				WareLaborReceiveDetailExample detailExample = new WareLaborReceiveDetailExample();
				detailExample.createCriteria().andSparePartsEqualTo(wDetail.getSpareParts()).andUserEqualTo(wDetail.getUser()).andIsLaborApplyEqualTo(CommonEnum.YES.getCode());
				//查询申请记录数
				int count =(int)wareLaborReceiveDetailDao.countByExample(detailExample);
				
				//查询员工劳保方案分配信息
				userSchemeOutput schemeOutput = schemeService.userDetail(wDetail.getUser());
				List<LaborInsuranceSchemeDetailOutput> schemeList=schemeService.getLaborInsuranceScheme(new EditLaborInsuranceSchemeInput(schemeOutput.getLaborScheme()));
				for(LaborInsuranceSchemeDetailOutput scheme : schemeList){
					
					if(scheme.getSpareParts().equals(wDetail.getSpareParts())){
						Calendar rightNow = Calendar.getInstance();
						rightNow.setTime(wDetail.getCreateTime());
						if(count==1){
							if(TermEnum.IMMEDIATE.getCode().equals(scheme.getFirstTerm())){
	    	    				rightNow.add(Calendar.HOUR,4);
	    	    			}else{
	    	    				rightNow.add(Calendar.MONTH,scheme.getFirstTerm());
	    	    			}
							output.setAfterAssignDate(sdf.format(rightNow.getTime()));
						}else if(count>1){
							if(TermEnum.IMMEDIATE.getCode().equals(scheme.getCycleTerm())){
	    	    				rightNow.add(Calendar.HOUR,4);
	    	    			}else{
	    	    				rightNow.add(Calendar.MONTH,scheme.getCycleTerm());
	    	    			}
							output.setAfterAssignDate(sdf.format(rightNow.getTime()));
						}
					}
				}
    		    dataList.add(output);
    		}
    	}
		return dataList;
    
    }
    /**
     * 根据申请单id查询明细
     * @param id
     * @return
     */
	@Override
	public List<LaborReceiveDetailOutput> getDetailListById(Integer id) {
		// TODO Auto-generated method stub
		WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareLaborReceiveEqualTo(id);
		List<WareLaborReceiveDetail> wDetails = wareLaborReceiveDetailDao.selectByExample(example);
		List<LaborReceiveDetailOutput> dataList = new ArrayList<>();
		if(wDetails!=null&&wDetails.size()>0){
			for(WareLaborReceiveDetail wDetail : wDetails){
				LaborReceiveDetailOutput output = new LaborReceiveDetailOutput();
				BeanUtils.copyProperties(wDetail, output);
				SparePartsBriefOutput sBriefOutput = wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetail.getSpareParts()));
				output.setSparePartsLangLang(wDetail.getSpareParts());
				output.setSparePartsNo(sBriefOutput.getSparePartsNo());
				output.setSparePartsName(sBriefOutput.getSparePartsName());
				dataList.add(output);
			}
		}
		return dataList;
	}

	/**
     * 出库回调
     * @param input
     */
	@Transactional
	@Override
	public void applyStockedManage(LaborStockoutOutput input) {
		// TODO Auto-generated method stub
		
		WareLaborReceiveExample example = new WareLaborReceiveExample();
		WareLaborReceiveExample.Criteria criteria = example.createCriteria();
        criteria.andAdvanceWarehouseReceiptNoEqualTo(input.getNo());
        List<WareLaborReceive> receiveList = wareLaborReceiveDao.selectByExample(example);
        WareLaborReceive laborReceive = receiveList.get(0);

        //修改明细出库状态
        WareLaborReceiveDetailExample detailExample = new WareLaborReceiveDetailExample();
        WareLaborReceiveDetailExample.Criteria detailCriteria = detailExample.createCriteria();
        detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        detailCriteria.andWareLaborReceiveEqualTo(laborReceive.getWareLaborReceiveId());
        List<WareLaborReceiveDetail> receiveDetails = wareLaborReceiveDetailDao.selectByExample(detailExample);
        
        for (LaborStockoutDetailOutput detailOutput : input.getDetailList()) {
        	
        	for (WareLaborReceiveDetail receiveDetail : receiveDetails) {
        		if(detailOutput.getNoDetailId().equals(receiveDetail.getWareLaborReceiveDetailId())){
        			Double num = 0D;
        			for (LaborStockoutDetailOutput detailOutput2 : stockoutService.getStockDetailListByNo(input.getNo())) {
                        if(detailOutput2.getNoDetailId().equals(receiveDetail.getWareLaborReceiveDetailId())){
                            num+=detailOutput2.getStockoutNum();
                        }
            		}
            		if(num==0D){
                		receiveDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
                	}else if(Double.doubleToLongBits(receiveDetail.getApplicantNum())>Double.doubleToLongBits(num)){
                		receiveDetail.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
                	}else if(Double.doubleToLongBits(receiveDetail.getApplicantNum())==Double.doubleToLongBits(num)){
                		receiveDetail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
                	}
                	receiveDetail.setUpdateTime(new Date());
                	receiveDetail.setUpdateUser(getCurrentUserId());
                	wareLaborReceiveDetailDao.updateByPrimaryKeySelective(receiveDetail);
        		}
            }
        }
        //修改主单据出库状态
        //判断所有明细是否全部出库
        List<String> stockoutStateList = new ArrayList<>();
        for(WareLaborReceiveDetail detail : receiveDetails){
        	if(StockoutEnum.YESOUT.getCode().equals(detail.getStockoutStatus())){
        		stockoutStateList.add(detail.getStockoutStatus());
        	}
        }
        if(stockoutStateList.size() == receiveDetails.size()){
            //全部出库
        	laborReceive.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        }else {
            //部分出库
        	laborReceive.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
        }
        laborReceive.setUpdateTime(new Date());
        laborReceive.setUpdateUser(getCurrentUserId());
        wareLaborReceiveDao.updateByPrimaryKeySelective(laborReceive);
	}


	/**
     * 根据申请单id查询申请单信息
     * @param id
     * @return
     */
	@Override
	public LaborReceiveOutput getReceiveById(Integer id) {
		// TODO Auto-generated method stub
		WareLaborReceiveExample example = new WareLaborReceiveExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareLaborReceiveIdEqualTo(id);
		List<WareLaborReceive> wareLaborReceives = wareLaborReceiveDao.selectByExample(example);
		LaborReceiveOutput output = new LaborReceiveOutput();
        if(wareLaborReceives!=null&&wareLaborReceives.size()>0){
        	//封装数据
        	WareLaborReceive wareLaborReceive = wareLaborReceives.get(0);
        	BeanUtils.copyProperties(wareLaborReceive, output);
        	output.setCompanyLangLang(wareLaborReceive.getCompany());
        	output.setApplicantDepartmentLangLang(wareLaborReceive.getApplicantDepartment());
        	output.setApplicantTypeLangLang(wareLaborReceive.getApplicantType());
        	output.setAuditStatusLangLang(wareLaborReceive.getAuditStatus());
        	output.setStockoutStatusLangLang(wareLaborReceive.getStockoutStatus());
        	if(wareLaborReceive.getApplicantDate()!=null){
        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setApplicantDate(sdf.format(wareLaborReceive.getApplicantDate()));
			}
        	if(wareLaborReceive.getApplicantUser()!=null){
        		//调用接口，根据id获得用户名
				output.setApplicantUserName(getUserNameByUserId(wareLaborReceive.getApplicantUser()));
        	}
        	//明细列表数据
        	List<LaborReceiveDetailOutput> detailList = new ArrayList<>();
        	//根据id查找对象
        	WareLaborReceiveDetailExample wExample = new WareLaborReceiveDetailExample();
        	wExample.createCriteria().andWareLaborReceiveEqualTo(wareLaborReceive.getWareLaborReceiveId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        	List<WareLaborReceiveDetail> wareLaborReceiveDetails = wareLaborReceiveDetailDao.selectByExample(wExample);
            if(wareLaborReceiveDetails!=null&&wareLaborReceiveDetails.size()>0){
            	for(WareLaborReceiveDetail wDetail : wareLaborReceiveDetails){
            		//封装数据
            		LaborReceiveDetailOutput detailOutput = new LaborReceiveDetailOutput();
            		BeanUtils.copyProperties(wDetail, detailOutput);
            		detailOutput.setSpareParts(wDetail.getSpareParts());
            		detailOutput.setSparePartsLangLang(wDetail.getSpareParts());
            		detailOutput.setPrice(wDetail.getPrice());
            		detailOutput.setStockoutStatusLangLang(wDetail.getStockoutStatus());
            		detailOutput.setModel(wDetail.getModel());
            		detailOutput.setUserName(getUserNameByUserId(wDetail.getUser()));
            		//查询备件信息
            		detailOutput.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetail.getSpareParts())).getSparePartsNo());
                	//备件及型号查询库存数量
                	detailOutput.setTotalNum(laborStockService.getStockNumByKAndM(wDetail.getSpareParts(),wDetail.getModel()));
           		    //查询已出库数量
                	Double stockoutNum = 0D;
                	detailOutput.setStockoutNum(stockoutNum);
                	//获得剩余出库数量
            		//获得退库数量
                	Double surplusNum = 0D;
                	//根据原单号查询出库明细
                	List<LaborStockoutDetailOutput> sList = stockoutService.getStockDetailListByNo(wareLaborReceive.getAdvanceWarehouseReceiptNo());
                	if(sList!=null&&sList.size()>0){
                		for(LaborStockoutDetailOutput sdOutput : sList){
                			if(sdOutput.getNoDetailId().equals(wDetail.getWareLaborReceiveDetailId())){
                				//设置已出库数量
                				stockoutNum += sdOutput.getStockoutNum();
                				WareReturnWarehouseLaborExample returnExample = new WareReturnWarehouseLaborExample();
                				returnExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
                				List<WareReturnWarehouseLabor> returnWarehouseLabors = returnDao.selectByExample(returnExample);
                				if(returnWarehouseLabors!=null&&returnWarehouseLabors.size()>0){
                					for(WareReturnWarehouseLabor returnWarehouseLabor : returnWarehouseLabors){
                						WareReturnWarehouseDetailLaborExample detailLaborExample = new WareReturnWarehouseDetailLaborExample();
                                    	detailLaborExample.createCriteria().andStockoutDetailIdEqualTo(sdOutput.getWareStockoutDetailLabaorId()).andReturnIdEqualTo(returnWarehouseLabor.getWareReturnWarehouseLaborId());
                                    	List<WareReturnWarehouseDetailLabor> list = returnDetailDao.selectByExample(detailLaborExample);
                                    	if(list!=null&&list.size()>0){
                                    		for(WareReturnWarehouseDetailLabor returnWarehouseDetailLabor : list){
                                    			surplusNum+=returnWarehouseDetailLabor.getReturnNum();
                                    		}
                                    	}
                					}
                					
                				}
                			}
                			
                		}
                	}
                	detailOutput.setStockoutNum(stockoutNum);
                	detailOutput.setSurplusNum(wDetail.getApplicantNum()-detailOutput.getStockoutNum()-surplusNum);
                	
            	    detailList.add(detailOutput);
            	}
            	output.setDetailList(detailList);
            }
        }
		return output;
	}


	/**
	 * 个人劳保待出库信息查询
	 */
	@Override
	public List<PersonalLaborStockoutOutput> getAdvanceStockoutList(Integer id) {
		// TODO Auto-generated method stub
		//根据用户id查询对应申请单明细
		WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
		example.createCriteria().andUserEqualTo(id).andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStockoutStatusNotEqualTo(StockoutEnum.YESOUT.getCode());
		List<WareLaborReceiveDetail> details = wareLaborReceiveDetailDao.selectByExample(example);
		//返回数据
		List<PersonalLaborStockoutOutput> dataList = new ArrayList<>();
		if(details!=null&&details.size()>0){
			for(WareLaborReceiveDetail detail : details){
				PersonalLaborStockoutOutput output = new PersonalLaborStockoutOutput();
				output.setApplicantNum(detail.getApplicantNum());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setApplicantDate(sdf.format(detail.getCreateTime()));
				output.setModel(detail.getModel());
				output.setSpareParts(detail.getSpareParts());
				output.setSparePartsLangLang(detail.getSpareParts());
				//获得备件号
				output.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(detail.getSpareParts())).getSparePartsNo());
				output.setStockoutStatus(detail.getStockoutStatus());
				output.setStockoutStatusLangLang(detail.getStockoutStatus());
				//查询单号
				if(detail.getWareLaborReceive()!=null){
					WareLaborReceiveExample rExample = new WareLaborReceiveExample();
					rExample.createCriteria().andWareLaborReceiveIdEqualTo(detail.getWareLaborReceive());
					List<WareLaborReceive> receives = wareLaborReceiveDao.selectByExample(rExample);
					WareLaborReceive receive = receives.get(0);
						//查询出库明细获得已出库数量
						List<LaborStockoutDetailOutput> stockoutList = stockoutService.getStockDetailListByNo(receive.getAdvanceWarehouseReceiptNo());
						Double stockoutNum =0D;
						if(stockoutList!=null&&stockoutList.size()>0){
					    	for(LaborStockoutDetailOutput sOutput : stockoutList){
					    		//若备件号一致
					    		if(detail.getWareLaborReceiveDetailId().equals(sOutput.getNoDetailId())){
					    			stockoutNum+=sOutput.getStockoutNum();
					    		}
					    	}
					    }
						output.setStockoutNum(stockoutNum);
					    dataList.add(output);
					}
				}
		}
		return dataList;
	}
	/**
	 * 个人领用劳保信息记录查询
	 */
	@Override
	public List<PersonalReceiveOutput> getPersonalReceivedList(Integer id) {
		// TODO Auto-generated method stub
		//根据用户id查询对应申请单明细
		WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
		example.createCriteria().andUserEqualTo(id).andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStockoutStatusNotEqualTo(StockoutEnum.NOTOUT.getCode());
		List<WareLaborReceiveDetail> details = wareLaborReceiveDetailDao.selectByExample(example);
		//返回数据
		List<PersonalReceiveOutput> dataList = new ArrayList<>();
		if(details!=null&&details.size()>0){
			for(WareLaborReceiveDetail receiveDetail : details){
				PersonalReceiveOutput output = new PersonalReceiveOutput();
				output.setSpareParts(receiveDetail.getSpareParts());
				output.setSparePartsNameLang(receiveDetail.getSpareParts());
				SparePartsOutput brief = sparePartsService.getSpareParts(new EditSparePartsInput(receiveDetail.getSpareParts()));
				output.setSparePartsNo(brief.getSparePartsNo());
				output.setModel(receiveDetail.getModel());
				output.setStockoutRestrictMonth(brief.getStockoutRestrictMonth());
				//获得领用时间与领用数量
				WareLaborReceiveExample receiveExample = new WareLaborReceiveExample();
				receiveExample.createCriteria().andWareLaborReceiveIdEqualTo(receiveDetail.getWareLaborReceive());
				List<WareLaborReceive> receives = wareLaborReceiveDao.selectByExample(receiveExample);
				WareLaborReceive receive = receives.get(0);
				List<LaborStockoutDetailOutput> sList= stockoutService.getStockDetailListByNo(receive.getAdvanceWarehouseReceiptNo());
			    if(sList!=null&&sList.size()>0){
			    	Double num =0D;
			    	for(LaborStockoutDetailOutput detailOutput : sList){
			    		if(detailOutput.getNoDetailId().equals(receiveDetail.getWareLaborReceiveDetailId())){
				    		num+=detailOutput.getStockoutNum();
				    	}
			    	}
			    	output.setAssignNum(num);
			    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			    	output.setAssignDate(sdf.format(receive.getUpdateTime()));
			    }
			    if(output.getAssignNum()>0){
			    	dataList.add(output);
			    }
			}
		}
		
		return dataList;
	}
	
	/**
	 * 个人可领用劳保信息查询
	 */
	@Override
	public List<PersonalReceiveOutput> getPersonalReceiveList(Integer id) {
		// TODO Auto-generated method stub
		//根据用户id查询对应申请单明细
		WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
		example.createCriteria().andUserEqualTo(id).andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsLaborApplyEqualTo(CommonEnum.YES.getCode()).andWareLaborReceiveIsNull();
		List<WareLaborReceiveDetail> details = wareLaborReceiveDetailDao.selectByExample(example);
		//返回数据
		List<PersonalReceiveOutput> dataList = new ArrayList<>();
		if(details!=null&&details.size()>0){
			for(WareLaborReceiveDetail receiveDetail : details){
				PersonalReceiveOutput output = new PersonalReceiveOutput();
				output.setSpareParts(receiveDetail.getSpareParts());
				output.setSparePartsNameLang(receiveDetail.getSpareParts());
				SparePartsOutput brief = sparePartsService.getSpareParts(new EditSparePartsInput(receiveDetail.getSpareParts()));
				output.setSparePartsNo(brief.getSparePartsNo());
				output.setModel(schemeService.getModel(id, receiveDetail.getSpareParts()));
				output.setStockoutRestrictMonth(brief.getStockoutRestrictMonth());
				//获得分配数量与分配日期
			    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			    output.setAssignDate(sdf.format(receiveDetail.getCreateTime()));
			    output.setAssignNum(receiveDetail.getApplicantNum());
			    dataList.add(output);
			}
		}
		return dataList;
	}
}
