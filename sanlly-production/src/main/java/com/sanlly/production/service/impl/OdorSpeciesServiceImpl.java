package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.OdorSpeciesMapper;
import com.sanlly.production.entity.MaterialExample;
import com.sanlly.production.entity.OdorSpecies;
import com.sanlly.production.entity.OdorSpeciesExample;
import com.sanlly.production.models.input.odor.OdorSpeciesInput;
import com.sanlly.production.models.output.odor.OdorSpeciesOutput;
import com.sanlly.production.service.OdorSpeciesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OdorSpeciesServiceImpl extends  BaseServiceImpl implements OdorSpeciesService {

    @Autowired
    private OdorSpeciesMapper odorSpeciesMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public List<OdorSpeciesOutput> list() {
        return null;
    }

    @Override
    public OdorSpeciesOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(OdorSpeciesInput input) {
        OdorSpecies record = new OdorSpecies();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return odorSpeciesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(OdorSpeciesInput input) {
        OdorSpecies record = new OdorSpecies();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_odor_species"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return odorSpeciesMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
    *@Description: 异味种类分页列表
    *@Param: [input, searchWords]
    *@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.odor.OdorSpeciesOutput>
    *@Author: zjd
    *@date: 2019-09-27
    */
    @Override
    public PagedList<OdorSpeciesOutput> pageList(PageInput input, String searchWords) {
        List<OdorSpeciesOutput> outputList = new ArrayList<OdorSpeciesOutput>();
        OdorSpeciesExample example = new OdorSpeciesExample();
        example.setOrderByClause("create_time DESC");
        OdorSpeciesExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andOdorSpeciesCodeLike("%"+searchWords.trim()+"%");
            OdorSpeciesExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andOdorSpeciesNameLike("%"+searchWords.trim()+"");
            OdorSpeciesExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andOdorSpeciesNameEnLike("%"+searchWords.trim()+"%");
            example.or(criteria2);
            example.or(criteria3);
        }
        Integer totalItemCount = (int)odorSpeciesMapper.countByExample(example);
        PagedList<OdorSpeciesOutput> pagedList = new PagedList<OdorSpeciesOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<OdorSpecies> list = odorSpeciesMapper.selectByExample(example);
        for (OdorSpecies item : list) {
            OdorSpeciesOutput output = new OdorSpeciesOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            OdorSpecies record = new OdorSpecies();
            record.setProdOdorSpeciesId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            odorSpeciesMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            OdorSpecies record = new OdorSpecies();
            record.setProdOdorSpeciesId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            odorSpeciesMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
