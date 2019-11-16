package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.dao.WareEscrowCompanyMapper;
import com.sanlly.warehouse.entity.WareEscrowCompany;
import com.sanlly.warehouse.entity.WareEscrowCompanyExample;
import com.sanlly.warehouse.models.input.escrowcompany.AddEscrowCompanyInput;
import com.sanlly.warehouse.models.input.escrowcompany.EditEscrowCompanyInput;
import com.sanlly.warehouse.models.output.escrowcompany.EscrowCompanyOutput;
import com.sanlly.warehouse.service.WareEscrowCompanyService;
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
 * ClassName: WareEscrowCompanyServiceImpl
 * Description: 代管公司服务层实现
 * date: 2019/7/29 15:55
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareEscrowCompanyServiceImpl extends BaseServiceImpl implements WareEscrowCompanyService {

    @Autowired
    private WareEscrowCompanyMapper escrowCompanyMapper;

    private String wareEscrowCompany = "ware_escrow_company";

    /**
     * 获取代管公司列表
     * @return
     */
    @Override
    public List<EscrowCompanyOutput> escrowCompanyList() {
        WareEscrowCompanyExample example = new WareEscrowCompanyExample();
        WareEscrowCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        List<WareEscrowCompany> wareEscrowCompanies = escrowCompanyMapper.selectByExample(example);
        List<EscrowCompanyOutput> outputs = new ArrayList<>();
        for (WareEscrowCompany company : wareEscrowCompanies) {
            EscrowCompanyOutput output = new EscrowCompanyOutput();
            BeanUtils.copyProperties(company,output);
            output.setKeyLangLang(company.getKey());
            outputs.add(output);
        }
        return outputs;
    }

    /**
     * 获取代管公司
     * @param input
     * @return
     */
    @Override
    public EscrowCompanyOutput getEscrowCompany(EditEscrowCompanyInput input) {
        WareEscrowCompanyExample example = new WareEscrowCompanyExample();
        WareEscrowCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getWareEscrowCompanyId()!=null){
            criteria.andWareEscrowCompanyIdEqualTo(input.getWareEscrowCompanyId());
        }
        if(input.getKey()!=null && input.getKey()!=""){
            criteria.andKeyEqualTo(input.getKey());
        }
        List<WareEscrowCompany> wareEscrowCompanies = escrowCompanyMapper.selectByExample(example);
        WareEscrowCompany wareEscrowCompany = wareEscrowCompanies.get(0);
        EscrowCompanyOutput output = new EscrowCompanyOutput();
        BeanUtils.copyProperties(wareEscrowCompany,output);
        output.setKeyLangLang(wareEscrowCompany.getKey());
        return output;
    }

    /**
     * 添加代管公司
     * @param input
     */
    @Override
    @Transactional
    public void addEscrowCompany(AddEscrowCompanyInput input) {
        Result<String> result = productionService.getKey(wareEscrowCompany);
        if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        WareEscrowCompanyExample example = new WareEscrowCompanyExample();
        WareEscrowCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andEscrowCompanyNameEqualTo(input.getEscrowCompanyName());
        if(escrowCompanyMapper.selectByExample(example).size() > 0){
            throw new RuntimeException("nameErr");
        }
        example.clear();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andEscrowCompanyNoEqualTo(input.getEscrowCompanyNo());
        if(escrowCompanyMapper.selectByExample(example).size() > 0){
            throw new RuntimeException("noErr");
        }

        WareEscrowCompany wareEscrowCompany = new WareEscrowCompany();
        BeanUtils.copyProperties(input,wareEscrowCompany);
        wareEscrowCompany.setCreateTime(new Date());
        wareEscrowCompany.setIsDel(PlatformConstants.ISDEL_NO);
        wareEscrowCompany.setCreateUser(getCurrentUserId());
        wareEscrowCompany.setKey(result.getData());
        escrowCompanyMapper.insert(wareEscrowCompany);
    }

    /**
     * 修改代管公司
     * @param input
     */
    @Override
    @Transactional
    public void updateEscrowCompany(EditEscrowCompanyInput input) {
        WareEscrowCompanyExample example = new WareEscrowCompanyExample();
        WareEscrowCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andEscrowCompanyNameEqualTo(input.getEscrowCompanyName());
        List<WareEscrowCompany> wareEscrowCompanies = escrowCompanyMapper.selectByExample(example);
        if(wareEscrowCompanies.size() > 0){
            if(!wareEscrowCompanies.get(0).getWareEscrowCompanyId().equals(input.getWareEscrowCompanyId())){
                throw new RuntimeException("nameErr");
            }
        }
        example.clear();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andEscrowCompanyNoEqualTo(input.getEscrowCompanyNo());
        List<WareEscrowCompany> wareEscrowCompanies2 = escrowCompanyMapper.selectByExample(example);
        if(wareEscrowCompanies2.size() > 0){
            if(!wareEscrowCompanies2.get(0).getWareEscrowCompanyId().equals(input.getWareEscrowCompanyId())){
                throw new RuntimeException("noErr");
            }
        }


        WareEscrowCompany wareEscrowCompany = new WareEscrowCompany();
        BeanUtils.copyProperties(input,wareEscrowCompany);
        wareEscrowCompany.setUpdateTime(new Date());
        wareEscrowCompany.setUpdateUser(getCurrentUserId());
        escrowCompanyMapper.updateByPrimaryKeySelective(wareEscrowCompany);
    }

    /**
     * 根据ID批量删除代管公司
     * @param ids
     */
    @Override
    @Transactional
    public void deleteEscrowCompany(Integer[] ids) {
        WareEscrowCompanyExample example = new WareEscrowCompanyExample();
        example.createCriteria().andWareEscrowCompanyIdIn(Arrays.asList(ids));
        WareEscrowCompany escrowCompany = new WareEscrowCompany();
        escrowCompany.setUpdateUser(getCurrentUserId());
        escrowCompany.setUpdateTime(new Date());
        escrowCompany.setIsDel(PlatformConstants.ISDEL_YES);
        escrowCompanyMapper.updateByExampleSelective(escrowCompany,example);
    }
}
