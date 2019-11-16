package com.sanlly.production.service.app;

import java.util.List;

import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInfoInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseOffLineInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerTestingSearchInput;
import com.sanlly.production.models.output.app.containerTesting.ContainerCourseOutput;
import com.sanlly.production.models.output.app.containerTesting.CourseListOutput;
import com.sanlly.production.models.output.app.shortcut.ShortcutOutput;

/**
 *
 * @Package com.sanlly.production.service.app 
 * @Description: TODO 集装箱检验 APP相关服务类
 * @author tianzhl   
 * @date 2019年8月9日 下午3:16:41 
 * @version V1.0   
 */
public interface ContainerTestingAppService {

	/**
	 *  
	 * 
	 * @Description: TODO 箱体进场检验列表
	 * @param input 查询条件
	 * @return PagedList<ContainerInfoOutput> 进场检验列表 @throws 
	 */
	CourseListOutput<ContainerCourseOutput> containerTestingList(ContainerTestingSearchInput input);

	/**
	 *  
	 * 
	 * @Description: TODO 根据箱号获取箱体基本信息
	 * @param containerNo 箱号
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	ContainerCourseOutput containerInfo(String containerNo);

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场信息
	 * @param input 箱体进场信息 @throws 
	 * @return String prodCourseId 进场id 
	 */
	String saveContainerCourseInfo(ContainerCourseInput input) throws Exception ;
	
	/**
	 *  
	 * 
	 * @Description: TODO 离线批量上传进场
	 * @param inputs 箱体进场信息 @throws 
	 * @return String prodCourseId 进场id 
	 */
	void saveContainerCourseOffLine(List<ContainerCourseOffLineInput> inputs) throws Exception ;
	
	/**
	 *  
	 * 
	 * @Description: TODO 提交箱体进场信息
	 * @param input 箱体进场信息 @throws 
	 */
	void submitContainerCourse(ContainerCourseEntryInfoInput input) throws Exception ;

	/** 
	* @Description: TODO 快捷条目录入列表
	* @param containerCategory
	* @return List<ShortcutOutput>
	* @throws 
	*/
	List<ShortcutOutput> shortcutList(String containerCategory);

}
