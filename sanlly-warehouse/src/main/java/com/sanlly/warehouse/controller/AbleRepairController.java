package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.ablerepair.AbleRepairInput;
import com.sanlly.warehouse.models.input.ablerepair.SearchAbleRepairInput;
import com.sanlly.warehouse.models.output.ablerepair.AbleRepairOutput;
import com.sanlly.warehouse.service.AbleRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lishzh
 */
@RestController
public class AbleRepairController {

    @Autowired
    private AbleRepairService ableRepairService;

    /**
     *添加可维修件
     *
     *@author lishzh
     */
    @PostMapping("/ableRepairs")
    public Result addAbleRepair(@RequestBody List<AbleRepairInput> inputs){
        ableRepairService.addAbleRepair(inputs);
        return Result.Success();
    }

    /**
     *设置有效
     *
     *@author lishzh
     */
    @PutMapping("/ableRepairs/valid")
    public Result setValid(@RequestBody List<Integer> ids){
        ableRepairService.setValid(ids);
        return Result.Success();
    }

    /**
     *设置无效
     *
     *@author lishzh
     */
    @PutMapping("/ableRepairs/invalid")
    public Result setInvalid(@RequestBody List<Integer> ids){
        ableRepairService.setInvalid(ids);
        return Result.Success();
    }

    /**
     *编辑可维修件
     *
     *@author lishzh
     */
    @PutMapping("/ableRepairs")
    public Result editAbleRepair(@RequestBody AbleRepairInput input){
        ableRepairService.editAbleRepair(input);
        return Result.Success();
    }


    /**
     *获取所有可维修备件
     *
     *@author lishzh
     */
    @GetMapping("/ableRepairs")
    public Result getAllAbleRepairs(){
        return Result.Success(ableRepairService.getAllAbleRepairs());
    }

    /**
     *获取所有可维修备件
     *
     *@author lishzh
     */
    @GetMapping("/ableRepairs/search")
    public Result getAbleRepairs(@RequestParam String name){
        SearchAbleRepairInput input=new SearchAbleRepairInput();
        input.setName(name);
        return Result.Success(ableRepairService.getAbleRepairs(input));
    }

    /**
     *删除
     *
     *@author lishzh
     */
    @DeleteMapping("/ableRepairs")
    public Result deleteAbleRepair(@RequestParam List<Integer> ids){
        ableRepairService.deleteAbleRepair(ids);
        return Result.Success();
    }
}
