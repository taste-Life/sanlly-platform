package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.cleaningpattern.CleaningPatternInputAdd;
import com.sanlly.production.models.input.cleaningpattern.CleaningPatternInputUpdate;
import com.sanlly.production.models.output.cleaningpattern.CleaningPatternOutput;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public interface CleaningPatternService {

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 新增洗箱模式
     */
    int addCleaningPattern(CleaningPatternInputAdd cleaningPatternInputAdd);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 修改洗箱模式
     */
    int updateClearningPattern(CleaningPatternInputUpdate cleaningPatternInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 删除洗箱模式
     */
    int deleteCleaningPattern(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 设置有效
     */
    int validateCleaningPattern(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 分页查询
     */
    PagedList<CleaningPatternOutput> getCleaningPatternList(Integer index, Integer size, String searchWords);
}

