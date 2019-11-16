package com.sanlly.warehouse.service.impl;

import com.netflix.discovery.converters.Auto;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.CompressorMaterialMapper;
import com.sanlly.warehouse.entity.CompressorMaterial;
import com.sanlly.warehouse.entity.CompressorMaterialExample;
import com.sanlly.warehouse.models.input.compressormaterial.CompressorMaterialInput;
import com.sanlly.warehouse.models.input.compressormaterial.SearchCompressorMaterialInput;
import com.sanlly.warehouse.models.output.compressormaterial.CompressorMaterialOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.service.CompressorMaterialService;
import com.sanlly.warehouse.service.WareSparePartsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 维修压缩机用料
 * @author lishzh
 */
@Service
public class CompressorMaterialServiceImpl extends BaseServiceImpl implements CompressorMaterialService {

    @Autowired
    private CompressorMaterialMapper compressorMaterialDao;

    @Autowired
    private WareSparePartsService sparePartsService;


    /**
     * 添加维修压缩机用料条目
     *
     * @author lishzh
     */
    @Override
    public void addCompressorMaterial(CompressorMaterialInput input) {
        SparePartsBriefOutput material = sparePartsService.getSparePart(null, input.getMaterialNo());
        SparePartsBriefOutput compressor = sparePartsService.getSparePart(input.getCompressor(), null);

        CompressorMaterial cm=new CompressorMaterial();
        cm.setCompressor(input.getCompressor());
        cm.setCompressorNo(compressor.getSparePartsNo());
        cm.setMaterial(material.getKey());
        cm.setMaterialNo(input.getMaterialNo());
        cm.setWarehouse(input.getWarehouse());
        cm.setWarehouseType(input.getWarehouseType());
        cm.setDescripZh(input.getDescripZh());
        cm.setDescripEn(input.getDescripEn());
        cm.setCost(input.getCost());
        cm.setRepairOffer(input.getRepairOffer());
        cm.setRepairWay(input.getRepairWay());
        cm.setType(input.getType());
        cm.setIsValid(input.getIsValid());
        cm.setIsDel(PlatformConstants.ISDEL_NO);
        cm.setCreateTime(new Date());
        cm.setCreateUser(getCurrentUserId());
        compressorMaterialDao.insertSelective(cm);
    }

    /**
     * 编辑维修压缩机用料条目
     *
     * @author lishzh
     */
    @Override
    public void editCompressorMaterial(CompressorMaterialInput input) {
        CompressorMaterial cm=new CompressorMaterial();
        cm.setWareCompressorMaterialId(input.getWareCompressorMaterialId());
        cm.setCompressor(input.getCompressor());
        cm.setCompressorNo(input.getCompressorNo());
        cm.setMaterial(input.getMaterial());
        cm.setMaterialNo(input.getMaterialNo());
        cm.setWarehouse(input.getWarehouse());
        cm.setWarehouseType(input.getWarehouseType());
        cm.setDescripZh(input.getDescripZh());
        cm.setDescripEn(input.getDescripEn());
        cm.setCost(input.getCost());
        cm.setRepairOffer(input.getRepairOffer());
        cm.setRepairWay(input.getRepairWay());
        cm.setType(input.getType());
        cm.setIsValid(input.getIsValid());
        cm.setUpdateTime(new Date());
        cm.setUpdateUser(getCurrentUserId());
        compressorMaterialDao.updateByPrimaryKeySelective(cm);
    }

    /**
     * 删除维修压缩机用料条目
     *
     * @author lishzh
     */
    @Override
    public void deleteCompressorMaterial(List<Integer> ids) {
        ids.forEach(id -> {
            CompressorMaterial cm=new CompressorMaterial();
            cm.setWareCompressorMaterialId(id);
            cm.setIsDel(PlatformConstants.ISDEL_YES);
            compressorMaterialDao.updateByPrimaryKeySelective(cm);
        });
    }

    /**
     * 查询维修压缩机用料条目
     *
     * @author lishzh
     */
    @Override
    public PagedList<CompressorMaterialOutput> getPageList(SearchCompressorMaterialInput input) {
        CompressorMaterialExample example=new CompressorMaterialExample();
        CompressorMaterialExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISVALID_NO);
        if(StringUtils.isNotEmpty(input.getMaterialNo())){
            criteria.andMaterialNoLike("%"+input.getMaterialNo()+"%");
        }
        if (StringUtils.isNotEmpty(input.getCompressorNo())){
            criteria.andCompressorNoLike("%"+input.getCompressorNo()+"%");
        }
        example.setOrderByClause("create_time desc");
        int total=(int)compressorMaterialDao.countByExample(example);

        PagedList<CompressorMaterialOutput> page=new PagedList<>(input.getPageIndex(),input.getPageSize(),total);
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());
        List<CompressorMaterialOutput> outputs = compressorMaterialDao.selectByExample(example).stream().map(cm -> {
            CompressorMaterialOutput output = new CompressorMaterialOutput();
            output.setCompressor(cm.getCompressor());
            output.setCompressorNo(cm.getCompressorNo());
            output.setMaterial(cm.getMaterial());
            output.setMaterialNo(cm.getMaterialNo());
            output.setMaterialLangLang(cm.getMaterial());
            output.setWarehouse(cm.getWarehouse());
            output.setWarehouseLangLang(cm.getWarehouse());
            output.setWarehouseType(cm.getWarehouseType());
            output.setWarehouseTypeLangLang(cm.getWarehouseType());
            output.setDescripZh(cm.getDescripZh());
            output.setDescripEn(cm.getDescripEn());
            output.setDescripLangLang("");
            output.setCost(cm.getCost());
            output.setRepairOffer(cm.getRepairOffer());
            output.setRepairWay(cm.getRepairWay());
            output.setRepairWayLangLang(cm.getRepairWay());
            output.setType(cm.getType());
            output.setTypeLangLang(cm.getType());
            output.setIsValid(cm.getIsValid());
            output.setIsValidLangLang(cm.getIsValid());
            return output;
        }).collect(Collectors.toList());

        page.getDataList().addAll(outputs);
        return page;
    }

}
