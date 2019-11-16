package com.sanlly.finance.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 生产 Feign 错误回调
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月9日  
 */
@Component
public class ProductionFallback implements ProductionFeignClient {

	@Override
	public Result<String> getKey(String tableName) {
		return null;
	}

	@Override
	public Result<Object> lang(LangInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<YardOutput> getYard(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<YardOutput>> yardList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<CompanyOutput>> companyList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<CompanyOutput> getCompanyById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<DeptOutput>> deptList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<ContainerUserOutput> getContainerUserByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isWb(String prodCourseId,String containerCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<List<ProdDeptOutput>> prodDeptList(BaseSearchInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<YardOutput> queryByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWbInfo(String prodCourseId, String containerCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
