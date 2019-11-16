package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.production.dao.PayingPartyChangeMapper;
import com.sanlly.production.entity.PayingPartyChange;
import com.sanlly.production.entity.PayingPartyChangeExample;
import com.sanlly.production.enums.CourseTypeEnum;
import com.sanlly.production.models.input.paying.PayingChangeInput;
import com.sanlly.production.service.PayingChangeService;

/**
 * 付费方实现类
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月16日 上午9:55:16 
 * @version V1.0   
 */
@Service
public class PayingChangeServiceImpl extends BaseServiceImpl implements PayingChangeService {

	@Autowired
	private PayingPartyChangeMapper payingPartyChangeMapper;

	/**
	 * 检验条目付费方获取（条目录入使用，获取付费方）
	 */
	@Override
	public String getPayingChange(PayingChangeInput input) {
		String paying = "";
		// 获取条目录入付费方，根据公司、进场类型、用箱人、箱类别、内外贸、部件修理代码、损坏代码
		// 根据公司、进场类型获取可筛选的全部数据
		PayingPartyChangeExample example = new PayingPartyChangeExample();
		PayingPartyChangeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES)
				.andCompanyEqualTo(input.getCompany());
		// 如果是退租箱，则进场状态要默认使用退租箱进场类型，因为退租箱进场时进场类型不一定为退租箱进场
		if (CommonEnum.YES.getCode().equals(input.getIsSurrender())) {
			criteria.andCourseTypeEqualTo(CourseTypeEnum.LKCOURSETYPE000005.getCode());
		} else {
			criteria.andCourseTypeEqualTo(input.getCourseType());
		}
		List<PayingPartyChange> payingList = payingPartyChangeMapper.selectByExample(example);
		// 查询结果集为空时，返回付费方"O"
		if (payingList.size() > 0) {
			// 获取当前进场类型的无特殊箱况下的付费方
			List<PayingPartyChange> payingPartyChange = payingList.stream()
					.filter(a -> CommonEnum.NO.getCode().equals(a.getIsSpecial())).collect(Collectors.toList());
			// 如果没有维护无特殊情况这种规则，则默认使用付费方"O"
			if (payingPartyChange.size() > 0) {
				paying = payingPartyChange.get(0).getPayingParty();
			} else {
				paying = "O";
			}
			List<PayingPartyChange> endlist = new ArrayList<PayingPartyChange>(payingList);
			// 获取属于特殊情况的转换规则
			endlist = endlist.stream().filter(a -> CommonEnum.YES.getCode().equals(a.getIsSpecial()))
					.collect(Collectors.toList());
			// 筛选规则：规则相关字段和传入的参数相匹配或者是规则的相关字段为空都算匹配成功
			// 根据用箱人筛选
			if (StringUtils.isNotEmpty(input.getContainerUser())) {
				// 根据用箱人匹配
				List<PayingPartyChange> list = payingList.stream()
						.filter(a -> !StringUtils.isNotEmpty(a.getContainerUser())
								|| (StringUtils.isNotEmpty(a.getContainerUser())
										&& a.getContainerUser().indexOf(input.getContainerUser()) > -1))
						.collect(Collectors.toList());
				endlist.retainAll(list);
			}
			// 根据箱类别筛选
			if (StringUtils.isNotEmpty(input.getContainerCategory())) {
				// 根据箱类别匹配
				List<PayingPartyChange> list = payingList.stream()
						.filter(a -> !StringUtils.isNotEmpty(a.getContainerCategory())
								|| (StringUtils.isNotEmpty(a.getContainerCategory())
										&& a.getContainerCategory().indexOf(input.getContainerCategory()) > -1))
						.collect(Collectors.toList());
				endlist.retainAll(list);
			}
			// 根据内外贸箱筛选
			if (StringUtils.isNotEmpty(input.getDomesticForeignTrade())) {
				// 根据内外贸箱匹配
				List<PayingPartyChange> list = payingList.stream()
						.filter(a -> !StringUtils.isNotEmpty(a.getDomesticForeignTrade())
								|| input.getDomesticForeignTrade().equals(a.getDomesticForeignTrade()))
						.collect(Collectors.toList());
				endlist.retainAll(list);
			}
			// 根据部件修理代码筛选
			if (StringUtils.isNotEmpty(input.getPartsRepairCode())) {
				// 根据部件修理代码匹配
				List<PayingPartyChange> list = payingList.stream()
						.filter(a -> !StringUtils.isNotEmpty(a.getPartsRepairCode())
								|| (StringUtils.isNotEmpty(a.getPartsRepairCode())
										&& a.getPartsRepairCode().indexOf(input.getPartsRepairCode()) > -1))
						.collect(Collectors.toList());
				endlist.retainAll(list);
			}
			// 根据损坏代码筛选
			if (StringUtils.isNotEmpty(input.getDamageCode())) {
				// 根据损坏代码匹配
				List<PayingPartyChange> list = payingList.stream().filter(
						a -> !StringUtils.isNotEmpty(a.getDamageCode()) || (StringUtils.isNotEmpty(a.getDamageCode())
								&& a.getDamageCode().indexOf(input.getDamageCode()) > -1))
						.collect(Collectors.toList());
				endlist.retainAll(list);
			}
			// 如果根据规则筛选出结果集，则使用第一条，否则使用默认付费方"O"
			if (endlist.size() > 0) {
				paying = endlist.get(0).getPayingParty();
			}
		} else {
			paying = "O";
		}

		return paying;
	}

}
