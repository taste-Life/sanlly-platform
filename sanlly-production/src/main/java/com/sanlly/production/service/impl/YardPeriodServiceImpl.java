package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.YardPeroidSettingMapper;
import com.sanlly.production.entity.YardPeroidSetting;
import com.sanlly.production.entity.YardPeroidSettingExample;
import com.sanlly.production.models.input.yardperiod.YardPeriodInputAdd;
import com.sanlly.production.models.input.yardperiod.YardPeriodInputUpdate;
import com.sanlly.production.models.output.yardperiod.YardPeriodOutput;
import com.sanlly.production.service.YardPeriodService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/11
 * @description
 */
@Service
public class YardPeriodServiceImpl extends BaseServiceImpl implements YardPeriodService {

    @Autowired
    private YardPeroidSettingMapper yardPeroidSettingMapper;

    /**
     * @param yardPeriodInputAdd
     * @author zhq
     * @date 2019/11/11
     * @description 新增场站时段
     */
    @Override
    public int addYardPeriod(YardPeriodInputAdd yardPeriodInputAdd) {
        YardPeroidSetting yardPeroidSetting = new YardPeroidSetting();
        BeanUtils.copyProperties(yardPeriodInputAdd, yardPeroidSetting);
        yardPeroidSetting.setCreateTime(new Date());
        yardPeroidSetting.setCreateUser(super.getCurrentUserId());
        yardPeroidSetting.setIsDel(PlatformConstants.ISDEL_NO);
        yardPeroidSetting.setIsValid(PlatformConstants.ISVALID_YES);
        return yardPeroidSettingMapper.insertSelective(yardPeroidSetting);
    }

    /**
     * @param yardPeriodInputUpdate
     * @author zhq
     * @date 2019/11/11
     * @description 修改场站时段
     */
    @Override
    public int updateYardPeriod(YardPeriodInputUpdate yardPeriodInputUpdate) {
        YardPeroidSetting yardPeroidSetting = new YardPeroidSetting();
        BeanUtils.copyProperties(yardPeriodInputUpdate, yardPeroidSetting);
        yardPeroidSetting.setUpdateTime(new Date());
        yardPeroidSetting.setUpdateUser(super.getCurrentUserId());
        return yardPeroidSettingMapper.updateByPrimaryKeySelective(yardPeroidSetting);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/11
     * @description 删除场站时段
     */
    @Override
    public int deleteYardPeriod(Integer[] ids) {
        YardPeroidSettingExample yardPeroidSettingExample = new YardPeroidSettingExample();
        yardPeroidSettingExample.createCriteria().andProdYardPeroidSettingIdIn(Arrays.asList(ids));
        YardPeroidSetting yardPeroidSetting = new YardPeroidSetting();
        yardPeroidSetting.setIsDel(PlatformConstants.ISDEL_YES);
        return yardPeroidSettingMapper.updateByExampleSelective(yardPeroidSetting, yardPeroidSettingExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/11
     * @description
     */
    @Override
    public int validateYardPeriod(Integer[] ids, Integer valid) {
        YardPeroidSettingExample yardPeroidSettingExample = new YardPeroidSettingExample();
        yardPeroidSettingExample.createCriteria().andProdYardPeroidSettingIdIn(Arrays.asList(ids));
        YardPeroidSetting yardPeroidSetting = new YardPeroidSetting();
        yardPeroidSetting.setIsValid(valid);
        return yardPeroidSettingMapper.updateByExampleSelective(yardPeroidSetting, yardPeroidSettingExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/11
     * @description 分页查询
     */
    @Override
    public PagedList<YardPeriodOutput> getYarPeriodList(Integer index, Integer size, String searchWords) {
        YardPeroidSettingExample yardPeroidSettingExample = new YardPeroidSettingExample();
        yardPeroidSettingExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) yardPeroidSettingMapper.countByExample(yardPeroidSettingExample);
        PagedList<YardPeriodOutput> pagedList = new PagedList<>(index, size, totalNums);
        yardPeroidSettingExample.setOrderByClause("create_time desc");
        yardPeroidSettingExample.setLimitStart(pagedList.getLimitStart());
        yardPeroidSettingExample.setLimitEnd(pagedList.getLimitEnd());
        List<YardPeroidSetting> yardPeroidSettingList = yardPeroidSettingMapper.selectByExample(yardPeroidSettingExample);
        List<YardPeriodOutput> yardPeriodOutputList = yardPeroidSettingList.stream().map(yardPeroidSetting -> {
            YardPeriodOutput yardPeriodOutput = new YardPeriodOutput();
            BeanUtils.copyProperties(yardPeroidSetting, yardPeriodOutput);
            yardPeriodOutput.setCompanyNameLang(yardPeroidSetting.getCompany());
            return yardPeriodOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(yardPeriodOutputList);
        return pagedList;
    }
}
