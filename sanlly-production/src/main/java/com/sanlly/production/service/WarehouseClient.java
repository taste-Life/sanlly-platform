package com.sanlly.production.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.stock.WareOutput;
import com.sanlly.production.config.FeignClientConfig;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.models.output.rate.SparePartsOutput;
import com.sanlly.production.service.fallback.WarehouseFallback;

@FeignClient(name = "warehouse", configuration = FeignClientConfig.class, fallback = WarehouseFallback.class)
public interface WarehouseClient {
	@GetMapping("/test")
	String testGetDataFromWarehouse(@RequestParam(value = "name") String name);

	@GetMapping("/spare/testing")
	Result<List<SpareTestingOutput>> getTestingSpareList(@RequestParam(value = "companyKey") String companyKey,
			@RequestParam(value = "unitTypeKey") String unitTypeKey,
			@RequestParam(value = "partsDetailCode") String[] partsDetailCode,
			@RequestParam(value = "repairCode") String repairCode);

	/**
	 * 获取主件下拉
	 * 
	 * @Description: TODO
	 * @return Result<List<SelectItemOutput>> @throws 
	 */
	@GetMapping("/masterDevice/getList")
	Result<List<SelectItemOutput>> getDeviceList();

	/**
	 * 获取备件信息
	 * 
	 * @Description: TODO
	 * @param masterDeviceKey
	 * @return Result<MasterDeviceOutput> @throws 
	 */
	@GetMapping("/getSparesByDevice")
	Result<String> query(@RequestParam("masterDevice") String masterDevice);

	/**
	 * 根据多个备件号获取库存
	 * 
	 * @return
	 */
	@GetMapping("/stock/getStockBySparePartsNos")
	public Result<List<StockOutput>> getStockBySparePartsNos(
			@RequestParam(value = "sparePartsNos") List<String> sparePartsNos);

	/**
	 * 机组进场检验获取库存
	 * 
	 * @return
	 */
	@GetMapping("/stock/jzjcjy")
	public Result<WareOutput> getStockJZJCJY(@RequestParam(value = "sparesNum") String sparesNum,
			@RequestParam(value = "billType") String billType,
			@RequestParam(value = "yard") String yard,
			@RequestParam(value = "containerUser") String containerUser);

	/**
	 * 根据主件号查询备件号列表
	 * 
	 * @param masterDeviceNo
	 * @return
	 */
	@GetMapping("/getSpListByMdNo")
	public Result<List<String>> getSPListByMDNo(@RequestParam(value = "masterDeviceNo") String masterDeviceNo);

	/**
	 * 根据单据类型key生成单号
	 *
	 * @param billTypeKey
	 * @return
	 */
	@GetMapping("/billTypes/getBillNumberBykey/company")
	public Result<String> getBillNumberBykey(@RequestParam(value = "billTypekey") String billTypekey,
			@RequestParam(value = "company") String company);

	/**
	 * 获取出库成本
	 * 
	 * @Description: TODO
	 * @param referralNo
	 * @param containerNo
	 * @return Result<BigDecimal> @throws 
	 */
	@GetMapping("/stockout/getTotalAmount")
	public Result<BigDecimal> getTotalAmount(@RequestParam(value = "referralNo") String referralNo,
			@RequestParam(value = "containerNo") String containerNo);

	/**
	 * 根据备件号获取备件信息
	 * 
	 * @Description: TODO
	 * @param sparePartsNo
	 * @return Result<SparePartsOutput> @throws 
	 */
	@GetMapping("/sparePartsByNo/{sparePartsNo}")
	public Result<SparePartsOutput> getSparePartByNo(@PathVariable(value = "sparePartsNo") String sparePartsNo);

}
