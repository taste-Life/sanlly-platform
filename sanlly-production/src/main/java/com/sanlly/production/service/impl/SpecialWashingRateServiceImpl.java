package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.SpecialWashingRateMapper;
import com.sanlly.production.entity.SpecialWashingRate;
import com.sanlly.production.entity.SpecialWashingRateExample;
import com.sanlly.production.models.input.rate.SpecialWashingRateInput;
import com.sanlly.production.models.output.rate.SpecialWashingRateOutput;
import com.sanlly.production.service.SpecialWashingRateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
*@Description: 特殊洗箱费率
*@Author: zjd
*@date: 2019-09-30
*/

@Service
public class SpecialWashingRateServiceImpl extends  BaseServiceImpl implements SpecialWashingRateService {
    @Autowired
    private SpecialWashingRateMapper specialWashingRateMapper;
    @Autowired
    private LangServiceImpl lang;

    @Override
    public int update(SpecialWashingRateInput input) {
        SpecialWashingRate record = new SpecialWashingRate();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return specialWashingRateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(SpecialWashingRateInput input) {
        SpecialWashingRate record = new SpecialWashingRate();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_special_washing_rate"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return specialWashingRateMapper.insertSelective(record);
    }

    @Override
    public PagedList<SpecialWashingRateOutput> pageList(PageInput input, String searchWords) {
        List<SpecialWashingRateOutput> outputList = new ArrayList<SpecialWashingRateOutput>();
        SpecialWashingRateExample example = new SpecialWashingRateExample();
        example.setOrderByClause("create_time DESC");
        SpecialWashingRateExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andGoodsNameLike("%"+searchWords.trim()+"%");
            SpecialWashingRateExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andGoodsNameEnLike("%"+searchWords.trim()+"");
            example.or(criteria2);
        }
        Integer totalItemCount = (int)specialWashingRateMapper.countByExample(example);
        PagedList<SpecialWashingRateOutput> pagedList = new PagedList<SpecialWashingRateOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<SpecialWashingRate> list = specialWashingRateMapper.selectByExample(example);
        for (SpecialWashingRate item : list) {
            SpecialWashingRateOutput output = new SpecialWashingRateOutput();
            BeanUtils.copyProperties(item, output);
            output.setCompanyLang(item.getCompany());
            output.setWashingTypeLang(item.getWashingType());
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            SpecialWashingRate record = new SpecialWashingRate();
            record.setProdSpecialWashingRateId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            specialWashingRateMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            SpecialWashingRate record = new SpecialWashingRate();
            record.setProdSpecialWashingRateId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            specialWashingRateMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
