package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.location.LocationInputAdd;
import com.sanlly.production.models.input.location.LocationInputUpdate;
import com.sanlly.production.models.output.location.LocationOutput;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
public interface LocationService {
    /**
     * @author zhq
     * @date 2019/11/7
     * @description 新增码头位置
     */
    int addLocation(LocationInputAdd locationInputAdd);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 修改码头位置
     */
    int updateLocation(LocationInputUpdate locationInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 删除码头位置
     */
    int deleteLocation(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    int validateLocation(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 分页查询
     */
    PagedList<LocationOutput> getLocationList(Integer index, Integer size, String searchWords);
}
