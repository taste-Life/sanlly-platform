package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.compressormaterial.CompressorMaterialInput;
import com.sanlly.warehouse.models.input.compressormaterial.SearchCompressorMaterialInput;
import com.sanlly.warehouse.models.output.compressormaterial.CompressorMaterialOutput;
import com.sanlly.warehouse.service.CompressorMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 维修压缩机用料
 * @author lishzh
 */
@RestController
public class CompressorMaterialController {

    @Autowired
    private CompressorMaterialService compressorMaterialService;

    /**
     *添加维修压缩机用料条目
     *
     *@author lishzh
     */
    @PostMapping("/compressorMaterials")
    public Result addCompressorMaterial(@RequestBody CompressorMaterialInput input){
        compressorMaterialService.addCompressorMaterial(input);
        return Result.Success();
    }

    /**
     *编辑维修压缩机用料条目
     *
     *@author lishzh
     */
    @PutMapping("/compressorMaterials")
    public Result  editCompressorMaterial(@RequestBody CompressorMaterialInput input){
        compressorMaterialService.editCompressorMaterial(input);
        return Result.Success();
    }

    /**
     *删除维修压缩机用料条目
     *
     *@author lishzh
     */
    @DeleteMapping("/compressorMaterials")
    public Result  deleteCompressorMaterial(@RequestParam List<Integer> ids){
        compressorMaterialService.deleteCompressorMaterial(ids);
        return Result.Success();
    }

    /**
     *查询维修压缩机用料条目
     *
     *@author lishzh
     */
    @GetMapping("/compressorMaterials")
    public Result  getPageList(@RequestParam(required = false) String materialNo,@RequestParam Integer index,
                               @RequestParam(required = false) String compressorNo,@RequestParam Integer size){
        SearchCompressorMaterialInput input=new SearchCompressorMaterialInput(index,size);
        input.setCompressorNo(compressorNo);
        input.setMaterialNo(materialNo);
        return Result.Success(compressorMaterialService.getPageList(input));
    }
}
