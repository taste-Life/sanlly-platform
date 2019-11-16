package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.message.MessageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.message.MessageOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.MessageExtMapper;
import com.sanlly.production.dao.MessageFieldMapper;
import com.sanlly.production.dao.MessageMapper;
import com.sanlly.production.dao.MessageRuleMapper;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.Message;
import com.sanlly.production.entity.MessageExample;
import com.sanlly.production.entity.MessageField;
import com.sanlly.production.entity.MessageFieldExample;
import com.sanlly.production.entity.MessageRule;
import com.sanlly.production.entity.MessageRuleExample;
import com.sanlly.production.models.input.message.AddMessageRuleInput;
import com.sanlly.production.models.input.message.SearchMessageInput;
import com.sanlly.production.models.input.message.UpdateMessageRuleInput;
import com.sanlly.production.models.output.containerUser.ContUserSelectOutput;
import com.sanlly.production.models.output.message.MessageFieldOutput;
import com.sanlly.production.models.output.message.MessageInfoOutput;
import com.sanlly.production.models.output.message.MessageRuleOutput;
import com.sanlly.production.service.MessageService;

@Service
public class MessageServiceImpl extends BaseServiceImpl implements MessageService {

	@Autowired
	private MessageRuleMapper messageRuleDao;
	@Autowired
	private MessageFieldMapper messageFieldDao;
	@Autowired
	private MessageMapper messageDao;
	@Autowired
	private MessageExtMapper messageExtDao;
	
	/**
	 * 消息规则列表
	 */
	@Override
	public PagedList<MessageRuleOutput> getMessagePagedList(SearchMessageInput input) {
		MessageRuleExample example=new MessageRuleExample();
		MessageRuleExample.Criteria criteria=example.createCriteria();
		//非删除状态
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//查询条件
		if(StringUtils.isNotEmpty(input.getRuleName())) {
			criteria.andRuleNameLike("%"+input.getRuleName()+"%");
		}
		if(StringUtils.isNotEmpty(input.getContainerUser())){
			criteria.andContainerUserLike("%"+input.getContainerUser()+"%");
		}
		//总条数
		Integer totalItemCount=(int)messageRuleDao.countByExample(example);
		PagedList<MessageRuleOutput> pagedList=new PagedList<MessageRuleOutput>(input.getPageIndex(),input.getPageSize(),totalItemCount);
		//分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<MessageRule> roleList=messageRuleDao.selectByExample(example);
		//构造返回数据
		List<MessageRuleOutput> dataList=new ArrayList<MessageRuleOutput>();
		for(MessageRule message:roleList){
			MessageRuleOutput output=new MessageRuleOutput();
			output.setIsCommon(message.getIsCommon());
			output.setContainerUserLang(message.getContainerUser());
			output.setMessageId(message.getProdMessageRuleId());
			output.setRuleName(message.getRuleName());
			output.setRuleCondition(message.getRuleCondition());
			output.setSendType(message.getSendType());
			output.setContentFormat(message.getContentFormat());
			output.setReceiveUser(message.getReceiveUser());
			dataList.add(output);
		}
		//将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
	 * 新增消息规则
	 */
	@Override
	public void addMessageRule(AddMessageRuleInput input) {
		MessageRule model=new MessageRule();
		model.setIsCommon(input.getIsCommon());
		model.setContainerUser(input.getContUserKey());
		model.setRuleName(input.getRuleName());
		model.setRuleCondition(input.getRuleCondition());
		model.setRuleConditionJson(input.getRuleConditionJson());
		model.setSendType(input.getSendType()+"");
		model.setSendTitle(input.getSendTitle());
		model.setContentFormat(input.getContentFormat());
		model.setReceiveUser(input.getReceiveUser());
		model.setReceiveEmail(input.getReceiveEmail());
		model.setRemark(input.getRemark());
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		messageRuleDao.insert(model);
	}
	
	/**
	 * 获取单条消息规则
	 */
	@Override
	public MessageInfoOutput getMessage(Integer messageId) {
		MessageRule rule = messageRuleDao.selectByPrimaryKey(messageId);
		if(rule.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			MessageInfoOutput model=new MessageInfoOutput();
			model.setProdMessageRuleId(rule.getProdMessageRuleId());
			model.setIsCommon(rule.getIsCommon());
			model.setContainerUserLang(rule.getContainerUser());
			model.setRuleName(rule.getRuleName());
			model.setRuleCondition(rule.getRuleCondition());
			model.setRuleConditionJson(rule.getRuleConditionJson());
			model.setSendType(rule.getSendType());
			model.setSendTitle(rule.getSendTitle());
			model.setContentFormat(rule.getContentFormat());
			model.setReceiveUser(rule.getReceiveUser());
			model.setReceiveEmail(rule.getReceiveEmail());
			model.setRemark(rule.getRemark());
			return model;
		}
		return null;
	}
	
	/**
	 * 消息规则编辑
	 */
	@Override
	public void updateMessageRule(UpdateMessageRuleInput input) {
		MessageRule rule = messageRuleDao.selectByPrimaryKey(input.getMessageId());
		if(rule.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			rule.setIsCommon(input.getIsCommon());
			rule.setContainerUser(input.getContainerUser());
			rule.setRuleName(input.getRuleName());
			rule.setRuleCondition(input.getRuleCondition());
			rule.setRuleConditionJson(input.getRuleConditionJson());
			rule.setSendType(input.getSendType()+"");
			rule.setSendTitle(input.getSendTitle());
			rule.setContentFormat(input.getContentFormat());
			rule.setReceiveUser(input.getReceiveUser());
			rule.setReceiveEmail(input.getReceiveEmail());
			rule.setRemark(input.getRemark());
			rule.setCreateUser(getCurrentUserId());
			rule.setCreateTime(new Date());
			messageRuleDao.updateByPrimaryKey(rule);
			return;
		}
		throw new InvalidException("编辑失败"); 
	}
	
	/**
	 * 消息规则删除
	 */
	@Override
	public void delMessageRule(Integer[] ids) {
		MessageRuleExample example=new MessageRuleExample();
		example.createCriteria().andProdMessageRuleIdIn(Arrays.asList(ids));
		MessageRule model=new MessageRule();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId()); 
		//批量删除
		messageRuleDao.updateByExampleSelective(model, example);
	}
	
	/**
	 * 消息规则字段获取
	 */
	@Override
	public List<MessageFieldOutput> getMessageSelectList() {
		MessageFieldExample example=new MessageFieldExample();
		MessageFieldExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<MessageField> list=messageFieldDao.selectByExample(example);
		return list.stream().map(a->{
			MessageFieldOutput output=new MessageFieldOutput();
			output.setDatabaseField(a.getDatabaseField());
			output.setFieldName(a.getFieldName());
			return output;
		}).collect(Collectors.toList());
	}
	
	/**
	 * 获取待提醒消息
	 */
	public List<MessageOutput> getMessageList(MessageInput input){
		List<MessageOutput> list=messageExtDao.getMessageList(input);
		return list;
	}
	
	/**
	 * 添加消息提醒
	 */
	public void addMessage(Message input) {
		input.setIsDel(PlatformConstants.ISDEL_NO);
		input.setCreateUser(getCurrentUserId());
		input.setCreateTime(new Date());
		messageDao.insert(input);
	}
}
