package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.dao.InvoiceTypeMapper;
import com.sanlly.purchase.entity.InvoiceType;
import com.sanlly.purchase.entity.InvoiceTypeExample;
import com.sanlly.purchase.models.input.invoicetype.AddInvoiceTypeInput;
import com.sanlly.purchase.models.input.invoicetype.EditInvoiceTypeInput;
import com.sanlly.purchase.models.output.invoicetype.InvoiceTypeOutput;
import com.sanlly.purchase.service.InvoiceTypeService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;
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
 * @Description: TODO
 * @ClassName: InvoiceTypeServiceImpl
 * @Date: 2019/8/15 11:02
 * @Version 1.0
 * @Author mqz
 */
@Service
public class InvoiceTypeServiceImpl extends BaseServiceImpl implements InvoiceTypeService {
    @Autowired
    InvoiceTypeMapper invoiceTypeMapper;
    @Autowired
    ProductionFeignClient productionFeignClient;
    private  static   String tableName= "purc_invoice_type";
    /**
     * 添加发票类型
     * @param
     */
    @Override
    @Transactional
    public void addInvoiceType(AddInvoiceTypeInput addInvoiceTypeInput) {

        InvoiceType invoiceType = new InvoiceType();
        Result<String>  result=productionFeignClient.getKey(tableName);
        System.out.println( result.getData());
        if (StringUtils.isBlank(result.getData())) {
           return;
        }
        BeanUtils.copyProperties(addInvoiceTypeInput,invoiceType);
        Date date = new Date();
        invoiceType.setKey(result.getData());
        invoiceType.setCreateTime(date);
        invoiceType.setIsDel(CommonEnum.NO.getCode());
        invoiceType.setUpdateTime(date);
        invoiceType.setCreateUser(getCurrentUserId());
        invoiceTypeMapper.insert(invoiceType);

    }

    /**
     * 修改发票类型
     * @param
     */
    @Override
    @Transactional
    public void editInvoiceType(EditInvoiceTypeInput editInvoiceTypeInput) {
        InvoiceType invoiceType= new InvoiceType();
        BeanUtils.copyProperties(editInvoiceTypeInput,invoiceType);
        invoiceType.setUpdateTime(new Date());
        invoiceType.setUpdateUser(getCurrentUserId());
        invoiceTypeMapper.updateByPrimaryKeySelective(invoiceType);

    }

    /**
     * 获取发票类型
     * @return
     */
    @Override
    public List<InvoiceTypeOutput> getInvoiceType() {
        InvoiceTypeExample invoiceTypeExample = new InvoiceTypeExample();
        invoiceTypeExample.createCriteria().andIsDelEqualTo(CommonEnum.NO.getCode());
        List<InvoiceType> invoiceTypes = invoiceTypeMapper.selectByExample(invoiceTypeExample);
        List<InvoiceTypeOutput> outputs= new ArrayList<>();
        for (InvoiceType invoiceType:invoiceTypes){
            InvoiceTypeOutput invoiceTypeOutput = new InvoiceTypeOutput();
            BeanUtils.copyProperties(invoiceType,invoiceTypeOutput);
            invoiceTypeOutput.setKeyLangLang(invoiceType.getKey());
            invoiceTypeOutput.setInvoiceCategroyLangLang(invoiceType.getInvoiceCategroy());
            outputs.add(invoiceTypeOutput);

        }

        return outputs;
    }

    @Override
    @Transactional
    public void deleteInvoiceType(Integer[] purcInvoiceTypeIds) {
        InvoiceTypeExample invoiceTypeExample = new InvoiceTypeExample();
        invoiceTypeExample.createCriteria().andPurcInvoiceTypeIdIn(Arrays.asList(purcInvoiceTypeIds));
        InvoiceType invoiceType = new InvoiceType();
        invoiceType.setUpdateTime(new Date());
        invoiceType.setUpdateUser(getCurrentUserId());
        invoiceType.setIsDel(CommonEnum.YES.getCode());
        invoiceTypeMapper.updateByExampleSelective(invoiceType,invoiceTypeExample);

    }

    /**
     * 获取税点
     * @param key
     * @return
     */
    @Override
    public Double getInvoiceTypes(String key) {
        InvoiceTypeExample invoiceTypeExample= new InvoiceTypeExample();
        invoiceTypeExample.createCriteria().andKeyEqualTo(key);
        List<InvoiceType> invoiceTypes=invoiceTypeMapper.selectByExample(invoiceTypeExample);

        return invoiceTypes.get(0).getInvoicePoint();
    }

    /**
     * 根据key 获取发票信息
     * @param key
     * @return
     */
	@Override
	public InvoiceTypeOutput getInvoice(String key) {
        InvoiceTypeExample invoiceTypeExample= new InvoiceTypeExample();
        invoiceTypeExample.createCriteria().andKeyEqualTo(key);
        List<InvoiceType> invoiceTypes=invoiceTypeMapper.selectByExample(invoiceTypeExample);
        InvoiceTypeOutput invoiceTypeOutput = new InvoiceTypeOutput();
        if(invoiceTypes!=null&&invoiceTypes.size()>0) {
        	InvoiceType invoiceType= invoiceTypes.get(0);
	        BeanUtils.copyProperties(invoiceType,invoiceTypeOutput);
	        invoiceTypeOutput.setKeyLangLang(invoiceType.getKey());
	        invoiceTypeOutput.setInvoiceCategroyLangLang(invoiceType.getInvoiceCategroy());
        }
        return invoiceTypeOutput;
	}
}
