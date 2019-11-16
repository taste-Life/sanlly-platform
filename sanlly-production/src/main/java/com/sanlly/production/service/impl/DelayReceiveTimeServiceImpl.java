package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.DelayReceiveTimeMapper;
import com.sanlly.production.entity.DelayReceiveTime;
import com.sanlly.production.entity.DelayReceiveTimeExample;
import com.sanlly.production.models.input.delay.DelayReceiveTimeInput;
import com.sanlly.production.models.output.delay.DelayReceiveTimeOutput;
import com.sanlly.production.models.output.edi.EdiTypeOutput;
import com.sanlly.production.service.DelayReceiveTimeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
*@Description: 延期领料时间
*@Author: zjd
*@date: 2019-09-30
*/
@Service
public class DelayReceiveTimeServiceImpl extends BaseServiceImpl implements DelayReceiveTimeService{

    @Autowired
    private DelayReceiveTimeMapper delayReceiveTimeMapper;

    @Autowired
    private LangServiceImpl lang;


    @Override
    public int update(DelayReceiveTimeInput input) {
        DelayReceiveTime record = new DelayReceiveTime();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return delayReceiveTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(DelayReceiveTimeInput input) {
        DelayReceiveTime record = new DelayReceiveTime();
        BeanUtils.copyProperties(input, record);
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return delayReceiveTimeMapper.insertSelective(record);
    }

    @Override
    public PagedList<DelayReceiveTimeOutput> pageList(PageInput input, String searchWords) {
        List<DelayReceiveTimeOutput> outputList = new ArrayList<DelayReceiveTimeOutput>();
        DelayReceiveTimeExample example = new DelayReceiveTimeExample();
        example.setOrderByClause("create_time DESC");
        DelayReceiveTimeExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andReceiveTimeEqualTo(Integer.parseInt(searchWords.trim()));
        }
        Integer totalItemCount = (int) delayReceiveTimeMapper.countByExample(example);
        PagedList<DelayReceiveTimeOutput> pagedList = new PagedList<DelayReceiveTimeOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<DelayReceiveTime> list = delayReceiveTimeMapper.selectByExample(example);
        for (DelayReceiveTime item : list) {
            DelayReceiveTimeOutput output = new DelayReceiveTimeOutput();
            BeanUtils.copyProperties(item, output);
            output.setCompanyLang(item.getCompany());
            output.setContainerTypeLang(item.getContainerType());
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            DelayReceiveTime record = new DelayReceiveTime();
            record.setProdDelayReceiveTimeId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            delayReceiveTimeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            DelayReceiveTime record = new DelayReceiveTime();
            record.setProdDelayReceiveTimeId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            delayReceiveTimeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
