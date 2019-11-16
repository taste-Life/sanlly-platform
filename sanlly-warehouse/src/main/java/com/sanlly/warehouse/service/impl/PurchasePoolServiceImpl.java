package com.sanlly.warehouse.service.impl;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.warehouse.dao.WarePurchasePoolMapper;
import com.sanlly.warehouse.entity.WarePurchasePool;
import com.sanlly.warehouse.entity.WarePurchasePoolExample;
import com.sanlly.warehouse.models.input.CostPool.AddPurchasePoolInput;
import com.sanlly.warehouse.service.PurchasePoolService;

/**
 * 
* @Package com.sanlly.warehouse.service.impl 
* @Description: 采购-费用池service 
* @author jlx   
* @date 2019年10月21日 上午10:45:14 
* @version V1.0   
 */
@Service
public class PurchasePoolServiceImpl extends BaseServiceImpl implements PurchasePoolService {

	@Autowired
	private WarePurchasePoolMapper warePurchasePoolDao;

	/**
	 * 添加上传SBS数据至费用池
	 */
	@Override
	public void addPurchasePool(AddPurchasePoolInput input) {
		WarePurchasePool record = new WarePurchasePool();
		BeanUtils.copyProperties(input, record);
		warePurchasePoolDao.insertSelective(record);
		
	}
	/**
	 * 更新费用池的上传状态
	 */
	@Override
	public void updatePurchasePool(AddPurchasePoolInput input) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 取得递增单据id
	 */
	@Override
	public String getLegacyOrdrId(String stockinId) {
		String STR_FORMAT = "00";
		DecimalFormat df = new DecimalFormat(STR_FORMAT);
		WarePurchasePoolExample example = new WarePurchasePoolExample();
		WarePurchasePoolExample.Criteria criteria = example.createCriteria();
		criteria.andLegacyOrdrIdLike(stockinId+"TZ"+"%");
		Integer count = (int) warePurchasePoolDao.countByExample(example);
		
		
		return stockinId+"TZ"+df.format(count);
	}
	/**
	 * 取得递增单据号
	 */
	@Override
	public String getLegacyOrdrNum(String stockinNo) {
		String STR_FORMAT = "00";
		DecimalFormat df = new DecimalFormat(STR_FORMAT);
		WarePurchasePoolExample example = new WarePurchasePoolExample();
		WarePurchasePoolExample.Criteria criteria = example.createCriteria();
		criteria.andLegacyOrdrNumLike(stockinNo+"TZ"+"%");
		Integer count = (int) warePurchasePoolDao.countByExample(example);
		
		return stockinNo+"TZ"+df.format(count);
	}
	/**
	 * 根据入库单号检索费用池数据
	 */
	@Override
	public WarePurchasePool getDataByStockinNo(String stockinNo) {
		WarePurchasePoolExample example = new WarePurchasePoolExample();
		WarePurchasePoolExample.Criteria criteria = example.createCriteria();
		criteria.andRefBizNumEqualTo(stockinNo);
//		criteria.andInvtrTypEqualTo(CBSType);
		List<WarePurchasePool> purchasePools = warePurchasePoolDao.selectByExample(example);
		if(purchasePools!=null&&purchasePools.size()>0) {
			return purchasePools.get(0);
		}
		return null;
	}

}
