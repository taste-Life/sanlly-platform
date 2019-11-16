package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CodeCorrespondingMapper;
import com.sanlly.production.dao.DamageMapper;
import com.sanlly.production.dao.PartsRepairTypeMapper;
import com.sanlly.production.entity.CodeCorresponding;
import com.sanlly.production.entity.CodeCorrespondingExample;
import com.sanlly.production.entity.Damage;
import com.sanlly.production.entity.DamageExample;
import com.sanlly.production.entity.PartsRepairType;
import com.sanlly.production.entity.PartsRepairTypeExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.rate.AddCode;
import com.sanlly.production.models.input.rate.SearchRateCodeInput;
import com.sanlly.production.models.input.rate.UpdateCode;
import com.sanlly.production.models.output.rate.GetCodeMessageOutput;
import com.sanlly.production.models.output.rate.SearchRateCodeOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.service.RateCodeService;

/**
 * 代码对应实现类
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月27日 上午11:25:52 
 * @version V1.0   
 */
@Service
public class RateCodeServiceImpl extends BaseServiceImpl implements RateCodeService {

	@Autowired
	private CodeCorrespondingMapper codeMapper;

	@Autowired
	private PartsRepairTypeMapper partsRepairTypeMapper;

	@Autowired
	private DamageMapper damageMapper;

	/**
	 * 列表查询
	 */
	@Override
	public PagedList<SearchRateCodeOutput> getRateCodePagedList(SearchRateCodeInput input) {
		// 组装查询条件
		CodeCorrespondingExample example = new CodeCorrespondingExample();
		// 排序
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory()))
			example.setOrderByClause("parts_type_code");
		else
			example.setOrderByClause("position_code");
		CodeCorrespondingExample.Criteria criteria = example.createCriteria();
		// 非删状态
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 查询条件
		if (StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		if (StringUtils.isNotEmpty(input.getPartsDetails())) {
			criteria.andPartsDetailsCodeEqualTo(input.getPartsDetails());
		}
		if (StringUtils.isNotEmpty(input.getRepair())) {
			criteria.andRepairCodeEqualTo(input.getRepair());
		}
		// 总条数
		Integer totalItemCount = (int) codeMapper.countByExample(example);
		PagedList<SearchRateCodeOutput> pagedList = new PagedList<SearchRateCodeOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<CodeCorresponding> codeList = codeMapper.selectByExample(example);
		// 构造返回数据
		List<SearchRateCodeOutput> dataList = new ArrayList<SearchRateCodeOutput>();
		for (CodeCorresponding item : codeList) {
			SearchRateCodeOutput model = new SearchRateCodeOutput();
			model.setCodeId(item.getProdCodeCorrespondingId());
			model.setContainerCategoryLang(item.getContainerCategory()); // 箱类型
			model.setPositionCode(codeAssemble(item.getPositionCode())); // 位置代码
			model.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
			model.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
			model.setRepairCode(codeAssemble(item.getRepairCode())); // 维修代码
			model.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
			model.setPartsRepairTypeLang(item.getPartsRepairType()); // 部件修理分类
			model.setDamageCode(codeAssemble(item.getDamageCode())); // 损坏代码
			model.setMaterialCode(codeAssemble(item.getMaterialCode())); // 材质代码
			model.setSelectMaterialCode(item.getSelectMaterialCode()); // 默认材质代码
			dataList.add(model);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
	 * 替换code中的字符"[]"为"/"
	 * 
	 * @Description: TODO
	 * @param code
	 * @return String @throws 
	 */
	private String codeAssemble(String code) {
		if (StringUtils.isNotEmpty(code)) {
			// 判断code是否包含"["
			if (code.indexOf("[") > -1) {
				// 将"["替换为"",将"]"替换为"/"
				code = code.replaceAll("\\[", "").replaceAll("\\]", "/");
				// 删除最后一个字符"/"
				code = code.substring(0, code.length() - 1);
				return code;
			}
		}
		return code;
	}

	/**
	 * 部件修理分类
	 */
	@Override
	public List<SelectItemOutput> getPartsRepairTypeList() {
		PartsRepairTypeExample example = new PartsRepairTypeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<PartsRepairType> list = partsRepairTypeMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 损坏代码下拉
	 */
	@Override
	public List<SelectItemOutput> getDamageCodeList() {
		DamageExample example = new DamageExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Damage> list = damageMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getDamageCode());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 代码对应新增
	 */
	@Override
	public void addCode(AddCode input) {
		CodeCorresponding model = new CodeCorresponding();
		model.setContainerCategory(input.getContainerCategory()); // 箱类别
		model.setPositionCode(codeAssembleAdd(input.getPositionCode())); // 位置代码
		model.setPartsTypeCode(input.getPartsTypeCode()); // 部件大类
		model.setPartsDetailsCode(input.getPartsDetailsCode().toUpperCase()); // 部件明细
		model.setRepairCode(input.getRepairCode()); // 维修代码
		model.setPartsRepairCode(input.getPartsRepairCode().toUpperCase()); // 部件维修代码
		model.setPartsRepairType(input.getPartsRepairType()); // 部件修理类型
		model.setDamageCode(damageCodeToString(input.getDamageCode())); // 损坏代码
		if (input.getMaterialCode() != null)
			model.setMaterialCode(damageCodeToString(input.getMaterialCode())); // 材质代码
		model.setSelectMaterialCode(input.getSelectMaterialCode()); // 默认材质代码
		model.setIsGz(input.getIsGuangZhou()); // 广州使用
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		codeMapper.insert(model);
	}

	/**
	 * code处理
	 * 
	 * @Description: TODO
	 * @param code
	 * @return String @throws 
	 */
	private String codeAssembleAdd(String code) {
		if (StringUtils.isNotEmpty(code)) {
			// 根据'/'分割
			String[] codeList = code.split("/");
			code = "";
			for (String item : codeList) {
				code += "[" + item.toUpperCase() + "]";
			}
		}
		return code;
	}

	/**
	 * 处理损坏代码
	 * 
	 * @Description: TODO
	 * @param codeList
	 * @return String @throws 
	 */
	private String damageCodeToString(List<SelectItemOutput> codeList) {
		String code = "";
		for (SelectItemOutput item : codeList) {
			code += "[" + item.getValue().toUpperCase() + "]";
		}
		return code;
	}

	/**
	 * 获取代码对应信息
	 */
	@Override
	public GetCodeMessageOutput getUpdateCode(Integer codeId) {
		CodeCorresponding code = codeMapper.selectByPrimaryKey(codeId);
		if (code.getIsDel().equals(PlatformConstants.IS_ADMIN_NO)) {
			GetCodeMessageOutput model = new GetCodeMessageOutput();
			model.setCodeId(code.getProdCodeCorrespondingId()); // 主键
			model.setContainerCategory(code.getContainerCategory()); // 箱类别
			model.setPositionCode(codeAssemble(code.getPositionCode())); // 位置代码
			model.setPartsTypeCode(code.getPartsTypeCode()); // 部件大类
			model.setPartsDetailsCode(code.getPartsDetailsCode()); // 部件明细
			model.setRepairCode(code.getRepairCode()); // 维修代码
			model.setPartsRepairCode(code.getPartsRepairCode()); // 部件维修代码
			model.setPartsRepairType(code.getPartsRepairType()); // 部件修理类型
			model.setDamageCode(damageCodeToList(code.getDamageCode())); // 损坏代码
			model.setMaterialCode(damageCodeToList(code.getMaterialCode())); // 材质代码
			model.setSelectMaterialCode(code.getSelectMaterialCode()); // 默认材质代码
			model.setIsGuangZhou(code.getIsGz()); // 广州使用
			return model;
		}
		return null;
	}

	/**
	 * 损坏代码转为list
	 * 
	 * @Description: TODO
	 * @param code
	 * @return List<SelectItemOutput> @throws 
	 */
	private List<SelectItemOutput> damageCodeToList(String code) {
		List<SelectItemOutput> list = new ArrayList<SelectItemOutput>();
		if (StringUtils.isNotEmpty(code)) {
			// 将分割符转为"/"
			code = codeAssemble(code);
			String[] codeList = code.split("/");
			for (String item : codeList) {
				SelectItemOutput model = new SelectItemOutput();
				model.setValue(item);
				model.setLabelLang(item);
				list.add(model);
			}
		}
		return list;
	}

	/**
	 * 代码对应编辑
	 */
	@Override
	public void updateCode(UpdateCode input) {
		CodeCorresponding model = codeMapper.selectByPrimaryKey(input.getCodeId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setContainerCategory(input.getContainerCategory()); // 箱类别
			model.setPositionCode(codeAssembleAdd(input.getPositionCode())); // 位置代码
			model.setPartsTypeCode(input.getPartsTypeCode()); // 部件大类
			model.setPartsDetailsCode(input.getPartsDetailsCode().toUpperCase()); // 部件明细
			model.setRepairCode(input.getRepairCode()); // 维修代码
			model.setPartsRepairCode(input.getPartsRepairCode().toUpperCase()); // 部件维修代码
			model.setPartsRepairType(input.getPartsRepairType()); // 部件修理类型
			model.setDamageCode(damageCodeToString(input.getDamageCode())); // 损坏代码
			if (input.getMaterialCode() != null)
				model.setMaterialCode(damageCodeToString(input.getMaterialCode())); // 材质代码
			model.setSelectMaterialCode(input.getSelectMaterialCode()); // 默认材质代码
			model.setIsGz(input.getIsGuangZhou()); // 广州使用
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			codeMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * 代码对应删除
	 */
	@Override
	public void delCode(Integer[] listIds) {
		CodeCorrespondingExample example = new CodeCorrespondingExample();
		example.createCriteria().andProdCodeCorrespondingIdIn(Arrays.asList(listIds));
		CodeCorresponding model = new CodeCorresponding();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		// 批量删除
		codeMapper.updateByExampleSelective(model, example);
	}

}
