package com.sanlly.warehouse.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.dao.WareCBSWarehouseTypeMapper;
import com.sanlly.warehouse.entity.WareCBSWarehouseType;
import com.sanlly.warehouse.entity.WareCBSWarehouseTypeExample;
import com.sanlly.warehouse.models.input.cbstype.AddCBSTypeInput;
import com.sanlly.warehouse.models.input.cbstype.EditCBSTypeInput;
import com.sanlly.warehouse.models.output.cbstype.CBSTypeOutput;
import com.sanlly.warehouse.service.WareCBSWarehouseTypeService;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Description: TODO
 * @ClassName: WareBorrowUnitServiceImpl
 * @Date: 2019/10/10 17:20
 * @Version 1.0
 * @Author mqz
 */
@Service
public class WareCBSWarehouseTypeServiceImpl extends BaseServiceImpl implements WareCBSWarehouseTypeService {
    @Autowired
    ProductionFeignClient productionFeignClient;
    private static String tableName = "ware_cbs_warehouse_type";
    @Autowired
    WareCBSWarehouseTypeMapper wareCBSWarehouseTypeMapper;

    /**
     * 添加CBS仓储类型
     *
     * @param addCBSTypeInput
     */
    @Override
    @Transactional
    public void addCBSType(AddCBSTypeInput addCBSTypeInput) {

        Result<String> result = productionFeignClient.getKey(tableName);
        System.out.println(result.getData());
        if (StringUtils.isBlank(result.getData())) {
            return;
        }
        Date date = new Date();
        WareCBSWarehouseType wareCBSWarehouseType = new WareCBSWarehouseType();
        System.out.println(addCBSTypeInput.getCbsWarehouseTypeName());
        BeanUtils.copyProperties(addCBSTypeInput, wareCBSWarehouseType);
        wareCBSWarehouseType.setKey(result.getData());
        wareCBSWarehouseType.setCreateTime(date);
        wareCBSWarehouseType.setCreateUser(getCurrentUserId());
        wareCBSWarehouseType.setIsDel(CommonEnum.NO.getCode());
        wareCBSWarehouseTypeMapper.insertSelective(wareCBSWarehouseType);

    }
    /**
     * 修改CBS仓储类型
     *
     * @param editCBSTypeInput
     */
    @Override
    @Transactional
    public void editCBSType(EditCBSTypeInput editCBSTypeInput) {
        WareCBSWarehouseType wareCBSWarehouseType = new WareCBSWarehouseType();
        BeanUtils.copyProperties(editCBSTypeInput, wareCBSWarehouseType);
        Date date = new Date();
        wareCBSWarehouseType.setUpdateTime(date);
        wareCBSWarehouseType.setUpdateUser(getCurrentUserId());
        wareCBSWarehouseTypeMapper.updateByPrimaryKeySelective(wareCBSWarehouseType);

    }

    @Override
    public List<CBSTypeOutput> getCBSType() {
        WareCBSWarehouseTypeExample wareCBSWarehouseTypeExample = new WareCBSWarehouseTypeExample();
        wareCBSWarehouseTypeExample.createCriteria().andIsDelEqualTo(CommonEnum.NO.getCode());
        List<WareCBSWarehouseType> wareCBSWarehouseTypes = wareCBSWarehouseTypeMapper.selectByExample(wareCBSWarehouseTypeExample);
        List<CBSTypeOutput> cbsTypeOutputs = new ArrayList<>();

        for (WareCBSWarehouseType wareCBSWarehouseType : wareCBSWarehouseTypes) {
            CBSTypeOutput cbsTypeOutput = new CBSTypeOutput();
            BeanUtils.copyProperties(wareCBSWarehouseType, cbsTypeOutput);
            cbsTypeOutput.setCbsWarehouseTypeLangLang(cbsTypeOutput.getKey());
            cbsTypeOutputs.add(cbsTypeOutput);
        }
        return cbsTypeOutputs;
    }
    @Override
    @Transactional
    public void deleteCBSType(Integer[] purcCBSTypeIds) {
        WareCBSWarehouseTypeExample wareCBSWarehouseTypeExample = new WareCBSWarehouseTypeExample();
        wareCBSWarehouseTypeExample.createCriteria().andWareCbsWarehouseTypeIdIn(Arrays.asList(purcCBSTypeIds));
        WareCBSWarehouseType wareCBSWarehouseType = new WareCBSWarehouseType();
        wareCBSWarehouseType.setIsDel(CommonEnum.YES.getCode());
        wareCBSWarehouseTypeMapper.updateByExampleSelective(wareCBSWarehouseType, wareCBSWarehouseTypeExample);

    }
}
