package com.sanlly.purchase.service.fallback;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.feign.SparePartsCategoriesDetailsOutput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.output.feign.SparePartsCategoriesOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.service.feign.WareFeignClient;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
* Description: 仓储feign调用
* @ClassName: WareFallback
* @date 2019年8月6日
*
* @author jlx
 */
@Component
public class WareFallback implements WareFeignClient {

	@Override
	public Result<SparePartsOutput> getSparePart(String sparePartsKey) {
		// TODO Auto-generated method stub
		return new Result<>();
	}

	@Override
	public Result<List<SparePartsOutput>> getSparePartes(String[] sparePartsKeys) {
		return null;
	}

	@Override
	public Result<WareWarehouse> getWarehouseDetail(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<String> getBillNumber(String billTypeName, String company) {
		return null;
	}

	@Override
	public Result<List<SparePartsCategoriesDetailsOutput>> getCategoriesDetailsByCategoriesKey(String categoriesKey) {
		return null;
	}

	@Override
	public Result<List<SparePartsCategoriesOutput>> getSparePartCategoryWithDetails() {
		return null;
	}

	@Override
	public Result sparePartsCategoriesDetailsList(Integer sparepartsCategoriesDetailsId, String key, String sparePartsCategories, String sparepartsCategoriesDetailsName) {
		return null;
	}

	@Override
	public Result<List<SparePartsCategoriesOutput>> getsparePartsCategoriesList() {
		return null;
	}

	@Override
	public Result<BigDecimal> getLastEntryPrice(String spareParts, String warehouse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<PagedList<StockinOutput>> stockinPageList(String stockinNo, String entryStatus, Date startDate, Date endDate, String supplierId,
			String billType, String invoiceType, String auditStatus, String no, String sparePartsName,
			String sparePartsNo, String escrowCompany, Boolean ofReturn, Integer index, Integer size) {
		// TODO Auto-generated method stub
		return null;
	}



//	@Override
//	public Result getBillNumber(String billTypeName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
 
 

}
