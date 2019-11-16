package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.SearchSparepartsCategoriesDetailsInput;
import com.sanlly.warehouse.service.WareSparePartsCategoriesDetailsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: WareSparePartsCategoriesDetailsController
 * Description: 备件明细类别Controller层
 * date: 2019/7/25 19:33
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(value="备件明细类别controller",tags={"备件明细类别操作接口"})
public class WareSparePartsCategoriesDetailsController {

    @Autowired
    private WareSparePartsCategoriesDetailsService sparepartsCategoriesDetailsService;

    /**
     * 获取备件明细列表
     * @return
     */
    @GetMapping("/sparePartsCategoriesDetails")
    public Result sparePartsCategoriesDetailsList(@RequestParam(required = false) Integer sparepartsCategoriesDetailsId ,@RequestParam(required = false) String key ,@RequestParam(required = false) String sparePartsCategories ,@RequestParam(required = false) String sparepartsCategoriesDetailsName ){
        SearchSparepartsCategoriesDetailsInput input = new SearchSparepartsCategoriesDetailsInput();
        input.setKey(key);
        input.setWareSparepartsCategoriesDetailsId(sparepartsCategoriesDetailsId);
        input.setSparePartsCategories(sparePartsCategories);
        input.setSparepartsCategoriesDetailsName(sparepartsCategoriesDetailsName);
        return Result.Success(sparepartsCategoriesDetailsService.sparepartsCategoriesDetailsList(input));
    }


    /**
     * 根据Key获取备件明细
     * @param sparePartsCategoriesDetailsKey
     * @return
     */
    @GetMapping("/sparePartsCategoriesDetails/{sparePartsCategoriesDetailsKey}")
    public Result getSparePartsCategoriesDetails(@PathVariable("sparePartsCategoriesDetailsKey")String sparePartsCategoriesDetailsKey){
        EditSparePartsCategoriesDetailsInput input = new EditSparePartsCategoriesDetailsInput();
        input.setKey(sparePartsCategoriesDetailsKey);
        return Result.Success(sparepartsCategoriesDetailsService.getSparepartsCategoriesDetails(input));
    }

    /**
     * 添加备件明细
     * @param input
     * @return
     */
    @PostMapping("/sparePartsCategoriesDetails")
    public Result addSparePartsCategoriesDetails(@RequestBody AddSparePartsCategoriesDetailsInput input){
        sparepartsCategoriesDetailsService.addSparepartsCategoriesDetails(input);
        return Result.Success();
    }

    /**
     * 修改备件明细
     * @param input
     * @return
     */
    @PutMapping("/sparePartsCategoriesDetails")
    public Result editSparePartsCategoriesDetails(@RequestBody EditSparePartsCategoriesDetailsInput input){
        sparepartsCategoriesDetailsService.updateSparepartsCategoriesDetails(input);
        return Result.Success();
    }

    /**
     * 根据ID删除备件大类明细
     * @param sparePartsCategoriesDetailsIds
     * @return
     */
    @DeleteMapping("/sparePartsCategoriesDetails")
    public Result deleteSparePartsCategoriesDetails(@RequestParam Integer[] sparePartsCategoriesDetailsIds){
        sparepartsCategoriesDetailsService.deleteSparepartsCategoriesDetails(sparePartsCategoriesDetailsIds);
        return Result.Success();
    }

    /**
     * 根据备件大类Key查询备件明细类别列表
     * @return
     */
    @GetMapping("/getCategoriesDetailsByCategoriesKey")
    public Result getCategoriesDetailsByCategoriesKey(@RequestParam(value = "categoriesKey", required = false) String categoriesKey){
        return Result.Success(sparepartsCategoriesDetailsService.getCategoriesDetailByCategoriesKey(categoriesKey));
    }
}
