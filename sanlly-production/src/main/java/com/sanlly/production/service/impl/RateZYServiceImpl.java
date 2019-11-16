package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.ManhourRateMapper;
import com.sanlly.production.dao.RateMapper;
import com.sanlly.production.dao.ZyRateMapper;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.ManhourRate;
import com.sanlly.production.entity.ManhourRateExample;
import com.sanlly.production.entity.Rate;
import com.sanlly.production.entity.RateExample;
import com.sanlly.production.entity.ZyRate;
import com.sanlly.production.entity.ZyRateExample;
import com.sanlly.production.enums.RateCommonEnum;
import com.sanlly.production.enums.RateCurrencyEnum;
import com.sanlly.production.models.input.rate.AddZYRateInput;
import com.sanlly.production.models.input.rate.CopyZYRateInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.rate.SearchZYRateInput;
import com.sanlly.production.models.input.rate.UpdateZYRateInput;
import com.sanlly.production.models.input.rate.ZyFiveInput;
import com.sanlly.production.models.output.rate.SearchZYRateOutput;
import com.sanlly.production.models.output.rate.ZYFiveRateOutput;
import com.sanlly.production.models.output.rate.ZYRateOutput;
import com.sanlly.production.models.output.rate.ZySelectOutput;
import com.sanlly.production.service.RateZYService;

/**
 * 中远费率实现类
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月20日 下午1:20:24 
 * @version V1.0   
 */
@Service
public class RateZYServiceImpl extends BaseServiceImpl implements RateZYService {

	@Autowired
	private ZyRateMapper zyRateMapper;

	@Autowired
	private ContainerUserMapper containerUserMapper;

	@Autowired
	private ManhourRateMapper manhourRateMapper;

	@Autowired
	private RateMapper rateMapper;

	/**
	 * 中远费率列表
	 */
	@Override
	public PagedList<SearchZYRateOutput> getZYRatePagedList(SearchZYRateInput input) {
		ZyRateExample zyExample = new ZyRateExample();
		// 按创建时间排序
		zyExample.setOrderByClause("create_time DESC");
		ZyRateExample.Criteria criteria = zyExample.createCriteria();
		// 非删状态
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 查询条件
		if (StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if (StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		if (StringUtils.isNotEmpty(input.getRateCode())) {
			criteria.andCosRateCodeLike("%" + input.getRateCode() + "%");
		}
		if (StringUtils.isNotEmpty(input.getPartsDetails())) {
			criteria.andPartsDetailsCodeLike("%" + input.getPartsDetails() + "%");
		}
		if (StringUtils.isNotEmpty(input.getRepair())) {
			criteria.andRepairCodeEqualTo(input.getRepair());
		}
		// 总条数
		Integer totalItemCount = (int) zyRateMapper.countByExample(zyExample);
		PagedList<SearchZYRateOutput> pagedList = new PagedList<SearchZYRateOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		zyExample.setLimitStart(pagedList.getLimitStart());
		zyExample.setLimitEnd(pagedList.getLimitEnd());
		List<ZyRate> zylist = zyRateMapper.selectByExample(zyExample);
		// 构造返回数据
		List<SearchZYRateOutput> list = new ArrayList<SearchZYRateOutput>();
		for (ZyRate item : zylist) {
			SearchZYRateOutput rate = new SearchZYRateOutput();
			rate.setZyRateId(item.getProdZyRateId());
			rate.setCompanyLang(item.getCompany()); // 地点
			rate.setContainerCategoryLang(item.getContainerCategory()); // 箱类别
			rate.setRateCode(item.getCosRateCode()); // 费率编码
			rate.setPartsType(item.getPartsTypeCode()); // 部件大类
			rate.setPartsDetails(item.getPartsDetailsCode()); // 部件明细
			rate.setRepair(item.getRepairCode()); // 维修代码
			rate.setMaterial(item.getMaterialCode()); // 材质代码
			rate.setCalculationTypeLang(item.getCalculationType()); // 算法
			rate.setLength(item.getLength()); // 长
			rate.setWidth(item.getWidth()); // 宽
			rate.setQuantity(item.getQuantity()); // 数量
			rate.setPositionCode(item.getPositionCode()); // 位置代码
			rate.setSizeLang(item.getSize()); // 箱尺寸
			rate.setContainerTypeLang(item.getContainerType()); // 箱型
			rate.setCosPartsCode(item.getCosPartsCode()); // 中远部件编码
			rate.setCosRepairCode(item.getCosRepairCode()); // 中远维修代码
			rate.setManHour(item.getManHour()); // 工时
			rate.setMaterialCost(item.getMaterialCost()); // 材料费
			list.add(rate);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(list);
		return pagedList;
	}

	/**
	 * 中远费率新增
	 */
	@Override
	public void addZYRate(AddZYRateInput input) {
		ZyRate model = new ZyRate();
		model.setProdZyRateId(UUID.randomUUID().toString());
		model.setCompany(input.getRateCompany());// 地点
		model.setContainerCategory(input.getContainerCategory());// 类型
		model.setCosRateCode(input.getRateCode());// 费率代码
		model.setCosPartsCode(input.getCosPartsCode());// 中远部件
		model.setCosRepairCode(input.getCosRepairCode());// 中远修理
		model.setCalculationType(input.getCalculationType());// 算法依据
		model.setPartsTypeCode(input.getPartsType());// 部件大类
		model.setPartsDetailsCode(input.getPartsDetails().toUpperCase());// 部件明细
		model.setRepairCode(input.getRepair());// 修理代码
		model.setMaterialCode(input.getMaterial());// 材质
		model.setSize(input.getSize());// 尺寸
		model.setContainerType(input.getContainerType());// 箱型
		if (StringUtils.isNotEmpty(input.getPositionCode()))
			model.setPositionCode(input.getPositionCode().toUpperCase());// 位置代码
		model.setLength(input.getLength());// 长
		model.setWidth(input.getWidth());// 宽
		model.setQuantity(input.getQuantity());// 数量
		model.setManHour(input.getManHour());// 工时
		model.setMaterialCost(input.getMaterialCost());// 材料费
		model.setIsRepeatPrompts(input.getIsRepeatPrompts()); // 重复条目是否提示
		model.setIsMustPhoto(input.getIsMustPhoto()); // 是否必传图片
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		zyRateMapper.insert(model);
	}

	/**
	 * 获取中远费率单条信息
	 */
	@Override
	public ZYRateOutput getZYRate(String rateId) {
		ZyRate rate = zyRateMapper.selectByPrimaryKey(rateId);
		if (rate.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			ZYRateOutput model = new ZYRateOutput();
			model.setRateId(rate.getProdZyRateId());
			model.setRateCompany(rate.getCompany());// 地点
			model.setContainerCategory(rate.getContainerCategory());// 类型
			model.setRateCode(rate.getCosRateCode());// 费率代码
			model.setCosPartsCode(rate.getCosPartsCode());// 中远部件
			model.setCosRepairCode(rate.getCosRepairCode());// 中远修理
			model.setCalculationType(rate.getCalculationType());// 算法依据
			model.setPartsType(rate.getPartsTypeCode());// 部件大类
			model.setPartsDetails(rate.getPartsDetailsCode());// 部件明细
			model.setRepair(rate.getRepairCode());// 修理代码
			model.setMaterial(rate.getMaterialCode());// 材质
			model.setSize(rate.getSize());// 尺寸
			model.setContainerType(rate.getContainerType());// 箱型
			model.setPositionCode(rate.getPositionCode());// 位置代码
			model.setLength(rate.getLength());// 长
			model.setWidth(rate.getWidth());// 宽
			model.setQuantity(rate.getQuantity());// 数量
			model.setManHour(rate.getManHour());// 工时
			model.setMaterialCost(rate.getMaterialCost());// 材料费
			model.setIsRepeatPrompts(rate.getIsRepeatPrompts()); // 重复条目是否提示
			model.setIsMustPhoto(rate.getIsMustPhoto()); // 是否必传图片
			return model;
		}
		return null;
	}

	/**
	 * 编辑中远费率
	 */
	@Override
	public void updateZYRate(UpdateZYRateInput input) {
		ZyRate rate = zyRateMapper.selectByPrimaryKey(input.getRateId());
		if (PlatformConstants.ISDEL_NO.equals(rate.getIsDel())) {
			rate.setProdZyRateId(input.getRateId());
			rate.setCompany(input.getRateCompany());// 地点
			rate.setContainerCategory(input.getContainerCategory());// 类型
			rate.setCosRateCode(input.getRateCode());// 费率代码
			rate.setCosPartsCode(input.getCosPartsCode());// 中远部件
			rate.setCosRepairCode(input.getCosRepairCode());// 中远修理
			rate.setCalculationType(input.getCalculationType());// 算法依据
			rate.setPartsTypeCode(input.getPartsType());// 部件大类
			rate.setPartsDetailsCode(input.getPartsDetails().toUpperCase());// 部件明细
			rate.setRepairCode(input.getRepair());// 修理代码
			rate.setMaterialCode(input.getMaterial());// 材质
			rate.setSize(input.getSize());// 尺寸
			rate.setContainerType(input.getContainerType());// 箱型
			if (StringUtils.isNotEmpty(input.getPositionCode()))
				rate.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
			rate.setLength(input.getLength()); // 长
			rate.setWidth(input.getWidth());// 宽
			rate.setQuantity(input.getQuantity());// 数量
			rate.setManHour(input.getManHour());// 工时
			rate.setMaterialCost(input.getMaterialCost());// 材料费
			rate.setIsRepeatPrompts(input.getIsRepeatPrompts()); // 重复条目是否提示
			rate.setIsMustPhoto(input.getIsMustPhoto()); // 是否必传图片
			rate.setUpdateUser(getCurrentUserId());
			rate.setUpdateTime(new Date());
			zyRateMapper.updateByPrimaryKey(rate);
			return;
		}
		throw new InvalidException("编辑失败");

	}

	/**
	 * 批量删除中远费率
	 */
	@Override
	public void delZYRate(String[] rateIds) {
		ZyRateExample example = new ZyRateExample();
		example.createCriteria().andProdZyRateIdIn(Arrays.asList(rateIds));
		ZyRate model = new ZyRate();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		zyRateMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 中远费率复制
	 */
	@Override
	public void copyZYRate(CopyZYRateInput input) {
		// 查询旧地点费率
		ZyRateExample example = new ZyRateExample();
		ZyRateExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(input.getOldCompany());
		if (StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		List<ZyRate> list = zyRateMapper.selectByExample(example);
		Integer userId = getCurrentUserId();
		for (ZyRate item : list) {
			item.setProdZyRateId(null);
			item.setCompany(input.getNewCompany());
			item.setCreateUser(userId);
			item.setCreateTime(new Date());
			if (StringUtils.isNotEmpty(input.getContainerCategory()))
				item.setContainerCategory(input.getContainerCategory());
			zyRateMapper.insert(item);
		}
	}

	/**
	 * 判断改地点是否已存在费率
	 */
	@Override
	public Boolean isExist(String company) {
		ZyRateExample example = new ZyRateExample();
		example.createCriteria().andCompanyEqualTo(company).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		Integer count = (int) zyRateMapper.countByExample(example);
		if (count > 0)
			return false;
		return true;
	}

	/**
	 * 判断费率代码是否已存在
	 */
	@Override
	public Boolean isExistCode(String code, String rateId) {
		ZyRateExample example = new ZyRateExample();
		ZyRateExample.Criteria criteria = example.createCriteria();
		criteria.andCosRateCodeEqualTo(code).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (rateId != null) {
			criteria.andProdZyRateIdNotEqualTo(rateId);
		}
		Integer count = (int) zyRateMapper.countByExample(example);
		if (count > 0)
			return false;
		return true;
	}

	/**
	 * 中远五位代码
	 */
	@Override
	public ZYFiveRateOutput getZYFiveMessage(ZyFiveInput input) {
		ZyRateExample example = new ZyRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCosRateCodeEqualTo(input.getFiveCode())
				.andCompanyEqualTo(input.getCompany());
		List<ZyRate> rateList = zyRateMapper.selectByExample(example);
		ZYFiveRateOutput model = new ZYFiveRateOutput();
		// 如果没有查到相对应的五位代码，则提示
		if (rateList.size() < 1) {
			// 使用青岛地点
			ZyRateExample example1 = new ZyRateExample();
			example1.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCosRateCodeEqualTo(input.getFiveCode())
					.andCompanyEqualTo(RateCommonEnum.QINGDAOCOMPANYKEY.getCode());
			rateList = zyRateMapper.selectByExample(example1);
			if (rateList.size() < 1)
				throw new InvalidException("五位代码错误");
		}
		// else {
		// 取list的第一条
		ZyRate zyRate = rateList.get(0);
		String rateId = zyRate.getProdZyRateId();
		// 根据条件判断录入的五位代码是否正确，即根据五位代码查出的数据的部件明细、维修代码、箱型、尺寸、位置代码再确认出一个五位代码
		ZyRateExample zyExample = new ZyRateExample();
		ZyRateExample.Criteria criteria = zyExample.createCriteria();
		criteria.andPartsDetailsCodeEqualTo(zyRate.getPartsDetailsCode()).andRepairCodeEqualTo(zyRate.getRepairCode())
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ZyRate> zyRateList = zyRateMapper.selectByExample(zyExample);
		if (zyRateList.size() > 1) {
			// 根据箱型、尺寸、位置筛选
			List<ZyRate> exList = new ArrayList<ZyRate>();
			// 筛选箱型
			List<ZyRate> zyContList = zyRateList.stream().filter(a -> {
				// 箱型为空或者是箱型等于录入的箱型,返回true，否则返回false
				if (!StringUtils.isNotEmpty(a.getContainerType())) {
					return true;
				} else {
					if (StringUtils.isNotEmpty(input.getContainerType())) {
						if (input.getContainerType().equals(a.getContainerType()))
							return true;
					}
				}
				return false;
			}).collect(Collectors.toList());
			exList.addAll(zyContList);
			// 筛选尺寸
			List<ZyRate> zySizeList = zyRateList.stream().filter(a -> {
				// 尺寸为空或者是箱型等于录入的尺寸,返回true，否则返回false
				if (!StringUtils.isNotEmpty(a.getSize())) {
					return true;
				} else {
					if (StringUtils.isNotEmpty(input.getSize())) {
						if (input.getSize().equals(a.getSize()))
							return true;
					}
				}
				return false;
			}).collect(Collectors.toList());
			exList.retainAll(zySizeList);
			// 筛选位置代码
			List<ZyRate> zyPostList = zyRateList.stream()
					.filter(a -> getPosition(input.getPositionCode(), a.getPositionCode()))
					.collect(Collectors.toList());
			exList.retainAll(zyPostList);
			List<ZyRate> thirdFilterList = new ArrayList<ZyRate>(exList);

			// 判断筛选结果
			if (thirdFilterList.size() > 1) {
				// 判断集合中是否有之前查询的费率信息，如果有则用原来的
				List<ZyRate> zyRateListOne = thirdFilterList.stream().filter(a -> a.getProdZyRateId().equals(rateId))
						.collect(Collectors.toList());
				if (zyRateListOne.size() == 0)
					zyRate = thirdFilterList.get(0);
			} else if (thirdFilterList.size() == 1) {
				zyRate = thirdFilterList.get(0);
			}
		}
		// 根据zyRate中的部件明细和维修代码组成的费率代码，查找通用费率中中远的标准费率
		RateExample cosRateExample = new RateExample();
		cosRateExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(getCosKey())
				.andRateCodeEqualTo(zyRate.getPartsDetailsCode() + zyRate.getRepairCode());
		List<Rate> cosRate = rateMapper.selectByExample(cosRateExample);
		if (cosRate.size() != 1)
			throw new InvalidException("五位代码错误,COS费率不唯一");
		else {
			// 根据COS费率的外键获取SAN的部件明细代码和维修代码
			RateExample sanRateExample = new RateExample();
			sanRateExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andProdRateIdEqualTo(cosRate.get(0).getStandardRate());
			List<Rate> sanRate = rateMapper.selectByExample(sanRateExample);
			if (sanRate.size() != 1)
				throw new InvalidException("五位代码错误,SAN费率不唯一");
			else {
				// 页面返回SAN标准费率的部件明细和维修代码
				zyRate.setPartsDetailsCode(sanRate.get(0).getPartsDetails()); // 部件明细
				zyRate.setRepairCode(sanRate.get(0).getRepair()); // 维修代码
				zyRate.setProdZyRateId(sanRate.get(0).getProdRateId()); // SAN费率id
			}
		}

		model.setFiveCode(zyRate.getCosRateCode()); // 五位代码
		model.setRateId(zyRate.getProdZyRateId()); // SAN标准费率id
		model.setPartsDetails(zyRate.getPartsDetailsCode()); // 部件明细
		model.setRepair(zyRate.getRepairCode()); // 修理代码
		model.setLength(zyRate.getLength()); // 长
		model.setWidth(zyRate.getWidth()); // 宽
		model.setQuantity(zyRate.getQuantity()); // 数量
		model.setManHour(zyRate.getManHour()); // 工时
		model.setManHourCost(getCosManHourCost(zyRate.getManHour())); // 工时费
		model.setMaterialCost(zyRate.getMaterialCost()); // 材料费
		model.setIsMustPhoto(zyRate.getIsMustPhoto()); // 是否必传图片
		model.setIsRepeatPrompts(zyRate.getIsRepeatPrompts()); // 重复条目是否提示
		return model;
		// }
	}

	/**
	 * 判断位置代码是否符合
	 * 
	 * @Description: TODO
	 * @param inputPostition
	 *            录入的位置代码
	 * @param ratePostition
	 *            费率的位置代码
	 * @return Boolean @throws 
	 */
	private Boolean getPosition(String inputPostition, String ratePostition) {
		// 位置代码为空或者是录入的位置代码包含费率位置代码
		if (!StringUtils.isNotEmpty(ratePostition))
			return true;
		else {
			if (StringUtils.isNotEmpty(inputPostition)) {
				String pos = inputPostition;
				// 根据"/"将标准费率的位置代码分割
				String[] positionList = ratePostition.split("/");
				for (String postition : positionList) {
					if (postition.length() > 1 && postition.subSequence(1, 2).equals("X")) {
						if (!pos.subSequence(1, 2).equals("G") && !pos.subSequence(1, 2).equals("H")) {
							StringBuilder posBuilder = new StringBuilder(pos);
							// 将第二位字符替换成"X"
							pos = posBuilder.replace(1, 2, "X") + "";
						}
					}
					// 如果录入的位置包含费率位置，则返回true
					if (pos.contains(postition))
						return true;
				}
			}
		}
		return false;
	}

	/**
	 * 计算工时费
	 * 
	 * @Description: TODO
	 * @param manHour
	 * @return BigDecimal @throws 
	 */
	private BigDecimal getCosManHourCost(Double manHour) {
		// 返回工时费
		BigDecimal money = new BigDecimal(0);
		// 查询工时费率
		ManhourRateExample example = new ManhourRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andContainerUserEqualTo(getCosKey());
		List<ManhourRate> rateList = manhourRateMapper.selectByExample(example);
		if (rateList.size() > 0) {
			ManhourRate rate = rateList.get(0);
			BigDecimal hourMoney = rate.getDrycontManhourRate();
			// 判断箱体费率币种是否为人民币
			if (!rate.getDrycontRateCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
				// 箱体汇率
				BigDecimal rateMoney = rate.getDrycontExchangeRate();
				hourMoney = hourMoney.multiply(rateMoney);
			}
			// 工时费率乘工时数
			money = hourMoney.multiply(new BigDecimal(manHour));
			// 结果四舍五入，保留两位位小数
			BigDecimal divisor = new BigDecimal(1);
			money = money.divide(divisor, 2, BigDecimal.ROUND_HALF_UP);
		}

		return money;
	}

	/**
	 * 获取COSkey
	 * 
	 * @Description: TODO
	 * @return String @throws 
	 */
	private String getCosKey() {
		ContainerUserExample userExample = new ContainerUserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerUserCodeEqualTo(RateCommonEnum.CONTAINERUSERKEY3.getCode());
		List<ContainerUser> userList = containerUserMapper.selectByExample(userExample);
		if (userList.size() > 0)
			return userList.get(0).getKey();
		return null;
	}

	/**
	 * 返回中远费率长*宽
	 */
	@Override
	public List<ZySelectOutput> getZYFiveCodeSelectMessage(GetRateMessageInput input) {
		// 根据部件明细、维修代码、位置代码、尺寸、箱型筛选长宽
		ZyRateExample example = new ZyRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andPartsDetailsCodeEqualTo(input.getPartsDetails()).andRepairCodeEqualTo(input.getRepair())
				.andCompanyEqualTo(RateCommonEnum.QINGDAOCOMPANYKEY.getCode());
		List<ZyRate> rateList = zyRateMapper.selectByExample(example);
		// 根据尺寸、位置、箱型再次筛选
		List<ZyRate> exList = new ArrayList<ZyRate>();
		// 筛选箱型
		List<ZyRate> zyContList = rateList.stream().filter(a -> {
			// 箱型为空或者是箱型等于录入的箱型,返回true，否则返回false
			if (!StringUtils.isNotEmpty(a.getContainerType())) {
				return true;
			} else {
				if (StringUtils.isNotEmpty(input.getContainerType())) {
					if (input.getContainerType().equals(a.getContainerType()))
						return true;
				}
			}
			return false;
		}).collect(Collectors.toList());
		exList.addAll(zyContList);
		// 筛选尺寸
		List<ZyRate> zySizeList = rateList.stream().filter(a -> {
			// 尺寸为空或者是箱型等于录入的尺寸,返回true，否则返回false
			if (!StringUtils.isNotEmpty(a.getSize())) {
				return true;
			} else {
				if (StringUtils.isNotEmpty(input.getSize())) {
					if (input.getSize().equals(a.getSize()))
						return true;
				}
			}
			return false;
		}).collect(Collectors.toList());
		exList.retainAll(zySizeList);
		// 筛选位置代码
		List<ZyRate> zyPostList = rateList.stream()
				.filter(a -> getPosition(input.getPositionCode(), a.getPositionCode())).collect(Collectors.toList());
		exList.retainAll(zyPostList);
		// 再次筛选结果集大于0，则使用本次筛选后的结果集
		if (exList.size() > 0)
			rateList = exList;
		// 按长度排序后，返回五位代码和长*宽
		return rateList.stream().sorted(Comparator.comparing(ZyRate::getLength)).map(a -> {
			ZySelectOutput output = new ZySelectOutput();
			output.setFiveCode(a.getCosRateCode());
			output.setValue(a.getLength() + "*" + a.getWidth());
			return output;
		}).collect(Collectors.toList());

	}

}
