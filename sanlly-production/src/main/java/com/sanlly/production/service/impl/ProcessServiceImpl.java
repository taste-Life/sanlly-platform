package com.sanlly.production.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.dao.WfActiveProcessMapper;
import com.sanlly.production.entity.WfActiveProcess;
import com.sanlly.production.entity.WfActiveProcessExample;
import com.sanlly.production.models.input.ActiveProcessInput;
import com.sanlly.production.models.output.ActiveProcessOutPut;
import com.sanlly.production.service.ProcessService;

/**
 * 流程配置实现
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年7月31日  
*
 */
@Service
public class ProcessServiceImpl implements ProcessService{

	@Autowired
	private WfActiveProcessMapper wfProcessmenuDao;

	/**
	 * 流程配置查询列表
	 */
	@Override
	public PagedList<ActiveProcessOutPut> getProcessPagedList(ActiveProcessInput input) {

		WfActiveProcessExample example = new WfActiveProcessExample();
		WfActiveProcessExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (StringUtils.isNotEmpty(input.getProcessName())) {
			criteria.andProcessNameLike("%" + input.getProcessName() + "%");
		}
		//查询总条数
		int totalCount = (int) wfProcessmenuDao.countByExample(example);
		PagedList<ActiveProcessOutPut> pagedList = new PagedList<ActiveProcessOutPut>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<WfActiveProcess> processList = wfProcessmenuDao.selectByExample(example);
		List<ActiveProcessOutPut> processOutputList = processList.stream().map(a -> {
			ActiveProcessOutPut output = new ActiveProcessOutPut();
			//属性值复制赋值
			BeanUtils.copyProperties(a, output);
			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(processOutputList);
		return pagedList;
		
	}
	

	

}
