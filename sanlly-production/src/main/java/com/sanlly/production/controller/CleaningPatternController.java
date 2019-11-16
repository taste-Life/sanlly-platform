package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.cleaningpattern.CleaningPatternInputAdd;
import com.sanlly.production.models.input.cleaningpattern.CleaningPatternInputUpdate;
import com.sanlly.production.models.output.cleaningpattern.CleaningPatternOutput;
import com.sanlly.production.service.CleaningPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhq
 * @date 2019/11/7
 * @description
 */
@RestController
public class CleaningPatternController {

    @Autowired
    private CleaningPatternService cleaningPatternService;


    /**
     * @author zhq
     * @date 2019/11/7
     * @description 新增洗箱模式
     */
    @PostMapping("/addCleaningPattern")
    public Result<Integer> addCleaningPattern(@RequestBody CleaningPatternInputAdd cleaningPatternInputAdd) {
        return Result.Success(cleaningPatternService.addCleaningPattern(cleaningPatternInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 更新洗箱模式
     */
    @PutMapping("/updateCleaningPattern")
    public Result<Integer> updateCleaningPattern(@RequestBody CleaningPatternInputUpdate cleaningPatternInputUpdate) {
        return Result.Success(cleaningPatternService.updateClearningPattern(cleaningPatternInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 删除洗箱模式
     */
    @DeleteMapping("/deleteCleaningPattern")
    public Result<Integer> deleteCleaningPattern(Integer[] ids) {
        return Result.Success(cleaningPatternService.deleteCleaningPattern(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    @PutMapping("/validateCleaningPattern")
    public Result<Integer> validateCleaningPattern(Integer[] ids, Integer valid) {
        return Result.Success(cleaningPatternService.validateCleaningPattern(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 分页查询
     */
    @GetMapping("/getCleaningPatternList")
    public Result<PagedList<CleaningPatternOutput>> getCleaningPatternList(Integer index, Integer size, String searchWords) {
        return Result.Success(cleaningPatternService.getCleaningPatternList(index, size, searchWords));
    }

}
