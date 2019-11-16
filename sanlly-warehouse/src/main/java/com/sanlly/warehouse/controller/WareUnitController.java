package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.unit.AddUnitInput;
import com.sanlly.warehouse.models.input.unit.EditUnitInput;
import com.sanlly.warehouse.service.WareUnitService;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: WareUnitController
 * Description: 单位Controller层
 * date: 2019/7/25 15:38
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(value="单位controller",tags={"单位操作接口"})
public class WareUnitController {

    @Autowired
    private WareUnitService unitService;

//    @Autowired
//    private ProductionFeignClient feignClient;
//
//
//    @GetMapping("/wannt/prod")
//    public Result getProd(String code){
//        return Result.Success(feignClient.getUnitToWare(code));
//    }


    /**
     * 获取单位列表
     * @return
     */
    @GetMapping("/unit")
    public Result unitList(){

        return Result.Success(unitService.getUnitList());
    }


    /**
     * 根据Key查询单位
     * @param unitKey
     * @return
     */
    @GetMapping("/unit/{unitKey}")
    public Result getUnit(@PathVariable(value = "unitKey")String unitKey){
        EditUnitInput editUnitInput = new EditUnitInput();
        editUnitInput.setKey(unitKey);
        return Result.Success(unitService.getUnit(editUnitInput));
    }

    /**
     * 添加单位
     * @param input
     * @return
     */
    @PostMapping("/unit")
    public Result addUnit(@RequestBody AddUnitInput input){
        unitService.AddUnit(input);
        return Result.Success();
    }

    /**
     * 修改单位
     * @param input
     * @return
     */
    @PutMapping("/unit")
    public Result editUnit(@RequestBody EditUnitInput input){
        unitService.updateUnit(input);
        return Result.Success();
    }

    /**
     * 根据ID删除单位
     * @param unitIds
     * @return
     */
    @DeleteMapping("/unit")
    public Result deleteUnit(@RequestParam Integer[] unitIds){
        unitService.deleteUnit(unitIds);
        return Result.Success();
    }
}
