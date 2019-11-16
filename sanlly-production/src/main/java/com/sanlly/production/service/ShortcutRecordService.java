package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.shortcutrecord.ShortcutRecordInputAdd;
import com.sanlly.production.models.input.shortcutrecord.ShortcutRecordInputUpdate;
import com.sanlly.production.models.output.shortcutrecord.ShortcutRecordOutput;

/**
 * @author zhq
 * @date 2019/11/4
 * @description
 */
public interface ShortcutRecordService {
    /**
     * @author zhq
     * @date 2019/11/4
     * @description 新增快捷录入维护表
     */
    int addShortcutRecord(ShortcutRecordInputAdd shortcutRecordInputAdd);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 修改快捷录入维护表
     */
    int updateShortcutRecord(ShortcutRecordInputUpdate shortcutRecordInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 删除快捷录入
     */
    int deleteShortcutRecord(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 设置有效无效
     */
    int validateShortcutRecord(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 分页查询
     */
    PagedList<ShortcutRecordOutput> getShortcutRecordList(Integer index, Integer size, String searchWords);
}
