package com.sanlly.warehouse.service.impl;

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
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.dao.WareLaborReceiveMapper;
import com.sanlly.warehouse.dao.WareSellProgrammeMapper;
import com.sanlly.warehouse.dao.WareStockoutDetailLabaorMapper;
import com.sanlly.warehouse.dao.WareStockoutLabaorMapper;
import com.sanlly.warehouse.entity.WareLaborReceive;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import com.sanlly.warehouse.entity.WareLaborReceiveExample;
import com.sanlly.warehouse.entity.WareSellProgramme;
import com.sanlly.warehouse.entity.WareSellProgrammeExample;
import com.sanlly.warehouse.entity.WareStockoutDetailLabaor;
import com.sanlly.warehouse.entity.WareStockoutDetailLabaorExample;
import com.sanlly.warehouse.entity.WareStockoutLabaor;
import com.sanlly.warehouse.entity.WareStockoutLabaorExample;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.AddLaborStockoutDetailInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.AddLaborStockoutInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.EditLaborStockoutIntput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.SearchLaborStockoutInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.stockout.SearchStockoutInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.laborInsurance.PersonalReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn.LaborStockOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.PersonalLaborStockoutOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.LaborInsuranceStockService;
import com.sanlly.warehouse.service.LaborReceiveService;
import com.sanlly.warehouse.service.LaborSellService;
import com.sanlly.warehouse.service.LaborStockOutService;
import com.sanlly.warehouse.service.WareSparePartsService;
/**
 * ClassName: LaborStockoutServiceImpl
 * Description: 劳保出库服务实现层
 * date: 2019/9/5 14:26
 *
 * @author zhh
 */
@Service
public class LaborStockoutServiceImpl extends BaseServiceImpl implements LaborStockOutService {

	@Autowired
    private WareStockoutLabaorMapper stockoutLabaorDao;

    @Autowired
    private WareStockoutDetailLabaorMapper stockoutDetailLabaorDao;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private LaborInsuranceStockService stockService;

    @Autowired
    private BillTypeService billTypeService;
    
    @Autowired
    private LaborReceiveService receiveService;
    
    @Autowired
    private LaborSellService sellService;
    
    @Autowired
    private WareLaborReceiveMapper receiveDao;
    
    @Autowired
    private WareSellProgrammeMapper sellDao;
    
    /**
     * 分页查询劳保出库单
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborStockoutOutput> stockoutPageList(SearchLaborStockoutInput input) {
		// TODO Auto-generated method stub
		//组装查询条件
        WareStockoutLabaorExample example = new WareStockoutLabaorExample();
        WareStockoutLabaorExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time desc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(StringUtils.isNotEmpty(input.getNo())){
            criteria.andLabaorStockoutNoLike("%"+input.getNo()+"%");
        }
        if(StringUtils.isNotEmpty(input.getReceiveDepartment())){
            criteria.andReceiveDepartmentEqualTo(input.getReceiveDepartment());
        }
        if(input.getReceiveUser()!=null){
            criteria.andReceiveUserEqualTo(input.getReceiveUser());
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
        	List<String> nos = new ArrayList<>();
        	//根据原单号查询申请时间
        		WareSellProgrammeExample sellExample = new WareSellProgrammeExample();
        		WareSellProgrammeExample.Criteria sellCriteria = sellExample.createCriteria();
        		sellCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        		sellCriteria.andStockoutStatusNotEqualTo(StockoutEnum.NOTOUT.getCode());
        		Calendar c = Calendar.getInstance();
        		c.setTime(input.getEndDate());
        		c.add(Calendar.DATE, 1);
        		sellCriteria.andCreateTimeBetween(input.getStartDate(),c.getTime());
        		
            	List<WareSellProgramme> sells = sellDao.selectByExample(sellExample);
            	for(WareSellProgramme sell : sells){
            		nos.add(sell.getAdvanceWarehouseReceiptNo());
            	}
        		WareLaborReceiveExample receiveExample = new WareLaborReceiveExample();
            	WareLaborReceiveExample.Criteria receiveCriteria = receiveExample.createCriteria();
            	receiveCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            	receiveCriteria.andStockoutStatusNotEqualTo(StockoutEnum.NOTOUT.getCode());
        		receiveCriteria.andApplicantDateBetween(input.getStartDate(),c.getTime());
            	
            	List<WareLaborReceive> receives = receiveDao.selectByExample(receiveExample);
            	for(WareLaborReceive receive : receives){
            		nos.add(receive.getAdvanceWarehouseReceiptNo());
            	}
        	
        	if(nos!=null&&nos.size()>0){
        		criteria.andNoIn(nos);
        	}else{
        		return new PagedList<>(input.getPageIndex(),input.getPageSize(),0);
        	}        	
        }
        if(input.getSparePartsName()!=null && input.getSparePartsName()!=""){
            WareStockoutDetailLabaorExample detailExample = new WareStockoutDetailLabaorExample();
            WareStockoutDetailLabaorExample.Criteria detailCriteria = detailExample.createCriteria();
            detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            List<String> KeyList = sparePartsService.getSparePartsKeyListByLike("", input.getSparePartsName());
            List<Integer> stockoutId = new ArrayList<>();
            if(KeyList!=null&&KeyList.size()>0){
            	detailCriteria.andSparePartsIn(KeyList);
                List<WareStockoutDetailLabaor> wareStockoutDetails = stockoutDetailLabaorDao.selectByExample(detailExample);
                for (WareStockoutDetailLabaor stockoutDetail : wareStockoutDetails) {
                    stockoutId.add(stockoutDetail.getLabaorStockout());
                }
            }
            if(stockoutId!=null&&stockoutId.size()>0){
            	criteria.andWareStockoutLabaorIdIn(stockoutId);
            }else{
            	return new PagedList<>(input.getPageIndex(),input.getPageSize(),0);
            }
            
        }
        //查询页数
        Integer totalItemCount = (int) stockoutLabaorDao.countByExample(example);
        PagedList<LaborStockoutOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        //组装返回数据
        List<WareStockoutLabaor> wareStockouts = stockoutLabaorDao.selectByExample(example);
        List<LaborStockoutOutput> dataList = new ArrayList<>();
        for (WareStockoutLabaor wareStockout : wareStockouts) {
        	LaborStockoutOutput output = new LaborStockoutOutput();
            BeanUtils.copyProperties(wareStockout,output);
            output.setCompanyLangLang(wareStockout.getCompany());
            output.setStatusLangLang(wareStockout.getStatus());
            output.setWarehouseLangLang(wareStockout.getWarehouse());
            output.setAuditStatusLangLang(wareStockout.getAuditStatus());
            output.setBillTypeLangLang(wareStockout.getBillType());
            output.setReceiveDepartmentLangLang(wareStockout.getReceiveDepartment());
            output.setReceiveUserName(getUserNameByUserId(wareStockout.getReceiveUser()));
            output.setStockoutStatusLangLang(wareStockout.getStockoutStatus());
            output.setIsStockSbsLangLang(wareStockout.getIsStockSbs());
            output.setDetailList(getStockDetailListById(wareStockout));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //获得申请人申请时间
            if(!wareStockout.getBillType().equals("LKBILLTYPE000046")){
            	WareLaborReceiveExample receiveExample = new WareLaborReceiveExample();
                receiveExample.createCriteria().andAdvanceWarehouseReceiptNoEqualTo(wareStockout.getNo());
                List<WareLaborReceive> receives = receiveDao.selectByExample(receiveExample);
                if(receives!=null&&receives.size()>0){
                	WareLaborReceive receive = receives.get(0);
                    output.setApplicantUser(receive.getApplicantUser());
                    output.setApplicantUserName(getUserNameByUserId(receive.getApplicantUser()));
                    output.setApplicantDate(sdf.format(receive.getApplicantDate()));
                }
            }else{
            	WareSellProgrammeExample sellExample = new WareSellProgrammeExample();
            	sellExample.createCriteria().andAdvanceWarehouseReceiptNoEqualTo(wareStockout.getNo());
            	List<WareSellProgramme> sells = sellDao.selectByExample(sellExample);
            	if(sells!=null&&sells.size()>0){
            		WareSellProgramme sell = sells.get(0);
            		output.setApplicantUser(sell.getApplyUser());
            		output.setApplicantUserName(getUserNameByUserId(sell.getApplyUser()));
            		output.setApplicantDate(sdf.format(sell.getCreateTime()));
            	}
            }
            
            
            dataList.add(output);
        }
        pagedList.getDataList().addAll(dataList);
        return pagedList;
	}

	/**
     * 新增出库单
     * @param input
     */
	@Override
	@Transactional
	public Integer addStockout(AddLaborStockoutInput input) {
		// TODO Auto-generated method stub
		for (AddLaborStockoutDetailInput detailInput : input.getDetailList()) {
			stockService.setStock(detailInput);
        }
		WareStockoutLabaor stockout = new WareStockoutLabaor();
        stockout.setLabaorStockoutNo(billTypeService.getBillNumberByKey(input.getBillType()));
        stockout.setNo(input.getNo());
        stockout.setCompany(getCurrentCompanyKey());
        //出库仓库待完善
        stockout.setWarehouse(input.getWarehouse());
        
        stockout.setBillType(input.getBillType());
        stockout.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
        stockout.setReceiveDepartment(input.getReceiveDepartment());
        stockout.setReceiveUser(input.getReceiveUser());
        stockout.setStatus(CommonEnum.NO.getCode());
        stockout.setIsStockSbs(CommonEnum.NO.getCode());
        stockout.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
        stockout.setIsDel(PlatformConstants.ISDEL_NO);
        stockout.setCreateTime(new Date());
        stockout.setCreateUser(getCurrentUserId());
        stockoutLabaorDao.insertSelective(stockout);
        List<AddLaborStockoutDetailInput> detailList = input.getDetailList();
        for (AddLaborStockoutDetailInput detailInput : detailList) {
            WareStockoutDetailLabaor stockoutDetail = new WareStockoutDetailLabaor();
            stockoutDetail.setStockoutNum(DefaultConstants.DOUBLEDEFAULT);
            stockoutDetail.setLabaorStockout(stockout.getWareStockoutLabaorId());
            stockoutDetail.setDefaultWarehouseType(detailInput.getWarehouseType());
            stockoutDetail.setSparePartsBatch(detailInput.getSparePartsBatch());
            stockoutDetail.setSpareParts(detailInput.getSpareParts());
            stockoutDetail.setUseUser(detailInput.getUser());
            stockoutDetail.setYard(detailInput.getYard());
            stockoutDetail.setIsDel(PlatformConstants.ISDEL_NO);
            stockoutDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
            stockoutDetail.setTotalAmount(detailInput.getTotalAmount());
            stockoutDetail.setCreateTime(new Date());
            stockoutDetail.setCreateUser(getCurrentUserId());
            if(input.getBillType().equals("LKBILLTYPE000046")){
            	stockoutDetail.setNoDetailId(detailInput.getWareSellProgrammeDetailId());
            }else{
            	stockoutDetail.setNoDetailId(detailInput.getWareLaborReceiveDetailId());
            }
            
            stockoutDetail.setModel(detailInput.getModel());
            if (detailInput.getStockoutNum() != null) {
                stockoutDetail.setStockoutNum(detailInput.getStockoutNum());
            }
            stockoutDetailLabaorDao.insert(stockoutDetail);
        }
        return stockout.getWareStockoutLabaorId();
	}

	/**
     * 修改出库单
     * @param input
     */
	@Override
	@Transactional
	public void editStockout(EditLaborStockoutIntput input) {
		// TODO Auto-generated method stub
		WareStockoutLabaor stockout = new WareStockoutLabaor();
        BeanUtils.copyProperties(input,stockout);
        stockout.setUpdateTime(new Date());
        stockout.setUpdateUser(getCurrentUserId());
        stockoutLabaorDao.updateByPrimaryKeySelective(stockout);
	}
	
	/**
	 * 新增出库单直接出库
	 * @param input
	 */
	@Override
	@Transactional
	public void addStockoutPass(AddLaborStockoutInput input) {
		Integer id = addStockout(input);
		SearchLaborStockoutInput search = new SearchLaborStockoutInput(1,1);
		search.setWareStockoutLabaorId(id);;
		stockout(stockoutPageList(search).getDataList().get(0));
	}

	/**
     * 根据出库单id查询出库明细
     * @param stockoutId
     * @return
     */
	@Override
	public List<LaborStockoutDetailOutput> getStockDetailListById(WareStockoutLabaor stockout) {
		// TODO Auto-generated method stub
		WareStockoutDetailLabaorExample example = new WareStockoutDetailLabaorExample();
		WareStockoutDetailLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andLabaorStockoutEqualTo(stockout.getWareStockoutLabaorId());
        List<WareStockoutDetailLabaor> wareStockoutDetails = stockoutDetailLabaorDao.selectByExample(example);
        List<LaborStockoutDetailOutput> dataList = new ArrayList<>();
        for (WareStockoutDetailLabaor stockoutDetail : wareStockoutDetails) {
        	LaborStockoutDetailOutput output = new LaborStockoutDetailOutput();
            BeanUtils.copyProperties(stockoutDetail,output);
            output.setDefaultWarehouseTypeLangLang(stockoutDetail.getDefaultWarehouseType());
            output.setSparePartsLangLang(stockoutDetail.getSpareParts());
            output.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(stockoutDetail.getSpareParts())).getSparePartsNo());
            output.setYardLangLang(stockoutDetail.getYard());
            output.setStockoutStatusLangLang(stockoutDetail.getStockoutStatus());
            output.setUseUser(stockoutDetail.getUseUser());
        	output.setUserName(getUserNameByUserId(stockoutDetail.getUseUser()));
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            output.setStockoutDate(sdf.format(stockoutDetail.getCreateTime()));
            Double num =0D;
            if(StringUtils.isNotEmpty(stockoutDetail.getSparePartsBatch())){
                LaborStockOutput stockByBatch = stockService.getStockByBatch(stockoutDetail.getSparePartsBatch(), stockoutDetail.getSpareParts());
                output.setStorageLocation(stockByBatch.getStorageLocation());
                output.setTotalNum(stockByBatch.getActualSurplusNum());
                output.setUnitPrice(stockByBatch.getUnitPrice());
                output.setModel(stockByBatch.getModel());
                num = stockService.getReturnedNumById(stockout.getLabaorStockoutNo(),stockoutDetail.getWareStockoutDetailLabaorId());
            }
            output.setReturnedNum(num);
            dataList.add(output);
        }
        return dataList;
	}

	/**
     * 批量审核
     * @param ids
     */
	@Override
	@Transactional
	public void passAudit(Integer[] ids) {
		// TODO Auto-generated method stub
		WareStockoutLabaorExample example = new WareStockoutLabaorExample();
		WareStockoutLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutLabaorIdIn(Arrays.asList(ids));
        List<WareStockoutLabaor> stockouts = stockoutLabaorDao.selectByExample(example);
        for (WareStockoutLabaor stockout : stockouts) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(stockout.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }

        WareStockoutLabaor stockout = new WareStockoutLabaor();
        stockout.setUpdateUser(getCurrentUserId());
        stockout.setUpdateTime(new Date());
        stockout.setAuditStatus(AuditStateEnum.AUDITED.getCode());
        stockoutLabaorDao.updateByExampleSelective(stockout,example);
	}

	/**
     * 批量驳回出库
     * @param ids
     * @param reasonsRejection
     */
	@Override
	@Transactional
	public void rejectAudit(Integer[] ids, String reasonsRejection) {
		// TODO Auto-generated method stub
		WareStockoutLabaorExample example = new WareStockoutLabaorExample();
		WareStockoutLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutLabaorIdIn(Arrays.asList(ids));
        List<WareStockoutLabaor> stockouts = stockoutLabaorDao.selectByExample(example);
        for (WareStockoutLabaor stockout : stockouts) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(stockout.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }

        WareStockoutLabaor stockout = new WareStockoutLabaor();
        stockout.setUpdateUser(getCurrentUserId());
        stockout.setUpdateTime(new Date());
        stockout.setAuditStatus(AuditStateEnum.REJECTED.getCode());
        stockout.setReasonsRejection(reasonsRejection);
        stockoutLabaorDao.updateByExampleSelective(stockout,example);
	}

	/**
     * 出库
     * @param input
     */
	@Override
	@Transactional
	public void stockout(LaborStockoutOutput input) {
		// TODO Auto-generated method stub
		WareStockoutLabaor stockout = stockoutLabaorDao.selectByPrimaryKey(input.getWareStockoutLabaorId());
        if(stockout.getWarehouse() == null){
            stockout.setWarehouse(input.getWarehouse());
        }
        for (LaborStockoutDetailOutput detailOutput : input.getDetailList()) {
            WareStockoutDetailLabaor detail = stockoutDetailLabaorDao.selectByPrimaryKey(detailOutput.getWareStockoutDetailLabaorId());
            detail.setSparePartsBatch(detailOutput.getSparePartsBatch());
            detail.setStockoutNum(detailOutput.getStockoutNum());
            detail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
            detail.setUpdateTime(new Date());
            detail.setUpdateUser(getCurrentUserId());
            stockoutDetailLabaorDao.updateByPrimaryKeySelective(detail);
        }
        WareStockoutDetailLabaorExample example = new WareStockoutDetailLabaorExample();
        WareStockoutDetailLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andLabaorStockoutEqualTo(stockout.getWareStockoutLabaorId());
        List<WareStockoutDetailLabaor> stockoutDetails = stockoutDetailLabaorDao.selectByExample(example);
        
        List<String> stockoutStateList = new ArrayList<>();
        for (WareStockoutDetailLabaor stockoutDetail : stockoutDetails) {
            if(StockoutEnum.YESOUT.getCode().equals(stockoutDetail.getStockoutStatus())){
                stockoutStateList.add(stockoutDetail.getStockoutStatus());
            }
        }
        //已确认
        stockout.setStatus(CommonEnum.YES.getCode());
		// 已审核
        stockout.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		// 已减库存
        stockout.setIsStockSbs(CommonEnum.YES.getCode());
        stockout.setUpdateTime(new Date());
        stockout.setUpdateUser(getCurrentUserId());
        if(stockoutStateList.size() == stockoutDetails.size()){
            //全部出库
            stockout.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        }else {
            //部分出库
            stockout.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
        }
        stockoutLabaorDao.updateByPrimaryKeySelective(stockout);

        //修改原单出库状态
        SearchLaborStockoutInput searchInput = new SearchLaborStockoutInput();
        searchInput.setWareStockoutLabaorId(stockout.getWareStockoutLabaorId());
        searchInput.setPageIndex(1);
        searchInput.setPageSize(1);
        PagedList<LaborStockoutOutput> pagedList = stockoutPageList(searchInput);
        LaborStockoutOutput output = pagedList.getDataList().get(0);
        setStockoutStatus(output);
	}
	
	public void setStockoutStatus(LaborStockoutOutput input){

        if("LKBILLTYPE000073".equals(input.getBillType())||"LKBILLTYPE000076".equals(input.getBillType())||"LKBILLTYPE000077".equals(input.getBillType())){
            //劳保申请单
        	receiveService.applyStockedManage(input);
        }else if("LKBILLTYPE000046".equals(input.getBillType())){
        	sellService.sellStockedManage(input);
        }
    }
	
	
	/**
	 * 根据源单号获取该源单的出库明细
	 */
	@Override
	public List<LaborStockoutDetailOutput> getStockDetailListByNo(String sourceNo) {
		List<LaborStockoutDetailOutput> dataList = new ArrayList<>();
		// 根据源单号获取出库单
		WareStockoutLabaorExample stockoutExample = new WareStockoutLabaorExample();
		stockoutExample.createCriteria().andNoEqualTo(sourceNo);
		List<WareStockoutLabaor> stockouts = stockoutLabaorDao.selectByExample(stockoutExample);
		if(stockouts!=null&&stockouts.size()>0) {
			List<LaborStockoutDetailOutput> detailOutputs = new ArrayList<>();
			for(WareStockoutLabaor stockout : stockouts){
				detailOutputs = getStockDetailListById(stockout);
				for(LaborStockoutDetailOutput detailOutput : detailOutputs){
					detailOutput.setStockoutNo(stockout.getLabaorStockoutNo());
					dataList.add(detailOutput);
				}
			}
		}
		return dataList;
	}
	
	/**
	 * 根据出库单号获取该源单的出库明细
	 */
	@Override
	public List<LaborStockoutDetailOutput> getStockDetailListByStockoutNo(String stockoutNo) {
		if (StringUtils.isEmpty(stockoutNo)) {
			return null;
		}
		// 根据出库单号获取出库单
		WareStockoutLabaorExample stockoutExample = new WareStockoutLabaorExample();
		stockoutExample.createCriteria().andLabaorStockoutNoEqualTo(stockoutNo);
		List<WareStockoutLabaor> stockouts = stockoutLabaorDao.selectByExample(stockoutExample);
		if (CollectionUtils.isEmpty(stockouts)) {
			return null;
		}
		List<LaborStockoutDetailOutput> dataList = new ArrayList<>();
		List<LaborStockoutDetailOutput> detailOutputs = new ArrayList<>();
		for(WareStockoutLabaor stockout : stockouts){
			detailOutputs = getStockDetailListById(stockout);
			for(LaborStockoutDetailOutput detailOutput : detailOutputs){
				detailOutput.setStockoutNo(stockout.getLabaorStockoutNo());
				dataList.add(detailOutput);
			}
		}
		// 根据出库单id获取出库明细
		return dataList;
	}

	
	

	
}
