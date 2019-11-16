package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.dao.WareQuoteCurrencyMapper;
import com.sanlly.warehouse.entity.WareQuoteCurrency;
import com.sanlly.warehouse.entity.WareQuoteCurrencyExample;
import com.sanlly.warehouse.entity.WareUnit;
import com.sanlly.warehouse.models.input.quotecurrency.AddQuoteCurrencyInput;
import com.sanlly.warehouse.models.input.quotecurrency.EditQuoteCurrencyInput;
import com.sanlly.warehouse.models.output.quotecurrency.QuoteCurrencyOutput;
import com.sanlly.warehouse.service.WareQuoteCurrencyService;
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
 * ClassName: WareQuoteCurrencyServiceImpl
 * Description: 币种服务实现层
 * date: 2019/7/25 17:09
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareQuoteCurrencyServiceImpl extends BaseServiceImpl implements WareQuoteCurrencyService {

    @Autowired
    private WareQuoteCurrencyMapper wareQuoteCurrencyMapper;

    private String wareQuoteCurrency = "ware_quote_currency";
    /**
     * 获取币种列表
     * @return
     */
    @Override
    public List<QuoteCurrencyOutput> getQuoteCurrencyList() {
        //组装查询条件
        WareQuoteCurrencyExample example = new WareQuoteCurrencyExample();
        WareQuoteCurrencyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        criteria.andQuoteCurrencyNameEnIsNotNull();
        //组装返回数据
        List<WareQuoteCurrency> quoteCurrencies = wareQuoteCurrencyMapper.selectByExample(example);
        List<QuoteCurrencyOutput> outputs = new ArrayList<>();
        for (WareQuoteCurrency quoteCurrency : quoteCurrencies) {
            QuoteCurrencyOutput output = new QuoteCurrencyOutput();
            BeanUtils.copyProperties(quoteCurrency,output);
            output.setKeyLangLang(quoteCurrency.getKey());
            outputs.add(output);
        }

        return outputs;
    }

    /**
     * 币种获取
     * @param input
     * @return
     */
    @Override
    public QuoteCurrencyOutput getQuoteCurrency(EditQuoteCurrencyInput input) {
        //组装查询条件
        WareQuoteCurrencyExample example = new WareQuoteCurrencyExample();
        WareQuoteCurrencyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if(input.getWareQuoteCurrencyId()!=null){
            criteria.andWareQuoteCurrencyIdEqualTo(input.getWareQuoteCurrencyId());
        }
        if(input.getKey()!=null && input.getKey()!=""){
            criteria.andKeyEqualTo(input.getKey());
        }
        //组装返回数据
        List<WareQuoteCurrency> quoteCurrencys = wareQuoteCurrencyMapper.selectByExample(example);
        WareQuoteCurrency quoteCurrency = quoteCurrencys.get(0);
        QuoteCurrencyOutput output = new QuoteCurrencyOutput();
        BeanUtils.copyProperties(quoteCurrency,output);
        output.setKeyLangLang(quoteCurrency.getKey());
        return output;
    }

    /**
     * 添加币种
     * @param input
     */
    @Override
    @Transactional
    public void addQuoteCurrency(AddQuoteCurrencyInput input) {
        WareQuoteCurrencyExample example = new WareQuoteCurrencyExample();
        WareQuoteCurrencyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andQuoteCurrencyNameEqualTo(input.getQuoteCurrencyName());
        List<WareQuoteCurrency> list = wareQuoteCurrencyMapper.selectByExample(example);
        if(list.size() > 0){
            throw new RuntimeException("isExist");
        }

        Result<String> result = productionService.getKey(wareQuoteCurrency);
        if (result==null|| StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        WareQuoteCurrency quoteCurrency = new WareQuoteCurrency();
        BeanUtils.copyProperties(input,quoteCurrency);
        quoteCurrency.setIsDel(PlatformConstants.ISDEL_NO);
        quoteCurrency.setKey(result.getData());
        quoteCurrency.setCreateUser(getCurrentUserId());
        quoteCurrency.setCreateTime(new Date());

        wareQuoteCurrencyMapper.insert(quoteCurrency);
    }

    /**
     * 修改币种
     * @param input
     */
    @Override
    @Transactional
    public void updateQuoteCurrency(EditQuoteCurrencyInput input) {
        WareQuoteCurrencyExample example = new WareQuoteCurrencyExample();
        WareQuoteCurrencyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andQuoteCurrencyNameEqualTo(input.getQuoteCurrencyName());
        List<WareQuoteCurrency> list = wareQuoteCurrencyMapper.selectByExample(example);
        if(list.size() > 0){
            if(!list.get(0).getWareQuoteCurrencyId().equals(input.getWareQuoteCurrencyId())){
                throw new RuntimeException("isExist");
            }
        }
        WareQuoteCurrency quoteCurrency = new WareQuoteCurrency();
        BeanUtils.copyProperties(input,quoteCurrency);
        quoteCurrency.setUpdateTime(new Date());
        quoteCurrency.setUpdateUser(getCurrentUserId());
        wareQuoteCurrencyMapper.updateByPrimaryKeySelective(quoteCurrency);
    }

    /**
     * 根据ID批量删除币种
     * @param quoteCurrencyIds
     */
    @Override
    @Transactional
    public void deleteQuoteCurrency(Integer[] quoteCurrencyIds) {
        WareQuoteCurrencyExample example = new WareQuoteCurrencyExample();
        example.createCriteria().andWareQuoteCurrencyIdIn(Arrays.asList(quoteCurrencyIds));
        WareQuoteCurrency quoteCurrency = new WareQuoteCurrency();
        quoteCurrency.setIsDel(PlatformConstants.ISDEL_YES);
        quoteCurrency.setUpdateUser(getCurrentUserId());
        quoteCurrency.setUpdateTime(new Date());
        wareQuoteCurrencyMapper.updateByExampleSelective(quoteCurrency,example);

    }
}
