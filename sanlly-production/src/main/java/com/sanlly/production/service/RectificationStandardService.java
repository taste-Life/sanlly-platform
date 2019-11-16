package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.retificationstandard.RectificationStandardAddInput;
import com.sanlly.production.models.input.retificationstandard.RectificationStandardUpdateInput;
import com.sanlly.production.models.output.rectificationstandard.RectificationStandardOutput;

/**
 * @author zhq
 * @date 2019/10/30
 * @description
 */
public interface RectificationStandardService {

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 整改标准表新增
     */
    int addRectificationStandard(RectificationStandardAddInput rectificationStandardAddInput);

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 整改标准表修改
     */
    int updateRectificationStandard(RectificationStandardUpdateInput rectificationStandardUpdateInput);

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 批量删除整改标准表
     */
    int deleteRectificationStandard(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 批量设置有效无效
     */
    int multiValidate(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 分页查询列表
     */
    PagedList<RectificationStandardOutput> getRectificationStandardList(Integer index, Integer size, String searchWords);
}
