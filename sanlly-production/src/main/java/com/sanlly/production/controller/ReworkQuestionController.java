package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.reworkquestion.ReworkQuestionAddInput;
import com.sanlly.production.models.input.reworkquestion.ReworkQuestionUpdateInput;
import com.sanlly.production.models.output.reworkquestion.ReworkQuestionOutput;
import com.sanlly.production.service.ReworkQuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhq
 * @date 2019/10/30
 * @description
 */
@RestController
@Api(tags = "返修问题接口")
public class ReworkQuestionController {

    @Autowired
    private ReworkQuestionService reworkQuestionService;

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 获取全部返修问题列表
     */
    @GetMapping("/getAllReworkQuestionList")
    @ApiOperation("获取全部返修问题列表")
    public Result<List<ReworkQuestionOutput>> getAllReworkQuestionList() {
        return Result.Success(reworkQuestionService.getAllReworkQuestionOutputList());
    }

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 新增返工问题
     */
    @PostMapping("/addReworkQuestion")
    @ApiOperation("新增返工问题")
    public Result<Integer> addReworkQuestion(@RequestBody ReworkQuestionAddInput reworkQuestionAddInput) {
        return Result.Success(reworkQuestionService.addWorkQuestion(reworkQuestionAddInput));
    }

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 修改返工问题
     */
    @PutMapping("/updateReworkQuestion")
    @ApiOperation("修改返工问题")
    public Result<Integer> updateReworkQuestion(@RequestBody ReworkQuestionUpdateInput reworkQuestionUpdateInput) {
        return Result.Success(reworkQuestionService.updateWorkQuestion(reworkQuestionUpdateInput));
    }

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 批量删除返工问题
     */
    @DeleteMapping("/deleteReworkQuestion")
    @ApiOperation("批量删除返工问题")
    public Result<Integer> deleteReworkQuestion(Integer[] ids) {
        return Result.Success(reworkQuestionService.deleteWorkQuestion(ids));
    }

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 批量设置有效无效
     */
    @PutMapping("/validateReworkQuestion")
    @ApiOperation("批量设置有效无效")
    public Result<Integer> validateReworkQuestion(Integer[] ids, Integer valid) {
        return Result.Success(reworkQuestionService.validateReworkQuestion(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/10/31
     * @description 根据关键字分页查询
     */
    @GetMapping("/getReworkQuestionList")
    public Result<PagedList<ReworkQuestionOutput>> getReworkQuestionList(@RequestParam("index") Integer index, @RequestParam("size") Integer size, String searchWords) {
        return Result.Success(reworkQuestionService.getReworkQuestionList(index, size, searchWords));
    }
}
