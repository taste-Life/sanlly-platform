package com.sanlly.production.controller;


import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.unittype.UnitTypeInput;
import com.sanlly.production.models.output.unittype.UnitTypeOutput;
import com.sanlly.production.service.UnitTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"机型操作相关API"})
public class UnitTypeController {

    @Autowired
    private UnitTypeService unitTypeService;

    /**
     * @author zhq
     * @date 2019/10/18
     * @description 根据关键字查询列表
     */
    @GetMapping("/unitTypeList")
    public Result<PagedList<UnitTypeOutput>> getUnitTypeList(
            @RequestParam("index") Integer index,
            @RequestParam("size") Integer size, String searchWords) {
        PageInput input = new PageInput(index, size);
        return Result.Success(unitTypeService.getUnitTypeListByKeywords(input, searchWords), ResultCodeEnum.SUCCESS.getMessage());
    }

    /**
     * @author zhq
     * @date 2019/10/18
     * @description 新增记录
     */
    @PostMapping("/unitType")
    @SuppressWarnings("rawtypes")
    public Result<Integer> addUnitType(@RequestBody UnitTypeInput unitTypeInput) {
        return Result.Success(unitTypeService.addUnitType(unitTypeInput), ResultCodeEnum.SUCCESS.getMessage());
    }

    /**
     * @author zhq
     * @date 2019/10/18
     * @description 更新记录
     */
    @PutMapping("/unitType")
    public Result<Integer> updateUnitType(@RequestBody UnitTypeInput unitTypeInput) {

        return Result.Success(unitTypeService.updateUnitTypeById(unitTypeInput), ResultCodeEnum.SUCCESS.getMessage());
    }

    /**
     * @author zhq
     * @date 2019/10/19
     * @description 根据主键批量逻辑删除
     */
    @DeleteMapping("/unitTypeIds")
    @SuppressWarnings("rawtypes")
    public Result<Integer> deleteUnitTypeByIds(Integer[] ids) {
        return Result.Success(unitTypeService.deleteUnitTypeByIds(ids), ResultCodeEnum.SUCCESS.getMessage());
    }

    /**
     * @author zhq
     * @date 2019/10/21
     * @description 批量设置有效性
     */
    @PutMapping("/unitTypeValid")
    public Result<Integer> multiValid(Integer[] ids, int valid) {
        return Result.Success(unitTypeService.multiValid(ids, valid), ResultCodeEnum.SUCCESS.getMessage());
    }
}
