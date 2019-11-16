package com.sanlly.purchase.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.StorehouseTypeMapper;
import com.sanlly.purchase.entity.StorehouseType;
import com.sanlly.purchase.entity.StorehouseTypeExample;
import com.sanlly.purchase.entity.SupplierType;
import com.sanlly.purchase.entity.SupplierTypeExample;
import com.sanlly.purchase.models.input.StoreHouseType.AddStorehouseTypeInput;
import com.sanlly.purchase.models.input.StoreHouseType.EditStorehouseTypeInput;
import com.sanlly.purchase.models.input.StoreHouseType.SearchStorehouseTypeInput;
import com.sanlly.purchase.models.output.StorehouseType.StorehouseTypeOutput;
import com.sanlly.purchase.service.StorehouseTypeService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class StorehouseTypeServiceImpl extends BaseServiceImpl implements StorehouseTypeService {
	@Autowired
	private StorehouseTypeMapper StorehouseTypeDao;
	
	@Autowired
	private ProductionFeignClient productionFeignClient;
	
	private String typeTable = "purc_storehouse_type";
	
	/**
	 * @author mx
	 * 获取供应商类别列表
	 * @update zhh
	 */
	@Override
	public PagedList<StorehouseTypeOutput> getStorehouseTypePagedList(SearchStorehouseTypeInput input) {
		
		StorehouseTypeExample example=new StorehouseTypeExample();
		StorehouseTypeExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		
		//查询条件
		if (input.getStorehouseTypeName()!=null && !input.getStorehouseTypeName().equals("")) {
			criteria.andStorehouseTypeNameLike("%"+input.getStorehouseTypeName()+"%");
		}
		//总条数
		Integer totalItemCount=(int)StorehouseTypeDao.countByExample(example);
		PagedList<StorehouseTypeOutput> pagedList=new PagedList<StorehouseTypeOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		//分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<StorehouseType> StorehouseTypesList=StorehouseTypeDao.selectByExample(example);
		//构造返回数据
		List<StorehouseTypeOutput> dataList=new ArrayList<StorehouseTypeOutput>();
		for(StorehouseType StorehouseType:StorehouseTypesList){
			StorehouseTypeOutput output=new StorehouseTypeOutput();
			BeanUtils.copyProperties(StorehouseType, output);
			output.setPurcStorehouseTypeId(StorehouseType.getPurcStorehouseTypeid());
			output.setKeyNameLang(StorehouseType.getKey());
			output.setUpdateUserName(getUserNameByUserId(StorehouseType.getUpdateUser()));
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
	public void addStorehouseType(AddStorehouseTypeInput input) {
		StorehouseTypeExample example = new StorehouseTypeExample();
		example.createCriteria().andStorehouseTypeNameEqualTo(input.getStorehouseTypeName()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		long num = StorehouseTypeDao.countByExample(example);
		if(num>0){
			throw new RuntimeException("type is exist");
		}
		StorehouseType StorehouseType = new StorehouseType();
		BeanUtils.copyProperties(input, StorehouseType);
		Result<String> result = productionFeignClient.getKey(typeTable);
		if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
		StorehouseType.setKey(result.getData());
		StorehouseType.setIsDel(0);
		//设置时间部分
		Date date = new Date();
		StorehouseType.setCreateTime(date);
		StorehouseType.setCreateUser(getCurrentUserId());
		StorehouseTypeDao.insertSelective(StorehouseType);
		
	}
	/**
	 * @author mx
	 * 获取供应商类别
	 */
	@Override
	public StorehouseTypeOutput getStorehouseType(EditStorehouseTypeInput input) {
		StorehouseType StorehouseType = StorehouseTypeDao.selectByPrimaryKey(input.getPurcStorehouseTypeid());
		StorehouseTypeOutput output = new StorehouseTypeOutput();
		BeanUtils.copyProperties(StorehouseType, output);
		return output;
	}
	/**
	 * @author mx
	 * 修改供应商类别
	 * @update zhh
	 */
	@Override
	public void updateStorehouseType(EditStorehouseTypeInput input) {
		StorehouseTypeExample example = new StorehouseTypeExample();
		example.createCriteria().andKeyEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<StorehouseType> types = StorehouseTypeDao.selectByExample(example);
		if(types!=null&&types.size()>0){
			StorehouseType type = types.get(0);
			if(!type.getStorehouseTypeName().equals(input.getStorehouseTypeName())){
				example.clear();
				example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStorehouseTypeNameEqualTo(input.getStorehouseTypeName());
				long num = StorehouseTypeDao.countByExample(example);
				if(num>0){
					throw new RuntimeException("type is exist");
				}
			}
		}
		example.clear();
		example.createCriteria().andKeyEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		StorehouseType StorehouseType = new StorehouseType();
		BeanUtils.copyProperties(input, StorehouseType);
		StorehouseType.setUpdateTime(new Date());
		StorehouseType.setUpdateUser(getCurrentUserId());
		StorehouseTypeDao.updateByExampleSelective(StorehouseType, example);
	
	}
	/**
	 * @author mx
	 * 批量删除供应商类别
	 * @update zhh
	 */
	@Override
	public void deleteStorehouseType(String[] keys) {
		StorehouseTypeExample example = new StorehouseTypeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyIn(Arrays.asList(keys));
		StorehouseType type = new StorehouseType();
		type.setIsDel(PlatformConstants.ISDEL_YES);
		StorehouseTypeDao.updateByExampleSelective(type, example);
	}
}
