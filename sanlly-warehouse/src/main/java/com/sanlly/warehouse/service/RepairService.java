package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.customerdeliver.CustomerDeliverDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.ShouldReturn;
import com.sanlly.warehouse.models.input.customerdeliver.CustomerDeliverInput;
import com.sanlly.warehouse.models.input.repair.RepairReportInput;
import com.sanlly.warehouse.models.input.repair.ReturnStoreInput;
import com.sanlly.warehouse.models.input.repair.SearchRepairInput;
import com.sanlly.warehouse.models.output.customerdeliver.CustomerDeliverOutput;
import com.sanlly.warehouse.models.output.repair.RepairStoreOutput;
import com.sanlly.warehouse.models.output.repair.ReturnStoreOutput;
import com.sanlly.warehouse.models.output.repair.ShouldReturnOutput;

import java.util.List;

/**
 * 备件修理service
 *
 * @author lishzh
 */
public interface RepairService {

    /**
     *添加至应退件库
     *
     *@author lishzh
     */
    void addShouldReturn(ShouldReturn shouldReturn);

    /**
     *获取应退件列表
     *
     *@author lishzh
     */
    PagedList<ShouldReturnOutput> getShouldReturn(SearchRepairInput input);

    /**
     *维修 保修退件转备件修理
     *
     *@author lishzh
     */
    void returnRepair(List<Integer> ids);

    /**
     *采购旧件转维修
     *
     *@author lishzh
     */
    void oldRepair(String stockInNo);

    /**
     * 添加到退件库
     *
     * @author lishzh
     */
    void addReturnStore(List<ReturnStoreInput> inputs);

    /**
     * 获取退件库中的件
     *
     * @author lishzh
     */
    PagedList<ReturnStoreOutput> getReturnStores(SearchRepairInput input);

    /**
     * 分配修理部门
     *
     * @author lishzh
     */
    void assignDepartment(List<ReturnStoreInput> inputs);

    /**
     * 修理部门接收
     *
     * @author lishzh
     */
    void departmentReceive(List<Integer> ids);

    /**
     * 修理部门退回仓库
     *
     * @author lishzh
     */
    void departmentReturn(List<Integer> ids);

    /**
     *查询备件维修库中的件
     *
     *@author lishzh
     */
    PagedList<RepairStoreOutput> getRepairStores(SearchRepairInput input);

    /**
     *根据ID查询备件维修库中的件
     *
     *@author lishzh
     */
    RepairStoreOutput getRepairStoreById(Integer id);

    /**
     *维修报告录入
     *
     *@author lishzh
     */
    void addRepairReport(RepairReportInput input);

    /**
     *获取压缩机维修材料库存
     *
     *@author lishzh
     */
    List<Double> getStockNum(List<String> spareParts);

    /**
     *维修材料出库
     *
     *@author lishzh
     */
    void materialOut(Integer repairReportId);

    /**
     *转委托加工
     *
     *@author lishzh
     */
    Integer turnProcess(Integer repairReportId);

    /**
     *修毕出库
     *
     *@author lishzh
     */
    void overOut(List<Integer> ids);

    /**
     *修毕审核入库
     *
     *@author lishzh
     */
    void auditIn(List<Integer> ids);

    /**
     *添加客户送修出库单
     *
     *@author lishzh
     */
    void addCustomerDeliver(CustomerDeliverInput input);

    /**
     *审核客户送修出库单
     *
     *@author lishzh
     */
    void auditCustomerDeliver(List<Integer> ids);

    /**
     *获取客户送修单
     *
     *@author lishzh
     */
    PagedList<CustomerDeliverOutput> getCustomerDelivers(SearchRepairInput input);

    /**
     *获取客户送修单
     *
     *@author lishzh
     */
    List<CustomerDeliverDetailOutput> getCustomerDeliverDetailOutputs(Integer id);

}
