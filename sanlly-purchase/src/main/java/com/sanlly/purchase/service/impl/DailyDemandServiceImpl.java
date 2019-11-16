package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.MatterDemandMapper;
import com.sanlly.purchase.entity.MatterDemand;
import com.sanlly.purchase.entity.MatterDemandExample;
import com.sanlly.purchase.enums.PurchaseStatusEnum;
import com.sanlly.purchase.models.input.dailydemand.AddDailyDemandInput;
import com.sanlly.purchase.models.input.dailydemand.EditDemandInput;
import com.sanlly.purchase.models.input.dailydemand.SearcherDailyDemandInput;
import com.sanlly.purchase.models.output.dailydemand.DailyDemandOutput;
import com.sanlly.purchase.service.AuthFigenClient;
import com.sanlly.purchase.service.DailyDemandService;
import com.sanlly.purchase.service.feign.WareFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: 日常采购需求实现类
 * @ClassName: DailyDemandServiceImpl
 * @Version 1.0
 * @Author mqz
 */
@Service
public class DailyDemandServiceImpl extends  BaseServiceImpl implements DailyDemandService {
    @Autowired
    private MatterDemandMapper matterDemandDao;
    @Autowired
    private AuthFigenClient authFigenClient;
    @Autowired
  private   WareFeignClient wareFeignClient;

//查询
    @Override
    public PagedList<DailyDemandOutput> getDailyDemandPagedList(SearcherDailyDemandInput input) {

        MatterDemandExample example = new MatterDemandExample();
        MatterDemandExample.Criteria criteria = example.createCriteria();
        // 采购单状态
        criteria.andIsCreateOrderEqualTo(input.getIsCreateOrder());
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }// 日常采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        if (StringUtils.isNotEmpty(input.getProductNum())) {
            criteria.andProductNumLike("%"+input.getProductNum()+"%");
        }
        if (StringUtils.isNotBlank(input.getAuditStatus())){
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterDemandDao.countByExample(example);
        // 分页查询
        PagedList<DailyDemandOutput> pagedList = new PagedList<DailyDemandOutput>(
                input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<MatterDemand> purcMatterDemandList = matterDemandDao.selectByExample(example);
        List<DailyDemandOutput> mdOutputList = new ArrayList<DailyDemandOutput>();
        for (MatterDemand md : purcMatterDemandList) {

            DailyDemandOutput matterDemand = new DailyDemandOutput();
            BeanUtils.copyProperties(md, matterDemand);
            matterDemand.setPurchaseCompanyLangLang(md.getPurchaseCompany());
            matterDemand.setAuditStatusLangLang(md.getAuditStatus());
            matterDemand.setIsCreateOrderLangLang(md.getIsCreateOrder());
            matterDemand.setTenderTypeLangLang(md.getTenderType());
            // 需求申请人
            Result<UserInfoOutput> rs = authFigenClient.userDetail(md.getApplicantUserId());
            if (rs != null) {
                matterDemand.setStrApplicantUser(rs.getData().getUserName());
            }
            mdOutputList.add(matterDemand);

        }

        // 将分页数据放入结果中
        pagedList.getDataList().addAll(mdOutputList);
        return pagedList;
    }
    /**
     * 删除采购需求
     */
    @Override
    public void delMatterDemand(Integer[] matterDemandIds) {
        MatterDemandExample example = new MatterDemandExample();
        MatterDemandExample.Criteria criteria = example.createCriteria();
        criteria.andPurcMatterDemandIdIn(Arrays.asList(matterDemandIds));
        MatterDemand md = new MatterDemand();
        md.setIsDel(CommonEnum.YES.getCode());
        md.setUpdateTime(new Date());
        md.setUpdateUser(getCurrentUserId());

        matterDemandDao.updateByExampleSelective(md, example);

    }

    /**
     * 审核日常需求
     * @param matterDemandIds
     * @param auditStatus
     * @param reject
     */
    @Override
    public void auditMatterDemand(Integer[] matterDemandIds, String auditStatus, String reject) {
        MatterDemandExample example = new MatterDemandExample();
        MatterDemandExample.Criteria criteria = example.createCriteria();
        criteria.andPurcMatterDemandIdIn(Arrays.asList(matterDemandIds));
        MatterDemand md = new MatterDemand();
        md.setAuditStatus(auditStatus);

        matterDemandDao.updateByExampleSelective(md, example);
    }

    /**
     * 更新需求
     * @param input
     */
    @Override
    public void updateMatterDemand(EditDemandInput input) {
        MatterDemand matterDemand = matterDemandDao.selectByPrimaryKey(input.getPurcMatterDemandId());
        BeanUtils.copyProperties(input,matterDemand);
        matterDemand.setUpdateTime(new Date());
        matterDemand.setUpdateUser(getCurrentUserId());
        try {
            matterDemand.setRequireArriveTime(new SimpleDateFormat("yyyy-MM-dd").parse(input.getRequireArriveTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        matterDemandDao.updateByPrimaryKeySelective(matterDemand);

    }

    /**
     * 添加需求
     * @param input
     */
    @Override
    public void addDailyDemand(AddDailyDemandInput input) {
        MatterDemand matterDemand = new MatterDemand();
        BeanUtils.copyProperties(input,matterDemand);
        matterDemand.setUpdateUser(getCurrentUserId());
        matterDemand.setCreateTime(new Date());
        matterDemand.setUpdateTime(new Date());
        matterDemand.setIsDel(CommonEnum.NO.getCode());
        matterDemand.setIsDayPruchase(CommonEnum.YES.getCode());
        matterDemand.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
        matterDemand.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
        matterDemand.setApplicantUserId(getCurrentUserId());
        matterDemand.setCreateUser(getCurrentUserId());
        matterDemand.setDemandTime(new Date());
        matterDemand.setDemandNo((String) wareFeignClient.getBillNumber("采购需求单号",getCurrentCompanyKey()).getData());

        matterDemandDao.insert(matterDemand);
    }

    @Override
    public  List<DailyDemandOutput>  getDailyDemand(Integer[] matterDemandIds) {
        MatterDemandExample example = new MatterDemandExample();
        example.createCriteria().andPurcMatterDemandIdIn(Arrays.asList(matterDemandIds));
       List<MatterDemand> matterDemands= matterDemandDao.selectByExample(example);
       List<DailyDemandOutput>  dailyDemandOutputs= new ArrayList<>();
        for (MatterDemand md : matterDemands) {

            DailyDemandOutput matterDemand = new DailyDemandOutput();
            BeanUtils.copyProperties(md, matterDemand);
            matterDemand.setPurchaseCompanyLangLang(md.getPurchaseCompany());
            matterDemand.setIsCreateOrderLangLang(md.getIsCreateOrder());
            Result<UserInfoOutput> rs = authFigenClient.userDetail(md.getApplicantUserId());
            if (rs != null) {
                matterDemand.setStrApplicantUser(rs.getData().getUserName());
            }
            dailyDemandOutputs.add(matterDemand);
            // 需求申请人
        }
        return dailyDemandOutputs;
    }
}
