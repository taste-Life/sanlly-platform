package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.escrowcompany.AddEscrowCompanyInput;
import com.sanlly.warehouse.models.input.escrowcompany.EditEscrowCompanyInput;
import com.sanlly.warehouse.models.output.escrowcompany.EscrowCompanyOutput;

import java.util.List;

/**
 * ClassName: WareEscrowCompanyService
 * Description: 代管公司服务层
 * date: 2019/7/29 15:16
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareEscrowCompanyService {

    /**
     * 获取代管公司列表
     * @return
     */
    List<EscrowCompanyOutput> escrowCompanyList();

    /**
     * 获取代管公司
     * @param input
     * @return
     */
    EscrowCompanyOutput getEscrowCompany(EditEscrowCompanyInput input);

    /**
     * 添加代管公司
     * @param input
     */
    void addEscrowCompany(AddEscrowCompanyInput input);

    /**
     * 修改代管公司
     * @param input
     */
    void updateEscrowCompany(EditEscrowCompanyInput input);

    /**
     * 根据ID批量删除代管公司
     * @param ids
     */
    void deleteEscrowCompany(Integer[] ids);
}
