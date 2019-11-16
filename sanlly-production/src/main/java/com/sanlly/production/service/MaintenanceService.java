package com.sanlly.production.service;

import java.util.Date;
import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.guarantee.MaintenanceAddInput;
import com.sanlly.production.models.input.guarantee.MaintenanceDelInput;
import com.sanlly.production.models.input.guarantee.MaintenanceIdsInput;
import com.sanlly.production.models.input.guarantee.MaintenanceInput;
import com.sanlly.production.models.output.guarantee.ContainerNumsOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceBatchOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceCheckOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceEntryDateOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceInfoOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceOutput;

public interface MaintenanceService {

	
	
	/**
	 * web端检索机组保修列表
	 * @param containerNo 箱号
	 * @param containerUser 用箱人
	 * @param courseType 进场类型
	 * @param startTime 检索起日
	 * @param endTime 检索止日
	 * @param operateType 操作类型
	 * @param isSurrender 是否退租箱
	 * @param yard 进场场站
	 * @param index 分页页码
	 * @param size 分页条数
	 * @return
	 * @author zhangkai
	 */
	PagedList<MaintenanceOutput> list(String containerNo, String containerUser, String courseType,
			Date startTime, Date endTime, String operateType, String isSurrender, String yard,
			Integer index, Integer size);
	
	/**
	 * web保修列表批量删除
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	Boolean updateByPrimaryKeys(MaintenanceDelInput input);
	
	/**
	 * web进场保修批量添加进保修列表
	 * @param input
	 * @return
	 */
	Boolean addWebMaintenance(MaintenanceIdsInput input);
	
	/**
	 * web进场保修批量提交
	 * @param input
	 * @return
	 */
	void submitMaintenance(MaintenanceIdsInput input);
	
	/**
	 * 匹配批量保修提醒
	* @Description: TODO 
	* @param containerNo
	* @param unitCode
	* @return List<String>
	* @throws 
	* @author zhangkai
	 */
	List<MaintenanceBatchOutput> matchBatchMaintenance(String containerNo, String unitCode);
	
	/** 
	* @Description: TODO web端保修详情
	* @param prodMaintenanceId
	* @return Integer
	* @throws 
	*/
	MaintenanceInfoOutput maintenanceDetail(String prodMaintenanceId);
	
	/** 
	* @Description: TODO 
	* @param inputs 获取某种状态的进场数据
	* @throws 
	*/
	List<String> selectCourseByTestingState(String[] prodCourseIdList, String[] testingStateList) throws Exception ;
	
	/**
	 * app端添加保修基本信息
	 * @param maintenanceInput
	 * @return
	 * @author zhangkai
	 */
	String add(MaintenanceInput maintenanceInput);
	
	/**
	 * app端根据箱号添加进保修列表
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	Boolean addMaintenance(MaintenanceAddInput input);
	
	/**
	 * app端保修检验列表
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 * @author zhangkai
	 */
	PagedList<MaintenanceCheckOutput> appList(String containerNo, String guaranteeCategory, Integer index, Integer size);

	/**
	 * app端根据箱号获取进场时间
	 * @param containerNo
	 * @return
	 * @author zhangkai
	 */
	MaintenanceEntryDateOutput entryDate(String containerNo);
	
	/**
	 * app端模糊查询箱号
	 * @param containerNo
	 * @return
	 */
	List<ContainerNumsOutput> containerNums(String containerNo);
	
	/**
	 * app端取消保修
	 * @param prodMaintenanceId
	 */
	void cancelMaintenance(String prodMaintenanceId);
	
}
