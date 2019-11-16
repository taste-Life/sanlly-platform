package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.sparepartscategories.AddSparePartsCategoriesInput;
import com.sanlly.warehouse.models.input.sparepartscategories.EditSparePartsCategoriesInput;
import com.sanlly.warehouse.service.WareSparePartsCategoriesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: WareSparePartsCategoriesController
 * Description: 备件大类Controller层
 * date: 2019/7/25 17:45
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(value="备件大类controller",tags={"备件大类操作接口"})
public class WareSparePartsCategoriesController {

    @Autowired
    private WareSparePartsCategoriesService sparePartsCategoriesService;

    /**
     * 获取备件大类列表
     * @return
     */
    @GetMapping("/sparePartsCategories")
    public Result sparePartsCategoriesList(){
        return Result.Success(sparePartsCategoriesService.getSparePartsCategoriesList());
    }


    /**
     * 根据key获取备件大类
     * @param sparePartsCategoriesKey
     * @return
     */
    @GetMapping("/sparePartsCategories/{sparePartsCategoriesKey}")
    public Result getSparePartsCategories(@PathVariable(value = "sparePartsCategoriesKey") String sparePartsCategoriesKey){
        EditSparePartsCategoriesInput input = new EditSparePartsCategoriesInput();
        input.setKey(sparePartsCategoriesKey);
        return Result.Success(sparePartsCategoriesService.getSparePartsCategories(input));
    }

    /**
     * 添加备件大类
     * @param input
     * @return
     */
    @PostMapping("/sparePartsCategories")
    public Result addSparePartsCategories(@RequestBody AddSparePartsCategoriesInput input){
        sparePartsCategoriesService.addSparePartsCategories(input);
        return Result.Success();
    }

    /**
     * 修改备件大类
     * @param input
     * @return
     */
    @PutMapping("/sparePartsCategories")
    public Result editSparePartsCategories(@RequestBody EditSparePartsCategoriesInput input){
        sparePartsCategoriesService.updateSparePartsCategories(input);
        return Result.Success();
    }

    /**
     * 根据备件大类ID删除备件大类
     * @param sparePartsCategoriesIds
     * @return
     */
    @DeleteMapping("/sparePartsCategories")
    public Result deleteSparePartsCategories(@RequestParam Integer[] sparePartsCategoriesIds){
        sparePartsCategoriesService.deleteSparePartsCategories(sparePartsCategoriesIds);
        return Result.Success();
    }
    
    /**
     * 获取备件大类及明细类别
     *
     *@author lishzh 
     *@return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/sparePartsCategories/details")
	public Result getSparePartCategoryWithDetails() {
    	return Result.Success(sparePartsCategoriesService.getSparePartCategoryWithDetails());
    }
}
