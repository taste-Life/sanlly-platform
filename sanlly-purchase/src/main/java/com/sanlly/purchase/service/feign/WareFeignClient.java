package com.sanlly.purchase.service.feign;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.config.FeignClientConfig;
import com.sanlly.purchase.models.input.feign.SparePartsCategoriesDetailsOutput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.output.feign.SparePartsCategoriesOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.service.fallback.WareFallback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * 
* Description: 仓储feign调用
* @ClassName: WareFeignClient
* @date 2019年8月6日
*
* @author jlx
 */
@FeignClient(name = "warehouse",configuration=FeignClientConfig.class,fallback=WareFallback.class)
public interface WareFeignClient {
    
	/**
	 * 根据备件号取得备件信息
	 * @param sparePartsKey
	 * @return
	 */
    @GetMapping("/spareParts/{sparePartsKey}")
    Result<SparePartsOutput> getSparePart(@PathVariable(value = "sparePartsKey") String sparePartsKey);

    @GetMapping("/sparePartses")
    Result<List<SparePartsOutput>> getSparePartes(@RequestParam(value = "sparePartsKeys", required = true) String[] sparePartsKeys);
    /**
     * 
    * @Description: 根据仓库key取得仓库信息 
    * @param key
    * @return Result
    * @throws 
     */
    @GetMapping("/warehouses/{key}")
    Result<WareWarehouse> getWarehouseDetail(@PathVariable(value = "key") String key);
    /**
     * 
    * @Description: 订单编号、送货单号的取得 
    * @param billTypeName
    * @return Result
    * @throws 
     */
	@GetMapping("/billTypes/getBillNumber/company")
	Result<String> getBillNumber(@RequestParam(value = "billTypeName", required = true) String billTypeName,@RequestParam(value = "company") String company);
	/**
	 * 根据备件大类Key查询备件明细类别列表
	 * @return
	 */
	@GetMapping("/getCategoriesDetailsByCategoriesKey")
	Result<List<SparePartsCategoriesDetailsOutput>> getCategoriesDetailsByCategoriesKey(@RequestParam(value = "categoriesKey", required = false) String  categoriesKey);
	/**
	 * 获取备件大类及明细类别
	 *
	 *@author lishzh
	 *@return
	 */
	@GetMapping("/sparePartsCategories/details")
	public Result<List<SparePartsCategoriesOutput>> getSparePartCategoryWithDetails();
	/**
	 * 获取备件明细列表
	 * @return
	 */
	@GetMapping("/sparePartsCategoriesDetails")
	public Result<List<SparePartsCategoriesDetailsOutput>> sparePartsCategoriesDetailsList(@RequestParam(value = "sparepartsCategoriesDetailsId",required = false) Integer sparepartsCategoriesDetailsId ,@RequestParam(value = "key",required = false) String key ,@RequestParam(value = "sparePartsCategories" , required = false) String sparePartsCategories ,@RequestParam(value = "sparepartsCategoriesDetailsName",required = false) String sparepartsCategoriesDetailsName );

	/**
	 * 获取备件大类列表
	 * @return
	 */
	@GetMapping("/sparePartsCategories")
	public Result<List<SparePartsCategoriesOutput>> getsparePartsCategoriesList();
	/**
	 * 
	* @Description: 上次入库价格 
	* @param spareParts
	* @param warehouse
	* @return Result<BigDecimal>
	* @throws 
	 */
	@GetMapping("/stock/lastEntryPrice")
	public Result<BigDecimal> getLastEntryPrice(@RequestParam(value = "spareParts", required = true)  String spareParts, 
			@RequestParam(value = "warehouse") String warehouse);

    @GetMapping("/stockin")
    public Result<PagedList<StockinOutput>> stockinPageList(
            @RequestParam(value = "stockinNo", required = false) String stockinNo,
            @RequestParam(value = "entryStatus", required = false) String entryStatus,
            @RequestParam(value = "startDate", required = false) Date startDate,
            @RequestParam(value = "endDate", required = false) Date endDate ,
            @RequestParam(value = "supplierId", required = false) String supplierId ,
            @RequestParam(value = "billType", required = false) String billType ,
            @RequestParam(value = "invoiceType", required = false) String invoiceType ,
            @RequestParam(value = "auditStatus", required = false) String auditStatus ,
            @RequestParam(value = "no", required = false) String no ,
            @RequestParam(value = "sparePartsName", required = false) String sparePartsName ,
            @RequestParam(value = "sparePartsNo", required = false) String sparePartsNo,
            @RequestParam(value = "escrowCompany", required = false) String escrowCompany,
            @RequestParam(value = "ofReturn", required = false) Boolean ofReturn,
            @RequestParam(value = "index", required = false) Integer index,
            @RequestParam(value = "size", required = false) Integer size);
}
