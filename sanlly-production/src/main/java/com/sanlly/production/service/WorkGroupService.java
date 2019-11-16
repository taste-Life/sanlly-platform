package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.workgroup.WorkGroupInputAdd;
import com.sanlly.production.models.input.workgroup.WorkGroupInputUpdate;
import com.sanlly.production.models.output.workgroup.WorkGroupOutput;

/**
 * @author zhq
 * @date 2019/10/25
 * @description 工作组类别配置
 */
public interface WorkGroupService {

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 新增工作组类别配置记录
     */
    int addWorkGroup(WorkGroupInputAdd workGroupInputAdd);

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 更新工作组类别配置记录
     */
    int updateWorkGroup(WorkGroupInputUpdate workGroupInputUpdate);

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 根据主键批量删除工作组类别配置记录
     */
    int deleteWorkGroup(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/10/25
     * @description 根据关键字分页查询工作组类别配置记录
     */
    PagedList<WorkGroupOutput> getWorkGroups(Integer pageSize, Integer pageNum, String searchWords);

    /**
     * @author zhq
     * @date 2019/10/29
     * @description 批量设置有效无效接口
     */
    int multiValidate(Integer[] ids, Integer valid);
}
