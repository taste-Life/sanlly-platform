package com.sanlly.warehouse.service.impl;

import java.util.List;

import com.sanlly.warehouse.models.input.stockout.SearchStockoutInput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareBillTypeMapper;
import com.sanlly.warehouse.dao.WareStockoutDetailMapper;
import com.sanlly.warehouse.dao.WareStockoutMapper;
import com.sanlly.warehouse.entity.WareBillType;
import com.sanlly.warehouse.entity.WareBillTypeExample;
import com.sanlly.warehouse.entity.WareStockoutExample;
import com.sanlly.warehouse.entity.WareStockoutExample.Criteria;
import com.sanlly.warehouse.service.StockoutService;

/**
 * 出库服务实现类
 * @author lishzh
 *
 */
@Service
public class StockoutServiceImpl implements StockoutService {
	
	@Autowired
	WareStockoutMapper stockoutDao;
	
	@Autowired
	WareStockoutDetailMapper stockoutDetailDao;

	@Autowired
	WareBillTypeMapper billTypeDao;
	
	/**
	 * 获取可退库的出库单列表
	 */
	@Override
	public PagedList<StockoutOutput> getReturnStockouts(SearchStockoutInput input) {
		//查询派工单key
		WareBillTypeExample bte=new WareBillTypeExample();
		WareBillTypeExample.Criteria btc = bte.createCriteria();
		btc.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andBillTypeNameLike("%"+"派工单"+"%");
		List<WareBillType> billTypes = billTypeDao.selectByExample(bte);
		if (CollectionUtils.isEmpty(billTypes)) {
			return null;
		}
		//查询源单为派工单的出库单
		WareStockoutExample se=new WareStockoutExample();
		Criteria sc = se.createCriteria();
		sc.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andBillTypeEqualTo(billTypes.get(0).getKey());
		
		// TODO Auto-generated method stub
		return null;
	}

}
