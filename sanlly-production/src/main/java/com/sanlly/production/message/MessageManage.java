package com.sanlly.production.message;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.message.MessageInput;
import com.sanlly.common.models.output.message.MessageOutput;
import com.sanlly.production.entity.Message;
import com.sanlly.production.service.MessageService;

@Service
public class MessageManage {

	@Autowired
	private MessageService messageService;

	/**
	 * 消息规则判断，添加消息
	 * @throws Exception 
	 */
	public void MessageType(Object obj, Integer links) {
		//规则
		
		
		//将数据转为map
		Map<String, Object> map = new HashMap<>();
		Class<?> clazz = obj.getClass();
		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			String fieldName = field.getName();
			Object value=null;
			try {
				value = field.get(obj);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			map.put(fieldName, value);
		}
		//提醒格式
		String contenfFormat="${containeUser}用箱人${containeNo}箱子已进场，请做锁箱处理。";
		//数据填充
		String message = processTemplate(contenfFormat, map);
		//数据保存
		Message model=new Message();
		model.setCompany((String)map.get("company"));
		model.setYard((String)map.get("yard"));
		model.setContainerUser((String)map.get("containerUser"));
		model.setContainerNo((String)map.get("containerNo"));
		model.setInformContent(message);
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(1);
		model.setCreateTime(new Date());
		//保存提醒信息
		messageService.addMessage(model);
//			sendEmail.sendHtmlEmail(message);
//		new SendEmail().sendHtmlEmail(message);

	}
	
	/**
	 * 获取消息提醒
	 * @param input
	 * @return
	 */
	public List<MessageOutput> getMessageList(MessageInput input){
		return messageService.getMessageList(input);
	}

	/**
	 * 数据填充
	 * @param template
	 * @param params
	 * @return
	 */
	public String processTemplate(String template, Map<String, Object> params) {
		if (template == null || params == null)
			return null;
		StringBuffer sb = new StringBuffer();
		Matcher m = Pattern.compile("\\$\\{\\w+\\}").matcher(template);
		while (m.find()) {
			String param = m.group();
			Object value = params.get(param.substring(2, param.length() - 1));
			m.appendReplacement(sb, value == null ? "" : value.toString());
		}
		m.appendTail(sb);
		return sb.toString();
	}

}
