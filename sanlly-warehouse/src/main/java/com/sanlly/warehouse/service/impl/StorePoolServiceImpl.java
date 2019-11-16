package com.sanlly.warehouse.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.warehouse.dao.WareStorePoolMapper;
import com.sanlly.warehouse.entity.WareStorePool;
import com.sanlly.warehouse.models.input.CostPool.AddStorePoolInput;
import com.sanlly.warehouse.service.StorePoolService;

/**
 * 
* @Package com.sanlly.warehouse.service.impl 
* @Description: 仓库-费用池service 
* @author jlx   
* @date 2019年10月21日 上午10:46:25 
* @version V1.0   
 */
@Service
public class StorePoolServiceImpl extends BaseServiceImpl implements StorePoolService {

	@Autowired
	private WareStorePoolMapper wareStorePoolDao;
	/**
	 * 添加上传SBS数据至费用池
	 */
	@Override
	public void addStorePool(AddStorePoolInput input) {
		WareStorePool record = new WareStorePool();
		BeanUtils.copyProperties(input, record);
		wareStorePoolDao.insertSelective(record);
		
	}
	/**
	 * 更新费用池的上传状态
	 */
	@Override
	public void updateStorePool(AddStorePoolInput input) {
		// TODO Auto-generated method stub
		
	}

}
