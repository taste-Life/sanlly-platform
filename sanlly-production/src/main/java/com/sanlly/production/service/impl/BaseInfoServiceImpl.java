package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.service.BaseInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Autowired
    private ContainerUserMapper containerUserMapper;

    /**
     * 用箱人分页列表
     * @param input
     * @param searchWords
     * @return
     */
    @Override
    public PagedList<ContainerUserOutput> containerUserList(PageInput input, String searchWords) {
        List<ContainerUserOutput> outputList = new ArrayList<ContainerUserOutput>();
        ContainerUserExample example = new ContainerUserExample();
        example.setOrderByClause("create_time DESC");
        ContainerUserExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andContainerUserCodeEqualTo("%"+searchWords.trim()+"%");
            ContainerUserExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andContainerUserNameEqualTo("%"+searchWords.trim()+"");
            ContainerUserExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andContainerUserNameEnEqualTo("%"+searchWords.trim()+"%");
            example.or(criteria2);
            example.or(criteria3);
        }
        Integer totalItemCount = (int)containerUserMapper.countByExample(example);
        PagedList<ContainerUserOutput> pagedList = new PagedList<ContainerUserOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<ContainerUser> list = containerUserMapper.selectByExample(example);
        for (ContainerUser item : list) {
            ContainerUserOutput output = new ContainerUserOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }
}
