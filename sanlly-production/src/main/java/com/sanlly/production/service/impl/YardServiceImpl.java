package com.sanlly.production.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.base.YardInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.production.dao.CompanyMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Company;
import com.sanlly.production.entity.CompanyExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.entity.YardExample.Criteria;
import com.sanlly.production.service.YardService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class YardServiceImpl extends BaseServiceImpl implements YardService {

    @Autowired
    private YardMapper containerSizeMapper;
    @Autowired
    private LangServiceImpl lang;
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @Override
    public List<YardOutput> list(String companyKey) {
        YardExample example = new YardExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(companyKey);
        List<Yard> yardList = containerSizeMapper.selectByExample(example);
        return yardList.stream().map(yard -> {
            YardOutput yardOutput = new YardOutput();
            BeanUtils.copyProperties(yard, yardOutput);
            yardOutput.setKeyNameLang(yard.getKey());
            return yardOutput;
        }).collect(Collectors.toList());
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @Override
    public YardOutput query(Integer id) {
        Yard record = containerSizeMapper.selectByPrimaryKey(id);
        YardOutput output = new YardOutput();
        BeanUtils.copyProperties(record, output);
        return output;
    }

    /**
     * 根据key查询
     *
     * @param key
     * @return 
     * @author zhh
     */
    @Override
    public YardOutput queryByKey(String key) {
        // TODO Auto-generated method stub
        YardOutput output = new YardOutput();
        YardExample example = new YardExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(key);
        List<Yard> list = containerSizeMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            Yard yard = list.get(0);
            BeanUtils.copyProperties(yard, output);
        }
        return output;
    }


    /**
     * 根据主键更新
     *
     * @param company
     * @return
     * @author zhangkai
     */
    @Override
    public int update(YardInput input) {
        Yard record = new Yard();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return containerSizeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @Override
    public int add(YardInput input) {
        Yard record = new Yard();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_yard"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return containerSizeMapper.insertSelective(record);
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @Override
    public int delete(Integer id) {
        Yard record = new Yard();
        record.setIsDel(PlatformConstants.ISDEL_YES);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return containerSizeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据条件查询
     *
     * @param input
     * @return 
     * @author fjy
     */
    @Override
    public List<YardOutput> list(BaseSearchInput input) {
        List<YardOutput> outputList = new ArrayList<YardOutput>();
        YardExample example = new YardExample();
        Criteria criteria = example.createCriteria();
        Criteria criteria2 = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        //中英文 名称检索
        if (!StringUtils.isEmpty(input.getName())) {
            criteria.andYardNameEnLike("%" + input.getName().trim() + "%");
            criteria2.andYardNameLike("%" + input.getName().trim() + "%");
        }
        //根据公司检索
        if (!StringUtils.isEmpty(input.getCompanyKey())) {
            criteria.andCompanyEqualTo(input.getCompanyKey().trim());

        }
        example.or(criteria2);
        List<Yard> list = containerSizeMapper.selectByExample(example);
        for (Yard item : list) {
            YardOutput output = new YardOutput();
            BeanUtils.copyProperties(item, output);
            output.setKeyNameLang(item.getKey());//国际化
            outputList.add(output);
        }
        return outputList;
    }

    /**
     * @Description: 场站分页列表
     * @Param: [input, searchWords]
     * @return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.yard.YardOutput>
     * @Author: zjd
     * @date: 2019-09-27
     */
    @Override
    public PagedList<YardOutput> pageList(PageInput input, String searchWords) {
        CompanyExample companyExample = new CompanyExample();
        List<Company> companyList = companyMapper.selectByExample(companyExample);

        List<YardOutput> outputList = new ArrayList<YardOutput>();
        YardExample example = new YardExample();
        example.setOrderByClause("create_time DESC");
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andYardCodeLike("%" + searchWords.trim() + "%");
            Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andYardNameLike("%" + searchWords.trim() + "");
            Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andYardNameEnLike("%" + searchWords.trim() + "%");
            example.or(criteria2);
            example.or(criteria3);

            //根据公司名查询key
            List<String> companyKeys = companyList.stream().filter(company -> company.getCompanyName().equals(searchWords.trim())).
                    map(company -> {
                        return company.getKey();
                    }).collect(Collectors.toList());
            if (companyKeys != null && companyKeys.size() == 1) {
                Criteria criteria4 = example.createCriteria();
                criteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria4.andCompanyEqualTo(companyKeys.get(0));
                example.or(criteria4);
            }
        }
        Integer totalItemCount = (int) containerSizeMapper.countByExample(example);
        PagedList<YardOutput> pagedList = new PagedList<YardOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<Yard> list = containerSizeMapper.selectByExample(example);


        for (Yard item : list) {
            YardOutput output = new YardOutput();
            BeanUtils.copyProperties(item, output);
            output.setKeyNameLang(item.getKey());
            //根据key翻译公司名称
            List<String> companyNames = companyList.stream().filter(company -> company.getKey().equals(item.getCompany())).
                    map(company -> {
                        return company.getCompanyName();
                    }).collect(Collectors.toList());
            if (companyNames != null && companyNames.size() == 1) {
                output.setCompany(companyNames.get(0));
            }
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for (Integer id : ids) {
            Yard record = new Yard();
            record.setProdYardId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            containerSizeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for (Integer id : ids) {
            Yard record = new Yard();
            record.setProdYardId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            containerSizeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }


}
