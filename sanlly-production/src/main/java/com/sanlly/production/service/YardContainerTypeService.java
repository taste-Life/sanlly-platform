package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.yardcontainertype.YardContainerTypeInputAdd;
import com.sanlly.production.models.input.yardcontainertype.YardContainerTypeInputUpdate;
import com.sanlly.production.models.output.yardcontainertype.YardContainerTypeOutput;

/**
 * @author zhq
 * @date 2019/11/5
 * @description
 */
public interface YardContainerTypeService {
    /**
     * @author zhq
     * @date 2019/11/5
     * @description 新增好坏箱类型
     */
    int addYardContainerType(YardContainerTypeInputAdd yardContainerTypeInputAdd);

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 修改好坏箱类型
     */
    int updateYardContainerType(YardContainerTypeInputUpdate yardContainerTypeInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 删除好坏箱类型
     */
    int deleteYardContainerType(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 设置有效
     */
    int validateYardContainerType(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 分页查询
     */
    PagedList<YardContainerTypeOutput> getYardContainerTypeList(Integer index, Integer size, String searchWords);

}
