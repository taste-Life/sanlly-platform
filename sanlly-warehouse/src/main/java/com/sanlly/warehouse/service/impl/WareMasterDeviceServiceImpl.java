package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WareMasterDeviceMapper;
import com.sanlly.warehouse.dao.WareMasterSparePartsMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.models.input.masterdevice.AddMasterDeviceInput;
import com.sanlly.warehouse.models.input.masterdevice.AddMasterDeviceSparePartsRelation;
import com.sanlly.warehouse.models.input.masterdevice.EditMasterDeviceInput;
import com.sanlly.warehouse.models.input.masterdevice.SearchMasterDeviceInput;
import com.sanlly.warehouse.models.output.masterdevice.MasterDeviceOutput;
import com.sanlly.warehouse.models.output.masterdevice.SelectItemOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.service.WareMasterDeviceService;
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
 * ClassName: WareMasterDeviceServiceImpl Description: 主件服务层实现类 date: 2019/7/24
 * 16:21
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareMasterDeviceServiceImpl extends BaseServiceImpl implements WareMasterDeviceService {

	@Autowired
	private WareMasterDeviceMapper wareMasterDeviceMapper;

	@Autowired
	private WareMasterSparePartsMapper wareMasterSparePartsMapper;

	@Autowired
	private WareSparePartsMapper wareSparePartsMapper;

	private String wareMasterDevice = "ware_master_device";

	/**
	 * 主件列表查询
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<MasterDeviceOutput> getMasterDevicePageList(SearchMasterDeviceInput input) {
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		WareMasterDeviceExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");

		// 查询条件
		if (input.getMasterDeviceName() != null && input.getMasterDeviceName() != "") {
			criteria.andMasterDeviceNameLike("%" + input.getMasterDeviceName() + "%");
		}
		if (input.getMasterDeviceNameEn() != null && input.getMasterDeviceNameEn() != "") {
			criteria.andMasterDeviceNameEnLike("%" + input.getMasterDeviceNameEn() + "%");
		}
		if (input.getMasterDeviceNo() != null && input.getMasterDeviceNo() != "") {
			criteria.andMasterDeviceNoLike("%" + input.getMasterDeviceNo() + "%");
		}

		Integer totalItemCount = (int) wareMasterDeviceMapper.countByExample(example);
		PagedList<MasterDeviceOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);

		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());

		List<WareMasterDevice> masterDeviceList = wareMasterDeviceMapper.selectByExample(example);
		// 结构返回数据

		List<MasterDeviceOutput> outputs = new ArrayList<>();
		for (WareMasterDevice wareMasterDevice : masterDeviceList) {
			MasterDeviceOutput output = new MasterDeviceOutput();
			BeanUtils.copyProperties(wareMasterDevice, output);
			output.setKeyLangLang(wareMasterDevice.getKey());
			output.setDefaultSpareLangLang(wareMasterDevice.getDefaultSpare());
			output.setDetailList(getSparePartsPageListByMasterDeice(wareMasterDevice.getMasterDeviceNo()));
			outputs.add(output);
		}
		pagedList.getDataList().addAll(outputs);
		return pagedList;
	}

	/**
	 * 主件查询
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public MasterDeviceOutput getMasterDeviceDetail(EditMasterDeviceInput input) {
		// 组装查询条件
		WareMasterDevice masterDevice = new WareMasterDevice();
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		WareMasterDeviceExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (input.getWareMasterDeviceId() != null) {
			masterDevice.setWareMasterDeviceId(input.getWareMasterDeviceId());
		}
		if (input.getKey() != null && input.getKey() != "") {
			masterDevice.setKey(input.getKey());
		}
		// 组装返回数据
		List<WareMasterDevice> masterDeviceList = wareMasterDeviceMapper.selectByExample(example);
		MasterDeviceOutput output = new MasterDeviceOutput();
		WareMasterDevice master = masterDeviceList.get(0);
		BeanUtils.copyProperties(master, output);
		output.setKeyLangLang(master.getKey());
		output.setDefaultSpareLangLang(master.getDefaultSpare());
		return output;
	}

	/**
	 * 新增主件
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void addMasterDevice(AddMasterDeviceInput input) {
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		WareMasterDeviceExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andMasterDeviceNameEqualTo(input.getMasterDeviceName());
		List<WareMasterDevice> wareUnits = wareMasterDeviceMapper.selectByExample(example);
		if (wareUnits.size() > 0) {
			throw new RuntimeException("isExist");
		}

		Result<String> result = productionService.getKey(wareMasterDevice);
		if (result == null || StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareMasterDevice masterDevice = new WareMasterDevice();
		BeanUtils.copyProperties(input, masterDevice);
		masterDevice.setDefaultSpare(input.getDefaultSpare());
		masterDevice.setIsDel(PlatformConstants.ISDEL_NO);
		masterDevice.setKey(result.getData());
		masterDevice.setCreateTime(new Date());
		masterDevice.setCreateUser(getCurrentUserId());

		WareMasterSpareParts msp = new WareMasterSpareParts();
		for (String s : input.getMasterDeviceDetail()) {
			msp.setIsDel(PlatformConstants.ISDEL_NO);
			msp.setCreateUser(getCurrentUserId());
			msp.setCreateTime(new Date());
			msp.setMasterDevice(masterDevice.getMasterDeviceNo());
			msp.setSpareParts(s);
			wareMasterSparePartsMapper.insert(msp);
		}

		wareMasterDeviceMapper.insert(masterDevice);
	}

	/**
	 * 修改主件
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void updateMasterDevice(EditMasterDeviceInput input) {
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		WareMasterDeviceExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andMasterDeviceNameEqualTo(input.getMasterDeviceName());
		List<WareMasterDevice> wareUnits = wareMasterDeviceMapper.selectByExample(example);
		if (wareUnits.size() > 0) {
			if (!wareUnits.get(0).getWareMasterDeviceId().equals(input.getWareMasterDeviceId())) {
				throw new RuntimeException("isExist");
			}
		}
		example.clear();
		WareMasterDeviceExample.Criteria criteria1 = example.createCriteria();
		criteria1.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria1.andMasterDeviceNoEqualTo(input.getMasterDeviceNo());
		List<WareMasterDevice> masterDeviceList = wareMasterDeviceMapper.selectByExample(example);
		if (masterDeviceList.size() > 0) {
			if (!masterDeviceList.get(0).getWareMasterDeviceId().equals(input.getWareMasterDeviceId())) {
				throw new RuntimeException("isExist");
			}
		}

		WareMasterDevice masterDevice = new WareMasterDevice();
		BeanUtils.copyProperties(input, masterDevice);
		masterDevice.setDefaultSpare(input.getDefaultSpare());
		masterDevice.setUpdateTime(new Date());
		masterDevice.setUpdateUser(getCurrentUserId());

		WareMasterSparePartsExample mspExample = new WareMasterSparePartsExample();
		WareMasterSparePartsExample.Criteria mspCriteria = mspExample.createCriteria();
		mspCriteria.andMasterDeviceEqualTo(input.getMasterDeviceNo());
		WareMasterSpareParts msp = new WareMasterSpareParts();
		msp.setIsDel(PlatformConstants.ISDEL_YES);
		wareMasterSparePartsMapper.updateByExampleSelective(msp, mspExample);
		if (input.getMasterDeviceDetail() != null) {
			for (String s : input.getMasterDeviceDetail()) {
				msp.setIsDel(PlatformConstants.ISDEL_NO);
				msp.setCreateUser(getCurrentUserId());
				msp.setCreateTime(new Date());
				msp.setMasterDevice(masterDevice.getMasterDeviceNo());
				msp.setSpareParts(s);
				wareMasterSparePartsMapper.insert(msp);
			}
		}

		wareMasterDeviceMapper.updateByPrimaryKeySelective(masterDevice);
	}

	/**
	 * 批量删除主件
	 * 
	 * @param masterDeviceIds
	 */
	@Override
	@Transactional
	public void deleteMasterDevice(Integer[] masterDeviceIds) {
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		example.createCriteria().andWareMasterDeviceIdIn(Arrays.asList(masterDeviceIds));

		List<WareMasterDevice> masterDeviceList = wareMasterDeviceMapper.selectByExample(example);
		List<String> mKeyList = new ArrayList<>();
		for (WareMasterDevice masterDevice : masterDeviceList) {
			mKeyList.add(masterDevice.getMasterDeviceNo());
		}
		WareMasterSparePartsExample mspExample = new WareMasterSparePartsExample();
		WareMasterSparePartsExample.Criteria mspCriteria = mspExample.createCriteria();
		mspCriteria.andMasterDeviceIn(mKeyList);
		WareMasterSpareParts msp = new WareMasterSpareParts();
		msp.setIsDel(PlatformConstants.ISDEL_YES);
		msp.setUpdateTime(new Date());
		msp.setUpdateUser(getCurrentUserId());
		wareMasterSparePartsMapper.updateByExampleSelective(msp, mspExample);

		WareMasterDevice masterDevice = new WareMasterDevice();
		masterDevice.setIsDel(PlatformConstants.ISDEL_YES);
		masterDevice.setUpdateTime(new Date());
		masterDevice.setUpdateUser(getCurrentUserId());
		wareMasterDeviceMapper.updateByExampleSelective(masterDevice, example);
	}

	/**
	 * 添加主件备件关系
	 * 
	 * @param list
	 */
	@Override
	@Transactional
	public void addMasterDeviceSparePartsRelation(List<AddMasterDeviceSparePartsRelation> list) {
		for (AddMasterDeviceSparePartsRelation masterDeviceSparePartsRelation : list) {
			WareMasterSpareParts wareMasterSpareParts = new WareMasterSpareParts();
			BeanUtils.copyProperties(masterDeviceSparePartsRelation, wareMasterSpareParts);
			wareMasterSpareParts.setMasterDevice(masterDeviceSparePartsRelation.getMasterDevice());
			wareMasterSpareParts.setSpareParts(masterDeviceSparePartsRelation.getSpareParts());
			wareMasterSpareParts.setIsDel(PlatformConstants.ISDEL_NO);
			wareMasterSpareParts.setCreateTime(new Date());
			wareMasterSpareParts.setCreateUser(getCurrentUserId());
			wareMasterSparePartsMapper.insert(wareMasterSpareParts);
		}
	}

	/**
	 * 根据ID批量删除主件备件关系
	 * 
	 * @param ids
	 */
	@Override
	@Transactional
	public void deleteMasterDeviceSparePartsRelation(Integer[] ids) {
		WareMasterSparePartsExample example = new WareMasterSparePartsExample();
		example.createCriteria().andWareMasterSparePartsIdIn(Arrays.asList(ids));
		WareMasterSpareParts wareMasterSpareParts = new WareMasterSpareParts();
		wareMasterSpareParts.setIsDel(PlatformConstants.ISDEL_YES);
		wareMasterSpareParts.setUpdateTime(new Date());
		wareMasterSpareParts.setCreateUser(getCurrentUserId());
		wareMasterSparePartsMapper.updateByExampleSelective(wareMasterSpareParts, example);
	}

	/**
	 * 根据主件号查询所属备件
	 * 
	 * @param no
	 * @return
	 */
	@Override
	public List<SparePartsOutput> getSparePartsPageListByMasterDeice(String no) {
		// 组装查询条件
		WareMasterSparePartsExample example = new WareMasterSparePartsExample();
		WareMasterSparePartsExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andMasterDeviceEqualTo(no);
		// 组装返回数据
		List<SparePartsOutput> outputs = new ArrayList<>();
		List<WareMasterSpareParts> wareMasterSpareParts = wareMasterSparePartsMapper.selectByExample(example);
		if (wareMasterSpareParts.size() != 0) {
			List<String> sparePartsNo = new ArrayList<>();
			for (WareMasterSpareParts wareMasterSparePart : wareMasterSpareParts) {
				sparePartsNo.add(wareMasterSparePart.getSpareParts());
			}
			// 组装备件列表
			WareSparePartsExample exampleSpareParts = new WareSparePartsExample();
			WareSparePartsExample.Criteria criteriaSpareParts = exampleSpareParts.createCriteria();
			criteriaSpareParts.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteriaSpareParts.andSparePartsNoIn(sparePartsNo);

			List<WareSpareParts> wareSpareParts = wareSparePartsMapper.selectByExample(exampleSpareParts);

			for (WareSpareParts wareSparePart : wareSpareParts) {
				SparePartsOutput output = new SparePartsOutput();
				BeanUtils.copyProperties(wareSparePart, output);
				output.setKeyLangLang(wareSparePart.getKey());
				output.setManufactureLangLang(wareSparePart.getManufacture());
				output.setQuoteCurrencyLangLang(wareSparePart.getQuoteCurrency());
				output.setDefaultWarehouseTypeLangLang(wareSparePart.getDefaultWarehouseType());
				output.setSparePartsCategoriesLangLang(wareSparePart.getSparePartsCategories());
				output.setSparePartsUnitLangLang(wareSparePart.getSparePartsUnit());
				output.setSparePartsCategoriesDetailsLangLang(wareSparePart.getSparePartsCategoriesDetails());
				output.setComponentDetails(wareSparePart.getComponentDetails());
				outputs.add(output);
			}
		}

		return outputs;
	}

	/**
	 * 根据主件号查询所属备件
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public String getSparesByDevice(EditMasterDeviceInput input) {
		// 组装查询条件
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andMasterDeviceNoEqualTo(input.getKey());
		List<WareMasterDevice> deviceList = wareMasterDeviceMapper.selectByExample(example);
		if (deviceList.size() > 0) {
			return deviceList.get(0).getDefaultSpare();
		}
		return null;
	}

	/**
	 * 根据主件号查询备件号列表
	 * 
	 * @param masterDeviceNo
	 * @return
	 */
	@Override
	public List<String> getSPListByMDNo(String masterDeviceNo) {
		WareMasterSparePartsExample example = new WareMasterSparePartsExample();
		WareMasterSparePartsExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andMasterDeviceEqualTo(masterDeviceNo);
		// 组装返回数据
		List<String> outputs = new ArrayList<>();
		List<WareMasterSpareParts> wareMasterSpareParts = wareMasterSparePartsMapper.selectByExample(example);
		for (WareMasterSpareParts wareMasterSparePart : wareMasterSpareParts) {
            outputs.add(wareMasterSparePart.getSpareParts());
		}

		return outputs;
	}

	/**
	 * 查询主件列表
	 * 
	 * @return
	 */
	@Override
	public List<SelectItemOutput> getList() {
		List<SelectItemOutput> outputs = new ArrayList<>();
		WareMasterDeviceExample example = new WareMasterDeviceExample();
		List<WareMasterDevice> masterDeviceList = wareMasterDeviceMapper.selectByExample(example);
		for (WareMasterDevice masterDevice : masterDeviceList) {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(masterDevice.getKey());
			output.setLabelLang(masterDevice.getMasterDeviceNo());
			output.setCode(masterDevice.getMasterDeviceNo());
			outputs.add(output);
		}
		return outputs;
	}
}
