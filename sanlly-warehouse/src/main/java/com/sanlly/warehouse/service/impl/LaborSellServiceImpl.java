package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.sanlly.warehouse.dao.WareLaborStockMapper;
import com.sanlly.warehouse.dao.WareSellProgrammeDetailMapper;
import com.sanlly.warehouse.dao.WareSellProgrammeMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.entity.WareLaborReceive;
import com.sanlly.warehouse.entity.WareLaborReceiveDetail;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import com.sanlly.warehouse.entity.WareLaborReceiveExample;
import com.sanlly.warehouse.entity.WareSellProgramme;
import com.sanlly.warehouse.entity.WareSellProgrammeDetail;
import com.sanlly.warehouse.entity.WareSellProgrammeDetailExample;
import com.sanlly.warehouse.entity.WareSellProgrammeExample;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareSpareTexture;
import com.sanlly.warehouse.entity.WareSpareTextureExample;
import com.sanlly.warehouse.entity.WareSpareUnit;
import com.sanlly.warehouse.entity.WareSpareUnitExample;
import com.sanlly.warehouse.enums.ApplyTypeEnum;
import com.sanlly.warehouse.enums.OutStatusEnum;
import com.sanlly.warehouse.entity.WareSellProgrammeExample.Criteria;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.AddLaborSellInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReceive.SearchLaborSellInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock.LaborReturnStockDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborSell.LaborSellDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborSell.LaborSellOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.LaborInsuranceStockService;
import com.sanlly.warehouse.service.LaborSellService;
import com.sanlly.warehouse.service.LaborStockOutService;
import com.sanlly.warehouse.service.WareSparePartsService;

@Service
public class LaborSellServiceImpl extends BaseServiceImpl implements LaborSellService{
	@Autowired
	private WareSellProgrammeMapper wareSellProgrammeDao;
	
	@Autowired
	private WareSellProgrammeDetailMapper wareSellProgrammeDetailDao;
	
	@Autowired
	private WareSparePartsService sparePartsService;
	
	@Autowired
    private BillTypeService billTypeService;
	
	@Autowired
	private LaborInsuranceStockService stockService;
	
	@Autowired
	private LaborStockOutService stockoutService;
	
	@Autowired
	private WareSparePartsMapper sparePartsDao;
	/**
     * 分页查询劳保销售申请单
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborSellOutput> getLaborSellPageList(SearchLaborSellInput input) {
		// TODO Auto-generated method stub
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		Criteria criteria = example.createCriteria();
		//筛选条件
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//截止时间范围
		if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }
		if(StringUtils.isNotEmpty(input.getApplyDepartment())){
			criteria.andApplyDepartmentEqualTo(input.getApplyDepartment());
		}
		if(StringUtils.isNotEmpty(input.getAuditStatus())){
			criteria.andAuditStatusEqualTo(input.getAuditStatus());
		}
		//总条数
        Integer totalItemCount=(int) wareSellProgrammeDao.countByExample(example);
        PagedList<LaborSellOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<WareSellProgramme> wsps = wareSellProgrammeDao.selectByExample(example);
        //结果返回数据
        List<LaborSellOutput> dataList = new ArrayList<>();
        for(WareSellProgramme wsp : wsps){
        	LaborSellOutput output = new LaborSellOutput();
        	//封装数据
        	BeanUtils.copyProperties(wsp, output);
        	output.setStockoutStatusLangLang(wsp.getStockoutStatus());
        	output.setApplyDepartmentLangLang(wsp.getApplyDepartment());
        	output.setAuditStatusLangLang(wsp.getAuditStatus());
        	output.setCompanyLangLang(wsp.getCompany());
        	output.setStatusLangLang(wsp.getStatus());
        	output.setBuyerLangLang(wsp.getBuyer());
        	if(wsp.getCreateTime()!=null){
        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setApplyDate(sdf.format(wsp.getCreateTime()));
			}
        	if(wsp.getApplyUser()!=null){
				output.setApplyUserName(getUserNameByUserId(wsp.getApplyUser()));
        	}
        	//明细列表数据
        	List<LaborSellDetailOutput> detailList = new ArrayList<>();
        	//根据id查找对象
        	WareSellProgrammeDetailExample wExample = new WareSellProgrammeDetailExample();
        	wExample.createCriteria().andWareSellProgrammeEqualTo(wsp.getWareSellProgrammeId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        	List<WareSellProgrammeDetail> wDetails = wareSellProgrammeDetailDao.selectByExample(wExample);
            if(wDetails!=null&&wDetails.size()>0){
            	for(WareSellProgrammeDetail wDetail : wDetails){
            		//封装数据
            		LaborSellDetailOutput detailOutput = new LaborSellDetailOutput();
            		BeanUtils.copyProperties(wDetail, detailOutput);
            		detailOutput.setStockoutStatusLangLang(wDetail.getStockoutStatus());
            		detailOutput.setSparePartsLangLang(wDetail.getSpareParts());
            		//查询备件信息
            		detailOutput.setModel(wDetail.getModel());
            		detailOutput.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetail.getSpareParts())).getSparePartsNo());
                	//查询备件库存数量
            		detailOutput.setTotalNum(stockService.getStockNumByKAndM(wDetail.getSpareParts(),wDetail.getModel()));
//            		WareLaborStockExample wStockExample = new WareLaborStockExample();
//            		wStockExample.createCriteria().andSparePartsEqualTo(wDetail.getSpareParts());
//            		List<WareLaborStock> wStocks = wareLaborStockDao.selectByExample(wStockExample);
//            	    for(WareLaborStock wStock : wStocks){
//            	    	detailOutput.setActualSurplusNum(wStock.getActualSurplusNum());
//            	    }
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
     * 添加劳保销售申请单
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addLaborSell(AddLaborSellInput input) {
		// TODO Auto-generated method stub
		WareSellProgramme wSellProgramme = new WareSellProgramme();
		//封装数据
		BeanUtils.copyProperties(input, wSellProgramme);
		//生成单号
		wSellProgramme.setAdvanceWarehouseReceiptNo(billTypeService.getBillNumberByKey(input.getBillType()));
		wSellProgramme.setCreateTime(new Date());
		wSellProgramme.setCreateUser(getCurrentUserId());
		wSellProgramme.setIsDel(PlatformConstants.ISDEL_NO);
		//设置审核状态为未审核
		wSellProgramme.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		wSellProgramme.setCompany(getCurrentCompanyKey());
		wSellProgramme.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
		wSellProgramme.setIsStockSbs(CommonEnum.NO.getCode());
		wSellProgramme.setStatus(OutStatusEnum.NO.getCode());
		//设置申请类型为劳保销售类型
		wSellProgramme.setApplyType(ApplyTypeEnum.SELL.getCode());
		wareSellProgrammeDao.insertSelective(wSellProgramme);
		//封装申请明细
		BigDecimal totalAmount = BigDecimal.ZERO;
		if(input.getDetailList()!=null&&input.getDetailList().size()>0){
			for(LaborSellDetailOutput output : input.getDetailList()){
				WareSellProgrammeDetail wDetail = new WareSellProgrammeDetail();
				BeanUtils.copyProperties(output, wDetail);
				wDetail.setWareSellProgramme(wSellProgramme.getWareSellProgrammeId());
				wDetail.setCreateTime(new Date());
				wDetail.setCreateUser(getCurrentUserId());
				wDetail.setPrice(output.getPrice());
				wDetail.setIsDel(PlatformConstants.ISDEL_NO);
				wDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
				wDetail.setTotalAmount(output.getPrice().multiply(new BigDecimal(output.getApplyNum())));
					
				wareSellProgrammeDetailDao.insertSelective(wDetail);
				//单据总金额
				totalAmount=totalAmount.add(wDetail.getTotalAmount());
			}
		}
		//设置单据总金额
		wSellProgramme.setTotalAmount(totalAmount);
		wareSellProgrammeDao.updateByPrimaryKeySelective(wSellProgramme);
	}

	/**
     * 销售申请单批量通过
     * @param ids
     * @param reasonsRejection
     */
	@Override
	public void auditPass(Integer[] ids) {
		// TODO Auto-generated method stub
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		example.createCriteria().andWareSellProgrammeIdIn(Arrays.asList(ids));
		WareSellProgramme wsp = new WareSellProgramme();
		wsp.setUpdateTime(new Date());
		wsp.setUpdateUser(getCurrentUserId());
		wsp.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		wareSellProgrammeDao.updateByExampleSelective(wsp, example);
	}

	/**
     * 销售申请单批量驳回
     * @param ids
     * @param reasonsRejection
     */
	@Override
	public void auditReject(Integer[] ids, String reasonsRejection) {
		// TODO Auto-generated method stub
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		example.createCriteria().andWareSellProgrammeIdIn(Arrays.asList(ids));
		WareSellProgramme wsp = new WareSellProgramme();
		wsp.setUpdateTime(new Date());
		wsp.setUpdateUser(getCurrentUserId());
		wsp.setReasonsRejection(reasonsRejection);
		wsp.setAuditStatus(AuditStateEnum.REJECTED.getCode());
		wareSellProgrammeDao.updateByExampleSelective(wsp, example);
	}

	@Override
	public List<LaborSellDetailOutput> getLaborSellDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * 根据申请单id查询明细
     * @param id
     * @return
     */
	@Override
	public LaborSellOutput getDetailListById(Integer id) {
		// TODO Auto-generated method stub
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSellProgrammeIdEqualTo(id);
		List<WareSellProgramme> wareSellProgrammes = wareSellProgrammeDao.selectByExample(example);
		LaborSellOutput output = new LaborSellOutput();
        if(wareSellProgrammes!=null&&wareSellProgrammes.size()>0){
        	//封装数据
        	WareSellProgramme sellProgramme = wareSellProgrammes.get(0);
        	BeanUtils.copyProperties(sellProgramme, output);
        	output.setCompanyLangLang(sellProgramme.getCompany());
        	output.setApplyDepartmentLangLang(sellProgramme.getApplyDepartment());
        	output.setApplyTypeLangLang(sellProgramme.getApplyType());
        	output.setAuditStatusLangLang(sellProgramme.getAuditStatus());
        	output.setStockoutStatusLangLang(sellProgramme.getStockoutStatus());
        	if(sellProgramme.getCreateTime()!=null){
        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setApplyDate(sdf.format(sellProgramme.getCreateTime()));
			}
        	if(sellProgramme.getApplyUser()!=null){
        		//调用接口，根据id获得用户名
				output.setApplyUserName(getUserNameByUserId(sellProgramme.getApplyUser()));
        	}
        	//明细列表数据
        	List<LaborSellDetailOutput> detailList = new ArrayList<>();
        	//根据id查找对象
        	WareSellProgrammeDetailExample wExample = new WareSellProgrammeDetailExample();
        	wExample.createCriteria().andWareSellProgrammeEqualTo(sellProgramme.getWareSellProgrammeId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        	List<WareSellProgrammeDetail> wSellProgrammeDetails = wareSellProgrammeDetailDao.selectByExample(wExample);
            if(wSellProgrammeDetails!=null&&wSellProgrammeDetails.size()>0){
            	for(WareSellProgrammeDetail wDetail : wSellProgrammeDetails){
            		//封装数据
            		LaborSellDetailOutput detailOutput = new LaborSellDetailOutput();
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
                	detailOutput.setTotalNum(stockService.getStockNumByKAndM(wDetail.getSpareParts(),wDetail.getModel()));
           		    //查询已出库数量
                	Double stockoutNum = 0D;
                	detailOutput.setStockoutNum(stockoutNum);
                	//根据原单号查询出库明细
                	List<LaborStockoutDetailOutput> sList = stockoutService.getStockDetailListByNo(sellProgramme.getAdvanceWarehouseReceiptNo());
                	if(sList!=null&&sList.size()>0){
                		for(LaborStockoutDetailOutput sdOutput : sList){
                			if(sdOutput.getSpareParts().equals(wDetail.getSpareParts())&&sdOutput.getModel().equals(wDetail.getModel())){
                				//设置已出库数量
                				stockoutNum += sdOutput.getStockoutNum();
                			}
                		}
                		detailOutput.setStockoutNum(stockoutNum);
                	}
            	    detailList.add(detailOutput);
            	}
            	output.setDetailList(detailList);
            }
        }
		return output;
	}
	
	/**
     * 根据销售单号查询出库明细
     * @param sellNo
     * @return
     */
    @Override
	public List<LaborReturnStockDetailOutput> getreturnListByNo(String sellNo) {
    	List<LaborReturnStockDetailOutput> dataList = new ArrayList<>();
		List<LaborStockoutDetailOutput> detailOutputs = stockoutService.getStockDetailListByNo(sellNo);
		if(detailOutputs!=null&&detailOutputs.size()>0){
			for(LaborStockoutDetailOutput detailOutput : detailOutputs){
				LaborReturnStockDetailOutput returnOutput = new LaborReturnStockDetailOutput();
				returnOutput.setSpareParts(detailOutput.getSpareParts());
				returnOutput.setSparePartsNameLang(detailOutput.getSpareParts());
				returnOutput.setSparePartsBatch(detailOutput.getSparePartsBatch());
				returnOutput.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(detailOutput.getSpareParts())).getSparePartsNo());
				returnOutput.setModel(detailOutput.getModel());
				returnOutput.setReturnedNum(stockService.getReturnedNumByNo(sellNo, detailOutput.getSparePartsBatch()));
				returnOutput.setStockoutNum(detailOutput.getStockoutNum());
				returnOutput.setStockoutNo(detailOutput.getStockoutNo());
				dataList.add(returnOutput);
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
	public void sellStockedManage(LaborStockoutOutput input) {
		// TODO Auto-generated method stub
		//修改主单据出库状态
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		WareSellProgrammeExample.Criteria criteria = example.createCriteria();
        criteria.andAdvanceWarehouseReceiptNoEqualTo(input.getNo());
        List<WareSellProgramme> sellList = wareSellProgrammeDao.selectByExample(example);
        WareSellProgramme laborSell = sellList.get(0);
        //laborReceive.setStockoutStatus(input.getStockoutStatus());

        //修改明细出库状态
        WareSellProgrammeDetailExample detailExample = new WareSellProgrammeDetailExample();
        WareSellProgrammeDetailExample.Criteria detailCriteria = detailExample.createCriteria();
        detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        detailCriteria.andWareSellProgrammeEqualTo(laborSell.getWareSellProgrammeId());
        List<WareSellProgrammeDetail> sellDetails = wareSellProgrammeDetailDao.selectByExample(detailExample);
        
        for (LaborStockoutDetailOutput detailOutput : input.getDetailList()) {
        	
        	for (WareSellProgrammeDetail sellDetail : sellDetails) {
                if(detailOutput.getSpareParts().equals(sellDetail.getSpareParts())&&detailOutput.getModel().equals(sellDetail.getModel())){
                	Double num = 0D;
                	for (LaborStockoutDetailOutput detailOutput2 : stockoutService.getStockDetailListByNo(input.getNo())) {
                        if(detailOutput2.getSpareParts().equals(sellDetail.getSpareParts())&&detailOutput2.getModel().equals(sellDetail.getModel())){
                            num+=detailOutput2.getStockoutNum();
                        }
            		}
                	if(num==0D){
                		sellDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
                	}else if(Double.doubleToLongBits(sellDetail.getApplyNum())>Double.doubleToLongBits(num)){
                		sellDetail.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
                	}else if(Double.doubleToLongBits(sellDetail.getApplyNum())==Double.doubleToLongBits(num)){
                		sellDetail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
                	}
                	sellDetail.setUpdateTime(new Date());
                	sellDetail.setUpdateUser(getCurrentUserId());
                	wareSellProgrammeDetailDao.updateByPrimaryKeySelective(sellDetail);
                }
            }
        }
        
        //判断所有明细是否全部出库
        List<String> stockoutStateList = new ArrayList<>();
        for(WareSellProgrammeDetail detail : sellDetails){
        	if(StockoutEnum.YESOUT.getCode().equals(detail.getStockoutStatus())){
        		stockoutStateList.add(detail.getStockoutStatus());
        	}
        }
        if(stockoutStateList.size() == sellDetails.size()){
            //全部出库
        	laborSell.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        }else {
            //部分出库
        	laborSell.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
        }
        laborSell.setUpdateTime(new Date());
        laborSell.setUpdateUser(getCurrentUserId());
        laborSell.setStatus(OutStatusEnum.NO.getCode());
        wareSellProgrammeDao.updateByPrimaryKeySelective(laborSell);
	}

	/**
     * 获取销售备件列表
     * 
     */
	@Override
	public List<LaborSellDetailOutput> getSparePartsList(SearchSparePartsInput input) {
		// TODO Auto-generated method stub
		//调用接口获取劳保类型所有备件
		WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsCategoriesEqualTo(input.getSparePartsCategories());
        if(input.getSparePartsNo()!=null && input.getSparePartsNo()!=""){
            criteria.andSparePartsNoLike("%"+input.getSparePartsNo()+"%");
        }
        if(input.getSparePartsName()!=null && input.getSparePartsName()!=""){
        	if(isChineseRequest()){
        		criteria.andSparePartsNameLike("%"+input.getSparePartsName()+"%");
            }else{
            	criteria.andSparePartsNameEnLike("%"+input.getSparePartsName()+"%");
            }
        }
        List<WareSpareParts> spareList = sparePartsDao.selectByExample(example);
		List<LaborSellDetailOutput> dataList = new ArrayList<>();
		if(spareList!=null&&spareList.size()>0){
			for(WareSpareParts sparePartsBrief : spareList){
				List<String> modelList = new ArrayList<>();
				if(StringUtils.isNotEmpty(sparePartsBrief.getModel())){
					modelList = Arrays.asList(sparePartsBrief.getModel().split(","));
				}else{
					modelList.add("通用型号");
				}
				for(String model : modelList){
					LaborSellDetailOutput output = new LaborSellDetailOutput();
					output.setSpareParts(sparePartsBrief.getKey());
					output.setSparePartsLangLang(sparePartsBrief.getKey());
					output.setSparePartsName(sparePartsBrief.getSparePartsName());
					output.setSparePartsNo(sparePartsBrief.getSparePartsNo());
					output.setModel(model);
					output.setPrice(sparePartsBrief.getPurchasingReferencePrice());
					//获取备件库存数量
					Double num = stockService.getStockNumByKAndM(sparePartsBrief.getKey(), model);
					output.setTotalNum(num);
					if(output.getTotalNum()>0) {
						dataList.add(output);
					}
					
				}
			}
		}
		return dataList;
	}

	/**
     * 销售确认
     * @param id
     */
	@Override
	public void sellConfirm(Integer id) {
		// TODO Auto-generated method stub
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		example.createCriteria().andWareSellProgrammeIdEqualTo(id);
		WareSellProgramme wsp = new WareSellProgramme();
		wsp.setUpdateTime(new Date());
		wsp.setUpdateUser(getCurrentUserId());
		wsp.setIsStockSbs(CommonEnum.YES.getCode());
		wsp.setStatus(OutStatusEnum.YES.getCode());
		wareSellProgrammeDao.updateByExampleSelective(wsp, example);
		
		//传sbs
	}
	
	/**
     * 销售取消确认
     * @param id
     */
	@Override
	public void sellCancelConfirm(Integer id) {
		// TODO Auto-generated method stub
		WareSellProgrammeExample example = new WareSellProgrammeExample();
		example.createCriteria().andWareSellProgrammeIdEqualTo(id);
		WareSellProgramme wsp = new WareSellProgramme();
		wsp.setUpdateTime(new Date());
		wsp.setUpdateUser(getCurrentUserId());
		wsp.setIsStockSbs(CommonEnum.YES.getCode());
		wsp.setStatus(OutStatusEnum.CANCEL.getCode());
		wareSellProgrammeDao.updateByExampleSelective(wsp, example);
		
		//传sbs
	}

}
