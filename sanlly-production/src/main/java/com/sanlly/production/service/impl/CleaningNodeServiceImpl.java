package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CleaningNodeMapper;
import com.sanlly.production.entity.CleaningNode;
import com.sanlly.production.entity.CleaningNodeExample;
import com.sanlly.production.models.input.cleaningnode.CleaningNodeInputAdd;
import com.sanlly.production.models.input.cleaningnode.CleaningNodeInputUpdate;
import com.sanlly.production.models.output.cleaningnode.CleaningNodeOutput;
import com.sanlly.production.service.CleaningNodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
@Service
public class CleaningNodeServiceImpl extends BaseServiceImpl implements CleaningNodeService {


    @Autowired
    private CleaningNodeMapper cleaningNodeMapper;

    /**
     * @param cleaningNodeInputAdd
     * @author zhq
     * @date 2019/11/8
     * @description 新增洗箱节点
     */
    @Override
    public int addCleaningNode(CleaningNodeInputAdd cleaningNodeInputAdd) {
        CleaningNode cleaningNode = new CleaningNode();
        BeanUtils.copyProperties(cleaningNodeInputAdd, cleaningNode);
        cleaningNode.setCreateTime(new Date());
        cleaningNode.setCreateUser(super.getCurrentUserId());
        cleaningNode.setIsDel(PlatformConstants.ISDEL_NO);
        cleaningNode.setIsValid(PlatformConstants.ISVALID_YES);
        return cleaningNodeMapper.insertSelective(cleaningNode);
    }

    /**
     * @param cleaningNodeInputUpdate
     * @author zhq
     * @date 2019/11/8
     * @description 修改
     */
    @Override
    public int updateCleaningNode(CleaningNodeInputUpdate cleaningNodeInputUpdate) {
        CleaningNode cleaningNode = new CleaningNode();
        BeanUtils.copyProperties(cleaningNodeInputUpdate, cleaningNode);
        cleaningNode.setUpdateTime(new Date());
        cleaningNode.setUpdateUser(super.getCurrentUserId());
        return cleaningNodeMapper.updateByPrimaryKeySelective(cleaningNode);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/8
     * @description 删除洗箱节点
     */
    @Override
    public int deleteCleaningNode(Integer[] ids) {
        CleaningNodeExample cleaningNodeExample = new CleaningNodeExample();
        cleaningNodeExample.or().andProdCleaningNodeIn(Arrays.asList(ids));
        CleaningNode cleaningNode = new CleaningNode();
        cleaningNode.setIsDel(PlatformConstants.ISDEL_YES);
        return cleaningNodeMapper.updateByExampleSelective(cleaningNode, cleaningNodeExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/8
     * @description 设置有效
     */
    @Override
    public int validateCleaningNode(Integer[] ids, Integer valid) {
        CleaningNodeExample cleaningNodeExample = new CleaningNodeExample();
        cleaningNodeExample.or().andProdCleaningNodeIn(Arrays.asList(ids));
        CleaningNode cleaningNode = new CleaningNode();
        cleaningNode.setIsValid(valid);
        return cleaningNodeMapper.updateByExampleSelective(cleaningNode, cleaningNodeExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/8
     * @description 分页查询
     */
    @Override
    public PagedList<CleaningNodeOutput> getCleaningNodeList(Integer index, Integer size, String searchWords) {
        CleaningNodeExample cleaningNodeExample = new CleaningNodeExample();
        cleaningNodeExample.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) cleaningNodeMapper.countByExample(cleaningNodeExample);
        PagedList<CleaningNodeOutput> pagedList = new PagedList<>(index, size, totalNums);
        cleaningNodeExample.setOrderByClause("create_time desc");
        cleaningNodeExample.setLimitStart(pagedList.getLimitStart());
        cleaningNodeExample.setLimitEnd(pagedList.getLimitEnd());
        List<CleaningNode> cleaningNodeList = cleaningNodeMapper.selectByExample(cleaningNodeExample);
        List<CleaningNodeOutput> cleaningNodeOutputList = cleaningNodeList.stream().map(cleaningNode -> {
            CleaningNodeOutput cleaningNodeOutput = new CleaningNodeOutput();
            BeanUtils.copyProperties(cleaningNode, cleaningNodeOutput);
            cleaningNodeOutput.setCompanyNameLang(cleaningNode.getCompany());
            cleaningNodeOutput.setContainerUserNameLang(cleaningNode.getContainerUser());
            cleaningNodeOutput.setCleaningTypeNameLang(cleaningNode.getCleaningType());
            return cleaningNodeOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(cleaningNodeOutputList);
        return pagedList;
    }
}
