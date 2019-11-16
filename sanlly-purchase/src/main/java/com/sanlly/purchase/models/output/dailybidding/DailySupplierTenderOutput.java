package com.sanlly.purchase.models.output.dailybidding;

import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderOutput;

import java.util.List;

/**
 * 
* @Description: 供应商报价记录
* @version V1.0   
 */
public class DailySupplierTenderOutput  extends MatterSupplierTenderOutput {

    // 商品详细信息
    private List<DailySupplierTenderProductOutput> productOutputList2;

	public List<DailySupplierTenderProductOutput> getProductOutputList2() {
		return productOutputList2;
	}

	public void setProductOutputList2(List<DailySupplierTenderProductOutput> productOutputList2) {
		this.productOutputList2 = productOutputList2;
	}
}
