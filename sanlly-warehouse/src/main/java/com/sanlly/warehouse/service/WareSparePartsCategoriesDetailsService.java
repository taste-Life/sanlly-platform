package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.SearchSparepartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.output.sparepartscategoriesdetails.SparePartsCategoriesDetailsOutput;

import java.util.List;

/**
 * ClassName: WareSparePartsCategoriesDetailsService
 * Description: 备件明细类别服务层
 * date: 2019/7/25 19:37
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareSparePartsCategoriesDetailsService {

    /**
     * 获取备件明细类别列表
     * @return
     */
    List<SparePartsCategoriesDetailsOutput> sparepartsCategoriesDetailsList(SearchSparepartsCategoriesDetailsInput input);

    /**
     * 获取备件明细类别
     * @param input
     * @return
     */
    SparePartsCategoriesDetailsOutput getSparepartsCategoriesDetails(EditSparePartsCategoriesDetailsInput input);

    /**
     * 添加备件明细类别
     * @param input
     */
    void addSparepartsCategoriesDetails(AddSparePartsCategoriesDetailsInput input);

    /**
     * 修改备件明细类别
     * @param input
     */
    void updateSparepartsCategoriesDetails(EditSparePartsCategoriesDetailsInput input);

    /**
     * 根据ID删除批量删除备件信息
     * @param sparepartsCategoriesDetailsIds
     */
    void deleteSparepartsCategoriesDetails(Integer[] sparepartsCategoriesDetailsIds);

    /**
     * 根据备件大类key查询所属备件明细类别
     * @return
     */
    List<SparePartsCategoriesDetailsOutput> getCategoriesDetailByCategoriesKey(String categoriesKey);
}
