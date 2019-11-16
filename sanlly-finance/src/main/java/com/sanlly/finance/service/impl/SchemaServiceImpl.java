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
import com.sanlly.finance.dao.SchemaMapper;
import com.sanlly.finance.entity.Schema;
import com.sanlly.finance.entity.SchemaExample;
import com.sanlly.finance.models.input.SchemaInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.SchemaOutput;
import com.sanlly.finance.service.SchemaService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 模式对应实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class SchemaServiceImpl extends BaseServiceImpl implements SchemaService {

	/**
	 * 核算部门 Mapper
	 */
	@Autowired
	private SchemaMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	
	private String tableName = "finance_schema";

	@Override
	public List<SchemaOutput> list(SearchBaseInput input) {
		SchemaExample example = new SchemaExample();
		SchemaExample.Criteria criteria = example.createCriteria();
		SchemaExample.Criteria criteria2 = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

		// 名称 中英文
		if (input.getName()!=null && !StringUtils.isEmpty(input.getName().trim())) {
			criteria.andSchemaNameEnLike("%" + input.getName().trim() + "%");
			criteria2.andSchemaNameLike("%" + input.getName().trim() + "%");
		}

		example.or(criteria2);
		example.setOrderByClause(" `create_time` DESC");
		List<Schema> list = dao.selectByExample(example);
		List<SchemaOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					SchemaOutput output = new SchemaOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setLangKeyNameLang(a.getLangKey());
					// 查询用户
					// 创建人
					if (!StringUtils.isEmpty(a.getCreateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
						output.setCreateUser(user.getData().getUserName());
					}
					// 修改人
					if (!StringUtils.isEmpty(a.getUpdateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
						output.setUpdateUser(user.getData().getUserName());
					}

					return output;
				}).collect(Collectors.toList());

		return outputList;
	}

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<SchemaOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		SchemaExample example = new SchemaExample();
		SchemaExample.Criteria criteria = example.createCriteria();
		SchemaExample.Criteria criteria2 = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

		// 名称 中英文
		if (input.getName()!=null && !StringUtils.isEmpty(input.getName().trim())) {
			criteria.andSchemaNameEnLike("%" + input.getName().trim() + "%");
			criteria2.andSchemaNameLike("%" + input.getName().trim() + "%");
		}

		example.or(criteria2);
		int totalCount = (int) dao.countByExample(example);
		PagedList<SchemaOutput> pagedList = new PagedList<SchemaOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<Schema> list = dao.selectByExample(example);
		List<SchemaOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					SchemaOutput output = new SchemaOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setLangKeyNameLang(a.getLangKey());
					// 查询用户
					// 创建人
					if (!StringUtils.isEmpty(a.getCreateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
						output.setCreateUser(user.getData().getUserName());
					}
					// 修改人
					if (!StringUtils.isEmpty(a.getUpdateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
						output.setUpdateUser(user.getData().getUserName());
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
	public Boolean addOrUpadte(SchemaInput input) {
		// TODO Auto-generated method stub
		Schema record = new Schema();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			// 获取key
			Result<String> key = productionFeignClient.getKey(tableName);
			record.setLangKey(key.getData());
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			Schema info = dao.selectByPrimaryKey(input.getId());
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
			Schema record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
