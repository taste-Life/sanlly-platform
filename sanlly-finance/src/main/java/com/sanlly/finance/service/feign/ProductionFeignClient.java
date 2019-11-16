package com.sanlly.finance.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.finance.service.fallback.ProductionFallback;

/**
 * 生产 Feign 调用入口
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
*
 */
@FeignClient(name = "production", fallback = ProductionFallback.class)
public interface ProductionFeignClient {

	/**
	 * 获取key  根据表名
	 * 
	 * @return
	 */
	@GetMapping("/langs/{tableName}/key")
	Result<String> getKey(@PathVariable("tableName") String tableName);
	
	/**
	 * 国际化 key
	 * @return
	 */
	@PostMapping("/langs/object")
	public Result<Object> lang(@RequestBody LangInput input);
	
	/**
	 * 
	 * 查询场站 主键id
	 * @param id
	 * @return 
	 */
	@GetMapping("/yard/query/{id}")
	public Result<YardOutput> getYard(Integer id);
	
	/**
	 * 
	 * 根据key查询
	 * @param key
	 * @return 
	 * @author zhh
	 */
	@GetMapping("/yard/querykey/{key}")
	public Result<YardOutput> queryByKey(@PathVariable(value = "key")String key);
	
	/**
	 * 查询列表  根据场站名称检索
	 * @return
	 * @author fjy
	 */
	@PostMapping("/yard/searchList")
	public Result<List<YardOutput>> yardList(@RequestBody BaseSearchInput input);
	
	
	/**
	 * 查询公司列表
	 * @return
	 * @author fjy
	 */
	@PostMapping("/company/searchList")
	public Result<List<CompanyOutput>> companyList(@RequestBody BaseSearchInput input);
	/**
	 * 
	* @Description: 根据主键查询
	* @param id
	* @return Result
	* @throws 
	 */
	@GetMapping("/company/query/{id}")
	public Result<CompanyOutput> getCompanyById(@PathVariable("id") Integer id);
	
	/**
	 * 查询列表  部门
	 * @return
	 */
	@GetMapping("/dept/list")
	public Result<List<DeptOutput>> deptList();
	
	
	/**
	 * 查询列表 生产部门集合
	 * @return
	 */
	@PostMapping("/dept/prodDeptList")
	public Result<List<ProdDeptOutput>> prodDeptList(@RequestBody BaseSearchInput input);
	
	

	/**
	 * 
	 * 根据key查询
	 * @param key
	 * @return 
	 * @author fjy
	 */
	@GetMapping("/containerUser/getContainerUserByKey/{key}")
	public Result<ContainerUserOutput> getContainerUserByKey(@PathVariable("key") String key);
	
	/**
	 * 
	 * 根据进场id查询是否外包
	 * @param key
	 * @return 
	 * @author fjy
	 */
	@GetMapping("/containers/entry/isWb/")
	Boolean isWb(@RequestParam("prodCourseId") String prodCourseId,@RequestParam("containerCategory") String containerCategory);
	
	/**
	 * 
	 * 获取外包商key
	 * @param key
	 * @return 
	 * @author fjy
	 */
	@GetMapping("/containers/entry/getWbInfo/")
	String getWbInfo(@RequestParam("prodCourseId") String prodCourseId,@RequestParam("containerCategory") String containerCategory);


}
