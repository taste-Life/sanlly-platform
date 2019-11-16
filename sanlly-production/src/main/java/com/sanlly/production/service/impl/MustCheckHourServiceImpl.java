package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.MustCheckHourMapper;
import com.sanlly.production.entity.MustCheckHour;
import com.sanlly.production.entity.MustCheckHourExample;
import com.sanlly.production.models.input.mustcheckhour.MustCheckHourInputAdd;
import com.sanlly.production.models.input.mustcheckhour.MustCheckHourInputUpdate;
import com.sanlly.production.models.output.mustcheckhour.MustCheckHourOutput;
import com.sanlly.production.service.MustCheckHourService;
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
public class MustCheckHourServiceImpl extends BaseServiceImpl implements MustCheckHourService {

    @Autowired
    private MustCheckHourMapper mustCheckHourMapper;

    /**
     * @param mustCheckHourInputAdd
     * @author zhq
     * @date 2019/11/11
     * @description 新增必检工时
     */
    @Override
    public int addMustCheckHour(MustCheckHourInputAdd mustCheckHourInputAdd) {
        MustCheckHour mustCheckHour = new MustCheckHour();
        BeanUtils.copyProperties(mustCheckHourInputAdd, mustCheckHour);
        mustCheckHour.setCreateTime(new Date());
        mustCheckHour.setCreateUser(super.getCurrentUserId());
        mustCheckHour.setIsDel(PlatformConstants.ISDEL_NO);
        mustCheckHour.setIsValid(PlatformConstants.ISVALID_YES);
        return mustCheckHourMapper.insertSelective(mustCheckHour);
    }

    /**
     * @param mustCheckHourInputUpdate
     * @author zhq
     * @date 2019/11/11
     * @description 修改必检工时
     */
    @Override
    public int updateMustCheckHour(MustCheckHourInputUpdate mustCheckHourInputUpdate) {
        MustCheckHour mustCheckHour = new MustCheckHour();
        BeanUtils.copyProperties(mustCheckHourInputUpdate, mustCheckHour);
        mustCheckHour.setUpdateTime(new Date());
        mustCheckHour.setUpdateUser(super.getCurrentUserId());
        return mustCheckHourMapper.updateByPrimaryKeySelective(mustCheckHour);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/11
     * @description 删除必检工时
     */
    @Override
    public int deleteMustCheckHour(Integer[] ids) {
        MustCheckHourExample mustCheckHourExample = new MustCheckHourExample();
        mustCheckHourExample.createCriteria().andProdMustCheckHourIdIn(Arrays.asList(ids));
        MustCheckHour mustCheckHour = new MustCheckHour();
        mustCheckHour.setIsDel(PlatformConstants.ISDEL_YES);
        return mustCheckHourMapper.updateByExampleSelective(mustCheckHour, mustCheckHourExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/11
     * @description 设置有效
     */
    @Override
    public int validateMustCheckHour(Integer[] ids, Integer valid) {
        MustCheckHourExample mustCheckHourExample = new MustCheckHourExample();
        mustCheckHourExample.createCriteria().andProdMustCheckHourIdIn(Arrays.asList(ids));
        MustCheckHour mustCheckHour = new MustCheckHour();
        mustCheckHour.setIsValid(valid);
        return mustCheckHourMapper.updateByExampleSelective(mustCheckHour, mustCheckHourExample);
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
    public PagedList<MustCheckHourOutput> getMustCheckHourList(Integer index, Integer size, String searchWords) {
        MustCheckHourExample mustCheckHourExample = new MustCheckHourExample();
        mustCheckHourExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) mustCheckHourMapper.countByExample(mustCheckHourExample);
        PagedList<MustCheckHourOutput> pagedList = new PagedList<>(index, size, totalNums);
        mustCheckHourExample.setOrderByClause("create_time desc");
        mustCheckHourExample.setLimitStart(pagedList.getLimitStart());
        mustCheckHourExample.setLimitEnd(pagedList.getLimitEnd());
        List<MustCheckHour> mustCheckHourList = mustCheckHourMapper.selectByExample(mustCheckHourExample);
        List<MustCheckHourOutput> mustCheckHourOutputList = mustCheckHourList.stream().map(mustCheckHour -> {
            MustCheckHourOutput mustCheckHourOutput = new MustCheckHourOutput();
            BeanUtils.copyProperties(mustCheckHour, mustCheckHourOutput);
            mustCheckHourOutput.setCompanyNameLang(mustCheckHour.getCompany());
            mustCheckHourOutput.setContainerCategoryNameLang(mustCheckHour.getContainerCategory());
            return mustCheckHourOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(mustCheckHourOutputList);
        return pagedList;
    }
}
