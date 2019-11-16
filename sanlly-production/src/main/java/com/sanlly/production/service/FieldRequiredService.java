package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.fieldrequired.FieldRequiredInputAdd;
import com.sanlly.production.models.input.fieldrequired.FieldRequiredInputUpdate;
import com.sanlly.production.models.output.fieldrequired.FieldRequiredOutput;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public interface FieldRequiredService {
    /**
     * @author zhq
     * @date 2019/11/6
     * @description 新增场站必填字段
     */
    int addFieldRequired(FieldRequiredInputAdd fieldRequiredInputAdd);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 修改场站必填字段
     */
    int updateFieldRequired(FieldRequiredInputUpdate fieldRequiredInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 删除场站必填字段
     */
    int deleteFieldRequired(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 设置有效
     */
    int validateFieldRequiredZ(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 分页查询
     */
    PagedList<FieldRequiredOutput> getFieldRequiredList(Integer index, Integer size, String searchWords);

}
