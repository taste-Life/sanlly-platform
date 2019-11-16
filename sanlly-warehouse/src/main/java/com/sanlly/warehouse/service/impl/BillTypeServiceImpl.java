package com.sanlly.warehouse.service.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import com.sanlly.warehouse.models.output.warehousetype.WarehouseTypeOutput;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.WareBillTypeMapper;
import com.sanlly.warehouse.dao.WareBilltypeWarehousetypeMapper;
import com.sanlly.warehouse.entity.WareBillType;
import com.sanlly.warehouse.entity.WareBillTypeExample;
import com.sanlly.warehouse.entity.WareBillTypeExample.Criteria;
import com.sanlly.warehouse.entity.WareBilltypeWarehousetype;
import com.sanlly.warehouse.entity.WareBilltypeWarehousetypeExample;
import com.sanlly.warehouse.models.input.billtype.AddBillTypeInput;
import com.sanlly.warehouse.models.input.billtype.EditBillTypeInput;
import com.sanlly.warehouse.models.input.billtype.SearchBillTypeInput;
import com.sanlly.warehouse.models.output.KeyOutput;
import com.sanlly.warehouse.models.output.billtype.BillTypeOutput;
import com.sanlly.warehouse.service.BillTypeService;

/**
 * 单据类型接口实现类
 * 
 * @author lishzh
 *
 */
@Service
public class BillTypeServiceImpl extends BaseServiceImpl implements BillTypeService {

	@Autowired
	private WareBillTypeMapper billTypeDao;

	@Autowired
	private WareBilltypeWarehousetypeMapper billTypeWarehouseTypeDao;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	private String tableName = "ware_bill_type";

	/**
	 * 添加单据类型
	 */
	@Override
	@Transactional
	public void addBillType(AddBillTypeInput input) {
		Result<String> result = productionService.getKey(tableName);
		if (result == null || StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		// 插入单据类型主表
		WareBillType billType = new WareBillType();
		BeanUtils.copyProperties(input, billType);
		billType.setKey(result.getData());
		billType.setCreateUser(getCurrentUserId());
		billType.setCreateTime(new Date());
		billType.setIsDel(PlatformConstants.ISDEL_NO);
		billType.setIsShow(WarehouseConstants.SHOW);
		billType.setBillAutoincrement(WarehouseConstants.DEFAULT_VALUE);
		billTypeDao.insertSelective(billType);
		// 插入单据类型仓库类型关联表
		for (String key : input.getWarehouseTypeKeys()) {
			WareBilltypeWarehousetype btwt = new WareBilltypeWarehousetype();
			btwt.setBillType(billType.getKey());
			btwt.setWarehouseType(key);
			btwt.setCreateUser(getCurrentUserId());
			btwt.setCreateTime(new Date());
			btwt.setIsDel(PlatformConstants.ISDEL_NO);
			billTypeWarehouseTypeDao.insertSelective(btwt);
		}
	}

	/**
	 * 修改单据类型
	 */
	@Override
	@Transactional
	public void editBillType(EditBillTypeInput input) {
		// 修改单据类型主表
		WareBillTypeExample bte = new WareBillTypeExample();
		Criteria btc = bte.createCriteria();
		btc.andKeyEqualTo(input.getKey());
		WareBillType billType = new WareBillType();
		BeanUtils.copyProperties(input, billType);
		billType.setUpdateTime(new Date());
		billTypeDao.updateByExampleSelective(billType, bte);
		// 删除旧的单据和仓库类型关联
		WareBilltypeWarehousetypeExample btwte = new WareBilltypeWarehousetypeExample();
		WareBilltypeWarehousetypeExample.Criteria btwtc = btwte.createCriteria();
		btwtc.andBillTypeEqualTo(input.getKey());
		billTypeWarehouseTypeDao.deleteByExample(btwte);
		// 插入新的单据类型仓库类型关联表
		for (String key : input.getWarehouseTypeKeys()) {
			WareBilltypeWarehousetype btwt = new WareBilltypeWarehousetype();
			btwt.setBillType(billType.getKey());
			btwt.setWarehouseType(key);
			btwt.setIsDel(PlatformConstants.ISDEL_NO);
			btwt.setCreateTime(new Date());
			billTypeWarehouseTypeDao.insertSelective(btwt);
		}

	}

	/**
	 * 删除单据类型
	 */
	@Override
	@Transactional
	public void deleteBillType(String[] keys) {
		// 删除单据类型
		WareBillTypeExample bte = new WareBillTypeExample();
		Criteria btc = bte.createCriteria();
		btc.andKeyIn(Arrays.asList(keys));
		WareBillType billType = new WareBillType();
		billType.setIsDel(PlatformConstants.ISDEL_YES);
		billTypeDao.updateByExampleSelective(billType, bte);
		// 删除单据仓库类型关联
		for (String key : keys) {
			WareBilltypeWarehousetypeExample btwte = new WareBilltypeWarehousetypeExample();
			WareBilltypeWarehousetypeExample.Criteria btwtc = btwte.createCriteria();
			btwtc.andBillTypeEqualTo(key);
			WareBilltypeWarehousetype btwt = new WareBilltypeWarehousetype();
			btwt.setIsDel(PlatformConstants.ISDEL_YES);
			billTypeWarehouseTypeDao.updateByExampleSelective(btwt, btwte);
		}
	}

	/**
	 * 分页查询所有的单据类型
	 */
	@Override
	public PagedList<BillTypeOutput> getPageBillType(SearchBillTypeInput input) {
		// 查询单据类型总记录数
		WareBillTypeExample bte = new WareBillTypeExample();
		Criteria btc = bte.createCriteria();
		btc.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		btc.andIsShowEqualTo(WarehouseConstants.SHOW);
		if (StringUtils.isNotEmpty(input.getKey())) {
			btc.andKeyEqualTo(input.getKey());
		}
		Integer total = (int) billTypeDao.countByExample(bte);

		// 分页查询单据类型
		PagedList<BillTypeOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
		bte.setLimitStart(page.getLimitStart());
		bte.setLimitEnd(page.getLimitEnd());
		List<WareBillType> bts = billTypeDao.selectByExample(bte);
		List<BillTypeOutput> outputs = new ArrayList<>();
		if (!CollectionUtils.isEmpty(bts)) {
			// 查询每个单据类型对应的仓库类型
			for (WareBillType billType : bts) {
				// 拷贝单据类型主表数据到BillTypeOutput
				BillTypeOutput bto = new BillTypeOutput();
				BeanUtils.copyProperties(billType, bto);
				bto.setBillTypeModuleLangLang(billType.getBillTypeModule());
				bto.setKeyLangLang(billType.getKey());
				// 查询对应的仓库类型集合
				WareBilltypeWarehousetypeExample btwte = new WareBilltypeWarehousetypeExample();
				WareBilltypeWarehousetypeExample.Criteria btwtc = btwte.createCriteria();
				btwtc.andBillTypeEqualTo(billType.getKey());
				List<WareBilltypeWarehousetype> btwts = billTypeWarehouseTypeDao.selectByExample(btwte);
				List<KeyOutput> warehouseTypeOutputs = null;
				if (!CollectionUtils.isEmpty(btwts)) {
					// 将仓库类型集合放入单据类型
					warehouseTypeOutputs = new ArrayList<>();
					for (WareBilltypeWarehousetype btwt : btwts) {
						KeyOutput warehouseType = new KeyOutput();
						warehouseType.setKey(btwt.getWarehouseType());
						warehouseType.setKeyLangLang(btwt.getWarehouseType());
						warehouseTypeOutputs.add(warehouseType);
					}
				}
				bto.setWarehouseTypes(warehouseTypeOutputs);
				outputs.add(bto);
			}
		}

		page.getDataList().addAll(outputs);
		return page;
	}

	/**
	 * 查询所有单据类型不包括单据明细
	 */
	@Override
	public List<KeyOutput> getAllBillType() {
		// 查询所有单据类型
		WareBillTypeExample bte = new WareBillTypeExample();
		Criteria btc = bte.createCriteria();
		btc.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		btc.andIsShowEqualTo(WarehouseConstants.SHOW);
		List<WareBillType> billTypes = billTypeDao.selectByExample(bte);

		List<KeyOutput> outputs = null;
		if (!CollectionUtils.isEmpty(billTypes)) {
			outputs = new ArrayList<>();
			for (WareBillType billType : billTypes) {
				KeyOutput billTypeOutput = new KeyOutput();
				billTypeOutput.setKey(billType.getKey());
				billTypeOutput.setKeyLangLang(billType.getKey());
				outputs.add(billTypeOutput);
			}
		}
		return outputs;
	}

	/**
	 * 根据单据类型名称生成单号 若单据类型不存在则抛出RuntimeException
	 * 
	 * @author lishzh
	 * @param billTypeName 单据类型名称
	 * @return billNumber 单号
	 */
	@Override
	public String getBillNumber(String billTypeName) {
		// 根据单据类型名称查询对应的单据类型
		WareBillTypeExample example = new WareBillTypeExample();
		WareBillTypeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andBillTypeNameEqualTo(billTypeName);
		List<WareBillType> billTypes = billTypeDao.selectByExample(example);

		// 根据查询到的单据类型生成单号
		WareBillType billType = billTypes.stream().findFirst()
				.orElseThrow(() -> new RuntimeException("not found bill type"));

		return getBillNumber(billType,getCurrentCompanyKey());
	}
	
	/**
	 * 根据单据类型名称生成单号 若单据类型不存在则抛出RuntimeException
	 * 
	 * @author lishzh
	 * @param billTypeName 单据类型名称
	 * @return billNumber 单号
	 */
	@Override
	public String getBillNumber(String billTypeName,String company) {
		// 根据单据类型名称查询对应的单据类型
		WareBillTypeExample example = new WareBillTypeExample();
		WareBillTypeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andBillTypeNameEqualTo(billTypeName);
		List<WareBillType> billTypes = billTypeDao.selectByExample(example);

		// 根据查询到的单据类型生成单号
		WareBillType billType = billTypes.stream().findFirst()
				.orElseThrow(() -> new RuntimeException("not found bill type"));

		return getBillNumber(billType,company);
	}
	
	/**
	 * 根据单据类型名称生成单号 若单据类型不存在则抛出RuntimeException
	 * 
	 * @author lishzh
	 * @return billNumber 单号
	 */
	@Override
	public String getBillNumberByKey(String key,String company) {
		// 根据单据类型名称查询对应的单据类型
		WareBillTypeExample example = new WareBillTypeExample();
		WareBillTypeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(key);
		List<WareBillType> billTypes = billTypeDao.selectByExample(example);

		// 根据查询到的单据类型生成单号
		WareBillType billType = billTypes.stream().findFirst()
				.orElseThrow(() -> new RuntimeException("not found bill type"));

		return getBillNumber(billType,company);
	}

	/**
	 * 根据单据类型key生成单号
	 *
	 * @param billTypeKey
	 * @return
	 */
	@Override
	public String getBillNumberByKey(String billTypeKey) {

		WareBillTypeExample example = new WareBillTypeExample();
		WareBillTypeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andKeyEqualTo(billTypeKey);
		List<WareBillType> wareBillTypes = billTypeDao.selectByExample(example);

		if (wareBillTypes == null || wareBillTypes.size() < 0) {
			new RuntimeException("insertFail");
		}
		WareBillType billType = wareBillTypes.get(0);

		// 两位单据编号
		String code = billType.getBillTypeCode();

		// 一位地点位置
		String positionCode = productionFeignClient.getPositionCode(getCurrentCompanyKey()).getData();

		// 一位随机数
		Random random = new Random();
		int i = random.nextInt(10);
		String r = String.valueOf(i);

		// 八位日期 yyMMddHH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
		String format = sdf.format(new Date());
		String substring = format.substring(1, format.length());

		// 三位序列号
		Integer autoincrement = billType.getBillAutoincrement() + 1;
		String startZeroStr = String.format("%03d", autoincrement);

		if (autoincrement >= 999) {
			autoincrement = 0;
		}
		String billNumber = code + positionCode + r + substring + startZeroStr;
		billType.setBillAutoincrement(autoincrement);
		billTypeDao.updateByPrimaryKeySelective(billType);
		return billNumber;
	}

	/**
	 * 根据单据类型生成单号
	 *
	 * @author lishzh
	 * @param billType
	 * @return
	 */
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public String getBillNumber(WareBillType billType,String company) {
		// 两位单据编码
		String code = billType.getBillTypeCode();
		// 一位城市编码
		Result<String> result = productionFeignClient.getPositionCode(company);
		if (result == null || StringUtils.isEmpty(result.getData())) {
			throw new RuntimeException("numbers generate fail");
		}
		String cityCode = result.getData();
		// 一位随机数
		String random = String.valueOf(new Random().nextInt(10));
		// 八位日期 yyMMddHH
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHH"));
		// 三位序列号
		Integer autoincrement = billType.getBillAutoincrement() + 1;
		String serialNumber = String.format("%03d", autoincrement);

		String billNumber = code + cityCode + random + date + serialNumber;

		// 更新autoincrement
		
		billType.setBillAutoincrement(autoincrement);
		billTypeDao.updateByPrimaryKeySelective(billType);

		return billNumber;
	}

	/**
	 * 根据单据类型名获取对应key
	 */
	@Override
	public String getBillTypeKeyByName(String billTypeName) {
		if (StringUtils.isEmpty(billTypeName)) {
			return null;
		}
		WareBillTypeExample example = new WareBillTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andBillTypeNameEqualTo(billTypeName);
		criteria.andIsDelEqualTo(PlatformConstants.IS_ADMIN_NO);
		List<WareBillType> billTypes = billTypeDao.selectByExample(example);
		if (CollectionUtils.isEmpty(billTypes)) {
			return null;
		}
		return billTypes.get(0).getKey();
	}
	
	/**
	 * 单据类型名称重复校验
	 */
	@Override
	public boolean nameDuplicateValid(String billTypeName) {
		WareBillTypeExample example = new WareBillTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andBillTypeNameEqualTo(billTypeName);
		criteria.andIsDelEqualTo(PlatformConstants.IS_ADMIN_NO);
		return !billTypeDao.selectByExample(example).isEmpty();
	}

	/**
	 * 根据单据类型获取可选仓库类型
	 *
	 * @param billType 单据类型key
	 * @author lishzh
	 */
	@Override
	public List<WarehouseTypeOutput> getWarehouseTypesByBill(String billType) {
		WareBilltypeWarehousetypeExample example=new WareBilltypeWarehousetypeExample();
		example.createCriteria().andBillTypeEqualTo(billType);
		return billTypeWarehouseTypeDao.selectByExample(example).stream().map(btwt -> {
			WarehouseTypeOutput output=new WarehouseTypeOutput();
			output.setKey(btwt.getWarehouseType());
			return output;
		}).collect(Collectors.toList());
	}
}
