package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.material.MaterialInput;
import com.sanlly.production.models.output.material.MaterialOutput;

import java.util.List;

public interface MaterialService {
    /**
     * 查询列表
     * @return
     * @author zjd
     */
    List<MaterialOutput> list();

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zhangkai
     */
    MaterialOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zhangkai
     */
    int update(MaterialInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zhangkai
     */
    int add(MaterialInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zhangkai
     */
    int delete(Integer id);

    PagedList<MaterialOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
