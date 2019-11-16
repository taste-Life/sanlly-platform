package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.base.ContainerUserInput;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.production.dao.CompanyUsecontMapper;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.entity.CompanyUsecont;
import com.sanlly.production.entity.CompanyUsecontExample;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.ContainerUserExample.Criteria;
import com.sanlly.production.models.output.containerUser.ContUserSelectOutput;
import com.sanlly.production.service.ContainerUserService;

@Service
public class ContainerUserServiceImpl extends BaseServiceImpl implements ContainerUserService {
	@Autowired
	private ContainerUserMapper containerUserMapper;
	@Autowired
	private LangServiceImpl lang;
	@Autowired
	private CompanyUsecontMapper cuMapper;
	
	/**
	 * @author wangxiaozheng
	 */
	@Override
	public List<ContUserSelectOutput> contUserSelect() {
		ContainerUserExample example=new ContainerUserExample();
		ContainerUserExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerUser> contUserList=containerUserMapper.selectByExample(example);
		return contUserList.stream().map(a->{
			ContUserSelectOutput output=new ContUserSelectOutput();
			output.setContUserKey(a.getKey());
			output.setContUserName(a.getContainerUserName());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	@Override
	public List<ContainerUserOutput> list() {
		List<ContainerUserOutput> outputList = new ArrayList<ContainerUserOutput>();
		ContainerUserExample example = new ContainerUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerUser> list = containerUserMapper.selectByExample(example);
		for (ContainerUser item : list) {
			ContainerUserOutput output = new ContainerUserOutput();
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
	public ContainerUserOutput query(Integer id) {
		ContainerUser record = containerUserMapper.selectByPrimaryKey(id);
		ContainerUserOutput output = new ContainerUserOutput();
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
	public int update(ContainerUserInput input) {
		ContainerUser record = new ContainerUser();
		BeanUtils.copyProperties(input, record);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return containerUserMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int add(ContainerUserInput input) {
		ContainerUser record = new ContainerUser();
		BeanUtils.copyProperties(input, record);
		record.setKey(lang.getLangRuleKeyByTable("prod_container_user"));
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setIsValid(PlatformConstants.ISVALID_YES);
		record.setCreateUser(getCurrentUserId());
		record.setCreateTime(new Date());
		return containerUserMapper.insertSelective(record);
	}

	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int delete(Integer id) {
		ContainerUser record = new ContainerUser();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return containerUserMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 根据用箱人key查询
	 * @param key
	 * @return
	 * @author fjy
	 */
	@Override
	public ContainerUserOutput getContainerUserByKey(String key) {
		ContainerUserOutput output = new ContainerUserOutput();
		ContainerUserExample example=new ContainerUserExample();
		example.createCriteria().andKeyEqualTo(key);
		List<ContainerUser> recordList = containerUserMapper.selectByExample(example);
		if(recordList!=null && recordList.size()>0) {
			ContainerUser record=recordList.get(0);
			BeanUtils.copyProperties(record, output);
			return output;
		}else {
			return null;
		}
		
		
	}


	/**
	 * 分页查询用箱人
	 * @param input
	 * @param searchWords
	 * @return
	 * @author zjd
	 */
	@Override
	public PagedList<ContainerUserOutput> containerUserPageList(PageInput input, String searchWords) {
		List<ContainerUserOutput> outputList = new ArrayList<ContainerUserOutput>();
		ContainerUserExample example = new ContainerUserExample();
		example.setOrderByClause("create_time DESC");
		ContainerUserExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (searchWords != null && !"".equals(searchWords)) {
			criteria.andContainerUserCodeLike("%"+searchWords.trim()+"%");
			ContainerUserExample.Criteria criteria2 = example.createCriteria();
			criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria2.andContainerUserNameLike("%"+searchWords.trim()+"");
			ContainerUserExample.Criteria criteria3 = example.createCriteria();
			criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria3.andContainerUserNameEnLike("%"+searchWords.trim()+"%");
			example.or(criteria2);
			example.or(criteria3);
		}
		Integer totalItemCount = (int)containerUserMapper.countByExample(example);
		PagedList<ContainerUserOutput> pagedList = new PagedList<ContainerUserOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ContainerUser> list = containerUserMapper.selectByExample(example);
		for (ContainerUser item : list) {
			ContainerUserOutput output = new ContainerUserOutput();
			BeanUtils.copyProperties(item, output);
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	*@Description: 设置有效性
	*@Param: [ids]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public int multiValid(Integer[] ids, int valid) {
		for(Integer id: ids){
			ContainerUser record = new ContainerUser();
			record.setProdContainerUserId(id);
			record.setIsValid(valid);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			containerUserMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

	/**
	*@Description: 批量删除
	*@Param: [ids]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public int multiDelete(Integer[] ids) {
		for(Integer id: ids){
			ContainerUser record = new ContainerUser();
			record.setProdContainerUserId(id);
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			containerUserMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

	
	/**
	 * 根据当前登录公司获取该公司用箱人
	 * @return
	 * @author zhangkai
	 */
	public List<SelectOutput> getContainerUsersByCurrentCompany() {
		// 用箱人
		// 用箱人与公司具有多对多关联关系
		List<SelectOutput> containerUserList = new ArrayList<SelectOutput>();
		String companyKey = getCurrentCompanyKey();
		CompanyUsecontExample cuExample = new CompanyUsecontExample();
		com.sanlly.production.entity.CompanyUsecontExample.Criteria cuCriteria = cuExample.createCriteria();
		cuCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		cuCriteria.andCompanyEqualTo(companyKey);
		List<CompanyUsecont> cuList = cuMapper.selectByExample(cuExample);
		if (cuList == null || cuList.size() == 0) {
			return containerUserList;
		} else {
			for (CompanyUsecont cu : cuList) {
				ContainerUserExample containerUserExample = new ContainerUserExample();
				com.sanlly.production.entity.ContainerUserExample.Criteria containerUserCriteria = containerUserExample
						.createCriteria();
				containerUserCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				containerUserCriteria.andKeyEqualTo(cu.getContainerUser());
				List<ContainerUser> containerUsers = containerUserMapper.selectByExample(containerUserExample);
				if (containerUsers == null || containerUsers.size() == 0) {
					continue;
				} else {
					for (ContainerUser item : containerUsers) {
						SelectOutput output = new SelectOutput();
						output.setValue(item.getKey());
						output.setLabel(item.getContainerUserCode());
						output.setLabelEn(item.getContainerUserCode());
						output.setExtend(item.getContainerUserCode());
						containerUserList.add(output);
					}
				}
			}
			return containerUserList;
		}
	}
	
	/**
	 * 根据公司获取该公司用箱人
	 * @return
	 * @author fjy 财务用
	 */
	public List<SelectOutput> getContainerUsersByCompany(String companyKey) {
		// 用箱人
		// 用箱人与公司具有多对多关联关系
		List<SelectOutput> containerUserList = new ArrayList<SelectOutput>();
		 
		CompanyUsecontExample cuExample = new CompanyUsecontExample();
		com.sanlly.production.entity.CompanyUsecontExample.Criteria cuCriteria = cuExample.createCriteria();
		cuCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		cuCriteria.andCompanyEqualTo(companyKey);
		List<CompanyUsecont> cuList = cuMapper.selectByExample(cuExample);
		if (cuList == null || cuList.size() == 0) {
			return containerUserList;
		} else {
			for (CompanyUsecont cu : cuList) {
				ContainerUserExample containerUserExample = new ContainerUserExample();
				com.sanlly.production.entity.ContainerUserExample.Criteria containerUserCriteria = containerUserExample
						.createCriteria();
				containerUserCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				containerUserCriteria.andKeyEqualTo(cu.getContainerUser());
				List<ContainerUser> containerUsers = containerUserMapper.selectByExample(containerUserExample);
				if (containerUsers == null || containerUsers.size() == 0) {
					continue;
				} else {
					for (ContainerUser item : containerUsers) {
						SelectOutput output = new SelectOutput();
						output.setValue(item.getKey());
						output.setLabel(item.getContainerUserCode());
						output.setLabelEn(item.getContainerUserCode());
						output.setExtend(item.getContainerUserCode());
						containerUserList.add(output);
					}
				}
			}
			return containerUserList;
		}
	}
}
