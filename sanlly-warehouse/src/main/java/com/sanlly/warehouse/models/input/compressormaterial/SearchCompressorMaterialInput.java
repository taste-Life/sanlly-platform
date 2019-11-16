package com.sanlly.warehouse.models.input.compressormaterial;

import com.sanlly.common.models.input.PageInput;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lishzh
 */
public class SearchCompressorMaterialInput extends PageInput {

    private String materialNo;

    private String compressorNo;

    public SearchCompressorMaterialInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    public String getCompressorNo() {
        return compressorNo;
    }

    public void setCompressorNo(String compressorNo) {
        this.compressorNo = compressorNo;
    }
}
