package com.sanlly.purchase.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.models.output.lang.BaseSelectOptionOutput;
import com.sanlly.purchase.models.output.lang.SelectOptionOutput;
import com.sanlly.purchase.service.SelectService;
import com.sanlly.purchase.service.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* @Package com.sanlly.purchase.service.impl 
* @Description: 采购相关下拉接口 
* @author jlx   
* @date 2019年8月31日 下午2:35:48 
* @version V1.0   
 */
@Service
public class SelectServiceImpl extends BaseServiceImpl implements SelectService {
	
	@Autowired
	private SupplierNatureMapper supplierNatureMapper;
	@Autowired
	private StorehouseTypeMapper storehouseTypeMapper;
	@Autowired
	private SupplierTypeMapper supplierTypeMapper;
	@Autowired
	private ProcureTypeMapper procureTypeMapper;
	@Autowired
	private InvoiceTypeMapper invoiceTypeMapper;
	@Autowired
	private SupplierService supplierService;
	
	/**
	 * 一次性加载下拉选
	 * @return
	 */
	public BaseSelectOptionOutput select() {
		BaseSelectOptionOutput bsOutput = new BaseSelectOptionOutput();
		// 企业性质
		SupplierNatureExample supplierNatureExample = new SupplierNatureExample();
		SupplierNatureExample.Criteria supplierNatureCriteria = supplierNatureExample.createCriteria();
		supplierNatureCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<SupplierNature> supplierNatures = supplierNatureMapper.selectByExample(supplierNatureExample);
		List<SelectOptionOutput> supplierNatureList = new ArrayList<SelectOptionOutput>();
		if (supplierNatures == null || supplierNatures.size() == 0) {
			bsOutput.setSupplierNatureList(supplierNatureList);
		} else {
			for (SupplierNature item : supplierNatures) {
				SelectOptionOutput output = new SelectOptionOutput();
				output.setValue(item.getKey());
				output.setLabel(item.getSupplierNatureName());
				output.setLabelEn(item.getSupplierNatureEn());
				supplierNatureList.add(output);
			}
			bsOutput.setSupplierNatureList(supplierNatureList);
		}
		
		// 供应商库类别
		StorehouseTypeExample storehouseTypeExample = new StorehouseTypeExample();
		StorehouseTypeExample.Criteria storehouseTypeCriteria = storehouseTypeExample.createCriteria();
		storehouseTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<StorehouseType> storehouseTypes = storehouseTypeMapper.selectByExample(storehouseTypeExample);
		List<SelectOptionOutput> storehouseTypeList = new ArrayList<SelectOptionOutput>();
		if (storehouseTypes == null || storehouseTypes.size() == 0) {
			bsOutput.setStorehouseTypeList(storehouseTypeList);
		}
		for (StorehouseType item : storehouseTypes) {
			SelectOptionOutput output = new SelectOptionOutput();
			output.setValue(item.getKey());
			output.setLabel(item.getStorehouseTypeName());
			output.setLabelEn(item.getStorehouseTypeEn());
			storehouseTypeList.add(output);
		}
		bsOutput.setStorehouseTypeList(storehouseTypeList);
		
		// 供应商类别
		SupplierTypeExample supplierTypeExample = new SupplierTypeExample();
		SupplierTypeExample.Criteria supplierTypeCriteria = supplierTypeExample.createCriteria();
		supplierTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<SupplierType> supplierTypes = supplierTypeMapper.selectByExample(supplierTypeExample);
		List<SelectOptionOutput> supplierTypeList = new ArrayList<SelectOptionOutput>();
		if (supplierTypes == null || supplierTypes.size() == 0) {
			bsOutput.setSupplierTypeList(supplierTypeList);
		}
		for (SupplierType item : supplierTypes) {
			SelectOptionOutput output = new SelectOptionOutput();
			output.setValue(item.getKey());
			output.setLabel(item.getSupplierTypeName());
			output.setLabelEn(item.getSupplierTypeEn());
			supplierTypeList.add(output);
		}
		bsOutput.setSupplierTypeList(supplierTypeList);
		// 供应商采购类型
		ProcureTypeExample procureTypeExample = new ProcureTypeExample();
		ProcureTypeExample.Criteria procureTypeCriteria = procureTypeExample.createCriteria();
		procureTypeCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ProcureType> procureTypes = procureTypeMapper.selectByExample(procureTypeExample);
		List<SelectOptionOutput> procureTypeList = new ArrayList<SelectOptionOutput>();
		if (procureTypes == null || procureTypes.size() == 0) {
			bsOutput.setProcureTypeList(procureTypeList);
		}
		for (ProcureType item : procureTypes) {
			SelectOptionOutput output = new SelectOptionOutput();
			output.setValue(item.getKey());
			output.setLabel(item.getProcureTypeName());
			output.setLabelEn(item.getProcureTypeEn());
			procureTypeList.add(output);
		}
		bsOutput.setProcureTypeList(procureTypeList);
		// 发票类型
		InvoiceTypeExample invoiceTypeExample = new InvoiceTypeExample();
		InvoiceTypeExample.Criteria invoiceTypeCriteria = invoiceTypeExample.createCriteria();
		invoiceTypeCriteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		List<InvoiceType> invoiceTypes = invoiceTypeMapper.selectByExample(invoiceTypeExample);
		List<SelectOptionOutput> invoiceTypeList = new ArrayList<SelectOptionOutput>();
		if (invoiceTypes == null || invoiceTypes.size() == 0) {
			bsOutput.setInvoiceTypeList(invoiceTypeList);
		}
		for (InvoiceType item : invoiceTypes) {
			SelectOptionOutput output = new SelectOptionOutput();
			output.setValue(item.getKey());
			output.setLabel(item.getInvoiceTypeName());
			output.setLabelEn(item.getInvoiceTypeEn());
			invoiceTypeList.add(output);
		}
		bsOutput.setInvoiceTypeList(invoiceTypeList);
		
		// 供应商列表
		bsOutput.setSupplierList(supplierService.getSuppliers());
				
				
		
		return bsOutput;
	}

}
