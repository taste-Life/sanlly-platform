package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.UnitTypeMapper;
import com.sanlly.production.entity.UnitType;
import com.sanlly.production.entity.UnitTypeExample;
import com.sanlly.production.models.input.unittype.UnitTypeInput;
import com.sanlly.production.models.output.unittype.UnitTypeOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.UnitTypeService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UnitTypeServiceImpl extends BaseServiceImpl implements UnitTypeService {

    @Autowired
    private UnitTypeMapper unitTypeMapper;
    @Autowired
    private LangService lang;
    private static final Logger LOGGER = LoggerFactory.getLogger(UnitTypeServiceImpl.class);


    /**
     * @author zhq
     * @date 2019/10/18
     * @description
     */
    @Override
    public PagedList<UnitTypeOutput> getUnitTypeListByKeywords(PageInput input, String searchWords) {
        UnitTypeExample example = new UnitTypeExample();
        example.setOrderByClause("create_time DESC");
        UnitTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotEmpty(searchWords)) {
            String bySearchWords = "%" + StringUtils.trim(searchWords) + "%";
            criteria.andKeyLike(bySearchWords);
            example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUnitCompanyLike(bySearchWords);
            example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUnitTypeScopeLike(bySearchWords);
            example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUnitTypeCodeLike(bySearchWords);
        }
        Integer totalItemCount = (int) unitTypeMapper.countByExample(example);
        PagedList<UnitTypeOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<UnitType> unitTypeList = unitTypeMapper.selectByExample(example);
        List<UnitTypeOutput> outputList = new ArrayList<>();
        unitTypeList.forEach(unitType -> {
            UnitTypeOutput output = new UnitTypeOutput();
            BeanUtils.copyProperties(unitType, output);
            output.setCreateTime(DateUtil.date2String(unitType.getCreateTime()));
            output.setUpdateTime(DateUtil.date2String(unitType.getUpdateTime()));
            output.setKey(unitType.getKey());
            output.setUnitCompanyLangLang(unitType.getUnitCompany());
            outputList.add(output);
        });
        pagedList.setDataList(outputList);
        return pagedList;
    }

    /**
     * @param unitTypeInput
     * @author zhq
     * @date 2019/10/19
     * @description 根据主键更新机型记录
     */
    @Override
    public int updateUnitTypeById(UnitTypeInput unitTypeInput) {
        UnitType unitType = new UnitType();
        BeanUtils.copyProperties(unitTypeInput, unitType);
        unitType.setUpdateUser(super.getCurrentUserId());
        unitType.setUpdateTime(new Date());
        return unitTypeMapper.updateByPrimaryKeySelective(unitType);
    }

    /**
     * @param unitTypeInput
     * @author zhq
     * @date 2019/10/18
     * @description
     */
    @Override
    public int addUnitType(UnitTypeInput unitTypeInput) {
        UnitType unitType = new UnitType();
        BeanUtils.copyProperties(unitTypeInput, unitType);
        unitType.setKey(lang.getLangRuleKeyByTable("prod_unit_type"));
        unitType.setIsDel(PlatformConstants.ISDEL_NO);
        unitType.setCreateUser(getCurrentUserId());
        unitType.setCreateTime(new Date());
        return unitTypeMapper.insertSelective(unitType);
    }


    /**
     * @param ids
     * @author zhq
     * @date 2019/10/19
     * @description 根据主键列表删除记录
     */
    @Override
    public int deleteUnitTypeByIds(Integer[] ids) {
        UnitTypeExample unitTypeExample = new UnitTypeExample();
        unitTypeExample.createCriteria().andProdUnitTypeIdIn(Arrays.asList(ids));
        UnitType unitType = new UnitType();
        unitType.setIsDel(PlatformConstants.ISDEL_YES);
        unitType.setUpdateTime(new Date());
        unitType.setUpdateUser(super.getCurrentUserId());
        return unitTypeMapper.updateByExampleSelective(unitType, unitTypeExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/10/21
     * @description 批量设置有效性
     */
    @Override
    public int multiValid(Integer[] ids, int valid) {

        UnitTypeExample unitTypeExample = new UnitTypeExample();
        unitTypeExample.createCriteria().andProdUnitTypeIdIn(Arrays.asList(ids));
        UnitType unitType = new UnitType();
        unitType.setIsValid(valid);
        unitType.setUpdateTime(new Date());
        unitType.setUpdateUser(super.getCurrentUserId());
        LOGGER.info(unitType.toString());
        return unitTypeMapper.updateByExampleSelective(unitType, unitTypeExample);
    }


}
