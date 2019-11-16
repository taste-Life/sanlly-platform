package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.base.CompanyInput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;

import java.util.List;

/**
 * 公司信息维护
 *
 * @author zhangkai
 */
public interface CompanyService {

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    PagedList<CompanyOutput> list(PageInput input, String searchWords);

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     * @author zhangkai
     */
    CompanyOutput query(Integer id);

    /**
     * 根据主键更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    int update(CompanyInput input);

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    int add(CompanyInput input);

    /**
     * 逻辑删除
     *
     * @param ids
     * @return
     * @author zhangkai
     */
    boolean delete(Integer[] ids);


    /**
     * 查询列表
     *
     * @return
     * @author fjy
     */
    List<CompanyOutput> list(BaseSearchInput input);


    int multiValid(Integer[] ids, int valid);


    /**
     * 根据key查询位置代码
     *
     * @param key
     * @return
     */
    String getPositionCode(String key);

    /**
     * 根据key查询公司代码
     *
     * @param key
     * @return
     */
    String getCompanyCode(String key);

    /**
     * 根据key取得公司是否锁库
     *
     * @param key
     * @return
     */
    Integer getIsLock(String key);

    /**
     * @author zhq
     * @date 2019/10/28
     * @description 获取所有公司列表 给前端提供下拉公司名列表
     */
    List<CompanyOutput> selectCompanyList();
}
