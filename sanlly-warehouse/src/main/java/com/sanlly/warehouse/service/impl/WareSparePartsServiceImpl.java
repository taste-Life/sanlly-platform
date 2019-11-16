package com.sanlly.warehouse.service.impl;

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
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.input.spare.SearchTestingSpareInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.RefrigeratorCompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.warehouse.dao.WareQuoteCurrencyMapper;
import com.sanlly.warehouse.dao.WareSparePartsCategoriesMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.dao.WareSpareTextureMapper;
import com.sanlly.warehouse.dao.WareSpareUnitMapper;
import com.sanlly.warehouse.dao.WareSparepartsCategoriesDetailsMapper;
import com.sanlly.warehouse.dao.WareUnitMapper;
import com.sanlly.warehouse.dao.WareWarehouseTypeMapper;
import com.sanlly.warehouse.entity.WareQuoteCurrency;
import com.sanlly.warehouse.entity.WareQuoteCurrencyExample;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsCategories;
import com.sanlly.warehouse.entity.WareSparePartsCategoriesExample;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareSpareUnitExample;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetails;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample;
import com.sanlly.warehouse.entity.WareTextureExample;
import com.sanlly.warehouse.entity.WareUnit;
import com.sanlly.warehouse.entity.WareUnitExample;
import com.sanlly.warehouse.entity.WareWarehouseType;
import com.sanlly.warehouse.entity.WareWarehouseTypeExample;
import com.sanlly.warehouse.enums.ABCEnum;
import com.sanlly.warehouse.enums.DateEnum;
import com.sanlly.warehouse.enums.PurchasingPatternEnum;
import com.sanlly.warehouse.models.input.spareparts.AddSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.ImportSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.output.purchaserequisitions.WarePurchaseRequisitionsListOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;

/**
 * ClassName: WareSparePartsServiceImpl
 * Description: 备件服务层实现类
 * date: 2019/7/25 15:30
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareSparePartsServiceImpl extends BaseServiceImpl implements WareSparePartsService{

    @Autowired
    private WareSparePartsMapper sparePartsMapper;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareSpareTextureMapper spareTextureMapper;

    @Autowired
    private WareSpareUnitMapper spareUnitMapper;

    @Autowired
    private PurchaseRequisitionsServiceImpl purchaseRequisitionsService;

    private String wareSparePartsTable = "ware_spare_parts";
    
    @Autowired
    private WareSparePartsCategoriesMapper categoriedDao;
    @Autowired
    private WareSparepartsCategoriesDetailsMapper categoriesDetailDao;
    @Autowired
    private WareWarehouseTypeMapper warehouseTypeDao;
    @Autowired
    private WareUnitMapper unitDao;
    @Autowired
    private WareQuoteCurrencyMapper currencyDao;
    
    
    /**
     * 备件列表查询(简略信息)
     * @param input
     * @return
     */
    @Override
    public List<SparePartsBriefOutput> sparePartsBriefList(SearchSparePartsInput input) {
        //组装查询条件
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getSparePartsCategories()!=null && input.getSparePartsCategories()!=""){
            criteria.andSparePartsCategoriesEqualTo(input.getSparePartsCategories());
        }
        if(input.getSparePartsCategoriesDetails()!=null && input.getSparePartsCategoriesDetails()!=""){
            criteria.andSparePartsCategoriesDetailsEqualTo(input.getSparePartsCategoriesDetails());
        }
        if(input.getSparePartsNo()!=null && input.getSparePartsNo()!=""){
            criteria.andSparePartsNoEqualTo(input.getSparePartsNo());
        }
        if(input.getSparePartsName()!=null && input.getSparePartsName()!=""){
            criteria.andSparePartsNameLike("%"+input.getSparePartsName()+"%");
        }
        if(input.getSparePartsNameEn()!=null && input.getSparePartsNameEn()!=""){
            criteria.andSparePartsNameEnLike(input.getSparePartsNameEn());
        }
        if(CommonEnum.YES.getCode().equals(input.getSpValid())){
            criteria.andIsValidEqualTo(CommonEnum.YES.getCode());
        }else if(CommonEnum.NO.getCode().equals(input.getSpValid())){
            criteria.andIsValidEqualTo(CommonEnum.NO.getCode());
        }else if(input.getSpValid() == null){
            criteria.andIsValidEqualTo(CommonEnum.YES.getCode());
        }
        //组装返回值
        List<WareSpareParts> spareParts = sparePartsMapper.selectByExample(example);
        List<SparePartsBriefOutput> outputs = new ArrayList<>();
        for (WareSpareParts sparePart : spareParts) {
            SparePartsBriefOutput output = new SparePartsBriefOutput();
            BeanUtils.copyProperties(sparePart,output);
            output.setKeyLangLang(sparePart.getKey());
            output.setDefaultWarehouseTypeLangLang(sparePart.getDefaultWarehouseType());
            output.setSparePartsCategoriesLangLang(sparePart.getSparePartsCategories());
            output.setSparePartsCategoriesDetailsLangLang(sparePart.getSparePartsCategoriesDetails());
            outputs.add(output);
        }
        return outputs;
    }

    /**
     * 备件列表分页查询(详细信息)
     * @param input
     * @return
     */
    @Override
    public PagedList<SparePartsOutput> sparePartsPageList(SearchSparePartsInput input) {

        //组装查询条件
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getSparePartsCategories()!=null && input.getSparePartsCategories()!=""){
            criteria.andSparePartsCategoriesEqualTo(input.getSparePartsCategories());
        }
        if(input.getSparePartsCategoriesDetails()!=null && input.getSparePartsCategoriesDetails()!=""){
            criteria.andSparePartsCategoriesDetailsEqualTo(input.getSparePartsCategoriesDetails());
        }
        if(input.getSparePartsNo()!=null && input.getSparePartsNo()!=""){
            criteria.andSparePartsNoLike("%"+input.getSparePartsNo()+"%");
        }
        if(input.getSparePartsName()!=null && input.getSparePartsName()!=""){
            criteria.andSparePartsNameLike("%"+input.getSparePartsName()+"%");
        }
        if(input.getSparePartsNameEn()!=null && input.getSparePartsNameEn()!=""){
            criteria.andSparePartsNameEnLike("%"+input.getSparePartsNameEn()+"%");
        }
        if(CommonEnum.YES.getCode().equals(input.getSpValid())){
            criteria.andIsValidEqualTo(CommonEnum.YES.getCode());
        }else if(CommonEnum.NO.getCode().equals(input.getSpValid())){
            criteria.andIsValidEqualTo(CommonEnum.NO.getCode());
        }else {
            criteria.andIsValidEqualTo(CommonEnum.YES.getCode());
        }
        //总条数
        Integer totalItemCount = (int)sparePartsMapper.countByExample(example);
        PagedList<SparePartsOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<WareSpareParts> spareParts = sparePartsMapper.selectByExample(example);
        //组装返回数据
        List<SparePartsOutput> dataList = new ArrayList<>();
        for (WareSpareParts sparePart : spareParts) {
            SparePartsOutput output = new SparePartsOutput();
            BeanUtils.copyProperties(sparePart,output);
            //材质和使用机型待完善
            output.setKeyLangLang(sparePart.getKey());
            output.setManufactureLangLang(sparePart.getManufacture());
            output.setQuoteCurrencyLangLang(sparePart.getQuoteCurrency());
            output.setDefaultWarehouseTypeLangLang(sparePart.getDefaultWarehouseType());
            output.setSparePartsCategoriesLangLang(sparePart.getSparePartsCategories());
            output.setSparePartsUnitLangLang(sparePart.getSparePartsUnit());
            output.setSparePartsCategoriesDetailsLangLang(sparePart.getSparePartsCategoriesDetails());
            output.setSpareNum(stockService.getStockNum(sparePart.getKey()));
            output.setIsValidLangLang(sparePart.getIsValid());

            if(input.getWarehouse()!=null && input.getWarehouse()!=""){
            	try {
            		WarePurchaseRequisitionsListOutput reqOutput = purchaseRequisitionsService.getPurchaseRequisitionsOutput(sparePart.getKey(), input.getWarehouse());
            		output.setEntryNumLastYear(reqOutput.getEntryNumLastYear());
            		output.setSafeStockNum(reqOutput.getSafeStockNum());
            		output.setSurplusNum(reqOutput.getSurplusNum());
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            }
//            if(sparePart.getTexture() != null && sparePart.getTexture() != ""){
//                output.setTextureList(Arrays.asList(sparePart.getTexture().split(",")));
//            }
//            if(sparePart.getApplicableModels() != null && sparePart.getApplicableModels() != ""){
//                output.setApplicableModelsList(Arrays.asList(sparePart.getApplicableModels().split(",")));
//            }
//            if(sparePart.getComponentDetails() != null && sparePart.getComponentDetails() != ""){
//                output.setComponentDetailsList(Arrays.asList(sparePart.getComponentDetails().split(",")));
//            }

            dataList.add(output);
        }
        pagedList.getDataList().addAll(dataList);

        return pagedList;
    }


    /**
     * 获取备件基础信息(简略信息)
     * @param input
     * @return
     */
    @Override
    public SparePartsBriefOutput getSparePartsBrief(EditSparePartsInput input) {
        //组装拼装条件
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getWareSparePartsId()!=null){
            criteria.andWareSparePartsIdEqualTo(input.getWareSparePartsId());
        }
        if(input.getKey() != null && input.getKey() != ""){
            criteria.andKeyEqualTo(input.getKey());
        }
        //组装返回数据
        List<WareSpareParts> spareParts = sparePartsMapper.selectByExample(example);

        SparePartsBriefOutput output = new SparePartsBriefOutput();
        if(spareParts!=null&&spareParts.size()>0){
        	WareSpareParts parts = spareParts.get(0);
            BeanUtils.copyProperties(parts,output);
            output.setDefaultWarehouseTypeLangLang(parts.getDefaultWarehouseType());
            output.setSparePartsCategoriesLangLang(parts.getSparePartsCategories());
            output.setSparePartsCategoriesDetailsLangLang(parts.getSparePartsCategoriesDetails());
        }

        return output;
    }

    /**
     * 获取备件基础信息(详细信息)
     * @param input
     * @return
     */
    @Override
    public SparePartsOutput getSpareParts(EditSparePartsInput input) {
        //组装拼装条件
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        if(input.getWareSparePartsId()!=null){
            criteria.andWareSparePartsIdEqualTo(input.getWareSparePartsId());
        }
        if(input.getKey() != null && input.getKey() != ""){
            criteria.andKeyEqualTo(input.getKey());
        }
        SparePartsOutput output = new SparePartsOutput();
        //组装返回数据
        List<WareSpareParts> spareParts = sparePartsMapper.selectByExample(example);
        if(spareParts!=null&&spareParts.size()>0){
        	WareSpareParts sparePart = spareParts.get(0);
            
            BeanUtils.copyProperties(sparePart,output);
            output.setKeyLangLang(sparePart.getKey());
            output.setManufactureLangLang(sparePart.getManufacture());
            output.setQuoteCurrencyLangLang(sparePart.getQuoteCurrency());
            output.setDefaultWarehouseTypeLangLang(sparePart.getDefaultWarehouseType());
            output.setSparePartsCategoriesLangLang(sparePart.getSparePartsCategories());
            output.setSparePartsUnitLangLang(sparePart.getSparePartsUnit());
            output.setSparePartsCategoriesDetailsLangLang(sparePart.getSparePartsCategoriesDetails());
            output.setIsMaintainLangLang(sparePart.getIsMaintain());
            output.setIsValidLangLang(sparePart.getIsValid());
        }
        
//        if(sparePart.getTexture() != null && sparePart.getTexture() != ""){
//            output.setTextureList(Arrays.asList(sparePart.getTexture().split(",")));
//        }
//        if(sparePart.getApplicableModels() != null && sparePart.getApplicableModels() != ""){
//            output.setApplicableModelsList(Arrays.asList(sparePart.getApplicableModels().split(",")));
//        }
//        if(sparePart.getComponentDetails() != null && sparePart.getComponentDetails() != ""){
//            output.setComponentDetailsList(Arrays.asList(sparePart.getComponentDetails().split(",")));
//        }
        return output;
    }

    /**
     * 根据备件号获取详细信息
     * @param no
     * @return
     */
    @Override
    public SparePartsOutput getSparePartByNo(String no) {
        //组装拼装条件
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();

        criteria.andSparePartsNoEqualTo(no);
        SparePartsOutput output = new SparePartsOutput();
        //组装返回数据
        List<WareSpareParts> spareParts = sparePartsMapper.selectByExample(example);
        if(spareParts!=null&&spareParts.size()>0){
        	WareSpareParts sparePart = spareParts.get(0);
            
            BeanUtils.copyProperties(sparePart,output);
            output.setWidth(sparePart.getWidth());
            output.setLength(sparePart.getLength());
            output.setIsIncise(sparePart.getIsIncise());
            output.setKeyLangLang(sparePart.getKey());
            output.setManufactureLangLang(sparePart.getManufacture());
            output.setQuoteCurrencyLangLang(sparePart.getQuoteCurrency());
            output.setDefaultWarehouseTypeLangLang(sparePart.getDefaultWarehouseType());
            output.setSparePartsCategoriesLangLang(sparePart.getSparePartsCategories());
            output.setSparePartsUnitLangLang(sparePart.getSparePartsUnit());
            output.setSparePartsCategoriesDetailsLangLang(sparePart.getSparePartsCategoriesDetails());
            output.setIsMaintainLangLang(sparePart.getIsMaintain());
            output.setIsValidLangLang(sparePart.getIsValid());
        }
        
//        if(sparePart.getTexture() != null && sparePart.getTexture() != ""){
//            output.setTextureList(Arrays.asList(sparePart.getTexture().split(",")));
//        }
//        if(sparePart.getApplicableModels() != null && sparePart.getApplicableModels() != ""){
//            output.setApplicableModelsList(Arrays.asList(sparePart.getApplicableModels().split(",")));
//        }
//        if(sparePart.getComponentDetails() != null && sparePart.getComponentDetails() != ""){
//            output.setComponentDetailsList(Arrays.asList(sparePart.getComponentDetails().split(",")));
//        }
        return output;
    }

    /**
     * 根据备件key获取详细信息
     * @param keys
     * @return
     */
    @Override
    public List<SparePartsBriefOutput> getSparePartByKeys(String[] keys) {
        //组装拼装条件
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();

        criteria.andKeyIn(Arrays.asList(keys));

        //组装返回数据
        List<WareSpareParts> spareParts = sparePartsMapper.selectByExample(example);
        if(spareParts.size() == 0){
            throw  new RuntimeException("notFoundSpareParts");
        }
        List<SparePartsBriefOutput> outputs = new ArrayList<>();
        for(WareSpareParts sparePart:spareParts) {
        	SparePartsBriefOutput output = new SparePartsBriefOutput();
            BeanUtils.copyProperties(sparePart,output);
            outputs.add(output);
        }
        return outputs;
    }

    /**
     * 新增备件
     * @param input
     */
    @Override
    @Transactional
    public void addSpareParts(AddSparePartsInput input) {
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsNameEqualTo(input.getSparePartsName());
        List<WareSpareParts> wareSpareParts1 = sparePartsMapper.selectByExample(example);
        if(wareSpareParts1.size() > 0){
            throw new RuntimeException("nameRepetitionErr");
        }
        example.clear();
        WareSparePartsExample.Criteria noCriteria = example.createCriteria();
        noCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        noCriteria.andSparePartsNoEqualTo(input.getSparePartsNo());
        List<WareSpareParts> wareSpareParts2 = sparePartsMapper.selectByExample(example);
        if(wareSpareParts2 .size() > 0){
            throw new RuntimeException("noRepetitionErr");
        }

        Result<String> result = productionService.getKey(wareSparePartsTable);
        if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        WareSpareParts wareSpareParts = new WareSpareParts();
        BeanUtils.copyProperties(input,wareSpareParts);
        if(input.getStockoutRestrictMonth()!=null){
        	wareSpareParts.setStockoutRestrictMonth(StringUtils.join(input.getStockoutRestrictMonth(), ","));
        }
        if(input.getIsMergerAcquisition() != null){
            wareSpareParts.setIsMergerAcquisition(input.getIsMergerAcquisition());
        }else {
            wareSpareParts.setIsMergerAcquisition(CommonEnum.NO.getCode());
        }
        wareSpareParts.setIsDel(PlatformConstants.ISDEL_NO);
        wareSpareParts.setIsValid(CommonEnum.YES.getCode());
        wareSpareParts.setKey(result.getData());
        wareSpareParts.setCreateTime(new Date());
        wareSpareParts.setCreateUser(getCurrentUserId());
        sparePartsMapper.insert(wareSpareParts);
    }

    /**
     * 修改备件
     * @param input
     */
    @Override
    @Transactional
    public void updateSpareParts(EditSparePartsInput input) {
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsNameEqualTo(input.getSparePartsName());
        List<WareSpareParts> wareSpareParts1 = sparePartsMapper.selectByExample(example);
        if (wareSpareParts1.size() > 0){
            // 有重复
            if (!wareSpareParts1.get(0).getWareSparePartsId().equals(input.getWareSparePartsId())){
                // 非原条目修改
                throw new RuntimeException("nameRepetitionErr");
            }
        }
        example.clear();
        WareSparePartsExample.Criteria noCriteria = example.createCriteria();
        noCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        noCriteria.andSparePartsNoEqualTo(input.getSparePartsNo());
        List<WareSpareParts> wareSpareParts2 = sparePartsMapper.selectByExample(example);
        if(wareSpareParts2.size() > 0){
            // 有重复
            if(!wareSpareParts2.get(0).getWareSparePartsId().equals(input.getWareSparePartsId())){
                // 非原条目修改
                throw new RuntimeException("noRepetitionErr");
            }
        }

        WareSpareParts wareSpareParts = new WareSpareParts();
        BeanUtils.copyProperties(input,wareSpareParts);
        if(input.getStockoutRestrictMonth()!=null){
        	wareSpareParts.setStockoutRestrictMonth(StringUtils.join(input.getStockoutRestrictMonth(), ","));
        }
        wareSpareParts.setUpdateUser(getCurrentUserId());
        wareSpareParts.setUpdateTime(new Date());
        sparePartsMapper.updateByPrimaryKeySelective(wareSpareParts);
    }

    /**
     * 批量删除备件
     * @param sparePartsIds
     */
    @Override
    @Transactional
    public void deleteSpareParts(Integer[] sparePartsIds) {
        WareSparePartsExample example = new WareSparePartsExample();
        example.createCriteria().andWareSparePartsIdIn(Arrays.asList(sparePartsIds));
        WareSpareParts spareParts = new WareSpareParts();
        spareParts.setIsDel(PlatformConstants.ISDEL_YES);
        spareParts.setUpdateTime(new Date());
        spareParts.setUpdateUser(getCurrentUserId());
        sparePartsMapper.updateByExampleSelective(spareParts,example);
    }

    /**
     * 根据Id批量置备件无效
     * @param sparePartsIds
     */
    @Override
    public void invalidSpareParts(Integer[] sparePartsIds) {
        WareSparePartsExample example = new WareSparePartsExample();
        example.createCriteria().andWareSparePartsIdIn(Arrays.asList(sparePartsIds));
        WareSpareParts spareParts = new WareSpareParts();
        spareParts.setIsValid(CommonEnum.NO.getCode());
        spareParts.setUpdateTime(new Date());
        spareParts.setUpdateUser(getCurrentUserId());
        sparePartsMapper.updateByExampleSelective(spareParts,example);
    }

    /**
     * 根据Id批量置备件有效
     * @param sparePartsIds
     */
    @Override
    public void validSpareParts(Integer[] sparePartsIds) {
        WareSparePartsExample example = new WareSparePartsExample();
        example.createCriteria().andWareSparePartsIdIn(Arrays.asList(sparePartsIds));
        WareSpareParts spareParts = new WareSpareParts();
        spareParts.setUpdateTime(new Date());
        spareParts.setIsValid(CommonEnum.YES.getCode());
        spareParts.setUpdateUser(getCurrentUserId());
        sparePartsMapper.updateByExampleSelective(spareParts,example);
    }

    /**
     * 机组检验，备件列表
     * @param input
     * @return
     */
	@Override
	public List<SpareTestingOutput> getSparePartsFromTesting(SearchTestingSpareInput input) {
		List<SpareTestingOutput> outputs = new ArrayList<>();

		WareSparePartsExample example=new WareSparePartsExample();
    	WareSparePartsExample.Criteria criteria=example.createCriteria();
    	criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
    	//冷机公司
    	if(StringUtils.isNotEmpty(input.getCompanyKey())) {
    		criteria.andManufactureEqualTo(input.getCompanyKey());
    	}
    	//机型
    	if(StringUtils.isNotEmpty(input.getUnitTypeKey())) {
    		criteria.andApplicableModelsLike("%"+input.getUnitTypeKey()+",%");
    	}
    	//部件明细
    	if(input.getPartsDetailCode()!=null && input.getPartsDetailCode().length>0) {

    		criteria.andComponentDetailsLike("%"+input.getPartsDetailCode()[0]+",%");
    		//    		criteria.andComponentDetailsIn(Arrays.asList(input.getPartsDetailCode()));
    	}
    	if(StringUtils.isNotEmpty(input.getRepairCode())) {
    		if(input.getRepairCode().equals("RB")) {
    			criteria.andSparePartsNoLike("%-XF");
    		}
    	}
    	List<WareSpareParts> spareList=sparePartsMapper.selectByExample(example);

        for (WareSpareParts sparePart : spareList) {
        	SpareTestingOutput output = new SpareTestingOutput();
        	output.setSparesNum(sparePart.getSparePartsNo());
        	output.setSparesNameLang(sparePart.getKey());
        	output.setDefaultWarehouseType(sparePart.getDefaultWarehouseType());
        	output.setDefaultWarehouseTypeNameLang(sparePart.getDefaultWarehouseType());
            outputs.add(output);
        }
        return outputs;
	}

    /**
     * 根据备件号备件名称模糊查询备件key集合
     * @param no
     * @param name
     * @return
     */
    @Override
    public List<String> getSparePartsKeyListByLike(String no, String name) {
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(no!=null && no != ""){
            criteria.andSparePartsNoLike("%"+no+"%");
        }
        if(name!=null && name!=""){
            criteria.andSparePartsNameLike("%"+name+"%");
        }
        List<WareSpareParts> wareSpareParts = sparePartsMapper.selectByExample(example);
        List<String> keyList = new ArrayList<>();
        for (WareSpareParts wareSparePart : wareSpareParts) {
            keyList.add(wareSparePart.getKey());
        }
        return keyList;
    }

    /**
     * 根据备件no查询备件key
     * @param no
     * @return
     */
    @Override
    public String getKeyByNo(String no) {
        WareSparePartsExample example = new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsNoEqualTo(no);
        List<WareSpareParts> wareSpareParts = sparePartsMapper.selectByExample(example);
        if(wareSpareParts.size() == 0){
            throw new RuntimeException("notFoundSpareParts");
        }
        return wareSpareParts.get(0).getKey();
    }

    /**
     * 根据备件号或者key获取备件简要信息
     *
     * @param key
     * @param no
     * @return
     * @author lishzh
     */
    @Override
    public SparePartsBriefOutput getSparePart(String key, String no) {
        WareSparePartsExample example=new WareSparePartsExample();
        WareSparePartsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (key!=null){
            criteria.andKeyEqualTo(key);
        }
        if (no!=null){
            criteria.andSparePartsNoEqualTo(no);
        }

        return sparePartsMapper.selectByExample(example).stream().map(sp -> {
            SparePartsBriefOutput output=new SparePartsBriefOutput();
            BeanUtils.copyProperties(sp,output);
            output.setQuotePrice(sp.getQuotePrice());
            return output;
        }).findFirst().orElseGet(null);
    }

    /**
     * 批量导入备件信息
     *
     * @param inputs
     * @author zhh
     * @return
     */
    @Transactional
	@Override
	public void importSpareParts(List<ImportSparePartsInput> inputs) {
		// TODO Auto-generated method stub
		if(inputs!=null&&inputs.size()>0) {
			for(ImportSparePartsInput input : inputs) {
				//根据备件大类名查询key
				if(StringUtils.isNotEmpty(input.getSparePartsCategoriesName())) {
					WareSparePartsCategoriesExample categoriedExample = new WareSparePartsCategoriesExample();
					categoriedExample.createCriteria().andSparePartsCategoriesNameEqualTo(input.getSparePartsCategoriesName()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<WareSparePartsCategories> sparePartsCategories = categoriedDao.selectByExample(categoriedExample);
				    if(sparePartsCategories!=null&&sparePartsCategories.size()>0) {
				    	input.setSparePartsCategories(sparePartsCategories.get(0).getKey());
				    }else {
				    	throw new RuntimeException("error");
				    }
				}
				//根据备件明细类别名查询key
				if(StringUtils.isNotEmpty(input.getSparePartsCategoriesDetailsName())) {
					WareSparepartsCategoriesDetailsExample sparepartsCategoriesDetailsExample = new WareSparepartsCategoriesDetailsExample();
					sparepartsCategoriesDetailsExample.createCriteria().andSparepartsCategoriesDetailsNameEqualTo(input.getSparePartsCategoriesDetailsName()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<WareSparepartsCategoriesDetails> sparePartsCategoriesDetails = categoriesDetailDao.selectByExample(sparepartsCategoriesDetailsExample);
				    if(sparePartsCategoriesDetails!=null&&sparePartsCategoriesDetails.size()>0) {
				    	input.setSparePartsCategoriesDetails(sparePartsCategoriesDetails.get(0).getKey());
				    }else {
				    	throw new RuntimeException("error");
				    }
				}
				//根据生产厂商名称查询key
				if(StringUtils.isNotEmpty(input.getManufactureName())) {
					Result<List<RefrigeratorCompanyOutput>> result = productionService.getAllRefrigeratorCompany();
					if(result!=null&&result.getData()!=null) {
						List<RefrigeratorCompanyOutput> refrigeratorCompanyOutputs = result.getData();
					    for(RefrigeratorCompanyOutput reOutput : refrigeratorCompanyOutputs) {
					    	if(reOutput.getUnitCompanyName().equals(input.getManufactureName())) {
					    		input.setManufacture(reOutput.getKey());
					    	}
					    }
					}
				}
				//根据备件单位名称查询key
				if(StringUtils.isNotEmpty(input.getSparePartsUnitName())) {
					WareUnitExample unitExample = new WareUnitExample();
					unitExample.createCriteria().andUnitNameEqualTo(input.getSparePartsUnitName()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<WareUnit> units = unitDao.selectByExample(unitExample);
					if(units!=null&&units.size()>0) {
						input.setSparePartsUnit(units.get(0).getKey());
					}else {
				    	throw new RuntimeException("error");
				    }
				}
				//根据默认仓库类型名称查询key
				if(StringUtils.isNotEmpty(input.getDefaultWarehouseTypeName())) {
					WareWarehouseTypeExample housTypeExample = new WareWarehouseTypeExample();
					housTypeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWarehouseTypeNameEqualTo(input.getDefaultWarehouseTypeName());
					List<WareWarehouseType> warehouseTypes = warehouseTypeDao.selectByExample(housTypeExample);
					if(warehouseTypes!=null&&warehouseTypes.size()>0) {
						input.setDefaultWarehouseType(warehouseTypes.get(0).getKey());
					}else {
						throw new RuntimeException("error");
					}
				}
				//是否可切割
				if(StringUtils.isNotEmpty(input.getIsInciseStr())) {
					if(CommonEnum.YES.getDesc().equals(input.getIsInciseStr())) {
						input.setIsIncise(CommonEnum.YES.getCode());
					}else {
						input.setIsIncise(CommonEnum.NO.getCode());
					}
				}
				//是否合并领料
                if(StringUtils.isNotEmpty(input.getIsMergerAcquisitionStr())) {
                	if(CommonEnum.YES.getDesc().equals(input.getIsMergerAcquisitionStr())) {
    					input.setIsMergerAcquisition(CommonEnum.YES.getCode());
    				}else {
    					input.setIsMergerAcquisition(CommonEnum.NO.getCode());
    				}
				}
                //是否需退件
                if(StringUtils.isNotEmpty(input.getIsSendBackStr())) {
                	if(CommonEnum.YES.getDesc().equals(input.getIsSendBackStr())) {
    					input.setIsSendBack(CommonEnum.YES.getCode());
    				}else {
    					input.setIsSendBack(CommonEnum.NO.getCode());
    				}
				}
                //是否耗材
                if(StringUtils.isNotEmpty(input.getIsConsumableStr())) {
                	if(CommonEnum.YES.getDesc().equals(input.getIsConsumableStr())) {
    					input.setIsConsumable(CommonEnum.YES.getCode());
    				}else {
    					input.setIsConsumable(CommonEnum.NO.getCode());
    				}
                }
				//ABC分类
				if(StringUtils.isNotEmpty(input.getAbc())) {
					if("A".equals(input.getAbc())) {
						input.setAbc("A");
					}else if("B".equals(input.getAbc())){
						input.setAbc("B");
					}else if("C".equals(input.getAbc())){
						input.setAbc("C");
					}else {
						throw new RuntimeException("error");
					}
				}
				//根据币种名称查询key
				if(StringUtils.isNotEmpty(input.getQuoteCurrencyStr())) {
					WareQuoteCurrencyExample quoteCurrencyExample = new WareQuoteCurrencyExample();
					quoteCurrencyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andQuoteCurrencyNameEqualTo(input.getQuoteCurrencyStr());
				    List<WareQuoteCurrency> quList = currencyDao.selectByExample(quoteCurrencyExample);
				    if(quList!=null&&quList.size()>0) {
				    	input.setQuoteCurrency(quList.get(0).getKey());
				    }else {
				    	throw new RuntimeException("error");
				    }
				}
				//根据采购模式名查询key
				if(StringUtils.isNotEmpty(input.getPurchasingPatternStr())) {
					if(PurchasingPatternEnum.ONLY.getMessage().equals(input.getPurchasingPatternStr())) {
						input.setPurchasingPattern(PurchasingPatternEnum.ONLY.getCode());
					}else if(PurchasingPatternEnum.TENDERBIDDINGINQUIRY.getMessage().equals(input.getPurchasingPatternStr())) {
						input.setPurchasingPattern(PurchasingPatternEnum.TENDERBIDDINGINQUIRY.getCode());
					}else if(PurchasingPatternEnum.ONLYANDTENDER.getMessage().equals(input.getPurchasingPatternStr())) {
						input.setPurchasingPattern(PurchasingPatternEnum.ONLYANDTENDER.getCode());
					}else {
						throw new RuntimeException("error");
					}
				}
				//根据询价周期名查询key
				if(StringUtils.isNotEmpty(input.getInquiryCycleStr())) {
					if(DateEnum.QUARTER.getMessage().equals(input.getInquiryCycleStr())) {
						input.setInquiryCycle(DateEnum.QUARTER.getCode());
					}else if(DateEnum.HALFYEAR.getMessage().equals(input.getInquiryCycleStr())) {
						input.setInquiryCycle(DateEnum.HALFYEAR.getCode());
					}else if(DateEnum.YEAR.getMessage().equals(input.getInquiryCycleStr())) {
						input.setInquiryCycle(DateEnum.YEAR.getCode());
					}else {
						throw new RuntimeException("error");
					}
				}
				//判断是否存在备件
				if(StringUtils.isNotEmpty(input.getSparePartsNo())) {
					WareSparePartsExample spExample = new WareSparePartsExample();
					spExample.createCriteria().andSparePartsNoEqualTo(input.getSparePartsNo()).andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(CommonEnum.YES.getCode());
					List<WareSpareParts> spaList = sparePartsMapper.selectByExample(spExample);
					if(spaList!=null&&spaList.size()>0) {
						WareSpareParts spareParts = spaList.get(0);
				    	BeanUtils.copyProperties(input, spareParts);
				        EditSparePartsInput eInput = new EditSparePartsInput();
				    	BeanUtils.copyProperties(spareParts, eInput);
				    	updateSpareParts(eInput);
					}else {
				    	AddSparePartsInput aInput = new AddSparePartsInput();
				    	BeanUtils.copyProperties(input, aInput);
				    	addSpareParts(aInput);
					}
				}else {
					throw new RuntimeException("sparePartsNo is required");
				}
				
			}
		}else {
			throw new RuntimeException("no data");
		}
	}
}
