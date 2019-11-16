package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.base.RefrigeratorCompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.UnitCompanyMapper;
import com.sanlly.production.dao.UnitTypeMapper;
import com.sanlly.production.entity.UnitCompany;
import com.sanlly.production.entity.UnitCompanyExample;
import com.sanlly.production.entity.UnitCompanyExample.Criteria;
import com.sanlly.production.entity.UnitType;
import com.sanlly.production.entity.UnitTypeExample;
import com.sanlly.production.models.input.refrigerator.AddRefrigeratorCompanyInput;
import com.sanlly.production.models.input.refrigerator.EditRefrigeratorCompanyInput;
import com.sanlly.production.models.input.refrigerator.SearchRefrigeratorCompanyInput;
import com.sanlly.production.models.output.refrigerator.UnitCompanyBriefOutput;
import com.sanlly.production.models.output.refrigerator.UnitTypeOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.RefrigeratorCompanyService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 冷机公司服务实现类
 *
 * @author lishzh
 */
@Service
public class RefrigeratorCompanyServiceImpl extends BaseServiceImpl implements RefrigeratorCompanyService {

    @Autowired
    private UnitCompanyMapper unitCompanyDao;

    @Autowired
    private UnitTypeMapper unitTypeDao;

    @Autowired
    private LangService langService;

    private static final String TABLE_NAME = "prod_unit_company";
    private static final Logger LOGGER = LoggerFactory.getLogger(RefrigeratorCompanyServiceImpl.class);

    /**
     * @author zhq
     * @date 2019/10/18
     * @description
     */
    @Override
    public PagedList<RefrigeratorCompanyOutput> getRefrigeratorCompanyListByKeywords(PageInput input, String searchWords) {
        UnitCompanyExample example = new UnitCompanyExample();
        UnitCompanyExample.Criteria criteria = example.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotEmpty(searchWords)) {
            String bySearchWords = "%" + StringUtils.trim(searchWords) + "%";
            criteria.andUnitCompanyCodeLike(bySearchWords);
            example.or().andUnitCompanyNameLike(bySearchWords).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            example.or().andUnitCompanyNameEnLike(bySearchWords).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        }
        example.setOrderByClause("create_time DESC");
        Integer totalItemCount = (int) unitCompanyDao.countByExample(example);
        PagedList<RefrigeratorCompanyOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<UnitCompany> unitCompanyList = unitCompanyDao.selectByExample(example);
        List<RefrigeratorCompanyOutput> outputList = new ArrayList<>();
        unitCompanyList.stream().forEach(unitCompany -> {
            RefrigeratorCompanyOutput refrigeratorCompanyOutput = new RefrigeratorCompanyOutput();
            BeanUtils.copyProperties(unitCompany, refrigeratorCompanyOutput);
            refrigeratorCompanyOutput.setKeyLangLang(unitCompany.getKey());
            outputList.add(refrigeratorCompanyOutput);
        });
        pagedList.setDataList(outputList);
        return pagedList;
    }

    /**
     * @author zhq
     * @date 2019/10/23
     * @description 添加一个冷机公司
     */
    @Override
    public int addRefrigeratorCompany(AddRefrigeratorCompanyInput input) {
        String key = langService.getLangRuleKeyByTable(TABLE_NAME);
        LOGGER.info("生成的prod_unit_company的key为{}", key);
        if (StringUtils.isEmpty(key)) {
            LOGGER.error("生成的key为空，结束新增");
            throw new SqlException("insertFail");
        }
        UnitCompany unitCompany = new UnitCompany();
        BeanUtils.copyProperties(input, unitCompany);
        unitCompany.setKey(key);
        unitCompany.setCreateUser(getCurrentUserId());
        unitCompany.setCreateTime(new Date());
        unitCompany.setIsDel(PlatformConstants.ISDEL_NO);
        return unitCompanyDao.insertSelective(unitCompany);
    }

	/**
     @author zhq
     @date 2019/10/23
     @description 更新冷机记录
	 */
    @Override
    public int updateRefrigeratorCompany(EditRefrigeratorCompanyInput input) {
        UnitCompany unitCompany = new UnitCompany();
        BeanUtils.copyProperties(input, unitCompany);
        unitCompany.setUpdateUser(super.getCurrentUserId());
        unitCompany.setUpdateTime(new Date());
        return unitCompanyDao.updateByPrimaryKeySelective(unitCompany);
    }

    /**
     * @author zhq
     * @date 2019/10/23
     * @description 根据主键批量删除冷机公司记录
     */
    @Override
    public int deleteRefrigeratorCompany(Integer[] ids) {
        UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
        unitCompanyExample.createCriteria().andProdUnitCompanyIdIn(Arrays.asList(ids));
        UnitCompany unitCompany = new UnitCompany();
        unitCompany.setIsDel(PlatformConstants.ISDEL_YES);
        unitCompany.setUpdateTime(new Date());
        unitCompany.setUpdateUser(super.getCurrentUserId());
        return unitCompanyDao.updateByExampleSelective(unitCompany, unitCompanyExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/10/21
     * @description 批量设置有效性
     */
    @Override
    public int multiValid(Integer[] ids, int valid) {

        UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
        unitCompanyExample.createCriteria().andProdUnitCompanyIdIn(Arrays.asList(ids));
        UnitCompany unitCompany = new UnitCompany();
        unitCompany.setIsValid(valid);
        unitCompany.setUpdateTime(new Date());
        unitCompany.setUpdateUser(super.getCurrentUserId());
        LOGGER.info(unitCompany.toString());
        return unitCompanyDao.updateByExampleSelective(unitCompany, unitCompanyExample);
    }

    /**
     * 分页查询冷机公司
     */
    @Override
    public PagedList<RefrigeratorCompanyOutput> getPageRefrigeratorCompany(SearchRefrigeratorCompanyInput input) {
        UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
        Criteria companyCriteria = unitCompanyExample.createCriteria();

        if (StringUtils.isNotEmpty(input.getUnitCompanyName())) {
            if (isChineseRequest()) {
                companyCriteria.andUnitCompanyNameLike("%" + input.getUnitCompanyName() + "%");
            } else {
                companyCriteria.andUnitCompanyNameEnLike("%" + input.getUnitCompanyName() + "%");
            }
        }
        companyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        // 查询总条数
        Integer total = (int) unitCompanyDao.countByExample(unitCompanyExample);
        PagedList<RefrigeratorCompanyOutput> page = new PagedList<RefrigeratorCompanyOutput>(input.getPageIndex(),
                input.getPageSize(), total);
        // 分页查询
        unitCompanyExample.setLimitStart(page.getLimitStart());
        unitCompanyExample.setLimitEnd(page.getLimitEnd());
        List<UnitCompany> unitCompanies = unitCompanyDao.selectByExample(unitCompanyExample);
        List<RefrigeratorCompanyOutput> outputs = new ArrayList<>();
        for (UnitCompany unitCompany : unitCompanies) {
            RefrigeratorCompanyOutput rco = new RefrigeratorCompanyOutput();
            BeanUtils.copyProperties(unitCompany, rco);
            UnitTypeExample unitTypeExample = new UnitTypeExample();
            unitTypeExample.createCriteria().andUnitCompanyEqualTo(unitCompany.getKey());
            List<UnitType> unitTypes = unitTypeDao.selectByExample(unitTypeExample);
            String models = "";
            for (UnitType unitType : unitTypes) {
                models += unitType + " ";
            }
            rco.setKeyLangLang(unitCompany.getKey());
            outputs.add(rco);
        }
        page.getDataList().addAll(outputs);
        return page;

    }

    /**
     * 查询所有冷机公司
     */
    @Override
    public List<RefrigeratorCompanyOutput> getAllRefrigeratorCompany() {
        UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
        unitCompanyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<UnitCompany> unitCompanies = unitCompanyDao.selectByExample(unitCompanyExample);
        List<RefrigeratorCompanyOutput> outputs = new ArrayList<>();
        for (UnitCompany unitCompany : unitCompanies) {
            RefrigeratorCompanyOutput rco = new RefrigeratorCompanyOutput();
            BeanUtils.copyProperties(unitCompany, rco);
            rco.setKeyLangLang(unitCompany.getKey());
            outputs.add(rco);
        }
        return outputs;
    }

    @Override
    public UnitCompanyBriefOutput getUnitCompanyByKey(String key) {
        UnitCompanyBriefOutput output = new UnitCompanyBriefOutput();
        if (StringUtils.isNotEmpty(key)) {
            UnitCompanyExample unitCompanyExample = new UnitCompanyExample();
            unitCompanyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(key);
            List<UnitCompany> unitCompanies = unitCompanyDao.selectByExample(unitCompanyExample);

            if (!CollectionUtils.isEmpty(unitCompanies)) {
                UnitCompany unitCompany = unitCompanies.get(0);
                BeanUtils.copyProperties(unitCompany, output);
                output.setUnitCompanyNameLang(unitCompany.getKey());
                //明细
                UnitTypeExample unitTypeExample = new UnitTypeExample();
                unitTypeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andUnitCompanyEqualTo(key);
                List<UnitType> unitTypes = unitTypeDao.selectByExample(unitTypeExample);
                List<UnitTypeOutput> unitTypeOutputs = new ArrayList<>();
                for (UnitType unitType : unitTypes) {
                    UnitTypeOutput unitTypeOutput = new UnitTypeOutput();
                    unitTypeOutput.setKey(unitType.getKey());
                    unitTypeOutput.setUnitTypeCodeLang(unitType.getKey());
                    unitTypeOutputs.add(unitTypeOutput);
                }
                output.setUnitTypes(unitTypeOutputs);
            }
        } else {
            //明细
            UnitTypeExample unitTypeExample = new UnitTypeExample();
            unitTypeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            List<UnitType> unitTypes = unitTypeDao.selectByExample(unitTypeExample);
            List<UnitTypeOutput> unitTypeOutputs = new ArrayList<>();
            for (UnitType unitType : unitTypes) {
                UnitTypeOutput unitTypeOutput = new UnitTypeOutput();
                unitTypeOutput.setKey(unitType.getKey());
                unitTypeOutput.setUnitTypeCodeLang(unitType.getKey());
                unitTypeOutputs.add(unitTypeOutput);
            }
            output.setUnitTypes(unitTypeOutputs);
        }


        return output;
    }

    /**
     * 根据机型获取冷机公司信息
     */
    @Override
    public RefrigeratorCompanyOutput getUnitCompanyByTypeKey(String key) {
        RefrigeratorCompanyOutput output = new RefrigeratorCompanyOutput();
        UnitTypeExample unitTypeExample = new UnitTypeExample();
        unitTypeExample.createCriteria()
                .andIsDelEqualTo(PlatformConstants.ISDEL_NO)
                .andKeyEqualTo(key);
        List<UnitType> unitTypes = unitTypeDao.selectByExample(unitTypeExample);
        if (unitTypes.size() > 0) {
            String companyKey = unitTypes.get(0).getUnitCompany();
            output.setKey(companyKey);
        }
        // TODO Auto-generated method stub
        return output;
    }
}
