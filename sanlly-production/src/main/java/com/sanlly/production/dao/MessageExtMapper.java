package com.sanlly.production.dao;

import java.util.List;

import com.sanlly.common.models.input.message.MessageInput;
import com.sanlly.common.models.output.message.MessageOutput;

public interface MessageExtMapper {
	
	List<MessageOutput> getMessageList(MessageInput input);
	
}
