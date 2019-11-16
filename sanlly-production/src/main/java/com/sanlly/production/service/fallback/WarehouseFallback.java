package com.sanlly.production.service.fallback;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.stock.WareOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.models.output.rate.SparePartsOutput;
import com.sanlly.production.service.WarehouseClient;

@Component
public class WarehouseFallback implements WarehouseClient {

	@Override
	public String testGetDataFromWarehouse(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<SpareTestingOutput>> getTestingSpareList(String companyKey, String unitTypeKey,
			String[] partsDetailCode, String repairCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<SelectItemOutput>> getDeviceList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<String> query(String masterDeviceKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<StockOutput>> getStockBySparePartsNos(List<String> sparePartsNos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<String>> getSPListByMDNo(String masterDeviceNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<String> getBillNumberBykey(String billTypekey, String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<BigDecimal> getTotalAmount(String referralNo, String containerNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<SparePartsOutput> getSparePartByNo(String sparePartsNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<WareOutput> getStockJZJCJY(String sparesNum, String billType, String yard, String containerUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
