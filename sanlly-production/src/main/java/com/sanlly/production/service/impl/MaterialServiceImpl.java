package com.sanlly.production.service.impl;

import com.netflix.discovery.converters.Auto;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.MaterialMapper;
import com.sanlly.production.entity.Material;
import com.sanlly.production.entity.MaterialExample;
import com.sanlly.production.entity.RepairExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.material.MaterialInput;
import com.sanlly.production.models.output.material.MaterialOutput;
import com.sanlly.production.service.MaterialService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MaterialServiceImpl extends  BaseServiceImpl implements MaterialService{

    @Autowired
    private MaterialMapper materialMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public List<MaterialOutput> list() {
        return null;
    }

    @Override
    public MaterialOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(MaterialInput input) {
        Material record = new Material();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return materialMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(MaterialInput input) {
        Material record = new Material();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_material"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return materialMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
    *@Description: 材质分页列表
    *@Param: [input, searchWords]
    *@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.material.MaterialOutput>
    *@Author: zjd
    *@date: 2019-09-26
    */
    @Override
    public PagedList<MaterialOutput> pageList(PageInput input, String searchWords) {
        List<MaterialOutput> outputList = new ArrayList<MaterialOutput>();
        MaterialExample example = new MaterialExample();
        example.setOrderByClause("create_time DESC");
        MaterialExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andMaterialCodeLike("%"+searchWords.trim()+"%");
            MaterialExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andMaterialNameLike("%"+searchWords.trim()+"");
            MaterialExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andMaterialNameEnLike("%"+searchWords.trim()+"%");
            example.or(criteria2);
            example.or(criteria3);
            //通过message查询code,模糊查询category
            String containerCategory = ContainerCategoryEnum.getCodeByMessage(searchWords);
            if(containerCategory != null){
                MaterialExample.Criteria criteria4 = example.createCriteria();
                criteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria4.andContainerCategoryLike("%"+containerCategory.trim()+"%");
                example.or(criteria4);
            }

        }
        Integer totalItemCount = (int)materialMapper.countByExample(example);
        PagedList<MaterialOutput> pagedList = new PagedList<MaterialOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<Material> list = materialMapper.selectByExample(example);
        for (Material item : list) {
            MaterialOutput output = new MaterialOutput();
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
            Material record = new Material();
            record.setProdMaterialId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            materialMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            Material record = new Material();
            record.setProdMaterialId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            materialMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
