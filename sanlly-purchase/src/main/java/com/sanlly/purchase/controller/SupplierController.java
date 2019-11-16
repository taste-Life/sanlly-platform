package com.sanlly.purchase.controller;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.supplier.*;
import com.sanlly.purchase.models.output.specialsupplier.SpecialSupplierOutput;
import com.sanlly.purchase.service.SupplierCenter;
import com.sanlly.purchase.service.SupplierService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
    @Autowired
    private SupplierCenter supplierCenter;

    /**
     * 根据key获取供应商详细信息
     *
     * @param key
     * @return
     */
    @GetMapping("/getSupplierDetailbyKey")
    Result getSupplierDetailByKey(@RequestParam String key) {

        return Result.Success(supplierCenter.getSupplierDetailByKey(key));
    }


    /**
     * 新增供应商
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/suppliers")
    public Result addSupplier(@RequestBody AddPurcSupplierInput input) {
        Result result=Result.Success();
        try {

           result= supplierService.addSupplier(input);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "注册失败");
        }
        return result ;
    }
    /**
     * 注册供应商
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/registersuppliers")
    public Result addRegisterSupplier(@RequestBody AddPurcSupplierInput input) {
        try {
            supplierService.addSupplier(input);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "注册失败");
        }
        return Result.Success();
    }
    /**
     * 获取单独供应商
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/getSupplier")
    public Result getSupplier(@RequestBody SearchPurcSupplierInput input) {
        return Result.Success(supplierService.getSupplier(input));
    }

    /**
     * 获取单独供应商通过key
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/getSupplierByKey")
    public Result getSupplierByKey(@RequestBody SearchPurcSupplierInput input) {
        return Result.Success(supplierService.getSupplierByKey(input));
    }

    /**
     * 供应商列表
     *
     * @param input
     * @return
     */
    @GetMapping("/getSupplierList")
    public List<String> getSupplierList(@RequestParam(required = false) String name) {
        SearchPurcSupplierInput input = new SearchPurcSupplierInput();
        if (name != null && !name.equals("")) {
            input.setName(name);
        }
        return supplierService.getSupplierList(input);
    }

    /**
     * 供应商列表
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/suppliers")
    public Result getSupplierPagedList(@RequestParam(required = false) String auditStatus,@RequestParam(required = false) String name, @RequestParam(required = false) String storehouseType, @RequestParam Integer index, @RequestParam Integer size) {
        SearchPurcSupplierInput input = new SearchPurcSupplierInput(index, size);
        if (name != null && !name.equals("")) {
            input.setName(name);
        }
        if (storehouseType != null && !storehouseType.equals("")) {
            input.setStorehouseType(storehouseType);
        }
        if (StringUtils.isNotBlank(auditStatus)){
            input.setAuditStatus(auditStatus);
        }
        return Result.Success(supplierService.getSupplierPagedList(input));
    }

    /**
     * 供应商邮件激活
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/suppliers/mailActivation")
    public Result supplierMailActivation(@RequestBody MailActivationInput input) {


        try {
            supplierService.supplierMailActivation(input);
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Result.Success();
    }

    /**
     * 删除供应商
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @DeleteMapping("/suppliers")
    public Result deleteSuppliers(@RequestParam Integer[] supplierIds) {
        supplierService.deleteSupplier(supplierIds);
        return Result.Success();
    }

    /**
     * 供应商修改
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/suppliers")
    public Result updateSuppliers(@RequestBody EditSupplierInput input) {
        supplierService.updateSupplier(input);
        return Result.Success();
    }


    /**
     * @author mx
     * 获取供应商列表
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/getSuppliers")
    public Result getSuppliers() {
        return Result.Success(supplierService.getSuppliers());
    }


    /**
     * @author fjy
     * 获取供应商列表  外包商 下拉框
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/getOutSuppliersFinance")
    public Result getOutSuppliersFinance() {
        return Result.Success(supplierService.getOutSuppliersFinance());
    }


    /**
     * @author mx
     * 获取供应商管理报告列表
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/supplierReport")
    public Result getSupplierReports(@RequestParam(required = false) Date startDate, @RequestParam(required = false) Date endDate, @RequestParam(required = false) String company, @RequestParam Integer index, @RequestParam Integer size) {
        SupplierReportInput input = new SupplierReportInput(index, size);
        if (startDate!=null) {
            input.setStartTime(startDate);
        }
        if (endDate!=null) {
            input.setEndTime(endDate);
        }
        if (company != null && !company.equals("")) {
            input.setCompany(company);
        }
        return Result.Success(supplierService.getSupplierReports(input));
    }

    /**
     * @author mx
     * 获取供应商审核列表
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/getSupplierReview")
    public Result getSupplierReview(@RequestParam(required = false) String name,@RequestParam(required = false) String auditStatus) {
        SearchSupplierReviewInput input = new SearchSupplierReviewInput();
        input.setName(name);
        input.setAuditStatus(auditStatus);
        return Result.Success(supplierService.getSupplierReviewPagedList(input));
    }

    /**
     * @author mx
     * 获取供应商审核
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/auditSupplier")
    public Result auditSupplier(@RequestParam(required = true) String[] auditType ,@RequestParam Integer[] purcSupplierIds, @RequestParam String[] processInstanceIds, @RequestParam String[] taskIds) {
        supplierService.auditSupplier(purcSupplierIds, processInstanceIds, taskIds,auditType);
        return Result.Success();
    }

    /**
     * @author mx
     * 获取供应商驳回
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/rejectSupplier")
    public Result rejectSupplier(@RequestParam(required = true) String[] auditType, @RequestParam Integer[] purcSupplierIds, @RequestParam String[] processInstanceIds, @RequestParam String[] taskIds) {
        supplierService.rejectSupplier(purcSupplierIds, processInstanceIds, taskIds,auditType);
        return Result.Success();
    }

    /**
     * @throws Exception
     * @author mx
     * 按需求获取供应商
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/getSuppliersBySecond")
    public Result getSupplierBySecondSpecial(@RequestParam String name, @RequestParam String[] secondSpecial, @RequestParam String grade) throws Exception {
        return Result.Success(supplierService.getSupplierBySecondSpecial(secondSpecial, name, grade));
    }

    @PostMapping("/importSupplier")
    public Result importSupplier(@RequestBody List<ImportSupplierInput> inputs) {
        try {
            supplierService.importSupplier(inputs);

        } catch (Exception e) {
            e.printStackTrace();
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "error");
        }
        return Result.Success();
    }

    @PostMapping("/importBalckList")
    public Result importBalckList(@RequestBody List<AddBlackListInput> inputs) {
        List<SpecialSupplierOutput> result=new ArrayList<>();
        try {
           result = supplierService.importBlackList(inputs);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "error");
        }
        return Result.Success(result);
    }
    

	/**
	 * 获取供应商SAP通过key
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/getSupplierSapByKey")
	public Result getSupplierSAP(@RequestParam String supplierKey){
		return Result.Success(supplierService.getSupplierSAP(supplierKey));
	}
	/**
	 * 获取供应商币种通过key
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/getCurrencyByKey")
	public Result getCurrencyByKey(@RequestParam String supplierKey){
		return Result.Success(supplierService.getCurrencyByKey(supplierKey));
	}
}
