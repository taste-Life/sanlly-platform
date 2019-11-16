package com.sanlly.warehouse.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.ablerepair.AbleRepairInput;
import com.sanlly.warehouse.models.input.ablerepair.SearchAbleRepairInput;
import com.sanlly.warehouse.models.output.ablerepair.AbleRepairOutput;

import java.util.List;

/**
 * 可维修备件
 *
 * @author lishzh
 */
public interface AbleRepairService {

    /**
     *添加可维修件
     *
     *@author lishzh
     */
    void addAbleRepair(List<AbleRepairInput> inputs);

    /**
     *设置有效
     *
     *@author lishzh
     */
    void setValid(List<Integer> ids);

    /**
     *设置无效
     *
     *@author lishzh
     */
    void setInvalid(List<Integer> ids);

    /**
     *编辑可维修件
     *
     *@author lishzh
     */
    void editAbleRepair(AbleRepairInput input);

    /**
     *获取可维修件列表分页
     *
     *@author lishzh
     */
    PagedList<AbleRepairOutput> getAbleRepairs(PageInput input);

    /**
     *获取所有可维修备件
     *
     *@author lishzh
     */
    List<AbleRepairOutput> getAllAbleRepairs();

    /**
     *获取可维修备件
     *
     *@author lishzh
     */
    List<AbleRepairOutput> getAbleRepairs(SearchAbleRepairInput input);

    /**
     *获取可维修备件
     *
     *@author lishzh
     */
    List<AbleRepairOutput> getAbleRepairs();

    /**
     *删除
     *
     *@author lishzh
     */
    void deleteAbleRepair(List<Integer> ids);



}
