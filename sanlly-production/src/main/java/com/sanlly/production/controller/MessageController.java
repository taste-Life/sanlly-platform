package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.input.message.MessageInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.message.MessageManage;
import com.sanlly.production.models.input.message.AddMessageRuleInput;
import com.sanlly.production.models.input.message.SearchMessageInput;
import com.sanlly.production.models.input.message.UpdateMessageRuleInput;
import com.sanlly.production.service.MessageService;

/**
 * 消息提醒设置控制器
 * 
 * @author wangxzh
 *
 */
@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

	@Autowired
	private MessageManage messageManage;

	/**
	 * 消息提醒设置列表
	 * 
	 * @param ruleName
	 *            规则名称
	 * @param contName
	 *            用箱人
	 * @param index
	 *            页码
	 * @param size
	 *            分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/message")
	public Result messagePagedList(@RequestParam(required = false) String ruleName,
			@RequestParam(required = false) String contUser, @RequestParam Integer index, @RequestParam Integer size) {

//		 messageManage.getMessageList(new MessageInput());
//		 messageManage.MessageType(new MessageInput(), 1);

		SearchMessageInput input = new SearchMessageInput(index, size);
		input.setRuleName(ruleName);
		input.setContainerUser(contUser);
		return Result.Success(messageService.getMessagePagedList(input));
	}

	/**
	 * 添加邮件发送规则
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/message")
	public Result addMessageRule(@RequestBody AddMessageRuleInput input) {
		messageService.addMessageRule(input);
		return Result.Success();
	}

	/**
	 * 单条规则
	 * 
	 * @param messageId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/message/{messageId}")
	public Result messageDetail(@PathVariable("messageId") Integer messageId) {
		return Result.Success(messageService.getMessage(messageId));
	}

	/**
	 * 编辑规则
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/message")
	public Result updateMessageRule(@RequestBody UpdateMessageRuleInput input) {
		messageService.updateMessageRule(input);
		return Result.Success();
	}

	/**
	 * 删除
	 * 
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/message")
	public Result delMessageRule(@RequestParam Integer[] messageIds) {
		messageService.delMessageRule(messageIds);
		return Result.Success();
	}

	/**
	 * 字段下拉
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/message/select")
	public Result messagePagedList() {
		return Result.Success(messageService.getMessageSelectList());
	}

	/**
	 * 消息获取
	 * @param messageNotifier 消息通知人
	 * @param company 公司
	 * @param yard 场站
	 * @param containerUser 用箱人
	 * @param containerNo 箱号
	 * @param informMethod 通知类型
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/message/get")
	public Result getMessageList(@RequestParam(required = false) String messageNotifier,
			@RequestParam(required = false) String company, @RequestParam(required = false) String yard,
			@RequestParam(required = false) String containerUser, @RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String informMethod) {

		MessageInput input =new MessageInput();
		input.setMessageNotifier(messageNotifier);
		input.setCompany(company);
		input.setYard(yard);
		input.setContainerUser(containerUser);
		input.setContainerNo(containerNo);
		input.setInformMethod(informMethod);
		
		return Result.Success(messageManage.getMessageList(input));
	}

}
