package com.sanlly.purchase.controller;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.models.input.demand.AddManualRequisitionsWareInput;
import com.sanlly.purchase.models.input.demand.AddMatterDemandInput;
import com.sanlly.purchase.models.input.demand.SearchDemandOutputInput;
import com.sanlly.purchase.models.input.demand.editMatterDemandInput;
import com.sanlly.purchase.service.MatterDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description: 采购模块采购需求
 *
 * @author jlx
 * @ClassName: MatterDemandController
 * @date 2019年7月31日
 */
@RestController
public class MatterDemandController {
    /**
     * 采购需求接口
     */
    @Autowired
    private MatterDemandService matterDemandService;

    /**
     * 列表查询
     *
     * @param
     * @param index 页码
     * @param size  分页大小
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/matterDemand")
    public Result matterDemandPagedList(@RequestParam(required = false) String isPeriod, @RequestParam(required = false) String isCreateOrder, @RequestParam(required = false) String purchaseCompany,
                                        @RequestParam(required = false) String purchasingPattern, @RequestParam(required = false) String sparePartsCategories,
                                        @RequestParam(required = false) String sparePartsCategoriesDetails, @RequestParam(required = false) String sparePartsNo,
                                        @RequestParam Integer index, @RequestParam Integer size) {
        SearchDemandOutputInput input = new SearchDemandOutputInput(index, size);
        input.setIsCreateOrder(isCreateOrder);
        input.setIsPeriod(isPeriod);
        input.setPurchaseCompany(purchaseCompany);
        input.setPurchasingPattern(purchasingPattern);
        input.setSparePartsCategories(sparePartsCategories);
        input.setSparePartsCategoriesDetails(sparePartsCategoriesDetails);
        input.setSparePartsNo(sparePartsNo);
        return Result.Success(matterDemandService.getMatterDemandPagedList(input));
    }


    /**
     * 新增采购需求
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/matterDemand")
    public Result addMatterDemand(@RequestBody AddManualRequisitionsWareInput input) {
        matterDemandService.addManualWareRequisitions(input);
        return Result.Success();
    }
    /**
     * 编辑采购需求
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PutMapping("/matterDemand")
    public Result editMatterDemand(@RequestBody editMatterDemandInput input) {
        matterDemandService.eidtMatterDemand(input);
        return Result.Success();
    }

    /**
     * 获取选择的采购需求
     *
     * @param matterDemandIds
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/matterDemand/selected")
    public Result getMatterDemand(@RequestParam Integer[] matterDemandIds) {
        return Result.Success(matterDemandService.getMatterDemand(matterDemandIds));
    }

    /**
     * 删除采购需求
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @DeleteMapping("/matterDemand")
    public Result delMatterDemand(@RequestParam Integer[] matterDemandIds) {
        matterDemandService.delMatterDemand(matterDemandIds);
        return Result.Success();
    }

    /**
     * 仓库端批量审核采购需求
     *
     * @param input
     * @return
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/mutiMatterDemand")
    public Result addMutiMatterDemand(@RequestBody List<AddMatterDemandInput> input) {
        if (matterDemandService.addMutiMatterDemand(input)) {
            return Result.Success();
        }
        return Result.Error(ResultCodeEnum.ERROR.getCode(), ResultCodeEnum.ERROR.getMessage());
    }
}
