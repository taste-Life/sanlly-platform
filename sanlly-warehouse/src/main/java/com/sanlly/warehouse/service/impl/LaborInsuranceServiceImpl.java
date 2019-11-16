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
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareLaborStockMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.dao.WareSparepartsCategoriesDetailsMapper;
import com.sanlly.warehouse.entity.WareLaborInsurance;
import com.sanlly.warehouse.entity.WareLaborStock;
import com.sanlly.warehouse.entity.WareLaborStockExample;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareSparePartsExample.Criteria;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetails;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample;
import com.sanlly.warehouse.models.input.laborInsurance.AddLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.EditLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceOutput;
import com.sanlly.warehouse.service.LaborInsuranceService;

@Service
public class LaborInsuranceServiceImpl extends BaseServiceImpl implements LaborInsuranceService{

	@Autowired
	private WareSparePartsMapper wareSparePartsDao;
		
	@Autowired
	private WareLaborStockMapper wareLaborStockDao;
	
	private String laborInsuranceTable = "ware_spare_parts";
	
	/**
     * 劳保信息分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborInsuranceOutput> getLaborInsurancePageList(SearchLaborInsuranceInput input) {
		// TODO Auto-generated method stub
		WareSparePartsExample example = new WareSparePartsExample();
		Criteria criteria = example.createCriteria();
		//待修改，劳保类别对应的key
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsCategoriesEqualTo("LKWASPCRGE000007");
		//筛选条件
		if(StringUtils.isNotEmpty(input.getSparePartsNo())) {
			criteria.andSparePartsNoLike("%"+input.getSparePartsNo()+"%");
		}
		if(StringUtils.isNotEmpty(input.getSparePartsName())) {
			if(isChineseRequest()){
			  criteria.andSparePartsNameLike("%"+input.getSparePartsName()+"%");
			}
			if(isEnglishRequest()){
				criteria.andSparePartsNameEnLike("%"+input.getSparePartsName()+"%");
			}
		}
		if(StringUtils.isNotEmpty(input.getSparePartsCategoriesDetails())) {
			criteria.andSparePartsCategoriesDetailsEqualTo(input.getSparePartsCategoriesDetails());
		}
		//总条数
        Integer totalItemCount=(int) wareSparePartsDao.countByExample(example);
        PagedList<LaborInsuranceOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<WareSpareParts> wareSparePartsList = wareSparePartsDao.selectByExample(example);
        //结果返回数据
        List<LaborInsuranceOutput> dataList = new ArrayList<>();
        for (WareSpareParts wareSpareParts : wareSparePartsList) {
        	LaborInsuranceOutput output = new LaborInsuranceOutput();
        	BeanUtils.copyProperties(wareSpareParts, output);
        	//设置国际化
        	output.setKeyLangLang(wareSpareParts.getKey());
        	output.setIsConsumableLangLang(wareSpareParts.getIsConsumable());
        	output.setSparePartsCategoriesDetailsLangLang(wareSpareParts.getSparePartsCategoriesDetails());
        	output.setPurchasingReferencePrice(wareSpareParts.getPurchasingReferencePrice());
        	dataList.add(output);
        }
        //将分页数据放入结果中
        pagedList.getDataList().addAll(dataList);
        return pagedList;
	}

	/**
     * 获得全部劳保信息
     * @param input
     * @return
     */
	@Override
	public List<LaborInsuranceOutput> getLaborInsuranceList() {
		// TODO Auto-generated method stub
		WareSparePartsExample example = new WareSparePartsExample();
		Criteria criteria = example.createCriteria();
		//根据备件大类 劳保类的key查询
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsCategoriesEqualTo("LKWASPCRGE000007");
		List<WareSpareParts> wareSparePartsList = wareSparePartsDao.selectByExample(example);
        //结果返回数据
        List<LaborInsuranceOutput> dataList = new ArrayList<>();
        for (WareSpareParts wareSpareParts : wareSparePartsList) {
        	LaborInsuranceOutput output = new LaborInsuranceOutput();
        	BeanUtils.copyProperties(wareSpareParts, output);
        	//设置国际化
        	output.setKeyLangLang(wareSpareParts.getKey());
        	output.setSparePartsCategoriesDetailsLangLang(wareSpareParts.getSparePartsCategoriesDetails());
        	dataList.add(output);
        }
		return dataList;
	}

	/**
     * 新增劳保信息
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addLaborInsurance(AddLaborInsuranceInput input) {
		// TODO Auto-generated method stub
		Result<String> result = productionService.getKey(laborInsuranceTable);
		if (result==null||StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareSpareParts wareSpareParts = new WareSpareParts();
		BeanUtils.copyProperties(input, wareSpareParts);
		wareSpareParts.setIsDel(PlatformConstants.ISDEL_NO);
		wareSpareParts.setCreateTime(new Date());
		wareSpareParts.setCreateUser(getCurrentUserId());
		wareSpareParts.setKey(result.getData());
		//设置备件大类 劳保类key
		wareSpareParts.setSparePartsCategories("LKWASPCRGE000007");
		wareSparePartsDao.insertSelective(wareSpareParts);
		
		WareLaborStock wareLaborStock = new WareLaborStock();
		wareLaborStock.setIsConsumable(input.getIsConsumable());
		wareLaborStock.setStockoutRestrictMonth(input.getStockoutRestrictMonth());
		wareLaborStock.setDurableYears(input.getDurableYears());
		wareLaborStock.setRemark(input.getRemark());
		wareLaborStock.setSpareParts(result.getData());
		wareLaborStock.setSurplusNum(0D);
		wareLaborStock.setActualSurplusNum(0D);
		wareLaborStock.setIsDel(PlatformConstants.ISDEL_NO);
		wareLaborStock.setCreateUser(getCurrentUserId());
		wareLaborStock.setCreateTime(new Date());
		wareLaborStockDao.insertSelective(wareLaborStock);
		
	}

	/**
     * 修改劳保信息
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void editLaborInsurance(EditLaborInsuranceInput input) {
		// TODO Auto-generated method stub
		WareSparePartsExample example = new WareSparePartsExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(input.getKey());
		WareSpareParts wareSpareParts = new WareSpareParts();
		BeanUtils.copyProperties(input, wareSpareParts);
		wareSpareParts.setUpdateTime(new Date());
		wareSpareParts.setUpdateUser(getCurrentUserId());
		wareSparePartsDao.updateByExampleSelective(wareSpareParts, example);
		
		WareLaborStock wareLaborStock = new WareLaborStock();
		wareLaborStock.setIsConsumable(input.getIsConsumable());
		wareLaborStock.setStockoutRestrictMonth(input.getStockoutRestrictMonth());
		wareLaborStock.setDurableYears(input.getDurableYears());
		wareLaborStock.setRemark(input.getRemark());
		wareLaborStock.setUpdateTime(new Date());
		wareLaborStock.setUpdateUser(getCurrentUserId());
		WareLaborStockExample wareLaborStockExample = new WareLaborStockExample();
		wareLaborStockExample.createCriteria().andSparePartsEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		wareLaborStockDao.updateByExampleSelective(wareLaborStock, wareLaborStockExample);
	}

	/**
     * 获取劳保信息
     * @param input
     * @return
     */
	@Override
	public WareLaborInsurance getLaborInsuranceDetail(EditLaborInsuranceInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * 批量删除劳保信息
     * @param input
     * @return
     */
	@Override
	public void deleteLaborInsurance(String[] keys) {
		// TODO Auto-generated method stub
		WareSparePartsExample example = new WareSparePartsExample();
		example.createCriteria().andKeyIn(Arrays.asList(keys));
		WareSpareParts wareSpareParts = new WareSpareParts();
		wareSpareParts.setIsDel(PlatformConstants.ISDEL_YES);
		wareSparePartsDao.updateByExampleSelective(wareSpareParts, example);
		
	}
	
}