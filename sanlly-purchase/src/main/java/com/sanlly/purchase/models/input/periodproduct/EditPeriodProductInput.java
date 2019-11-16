package com.sanlly.purchase.models.input.periodproduct;

import java.math.BigDecimal;

/**
 * 
* @Package com.sanlly.purchase.models.input.periodproduct 
* @Description: 编辑周期性定价备件价格 
* @author jlx   
* @date 2019年8月23日 下午5:23:02 
* @version V1.0   
 */
public class EditPeriodProductInput {
	// id
	private Integer purcPeriodProductId;	
	// 变更后的价格
    private BigDecimal productPrice;
	public Integer getPurcPeriodProductId() {
		return purcPeriodProductId;
	}
	public void setPurcPeriodProductId(Integer purcPeriodProductId) {
		this.purcPeriodProductId = purcPeriodProductId;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

    
}
