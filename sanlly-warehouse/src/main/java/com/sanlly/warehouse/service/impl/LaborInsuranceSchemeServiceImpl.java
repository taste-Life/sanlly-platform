package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.WareLaborAdvanceReceiveMapper;
import com.sanlly.warehouse.dao.WareLaborInformationStaffMapper;
import com.sanlly.warehouse.dao.WareLaborInsuranceDetailMapper;
import com.sanlly.warehouse.dao.WareLaborInsuranceMapper;
import com.sanlly.warehouse.dao.WareLaborReceiveDetailMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.entity.WareLaborAdvanceReceive;
import com.sanlly.warehouse.entity.WareLaborInformationStaff;
import com.sanlly.warehouse.entity.WareLaborInformationStaffExample;
import com.sanlly.warehouse.entity.WareLaborInsurance;
import com.sanlly.warehouse.entity.WareLaborInsuranceDetail;
import com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample;
import com.sanlly.warehouse.entity.WareLaborInsuranceExample;
import com.sanlly.warehouse.entity.WareLaborInsuranceExample.Criteria;
import com.sanlly.warehouse.entity.WareLaborReceiveDetail;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.enums.IsValidEnum;
import com.sanlly.warehouse.enums.TermEnum;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.AddLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.EditLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.SearchLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.LaborStaffInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.SearchUserInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.output.laborInsurance.PersonalNextReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborStaff.userSchemeOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.DemandEstimationOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.DemandOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.sparepartscategoriesdetails.SparePartsCategoriesDetailsOutput;
import com.sanlly.warehouse.service.LaborInsuranceSchemeService;
import com.sanlly.warehouse.service.LaborInsuranceStockService;
import com.sanlly.warehouse.service.WareSparePartsCategoriesDetailsService;
import com.sanlly.warehouse.service.WareSparePartsService;


@Service
public class LaborInsuranceSchemeServiceImpl extends BaseServiceImpl implements LaborInsuranceSchemeService{
	
	@Autowired
	private WareLaborInsuranceMapper wareLaborInsuranceDao;
	
	@Autowired
	private WareLaborInsuranceDetailMapper wareLaborInsuranceDetailDao;
	
	@Autowired
	private WareSparePartsMapper wareSparePartsDao;
	
	@Autowired
	private WareLaborInformationStaffMapper wareLaborInformationStaffDao;
	
	@Autowired
	private WareLaborReceiveDetailMapper wareLaborReceiveDetailDao;
    
	private String laborInsuranceSchemeTable = "ware_labor_insurance";
	
	@Autowired
	private WareSparePartsService sparePartsService;
	
	@Autowired
	private WareSparePartsCategoriesDetailsService sparePartsDetailService;
	
	@Autowired
	private WareLaborInformationStaffMapper staffDao;
	
	@Autowired
	private WareLaborAdvanceReceiveMapper advanceReceiveDao;
	
	@Autowired
	private LaborInsuranceStockService stockService;
	
	/**
     * 劳保方案信息分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborInsuranceSchemeOutput> getLaborInsuranceSchemePageList(SearchLaborInsuranceSchemeInput input) {
		// TODO Auto-generated method stub
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andLaborInsuranceStatusEqualTo(IsValidEnum.VALID.getCode());
		//根据方案名称查询
		if(StringUtils.isNotEmpty(input.getLaborInsuranceName())) {
			if (isChineseRequest()) {
				criteria.andLaborInsuranceNameLike("%"+input.getLaborInsuranceName()+"%");
			}
			if(isEnglishRequest()){
				criteria.andLaborInsuranceNameEnLike("%"+input.getLaborInsuranceName()+"%");
			}
		}
		//查询某一天的数据
		if(input.getCreateTime()!=null){
			Calendar c = Calendar.getInstance();  
            c.setTime(input.getCreateTime());  
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date date = c.getTime();
			criteria.andCreateTimeBetween(input.getCreateTime(), date);
		}
		//查询页数
        Integer totalItemCount =(int) wareLaborInsuranceDao.countByExample(example);
        PagedList<LaborInsuranceSchemeOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
		List<WareLaborInsurance> wareLaborInsurances = wareLaborInsuranceDao.selectByExample(example);
		//劳保方案返回数据
		List<LaborInsuranceSchemeOutput> dataList = new ArrayList<>();
		//封装方案列表数据
		for(WareLaborInsurance wareLaborInsurance : wareLaborInsurances) {
			//封装数据
			LaborInsuranceSchemeOutput output = new LaborInsuranceSchemeOutput();
			output.setKey(wareLaborInsurance.getKey());
			output.setKeyLangLang(wareLaborInsurance.getKey());
			output.setLaborInsuranceName(wareLaborInsurance.getLaborInsuranceName());
			output.setLaborInsuranceNameEn(wareLaborInsurance.getLaborInsuranceNameEn());
			output.setRemark(wareLaborInsurance.getRemark());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(wareLaborInsurance.getUpdateTime()!=null){
				output.setUpdateTime(sdf.format(wareLaborInsurance.getUpdateTime()));
			}
			if(wareLaborInsurance.getCreateTime()!=null){
				output.setCreateTime(sdf.format(wareLaborInsurance.getCreateTime()));
			}
			if(wareLaborInsurance.getUpdateUser()!=null){
				//调用接口，根据id获得用户名
				Result<UserInfoOutput> result = authService.getUserInfo(wareLaborInsurance.getUpdateUser());
				if (result != null && result.getData() != null) {
					UserInfoOutput user = result.getData();
					output.setUpdateUser(user.getUserName());
				}
			}
			//方案明细返回数据
			List<LaborInsuranceSchemeDetailOutput> detailList = new ArrayList<>();
			//查出劳保方案明细列表
			WareLaborInsuranceDetailExample wareLaborInsuranceDetailExample = new WareLaborInsuranceDetailExample();
			com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample.Criteria criteria2 = wareLaborInsuranceDetailExample.createCriteria();
			criteria2.andWareLaborInsuranceEqualTo(wareLaborInsurance.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<WareLaborInsuranceDetail> wareLaborInsuranceDetails = wareLaborInsuranceDetailDao.selectByExample(wareLaborInsuranceDetailExample);
		    //封装明细列表数据
			for(WareLaborInsuranceDetail wareLaborInsuranceDetail : wareLaborInsuranceDetails) {
				LaborInsuranceSchemeDetailOutput laborInsuranceSchemeDetailOutput = new LaborInsuranceSchemeDetailOutput();
				laborInsuranceSchemeDetailOutput.setCycleNum(wareLaborInsuranceDetail.getCycleNum());
				laborInsuranceSchemeDetailOutput.setCycleTerm(wareLaborInsuranceDetail.getCycleTerm());
				laborInsuranceSchemeDetailOutput.setFirstNum(wareLaborInsuranceDetail.getFirstNum());
				laborInsuranceSchemeDetailOutput.setFirstTerm(wareLaborInsuranceDetail.getFirstTerm());
				laborInsuranceSchemeDetailOutput.setRemark(wareLaborInsuranceDetail.getRemark());
				laborInsuranceSchemeDetailOutput.setSpareParts(wareLaborInsuranceDetail.getSpareParts());
				laborInsuranceSchemeDetailOutput.setSparePartsLangLang(wareLaborInsuranceDetail.getSpareParts());
				//根据备件key查询出备件名称跟备件号
				WareSparePartsExample wareSparePartsExample = new WareSparePartsExample();
				com.sanlly.warehouse.entity.WareSparePartsExample.Criteria criteria3 = wareSparePartsExample.createCriteria();
				criteria3.andKeyEqualTo(wareLaborInsuranceDetail.getSpareParts()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				List<WareSpareParts> wareSparePartList = wareSparePartsDao.selectByExample(wareSparePartsExample);
				//封装数据
				for(WareSpareParts wareSpareParts : wareSparePartList) {
					laborInsuranceSchemeDetailOutput.setSparePartsName(wareSpareParts.getSparePartsName());
					laborInsuranceSchemeDetailOutput.setSparePartsNameEn(wareSpareParts.getSparePartsNameEn());
					laborInsuranceSchemeDetailOutput.setSparePartsNo(wareSpareParts.getSparePartsNo());
				}
				detailList.add(laborInsuranceSchemeDetailOutput);
			}
			output.setDetailList(detailList);
			dataList.add(output);
		}
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	
	/**
     * 获得全部劳保方案信息
     * @param input
     * @return
	 * @throws ParseException 
     */
	@Override
	public List<LaborInsuranceSchemeOutput> getLaborInsuranceSchemeList(SearchLaborInsuranceSchemeInput input){
		// TODO Auto-generated method stub
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andLaborInsuranceStatusEqualTo(IsValidEnum.VALID.getCode());
		//根据方案名称查询
		if(StringUtils.isNotEmpty(input.getLaborInsuranceName())) {
			if (isChineseRequest()) {
				criteria.andLaborInsuranceNameLike("%"+input.getLaborInsuranceName()+"%");
			}
			if(isEnglishRequest()){
				criteria.andLaborInsuranceNameEnLike("%"+input.getLaborInsuranceName()+"%");
			}
		}
		//查询某一天的数据
		if(input.getCreateTime()!=null){
			Calendar c = Calendar.getInstance();  
            c.setTime(input.getCreateTime());  
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date date = c.getTime();
			criteria.andCreateTimeBetween(input.getCreateTime(), date);
		}
		example.setOrderByClause("create_time desc");
		List<WareLaborInsurance> wareLaborInsurances = wareLaborInsuranceDao.selectByExample(example);
		//劳保方案返回数据
		List<LaborInsuranceSchemeOutput> dataList = new ArrayList<>();
		//封装方案列表数据
		for(WareLaborInsurance wareLaborInsurance : wareLaborInsurances) {
			//封装数据
			LaborInsuranceSchemeOutput output = new LaborInsuranceSchemeOutput();
			output.setKey(wareLaborInsurance.getKey());
			output.setKeyLangLang(wareLaborInsurance.getKey());
			output.setLaborInsuranceName(wareLaborInsurance.getLaborInsuranceName());
			output.setLaborInsuranceNameEn(wareLaborInsurance.getLaborInsuranceNameEn());
			output.setRemark(wareLaborInsurance.getRemark());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(wareLaborInsurance.getUpdateTime()!=null){
				output.setUpdateTime(sdf.format(wareLaborInsurance.getUpdateTime()));
			}
			if(wareLaborInsurance.getCreateTime()!=null){
				output.setCreateTime(sdf.format(wareLaborInsurance.getCreateTime()));
			}
			if(wareLaborInsurance.getUpdateUser()!=null){
				//调用接口，根据id获得用户名
				Result<UserInfoOutput> result = authService.getUserInfo(wareLaborInsurance.getUpdateUser());
				if (result != null && result.getData() != null) {
					UserInfoOutput user = result.getData();
					output.setUpdateUser(user.getUserName());
				}
				
			}
			//方案明细返回数据
			List<LaborInsuranceSchemeDetailOutput> detailList = new ArrayList<>();
			//查出劳保方案明细列表
			WareLaborInsuranceDetailExample wareLaborInsuranceDetailExample = new WareLaborInsuranceDetailExample();
			com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample.Criteria criteria2 = wareLaborInsuranceDetailExample.createCriteria();
			criteria2.andWareLaborInsuranceEqualTo(wareLaborInsurance.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<WareLaborInsuranceDetail> wareLaborInsuranceDetails = wareLaborInsuranceDetailDao.selectByExample(wareLaborInsuranceDetailExample);
		    //封装明细列表数据
			for(WareLaborInsuranceDetail wareLaborInsuranceDetail : wareLaborInsuranceDetails) {
				LaborInsuranceSchemeDetailOutput laborInsuranceSchemeDetailOutput = new LaborInsuranceSchemeDetailOutput();
				laborInsuranceSchemeDetailOutput.setCycleNum(wareLaborInsuranceDetail.getCycleNum());
				laborInsuranceSchemeDetailOutput.setCycleTerm(wareLaborInsuranceDetail.getCycleTerm());
				laborInsuranceSchemeDetailOutput.setFirstNum(wareLaborInsuranceDetail.getFirstNum());
				laborInsuranceSchemeDetailOutput.setFirstTerm(wareLaborInsuranceDetail.getFirstTerm());
				laborInsuranceSchemeDetailOutput.setRemark(wareLaborInsuranceDetail.getRemark());
				laborInsuranceSchemeDetailOutput.setSpareParts(wareLaborInsuranceDetail.getSpareParts());
				laborInsuranceSchemeDetailOutput.setSparePartsLangLang(wareLaborInsuranceDetail.getSpareParts());
				//根据备件key查询出备件名称跟备件号
				WareSparePartsExample wareSparePartsExample = new WareSparePartsExample();
				com.sanlly.warehouse.entity.WareSparePartsExample.Criteria criteria3 = wareSparePartsExample.createCriteria();
				criteria3.andKeyEqualTo(wareLaborInsuranceDetail.getSpareParts()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				List<WareSpareParts> wareSparePartList = wareSparePartsDao.selectByExample(wareSparePartsExample);
				//封装数据
				for(WareSpareParts wareSpareParts : wareSparePartList) {
					laborInsuranceSchemeDetailOutput.setSparePartsName(wareSpareParts.getSparePartsName());
					laborInsuranceSchemeDetailOutput.setSparePartsNameEn(wareSpareParts.getSparePartsNameEn());
					laborInsuranceSchemeDetailOutput.setSparePartsNo(wareSpareParts.getSparePartsNo());
				}
				detailList.add(laborInsuranceSchemeDetailOutput);
			}
			output.setDetailList(detailList);
			dataList.add(output);
		}
		return dataList;
	}
	
	/**
     * 根据key获得劳保方案信息
     * @param input
     * @return
	 *  
     */
	@Override
	public List<LaborInsuranceSchemeDetailOutput> getLaborInsuranceScheme(EditLaborInsuranceSchemeInput input){
		List<LaborInsuranceSchemeDetailOutput> dataList = new ArrayList<>();
		if(StringUtils.isNotEmpty(input.getKey())){
			//查出劳保方案明细列表
			WareLaborInsuranceDetailExample example = new WareLaborInsuranceDetailExample();
			example.createCriteria().andWareLaborInsuranceEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<WareLaborInsuranceDetail> wareLaborInsuranceDetails = wareLaborInsuranceDetailDao.selectByExample(example);
		    //封装明细列表数据
			for(WareLaborInsuranceDetail wareLaborInsuranceDetail : wareLaborInsuranceDetails) {
				LaborInsuranceSchemeDetailOutput laborInsuranceSchemeDetailOutput = new LaborInsuranceSchemeDetailOutput();
				BeanUtils.copyProperties(wareLaborInsuranceDetail, laborInsuranceSchemeDetailOutput);
				laborInsuranceSchemeDetailOutput.setWarehouseInsuranceLangLang(wareLaborInsuranceDetail.getWareLaborInsurance());
				laborInsuranceSchemeDetailOutput.setSparePartsLangLang(wareLaborInsuranceDetail.getSpareParts());
				//根据备件key查询出备件名称跟备件号
				WareSparePartsExample wareSparePartsExample = new WareSparePartsExample();
				wareSparePartsExample.createCriteria().andKeyEqualTo(wareLaborInsuranceDetail.getSpareParts()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				List<WareSpareParts> wareSparePartList = wareSparePartsDao.selectByExample(wareSparePartsExample);
				//封装数据
				for(WareSpareParts wareSpareParts : wareSparePartList) {
					laborInsuranceSchemeDetailOutput.setSparePartsName(wareSpareParts.getSparePartsName());
					laborInsuranceSchemeDetailOutput.setSparePartsNameEn(wareSpareParts.getSparePartsNameEn());
					laborInsuranceSchemeDetailOutput.setSparePartsNo(wareSpareParts.getSparePartsNo());
				}
				dataList.add(laborInsuranceSchemeDetailOutput);
			}
		}
		
		return dataList;
		
	}

	/**
     * 添加劳保方案信息
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addLaborInsuranceScheme(AddLaborInsuranceSchemeInput input) {
		// TODO Auto-generated method stub
		//判断输入的方案名称是否已存在
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andLaborInsuranceNameEqualTo(input.getLaborInsuranceName());
		List<WareLaborInsurance> wList = wareLaborInsuranceDao.selectByExample(example);
		if(wList!=null&&wList.size()>0){
			//若存在，则抛出异常
			throw new RuntimeException("isExist");
		}
		Result<String> result = productionService.getKey(laborInsuranceSchemeTable);
		if (result==null||StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareLaborInsurance wareLaborInsurance = new WareLaborInsurance();
		BeanUtils.copyProperties(input, wareLaborInsurance);
		wareLaborInsurance.setLaborInsuranceNo(result.getData());
		wareLaborInsurance.setCreateTime(new Date());
		wareLaborInsurance.setKey(result.getData());
		wareLaborInsurance.setCreateUser(getCurrentUserId());
		wareLaborInsurance.setIsDel(PlatformConstants.ISDEL_NO);
		wareLaborInsurance.setLaborInsuranceStatus(IsValidEnum.VALID.getCode());
		wareLaborInsuranceDao.insertSelective(wareLaborInsurance);
		//明细列表
		if(input.getDetailList()!=null&&input.getDetailList().size()>0) {
			for(LaborInsuranceSchemeDetailOutput output : input.getDetailList()) {
				WareLaborInsuranceDetail wareLaborInsuranceDetail = new WareLaborInsuranceDetail();
				BeanUtils.copyProperties(output, wareLaborInsuranceDetail);
				wareLaborInsuranceDetail.setWareLaborInsurance(result.getData());
				wareLaborInsuranceDetail.setCreateTime(new Date());
				wareLaborInsuranceDetail.setCreateUser(getCurrentUserId());
				wareLaborInsuranceDetail.setIsDel(PlatformConstants.ISDEL_NO);
				wareLaborInsuranceDetailDao.insertSelective(wareLaborInsuranceDetail);
			}
		}
		
	}

	/**
     * 修改劳保方案信息
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void editLaborInsuranceScheme(EditLaborInsuranceSchemeInput input) {
		// TODO Auto-generated method stub
		//判断输入的方案名称是否进行修改操作
		WareLaborInsuranceExample wlExample = new WareLaborInsuranceExample();
		wlExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(input.getKey());
		List<WareLaborInsurance> wList = wareLaborInsuranceDao.selectByExample(wlExample);
		if(wList!=null&&wList.size()>0){
			//判断方案名称是否发生变化
			if(!input.getLaborInsuranceName().equals(wList.get(0).getLaborInsuranceName())){
				//判断输入的方案名称是否已存在
				WareLaborInsuranceExample wExample = new WareLaborInsuranceExample();
				wExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andLaborInsuranceNameEqualTo(input.getLaborInsuranceName());
				List<WareLaborInsurance> list = wareLaborInsuranceDao.selectByExample(wExample);
				if(list!=null&&list.size()>0){
					//若存在，则抛出异常
					throw new RuntimeException("isExist");
				}
			}
		}
		WareLaborInsurance wareLaborInsurance = new WareLaborInsurance();
		BeanUtils.copyProperties(input, wareLaborInsurance);
		wareLaborInsurance.setUpdateTime(new Date());
		wareLaborInsurance.setUpdateUser(getCurrentUserId());
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeyEqualTo(input.getKey());
		
		WareLaborInsuranceDetailExample wareLaborInsuranceDetailExample = new WareLaborInsuranceDetailExample();
		com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample.Criteria criteria2 = wareLaborInsuranceDetailExample.createCriteria();
		criteria2.andWareLaborInsuranceEqualTo(input.getKey());
		List<WareLaborInsuranceDetail> wareLaborInsuranceDetails = wareLaborInsuranceDetailDao.selectByExample(wareLaborInsuranceDetailExample);
		//删除掉之前的明细信息
		if(wareLaborInsuranceDetails!=null&&wareLaborInsuranceDetails.size()>0) {
			wareLaborInsuranceDetailDao.deleteByExample(wareLaborInsuranceDetailExample);
		}
		//添加明细
		for(LaborInsuranceSchemeDetailOutput output : input.getDetailList()) {
			WareLaborInsuranceDetail wareLaborInsuranceDetail = new WareLaborInsuranceDetail();
			BeanUtils.copyProperties(output, wareLaborInsuranceDetail);
			wareLaborInsuranceDetail.setWareLaborInsurance(input.getKey());
			wareLaborInsuranceDetail.setCreateUser(getCurrentUserId());
			wareLaborInsuranceDetail.setCreateTime(new Date());
			wareLaborInsuranceDetail.setUpdateTime(new Date());
			wareLaborInsuranceDetail.setUpdateUser(getCurrentUserId());
			wareLaborInsuranceDetail.setIsDel(PlatformConstants.ISDEL_NO);
			wareLaborInsuranceDetailDao.insertSelective(wareLaborInsuranceDetail);
		}
		wareLaborInsuranceDao.updateByExampleSelective(wareLaborInsurance, example);
	}

	/**
     * 根据key批量删除劳保方案信息
     * @param keys
     * @return
     */
	@Transactional
	@Override
	public void delLaborInsuaranceScheme(String[] keys) {
		// TODO Auto-generated method stub
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeyIn(Arrays.asList(keys));
		WareLaborInsurance wareLaborInsurance = new WareLaborInsurance();
		wareLaborInsurance.setIsDel(PlatformConstants.ISDEL_YES);
		//将方案状态设为无效
		wareLaborInsurance.setLaborInsuranceStatus(IsValidEnum.INVALID.getCode());
		wareLaborInsuranceDao.updateByExampleSelective(wareLaborInsurance, example);
		//删除对应的方案明细
		WareLaborInsuranceDetailExample wareLaborInsuranceDetailExample = new WareLaborInsuranceDetailExample();
		com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample.Criteria criteria2 = wareLaborInsuranceDetailExample.createCriteria();
		WareLaborInsuranceDetail wareLaborInsuranceDetail = new WareLaborInsuranceDetail();
		wareLaborInsuranceDetail.setIsDel(PlatformConstants.ISDEL_YES);
		criteria2.andWareLaborInsuranceIn(Arrays.asList(keys));
		wareLaborInsuranceDetailDao.updateByExampleSelective(wareLaborInsuranceDetail, wareLaborInsuranceDetailExample);
	}
	
	/**
     * 根据key批量将劳保方案设为无效
     * @param keys
     * @return
     */
	@Transactional
	@Override
	public void invalidLaborInsuaranceScheme(String[] keys) {
		// TODO Auto-generated method stub
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeyIn(Arrays.asList(keys));
				
		WareLaborInsurance wareLaborInsurance = new WareLaborInsurance();
		//将方案状态设为无效
		wareLaborInsurance.setLaborInsuranceStatus(IsValidEnum.INVALID.getCode());
		wareLaborInsurance.setIsDel(PlatformConstants.ISDEL_YES);
		wareLaborInsurance.setUpdateTime(new Date());
		wareLaborInsurance.setUpdateUser(getCurrentUserId());
		wareLaborInsuranceDao.updateByExampleSelective(wareLaborInsurance, example);
		//删除对应的方案明细
		WareLaborInsuranceDetailExample wareLaborInsuranceDetailExample = new WareLaborInsuranceDetailExample();
		com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample.Criteria criteria2 = wareLaborInsuranceDetailExample.createCriteria();
		WareLaborInsuranceDetail wareLaborInsuranceDetail = new WareLaborInsuranceDetail();
		wareLaborInsuranceDetail.setIsDel(PlatformConstants.ISDEL_YES);
		criteria2.andWareLaborInsuranceIn(Arrays.asList(keys));
		wareLaborInsuranceDetailDao.updateByExampleSelective(wareLaborInsuranceDetail, wareLaborInsuranceDetailExample);
		
		List<WareLaborInsurance> sList = wareLaborInsuranceDao.selectByExample(example);
		//查询方案号
		List<String> schemeNos =  new ArrayList<>();
		for(WareLaborInsurance sInsurance : sList){
			schemeNos.add(sInsurance.getLaborInsuranceNo());
		}
		//将员工对应方案置为空
		WareLaborInformationStaffExample staffExample = new WareLaborInformationStaffExample();
		staffExample.createCriteria().andLabaorInsuranceNoIn(schemeNos);
		WareLaborInformationStaff staff = new WareLaborInformationStaff();
		staff.setLabaorInsuranceNo("");
		staffDao.updateByExampleSelective(staff, staffExample);
		
	}
	
	/**
     * 根据方案编号查询方案信息
     * @param labaorInsuranceNo
     * @return
     */
	@Override
	public LaborInsuranceSchemeOutput getInfoByNo(String labaorInsuranceNo) {
		// TODO Auto-generated method stub
		WareLaborInsuranceExample example = new WareLaborInsuranceExample();
		//方案状态为有效
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andLaborInsuranceNoEqualTo(labaorInsuranceNo).andLaborInsuranceStatusEqualTo(IsValidEnum.VALID.getCode());
		List<WareLaborInsurance> list = wareLaborInsuranceDao.selectByExample(example);
		LaborInsuranceSchemeOutput output = new LaborInsuranceSchemeOutput();
		if(list!=null&&list.size()>0){
			WareLaborInsurance laborInsurance = list.get(0);
			BeanUtils.copyProperties(laborInsurance, output);
			WareLaborInsuranceDetailExample detailExample = new WareLaborInsuranceDetailExample();
			detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareLaborInsuranceEqualTo(laborInsurance.getKey());
			List<WareLaborInsuranceDetail> details = wareLaborInsuranceDetailDao.selectByExample(detailExample);
			List<LaborInsuranceSchemeDetailOutput> detailList = new ArrayList<>();
			if(details!=null&&details.size()>0){
				for(WareLaborInsuranceDetail detail : details){
					LaborInsuranceSchemeDetailOutput detailOutput = new LaborInsuranceSchemeDetailOutput();
					BeanUtils.copyProperties(detail, detailOutput);
					detailList.add(detailOutput);
				}
			}
			output.setDetailList(detailList);
		}
		return output;
	}
	
	/**
     * 获得员工劳保方案信息
     * @param input
     * @return
     */
	@Override
	public List<userSchemeOutput> getUserPageList(SearchUserInput input) {
		// TODO Auto-generated method stub
		//返回数据
		List<userSchemeOutput> dataList = new ArrayList<>();
		//调用权限接口，获得用户数据
		Result<PagedList<UserInfoOutput>> result = authService.userPagedList(input.getUserName(), input.getCompany(), 1, 99999);
		if(result != null && result.getData() != null&&result.getData().getDataList()!=null){
			List<UserInfoOutput> userInfos = result.getData().getDataList();
			List<UserInfoOutput> userInfos2 = new ArrayList<UserInfoOutput>();
			for(UserInfoOutput user : userInfos) {
				WareLaborInformationStaffExample example = new WareLaborInformationStaffExample();
				example.createCriteria().andUserEqualTo(user.getUserId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				long num = wareLaborInformationStaffDao.countByExample(example);
				if(num>0) {
					example.clear();
					example.createCriteria().andIsLeaveEqualTo(CommonEnum.NO.getCode()).andUserEqualTo(user.getUserId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<WareLaborInformationStaff> wStaffs = wareLaborInformationStaffDao.selectByExample(example);
					if(wStaffs!=null&&wStaffs.size()>0) {
						userInfos2.add(user);
					}
				}else {
					userInfos2.add(user);
				}
			}
			for(UserInfoOutput user : userInfos2){
				userSchemeOutput output = new userSchemeOutput();
				BeanUtils.copyProperties(user, output);
				if(user.getCompanyId()!=null){
					Result<CompanyOutput> results = productionService.query(user.getCompanyId());
					if(results != null && results.getData() != null){
						CompanyOutput companyOutput = results.getData();
						output.setCompany(companyOutput.getKey());
						output.setCompanyNameLang(companyOutput.getKey());
					}
				}
				WareLaborInformationStaffExample example = new WareLaborInformationStaffExample();
				example.createCriteria().andUserEqualTo(user.getUserId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				List<WareLaborInformationStaff> wStaffs = wareLaborInformationStaffDao.selectByExample(example);
				if(wStaffs!=null&&wStaffs.size()>0){
					if(StringUtils.isNotEmpty(wStaffs.get(0).getLabaorInsuranceNo())){
						WareLaborInsuranceExample wExample = new WareLaborInsuranceExample();
						wExample.createCriteria().andLaborInsuranceNoEqualTo(wStaffs.get(0).getLabaorInsuranceNo());
						List<WareLaborInsurance> wInsurances = wareLaborInsuranceDao.selectByExample(wExample);
						if(wInsurances!=null&&wInsurances.size()>0){
							output.setLaborScheme(wInsurances.get(0).getKey());
							output.setLaborSchemeNameLang(wInsurances.get(0).getKey());
							output.setLaborSchemeNames(wInsurances.get(0).getLaborInsuranceName());
						}
					    
					}
				}
				dataList.add(output);
			}
		}
		return dataList;
	}
	
	/**
	 * 获取用户劳保信息
	 * @param userId
	 * @return
	 */
	@Override
	public userSchemeOutput userDetail(Integer userId){
		userSchemeOutput uOutput = new userSchemeOutput();
		
		//获取用户信息
		Result<UserInfoOutput> result = authService.userDetail(userId);
		if(result != null && result.getData() != null){
			UserInfoOutput output = result.getData();
			BeanUtils.copyProperties(output, uOutput);
			if(output.getCompanyId()!=null){
				Result<CompanyOutput> results = productionService.query(output.getCompanyId());
				if(results != null && results.getData() != null){
					CompanyOutput companyOutput = results.getData();
					uOutput.setCompany(companyOutput.getKey());
					uOutput.setCompanyNameLang(companyOutput.getKey());
				}
			}
		}
		//获取员工劳保信息
		WareLaborInformationStaffExample example = new WareLaborInformationStaffExample();
		example.createCriteria().andUserEqualTo(userId).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareLaborInformationStaff> wStaffs = wareLaborInformationStaffDao.selectByExample(example);
		if(wStaffs!=null&&wStaffs.size()>0){
			LaborStaffInput input = new LaborStaffInput();
			BeanUtils.copyProperties(wStaffs.get(0),input);
			uOutput.setLaborInfo(input);
			if(StringUtils.isNotEmpty(wStaffs.get(0).getLabaorInsuranceNo())){
				WareLaborInsuranceExample wExample = new WareLaborInsuranceExample();
				wExample.createCriteria().andLaborInsuranceNoEqualTo(wStaffs.get(0).getLabaorInsuranceNo());
				List<WareLaborInsurance> wInsurances = wareLaborInsuranceDao.selectByExample(wExample);
				if(wInsurances!=null&&wInsurances.size()>0){
					uOutput.setLaborScheme(wInsurances.get(0).getKey());
					uOutput.setLaborSchemeNameLang(wInsurances.get(0).getKey());
					uOutput.setLaborSchemeNames(wInsurances.get(0).getLaborInsuranceName());
				}
			}
		}
		return uOutput;
	}
	
	/**
	 * 根据用户id获取用户劳保详细信息
	 * @param userId
	 * @return
	 */
	@Override
	public userSchemeOutput userLaborDetail(Integer userId){
		userSchemeOutput output = new userSchemeOutput();
		WareLaborInformationStaffExample example = new WareLaborInformationStaffExample();
		example.createCriteria().andUserEqualTo(userId).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareLaborInformationStaff> wStaffs = wareLaborInformationStaffDao.selectByExample(example);
		if(wStaffs!=null&&wStaffs.size()>0){
			LaborStaffInput input = new LaborStaffInput();
			BeanUtils.copyProperties(wStaffs.get(0),input);
			output.setLaborInfo(input);
			if(StringUtils.isNotEmpty(wStaffs.get(0).getLabaorInsuranceNo())){
				WareLaborInsuranceExample wExample = new WareLaborInsuranceExample();
				wExample.createCriteria().andLaborInsuranceNoEqualTo(wStaffs.get(0).getLabaorInsuranceNo());
				List<WareLaborInsurance> wInsurances = wareLaborInsuranceDao.selectByExample(wExample);
				if(wInsurances!=null&&wInsurances.size()>0){
					output.setLaborScheme(wInsurances.get(0).getKey());
					output.setLaborSchemeNameLang(wInsurances.get(0).getKey());
					output.setLaborSchemeNames(wInsurances.get(0).getLaborInsuranceName());
				}
			}
		}
		return output;
	}

	/**
     * 修改员工劳保方案信息
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void editStaffLabor(userSchemeOutput input) {
		// TODO Auto-generated method stub
	    //判断是否离职
		if(StringUtils.isNotEmpty(input.getLaborInfo().getIsLeave())&&CommonEnum.YES.getCode().equals(input.getLaborInfo().getIsLeave())){
			//删除该员工自动生成的劳保福利信息
			WareLaborReceiveDetailExample detailExample = new WareLaborReceiveDetailExample();
			detailExample.createCriteria().andUserEqualTo(input.getUserId()).andIsLaborApplyEqualTo(CommonEnum.YES.getCode()).andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareLaborReceiveIsNull();
		    wareLaborReceiveDetailDao.deleteByExample(detailExample);
		}
		//封装数据
		WareLaborInformationStaff wStaff = new WareLaborInformationStaff();
		BeanUtils.copyProperties(input.getLaborInfo(), wStaff);
		wStaff.setUser(input.getUserId());
		wStaff.setCompany(input.getCompany());
		wStaff.setIsDel(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getLaborScheme())){
			WareLaborInsuranceExample example = new WareLaborInsuranceExample();
			example.createCriteria().andKeyEqualTo(input.getLaborScheme());
			List<WareLaborInsurance> wList = wareLaborInsuranceDao.selectByExample(example);
			wStaff.setLabaorInsuranceNo(wList.get(0).getLaborInsuranceNo());
		}else{
			wStaff.setLabaorInsuranceNo("");
		}
		WareLaborInformationStaffExample wExample = new WareLaborInformationStaffExample();
		wExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserEqualTo(input.getUserId());
		List<WareLaborInformationStaff> wStaffs = wareLaborInformationStaffDao.selectByExample(wExample);
		//判断之前是否设置员工劳保信息
		if(wStaffs!=null&&wStaffs.size()>0){
			//若设置过则修改
			wStaff.setUpdateTime(new Date());
			wStaff.setUpdateUser(getCurrentUserId());
			wareLaborInformationStaffDao.updateByExampleSelective(wStaff, wExample);
			//判断前台传递方案名称是否为空,员工是否离职以及是否开启劳保福利
			if(StringUtils.isNotEmpty(input.getLaborScheme())&& CommonEnum.YES.getCode().equals(input.getLaborInfo().getIsEnabled())&& CommonEnum.NO.getCode().equals(input.getLaborInfo().getIsLeave())){
				//劳保方案是否发生变化
				WareLaborInformationStaff staff = wStaffs.get(0);
				//根据方案号获得方案信息
				//若已经设置过方案
				if(StringUtils.isNotEmpty(staff.getLabaorInsuranceNo())){
					LaborInsuranceSchemeOutput scheme = getInfoByNo(staff.getLabaorInsuranceNo());
					//判断方案是否发生变化
					//若发生变化则生成申请单
					if(!scheme.getKey().equals(input.getLaborScheme())){
						addLaborReceiveByTerm(input.getUserId(),input.getLaborScheme());
					}
				}else{
					addLaborReceiveByTerm(input.getUserId(),input.getLaborScheme());
				}
			}
		}else{
			wStaff.setCreateTime(new Date());
			wStaff.setCreateUser(getCurrentUserId());
			wareLaborInformationStaffDao.insertSelective(wStaff);
			if(StringUtils.isNotEmpty(input.getLaborScheme())&& CommonEnum.YES.getCode().equals(input.getLaborInfo().getIsEnabled())&& CommonEnum.NO.getCode().equals(input.getLaborInfo().getIsLeave())){
				//生成劳保申请明细单				
				addLaborReceiveByTerm(input.getUserId(),input.getLaborScheme());
			}
			
			
		}
	}
	
	/**
	 * 生成员工劳保申请单
	 * @return
	 */
	@Transactional
	@Override
	public void addLaborReceiveByTerm(Integer userId,String laborScheme) {
		// TODO Auto-generated method stub
		WareLaborInsuranceDetailExample detailExample = new WareLaborInsuranceDetailExample();
		detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareLaborInsuranceEqualTo(laborScheme);
		List<WareLaborInsuranceDetail> wInsuranceDetails = wareLaborInsuranceDetailDao.selectByExample(detailExample);
		if(wInsuranceDetails!=null&&wInsuranceDetails.size()>0){
			for(WareLaborInsuranceDetail detail : wInsuranceDetails){
				WareLaborReceiveDetail wareLaborReceiveDetail = new WareLaborReceiveDetail();
				wareLaborReceiveDetail.setSpareParts(detail.getSpareParts());
				wareLaborReceiveDetail.setUser(userId);
				wareLaborReceiveDetail.setCreateTime(new Date());
				wareLaborReceiveDetail.setLastAssignDate(new Date());
				Calendar c = Calendar.getInstance();
				c.setTime(new Date());
				if(TermEnum.IMMEDIATE.getCode().equals(detail.getFirstTerm())){
					c.add(Calendar.HOUR, 4);
				}else if(TermEnum.HALFMOON.getCode().equals(detail.getFirstTerm())){
					c.add(Calendar.DATE, detail.getFirstTerm());
				}else{
					c.add(Calendar.MONTH, detail.getFirstTerm());
				}
				wareLaborReceiveDetail.setNextAssignDate(c.getTime());
				wareLaborReceiveDetail.setCreateUser(getCurrentUserId());
				wareLaborReceiveDetail.setIsDel(PlatformConstants.ISDEL_NO);
				wareLaborReceiveDetail.setApplicantNum(detail.getFirstNum());
				wareLaborReceiveDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
				wareLaborReceiveDetail.setIsLaborApply(CommonEnum.YES.getCode());
				wareLaborReceiveDetail.setModel(getModel(userId,detail.getSpareParts()));
				wareLaborReceiveDetailDao.insertSelective(wareLaborReceiveDetail);
				//生成劳保预领单
				WareLaborAdvanceReceive advanceReceive = new WareLaborAdvanceReceive();
				advanceReceive.setUser(userId);
				advanceReceive.setSpareParts(detail.getSpareParts());
				advanceReceive.setIsReceive(CommonEnum.NO.getCode());
				advanceReceive.setModel(getModel(userId,detail.getSpareParts()));
				advanceReceive.setReceiveNum(detail.getFirstNum());
				advanceReceive.setCreateTime(new Date());
				advanceReceive.setCreateUser(getCurrentUserId());
				advanceReceive.setIsDel(PlatformConstants.ISDEL_NO);
				advanceReceiveDao.insertSelective(advanceReceive);
			}
			
		}
	}

	@Override
	public Map<String, String> getModelAndNum(Integer userId, String spareParts){
		String model = getModel(userId, spareParts);
		String totalNum = stockService.getStockNumByKAndM(spareParts, model).toString();
		Map<String, String> map = new HashMap<String, String>();
		map.put("model", model);
		map.put("totalNum", totalNum);
		return map;
		
	}
	/**
	 * 根据员工id和备件查询该员工劳保备件型号
	 * @param userId
	 * @param spareParts
	 * @return
	 */
	@Override
	public String getModel(Integer userId, String spareParts) {
		// TODO Auto-generated method stub
		String model = WarehouseConstants.COMMON_MODEL;
		WareLaborInformationStaffExample staffExample = new WareLaborInformationStaffExample();
		staffExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserEqualTo(userId);
		List<WareLaborInformationStaff> staffs = staffDao.selectByExample(staffExample);
		if(staffs!=null&&staffs.size()>0){
			//获得员工劳保信息
			WareLaborInformationStaff staff = staffs.get(0);
			//获得备件信息
			SparePartsOutput sBriefOutput = sparePartsService.getSpareParts(new EditSparePartsInput(spareParts));
			//获取备件型号列表
			if(sBriefOutput.getModel()!=null&&sBriefOutput.getModel().length()>0){
				String[] modelList = sBriefOutput.getModel().split(",");
				SparePartsCategoriesDetailsOutput sdetailOutput = sparePartsDetailService.getSparepartsCategoriesDetails(new EditSparePartsCategoriesDetailsInput(sBriefOutput.getSparePartsCategoriesDetails()));
				//判断传递过来的备件类别，查找对应的型号，若为空则默认选中第一个
				if(WarehouseConstants.SUMMER_WEAR.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(StringUtils.isNotEmpty(staff.getSummerWear())){
						model = staff.getSummerWear();
					}else{
						model = modelList[0];
					}
					
				}else if(WarehouseConstants.SPRING_AUTUMN_WEAR.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(StringUtils.isNotEmpty(staff.getSpringAutumnWear())){
						model = staff.getSpringAutumnWear();
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.COTTON_PADDED_CLOTHES.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(StringUtils.isNotEmpty(staff.getCottonPaddedClothes())){
						model = staff.getCottonPaddedClothes();
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.STEEL_HEADED_SHOES_SHORT.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(staff.getSteelHeadedShoesShort()!=null&&staff.getSteelHeadedShoesShort()!=0){
						model = staff.getSteelHeadedShoesShort()+"";
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.STEEL_HEADED_SHOES_HIGH.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(staff.getSteelHeadedShoesHigh()!=null&&staff.getSteelHeadedShoesHigh()!=0){
						model = staff.getSteelHeadedShoesHigh()+"";
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.INSULATING_SHOES.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(staff.getInsulatingShoes()!=null&&staff.getInsulatingShoes()!=0){
						model = staff.getInsulatingShoes()+"";
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.COTTON_PADDED_SHOES.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(staff.getCottonPaddedShoes()!=null&&staff.getCottonPaddedShoes()!=0){
						model = staff.getCottonPaddedShoes()+"";
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.RAIN_COAT.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(StringUtils.isNotEmpty(staff.getRainCoat())){
						model = staff.getRainCoat();
					}else{
						model = modelList[0];
					}
				}else if(WarehouseConstants.RAIN_SHOES.equals(sdetailOutput.getSparepartsCategoriesDetailsName())){
					if(staff.getRainShoes()!=null&&staff.getRainShoes()!=0){
						model = staff.getRainShoes()+"";
					}else{
						model = modelList[0];
					}
				}else {
					model = modelList[0];
				}
			}
		}
		
		return model;
	}

	/**
	 * 员工下期领用信息
	 * @param userId
	 * 
	 * @return
	 */
	@Override
	public List<PersonalNextReceiveOutput> getNextReceiveInfo(Integer userId) {
		List<PersonalNextReceiveOutput> dataList = new ArrayList<>();
		WareLaborInformationStaffExample wExample = new WareLaborInformationStaffExample();
		wExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserEqualTo(userId).andLabaorInsuranceNoIsNotNull().andIsEnabledEqualTo(CommonEnum.YES.getCode()).andIsLeaveEqualTo(CommonEnum.NO.getCode());
		List<WareLaborInformationStaff> wStaffs = wareLaborInformationStaffDao.selectByExample(wExample);
		//判断之前是否设置员工劳保信息
		if(wStaffs!=null&&wStaffs.size()>0){
			WareLaborInformationStaff staff = wStaffs.get(0);
			//是否有劳保方案
			if(StringUtils.isNotEmpty(staff.getLabaorInsuranceNo())){
				LaborInsuranceSchemeOutput schemeOutput = getInfoByNo(staff.getLabaorInsuranceNo());
				for(LaborInsuranceSchemeDetailOutput detailOutput : schemeOutput.getDetailList()){
					PersonalNextReceiveOutput output = new PersonalNextReceiveOutput();
					output.setSpareParts(detailOutput.getSpareParts());
					output.setSparePartsNameLang(detailOutput.getSpareParts());
					output.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(detailOutput.getSpareParts())).getSparePartsNo());
					output.setModel(getModel(userId,detailOutput.getSpareParts()));
					//查询领用信息
					WareLaborReceiveDetailExample example = new WareLaborReceiveDetailExample();
					example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUserEqualTo(userId).andIsLaborApplyEqualTo(CommonEnum.YES.getCode()).andSparePartsEqualTo(detailOutput.getSpareParts());
				    example.setOrderByClause("create_time desc");
				    int count = (int) wareLaborReceiveDetailDao.countByExample(example);
				    List<WareLaborReceiveDetail> receiveDetails = wareLaborReceiveDetailDao.selectByExample(example);
				    if(receiveDetails!=null&&receiveDetails.size()>0){
				    	WareLaborReceiveDetail receiveDetail = receiveDetails.get(0);
				    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					    Calendar date = Calendar.getInstance();
						date.setTime(receiveDetail.getCreateTime());
						//判断周期
					    if(count==1){
					    	if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getFirstTerm())){
					    		date.add(Calendar.HOUR,4);
					    	}else if(TermEnum.HALFMOON.getCode().equals(detailOutput.getFirstTerm())){
					    		date.add(Calendar.DATE,15);
					    	}else{
					    		date.add(Calendar.MONTH,detailOutput.getFirstTerm());
					    	}
					    	output.setAssignNum(detailOutput.getFirstNum());
					    }else if(count>1){
					    	if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getCycleTerm())){
					    		date.add(Calendar.HOUR,4);
					    	}else if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
					    		date.add(Calendar.DATE,15);
					    	}else{
					    		date.add(Calendar.MONTH,detailOutput.getCycleTerm());
					    	}
			    	    	date.add(Calendar.MONTH,detailOutput.getCycleTerm());
			    	    	output.setAssignNum(detailOutput.getCycleNum());
					    }
					    output.setAssignDate(sdf.format(date.getTime()));
				    }
				    dataList.add(output);
				}
			}
			
		}
		return dataList;
		
	}


	@Override
	public DemandOutput getDemandList(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		DemandOutput demandOutput = new DemandOutput();
        if(endDate!=null){
        List<DemandEstimationOutput> dataList = new ArrayList<>();
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
   	     //获得当前时间
   	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   	     SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
   	     Calendar rightNow2 = Calendar.getInstance();
   	     try {
   			rightNow2.setTime(sdf.parse(sdf.format(endDate)));
   		 } catch (ParseException e1) {
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		 }
   	     rightNow2.add(Calendar.DATE, 1);
   		 endDate=rightNow2.getTime();
   	     for(WareLaborInformationStaff staff :staffs){
   	    	 //根据方案号查询方案明细
   	    	 if(StringUtils.isNotEmpty(staff.getLabaorInsuranceNo())){
   	    	   LaborInsuranceSchemeOutput output = getInfoByNo(staff.getLabaorInsuranceNo());
   	    	   for(LaborInsuranceSchemeDetailOutput detailOutput : output.getDetailList()){
   	    		 //查询之前的自动生成的劳保申请明细
   	    		 WareLaborReceiveDetailExample receiveExample = new WareLaborReceiveDetailExample();
   	    		 receiveExample.createCriteria().andSparePartsEqualTo(detailOutput.getSpareParts()).andUserEqualTo(staff.getUser()).andIsLaborApplyEqualTo(CommonEnum.YES.getCode());
   	    		 receiveExample.setOrderByClause("create_time desc");
   	    		 List<WareLaborReceiveDetail> receiveDetails = wareLaborReceiveDetailDao.selectByExample(receiveExample);
   	    		 int count = (int)wareLaborReceiveDetailDao.countByExample(receiveExample);
                   if(receiveDetails!=null&&receiveDetails.size()>0){
                  	 SparePartsOutput sparePartsOutput = sparePartsService.getSpareParts(new EditSparePartsInput(detailOutput.getSpareParts()));
                  	 WareLaborReceiveDetail receiveDetail = receiveDetails.get(0);
         	    		 Calendar rightNow = Calendar.getInstance();
         	    		 if(receiveDetail.getCreateTime()!=null){
         	    			 try {
         	    					rightNow.setTime(sdf.parse(sdf.format(receiveDetail.getCreateTime())));
         	    				 } catch (ParseException e) {
         	    					// TODO Auto-generated catch block
         	    					e.printStackTrace();
         	    				 }
         	    	    		//若为第二次添加则取首次分配期限
         	    	    		if(count==1){
         	    	    			if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getFirstTerm())){
         	    	    				rightNow.add(Calendar.HOUR,4);
         	    	    				if(rightNow.getTimeInMillis()>=startDate.getTime()&&rightNow.getTimeInMillis()<=endDate.getTime()){
         	    	    					DemandEstimationOutput estimationOutput = new DemandEstimationOutput();
         	    	    					estimationOutput.setSpareParts(detailOutput.getSpareParts());
         	    	    					estimationOutput.setSparePartsNo(sparePartsOutput.getSparePartsNo());
         	    	    					estimationOutput.setSparePartsLangLang(detailOutput.getSpareParts());
         	    	    					estimationOutput.setStaffName(getUserNameByUserId(staff.getUser()));
             	    	    				estimationOutput.setModel(getModel(staff.getUser(), detailOutput.getSpareParts()));
             	    	    				//部门待完善
             	    	    				//estimationOutput.setDepartment(department);
             	    	    				estimationOutput.setNum(detailOutput.getCycleNum());
             	    	    				estimationOutput.setPrice(sparePartsOutput.getPurchasingReferencePrice());
             	    	    				estimationOutput.setTotalAmount(estimationOutput.getPrice().multiply(new BigDecimal(estimationOutput.getNum())));
             	    	    			    estimationOutput.setDate(sdf2.format(rightNow.getTime()));
             	    	    			    dataList.add(estimationOutput);
         	    	    				}
         	    	    			}else{
         	    	    				//若周期为半个月
         	    	    				if(TermEnum.HALFMOON.getCode().equals(detailOutput.getFirstTerm())){
         	    	    					rightNow.add(Calendar.DATE,15);
         	    	    				}else{
         	    	    					rightNow.add(Calendar.MONTH,detailOutput.getFirstTerm());
         	    	    				}
         	    	    				while(rightNow.getTimeInMillis()>=startDate.getTime()&&rightNow.getTimeInMillis()<=endDate.getTime()){
         	    	    					DemandEstimationOutput estimationOutput = new DemandEstimationOutput();
         	    	    					estimationOutput.setSpareParts(detailOutput.getSpareParts());
         	    	    					estimationOutput.setSparePartsNo(sparePartsOutput.getSparePartsNo());
         	    	    					estimationOutput.setSparePartsLangLang(detailOutput.getSpareParts());
             	    	    				estimationOutput.setStaffName(getUserNameByUserId(staff.getUser()));
             	    	    				estimationOutput.setModel(getModel(staff.getUser(), detailOutput.getSpareParts()));
             	    	    				//部门待完善
             	    	    				//estimationOutput.setDepartment(department);
             	    	    				estimationOutput.setNum(detailOutput.getCycleNum());
             	    	    				estimationOutput.setPrice(sparePartsOutput.getPurchasingReferencePrice());
             	    	    				estimationOutput.setTotalAmount(estimationOutput.getPrice().multiply(new BigDecimal(estimationOutput.getNum())));
             	    	    			    estimationOutput.setDate(sdf2.format(rightNow.getTime()));
             	    	    			    dataList.add(estimationOutput);
             	    	    			    if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
           	    	    					    rightNow.add(Calendar.DATE,15);
           	    	    				    }else{
           	    	    					    rightNow.add(Calendar.MONTH,detailOutput.getCycleTerm());
           	    	    				    }
         	    	    				}
         	    	    			}
         	    	    		//若为两次之上添加则取周期分配期限
         	    	    	    }else if(count>1){
         	    	    	    	//比较一段时间后的值与当前时间的毫秒值，若超过则生成申请单明细
         	    	    	    	if(TermEnum.IMMEDIATE.getCode().equals(detailOutput.getCycleTerm())){
         	    	    				rightNow.add(Calendar.HOUR,4);
         	    	    				if(rightNow.getTimeInMillis()>=startDate.getTime()&&rightNow.getTimeInMillis()<=endDate.getTime()){
         	    	    					DemandEstimationOutput estimationOutput = new DemandEstimationOutput();
         	    	    					estimationOutput.setSpareParts(detailOutput.getSpareParts());
         	    	    					estimationOutput.setSparePartsNo(sparePartsOutput.getSparePartsNo());
         	    	    					estimationOutput.setSparePartsLangLang(detailOutput.getSpareParts());           	    	    				estimationOutput.setStaffName(getUserNameByUserId(staff.getUser()));
             	    	    				estimationOutput.setModel(getModel(staff.getUser(), detailOutput.getSpareParts()));
             	    	    				//部门待完善
             	    	    				//estimationOutput.setDepartment(department);
             	    	    				estimationOutput.setNum(detailOutput.getCycleNum());
             	    	    				estimationOutput.setPrice(sparePartsOutput.getPurchasingReferencePrice());
             	    	    				estimationOutput.setTotalAmount(estimationOutput.getPrice().multiply(new BigDecimal(estimationOutput.getNum())));
             	    	    			    estimationOutput.setDate(sdf2.format(rightNow.getTime()));
             	    	    			    dataList.add(estimationOutput);
         	    	    				}
         	    	    			}else{
         	    	    				if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
         	    	    					rightNow.add(Calendar.DATE,15);
         	    	    				}else{
         	    	    					rightNow.add(Calendar.MONTH,detailOutput.getCycleTerm());
         	    	    				}
         	    	    				while(rightNow.getTimeInMillis()>=startDate.getTime()&&rightNow.getTimeInMillis()<=endDate.getTime()){
         	    	    					DemandEstimationOutput estimationOutput = new DemandEstimationOutput();
         	    	    					estimationOutput.setSpareParts(detailOutput.getSpareParts());
         	    	    					estimationOutput.setSparePartsNo(sparePartsOutput.getSparePartsNo());
         	    	    					estimationOutput.setSparePartsLangLang(detailOutput.getSpareParts());           	    	    				estimationOutput.setStaffName(getUserNameByUserId(staff.getUser()));
             	    	    				estimationOutput.setModel(getModel(staff.getUser(), detailOutput.getSpareParts()));
             	    	    				//部门待完善
             	    	    				//estimationOutput.setDepartment(department);
             	    	    				estimationOutput.setNum(detailOutput.getCycleNum());
             	    	    				estimationOutput.setPrice(sparePartsOutput.getPurchasingReferencePrice());
             	    	    				estimationOutput.setTotalAmount(estimationOutput.getPrice().multiply(new BigDecimal(estimationOutput.getNum())));
             	    	    			    estimationOutput.setDate(sdf2.format(rightNow.getTime()));
             	    	    			    dataList.add(estimationOutput);
             	    	    			    if(TermEnum.HALFMOON.getCode().equals(detailOutput.getCycleTerm())){
            	    	    					rightNow.add(Calendar.DATE,15);
            	    	    				}else{
            	    	    					rightNow.add(Calendar.MONTH,detailOutput.getCycleTerm());
            	    	    				}
         	    	    					
         	    	    				}
         	    	    			}
         	    	    	    	
         	    	    	    	
         	    	    	     } 
         	    		     }
                   }
   	    	 }
   	     }
   	 }
   	     //筛选备件与型号一致的备件，统计需求总数量
   	     List<DemandEstimationOutput> repeatList = new ArrayList<>();
   	     for(DemandEstimationOutput dOutput3 : dataList){
   	    	 repeatList.add(dOutput3);
   	     }
   	     List<DemandEstimationOutput> list = new ArrayList<>();
   	     for (int i = 0; i < repeatList.size() - 1; i++) {
   				for (int j = repeatList.size() - 1; j > i; j--) {
   					if (repeatList.get(j).getSpareParts().equals(repeatList.get(i).getSpareParts())&&repeatList.get(j).getModel().equals(repeatList.get(i).getModel())) {
   						repeatList.remove(j);//删除重复元素
   					}
   				}
   			}
   	     
   	     for(DemandEstimationOutput dOutput : repeatList){
   	    	 double num = 0;
   	    	 for(DemandEstimationOutput dOutput2 : dataList){
   	    		 if(dOutput.getSpareParts().equals(dOutput2.getSpareParts())&&dOutput.getModel().equals(dOutput2.getModel())){
   	    			num+=dOutput2.getNum();
   	    		 }
   	    	 }
   	    	 dOutput.setTotalNum(num);
   	    	 list.add(dOutput);
   	     }
   	     
   	    demandOutput.setDataList(dataList);
   	    demandOutput.setDetailList(list);
		}
		return demandOutput;
	}

	
	
}
