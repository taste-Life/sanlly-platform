package com.sanlly.production.service.app.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.ProdOutMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.ProdOut;
import com.sanlly.production.entity.ProdOutExample;
import com.sanlly.production.models.input.app.outYard.OutYardInput;
import com.sanlly.production.models.output.outYard.OutContainerNoListOutput;
import com.sanlly.production.models.output.outYard.SearchOutYardOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.app.OutYardAPPService;

/**
 * 出厂实现类
 * 
 * @Package com.sanlly.production.service.app.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年11月7日 下午6:36:17 
 * @version V1.0   
 */
@Service
public class OutYardAPPServiceImpl extends BaseAppServiceImpl implements OutYardAPPService {

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private AuthService authClient;

	@Autowired
	private ProdOutMapper prodOutMapper;

	/**
	 * 出厂
	 */
	@Override
	public void outYard(OutYardInput input) {
		ProdOut model = new ProdOut();
		model.setCourse(input.getProdCourseId());
		model.setContainerNo(input.getContainerNo());
		model.setOutPhoto(input.getPhoto());
		model.setOutTime(new Date());
		model.setOutUser(getCurrentUserId());
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		prodOutMapper.insert(model);
	}

	/**
	 * 出厂列表
	 */
	@Override
	public PagedList<SearchOutYardOutput> getOutYardList(String containerNo, String outState, Integer index,
			Integer size) {
		if (CommonEnum.NO.getCode().equals(outState)) {
			CourseExample example = new CourseExample();
			CourseExample.Criteria criteria = example.createCriteria();
			// 箱号
			if (StringUtils.isNotEmpty(containerNo)) {
				criteria.andContainerNoLike("%" + containerNo + "%");
			}
			// 分页查询
			int total = (int) courseMapper.countByExample(example);
			PagedList<SearchOutYardOutput> pagedList = new PagedList<SearchOutYardOutput>(index, size, total);
			example.setLimitStart(pagedList.getLimitStart());
			example.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			example.setOrderByClause(" create_time desc");
			List<CourseWithBLOBs> courseList = courseMapper.selectByExampleWithBLOBs(example);
			List<SearchOutYardOutput> outList = new ArrayList<SearchOutYardOutput>();
			for (CourseWithBLOBs item : courseList) {
				SearchOutYardOutput model = new SearchOutYardOutput();
				model.setProdCourseId(item.getProdCourseId()); // 进场id
				model.setContainerNo(item.getContainerNo()); // 箱号
				model.setOutState(CommonEnum.NO.getCode());
				outList.add(model);
			}
			pagedList.setDataList(outList);
			return pagedList;
		} else {
			ProdOutExample example = new ProdOutExample();
			ProdOutExample.Criteria criteria = example.createCriteria();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			// 箱号
			if (StringUtils.isNotEmpty(containerNo)) {
				criteria.andContainerNoLike("%" + containerNo + "%");
			}
			// 分页查询
			int total = (int) prodOutMapper.countByExample(example);
			PagedList<SearchOutYardOutput> pagedList = new PagedList<SearchOutYardOutput>(index, size, total);
			example.setLimitStart(pagedList.getLimitStart());
			example.setLimitEnd(pagedList.getLimitEnd());
			pagedList.setTotalItemCount(total);
			// 按照进场倒序
			example.setOrderByClause(" out_time desc");
			List<ProdOut> courseList = prodOutMapper.selectByExampleWithBLOBs(example);
			List<SearchOutYardOutput> outList = new ArrayList<SearchOutYardOutput>();
			for (ProdOut item : courseList) {
				SearchOutYardOutput model = new SearchOutYardOutput();
				model.setProdOutId(item.getProdOutId() + ""); // 出场id
				model.setProdCourseId(item.getCourse()); // 进场id
				model.setContainerNo(item.getContainerNo()); // 箱号
				model.setOutPhoto(item.getOutPhoto()); // 出厂图片
				// 格式化日期
				if (item.getOutTime() != null) {
					model.setOutDate(sdf.format(item.getOutTime())); // 出厂时间
				}
				// 质检员
				if (item.getOutUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(item.getOutUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							model.setOutUser(user.getUserName());
						}
					}
				}
				model.setOutState(CommonEnum.YES.getCode());

				outList.add(model);
			}
			pagedList.setDataList(outList);
			return pagedList;
		}

	}

	/**
	 * 获取场站出厂箱号
	 */
	@Override
	public List<OutContainerNoListOutput> getOutYardContainerNOList(String containerNo) {
		CourseExample example = new CourseExample();
		CourseExample.Criteria criteria = example.createCriteria().andYardEqualTo(getCurrentYardKey());
		// 箱号
		if (StringUtils.isNotEmpty(containerNo)) {
			criteria.andContainerNoLike("%" + containerNo + "%");
		}
		List<Course> course = courseMapper.selectByExample(example);
		return course.stream().map(a -> {
			OutContainerNoListOutput model = new OutContainerNoListOutput();
			model.setProdCourseId(a.getProdCourseId());
			model.setContainerNo(a.getContainerNo());
			return model;
		}).collect(Collectors.toList());
	}

}
