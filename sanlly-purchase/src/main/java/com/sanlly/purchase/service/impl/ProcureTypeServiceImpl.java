package com.sanlly.purchase.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.ProcureTypeMapper;
import com.sanlly.purchase.entity.ProcureType;
import com.sanlly.purchase.entity.ProcureTypeExample;
import com.sanlly.purchase.models.input.procuretype.AddProcureTypeInput;
import com.sanlly.purchase.models.input.procuretype.EditProcureTypeInput;
import com.sanlly.purchase.models.input.procuretype.SearchProcureTypeInput;
import com.sanlly.purchase.models.output.procuretype.ProcureTypeOutput;
import com.sanlly.purchase.service.ProcureTypeService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;

@Service
public class ProcureTypeServiceImpl implements ProcureTypeService{
	@Autowired
	private ProcureTypeMapper ProcureTypeDao;
	@Autowired
	private ProductionFeignClient productionFeignClient;
	
	/**
	 * @author mx
	 * 获取供应商采购类型列表
	 */
	@Override
	public PagedList<ProcureTypeOutput> getProcureTypePagedList(SearchProcureTypeInput input) {
		
		ProcureTypeExample example=new ProcureTypeExample();
		ProcureTypeExample.Criteria criteria=example.createCriteria();
		System.out.println(input.getProcureTypeName());
		//查询条件
		if (input.getProcureTypeName() != null && !input.getProcureTypeName().equals("")) {
			System.out.println(444);
			criteria.andProcureTypeNameLike("%"+input.getProcureTypeName()+"%");
		}
		//总条数
		Integer totalItemCount=(int)ProcureTypeDao.countByExample(example);
		PagedList<ProcureTypeOutput> pagedList=new PagedList<ProcureTypeOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		//分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ProcureType> ProcureTypesList=ProcureTypeDao.selectByExample(example);
		//构造返回数据
		List<ProcureTypeOutput> dataList=new ArrayList<ProcureTypeOutput>();
		for(ProcureType ProcureType:ProcureTypesList){
			ProcureTypeOutput output=new ProcureTypeOutput();
			BeanUtils.copyProperties(ProcureType, output);
			dataList.add(output);
		}
		//将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	/**
	 * @author mx
	 * 新增供应商采购类型
	 */
	@Override
	public void addProcureType(AddProcureTypeInput input) {
		 ProcureType ProcureType = new ProcureType();
		 BeanUtils.copyProperties(input, ProcureType);
		 ProcureTypeDao.insert(ProcureType);
		
	}
	/**
	 * @author mx
	 * 获取供应商采购类型
	 */
	@Override
	public ProcureTypeOutput getProcureType(EditProcureTypeInput input) {
		ProcureType ProcureType = ProcureTypeDao.selectByPrimaryKey(input.getPurcProcureTypeId());
		ProcureTypeOutput output = new ProcureTypeOutput();
		BeanUtils.copyProperties(ProcureType, output);
		return output;
	}
	/**
	 * @author mx
	 * 修改供应商采购类型
	 */
	@Override
	public void updateProcureType(EditProcureTypeInput input) {
		ProcureType ProcureType = new ProcureType();
		BeanUtils.copyProperties(input, ProcureType);
		ProcureTypeDao.updateByPrimaryKey(ProcureType);
	
	}
	/**
	 * @author mx
	 * 批量删除供应商采购类型
	 */
	@Override
	public void deleteProcureType(Integer[] ProcureTypeIds) {
		for (Integer ProcureTypeId : ProcureTypeIds) {
			ProcureTypeDao.deleteByPrimaryKey(ProcureTypeId);
		}
	}
}
