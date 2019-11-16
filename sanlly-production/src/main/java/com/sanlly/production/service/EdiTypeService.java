package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.edi.EdiTypeInput;
import com.sanlly.production.models.output.edi.EdiTypeOutput;

import java.util.List;

public interface EdiTypeService {
    /**
     * 查询列表
     * @return
     * @author zjd
     */
    List<EdiTypeOutput> list();

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zhangkai
     */
    EdiTypeOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zhangkai
     */
    int update(EdiTypeInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zhangkai
     */
    int add(EdiTypeInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zhangkai
     */
    int delete(Integer id);

    PagedList<EdiTypeOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);

}
