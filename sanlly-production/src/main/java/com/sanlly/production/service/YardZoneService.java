package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.yardZone.YardZoneInputAdd;
import com.sanlly.production.models.input.yardZone.YardZoneInputUpdate;
import com.sanlly.production.models.input.yardZone.ZoneSearchInput;
import com.sanlly.production.models.output.yardZone.YardZoneOutput;
import com.sanlly.production.models.output.yardZone.ZoneListOutput;

import java.util.List;

public interface YardZoneService {

    /**
     * 搜索场站区位列表
     *
     * @param input
     * @return
     */
    PagedList<ZoneListOutput> getZoneList(ZoneSearchInput input);

    /**
     * @author zhq
     * @date 2019/10/29
     * @description 根据yardid查询zone列表
     */
    List<ZoneListOutput> getZoneListByYardKey(String yardKey);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 新增场站区位
     */
    int addYardZone(YardZoneInputAdd yardZoneInputAdd);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 修改场站区位
     */
    int updateYardZone(YardZoneInputUpdate yardZoneInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 删除场站区位
     */
    int deleteYardZone(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 设置有效
     */
    int validateYardZone(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 分页查询
     */
    PagedList<YardZoneOutput> getYardZoneList(Integer index, Integer size, String searchWords);

}
