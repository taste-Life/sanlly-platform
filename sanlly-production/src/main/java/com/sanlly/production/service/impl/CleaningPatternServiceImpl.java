package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CleaningPatternMapper;
import com.sanlly.production.entity.CleaningPattern;
import com.sanlly.production.entity.CleaningPatternExample;
import com.sanlly.production.models.input.cleaningpattern.CleaningPatternInputAdd;
import com.sanlly.production.models.input.cleaningpattern.CleaningPatternInputUpdate;
import com.sanlly.production.models.output.cleaningpattern.CleaningPatternOutput;
import com.sanlly.production.service.CleaningPatternService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
@Service
public class CleaningPatternServiceImpl extends BaseServiceImpl implements CleaningPatternService {

    @Autowired
    private CleaningPatternMapper cleaningPatternMapper;

    /**
     * @param cleaningPatternInputAdd
     * @author zhq
     * @date 2019/11/8
     * @description 新增洗箱模式
     */
    @Override
    public int addCleaningPattern(CleaningPatternInputAdd cleaningPatternInputAdd) {
        CleaningPattern cleaningPattern = new CleaningPattern();
        BeanUtils.copyProperties(cleaningPatternInputAdd, cleaningPattern);
        cleaningPattern.setCreateTime(new Date());
        cleaningPattern.setCreateUser(super.getCurrentUserId());
        cleaningPattern.setIsDel(PlatformConstants.ISDEL_NO);
        cleaningPattern.setIsValid(PlatformConstants.ISVALID_YES);
        return cleaningPatternMapper.insertSelective(cleaningPattern);
    }

    /**
     * @param cleaningPatternInputUpdate
     * @author zhq
     * @date 2019/11/8
     * @description 修改洗箱模式
     */
    @Override
    public int updateClearningPattern(CleaningPatternInputUpdate cleaningPatternInputUpdate) {
        CleaningPattern cleaningPattern = new CleaningPattern();
        BeanUtils.copyProperties(cleaningPatternInputUpdate, cleaningPattern);
        cleaningPattern.setUpdateTime(new Date());
        cleaningPattern.setUpdateUser(super.getCurrentUserId());
        return cleaningPatternMapper.updateByPrimaryKeySelective(cleaningPattern);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/8
     * @description 删除洗箱模式
     */
    @Override
    public int deleteCleaningPattern(Integer[] ids) {
        CleaningPatternExample cleaningPatternExample = new CleaningPatternExample();
        cleaningPatternExample.createCriteria().andProdCleaningPatternIdIn(Arrays.asList(ids));
        CleaningPattern cleaningPattern = new CleaningPattern();
        cleaningPattern.setIsDel(PlatformConstants.ISDEL_YES);
        return cleaningPatternMapper.updateByExampleSelective(cleaningPattern, cleaningPatternExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/8
     * @description 设置有效
     */
    @Override
    public int validateCleaningPattern(Integer[] ids, Integer valid) {
        CleaningPatternExample cleaningPatternExample = new CleaningPatternExample();
        cleaningPatternExample.createCriteria().andProdCleaningPatternIdIn(Arrays.asList(ids));
        CleaningPattern cleaningPattern = new CleaningPattern();
        cleaningPattern.setIsValid(valid);
        return cleaningPatternMapper.updateByExampleSelective(cleaningPattern, cleaningPatternExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/8
     * @description 分页查询
     */
    @Override
    public PagedList<CleaningPatternOutput> getCleaningPatternList(Integer index, Integer size, String searchWords) {
        CleaningPatternExample cleaningPatternExample = new CleaningPatternExample();
        cleaningPatternExample.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) cleaningPatternMapper.countByExample(cleaningPatternExample);
        PagedList<CleaningPatternOutput> pagedList = new PagedList<>(index, size, totalNums);
        cleaningPatternExample.setOrderByClause("create_time desc");
        cleaningPatternExample.setLimitStart(pagedList.getLimitStart());
        cleaningPatternExample.setLimitEnd(pagedList.getLimitEnd());
        List<CleaningPattern> cleaningPatternList = cleaningPatternMapper.selectByExample(cleaningPatternExample);
        List<CleaningPatternOutput> cleaningPatternOutputList = cleaningPatternList.stream().map(cleaningPattern -> {
            CleaningPatternOutput cleaningPatternOutput = new CleaningPatternOutput();
            BeanUtils.copyProperties(cleaningPattern, cleaningPatternOutput);
            cleaningPatternOutput.setCompanyNameLang(cleaningPattern.getCompany());
            cleaningPatternOutput.setYardNameLang(cleaningPattern.getYard());
            cleaningPatternOutput.setContainerCategoryNameLang(cleaningPattern.getContainerCategory());
            cleaningPatternOutput.setCleaningPatternNameLang(cleaningPattern.getCleaningPattern());
            return cleaningPatternOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(cleaningPatternOutputList);
        return pagedList;
    }
}
