package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.unit.AddUnitInput;
import com.sanlly.warehouse.models.input.unit.EditUnitInput;
import com.sanlly.warehouse.models.output.unit.UnitOutput;

import java.util.List;

/**
 * ClassName: WareUnitService
 * Description: 单位服务层
 * date: 2019/7/25 15:40
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareUnitService {

    /**
     * 单位列表查询
     * @return
     */
    List<UnitOutput> getUnitList();

    /**
     * 单位获取
     * @param input
     * @return
     */
    UnitOutput getUnit(EditUnitInput input);

    /**
     * 新增单位
     * @param input
     */
    void AddUnit(AddUnitInput input);

    /**
     * 修改单位
     * @param input
     */
    void updateUnit(EditUnitInput input);

    /**
     * 根据ID批量删除单位
     * @param unitIds
     */
    void deleteUnit(Integer[] unitIds);
}
