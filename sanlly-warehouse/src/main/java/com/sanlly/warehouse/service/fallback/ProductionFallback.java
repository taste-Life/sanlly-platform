package com.sanlly.warehouse.service.fallback;

import java.util.List;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.fixIn.PickingListSearchInput;
import com.sanlly.common.models.input.referral.WorkGroupOutput;
import com.sanlly.common.models.output.fixOut.PickingListBatchOutInput;
import com.sanlly.common.models.output.fixOut.PickingListOutInput;
import org.springframework.stereotype.Component;

import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.common.models.output.base.RefrigeratorCompanyOutput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.warehouse.models.input.warehouse.YardInput;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;

/**
 * 请求生产客户端失败回调
 * 
 * @author lishzh
 *
 */
@Component
public class ProductionFallback implements ProductionFeignClient {

	@Override
	public Result<String> getKey(String tableName) {
		return null;
	}


	@Override
	public Result<List<YardOutput>> getYardListByCompanyKey(String companyKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(YardInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Object> lang(LangInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result pickingList(PickingListSearchInput input) {
		return null;
	}

	@Override
	public Result pickingListBatchOut(PickingListBatchOutInput input) {
		return null;
	}

	@Override
	public Result pickingListDetail(String referralNo) {
		return null;
	}

	@Override
	public Result pickingListOut(PickingListOutInput input) {
		return null;
	}

	@Override
	public Result pickingListBack(PickingListOutInput input) {
		return null;
	}

	@Override
	public Result<WorkGroupOutput> getWorkGroupByUser(String yard, Integer user) {
		return null;
	}

	@Override
	public Result<String> getPositionCode(String key) {
		return null;
	}

	@Override
	public Result<List<String>> getUnitToWare(String code) {
		return null;
	}

	@Override
	public Result<CompanyOutput> query(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<YardOutput> queryByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<CompanyOutput>> list(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result<List<ProdDeptOutput>> prodDeptList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result<List<DeptOutput>> deptList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result<String> getCompanyCode(String key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result<List<YardOutput>> yardList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result<List<RefrigeratorCompanyOutput>> getAllRefrigeratorCompany() {
		// TODO Auto-generated method stub
		return null;
	}

}
