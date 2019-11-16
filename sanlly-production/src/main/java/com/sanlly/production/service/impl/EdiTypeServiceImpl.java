package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.EdiTypeMapper;
import com.sanlly.production.entity.EdiType;
import com.sanlly.production.entity.EdiTypeExample;
import com.sanlly.production.entity.OdorSpeciesExample;
import com.sanlly.production.models.input.edi.EdiTypeInput;
import com.sanlly.production.models.output.edi.EdiTypeOutput;
import com.sanlly.production.service.EdiTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EdiTypeServiceImpl extends BaseServiceImpl implements EdiTypeService {

    @Autowired
    private EdiTypeMapper ediTypeMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public List<EdiTypeOutput> list() {
        return null;
    }

    @Override
    public EdiTypeOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(EdiTypeInput input) {
        EdiType record = new EdiType();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return ediTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(EdiTypeInput input) {
        EdiType record = new EdiType();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_edi_type"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return ediTypeMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
    *@Description: edi类型分页列表
    *@Param: [input, searchWords]
    *@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.edi.EdiTypeOutput>
    *@Author: zjd
    *@date: 2019-09-27
    */
    @Override
    public PagedList<EdiTypeOutput> pageList(PageInput input, String searchWords) {
        List<EdiTypeOutput> outputList = new ArrayList<EdiTypeOutput>();
        EdiTypeExample example = new EdiTypeExample();
        example.setOrderByClause("create_time DESC");
        EdiTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andEdiTypeCodeLike("%" + searchWords.trim() + "%");
            EdiTypeExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andEdiTypeNameLike("%" + searchWords.trim() + "");
            EdiTypeExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andEdiTypeNameEnLike("%" + searchWords.trim() + "%");
            example.or(criteria2);
            example.or(criteria3);
        }
        Integer totalItemCount = (int) ediTypeMapper.countByExample(example);
        PagedList<EdiTypeOutput> pagedList = new PagedList<EdiTypeOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<EdiType> list = ediTypeMapper.selectByExample(example);
        for (EdiType item : list) {
            EdiTypeOutput output = new EdiTypeOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            EdiType record = new EdiType();
            record.setProdEdiTypeId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            ediTypeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            EdiType record = new EdiType();
            record.setProdEdiTypeId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            ediTypeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
