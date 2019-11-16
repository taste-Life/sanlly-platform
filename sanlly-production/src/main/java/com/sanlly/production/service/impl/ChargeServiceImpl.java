package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ChargeMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Charge;
import com.sanlly.production.entity.ChargeExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.BackStateEnum;
import com.sanlly.production.enums.ChargeStateEnum;
import com.sanlly.production.enums.PayResultEnum;
import com.sanlly.production.models.output.app.pay.ChargeAppOutput;
import com.sanlly.production.models.output.containerTesting.ChargeOutput;
import com.sanlly.production.service.ChargeService;
import com.sanlly.production.utils.PayUtil;
/**
 * 现场收费实现类
 * @author zhangkai
 *
 */
@Service
public class ChargeServiceImpl extends BaseServiceImpl implements ChargeService  {
	
	@Autowired
	private ChargeMapper chargeMapper;
	@Autowired
	private YardMapper yardMapper;

	/**
	 * 更新记录支付交易信息及结果
	 * @param trxstatus 通联交易结果码
	 * @param bizseq 商户订单号（oid）
	 * @param trxid 通联交易流水号
	 */
	@Transactional
	public void updateCharge(String trxstatus, String bizseq, String trxid) {
		ChargeExample example = new ChargeExample();
		ChargeExample.Criteria criteria = example.createCriteria();
		criteria.andProdChargeCodeEqualTo(bizseq);
		Charge record = new Charge();
		record.setAllinpayTrxid(trxid);
		if ("0000".equals(trxstatus)) {
			// 通联交易结果码"0000"表示交易成功
			record.setChargeState(ChargeStateEnum.SUCCESS.getCode());
		} else {
			record.setChargeState(ChargeStateEnum.FAIL.getCode());
		}
		chargeMapper.updateByExampleSelective(record, example);
	}
	
	/**
	 * 查询交易结果
	 * @param chargeCode 交易单号（唯一）
	 * @return
	 */
	public String queryPayRes(String chargeCode) {
		ChargeExample chargeExample = new ChargeExample();
		ChargeExample.Criteria chargeCriteria = chargeExample.createCriteria();
		chargeCriteria.andProdChargeCodeEqualTo(chargeCode);
		List<Charge> charges = chargeMapper.selectByExample(chargeExample);
		if (charges == null || charges.size() == 0) {
			// 无此交易单
			return PayResultEnum.NOCHARGE.getCode();
		}
		if (ChargeStateEnum.SUCCESS.getCode().equals(charges.get(0).getChargeState())) {
			// 支付成功
			return PayResultEnum.SUCCESS.getCode();
		} else if (ChargeStateEnum.FAIL.getCode().equals(charges.get(0).getChargeState())) {
			// 支付失败
			return PayResultEnum.ERROR.getCode();
		} else {
			// 支付中
			return PayResultEnum.PAYING.getCode();
		}
	}
	
	/**
	 * 支付后更新退款信息
	 * @param charge
	 */
	public void updatePayBackInfo(Charge charge) {
		charge.setUpdateUser(getCurrentUserId());
		charge.setUpdateTime(new Date());
		ChargeExample example = new ChargeExample();
		ChargeExample.Criteria criteria = example.createCriteria();
		criteria.andProdChargeCodeEqualTo(charge.getProdChargeCode());
		chargeMapper.updateByExampleSelective(charge, example);
	}
	
	/**
	 * 收费记录列表
	 * @param containerNo 箱号
	 * @param paymentType 收款类型
	 * @param chargeType 付款方式
	 * @return
	 */
	@Override
	public PagedList<ChargeOutput> list(String containerNo, String paymentType, String chargeType, Integer index, Integer size) {
		List<ChargeOutput> outputList = new ArrayList<ChargeOutput>();
		ChargeExample example = new ChargeExample();
		ChargeExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time DESC");
		if (containerNo != null && containerNo != "") {
			criteria.andContainerNoLike("%"+containerNo+"%");
		}
		if (paymentType != null && paymentType != "") {
			criteria.andPaymentTypeEqualTo(paymentType);
		}
		if (chargeType != null && chargeType != "") {
			criteria.andChargeTypeEqualTo(chargeType);
		}
		Integer totalItemCount = (int)chargeMapper.countByExample(example);
		PagedList<ChargeOutput> pagedList = new PagedList<ChargeOutput>(index, size, totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<Charge> list = chargeMapper.selectByExample(example);
		for (Charge item : list) {
			ChargeOutput output = new ChargeOutput();
			output.setProdChargeId(item.getProdChargeId());
			output.setProdChargeCode(item.getProdChargeCode());
			output.setContainerNo(item.getContainerNo());
			output.setChargeTypeLang(item.getChargeType());
			output.setDepositMoney(item.getDepositMoney().toString());
			output.setReceivedMoney(item.getReceivedMoney().toString());
			if (item.getShouldBackMoney() != null) {
				output.setShouldBackMoney(item.getShouldBackMoney().toString());
			}
			if (item.getActualBackMoney() != null) {
				output.setActualBackMoney(item.getActualBackMoney().toString());
			}
			output.setPaymentTypeLang(item.getPaymentType());
			if (output.getShouldBackMoney().equals(output.getActualBackMoney())) {
				// 实际退款和应退款完全一致为全部退款
				output.setBackStateLang(BackStateEnum.ALL.getCode());
			} else {
				// 不一致为部分退款
				output.setBackStateLang(BackStateEnum.PART.getCode());
			}
			output.setInvoiceRemarks(item.getInvoiceRemarks());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}
	
	/**
	 * 获取缴费状态-回填发票信息二维码（APP端循环调用）
	 * @param chargeCode
	 * @return
	 */
	public ChargeAppOutput chargeState(String chargeCode) {
		ChargeExample example = new ChargeExample();
		ChargeExample.Criteria criteria = example.createCriteria();
		criteria.andProdChargeCodeEqualTo(chargeCode);
		List<Charge> list = chargeMapper.selectByExample(example);
		ChargeAppOutput output = new ChargeAppOutput();
		for (Charge charge : list) {
			if (ChargeStateEnum.SUCCESS.getCode().equals(charge.getChargeState())) {
				output.setQrInfoUrl("0");
				output.setBillNum(charge.getProdChargeCode());
				output.setSerialNum(charge.getAllinpayTrxid());
			} else {
				output.setQrInfoUrl("1");
			}
		}
		return output;
	}
	
	/**
	 * 签字确认
	 * @param prodCourseId
	 * @param containerCategory
	 * @param signaturePic
	 */
	public void sign(String prodCourseId, String containerCategory, String signaturePic) {
		ChargeExample example = new ChargeExample();
		ChargeExample.Criteria criteria = example.createCriteria();
		Charge charge = new Charge();
		charge.setSignaturePic(signaturePic);
		criteria.andCourseEqualTo(prodCourseId);
		criteria.andContainerCategoryEqualTo(containerCategory);
		chargeMapper.updateByExampleSelective(charge, example);
	}
	
}
