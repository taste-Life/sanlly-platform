package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.*;
import com.sanlly.production.entity.*;
import com.sanlly.production.models.input.unit.UnitRepairEntryInput;
import com.sanlly.production.models.output.unit.UnitRepairEntryOutput;
import com.sanlly.production.service.UnitRepairEntryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UnitRepairEntryServiceImpl extends BaseServiceImpl implements UnitRepairEntryService {

    @Autowired
    private UnitRepairEntryMapper unitRepairEntryMapper;

    @Autowired
    private UnitRepairMapper unitRepairMapper;

    @Autowired
    private PartsTypeMapper partsTypeMapper;

    @Autowired
    private RateMapper rateMapper;

    @Autowired
    private DamageMapper damageMapper;

    @Autowired
    private RepairMapper repairMapper;


    @Override
    public int update(UnitRepairEntryInput input) {
        UnitRepairEntry record = new UnitRepairEntry();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return unitRepairEntryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(UnitRepairEntryInput input) {
        UnitRepairEntry record = new UnitRepairEntry();
        BeanUtils.copyProperties(input, record);
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return unitRepairEntryMapper.insertSelective(record);
    }

    @Override
    public PagedList<UnitRepairEntryOutput> pageList(PageInput input, String searchWords) {
        //查询机组相关修理
        UnitRepairExample unitRepairExample = new UnitRepairExample();
        UnitRepairExample.Criteria unitRepairExampleCriteria = unitRepairExample.createCriteria();
        unitRepairExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        unitRepairExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<UnitRepair> unitRepairs = unitRepairMapper.selectByExample(unitRepairExample);
        //查询部件大类
        PartsTypeExample partsTypeExample = new PartsTypeExample();
        PartsTypeExample.Criteria partsTypeExampleCriteria = partsTypeExample.createCriteria();
        partsTypeExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        partsTypeExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<PartsType> partsTypes = partsTypeMapper.selectByExample(partsTypeExample);
        //查询部件明细
        RateExample rateExample = new RateExample();
        RateExample.Criteria rateExampleCriteria = rateExample.createCriteria();
        rateExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<Rate> rates = rateMapper.selectByExample(rateExample);
        //过滤部件明细重复值
        List<Rate> filterRates = new ArrayList<>();
        for (Rate rate : rates) {
            boolean flag = true;
            if (rate.getPartsDetailsName() != null) {
                for (Rate filterRate : filterRates) {
                    if (filterRate.getPartsDetailsName().equals(rate.getPartsDetailsName())) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    filterRates.add(rate);
                }
            }

        }
        //查询损坏代码
        DamageExample damageExample = new DamageExample();
        DamageExample.Criteria damageExampleCriteria = damageExample.createCriteria();
        damageExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        damageExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<Damage> damages = damageMapper.selectByExample(damageExample);
        //查询修理代码
        RepairExample repairExample = new RepairExample();
        RepairExample.Criteria repairExampleCriteria = repairExample.createCriteria();
        repairExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        repairExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<Repair> repairs = repairMapper.selectByExample(repairExample);


        List<UnitRepairEntryOutput> outputList = new ArrayList<UnitRepairEntryOutput>();
        UnitRepairEntryExample example = new UnitRepairEntryExample();
        example.setOrderByClause("create_time DESC");
        UnitRepairEntryExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {


        }
        Integer totalItemCount = (int) unitRepairEntryMapper.countByExample(example);
        PagedList<UnitRepairEntryOutput> pagedList = new PagedList<UnitRepairEntryOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<UnitRepairEntry> list = unitRepairEntryMapper.selectByExample(example);
        for (UnitRepairEntry item : list) {
            UnitRepairEntryOutput output = new UnitRepairEntryOutput();
            BeanUtils.copyProperties(item, output);
            List<UnitRepair> unitRepairList = unitRepairs.stream().filter(unitRepair -> item.getUnitRepair().equals(unitRepair.getProdUnitRepairId())).collect(Collectors.toList());
            if (unitRepairList != null && unitRepairList.size() > 0) { //机组主项目名称
                output.setUnitRepair(unitRepairList.get(0).getRepairName());
            }
            List<PartsType> partsTypeList = partsTypes.stream().filter(partsType -> partsType.getPartsTypeCode().equals(item.getPartsTypeCode())).collect(Collectors.toList());
            if (partsTypeList != null && partsTypeList.size() > 0) { //部件大类
                output.setPartsTypeCode(partsTypeList.get(0).getPartsTypeName());
            }
            List<Rate> rateList = filterRates.stream().filter(rate -> rate.getPartsDetails().equals(item.getPartsDetailsCode())).collect(Collectors.toList());
            if (rateList != null && rateList.size() > 0) { //部件明细
                output.setPartsDetailsCode(rateList.get(0).getPartsDetailsName());
            }
            List<Damage> damageList = damages.stream().filter(damage -> damage.getDamageCode().equals(item.getDamageCode())).collect(Collectors.toList());
            if (damageList != null && damageList.size() > 0) {//损坏代码
                output.setDamageCode(damageList.get(0).getDamageName());
            }
            List<Repair> repairList = repairs.stream().filter(repair -> repair.getRepairCode().equals(item.getRepairCode())).collect(Collectors.toList());
            if (repairList != null && repairList.size() > 0) { //修理代码
                output.setRepairCode(repairList.get(0).getRepairName());
            }
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            UnitRepairEntry record = new UnitRepairEntry();
            record.setProdUnitRepairEntryId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            unitRepairEntryMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            UnitRepairEntry record = new UnitRepairEntry();
            record.setProdUnitRepairEntryId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            unitRepairEntryMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public Map<String, Object> selectList() {
        Map<String, Object> resultMap = new HashMap<>();
        //查询机组相关修理
        UnitRepairExample unitRepairExample = new UnitRepairExample();
        UnitRepairExample.Criteria unitRepairExampleCriteria = unitRepairExample.createCriteria();
        unitRepairExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        unitRepairExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<UnitRepair> unitRepairs = unitRepairMapper.selectByExample(unitRepairExample);
        //查询部件大类
        PartsTypeExample partsTypeExample = new PartsTypeExample();
        PartsTypeExample.Criteria partsTypeExampleCriteria = partsTypeExample.createCriteria();
        partsTypeExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        partsTypeExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<PartsType> partsTypes = partsTypeMapper.selectByExample(partsTypeExample);
        //查询部件明细
        RateExample rateExample = new RateExample();
        RateExample.Criteria rateExampleCriteria = rateExample.createCriteria();
        rateExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<Rate> rates = rateMapper.selectByExample(rateExample);
        //过滤部件明细重复值
        List<Rate> filterRates = new ArrayList<>();
        for (Rate rate : rates) {
            boolean flag = true;
            if (rate.getPartsDetailsName() != null) {
                for (Rate filterRate : filterRates) {
                    if (filterRate.getPartsDetailsName().equals(rate.getPartsDetailsName())) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    filterRates.add(rate);
                }
            }

        }
        //查询损坏代码
        DamageExample damageExample = new DamageExample();
        DamageExample.Criteria damageExampleCriteria = damageExample.createCriteria();
        damageExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        damageExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<Damage> damages = damageMapper.selectByExample(damageExample);
        //查询修理代码
        RepairExample repairExample = new RepairExample();
        RepairExample.Criteria repairExampleCriteria = repairExample.createCriteria();
        repairExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        repairExampleCriteria.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        List<Repair> repairs = repairMapper.selectByExample(repairExample);

        resultMap.put("unitRepairList", unitRepairs);
        resultMap.put("partsTypeList", partsTypes);
        resultMap.put("rateList", filterRates);
        resultMap.put("damageList", damages);
        resultMap.put("repairList", repairs);
        return resultMap;
    }
}
