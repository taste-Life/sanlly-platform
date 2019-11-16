package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.dao.WareUnitMapper;
import com.sanlly.warehouse.entity.WareUnit;
import com.sanlly.warehouse.entity.WareUnitExample;
import com.sanlly.warehouse.models.input.unit.AddUnitInput;
import com.sanlly.warehouse.models.input.unit.EditUnitInput;
import com.sanlly.warehouse.models.output.unit.UnitOutput;
import com.sanlly.warehouse.service.WareUnitService;
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
 * ClassName: WareUnitServiceImpl
 * Description: 单位服务实现层
 * date: 2019/7/25 15:40
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareUnitServiceImpl extends BaseServiceImpl implements WareUnitService {

    @Autowired
    private WareUnitMapper wareUnitMapper;

    private String wareUnit = "ware_unit";

    /**
     * 单位列表查询
     * @return
     */
    @Override
    public List<UnitOutput> getUnitList() {
        //组装查询条件
        WareUnitExample example = new WareUnitExample();
        WareUnitExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time desc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andUnitNameIsNotNull();
        //组装返回数据
        List<WareUnit> wareUnits = wareUnitMapper.selectByExample(example);
        List<UnitOutput> unitOutputList = new ArrayList<>();
        for (WareUnit wareUnit : wareUnits) {
            UnitOutput output = new UnitOutput();
            BeanUtils.copyProperties(wareUnit,output);
            output.setKeyLangLang(wareUnit.getKey());
            unitOutputList.add(output);
        }
        return unitOutputList;
    }

    /**
     * 单位获取
     * @param input
     * @return
     */
    @Override
    public UnitOutput getUnit(EditUnitInput input) {
        //组装查询条件
        WareUnitExample example = new WareUnitExample();
        WareUnitExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getWareUnitId()!=null){
            criteria.andWareUnitIdEqualTo(input.getWareUnitId());
        }
        if(input.getKey()!=null && input.getKey()!=""){
            criteria.andKeyEqualTo(input.getKey());
        }
        //组装返回数据
        List<WareUnit> wareUnits = wareUnitMapper.selectByExample(example);
        WareUnit unit = wareUnits.get(0);
        UnitOutput output = new UnitOutput();
        BeanUtils.copyProperties(unit,output);
        output.setKeyLangLang(unit.getKey());

        return output;
    }

    /**
     * 新增单位
     * @param input
     */
    @Override
    @Transactional
    public void AddUnit(AddUnitInput input) {
        WareUnitExample example = new WareUnitExample();
        WareUnitExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andUnitNameEqualTo(input.getUnitName());
        List<WareUnit> wareUnits = wareUnitMapper.selectByExample(example);
        if(wareUnits.size() > 0){
            throw new RuntimeException("isExist");
        }
        Result<String> result = productionService.getKey(wareUnit);
        if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        WareUnit unit = new WareUnit();
        unit.setUnitName(input.getUnitName());
        unit.setUnitNameEn(input.getUnitNameEn());
        unit.setIsDel(PlatformConstants.ISDEL_NO);
        unit.setKey(result.getData());
        unit.setCreateUser(getCurrentUserId());
        unit.setCreateTime(new Date());

        wareUnitMapper.insert(unit);
    }

    /**
     * 修改单位
     * @param input
     */
    @Override
    @Transactional
    public void updateUnit(EditUnitInput input) {
        WareUnitExample example = new WareUnitExample();
        WareUnitExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andUnitNameEqualTo(input.getUnitName());
        List<WareUnit> wareUnits = wareUnitMapper.selectByExample(example);
        if(wareUnits.size() > 0){
            if(!wareUnits.get(0).getWareUnitId().equals(input.getWareUnitId())){
                throw new RuntimeException("isExist");
            }
        }
        WareUnit unit = new WareUnit();
        unit.setWareUnitId(input.getWareUnitId());
        unit.setUnitName(input.getUnitName());
        unit.setUnitNameEn(input.getUnitNameEn());
        unit.setUpdateTime(new Date());
        unit.setUpdateUser(getCurrentUserId());
        wareUnitMapper.updateByPrimaryKeySelective(unit);
    }

    /**
     * 根据ID批量删除单位
     * @param unitIds
     */
    @Override
    @Transactional
    public void deleteUnit(Integer[] unitIds) {
        WareUnitExample example = new WareUnitExample();
        example.createCriteria().andWareUnitIdIn(Arrays.asList(unitIds));
        WareUnit unit = new WareUnit();
        unit.setIsDel(PlatformConstants.ISDEL_YES);
        unit.setUpdateUser(getCurrentUserId());
        unit.setUpdateTime(new Date());
        wareUnitMapper.updateByExampleSelective(unit,example);
    }
}
