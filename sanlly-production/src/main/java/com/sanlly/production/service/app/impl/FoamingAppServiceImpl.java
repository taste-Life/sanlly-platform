package com.sanlly.production.service.app.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.dao.FoamingMapper;
import com.sanlly.production.entity.Foaming;
import com.sanlly.production.entity.FoamingExample;
import com.sanlly.production.enums.FoamingStateEnum;
import com.sanlly.production.models.input.app.foamoing.UpdateFoamingInput;
import com.sanlly.production.models.output.app.Foaming.SearchFoamingAppOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.app.FoamingAppService;
import com.sanlly.production.service.impl.BaseServiceImpl;

/**
 * 发泡实现类
 * 
 * @Package com.sanlly.production.service.app.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午1:58:20 
 * @version V1.0   
 */
@Service
public class FoamingAppServiceImpl extends BaseServiceImpl implements FoamingAppService {

	@Autowired
	private FoamingMapper foamingMapper;

	@Autowired
	private AuthService authService;

	/**
	 * 发泡列表
	 */
	@Override
	public PagedList<SearchFoamingAppOutput> getFoamingsPagedList(String containerNo, String foamingState,
			Integer index, Integer size) {
		// 查询条件
		FoamingExample example = new FoamingExample();
		example.setOrderByClause("create_time desc");
		FoamingExample.Criteria criteria = example.createCriteria();
		// 箱号
		if (StringUtils.isNotEmpty(containerNo)) {
			criteria.andContainerNoLike("%" + containerNo + "%");
		}
		// 箱号
		if (StringUtils.isNotEmpty(foamingState)) {
			criteria.andStateEqualTo(foamingState);
		}
		// 总条数
		Integer totalItemCount = (int) foamingMapper.countByExample(example);
		PagedList<SearchFoamingAppOutput> pagedList = new PagedList<SearchFoamingAppOutput>(index, size,
				totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<Foaming> forthList = foamingMapper.selectByExampleWithBLOBs(example);
		// 构造返回数据
		List<SearchFoamingAppOutput> backList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		for (Foaming item : forthList) {
			SearchFoamingAppOutput model = new SearchFoamingAppOutput();
			model.setProdCourseId(item.getCourse()); // 进场id
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setRemarks(item.getRemarks()); // 备注
			model.setFoamingPic(item.getPhoto()); // 发泡图片
			model.setFoamingState(item.getState()); // 发泡状态
			// 格式化日期
			if (item.getFoamingTime() != null) {
				model.setFoamingDate(sdf.format(item.getFoamingTime()));
			}
			// 机组检验人
			if (item.getFoamingUser() != null) {
				Result<UserInfoOutput> rlt = authService.getUserDetail(item.getFoamingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						model.setFoamingUser(user.getUserName());
					}
				}
			}
			backList.add(model);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(backList);
		return pagedList;
	}

	/**
	 * 发泡保存
	 */
	@Override
	public void updateFoaming(UpdateFoamingInput input) {
		FoamingExample example = new FoamingExample();
		example.createCriteria().andCourseEqualTo(input.getProdCourseId());
		Foaming model = new Foaming();
		model.setRemarks(input.getRemarks());
		model.setPhoto(input.getFoamingPic());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		foamingMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 批量发泡
	 */
	@Override
	public void subFoaming(String[] listIds) {
		FoamingExample example = new FoamingExample();
		example.createCriteria().andCourseIn(Arrays.asList(listIds));
		Foaming model = new Foaming();
		model.setState(FoamingStateEnum.yes.getCode());
		model.setFoamingTime(new Date());
		model.setFoamingUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		foamingMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 单箱发泡
	 */
	@Override
	public void subFoamingSingle(UpdateFoamingInput input) {
		FoamingExample example = new FoamingExample();
		example.createCriteria().andCourseEqualTo(input.getProdCourseId());
		Foaming model = new Foaming();
		model.setState(FoamingStateEnum.yes.getCode());
		model.setRemarks(input.getRemarks());
		model.setPhoto(input.getFoamingPic());
		model.setFoamingTime(new Date());
		model.setFoamingUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		foamingMapper.updateByExampleSelective(model, example);
	}

}
