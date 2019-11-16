package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.odor.OdorSpeciesInput;
import com.sanlly.production.models.output.odor.OdorSpeciesOutput;

import java.util.List;

public interface OdorSpeciesService {

    /**
     * 查询列表
     * @return
     * @author zjd
     */
    List<OdorSpeciesOutput> list();

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zhangkai
     */
    OdorSpeciesOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zhangkai
     */
    int update(OdorSpeciesInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zhangkai
     */
    int add(OdorSpeciesInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zhangkai
     */
    int delete(Integer id);

    PagedList<OdorSpeciesOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
