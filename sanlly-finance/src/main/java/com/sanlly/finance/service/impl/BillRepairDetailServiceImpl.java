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
import com.sanlly.finance.dao.BillRepairDetailMapper;
import com.sanlly.finance.entity.BillRepairDetail;
import com.sanlly.finance.entity.BillRepairDetailExample;
import com.sanlly.finance.models.input.BillDetailInput;
import com.sanlly.finance.models.input.BillRepairDetailInput;
import com.sanlly.finance.models.output.BillRepairDetailOutput;
import com.sanlly.finance.service.BillRepairDetailService;
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
public class BillRepairDetailServiceImpl extends BaseServiceImpl implements BillRepairDetailService {

	@Autowired
	private BillRepairDetailMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillRepairDetailOutput> getPage(BillDetailInput input) {
		// TODO Auto-generated method stub
		BillRepairDetailExample example = new BillRepairDetailExample();
		BillRepairDetailExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		;
		if (input.getPid() != null) {
			criteria.andBillIdEqualTo(input.getPid());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BillRepairDetailOutput> pagedList = new PagedList<BillRepairDetailOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillRepairDetail> list = dao.selectByExample(example);
		List<BillRepairDetailOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillRepairDetailOutput output = new BillRepairDetailOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setContainerCategoryNameLang(a.getContainerCategory());//箱类别
			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setFreeStatusNameLang(a.getFreeStatus());// 费用状态
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setYardNameLang(a.getYard());//场站
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
	public Boolean addOrUpadte(BillRepairDetailInput input) {
		// TODO Auto-generated method stub
		BillRepairDetail record = new BillRepairDetail();
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
			BillRepairDetail info = dao.selectByPrimaryKey(input.getBillId());
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
			BillRepairDetail record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
