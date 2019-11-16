package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.dao.WareSparepartsCategoriesDetailsMapper;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetails;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample.Criteria;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.SearchLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceType.LaborInsuranceTypeOutput;
import com.sanlly.warehouse.service.LaborInsuranceTypeService;
import com.sanlly.warehouse.service.WareSparePartsCategoriesDetailsService;

@Service
public class LaborInsuranceTypeServiceImpl extends BaseServiceImpl implements LaborInsuranceTypeService{

	@Autowired
	private WareSparepartsCategoriesDetailsMapper wareSparepartsCategoriesDetailsDao;
	
	@Autowired
	private WareSparePartsMapper wareSparePartsDao;
	
	@Autowired
	private WareSparePartsCategoriesDetailsService wareSparePartsCategoriesDetailsService;
	
	/**
     * 劳保类别分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<LaborInsuranceTypeOutput> getLaborInsuranceTypePageList(SearchLaborInsuranceTypeInput input) {
		// TODO Auto-generated method stub
		WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
		Criteria criteria = example.createCriteria();
		//筛选条件
		//待修改
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsCategoriesEqualTo("LKWASPCRGE000007");
		if(StringUtils.isNotEmpty(input.getSparepartsCategoriesDetailsName())){
			if(isChineseRequest()){
				criteria.andSparepartsCategoriesDetailsNameLike("%"+input.getSparepartsCategoriesDetailsName()+"%");
			}else{
				criteria.andSparepartsCategoriesDetailsNameEnLike("%"+input.getSparepartsCategoriesDetailsName()+"%");
			}
		}
		//总条数
        Integer totalItemCount=(int) wareSparepartsCategoriesDetailsDao.countByExample(example);
        PagedList<LaborInsuranceTypeOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<WareSparepartsCategoriesDetails> wList = wareSparepartsCategoriesDetailsDao.selectByExample(example);
        //结果返回数据
        List<LaborInsuranceTypeOutput> dataList = new ArrayList<>();
        for (WareSparepartsCategoriesDetails wareSparepartsCategoriesDetails : wList) {
        	LaborInsuranceTypeOutput output = new LaborInsuranceTypeOutput();
        	output.setWareSparepartsCategoriesDetailsId(wareSparepartsCategoriesDetails.getWareSparepartsCategoriesDetailsId());
        	output.setKey(wareSparepartsCategoriesDetails.getKey());
        	output.setKeyLangLang(wareSparepartsCategoriesDetails.getKey());
        	output.setSparepartsCategoriesDetailsName(wareSparepartsCategoriesDetails.getSparepartsCategoriesDetailsName());
        	output.setSparepartsCategoriesDetailsNameEn(wareSparepartsCategoriesDetails.getSparepartsCategoriesDetailsNameEn());
        	dataList.add(output);
        }
        //将分页数据放入结果中
        pagedList.getDataList().addAll(dataList);
        return pagedList;
	}

	/**
     * 获得全部劳保类别
     * @param input
     * @return
     */
	@Override
	public List<LaborInsuranceTypeOutput> getLaborInsuranceTypeList() {
		// TODO Auto-generated method stub
		WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
		Criteria criteria = example.createCriteria();
		//筛选条件
		//待修改
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsCategoriesEqualTo("LKWASPCRGE000007");
		List<WareSparepartsCategoriesDetails> wList = wareSparepartsCategoriesDetailsDao.selectByExample(example);
        //结果返回数据
        List<LaborInsuranceTypeOutput> dataList = new ArrayList<>();
        for (WareSparepartsCategoriesDetails wareSparepartsCategoriesDetails : wList) {
        	LaborInsuranceTypeOutput output = new LaborInsuranceTypeOutput();
        	output.setWareSparepartsCategoriesDetailsId(wareSparepartsCategoriesDetails.getWareSparepartsCategoriesDetailsId());
        	output.setKey(wareSparepartsCategoriesDetails.getKey());
        	output.setKeyLangLang(wareSparepartsCategoriesDetails.getKey());
        	output.setSparepartsCategoriesDetailsName(wareSparepartsCategoriesDetails.getSparepartsCategoriesDetailsName());
        	dataList.add(output);
        }
        return dataList;
	}

	/**
     * 新增劳保类别
     * @param input
     * @return
     */
	@Override
	public void addLaborInsuranceType(AddSparePartsCategoriesDetailsInput input) {
		// TODO Auto-generated method stub
		//设置备件大类为劳保
		input.setSparePartsCategories("LKWASPCRGE000007");
		//调用备件明细类别接口，添加劳保类别
		wareSparePartsCategoriesDetailsService.addSparepartsCategoriesDetails(input);
	}

	/**
     * 修改劳保类别
     * @param input
     * @return
     */
	@Override
	public void editLaborInsuranceType(EditSparePartsCategoriesDetailsInput input) {
		// TODO Auto-generated method stub
		//设置备件大类为劳保
		input.setSparePartsCategories("LKWASPCRGE000007");
		//调用备件明细类别接口，修改劳保类别
		wareSparePartsCategoriesDetailsService.updateSparepartsCategoriesDetails(input);
	}

	/**
     * 批量删除劳保类别
     * @param input
     * @return
     */
	@Override
	public void deleteLaborInsuranceType(String[] keys) {
		// TODO Auto-generated method stub
		WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
		Criteria criteria = example.createCriteria();
		//查询条件
		criteria.andKeyIn(Arrays.asList(keys));
		WareSparepartsCategoriesDetails wareSparepartsCategoriesDetails = new WareSparepartsCategoriesDetails();
		wareSparepartsCategoriesDetails.setIsDel(PlatformConstants.ISDEL_YES);
		wareSparepartsCategoriesDetails.setUpdateTime(new Date());
		wareSparepartsCategoriesDetails.setUpdateUser(getCurrentUserId());
		wareSparepartsCategoriesDetailsDao.updateByExampleSelective(wareSparepartsCategoriesDetails, example);
	}
	
	/**
     * 根据劳保类别查询备件key;
     * @param input
     * @return
     */
	@Override
    public List<String> getSparePartsKeyListByType(String sparePartsCategoriesDetails) {
		WareSparePartsExample example = new WareSparePartsExample();
		example.createCriteria().andSparePartsCategoriesEqualTo("LKWASPCRGE000007").andSparePartsCategoriesDetailsEqualTo(sparePartsCategoriesDetails).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareSpareParts> wList = wareSparePartsDao.selectByExample(example);
		List<String> keys = new ArrayList<>();
		if(wList!=null&&wList.size()>0){
			for(WareSpareParts wDetails : wList){
				keys.add(wDetails.getKey());
			}
		}
		return keys;
		
	}

}
