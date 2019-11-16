package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.input.spare.SearchTestingSpareInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.warehouse.models.input.spareparts.AddSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.ImportSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;

/**
 * ClassName: WareSparePartsService
 * Description: 备件基础信息服务层
 * date: 2019/7/24 17:06
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareSparePartsService {

    /**
     * 备件列表查询(简略信息)
     *
     * @param input
     * @return
     */
    List<SparePartsBriefOutput> sparePartsBriefList(SearchSparePartsInput input);

    /**
     * 备件列表分页查询(详细信息)
     *
     * @param input
     * @return
     */
    PagedList<SparePartsOutput> sparePartsPageList(SearchSparePartsInput input);

    /**
     * 获取备件基础信息(简略信息)
     *
     * @param input
     * @return
     */
    SparePartsBriefOutput getSparePartsBrief(EditSparePartsInput input);

    /**
     * 获取备件基础信息(详细信息)
     *
     * @param input
     * @return
     */
    SparePartsOutput getSpareParts(EditSparePartsInput input);

    /**
     * 获取备件基础信息(详细信息)
     *
     * @param no
     * @return
     */
    SparePartsOutput getSparePartByNo(String no);

    /**
     * 获取备件基础信息
     *
     * @param keys
     * @return
     */
    List<SparePartsBriefOutput> getSparePartByKeys(String[] keys);

    /**
     * 新增备件
     *
     * @param input
     */
    void addSpareParts(AddSparePartsInput input);

    /**
     * 修改备件
     *
     * @param input
     */
    void updateSpareParts(EditSparePartsInput input);

    /**
     * 批量删除备件
     *
     * @param sparePartsIds
     */
    void deleteSpareParts(Integer[] sparePartsIds);

    /**
     * 根据ID批量置备件无效
     *
     * @param sparePartsIds
     */
    void invalidSpareParts(Integer[] sparePartsIds);

    /**
     * 根据ID批量置备件有效
     *
     * @param sparePartsIds
     */
    void validSpareParts(Integer[] sparePartsIds);


    /**
     * 机组检验，备件列表
     *
     * @param input
     * @return
     */
    List<SpareTestingOutput> getSparePartsFromTesting(SearchTestingSpareInput input);


    /**
     * 根据备件号备件名称模糊查询备件key集合
     *
     * @param no
     * @param name
     * @return
     */
    List<String> getSparePartsKeyListByLike(String no, String name);

    /**
     * 根据备件no 查询备件key
     *
     * @param no
     * @return
     */
    String getKeyByNo(String no);

    /**
     * 根据备件号或者key获取备件简要信息
     *
     * @param key
     * @param no
     * @return
     * @author lishzh
     */
    SparePartsBriefOutput getSparePart(String key, String no);
    
   /**
    * 批量导入备件信息
    *
    * @param inputs
    * @return
    */
    void importSpareParts(List<ImportSparePartsInput> inputs);


}
