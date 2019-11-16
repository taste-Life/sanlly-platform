package com.sanlly.finance.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.finance.dao.PoolLeaseExtMapper;
import com.sanlly.finance.entity.PoolLease;
import com.sanlly.finance.models.input.PoolLeaseInput;
import com.sanlly.finance.service.BillLeaseService;

/**
 * 账单定时任务类
 * 
 * @Package com.sanlly.finance.task 
 * @Description: TODO
 * @author fjy   
 * @date 2019年10月30日 下午2:28:26 
 * @version V1.0   
 */
@Component
@EnableScheduling
public class BillTask {
	private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(BillTask.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * 租赁 场地费用池
	 */
	@Autowired
	private PoolLeaseExtMapper leaseExtDao;
	
	@Autowired
	private BillLeaseService billLeaseService;
	
	
	
	/**
	 * 	场地 租赁账单定时生成
	 * 	每月1号凌晨1点执行
	 * 一分钟执行一次
	 * @Description: TODO  void
	 * @throws 
	 */
	@Scheduled(fixedRate = 1000*60*1)
	public void reportCurrentTime1() {
		Logger.info("打印当前时间 reportCurrentTime1: {}.", dateFormat.format(new Date()));
		 
//		DateFormat df = new SimpleDateFormat("yyyy-MM");
//		String yearMonth=df.format(new Date());
//		List<PoolLease> list=leaseExtDao.selectList(PlatformConstants.ISDEL_NO, FinanceIsEnabledEnum.Enabled.getCode(), yearMonth);
//		List<PoolLeaseInput> outList=list.stream().map(a->{
//			PoolLeaseInput output=new PoolLeaseInput();
//			BeanUtils.copyProperties(a, output);
//			return output;
//		}).collect(Collectors.toList());
//		
//		billLeaseService.createBill(outList);
//		System.out.println("执行完成！！！！！！！！！");
		
	}

	/**
	 * 	场地 租赁账单定时生成
	 * 	每月1号凌晨1点执行一次
	 * @Description: TODO  void
	 * @throws 
	 */
	@Scheduled(cron = "0 0 1 1 * ?")
	public void reportCurrentTime() {
		Logger.info("开始生成租赁场地账单: {}.", dateFormat.format(new Date()));
		//查询租赁 场地配置表 根据合同起止日期
		DateFormat df = new SimpleDateFormat("yyyy-MM");
		String yearMonth=df.format(new Date());
		List<PoolLease> list=leaseExtDao.selectList(PlatformConstants.ISDEL_NO, FinanceIsEnabledEnum.Enabled.getCode(), yearMonth);
		List<PoolLeaseInput> outList=list.stream().map(a->{
			PoolLeaseInput output=new PoolLeaseInput();
			BeanUtils.copyProperties(a, output);
			return output;
		}).collect(Collectors.toList());
		
		billLeaseService.createBill(outList);
		
	}
}
