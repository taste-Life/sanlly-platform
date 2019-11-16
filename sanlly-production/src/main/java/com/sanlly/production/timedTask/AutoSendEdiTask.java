package com.sanlly.production.timedTask;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.production.dao.AutomaticSendMapper;
import com.sanlly.production.dao.SqlMapper;
import com.sanlly.production.entity.AutomaticSend;
import com.sanlly.production.entity.AutomaticSendExample;
import com.sanlly.production.models.input.edi.SendEdiInput;
import com.sanlly.production.service.EdiService;

/**
 * 自动发送EDI定时任务
 * @author RexSheng
 * 2019年10月23日 上午10:05:51
 */
@Component
public class AutoSendEdiTask {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AutomaticSendMapper auoSendDao;
	
	@Autowired
	private EdiService ediService;
	
	@Autowired
	private SqlMapper sqlDao;
	
	@Autowired
	private ObjectMapper objectMapper;
 
	@Value("${spring.edi.timer:false}")
	private Boolean isOpen;
	
	/**
	 * 上次运行时间
	 */
	private Map<Integer,Date> historyMap=new HashMap<>();
	
	@Scheduled(fixedDelay = 60*1000)
	public void run() {
		if(!isOpen) {
			return;
		}
		Date now=new Date();
		
		AutomaticSendExample example=new AutomaticSendExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<AutomaticSend> configList=auoSendDao.selectByExample(example);
		List<AutomaticSend> todoList=new ArrayList<>();
		for(AutomaticSend config:configList) {
			if(historyMap.containsKey(config.getProdAutomaticSendId())) {
				Date lastTime=historyMap.get(config.getProdAutomaticSendId());
				Integer timeInterval=config.getTimeInterval();
				if(timeInterval!=null && timeInterval.intValue()>0) {
					Calendar calendar=Calendar.getInstance();
					calendar.setTime(now);
					calendar.add(Calendar.MINUTE, -1*timeInterval.intValue());
					if(calendar.getTime().after(lastTime)) {
						historyMap.put(config.getProdAutomaticSendId(), now);
						todoList.add(config);
					}
				}
			}
			else {
				historyMap.put(config.getProdAutomaticSendId(), now);
				todoList.add(config);
			}
		}
		
		if(todoList.size()>0) {
			String ids=String.join(",", todoList.stream().map(a->String.valueOf(a.getProdAutomaticSendId())).toArray(String[]::new));
			String sql="		select p.prod_edi_pool_id as value " + 
					"		from prod_edi_pool p" + 
					"		INNER JOIN prod_course c on p.course=c.prod_course_id" + 
					"		INNER JOIN prod_yard y on c.yard=y.`key`" + 
					"		INNER JOIN prod_automatic_send a " + 
					"		on c.yard=a.yard and c.container_user=a.container_user " + 
					"		and y.company=a.company and(" + 
					"		 (a.container_category='LECONTCATE01' and p.container_category='LECONTCATE01')" + 
					"		or " + 
					"		 (a.container_category='LECONTCATE05' and p.container_category in('LECONTCATE02','LECONTCATE03','LECONTCATE05'))" + 
					"		)" + 
					"		WHERE p.state='EDI_UNSEND' and a.prod_automatic_send_id in ("+ids+")";
			List<SelectOutput> list=sqlDao.query(sql, SelectOutput.class);
			if(list!=null && list.size()>0) {
				SendEdiInput input=new SendEdiInput();
				input.setPoolId(list.stream().map(a->Integer.valueOf(a.getValue())).toArray(Integer[]::new));
				try {
					logger.info("自动发送报价:{}",objectMapper.writeValueAsString(input.getPoolId())) ;
					ediService.sendPool(input);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}

			
		}
		
	}
	
	
}
