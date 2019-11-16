package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.parts.PartsTypeInput;
import com.sanlly.production.models.output.parts.PartsTypeOutput;

import java.util.List;

public interface PartsTypeService {
    /**
     * 查询列表
     * @return
     * @author zjd
     */
    List<PartsTypeOutput> list();

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zhangkai
     */
    PartsTypeOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zhangkai
     */
    int update(PartsTypeInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zhangkai
     */
    int add(PartsTypeInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zhangkai
     */
    int delete(Integer id);

    PagedList<PartsTypeOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
