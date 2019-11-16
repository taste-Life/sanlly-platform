package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
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
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.warehouse.dao.WareBilltypeWarehousetypeMapper;
import com.sanlly.warehouse.dao.WareStockExtMapper;
import com.sanlly.warehouse.dao.WareWarehouseMapper;
import com.sanlly.warehouse.dao.WareWarehouseTypeMapper;
import com.sanlly.warehouse.dao.WareWarehouseTypeRelationMapper;
import com.sanlly.warehouse.dao.WareWarehouseYardMapper;
import com.sanlly.warehouse.entity.WareBilltypeWarehousetype;
import com.sanlly.warehouse.entity.WareBilltypeWarehousetypeExample;
import com.sanlly.warehouse.entity.WareWarehouse;
import com.sanlly.warehouse.entity.WareWarehouseExample;
import com.sanlly.warehouse.entity.WareWarehouseType;
import com.sanlly.warehouse.entity.WareWarehouseTypeExample;
import com.sanlly.warehouse.entity.WareWarehouseTypeRelation;
import com.sanlly.warehouse.entity.WareWarehouseTypeRelationExample;
import com.sanlly.warehouse.entity.WareWarehouseYard;
import com.sanlly.warehouse.entity.WareWarehouseYardExample;
import com.sanlly.warehouse.entity.WareWarehouseExample.Criteria;
import com.sanlly.warehouse.models.input.warehouse.AddWareWarehouseTypeRelationInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseYardRelationInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.SearchWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.YardInput;
import com.sanlly.warehouse.models.output.warehouse.ProdCompanyOutput;
import com.sanlly.warehouse.models.output.warehouse.WareTypeYardOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseByCompanyOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseTypeOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseYardOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.WarehouseService;

/**
 * ClassName: WarehouseServiceImpl
 * Description: 仓库信息管理
 * date: 2019/7/25 11:28
 *
 * @author zhh
 * 
 */
@Service
public class WarehouseServiceImpl extends BaseServiceImpl implements WarehouseService{

	@Autowired
	private WareWarehouseMapper wareWarehouseDao;
		
	@Autowired
	private WareWarehouseTypeMapper wareWarehouseTypeDao;
	
	@Autowired
	private WareWarehouseTypeRelationMapper wareWarehouseTypeRelationDao;
	
	@Autowired
	private WareWarehouseYardMapper wareWarehouseYardDao;
	
	@Autowired
	private BillTypeService billTypeService;

	@Autowired
	private WareBilltypeWarehousetypeMapper billtypeWarehousetypeDao;
	@Autowired
	private WareStockExtMapper wareStockExtDao;
//	@Autowired
//	private WareStockMapper wareStockDao;
	
	
	//生成key
	private String warehouseTable = "ware_warehouse";
	
	/**
	 * 仓库分页列表查询
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<WarehouseOutput> getWarehousePageList(SearchWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseExample example = new WareWarehouseExample();
		Criteria criteria = example.createCriteria();
		// 查询条件
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		
		if (StringUtils.isNotEmpty(input.getWarehouseName())) {
			if(isChineseRequest()){
				criteria.andWarehouseNameLike("%" + input.getWarehouseName() + "%");
			}
		    if(isEnglishRequest()){
				criteria.andWarehouseNameEnLike("%" + input.getWarehouseName() + "%");
			}
		}
		if (StringUtils.isNotEmpty(input.getWarehouseAddr())) {
			criteria.andWarehouseAddrLike("%" + input.getWarehouseAddr() + "%");
		}
		if (StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		// 总条数
		Integer totalItemCount = (int) wareWarehouseDao.countByExample(example);
		PagedList<WarehouseOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<WareWarehouse> warehouseList = wareWarehouseDao.selectByExample(example);
		// 结果返回数据
		List<WarehouseOutput> dataList = new ArrayList<>();
		for (WareWarehouse wareWarehouse : warehouseList) {
			WarehouseOutput output = new WarehouseOutput();
			BeanUtils.copyProperties(wareWarehouse, output);
			output.setKeyLangLang(wareWarehouse.getKey());
			output.setCompanyLangLang(wareWarehouse.getCompany());
			output.setWarehouseStatusLangLang(wareWarehouse.getWarehouseStatus());
			dataList.add(output);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	
	/**
     * 获得全部公司名称
     * @param input
     * @return
     */
	@Override
	public List<ProdCompanyOutput> getProdCompanyList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		Result<List<CompanyOutput>> result = productionService.list(input);
		//返回数据
		List<ProdCompanyOutput> dataList = new ArrayList<>();
		if (result != null && result.getData()!=null) {
			List<CompanyOutput> companyList = result.getData();
			for(CompanyOutput companyOutput : companyList) {
				ProdCompanyOutput prodCompanyOutput = new ProdCompanyOutput();
				prodCompanyOutput.setCompanyId(companyOutput.getProdCompanyId());
				prodCompanyOutput.setKeyLangLang(companyOutput.getKey());
				prodCompanyOutput.setKey(companyOutput.getKey());
				prodCompanyOutput.setCompanyName(companyOutput.getCompanyName());
				prodCompanyOutput.setCompanyNameEn(companyOutput.getCompanyNameEn());
				
				dataList.add(prodCompanyOutput);
			}
		}
		
		return dataList;
	}
	
	/**
     * 新增仓库
     * @param input
     * @return
     */
	@Override
	public void addWarehouse(AddWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseExample example = new WareWarehouseExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWarehouseNameEqualTo(input.getWarehouseName());
		List<WareWarehouse> wList = wareWarehouseDao.selectByExample(example);
		if(wList!=null&&wList.size()>0){
			throw new RuntimeException("isExist");
		}
		Result<String> result = productionService.getKey(warehouseTable);
		if (result==null||StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareWarehouse warehouse = new WareWarehouse();
		BeanUtils.copyProperties(input, warehouse);
		warehouse.setKey(result.getData());
		warehouse.setWarehouseStatus(CommonEnum.NO.getCode());
		warehouse.setCreateTime(new Date());
		warehouse.setCreateUser(getCurrentUserId());
		warehouse.setIsDel(PlatformConstants.ISDEL_NO);
		wareWarehouseDao.insertSelective(warehouse);
	}
	
	/**
     * 修改仓库信息
     * @param input
     * @return
     */
	@Override
	public void editWarehouse(EditWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseExample example = new WareWarehouseExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(input.getKey());
		List<WareWarehouse> wList = wareWarehouseDao.selectByExample(example);
		if(wList!=null&&wList.size()>0){
			if(!input.getWarehouseName().equals(wList.get(0).getWarehouseName())){
				WareWarehouseExample warehouseExample = new WareWarehouseExample();
				warehouseExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWarehouseNameEqualTo(input.getWarehouseName());
				List<WareWarehouse> warehouses = wareWarehouseDao.selectByExample(warehouseExample);
				if(warehouses!=null&&warehouses.size()>0){
					throw new RuntimeException("isExist");
				}
			}
		}
		WareWarehouse warehouse = new WareWarehouse();
		BeanUtils.copyProperties(input, warehouse);
		warehouse.setUpdateTime(new Date());
		warehouse.setUpdateUser(getCurrentUserId());
		WareWarehouseExample wareWarehouseExample = new WareWarehouseExample();
		//查询条件，根据key查找对象，进行修改
		wareWarehouseExample.createCriteria().andKeyEqualTo(input.getKey());
		wareWarehouseDao.updateByExampleSelective(warehouse, wareWarehouseExample);
	}
	
	/**
     * 根据key获取仓库信息
     * @param input
     * @return
     */
	@Override
	public WareWarehouse getWarehouseDetail(EditWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseExample wareWarehouseExample = new WareWarehouseExample();
		wareWarehouseExample.createCriteria().andKeyEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareWarehouse> warehouses = wareWarehouseDao.selectByExample(wareWarehouseExample);
		WareWarehouse warehouse = new WareWarehouse();
		if(warehouses!=null&&warehouses.size()>0){
			warehouse = warehouses.get(0);
		}
		return warehouse;
	}
	
	/**
     * 根据key获取对应仓库类型信息
     * @param input
     * @return
     */
	@Override
	public List<WarehouseTypeOutput> getWarehouseTypeListByWarehouse(EditWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseTypeRelationExample wareWarehouseTypeRelationExample = new WareWarehouseTypeRelationExample();
		wareWarehouseTypeRelationExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWarehouseEqualTo(input.getKey());
		List<WareWarehouseTypeRelation> warehouseTypeRelations = wareWarehouseTypeRelationDao.selectByExample(wareWarehouseTypeRelationExample);
		//返回数据
		List<WarehouseTypeOutput> dataList = new ArrayList<>();
		for(WareWarehouseTypeRelation wareWarehouseTypeRelation : warehouseTypeRelations) {
			WarehouseTypeOutput warehouseTypeOutput = new WarehouseTypeOutput();
			//根据关系表中查出的仓库类型的key去查相应的对象信息
            WareWarehouseTypeExample wareWarehouseTypeExample = new WareWarehouseTypeExample();
            wareWarehouseTypeExample.createCriteria().andKeyEqualTo(wareWarehouseTypeRelation.getWarehouseType());
            List<WareWarehouseType> warehouseTypes = wareWarehouseTypeDao.selectByExample(wareWarehouseTypeExample);
            if(warehouseTypes!=null&&warehouseTypes.size()>0) {
            	BeanUtils.copyProperties(warehouseTypes.get(0), warehouseTypeOutput);
            	warehouseTypeOutput.setKeyLangLang(warehouseTypes.get(0).getKey());
            }
			dataList.add(warehouseTypeOutput);
		}
		return dataList;
	}
	
	/**
     * 设置仓库类型
     * @param input
     * @return
     */
	@Override
	@Transactional
	public void addWareWarehouseTypeRelation(AddWareWarehouseTypeRelationInput input) {
		// TODO Auto-generated method stub
        WareWarehouseTypeRelationExample wareWarehouseTypeRelationExample = new WareWarehouseTypeRelationExample();
        wareWarehouseTypeRelationExample.createCriteria().andWarehouseEqualTo(input.getWarehouse()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<WareWarehouseTypeRelation> warehouseTypeRelations = wareWarehouseTypeRelationDao.selectByExample(wareWarehouseTypeRelationExample);
        
        WareWarehouseTypeRelation warehouseTypeRelation = new WareWarehouseTypeRelation();
        if(warehouseTypeRelations!=null&&warehouseTypeRelations.size()>0) {
			//若是之前已经设置过仓库类型，先删除之前的对应关系
			wareWarehouseTypeRelationDao.deleteByExample(wareWarehouseTypeRelationExample);
			warehouseTypeRelation.setUpdateTime(new Date());
			warehouseTypeRelation.setUpdateUser(getCurrentUserId());
		}else {
			//若是第一次设置仓库类型,直接添加
			warehouseTypeRelation.setCreateTime(new Date());
			warehouseTypeRelation.setCreateUser(getCurrentUserId());
		}
        warehouseTypeRelation.setWarehouse(input.getWarehouse());
		warehouseTypeRelation.setIsDel(PlatformConstants.ISDEL_NO);
		for(String warehouseTypeKey:Arrays.asList(input.getWarehouseTypes())) {
			warehouseTypeRelation.setWarehouseType(warehouseTypeKey);
			wareWarehouseTypeRelationDao.insertSelective(warehouseTypeRelation);
		}
	}

	/**
     * 获得仓库同一公司下场站信息
     * @param input
     * @return
     */
	@Override
	public List<WarehouseYardOutput> getWarehouseYardList(EditWarehouseInput input) {
		// TODO Auto-generated method stub
		//调用生产接口，根据公司key获得场站
		Result<List<YardOutput>> result = productionService.getYardListByCompanyKey(input.getCompany());
		List<YardOutput> yardList = result.getData();
		if (result==null||result.getData().size()<0) {
			throw new NullPointerException("null");
		}
		//返回数据
		List<WarehouseYardOutput> dataList = new ArrayList<>();
		for(YardOutput yard:yardList) {
			WarehouseYardOutput warehouseYardOutput = new WarehouseYardOutput();
			if(yard.getIsDel().equals(PlatformConstants.ISDEL_NO)){
				warehouseYardOutput.setKey(yard.getKey());
				warehouseYardOutput.setKeyLangLang(yard.getKey());
				warehouseYardOutput.setYardName(yard.getYardName());
				warehouseYardOutput.setYardNameEn(yard.getYardNameEn());
				if(StringUtils.isNotEmpty(yard.getDefaultWarehouse())){
					warehouseYardOutput.setWarehouse(yard.getDefaultWarehouse());
					warehouseYardOutput.setWarehouseLangLang(yard.getDefaultWarehouse());
				}
			}
			dataList.add(warehouseYardOutput);
		}
		return dataList;
	}
	
	/**
     * 为仓库分配场站
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addWarehouseYardRelation(AddWarehouseYardRelationInput input) {
		// TODO Auto-generated method stub
		//调用生产接口，根据公司key获得场站
//		Result<List<YardOutput>> result = productionService.getYardListByCompanyKey(input.getCompany());
//		List<YardOutput> yardList = result.getData();
//		if (result==null||result.getData().size()<0) {
//			throw new RuntimeException("no data");
//		}
//		YardInput yardInput = new YardInput();
//		  //判断是否设置默认仓库
//		  if(StringUtils.isNotEmpty(input.getYard())) {
//			  for(YardOutput yardOutput : yardList){
//				  BeanUtils.copyProperties(yardOutput, yardInput);
//				  //判断是否为空
//				  if(StringUtils.isNotEmpty(input.getWarehouse())){
//					  if(StringUtils.isNotEmpty(yardOutput.getDefaultWarehouse())&&yardOutput.getDefaultWarehouse().equals(input.getWarehouse())){
//						  yardInput.setDefaultWarehouse(" ");
//					      productionService.update(yardInput);
//					  }
//					  if(yardOutput.getKey().equals(input.getYard())){
//							yardInput.setDefaultWarehouse(input.getWarehouse());
//							productionService.update(yardInput);
//					  }
//				  }
//			  }
//		  }else{
//		     //没有设置默认仓库
//		     //数据库中有相应默认仓库数据，则清空
//			  for(YardOutput yardOutput : yardList){
//				  BeanUtils.copyProperties(yardOutput, yardInput);
//				  if(StringUtils.isNotEmpty(yardOutput.getDefaultWarehouse())&&yardOutput.getDefaultWarehouse().equals(input.getWarehouse())){
//					  yardInput.setDefaultWarehouse(" ");
//					  productionService.update(yardInput);
//				  }
//			  }
//		  }
		//分配场站
		WareWarehouseYardExample wareWarehouseYardExample = new WareWarehouseYardExample();
		wareWarehouseYardExample.createCriteria().andWarehouseEqualTo(input.getWarehouse()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<WareWarehouseYard> wareWarehouseYards = wareWarehouseYardDao.selectByExample(wareWarehouseYardExample);
		WareWarehouseYard wareWarehouseYard = new WareWarehouseYard();
        if(wareWarehouseYards!=null&&wareWarehouseYards.size()>0) {
        	//若之前已经分配过场站，先删除之前的对应关系
        	wareWarehouseYardDao.deleteByExample(wareWarehouseYardExample);
        	wareWarehouseYard.setCreateTime(new Date());
			wareWarehouseYard.setCreateUser(getCurrentUserId());
        	wareWarehouseYard.setUpdateTime(new Date());
			wareWarehouseYard.setUpdateUser(getCurrentUserId());
        }else {
        	//若是第一次分配场站,直接添加
        	wareWarehouseYard.setCreateTime(new Date());
			wareWarehouseYard.setCreateUser(getCurrentUserId());
        }
        wareWarehouseYard.setWarehouse(input.getWarehouse());
		wareWarehouseYard.setIsDel(PlatformConstants.ISDEL_NO);
		for(String yard:Arrays.asList(input.getYards())) {
			wareWarehouseYard.setYard(yard);;
			wareWarehouseYardDao.insertSelective(wareWarehouseYard);
		}
	}

	/**
     * 根据公司key获得对应仓库信息
     * @param company
     * @return
     */
	@Override
	public List<WarehouseByCompanyOutput> getWarehouseListByCompany(EditWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseExample wareWarehouseExample = new WareWarehouseExample();
		// 不是总部权限时，取所有仓库
		if (StringUtils.isNotEmpty(input.getCompany())) {
			wareWarehouseExample.createCriteria().andCompanyEqualTo(input.getCompany()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		}else {
			wareWarehouseExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		}
		List<WareWarehouse> warehouses = wareWarehouseDao.selectByExample(wareWarehouseExample);
		//返回数据
		List<WarehouseByCompanyOutput> dataList = new ArrayList<>();
		for(WareWarehouse warehouse:warehouses) {
			WarehouseByCompanyOutput warehouseByCompanyOutput = new WarehouseByCompanyOutput();
			BeanUtils.copyProperties(warehouse, warehouseByCompanyOutput);
			warehouseByCompanyOutput.setKeyLangLang(warehouse.getKey());
			dataList.add(warehouseByCompanyOutput);
		}
		return dataList;
	}
	
	/**
     * 批量删除仓库信息
     * @param key
     * @return
     */
	@Transactional
	@Override
	public void deleteWarehouse(String[] keys) {
		// TODO Auto-generated method stub
		WareWarehouseExample example=new WareWarehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeyIn(Arrays.asList(keys));
		WareWarehouse warehouse = new WareWarehouse();
		warehouse.setIsDel(PlatformConstants.ISDEL_YES);
		wareWarehouseDao.updateByExampleSelective(warehouse, example);
		
		//删除仓库类型关系
		WareWarehouseTypeRelationExample typeRelationExample = new WareWarehouseTypeRelationExample();
		typeRelationExample.createCriteria().andWarehouseIn(Arrays.asList(keys));
		WareWarehouseTypeRelation typeRelation = new WareWarehouseTypeRelation();
		typeRelation.setIsDel(PlatformConstants.ISDEL_YES);
		wareWarehouseTypeRelationDao.updateByExampleSelective(typeRelation, typeRelationExample);
		
		//删除场站关系
		WareWarehouseYardExample yardExample = new WareWarehouseYardExample();
		yardExample.createCriteria().andWarehouseIn(Arrays.asList(keys));
		WareWarehouseYard yard = new WareWarehouseYard();
		yard.setIsDel(PlatformConstants.ISDEL_YES);
		wareWarehouseYardDao.updateByExampleSelective(yard, yardExample);
	}

	/**
     * 根据仓库key获取对应场站信息
     * @param input
     * @return
     */
	@Override
	public List<WarehouseYardOutput> getYardListByWarehouse(EditWarehouseInput input) {
		// TODO Auto-generated method stub
		WareWarehouseYardExample wareWarehouseYardExample = new WareWarehouseYardExample();
		wareWarehouseYardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWarehouseEqualTo(input.getKey());
		List<WareWarehouseYard> warehouseYards = wareWarehouseYardDao.selectByExample(wareWarehouseYardExample);
		
		//返回数据
		List<WarehouseYardOutput> dataList = new ArrayList<>();
		//调用生产接口，获得yard信息
		Result<List<YardOutput>> result = productionService.getYardListByCompanyKey(input.getCompany());
		
		if (result!=null&&result.getData()!=null) {
			List<YardOutput> yardList = result.getData();
			for(WareWarehouseYard wareWarehouseYard : warehouseYards) {
				WarehouseYardOutput warehouseYardOutput = new WarehouseYardOutput();
				//根据关系表中查出的场站的key去查相应的对象信息
				for(YardOutput yard : yardList){
					if(wareWarehouseYard.getYard().equals(yard.getKey())){
						warehouseYardOutput.setKey(yard.getKey());
						warehouseYardOutput.setKeyLangLang(yard.getKey());
						warehouseYardOutput.setYardName(yard.getYardName());
						warehouseYardOutput.setYardNameEn(yard.getYardNameEn());
						warehouseYardOutput.setWarehouse(yard.getDefaultWarehouse());
						warehouseYardOutput.setWarehouseLangLang(yard.getDefaultWarehouse());
					}
				}
				dataList.add(warehouseYardOutput);
			}
		}
		return dataList;
	}

	/**
     * 获取仓库信息
     * @param input
     * @return
     */
	@Override
	public List<WarehouseByCompanyOutput> getWarehouseList() {
		// TODO Auto-generated method stub
		WareWarehouseExample wareWarehouseExample = new WareWarehouseExample();
		wareWarehouseExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareWarehouse> warehouses = wareWarehouseDao.selectByExample(wareWarehouseExample);
		//返回数据
		List<WarehouseByCompanyOutput> dataList = new ArrayList<>();
		for(WareWarehouse warehouse:warehouses) {
			WarehouseByCompanyOutput warehouseByCompanyOutput = new WarehouseByCompanyOutput();
			BeanUtils.copyProperties(warehouse, warehouseByCompanyOutput);
			warehouseByCompanyOutput.setKeyLangLang(warehouse.getKey());
			warehouseByCompanyOutput.setCompany(warehouse.getCompany());
			warehouseByCompanyOutput.setCompanyLangLang(warehouse.getCompany());
			//去仓库类型表中查询对应关系
			WareWarehouseTypeRelationExample example = new WareWarehouseTypeRelationExample();
			example.createCriteria().andWarehouseEqualTo(warehouse.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<WareWarehouseTypeRelation> list = wareWarehouseTypeRelationDao.selectByExample(example);
			//根据对应关系去仓库类型表中查找对应数据
			List<WarehouseTypeOutput> warehouseTypes = new ArrayList<>();
			for(WareWarehouseTypeRelation warehouseTypeRelation : list){
				WarehouseTypeOutput output = new WarehouseTypeOutput();
				output.setKey(warehouseTypeRelation.getWarehouseType());
				output.setKeyLangLang(warehouseTypeRelation.getWarehouseType());
				warehouseTypes.add(output);
			}
			warehouseByCompanyOutput.setWarehouseTypes(warehouseTypes);
			dataList.add(warehouseByCompanyOutput);
		}
		return dataList;
	}
	
	/**
     * 根据场站key获得对应仓库信息及对应仓库类型信息
     * @param input
     * @return
     */
	@Override
	public WareTypeYardOutput getWarehouseByYard(AddWarehouseYardRelationInput input) {
		WareTypeYardOutput tOutput = new WareTypeYardOutput();
		//查询场站默认仓库
		if(StringUtils.isNotEmpty(input.getYard())){
			Result<YardOutput> result = productionService.queryByKey(input.getYard());
			if(result!=null&&result.getData()!=null){
				tOutput.setDefaultWarehouse(result.getData().getDefaultWarehouse());
				tOutput.setDefaultWarehouseLangLang(result.getData().getDefaultWarehouse());
			}
		}
		// 返回数据
		List<WarehouseByCompanyOutput> dataList = new ArrayList<>();
		
		// 从场站仓库关系表中查询数据
		WareWarehouseYardExample example = new WareWarehouseYardExample();
		example.createCriteria().andYardEqualTo(input.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareWarehouseYard> warehouseYards = wareWarehouseYardDao.selectByExample(example);
		// 返回数据的仓库列表
		for (WareWarehouseYard warehouseYard : warehouseYards) {
			WarehouseByCompanyOutput warehouseByCompanyOutput = new WarehouseByCompanyOutput();
			warehouseByCompanyOutput.setKey(warehouseYard.getWarehouse());
			warehouseByCompanyOutput.setKeyLangLang(warehouseYard.getWarehouse());
			
			// 去仓库类型关系表中查询对应关系
			WareWarehouseTypeRelationExample waRelationExample = new WareWarehouseTypeRelationExample();
			waRelationExample.createCriteria().andWarehouseEqualTo(warehouseYard.getWarehouse())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<WareWarehouseTypeRelation> list = wareWarehouseTypeRelationDao.selectByExample(waRelationExample);
			// 根据对应关系去仓库类型表中查找对应数据
			List<WarehouseTypeOutput> warehouseTypes = new ArrayList<>();
			for (WareWarehouseTypeRelation warehouseTypeRelation : list) {
				WarehouseTypeOutput output = new WarehouseTypeOutput();
				output.setKey(warehouseTypeRelation.getWarehouseType());
				output.setKeyLangLang(warehouseTypeRelation.getWarehouseType());
				// 只有满足同单据类型的仓库类型才返回
				// 获取调拨单对应的仓库类型
				if(StringUtils.isNotEmpty(input.getBillName())){
					WareBilltypeWarehousetypeExample btwte = new WareBilltypeWarehousetypeExample();
					String billTypeKey = billTypeService.getBillTypeKeyByName(input.getBillName());
					if (StringUtils.isEmpty(billTypeKey)) {
						return null;
					}
					btwte.createCriteria().andBillTypeEqualTo(billTypeKey).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<WareBilltypeWarehousetype> warehousetypeList = billtypeWarehousetypeDao.selectByExample(btwte);
					for (WareBilltypeWarehousetype warehousetype : warehousetypeList) {
						if (warehousetype.getWarehouseType().equals(warehouseTypeRelation.getWarehouseType())) {
							warehouseTypes.add(output);
						}
					}
				}else{
					warehouseTypes.add(output); 
				}
			}
			warehouseByCompanyOutput.setWarehouseTypes(warehouseTypes);
		    dataList.add(warehouseByCompanyOutput);
		}
		tOutput.setDataList(dataList);
		return tOutput;
	}

	/**
	 * 锁定指定公司的仓库
	 * 1.在仓库管理页面点击锁库，更新仓库状态
	 */
	@Override
	public void lockWarehouse(String company) {

		WareWarehouseExample example = new WareWarehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(company);
		WareWarehouse record = new WareWarehouse();
		record.setWarehouseStatus(CommonEnum.YES.getCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		wareWarehouseDao.updateByExampleSelective(record, example);
		
		
	}
	/**
	 * 更新锁库状态的锁库时间
	 * 2.上传费用池时，判断仓库状态如果是锁库，更新锁库时间
	 */
	@Override
	public void lockWarehouseBySBS(String company, Date lockTime) {

		WareWarehouseExample example = new WareWarehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(company);
		criteria.andWarehouseStatusEqualTo(CommonEnum.YES.getCode());
		criteria.andLockTimeIsNull();
		List<WareWarehouse>  warehouses = wareWarehouseDao.selectByExample(example);
		if(warehouses!=null&&warehouses.size()>0) {
			WareWarehouse record = new WareWarehouse();
			record.setLockTime(lockTime);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			wareWarehouseDao.updateByExampleSelective(record, example);
		}
		
		
	}

	/**
	 * 解锁指定公司下的仓库库存
	 */
	@Override
	@Transactional
	public void unLockWarehouse(String company) {
		// 更新仓库状态
		WareWarehouseExample example = new WareWarehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(company);
		WareWarehouse record = new WareWarehouse();
		record.setWarehouseStatus(CommonEnum.NO.getCode());
		record.setLockTime(null);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		wareWarehouseDao.updateByExampleSelective(record, example);

		
		// 更新费用池
		

		// 更新库存数
//		Map<String, Object> map = new HashMap<>();
//		map.put("company", company);		
//		wareStockExtDao.updateSurplusNum(map);

//		WareStockExample wsExample = new WareStockExample();
//		WareStockExample.Criteria wsCriteria = wsExample.createCriteria();
//		wsCriteria.andCompanyEqualTo(company);
//		List<WareStock> stocks = wareStockDao.selectByExample(wsExample);
//		for(WareStock ws : stocks) {
//			ws.setSurplusNum(ws.getActualSurplusNum());
//			wareStockDao.updateByPrimaryKeySelective(ws);
//		}
		
		
	}

	/**
	 * 取得分公司的锁库状态
	 */
	@Override
	public String getLockStatus(String company) {
		WareWarehouseExample example = new WareWarehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andCompanyEqualTo(company);
		List<WareWarehouse>  warehouses = wareWarehouseDao.selectByExample(example);
		if(warehouses!=null&&warehouses.size()>0) {
			WareWarehouse warehouse = warehouses.get(0);
			if(warehouse.getLockTime()!=null&&CommonEnum.YES.getCode().equals(warehouse.getWarehouseStatus())) {
				return CommonEnum.YES.getCode();
			}else {
				return CommonEnum.NO.getCode();
			}
		}
		return CommonEnum.NO.getCode();
	}

	/**
     * 查询场站列表  根据场站名称,公司key检索
     * @param input
     * @return
     */
	@Override
	public List<WarehouseYardOutput> getYardList(String company,String yardName) {
		// TODO Auto-generated method stub
		List<WarehouseYardOutput> dataList = new ArrayList<WarehouseYardOutput>();
		BaseSearchInput input = new BaseSearchInput();
		input.setCompanyKey(company);
		input.setName(yardName);
		Result<List<YardOutput>> result= productionService.yardList(input);
		if(result!=null&&result.getData()!=null) {
			List<YardOutput> yardList = result.getData();
			for(YardOutput yard : yardList) {
				WarehouseYardOutput output = new WarehouseYardOutput();
				output.setKey(yard.getKey());
				output.setKeyLangLang(yard.getKey());
				output.setWarehouse(yard.getDefaultWarehouse());
				output.setWarehouseLangLang(yard.getDefaultWarehouse());
				output.setYardName(yard.getYardName());
				output.setYardNameEn(yard.getYardNameEn());
				output.setProdYardId(yard.getProdYardId());
				//查询该场站下的仓库列表
				List<WarehouseOutput> warehouseList = new ArrayList<WarehouseOutput>();
				WareWarehouseYardExample example = new WareWarehouseYardExample();
				example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andYardEqualTo(yard.getKey());
				List<WareWarehouseYard> yList = wareWarehouseYardDao.selectByExample(example);
				if(yList.size()>0) {
					for(WareWarehouseYard wYard : yList) {
						EditWarehouseInput warehouseInput = new EditWarehouseInput();
						warehouseInput.setKey(wYard.getWarehouse());
						WareWarehouse warehouse =getWarehouseDetail(warehouseInput);
						if(warehouse!=null) {
							WarehouseOutput wOutput = new WarehouseOutput();
							BeanUtils.copyProperties(warehouse, wOutput);
							wOutput.setKeyLangLang(warehouse.getKey());
							warehouseList.add(wOutput);
						}
					}
				}
				output.setWarehouseList(warehouseList);
				dataList.add(output);
			}
		}
		return dataList;
	}

	/**
     * 设置默认仓库
     * @param yard 场站key
     * @param defaultWarehouse 仓库key
     */
	@Transactional
	@Override
	public void setDefaultWarehouse(Integer yard, String defaultWarehouse) {
		// TODO Auto-generated method stub
		YardInput input = new YardInput();
		input.setProdYardId(yard);
		input.setDefaultWarehouse(defaultWarehouse);
		productionService.update(input);
		
	}

}
