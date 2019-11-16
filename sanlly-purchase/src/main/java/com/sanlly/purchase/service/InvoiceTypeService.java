package com.sanlly.purchase.service;

import com.sanlly.purchase.models.input.invoicetype.AddInvoiceTypeInput;
import com.sanlly.purchase.models.input.invoicetype.EditInvoiceTypeInput;
import com.sanlly.purchase.models.output.invoicetype.InvoiceTypeOutput;

import java.util.List;

/**
 * @Description: 发票管理接口
 * @ClassName: InvoiceTypeService
 * @Version 1.0
 * @Author mqz
 */
public interface InvoiceTypeService {
    /**
     * 添加发票类型
     * @param addInvoiceTypeInput
     */
    void  addInvoiceType(AddInvoiceTypeInput addInvoiceTypeInput);

    /**
     * 修改发票类型
     * @param editInvoiceTypeInput
     */
    void  editInvoiceType(EditInvoiceTypeInput editInvoiceTypeInput);

    /**
     * 获取发票类型
     * @return
     */
    List<InvoiceTypeOutput> getInvoiceType();

    /**
     * 删除发票类型
     * @param purcInvoiceTypeIds
     */
    void  deleteInvoiceType(Integer[] purcInvoiceTypeIds );

    /**
     * 根据key 获取发票税点
     * @param key
     * @return
     */
    Double getInvoiceTypes(String key);
    /**
     * 根据key 获取发票信息
     * @param key
     * @return
     */
    InvoiceTypeOutput getInvoice(String key);
}
