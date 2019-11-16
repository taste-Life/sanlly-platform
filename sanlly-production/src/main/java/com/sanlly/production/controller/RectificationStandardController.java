package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.retificationstandard.RectificationStandardAddInput;
import com.sanlly.production.models.input.retificationstandard.RectificationStandardUpdateInput;
import com.sanlly.production.models.output.rectificationstandard.RectificationStandardOutput;
import com.sanlly.production.service.RectificationStandardService;
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

import javax.validation.Valid;

/**
 * @author zhq
 * @date 2019/10/30
 * @description 整改标准表crud接口
 */
@RestController
@Api(tags = "整改标准表crud接口")
public class RectificationStandardController {

    @Autowired
    private RectificationStandardService rectificationStandardService;

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 整改标准表新增接口
     */
    @PostMapping("/addRectificationStandard")
    @ApiOperation("新增整改标准表接口")
    public Result<Integer> addRetificationStandard(@RequestBody @Valid RectificationStandardAddInput rectificationStandardAddInput) {
        return Result.Success(rectificationStandardService.addRectificationStandard(rectificationStandardAddInput));
    }

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 整改标准表修改接口
     */
    @PutMapping("/updateRectificationStandard")
    @ApiOperation("修改整改标准表接口")
    public Result<Integer> updateRetificationStandard(@RequestBody @Valid RectificationStandardUpdateInput rectificationStandardUpdateInput) {
        return Result.Success(rectificationStandardService.updateRectificationStandard(rectificationStandardUpdateInput));
    }

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 批量删除整改标准表
     */
    @DeleteMapping("/deleteRectificationStandard")
    @ApiOperation("批量删除修改表接口")
    public Result<Integer> deleteRectificationStandard(Integer[] ids) {
        return Result.Success(rectificationStandardService.deleteRectificationStandard(ids));
    }

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 批量设置有效无效
     */
    @PutMapping("/validateRectificationStandard")
    @ApiOperation("批量设置有效无效")
    public Result<Integer> multiValidate(Integer[] ids, Integer valid) {
        return Result.Success(rectificationStandardService.multiValidate(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/10/30
     * @description 分页查查询整改标准列表
     */
    @GetMapping("selectRectificationStandardList")
    @ApiOperation("分页查询整改标准列表")
    public Result<PagedList<RectificationStandardOutput>> getRectificationStandardList(@RequestParam("index") Integer index, @RequestParam("size") Integer size, String searchWords) {
        return Result.Success(rectificationStandardService.getRectificationStandardList(index, size, searchWords));
    }

}
