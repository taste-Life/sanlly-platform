package com.sanlly.warehouse.models.output.stockout;

import com.sanlly.common.utils.DateUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * ClassName: StockoutOutput
 * Description: 出库输出类App
 * date: 2019/8/6 16:57
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("出库输出类App")
public class StockoutAppOutput {

    @ApiModelProperty(name = "stockoutId",value = "出库单id")
    private String stockoutId;

    @ApiModelProperty(name = "stockoutNo",value = "出库单号")
    private String stockoutNo;

    @ApiModelProperty(name = "stockoutStateLang",value = "出库状态")
    private String stockoutStateLang;

    @ApiModelProperty(name = "receiveDepartmentLang",value = "领用部门")
    private String receiveDepartmentLang;

    @ApiModelProperty(name = "receiveUser",value = "领用人")
    private String receiveUser;

    @ApiModelProperty(name = "stockoutDate",value = "领用日期")
    private String stockoutDate;

    public String getStockoutId() {
        return stockoutId;
    }

    public void setStockoutId(String stockoutId) {
        this.stockoutId = stockoutId;
    }

    public String getStockoutNo() {
        return stockoutNo;
    }

    public void setStockoutNo(String stockoutNo) {
        this.stockoutNo = stockoutNo;
    }

    public String getStockoutStateLang() {
        return stockoutStateLang;
    }

    public void setStockoutStateLang(String stockoutStateLang) {
        this.stockoutStateLang = stockoutStateLang;
    }

    public String getReceiveDepartmentLang() {
        return receiveDepartmentLang;
    }

    public void setReceiveDepartmentLang(String receiveDepartmentLang) {
        this.receiveDepartmentLang = receiveDepartmentLang;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    public String getStockoutDate() {
        return stockoutDate;
    }

    public void setStockoutDate(String stockoutDate) {
        this.stockoutDate = stockoutDate;
    }
}

