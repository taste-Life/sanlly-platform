package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.Charge;
import com.sanlly.production.models.output.app.pay.ChargeAppOutput;
import com.sanlly.production.models.output.containerTesting.ChargeOutput;

/**
 * 现场收费Service
 * @author zhangkai
 *
 */
public interface ChargeService {

	/**
	 * 更新记录支付交易信息及结果
	 * @param trxstatus 通联交易结果码
	 * @param bizseq 商户订单号（oid）
	 * @param trxid 通联交易流水号
	 */
	void updateCharge(String trxstatus, String bizseq, String trxid);
	
	/**
	 * 查询交易结果
	 * @param chargeCode 交易单号（唯一）
	 * @return
	 */
	String queryPayRes(String chargeCode);
	
	/**
	 * 支付后更新退款信息
	 * @param charge
	 */
	void updatePayBackInfo(Charge charge);
	
	/**
	 * 收费记录列表
	 * @param containerNo 箱号
	 * @param paymentType 收款类型
	 * @param chargeType 付款方式
	 * @param index 页面
	 * @param size 条数
	 * @return
	 */
	PagedList<ChargeOutput> list(String containerNo, String paymentType, String chargeType, Integer index, Integer size);
	
	/**
	 * 获取缴费状态-回填发票信息二维码（APP端循环调用）
	 * @param chargeCode
	 * @return
	 */
	ChargeAppOutput chargeState(String chargeCode);
	
	/**
	 * 签字确认
	 * @param prodCourseId
	 * @param containerCategory
	 * @param signaturePic
	 */
	public void sign(String prodCourseId, String containerCategory, String signaturePic);
	
}
