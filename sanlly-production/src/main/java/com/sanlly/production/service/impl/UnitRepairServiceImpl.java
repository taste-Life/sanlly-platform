package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.UnitRepairMapper;
import com.sanlly.production.entity.UnitRepair;
import com.sanlly.production.entity.UnitRepairExample;
import com.sanlly.production.models.input.unit.UnitRepairInput;
import com.sanlly.production.models.output.unit.UnitRepairOutput;
import com.sanlly.production.service.UnitRepairService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UnitRepairServiceImpl extends  BaseServiceImpl implements UnitRepairService{

    @Autowired
    private UnitRepairMapper unitRepairMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public int update(UnitRepairInput input) {
        UnitRepair record = new UnitRepair();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return unitRepairMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(UnitRepairInput input) {
        UnitRepair record = new UnitRepair();
        BeanUtils.copyProperties(input, record);
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return unitRepairMapper.insertSelective(record);
    }

    @Override
    public PagedList<UnitRepairOutput> pageList(PageInput input, String searchWords) {
        List<UnitRepairOutput> outputList = new ArrayList<UnitRepairOutput>();
        UnitRepairExample example = new UnitRepairExample();
        example.setOrderByClause("create_time DESC");
        UnitRepairExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andRepairCodeLike("%"+searchWords.trim()+"%");
            UnitRepairExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andRepairNameLike("%"+searchWords.trim()+"");
            example.or(criteria2);
            UnitRepairExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andRepairRemarksLike("%"+searchWords.trim()+"");
            example.or(criteria3);
        }
        Integer totalItemCount = (int)unitRepairMapper.countByExample(example);
        PagedList<UnitRepairOutput> pagedList = new PagedList<UnitRepairOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<UnitRepair> list = unitRepairMapper.selectByExample(example);
        for (UnitRepair item : list) {
            UnitRepairOutput output = new UnitRepairOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            UnitRepair record = new UnitRepair();
            record.setProdUnitRepairId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            unitRepairMapper.updateByPrimaryKeySelective(record);
        }
        return 1;

    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            UnitRepair record = new UnitRepair();
            record.setProdUnitRepairId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            unitRepairMapper.updateByPrimaryKeySelective(record);
        }
        return 1;

    }
}
