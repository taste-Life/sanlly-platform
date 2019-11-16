package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.message.MessageInput;
import com.sanlly.common.models.output.message.MessageOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.Message;
import com.sanlly.production.models.input.message.AddMessageRuleInput;
import com.sanlly.production.models.input.message.SearchMessageInput;
import com.sanlly.production.models.input.message.UpdateMessageRuleInput;
import com.sanlly.production.models.output.message.MessageFieldOutput;
import com.sanlly.production.models.output.message.MessageInfoOutput;
import com.sanlly.production.models.output.message.MessageRuleOutput;


public interface MessageService {
	/**
	 * 消息规则列表
	 * @param input
	 * @return
	 */
	PagedList<MessageRuleOutput> getMessagePagedList(SearchMessageInput input);
	/**
	 * 消息规则新增
	 * @param input
	 */
	void addMessageRule(AddMessageRuleInput input);
	/**
	 * 详细规则修改
	 * @param input
	 */
	void updateMessageRule(UpdateMessageRuleInput input);
	/**
	 * 消息规则删除
	 * @param ids
	 */
	void delMessageRule(Integer[] ids);
	/**
	 * 获取规则字段
	 * @return
	 */
	List<MessageFieldOutput> getMessageSelectList();
	/**
	 * 获取单条消息规则信息
	 * @param messageId
	 * @return
	 */
	MessageInfoOutput getMessage(Integer messageId);
	/**
	 * 获取待提醒消息
	 * @param input
	 * @return
	 */
	List<MessageOutput> getMessageList(MessageInput input);
	/**
	 * 添加消息提醒
	 * @param input
	 */
	void addMessage(Message input);
}
