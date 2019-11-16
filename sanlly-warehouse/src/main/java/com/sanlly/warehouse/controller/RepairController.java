package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.customerdeliver.CustomerDeliverInput;
import com.sanlly.warehouse.models.input.repair.RepairReportInput;
import com.sanlly.warehouse.models.input.repair.ReturnStoreInput;
import com.sanlly.warehouse.models.input.repair.SearchRepairInput;
import com.sanlly.warehouse.models.output.customerdeliver.CustomerDeliverOutput;
import com.sanlly.warehouse.models.output.repair.ShouldReturnOutput;
import com.sanlly.warehouse.service.RepairService;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.regexp.internal.REUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 备件修理Controller
 *
 * @author lishzh
 */
@RestController
public class RepairController {

    @Autowired
    private RepairService repairService;

    /**
     *获取应退件列表
     *
     *@author lishzh
     */
    @GetMapping("/repairs/shouldReturn")
    public Result getShouldReturn(@RequestParam Integer index, @RequestParam Integer size,
                                  @RequestParam(required = false) String sparePartsNo,
                                  @RequestParam(required = false) String status){
        SearchRepairInput input=new SearchRepairInput(index,size);
        input.setSparePartNo(sparePartsNo);
        input.setStatus(status);
        return Result.Success(repairService.getShouldReturn(input));
    }

    /**
     *采购旧件转维修
     *
     *@author lishzh
     */
    @PostMapping("/repairs/oldRepair")
    public Result oldRepair(@RequestParam String stockInNo){
        repairService.oldRepair(stockInNo);
        return Result.Success();
    }

    /**
     *维修 保修退件转备件修理
     *
     *@author lishzh
     */
    @PostMapping("/repairs/returnRepair")
    public Result returnRepair(@RequestParam List<Integer> ids){
        repairService.returnRepair(ids);
        return Result.Success();
    }

    /**
     * 添加到退件库
     *
     * @author lishzh
     */
    @PostMapping("/repairs/returnStore")
    public Result addReturnStore(@RequestBody List<ReturnStoreInput> inputs) {
        repairService.addReturnStore(inputs);
        return Result.Success();
    }

    /**
     * 获取退件库列表
     *
     * @author lishzh
     */
    @GetMapping("/repairs/returnStore")
    public Result getReturnStores(@RequestParam Integer index, @RequestParam Integer size,
                                  @RequestParam(required = false) String repairType,
                                  @RequestParam(required = false) String isAssign,
                                  @RequestParam(required = false) String isReceive,
                                  @RequestParam(required = false) String department) {

        SearchRepairInput input = new SearchRepairInput(index, size);
        input.setRepairType(repairType);
        input.setIsAssign(isAssign);
        input.setIsReceive(isReceive);
        input.setDepartment(department);
        return Result.Success(repairService.getReturnStores(input));
    }

    /**
     * 分配修理部门
     *
     * @author lishzh
     */
    @PutMapping("/repairs/assign")
    public Result assignDepartment(@RequestBody List<ReturnStoreInput> inputs) {
        repairService.assignDepartment(inputs);
        return Result.Success();
    }

    /**
     * 修理部门接收
     *
     * @author lishzh
     */
    @PutMapping("/repairs/departmentReceive")
    public Result departmentReceive(@RequestBody List<Integer> ids) {
        repairService.departmentReceive(ids);
        return Result.Success();
    }

    /**
     * 修理部门退回仓库
     *
     * @author lishzh
     */
    @PutMapping("/repairs/departmentReturn")
    public Result departmentReturn(@RequestBody List<Integer> ids) {
        repairService.departmentReturn(ids);
        return Result.Success();
    }

    /**
     * 获取备件维修库中的件
     *
     * @author lishzh
     */
    @GetMapping("/repairs/repairStore")
    public Result getRepairStores(@RequestParam Integer index, @RequestParam Integer size,
                                  @RequestParam(required = false) String repairType,
                                  @RequestParam(required = false) String isAssign,
                                  @RequestParam(required = false) String isReceive,
                                  @RequestParam(required = false) String isOver,
                                  @RequestParam(required = false) String isOut,
                                  @RequestParam(required = false) String isIn,
                                  @RequestParam(required = false) Integer isDel,
                                  @RequestParam(required = false) String department){
        SearchRepairInput input = new SearchRepairInput(index, size);
        input.setRepairType(repairType);
        input.setIsAssign(isAssign);
        input.setIsReceive(isReceive);
        input.setDepartment(department);
        input.setIsOver(isOver);
        input.setIsOut(isOut);
        input.setIsIn(isIn);
        input.setIsDel(isDel);
        repairService.getRepairStores(input);
        return Result.Success(repairService.getRepairStores(input));
    }

    /**
     * 根据ID获取备件维修库中的件
     *
     * @author lishzh
     */
    @GetMapping("/repairs/repairStore/{id}")
    public Result getRepairStores(@PathVariable(value = "id") Integer id){
        return Result.Success(repairService.getRepairStoreById(id));
    }

    /**
     *维修报告录入
     *
     *@author lishzh
     */
    @PostMapping("/repairs/report")
    public Result addRepairReport(@RequestBody RepairReportInput input){
        repairService.addRepairReport(input);
        return Result.Success();
    }

    /**
     *获取压缩机维修材料库存
     *
     *@author lishzh
     */
    @GetMapping("/repairs/report/stock")
    public Result getStockNum(@RequestParam List<String> spareParts){
        return Result.Success(repairService.getStockNum(spareParts));
    }

    /**
     *维修材料出库
     *
     *@author lishzh
     */
    @PutMapping("/repairs/report/out")
    public Result materialOut(@RequestParam Integer repairReportId){
        repairService.materialOut(repairReportId);
        return Result.Success();
    }

    /**
     *转委托加工
     *
     *@author lishzh
     */
    @PutMapping("/repairs/report/process")
    public Result turnProcess(@RequestBody Integer repairReportId){
        repairService.turnProcess(repairReportId);
        return Result.Success();
    }

    /**
     *修毕出库
     *
     *@author lishzh
     */
    @PutMapping("/repairs/over/out")
    public Result overOut(@RequestBody List<Integer> ids){
        repairService.overOut(ids);
        return Result.Success();
    }

    /**
     *修毕审核入库
     *
     *@author lishzh
     */
    @PutMapping("/repairs/over/in")
    public Result auditIn(@RequestBody List<Integer> ids){
        repairService.auditIn(ids);
        return Result.Success();
    }

    /**
     *添加客户送修出库单
     *
     *@author lishzh
     */
    @PostMapping("/repairs/customerDeliver")
    public Result addCustomerDeliver(@RequestBody CustomerDeliverInput input){
        repairService.addCustomerDeliver(input);
        return Result.Success();
    }

    /**
     *审核客户送修出库单
     *
     *@author lishzh
     */
    @PutMapping("/repairs/customerDeliver/audit")
    public Result auditCustomerDeliver(@RequestBody List<Integer> ids){
        repairService.auditCustomerDeliver(ids);
        return Result.Success();
    }

    /**
     *获取客户送修单
     *
     *@author lishzh
     */
    @GetMapping("/repairs/customerDeliver")
    public Result getCustomerDelivers(@RequestParam Integer index, @RequestParam Integer size,
                                      @RequestParam(required = false) String customer,
                                      @RequestParam(required = false) String company,
                                      @RequestParam(required = false) Date startDate,
                                      @RequestParam(required = false) Date endDate){
        SearchRepairInput input=new SearchRepairInput(index,size);
        input.setCustomer(customer);
        input.setCompany(company);
        input.setStartDate(startDate);
        input.setEndDate(endDate);
        return Result.Success(repairService.getCustomerDelivers(input));
    }

    /**
     *获取客户送修单明细byID
     *
     *@author lishzh
     */
    @GetMapping("/repairs/customerDeliver/detail/{id}")
    public Result getCustomerDeliverDetailOutputs(@PathVariable(value = "id") Integer id){
        return Result.Success(repairService.getCustomerDeliverDetailOutputs(id));
    }


}
