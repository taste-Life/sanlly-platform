package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.DamageMapper;
import com.sanlly.production.entity.Damage;
import com.sanlly.production.entity.DamageExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.damage.DamageInput;
import com.sanlly.production.models.output.damage.DamageOutput;
import com.sanlly.production.service.DamageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DamageServiceImpl extends BaseServiceImpl implements DamageService {

    @Autowired
    private DamageMapper damageMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public List<DamageOutput> list() {
        return null;
    }

    @Override
    public DamageOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(DamageInput input) {
        Damage record = new Damage();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return damageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(DamageInput input) {
        Damage record = new Damage();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_damage"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return damageMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
    *@Description: 损坏代码分页列表
    *@Param: [input, searchWords]
    *@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.damage.DamageOutput>
    *@Author: zjd
    *@date: 2019-09-26
    */
    @Override
    public PagedList<DamageOutput> pageList(PageInput input, String searchWords) {
        List<DamageOutput> outputList = new ArrayList<DamageOutput>();
        DamageExample example = new DamageExample();
        example.setOrderByClause("create_time DESC");
        DamageExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andDamageCodeLike("%"+searchWords.trim()+"%");
            DamageExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andDamageNameLike("%"+searchWords.trim()+"");
            DamageExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andDamageNameEnLike("%"+searchWords.trim()+"%");
            example.or(criteria2);
            example.or(criteria3);
            //通过message查询code,模糊查询category
            String containerCategory = ContainerCategoryEnum.getCodeByMessage(searchWords);
            if(containerCategory != null){
                DamageExample.Criteria criteria4 = example.createCriteria();
                criteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria4.andContainerCategoryLike("%"+containerCategory.trim()+"%");
                example.or(criteria4);
            }

        }
        Integer totalItemCount = (int)damageMapper.countByExample(example);
        PagedList<DamageOutput> pagedList = new PagedList<DamageOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<Damage> list = damageMapper.selectByExample(example);
        for (Damage item : list) {
            DamageOutput output = new DamageOutput();
            BeanUtils.copyProperties(item, output);
            output.setContainerCategory(ContainerCategoryEnum.getMessagebyCode(item.getContainerCategory()));
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    /**
    *@Description: 批量删除
    *@Param: [ids]
    *@return: int
    *@Author: zjd
    *@date: 2019-09-26
    */
    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            Damage record = new Damage();
            record.setProdDamageId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            damageMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    /**
    *@Description: 批量修改有效性
    *@Param: [ids, valid]
    *@return: int
    *@Author: zjd
    *@date: 2019-09-26
    */
    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            Damage record = new Damage();
            record.setProdDamageId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            damageMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
