package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.fieldrequired.FieldRequiredInputAdd;
import com.sanlly.production.models.input.fieldrequired.FieldRequiredInputUpdate;
import com.sanlly.production.models.output.fieldrequired.FieldRequiredOutput;
import com.sanlly.production.service.FieldRequiredService;
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
 * @date 2019/11/5
 * @description
 */
@RestController
@Api(tags = "场站必填字段维护表接口")
public class FieldRequiredController {

    @Autowired
    private FieldRequiredService fieldRequiredService;

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 新增
     */
    @PostMapping("/addFieldRequired")
    public Result<Integer> addFieldRequired(@RequestBody FieldRequiredInputAdd fieldRequiredInputAdd) {
        return Result.Success(fieldRequiredService.addFieldRequired(fieldRequiredInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 修改
     */
    @PutMapping("/updateFieldRequired")
    public Result<Integer> updateFieldRequired(@RequestBody FieldRequiredInputUpdate fieldRequiredInputUpdate) {
        return Result.Success(fieldRequiredService.updateFieldRequired(fieldRequiredInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 删除
     */
    @DeleteMapping("/deleteFieldRequired")
    public Result<Integer> deleteFieldRequired(Integer[] ids) {
        return Result.Success(fieldRequiredService.deleteFieldRequired(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/5
     * @description 设置有效
     */
    @PutMapping("/validateFieldRequired")
    public Result<Integer> validateFieldRequired(Integer[] ids, Integer valid) {
        return Result.Success(fieldRequiredService.validateFieldRequiredZ(ids, valid));
    }

    @GetMapping("/getFieldRequiredList")
    public Result<PagedList<FieldRequiredOutput>> getFieldRequiredList(Integer index, Integer size, String searchWords) {
        return Result.Success(fieldRequiredService.getFieldRequiredList(index, size, searchWords));
    }
}
