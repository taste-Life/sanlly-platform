package com.sanlly.warehouse.controller;

import com.sanlly.common.models.input.spare.SearchTestingSpareInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.spareparts.AddSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.ImportSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.WareSparePartsService;
import io.swagger.annotations.Api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: WareSparePartsController
 * Description: 备件Controller层
 * date: 2019/7/25 14:38
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(value="备件controller",tags={"备件操作接口"})
public class WareSparePartsController {

    @Autowired
    private WareSparePartsService sparePartsService;

    /**
     * 获取备件列表
     * @param sparePartsName
     * @param sparePartsNo
     * @param sparePartsCategories
     * @param sparePartsCategoriesDetails
     * @param sparePartsNameEn
     * @param index
     * @param size
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/spareParts")
    public Result sparePartsPageList(@RequestParam(required = false) String sparePartsName , @RequestParam(required = false) String sparePartsNo ,@RequestParam(required = false) String sparePartsCategories,@RequestParam(required = false) String sparePartsCategoriesDetails,@RequestParam(required = false) String sparePartsNameEn,@RequestParam(required = false) String isValid,@RequestParam(required = false) String warehouse, @RequestParam Integer index, @RequestParam Integer size){
        SearchSparePartsInput input = new SearchSparePartsInput(index,size);
        if(sparePartsName != null && sparePartsName != ""){
            input.setSparePartsName(sparePartsName);
        }
        if(sparePartsNameEn != null && sparePartsNameEn != ""){
            input.setSparePartsNameEn(sparePartsNameEn);
        }
        if(sparePartsCategories != null && sparePartsCategories != ""){
            input.setSparePartsCategories(sparePartsCategories);
        }
        if(sparePartsCategoriesDetails != null && sparePartsCategoriesDetails != ""){
            input.setSparePartsCategoriesDetails(sparePartsCategoriesDetails);
        }
        if(sparePartsNo != null && sparePartsNo != ""){
            input.setSparePartsNo(sparePartsNo);
        }
        if(isValid != null && isValid != ""){
            input.setSpValid(isValid);
        }
        if(warehouse != null && warehouse != ""){
            input.setWarehouse(warehouse);
        }
        return Result.Success(sparePartsService.sparePartsPageList(input));
    }

    /**
     * 获取备件列表(简要)
     * @param sparePartsName
     * @param sparePartsNo
     * @param sparePartsCategories
     * @param sparePartsCategoriesDetails
     * @param sparePartsNameEn
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/sparePartsBrief")
    public Result sparePartsBriefList(@RequestParam(required = false) String sparePartsName , @RequestParam(required = false) String sparePartsNo ,@RequestParam(required = false) String sparePartsCategories,@RequestParam(required = false) String sparePartsCategoriesDetails,@RequestParam(required = false) String sparePartsNameEn){
        SearchSparePartsInput input = new SearchSparePartsInput();
        if(sparePartsName != null && sparePartsName != ""){
            input.setSparePartsName(sparePartsName);
        }
        if(sparePartsNameEn != null && sparePartsNameEn != ""){
            input.setSparePartsNameEn(sparePartsNameEn);
        }
        if(sparePartsCategories != null && sparePartsCategories != ""){
            input.setSparePartsCategories(sparePartsCategories);
        }
        if(sparePartsCategoriesDetails != null && sparePartsCategoriesDetails != ""){
            input.setSparePartsCategoriesDetails(sparePartsCategoriesDetails);
        }
        if(sparePartsNo != null && sparePartsNo != ""){
            input.setSparePartsNo(sparePartsNo);
        }

        return Result.Success(sparePartsService.sparePartsBriefList(input));
    }

    /**
     * 根据ID查询备件
     * @param sparePartsId
     * @return
     */
//    @GetMapping("/spareParts/{sparePartsId}")
//    public Result getSparePart(@PathVariable(value = "sparePartsId")Integer sparePartsId){
//        EditSparePartsInput input = new EditSparePartsInput();
//        input.setWareSparePartsId(sparePartsId);
//        return Result.Success(sparePartsService.getSpareParts(input));
//    }

    /**
     * 根据key查询备件
     * @param sparePartsKey
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/spareParts/{sparePartsKey}")
    public Result getSparePart(@PathVariable(value = "sparePartsKey") String sparePartsKey){
        EditSparePartsInput input = new EditSparePartsInput();
        input.setKey(sparePartsKey);
        return Result.Success(sparePartsService.getSpareParts(input));
    }
    

    /**
     * 根据key查询备件
     * @param sparePartsKeys
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/sparePartses")
    public Result getSparePartses(@RequestParam(value = "sparePartsKeys", required = true) String[] sparePartsKeys){
    	List<SparePartsOutput> SparePartsOutputs= new ArrayList<>();
    	for(String sparePartsKey:sparePartsKeys) {
	        EditSparePartsInput input = new EditSparePartsInput();
	        input.setKey(sparePartsKey);
	        try {
	        	SparePartsOutputs.add(sparePartsService.getSpareParts(input));
	        }catch(Exception e) {
	        	
	        }
    	}
        return Result.Success(SparePartsOutputs);
    }

    /**
     * 根据备件号查询备件
     * @param sparePartsNo
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/sparePartsByNo/{sparePartsNo}")
    public Result getSparePartByNo(@PathVariable(value = "sparePartsNo") String sparePartsNo){
        return Result.Success(sparePartsService.getSparePartByNo(sparePartsNo));
    }

    /**
     * 根据备件号查询备件
     * @param sparePartsNo
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/sparePartsByKeys")
    public Result getSparePartByKeys(@RequestParam(value = "sparePartsKeys", required = true)  String[] sparePartsKeys){
        return Result.Success(sparePartsService.getSparePartByKeys(sparePartsKeys));
    }

    /**
     * 根据key查询备件(简要)
     * @param sparePartsKey
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/sparePartsBrief/{sparePartsKey}")
    public Result getSparePartBrief(@PathVariable(value = "sparePartsKey") String sparePartsKey){
        EditSparePartsInput input = new EditSparePartsInput();
        input.setKey(sparePartsKey);
        return Result.Success(sparePartsService.getSparePartsBrief(input));
    }

    /**
     * 新增备件
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PostMapping("/spareParts")
    public Result addSpareParts(@RequestBody AddSparePartsInput input){
        sparePartsService.addSpareParts(input);
        return Result.Success();
    }

    /**
     * 修改备件
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/spareParts")
    public Result editSpareParts(@RequestBody EditSparePartsInput input){
        sparePartsService.updateSpareParts(input);
        return Result.Success();
    }

    /**
     * 根据ID批量删除备件
     * @param sparePartsIds
     * @return
     */
    @SuppressWarnings("rawtypes")
    @DeleteMapping("/spareParts")
    public Result deleteSpareParts(@RequestParam Integer[] sparePartsIds){
        sparePartsService.deleteSpareParts(sparePartsIds);
        return Result.Success();
    }

    /**
     * 根据ID批量置备件无效
     * @param sparePartsIds
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/spareParts/spInvalid")
    public Result invalidSpareParts(@RequestParam Integer[] sparePartsIds){
        sparePartsService.invalidSpareParts(sparePartsIds);
        return Result.Success();
    }


    /**
     * 根据ID批量置备件有效
     * @param sparePartsIds
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/spareParts/spValid")
    public Result validSpareParts(@RequestParam Integer[] sparePartsIds){
        sparePartsService.validSpareParts(sparePartsIds);
        return Result.Success();
    }


    /**
     * 机组检验，备件列表
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
	@GetMapping("/spare/testing")
    public Result getTestingSpareParts(SearchTestingSpareInput input){
        return Result.Success(sparePartsService.getSparePartsFromTesting(input));
    }
   
    /**
     * 批量导入备件信息
     * @param input
     * @return
     */
    @PostMapping("/spare/importSpareParts")
    public Result importSpareParts(@RequestBody List<ImportSparePartsInput> inputs) {
        sparePartsService.importSpareParts(inputs);
        return Result.Success();
    }
}
