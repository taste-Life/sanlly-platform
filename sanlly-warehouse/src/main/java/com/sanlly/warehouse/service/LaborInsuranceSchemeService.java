package com.sanlly.warehouse.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.models.input.laborInsurance.SearchLaborInsuranceInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.AddLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.EditLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceScheme.SearchLaborInsuranceSchemeInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.LaborStaffInput;
import com.sanlly.warehouse.models.input.laborInsurance.laborStaff.SearchUserInput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceOutput;
import com.sanlly.warehouse.models.output.laborInsurance.PersonalNextReceiveOutput;
import com.sanlly.warehouse.models.output.laborInsurance.LaborStaff.userSchemeOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.DemandEstimationOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.DemandOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeDetailOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeOutput;

/**
 * ClassName: LaborInsuranceSchemeService
 * Description: 劳保方案管理接口
 * date: 2019/7/30 15:06
 *
 * @author zhh
 * 
 */
public interface LaborInsuranceSchemeService {
	
	/**
     * 劳保方案信息分页列表查询
     * @param input
     * @return
     */
	PagedList<LaborInsuranceSchemeOutput> getLaborInsuranceSchemePageList(SearchLaborInsuranceSchemeInput input);
	
	/**
     * 获得全部劳保方案信息
     * @param input
     * @return
	 * @throws ParseException 
     */
	List<LaborInsuranceSchemeOutput> getLaborInsuranceSchemeList(SearchLaborInsuranceSchemeInput input);
	
	/**
     * 根据key获得劳保方案信息
     * @param input
     * @return
	 *  
     */
	List<LaborInsuranceSchemeDetailOutput> getLaborInsuranceScheme(EditLaborInsuranceSchemeInput input);
	/**
     * 添加劳保方案信息
     * @param input
     * @return
     */
	void addLaborInsuranceScheme(AddLaborInsuranceSchemeInput input);
	
	/**
     * 修改劳保方案信息
     * @param input
     * @return
     */
	void editLaborInsuranceScheme(EditLaborInsuranceSchemeInput input);
	
	/**
     * 根据key批量删除劳保方案信息
     * @param keys
     * @return
     */
	void delLaborInsuaranceScheme(String[] keys);
	
	/**
     * 将方案设置为无效
     * @param keys
     * @return
     */
	void invalidLaborInsuaranceScheme(String[] keys);
	
	/**
     * 根据方案编号查询方案信息
     * @param labaorInsuranceNo
     * @return
     */
	LaborInsuranceSchemeOutput getInfoByNo(String labaorInsuranceNo);
	/**
	 * 员工劳保方案信息列表查询
	 * @param input
	 * @return
	 */
	List<userSchemeOutput> getUserPageList(SearchUserInput input);
	
	/**
	 * 修改员工劳保信息
	 * @param input
	 * @return
	 */
	void editStaffLabor(userSchemeOutput input);
	
	/**
	 * 生成员工劳保申请单
	 * @return
	 */
	void addLaborReceiveByTerm(Integer userId,String laborScheme);
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	userSchemeOutput userDetail(Integer userId);
	
	/**
	 * 根据用户id获取用户劳保详细信息
	 * @param userId
	 * @return
	 */
	userSchemeOutput userLaborDetail(Integer userId);
	
	/**
	 * 根据员工id和备件查询该员工劳保备件型号
	 * @param userId
	 * @param spareParts
	 * @return
	 */
	String getModel(Integer userId , String spareParts);
	
	Map<String, String> getModelAndNum(Integer userId, String spareParts);
	
	/**
	 * 下期领用信息
	 * @param userId
	 * @return
	 */
	List<PersonalNextReceiveOutput> getNextReceiveInfo(Integer userId);
	
	/**
	 * 劳保福利需求预估
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	DemandOutput getDemandList(Date startDate,Date endDate);
	
}
