package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.bouncycastle.crypto.RuntimeCryptoException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareSafeStockMapper;
import com.sanlly.warehouse.entity.WareSafeStock;
import com.sanlly.warehouse.entity.WareSafeStockExample;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareWarehouseExample;
import com.sanlly.warehouse.entity.WareWarehouseExample.Criteria;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddImportWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.DeleteWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.EditWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchWareSafeStockInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.output.safestock.SafeStockOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseByCompanyOutput;
import com.sanlly.warehouse.service.SafeStockService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WarehouseService;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;

/**
 * 
* Description: 安全库存设置
* @ClassName: SafeStockServiceImpl
* @date 2019年7月25日
*
* @author jlx
 */
@Service
public class SafeStockServiceImpl extends BaseServiceImpl implements SafeStockService {

	@Autowired
	private WareSafeStockMapper wareSafeStockDao;
	
	@Autowired
	private WarehouseService warehouseService;
	
	@Autowired
	private WareSparePartsService wareSparePartsService;
	@Autowired
	private ProductionFeignClient productionFeignClient;

	/**
	 * 安全库存设置列表
	 */
	@Override
	public PagedList<SafeStockOutput> getPageListSafeStock(SearchWareSafeStockInput input) {

		WareSafeStockExample example = new WareSafeStockExample();
		WareSafeStockExample.Criteria criteria = example.createCriteria();
		// 查询条件
		if(StringUtils.isNotEmpty(input.getSpareParts())) {
			criteria.andSparePartsEqualTo(input.getSpareParts());
		}
		if(StringUtils.isNotEmpty(input.getWareWarehouse())) {
			criteria.andWarehouseEqualTo(input.getWareWarehouse());
		}else {
			// 如果没有选择仓库则取得登录人所在公司的所有仓库 
			EditWarehouseInput whInput = new EditWarehouseInput();
			// 登录人所在公司key
			whInput.setCompany(getCurrentCompanyKey());
			List<WarehouseByCompanyOutput> wbcoList = warehouseService.getWarehouseListByCompany(whInput);
			List<String> values = new ArrayList<String>();
			for (WarehouseByCompanyOutput wbco : wbcoList) {
				values.add(wbco.getKey());
			}
			if(values.size()>0) {
				criteria.andWarehouseIn(values);
			}
		}
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");
		
		// 总条数
		Integer totalItemCount = (int) wareSafeStockDao.countByExample(example);
		//分页查询
		PagedList<SafeStockOutput> pagedList = new PagedList<SafeStockOutput>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<WareSafeStock> wareSafeStockList = wareSafeStockDao.selectByExample(example);

        //组装返回值
        List<SafeStockOutput> outputs = new ArrayList<>();
        for(WareSafeStock safeStock : wareSafeStockList) {
        	EditSparePartsInput  sparePartsInput = new EditSparePartsInput();
        	SafeStockOutput safeStockOutput = new SafeStockOutput();
        	sparePartsInput.setKey(safeStock.getSpareParts());
        	SparePartsBriefOutput sparePartsBriefOutput = wareSparePartsService.getSparePartsBrief(sparePartsInput);
        	
        	BeanUtils.copyProperties(safeStock,safeStockOutput);
        	safeStockOutput.setSparePartsNo(sparePartsBriefOutput.getSparePartsNo());
        	safeStockOutput.setSparePartsLangLang(safeStock.getSpareParts());
        	safeStockOutput.setSparePartsCategoriesLangLang(sparePartsBriefOutput.getSparePartsCategories());
        	safeStockOutput.setSparePartsCategoriesDetailsLangLang(sparePartsBriefOutput.getSparePartsCategoriesDetails());
        	safeStockOutput.setWarehouseLangLang(safeStock.getWarehouse());
        	outputs.add(safeStockOutput);
        }
        
		
		//将分页数据放入结果中
		pagedList.getDataList().addAll(outputs);
		return pagedList;
	}

	/**
	 * 删除安全库存
	 */
	@Override
	public void deleteSafeStock(Integer[] wareSafeStockIds) {	

		WareSafeStockExample example = new WareSafeStockExample();
		WareSafeStockExample.Criteria criteria = example.createCriteria();
		criteria.andWareSafeStockIdIn(Arrays.asList(wareSafeStockIds));
		WareSafeStock wareSafeStock = new WareSafeStock();
		wareSafeStock.setIsDel(PlatformConstants.ISDEL_YES);
		wareSafeStock.setUpdateTime(new Date());
		wareSafeStock.setUpdateUser(getCurrentUserId());
		
		wareSafeStockDao.updateByExampleSelective(wareSafeStock, example);
		
	}

	/**
	 * 编辑安全库存
	 */
	@Override
	public void editSafeStock(EditWareSafeStockInput input) {
		
		WareSafeStock wss=wareSafeStockDao.selectByPrimaryKey(input.getWareSafeStockId());
		wss.setSpareParts(input.getSpareParts());
		wss.setWarehouse(input.getWarehouse());
		wss.setSafeStockNum(input.getSafeStockNum());
		wss.setStockUpperNum(input.getStockUpperNum());		
		wss.setUpdateTime(new Date());
		wss.setUpdateUser(getCurrentUserId());
		wareSafeStockDao.updateByPrimaryKey(wss);
		
	}

	/**
	 * 添加安全库存
	 */
	@Override
	public void addSafeStock(AddWareSafeStockInput input) {
		
		// 确认备件是否已设置安全库存
		WareSafeStockExample example = new WareSafeStockExample();
		WareSafeStockExample.Criteria criteria = example.createCriteria();
		// 查询条件
		if(StringUtils.isNotEmpty(input.getSpareParts())) {
			criteria.andSparePartsEqualTo(input.getSpareParts());
		}
		if(StringUtils.isNotEmpty(input.getWarehouse())) {
			criteria.andWarehouseEqualTo(input.getWarehouse());
		}
		criteria.andIsDelEqualTo(0);
		// 总条数
		Integer totalItemCount = (int) wareSafeStockDao.countByExample(example);
		// 安全库存存在
		if(totalItemCount>0) {
			throw new RuntimeException("safeStockExistedError");
		}
		
		
		WareSafeStock wss = new WareSafeStock();
		BeanUtils.copyProperties(input, wss);
		wss.setCreateTime(new Date());
		wss.setCreateUser(getCurrentUserId());
		wss.setIsDel(PlatformConstants.ISDEL_NO);
		wareSafeStockDao.insertSelective(wss);
//		return true;
	}

	@Override
	public void importSafeStock(List<AddImportWareSafeStockInput> inputs) {

		// 确认备件是否已设置安全库存
		WareSafeStockExample example = new WareSafeStockExample();
		WareSafeStockExample.Criteria criteria = example.createCriteria();
		
		EditWarehouseInput warehouseInput = new EditWarehouseInput();
		warehouseInput.setCompany(getCurrentCompanyKey());
		List<WarehouseByCompanyOutput> warehousees = warehouseService.getWarehouseListByCompany(warehouseInput);
		if(warehousees==null||warehousees.size()==0) {
			throw new RuntimeException("companyUnexist");
		}
		Map<String, WarehouseByCompanyOutput> warehouseesMap = warehousees.stream().collect(Collectors.toMap(WarehouseByCompanyOutput::getWarehouseName, a -> a,(k1,k2)->k1));
		
		for(AddImportWareSafeStockInput input : inputs) {
			example.clear();
			criteria = example.createCriteria();
			WareSafeStock wss = new WareSafeStock();
			// 取得仓库key
			WarehouseByCompanyOutput output = warehouseesMap.get(input.getWarehouseName()); 
			if(output!=null) {
				criteria.andWarehouseEqualTo(output.getKey());
				wss.setWarehouse(output.getKey());
			}else {
				
			}	
			
			// 取得备件key
			SparePartsOutput sparePartsOutput = wareSparePartsService.getSparePartByNo(input.getSparePartsNo());
			if(sparePartsOutput!=null) {
				criteria.andSparePartsEqualTo(sparePartsOutput.getKey());
				wss.setSpareParts(sparePartsOutput.getKey());
			}else {
				
			}
			// 安全库存未设置进行添加
			criteria.andIsDelEqualTo(0);
			// 总条数
			List<WareSafeStock> WareSafeStocks = wareSafeStockDao.selectByExample(example);
			if(WareSafeStocks.size()>0) {
				// 安全库存已经设置进行更新
				wss.setSafeStockNum(input.getSafeStockNum());
				wss.setStockUpperNum(input.getStockUpperNum());
				wss.setUpdateTime(new Date());
				wss.setUpdateUser(getCurrentUserId());
				wss.setWareSafeStockId(WareSafeStocks.get(0).getWareSafeStockId());
				wareSafeStockDao.updateByPrimaryKeySelective(wss);
			}else {
				// 安全库存存在
				wss.setCreateTime(new Date());
				wss.setCreateUser(getCurrentUserId());
				wss.setIsDel(PlatformConstants.ISDEL_NO);
				wss.setSafeStockNum(input.getSafeStockNum());
				wss.setStockUpperNum(input.getStockUpperNum());
				wareSafeStockDao.insertSelective(wss);
				
			}
			
		}
		
	}

}
