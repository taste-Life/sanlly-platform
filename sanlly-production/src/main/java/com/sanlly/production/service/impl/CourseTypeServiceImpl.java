package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.base.CourseTypeInput;
import com.sanlly.common.models.output.base.CourseTypeOutput;
import com.sanlly.production.dao.CourseTypeMapper;
import com.sanlly.production.entity.CourseType;
import com.sanlly.production.entity.CourseTypeExample;
import com.sanlly.production.entity.CourseTypeExample.Criteria;
import com.sanlly.production.service.CourseTypeService;
@Service
public class CourseTypeServiceImpl extends BaseServiceImpl implements CourseTypeService {

	@Autowired
	private CourseTypeMapper courseTypeMapper;
	@Autowired
	private LangServiceImpl lang;
	
	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	@Override
	public List<CourseTypeOutput> list() {
		List<CourseTypeOutput> outputList = new ArrayList<CourseTypeOutput>();
		CourseTypeExample example = new CourseTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<CourseType> list = courseTypeMapper.selectByExample(example);
		for (CourseType item : list) {
			CourseTypeOutput output = new CourseTypeOutput();
			BeanUtils.copyProperties(item, output);
			outputList.add(output);
		}
		return outputList;
	}

	/**
	 * 
	 * 根据主键查询
	 * @param id
	 * @return 
	 * @author zhangkai
	 */
	@Override
	public CourseTypeOutput query(Integer id) {
		CourseType record = courseTypeMapper.selectByPrimaryKey(id);
		CourseTypeOutput output = new CourseTypeOutput();
		BeanUtils.copyProperties(record, output);
		return output;
	}

	/**
	 * 根据主键更新
	 * @param company
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int update(CourseTypeInput input) {
		CourseType record = new CourseType();
		BeanUtils.copyProperties(input, record);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return courseTypeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int add(CourseTypeInput input) {
		CourseType record = new CourseType();
		BeanUtils.copyProperties(input, record);
		record.setKey(lang.getLangRuleKeyByTable("prod_course_type"));
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setIsValid(PlatformConstants.ISVALID_YES);
		record.setCreateUser(getCurrentUserId());
		record.setCreateTime(new Date());
		return courseTypeMapper.insertSelective(record);
	}

	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int delete(Integer id) {
		CourseType record = new CourseType();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return courseTypeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	*@Description: 进场类型分页列表
	*@Param: [input, searchWords]
	*@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.CourseTypeOutput>
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public PagedList<CourseTypeOutput> pageList(PageInput input, String searchWords) {
		List<CourseTypeOutput> outputList = new ArrayList<CourseTypeOutput>();
		CourseTypeExample example = new CourseTypeExample();
		example.setOrderByClause("create_time DESC");
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (searchWords != null && !"".equals(searchWords)) {
			criteria.andCourseTypeCodeLike("%"+searchWords.trim()+"%");
			Criteria criteria2 = example.createCriteria();
			criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria2.andCourseTypeNameLike("%"+searchWords.trim()+"");
			Criteria criteria3 = example.createCriteria();
			criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria3.andCourseTypeNameEnLike("%"+searchWords.trim()+"%");
			example.or(criteria2);
			example.or(criteria3);
		}
		Integer totalItemCount = (int)courseTypeMapper.countByExample(example);
		PagedList<CourseTypeOutput> pagedList = new PagedList<CourseTypeOutput>
				(input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<CourseType> list = courseTypeMapper.selectByExample(example);
		for (CourseType item : list) {
			CourseTypeOutput output = new CourseTypeOutput();
			BeanUtils.copyProperties(item, output);
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	*@Description: 批量删除 进场类型
	*@Param: [ids]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-26
	*/
	@Override
	public int multiDelete(Integer[] ids) {
		for(Integer id : ids){
			CourseType record = new CourseType();
			record.setProdCourseTypeId(id);
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			courseTypeMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

	/**
	*@Description: 批量设置有效性
	*@Param: [ids, valid]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-26
	*/
	@Override
	public int multiValid(Integer[] ids, int valid) {
		for(Integer id : ids){
			CourseType record = new CourseType();
			record.setProdCourseTypeId(id);
			record.setIsValid(valid);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			courseTypeMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

}
