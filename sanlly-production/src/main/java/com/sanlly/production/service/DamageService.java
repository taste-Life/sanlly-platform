package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.damage.DamageInput;
import com.sanlly.production.models.output.damage.DamageOutput;

import java.util.List;

public interface DamageService {
    /**
     * 查询列表
     * @return
     * @author zjd
     */
    List<DamageOutput> list();

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zhangkai
     */
    DamageOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zhangkai
     */
    int update(DamageInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zhangkai
     */
    int add(DamageInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zhangkai
     */
    int delete(Integer id);

    PagedList<DamageOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
