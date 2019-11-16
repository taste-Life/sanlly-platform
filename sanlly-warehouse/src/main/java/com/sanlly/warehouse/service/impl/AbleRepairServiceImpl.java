package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.AbleRepairMapper;
import com.sanlly.warehouse.entity.AbleRepair;
import com.sanlly.warehouse.entity.AbleRepairExample;
import com.sanlly.warehouse.models.input.ablerepair.AbleRepairInput;
import com.sanlly.warehouse.models.input.ablerepair.SearchAbleRepairInput;
import com.sanlly.warehouse.models.output.ablerepair.AbleRepairOutput;
import com.sanlly.warehouse.service.AbleRepairService;
import com.sanlly.warehouse.service.WareSparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lishzh
 */
@Service
public class AbleRepairServiceImpl extends BaseServiceImpl implements AbleRepairService {

    @Autowired
    private AbleRepairMapper ableRepairDao;

    @Autowired
    private WareSparePartsService sparePartsService;

    /**
     * 添加可维修件
     *
     * @author lishzh
     */
    @Override
    @Transactional
    public void addAbleRepair(List<AbleRepairInput> inputs) {
        AbleRepairExample example = new AbleRepairExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
                .andSparePartsIn(inputs.stream().map(i -> i.getSpareParts()).collect(Collectors.toList()));
        if (ableRepairDao.selectByExample(example).isEmpty()) {
            inputs.forEach(input -> {
                AbleRepair ar = new AbleRepair();
                ar.setSpareParts(input.getSpareParts());
                ar.setSparePartsNo(input.getSparePartsNo());
                ar.setIsValid(CommonEnum.YES.getCode());
                ar.setIsDel(PlatformConstants.ISDEL_NO);
                ar.setCreateTime(new Date());
                ar.setUpdateUser(getCurrentUserId());
                ableRepairDao.insertSelective(ar);
            });

        } else {
            throw new RuntimeException("added");
        }
    }

    /**
     * 设置有效
     *
     * @author lishzh
     */
    @Override
    public void setValid(List<Integer> ids) {
        ids.forEach(id -> {
            AbleRepair ar = new AbleRepair();
            ar.setWareAbleRepairId(id);
            ar.setIsValid(CommonEnum.YES.getCode());
            ableRepairDao.updateByPrimaryKeySelective(ar);
        });
    }

    /**
     * 设置无效
     *
     * @author lishzh
     */
    @Override
    public void setInvalid(List<Integer> ids) {
        ids.forEach(id -> {
            AbleRepair ar = new AbleRepair();
            ar.setWareAbleRepairId(id);
            ar.setIsValid(CommonEnum.NO.getCode());
            ableRepairDao.updateByPrimaryKeySelective(ar);
        });
    }

    /**
     * 编辑可维修件
     *
     * @author lishzh
     */
    @Override
    public void editAbleRepair(AbleRepairInput input) {
        AbleRepair ar = new AbleRepair();
        ar.setWareAbleRepairId(input.getWareAbleRepairId());
        ar.setSpareParts(input.getSpareParts());
        ar.setSparePartsNo(input.getSparePartsNo());
        ar.setIsValid(input.getIsValid());
        ar.setUpdateTime(new Date());
        ar.setUpdateUser(getCurrentUserId());
        ableRepairDao.updateByPrimaryKeySelective(ar);
    }

    /**
     * 获取所有可维修备件
     *
     * @author lishzh
     */
    @Override
    public List<AbleRepairOutput> getAllAbleRepairs() {
        AbleRepairExample example = new AbleRepairExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        return ableRepairDao.selectByExample(example).stream().map(ar -> {
            AbleRepairOutput output = new AbleRepairOutput();
            output.setWareAbleRepairId(ar.getWareAbleRepairId());
            output.setSpareParts(ar.getSpareParts());
            output.setSparePartsLangLang(ar.getSpareParts());
            output.setSparePartsNo(ar.getSparePartsNo());
            output.setIsValid(ar.getIsValid());
            return output;
        }).collect(Collectors.toList());
    }

    /**
     * 获取可维修备件
     *
     * @param input
     * @author lishzh
     */
    @Override
    public List<AbleRepairOutput> getAbleRepairs(SearchAbleRepairInput input) {
        AbleRepairExample example = new AbleRepairExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(CommonEnum.YES.getCode());
        List<AbleRepairOutput> outputs = new ArrayList<>();
        ableRepairDao.selectByExample(example).forEach(ar -> {
            if (sparePartsService.getSparePart(ar.getSpareParts(), null).getSparePartsName().contains(input.getName())) {
                AbleRepairOutput output = new AbleRepairOutput();
                output.setWareAbleRepairId(ar.getWareAbleRepairId());
                output.setSpareParts(ar.getSpareParts());
                output.setSparePartsLangLang(ar.getSpareParts());
                output.setSparePartsNo(ar.getSparePartsNo());
                outputs.add(output);
            }
        });

        return outputs;
    }

    /**
     * 获取可维修备件
     *
     * @author lishzh
     */
    @Override
    public List<AbleRepairOutput> getAbleRepairs() {
        AbleRepairExample example = new AbleRepairExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(CommonEnum.YES.getCode());
        List<AbleRepairOutput> outputs = new ArrayList<>();
        ableRepairDao.selectByExample(example).forEach(ar -> {
            AbleRepairOutput output = new AbleRepairOutput();
            output.setWareAbleRepairId(ar.getWareAbleRepairId());
            output.setSpareParts(ar.getSpareParts());
            output.setSparePartsLangLang(ar.getSpareParts());
            output.setSparePartsNo(ar.getSparePartsNo());
            outputs.add(output);
        });

        return outputs;
    }

    /**
     * 删除
     *
     * @author lishzh
     */
    @Override
    public void deleteAbleRepair(List<Integer> ids) {
        ids.forEach(id -> {
            AbleRepair ar = new AbleRepair();
            ar.setWareAbleRepairId(id);
            ar.setIsDel(PlatformConstants.ISDEL_YES);
            ableRepairDao.updateByPrimaryKeySelective(ar);
        });

    }

    /**
     * 获取可维修件列表
     *
     * @author lishzh
     */
    @Override
    public PagedList<AbleRepairOutput> getAbleRepairs(PageInput input) {
        return null;
    }
}
