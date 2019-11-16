package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.cleaningnode.CleaningNodeInputAdd;
import com.sanlly.production.models.input.cleaningnode.CleaningNodeInputUpdate;
import com.sanlly.production.models.output.cleaningnode.CleaningNodeOutput;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public interface CleaningNodeService {
    /**
     * @author zhq
     * @date 2019/11/8
     * @description 新增洗箱节点
     */
    int addCleaningNode(CleaningNodeInputAdd cleaningNodeInputAdd);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 修改
     */
    int updateCleaningNode(CleaningNodeInputUpdate cleaningNodeInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 删除洗箱节点
     */
    int deleteCleaningNode(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 设置有效
     */
    int validateCleaningNode(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 分页查询
     */
    PagedList<CleaningNodeOutput> getCleaningNodeList(Integer index, Integer size, String searchWords);

}
