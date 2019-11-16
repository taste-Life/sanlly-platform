package com.sanlly.warehouse.models.input.stockin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * ClassName: EditStockinInput
 * Description: 修改入库单输入类
 * date: 2019/8/2 14:43
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "修改入库单输入类")
public class EditStockinInput {

    private Integer wareStockinId;

    private String stockinNo;

    private String no;

    private String billType;

    private String company;

    private String escrowCompany;

    private String entryWarehouse;

    private String entryStatus;

    private String supplierId;

    private BigDecimal billTotalAmount;

    private String invoiceType;

    private String logisticsCompany;

    private BigDecimal totalAmount;

    private BigDecimal tariff;

    private BigDecimal vat;

    private BigDecimal freight;

    private Double entryedNum;

    private String isStockSbs;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;


}
