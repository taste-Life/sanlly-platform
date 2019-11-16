package com.sanlly.production.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.FoamingMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.Foaming;
import com.sanlly.production.entity.FoamingExample;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.FoamingEnum;
import com.sanlly.production.enums.FoamingStateEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.models.input.foaming.SearchFoamingInput;
import com.sanlly.production.models.output.foaming.SearchFoamingOutput;
import com.sanlly.production.service.FoamingService;

/**
 * 发泡新增
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午3:02:38 
 * @version V1.0   
 */
@Service
public class FoamingServiceImpl extends BaseServiceImpl implements FoamingService {

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private ReferralEntryMapper referralEntryMapper;

	@Autowired
	private FoamingMapper foamingMapper;

	/**
	 * 发泡新增
	 */
	@Override
	public void addFoaming(String courseId) {
		// 获取箱体进场信息
		Course course = courseMapper.selectByPrimaryKey(courseId);
		// 判断箱类别是否是箱体
		if (!ContainerCategoryEnum.CONTAINER_02.getCode().equals(course.getContainerCategory()))
			return;
		// 判断派工状态是否已派工
		if (!ReferralStateEnum.REFERRALED.getCode().equals(course.getReferralState()))
			return;
		// 判断该进场id是否已存在发泡数据
		FoamingExample fExample = new FoamingExample();
		fExample.createCriteria().andCourseEqualTo(courseId);
		List<Foaming> list = foamingMapper.selectByExample(fExample);
		if (list.size() > 0)
			return;
		// 判断派工条目是否包含部件明细为PIM，维修代码为RP的条目
		ReferralEntryExample example = new ReferralEntryExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId);
		List<ReferralEntry> entryList = referralEntryMapper.selectByExample(example);
		for (ReferralEntry item : entryList) {
			if (FoamingEnum.PIM.getCode().equals(item.getPartsDetailsCode())
					&& FoamingEnum.RP.getCode().equals(item.getRepairCode())) {
				// 添加发泡数据
				Foaming model = new Foaming();
				model.setCourse(courseId);
				model.setContainerNo(course.getContainerNo());
				model.setState(FoamingStateEnum.no.getCode());
				model.setCreateTime(new Date());
				model.setCreateUser(getCurrentUserId());
				foamingMapper.insert(model);
				break;
			}
		}
	}

	/**
	 * 发泡列表
	 */
	@Override
	public PagedList<SearchFoamingOutput> getFoamingPagedList(SearchFoamingInput input) {
		// 检索条件
		FoamingExample example = new FoamingExample();
		FoamingExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time desc");
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		if (StringUtils.isNotEmpty(input.getState())) {
			criteria.andStateEqualTo(input.getState());
		}
		// 总条数
		Integer totalItemCount = (int) foamingMapper.countByExample(example);
		PagedList<SearchFoamingOutput> pagedList = new PagedList<SearchFoamingOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<Foaming> list = foamingMapper.selectByExampleWithBLOBs(example);
		// 构造返回数据
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<SearchFoamingOutput> dataList = new ArrayList<SearchFoamingOutput>();
		for (Foaming item : list) {
			SearchFoamingOutput model = new SearchFoamingOutput();
			model.setFoamingId(item.getProdFoamingId());
			model.setContainerNo(item.getContainerNo()); // 箱号
			model.setIsFoamingLang(item.getState()); // 是否发泡
			model.setPhoto(item.getPhoto()); // 图片
			// 查询进场数据
			Course course = courseMapper.selectByPrimaryKey(item.getCourse());
			if (course != null) {
				model.setContainerUserLang(course.getContainerUser()); // 用箱人
				model.setYardLang(course.getYard()); // 进场场站
				model.setCourseTypeLang(course.getCourseType()); // 进场类型
				// 格式化日期，派工时间
				if (course.getReferralTime() != null) {
					model.setReferralTime(sdf.format(course.getReferralTime()));
				}
			}
			dataList.add(model);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
	 * 发泡完工
	 */
	@Override
	public void finishFoaming(Integer[] listIds) {
		FoamingExample example = new FoamingExample();
		example.createCriteria().andProdFoamingIdIn(Arrays.asList(listIds));
		Foaming model = new Foaming();
		model.setState(FoamingStateEnum.yes.getCode());
		model.setFoamingTime(new Date());
		model.setFoamingUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		foamingMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 发泡图片上传
	 */
	@Override
	public void uploadFoaming(Integer foamingId, String photo) {
		FoamingExample example = new FoamingExample();
		example.createCriteria().andProdFoamingIdEqualTo(foamingId);
		Foaming model = foamingMapper.selectByPrimaryKey(foamingId);
		model.setPhoto(photo);
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		foamingMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 删除发泡
	 */
	@Override
	public void delFoaming(String courseId) {
		// 删除发泡
		FoamingExample example = new FoamingExample();
		example.createCriteria().andCourseEqualTo(courseId);
		foamingMapper.deleteByExample(example);
	}

}
