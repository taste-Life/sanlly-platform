package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.QualityControlTimeMapper;
import com.sanlly.production.entity.QualityControlTime;
import com.sanlly.production.entity.QualityControlTimeExample;
import com.sanlly.production.models.input.qualitycontrol.QualityControlTimeInputAdd;
import com.sanlly.production.models.input.qualitycontrol.QualityControlTimeInputUpdate;
import com.sanlly.production.models.output.qualitycontrol.QualityControlTimeOutput;
import com.sanlly.production.service.QualityControlTimeService;
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
public class QualityConrtrolTimeServiceImpl extends BaseServiceImpl implements QualityControlTimeService {

    @Autowired
    private QualityControlTimeMapper qualityControlTimeMapper;

    /**
     * @param qualityControlTimeInputAdd
     * @author zhq
     * @date 2019/11/11
     * @description 新增质检时间
     */
    @Override
    public int addQualityControlTime(QualityControlTimeInputAdd qualityControlTimeInputAdd) {
        QualityControlTime qualityControlTime = new QualityControlTime();
        BeanUtils.copyProperties(qualityControlTimeInputAdd, qualityControlTime);
        qualityControlTime.setCreateTime(new Date());
        qualityControlTime.setCreateUser(super.getCurrentUserId());
        qualityControlTime.setIsDel(PlatformConstants.ISDEL_NO);
        qualityControlTime.setIsValid(PlatformConstants.ISVALID_YES);
        return qualityControlTimeMapper.insertSelective(qualityControlTime);
    }

    /**
     * @param qualityControlTimeInputUpdate
     * @author zhq
     * @date 2019/11/11
     * @description 修改质检时间
     */
    @Override
    public int updateQualityControlTime(QualityControlTimeInputUpdate qualityControlTimeInputUpdate) {
        QualityControlTime qualityControlTime = new QualityControlTime();
        BeanUtils.copyProperties(qualityControlTimeInputUpdate, qualityControlTime);
        qualityControlTime.setUpdateTime(new Date());
        qualityControlTime.setUpdateUser(super.getCurrentUserId());
        return qualityControlTimeMapper.updateByPrimaryKeySelective(qualityControlTime);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/11
     * @description 删除质检时间
     */
    @Override
    public int deleteQualityControlTime(Integer[] ids) {
        QualityControlTimeExample qualityControlTimeExample = new QualityControlTimeExample();
        qualityControlTimeExample.createCriteria().andProdQualityControlTimeIdIn(Arrays.asList(ids));
        QualityControlTime qualityControlTime = new QualityControlTime();
        qualityControlTime.setIsDel(PlatformConstants.ISDEL_YES);
        return qualityControlTimeMapper.updateByExampleSelective(qualityControlTime, qualityControlTimeExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/11
     * @description
     */
    @Override
    public int validateQualityControlTime(Integer[] ids, Integer valid) {
        QualityControlTimeExample qualityControlTimeExample = new QualityControlTimeExample();
        qualityControlTimeExample.createCriteria().andProdQualityControlTimeIdIn(Arrays.asList(ids));
        QualityControlTime qualityControlTime = new QualityControlTime();
        qualityControlTime.setIsValid(valid);
        return qualityControlTimeMapper.updateByExampleSelective(qualityControlTime, qualityControlTimeExample);
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
    public PagedList<QualityControlTimeOutput> getQualityControlTimeList(Integer index, Integer size, String searchWords) {
        QualityControlTimeExample qualityControlTimeExample = new QualityControlTimeExample();
        qualityControlTimeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) qualityControlTimeMapper.countByExample(qualityControlTimeExample);
        PagedList<QualityControlTimeOutput> pagedList = new PagedList<>(index, size, totalNums);
        qualityControlTimeExample.setOrderByClause("create_time desc");
        qualityControlTimeExample.setLimitStart(pagedList.getLimitStart());
        qualityControlTimeExample.setLimitEnd(pagedList.getLimitEnd());
        List<QualityControlTime> qualityControlTimeList = qualityControlTimeMapper.selectByExample(qualityControlTimeExample);
        List<QualityControlTimeOutput> qualityControlTimeOutputList = qualityControlTimeList.stream().map(qualityControlTime -> {
            QualityControlTimeOutput qualityControlTimeOutput = new QualityControlTimeOutput();
            BeanUtils.copyProperties(qualityControlTime, qualityControlTimeOutput);
            qualityControlTimeOutput.setCompanyNameLang(qualityControlTime.getCompany());
            qualityControlTimeOutput.setContainerCategoryNameLang(qualityControlTime.getContainerCategory());
            qualityControlTimeOutput.setQualityControlTypeNameLang(qualityControlTime.getQualityControlType());
            return qualityControlTimeOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(qualityControlTimeOutputList);
        return pagedList;
    }
}
