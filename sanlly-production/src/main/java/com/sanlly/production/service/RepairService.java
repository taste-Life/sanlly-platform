package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.Repair;
import com.sanlly.production.models.input.repair.RepairInput;
import com.sanlly.production.models.output.repair.RepairOutput;

import java.util.List;

public interface RepairService {
    /**
     * 查询列表
     * @return
     * @author zjd
     */
    List<RepairOutput> list();

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zhangkai
     */
    RepairOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zhangkai
     */
    int update(RepairInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zhangkai
     */
    int add(RepairInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zhangkai
     */
    int delete(Integer id);

    PagedList<RepairOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);

}
