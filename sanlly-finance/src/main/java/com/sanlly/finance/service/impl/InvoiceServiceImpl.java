package com.sanlly.finance.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.dao.BillMapper;
import com.sanlly.finance.dao.BusinessInvoiceMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessInvoice;
import com.sanlly.finance.entity.BusinessInvoiceExample;
import com.sanlly.finance.models.input.SearchInvoiceInput;
import com.sanlly.finance.models.output.BillCommonOutput;
import com.sanlly.finance.models.output.BusinessInvoiceOutput;
import com.sanlly.finance.service.InvoiceService;

@Service
public class InvoiceServiceImpl extends BaseServiceImpl implements InvoiceService {

	@Autowired
	private BusinessInvoiceMapper invoiceDao;
	
	@Autowired
	private BusinessMapper businessDao;
	
	@Autowired
	private BillMapper billDao;
	
	/**
	 * 发票分页查询
	* Title: getBusinessInvoicePage 
	* Description: 
	* @param input
	* @return  
	* @see com.sanlly.finance.service.InvoiceService#getBusinessInvoicePage(com.sanlly.finance.models.input.SearchInvoiceInput)
	 */
	@Override
	public PagedList<BusinessInvoiceOutput> getInvoicePage(SearchInvoiceInput input) {
		// TODO Auto-generated method stub
		BusinessInvoiceExample example = new BusinessInvoiceExample();
		BusinessInvoiceExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andInvoiceCodeLike("%"+input.getInvoiceCode()+"%");

		int totalCount = (int) invoiceDao.countByExample(example);
		PagedList<BusinessInvoiceOutput> pagedList = new PagedList<BusinessInvoiceOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BusinessInvoice> businessDetailList = invoiceDao.selectByExample(example);
		List<BusinessInvoiceOutput> outputList = businessDetailList.stream().map(a -> {
			BusinessInvoiceOutput output = new BusinessInvoiceOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setChargeStatusNameLang(a.getChargeStatus());
			output.setInvoiceStatusNameLang(a.getInvoiceStatus());
			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 *  发票全部导出
	* Title: exportBusinessInvoiceAll 
	* Description: 
	* @param input
	* @return  
	* @see com.sanlly.finance.service.InvoiceService#exportBusinessInvoiceAll(com.sanlly.finance.models.input.SearchInvoiceInput)
	 */
	@Override
	public List<BusinessInvoiceOutput> exportInvoiceAll(SearchInvoiceInput input) {
		// TODO Auto-generated method stub
		BusinessInvoiceExample example = new BusinessInvoiceExample();
		BusinessInvoiceExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
		.andInvoiceCodeLike("%"+input.getInvoiceCode()+"%");
		example.setOrderByClause(" `create_time` DESC");
		List<BusinessInvoice> businessInvoicelList = invoiceDao.selectByExample(example);
		List<BusinessInvoiceOutput> outputList = businessInvoicelList.stream().map(a -> {
			BusinessInvoiceOutput output = new BusinessInvoiceOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setChargeStatusNameLang(a.getChargeStatus());
			output.setInvoiceStatusNameLang(a.getInvoiceStatus());

			return output;
		}).collect(Collectors.toList());
		return outputList;
	}

	/**
	 * 根据发票查询 账单集合
	* Title: getBillByInvoice 
	* Description: 
	* @param input
	* @return  
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	* @see com.sanlly.finance.service.InvoiceService#getBillByInvoice(com.sanlly.finance.models.input.SearchInvoiceInput)
	 */
	@Override
	public List<BillCommonOutput> getBillByInvoice(SearchInvoiceInput input) throws Exception{
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.sanlly.finance.models.output.BillCommonOutput");  

		List<BillCommonOutput> list=new ArrayList<BillCommonOutput>();
		Business bussiness=null;
		// 主表id
		if (!StringUtils.isEmpty(input.getBusinessId())) {
			bussiness=businessDao.selectByPrimaryKey(Integer.parseInt(input.getBusinessId()));
			if(bussiness!=null) {//找到原表 和原表账单ID
				
				List<Map<String, String>> recourdList = billDao.selectBillTable("select * from " + bussiness.getSourceTable() + " WHERE is_del = 0 and id="+bussiness.getSourceBillId());
				for (Map<String, String> record : recourdList) {
					//包装所有属性
					BillCommonOutput output=new BillCommonOutput();
					//获取类所有属性
					Field[] fields = clazz.getDeclaredFields();
					for (int i = 0; i < fields.length; i++) {
						Field field = fields[i];
						 //反射赋值
						 Field f = clazz.getDeclaredField(field.getName());  
						 f.setAccessible(true); // 设置属性可以直接的进行访问  
						 f.set(output, record.get(field.getName()));  
					}
					
					list.add(output);
				}
				
			}
			
			
		}
		return list;
	 
	}

}
