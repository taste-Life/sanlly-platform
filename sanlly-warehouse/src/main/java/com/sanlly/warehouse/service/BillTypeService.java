package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.billtype.AddBillTypeInput;
import com.sanlly.warehouse.models.input.billtype.EditBillTypeInput;
import com.sanlly.warehouse.models.input.billtype.SearchBillTypeInput;
import com.sanlly.warehouse.models.output.KeyOutput;
import com.sanlly.warehouse.models.output.billtype.BillTypeOutput;
import com.sanlly.warehouse.models.output.warehousetype.WarehouseTypeOutput;

/**
 * 单据类型接口
 * 
 * @author lishzh
 *
 */
public interface BillTypeService {

	/**
	 * 添加单据类型
	 * 
	 * @author lishzh
	 * @param input
	 */
	void addBillType(AddBillTypeInput input);

	/**
	 * 修改单据类型
	 * 
	 * @author lishzh
	 * @param input
	 */
	void editBillType(EditBillTypeInput input);

	/**
	 * 删除单据类型
	 * 
	 * @author lishzh
	 * @param input
	 */
	void deleteBillType(String[] keys);

	/**
	 * 分页查询单据类型
	 * 
	 * @author lishzh
	 * @param input
	 */
	PagedList<BillTypeOutput> getPageBillType(SearchBillTypeInput input);

	/**
	 * 查询所有单据类型
	 * 
	 * @author lishzh
	 */
	List<KeyOutput> getAllBillType();

	/**
	 * 根据单据类型名称生成单号
	 * 
	 * @param billTypeName
	 * @return
	 */
	String getBillNumber(String billTypeName);
	
	/**
	 * 根据单据类型名和公司称生成单号
	 * 
	 * @param billTypeName
	 * @return
	 */
	String getBillNumber(String billTypeName,String company);

	/**
	 * 根据单据类型key生成单号
	 *
	 * @param billTypeKey
	 * @return
	 */
	String getBillNumberByKey(String billTypeKey);
	
	/**
	 * 根据单据类型key和公司生成单号
	 *
	 * @param billTypeKey
	 * @return
	 */
	String getBillNumberByKey(String key,String company);

	/**
	 * 根据单据类型名获取对应的key.若参数为空或null则返回null.若找不到则返回null
	 * 
	 * @author lishzh
	 * @param billTypeName
	 * @return
	 */
	String getBillTypeKeyByName(String billTypeName);
	
	/**
	 * 校验单据类型名称是否重复
	 * 
	 * @author lishzh
	 * @param billTypeName
	 * @return
	 */
	boolean nameDuplicateValid(String billTypeName);

	/**
	 *根据单据类型获取可选仓库类型
	 *
	 *@author lishzh
	 */
	List<WarehouseTypeOutput> getWarehouseTypesByBill(String billType);

}
