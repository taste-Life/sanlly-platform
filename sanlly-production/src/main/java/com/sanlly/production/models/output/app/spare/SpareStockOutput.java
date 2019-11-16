package com.sanlly.production.models.output.app.spare;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.app.spare 
 * @Description: TODO 机组选件-库存选择
 * @author tianzhl   
 * @date 2019年10月30日 下午3:14:55 
 * @version V1.0   
 */
public class SpareStockOutput {

	// TODO 默认库存
	private SpareStockListOutput defaultStock;

	// TODO 原件维修
	private SpareStockListOutput originalStock;

	// TODO 库存信息
	private List<SpareStockListOutput> stockList;

	public SpareStockListOutput getDefaultStock() {
		return defaultStock;
	}

	public void setDefaultStock(SpareStockListOutput defaultStock) {
		this.defaultStock = defaultStock;
	}

	public SpareStockListOutput getOriginalStock() {
		return originalStock;
	}

	public void setOriginalStock(SpareStockListOutput originalStock) {
		this.originalStock = originalStock;
	}

	public List<SpareStockListOutput> getStockList() {
		return stockList;
	}

	public void setStockList(List<SpareStockListOutput> stockList) {
		this.stockList = stockList;
	}

}
