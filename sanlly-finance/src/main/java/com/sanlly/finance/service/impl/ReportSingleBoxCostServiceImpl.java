package com.sanlly.finance.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.ReportSingleBoxCostMapper;
import com.sanlly.finance.entity.ReportSingleBoxCost;
import com.sanlly.finance.entity.ReportSingleBoxCostExample;
import com.sanlly.finance.models.input.ReportSingleBoxCostInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.ReportSingleBoxCostOutput;
import com.sanlly.finance.service.ReportSingleBoxCostService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 单箱成本核算表
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class ReportSingleBoxCostServiceImpl extends BaseServiceImpl implements ReportSingleBoxCostService {

	@Autowired
	private ReportSingleBoxCostMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;
	
	/**
	 * 根据进场id查询一条记录
	 */
	@Override
	public ReportSingleBoxCost getInfoByProdCourseIdId(String prodCourseId) {
		ReportSingleBoxCostExample example = new ReportSingleBoxCostExample();
		ReportSingleBoxCostExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andProdCourseIdEqualTo(prodCourseId);
		
		List<ReportSingleBoxCost> list = dao.selectByExample(example);
		if(list!=null && list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}

	}

	/**
	 * 检索集合
	 */
	@Override
	public List<ReportSingleBoxCostOutput> list(SearchBaseInput input) {
		ReportSingleBoxCostExample example = new ReportSingleBoxCostExample();
		ReportSingleBoxCostExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		
		example.setOrderByClause(" `create_time` DESC");
		List<ReportSingleBoxCost> list = dao.selectByExample(example);
		List<ReportSingleBoxCostOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			ReportSingleBoxCostOutput output = new ReportSingleBoxCostOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setContainerUserNameLang(a.getContainerUser());
			output.setYardNameLang(a.getYard());

			// 查询用户
			// 创建人
			if (!StringUtils.isEmpty(a.getCreateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
				output.setCreateUserName(user.getData().getUserName());
			}
			// 修改人创建人
			if (!StringUtils.isEmpty(a.getUpdateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
				output.setUpdateUserName(user.getData().getUserName());
			}

			return output;
		}).collect(Collectors.toList());

		return outputList;
	}

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<ReportSingleBoxCostOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		ReportSingleBoxCostExample example = new ReportSingleBoxCostExample();
		ReportSingleBoxCostExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		
		int totalCount = (int) dao.countByExample(example);
		PagedList<ReportSingleBoxCostOutput> pagedList = new PagedList<ReportSingleBoxCostOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<ReportSingleBoxCost> list = dao.selectByExample(example);
		List<ReportSingleBoxCostOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			ReportSingleBoxCostOutput output = new ReportSingleBoxCostOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setContainerUserNameLang(a.getContainerUser());
			output.setYardNameLang(a.getYard());

			// 查询用户
			// 创建人
			if (!StringUtils.isEmpty(a.getCreateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
				output.setCreateUserName(user.getData().getUserName());
			}
			// 修改人创建人
			if (!StringUtils.isEmpty(a.getUpdateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
				output.setUpdateUserName(user.getData().getUserName());
			}

			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 修改或者添加
	 */
	@Override
	public Boolean addOrUpadte(ReportSingleBoxCostInput input) {
		// TODO Auto-generated method stub
		ReportSingleBoxCost record = new ReportSingleBoxCost();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			ReportSingleBoxCost info = dao.selectByPrimaryKey(input.getId());
			BeanUtils.copyProperties(info, record);
			BeanUtils.copyProperties(input, record);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			if (dao.updateByPrimaryKey(record) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 批量删除
	 */
	@Override
	public Boolean deletes(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			ReportSingleBoxCost record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}



}
