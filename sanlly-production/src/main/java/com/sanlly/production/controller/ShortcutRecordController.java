package com.sanlly.production.controller;

import cn.hutool.core.lang.Assert;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.shortcutrecord.ShortcutRecordInputAdd;
import com.sanlly.production.models.input.shortcutrecord.ShortcutRecordInputUpdate;
import com.sanlly.production.models.output.shortcutrecord.ShortcutRecordOutput;
import com.sanlly.production.service.ShortcutRecordService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhq
 * @date 2019/11/2
 * @description
 */
@RestController
@Api(tags = "快捷录入维护表")
public class ShortcutRecordController {

    @Autowired
    private ShortcutRecordService shortcutRecordService;

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 新增快捷录入维护
     */
    @PostMapping("/addShortcutRecord")
    public Result<Integer> addShortcutRecord(@RequestBody ShortcutRecordInputAdd shortcutRecordInputAdd) {

        return Result.Success(shortcutRecordService.addShortcutRecord(shortcutRecordInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 修改快捷录入
     */
    @PutMapping("/updateShortcutRecord")
    public Result<Integer> updateShortcutRecord(@RequestBody ShortcutRecordInputUpdate shortcutRecordInputUpdate) {

        return Result.Success(shortcutRecordService.updateShortcutRecord(shortcutRecordInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 逻辑删除快捷录入
     */
    @DeleteMapping("/deleteShortcutRecord")
    public Result<Integer> deleteShortcutRecord(Integer[] ids) {
        return Result.Success(shortcutRecordService.deleteShortcutRecord(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 设置有效
     */
    @PutMapping("/validateShortcutRecord")
    public Result<Integer> validateShortcutRecord(Integer[] ids, Integer valid) {
        return Result.Success(shortcutRecordService.validateShortcutRecord(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/2
     * @description 分页查询
     */
    @GetMapping("/getShortcutRecordList")
    public Result<PagedList<ShortcutRecordOutput>> getShortcutRecordList(Integer index, Integer size, String searchWords) {
        Assert.notNull(index, "页码index不能为空");
        Assert.notNull(size, "每页记录数size不能为空");
        return Result.Success(shortcutRecordService.getShortcutRecordList(index, size, searchWords));
    }
}
