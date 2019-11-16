package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.base.RefrigeratorCompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.refrigerator.AddRefrigeratorCompanyInput;
import com.sanlly.production.models.input.refrigerator.EditRefrigeratorCompanyInput;
import com.sanlly.production.models.input.refrigerator.SearchRefrigeratorCompanyInput;
import com.sanlly.production.models.output.refrigerator.UnitCompanyBriefOutput;

import java.util.List;

/**
 * 冷机公司服务接口
 * 
 * @author lishzh
 *
 */
public interface RefrigeratorCompanyService {


    /**
     * @author zhq
     * @date 2019/10/18
     * @description
     */
    PagedList<RefrigeratorCompanyOutput> getRefrigeratorCompanyListByKeywords(PageInput input, String searchWords);

	/**
	 * 添加冷机公司
	 * 
	 * @param input
     */
    int addRefrigeratorCompany(AddRefrigeratorCompanyInput input);

    /**
     * @author zhq
     * @date 2019/10/23
     * @description 更新冷机记录
     */
    int updateRefrigeratorCompany(EditRefrigeratorCompanyInput input);

    /**
     * @author zhq
     * @date 2019/10/23
     * @description 根据主键批量删除冷机公司记录
     */
    int deleteRefrigeratorCompany(Integer[] ids);

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/10/21
     * @description 批量设置有效性
     */
    int multiValid(Integer[] ids, int valid);

	/**
	 * 分页查询冷机公司
	 * 
	 * @param input
	 */
	PagedList<RefrigeratorCompanyOutput> getPageRefrigeratorCompany(SearchRefrigeratorCompanyInput input);

	/**
	 * 查询所有冷机公司
     *
	 * @param
	 */
	List<RefrigeratorCompanyOutput> getAllRefrigeratorCompany();
	
	/**
	 * 查询所有冷机公司
     *
	 * @param
	 */
	UnitCompanyBriefOutput getUnitCompanyByKey(String key);
	
	/**
	 * 根据机型获取冷机公司
	 * @param key
	 * @return
	 */
	RefrigeratorCompanyOutput getUnitCompanyByTypeKey(String key);

}
