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
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.finance.dao.BaseYardSchemaMapper;
import com.sanlly.finance.entity.BaseYardSchema;
import com.sanlly.finance.entity.BaseYardSchemaExample;
import com.sanlly.finance.models.input.BaseYardSchemaInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseYardSchemaOutput;
import com.sanlly.finance.service.BaseYardSchemaService;
import com.sanlly.finance.service.SchemaService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 场站配置中心实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseYardSchemaServiceImpl extends BaseServiceImpl implements BaseYardSchemaService {

	/**
	 * 核算部门 Mapper
	 */
	@Autowired
	private BaseYardSchemaMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	@Autowired
	private SchemaService schemaService;

	/**
	 * 检索集合
	 */
	@Override
	public List<BaseYardSchemaOutput> list(SearchBaseInput input) {
		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 根据场站key查询
		if (input.getYard() != null && !StringUtils.isEmpty(input.getYard().trim())) {
			criteria.andYardEqualTo(input.getYard().trim());
		}
		example.setOrderByClause(" `create_time` DESC");
		List<BaseYardSchema> list = dao.selectByExample(example);
		List<BaseYardSchemaOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BaseYardSchemaOutput output = new BaseYardSchemaOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
		    
		    output.setYardNameLang(a.getYard());// 场站
		    output.setWbschemaNameLang(a.getWbschema());//外包模式
		    output.setWxschemaNameLang(a.getWxschema());//维修模式
		    output.setCompanyKeyNameLang(a.getCompanyKey());// 公司
		    output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			

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
	public PagedList<BaseYardSchemaOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

		// 名称 中英文 根据场站名称查询
		if (!StringUtils.isEmpty(input.getName().trim())) {
			BaseSearchInput baseInput = new BaseSearchInput();
			baseInput.setName(input.getName());
			Result<List<YardOutput>> rl = productionFeignClient.yardList(baseInput);
			if (rl != null) {
				List<YardOutput> listYard = rl.getData();
				List<String> ids = listYard.stream().map(y -> y.getKey().toString())
						.collect(Collectors.toList());
				criteria.andYardIn(ids);

			}
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseYardSchemaOutput> pagedList = new PagedList<BaseYardSchemaOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseYardSchema> list = dao.selectByExample(example);
		List<BaseYardSchemaOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BaseYardSchemaOutput output = new BaseYardSchemaOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
		    
		    output.setYardNameLang(a.getYard());// 场站
		    output.setWbschemaNameLang(a.getWbschema());//外包模式
		    output.setWxschemaNameLang(a.getWxschema());//维修模式
		    output.setCompanyKeyNameLang(a.getCompanyKey());// 公司
		    output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
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
	public Boolean addOrUpadte(BaseYardSchemaInput input) {
		// TODO Auto-generated method stub
		BaseYardSchema record = new BaseYardSchema();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			// 获取key
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			BaseYardSchema info = dao.selectByPrimaryKey(input.getId());
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
			BaseYardSchema record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
