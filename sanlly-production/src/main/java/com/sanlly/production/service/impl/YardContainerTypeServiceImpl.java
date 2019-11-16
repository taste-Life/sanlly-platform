package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.YardContainerTypeMapper;
import com.sanlly.production.entity.YardContainerType;
import com.sanlly.production.entity.YardContainerTypeExample;
import com.sanlly.production.models.input.yardcontainertype.YardContainerTypeInputAdd;
import com.sanlly.production.models.input.yardcontainertype.YardContainerTypeInputUpdate;
import com.sanlly.production.models.output.yardcontainertype.YardContainerTypeOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.YardContainerTypeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/5
 * @description
 */
@Service
public class YardContainerTypeServiceImpl extends BaseServiceImpl implements YardContainerTypeService {

    @Autowired
    private YardContainerTypeMapper yardContainerTypeMapper;
    @Autowired
    private LangService langService;

    /**
     * @param yardContainerTypeInputAdd
     * @author zhq
     * @date 2019/11/5
     * @description 新增好坏箱类型
     */
    @Override
    public int addYardContainerType(YardContainerTypeInputAdd yardContainerTypeInputAdd) {
        YardContainerType yardContainerType = new YardContainerType();
        BeanUtils.copyProperties(yardContainerTypeInputAdd, yardContainerType);
        yardContainerType.setKey(langService.getLangRuleKeyByTable("prod_yard_container_type"));
        yardContainerType.setCreateTime(new Date());
        yardContainerType.setCreateUser(super.getCurrentUserId());
        yardContainerType.setIsDel(PlatformConstants.ISDEL_NO);
        yardContainerType.setIsValid(PlatformConstants.ISVALID_YES);
        return yardContainerTypeMapper.insertSelective(yardContainerType);
    }

    /**
     * @param yardContainerTypeInputUpdate
     * @author zhq
     * @date 2019/11/5
     * @description 修改好坏箱类型
     */
    @Override
    public int updateYardContainerType(YardContainerTypeInputUpdate yardContainerTypeInputUpdate) {
        YardContainerType yardContainerType = new YardContainerType();
        BeanUtils.copyProperties(yardContainerTypeInputUpdate, yardContainerType);
        yardContainerType.setUpdateTime(new Date());
        yardContainerType.setUpdateUser(super.getCurrentUserId());
        return yardContainerTypeMapper.updateByPrimaryKeySelective(yardContainerType);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/5
     * @description 删除好坏箱类型
     */
    @Override
    public int deleteYardContainerType(Integer[] ids) {
        YardContainerTypeExample yardContainerTypeExample = new YardContainerTypeExample();
        yardContainerTypeExample.createCriteria().andProdYardContainerTypeIdIn(Arrays.asList(ids));
        YardContainerType yardContainerType = new YardContainerType();
        yardContainerType.setIsDel(PlatformConstants.ISDEL_YES);
        return yardContainerTypeMapper.updateByExampleSelective(yardContainerType, yardContainerTypeExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/5
     * @description 设置有效
     */
    @Override
    public int validateYardContainerType(Integer[] ids, Integer valid) {
        YardContainerTypeExample yardContainerTypeExample = new YardContainerTypeExample();
        yardContainerTypeExample.createCriteria().andProdYardContainerTypeIdIn(Arrays.asList(ids));
        YardContainerType yardContainerType = new YardContainerType();
        yardContainerType.setIsValid(valid);
        return yardContainerTypeMapper.updateByExampleSelective(yardContainerType, yardContainerTypeExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/5
     * @description 分页查询
     */
    @Override
    public PagedList<YardContainerTypeOutput> getYardContainerTypeList(Integer index, Integer size, String searchWords) {
        YardContainerTypeExample yardContainerTypeExample = new YardContainerTypeExample();
        YardContainerTypeExample.Criteria criteria = yardContainerTypeExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andCourseTypeNameLike(bySearchWords);
        }
        int totalNums = (int) yardContainerTypeMapper.countByExample(yardContainerTypeExample);
        PagedList<YardContainerTypeOutput> pagedList = new PagedList<>(index, size, totalNums);
        yardContainerTypeExample.setOrderByClause("create_time desc");
        yardContainerTypeExample.setLimitStart(pagedList.getLimitStart());
        yardContainerTypeExample.setLimitEnd(pagedList.getLimitEnd());
        List<YardContainerType> yardContainerTypeList = yardContainerTypeMapper.selectByExample(yardContainerTypeExample);
        List<YardContainerTypeOutput> yardContainerTypeOutputList = yardContainerTypeList.stream().map(yardContainerType -> {
            YardContainerTypeOutput yardContainerTypeOutput = new YardContainerTypeOutput();
            BeanUtils.copyProperties(yardContainerType, yardContainerTypeOutput);
            yardContainerTypeOutput.setYardNameLang(yardContainerType.getYard());
            yardContainerTypeOutput.setContainerConditionNameLang(yardContainerType.getContainerCondition());
            return yardContainerTypeOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(yardContainerTypeOutputList);
        return pagedList;
    }
}
