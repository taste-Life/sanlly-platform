package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ManhourRateMapper;
import com.sanlly.production.entity.ManhourRate;
import com.sanlly.production.entity.ManhourRateExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.rate.AddMHRateInput;
import com.sanlly.production.models.input.rate.SearchMHRateInput;
import com.sanlly.production.models.input.rate.UpdateMHRateInput;
import com.sanlly.production.models.output.rate.MHRateOutput;
import com.sanlly.production.models.output.rate.SearchMHRateOutput;
import com.sanlly.production.service.RateMHService;

@Service
public class RateMHServiceImpl extends BaseServiceImpl implements RateMHService {

	@Autowired
	private ManhourRateMapper manHourRateMapper;

	/**
	 * 工时费率分页
	 */
	@Override
	public PagedList<SearchMHRateOutput> getZYRatePagedList(SearchMHRateInput input) {
		ManhourRateExample example = new ManhourRateExample();
		ManhourRateExample.Criteria criteria = example.createCriteria();
		// 非删
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 查询条件
		if (StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		// 总条数
		Integer totalItemCount = (int) manHourRateMapper.countByExample(example);
		PagedList<SearchMHRateOutput> pagedList = new PagedList<SearchMHRateOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ManhourRate> rateList = manHourRateMapper.selectByExample(example);
		// 构造返回数据
		List<SearchMHRateOutput> list = new ArrayList<SearchMHRateOutput>();
		for (ManhourRate item : rateList) {
			SearchMHRateOutput model = new SearchMHRateOutput();
			model.setManhourRateId(item.getProdManhourRateId());
			model.setCompanyLang(item.getCompany()); // 地点
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setContBodyManHourRate(item.getContbodyManhourRate()); // 箱体工时费率
			model.setContBodyQuotedCurrencyLang(item.getContbodyQuotedCurrency()); // 箱体报价币种
			model.setContBodyRateCurrencyLang(item.getContbodyRateCurrency()); // 箱体费率币种
			model.setContBodyExchangeRate(item.getContbodyExchangeRate()); // 箱体汇率
			model.setUnitManHourRate(item.getUnitManhourRate()); // 机组工时费率
			model.setUnitQuotedCurrencyLang(item.getUnitQuotedCurrency()); // 机组报价币种
			model.setUnitRateCurrencyLang(item.getUnitRateCurrency()); // 机组费率比币种
			model.setUnitExchangeRate(item.getUnitExchangeRate()); // 机组汇率
			model.setDryContManHourRate(item.getDrycontManhourRate()); // 干箱工时费率
			model.setDryContQuotedCurrencyLang(item.getDrycontQuotedCurrency()); // 干箱报价币种
			model.setDryContRateCurrencyLang(item.getDrycontRateCurrency()); // 干箱费率币种
			model.setDryContExchangeRate(item.getDrycontExchangeRate()); // 干箱汇率
			model.setPTIRate(item.getPtiRate()); // PTI费率
			model.setBillDiscountRate(item.getBillDiscountRate()); // 账单折扣率
			list.add(model);
		}
		// 将分页数据放入结果
		pagedList.getDataList().addAll(list);
		return pagedList;
	}

	/**
	 * 新增工时费率
	 */
	@Override
	public void addMHRate(AddMHRateInput input) {
		ManhourRate model = new ManhourRate();
		model.setCompany(input.getRateCompany()); // 地点
		model.setContainerUser(input.getContainerUser()); // 用箱人
		model.setContbodyManhourRate(input.getContBodyManHourRate()); // 箱体工时费率
		model.setContbodyQuotedCurrency(input.getContBodyQuotedCurrency()); // 箱体报价币种
		model.setContbodyRateCurrency(input.getContBodyRateCurrency()); // 箱体费率币种
		model.setContbodyExchangeRate(input.getContBodyExchangeRate()); // 箱体汇率
		model.setUnitManhourRate(input.getUnitManHourRate()); // 机组工时费率
		model.setUnitQuotedCurrency(input.getUnitQuotedCurrency()); // 机组报价币种
		model.setUnitRateCurrency(input.getUnitRateCurrency()); // 机组费率币种
		model.setUnitExchangeRate(input.getUnitExchangeRate()); // 机组汇率
		model.setDrycontManhourRate(input.getDryContManHourRate()); // 干箱工时费率
		model.setDrycontQuotedCurrency(input.getDryContQuotedCurrency()); // 干箱报价币种
		model.setDrycontRateCurrency(input.getDryContRateCurrency()); // 干箱费率币种
		model.setDrycontExchangeRate(input.getDryContExchangeRate()); // 干箱费率
		model.setPtiRate(input.getPtiRate()); // PTI费率
		model.setBillDiscountRate(input.getBillDiscountRate()); // 账单折扣率
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		manHourRateMapper.insert(model);
	}

	/**
	 * 获取单条工时费率信息
	 */
	@Override
	public MHRateOutput getMHRate(Integer rateId) {
		ManhourRate rate = manHourRateMapper.selectByPrimaryKey(rateId);
		if (rate.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			MHRateOutput model = new MHRateOutput();
			model.setManhourRateId(rate.getProdManhourRateId());
			model.setRateCompany(rate.getCompany()); // 地点
			model.setContainerUser(rate.getContainerUser()); // 用箱人
			model.setContBodyManHourRate(rate.getContbodyManhourRate()); // 箱体工时费率
			model.setContBodyQuotedCurrency(rate.getContbodyQuotedCurrency()); // 箱体报价币种
			model.setContBodyRateCurrency(rate.getContbodyRateCurrency()); // 箱体费率币种
			model.setContBodyExchangeRate(rate.getContbodyExchangeRate()); // 箱体汇率
			model.setUnitManHourRate(rate.getUnitManhourRate()); // 机组工时费率
			model.setUnitQuotedCurrency(rate.getUnitQuotedCurrency()); // 机组报价币种
			model.setUnitRateCurrency(rate.getUnitRateCurrency()); // 机组费率币种
			model.setUnitExchangeRate(rate.getUnitExchangeRate()); // 机组汇率
			model.setDryContManHourRate(rate.getDrycontManhourRate()); // 干箱工时费率
			model.setDryContQuotedCurrency(rate.getDrycontQuotedCurrency()); // 干箱报价币种
			model.setDryContRateCurrency(rate.getDrycontRateCurrency()); // 干箱费率币种
			model.setDryContExchangeRate(rate.getDrycontExchangeRate()); // 干箱费率
			model.setPtiRate(rate.getPtiRate()); // PTI费率
			model.setBillDiscountRate(rate.getBillDiscountRate()); // 账单折扣率
			return model;
		}
		return null;
	}

	/**
	 * 工时费率编辑
	 */
	@Override
	public void updateMHRate(UpdateMHRateInput input) {
		ManhourRate model = manHourRateMapper.selectByPrimaryKey(input.getManhourRateId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setCompany(input.getRateCompany()); // 地点
			model.setContainerUser(input.getContainerUser()); // 用箱人
			model.setContbodyManhourRate(input.getContBodyManHourRate()); // 箱体工时费率
			model.setContbodyQuotedCurrency(input.getContBodyQuotedCurrency()); // 箱体报价币种
			model.setContbodyRateCurrency(input.getContBodyRateCurrency()); // 箱体费率币种
			model.setContbodyExchangeRate(input.getContBodyExchangeRate()); // 箱体汇率
			model.setUnitManhourRate(input.getUnitManHourRate()); // 机组工时费率
			model.setUnitQuotedCurrency(input.getUnitQuotedCurrency()); // 机组报价币种
			model.setUnitRateCurrency(input.getUnitRateCurrency()); // 机组费率币种
			model.setUnitExchangeRate(input.getUnitExchangeRate()); // 机组汇率
			model.setDrycontManhourRate(input.getDryContManHourRate()); // 干箱工时费率
			model.setDrycontQuotedCurrency(input.getDryContQuotedCurrency()); // 干箱报价币种
			model.setDrycontRateCurrency(input.getDryContRateCurrency()); // 干箱费率币种
			model.setDrycontExchangeRate(input.getDryContExchangeRate()); // 干箱费率
			model.setPtiRate(input.getPtiRate()); // PTI费率
			model.setBillDiscountRate(input.getBillDiscountRate()); // 账单折扣率
			model.setUpdateUser(getCurrentUserId());
			model.setCreateTime(new Date());
			manHourRateMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * 工时费率删除
	 */
	@Override
	public void delMHRate(Integer[] listIds) {
		ManhourRateExample example = new ManhourRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andProdManhourRateIdIn(Arrays.asList(listIds));
		ManhourRate model = new ManhourRate();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		manHourRateMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 获取用箱人报价币种
	 */
	@Override
	public String getUserCurrency(String company, String containerUser, String containerCategory) {
		String currency = null;
		ManhourRateExample example = new ManhourRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company)
				.andContainerUserEqualTo(containerUser);
		List<ManhourRate> list = manHourRateMapper.selectByExample(example);
		if (list.size() < 1)
			return null;
		// 判断箱类别
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
			return list.get(0).getDrycontQuotedCurrency();
		} else if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(containerCategory)) {
			return list.get(0).getContbodyQuotedCurrency();
		} else if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			return list.get(0).getUnitQuotedCurrency();
		}
		return currency;
	}

	/**
	 * 人民币转美金
	 */
	@Override
	public BigDecimal getCNYtoUSD(String company, String containerUser, String containerCategory, BigDecimal money) {
		// 获取用箱人汇率
		BigDecimal exchange = getUserManRate(company, containerUser, containerCategory);
		if (exchange == null)
			return money;
		return money.divide(exchange, 4, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 美金转人民币
	 */
	@Override
	public BigDecimal getUSDtoCNY(String company, String containerUser, String containerCategory, BigDecimal money) {
		// 获取用箱人汇率
		BigDecimal exchange = getUserManRate(company, containerUser, containerCategory);
		if (exchange == null)
			return money;
		return money.multiply(exchange).setScale(4, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 获取用箱人汇率
	 * 
	 * @Description: TODO
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @return ManhourRate @throws 
	 */
	private BigDecimal getUserManRate(String company, String containerUser, String containerCategory) {
		ManhourRateExample example = new ManhourRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company)
				.andContainerUserEqualTo(containerUser);
		List<ManhourRate> list = manHourRateMapper.selectByExample(example);
		if (list.size() < 1)
			return null;
		// 判断箱类别
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
			return list.get(0).getDrycontExchangeRate();
		} else if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(containerCategory)) {
			return list.get(0).getContbodyExchangeRate();
		} else if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			return list.get(0).getUnitExchangeRate();
		}
		return null;
	}

}
