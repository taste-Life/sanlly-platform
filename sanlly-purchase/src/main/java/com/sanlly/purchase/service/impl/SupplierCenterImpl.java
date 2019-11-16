package com.sanlly.purchase.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.AuditStatusEnum;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.input.supplier.SupplierCompanyInput;
import com.sanlly.purchase.models.input.suppliercenter.SupplierCenterInput;
import com.sanlly.purchase.models.output.SupplierBascialInfoOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.models.output.supplier.SpecialOutput;
import com.sanlly.purchase.models.output.supplier.SupplierReportOutput;
import com.sanlly.purchase.models.output.supplierType.SupplierTypeBasicOutput;
import com.sanlly.purchase.models.output.suppliercenter.*;
import com.sanlly.purchase.service.SupplierCenter;
import com.sanlly.purchase.utils.HttpRequestFileUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mqz
 * @ClassName: SupplierCenterImpl
 * @Description:供应商个人中心实现类
 */
@Service
public class SupplierCenterImpl extends BaseServiceImpl implements SupplierCenter {

    @Autowired
    private SupplierMapper supplierDao;
    @Autowired
    private BankInformationMapper bankInformationMapper;
    @Autowired
    private ContactInformationMapper contactInformationMapper;
    @Autowired
    private QualificationDocumentsMapper qualificationDocumentsMapper;
    @Autowired
    private SupplierCompanyMapper supplierCompanyMapper;
    @Autowired
    private SupplierSpecialMapper supplierSpecialMapper;
    @Autowired
    private ManagementMapper managementMapper;
    @Autowired
    private SupplierTypeRelationalMapper supplierTypeRelationalMapper;
    @Autowired
    private SupplierReportExtDao supplierReportExtDao;
    @Autowired
    MatterTenderPurchaseMapper matterTenderPurchaseMapper;
    @Autowired
    MatterTenderProductMapper matterTenderProductMapper;

    /**
     * 根据供应商key查询供应商详细信息
     *
     * @param key
     * @return
     */
    @Override
    public PurcSupplierOutput getSupplierDetailByKey(String key) {

        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        criteria.andKeyEqualTo(key);
        List<Supplier> purcSuppliersList = supplierDao.selectByExample(example);
        PurcSupplierOutput output = new PurcSupplierOutput();
        if (purcSuppliersList.isEmpty()) {
            return null;
        } else {
            Supplier purcSupplier = purcSuppliersList.get(0);
            BeanUtils.copyProperties(purcSupplier, output);
            output.setIsBlackLangLang(output.getIsBlack());
            output.setIsMaterialsLangLang(output.getIsMaterials());
            output.setStorehouseTypeLangLang(output.getStorehouseType());
            // 结算信用期
            output.setSettlementCycleLangLang(purcSupplier.getSettlementCycle());
            // 评价等级国际化
            output.setGradeLangLang(purcSupplier.getGrade());
            // 结算类型国际化
            output.setSettlementTypeLangLang(purcSupplier.getSettlementType());
            output.setProcessInstanceId(purcSupplier.getProcessId());
            // 查询获取联系信息
            ContactInformationExample contactInformationExample = new ContactInformationExample();
            ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample.createCriteria();
            criteriaContactInformation.andSupplierEqualTo(purcSupplier.getKey());
            // 设置联系信息
            output.setContactInformations(contactInformationMapper.selectByExample(contactInformationExample));

            // 查询获取银行信息
            BankInformationExample bankInformationExample = new BankInformationExample();
            BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
            criteriaBankInformation.andSupplierEqualTo(purcSupplier.getKey());
            // 设置银行信息
            output.setBankInformations(bankInformationMapper.selectByExample(bankInformationExample));
            // 查询资质文件
            QualificationDocumentsExample qualificationDocumentsExample = new QualificationDocumentsExample();
            QualificationDocumentsExample.Criteria criteriaQd = qualificationDocumentsExample.createCriteria();
            criteriaQd.andSupplierEqualTo(purcSupplier.getKey());
            output.setQualificationDocuments(qualificationDocumentsMapper.selectByExample(qualificationDocumentsExample));
            // 查询管理文件
            ManagementExample managementExample = new ManagementExample();
            ManagementExample.Criteria criteriaMe = managementExample.createCriteria();
            criteriaMe.andSupplierEqualTo(purcSupplier.getKey());
            output.setManagements(managementMapper.selectByExample(managementExample));
            // 查询公司列表
            SupplierCompanyExample companyExample = new SupplierCompanyExample();
            SupplierCompanyExample.Criteria criteriaCom = companyExample.createCriteria();
            criteriaCom.andSupplierEqualTo(purcSupplier.getKey());
            List<SupplierCompany> companies = supplierCompanyMapper.selectByExample(companyExample);

            if (!companies.isEmpty()) {
                List<SupplierCompanyInput> companys = new ArrayList<SupplierCompanyInput>();
                for (SupplierCompany supplierCompany : companies) {
                    SupplierCompanyInput supplierCompanyInput = new SupplierCompanyInput();
                    supplierCompanyInput.setCompanyLangLang(supplierCompany.getCompany());
                    supplierCompanyInput.setCompany(supplierCompany.getCompany());
                    companys.add(supplierCompanyInput);
                }
                output.setCompanys(companys);
            }
            SupplierTypeRelationalExample supplierTypeRelationalExample = new SupplierTypeRelationalExample();
            supplierTypeRelationalExample.createCriteria().andSupplierEqualTo(purcSupplier.getKey());
            List<SupplierTypeRelational> supplierTypeRelationals = supplierTypeRelationalMapper.selectByExample(supplierTypeRelationalExample);
            List<SupplierTypeBasicOutput> supplierTypeBasicOutputs = new ArrayList<>();
            for (SupplierTypeRelational supplierTypeRelational : supplierTypeRelationals) {
                SupplierTypeBasicOutput supplierTypeBasicOutput = new SupplierTypeBasicOutput();
                supplierTypeBasicOutput.setSupplierType(supplierTypeRelational.getSupplierType());
                supplierTypeBasicOutput.setSupplierTypeLangLang(supplierTypeRelational.getSupplierType());
                supplierTypeBasicOutputs.add(supplierTypeBasicOutput);
            }
            output.setSupplierType(supplierTypeBasicOutputs);
            SupplierSpecialExample supplierSpecialExample = new SupplierSpecialExample();
            supplierSpecialExample.createCriteria().andSupplierEqualTo(purcSupplier.getKey());
            List<SupplierSpecial> supplierSpecials = supplierSpecialMapper.selectByExample(supplierSpecialExample);
            List<SpecialOutput> specialOutputs = new ArrayList<>();
            for (SupplierSpecial supplierSpecial : supplierSpecials) {
                SpecialOutput specialOutput = new SpecialOutput();
                BeanUtils.copyProperties(supplierSpecial, specialOutput);
                specialOutput.setFirstSpecialLangLang(supplierSpecial.getFirstSpecial());
                specialOutput.setSecondSpecialLangLang(supplierSpecial.getSecondSpecial());
                specialOutputs.add(specialOutput);
            }
            output.setSpecials(specialOutputs);

        }
        return output;
    }

    /**
     * Description 根据供应商key 获取供应商基本信息
     *
     * @param
     * @return SupplierBascialInfoOutput
     */
    @Override
    public List<SupplierBascialInfoOutput> querySuppplierBascialInfo(SupplierCenterInput supplierCenterInput) {
        // TODO Auto-generated method stub
        SupplierExample supplierExample2 = new SupplierExample();
        supplierExample2.createCriteria().andUserIdEqualTo(getCurrentUserId());
        System.out.println(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample2);
        supplierCenterInput.setKey(suppliers2.get(0).getKey());
        SupplierExample supplierExample = new SupplierExample();
        supplierExample.createCriteria().andKeyEqualTo(supplierCenterInput.getKey());
        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
        SupplierBascialInfoOutput supplierBascialInfoOutput = new SupplierBascialInfoOutput();
        Supplier supplier = suppliers.get(0);
        BeanUtils.copyProperties(supplier, supplierBascialInfoOutput);
        supplierBascialInfoOutput.setSettlementCycleLangLang(supplier.getSettlementCycle());
        supplierBascialInfoOutput.setNatureIdLangLang(supplier.getNatureId());
        supplierBascialInfoOutput.setProcureTypeLangLang(supplier.getProcureType());
        supplierBascialInfoOutput.setStorehouseTypeLangLang(supplier.getStorehouseType());
        supplierBascialInfoOutput.setSettlementTypeLangLang(supplier.getSettlementType());
        supplierBascialInfoOutput.setIsBlackLangLang(supplier.getIsBlack());

        // 查找开户行信息
        BankInformationExample bankInformationExample = new BankInformationExample();
        bankInformationExample.createCriteria().andSupplierEqualTo(supplierCenterInput.getKey());
        List<BankInformation> bankInformations = bankInformationMapper.selectByExample(bankInformationExample);
        List<SupplierBankInfoOutput> supplierBankInfoOutputs = new ArrayList<>();
        for (BankInformation bankInformation : bankInformations) {
            SupplierBankInfoOutput supplierBankInfoOutput = new SupplierBankInfoOutput();

            BeanUtils.copyProperties(bankInformation, supplierBankInfoOutput);
            supplierBankInfoOutput.setCurrencyLanglang(bankInformation.getCurrency());
            supplierBankInfoOutputs.add(supplierBankInfoOutput);

        }
        supplierBascialInfoOutput.setSupplierBankInfoOutputs(supplierBankInfoOutputs);
        // 查找联系人信息
        ContactInformationExample contactInformationExample = new ContactInformationExample();
        contactInformationExample.createCriteria().andSupplierEqualTo(supplierCenterInput.getKey());
        List<ContactInformation> contactInformations = contactInformationMapper
                .selectByExample(contactInformationExample);
        List<SupplierContactPersonOutput> supplierContactPersonOutputs = new ArrayList<SupplierContactPersonOutput>();
        for (ContactInformation contactInformation : contactInformations) {
            SupplierContactPersonOutput supplierContactPersonOutput = new SupplierContactPersonOutput();
            BeanUtils.copyProperties(contactInformation, supplierContactPersonOutput);
            supplierContactPersonOutputs.add(supplierContactPersonOutput);
        }

        supplierBascialInfoOutput.setSupplierContactOutputs(supplierContactPersonOutputs);
        //获取供应商类别
      /*  SupplierTypeRelationalExample supplierTypeRelationalExample = new SupplierTypeRelationalExample();
        supplierTypeRelationalExample.createCriteria().andSupplierEqualTo(supplier.getKey());
        List<SupplierTypeRelational> supplierTypeRelationals = supplierTypeRelationalMapper.selectByExample(supplierTypeRelationalExample);
        List<SupplierCenterTypeOutput> supplierTypeOutputs = new ArrayList<>();
        for (SupplierTypeRelational supplierTypeRelational : supplierTypeRelationals) {
            SupplierCenterTypeOutput supplierTypeOutput = new SupplierCenterTypeOutput();
            BeanUtils.copyProperties(supplierTypeRelational, supplierTypeOutput);
            supplierTypeOutput.setSupplierTypeLangLang(supplierTypeRelational.getSupplierType());
            supplierTypeOutputs.add(supplierTypeOutput);

        }
        supplierBascialInfoOutput.setSupplierCenterTypeOutputs(supplierTypeOutputs);*/
        // 查找供应公司信息
        SupplierCompanyExample supplierCompanyExample = new SupplierCompanyExample();
        supplierCompanyExample.createCriteria().andSupplierEqualTo(supplierCenterInput.getKey());
        List<SupplierCompany> supplierCompanies = supplierCompanyMapper.selectByExample(supplierCompanyExample);
        List<SupplierCompanyOutput> supplierCompanyOutputs = new ArrayList<>();
        for (SupplierCompany supplierCompany : supplierCompanies) {
            SupplierCompanyOutput supplierCompanyOutput = new SupplierCompanyOutput();
            supplierCompanyOutput.setCompanyLang(supplierCompany.getCompany());
            supplierCompanyOutputs.add(supplierCompanyOutput);
        }

        supplierBascialInfoOutput.setSupplierCompanyOutputs(supplierCompanyOutputs);
        //获取供应材料类别
       /* SupplierSpecialExample supplierSpecialExample = new SupplierSpecialExample();
        supplierSpecialExample.createCriteria().andSupplierEqualTo(supplierCenterInput.getKey());
        List<SupplierSpecial> supplierSpecials = supplierSpecialMapper.selectByExample(supplierSpecialExample);
        List<SupplierMatterTypeOutput> supplierMatterTypeOutputs = new ArrayList<>();
        for (SupplierSpecial supplierSpecial : supplierSpecials) {
            SupplierMatterTypeOutput supplierMatterTypeOutput = new SupplierMatterTypeOutput();
            // supplierMatterTypeOutput.setProcureType(supplier.getProcureType());
            BeanUtils.copyProperties(supplierSpecial, supplierMatterTypeOutput);
            supplierMatterTypeOutput.setFirstSpecialLangLang(supplierSpecial.getFirstSpecial());
            supplierMatterTypeOutput.setSecondSpecialLangLang(supplierSpecial.getSecondSpecial());
            supplierMatterTypeOutputs.add(supplierMatterTypeOutput);

        }*/
        //获取供应商资质文件
        QualificationDocumentsExample qualificationDocumentsExample = new QualificationDocumentsExample();
        qualificationDocumentsExample.createCriteria().andSupplierEqualTo(supplierCenterInput.getKey());
        List<QualificationDocuments> qualificationDocuments = qualificationDocumentsMapper.selectByExample(qualificationDocumentsExample);
        List<SupplierQualificationFileOutput> supplierQualificationFileOutputs = new ArrayList<>();
        for (QualificationDocuments qualificationDocument : qualificationDocuments) {
            SupplierQualificationFileOutput supplierQualificationFileOutput = new SupplierQualificationFileOutput();

            BeanUtils.copyProperties(qualificationDocument, supplierQualificationFileOutput);
            supplierQualificationFileOutputs.add(supplierQualificationFileOutput);

        }
        supplierBascialInfoOutput.setSupplierQualificationFileOutputs(supplierQualificationFileOutputs);
        //获取供应商管理文件
        ManagementExample managementExample = new ManagementExample();
        managementExample.createCriteria().andSupplierEqualTo(supplierCenterInput.getKey());
        List<Management> managements = managementMapper.selectByExample(managementExample);
        System.out.println(managements.size());
        List<SupplierManageFileOutput> supplierManageFileOutputs = new ArrayList<>();
        for (Management management : managements) {
            SupplierManageFileOutput supplierManageFileOutput = new SupplierManageFileOutput();
            BeanUtils.copyProperties(management, supplierManageFileOutput);
            File file = new File(management.getAttachmentPath());
            supplierManageFileOutputs.add(supplierManageFileOutput);
        }
        supplierBascialInfoOutput.setSupplierManageFileOutputs(supplierManageFileOutputs);


        //  supplierBascialInfoOutput.setSupplierMatterTypeOutputs(supplierMatterTypeOutputs);
        List<SupplierBascialInfoOutput> supplierBascialInfoOutputs = new ArrayList<>();
        supplierBascialInfoOutputs.add(supplierBascialInfoOutput);
        return supplierBascialInfoOutputs;

    }

    /**
     * 下载供应商文件
     *
     * @param response
     * @param supplier
     * @param file
     * @param type
     */
    @Override
    public void downloadFile(HttpServletResponse response, String supplier, String file, String type) {
        SupplierExample supplierExample = new SupplierExample();
        supplierExample.createCriteria().andUserIdEqualTo(getCurrentUserId());
        List<Supplier> suppliers2 = supplierDao.selectByExample(supplierExample);
        supplier = suppliers2.get(0).getKey();
        String fileFullPath = "";
        String filename = "";
        if (!type.contains("mmanage")) {

            QualificationDocumentsExample qualificationDocumentsExample = new QualificationDocumentsExample();
            qualificationDocumentsExample.createCriteria().andSupplierEqualTo(supplier).andDatafileNameEqualTo(file);
            List<QualificationDocuments> qualificationDocuments = qualificationDocumentsMapper
                    .selectByExample(qualificationDocumentsExample);
            fileFullPath = qualificationDocuments.get(0).getAttachmentPath();
            filename = qualificationDocuments.get(0).getDatafileName();

        } else {
            ManagementExample managementExample = new ManagementExample();
            managementExample.createCriteria().andSupplierEqualTo(supplier).andDatafileNameEqualTo(file);
            List<Management> managements = managementMapper.selectByExample(managementExample);
            fileFullPath = managements.get(0).getAttachmentPath();
            filename = managements.get(0).getDatafileName();
        }

        HttpRequestFileUtil.downLoadFile(response, fileFullPath, filename);


    }

    /**
     * 获取供应商报价情况
     *
     * @param key
     * @param startTime
     * @param endtime
     * @return
     */

    @Override
    public SupplierQuotionOutput getSupplierQuotion(String key, Date startTime, Date endtime) {
        SupplierQuotionOutput supplierQuotionOutput = new SupplierQuotionOutput();
        List<SupplierReportOutput> supplierReportOutputs = supplierReportExtDao.selectSupplierReport(key, startTime, endtime);
        if (supplierReportOutputs.isEmpty()) {
            supplierQuotionOutput.setQuotationNumber(0);
            supplierQuotionOutput.setSuccessNumber(0);
            supplierQuotionOutput.setTransactionAmount("0");
        } else {
            supplierQuotionOutput.setQuotationNumber((int) (supplierReportOutputs.get(0).getBiddingNum() + supplierReportOutputs.get(0).getInquiryNum()));
            supplierQuotionOutput.setStartTime(supplierReportOutputs.get(0).getStartTime());
            supplierQuotionOutput.setEndTime(supplierReportOutputs.get(0).getEndTime());
            MatterTenderPurchaseExample matterTenderPurchaseExample = new MatterTenderPurchaseExample();
            matterTenderPurchaseExample.createCriteria().andSelectSupplierEqualTo(key);
            List<MatterTenderPurchase> matterTenderPurchases = matterTenderPurchaseMapper.selectByExample(matterTenderPurchaseExample);
            supplierQuotionOutput.setSuccessNumber(matterTenderPurchases.size());
            BigDecimal amountall = new BigDecimal("0");

            for (MatterTenderPurchase matterTenderPurchase : matterTenderPurchases) {
                MatterTenderProductExample matterTenderProductExample = new MatterTenderProductExample();
                matterTenderProductExample.createCriteria().andTenderPurchaseIdEqualTo(matterTenderPurchase.getPurcMatterTenderPurchaseId());
                List<MatterTenderProduct> matterTenderProducts = matterTenderProductMapper.selectByExample(matterTenderProductExample);
                BigDecimal amount = new BigDecimal("0");
                for (MatterTenderProduct matterTenderProduct : matterTenderProducts) {
                    amount = amount.add(matterTenderProduct.getPrice().multiply(new BigDecimal(matterTenderProduct.getProductCount())));
                }
                amountall = amountall.add(amount);
            }
            supplierQuotionOutput.setTransactionAmount(amountall.toString());

        }

        return supplierQuotionOutput;
    }

    @Override
    public PagedList<PurcSupplierOutput> getSupplierByGrade(Integer index, Integer size, String name, String grade) {
        // 去重
        List<PurcSupplierOutput> outputs = new ArrayList<>();
        SearchPurcSupplierInput input = new SearchPurcSupplierInput();
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        // 名称与评价等级 模糊查询
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (StringUtils.isNotBlank(grade)) {
            criteria.andGradeLike("%" + grade + "%");
        }
        criteria.andIsBlackEqualTo(CommonEnum.NO.getCode());
        //非特殊关联企业
        criteria.andIsSpecialEqualTo(CommonEnum.NO.getCode());
        //物料供应商
        criteria.andIsEliminateEqualTo(CommonEnum.NO.getCode());
        criteria.andUserIdIsNotNull();
        criteria.andAuditStatusEqualTo(AuditStatusEnum.AUDITOK.getCode());
        criteria.andIsOneTimeEqualTo(CommonEnum.NO.getCode());
        //未删除
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        // 总条数
        Integer totalItemCount = (int) supplierDao.countByExample(supplierExample);
        PagedList<PurcSupplierOutput> pagedList = new PagedList<PurcSupplierOutput>(index, size, totalItemCount);

        supplierExample.setLimitStart(pagedList.getLimitStart());
        supplierExample.setLimitEnd(pagedList.getLimitEnd());
        List<Supplier> supplierList = supplierDao.selectByExample(supplierExample);

        // 复制内容 返回
        if (!supplierList.isEmpty()) {
            for (Supplier supplier : supplierList) {
                PurcSupplierOutput output = new PurcSupplierOutput();
                BeanUtils.copyProperties(supplier, output);
                output.setSupplierLangLang(supplier.getKey());
                output.setGradeLangLang(supplier.getGrade());
                output.setSettlementCycleLangLang(supplier.getSettlementCycle());
                outputs.add(output);
            }

            pagedList.getDataList().addAll(outputs);

        }

        return pagedList;
    }


}
