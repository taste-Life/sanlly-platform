package com.sanlly.purchase.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.suppliercenter.SupplierCenterInput;
import com.sanlly.purchase.models.output.SupplierBascialInfoOutput;
import com.sanlly.purchase.service.SupplierCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class SupplierCenterController {
    @Autowired
    SupplierCenter supplierCenter;

    /**
     * 获取供应商信息
     * @param key
     * @return
     */
    @GetMapping("/getSupplierInfo")
    public Result getSupplierInfo(@RequestParam String key) {
        SupplierCenterInput supplierCenterInput = new SupplierCenterInput();
        supplierCenterInput.setKey(key);
        System.out.println(key);
        List<SupplierBascialInfoOutput> supplierBascialInfoOutputs = supplierCenter.querySuppplierBascialInfo(supplierCenterInput);
        return Result.Success(supplierBascialInfoOutputs);
    }

    /**
     * 下载供应商文件
     * @param request
     * @param response
     * @param file
     * @param key
     * @param type
     */
    @RequestMapping(value = "/downloadFile", method = RequestMethod.GET)
    public void downloadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam String file, @RequestParam String key,@RequestParam String type) {
        System.out.println(file);
        System.out.println(key);
        supplierCenter.downloadFile(response, key, file,type);
    }
    	/**
     *  按名称等级获取供应商
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/getSuppliersByGrade")
    public Result getSupplierBySecondSpecial(Integer index,Integer size,@RequestParam String name, @RequestParam String grade) throws Exception{
        return Result.Success(supplierCenter.getSupplierByGrade(  index, size,name, grade));
    }

}
