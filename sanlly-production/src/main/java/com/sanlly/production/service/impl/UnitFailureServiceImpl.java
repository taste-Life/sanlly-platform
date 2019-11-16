package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.UnitFailureMapper;
import com.sanlly.production.entity.UnitFailure;
import com.sanlly.production.entity.UnitFailureExample;
import com.sanlly.production.models.input.unitfailure.UnitFailureInputAdd;
import com.sanlly.production.models.input.unitfailure.UnitFailureInputUpdate;
import com.sanlly.production.models.output.unitfailure.UnitFailureOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.UnitFailureService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/1
 * @description
 */
@Service
public class UnitFailureServiceImpl extends BaseServiceImpl implements UnitFailureService {

    @Autowired
    private LangService langService;
    @Autowired
    private UnitFailureMapper unitFailureMapper;

    /**
     * @param unitFailureInputAdd
     * @author zhq
     * @date 2019/11/1
     * @description 新增机组故障
     */
    @Override
    public int addUnitFailure(UnitFailureInputAdd unitFailureInputAdd) {
        UnitFailure unitFailure = new UnitFailure();
        BeanUtils.copyProperties(unitFailureInputAdd, unitFailure);
        unitFailure.setKey(langService.getLangRuleKeyByTable("prod_unit_failure"));
        unitFailure.setIsDel(PlatformConstants.ISDEL_NO);
        unitFailure.setIsValid(PlatformConstants.ISVALID_YES);
        unitFailure.setCreateTime(new Date());
        unitFailure.setCreateUser(super.getCurrentUserId());
        return unitFailureMapper.insertSelective(unitFailure);
    }

    /**
     * @param unitFailureInputUpdate
     * @author zhq
     * @date 2019/11/1
     * @description 修改机组故障
     */
    @Override
    public int updateUnitFailure(UnitFailureInputUpdate unitFailureInputUpdate) {
        UnitFailure unitFailure = new UnitFailure();
        BeanUtils.copyProperties(unitFailureInputUpdate, unitFailure);
        unitFailure.setUpdateTime(new Date());
        unitFailure.setUpdateUser(super.getCurrentUserId());
        return unitFailureMapper.updateByPrimaryKeySelective(unitFailure);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/1
     * @description 批量删除
     */
    @Override
    public int deleteUnitFailure(Integer[] ids) {
        UnitFailure unitFailure = new UnitFailure();
        unitFailure.setIsDel(PlatformConstants.ISDEL_YES);
        UnitFailureExample unitFailureExample = new UnitFailureExample();
        unitFailureExample.or().andProdUnitFailureIdIn(Arrays.asList(ids));
        return unitFailureMapper.updateByExampleSelective(unitFailure, unitFailureExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/1
     * @description 设置有效
     */
    @Override
    public int validateUnitFailure(Integer[] ids, Integer valid) {
        UnitFailure unitFailure = new UnitFailure();
        unitFailure.setIsValid(valid);
        UnitFailureExample unitFailureExample = new UnitFailureExample();
        unitFailureExample.or().andProdUnitFailureIdIn(Arrays.asList(ids));
        return unitFailureMapper.updateByExampleSelective(unitFailure, unitFailureExample);
    }

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 根据关键字分页查询机组故障列表
     */
    @Override
    public PagedList<UnitFailureOutput> getUnitFailureList(Integer index, Integer size, String searchWords) {
        UnitFailureExample unitFailureExample = new UnitFailureExample();
        UnitFailureExample.Criteria criteria = unitFailureExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andUnitFailureNameEnLike(bySearchWords);
            unitFailureExample.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUnitFailureNameEnLike(bySearchWords);
        }
        Integer totalNums = (int) unitFailureMapper.countByExample(unitFailureExample);
        PagedList<UnitFailureOutput> pagedList = new PagedList<>(index, size, totalNums);
        unitFailureExample.setLimitStart(pagedList.getLimitStart());
        unitFailureExample.setLimitEnd(pagedList.getLimitEnd());
        unitFailureExample.setOrderByClause("create_time desc");
        List<UnitFailure> unitFailureList = unitFailureMapper.selectByExample(unitFailureExample);
        List<UnitFailureOutput> unitFailureOutputList = unitFailureList.stream().map(unitFailure -> {
            UnitFailureOutput unitFailureOutput = new UnitFailureOutput();
            BeanUtils.copyProperties(unitFailure, unitFailureOutput);
            unitFailureOutput.setKeyNameLang(unitFailure.getKey());
            return unitFailureOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(unitFailureOutputList);
        return pagedList;
    }
}
