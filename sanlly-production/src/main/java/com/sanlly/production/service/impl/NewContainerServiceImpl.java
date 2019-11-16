package com.sanlly.production.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.ContainerOrderDetailMapper;
import com.sanlly.production.dao.ContainerOrderMapper;
import com.sanlly.production.entity.ContainerOrder;
import com.sanlly.production.entity.ContainerOrderDetail;
import com.sanlly.production.entity.ContainerOrderDetailExample;
import com.sanlly.production.entity.ContainerOrderExample;
import com.sanlly.production.enums.OrderDetailStateEnum;
import com.sanlly.production.enums.OrderStateEnum;
import com.sanlly.production.models.input.newContainer.NewContainerAddInput;
import com.sanlly.production.models.output.newContainer.NewContainerDetailsOutput;
import com.sanlly.production.models.output.newContainer.NewContainerListOutput;
import com.sanlly.production.service.NewContainerService;
/**
 * 新箱实现类
 * @author zhangkai
 *
 */
@Service
public class NewContainerServiceImpl extends BaseServiceImpl implements NewContainerService{

	@Autowired
	private ContainerOrderMapper containerOrderMapper;
	@Autowired
	private ContainerOrderDetailMapper containerOrderDetailMapper;
	
	/**
	 * 新增&更新
	 * @param input
	 */
	public Integer add(NewContainerAddInput input) {
		ContainerOrder containerOrder = new ContainerOrder();
		BeanUtils.copyProperties(input, containerOrder);
		if (input.getProdContainerOrderId() == null || input.getProdContainerOrderId().equals(0)) {
			// 查询订单号是否已存在
			ContainerOrderExample example = new ContainerOrderExample();
			ContainerOrderExample.Criteria criteria = example.createCriteria();
			criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria.andOrderNoEqualTo(input.getOrderNo());
			Integer res = (int)containerOrderMapper.countByExample(example);
			if (res != 0) {
				throw new RuntimeException("exits");
			}
			// 新增
			containerOrder.setState(OrderStateEnum.GERNERATED.getCode());
			containerOrder.setBillDate(new Date());
			containerOrder.setCreateTime(new Date());
			containerOrder.setCreateUser(getCurrentUserId());
			containerOrder.setIsDel(PlatformConstants.ISDEL_NO);
			containerOrderMapper.insertSelective(containerOrder);
			Integer orderId = containerOrder.getProdContainerOrderId();
			for (ContainerOrderDetail containerOrderDetail : input.getDetails()) {
				// 插明细
				containerOrderDetail.setCreateTime(new Date());
				containerOrderDetail.setCreateUser(getCurrentUserId());
				containerOrderDetail.setIsDel(PlatformConstants.ISDEL_NO);
				containerOrderDetailMapper.insertSelective(containerOrderDetail);
			}
			return orderId;
		} else {
			// 更新
			containerOrder.setUpdateTime(new Date());
			containerOrder.setUpdateUser(getCurrentUserId());
			containerOrderMapper.updateByPrimaryKeySelective(containerOrder);
			// 插明细
			// 先删除原有明细
			ContainerOrderDetailExample detailExample = new ContainerOrderDetailExample();
			ContainerOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
			detailCriteria.andOrderNoEqualTo(input.getOrderNo());
			ContainerOrderDetail record = new ContainerOrderDetail();
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			containerOrderDetailMapper.updateByExampleSelective(record, detailExample);
			// 插入新明细
			for (ContainerOrderDetail containerOrderDetail : input.getDetails()) {
				containerOrderDetail.setUpdateTime(new Date());
				containerOrderDetail.setUpdateUser(getCurrentUserId());
				containerOrderDetail.setIsDel(PlatformConstants.ISDEL_NO);
				containerOrderDetailMapper.insertSelective(containerOrderDetail);
			}
			return input.getProdContainerOrderId();
		}
	}
	
	/**
	 * 新箱列表
	 * @param beginTime
	 * @param endTime
	 * @param customerName
	 * @param orderNo
	 * @param state
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PagedList<NewContainerListOutput> list(String beginTime, String endTime, String customerName, String orderNo, String state, Integer pageNum, Integer pageSize) {
		List<NewContainerListOutput> outputList = new ArrayList<NewContainerListOutput>();
		ContainerOrderExample orderExample = new ContainerOrderExample();
		ContainerOrderExample.Criteria orderCriteria = orderExample.createCriteria();
		if (beginTime != null && beginTime != "" && endTime != "" && endTime != "") {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				orderCriteria.andBillDateBetween(sdf.parse(beginTime), sdf.parse(endTime));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (customerName != null && customerName != "") {
			orderCriteria.andCustomerNameLike("%"+customerName.trim()+"%");
		}
		if (orderNo != null && orderNo != "") {
			orderCriteria.andOrderNoLike("%"+orderNo.trim()+"%");
		}
		if (state != null && state != "") {
			orderCriteria.andStateEqualTo(state);
		}
		orderCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		Integer totalItemCount = (int)containerOrderMapper.countByExample(orderExample);
		PagedList<NewContainerListOutput> pagedList = new PagedList<>(pageNum, pageSize, totalItemCount);
		orderExample.setLimitStart(pagedList.getLimitStart());
		orderExample.setLimitEnd(pagedList.getLimitEnd());
		List<ContainerOrder> orders = containerOrderMapper.selectByExample(orderExample);
		for (ContainerOrder containerOrder : orders) {
			NewContainerListOutput output = new NewContainerListOutput();
			BeanUtils.copyProperties(containerOrder, output);
			output.setStateLang(containerOrder.getState());
			output.setStateKey(containerOrder.getState());
			output.setBillDate(DateUtil.date2String(containerOrder.getBillDate()));
			// 组装明细
			ContainerOrderDetailExample detailExample = new ContainerOrderDetailExample();
			ContainerOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
			detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			detailCriteria.andOrderNoEqualTo(containerOrder.getOrderNo());
			List<NewContainerDetailsOutput> detailsOutputs = new ArrayList<NewContainerDetailsOutput>();
			List<ContainerOrderDetail> details = containerOrderDetailMapper.selectByExample(detailExample);
			for (ContainerOrderDetail detailItem : details) {
				NewContainerDetailsOutput detailsOutput = new NewContainerDetailsOutput();
				BeanUtils.copyProperties(detailItem, detailsOutput);
				detailsOutput.setStateNameLang(detailItem.getState());
				detailsOutputs.add(detailsOutput);
			}
			output.setDetails(detailsOutputs);
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 提交审核
	 * @param orderIds
	 */
	public void auditSumbit(Integer[] orderIds) {
		for (Integer orderId : orderIds) {
			ContainerOrder containerOrder = new ContainerOrder();
			containerOrder.setProdContainerOrderId(orderId);
			containerOrder.setState(OrderStateEnum.UNAUDIT.getCode());
			containerOrder.setUpdateTime(new Date());
			containerOrder.setUpdateUser(getCurrentUserId());
			containerOrderMapper.updateByPrimaryKeySelective(containerOrder);
		}
	}
	
	/**
	 * 根据订单号获取订单详情
	 * @param orderNo
	 * @return
	 */
	public NewContainerListOutput getDetail(String orderNo) {
		ContainerOrderExample example = new ContainerOrderExample();
		ContainerOrderExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andOrderNoEqualTo(orderNo);
		List<ContainerOrder> orders = containerOrderMapper.selectByExample(example);
		NewContainerListOutput output = new NewContainerListOutput();
		for (ContainerOrder containerOrder : orders) {
			BeanUtils.copyProperties(containerOrder, output);
			output.setStateLang(containerOrder.getState());
			output.setStateKey(containerOrder.getState());
			output.setBillDate(DateUtil.date2String(containerOrder.getBillDate()));
			// 组装明细
			ContainerOrderDetailExample detailExample = new ContainerOrderDetailExample();
			ContainerOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
			detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			detailCriteria.andOrderNoEqualTo(containerOrder.getOrderNo());
			List<NewContainerDetailsOutput> detailsOutputs = new ArrayList<NewContainerDetailsOutput>();
			List<ContainerOrderDetail> details = containerOrderDetailMapper.selectByExample(detailExample);
			for (ContainerOrderDetail detailItem : details) {
				NewContainerDetailsOutput detailsOutput = new NewContainerDetailsOutput();
				BeanUtils.copyProperties(detailItem, detailsOutput);
				detailsOutput.setStateNameLang(detailItem.getState());
				detailsOutputs.add(detailsOutput);
			}
			output.setDetails(detailsOutputs);
		}
		return output;
	}
	
	/**
	 * 删除订单
	 * @param orderIds
	 */
	public void delete(Integer[] orderIds) {
		for (Integer orderId : orderIds) {
			ContainerOrder order = containerOrderMapper.selectByPrimaryKey(orderId);
			// 删主表
			ContainerOrder record = new ContainerOrder();
			record.setProdContainerOrderId(orderId);
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			containerOrderMapper.updateByPrimaryKeySelective(record);
			// 删明细
			ContainerOrderDetailExample example = new ContainerOrderDetailExample();
			ContainerOrderDetailExample.Criteria criteria = example.createCriteria();
			criteria.andOrderNoEqualTo(order.getOrderNo());
			ContainerOrderDetail detailRecord = new ContainerOrderDetail();
			detailRecord.setIsDel(PlatformConstants.ISDEL_YES);
			detailRecord.setUpdateTime(new Date());
			detailRecord.setUpdateUser(getCurrentUserId());
			containerOrderDetailMapper.updateByExampleSelective(detailRecord, example);
		}
	}
	
	/**
	 * 检验完成
	 * @param detailIds
	 */
	public void finishCheck(Integer[] detailIds) {
		for (Integer detailId : detailIds) {
			ContainerOrderDetail detail = new ContainerOrderDetail();
			detail.setProdContainerOrderDetailId(detailId);
			detail.setState(OrderDetailStateEnum.CHECKED.getCode());
			detail.setUpdateTime(new Date());
			detail.setUpdateUser(getCurrentUserId());
			containerOrderDetailMapper.updateByPrimaryKeySelective(detail);
		}
	}
	
}
