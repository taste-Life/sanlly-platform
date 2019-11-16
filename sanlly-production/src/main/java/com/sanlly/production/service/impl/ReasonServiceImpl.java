package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ReasonMapper;
import com.sanlly.production.entity.Reason;
import com.sanlly.production.entity.ReasonExample;
import com.sanlly.production.enums.ReasonTypeEnum;
import com.sanlly.production.models.input.reason.ReasonInput;
import com.sanlly.production.models.output.reason.ReasonOutput;
import com.sanlly.production.service.ReasonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReasonServiceImpl extends  BaseServiceImpl implements ReasonService {

    @Autowired
    private ReasonMapper reasonMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public int update(ReasonInput input) {
        Reason record = new Reason();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return reasonMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(ReasonInput input) {
        Reason record = new Reason();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_reason"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return reasonMapper.insertSelective(record);
    }

    /**
    *@Description: 原因分页列表
    *@Param: [input, searchWords]
    *@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.reason.ReasonOutput>
    *@Author: zjd
    *@date: 2019-09-28
    */
    @Override
    public PagedList<ReasonOutput> pageList(PageInput input, String searchWords) {
        List<ReasonOutput> outputList = new ArrayList<ReasonOutput>();
        ReasonExample example = new ReasonExample();
        example.setOrderByClause("create_time DESC");
        ReasonExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andReasonContentNameLike("%"+searchWords.trim()+"%");
            ReasonExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andReasonContentEnLike("%"+searchWords.trim()+"");
            example.or(criteria2);
            //通过message查询code,模糊查询category
            String message = ReasonTypeEnum.getCodeByMessage(searchWords);
            if(message != null){
                ReasonExample.Criteria criteria4 = example.createCriteria();
                criteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria4.andReasonTypeEqualTo(message);
                example.or(criteria4);
            }

        }
        Integer totalItemCount = (int)reasonMapper.countByExample(example);
        PagedList<ReasonOutput> pagedList = new PagedList<ReasonOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<Reason> list = reasonMapper.selectByExample(example);
        for (Reason item : list) {
            ReasonOutput output = new ReasonOutput();
            BeanUtils.copyProperties(item, output);
            output.setReasonType(ReasonTypeEnum.getMessagebyCode(item.getReasonType()));
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            Reason record = new Reason();
            record.setProdReasonId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            reasonMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            Reason record = new Reason();
            record.setProdReasonId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            reasonMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
