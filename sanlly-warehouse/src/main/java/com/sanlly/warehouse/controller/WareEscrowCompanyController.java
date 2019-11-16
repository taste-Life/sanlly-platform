package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.escrowcompany.AddEscrowCompanyInput;
import com.sanlly.warehouse.models.input.escrowcompany.EditEscrowCompanyInput;
import com.sanlly.warehouse.service.WareEscrowCompanyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: WareEscrowCompanyController
 * Description: 代管公司接口层
 * date: 2019/7/29 16:28
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(tags = "代管公司操作接口")
public class WareEscrowCompanyController {

    @Autowired
    private WareEscrowCompanyService escrowCompanyService;

    /**
     * 获取代管公司列表
     * @return
     */
    @GetMapping("/escrowCompany")
    public Result escrowCompanyList(){
        return Result.Success(escrowCompanyService.escrowCompanyList());
    }



    /**
     * 根据Key获取代管公司
     * @param escrowCompanyKey
     * @return
     */
    @GetMapping("/escrowCompany/escrowCompanyKey")
    public Result getEscrowCompany(@PathVariable(value = "escrowCompanyKey")String escrowCompanyKey){
        return Result.Success(new EditEscrowCompanyInput(escrowCompanyKey));
    }

    /**
     * 添加代管公司
     * @param input
     * @return
     */
    @PostMapping("/escrowCompany")
    public Result addEscrowCompany(@RequestBody AddEscrowCompanyInput input){
        escrowCompanyService.addEscrowCompany(input);
        return Result.Success();
    }

    /**
     * 修改代管公司
     * @param input
     * @return
     */
    @PutMapping("/escrowCompany")
    public Result editEscrowCompany(@RequestBody EditEscrowCompanyInput input){
        escrowCompanyService.updateEscrowCompany(input);
        return Result.Success();
    }

    /**
     * 根据ID批量删除代管公司
     * @param ids
     * @return
     */
    @DeleteMapping("/escrowCompany")
    public Result deleteEscrowCompany(@RequestParam Integer[] ids){
        escrowCompanyService.deleteEscrowCompany(ids);
        return Result.Success();
    }
}
