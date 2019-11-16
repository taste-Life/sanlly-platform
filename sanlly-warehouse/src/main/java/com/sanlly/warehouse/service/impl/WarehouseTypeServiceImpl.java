package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareWarehouseTypeMapper;
import com.sanlly.warehouse.entity.WareWarehouseType;
import com.sanlly.warehouse.entity.WareWarehouseTypeExample;
import com.sanlly.warehouse.entity.WareWarehouseTypeExample.Criteria;
import com.sanlly.warehouse.models.input.warehousetype.AddWarehouseTypeInput;
import com.sanlly.warehouse.models.input.warehousetype.EditWarehouseTypeInput;
import com.sanlly.warehouse.models.input.warehousetype.SearchWarehouseTypeInput;
import com.sanlly.warehouse.models.output.KeyOutput;
import com.sanlly.warehouse.models.output.warehousetype.WarehouseTypeOutput;
import com.sanlly.warehouse.service.WarehouseTypeService;

@Service
public class WarehouseTypeServiceImpl extends BaseServiceImpl implements WarehouseTypeService {

    @Autowired
    private WareWarehouseTypeMapper warehouseTypeDao;

    private String tableName = "ware_warehouse_type";

    /**
     * 添加仓库类型
     */
    @Override
    public void addWarehouseType(AddWarehouseTypeInput input) {

        Result<String> result = productionService.getKey(tableName);
        if (result == null || StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        WareWarehouseType wwt = new WareWarehouseType();
        BeanUtils.copyProperties(input, wwt);
        wwt.setKey(result.getData());
        wwt.setCreateUser(getCurrentUserId());
        wwt.setIsDel(PlatformConstants.ISDEL_NO);
        wwt.setCreateTime(new Date());
        warehouseTypeDao.insertSelective(wwt);

    }

    /**
     * 修改仓库类型
     */
    @Override
    public void editWarehouseType(EditWarehouseTypeInput input) {
        WareWarehouseType wwt = new WareWarehouseType();
        BeanUtils.copyProperties(input, wwt);
        wwt.setWareWarehouseTypeId(input.getWareWarehouseTypeId());
        wwt.setUpdateUser(getCurrentUserId());
        wwt.setUpdateTime(new Date());
        warehouseTypeDao.updateByPrimaryKeySelective(wwt);
    }

    /**
     * 删除仓库类型
     */
    @Override
    public void deleteWarehouseType(Integer[] ids) {
        WareWarehouseTypeExample example = new WareWarehouseTypeExample();
        Criteria criteria = example.createCriteria();
        criteria.andWareWarehouseTypeIdIn(Arrays.asList(ids));
        WareWarehouseType wwt = new WareWarehouseType();
        wwt.setIsDel(PlatformConstants.ISDEL_YES);
        warehouseTypeDao.updateByExampleSelective(wwt, example);
    }

    /**
     * 分页查询仓库类型
     */
    @Override
    public PagedList<WarehouseTypeOutput> getPageWarehouseType(SearchWarehouseTypeInput input) {

        // 查询总条数
        WareWarehouseTypeExample example = new WareWarehouseTypeExample();
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotEmpty(input.getKey())) {
            criteria.andKeyEqualTo(input.getKey());
        }
        Integer total = (int) warehouseTypeDao.countByExample(example);
        // 分页查询
        PagedList<WarehouseTypeOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());
        List<WareWarehouseType> wwts = warehouseTypeDao.selectByExample(example);
        // 封装结果并返回
        List<WarehouseTypeOutput> outputs = new ArrayList<>();
        wwts.stream().forEach(wwt -> {
            WarehouseTypeOutput wto = new WarehouseTypeOutput();
            BeanUtils.copyProperties(wwt, wto);
            wto.setCbsLangLang(wwt.getCbsWarehouseTypeName());
            wto.setKeyLangLang(wwt.getKey());
            outputs.add(wto);
        });
        page.getDataList().addAll(outputs);
        return page;

    }

    /**
     * 查询所有仓库类型
     */
    @Override
    public List<KeyOutput> getAllWarehouseType() {
        WareWarehouseTypeExample example = new WareWarehouseTypeExample();
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<WareWarehouseType> wwts = warehouseTypeDao.selectByExample(example);
        List<KeyOutput> outputs = new ArrayList<>();
        if (!CollectionUtils.isEmpty(wwts)) {
            wwts.stream().forEach(wwt -> {
                KeyOutput wtbo = new KeyOutput();
                wtbo.setKey(wwt.getKey());
                wtbo.setKeyLangLang(wwt.getKey());
                outputs.add(wtbo);
            });
        }
        return outputs;
    }

    /**
     * 获取cbs仓库类型
     *
     * @param warehouseTypeKey
     */
    @Override
    public String getCBSType(String warehouseTypeKey) {
        WareWarehouseTypeExample example = new WareWarehouseTypeExample();
        example.createCriteria().andKeyEqualTo(warehouseTypeKey);

        List<WareWarehouseType> warehouseTypes = warehouseTypeDao.selectByExample(example);

        return warehouseTypes.stream().findFirst().orElseGet(null).getCbsWarehouseTypeName();
    }

    /**
     * 查询所有仓库类型
     *
     * @param input
     */
    @Override
    public List<WarehouseTypeOutput> getAllWarehouseType(SearchWarehouseTypeInput input) {
        WareWarehouseTypeExample example = new WareWarehouseTypeExample();
        Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(input.getCbs())){
            criteria.andCbsWarehouseTypeNameEqualTo(input.getCbs());
        }
        return warehouseTypeDao.selectByExample(example).stream().map(w -> {
            WarehouseTypeOutput output=new WarehouseTypeOutput();
            BeanUtils.copyProperties(w,output);
            output.setKey(w.getKey());
            output.setKeyLangLang(w.getKey());
            return output;
        }).collect(Collectors.toList());
    }
}
