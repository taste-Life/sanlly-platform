package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockinEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.dao.WareLaborReceiveDetailMapper;
import com.sanlly.warehouse.dao.WareLaborReceiveMapper;
import com.sanlly.warehouse.dao.WareLaborStockExtMapper;
import com.sanlly.warehouse.dao.WareLaborStockMapper;
import com.sanlly.warehouse.dao.WareReturnWarehouseDetailLaborMapper;
import com.sanlly.warehouse.dao.WareReturnWarehouseDetailMapper;
import com.sanlly.warehouse.dao.WareReturnWarehouseLaborMapper;
import com.sanlly.warehouse.dao.WareReturnWarehouseMapper;
import com.sanlly.warehouse.dao.WareSellProgrammeDetailMapper;
import com.sanlly.warehouse.dao.WareSellProgrammeMapper;
import com.sanlly.warehouse.dao.WareStockinDetailLabaorMapper;
import com.sanlly.warehouse.dao.WareStockinLabaorMapper;
import com.sanlly.warehouse.dao.WareStockoutDetailLabaorMapper;
import com.sanlly.warehouse.dao.WareStockoutLabaorMapper;
import com.sanlly.warehouse.entity.WareLaborReceive;
import com.sanlly.warehouse.entity.WareLaborReceiveDetail;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import com.sanlly.warehouse.entity.WareLaborReceiveExample;
import com.sanlly.warehouse.entity.WareLaborStock;
import com.sanlly.warehouse.entity.WareLaborStockExample;
import com.sanlly.warehouse.entity.WareLaborStockExt;
import com.sanlly.warehouse.entity.WareReturnWarehouse;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetail;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailExample;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailLabor;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailLaborExample;
import com.sanlly.warehouse.entity.WareReturnWarehouseExample;
import com.sanlly.warehouse.entity.WareReturnWarehouseLabor;
import com.sanlly.warehouse.entity.WareReturnWarehouseLaborExample;
import com.sanlly.warehouse.entity.WareSellProgramme;
import com.sanlly.warehouse.entity.WareSellProgrammeDetail;
import com.sanlly.warehouse.entity.WareSellProgrammeDetailExample;
import com.sanlly.warehouse.entity.WareSellProgrammeExample;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockExample;
import com.sanlly.warehouse.entity.WareStockinDetailLabaor;
import com.sanlly.warehouse.entity.WareStockinDetailLabaorExample;
import com.sanlly.warehouse.entity.WareStockinLabaor;
import com.sanlly.warehouse.entity.WareStockinLabaorExample;
import com.sanlly.warehouse.entity.WareStockoutDetailLabaor;
import com.sanlly.warehouse.entity.WareStockoutDetailLabaorExample;
import com.sanlly.warehouse.entity.WareStockoutLabaor;
import com.sanlly.warehouse.entity.WareStockoutLabaorExample;
import com.sanlly.warehouse.entity.WareReturnWarehouseExample.Criteria;
import com.sanlly.warehouse.models.input.laborInsurance.AddLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn.LaborStockInInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceStockIn.SearchLaborStockInInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.AddReturnStockInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.ReturnStockDetailInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock.SearchLaborReturnWarehouseInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStockOut.AddLaborStockoutDetailInput;
import com.sanlly.warehouse.models.input.returnwarehouse.ReturnWarehouseDetailInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stock.EditStockNumInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn.LaborStockInDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn.LaborStockInOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn.LaborStockOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive.LaborReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock.LaborReturnStockDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock.LaborReturnStockOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborStockOut.LaborStockoutDetailOutput;
import com.sanlly.warehouse.models.output.returnwarehouse.ReturnWarehouseDetailOutput;
import com.sanlly.warehouse.models.output.returnwarehouse.ReturnWarehouseOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.LaborInsuranceStockService;
import com.sanlly.warehouse.service.LaborInsuranceTypeService;
import com.sanlly.warehouse.service.LaborStockOutService;
import com.sanlly.warehouse.service.WareSparePartsService;

@Service
public class LaborInsuranceStockServiceImpl extends BaseServiceImpl implements LaborInsuranceStockService{

	@Autowired
	private WareLaborStockMapper wareLaborStockDao;
	
	@Autowired
	private WareStockinLabaorMapper wareStockinLabaorDao;
	
	@Autowired
	private WareStockinDetailLabaorMapper WareStockinDetailLabaorDao;
	
	@Autowired
	private WareLaborStockExtMapper wareLaborStockExtDao;
	
	@Autowired
	private WareSparePartsService wareSparePartsService;
		
	@Autowired
    private BillTypeService billTypeService;
	
	@Autowired
	private WareReturnWarehouseLaborMapper returnWarehouseDao;

	@Autowired
	private WareReturnWarehouseDetailLaborMapper returnWarehouseDetailDao;
	
	@Autowired
	private WareStockoutDetailLabaorMapper stockoutDetailDao;
	
	@Autowired
	private WareStockoutLabaorMapper stockoutDao;
	
	@Autowired
	private LaborStockOutService stockoutService;
	
	@Autowired
	private WareLaborReceiveDetailMapper receiveDetailDao;
	
	@Autowired
	private WareLaborReceiveMapper receiveDao;
	
	@Autowired
	private WareSellProgrammeMapper sellDao;
	
	@Autowired
	private WareSellProgrammeDetailMapper sellDetailDao;
	/**
     * 劳保库存信息分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborStockOutput> getLaborInsuranceStockPageList(SearchLaborInsuranceInput input) {
		PagedList<LaborStockOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize());
		Map<String, Object> map = new HashMap<>(9);
		// 根据备件号
		map.put("sparePartsNo", input.getSparePartsNo());
		// 根据仓库
		//map.put("warehouse", input.getWarehouse());
		// 根据备件类别
		map.put("sparePartsCategoriesDetails", input.getSparePartsCategoriesDetails());
		//当前公司
		map.put("company", getCurrentCompanyKey());
		// 根据备件名
		if (isChineseRequest()) {
			map.put("sparePartsName", input.getSparePartsName());
			map.put("sparePartsNameEn", null);
		} else {
			map.put("sparePartsNameEn", input.getSparePartsName());
			map.put("sparePartsName", null);
		}
		// 分页参数
		map.put("limitStart", pagedList.getLimitStart());
		map.put("limitEnd", pagedList.getLimitEnd());

		// 获取分页数据
		List<WareLaborStockExt> wareLaborStocks = wareLaborStockExtDao.selectPageLabors(map);
		// 获取总条数
		int total = wareLaborStockExtDao.getTotal();
        //结果返回数据
        List<LaborStockOutput> dataList = new ArrayList<>();
        if(wareLaborStocks!=null&&wareLaborStocks.size()>0){
        	for(WareLaborStockExt wStock : wareLaborStocks){
        		LaborStockOutput output = new LaborStockOutput();
            	output.setWarehouse(wStock.getWarehouse());
            	output.setWarehouseLangLang(wStock.getWarehouse());
            	//调用备件接口
            	SparePartsOutput sOutput = wareSparePartsService.getSpareParts(new EditSparePartsInput(wStock.getSpareParts()));
                output.setSpareParts(wStock.getSpareParts());
                output.setSparePartsLangLang(wStock.getSpareParts());
                output.setSparePartsCategoriesDetails(sOutput.getSparePartsCategoriesDetails());
                output.setSparePartsCategoriesDetailsLangLang(sOutput.getSparePartsCategoriesDetails());
                output.setSparePartsNo(sOutput.getSparePartsNo());
                output.setModel(wStock.getModel());
                output.setDurableYears(sOutput.getDurableYears());
                output.setIsConsumable(sOutput.getIsConsumable());
                output.setIsConsumableLangLang(sOutput.getIsConsumable());
                output.setStockoutRestrictMonth(sOutput.getStockoutRestrictMonth());
                //output.setUnitPrice(wStock.getUnitPrice());
//                if(StringUtils.isNotEmpty(wStock.getWarehouse())){
//                	output.setActualSurplusNum(getStockNum(wStock.getSpareParts(), wStock.getWarehouse()));
//                }
                output.setTotalNum(wStock.getTotalNum());
                //output.setActualSurplusNum(wStock.getActualSurplusNum());
                //output.setRemark(wStock.getRemark());
                //output.setStorageLocation(wStock.getStorageLocation());
                //output.setSparePartsCode(wStock.getSparePartsCode());
                dataList.add(output);
            }
        }
        pagedList.setTotalItemCount(total);
        pagedList.getDataList().addAll(dataList);
        return pagedList;
	}

	@Override
	public List<LaborStockOutput> getLaborStockList() {
		// TODO Auto-generated method stub
		List<LaborStockOutput> dataList = new ArrayList<>();
		WareLaborStockExample example = new WareLaborStockExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareLaborStock> wareLaborStocks =wareLaborStockDao.selectByExample(example);
        if(wareLaborStocks!=null&&wareLaborStocks.size()>0){
        	for(WareLaborStock wStock : wareLaborStocks){
        		LaborStockOutput output = new LaborStockOutput();
            	output.setWarehouse(wStock.getWarehouse());
            	output.setWarehouseLangLang(wStock.getWarehouse());
            	//调用备件接口
            	SparePartsOutput sOutput = wareSparePartsService.getSpareParts(new EditSparePartsInput(wStock.getSpareParts()));
                output.setSparePartsCategoriesDetails(sOutput.getSparePartsCategoriesDetails());
                output.setSparePartsCategoriesDetailsLangLang(sOutput.getSparePartsCategoriesDetails());
                output.setSparePartsNo(sOutput.getSparePartsNo());
                output.setModel(sOutput.getModel());
                output.setDurableYears(sOutput.getDurableYears());
                output.setIsConsumable(sOutput.getIsConsumable());
                output.setIsConsumableLangLang(sOutput.getIsConsumable());
                output.setStockoutRestrictMonth(sOutput.getStockoutRestrictMonth());
                output.setUnitPrice(wStock.getUnitPrice());
                output.setRemark(wStock.getRemark());
                dataList.add(output);
            }
        }
		return dataList;
	}
	
	/**
	 * 生成批次号 仓库类型编码/备件号/日期（yyMMdd）八位序列号
	 * 
	 * @param warehouseType
	 * @param sparePartsNo
	 * @return
	 */
	public String getBatch(String warehouseType, String sparePartsNo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		int length = warehouseType.length();
		// 仓库类型编码
		String str = "000";
		if(length >= 3){
			str = warehouseType.substring(length-3, length);
		}
		// 日期
		String format = sdf.format(new Date());
		String substring = format.substring(1, format.length());
		// 八位序列号
		String random = genRandomNum();

		String returnStr = str + "/" + sparePartsNo + "/" + substring + "/" + random;

		return returnStr;
	}

	/**
	 * 生成八位随机码
	 * @return
	 */
	private String genRandomNum(){
		int  maxNum = 36;
		int i;
		int count = 0;
		char[] str = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		StringBuffer pwd = new StringBuffer("");
		Random r = new Random();
		while(count < 8){
			i = Math.abs(r.nextInt(maxNum));
			if (i >= 0 && i < str.length) {
				pwd.append(str[i]);
				count ++;
			}
		}
		return pwd.toString();
	}

	/**
     * 新增入库单
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addLaborStockIn(LaborStockInInput input) {
		// TODO Auto-generated method stub
		WareStockinLabaor wareStockinLabaor = new WareStockinLabaor();
		wareStockinLabaor.setEntryWarehouse(input.getWarehouse());
		//设置入库单号
		wareStockinLabaor.setLabaorStockinNo(billTypeService.getBillNumberByKey(BillTypeConstants.STOCKIN));
		//设置源单号
		//wareStockinLabaor.setLabaorStockinNo(billTypeService.getBillNumberByKey("LKBILLTYPE000034"));
		wareStockinLabaor.setCompany(getCurrentCompanyKey());
		//设置单据类型
		wareStockinLabaor.setBillType(BillTypeConstants.STOCKIN);
		//设置出库状态为未出库
		if(input.getEntryStatus() != null && input.getEntryStatus() != ""){
			wareStockinLabaor.setEntryStatus(input.getEntryStatus());
		}else {
			wareStockinLabaor.setEntryStatus(StockinEnum.NOIN.getCode());
		}
		if(input.getAuditStatus() != null && input.getAuditStatus() != ""){
			wareStockinLabaor.setAuditStatus(input.getAuditStatus());
			wareStockinLabaor.setUpdateTime(new Date());
		}else {
			wareStockinLabaor.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		}
		wareStockinLabaor.setSupplier(input.getSupplier());
		wareStockinLabaor.setInvoiceType(input.getInvoiceType());
		wareStockinLabaor.setTotalAmount(input.getTotalAmount());
		wareStockinLabaor.setBillTotalAmount(input.getTotalAmount());
		wareStockinLabaor.setIsStockSbs(CommonEnum.NO.getCode());
		wareStockinLabaor.setIsDel(PlatformConstants.ISDEL_NO);
		wareStockinLabaor.setCreateTime(new Date());
		wareStockinLabaor.setCreateUser(getCurrentUserId());
		wareStockinLabaorDao.insertSelective(wareStockinLabaor);
		if(input.getDetailList()!=null&&input.getDetailList().size()>0){
			for(AddLaborInsuranceInput detailInput : input.getDetailList()){
				WareStockinDetailLabaor wareStockinDetailLabaor = new WareStockinDetailLabaor();
				wareStockinDetailLabaor.setSpareParts(detailInput.getSpareParts());
				wareStockinDetailLabaor.setEntryPrice(detailInput.getEntryPrice());
				wareStockinDetailLabaor.setEntryNum(detailInput.getEntryNum());
				wareStockinDetailLabaor.setStorageLocation(detailInput.getStorageLocation());
				wareStockinDetailLabaor.setVat(detailInput.getVat());
				wareStockinDetailLabaor.setInvoicePrice(detailInput.getInvoicePrice());
				wareStockinDetailLabaor.setTotalAmount(detailInput.getTotalAmount());
				wareStockinDetailLabaor.setModel(detailInput.getModel());
				//总金额
				wareStockinDetailLabaor.setTotalAmount(detailInput.getEntryPrice().multiply(new BigDecimal(detailInput.getEntryNum())));
				//获得默认仓库类型
				SparePartsBriefOutput sOutput = wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(detailInput.getSpareParts()));
				wareStockinDetailLabaor.setWarehouseType(sOutput.getDefaultWarehouseType());
				wareStockinDetailLabaor.setRemark(detailInput.getRemark());
				wareStockinDetailLabaor.setIsDel(PlatformConstants.ISDEL_NO);
				wareStockinDetailLabaor.setCreateTime(new Date());
				wareStockinDetailLabaor.setCreateUser(getCurrentUserId());
				//设置批次号
				wareStockinDetailLabaor.setStockinBatch(getBatch(sOutput.getDefaultWarehouseType(), sOutput.getSparePartsNo()));
                //设置入库单id
				wareStockinDetailLabaor.setLabaorStockin(wareStockinLabaor.getWareStockinLabaorId());
                WareStockinDetailLabaorDao.insertSelective(wareStockinDetailLabaor);
			}
		}
	}
	
	/**
     * 分页查询入库单
     * @param input
     * @return
     */
    @Override
    public PagedList<LaborStockInOutput> laborStockinPageList(SearchLaborStockInInput input) {
        //组装查询条件
    	WareStockinLabaorExample example = new WareStockinLabaorExample();
        WareStockinLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getLabaorStockinNo()!=null && input.getLabaorStockinNo()!=""){
            criteria.andLabaorStockinNoLike("%"+input.getLabaorStockinNo()+"%");
        }
        if(StringUtils.isNotEmpty(input.getWarehouse())){
        	criteria.andEntryWarehouseEqualTo(input.getWarehouse());
        }
        if(input.getStockinDate()!=null){
        	Calendar c = Calendar.getInstance();  
            c.setTime(input.getStockinDate());  
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date date = c.getTime();
        	criteria.andUpdateTimeBetween(input.getStockinDate(),date).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
        }
        if(StringUtils.isNotEmpty(input.getSupplier())) {
        	criteria.andSupplierEqualTo(input.getSupplier());
        }
        if(StringUtils.isNotEmpty(input.getSparePartsNo())||StringUtils.isNotEmpty(input.getSparePartsName())) {
        	List<String> spares = wareSparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), input.getSparePartsName());
			if(spares!=null&&spares.size()>0) {
				WareStockinDetailLabaorExample detailExample = new WareStockinDetailLabaorExample();
				detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsIn(spares);
				List<WareStockinDetailLabaor> stockinDetails = WareStockinDetailLabaorDao.selectByExample(detailExample);
				List<Integer> ids = new ArrayList<Integer>();
				if(stockinDetails!=null&&stockinDetails.size()>0) {
					for(WareStockinDetailLabaor detail : stockinDetails) {
						ids.add(detail.getLabaorStockin());
					} 
					criteria.andWareStockinLabaorIdIn(ids);
				}else {
					return new PagedList<LaborStockInOutput>(input.getPageIndex(), input.getPageSize(), 0);
				}
			}else {
				return new PagedList<LaborStockInOutput>(input.getPageIndex(), input.getPageSize(), 0);
			}
        }
        //查询页数
        Integer totalItemCount =(int) wareStockinLabaorDao.countByExample(example);
        PagedList<LaborStockInOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        //组装返回数据
        List<WareStockinLabaor> wareStockinLabaors = wareStockinLabaorDao.selectByExample(example);
        List<LaborStockInOutput> dataList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (WareStockinLabaor wareStockinLabaor : wareStockinLabaors) {
        	LaborStockInOutput output = new LaborStockInOutput();
        	output.setWareStockinLabaorId(wareStockinLabaor.getWareStockinLabaorId());
            output.setWarehouse(wareStockinLabaor.getEntryWarehouse());
            output.setWarehouseNameLang(wareStockinLabaor.getEntryWarehouse());
            output.setCompany(wareStockinLabaor.getCompany());
            output.setCompanyNameLang(wareStockinLabaor.getCompany());
            output.setLabaorStockinNo(wareStockinLabaor.getLabaorStockinNo());
            output.setAuditStatus(wareStockinLabaor.getAuditStatus());
            output.setAuditStatusLangLang(wareStockinLabaor.getAuditStatus());
            output.setEntryStatus(wareStockinLabaor.getEntryStatus());
            output.setEntryStatusLangLang(wareStockinLabaor.getEntryStatus());
            output.setSupplier(wareStockinLabaor.getSupplier());
            output.setSupplierNameLang(wareStockinLabaor.getSupplier());
            output.setTotalAmount(wareStockinLabaor.getTotalAmount());
            //入库时间
            if(AuditStateEnum.AUDITED.getCode().equals(wareStockinLabaor.getAuditStatus())){
            	if(wareStockinLabaor.getUpdateTime()!=null){
            		output.setStockinDate(sdf.format(wareStockinLabaor.getUpdateTime()));
            	}
            }   
            //明细列表
            WareStockinDetailLabaorExample wExample = new WareStockinDetailLabaorExample();
            wExample.createCriteria().andLabaorStockinEqualTo(wareStockinLabaor.getWareStockinLabaorId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            List<WareStockinDetailLabaor> wareStockinDetailLabaors = WareStockinDetailLabaorDao.selectByExample(wExample);
            List<LaborStockInDetailOutput> detailList = new ArrayList<>();
            if(wareStockinDetailLabaors!=null&&wareStockinDetailLabaors.size()>0){
            	for(WareStockinDetailLabaor wDetailLabaor : wareStockinDetailLabaors){
            		LaborStockInDetailOutput detailOutput = new LaborStockInDetailOutput();
            		BeanUtils.copyProperties(wDetailLabaor, detailOutput);
            		detailOutput.setSparePartsNameLang(wDetailLabaor.getSpareParts());
            		detailOutput.setWarehouse(wDetailLabaor.getWarehouseId());
            		detailOutput.setWarehouseNameLang(wDetailLabaor.getWarehouseId());
            		detailOutput.setWarehouseTypeNameLang(wDetailLabaor.getWarehouseType());
            		SparePartsBriefOutput sparePartsBrief = wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(wDetailLabaor.getSpareParts()));
            		detailOutput.setSparePartsNo(sparePartsBrief.getSparePartsNo());
            		detailList.add(detailOutput);
            	}
            }
            output.setDetailList(detailList);
            dataList.add(output);
        }
        pagedList.getDataList().addAll(dataList);
        return pagedList;
    }
    
    /**
     * 根据入库单id获取入库明细列表
     * @param stockinId
     * @return
     */
    public List<WareStockinDetailLabaor> getStockinDetailList(Integer stockinId){
    	WareStockinDetailLabaorExample example = new WareStockinDetailLabaorExample();
    	WareStockinDetailLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andLabaorStockinEqualTo(stockinId);
        return WareStockinDetailLabaorDao.selectByExample(example);
    }
    
    /**
     * 入库单批量审核通过
     * @param ids
     */
    @Override
    @Transactional
    public void auditPassStockin(Integer[] ids) {
    	WareStockinLabaorExample example = new WareStockinLabaorExample();
    	WareStockinLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockinLabaorIdIn(Arrays.asList(ids));
        List<WareStockinLabaor> wareStockins = wareStockinLabaorDao.selectByExample(example);
        for (WareStockinLabaor wareStockin : wareStockins) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(wareStockin.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareStockinLabaor stockin = new WareStockinLabaor();
        stockin.setUpdateUser(getCurrentUserId());
        stockin.setUpdateTime(new Date());
        stockin.setAuditStatus(AuditStateEnum.AUDITED.getCode());
        wareStockinLabaorDao.updateByExampleSelective(stockin,example);
        laborStockin(ids);
    }

    /**
     * 入库单批量驳回
     * @param ids
     * @param reasonsRejection
     */
    @Override
    @Transactional
    public void auditRejectStockin(Integer[] ids, String reasonsRejection) {
    	WareStockinLabaorExample example = new WareStockinLabaorExample();
    	WareStockinLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockinLabaorIdIn(Arrays.asList(ids));
        List<WareStockinLabaor> wareStockins = wareStockinLabaorDao.selectByExample(example);
        for (WareStockinLabaor wareStockin : wareStockins) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(wareStockin.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareStockinLabaor stockin = new WareStockinLabaor();
        stockin.setUpdateUser(getCurrentUserId());
        stockin.setUpdateTime(new Date());
        stockin.setAuditStatus(AuditStateEnum.REJECTED.getCode());
        stockin.setReasonsRejection(reasonsRejection);
        wareStockinLabaorDao.updateByExampleSelective(stockin,example);
    }
    
    /**
     * 新增库存
     * @param input
     */
    @Transactional
    public void addStock(WareLaborStock wareLaborStock) {
    	WareLaborStock wStock = new WareLaborStock();
    	BeanUtils.copyProperties(wareLaborStock, wStock);
        if(wareLaborStock.getEntryNum()!=null){
        	wStock.setSurplusNum(wareLaborStock.getEntryNum());
        	wStock.setActualSurplusNum(wareLaborStock.getEntryNum());
        }else {
        	wStock.setSurplusNum(DefaultConstants.DOUBLEDEFAULT);
        	wStock.setActualSurplusNum(DefaultConstants.DOUBLEDEFAULT);
        }
        SparePartsOutput output = wareSparePartsService.getSpareParts(new EditSparePartsInput(wareLaborStock.getSpareParts()));
        wStock.setIsConsumable(output.getIsConsumable());
        wStock.setDurableYears(output.getDurableYears());
        wStock.setStockoutRestrictMonth(output.getStockoutRestrictMonth());
        wStock.setCreateTime(new Date());
        wStock.setCreateUser(getCurrentUserId());
        wStock.setIsDel(PlatformConstants.ISDEL_NO);
    	wareLaborStockDao.insertSelective(wStock);
    }
    
    
    /**
     * 批量入库
     * @param ids
     */
    @Override
    @Transactional
    public void laborStockin(Integer[] ids) {
    	WareLaborStock wareLaborStock = new WareLaborStock();
    	WareStockinLabaorExample example = new WareStockinLabaorExample();
    	WareStockinLabaorExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockinLabaorIdIn(Arrays.asList(ids)).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
       
        List<WareStockinLabaor> wareStockins = wareStockinLabaorDao.selectByExample(example);
        if(wareStockins!=null&&wareStockins.size()>0){
        	for(WareStockinLabaor wLabaor : wareStockins){
        		for(WareStockinDetailLabaor wDetailLabaor : getStockinDetailList(wLabaor.getWareStockinLabaorId())){
        			if(StringUtils.isNotEmpty(wDetailLabaor.getWarehouseType())){
        				wareLaborStock.setWarehouseType(wDetailLabaor.getWarehouseType());
        			}
        			wareLaborStock.setSparePartsCode(wDetailLabaor.getStockinBatch());
        			wareLaborStock.setSpareParts(wDetailLabaor.getSpareParts());
        		    wareLaborStock.setUnitPrice(wDetailLabaor.getEntryPrice());
        		    wareLaborStock.setEntryNum(wDetailLabaor.getEntryNum());
        		    wareLaborStock.setLaborStockNo(wLabaor.getLabaorStockinNo());
            		wareLaborStock.setCompany(wLabaor.getCompany());
            		wareLaborStock.setWarehouse(wLabaor.getEntryWarehouse());
            		wareLaborStock.setStorageLocation(wDetailLabaor.getStorageLocation());
            		wareLaborStock.setModel(wDetailLabaor.getModel());
            		wareLaborStock.setStockinDate(new Date());
            		wareLaborStock.setInvoicePrice(wDetailLabaor.getInvoicePrice());
            		wareLaborStock.setVat(wDetailLabaor.getVat());
            		addStock(wareLaborStock);
        		}
        	}
        }
        WareStockinLabaor wStockinLabaor = new WareStockinLabaor();
        wStockinLabaor.setUpdateTime(new Date());
        wStockinLabaor.setUpdateUser(getCurrentUserId());
        wStockinLabaor.setEntryStatus(StockinEnum.YESIN.getCode());
        wareStockinLabaorDao.updateByExampleSelective(wStockinLabaor, example);
    }
    
    /**
     * 修改库存
     * @param stockDetail
     */
    
    @Override
    public void setStock(LaborStockoutDetailOutput stockDetail){
        WareLaborStock stock = getStock(stockDetail.getSparePartsBatch(), stockDetail.getSpareParts());

        if(stockDetail.getStockoutNum()!=null){
            //修改前台显示库存数量
            stock.setSurplusNum(stock.getSurplusNum()-stockDetail.getStockoutNum());
            stock.setActualSurplusNum(stock.getActualSurplusNum()-stockDetail.getStockoutNum());
        }
        if(stock.getActualSurplusNum() < 0){
            throw new RuntimeException("stockErr");
        }
        stock.setUpdateTime(new Date());
        stock.setUpdateUser(getCurrentUserId());
        wareLaborStockDao.updateByPrimaryKeySelective(stock);
    }

    /**
     * 修改库存
     * @param stockDetail
     */
    @Override
    public void setStock(AddLaborStockoutDetailInput detailInput){
        WareLaborStock stock = getStock(detailInput.getSparePartsBatch(), detailInput.getSpareParts());

        if(detailInput.getStockoutNum()!=null){
            //修改前台显示库存数量
            stock.setSurplusNum(stock.getSurplusNum()-detailInput.getStockoutNum());
            stock.setActualSurplusNum(stock.getActualSurplusNum()-detailInput.getStockoutNum());
        }
        if(stock.getActualSurplusNum() < 0){
            throw new RuntimeException("stockErr");
        }
        stock.setUpdateTime(new Date());
        stock.setUpdateUser(getCurrentUserId());
        wareLaborStockDao.updateByPrimaryKeySelective(stock);
    }
    
    /**
     * 根据备件批次号和备件key获取库存信息
     * @param Batch
     * @param sparePartsKey
     * @return
     */
    public WareLaborStock getStock(String Batch, String sparePartsKey) {
        WareLaborStockExample example = new WareLaborStockExample();
        WareLaborStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsCodeEqualTo(Batch);
        List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
        WareLaborStock stock = wareStocks.get(0);
        return stock;
    }
    
    /**
     * 根据备件key以及仓库key获取库存数量
     * @param spKey
     * @return
     */
    @Override
    public Double getStockNum(String spareParts,String warehouse){
    	WareLaborStockExample example = new WareLaborStockExample();
    	WareLaborStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(spareParts).andWarehouseEqualTo(warehouse).andCompanyEqualTo(getCurrentCompanyKey());
        List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
        Double sum = 0D;
        if(wareStocks!=null&&wareStocks.size()>0){
        	for (WareLaborStock wareStock : wareStocks) {
                sum += wareStock.getActualSurplusNum();
            }
        }
        return sum;
    }
    
    /**
     * 根据备件批次号和备件key获取库存信息
     * @param Batch
     * @param sparePartsKey
     * @return
     */
	@Override
	public LaborStockOutput getStockByBatch(String Batch, String sparePartsKey) {
		LaborStockOutput output = new LaborStockOutput();
		WareLaborStockExample example = new WareLaborStockExample();
    	WareLaborStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsCodeEqualTo(Batch);
        List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
        if(wareStocks!=null&&wareStocks.size()>0){
        	WareLaborStock stock = wareStocks.get(0);
            BeanUtils.copyProperties(stock,output);
            output.setCompanyLangLang(stock.getCompany());
            output.setWarehouseLangLang(stock.getWarehouse());
            output.setWarehouseTypeLangLang(stock.getWarehouseType());
            SparePartsOutput sOutput = wareSparePartsService.getSpareParts(new EditSparePartsInput(stock.getSpareParts()));
            output.setSparePartsCategoriesDetails(sOutput.getSparePartsCategoriesDetails());
            output.setSparePartsCategoriesDetailsLangLang(sOutput.getSparePartsCategoriesDetails());
            output.setIsConsumableLangLang(stock.getIsConsumable());
        }
        return output;
	}
	
	/**
     * 根据备件型号和备件key获取库存信息
     * @param model
     * @param skey
     * @return
     */
	@Override
	public LaborStockOutput getStockByKAndM(String skey, String model) {
		WareLaborStockExample example = new WareLaborStockExample();
    	WareLaborStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(skey);
        criteria.andModelEqualTo(model);
        example.setOrderByClause("stockin_date");
        List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
        WareLaborStock stock = wareStocks.get(0);
        LaborStockOutput output = new LaborStockOutput();
        BeanUtils.copyProperties(stock,output);
        output.setCompanyLangLang(stock.getCompany());
        output.setWarehouseLangLang(stock.getWarehouse());
        output.setWarehouseTypeLangLang(stock.getWarehouseType());
        output.setWarehouse(stock.getWarehouse());
        SparePartsOutput sOutput = wareSparePartsService.getSpareParts(new EditSparePartsInput(stock.getSpareParts()));
        output.setSparePartsCategoriesDetails(sOutput.getSparePartsCategoriesDetails());
        output.setSparePartsCategoriesDetailsLangLang(sOutput.getSparePartsCategoriesDetails());
        output.setIsConsumableLangLang(stock.getIsConsumable());
        return output;
	}
	/**
     * 根据备件key,备件型号获取库存数量
     * @param spKey
     * @return
     */
    @Override
    public Double getStockNumByKAndM(String spKey,String model){
    	WareLaborStockExample example = new WareLaborStockExample();
    	WareLaborStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(spKey);
        criteria.andModelEqualTo(model);
        criteria.andCompanyEqualTo(getCurrentCompanyKey());
        List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
        Double sum = 0D;
        if(wareStocks!=null&&wareStocks.size()>0){
        	for (WareLaborStock wareStock : wareStocks) {
                sum += wareStock.getActualSurplusNum();
            }
        }
        return sum;
    }
    
	/**
     * 根据公司,仓库,查询备件库存总数
     * @param company
     * @param warehouse
     * @param spareParts
     * @return
     */
    @Override
    public Double getStockByCompanyOrSP(String company,String warehouse ,String spareParts) {
    	WareLaborStockExample example = new WareLaborStockExample();
    	WareLaborStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andCompanyEqualTo(company);
        criteria.andWarehouseEqualTo(warehouse);
        criteria.andSparePartsEqualTo(spareParts);
        List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
        Double num = 0D;
        if(wareStocks!=null&&wareStocks.size()>0){
            for (WareLaborStock stock : wareStocks) {
                num += stock.getActualSurplusNum();
            }
        }
        return num;
    }
    
    /**
	 * 根据备件和数量自动获取库存批次
	 * @param warehouse
	 * @param spareParts
	 * @param num
	 * @return
	 */
	@Override
	public List<LaborStockOutput> autoGetStock(String spareParts,String model,Double num){
		WareLaborStockExample example = new WareLaborStockExample();
		WareLaborStockExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("stockin_date asc");
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andSparePartsEqualTo(spareParts);
		criteria.andModelEqualTo(model);
		criteria.andActualSurplusNumGreaterThan(0d);
		List<WareLaborStock> wareStocks = wareLaborStockDao.selectByExample(example);
		List<LaborStockOutput> outputs = new ArrayList<>();
		double count = num;
		for (WareLaborStock wareStock : wareStocks) {
			if (num - wareStock.getActualSurplusNum() <= 0){
				// 数量已够 跳出循环
				wareStock.setActualSurplusNum(count);
				count = 0D;
				outputs.add(getOutput(wareStock));
				break;
			} else {
				num -= wareStock.getActualSurplusNum();
				count -= wareStock.getActualSurplusNum();
				outputs.add(getOutput(wareStock));
			}
		}
		if(count > 0){
			throw new RuntimeException("understock");
		}

		return outputs;
	}
	/**
	 * 封装output
	 * @param wareStock
	 * @return
	 */
	private LaborStockOutput getOutput (WareLaborStock wareStock){
		LaborStockOutput output = new LaborStockOutput();
		BeanUtils.copyProperties(wareStock,output);
		output.setCompanyLangLang(wareStock.getCompany());
		output.setWarehouseLangLang(wareStock.getWarehouse());
		output.setWarehouseTypeLangLang(wareStock.getWarehouseType());
		output.setSparePartsLangLang(wareStock.getSpareParts());
		output.setStorageLocation(wareStock.getStorageLocation());
		output.setSparePartsNo(wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(wareStock.getSpareParts())).getSparePartsNo());
		return output;
	}

    /**
     * 添加退库单
     * 
     * @param input
     * @return
     */
	@Override
	@Transactional
	public void addLaborReturnStock(AddReturnStockInput input) {
		// TODO Auto-generated method stub
		// 生成退库单号
		String billNumber = billTypeService.getBillNumberByKey(BillTypeConstants.TK);
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		// 保存退库单
		WareReturnWarehouseLabor returnWarehouse = new WareReturnWarehouseLabor();
		BeanUtils.copyProperties(input, returnWarehouse);
		returnWarehouse.setReturnNo(billNumber);
		returnWarehouse.setBillType(BillTypeConstants.TK);
		returnWarehouse.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		Integer userId = getCurrentUserId();
		returnWarehouse.setOperator(userId);
		returnWarehouse.setCreateUser(userId);
		returnWarehouse.setIsDel(PlatformConstants.ISDEL_NO);
		Date date = new Date();
		returnWarehouse.setCreateTime(date);
		returnWarehouse.setReturnDate(date);
		returnWarehouseDao.insertSelective(returnWarehouse);

		// 保存退库单明细
		Double num = 0D;
		for (ReturnStockDetailInput rwdi : input.getDetailList()) {
			WareReturnWarehouseDetailLabor rwd = new WareReturnWarehouseDetailLabor();
			BeanUtils.copyProperties(rwdi, rwd);
			rwd.setReturnId(returnWarehouse.getWareReturnWarehouseLaborId());
			rwd.setOperator(userId);
			rwd.setCreateUser(userId);
			rwd.setReturnDate(date);
			rwd.setCreateTime(date);
			rwd.setIsDel(PlatformConstants.ISDEL_NO);
			//出库单明细id
			rwd.setStockoutDetailId(rwdi.getWareStockoutDetailLabaorId());
			returnWarehouseDetailDao.insertSelective(rwd);
			num+=rwdi.getReturnNum();
		}
		returnWarehouse.setReturnNum(num);
		returnWarehouseDao.updateByPrimaryKeySelective(returnWarehouse);
	}
	
	/**
     * 添加退库单
     * 
     * @param input
     * @return
     */
	@Override
	@Transactional
	public void addLaborReturnStockList(List<AddReturnStockInput> inputs) {
		// TODO Auto-generated method stub
		for(AddReturnStockInput input :inputs){
			// 生成退库单号
			String billNumber = billTypeService.getBillNumberByKey("LKBILLTYPE000041");
			if (StringUtils.isEmpty(billNumber)) {
				throw new SqlException("insertFail");
			}
			// 保存退库单
			WareReturnWarehouseLabor returnWarehouse = new WareReturnWarehouseLabor();
			BeanUtils.copyProperties(input, returnWarehouse);
			returnWarehouse.setReturnNo(billNumber);
			returnWarehouse.setBillType("LKBILLTYPE000041");
			returnWarehouse.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
			Integer userId = getCurrentUserId();
			returnWarehouse.setOperator(userId);
			returnWarehouse.setCreateUser(userId);
			returnWarehouse.setIsDel(PlatformConstants.ISDEL_NO);
			Date date = new Date();
			returnWarehouse.setCreateTime(date);
			returnWarehouse.setReturnDate(date);
			returnWarehouseDao.insertSelective(returnWarehouse);

			// 保存退库单明细
			Double num = 0D;
			for (ReturnStockDetailInput rwdi : input.getDetailList()) {
				WareReturnWarehouseDetailLabor rwd = new WareReturnWarehouseDetailLabor();
				BeanUtils.copyProperties(rwdi, rwd);
				rwd.setReturnId(returnWarehouse.getWareReturnWarehouseLaborId());
				rwd.setOperator(userId);
				rwd.setCreateUser(userId);
				rwd.setReturnDate(date);
				rwd.setCreateTime(date);
				//出库单明细id
				rwd.setStockoutDetailId(rwdi.getWareStockoutDetailLabaorId());
				rwd.setIsDel(PlatformConstants.ISDEL_NO);
				returnWarehouseDetailDao.insertSelective(rwd);
				num+=rwdi.getReturnNum();
			}
			returnWarehouse.setReturnNum(num);
			returnWarehouseDao.updateByPrimaryKeySelective(returnWarehouse);
		}
	}


	/**
     * 退库单列表
     * 
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborReturnStockOutput> getLaborReturnStockList(SearchLaborReturnWarehouseInput input) {
		// TODO Auto-generated method stub
		// 设置查询条件
		WareReturnWarehouseLaborExample wrwe = new WareReturnWarehouseLaborExample();
		WareReturnWarehouseLaborExample.Criteria wrwc = wrwe.createCriteria();
		if (StringUtils.isNotEmpty(input.getReturnNo())) {
			wrwc.andReturnNoLike("%"+input.getReturnNo()+"%");
		}
		wrwc.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

		// 获取总记录数
		Integer total = (int) returnWarehouseDao.countByExample(wrwe);

		// 分页查询
		PagedList<LaborReturnStockOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
		wrwe.setLimitStart(page.getLimitStart());
		wrwe.setLimitEnd(page.getLimitEnd());
		wrwe.setOrderByClause("create_time desc");
		List<WareReturnWarehouseLabor> returnWarehouses = returnWarehouseDao.selectByExample(wrwe);

		// 获取明细
		List<LaborReturnStockOutput> outputs = new ArrayList<LaborReturnStockOutput>();
		if (!CollectionUtils.isEmpty(returnWarehouses)) {
			for (WareReturnWarehouseLabor returnWarehouse : returnWarehouses) {
				LaborReturnStockOutput output = new LaborReturnStockOutput();
				BeanUtils.copyProperties(returnWarehouse, output);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				output.setReturnDate(sdf.format(returnWarehouse.getReturnDate()));
				// 获取用户名
			    output.setUser(getUserNameByUserId(returnWarehouse.getOperator()));
				output.setAuditStatusLangLang(returnWarehouse.getAuditStatus());
				// 获取退库明细
				WareReturnWarehouseDetailLaborExample wrwde = new WareReturnWarehouseDetailLaborExample();
				WareReturnWarehouseDetailLaborExample.Criteria wrwdc = wrwde.createCriteria();
				wrwdc.andReturnIdEqualTo(returnWarehouse.getWareReturnWarehouseLaborId());
				List<WareReturnWarehouseDetailLabor> details = returnWarehouseDetailDao.selectByExample(wrwde);
				List<LaborReturnStockDetailOutput> detailOutputs = null;
				if (!CollectionUtils.isEmpty(details)) {
					detailOutputs = new ArrayList<>();
					for (WareReturnWarehouseDetailLabor returnWarehouseDetail : details) {
						LaborReturnStockDetailOutput detailOutput = new LaborReturnStockDetailOutput();
						BeanUtils.copyProperties(returnWarehouseDetail, detailOutput);
						detailOutput.setSparePartsNameLang(returnWarehouseDetail.getSpareParts());
						detailOutput.setReturnDate(sdf.format(returnWarehouseDetail.getReturnDate()));
						detailOutput.setSparePartsNo(wareSparePartsService.getSparePartsBrief(new EditSparePartsInput(returnWarehouseDetail.getSpareParts())).getSparePartsNo());
						detailOutputs.add(detailOutput);
					}
				}

				output.setDetails(detailOutputs);
				outputs.add(output);
			}
		}
		page.getDataList().addAll(outputs);
		return page;
	}
	
	/**
     * 根据出库单号,备件批次获取已退库数量
     * @param stockoutNo
     * @param sparePartsBatch
     */
	@Override
	public Double getReturnedNum(String stockoutNo,String sparePartsBatch){
		Double returnedNum = 0D;
		WareReturnWarehouseLaborExample example = new WareReturnWarehouseLaborExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStockoutNoEqualTo(stockoutNo).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
		List<WareReturnWarehouseLabor> returnWarehouseLabors = returnWarehouseDao.selectByExample(example);
		if(returnWarehouseLabors!=null&&returnWarehouseLabors.size()>0){
			for(WareReturnWarehouseLabor returnWarehouseLabor : returnWarehouseLabors){
				WareReturnWarehouseDetailLaborExample detailLaborExample = new WareReturnWarehouseDetailLaborExample();
				detailLaborExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andReturnIdEqualTo(returnWarehouseLabor.getWareReturnWarehouseLaborId()).andSparePartsBatchEqualTo(sparePartsBatch);
				List<WareReturnWarehouseDetailLabor> detailLabors = returnWarehouseDetailDao.selectByExample(detailLaborExample);
				if(detailLabors!=null&&detailLabors.size()>0){
					for(WareReturnWarehouseDetailLabor detail :detailLabors){
						returnedNum+=detail.getReturnNum();
					}
				}
			}
		}
		return returnedNum;
		
	} 
	
	/**
     * 根据原单号,备件批次获取已退库数量
     * @param no
     * @param sparePartsBatch
     */
	@Override
	public Double getReturnedNumByNo(String no,String sparePartsBatch){
		Double returnedNum = 0D;
		WareReturnWarehouseLaborExample example = new WareReturnWarehouseLaborExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andNoEqualTo(no).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
		List<WareReturnWarehouseLabor> returnWarehouseLabors = returnWarehouseDao.selectByExample(example);
		if(returnWarehouseLabors!=null&&returnWarehouseLabors.size()>0){
			for(WareReturnWarehouseLabor returnWarehouseLabor : returnWarehouseLabors){
				WareReturnWarehouseDetailLaborExample detailLaborExample = new WareReturnWarehouseDetailLaborExample();
				detailLaborExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andReturnIdEqualTo(returnWarehouseLabor.getWareReturnWarehouseLaborId()).andSparePartsBatchEqualTo(sparePartsBatch);
				List<WareReturnWarehouseDetailLabor> detailLabors = returnWarehouseDetailDao.selectByExample(detailLaborExample);
				if(detailLabors!=null&&detailLabors.size()>0){
					for(WareReturnWarehouseDetailLabor detail :detailLabors){
						returnedNum+=detail.getReturnNum();
					}
				}
			}
			
		}
		return returnedNum;
		
	}
	
	/**
     * 根据出库单号,出库明细ID获取已退库数量
     * @param stockoutNo
     * @param detailId
     */
	@Override
	public Double getReturnedNumById(String stockoutNo,Integer detailId){
		Double returnedNum = 0D;
		WareReturnWarehouseLaborExample example = new WareReturnWarehouseLaborExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStockoutNoEqualTo(stockoutNo).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
		List<WareReturnWarehouseLabor> returnWarehouseLabors = returnWarehouseDao.selectByExample(example);
		if(returnWarehouseLabors!=null&&returnWarehouseLabors.size()>0){
			for(WareReturnWarehouseLabor returnWarehouseLabor : returnWarehouseLabors){
				WareReturnWarehouseDetailLaborExample detailLaborExample = new WareReturnWarehouseDetailLaborExample();
				detailLaborExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andReturnIdEqualTo(returnWarehouseLabor.getWareReturnWarehouseLaborId()).andStockoutDetailIdEqualTo(detailId);
				List<WareReturnWarehouseDetailLabor> detailLabors = returnWarehouseDetailDao.selectByExample(detailLaborExample);
				if(detailLabors!=null&&detailLabors.size()>0){
					for(WareReturnWarehouseDetailLabor detail :detailLabors){
						returnedNum+=detail.getReturnNum();
					}
				}
			}
		}
		return returnedNum;
		
	} 
	/**
     * 退库单批量审核通过
     * @param ids
     */
	@Transactional
	@Override
	public void auditPass(Integer[] ids) {
		// TODO Auto-generated method stub
		WareReturnWarehouseLaborExample example = new WareReturnWarehouseLaborExample();
		example.createCriteria().andWareReturnWarehouseLaborIdIn(Arrays.asList(ids));
		List<WareReturnWarehouseLabor> returnWarehouseLabors = returnWarehouseDao.selectByExample(example);
		WareReturnWarehouseLabor rLabor = new WareReturnWarehouseLabor();
		rLabor.setUpdateTime(new Date());
		rLabor.setUpdateUser(getCurrentUserId());
		rLabor.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		returnWarehouseDao.updateByExampleSelective(rLabor, example);
		//修改库存
		for(WareReturnWarehouseLabor returnWarehouseLabor : returnWarehouseLabors){
			WareReturnWarehouseDetailLaborExample detailLaborExample = new WareReturnWarehouseDetailLaborExample();
			detailLaborExample.createCriteria().andReturnIdEqualTo(returnWarehouseLabor.getWareReturnWarehouseLaborId());
			List<WareReturnWarehouseDetailLabor> detailLabors = returnWarehouseDetailDao.selectByExample(detailLaborExample);
			if(detailLabors!=null&&detailLabors.size()>0){
				for(WareReturnWarehouseDetailLabor detailLabor : detailLabors){
					LaborReturnStockDetailOutput returnDetail = new LaborReturnStockDetailOutput();
					BeanUtils.copyProperties(detailLabor, returnDetail);
					//修改出库单
					setStockout(returnDetail);
					//修改库存
					setStockByReturn(returnDetail);
					
					WareStockoutDetailLabaor stockoutDetailLabaor = stockoutDetailDao.selectByPrimaryKey(detailLabor.getStockoutDetailId());
					WareStockoutLabaorExample stockoutLabaorsExample = new WareStockoutLabaorExample();
					stockoutLabaorsExample.createCriteria().andLabaorStockoutNoEqualTo(returnWarehouseLabor.getStockoutNo());
					List<WareStockoutLabaor> stockoutLabaors = stockoutDao.selectByExample(stockoutLabaorsExample);
					if(stockoutLabaors!=null&&stockoutLabaors.size()>0){
						WareStockoutLabaor stockoutLabaor = stockoutLabaors.get(0);
						if(stockoutLabaor.getBillType().equals("LKBILLTYPE000046")){
							WareSellProgrammeDetail sellDetail = sellDetailDao.selectByPrimaryKey(stockoutDetailLabaor.getNoDetailId());
							WareStockoutDetailLabaorExample stockoutLabaorExample = new WareStockoutDetailLabaorExample();
							stockoutLabaorExample.createCriteria().andNoDetailIdEqualTo(sellDetail.getWareSellProgrammeDetailId());
							List<WareStockoutDetailLabaor> detailLabaors = stockoutDetailDao.selectByExample(stockoutLabaorExample);
							Double num =0D;
							if(detailLabaors!=null&&detailLabaors.size()>0){
								for(WareStockoutDetailLabaor detailLabaor : detailLabaors){
									num +=getReturnedNumById(returnWarehouseLabor.getStockoutNo(),detailLabaor.getWareStockoutDetailLabaorId());
								}
							}
							if(sellDetail.getApplyNum()-num==0){
								sellDetail.setStockoutStatus(StockoutEnum.RETURN.getCode());
							}else{
								sellDetail.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
							}
							sellDetail.setUpdateTime(new Date());
							sellDetail.setUpdateUser(getCurrentUserId());
							sellDetailDao.updateByPrimaryKeySelective(sellDetail);
							WareSellProgrammeExample sellExample = new WareSellProgrammeExample();
							sellExample.createCriteria().andAdvanceWarehouseReceiptNoEqualTo(returnWarehouseLabor.getNo());
							List<WareSellProgramme> sells = sellDao.selectByExample(sellExample);
							if(sells!=null&&sells.size()>0){
								WareSellProgramme sell = sells.get(0);
								WareSellProgrammeDetailExample sellDetailExample = new WareSellProgrammeDetailExample();
								sellDetailExample.createCriteria().andWareSellProgrammeEqualTo(sell.getWareSellProgrammeId());
								List<WareSellProgrammeDetail> wareStockoutDetailLabaors = sellDetailDao.selectByExample(sellDetailExample);
								List<String> statusList = new ArrayList<>();
								for(WareSellProgrammeDetail laborReceiveDetail : wareStockoutDetailLabaors){
									if(laborReceiveDetail.getStockoutStatus().equals(StockoutEnum.RETURN.getCode())){
										statusList.add(laborReceiveDetail.getStockoutStatus());
									}
								}
								if(statusList.size()==wareStockoutDetailLabaors.size()){
									sell.setStockoutStatus(StockoutEnum.RETURN.getCode());
								}else{
									sell.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
								}
								
								sellDao.updateByPrimaryKeySelective(sell);
							}
						}else{
							WareLaborReceiveDetail receiveDetail = receiveDetailDao.selectByPrimaryKey(stockoutDetailLabaor.getNoDetailId());
							
							WareStockoutDetailLabaorExample stockoutLabaorExample = new WareStockoutDetailLabaorExample();
							stockoutLabaorExample.createCriteria().andNoDetailIdEqualTo(receiveDetail.getWareLaborReceiveDetailId());
							List<WareStockoutDetailLabaor> detailLabaors = stockoutDetailDao.selectByExample(stockoutLabaorExample);
							Double num =0D;
							if(detailLabaors!=null&&detailLabaors.size()>0){
								for(WareStockoutDetailLabaor detailLabaor : detailLabaors){
									num +=getReturnedNumById(returnWarehouseLabor.getStockoutNo(),detailLabaor.getWareStockoutDetailLabaorId());
								}
							}
							if(receiveDetail.getApplicantNum()-num==0){
								receiveDetail.setStockoutStatus(StockoutEnum.RETURN.getCode());
							}else{
								receiveDetail.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
							}
							receiveDetail.setUpdateTime(new Date());
							receiveDetail.setUpdateUser(getCurrentUserId());
							receiveDetailDao.updateByPrimaryKeySelective(receiveDetail);
							WareLaborReceiveExample receiveExample = new WareLaborReceiveExample();
							receiveExample.createCriteria().andAdvanceWarehouseReceiptNoEqualTo(returnWarehouseLabor.getNo());
							List<WareLaborReceive> receives = receiveDao.selectByExample(receiveExample);
							if(receives!=null&&receives.size()>0){
								WareLaborReceive receive = receives.get(0);
								WareLaborReceiveDetailExample receiveDetailExample = new WareLaborReceiveDetailExample();
								receiveDetailExample.createCriteria().andWareLaborReceiveEqualTo(receive.getWareLaborReceiveId());
								List<WareLaborReceiveDetail> wareStockoutDetailLabaors = receiveDetailDao.selectByExample(receiveDetailExample);
								List<String> statusList = new ArrayList<>();
								for(WareLaborReceiveDetail laborReceiveDetail : wareStockoutDetailLabaors){
									if(laborReceiveDetail.getStockoutStatus().equals(StockoutEnum.RETURN.getCode())){
										statusList.add(laborReceiveDetail.getStockoutStatus());
									}
								}
								if(statusList.size()==wareStockoutDetailLabaors.size()){
									receive.setStockoutStatus(StockoutEnum.RETURN.getCode());
								}else{
									receive.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
								}
								
								receiveDao.updateByPrimaryKeySelective(receive);
							}
						}
					}
					
					
				}
				//生成入库单
				LaborStockInInput input = new LaborStockInInput();
				List<LaborStockOutput> stocks = getLaborStockList();
				if(stocks!=null&&stocks.size()>0){
					input.setWarehouse(stocks.get(0).getWarehouse());
				}
				input.setEntryStatus(StockinEnum.YESIN.getCode());
				input.setAuditStatus(AuditStateEnum.AUDITED.getCode());
				
				List<AddLaborInsuranceInput> detailList = new ArrayList<>();
				List<LaborStockoutDetailOutput> dataList = stockoutService.getStockDetailListByStockoutNo(returnWarehouseLabor.getStockoutNo());
				BigDecimal totalAmount = BigDecimal.ZERO;
				for(WareReturnWarehouseDetailLabor detailLabor : detailLabors){
					AddLaborInsuranceInput insuranceInput = new AddLaborInsuranceInput();
					for(LaborStockoutDetailOutput detailOutput : dataList){
						if(detailOutput.getWareStockoutDetailLabaorId().equals(detailLabor.getStockoutDetailId())){
							insuranceInput.setSpareParts(detailOutput.getSpareParts());
							insuranceInput.setModel(detailOutput.getModel());
							insuranceInput.setSparePartsCode(detailOutput.getSparePartsBatch());
							insuranceInput.setEntryNum(detailLabor.getReturnNum());
							insuranceInput.setEntryPrice(detailOutput.getUnitPrice());
							insuranceInput.setTotalAmount(insuranceInput.getEntryPrice().multiply(new BigDecimal(insuranceInput.getEntryNum())));
							insuranceInput.setStorageLocation(detailOutput.getStorageLocation());
							insuranceInput.setRemark("退库备件");
							detailList.add(insuranceInput);
							totalAmount = totalAmount.add(insuranceInput.getTotalAmount());
						}
					}
					
				}
				input.setTotalAmount(totalAmount);
				input.setDetailList(detailList);
				addLaborStockIn(input);
				
				//修改原单
				
			}
		}
		
		
	}

	/**
     * 退库单批量审核驳回
     * @param ids
     */
	@Override
	public void auditReject(Integer[] ids, String reasonsRejection) {
		// TODO Auto-generated method stub
		WareReturnWarehouseLaborExample example = new WareReturnWarehouseLaborExample();
		example.createCriteria().andWareReturnWarehouseLaborIdIn(Arrays.asList(ids));
		WareReturnWarehouseLabor rLabor = new WareReturnWarehouseLabor();
		rLabor.setUpdateTime(new Date());
		rLabor.setUpdateUser(getCurrentUserId());
		rLabor.setReasonsRejection(reasonsRejection);
		rLabor.setAuditStatus(AuditStateEnum.REJECTED.getCode());
		returnWarehouseDao.updateByExampleSelective(rLabor, example);
	}
	
	/**
     * 退库修改出库单
     * @param stockDetail
     */
	@Transactional
	public void setStockout(LaborReturnStockDetailOutput returnDetail){
		WareReturnWarehouseLabor returnWarehouse = returnWarehouseDao.selectByPrimaryKey(returnDetail.getReturnId());
		List<LaborStockoutDetailOutput> dataList = stockoutService.getStockDetailListByStockoutNo(returnWarehouse.getStockoutNo());
		if(dataList!=null&&dataList.size()>0){
			for(LaborStockoutDetailOutput detailOutput : dataList){
				if(detailOutput.getWareStockoutDetailLabaorId().equals(returnDetail.getStockoutDetailId())&&detailOutput.getSparePartsBatch().equals(returnDetail.getSparePartsBatch())){
					Double b =  detailOutput.getStockoutNum();
		            Boolean flag = true;
					detailOutput.setStockoutNum(detailOutput.getStockoutNum()-returnDetail.getReturnNum());
		            if(b != detailOutput.getStockoutNum()){
		                if(detailOutput.getStockoutNum() == 0){
		                	detailOutput.setStockoutStatus(StockoutEnum.RETURN.getCode());
		                }else {
		                	detailOutput.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
		                    flag = false;
		                }
		            }
		            WareStockoutDetailLabaor detailLabaor = new WareStockoutDetailLabaor();
					BeanUtils.copyProperties(detailOutput, detailLabaor);
					//根据出库单号找到出库单
					WareStockoutLabaorExample sExample = new WareStockoutLabaorExample();
					sExample.createCriteria().andLabaorStockoutNoEqualTo(detailOutput.getStockoutNo());
					List<WareStockoutLabaor> sLabaors = stockoutDao.selectByExample(sExample);
					if(sLabaors!=null&&sLabaors.size()>0){
						WareStockoutLabaor sLabaor = sLabaors.get(0);
						sLabaor.setUpdateTime(new Date());
						sLabaor.setUpdateUser(getCurrentUserId());
			            if(flag){
			            	sLabaor.setStockoutStatus(StockoutEnum.RETURN.getCode());
			            }else {
			            	sLabaor.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
			            }
			            stockoutDao.updateByPrimaryKeySelective(sLabaor);
					}
					stockoutDetailDao.updateByPrimaryKeySelective(detailLabaor);
				}
			}
		}
	}
	/**
     * 退库修改库存
     * @param stockDetail
     */
    @Override
    public void setStockByReturn(LaborReturnStockDetailOutput returnDetail){
        WareLaborStock stock = getStock(returnDetail.getSparePartsBatch(), returnDetail.getSpareParts());

        if(returnDetail.getReturnNum()!=null){
            //修改前台显示库存数量
            stock.setSurplusNum(stock.getSurplusNum()+returnDetail.getReturnNum());
            stock.setActualSurplusNum(stock.getActualSurplusNum()+returnDetail.getReturnNum());
        }
        stock.setUpdateTime(new Date());
        stock.setUpdateUser(getCurrentUserId());
        wareLaborStockDao.updateByPrimaryKeySelective(stock);
    }

    /**
     * 根据出库单号,查看是否存在未审核的退库单
     * @param stockoutNo
     * 
     */
	@Override
	public boolean isReturn(String stockoutNo) {
		// TODO Auto-generated method stub
		WareReturnWarehouseLaborExample example = new WareReturnWarehouseLaborExample();
		example.createCriteria().andStockoutNoEqualTo(stockoutNo).andAuditStatusEqualTo(AuditStateEnum.UNAUDIT.getCode());
		List<WareReturnWarehouseLabor> list = returnWarehouseDao.selectByExample(example);
		return list.isEmpty();
	} 
    
}
