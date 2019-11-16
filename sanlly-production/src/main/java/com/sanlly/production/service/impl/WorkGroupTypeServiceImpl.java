package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.WorkGroupTypeMapper;
import com.sanlly.production.entity.WorkGroupType;
import com.sanlly.production.entity.WorkGroupTypeExample;
import com.sanlly.production.models.output.workgrouptype.WorkGroupTypeOutput;
import com.sanlly.production.service.WorkGroupTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/10/29
 * @description
 */
@Service
public class WorkGroupTypeServiceImpl extends BaseServiceImpl implements WorkGroupTypeService {

    @Autowired
    WorkGroupTypeMapper workGroupTypeMapper;

    /**
     * @author zhq
     * @date 2019/10/29
     * @description 获取所有得工作组类别
     */
    @Override
    public List<WorkGroupTypeOutput> getWorkGroupTypeList() {
        WorkGroupTypeExample workGroupTypeExample = new WorkGroupTypeExample();
        workGroupTypeExample.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<WorkGroupType> workGroupTypeList = workGroupTypeMapper.selectByExample(workGroupTypeExample);
        return workGroupTypeList.stream().map(workGroupType -> {
            WorkGroupTypeOutput workGroupTypeOutput = new WorkGroupTypeOutput();
            BeanUtils.copyProperties(workGroupType, workGroupTypeOutput);
            workGroupTypeOutput.setKeyNameLang(workGroupType.getKey());
            return workGroupTypeOutput;
        }).collect(Collectors.toList());
    }
}
