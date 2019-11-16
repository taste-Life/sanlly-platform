package com.sanlly.warehouse.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.warehouse.dao.WareSellPoolMapper;
import com.sanlly.warehouse.entity.WareSellPool;
import com.sanlly.warehouse.models.input.CostPool.AddSellPoolInput;
import com.sanlly.warehouse.service.SellPoolService;

/**
 * 
* @Package com.sanlly.warehouse.service.impl 
* @Description: 销售-费用池service 
* @author jlx   
* @date 2019年10月21日 上午10:46:02 
* @version V1.0   
 */
@Service
public class SellPoolServiceImpl extends BaseServiceImpl implements SellPoolService {

	@Autowired
	private WareSellPoolMapper wareSellPoolDao;

	/**
	 * 添加上传SBS数据至费用池
	 */
	@Override
	public void addSellPool(AddSellPoolInput input) {
		WareSellPool record = new WareSellPool();
		BeanUtils.copyProperties(input, record);
		wareSellPoolDao.insertSelective(record);
		
	}

	/**
	 * 更新费用池的上传状态
	 */
	@Override
	public void updateSellPool(AddSellPoolInput input) {
		// TODO Auto-generated method stub
		
	}

}
