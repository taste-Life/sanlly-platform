package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.cbstype.AddCBSTypeInput;
import com.sanlly.warehouse.models.input.cbstype.EditCBSTypeInput;
import com.sanlly.warehouse.models.output.cbstype.CBSTypeOutput;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName: WareBorrowUnitService
 * @Version 1.0
 * @Author mqz
 */
public interface WareCBSWarehouseTypeService {
    /**
     * 添加CBS仓储类型
     * @param addCBSTypeInput
     */
    void  addCBSType(AddCBSTypeInput addCBSTypeInput);

    /**
     * 修改CBS仓储类型
     * @param editCBSTypeInput
     */
    void  editCBSType(EditCBSTypeInput editCBSTypeInput);

    /**
     * 获取CBS仓储类型
     * @return CBSTypeOutput
     */
    List<CBSTypeOutput> getCBSType();

    /**
     * 删除CBS仓储类型
     * @param purcCBSTypeIds
     */
    void  deleteCBSType(Integer[] purcCBSTypeIds );

}
