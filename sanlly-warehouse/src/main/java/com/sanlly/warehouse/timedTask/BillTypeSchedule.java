package com.sanlly.warehouse.timedTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.WareBillTypeMapper;
import com.sanlly.warehouse.entity.WareBillType;
import com.sanlly.warehouse.entity.WareBillTypeExample;

/**
 * 单据类型定时任务
 * @author lishzh
 *
 */
@Component
public class BillTypeSchedule {
	
	@Autowired
	private WareBillTypeMapper billTypeDao;
	
	/**
	 * 每天零点重置bill_autoincrement为0
	 *
	 *@author lishzh
	 */
	@Scheduled(cron = "0 0 0 * * *")
	public void resetAutoincrement(){
		
		WareBillType billType=new WareBillType();
		billType.setBillAutoincrement(WarehouseConstants.INT_ZERO);
		
		WareBillTypeExample example=new WareBillTypeExample();
		billTypeDao.updateByExampleSelective(billType, example);
		
		System.out.println("----- 已重置bill_autoincrement -----");
		
	}

}
