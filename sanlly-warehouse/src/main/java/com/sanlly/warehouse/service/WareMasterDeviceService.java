package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.masterdevice.AddMasterDeviceInput;
import com.sanlly.warehouse.models.input.masterdevice.AddMasterDeviceSparePartsRelation;
import com.sanlly.warehouse.models.input.masterdevice.EditMasterDeviceInput;
import com.sanlly.warehouse.models.input.masterdevice.SearchMasterDeviceInput;
import com.sanlly.warehouse.models.output.masterdevice.MasterDeviceOutput;
import com.sanlly.warehouse.models.output.masterdevice.SelectItemOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: WareMasterDeviceService Description: 主件服务层 date: 2019/7/24 15:02
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareMasterDeviceService {
	/**
	 * 主件列表查询
	 * 
	 * @param input
	 * @return
	 */
	PagedList<MasterDeviceOutput> getMasterDevicePageList(SearchMasterDeviceInput input);

	/**
	 * 主件查询
	 * 
	 * @param input
	 * @return
	 */
	MasterDeviceOutput getMasterDeviceDetail(EditMasterDeviceInput input);

	/**
	 * 新增主件
	 * 
	 * @param input
	 */
	void addMasterDevice(AddMasterDeviceInput input);

	/**
	 * 修改主件
	 * 
	 * @param input
	 */
	void updateMasterDevice(EditMasterDeviceInput input);

	/**
	 * 批量删除主件
	 * 
	 * @param masterDeviceIds
	 */
	void deleteMasterDevice(Integer[] masterDeviceIds);

	/**
	 * 添加主件备件关系
	 * 
	 * @param list
	 */
	void addMasterDeviceSparePartsRelation(List<AddMasterDeviceSparePartsRelation> list);

	/**
	 * 根据ID批量删除主件备件关系
	 * 
	 * @param ids
	 */
	void deleteMasterDeviceSparePartsRelation(Integer[] ids);

	/**
	 * 根据主件查询所属备件
	 * 
	 * @param no
	 * @return
	 */
	List<SparePartsOutput> getSparePartsPageListByMasterDeice(String no);

	/**
	 * 根据主件号查询所属备件
	 * 
	 * @param input
	 * @return
	 */
	String getSparesByDevice(EditMasterDeviceInput input);

	/**
	 * 根据主件号查询所属备件号
	 * 
	 * @param masterDeviceNo
	 * @return
	 */
	List<String> getSPListByMDNo(String masterDeviceNo);

	/**
	 * 查询主件列表
	 * 
	 * @return
	 */
	List<SelectItemOutput> getList();
}
