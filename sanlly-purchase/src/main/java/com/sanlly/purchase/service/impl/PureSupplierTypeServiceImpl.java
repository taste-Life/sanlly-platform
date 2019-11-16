package com.sanlly.purchase.service.impl;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.SupplierTypeMapper;
import com.sanlly.purchase.entity.SupplierType;
import com.sanlly.purchase.entity.SupplierTypeExample;
import com.sanlly.purchase.models.input.supplier.AddPureSupplierTypeInput;
import com.sanlly.purchase.models.input.supplier.EditPureSupplierTypeInput;
import com.sanlly.purchase.models.input.supplier.SearchPureSupplierTypeInput;
import com.sanlly.purchase.models.output.supplier.PureSupplierTypeOutput;
import com.sanlly.purchase.service.PureSupplierTypeService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PureSupplierTypeServiceImpl implements PureSupplierTypeService{
	
	@Autowired
	private SupplierTypeMapper pureSupplierTypeDao;
	@Autowired
	private ProductionFeignClient productionFeignClient;
	
	/**
	 * @author mx
	 * 获取供应商类别列表
	 */
	@Override
	public PagedList<PureSupplierTypeOutput> getSupplierTypePagedList(SearchPureSupplierTypeInput input) {
		
		SupplierTypeExample example=new SupplierTypeExample();
		SupplierTypeExample.Criteria criteria=example.createCriteria();
		
		//查询条件
		
		//总条数
		Integer totalItemCount=(int)pureSupplierTypeDao.countByExample(example);
		PagedList<PureSupplierTypeOutput> pagedList=new PagedList<PureSupplierTypeOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		//分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<SupplierType> pureSupplierTypesList=pureSupplierTypeDao.selectByExample(example);
		//构造返回数据
		List<PureSupplierTypeOutput> dataList=new ArrayList<PureSupplierTypeOutput>();
		for(SupplierType pureSupplierType:pureSupplierTypesList){
			PureSupplierTypeOutput output=new PureSupplierTypeOutput();
			BeanUtils.copyProperties(pureSupplierType, output);
			dataList.add(output);
		}
		//将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	/**
	 * @author mx
	 * 新增供应商类别
	 */
	@Override
	public void addPureSupplierType(AddPureSupplierTypeInput input) {
		 SupplierType pureSupplierType = new SupplierType();
		 BeanUtils.copyProperties(input, pureSupplierType);
		 pureSupplierTypeDao.insert(pureSupplierType);
		
	}
	/**
	 * @author mx
	 * 获取供应商类别
	 */
	@Override
	public PureSupplierTypeOutput getPureSupplierType(EditPureSupplierTypeInput input) {
		SupplierType pureSupplierType = pureSupplierTypeDao.selectByPrimaryKey(input.getPureSupplierTypeId());
		PureSupplierTypeOutput output = new PureSupplierTypeOutput();
		BeanUtils.copyProperties(pureSupplierType, output);
		return output;
	}
	/**
	 * @author mx
	 * 修改供应商类别
	 */
	@Override
	public void updatePureSupplierType(EditPureSupplierTypeInput input) {
		SupplierType pureSupplierType = new SupplierType();
		BeanUtils.copyProperties(input, pureSupplierType);
		pureSupplierTypeDao.updateByPrimaryKey(pureSupplierType);
	
	}
	/**
	 * @author mx
	 * 批量删除供应商类别
	 */
	@Override
	public void deletePureSupplierType(Integer[] pureSupplierTypeIds) {
		for (Integer pureSupplierTypeId : pureSupplierTypeIds) {
			pureSupplierTypeDao.deleteByPrimaryKey(pureSupplierTypeId);
		}
	}

}
