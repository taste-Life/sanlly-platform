package com.sanlly.production.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.production.dao.DeptMapper;
import com.sanlly.production.dao.ProdDeptMapper;
import com.sanlly.production.entity.Dept;
import com.sanlly.production.entity.DeptExample;
import com.sanlly.production.entity.ProdDept;
import com.sanlly.production.entity.ProdDeptExample;
import com.sanlly.production.service.DeptService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 部门实现类
 *
 * @author fjy   
 * @version V1.0   
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @date 2019年9月9日 下午1:35:46 
 */
@Service
public class DeptServiceImpl extends BaseServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptDao;

    @Autowired
    private ProdDeptMapper prodDeptDao;


    /**
     * 查询列表
     *
     * @return
     */
    @Override
    public List<DeptOutput> deptList(BaseSearchInput input) {
        List<DeptOutput> outputList = new ArrayList<DeptOutput>();
        DeptExample example = new DeptExample();
        DeptExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (input != null && !StringUtils.isEmpty(input.getCompanyKey())) {
            criteria.andCompanyEqualTo(input.getCompanyKey());
        }

        List<Dept> list = deptDao.selectByExample(example);
        for (Dept item : list) {
            DeptOutput output = new DeptOutput();
            BeanUtils.copyProperties(item, output);
            output.setKeyNameLang(item.getKey());
            outputList.add(output);
        }
        return outputList;
    }


    /**
     * 生产部门 查询
     */
    @Override
    public List<ProdDeptOutput> prodDeptList(BaseSearchInput input) {
        List<ProdDeptOutput> outputList = new ArrayList<ProdDeptOutput>();
        ProdDeptExample example = new ProdDeptExample();
        ProdDeptExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES);
        if (input != null && !StringUtils.isEmpty(input.getCompanyKey())) {
            criteria.andCompanyEqualTo(input.getCompanyKey());
        }
        if (input != null && !StringUtils.isEmpty(input.getYardKey())) {
            criteria.andYardEqualTo(input.getYardKey());
        }

        List<ProdDept> list = prodDeptDao.selectByExample(example);
        for (ProdDept item : list) {
            ProdDeptOutput output = new ProdDeptOutput();
            BeanUtils.copyProperties(item, output);
            output.setCompanyNameLang(item.getCompany());
            output.setYardNameLang(item.getYard());
            output.setProdDeptNameNameLang(item.getKey());
            outputList.add(output);
        }
        return outputList;
    }

    /**
     * @param companyKey
     * @author zhq
     * @date 2019/10/28
     * @description 根据companyKey获取该公司下的生产部门列表
     */
    @Override
    public List<DeptOutput> getDeptListByCompanyKey(String companyKey) {
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andCompanyEqualTo(companyKey).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<Dept> deptList = deptDao.selectByExample(deptExample);
        return deptList.stream().map(dept -> {
            DeptOutput deptOutput = new DeptOutput();
            BeanUtils.copyProperties(dept, deptOutput);
            deptOutput.setKeyNameLang(dept.getKey());
            return deptOutput;
        }).collect(Collectors.toList());
    }
}
