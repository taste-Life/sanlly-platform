package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.RectificationStandardMapper;
import com.sanlly.production.entity.RectificationStandard;
import com.sanlly.production.entity.RectificationStandardExample;
import com.sanlly.production.models.input.retificationstandard.RectificationStandardAddInput;
import com.sanlly.production.models.input.retificationstandard.RectificationStandardUpdateInput;
import com.sanlly.production.models.output.rectificationstandard.RectificationStandardOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.RectificationStandardService;
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
 * @date 2019/10/30
 * @description
 */
@Service
public class RectificationStandardServiceImpl extends BaseServiceImpl implements RectificationStandardService {

    @Autowired
    private LangService langService;
    @Autowired
    private RectificationStandardMapper rectificationStandardMapper;


    /**
     * @param rectificationStandardAddInput
     * @author zhq
     * @date 2019/10/30
     * @description 整改标准表新增
     */
    @Override
    public int addRectificationStandard(RectificationStandardAddInput rectificationStandardAddInput) {
        RectificationStandard rectificationStandard = new RectificationStandard();
        BeanUtils.copyProperties(rectificationStandardAddInput, rectificationStandard);
        rectificationStandard.setKey(langService.getLangRuleKeyByTable("prod_rectification_standard"));
        rectificationStandard.setIsDel(PlatformConstants.ISDEL_NO);
        rectificationStandard.setCreateTime(new Date());
        rectificationStandard.setCreateUser(super.getCurrentUserId());
        return rectificationStandardMapper.insertSelective(rectificationStandard);
    }

    /**
     * @param rectificationStandardUpdateInput
     * @author zhq
     * @date 2019/10/30
     * @description 整改标准表修改
     */
    @Override
    public int updateRectificationStandard(RectificationStandardUpdateInput rectificationStandardUpdateInput) {

        RectificationStandard rectificationStandard = new RectificationStandard();
        BeanUtils.copyProperties(rectificationStandardUpdateInput, rectificationStandard);
        rectificationStandard.setUpdateTime(new Date());
        rectificationStandard.setUpdateUser(super.getCurrentUserId());
        return rectificationStandardMapper.updateByPrimaryKeySelective(rectificationStandard);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/10/30
     * @description 批量删除整改标准表
     */
    @Override
    public int deleteRectificationStandard(Integer[] ids) {
        RectificationStandard rectificationStandard = new RectificationStandard();
        rectificationStandard.setIsDel(PlatformConstants.ISDEL_YES);
        RectificationStandardExample rectificationStandardExample = new RectificationStandardExample();
        rectificationStandardExample.or().andProdRectStandardIdIn(Arrays.asList(ids));
        return rectificationStandardMapper.updateByExampleSelective(rectificationStandard, rectificationStandardExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/10/30
     * @description 批量设置有效无效
     */
    @Override
    public int multiValidate(Integer[] ids, Integer valid) {
        RectificationStandard rectificationStandard = new RectificationStandard();
        rectificationStandard.setIsValid(valid);
        RectificationStandardExample rectificationStandardExample = new RectificationStandardExample();
        rectificationStandardExample.or().andProdRectStandardIdIn(Arrays.asList(ids));
        return rectificationStandardMapper.updateByExampleSelective(rectificationStandard, rectificationStandardExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/10/30
     * @description 分页查询列表
     */
    @Override
    public PagedList<RectificationStandardOutput> getRectificationStandardList(Integer index, Integer size, String searchWords) {
        RectificationStandardExample rectificationStandardExample = new RectificationStandardExample();
        RectificationStandardExample.Criteria criteria = rectificationStandardExample.or();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotEmpty(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andStandardContentNameLike(bySearchWords);
            rectificationStandardExample.or().andStandardContentEnLike(bySearchWords).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        }
        Integer totalNums = (int) rectificationStandardMapper.countByExample(rectificationStandardExample);
        PagedList<RectificationStandardOutput> pagedList = new PagedList<>(index, size, totalNums);
        rectificationStandardExample.setOrderByClause("create_time desc");
        rectificationStandardExample.setLimitStart(pagedList.getLimitStart());
        rectificationStandardExample.setLimitEnd(pagedList.getLimitEnd());
        List<RectificationStandard> rectificationStandardList = rectificationStandardMapper.selectByExample(rectificationStandardExample);
        List<RectificationStandardOutput> rectificationStandardOutputList = rectificationStandardList.stream().map(rectificationStandard -> {
            RectificationStandardOutput rectificationStandardOutput = new RectificationStandardOutput();
            BeanUtils.copyProperties(rectificationStandard, rectificationStandardOutput);
            rectificationStandardOutput.setReworkQuestionNameLang(rectificationStandard.getReworkQuestion());
            return rectificationStandardOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(rectificationStandardOutputList);
        return pagedList;
    }
}
