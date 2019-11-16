package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.dao.WorkGroupMapper;
import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.entity.WorkGroupExample;
import com.sanlly.production.models.input.workgroup.WorkGroupInputAdd;
import com.sanlly.production.models.input.workgroup.WorkGroupInputUpdate;
import com.sanlly.production.models.output.workgroup.WorkGroupOutput;
import com.sanlly.production.models.output.yardZone.ZoneListOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.WorkGroupService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/10/25
 * @description
 */
@Service
public class WorkGroupServiceImpl extends BaseServiceImpl implements WorkGroupService {

    @Autowired
    WorkGroupMapper workGroupMapper;
    @Autowired
    AuthService authService;

    /**
     * @param workGroupInputAdd
     * @author zhq
     * @date 2019/10/25
     * @description 新增工作组类别配置记录
     */
    @Override
    public int addWorkGroup(WorkGroupInputAdd workGroupInputAdd) {
        WorkGroup workGroup = new WorkGroup();
        BeanUtils.copyProperties(workGroupInputAdd, workGroup);
        workGroup.setZone(workGroupInputAdd.getZoneList().stream().map(ZoneListOutput::getKey).collect(Collectors.joining("][", "[", "]")));
        workGroup.setIsDel(PlatformConstants.ISDEL_NO);
        workGroup.setUser(super.getCurrentUserId());
        workGroup.setCreateTime(new Date());
        workGroup.setCreateUser(super.getCurrentUserId());

        return workGroupMapper.insertSelective(workGroup);
    }

    /**
     * @param workGroupInputUpdate
     * @author zhq
     * @date 2019/10/25
     * @description 更新工作组类别配置记录
     */
    @Override
    public int updateWorkGroup(WorkGroupInputUpdate workGroupInputUpdate) {
        WorkGroup workGroup = new WorkGroup();
        BeanUtils.copyProperties(workGroupInputUpdate, workGroup);
        workGroup.setUpdateTime(new Date());
        workGroup.setUpdateUser(super.getCurrentUserId());

        return workGroupMapper.updateByPrimaryKeySelective(workGroup);
    }


    /**
     * @param ids
     * @author zhq
     * @date 2019/10/25
     * @description 根据主键批量删除工作组类别配置记录
     */
    @Override
    public int deleteWorkGroup(Integer[] ids) {
        WorkGroupExample workGroupExample = new WorkGroupExample();
        workGroupExample.createCriteria().andProdWorkGroupIdIn(Arrays.asList(ids));
        WorkGroup workGroup = new WorkGroup();
        workGroup.setIsDel(PlatformConstants.ISDEL_YES);
        return workGroupMapper.updateByExampleSelective(workGroup, workGroupExample);
    }

    /**
     * @param pageSize
     * @param pageNum
     * @param searchWords
     * @author zhq
     * @date 2019/10/25
     * @description 根据关键字分页查询工作组类别配置记录
     */
    @Override
    public PagedList<WorkGroupOutput> getWorkGroups(Integer pageSize, Integer pageNum, String searchWords) {
        WorkGroupExample workGroupExample = new WorkGroupExample();
        WorkGroupExample.Criteria criteria = workGroupExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotEmpty(searchWords)) {
            String bySearchWords = "%" + StringUtils.trim(searchWords) + "%";
            criteria.andCodeLike(bySearchWords);
            workGroupExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyLike(bySearchWords);
            workGroupExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andYardLike(bySearchWords);
            workGroupExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andProdDeptLike(bySearchWords);
        }
        Integer totalItemCount = (int) workGroupMapper.countByExample(workGroupExample);
        PagedList<WorkGroupOutput> pagedList = new PagedList<>(pageNum, pageSize, totalItemCount);
        workGroupExample.setOrderByClause("create_time DESC");
        workGroupExample.setLimitStart(pagedList.getLimitStart());
        workGroupExample.setLimitEnd(pagedList.getLimitEnd());
        List<WorkGroup> unitTypeList = workGroupMapper.selectByExample(workGroupExample);
        List<WorkGroupOutput> workGroupOutputList = new ArrayList<>();
        unitTypeList.forEach(workGroup -> {
            WorkGroupOutput workGroupOutput = new WorkGroupOutput();
            BeanUtils.copyProperties(workGroup, workGroupOutput);
            workGroupOutput.setTypeNameLang(workGroup.getType());
            workGroupOutput.setCompanyNameLang(workGroup.getCompany());
            workGroupOutput.setYardNameLang(workGroup.getYard());
            workGroupOutput.setProdDeptNameLang(workGroup.getProdDept());
            workGroupOutput.setWorkGroupTypeNameLang(workGroup.getWorkGroupType());
            String userName = Optional.ofNullable(authService.getUserDetail(workGroup.getUser())).map(Result::getData).map(UserInfoOutput::getUserName).orElse(null);
            workGroupOutput.setUserName(userName);
            workGroupOutputList.add(workGroupOutput);
        });
        pagedList.setDataList(workGroupOutputList);
        return pagedList;
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/10/29
     * @description 批量设置有效无效接口
     */
    @Override
    public int multiValidate(Integer[] ids, Integer valid) {
        WorkGroupExample workGroupExample = new WorkGroupExample();
        workGroupExample.or().andProdWorkGroupIdIn(Arrays.asList(ids));
        WorkGroup workGroup = new WorkGroup();
        workGroup.setIsValid(valid);
        return workGroupMapper.updateByExampleSelective(workGroup, workGroupExample);
    }
}
