package com.sanlly.warehouse.service;

import java.util.Date;
import java.util.List;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WareWarehouse;
import com.sanlly.warehouse.models.input.warehouse.AddWareWarehouseTypeRelationInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.SearchWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseYardRelationInput;
import com.sanlly.warehouse.models.output.warehouse.ProdCompanyOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseByCompanyOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseTypeOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseYardOutput;
import com.sanlly.warehouse.models.output.warehouse.WareTypeYardOutput;

/**
 * ClassName: WarehouseService
 * Description: 仓库管理接口
 * date: 2019/7/25 11:31
 *
 * @author zhh
 * 
 */

public interface WarehouseService {
	
	/**
     * 仓库分页列表查询
     * @param input
     * @return
     */
	PagedList<WarehouseOutput> getWarehousePageList(SearchWarehouseInput input);
	
	/**
     * 获得全部仓库信息
     * @param input
     * @return
     */
	List<WarehouseByCompanyOutput> getWarehouseList();
	/**
     * 获得全部公司信息
     * @param input
     * @return
     */
	List<ProdCompanyOutput> getProdCompanyList(BaseSearchInput input);
	
	/**
     * 根据公司key获得对应仓库信息
     * @param input
     * @return
     */
	List<WarehouseByCompanyOutput> getWarehouseListByCompany(EditWarehouseInput input);
	
	/**
     * 根据场站key获得对应仓库信息及对应仓库类型信息
     * @param input
     * @return
     */
	WareTypeYardOutput getWarehouseByYard(AddWarehouseYardRelationInput input);
	/**
     * 新增仓库
     * @param input
     * @return
     */
	void addWarehouse(AddWarehouseInput input);
	
	/**
     * 修改仓库信息
     * @param input
     * @return
     */
	void editWarehouse(EditWarehouseInput input);
	
	/**
     * 获取仓库信息
     * @param input
     * @return
     */
	WareWarehouse getWarehouseDetail(EditWarehouseInput input);
	
	/**
     * 批量删除仓库信息
     * @param input
     * @return
     */
	void deleteWarehouse(String[] keys);
	
	/**
     * 根据仓库key获得对应仓库类型信息
     * @param input
     * @return
     */
	List<WarehouseTypeOutput> getWarehouseTypeListByWarehouse(EditWarehouseInput input);
	
	/**
     * 设置仓库类型
     * @param input
     * @return
     */
	void addWareWarehouseTypeRelation(AddWareWarehouseTypeRelationInput input);
	
	/**
     * 获得仓库同一公司下场站信息
     * @param input
     * @return
     */
	List<WarehouseYardOutput> getWarehouseYardList(EditWarehouseInput input);
	
	/**
     * 根据仓库key获得对应场站信息
     * 
     * @return
     */
	List<WarehouseYardOutput> getYardListByWarehouse(EditWarehouseInput input);
	
	/**
     * 为仓库分配场站
     * @param input
     * @return
     */
	void addWarehouseYardRelation(AddWarehouseYardRelationInput input);
	
	/**
	 * 
	* @Description: 锁定指定公司下仓库
	* @param company void
	* @throws 
	 */
	void lockWarehouse(String company);
	/**
	 * 
	* @Description: 更新锁库状态的锁库时间 -上传费用池时调用
	* @param company void
	* @throws 
	 */
	void lockWarehouseBySBS(String company, Date lockTime);
	
	/**
	 * 
	* @Description: 解锁指定公司下的仓库库存 
	* @param company void
	* @throws 
	 */
	void unLockWarehouse(String company);
	
	/**
	 * 
	* @Description: 取得分公司的锁库状态
	* @param company
	* @return String
	* @throws 
	 */
	String getLockStatus(String company);
	
	/**
     * 查询列表  根据场站名称,公司key检索
     * @param input
     * @return
     */
	List<WarehouseYardOutput> getYardList(String company,String yardName);
	/**
     * 设置默认仓库
     * @param yard 场站key
     * @param defaultWarehouse 仓库key
     */
	void setDefaultWarehouse(Integer yard,String defaultWarehouse);
	
}
