package com.sanlly.common.models.output.stock;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lishzh
 */
public class WareOutput {

    private String defaultWarehouse;

    private String defaultWarehouseType;

    private BigDecimal quotePrice;

    private List<StockOutput> dataList;

    public String getDefaultWarehouse() {
        return defaultWarehouse;
    }

    public void setDefaultWarehouse(String defaultWarehouse) {
        this.defaultWarehouse = defaultWarehouse;
    }

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType;
    }

    public BigDecimal getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(BigDecimal quotePrice) {
        this.quotePrice = quotePrice;
    }

    public List<StockOutput> getDataList() {
        return dataList;
    }

    public void setDataList(List<StockOutput> dataList) {
        this.dataList = dataList;
    }
}
