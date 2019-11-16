package com.sanlly.purchase.service;
/**
 * ClassName: SupplierEvaluateService
 * Description: 供应商评价接口
 * date: 2019/10/19 14:47
 *
 * @author zhh
 */
public interface SupplierEvaluateService {

	/**
     * 评分考核项目：价格及交货及时性
     * @param deliveryNum 送货编号
     * @return
     */
	void evaluatePriceAndTimely(String deliveryNum,Integer updateUser);
	
	/**
     * 评分考核项目：质量及服务水平
     * @param deliveryNum 送货编号
     * @param qualityScore 质量分
     * @param serviceScore 服务水平分
     * @return
     */
	void evaluateQualityAndService(String deliveryNum,Double qualityScore,Double serviceScore,Integer updateUser);
	
}
