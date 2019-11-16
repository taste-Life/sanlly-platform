package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.dao.WareSparepartsCategoriesDetailsMapper;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetails;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.SearchSparepartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.output.sparepartscategoriesdetails.SparePartsCategoriesDetailsOutput;
import com.sanlly.warehouse.service.WareSparePartsCategoriesDetailsService;
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
 * ClassName: WareSparePartsCategoriesDetailsServiceImpl
 * Description: 备件明细类别服务实现层
 * date: 2019/7/25 19:38
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareSparePartsCategoriesDetailsServiceImpl extends BaseServiceImpl implements WareSparePartsCategoriesDetailsService {

    @Autowired
    private WareSparepartsCategoriesDetailsMapper sparepartsCategoriesDetailsMapper;

    private String wareSparepartsCategoriesDetails = "ware_spareparts_categories_details";

    /**
     * 获取备件明细类别列表
     * @return
     */
    @Override
    public List<SparePartsCategoriesDetailsOutput> sparepartsCategoriesDetailsList(SearchSparepartsCategoriesDetailsInput input) {
        //组装查询条件
        WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
        WareSparepartsCategoriesDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getWareSparepartsCategoriesDetailsId()!=null){
            criteria.andWareSparepartsCategoriesDetailsIdEqualTo(input.getWareSparepartsCategoriesDetailsId());
        }
        if(input.getKey()!=null && input.getKey() != ""){
            criteria.andKeyEqualTo(input.getKey());
        }
        if(input.getSparePartsCategories()!=null && input.getSparePartsCategories() != ""){
            criteria.andSparePartsCategoriesEqualTo(input.getSparePartsCategories());
        }
        if(input.getSparepartsCategoriesDetailsName()!= null && input.getSparepartsCategoriesDetailsName()!=""){
            criteria.andSparepartsCategoriesDetailsNameLike("%"+input.getSparepartsCategoriesDetailsName()+"%");
        }
        //组装返回数据
        List<WareSparepartsCategoriesDetails> details = sparepartsCategoriesDetailsMapper.selectByExample(example);
        List<SparePartsCategoriesDetailsOutput> outputs = new ArrayList<>();
        for (WareSparepartsCategoriesDetails detail : details) {
            SparePartsCategoriesDetailsOutput output = new SparePartsCategoriesDetailsOutput();
            BeanUtils.copyProperties(detail,output);
            output.setKeyLangLang(detail.getKey());
            output.setSparePartsCategoriesLangLang(detail.getSparePartsCategories());
            outputs.add(output);
        }

        return outputs;
    }

    /**
     * 获取备件明细类别
     * @param input
     * @return
     */
    @Override
    public SparePartsCategoriesDetailsOutput getSparepartsCategoriesDetails(EditSparePartsCategoriesDetailsInput input) {
        //组装查询条件
        WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
        WareSparepartsCategoriesDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getWareSparepartsCategoriesDetailsId()!=null){
            criteria.andWareSparepartsCategoriesDetailsIdEqualTo(input.getWareSparepartsCategoriesDetailsId());
        }
        if(input.getKey()!=null && input.getKey()!=""){
            criteria.andKeyEqualTo(input.getKey());
        }
        //组装返回数据
        List<WareSparepartsCategoriesDetails> categoriesDetails = sparepartsCategoriesDetailsMapper.selectByExample(example);
        WareSparepartsCategoriesDetails details = categoriesDetails.get(0);
        SparePartsCategoriesDetailsOutput output = new SparePartsCategoriesDetailsOutput();
        BeanUtils.copyProperties(details,output);
        output.setKeyLangLang(details.getKey());
        output.setSparePartsCategoriesLangLang(details.getSparePartsCategories());
        return output;
    }

    /**
     * 添加备件明细类别
     * @param input
     */
    @Override
    @Transactional
    public void addSparepartsCategoriesDetails(AddSparePartsCategoriesDetailsInput input) {
        WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
        WareSparepartsCategoriesDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparepartsCategoriesDetailsNameEqualTo(input.getSparepartsCategoriesDetailsName());
        List<WareSparepartsCategoriesDetails> details1 = sparepartsCategoriesDetailsMapper.selectByExample(example);
        if(details1.size() > 0){
            throw new RuntimeException("isExist");
        }
        Result<String> result = productionService.getKey(wareSparepartsCategoriesDetails);
        if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        WareSparepartsCategoriesDetails details = new WareSparepartsCategoriesDetails();
        BeanUtils.copyProperties(input,details);
        details.setIsDel(PlatformConstants.ISDEL_NO);
        details.setKey(result.getData());
        details.setCreateTime(new Date());
        details.setCreateUser(getCurrentUserId());
        sparepartsCategoriesDetailsMapper.insert(details);
    }

    /**
     * 修改备件明细类别
     * @param input
     */
    @Override
    @Transactional
    public void updateSparepartsCategoriesDetails(EditSparePartsCategoriesDetailsInput input) {
        WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
        WareSparepartsCategoriesDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparepartsCategoriesDetailsNameEqualTo(input.getSparepartsCategoriesDetailsName());
        List<WareSparepartsCategoriesDetails> details1 = sparepartsCategoriesDetailsMapper.selectByExample(example);
        if(details1.size() > 0){
            if(!details1.get(0).getWareSparepartsCategoriesDetailsId().equals(input.getWareSparepartsCategoriesDetailsId())){
                throw new RuntimeException("isExist");
            }
        }
        WareSparepartsCategoriesDetails details = new WareSparepartsCategoriesDetails();
        BeanUtils.copyProperties(input,details);
        details.setUpdateTime(new Date());
        details.setUpdateUser(getCurrentUserId());
        sparepartsCategoriesDetailsMapper.updateByPrimaryKeySelective(details);
    }

    /**
     * 根据ID删除批量删除备件明细类别信息
     * @param sparepartsCategoriesDetailsIds
     */
    @Override
    @Transactional
    public void deleteSparepartsCategoriesDetails(Integer[] sparepartsCategoriesDetailsIds) {
        WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
        example.createCriteria().andWareSparepartsCategoriesDetailsIdIn(Arrays.asList(sparepartsCategoriesDetailsIds));
        WareSparepartsCategoriesDetails details = new WareSparepartsCategoriesDetails();
        details.setIsDel(PlatformConstants.ISDEL_YES);
        details.setUpdateUser(getCurrentUserId());
        details.setUpdateTime(new Date());
        sparepartsCategoriesDetailsMapper.updateByExampleSelective(details,example);
    }

    /**
     * 根据备件大类Key查询所属备件明细类别
     * @param categoriesKey
     * @return
     */
    @Override
    public List<SparePartsCategoriesDetailsOutput> getCategoriesDetailByCategoriesKey(String categoriesKey) {
        WareSparepartsCategoriesDetailsExample example = new WareSparepartsCategoriesDetailsExample();
        WareSparepartsCategoriesDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsCategoriesEqualTo(categoriesKey);

        List<WareSparepartsCategoriesDetails> details = sparepartsCategoriesDetailsMapper.selectByExample(example);
        List<SparePartsCategoriesDetailsOutput> outputs = new ArrayList<>();
        for (WareSparepartsCategoriesDetails detail : details) {
            SparePartsCategoriesDetailsOutput output = new SparePartsCategoriesDetailsOutput();
            BeanUtils.copyProperties(detail,output);
            output.setKeyLangLang(detail.getKey());
            output.setSparePartsCategoriesLangLang(detail.getSparePartsCategories());
            outputs.add(output);
        }
        return outputs;
    }
}
