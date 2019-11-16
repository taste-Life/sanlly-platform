package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.dock.DockInputAdd;
import com.sanlly.production.models.input.dock.DockInputUpdate;
import com.sanlly.production.models.output.dock.DockOutput;
import com.sanlly.production.service.DockService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
@RestController
@Api(tags = "码头基本信息接口")
public class DockController {

    @Autowired
    private DockService dockService;

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 新增码头
     */
    @PostMapping("/addDock")
    public Result<Integer> addDock(@RequestBody DockInputAdd dockInputAdd) {
        return Result.Success(dockService.addDock(dockInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 修改码头
     */
    @PutMapping("/updateDock")
    public Result<Integer> updateDock(@RequestBody DockInputUpdate dockInputUpdate) {
        return Result.Success(dockService.updateDock(dockInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 删除码头
     */
    @DeleteMapping("/deleteDock")
    public Result<Integer> deleteDock(Integer[] ids) {
        return Result.Success(dockService.deleteDock(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 设置有效
     */
    @PutMapping("/validateDock")
    public Result<Integer> validateDock(Integer[] ids, Integer valid) {
        return Result.Success(dockService.validateDock(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 分页查询
     */
    @GetMapping("/getDockList")
    public Result<PagedList<DockOutput>> getDockList(Integer index, Integer size, String searchWords) {
        return Result.Success(dockService.getDocklist(index, size, searchWords));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 获取全部码头
     */
    @GetMapping("/getAllDockList")
    public Result<List<DockOutput>> getAllDockList() {
        return Result.Success(dockService.getAllDockList());
    }
}
