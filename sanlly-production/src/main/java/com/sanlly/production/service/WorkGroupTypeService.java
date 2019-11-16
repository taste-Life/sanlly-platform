package com.sanlly.production.service;

import com.sanlly.production.models.output.workgrouptype.WorkGroupTypeOutput;

import java.util.List;

/**
 * @author zhq
 * @date 2019/10/29
 * @description 工作组类别表
 */
public interface WorkGroupTypeService {
    /**
     * @author zhq
     * @date 2019/10/29
     * @description 获取所有得工作组类别
     */
    List<WorkGroupTypeOutput> getWorkGroupTypeList();
}
