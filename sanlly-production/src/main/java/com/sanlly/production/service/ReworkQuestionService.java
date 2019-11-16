package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.reworkquestion.ReworkQuestionAddInput;
import com.sanlly.production.models.input.reworkquestion.ReworkQuestionUpdateInput;
import com.sanlly.production.models.output.reworkquestion.ReworkQuestionOutput;

import java.util.List;

/**
 * @author zhq
 * @date 2019/10/31
 * @description
 */
public interface ReworkQuestionService {

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 获取全部返工问题列表
     */
    List<ReworkQuestionOutput> getAllReworkQuestionOutputList();

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 新增返工问题
     */
    int addWorkQuestion(ReworkQuestionAddInput reworkQuestionAddInput);

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 修改返工问题
     */
    int updateWorkQuestion(ReworkQuestionUpdateInput reworkQuestionUpdateInput);

    /**
     * @author zhq
     * @date 2019/10/31
     * @description
     */
    int deleteWorkQuestion(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 设置有效无效
     */
    int validateReworkQuestion(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 分页查询
     */
    PagedList<ReworkQuestionOutput> getReworkQuestionList(Integer index, Integer size, String searchWords);
}
