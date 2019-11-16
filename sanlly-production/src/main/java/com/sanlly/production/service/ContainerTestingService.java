package com.sanlly.production.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInfoInput;
import com.sanlly.production.models.input.containerTesting.AuditContainerInput;
import com.sanlly.production.models.input.containerTesting.CommonRepairInput;
import com.sanlly.production.models.input.containerTesting.ContainerCourseInput;
import com.sanlly.production.models.input.containerTesting.ContainerEntryListInput;
import com.sanlly.production.models.input.containerTesting.ContainerTestingSearchInput;
import com.sanlly.production.models.input.containerTesting.CourseCopyInput;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.models.input.containerTesting.ThirdPartyChargeInput;
import com.sanlly.production.models.input.surrender.SurrenderCourseSearchInput;
import com.sanlly.production.models.output.app.containerTesting.ContainerCourseEntryInfoOutput;
import com.sanlly.production.models.output.app.partsRepair.PartsRepairTypeOutput;
import com.sanlly.production.models.output.containerTesting.CommonRepairOutput;
import com.sanlly.production.models.output.containerTesting.ContainerCourseOutput;
import com.sanlly.production.models.output.containerTesting.ContainerStateTypeOutput;
import com.sanlly.production.models.output.containerTesting.ContainerTestingListOutput;
import com.sanlly.production.models.output.containerTesting.CourseEntryRelationOutput;
import com.sanlly.production.models.output.containerTesting.SpecialWashingRateOutput;
import com.sanlly.production.models.output.surrender.SurrenderCourseListOutput;

/**
 *    
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO 箱体进场检验
 * @author tianzhl   
 * @date 2019年8月14日 上午11:16:56 
 * @version V1.0   
 */
public interface ContainerTestingService {

	/**
	 * 箱体检验列表
	 * 
	 * @param input
	 * @return
	 * @throws ParseException
	 */
	PagedList<ContainerTestingListOutput> getPageList(ContainerTestingSearchInput input) throws ParseException;

	/**
	 * 冷代干列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return
	 * @throws ParseException
	 *             PagedList<ContainerTestingListOutput> @throws 
	 */
	PagedList<ContainerTestingListOutput> getUnitPageList(ContainerTestingSearchInput input) throws ParseException;

	/**
	 * 取消冷代干
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void cancelDry(String[] listIds);

	/**
	 * 批量设置冷代干
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void settingDry(String[] listIds);

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场检验明细信息
	 * @param input
	 *            箱体进场检验明细信息 @throws 
	 */
	void saveContainerCourserEntryInfo(ContainerCourseEntryInfoInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 查看箱体进场检验明细信息列表
	 * @param prodCourseId
	 *            进场id
	 * @return ContainerCourseEntryInfoOutput 箱体进场检验明细信息列表 @throws 
	 */
	ContainerCourseEntryInfoOutput containerCourseEntryList(String prodCourseId, String containerCategory);

	/**
	 *  
	 * 
	 * @Description: TODO 批量设置箱况
	 * @param input
	 *            void @throws 
	 */
	void setContainerState(SetContainerStateInput input);

	/**
	 *  
	 * 
	 * @Description: TODO 批量提交Container检验
	 * @param input
	 *            void @throws 
	 */
	void submitContainerTesting(SetContainerStateInput input);

	/**
	 *  
	 * 
	 * @Description: TODO Container检验审核
	 * @param input
	 *            void @throws 
	 */
	void auditContainerTesting(AuditContainerInput input);

	/**
	 *  
	 * 
	 * @Description: TODO 根据箱号获取箱体基本信息
	 * @param containerNo
	 *            箱号
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	ContainerCourseOutput containerCourseByContainerNo(String containerNo);

	/**
	 *  
	 * 
	 * @Description: TODO 根据进场获取箱体基本信息
	 * @param prodCourseId
	 *            进场信息
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	ContainerCourseOutput containerCourse(String prodCourseId, String containerCategory);

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场信息
	 * @param input
	 *            箱体进场信息 @throws 
	 * @return String 进场id @throws 
	 */
	String saveContainerCourse(ContainerCourseInput input);

	/**
	 *  
	 * 
	 * @Description: TODO 常用修理方案
	 * @param input
	 *            筛选条件
	 * @return CommonRepairOutput 常用修理方案 @throws 
	 */
	CommonRepairOutput commonRepair(CommonRepairInput input);

	/**
	 *  
	 * 
	 * @Description: TODO 获取好坏箱类型
	 * @return List<ContainerStateTypeOutput> 好坏箱类型 @throws 
	 */
	List<ContainerStateTypeOutput> containerStateType();

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱 不分类
	 * @param positionCode
	 *            位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<CourseEntryRelationOutput> entryRelationPartsRepairNoType(String positionCode);

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱
	 * @param positionCode
	 *            位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<PartsRepairTypeOutput> entryRelationPartsRepair(String positionCode);

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件大类获取部件明细--箱体、机组
	 * @param containerCategory
	 *            箱类别
	 * @param partsTypeCode
	 *            部件大类代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<CourseEntryRelationOutput> entryRelationPartsDetails(String containerCategory, String partsTypeCode);

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件明细获取修理--箱体、机组
	 * @param containerCategory
	 *            箱类别
	 * @param partsDetailsCode部件明细代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<CourseEntryRelationOutput> entryRelationRepair(String containerCategory, String partsDetailsCode,
			String searchName);

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件修理、部件明细、修理获取损坏--干箱、箱体、机组
	 * @param containerCategory
	 *            箱类别
	 * @param partsRepairCode
	 *            部件修理代码
	 * @param partsDetailsCode
	 *            部件明细代码
	 * @param repairCode
	 *            修理代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<CourseEntryRelationOutput> entryRelationDamage(String containerCategory, String partsRepairCode,
			String partsDetailsCode, String repairCode, String searchName);

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件明细、修理获取材质--箱体
	 * @param partsDetailsCode
	 *            部件明细代码
	 * @param repairCode
	 *            修理代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<CourseEntryRelationOutput> entryRelationMaterial(String partsDetailsCode, String repairCode);

	/**
	 *  
	 * 
	 * @Description: TODO 获取部件大类--机组
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	List<CourseEntryRelationOutput> entryRelationPartsType();

	/**
	 *  
	 * 
	 * @Description: TODO 特殊货物洗箱费率
	 * @return List<SpecialGoodSelectOutput> @throws 
	 */
	List<SpecialWashingRateOutput> specialWashingRate(String company);

	/**
	 *  
	 * 
	 * @Description: TODO 重复条目提醒
	 * @param containerNo
	 *            箱号
	 * @param containerCategory
	 *            箱类别
	 * @param partsRepairCode
	 *            部件修理代码
	 * @param partsDetailsCode
	 *            部件明细代码
	 * @param repairCode
	 *            修理代码
	 * @return Result @throws 
	 */
	ContainerTestingListOutput repeatPromptsEntry(String containerNo, String containerCategory, String partsRepairCode,
			String partsDetailsCode, String repairCode);

	/**
	 *  
	 * 
	 * @Description: TODO 删除进场条目
	 * @param input
	 *            条目id @throws 
	 */
	void containerCourseEntryDelete(ContainerEntryListInput input);

	/**
	 * 判断是否为外包 根据指派的班组或者供应商判断
	 * 
	 * @Description: TODO
	 * @param prodCourseId
	 * @return Boolean fjy
	 */
	Boolean isWb(String prodCourseId, String containerCategory);

	/**
	 *  
	 * 
	 * @Description: TODO 导入进场数据
	 * @param inputs
	 *            进场数据 @throws 
	 */
	void exportContainerCourse(List<ContainerCourseInput> inputs) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO
	 * @param inputs
	 *            获取某种状态的进场数据 @throws 
	 */
	List<String> selectCourseByTestingState(String[] prodCourseIdList, String[] testingStateList) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 第三方现场收费
	 * @param input
	 * @throws 
	 */
	Map<String, String> thirdPartyCharge(ThirdPartyChargeInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 退租箱拷贝进场
	 * @param input
	 * @throws 
	 */
	String surrenderCopyCourse(CourseCopyInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 退租箱进场列表
	 * @param input
	 * @throws 
	 */
	PagedList<SurrenderCourseListOutput> surrenderCourse(SurrenderCourseSearchInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 根据进场箱号更新退租计划
	 * @param ContainerNo
	 * @param courseTime
	 * @param yard
	 *            void @throws 
	 */
	void containerSurrender(String prodCourseId) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 根据检验条目id更新备件修改记录
	 * @param prodCourseEntryId
	 * @param productNode
	 * @throws 
	 */
	void updateSpareChangeRecode(String prodCourseEntryId, String productNode);

}
