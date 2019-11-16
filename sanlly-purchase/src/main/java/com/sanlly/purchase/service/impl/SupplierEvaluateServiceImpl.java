package com.sanlly.purchase.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.dao.EvaluateLogMapper;
import com.sanlly.purchase.dao.PurchaseDeliveryDetailMapper;
import com.sanlly.purchase.dao.PurchaseDeliveryMapper;
import com.sanlly.purchase.dao.ReceiverScoreMapper;
import com.sanlly.purchase.entity.EvaluateLog;
import com.sanlly.purchase.entity.EvaluateLogExample;
import com.sanlly.purchase.entity.PurchaseDelivery;
import com.sanlly.purchase.entity.PurchaseDeliveryDetail;
import com.sanlly.purchase.entity.PurchaseDeliveryDetailExample;
import com.sanlly.purchase.entity.PurchaseDeliveryExample;
import com.sanlly.purchase.entity.ReceiverScore;
import com.sanlly.purchase.entity.ReceiverScoreExample;
import com.sanlly.purchase.enums.GradeEnum;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.SupplierEvaluateService;
import com.sanlly.purchase.service.SupplierService;
import com.sanlly.purchase.service.feign.WareFeignClient;
import com.sanlly.purchase.utils.MailUtil;
/**
 * ClassName: SupplierEvaluateServiceImpl
 * Description: 供应商评价实现类
 * date: 2019/10/19 14:47
 *
 * @author zhh
 */
@Service
public class SupplierEvaluateServiceImpl extends BaseServiceImpl implements SupplierEvaluateService{

	@Autowired
	private PurchaseDeliveryMapper deliveryDao;
	
	@Autowired
	private PurchaseDeliveryDetailMapper deliveryDetailDao;
	
	@Autowired
    private WareFeignClient wareService;
	
	@Autowired
	private EvaluateLogMapper evaluateDao;
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private ReceiverScoreMapper scoreDao;
	
	/**
     * 评分考核项目：价格及交货及时性
     * @param deliveryNum 送货编号
     * @return
     */
	@Override
	public void evaluatePriceAndTimely(String deliveryNum,Integer updateUser) {
		// TODO Auto-generated method stub
		//根据送货单号查询送货单
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		example.createCriteria().andDeliveryNumEqualTo(deliveryNum);
		List<PurchaseDelivery> deliveries = deliveryDao.selectByExample(example);
		if(deliveries!=null&&deliveries.size()>0){
			PurchaseDelivery delivery = deliveries.get(0);
			
			//查询送货明细
			PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
			detailExample.createCriteria().andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
			List<PurchaseDeliveryDetail> details = deliveryDetailDao.selectByExample(detailExample);
			if(details!=null&&details.size()>0){
				//报价价格
				BigDecimal price = new BigDecimal("0");
				//平均价格
				BigDecimal referencePrice = new BigDecimal("0");
				
				//确认收货日期
				long DeliveryTime = 0;
				//要求到货日期
				long RequiredTime = 0;
				
				for(PurchaseDeliveryDetail detail :details){
					if(detail.getEntryPrice()!=null){
						price=price.add(detail.getEntryPrice());
					}
					//获得备件信息
					Result<SparePartsOutput> result = wareService.getSparePart(detail.getProduct());
					if(result!=null&&result.getData()!=null){
						SparePartsOutput spareParts = result.getData();
						referencePrice=referencePrice.add(spareParts.getPurchasingReferencePrice());
					}
					
					DeliveryTime += new Date().getTime();
					RequiredTime += detail.getRequiredDeliveryDate().getTime();
				}
				//查询供货商原评分信息
				EvaluateLogExample eLogExample = new EvaluateLogExample();
				eLogExample.createCriteria().andSupplierEqualTo(delivery.getSupplier());
				List<EvaluateLog> evaluateLogs = evaluateDao.selectByExample(eLogExample);
				if(evaluateLogs!=null&&evaluateLogs.size()>0){
					EvaluateLog log = evaluateLogs.get(0);
					//获得原价格分
					double priceScore = log.getPriceScore();
					BigDecimal score1;
					BigDecimal score2;
					//报价价格取平均值每低于平均价格2%加1分
					if(referencePrice.multiply(new BigDecimal("0.98")).compareTo(price)>0){
						score1 = (new BigDecimal(Double.toString(log.getPriceScore())).add(new BigDecimal("1"))).multiply(new BigDecimal("0.2"));
						score2 = new BigDecimal(Double.toString(log.getPriceScore())).multiply(new BigDecimal("0.8"));
						priceScore = score1.add(score2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
					}else if(referencePrice.multiply(new BigDecimal("1.02")).compareTo(price)<0){
						//每高于平均价格2%减1分
						score1 = (new BigDecimal(Double.toString(log.getPriceScore())).subtract(new BigDecimal("1"))).multiply(new BigDecimal("0.2"));
						score2 = new BigDecimal(Double.toString(log.getPriceScore())).multiply(new BigDecimal("0.8"));
						priceScore = score1.add(score2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
					}
					
					//最高10分，最低0分
					if(priceScore>10){
						priceScore = 10;
					}else if(priceScore<0){
						priceScore = 0;
					}
					//获得原交货及时性分数
					double timelyScore = log.getTimelyScore();
					BigDecimal score3;
					BigDecimal score4;
					//比较收货时间与约定时间毫秒数差值
					//确认收货时间与约定送货时间提前加1分
					if(DeliveryTime-RequiredTime<0){
						score3 = (new BigDecimal(Double.toString(log.getTimelyScore())).add(new BigDecimal("1"))).multiply(new BigDecimal("0.2"));
						score4 = new BigDecimal(Double.toString(log.getTimelyScore())).multiply(new BigDecimal("0.8"));
						timelyScore = score3.add(score4).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
					}else if(DeliveryTime-RequiredTime>0){
						//每推后减1分
						score3 = (new BigDecimal(Double.toString(log.getTimelyScore())).subtract(new BigDecimal("1"))).multiply(new BigDecimal("0.2"));
						score4 = new BigDecimal(Double.toString(log.getTimelyScore())).multiply(new BigDecimal("0.8"));
						timelyScore = score3.add(score4).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
					}
					//最高10分，最低0分
					if(timelyScore>10){
						timelyScore = 10;
					}else if(timelyScore<0){
						timelyScore = 0;
					}
					
					log.setPriceScore(priceScore);
					log.setTimelyScore(timelyScore);
					//修改评价分
					log.setEvaluateScore(priceScore+timelyScore+log.getQualityScore()+log.getServiceScore());
					//修改供应商等级
					double totalSore = 0d;
					//总分数：基础分+评价分
					totalSore = log.getBaseScore()+log.getEvaluateScore();
					String grade;
					if(totalSore>=90){
						grade = GradeEnum.GradeA.getCode();
					}else if(totalSore>=80&&totalSore<90){
						grade = GradeEnum.GradeB.getCode();
					}else if(totalSore>=70&&totalSore<80){
						grade = GradeEnum.GradeC.getCode();
					}else if(totalSore>=60&&totalSore<70){
						grade = GradeEnum.GradeD.getCode();
					}else{
						grade = GradeEnum.GradeE.getCode();
					}
					log.setGrade(grade);
					log.setUpdateTime(new Date());
					if(updateUser!=null) {
						log.setUpdateUser(updateUser);
					}else {
						log.setUpdateUser(getCurrentUserId());
					}
					evaluateDao.updateByPrimaryKeySelective(log);
				}
			}
		}
	}

	/**
     * 评分考核项目：质量及服务水平
     * @param deliveryNum 送货编号
     * @param qualityScore 质量分
     * @param serviceScore 服务水平分
     * @return
     */
	@Override
	public void evaluateQualityAndService(String deliveryNum,Double qualityScore,Double serviceScore,Integer updateUser) {
		// TODO Auto-generated method stub
		//判断改送货单是否已评价
		ReceiverScoreExample rScoreExample = new ReceiverScoreExample();
		rScoreExample.createCriteria().andDeliveryNumEqualTo(deliveryNum);
		List<ReceiverScore> scores = scoreDao.selectByExample(rScoreExample);
		if(scores!=null&&scores.size()>0) {
			throw new RuntimeException("isEvaluated");
		}
		//添加记录
		ReceiverScore score = new ReceiverScore();
		score.setDeliveryNum(deliveryNum);
		score.setQualityScore(qualityScore);
		score.setServiceScore(serviceScore);
		score.setCreateTime(new Date());
		if(updateUser!=null) {
			score.setCreateUser(updateUser);
		}else {
			score.setCreateUser(getCurrentUserId());
		}
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		example.createCriteria().andDeliveryNumEqualTo(deliveryNum);
		List<PurchaseDelivery> deliveries = deliveryDao.selectByExample(example);
		if(deliveries!=null&&deliveries.size()>0){
			PurchaseDelivery delivery = deliveries.get(0);
			
			//添加记录表供应商
			score.setSupplier(delivery.getSupplier());
			//查询供货商原评分信息
			EvaluateLogExample eLogExample = new EvaluateLogExample();
			eLogExample.createCriteria().andSupplierEqualTo(delivery.getSupplier());
			List<EvaluateLog> evaluateLogs = evaluateDao.selectByExample(eLogExample);
			if(evaluateLogs!=null&&evaluateLogs.size()>0){
				EvaluateLog log = evaluateLogs.get(0);
				//获得质量分：原质量分*80%+现质量分*20%
				double score1 = new BigDecimal(Double.toString(log.getQualityScore())).multiply(new BigDecimal("0.8")).add(new BigDecimal(Double.toString(qualityScore)).multiply(new BigDecimal("0.2"))).setScale(4, BigDecimal .ROUND_HALF_UP).doubleValue();
				//获得服务水平分：原服务水平分*80%+现服务水平分*20%
				double score2 = new BigDecimal(Double.toString(log.getServiceScore())).multiply(new BigDecimal("0.8")).add(new BigDecimal(Double.toString(serviceScore)).multiply(new BigDecimal("0.2"))).setScale(4, BigDecimal .ROUND_HALF_UP).doubleValue();
				
				log.setQualityScore(score1);
				log.setServiceScore(score2);
				
				//修改评价分
				log.setEvaluateScore(score1+score2+log.getPriceScore()+log.getTimelyScore());
				//修改供应商等级
				double totalSore = 0d;
				//总分数：基础分+评价分
				totalSore = log.getBaseScore()+log.getEvaluateScore();
				String grade;
				if(totalSore>=90){
					grade = GradeEnum.GradeA.getCode();
				}else if(totalSore>=80&&totalSore<90){
					grade = GradeEnum.GradeB.getCode();
				}else if(totalSore>=70&&totalSore<80){
					grade = GradeEnum.GradeC.getCode();
				}else if(totalSore>=60&&totalSore<70){
					grade = GradeEnum.GradeD.getCode();
				}else{
					grade = GradeEnum.GradeE.getCode();
				}
				log.setGrade(grade);
				log.setUpdateTime(new Date());
				if(updateUser!=null) {
					log.setUpdateUser(updateUser);
				}else {
					log.setUpdateUser(getCurrentUserId());
				}
				evaluateDao.updateByPrimaryKeySelective(log);
			}
			
			//质量跟服务水平很差，发送邮件
			if(serviceScore==0||qualityScore==0){
				String text ="";
				if(serviceScore==0){
					text="服务水平太差！";
				}
				if(qualityScore==0){
					text="质量太差！";
				}
				if(serviceScore==0&&qualityScore==0){
					text="质量和服务水平太差！";
				}
				SearchPurcSupplierInput input = new SearchPurcSupplierInput();
	            input.setKey(delivery.getSupplier());
				PurcSupplierOutput supplier = supplierService.getSupplierByKey(input);
	            if (supplier.getContactInformations().size() > 0 && StringUtils.isNotEmpty(supplier.getContactInformations().get(0).getEmailAddress())) {
	                try {
						MailUtil.sendMail(supplier.getContactInformations().get(0).getEmailAddress(), text, "供应商评价反馈");
					} catch (AddressException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
			}
		}
		//添加评价记录
		scoreDao.insertSelective(score);
	}
}
