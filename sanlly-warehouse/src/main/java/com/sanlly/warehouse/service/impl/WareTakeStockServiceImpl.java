package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.dao.WareTakeStockExtMapper;
import com.sanlly.warehouse.entity.WareTakeStock;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.input.takestock.SearchTakeStockInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.takestock.TakeStockOutput;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareTakeStockService;

/**
 * 
* @Package com.sanlly.warehouse.service.impl 
* @Description: 库存盘点 
* @author jlx   
* @date 2019年10月10日 下午4:56:52 
* @version V1.0   
 */
@Service
public class WareTakeStockServiceImpl extends BaseServiceImpl implements WareTakeStockService {

	@Autowired
	private WareTakeStockExtMapper wareTakeStockExtDao;
	@Autowired
	private WareSparePartsService wareSparePartsService;
	/**
	 * 库存盘点分页列表
	 */
	@Override
	public PagedList<TakeStockOutput> getWareTakeStockPagedList(SearchTakeStockInput input) {

		// 添加检索条件
		PagedList<TakeStockOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize());
		Map<String, Object> map = new HashMap<>();
		if(!StringUtils.isEmpty(input.getCreateTime())) {
			map.put("createTime", DateUtil.string2Date(input.getCreateTime()));
		}
		map.put("warehouseType", input.getWarehouseType());
		map.put("sparePartsNo", input.getSparePartsNo());
		map.put("sparePartsName", input.getSparePartsName());
		map.put("storageLocation", input.getStorageLocation());
		map.put("company", input.getCompany());
		map.put("warehouse", input.getWarehouse());
		map.put("sparePartsCategories", input.getSparePartsCategories());
		// 抽盘备件数
		List<String> sparePartses = new ArrayList<String>();
		if(input.getSparePartsNum()!=null&&input.getSparePartsNum()>0) {
			List<SparePartsBriefOutput> sparePartsList = wareSparePartsService.sparePartsBriefList(new SearchSparePartsInput());
			for(int i=0;i<input.getSparePartsNum();i++) {
				sparePartses.add(sparePartsList.get(new Random().nextInt(sparePartsList.size())).getKey());
			}
		}
		map.put("sparePartses",sparePartses);
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());
		// 总条数
		// 获取分页数据和总条数
		List<WareTakeStock> takeStocks = wareTakeStockExtDao.selectByCondition(map);
		int total = wareTakeStockExtDao.getTotal();
		List<TakeStockOutput> takeStockOutputs = new ArrayList<TakeStockOutput>();

		// 数据组装
		for (WareTakeStock wts : takeStocks) {
			TakeStockOutput tso = new TakeStockOutput();
			BeanUtils.copyProperties(wts, tso);
			tso.setCompanyLangLang(wts.getCompany());
			tso.setEscrowCompanyLangLang(wts.getEscrowCompany());
			tso.setSparePartsCategoriesLangLang(wts.getSparePartsCategories());
			tso.setSparePartsUnitLangLang(wts.getSparePartsUnit());
			tso.setWarehouseLangLang(wts.getWarehouse());
			tso.setWarehouseTypeLangLang(wts.getWarehouseType());
			tso.setSparePartsLangLang(wts.getSpareParts());
			if(wts.getUnitPrice()!=null) {
				tso.setTotal(wts.getUnitPrice().multiply(new BigDecimal(wts.getSurplusNum())));
			}
			takeStockOutputs.add(tso);
		}
		// 将分页数据放入结果中
		page.setTotalItemCount(total);
		page.setDataList(takeStockOutputs);
		return page;
	}

}
