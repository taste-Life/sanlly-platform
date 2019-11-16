package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.PartsTypeMapper;
import com.sanlly.production.entity.PartsType;
import com.sanlly.production.entity.PartsTypeExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.parts.PartsTypeInput;
import com.sanlly.production.models.output.parts.PartsTypeOutput;
import com.sanlly.production.service.PartsTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PartsTypeServiceImpl extends  BaseServiceImpl implements PartsTypeService {

    @Autowired
    private PartsTypeMapper partsTypeMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public List<PartsTypeOutput> list() {
        return null;
    }

    @Override
    public PartsTypeOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(PartsTypeInput input) {
        PartsType record = new PartsType();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return partsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(PartsTypeInput input) {
        PartsType record = new PartsType();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_paying_party"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return partsTypeMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public PagedList<PartsTypeOutput> pageList(PageInput input, String searchWords) {
        List<PartsTypeOutput> outputList = new ArrayList<PartsTypeOutput>();
        PartsTypeExample example = new PartsTypeExample();
        example.setOrderByClause("create_time DESC");
        PartsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andPartsTypeCodeLike("%"+searchWords.trim()+"%");
            PartsTypeExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andPartsTypeNameLike("%"+searchWords.trim()+"");
            PartsTypeExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andPartsTypeNameEnLike("%"+searchWords.trim()+"%");
            example.or(criteria2);
            example.or(criteria3);
            //通过message查询code,模糊查询category
            String containerCategory = ContainerCategoryEnum.getCodeByMessage(searchWords);
            if(containerCategory != null){
                PartsTypeExample.Criteria criteria4 = example.createCriteria();
                criteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria4.andContainerCategoryLike("%"+containerCategory.trim()+"%");
                example.or(criteria4);
            }

        }
        Integer totalItemCount = (int)partsTypeMapper.countByExample(example);
        PagedList<PartsTypeOutput> pagedList = new PagedList<PartsTypeOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<PartsType> list = partsTypeMapper.selectByExample(example);
        for (PartsType item : list) {
            PartsTypeOutput output = new PartsTypeOutput();
            BeanUtils.copyProperties(item, output);
            output.setContainerCategory(ContainerCategoryEnum.getMessagebyCode(item.getContainerCategory()));
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            PartsType record = new PartsType();
            record.setProdPartsTypeId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            partsTypeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            PartsType record = new PartsType();
            record.setProdPartsTypeId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            partsTypeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
