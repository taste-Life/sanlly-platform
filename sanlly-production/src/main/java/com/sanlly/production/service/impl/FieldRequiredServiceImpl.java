package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.FieldRequiredMapper;
import com.sanlly.production.entity.FieldRequired;
import com.sanlly.production.entity.FieldRequiredExample;
import com.sanlly.production.models.input.fieldrequired.FieldRequiredInputAdd;
import com.sanlly.production.models.input.fieldrequired.FieldRequiredInputUpdate;
import com.sanlly.production.models.output.fieldrequired.FieldRequiredOutput;
import com.sanlly.production.service.FieldRequiredService;
import com.sanlly.production.service.LangService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
@Service
public class FieldRequiredServiceImpl extends BaseServiceImpl implements FieldRequiredService {

    @Autowired
    private FieldRequiredMapper fieldRequiredMapper;
    @Autowired
    private LangService langService;

    /**
     * @param fieldRequiredInputAdd
     * @author zhq
     * @date 2019/11/6
     * @description 新增场站必填字段
     */
    @Override
    public int addFieldRequired(FieldRequiredInputAdd fieldRequiredInputAdd) {
        FieldRequired fieldRequired = new FieldRequired();
        BeanUtils.copyProperties(fieldRequiredInputAdd, fieldRequired);
        fieldRequired.setCreateTime(new Date());
        fieldRequired.setCreateUser(super.getCurrentUserId());
        fieldRequired.setIsValid(PlatformConstants.ISVALID_YES);
        fieldRequired.setIsDel(PlatformConstants.ISDEL_NO);
        return fieldRequiredMapper.insertSelective(fieldRequired);
    }

    /**
     * @param fieldRequiredInputUpdate
     * @author zhq
     * @date 2019/11/6
     * @description 修改场站必填字段
     */
    @Override
    public int updateFieldRequired(FieldRequiredInputUpdate fieldRequiredInputUpdate) {
        FieldRequired fieldRequired = new FieldRequired();
        BeanUtils.copyProperties(fieldRequiredInputUpdate, fieldRequired);
        fieldRequired.setUpdateTime(new Date());
        fieldRequired.setUpdateUser(super.getCurrentUserId());
        return fieldRequiredMapper.updateByPrimaryKeySelective(fieldRequired);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/6
     * @description 删除场站必填字段
     */
    @Override
    public int deleteFieldRequired(Integer[] ids) {
        FieldRequiredExample fieldRequiredExample = new FieldRequiredExample();
        fieldRequiredExample.createCriteria().andProdFieldRequiredIdIn(Arrays.asList(ids));
        FieldRequired fieldRequired = new FieldRequired();
        fieldRequired.setIsDel(PlatformConstants.ISDEL_YES);
        return fieldRequiredMapper.updateByExampleSelective(fieldRequired, fieldRequiredExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/6
     * @description 设置有效
     */
    @Override
    public int validateFieldRequiredZ(Integer[] ids, Integer valid) {
        FieldRequiredExample fieldRequiredExample = new FieldRequiredExample();
        fieldRequiredExample.createCriteria().andProdFieldRequiredIdIn(Arrays.asList(ids));
        FieldRequired fieldRequired = new FieldRequired();
        fieldRequired.setIsValid(valid);
        return fieldRequiredMapper.updateByExampleSelective(fieldRequired, fieldRequiredExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/6
     * @description 分页查询
     */
    @Override
    public PagedList<FieldRequiredOutput> getFieldRequiredList(Integer index, Integer size, String searchWords) {
        FieldRequiredExample fieldRequiredExample = new FieldRequiredExample();
        fieldRequiredExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) fieldRequiredMapper.countByExample(fieldRequiredExample);
        PagedList<FieldRequiredOutput> pagedList = new PagedList<>(index, size, totalNums);
        fieldRequiredExample.setOrderByClause("create_time desc");
        fieldRequiredExample.setLimitStart(pagedList.getLimitStart());
        fieldRequiredExample.setLimitEnd(pagedList.getLimitEnd());
        List<FieldRequired> fieldRequiredList = fieldRequiredMapper.selectByExample(fieldRequiredExample);
        List<FieldRequiredOutput> fieldRequiredOutputList = fieldRequiredList.stream().map(fieldRequired -> {
            FieldRequiredOutput fieldRequiredOutput = new FieldRequiredOutput();
            BeanUtils.copyProperties(fieldRequired, fieldRequiredOutput);
            fieldRequiredOutput.setCompanyNameLang(fieldRequired.getCompany());
            fieldRequiredOutput.setYardNameLang(fieldRequired.getYard());
            fieldRequiredOutput.setFieldNameLang(fieldRequired.getField());
            return fieldRequiredOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(fieldRequiredOutputList);
        return pagedList;
    }
}
