package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ReworkQuestionMapper;
import com.sanlly.production.entity.ReworkQuestion;
import com.sanlly.production.entity.ReworkQuestionExample;
import com.sanlly.production.models.input.reworkquestion.ReworkQuestionAddInput;
import com.sanlly.production.models.input.reworkquestion.ReworkQuestionUpdateInput;
import com.sanlly.production.models.output.reworkquestion.ReworkQuestionOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.ReworkQuestionService;
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
 * @date 2019/10/31
 * @description
 */
@Service
public class ReworkQuestionServiceImpl extends BaseServiceImpl implements ReworkQuestionService {
    @Autowired
    private ReworkQuestionMapper reworkQuestionMapper;
    @Autowired
    private LangService langService;

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 获取全部返工问题列表
     */
    @Override
    public List<ReworkQuestionOutput> getAllReworkQuestionOutputList() {
        ReworkQuestionExample reworkQuestionExample = new ReworkQuestionExample();
        reworkQuestionExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<ReworkQuestion> reworkQuestionList = reworkQuestionMapper.selectByExample(reworkQuestionExample);
        return reworkQuestionList.stream().map(reworkQuestion -> {
            ReworkQuestionOutput reworkQuestionOutput = new ReworkQuestionOutput();
            BeanUtils.copyProperties(reworkQuestion, reworkQuestionOutput);
            reworkQuestionOutput.setKeyNameLang(reworkQuestion.getKey());
            return reworkQuestionOutput;
        }).collect(Collectors.toList());
    }

    /**
     * @param reworkQuestionAddInput
     * @author zhq
     * @date 2019/10/31
     * @description 新增返工问题
     */
    @Override
    public int addWorkQuestion(ReworkQuestionAddInput reworkQuestionAddInput) {
        ReworkQuestion reworkQuestion = new ReworkQuestion();
        BeanUtils.copyProperties(reworkQuestionAddInput, reworkQuestion);
        reworkQuestion.setCreateTime(new Date());
        reworkQuestion.setCreateUser(super.getCurrentUserId());
        reworkQuestion.setIsDel(PlatformConstants.ISDEL_NO);
        reworkQuestion.setKey(langService.getLangRuleKeyByTable("prod_rework_question"));
        return reworkQuestionMapper.insertSelective(reworkQuestion);
    }

    /**
     * @param reworkQuestionUpdateInput
     * @author zhq
     * @date 2019/10/31
     * @description 修改返工问题
     */
    @Override
    public int updateWorkQuestion(ReworkQuestionUpdateInput reworkQuestionUpdateInput) {
        ReworkQuestion reworkQuestion = new ReworkQuestion();
        BeanUtils.copyProperties(reworkQuestionUpdateInput, reworkQuestion);
        reworkQuestion.setUpdateTime(new Date());
        reworkQuestion.setUpdateUser(super.getCurrentUserId());
        return reworkQuestionMapper.updateByPrimaryKeySelective(reworkQuestion);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/10/31
     * @description 批量删除返工问题
     */
    @Override
    public int deleteWorkQuestion(Integer[] ids) {
        ReworkQuestionExample reworkQuestionExample = new ReworkQuestionExample();
        reworkQuestionExample.createCriteria().andProdReworkQuestionIdIn(Arrays.asList(ids));
        ReworkQuestion reworkQuestion = new ReworkQuestion();
        reworkQuestion.setIsDel(PlatformConstants.ISDEL_YES);
        return reworkQuestionMapper.updateByExampleSelective(reworkQuestion, reworkQuestionExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/10/31
     * @description 设置有效无效
     */
    @Override
    public int validateReworkQuestion(Integer[] ids, Integer valid) {
        ReworkQuestionExample reworkQuestionExample = new ReworkQuestionExample();
        reworkQuestionExample.createCriteria().andProdReworkQuestionIdIn(Arrays.asList(ids));
        ReworkQuestion reworkQuestion = new ReworkQuestion();
        reworkQuestion.setIsValid(valid);
        return reworkQuestionMapper.updateByExampleSelective(reworkQuestion, reworkQuestionExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/10/31
     * @description 分页查询
     */
    @Override
    public PagedList<ReworkQuestionOutput> getReworkQuestionList(Integer index, Integer size, String searchWords) {
        ReworkQuestionExample reworkQuestionExample = new ReworkQuestionExample();
        ReworkQuestionExample.Criteria criteria = reworkQuestionExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andReworkQuestionLike(bySearchWords);
            reworkQuestionExample.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andReworkQuestionEnLike(bySearchWords);
        }
        Integer totalCountNum = (int) reworkQuestionMapper.countByExample(reworkQuestionExample);
        PagedList<ReworkQuestionOutput> pagedList = new PagedList<>(index, size, totalCountNum);
        reworkQuestionExample.setLimitStart(pagedList.getLimitStart());
        reworkQuestionExample.setLimitEnd(pagedList.getLimitEnd());
        reworkQuestionExample.setOrderByClause("create_time DESC");
        List<ReworkQuestionOutput> reworkQuestionOutputList = reworkQuestionMapper.selectByExample(reworkQuestionExample).stream().map(reworkQuestion -> {
            ReworkQuestionOutput reworkQuestionOutput = new ReworkQuestionOutput();
            BeanUtils.copyProperties(reworkQuestion, reworkQuestionOutput);
            reworkQuestionOutput.setContainerCategoryNameLang(reworkQuestion.getContainerCategory());
            reworkQuestionOutput.setKeyNameLang(reworkQuestion.getKey());
            return reworkQuestionOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(reworkQuestionOutputList);
        return pagedList;
    }
}
