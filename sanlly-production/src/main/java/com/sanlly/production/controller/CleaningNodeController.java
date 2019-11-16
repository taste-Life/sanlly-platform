package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.cleaningnode.CleaningNodeInputAdd;
import com.sanlly.production.models.input.cleaningnode.CleaningNodeInputUpdate;
import com.sanlly.production.models.output.cleaningnode.CleaningNodeOutput;
import com.sanlly.production.service.CleaningNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
@RestController
public class CleaningNodeController {
    @Autowired
    private CleaningNodeService cleaningNodeService;
    /**
     * @author zhq
     * @date 2019/11/8
     * @description 新增洗箱节点
     */
    @PostMapping("/addCleaningNode")
    public Result<Integer> addCleaningNode(@RequestBody CleaningNodeInputAdd cleaningNodeInputAdd) {
        return Result.Success(cleaningNodeService.addCleaningNode(cleaningNodeInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 修改洗箱节点
     */
    @PutMapping("/updateCleaningNode")
    public Result<Integer> updateCleaningNode(@RequestBody CleaningNodeInputUpdate cleaningNodeInputUpdate) {
        return Result.Success(cleaningNodeService.updateCleaningNode(cleaningNodeInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 删除洗箱节点
     */
    @DeleteMapping("/deleteCleaningNode")
    public Result<Integer> deleteCleaningNode(Integer[] ids) {
        return Result.Success(cleaningNodeService.deleteCleaningNode(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 设置有效
     */
    @PutMapping("/validateCleaningNode")
    public Result<Integer> validateCleaningNode(Integer[] ids, Integer valid) {
        return Result.Success(cleaningNodeService.validateCleaningNode(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 分页查询
     */
    @GetMapping("/getCleaningNodeList")
    public Result<PagedList<CleaningNodeOutput>> getCleaningNodeList(Integer index, Integer size, String searchWords) {
        return Result.Success(cleaningNodeService.getCleaningNodeList(index, size, searchWords));
    }
}
