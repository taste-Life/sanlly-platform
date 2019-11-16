package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.dailytender.AddDailyTenderInput;
import com.sanlly.purchase.models.input.dailytender.AddDailyTenderResultInput;
import com.sanlly.purchase.models.input.dailytender.SearchDailyTenderInput;
import com.sanlly.purchase.models.output.dailytender.DailyTenderOutput;
import com.sanlly.purchase.models.output.dailytender.DailyTenderProductOutput;
import com.sanlly.purchase.models.output.dailytender.DailyTenderSupplierOutput;
import com.sanlly.purchase.models.output.mattertender.TenderNoticeOutput;

import java.util.List;

/**
 * @Description: TODO
 * @ClassName: DailyTenderService
 * @Date: 2019/8/26 14:05
 * @Version 1.0
 * @Author mqz
 */
public interface DailyTenderService {
    /**
     *
     * @Description:  招标采购分页列表
     * @param input
     * @return PagedList<MatterTenderOutput>
     * @throws 
     */
    PagedList<DailyTenderOutput> getMatterTenderPagedList(SearchDailyTenderInput input);

    /**
     *
     * @Description: 招标发布
     * @param input void
     * @throws 
     */
    void addMatterTender(AddDailyTenderInput input);

    /**
     *
     * @Description: 初审结果录入
     * @param supplierInputs void
     * @throws 
     */
    void addFirstTrial(Integer purcMatterTenderPurchaseId,String[] supplierInputs);
    /**
     *
     * @Description: 招标结果录入
     * @param input void
     * @throws 
     */
    void addTenderResult(AddDailyTenderResultInput input);
    /**
     *
     * @Description: 招标详情
     * @param purcMatterTenderPurchaseId
     * @return MatterTenderOutput
     * @throws 
     */
    DailyTenderOutput gettMatterTenderDetail(Integer purcMatterTenderPurchaseId);

    /**
     *
     * @Description: 公告列表
     * @return List<MatterTenderOutput>
     * @throws 
     */
    List<TenderNoticeOutput> getTenderNoticeList();
    /**
     *
     * @Description: 招标备件列表
     * @param purcMatterTenderPurchaseId
     * @return List<MatterTenderProductOutput>
     * @throws 
     */
    List<DailyTenderProductOutput> gettMatterTenderProductList(Integer purcMatterTenderPurchaseId);

    /**
     * 获取相应供应商
     * @param purcMatterTenderPurchaseId
     * @param type
     * @return
     */
    List<DailyTenderSupplierOutput>  getTenderSupplierList(Integer purcMatterTenderPurchaseId,String type);

    /**
     * 为供应商发邮件
     * @param supplierKeys
     * @param text
     * @param subject
     */
    public void sendMail(String[] supplierKeys,String text,String subject) ;
    }
