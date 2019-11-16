package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.BasicFieldMapper;
import com.sanlly.production.entity.BasicField;
import com.sanlly.production.entity.BasicFieldExample;
import com.sanlly.production.models.output.basicfield.BasicFieldOutput;
import com.sanlly.production.service.BasicFieldService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
@Service
public class BasicFieldServiceImpl extends BaseServiceImpl implements BasicFieldService {

    @Autowired
    private BasicFieldMapper basicFieldMapper;

    /**
     * @author zhq
     * @date 2019/11/6
     * @description 获取全部自定义字段
     */
    @Override
    public List<BasicFieldOutput> getBasicField() {
        BasicFieldExample basicFieldExample = new BasicFieldExample();
        basicFieldExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<BasicField> basicFieldList = basicFieldMapper.selectByExample(basicFieldExample);
        return basicFieldList.stream().map(basicField -> {
            BasicFieldOutput basicFieldOutput = new BasicFieldOutput();
            BeanUtils.copyProperties(basicField, basicFieldOutput);
            basicFieldOutput.setFieldCodeNameLang(basicField.getFieldCode());
            return basicFieldOutput;
        }).collect(Collectors.toList());
    }
}
