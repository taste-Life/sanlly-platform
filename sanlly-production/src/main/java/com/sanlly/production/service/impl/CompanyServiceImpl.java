package com.sanlly.production.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.base.CompanyInput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.dao.CompanyMapper;
import com.sanlly.production.entity.Company;
import com.sanlly.production.entity.CompanyExample;
import com.sanlly.production.entity.CompanyExample.Criteria;
import com.sanlly.production.service.CompanyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 公司信息维护
 *
 * @author zhangkai
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private LangServiceImpl lang;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @Override
    public PagedList<CompanyOutput> list(PageInput input, String searchWords) {
        List<CompanyOutput> outputList = new ArrayList<CompanyOutput>();
        CompanyExample example = new CompanyExample();
        example.setOrderByClause("create_time DESC");
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && searchWords != "") {
            criteria.andCompanyCodeLike("%" + searchWords.trim() + "%");
            Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andCompanyNameLike("%" + searchWords.trim() + "");
            Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andCompanyNameEnLike("%" + searchWords.trim() + "%");
            example.or(criteria2);
            example.or(criteria3);
        }
        Integer totalItemCount = (int) companyMapper.countByExample(example);
        PagedList<CompanyOutput> pagedList = new PagedList<CompanyOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<Company> list = companyMapper.selectByExample(example);
        for (Company item : list) {
            CompanyOutput output = new CompanyOutput();
            BeanUtils.copyProperties(item, output);
            output.setCreateTime(DateUtil.date2String(item.getCreateTime()));
            output.setUpdateTime(DateUtil.date2String(item.getUpdateTime()));
            output.setKeyNameLang(item.getKey());
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    /**
     * 根据主键更新
     *
     * @param input
     * @return
     * @author zhangkai
     */
    public int update(CompanyInput input) {
        Company record = new Company();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return companyMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @Override
    public int add(CompanyInput input) {
        Company record = new Company();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_company"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsLock(PlatformConstants.ISHEAD_NO);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return companyMapper.insertSelective(record);
    }

    /**
     * 逻辑删除
     *
     * @param ids
     * @return
     * @author zhangkai
     */
    @Override
    public boolean delete(Integer[] ids) {
        for (Integer id : ids) {
            Company record = new Company();
            record.setProdCompanyId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            companyMapper.updateByPrimaryKeySelective(record);
        }
        return true;
    }

    /**
     * 根据主键查询
     */
    @Override
    public CompanyOutput query(Integer id) {
        Company record = companyMapper.selectByPrimaryKey(id);
        CompanyOutput output = new CompanyOutput();
        BeanUtils.copyProperties(record, output);
        output.setKeyNameLang(record.getKey());
        return output;
    }

    /**
     * 根据公司名称查询公司集合
     */
    @Override
    public List<CompanyOutput> list(BaseSearchInput input) {
        // TODO Auto-generated method stub
        List<CompanyOutput> outputList = new ArrayList<CompanyOutput>();
        CompanyExample example = new CompanyExample();
        Criteria criteria = example.createCriteria();
        Criteria criteria2 = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        //中英文 名称检索
        if (input.getName() != null && !StringUtils.isEmpty(input.getName().trim())) {
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andCompanyNameEnLike("%" + input.getName().trim() + "%");
            criteria.andCompanyNameLike("%" + input.getName().trim() + "%");
        }
        example.or(criteria2);
        List<Company> list = companyMapper.selectByExample(example);
        for (Company item : list) {
            CompanyOutput output = new CompanyOutput();
            BeanUtils.copyProperties(item, output);
            output.setKeyNameLang(item.getKey());
            outputList.add(output);
        }
        return outputList;
    }

    /**
     * @Description: 批量设置公司有效性
     * @Param: [ids, valid]
     * @return: int
     * @Author: zjd
     * @date: 2019-09-25
     */
    @Override
    public int multiValid(Integer[] ids, int valid) {
        for (Integer id : ids) {
            Company record = new Company();
            record.setProdCompanyId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            companyMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    /**
     * 根据key查询位置代码
     *
     * @param key
     * @return
     */
    @Override
    public String getPositionCode(String key) {
        CompanyExample example = new CompanyExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(key);
        Company company = companyMapper.selectByExample(example).get(0);
        return company.getPositionCode();
    }

    /**
     * 根据key查询公司代码
     *
     * @param key
     * @return
     */
    @Override
    public String getCompanyCode(String key) {
        CompanyExample example = new CompanyExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(key);
        Company company = companyMapper.selectByExample(example).get(0);
        return company.getCompanyCode();
    }

    /**
     * 根据key取得公司是否锁库
     *
     * @param key
     * @return
     */
    @Override
    public Integer getIsLock(String key) {
        CompanyExample example = new CompanyExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(key);
        Company company = companyMapper.selectByExample(example).get(0);
        return company.getIsLock();
    }

    /**
     * @author zhq
     * @date 2019/10/28
     * @description 获取所有公司列表 给前端提供下拉公司名列表
     */
    @Override
    public List<CompanyOutput> selectCompanyList() {
        CompanyExample companyExample = new CompanyExample();
        companyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<Company> companyList = companyMapper.selectByExample(companyExample);
        return companyList.stream().map(company -> {
            CompanyOutput companyOutput = new CompanyOutput();
            BeanUtils.copyProperties(company, companyOutput);
            companyOutput.setKeyNameLang(company.getKey());
            return companyOutput;
        }).collect(Collectors.toList());
    }
}
