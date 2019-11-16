package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.PtiTypeMapper;
import com.sanlly.production.entity.PtiType;
import com.sanlly.production.entity.PtiTypeExample;
import com.sanlly.production.models.input.ptitype.PtiTypeInputAdd;
import com.sanlly.production.models.input.ptitype.PtiTypeInputUpdate;
import com.sanlly.production.models.output.pti.PtiTypeDetailOutpput;
import com.sanlly.production.models.output.ptitype.PtiTypeOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.PtiTypeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * pti类型
 * @author RexSheng
 * 2019年8月17日 下午1:47:46
 */
@Service
public class PtiTypeServiceImpl extends BaseServiceImpl implements PtiTypeService{

	@Autowired
    private PtiTypeMapper ptiTypeMapper;

    @Autowired
    private LangService langService;
	
	/**
	 * 获取所有pti类型
	 */
	@Override
	public List<PtiTypeDetailOutpput> getList() {
		PtiTypeExample example=new PtiTypeExample();
		PtiTypeExample.Criteria criteria=example.createCriteria();
		if(StringUtils.isNotEmpty(getCurrentYardKey())) {
			//所属公司
			criteria.andCompanyEqualTo(getCurrentCompanyKey());
		}
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<PtiType> list = ptiTypeMapper.selectByExample(example);
		return list.stream().map(a->{
			PtiTypeDetailOutpput item=new PtiTypeDetailOutpput();
			item.setKey(a.getKey());
			item.setPtiTypeLang(a.getKey());
			return item;
		}).collect(Collectors.toList());
	}

    /**
     * @param ptiTypeInputAdd
     * @author zhq
     * @date 2019/11/7
     * @description 新增pti类型
     */
    @Override
    public int addPtiType(PtiTypeInputAdd ptiTypeInputAdd) {
        PtiType ptiType = new PtiType();
        BeanUtils.copyProperties(ptiTypeInputAdd, ptiType);
        ptiType.setKey(langService.getLangRuleKeyByTable("prod_pti_type"));
        ptiType.setCreateTime(new Date());
        ptiType.setCreateUser(super.getCurrentUserId());
        ptiType.setIsDel(PlatformConstants.ISDEL_NO);
        ptiType.setIsValid(PlatformConstants.ISVALID_YES);
        return ptiTypeMapper.insertSelective(ptiType);
    }

    /**
     * @param ptiTypeInputUpdate
     * @author zhq
     * @date 2019/11/7
     * @description 修改pti类型
     */
    @Override
    public int updatePtiType(PtiTypeInputUpdate ptiTypeInputUpdate) {
        PtiType ptiType = new PtiType();
        BeanUtils.copyProperties(ptiTypeInputUpdate, ptiType);
        ptiType.setUpdateTime(new Date());
        ptiType.setUpdateUser(super.getCurrentUserId());
        return ptiTypeMapper.updateByPrimaryKeySelective(ptiType);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/7
     * @description 删除pti类型
     */
    @Override
    public int deletePtiType(Integer[] ids) {
        PtiTypeExample ptiTypeExample = new PtiTypeExample();
        ptiTypeExample.createCriteria().andProdPtiTypeIdIn(Arrays.asList(ids));
        PtiType ptiType = new PtiType();
        ptiType.setIsDel(PlatformConstants.ISDEL_YES);
        return ptiTypeMapper.updateByExampleSelective(ptiType, ptiTypeExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    @Override
    public int validatePtiType(Integer[] ids, Integer valid) {
        PtiTypeExample ptiTypeExample = new PtiTypeExample();
        ptiTypeExample.createCriteria().andProdPtiTypeIdIn(Arrays.asList(ids));
        PtiType ptiType = new PtiType();
        ptiType.setIsValid(valid);
        return ptiTypeMapper.updateByExampleSelective(ptiType, ptiTypeExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/7
     * @description 分页查询
     */
    @Override
    public PagedList<PtiTypeOutput> getPtiTypeList(Integer index, Integer size, String searchWords) {
        PtiTypeExample ptiTypeExample = new PtiTypeExample();
        PtiTypeExample.Criteria criteria = ptiTypeExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andPtiTypeNameLike(bySearchWords);
        }
        int totalNums = (int) ptiTypeMapper.countByExample(ptiTypeExample);
        PagedList<PtiTypeOutput> pagedList = new PagedList<>(index, size, totalNums);
        ptiTypeExample.setOrderByClause("create_time desc");
        ptiTypeExample.setLimitStart(pagedList.getLimitStart());
        ptiTypeExample.setLimitEnd(pagedList.getLimitEnd());
        List<PtiType> ptiTypeList = ptiTypeMapper.selectByExample(ptiTypeExample);
        List<PtiTypeOutput> ptiTypeOutputList = ptiTypeList.stream().map(ptiType -> {
            PtiTypeOutput ptiTypeOutput = new PtiTypeOutput();
            BeanUtils.copyProperties(ptiType, ptiTypeOutput);
            ptiTypeOutput.setCompanyNameLang(ptiType.getCompany());
            return ptiTypeOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(ptiTypeOutputList);
        return pagedList;
    }
}
