package com.sanlly.warehouse.service.feign;

import java.util.List;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.fixIn.PickingListSearchInput;
import com.sanlly.common.models.input.referral.WorkGroupOutput;
import com.sanlly.common.models.output.fixOut.*;
import com.sanlly.common.models.output.pagination.PagedList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.common.models.output.base.RefrigeratorCompanyOutput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.warehouse.config.FeignClientConfig;
import com.sanlly.warehouse.models.input.warehouse.YardInput;
import com.sanlly.warehouse.models.output.warehouse.WareTypeYardOutput;
import com.sanlly.warehouse.service.fallback.ProductionFallback;

/**
 * 请求生产服务客户端
 * 
 * @author lishzh
 *
 */
@Api(tags = "生产")
@FeignClient(name = "production", configuration = FeignClientConfig.class, fallback = ProductionFallback.class)
public interface ProductionFeignClient {

	/**
	 * 获取key
	 * 
	 * @return
	 */
	@GetMapping("/langs/{tableName}/key")
	Result<String> getKey(@PathVariable("tableName") String tableName);

	/**
	 * 用箱人下拉列表获取
	 * 
	 * @return
	 */
	@PostMapping("/langs/object")
	public Result<Object> lang(@RequestBody LangInput input);

	/**
	 * 获取公司信息
	 * 
	 * @return
	 */
	@PostMapping("/company/searchList")
	public Result<List<CompanyOutput>> list(@RequestBody BaseSearchInput input);

	/**
	 * 根据id获取公司信息
	 * 
	 * @return
	 */
	@GetMapping("/company/query/{id}")
	public Result<CompanyOutput> query(@PathVariable("id") Integer id);

	/**
	 * 根据公司key获取场站
	 * 
	 * @return
	 */
	@GetMapping("/prodYard/{companyKey}")
	public Result<List<YardOutput>> getYardListByCompanyKey(@PathVariable("companyKey") String companyKey);

	/**
	 * 根据场站key获取场站信息
	 * 
	 * @return
	 */
	@GetMapping("/yard/querykey/{key}")
	public Result<YardOutput> queryByKey(@PathVariable(value = "key") String key);

	/**
	 * 修改场站信息
	 * 
	 * @return
	 */
	@PutMapping("/yard/update")
	public Result update(@RequestBody YardInput input);

	/**
	 * 获得部门
	 * 
	 * @return
	 */
	@PostMapping("/dept/prodDeptList")
	public Result<List<ProdDeptOutput>> prodDeptList(@RequestBody BaseSearchInput input);
	
	/**
	 * 获得部门
	 * 
	 * @return
	 */
	@PostMapping("/dept/list")
	public Result<List<DeptOutput>> deptList(@RequestBody BaseSearchInput input);

    /**
     *  
     *
     * @Description: TODO 领料单出库列表
     * @param input
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/fixs/pickinglist")
    public Result<PagedList<PickingListOutput>> pickingList(@RequestBody PickingListSearchInput input);

    /**
     *  
     *
     * @Description: TODO 领料单批量出库
     * @param input
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/fixs/pickinglist/out")
    public Result pickingListBatchOut(@RequestBody PickingListBatchOutInput input);

    /**
     *  
     *
     * @Description: TODO 出库领料单
     * @param input
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/fixs/pickinglist/detail")
    public Result<PickingListDetailOutput> pickingListDetail(@RequestParam(value = "referralNo") String referralNo);

    /**
     *  
     *
     * @Description: TODO 领料单出库
     * @param input
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/fixs/pickinglist/detail/out")
    public Result pickingListOut(@RequestBody PickingListOutInput input);

    /**
     *  
     *
     * @Description: TODO 领料单退库
     * @param input
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/fixs/pickinglist/detail/back")
    Result pickingListBack(@RequestBody PickingListOutInput input);

    @GetMapping("/fix/workGroup")
    Result<WorkGroupOutput> getWorkGroupByUser(@RequestParam(value = "yard") String yard, @RequestParam(value = "user") Integer user);

	/**
	 * 根据key查询公司位置代码
	 * @param key
	 * @return
	 */
	@GetMapping("/company/getPositionCode")
	Result<String> getPositionCode(@RequestParam(value = "key") String key);
	/**
	 * 根据key查询公司代码
	 * @param key
	 * @return
	 */
	@GetMapping("/company/getCompanyCode")
	Result<String> getCompanyCode(@RequestParam(value = "key") String key);

	/**
	 * 适用机型
	 * @param code
	 * @return
	 */
	@GetMapping("/unit/getUnitToWare")
	Result<List<String>> getUnitToWare(@RequestParam(value = "code") String code);
	
	/**
     * 查询列表  根据场站名称,公司key检索
     *
     * @return
     * 
     */
    @PostMapping("/yard/searchList")
    Result<List<YardOutput>> yardList(@RequestBody BaseSearchInput input);
    
    /**
	 * 查询所有冷机公司
	 * 
	 * @return
	 */

	@GetMapping("/refrigerators")
    Result<List<RefrigeratorCompanyOutput>> getAllRefrigeratorCompany();
        
}
