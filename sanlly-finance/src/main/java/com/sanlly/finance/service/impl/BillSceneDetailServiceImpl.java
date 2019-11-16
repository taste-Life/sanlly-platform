package com.sanlly.finance.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.BillSceneDetailMapper;
import com.sanlly.finance.entity.BillSceneDetail;
import com.sanlly.finance.entity.BillSceneDetailExample;
import com.sanlly.finance.models.input.BillDetailInput;
import com.sanlly.finance.models.input.BillSceneDetailInput;
import com.sanlly.finance.models.output.BillSceneDetailOutput;
import com.sanlly.finance.service.BillSceneDetailService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 现场收费账单服务实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年9月3日 下午2:56:58 
 * @version V1.0   
 */
@Service
public class BillSceneDetailServiceImpl extends BaseServiceImpl implements BillSceneDetailService {

	@Autowired
	private BillSceneDetailMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillSceneDetailOutput> getPage(BillDetailInput input) {
		// TODO Auto-generated method stub
		BillSceneDetailExample example = new BillSceneDetailExample();
		BillSceneDetailExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		;
		if (input.getPid() != null) {
			criteria.andBillIdEqualTo(input.getPid());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BillSceneDetailOutput> pagedList = new PagedList<BillSceneDetailOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillSceneDetail> list = dao.selectByExample(example);
		List<BillSceneDetailOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillSceneDetailOutput output = new BillSceneDetailOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类型
			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setFreeStatusNameLang(a.getFreeStatus());// 费用状态
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setChargeTypeKeyNameLang(a.getChargeTypeKey());//费用类型
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
	public Boolean addOrUpadte(BillSceneDetailInput input) {
		// TODO Auto-generated method stub
		BillSceneDetail record = new BillSceneDetail();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getBillId())) {

			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			BillSceneDetail info = dao.selectByPrimaryKey(input.getBillId());
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
			BillSceneDetail record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
