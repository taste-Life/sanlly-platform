package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.cbstype.AddCBSTypeInput;
import com.sanlly.warehouse.models.input.cbstype.EditCBSTypeInput;
import com.sanlly.warehouse.service.WareCBSWarehouseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: CBS仓储类型Controoler
 * @ClassName: WareCBSWarehouseTypeController
 * @Date: 2019/10/11 11:14
 * @Version 1.0
 * @Author mqz
 */
@RestController
public class WareCBSWarehouseTypeController {

    @Autowired
    private WareCBSWarehouseTypeService wareCBSWarehouseTypeService;

    /**
     * 获取CBS仓储类型
     * @return
     */
    @GetMapping("/warecbstype")
    Result getCBSType() {
        return Result.Success(wareCBSWarehouseTypeService.getCBSType());
    }

    /**
     * 添加CBS仓储类型
     * @param input
     * @return
     */
    @PostMapping("warecbstype")
    Result addCBSType(@RequestBody AddCBSTypeInput input){
        wareCBSWarehouseTypeService.addCBSType(input);
        return  Result.Success();
    }

    /**
     * 修改CBS仓储类型
     * @param input
     * @return
     */
    @PutMapping("/warecbstype")
    Result editCBSType(@RequestBody EditCBSTypeInput input){
        wareCBSWarehouseTypeService.editCBSType(input);
        return  Result.Success();
    }

    /**
     * 删除CBS仓储类型
     * @param wareCBSWarehouseTypeIds
     * @return
     */
    @DeleteMapping("/warecbstype")
    Result deleteCBSType(@RequestParam Integer[] wareCBSWarehouseTypeIds){
        wareCBSWarehouseTypeService.deleteCBSType(wareCBSWarehouseTypeIds);
        return Result.Success();
    }


}
