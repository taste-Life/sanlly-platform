package com.sanlly.production.service.impl;

import com.netflix.discovery.converters.Auto;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.PayingPartyMapper;
import com.sanlly.production.entity.PayingParty;
import com.sanlly.production.entity.PayingPartyExample;
import com.sanlly.production.models.input.paying.PayingPartyInput;
import com.sanlly.production.models.output.paying.PayingPartyOutput;
import com.sanlly.production.service.PayingPartyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PayingPartyServiceImpl extends BaseServiceImpl implements PayingPartyService {

    @Autowired
    private PayingPartyMapper payingPartyMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public PayingPartyOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(PayingPartyInput input) {
        PayingParty record = new PayingParty();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return payingPartyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(PayingPartyInput input) {
        PayingParty record = new PayingParty();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_paying_party"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return payingPartyMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
     * @Description: 付费方分页查询
     * @Param: [input, searchWords]
     * @return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.paying.PayingPartyOutput>
     * @Author: zjd
     * @date: 2019-09-26
     */
    @Override
    public PagedList<PayingPartyOutput> pageList(PageInput input, String searchWords) {
        List<PayingPartyOutput> outputList = new ArrayList<PayingPartyOutput>();
        PayingPartyExample example = new PayingPartyExample();
        example.setOrderByClause("create_time DESC");
        PayingPartyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && searchWords != "") {
            criteria.andPayingPartyCodeLike("%" + searchWords.trim() + "%");
            PayingPartyExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andPayingPartyNameLike("%" + searchWords.trim() + "");
            PayingPartyExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andPayingPartyNameEnLike("%" + searchWords.trim() + "%");
            example.or(criteria2);
            example.or(criteria3);
        }
        Integer totalItemCount = (int) payingPartyMapper.countByExample(example);
        PagedList<PayingPartyOutput> pagedList = new PagedList<PayingPartyOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<PayingParty> list = payingPartyMapper.selectByExample(example);
        for (PayingParty item : list) {
            PayingPartyOutput output = new PayingPartyOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    /**
     * @Description: 批量删除
     * @Param: [ids]
     * @return: int
     * @Author: zjd
     * @date: 2019-09-26
     */
    @Override
    public int multiDelete(Integer[] ids) {
        for (Integer id : ids) {
            PayingParty record = new PayingParty();
            record.setProdPayingPartyId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            payingPartyMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    /**
     * @Description: 批量设置有效性
     * @Param: [ids, valid]
     * @return: int
     * @Author: zjd
     * @date: 2019-09-26
     */
    @Override
    public int multiValid(Integer[] ids, int valid) {
        for (Integer id : ids) {
            PayingParty record = new PayingParty();
            record.setProdPayingPartyId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            payingPartyMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
