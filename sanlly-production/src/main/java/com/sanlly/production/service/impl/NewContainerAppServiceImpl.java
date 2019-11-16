package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import com.sanlly.production.models.input.app.newContainer.OrderDetailSubInput;
import com.sanlly.production.models.output.app.newContainer.NewContainerDetailListOutput;
import com.sanlly.production.models.output.app.newContainer.NewContainerListOutput;
import com.sanlly.production.service.NewContainerAppService;

@Service
public class NewContainerAppServiceImpl implements NewContainerAppService {
	
	@Autowired
	private ContainerOrderMapper containerOrderMapper;
	@Autowired
	private ContainerOrderDetailMapper containerOrderDetailMapper;

	/**
	 * 新箱订单列表
	 * @param orderNo 订单号
	 * @param status 审核状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	@Override
	public PagedList<NewContainerListOutput> list(String orderNo, String status, Integer pageNum, Integer pageSize) {
		List<NewContainerListOutput> outputList = new ArrayList<NewContainerListOutput>();
		ContainerOrderExample example = new ContainerOrderExample();
		ContainerOrderExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (orderNo != null && orderNo != "") {
			criteria.andOrderNoLike("%"+orderNo.trim()+"%");
		}
		if (status != null && status != "") {
			criteria.andStateEqualTo(status);
		}
		example.setOrderByClause("create_time DESC");
		Integer totalItemCount = (int)containerOrderMapper.countByExample(example); 
		PagedList<NewContainerListOutput> pagedList = new PagedList<NewContainerListOutput>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ContainerOrder> list = containerOrderMapper.selectByExample(example);
		for (ContainerOrder item : list) {
			NewContainerListOutput output = new NewContainerListOutput();
			output.setOrderId(item.getProdContainerOrderId());
			output.setOrderNo(item.getOrderNo());
			output.setCustomerName(item.getCustomerName());
			output.setUnitCompany(item.getChillerCompanyName());
			if (item.getCount() != null) {
				output.setNumber(item.getCount().toString());
			} else {
				output.setNumber("");
			}
			output.setRemarks(item.getRemark());
			output.setStatusLang(item.getState());
			output.setSoftwareVersion(item.getSoftwareversion());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 新箱订单明细列表
	 * @param order
	 * @param containerNo
	 * @param status
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PagedList<NewContainerDetailListOutput> detailList(
			String orderNo, 
			String containerNo, 
			String status, 
			Integer pageNum, 
			Integer pageSize) {
		List<NewContainerDetailListOutput> outputList = new ArrayList<NewContainerDetailListOutput>();
		ContainerOrderDetailExample example = new ContainerOrderDetailExample();
		ContainerOrderDetailExample.Criteria criteria = example.createCriteria();
		// 按序号升序排序
		example.setOrderByClause("no ASC");
		criteria.andOrderNoEqualTo(orderNo);
		if (containerNo != null && containerNo != "") {
			criteria.andContainerNoLike("%"+containerNo.trim()+"%");
		}
		if (status != null && status != "") {
			criteria.andStateEqualTo(status);
		}
		Integer totalItemCount = (int)containerOrderDetailMapper.countByExample(example);
		PagedList<NewContainerDetailListOutput> pagedList = new PagedList<NewContainerDetailListOutput>(pageNum, pageSize, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ContainerOrderDetail> list = containerOrderDetailMapper.selectByExample(example);
		for (ContainerOrderDetail item : list) {
			NewContainerDetailListOutput output = new NewContainerDetailListOutput();
			output.setOrderDetailId(item.getProdContainerOrderDetailId());
			output.setContainerNo(item.getContainerNo());
			output.setOrderNo(item.getOrderNo());
			output.setCodeData(item.getColdDate());
			output.setUnitCode(item.getUnitCode());
			output.setControl(item.getControllerNo());
			output.setCompressor(item.getCompressorNo());
			output.setCommDate(item.getCommDate());
			output.setUnitId(item.getUniId());
			output.setSubstrateCode(item.getSubstrateCode());
			output.setModemNum(item.getModemNo());
			output.setGpsNum(item.getGpsNo());
			output.setCaNum(item.getCaNo());
			output.setRemarks(item.getRemark());
			output.setSoftwareVersion(item.getHardwareVersion());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;	
	};
	
	/**
	 * 批量确认订单明细
	 * @param orderDetailIds
	 */
	public void orderDetailConfirm(String orderDetailIds) {
		String[] orderDetailIdsArr = orderDetailIds.split(",");
		for (String item : orderDetailIdsArr) {
			ContainerOrderDetail record = new ContainerOrderDetail();
			record.setProdContainerOrderDetailId(Integer.valueOf(item));
			// 维护打冷日期
			record.setColdDate(DateUtil.date2String(new Date()));
			record.setState(OrderDetailStateEnum.CHECKED.getCode());
			containerOrderDetailMapper.updateByPrimaryKeySelective(record);
		}
	}
	
	/**
	 * 新增修改新箱订单明细
	 * @param input
	 */
	public void orderDetailsSub(OrderDetailSubInput input) {
		ContainerOrderDetail record = new ContainerOrderDetail();
		record.setOrderNo(input.getOrderNo());
		record.setContainerNo(input.getContainerNo());
		record.setUnitCode(input.getUnitCode());
		record.setControllerNo(input.getControl());
		record.setCompressorNo(input.getCompressor());
		record.setCommDate(input.getCommDate());
		record.setUniId(input.getUnitId());
		record.setSubstrateCode(input.getSubstrateCode());
		record.setModemNo(input.getModemNum());
		record.setGpsNo(input.getGpsNum());
		record.setCaNo(input.getCaNum());
		record.setRemark(input.getRemarks());
		record.setHardwareVersion(input.getSoftwareVersion());
		if (input.getOrderDetailId() != null) {
			// 有明细id，更新
			record.setProdContainerOrderDetailId(input.getOrderDetailId());
			containerOrderDetailMapper.updateByPrimaryKeySelective(record);
		} else {
			// 无明细id，新增
			record.setState(OrderDetailStateEnum.UNCHECK.getCode());
			containerOrderDetailMapper.insertSelective(record);
		}
	}

}
