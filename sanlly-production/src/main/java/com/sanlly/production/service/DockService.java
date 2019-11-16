package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.dock.DockInputAdd;
import com.sanlly.production.models.input.dock.DockInputUpdate;
import com.sanlly.production.models.output.dock.DockOutput;

import java.util.List;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public interface DockService {
    /**
     * @author zhq
     * @date 2019/11/6
     * @description 新增
     */
    int addDock(DockInputAdd dockInputAdd);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 修改
     */
    int updateDock(DockInputUpdate dockInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 删除
     */
    int deleteDock(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 设置有效
     */
    int validateDock(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 分页查询
     */
    PagedList<DockOutput> getDocklist(Integer index, Integer size, String searchWords);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 查询全部码头
     */
    List<DockOutput> getAllDockList();
}
