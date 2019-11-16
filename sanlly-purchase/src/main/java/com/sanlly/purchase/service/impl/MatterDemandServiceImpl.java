package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.MatterDemandMapper;
import com.sanlly.purchase.entity.MatterDemand;
import com.sanlly.purchase.entity.MatterDemandExample;
import com.sanlly.purchase.entity.PeriodProduct;
import com.sanlly.purchase.enums.PurchaseStatusEnum;
import com.sanlly.purchase.enums.PurchasingPatternEnum;
import com.sanlly.purchase.models.input.demand.*;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.service.AuthFigenClient;
import com.sanlly.purchase.service.MatterDemandService;
import com.sanlly.purchase.service.MatterTemporaryPurchaseService;
import com.sanlly.purchase.service.PeriodProductService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;
import com.sanlly.purchase.service.feign.WareFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Description: 采购需求
 *
 * @author jlx
 * @ClassName: MatterDemandServiceImpl
 * @date 2019年7月31日
 */
@Service
public class MatterDemandServiceImpl extends BaseServiceImpl implements MatterDemandService {
    @Autowired
    private MatterDemandMapper matterDemandDao;
    @Autowired
    private PeriodProductService periodProductService;
    @Autowired
    private MatterTemporaryPurchaseService matterTemporaryPurchaseService;
    //	@Autowired
//	private SupplierService supplierService;
    @Autowired
    private WareFeignClient wareFeignClient;
    @Autowired
    private AuthFigenClient authFigenClient;
    @Autowired
    private ProductionFeignClient productionFeignClient;


    @Override
    @Transactional
    public void addManualWareRequisitions(AddManualRequisitionsWareInput input) {
        Date date = new Date();
        Integer userId = getCurrentUserId();
        for (AddManualRequisitionsSpartsInput input1 : input.getStockinDetail()) {
            MatterDemand matterDemand = new MatterDemand();
            matterDemand.setCreateTime(date);
            matterDemand.setCreateUser(userId);
            matterDemand.setIsDel(CommonEnum.NO.getCode());
            matterDemand.setProductCount(0.0);
            matterDemand.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
            matterDemand.setIsPeriod(CommonEnum.YES.getCode());
            matterDemand.setComments(input1.getRemark());
            matterDemand.setDemandTime(date);
            matterDemand.setIsDayPruchase(CommonEnum.NO.getCode());
            matterDemand.setRequireArriveTime(input.getRequireArriveTime());
            matterDemand.setPurchaseCompany(getCurrentCompanyKey());
            matterDemand.setApplicantUserId(userId);
            matterDemand.setDemandNo((String) wareFeignClient.getBillNumber("采购需求单号",getCurrentCompanyKey()).getData());
            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(input1.getSpareParts()).getData();
            if (rsSparePart != null) {
                matterDemand.setProductNum(rsSparePart.getSparePartsNo());
                matterDemand.setProduct(rsSparePart.getKey());
                matterDemand.setGenaralType(rsSparePart.getSparePartsCategories());
                matterDemand.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
                matterDemand.setProductSpecial(rsSparePart.getSparePartsSpec());
                matterDemand.setProductModel(rsSparePart.getModel());
                matterDemand.setSparePartsUnit(rsSparePart.getSparePartsUnit());
                matterDemand.setPurchasingPattern(rsSparePart.getPurchasingPattern());
            }
            matterDemandDao.insertSelective(matterDemand);

        }
    }

    /**
     * 添加周期性采购需求
     */
    @Override
    @Transactional
    public void addMatterDemand(AddMatterDemandInput input) {
        MatterDemand matterDemand = new MatterDemand();
        BeanUtils.copyProperties(input, matterDemand);
        matterDemand.setCreateTime(new Date());
        matterDemand.setCreateUser(getCurrentUserId());
        matterDemand.setIsDel(CommonEnum.NO.getCode());
        matterDemand.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
        matterDemand.setIsPeriod(CommonEnum.YES.getCode());
        matterDemandDao.insertSelective(matterDemand);
    }

    /**
     * 编辑采购周期性采购需求
     *
     * @param input
     */
    @Override
    @Transactional
    public void eidtMatterDemand(editMatterDemandInput input) {
        MatterDemand matterDemand = new MatterDemand();
        BeanUtils.copyProperties(input, matterDemand);
        matterDemand.setUpdateTime(new Date());
        matterDemand.setUpdateUser(getCurrentUserId());
        SparePartsOutput rsSparePart = wareFeignClient.getSparePart(input.getProduct()).getData();
        if (rsSparePart != null) {
            matterDemand.setProductNum(rsSparePart.getSparePartsNo());
            matterDemand.setProduct(rsSparePart.getKey());
            matterDemand.setGenaralType(rsSparePart.getSparePartsCategories());
            matterDemand.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
            matterDemand.setProductSpecial(rsSparePart.getSparePartsSpec());
            matterDemand.setProductModel(rsSparePart.getModel());
            matterDemand.setSparePartsUnit(rsSparePart.getSparePartsUnit());
            matterDemand.setPurchasingPattern(rsSparePart.getPurchasingPattern());
        }
        matterDemandDao.updateByPrimaryKeySelective(matterDemand);


    }

    private static String fetchGroupKey(AddMatterDemandInput demand) {
        return demand.getWarehouse() + "#" + demand.getProduct();
    }


    /**
     * 仓库端批量审核采购需求
     *
     * @param input
     */
    @Override
    @Transactional
    public boolean addMutiMatterDemand(List<AddMatterDemandInput> inputList) {
        try {

            // 需求合并
//			Collections.sort(inputList);
//			List<AddMatterDemandInput> demandTogether = new ArrayList<AddMatterDemandInput>();
////			List<String> products = inputList.stream().map(d->d.getProduct()).collect(Collectors.toList());
////			List<String> warehouses = inputList.stream().map(d->d.getWarehouse ()).collect(Collectors.toList());
////			for(AddMatterDemandInput input : inputList) {
////				
////			}
//			Map<String,List<AddMatterDemandInput>> map = inputList.stream().collect(Collectors.groupingBy(e -> fetchGroupKey(e)));
////			Map<String, Map<String, List<AddMatterDemandInput>>> map = inputList.stream().collect(Collectors.groupingBy(
////					AddMatterDemandInput::getWarehouse, Collectors.groupingBy(AddMatterDemandInput::getProduct)));
//			for(String product:map.keySet()) {
//				List<AddMatterDemandInput> groupList = map.get(product);
//				AddMatterDemandInput input = new AddMatterDemandInput();
//				input = groupList.get(0);
//				input.setDemandNo(groupList.stream().map(p->p.getDemandNo()).collect(Collectors.joining(",")));
//				input.setProductCount(groupList.stream().mapToDouble(AddMatterDemandInput::getProductCount).sum());
//				demandTogether.add(input);
//			}
            for (AddMatterDemandInput input : inputList) {

                MatterDemand matterDemand = new MatterDemand();
                BeanUtils.copyProperties(input, matterDemand);
                matterDemand.setCreateTime(new Date());
                matterDemand.setCreateUser(input.getApplicantUserId());
                matterDemand.setIsDel(CommonEnum.NO.getCode());
                matterDemand.setIsPeriod(CommonEnum.NO.getCode());
                // 判断备件是否在周期性定价列表中
                PeriodProduct periodProduct = null;
//				if(PurchasingPatternEnum.AGREEMENT.getCode().equals(matterDemand.getPurchasingPattern())) {
                periodProduct = periodProductService.getSupplier(matterDemand.getProduct(), matterDemand.getWarehouse());
                matterDemand.setIsPeriodProduct(isPeriodProduct(periodProduct));
//				}
                // 临时、周期、单一直接生成采购单
                matterDemand.setIsCreateOrder(CreateOrder(matterDemand, periodProduct));

                matterDemandDao.insertSelective(matterDemand);

            }
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }
        return true;

    }

    /**
     * 判断备件是否为周期性定价
     *
     * @param product
     * @return
     */
    private String isPeriodProduct(PeriodProduct periodProduct) {
        if (periodProduct != null) {
            return CommonEnum.YES.getCode();
        }
        return CommonEnum.NO.getCode();

    }

    /**
     * 仓库审核后自动生成采购单
     *
     * @param matterDemand
     * @return
     * @throws Exception
     */
    private String CreateOrder(MatterDemand matterDemand, PeriodProduct periodProduct) throws Exception {

        AddMatterTemporaryPurchaseInput input = new AddMatterTemporaryPurchaseInput();

        List<MatterDemandOutput> matterDemandList = new ArrayList<MatterDemandOutput>();
        MatterDemandOutput mdo = new MatterDemandOutput();
//		List<MatterTenderProduct> productList = new ArrayList<MatterTenderProduct>();
        // 周期性定价、单一来源、临时应急采购时，自动生成采购单
        // 单一来源或临时应急
//		if (PurchasingPatternEnum.ONLY.getCode().equals(matterDemand.getPurchasingPattern())
//				|| PurchasingPatternEnum.TEMPORARY.getCode().equals(matterDemand.getPurchasingPattern())) {
//			input.setTenderType(matterDemand.getPurchasingPattern());
//		
//		} else 
        if (periodProduct != null && (matterDemand.getProductCount() != null && matterDemand.getProductCount() > 0)) {
            // 周期性定价
            input.setTenderType(PurchasingPatternEnum.AGREEMENT.getCode());
            input.setSupplier(periodProduct.getSupplier());
            input.setInvoiceType(periodProduct.getInvoice());
            mdo.setPrice(periodProduct.getProductPrice());
        } else {
            // 备件为招采模式且不在周期性定价物料列表中，不自动生成采购单
            return PurchaseStatusEnum.UNCREATED.getCode();
        }


        BeanUtils.copyProperties(matterDemand, mdo);
        matterDemandList.add(mdo);
        input.setMatterDemandList(matterDemandList);


        matterTemporaryPurchaseService.addMatterTemporaryPurchase(input);
        return PurchaseStatusEnum.CREATED.getCode();

    }

    /**
     * 分页查询
     */
    @Override
    public PagedList<MatterDemandOutput> getMatterDemandPagedList(SearchDemandOutputInput input) {
        MatterDemandExample example = new MatterDemandExample();
        MatterDemandExample.Criteria criteria = example.createCriteria();
        // 采购单状态
        criteria.andIsCreateOrderEqualTo(input.getIsCreateOrder());
        // 采购单位
        if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
            criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
        }
        // 采购模式
        if (StringUtils.isNotEmpty(input.getPurchasingPattern())) {
            criteria.andTenderTypeEqualTo(input.getPurchasingPattern());
        }
        // 备件大类
        if (StringUtils.isNotEmpty(input.getSparePartsCategories())) {
            criteria.andGenaralTypeEqualTo(input.getSparePartsCategories());
        }
        // 明细类别
        if (StringUtils.isNotEmpty(input.getSparePartsCategoriesDetails())) {
            criteria.andSecondTypeEqualTo(input.getSparePartsCategoriesDetails());
        }
        // 备件号
        if (StringUtils.isNotEmpty(input.getSparePartsNo())) {
            criteria.andProductNumLike("%" + input.getSparePartsNo() + "%");
        }
        if (StringUtils.isNotBlank(input.getIsPeriod())) {
            criteria.andIsPeriodEqualTo(input.getIsPeriod());
        }
        // 物料采购
        criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
        criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
        example.setOrderByClause("create_time desc");
        // 总条数
        Integer totalItemCount = (int) matterDemandDao.countByExample(example);
        // 分页查询
        PagedList<MatterDemandOutput> pagedList = new PagedList<MatterDemandOutput>(
                input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<MatterDemand> purcMatterDemandList = matterDemandDao.selectByExample(example);
        List<MatterDemandOutput> mdOutputList = new ArrayList<MatterDemandOutput>();
        // 取得用户信息
        List<Integer> userIds = purcMatterDemandList.stream().map(MatterDemand::getApplicantUserId).collect(Collectors.toList());
        List<Integer> disUserIds = userIds.stream().distinct().collect(Collectors.toList());
        List<UserInfoOutput> userInfoOutputs = authFigenClient.userDetails(disUserIds.toArray(new Integer[disUserIds.size()])).getData();
        Map<Integer, UserInfoOutput> userInfoOutputMap = userInfoOutputs.stream().collect(Collectors.toMap(UserInfoOutput::getUserId, user -> user));
        // 取得备件信息
        List<String> productKeys = purcMatterDemandList.stream().map(MatterDemand::getProduct).collect(Collectors.toList());
        List<String> disProductKeys = productKeys.stream().distinct().collect(Collectors.toList());
        List<SparePartsOutput> SparePartsOutputs = wareFeignClient.getSparePartes(disProductKeys.toArray(new String[disProductKeys.size()])).getData();
        Map<String, SparePartsOutput> SparePartsOutputMap = SparePartsOutputs.stream().collect(Collectors.toMap(SparePartsOutput::getKey, sp -> sp));

        for (MatterDemand md : purcMatterDemandList) {

            MatterDemandOutput matterDemand = new MatterDemandOutput();
            BeanUtils.copyProperties(md, matterDemand);
            // 需求申请人
//			Result rs = authFigenClient.userDetail(md.getApplicantUserId());
//			if(rs!=null) {
//				Map<String, String> map = (Map<String, String>) rs.getData();
//				matterDemand.setStrApplicantUser(map.get("userName"));
//			}
            matterDemand.setStrApplicantUser(userInfoOutputMap.get(md.getApplicantUserId()) == null ? null : userInfoOutputMap.get(md.getApplicantUserId()).getUserName());

            // 实际采购模式
            matterDemand.setTenderTypeLangLang(md.getTenderType());
            // 采购状态
            matterDemand.setIsCreateOrderLangLang(md.getIsCreateOrder());
            // 采购单位
            matterDemand.setPurchaseCompanyLangLang(md.getPurchaseCompany());
            // 备件大类
            matterDemand.setGenaralTypeLangLang(md.getGenaralType());
            // 备件明细
            matterDemand.setSecondTypeLangLang(md.getSecondType());
            // 仓库
            matterDemand.setWarehouseLangLang(md.getWarehouse());
            // 备件
            matterDemand.setProductLangLang(md.getProduct());

//			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(md.getProduct()).getData();
            SparePartsOutput rsSparePart = SparePartsOutputMap.get(md.getProduct());
            if (rsSparePart != null) {
                matterDemand.setProductSpecial(rsSparePart.getSparePartsSpec());
                matterDemand.setProductModel(rsSparePart.getModel());
                matterDemand.setProductUnit(rsSparePart.getSparePartsUnit());
                matterDemand.setProductUnitLangLang(rsSparePart.getSparePartsUnit());
                // 仓库提交采购模式
                matterDemand.setPurchasingPattern(rsSparePart.getPurchasingPattern());
                matterDemand.setPurchasingPatternLangLang(rsSparePart.getPurchasingPattern());
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
     * 获取选择的采购需求
     */
    @Override
    public List<MatterDemandOutput> getMatterDemand(Integer[] matterDemandIds) {
        MatterDemandExample example = new MatterDemandExample();
        MatterDemandExample.Criteria criteria = example.createCriteria();
        criteria.andPurcMatterDemandIdIn(Arrays.asList(matterDemandIds));
        List<MatterDemand> purcMatterDemandList = matterDemandDao.selectByExample(example);
        List<MatterDemandOutput> mdOutputList = new ArrayList<MatterDemandOutput>();
        BigDecimal sum = new BigDecimal("0");
        for (MatterDemand md : purcMatterDemandList) {

            MatterDemandOutput matterDemand = new MatterDemandOutput();
            BeanUtils.copyProperties(md, matterDemand);
            // 需求申请人
            UserInfoOutput rs = authFigenClient.userDetail(md.getApplicantUserId()).getData();
            if (rs != null) {
                matterDemand.setStrApplicantUser(rs.getUserName());
            }
            // 仓库提交采购模式
            matterDemand.setPurchasingPatternLangLang(md.getPurchasingPattern());
            // 实际采购模式
            matterDemand.setTenderTypeLangLang(md.getTenderType());
            // 采购状态
            matterDemand.setIsCreateOrderLangLang(md.getIsCreateOrder());
            // 采购单位
            matterDemand.setPurchaseCompanyLangLang(md.getPurchaseCompany());
            // 备件大类
            matterDemand.setGenaralTypeLangLang(md.getGenaralType());
            // 备件明细
            matterDemand.setSecondTypeLangLang(md.getSecondType());
            // 仓库
            matterDemand.setWarehouseLangLang(md.getWarehouse());
            // 备件名称
            matterDemand.setProductLangLang(md.getProduct());

            SparePartsOutput rsSparePart = wareFeignClient.getSparePart(md.getProduct()).getData();
            if (rsSparePart != null) {
                matterDemand.setProductSpecial(rsSparePart.getSparePartsSpec());
                matterDemand.setProductModel(rsSparePart.getModel());
                matterDemand.setProductUnit(rsSparePart.getSparePartsUnit());
                matterDemand.setProductUnitLangLang(rsSparePart.getSparePartsUnit());
                matterDemand.setLastPrice(wareFeignClient.getLastEntryPrice(md.getProduct(), md.getWarehouse()).getData());
                matterDemand.setPurchasingReferencePrice(rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0") : rsSparePart.getPurchasingReferencePrice());
                sum = sum.add(rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0") : rsSparePart.getPurchasingReferencePrice());
            }
            mdOutputList.add(matterDemand);
        }

        for (MatterDemandOutput matterDemand : mdOutputList) {
            // 权重计算
            if (sum.compareTo(BigDecimal.ZERO) == 0) {
                matterDemand.setWeight(1d);
            } else if (matterDemand.getPurchasingReferencePrice().compareTo(BigDecimal.ZERO) == 0) {
                matterDemand.setWeight(1d);
            } else {
                matterDemand.setWeight(matterDemand.getPurchasingReferencePrice().divide(sum, 2).doubleValue());
            }
        }
        return mdOutputList;

    }

}
