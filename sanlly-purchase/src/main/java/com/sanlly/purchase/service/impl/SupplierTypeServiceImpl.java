package com.sanlly.purchase.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.SupplierTypeMapper;
import com.sanlly.purchase.entity.SupplierType;
import com.sanlly.purchase.entity.SupplierTypeExample;
import com.sanlly.purchase.models.input.supplierType.AddSupplierTypeInput;
import com.sanlly.purchase.models.input.supplierType.EditSupplierTypeInput;
import com.sanlly.purchase.models.input.supplierType.SearchSupplierTypeInput;
import com.sanlly.purchase.models.output.supplierType.SupplierTypeOutput;
import com.sanlly.purchase.service.SupplierTypeService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;

@Service
public class SupplierTypeServiceImpl extends BaseServiceImpl  implements SupplierTypeService{
	@Autowired
	private SupplierTypeMapper SupplierTypeDao;
	@Autowired
	private ProductionFeignClient productionFeignClient;
	
	private String typeTable = "purc_supplier_type";
	
	/**
	 * @author mx
	 * 获取供应商类别列表
	 * @update zhh
	 */
	@Override
	public PagedList<SupplierTypeOutput> getSupplierTypePagedList(SearchSupplierTypeInput input) {
		
		SupplierTypeExample example=new SupplierTypeExample();
		SupplierTypeExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//查询条件
		if (input.getSupplierTypeName() != null && !input.getSupplierTypeName().equals("")) {
			criteria.andSupplierTypeNameLike("%"+input.getSupplierTypeName()+"%");
		}
		//总条数
		Integer totalItemCount=(int)SupplierTypeDao.countByExample(example);
		PagedList<SupplierTypeOutput> pagedList=new PagedList<SupplierTypeOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		//分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<SupplierType> SupplierTypesList=SupplierTypeDao.selectByExample(example);
		//构造返回数据
		List<SupplierTypeOutput> dataList=new ArrayList<SupplierTypeOutput>();
		for(SupplierType SupplierType:SupplierTypesList){
			SupplierTypeOutput output=new SupplierTypeOutput();
			BeanUtils.copyProperties(SupplierType, output);
			output.setKeyNameLang(SupplierType.getKey());
			dataList.add(output);
		}
		
		//将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	/**
	 * @author mx
	 * 新增供应商类别
	 * @update zhh
	 */
	@Override
	public void addSupplierType(AddSupplierTypeInput input) {
		//查询输入的类别是否存在
		SupplierTypeExample example = new SupplierTypeExample();
		example.createCriteria().andSupplierTypeNameEqualTo(input.getSupplierTypeName()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		long types = SupplierTypeDao.countByExample(example);
		if(types>0){
			throw new RuntimeException("type is exist");
		}
		SupplierType supplierType = new SupplierType();
		BeanUtils.copyProperties(input, supplierType);
		Result<String> result = productionFeignClient.getKey(typeTable);
		if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
		supplierType.setKey(result.getData());
		supplierType.setIsDel(0);
		//设置时间部分
		Date date = new Date();
		supplierType.setCreateTime(date);
		supplierType.setCreateUser(getCurrentUserId());
		SupplierTypeDao.insert(supplierType);
		 
		
	}
	/**
	 * @author mx
	 * 获取供应商类别
	 */
	@Override
	public SupplierTypeOutput getSupplierType(EditSupplierTypeInput input) {
		SupplierType SupplierType = SupplierTypeDao.selectByPrimaryKey(input.getPurcSupplierTypeId());
		SupplierTypeOutput output = new SupplierTypeOutput();
		BeanUtils.copyProperties(SupplierType, output);
		return output;
	}
	/**
	 * @author mx
	 * 修改供应商类别
	 * @update zhh
	 */
	@Override
	public void updateSupplierType(EditSupplierTypeInput input) {
		//查询输入的类别是否存在
		SupplierTypeExample example = new SupplierTypeExample();
		example.createCriteria().andKeyEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<SupplierType> types = SupplierTypeDao.selectByExample(example);
		if(types!=null&&types.size()>0){
			SupplierType type = types.get(0);
			if(!type.getSupplierTypeName().equals(input.getSupplierTypeName())){
				example.clear();
				example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSupplierTypeNameEqualTo(input.getSupplierTypeName());
				long num = SupplierTypeDao.countByExample(example);
				if(num>0){
					throw new RuntimeException("type is exist");
				}
			}
		}
		SupplierType SupplierType = new SupplierType();
		BeanUtils.copyProperties(input, SupplierType);
		SupplierType.setUpdateTime(new Date());
		SupplierType.setUpdateUser(getCurrentUserId());
		SupplierTypeDao.updateByPrimaryKey(SupplierType);
	
	}
	/**
	 * @author mx
	 * 批量删除供应商类别
	 * @update zhh
	 */
	@Override
	public void deleteSupplierType(Integer[] SupplierTypeIds) {
		SupplierTypeExample example = new SupplierTypeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andPurcSupplierTypeIdIn(Arrays.asList(SupplierTypeIds));
		SupplierType type = new SupplierType();
		type.setIsDel(PlatformConstants.ISDEL_YES);
		SupplierTypeDao.updateByExampleSelective(type, example);
		
	}
}
