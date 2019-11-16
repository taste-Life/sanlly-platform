package com.sanlly.purchase.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.FinanceCurrencyType;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.user.AddUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.*;
import com.sanlly.purchase.models.input.ValidateUserInput;
import com.sanlly.purchase.models.input.feign.SearchModelInput;
import com.sanlly.purchase.models.input.feign.SparePartsCategoriesDetailsOutput;
import com.sanlly.purchase.models.input.supplier.*;
import com.sanlly.purchase.models.input.supplierspecial.SpecialInput;
import com.sanlly.purchase.models.output.feign.SparePartsCategoriesOutput;
import com.sanlly.purchase.models.output.lang.LangSelectOutput;
import com.sanlly.purchase.models.output.lang.SelectOptionOutput;
import com.sanlly.purchase.models.output.specialsupplier.SpecialSupplierOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.models.output.supplier.SpecialOutput;
import com.sanlly.purchase.models.output.supplier.SupplierReportOutput;
import com.sanlly.purchase.models.output.supplier.SupplierReviewOutput;
import com.sanlly.purchase.models.output.supplierType.SupplierTypeBasicOutput;
import com.sanlly.purchase.models.output.suppliercenter.SupplierQuotionOutput;
import com.sanlly.purchase.service.AuthFigenClient;
import com.sanlly.purchase.service.SupplierCenter;
import com.sanlly.purchase.service.SupplierService;
import com.sanlly.purchase.service.feign.ProductionFeignClient;
import com.sanlly.purchase.service.feign.WareFeignClient;
import com.sanlly.purchase.service.feign.WorkFlowFeignClient;
import com.sanlly.purchase.utils.MailUtil;
import com.sanlly.purchase.utils.ObjectIsNullUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl extends BaseServiceImpl implements SupplierService {
    // 供应商主表
    @Autowired
    private SupplierMapper supplierDao;
    // 银行信息
    @Autowired
    private BankInformationMapper bankInformationDao;
    // 公司联系方式
    @Autowired
    private CompanycontactInformationMapper companycontactInformationDao;
    // 联系人信息
    @Autowired
    private ContactInformationMapper contactInformationDao;
    // 管理文件表
    @Autowired
    private ManagementMapper managementDao;
    // 管理文件表
    @Autowired
    private ReceiverScoreMapper receiverScoreDao;
    // 备件类别表
    @Autowired
    private SupplierSpecialMapper supplierSpecialDao;
    // 资质文件表
    @Autowired
    private QualificationDocumentsMapper qualificationDocumentsDao;
    @Autowired
    private AuthFigenClient authFigenClient;
    // 审批
    @Autowired
    private WorkFlowFeignClient workFlowFeignClient;
    // 获取Key
    @Autowired
    private ProductionFeignClient productionFeignClient;
    // 供应商公司表
    @Autowired
    private SupplierCompanyMapper supplierCompanyDao;
    // 供应商评价公司表
    @Autowired
    private EvaluateLogMapper evaluateLogDao;
    @Autowired
    private SupplierCenter supplierCenter;
    @Autowired
    private SupplierTypeMapper supplierTypeDao;// 供应商类别

    @Autowired
    private SupplierTypeRelationalMapper supplierTypeRelationalDao;// 供应商类别子表
    @Autowired
    private SpecialSupplierMapper specialSupplierMapper;
    @Autowired
    WareFeignClient wareFeignClient;
    @Autowired
    SupplierNatureMapper supplierNatureMapper;
    @Autowired
    StorehouseTypeMapper storehouseTypeMapper;
    @Autowired
    ProcureTypeMapper procureTypeMapper;
    @Autowired
    SpecialSupplierLogMapper specialSupplierLogMapper;
    @Autowired
    ImportLogMapper importLogMapper;

    /**
     * 导入黑名单或特殊关联企业
     *
     * @param inputs
     * @throws Exception
     */
    @Override
    public List<SpecialSupplierOutput> importBlackList(List<AddBlackListInput> inputs) throws Exception {
        Integer userId = getCurrentUserId();
        // 设置时间部分
        Date date = new Date();
        List<SpecialSupplierOutput> result = new ArrayList<>();
        for (AddBlackListInput input : inputs) {
            SupplierExample supplierExample = new SupplierExample();
            supplierExample.createCriteria().andNameLike(input.getSupplierName());
            List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
            String supplierKey = null;
            if (!suppliers.isEmpty()) {
                supplierKey = suppliers.get(0).getKey();
                Supplier supplier = suppliers.get(0);
                if (input.getType().equals(SupplierTypeEnum.SupplierTypeEnumC.getCode())) {
                    supplier.setIsSpecial(CommonEnum.YES.getCode());
                }
                if (input.getType().equals(SupplierTypeEnum.SupplierTypeEnumD.getCode())) {
                    supplier.setIsEliminate(CommonEnum.YES.getCode());
                }
                if (input.getType().equals(SupplierTypeEnum.SupplierTypeEnumB.getCode()) || input.getType().equals(SupplierTypeEnum.SupplierTypeEnumA.getCode())) {
                    supplier.setIsBlack(CommonEnum.YES.getCode());
                }
                supplierDao.updateByPrimaryKeySelective(supplier);
                SpecialSupplierOutput specialSupplierOutput = new SpecialSupplierOutput();
                specialSupplierOutput.setName(supplier.getName());
                specialSupplierOutput.setNameEn(supplier.getNameEn());
                specialSupplierOutput.setUpdateTime(date);
                specialSupplierOutput.setSupplierTypeLangLang(input.getType());
                specialSupplierOutput.setSupplierType(input.getType());
                Result<UserInfoOutput> result1 = authFigenClient.userDetail(userId);
                specialSupplierOutput.setUpdateUser(result1.getData().getUserName());
                result.add(specialSupplierOutput);

            }

            SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
            specialSupplierExample.createCriteria().andNameLike(input.getSupplierName())
                    .andSupplierTypeEqualTo(input.getType());
            List<SpecialSupplier> specialSuppliers = specialSupplierMapper.selectByExample(specialSupplierExample);
            if (specialSuppliers.isEmpty()) {
                SpecialSupplier specialSupplier = new SpecialSupplier();
                specialSupplier.setName(input.getSupplierName());
                specialSupplier.setNameEn(input.getSupplierNameEn());
                specialSupplier.setSupplierType(input.getType());
                specialSupplier.setUpdateTime(date);
                specialSupplier.setCreateTime(date);
                specialSupplier.setUpdateUser(userId);
                specialSupplier.setCreateUser(userId);
                specialSupplierMapper.insertSelective(specialSupplier);
            }
            SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
            specialSupplierLog.setSupplier(supplierKey);
            specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
            specialSupplierLog.setCreateTime(date);
            specialSupplierLog.setCreateUser(userId);
            specialSupplierLog.setUpdateTime(date);
            specialSupplierLog.setUpdateUser(userId);
            specialSupplierLog.setOperationType(OperationTypeEnum.OperationTypeEnum01.getCode());
            specialSupplierLog.setOperationUserId(userId);
            specialSupplierLog.setSupplierName(input.getSupplierName());
            specialSupplierLog.setLogType(input.getType());
            specialSupplierLogMapper.insertSelective(specialSupplierLog);

        }
        return result;

    }

    /**
     * 供应商批量导入
     *
     * @throws Exception
     */
    @Override
    @Transactional
    public void importSupplier(List<ImportSupplierInput> inputs) throws Exception {
        Integer userId = getCurrentUserId();
        // 设置时间部分
        Date date = new Date();
        System.out.println("inputs.size()" + inputs.size());
        try {
            for (ImportSupplierInput input : inputs) {
                String supplerKey = null;
                Supplier supplier = new Supplier();
                SupplierExample supplierExample = new SupplierExample();
                supplierExample.createCriteria().andNameLike("%" + input.getName() + "%").andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
                if (suppliers.isEmpty()) {

                    BeanUtils.copyProperties(input, supplier);
                    // 插入创建者
                    supplier.setFoundDate(new SimpleDateFormat("yyyyMMdd").parse(input.getFoundDate()));
                    supplier.setCreateUser(userId);
                    supplier.setUpdateUser(userId);
                    supplier.setCreateTime(date);
                    supplier.setUpdateTime(date);
                    supplier.setIsOneTime(CommonEnum.NO.getCode());
                    // 生成供应商的Key
                    Result result = productionFeignClient.getKey("purc_supplier");
                    if (result.getData() != null) {
                        supplier.setKey((String) result.getData());
                    }
                    // 设置是否黑名单
                    supplier.setIsBlack(CommonEnum.NO.getCode());
                    supplier.setIsSpecial(CommonEnum.NO.getCode());
                    // supplier.setIsEliminate(CommonEnum.NO.getCode());
                    // 设置未删除固定
                    supplier.setIsDel(PlatformConstants.ISDEL_NO);
                    // 设置审核标记
                    //supplier.setAuditStatus(SupplierReviewEnum.UNREVIEW.getCode());
                    supplier.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                    supplier.setRegistrationMethod(RegistrationMethodEnum.IMPORT.getCode());
                    supplier.setMobilePhoneNum(input.getMobilePhone());
                    if (StringUtils.isNotBlank(input.getNatureId())) {
                        SupplierNatureExample supplierNatureExample = new SupplierNatureExample();
                        supplierNatureExample.createCriteria().andSupplierNatureNameEqualTo(input.getNatureId());
                        List<SupplierNature> supplierNatures = supplierNatureMapper.selectByExample(supplierNatureExample);
                        supplier.setNatureId(supplierNatures.get(0).getKey());
                    }
                    if (StringUtils.isNotBlank(input.getStorehouseType())) {
                        StorehouseTypeExample storehouseTypeExample = new StorehouseTypeExample();
                        storehouseTypeExample.createCriteria().andStorehouseTypeNameLike("%" + input.getStorehouseType() + "%");
                        supplier.setStorehouseType(storehouseTypeMapper.selectByExample(storehouseTypeExample).get(0).getKey());

                    }
                    if (StringUtils.isNotBlank(input.getProcureType())) {
                        ProcureTypeExample procureTypeExample = new ProcureTypeExample();
                        procureTypeExample.createCriteria().andProcureTypeNameLike("%" + input.getProcureType() + "%");
                        supplier.setProcureType(procureTypeMapper.selectByExample(procureTypeExample).get(0).getKey());
                    }
                    if (StringUtils.isNotBlank(input.getSettlementCycle())) {
                        supplier.setSettlementCycle(SettlementCycleEnum.getSettlementCycleEnumByCode(StringUtils.trim(input.getSettlementCycle())).getCode());
                    }
                    if (StringUtils.isNotBlank(input.getCurrency())) {
                        supplier.setCurrency(FinanceCurrencyType.getFinanceCurrencyTypeByCode(StringUtils.trim(input.getCurrency())).getCode());

                    }
                    if (StringUtils.isNotBlank(input.getSettlementType())) {
                        supplier.setSettlementType(SettlementTypeEnum.getSettlementTypeEnumByCode(StringUtils.trim(input.getSettlementType())).getCode());

                    }
                    if ("淘汰".equals(input.getIsEliminate())) {
                        supplier.setIsEliminate(CommonEnum.YES.getCode());
                    } else {
                        supplier.setIsEliminate(CommonEnum.NO.getCode());
                    }
                    if (StringUtils.isNotBlank(input.getGrade())) {
                        supplier.setGrade(GradeEnum.getGradeEnumEnumByCode(StringUtils.trim(input.getGrade())).getCode());
                    }


                    supplerKey = supplier.getKey();
                } else {
                    supplerKey = suppliers.get(0).getKey();
                }
                BankInformationExample bankInformationExample = new BankInformationExample();
                bankInformationExample.createCriteria().andSupplierEqualTo(supplerKey);
                BankInformation bankInformation = new BankInformation();
                BeanUtils.copyProperties(input, bankInformation);
                if (!ObjectIsNullUtils.checkObjFieldIsNull(bankInformation)) {
                    if (StringUtils.isNotBlank(input.getCurrency())) {
                        bankInformation.setCurrency(FinanceCurrencyType.getFinanceCurrencyTypeByCode(StringUtils.trim(input.getCurrency())).getCode());
                    }
                    bankInformation.setSupplier(supplerKey);
                    bankInformation.setCreateUser(userId);
                    bankInformation.setUpdateTime(date);
                    bankInformation.setCreateTime(date);
                    bankInformation.setUpdateUser(userId);
                    bankInformationDao.insertSelective(bankInformation);
                }


                ContactInformationExample contactInformationExample = new ContactInformationExample();
                contactInformationExample.createCriteria().andSupplierEqualTo(supplerKey);
                ContactInformation contactInformation = new ContactInformation();
                BeanUtils.copyProperties(input, contactInformation);
                if (!ObjectIsNullUtils.checkObjFieldIsNull(contactInformation)) {
                    contactInformation.setSupplier(supplerKey);
                    contactInformation.setCreateUser(userId);
                    contactInformation.setUpdateTime(date);
                    contactInformation.setCreateTime(date);
                    contactInformation.setUpdateUser(userId);
                    contactInformationDao.insertSelective(contactInformation);

                }
                if (StringUtils.isNotBlank(input.getSupplierType())) {
                    SupplierTypeExample supplierTypeExample = new SupplierTypeExample();
                    supplierTypeExample.createCriteria().andSupplierTypeNameLike("%" + input.getSupplierType() + "%");
                    SupplierTypeRelational supplierTypeRelational = new SupplierTypeRelational();
                    supplierTypeRelational.setSupplierType(supplierTypeDao.selectByExample(supplierTypeExample).get(0).getKey());
                    supplierTypeRelational.setSupplier(supplerKey);
                    SupplierTypeRelationalExample supplierTypeRelationalExample = new SupplierTypeRelationalExample();
                    supplierTypeRelationalExample.createCriteria().andSupplierEqualTo(supplerKey).andSupplierTypeEqualTo(supplierTypeDao.selectByExample(supplierTypeExample).get(0).getKey());
                    if (supplierTypeRelationalDao.countByExample(supplierTypeRelationalExample) == 0) {
                        supplierTypeRelational.setCreateUser(userId);
                        supplierTypeRelational.setUpdateTime(date);
                        supplierTypeRelational.setCreateTime(date);
                        supplierTypeRelational.setUpdateUser(userId);
                        supplierTypeRelationalDao.insertSelective(supplierTypeRelational);
                    }

                }

                if (StringUtils.isNotBlank(input.getSupplierCompany())) {
                    if ("全国".equals(StringUtils.trim(input.getSupplierCompany()))) {

                        BaseSearchInput baseSearchInput = new BaseSearchInput();
                        baseSearchInput.setName(null);
                        baseSearchInput.setCompanyKey(null);
                        baseSearchInput.setYardKey(null);
                        Result<List<CompanyOutput>> result = productionFeignClient.list(baseSearchInput);
                        for (CompanyOutput companyOutput : result.getData()) {
                            if (companyOutput.getCompanyName().contains("总部")) {
                                continue;
                            }

                            SupplierCompanyExample supplierCompanyExample = new SupplierCompanyExample();
                            supplierCompanyExample.createCriteria().andSupplierEqualTo(supplerKey).andCompanyEqualTo(companyOutput.getKey());
                            List<SupplierCompany> supplierCompanies = supplierCompanyDao.selectByExample(supplierCompanyExample);
                            if (supplierCompanies.isEmpty()) {
                                SupplierCompany supplierCompany = new SupplierCompany();
                                supplierCompany.setSupplier(supplerKey);
                                supplierCompany.setCompany(companyOutput.getKey());
                                supplierCompany.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                                supplierCompany.setCreateUser(userId);
                                supplierCompany.setUpdateTime(date);
                                supplierCompany.setCreateTime(date);
                                supplierCompany.setUpdateUser(userId);
                                supplierCompanyDao.insertSelective(supplierCompany);
                            }

                        }


                    } else {
                        BaseSearchInput baseSearchInput = new BaseSearchInput();
                        baseSearchInput.setName(StringUtils.trim(input.getSupplierCompany()));
                        Result<List<CompanyOutput>> result = productionFeignClient.list(baseSearchInput);
                        for (CompanyOutput companyOutput : result.getData()) {
                            SupplierCompanyExample supplierCompanyExample = new SupplierCompanyExample();
                            supplierCompanyExample.createCriteria().andSupplierEqualTo(supplerKey).andCompanyEqualTo(companyOutput.getKey());
                            List<SupplierCompany> supplierCompanies = supplierCompanyDao.selectByExample(supplierCompanyExample);
                            if (supplierCompanies.isEmpty()) {
                                SupplierCompany supplierCompany = new SupplierCompany();
                                supplierCompany.setSupplier(supplerKey);
                                supplierCompany.setCompany(companyOutput.getKey());
                                supplierCompany.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                                supplierCompany.setCreateUser(userId);
                                supplierCompany.setUpdateTime(date);
                                supplierCompany.setCreateTime(date);
                                supplierCompany.setUpdateUser(userId);
                                supplierCompanyDao.insertSelective(supplierCompany);
                            }
                        }
                    }
                }

                List<String[]> firstSpecial = new ArrayList<>();
                List<String[]> secondSpecial = new ArrayList<>();
                if (StringUtils.isNotBlank(input.getFirstSpecial())) {
                    String[] firstSpecial1 = input.getSecondSpecial().split("/");
                    for (String string : firstSpecial1) {
                        String[] strings = string.split(",|，");
                        firstSpecial.add(strings);
                    }
                }
                if (StringUtils.isNotBlank(input.getSecondSpecial())) {
                    String[] secondSpecial1 = input.getSecondSpecial().split("/");
                    for (String string : secondSpecial1) {
                        String[] strings = string.split(",|，");
                        secondSpecial.add(strings);
                    }
                }
                for (int i = 0; i < secondSpecial.size(); i++) {
                    if (secondSpecial.get(i) != null) {
                        for (String string : secondSpecial.get(i)) {
                            Result<List<SparePartsCategoriesDetailsOutput>> result = wareFeignClient.sparePartsCategoriesDetailsList(null, null, null, string);
                            if (result.getData() != null) {
                                SupplierSpecialExample supplierSpecialExample = new SupplierSpecialExample();
                                supplierSpecialExample.createCriteria().andSupplierEqualTo(supplerKey).andFirstSpecialEqualTo(result.getData().get(0).getSparePartsCategories())
                                        .andSecondSpecialEqualTo(result.getData().get(0).getKey());
                                List<SupplierSpecial> supplierSpecials = supplierSpecialDao.selectByExample(supplierSpecialExample);
                                if (supplierSpecials.isEmpty()) {
                                    SupplierSpecial supplierSpecial = new SupplierSpecial();
                                    supplierSpecial.setSecondSpecial(result.getData().get(0).getKey());
                                    supplierSpecial.setSupplier(supplerKey);
                                    supplierSpecial.setFirstSpecial(result.getData().get(0).getSparePartsCategories());
                                    supplierSpecial.setCreateUser(userId);
                                    supplierSpecial.setUpdateTime(date);
                                    supplierSpecial.setCreateTime(date);
                                    supplierSpecial.setUpdateUser(userId);
                                    supplierSpecialDao.insertSelective(supplierSpecial);
                                }

                            }


                        }
                    } else {
                        if (firstSpecial.get(i) != null) {
                            Result<List<SparePartsCategoriesOutput>> result = wareFeignClient.getsparePartsCategoriesList();
                            for (SparePartsCategoriesOutput sparePartsCategoriesOutput : result.getData()) {
                                if (sparePartsCategoriesOutput.getSparePartsCategoriesName().contains(input.getFirstSpecial())) {

                                    for (SparePartsCategoriesDetailsOutput sparePartsCategoriesDetailsOutput : sparePartsCategoriesOutput.getDetails()) {
                                        SupplierSpecialExample supplierSpecialExample = new SupplierSpecialExample();
                                        supplierSpecialExample.createCriteria().andSupplierEqualTo(supplerKey)
                                                .andFirstSpecialEqualTo(sparePartsCategoriesOutput.getKey())
                                                .andSecondSpecialEqualTo(sparePartsCategoriesDetailsOutput.getKey());
                                        List<SupplierSpecial> supplierSpecials = supplierSpecialDao.selectByExample(supplierSpecialExample);
                                        if (supplierSpecials.isEmpty()) {
                                            SupplierSpecial supplierSpecial = new SupplierSpecial();
                                            supplierSpecial.setSecondSpecial(sparePartsCategoriesDetailsOutput.getKey());
                                            supplierSpecial.setSupplier(supplerKey);
                                            supplierSpecial.setFirstSpecial(sparePartsCategoriesOutput.getKey());
                                            supplierSpecial.setCreateUser(userId);
                                            supplierSpecial.setUpdateTime(date);
                                            supplierSpecial.setCreateTime(date);
                                            supplierSpecial.setUpdateUser(userId);
                                            supplierSpecialDao.insertSelective(supplierSpecial);
                                        }

                                    }
                                }

                            }
                        }

                    }
                }


                if (suppliers.isEmpty()) {
                    supplierDao.insertSelective(supplier);

                }
                ImportLog importLog = new ImportLog();
                importLog.setCreateTime(date);
                importLog.setCreateUser(userId);
                importLog.setOperationUserId(userId);
                importLog.setUpdateTime(date);
                importLog.setUpdateUser(userId);
                importLog.setSupplier(supplerKey);
                importLogMapper.insertSelective(importLog);

            }
        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * 供应商新增
     *
     * @param AddPurcSupplierInput
     * @author mx
     * @update lsz
     */
    @Override
    @Transactional
    public Result addSupplier(AddPurcSupplierInput input) throws Exception {
        SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
        specialSupplierExample.createCriteria().andNameLike(input.getName());
        List<SpecialSupplier> specialSuppliers = specialSupplierMapper.selectByExample(specialSupplierExample);
        specialSupplierExample.clear();
        specialSupplierExample.createCriteria().andNameEnLike(input.getNameEn());
        List<SpecialSupplier> specialSuppliers1 = specialSupplierMapper.selectByExample(specialSupplierExample);

        if (!specialSuppliers.isEmpty() || !specialSuppliers1.isEmpty()) {
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "供应商已存在");


        }
        SupplierExample supplierExample = new SupplierExample();
        supplierExample.createCriteria().andNameLike(input.getName());
        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
        if (supplierDao.countByExample(supplierExample) != 0) {
            return Result.Error(ResultCodeEnum.ERROR.getCode(), "此供应商禁止注册");

        }
        //
        Integer userId = getCurrentUserId();
        // 设置时间部分
        Date date = new Date();
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(input, supplier);
        if (!input.getContactInformations().isEmpty()) {
            supplier.setMobilePhoneNum(input.getContactInformations().get(0).getMobilePhone());
        }
        // 币种
        // 生成供应商的Key
        Result result = productionFeignClient.getKey("purc_supplier");
        if (result.getData() != null) {
            supplier.setKey((String) result.getData());
        }
        // 设置是否黑名单
        supplier.setIsBlack(CommonEnum.NO.getCode());
        supplier.setIsSpecial(CommonEnum.NO.getCode());
        // 设置未删除固定
        supplier.setIsDel(PlatformConstants.ISDEL_NO);
        // 设置审核标记
        //supplier.setAuditStatus(SupplierReviewEnum.UNREVIEW.getCode());
        supplier.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
        supplier.setIsEliminate(CommonEnum.NO.getCode());
        if (userId != null) {
            supplier.setRegistrationMethod(RegistrationMethodEnum.PASSIVE.getCode());
        } else {
            supplier.setRegistrationMethod(RegistrationMethodEnum.ACTIVE.getCode());
        }
        // 插入创建者
        supplier.setCreateUser(userId);
        supplier.setUpdateUser(userId);
        supplier.setCreateTime(date);
        supplier.setUpdateTime(date);
        supplier.setIsOneTime(CommonEnum.NO.getCode());
        // 0.发起审核流程
        JSONObject obj = new JSONObject();
        obj.put("key", "SupplierRegister");

        JSONObject vars = new JSONObject();
        // 发起人ID
        // 判断用户id是否为空
        /*if (input.getUserId() != null && !input.getUserId().equals("")) {
            vars.put("userId", input.getUserId());
        }*/
        vars.put("userId", "supplier");
        // 公司key
        //vars.put("companyKey", "LKCOMPANY0000012");
        vars.put("companyKey", "sanlly");
        obj.put("vars", vars);
        // 发起审核流程
        String processId = workFlowFeignClient.startByKeyWithVars(obj);
        if (processId == null) {
            throw new RuntimeException("workflowError");
        }
        // 设置保存审核id
        supplier.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
        supplier.setProcessId(processId);


        // 插入从表
        if (input.getSupplierTypeInput() != null) {
            for (SupplierTypeInput supplierTypeInput : input.getSupplierTypeInput()) {
                System.out.println("input.getSupplierTypeInput().size():" + input.getSupplierTypeInput().size());
                SupplierTypeRelational supplierTypeRelational = new SupplierTypeRelational();
                supplierTypeRelational.setSupplierType(supplierTypeInput.getSupplierType());
                supplierTypeRelational.setSupplier(supplier.getKey());
                supplierTypeRelational.setCreateTime(date);
                supplierTypeRelational.setUpdateTime(date);
                supplierTypeRelational.setCreateUser(userId);
                supplierTypeRelational.setUpdateUser(userId);
                supplierTypeRelationalDao.insertSelective(supplierTypeRelational);

            }
        }
        if (input.getQualificationDocuments() != null) {
            for (int i = 0; i < input.getQualificationDocuments().size(); i++) {
                input.getQualificationDocuments().get(i).setSupplier(supplier.getKey());
                input.getQualificationDocuments().get(i).setCreateTime(date);
                input.getQualificationDocuments().get(i).setUpdateTime(date);
                input.getQualificationDocuments().get(i).setCreateUser(userId);
                input.getQualificationDocuments().get(i).setUpdateUser(userId);
                qualificationDocumentsDao.insertSelective(input.getQualificationDocuments().get(i));
            }
        }
        if (input.getContactInformations() != null) {
            for (ContactInformation purcContactInformation : input.getContactInformations()) {
                purcContactInformation.setSupplier(supplier.getKey());
                purcContactInformation.setCreateTime(date);
                purcContactInformation.setUpdateTime(date);
                purcContactInformation.setCreateUser(userId);
                purcContactInformation.setUpdateUser(userId);
                contactInformationDao.insertSelective(purcContactInformation);
            }
        }
        if (input.getManagements() != null) {
            for (Management purcManagement : input.getManagements()) {
                purcManagement.setSupplier(supplier.getKey());
                purcManagement.setCreateTime(date);
                purcManagement.setCreateUser(userId);
                purcManagement.setUpdateTime(date);
                purcManagement.setUpdateUser(userId);
                managementDao.insertSelective(purcManagement);
            }
        }
        if (input.getBankInformations() != null) {
            for (BankInformation purcBankInformation : input.getBankInformations()) {
                purcBankInformation.setSupplier(supplier.getKey());
                purcBankInformation.setCreateTime(date);
                purcBankInformation.setCreateUser(userId);
                purcBankInformation.setUpdateTime(date);
                purcBankInformation.setUpdateUser(userId);
                purcBankInformation.setCurrency(supplier.getCurrency());
                bankInformationDao.insertSelective(purcBankInformation);
            }
        }
        // 插入供应商一级材料类别
        if (input.getSpecials() != null) {
            for (SpecialInput supplierSpecial : input.getSpecials()) {
                if (StringUtils.isNotBlank(supplierSpecial.getSecondSpecial())) {
                    SupplierSpecial special = new SupplierSpecial();
                    special.setSecondSpecial(supplierSpecial.getSecondSpecial());
                    special.setFirstSpecial(supplierSpecial.getFirstSpecial());
                    special.setSupplier(supplier.getKey());
                    supplierSpecialDao.insertSelective(special);
                } else {
                    Result<List<SparePartsCategoriesDetailsOutput>> result1 = wareFeignClient.getCategoriesDetailsByCategoriesKey(supplierSpecial.getFirstSpecial());
                    if (result1.getData() != null) {
                        for (SparePartsCategoriesDetailsOutput sparePartsCategoriesDetailsOutput : result1.getData()) {
                            SupplierSpecial special = new SupplierSpecial();
                            special.setSecondSpecial(sparePartsCategoriesDetailsOutput.getKey());
                            special.setFirstSpecial(sparePartsCategoriesDetailsOutput.getSparePartsCategories());
                            special.setSupplier(supplier.getKey());
                            supplierSpecialDao.insertSelective(special);

                        }
                    }
                }

            }
        }

        // 供应商二级材料类别

        // 插入供应商评价表

        // 定义评价基础分
        EvaluateLog evaluateLog = new EvaluateLog();

        evaluateLog.setCreateTime(date);
        evaluateLog.setCreateUser(userId);
        evaluateLog.setUpdateTime(date);
        evaluateLog.setUpdateUser(userId);
        // 设置资质分
        evaluateLog.setQualificationScore((double) 50);
        // 设置信用期得分
        if (input.getSettlementCycle().equals(SettlementCycleEnum.PREPAID.getCode())) {
            evaluateLog.setCreditScore((double) 0);
        }
        if (input.getSettlementCycle().equals(SettlementCycleEnum.COD.getCode())) {
            evaluateLog.setCreditScore((double) 1);
        }
        if (input.getSettlementCycle().equals(SettlementCycleEnum.DAY_15.getCode())) {
            evaluateLog.setCreditScore((double) 2);
        }
        if (input.getSettlementCycle().equals(SettlementCycleEnum.DAY_30.getCode())) {
            evaluateLog.setCreditScore((double) 4);
        }
        if (input.getSettlementCycle().equals(SettlementCycleEnum.DAY_45.getCode())) {
            evaluateLog.setCreditScore((double) 6);
        }
        if (input.getSettlementCycle().equals(SettlementCycleEnum.DAY_60.getCode())) {
            evaluateLog.setCreditScore((double) 8);
        }
        if (input.getSettlementCycle().equals(SettlementCycleEnum.DAY_90.getCode())) {
            evaluateLog.setCreditScore((double) 10);
        }
        // 设置基础分
        evaluateLog.setBaseScore(evaluateLog.getCreditScore() + evaluateLog.getQualificationScore());
        // 设置质量
        evaluateLog.setQualityScore((double) 5);
        // 设置评价分
        evaluateLog.setEvaluateScore((double) 20);
        // 设置交货及时性
        evaluateLog.setTimelyScore((double) 5);
        // 设置价格分
        evaluateLog.setPriceScore((double) 5);
        // 设置服务
        evaluateLog.setServiceScore((double) 5);

        // 设置等级
        if (evaluateLog.getBaseScore() + evaluateLog.getEvaluateScore() > 90) {
            evaluateLog.setGrade(GradeEnum.GradeA.getCode());
        }
        if (evaluateLog.getBaseScore() + evaluateLog.getEvaluateScore() > 80) {
            evaluateLog.setGrade(GradeEnum.GradeB.getCode());
        }
        if (evaluateLog.getBaseScore() + evaluateLog.getEvaluateScore() > 70) {
            evaluateLog.setGrade(GradeEnum.GradeC.getCode());
        }
        if (evaluateLog.getBaseScore() + evaluateLog.getEvaluateScore() > 60) {
            evaluateLog.setGrade(GradeEnum.GradeD.getCode());
        }
        if (evaluateLog.getBaseScore() + evaluateLog.getEvaluateScore() < 60) {
            evaluateLog.setGrade(GradeEnum.GradeE.getCode());
        }
        evaluateLog.setSupplier(supplier.getKey());
        // 插入基础评价
        evaluateLogDao.insertSelective(evaluateLog);

        // 插入多个分公司
        if (input.getCompanys() != null) {
            for (String company : input.getCompanys()) {
                SupplierCompany supplierCompany = new SupplierCompany();
                supplierCompany.setSupplier(supplier.getKey());
                supplierCompany.setCompany(company);
                supplierCompany.setCreateTime(date);
                supplierCompany.setCreateUser(userId);
                supplierCompany.setUpdateTime(date);
                supplierCompany.setUpdateUser(userId);
                supplierCompanyDao.insertSelective(supplierCompany);
            }

        }
        supplier.setGrade(evaluateLog.getGrade());

      /*  // 保存供应种类
        input.getSpecials().forEach(special -> {
            SupplierSpecial supplierSpecial = new SupplierSpecial();
            supplierSpecial.setSupplier(supplier.getKey());
            supplierSpecial.setFirstSpecial(special.getFirstSpecial());
            supplierSpecial.setSecondSpecial(special.getSecondSpecial());
            supplierSpecial.setCreateTime(date);
            supplierSpecial.setCreateUser(userId);
            supplierSpecialDao.insertSelective(supplierSpecial);
        });*/
        // 插入供应商主表
        supplierDao.insertSelective(supplier);
        return Result.Success();
    }

    /**
     * 供应商邮件激活
     *
     * @param MailActivationInput
     * @throws MessagingException
     * @throws AddressException
     * @author mx
     */
    @Override
    public Result supplierMailActivation(MailActivationInput input) throws AddressException, MessagingException {
        // TODO Auto-generated method stub
        // 验证供应商是否存在
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andNameEqualTo(input.getSupplier());
        List<Supplier> purcSuppliers = supplierDao.selectByExample(supplierExample);

        if (purcSuppliers.isEmpty()) {
            throw new RuntimeException("supplier is not exist");
        }

        Supplier supplier = purcSuppliers.get(0);

        //从联系表中查询信息
        ContactInformationExample contactExample = new ContactInformationExample();
        contactExample.createCriteria().andSupplierEqualTo(supplier.getKey()).andMobilePhoneEqualTo(input.getPhone());
        List<ContactInformation> informations = contactInformationDao.selectByExample(contactExample);


        // 验证用户是否存在
        if (supplier.getUserId() != null) {
            ValidateUserInput validateUserInput = new ValidateUserInput();
            //validateUserInput.setLoginAccount(input.getPhone());
            validateUserInput.setUserId(supplier.getUserId());
            Result<Boolean> result = authFigenClient.validateAccount(validateUserInput);
            if (result.getData().equals(true)) {
                if (informations.isEmpty()) {
                    throw new RuntimeException("phone is not exist");
                }
                // 创建新增用户
                AddUserInput addUserInput = new AddUserInput();
                addUserInput.setEmail(input.getMail());
                addUserInput.setMobile(input.getPhone());
                addUserInput.setUserName(input.getSupplier());
                // 登录名使用电话
                addUserInput.setLoginAccount(input.getPhone());
                addUserInput.setMobile(input.getPhone());
                // 这里不设置密码 默认为123456
                // 默认必填性别
                addUserInput.setUserSex(1);
                addUserInput.setSystemType(SystemTypeEnum.SUPPLIER);
                // 调用插入用户表接口
                Result userResult = authFigenClient.userAdd(addUserInput);
                Integer userId = (Integer) userResult.getData();
                // 向目标供应商插入用户Id
                supplier.setUserId(userId);
                supplier.setUpdateTime(new Date());
                supplier.setUpdateUser(getCurrentUserId());
                supplierDao.updateByPrimaryKeySelective(supplier);
                //回调
                ContactInformationExample example = new ContactInformationExample();
                example.createCriteria().andMobilePhoneEqualTo(input.getPhone());
                ContactInformation information = new ContactInformation();
                information.setEmailAddress(input.getMail());
                information.setUpdateTime(new Date());
                information.setUpdateUser(getCurrentUserId());
                contactInformationDao.updateByExampleSelective(information, example);

            } else {
                throw new RuntimeException("user is exist");
            }
        } else {
            if (informations.isEmpty()) {
                throw new RuntimeException("phone is not exist");
            }
            // 创建新增用户
            AddUserInput addUserInput = new AddUserInput();
            addUserInput.setEmail(input.getMail());
            addUserInput.setMobile(input.getPhone());
            addUserInput.setUserName(input.getSupplier());
            // 登录名使用电话
            addUserInput.setLoginAccount(input.getPhone());
            addUserInput.setMobile(input.getPhone());
            // 这里不设置密码 默认为123456
            // 默认必填性别
            addUserInput.setUserSex(1);
            addUserInput.setSystemType(SystemTypeEnum.SUPPLIER);
            // 调用插入用户表接口
            Result userResult = authFigenClient.userAdd(addUserInput);
            Integer userId = (Integer) userResult.getData();
            // 向目标供应商插入用户Id
            supplier.setUserId(userId);
            supplier.setUpdateTime(new Date());
            supplier.setUpdateUser(getCurrentUserId());
            supplierDao.updateByPrimaryKeySelective(supplier);
            //回调
            ContactInformationExample example = new ContactInformationExample();
            example.createCriteria().andMobilePhoneEqualTo(input.getPhone());
            ContactInformation information = new ContactInformation();
            information.setEmailAddress(input.getMail());
            information.setUpdateTime(new Date());
            information.setUpdateUser(getCurrentUserId());
            contactInformationDao.updateByExampleSelective(information, example);
        }
        // 发送邮件
        MailUtil.sendMail(input.getMail(), "账户激活成功，初始密码是123456", "测试");

        return new Result<>("发送成功");
    }

    /**
     * @author fjy 获取供应商列表 不分页
     */
    @Override
    public List<String> getSupplierList(SearchPurcSupplierInput input) {

        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        // 查询条件
        if (input.getName() != null && !input.getName().equals("")) {
            criteria.andNameLike("%" + input.getName() + "%");
        }
        if (input.getStorehouseType() != null) {
            criteria.andStorehouseTypeEqualTo(input.getStorehouseType());
        }
        // 取得未删除
        //非黑名单
        criteria.andIsBlackEqualTo(CommonEnum.NO.getCode());
        //非特殊关联企业
        criteria.andIsSpecialEqualTo(CommonEnum.NO.getCode());
        criteria.andIsEliminateEqualTo(CommonEnum.NO.getCode());
        criteria.andUserIdIsNotNull();
        //未删除
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andAuditStatusEqualTo(AuditStatusEnum.AUDITOK.getCode());
        example.setOrderByClause("purc_supplier_id Desc");
        List<Supplier> purcSuppliersList = supplierDao.selectByExample(example);
        // 构造返回数据
        List<String> dataList = purcSuppliersList.stream().map(a -> a.getKey()).collect(Collectors.toList());

        return dataList;
    }

    /**
     * @author mx 获取供应商列表
     */
    @Override
    public PagedList<PurcSupplierOutput> getSupplierPagedList(SearchPurcSupplierInput input) {

        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        // 查询条件
        if (StringUtils.isNotBlank(input.getName())) {
            criteria.andNameLike("%" + input.getName() + "%");
        }
        if (input.getStorehouseType() != null) {
            criteria.andStorehouseTypeEqualTo(input.getStorehouseType());
        }
        // 取得未删除
        criteria.andIsBlackEqualTo(CommonEnum.NO.getCode());
        //非特殊关联企业
        criteria.andIsSpecialEqualTo(CommonEnum.NO.getCode());
        //物料供应商
        criteria.andIsEliminateEqualTo(CommonEnum.NO.getCode());
        if(StringUtils.isNotBlank(input.getAuditStatus())){
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        criteria.andIsOneTimeEqualTo(CommonEnum.NO.getCode());
        criteria.andIsOneTimeEqualTo(CommonEnum.NO.getCode());
        //未删除
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

        // 总条数
        Integer totalItemCount = (int) supplierDao.countByExample(example);
        PagedList<PurcSupplierOutput> pagedList = new PagedList<PurcSupplierOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);
        // 分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("purc_supplier_id Desc");
        List<Supplier> purcSuppliersList = supplierDao.selectByExample(example);
        // 构造返回数据
        List<PurcSupplierOutput> dataList = new ArrayList<PurcSupplierOutput>();
        for (Supplier purcSupplier : purcSuppliersList) {
            PurcSupplierOutput output = new PurcSupplierOutput();
            BeanUtils.copyProperties(purcSupplier, output);
            output.setIsBlackLangLang(output.getIsBlack());
            output.setIsSpecialLangLang(output.getIsSpecial());
            output.setIsEliminateLangLang(output.getIsEliminate());
            output.setStorehouseTypeLangLang(output.getStorehouseType());
            output.setNatureIdLangLang(output.getNatureId());
            output.setAuditStatusLangLang(output.getAuditStatus());
            output.setIsMaterialsLangLang(output.getIsMaterials());
            output.setCurrencyLangLang(output.getCurrency());
            output.setProcureTypeLangLang(output.getProcureType());
            output.setRegistrationMethodLangLang(output.getRegistrationMethod());
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
            output.setContactInformations(contactInformationDao.selectByExample(contactInformationExample));

            // 查询获取银行信息
            BankInformationExample bankInformationExample = new BankInformationExample();
            BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
            criteriaBankInformation.andSupplierEqualTo(purcSupplier.getKey());
            // 设置银行信息
            output.setBankInformations(bankInformationDao.selectByExample(bankInformationExample));
            // 查询资质文件
            QualificationDocumentsExample qualificationDocumentsExample = new QualificationDocumentsExample();
            QualificationDocumentsExample.Criteria criteriaQd = qualificationDocumentsExample.createCriteria();
            criteriaQd.andSupplierEqualTo(purcSupplier.getKey());
            output.setQualificationDocuments(qualificationDocumentsDao.selectByExample(qualificationDocumentsExample));
            // 查询管理文件
            ManagementExample managementExample = new ManagementExample();
            ManagementExample.Criteria criteriaMe = managementExample.createCriteria();
            criteriaMe.andSupplierEqualTo(purcSupplier.getKey());
            output.setManagements(managementDao.selectByExample(managementExample));
            // 查询公司列表
            SupplierCompanyExample companyExample = new SupplierCompanyExample();
            SupplierCompanyExample.Criteria criteriaCom = companyExample.createCriteria();
            criteriaCom.andSupplierEqualTo(purcSupplier.getKey());
            List<SupplierCompany> companies = supplierCompanyDao.selectByExample(companyExample);

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
            List<SupplierTypeRelational> supplierTypeRelationals = supplierTypeRelationalDao.selectByExample(supplierTypeRelationalExample);
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
            List<SupplierSpecial> supplierSpecials = supplierSpecialDao.selectByExample(supplierSpecialExample);
            List<SpecialOutput> specialOutputs = new ArrayList<>();
            for (SupplierSpecial supplierSpecial : supplierSpecials) {
                SpecialOutput specialOutput = new SpecialOutput();
                BeanUtils.copyProperties(supplierSpecial, specialOutput);
                specialOutput.setFirstSpecialLangLang(supplierSpecial.getFirstSpecial());
                specialOutput.setSecondSpecialLangLang(supplierSpecial.getSecondSpecial());
                specialOutputs.add(specialOutput);
            }
            output.setSpecials(specialOutputs);


            dataList.add(output);
        }
        // 将分页数据放入结果中
        pagedList.getDataList().addAll(dataList);
        return pagedList;
    }

    /**
     * @author mx 供应商编辑
     */
    @Override
    @Transactional
    public void updateSupplier(EditSupplierInput input) {
        Date date = new Date();
        Integer userId = getCurrentUserId();
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(input, supplier);
        // 更新主表
        supplier.setUpdateTime(date);
        supplier.setUpdateUser(userId);
        supplierDao.updateByPrimaryKeySelective(supplier);
        // 删除并插入从表
        if (input.getQualificationDocuments() != null) {
            // 删除资质文件
            QualificationDocumentsExample qualificationDocumentsExample = new QualificationDocumentsExample();
            QualificationDocumentsExample.Criteria criteriaQd = qualificationDocumentsExample.createCriteria();
            criteriaQd.andSupplierEqualTo(supplier.getKey());
            qualificationDocumentsDao.deleteByExample(qualificationDocumentsExample);
            for (int i = 0; i < input.getQualificationDocuments().size(); i++) {
                input.getQualificationDocuments().get(i).setSupplier(supplier.getKey());
                input.getQualificationDocuments().get(i).setUpdateUser(userId);
                input.getQualificationDocuments().get(i).setUpdateTime(date);
                qualificationDocumentsDao.insertSelective(input.getQualificationDocuments().get(i));
            }
        }
        if (input.getContactInformations() != null) {
            // 删除从表
            // 删除并插入联系信息
            ContactInformationExample contactInformationExample = new ContactInformationExample();
            ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample.createCriteria();
            criteriaContactInformation.andSupplierEqualTo(supplier.getKey());
            // 删除联系信息
            contactInformationDao.deleteByExample(contactInformationExample);

            for (ContactInformation purcContactInformation : input.getContactInformations()) {
                purcContactInformation.setSupplier(supplier.getKey());
                purcContactInformation.setUpdateUser(userId);
                purcContactInformation.setUpdateTime(date);
                contactInformationDao.insertSelective(purcContactInformation);
            }
        }
        if (input.getManagements() != null) {
            // 删除管理文件
            ManagementExample managementExample = new ManagementExample();
            ManagementExample.Criteria criteriaMe = managementExample.createCriteria();
            criteriaMe.andSupplierEqualTo(supplier.getKey());
            managementDao.deleteByExample(managementExample);
            for (Management purcManagement : input.getManagements()) {
                purcManagement.setSupplier(supplier.getKey());
                purcManagement.setUpdateUser(userId);
                purcManagement.setUpdateTime(date);
                managementDao.insertSelective(purcManagement);
            }
        }
        if (input.getBankInformations() != null) {
            // 删除银行信息
            BankInformationExample bankInformationExample = new BankInformationExample();
            BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
            criteriaBankInformation.andSupplierEqualTo(supplier.getKey());
            bankInformationDao.deleteByExample(bankInformationExample);
            for (BankInformation purcBankInformation : input.getBankInformations()) {
                purcBankInformation.setSupplier(supplier.getKey());
                purcBankInformation.setUpdateUser(userId);
                purcBankInformation.setUpdateTime(date);
                purcBankInformation.setCurrency(supplier.getCurrency());
                bankInformationDao.insertSelective(purcBankInformation);
            }
        }
        //删除供应商类别
        if (input.getSupplierTypeInput() != null) {
            SupplierTypeRelationalExample supplierTypeRelationalExample = new SupplierTypeRelationalExample();
            supplierTypeRelationalExample.createCriteria().andSupplierEqualTo(supplier.getKey());
            supplierTypeRelationalDao.deleteByExample(supplierTypeRelationalExample);
            for (SupplierTypeInput supplierTypeInput : input.getSupplierTypeInput()) {
                SupplierTypeRelational supplierType = new SupplierTypeRelational();
                supplierType.setCreateTime(date);
                supplierType.setCreateUser(userId);
                supplierType.setUpdateTime(date);
                supplierType.setUpdateUser(userId);
                supplierType.setSupplierType(supplierTypeInput.getSupplierType());
                supplierType.setSupplier(supplier.getKey());
                supplierTypeRelationalDao.insertSelective(supplierType);
            }
        }
        // 插入多个分公司
        if (input.getCompanys() != null) {
            // 删除关联分公司
            SupplierCompanyExample companyExample = new SupplierCompanyExample();
            SupplierCompanyExample.Criteria criteriaCom = companyExample.createCriteria();
            criteriaCom.andSupplierEqualTo(supplier.getKey());
            supplierCompanyDao.deleteByExample(companyExample);
            for (String company : input.getCompanys()) {
                SupplierCompany supplierCompany = new SupplierCompany();
                supplierCompany.setSupplier(supplier.getKey());
                supplierCompany.setCompany(company);
                supplierCompany.setUpdateUser(userId);
                supplierCompany.setUpdateTime(date);
                supplierCompanyDao.insertSelective(supplierCompany);
            }
        }
        if (!input.getSpecials().isEmpty()) {
            // 删除旧供应种类
            SupplierSpecialExample sse = new SupplierSpecialExample();
            sse.createCriteria().andSupplierEqualTo(supplier.getKey());
            supplierSpecialDao.deleteByExample(sse);
            // 保存新供应种类
            input.getSpecials().forEach(special -> {
                if (StringUtils.isNotBlank(special.getSecondSpecial())) {
                    SupplierSpecial supplierSpecial = new SupplierSpecial();
                    supplierSpecial.setSupplier(supplier.getKey());
                    supplierSpecial.setFirstSpecial(special.getFirstSpecial());
                    supplierSpecial.setSecondSpecial(special.getSecondSpecial());
                    supplierSpecial.setCreateTime(date);
                    supplierSpecial.setCreateUser(userId);
                    supplierSpecial.setUpdateTime(date);
                    supplierSpecial.setUpdateUser(userId);
                    supplierSpecialDao.insertSelective(supplierSpecial);
                } else {
                    Result<List<SparePartsCategoriesDetailsOutput>> result = wareFeignClient.getCategoriesDetailsByCategoriesKey(special.getFirstSpecial());
                    if (result.getData() != null) {
                        result.getData().forEach(SparePartsCategoriesDetailsOutput -> {
                            SupplierSpecial supplierSpecial = new SupplierSpecial();
                            supplierSpecial.setSupplier(supplier.getKey());
                            supplierSpecial.setFirstSpecial(special.getFirstSpecial());
                            supplierSpecial.setSecondSpecial(SparePartsCategoriesDetailsOutput.getKey());
                            supplierSpecial.setCreateTime(date);
                            supplierSpecial.setCreateUser(userId);
                            supplierSpecial.setUpdateTime(date);
                            supplierSpecial.setUpdateUser(userId);
                            supplierSpecialDao.insertSelective(supplierSpecial);
                        });

                    }
                }

            });

        }

    }

    /**
     * @author mx 获取单独供应商
     */
    @Override
    public PurcSupplierOutput getSupplier(SearchPurcSupplierInput input) {
        // TODO Auto-generated method stub
        Supplier supplier = supplierDao.selectByPrimaryKey(input.getPurcSupplierId());
        PurcSupplierOutput output = new PurcSupplierOutput();
        // 查询获取联系信息
        ContactInformationExample contactInformationExample = new ContactInformationExample();
        ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample.createCriteria();
        criteriaContactInformation.andSupplierEqualTo(supplier.getKey());
        // 设置联系信息
        output.setContactInformations(contactInformationDao.selectByExample(contactInformationExample));

        // 查询获取银行信息
        BankInformationExample bankInformationExample = new BankInformationExample();
        BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
        criteriaBankInformation.andSupplierEqualTo(supplier.getKey());
        // 设置银行信息
        output.setBankInformations(bankInformationDao.selectByExample(bankInformationExample));

        BeanUtils.copyProperties(supplier, output);
        output.setSupplierLangLang(supplier.getKey());
        output.setGradeLangLang(supplier.getGrade());
        output.setSettlementCycleLangLang(supplier.getSettlementCycle());
        return output;
    }

    /**
     * @author mx 批量删除供应商
     */
    @Override
    public void deleteSupplier(Integer[] supplierIds) {
        // TODO Auto-generated method stub
        for (Integer supplierId : supplierIds) {
            Supplier supplier = new Supplier();
            supplier.setPurcSupplierId(supplierId);
            // 设置删除
            supplier.setIsDel(1);
            supplierDao.updateByPrimaryKeySelective(supplier);
        }
    }

    /**
     * @author mx 获取列表供应商中英文
     */
    @Override
    public List<SelectOptionOutput> getSuppliers() {
        // TODO Auto-generated method stub
        // 获取供应商列表
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        // 获取不是黑名单的供应商
        //非黑名单
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
        List<Supplier> suppliersList = supplierDao.selectByExample(supplierExample);
        // 设置输出
        List<SelectOptionOutput> outputs = new ArrayList<>();

        for (Supplier supplier : suppliersList) {
            SelectOptionOutput optionOutput = new SelectOptionOutput();
            optionOutput.setLabel(supplier.getName());
            optionOutput.setLabelEn(supplier.getNameEn());
            optionOutput.setValue(supplier.getKey());
            outputs.add(optionOutput);
        }
        return outputs;
    }

    /**
     * @author fjy 获取供应商列表 财务配置外包商费用 获取外包商 下拉框
     */
    public List<LangSelectOutput> getOutSuppliersFinance() {
        // 查询出供应商类别包含外包字眼的 所有key
        SupplierTypeExample shtExample = new SupplierTypeExample();
        shtExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSupplierTypeNameLike("%外包%");

        List<SupplierType> typeList = supplierTypeDao.selectByExample(shtExample);
        List<String> keyList = typeList.stream().map(x -> x.getKey()).collect(Collectors.toList());

        // 根据供应商类别查询供应商主表id
//		 List<SupplierTypeRelational> selectByExample(SupplierTypeRelationalExample example);
        SupplierTypeRelationalExample stre = new SupplierTypeRelationalExample();
        stre.createCriteria().andSupplierTypeIn(keyList);
        List<SupplierTypeRelational> strList = supplierTypeRelationalDao.selectByExample(stre);

        List<String> suppIds = strList.stream().map(a -> a.getSupplier()).collect(Collectors.toList());

        // 获取供应商列表
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        // 获取不是黑名单的供应商 并且类别包含外包字眼的 供应商
        criteria.andKeyIn(suppIds);
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
        supplierExample.setOrderByClause(" `purc_supplier_id` DESC");// 时间排序

        List<Supplier> suppliersList = supplierDao.selectByExample(supplierExample);
        // 设置输出
        List<LangSelectOutput> outputs = suppliersList.stream().map(a -> {
            LangSelectOutput output = new LangSelectOutput();
            output.setLabelLang(a.getKey());
            output.setValue(a.getKey());
            return output;
        }).collect(Collectors.toList());
        return outputs;
    }

    /**
     * @author mx 获取供应商管理报告列表
     */
    @Override
    public PagedList<SupplierReportOutput> getSupplierReports(SupplierReportInput input) {

        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        // 按照时间段查询
        // 查询条件
        if (input.getEndTime() != null) {
            // 获取该时间段内更改的供应商内容
            criteria.andCreateTimeLessThan(input.getEndTime());
        }
        //非特殊关联企业
        //物料供应商
        criteria.andUserIdIsNotNull();
        criteria.andAuditStatusEqualTo(AuditStatusEnum.AUDITOK.getCode());
        criteria.andIsOneTimeEqualTo(CommonEnum.NO.getCode());
        //未删除
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        // 总条数
        Integer totalItemCount = (int) supplierDao.countByExample(example);
        PagedList<SupplierReportOutput> pagedList = new PagedList<SupplierReportOutput>(input.getPageIndex(),
                input.getPageSize(), totalItemCount);

        /*
         * //分页查询 example.setLimitStart(pagedList.getLimitStart());
         * example.setLimitEnd(pagedList.getLimitEnd());
         */

        List<Supplier> purcSuppliersList = supplierDao.selectByExample(example);

        // 构造返回数据
        List<SupplierReportOutput> dataList = new ArrayList<SupplierReportOutput>();

        // 获取所属公司供应商
        for (Supplier supplier : purcSuppliersList) {

            SupplierReportOutput output = new SupplierReportOutput();
            if (input.getCompany() != null && !input.getCompany().equals("")) {
                SupplierCompanyExample companyExample = new SupplierCompanyExample();
                SupplierCompanyExample.Criteria companyCriteria = companyExample.createCriteria();
                companyCriteria.andSupplierEqualTo(supplier.getKey());
                companyCriteria.andCompanyEqualTo(input.getCompany());
                List<SupplierCompany> supplierCompanys = supplierCompanyDao.selectByExample(companyExample);
                if (supplierCompanys.size() > 0) {
                    // 加入供应商管理报告列表
                    // 组装列表内容
                    output.setChangeTime(supplier.getUpdateTime());

                    // if (input.getEndTime().compareTo(supplier.getUpdateTime()) == -1
                    // &&input.getStartTime().compareTo(supplier.getUpdateTime()) == 1) {
                    // 判断黑名单状态
                    if (CommonEnum.NO.getCode().equals(supplier.getIsBlack())&&
                            CommonEnum.NO.getCode().equals(supplier.getIsEliminate())&&
                                    CommonEnum.NO.getCode().equals(supplier.getIsSpecial())){
                        output.setStatus("使用中");
                    }else{
                        output.setStatus("未使用");

                    }
                    // 判断供应商是否新增
                    output.setRemark(supplier.getComments());
                    // }
                    // 设置供应商参与报价次数
                    // 等待调接口
                    SupplierQuotionOutput supplierQuotionOutput = supplierCenter.getSupplierQuotion(supplier.getKey(),
                            input.getStartTime(), input.getEndTime());

                    output.setQuotationNumber(supplierQuotionOutput.getQuotationNumber());
                    output.setSuccessNumber(supplierQuotionOutput.getSuccessNumber());
                    output.setTransactionAmount(supplierQuotionOutput.getTransactionAmount());
                    output.setStartTime(supplierQuotionOutput.getStartTime());
                    output.setEndTime(supplierQuotionOutput.getEndTime());
                    // 设置名称
                    output.setSupplierName(supplier.getName());
                    SupplierCompanyExample companyAllExample = new SupplierCompanyExample();
                    SupplierCompanyExample.Criteria companyAllCriteria = companyAllExample.createCriteria();
                    companyAllCriteria.andSupplierEqualTo(supplier.getKey());
                    List<SupplierCompany> supplierAllCompanys = supplierCompanyDao.selectByExample(companyAllExample);
                    String company = new String();
                    for (SupplierCompany supplierCompany : supplierAllCompanys) {
                        company = company + supplierCompany.getCompany() + ",";
                    }
                    output.setCompany(company);
                    // 加入列表
                    dataList.add(output);
                }
            } else {
                output.setChangeTime(supplier.getUpdateTime());

                /*
                 * if (input.getEndTime().compareTo(supplier.getUpdateTime()) == -1
                 * &&input.getStartTime().compareTo(supplier.getUpdateTime()) == 1) { }
                 */
                // 判断黑名单状态
                output.setStatus("使用中");
                // 判断供应商是否新增
                output.setRemark("黑名单备注");

                // 设置供应商参与报价次数
                // 等待调接口
                SupplierQuotionOutput supplierQuotionOutput = supplierCenter.getSupplierQuotion(supplier.getKey(),
                        input.getStartTime(), input.getEndTime());
                output.setQuotationNumber(supplierQuotionOutput.getQuotationNumber());
                output.setSuccessNumber(supplierQuotionOutput.getSuccessNumber());
                output.setTransactionAmount(supplierQuotionOutput.getTransactionAmount());
                output.setStartTime(supplierQuotionOutput.getStartTime());
                output.setEndTime(supplierQuotionOutput.getEndTime());
                // 设置名称
                output.setSupplierName(supplier.getName());
                SupplierCompanyExample companyAllExample = new SupplierCompanyExample();
                SupplierCompanyExample.Criteria companyAllCriteria = companyAllExample.createCriteria();
                companyAllCriteria.andSupplierEqualTo(supplier.getKey());
                List<SupplierCompany> supplierAllCompanys = supplierCompanyDao.selectByExample(companyAllExample);
                String company = new String();
                for (SupplierCompany supplierCompany : supplierAllCompanys) {
                    company = company + supplierCompany.getCompany() + ",";
                }
                output.setCompany(company);
                //System.out.println(company);
                // 加入列表
                dataList.add(output);
            }

        }
        // 将分页数据放入结果中
        pagedList.getDataList().addAll(dataList);
        return pagedList;
    }

    /**
     * @author mx 获取供应商通过Key
     */
    @Override
    public PurcSupplierOutput getSupplierByKey(SearchPurcSupplierInput input) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andKeyEqualTo(input.getKey());

        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);

        if (!suppliers.isEmpty()) {
            Supplier supplier = suppliers.get(0);
            PurcSupplierOutput output = new PurcSupplierOutput();
            // 查询获取联系信息
            ContactInformationExample contactInformationExample = new ContactInformationExample();
            ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample.createCriteria();
            criteriaContactInformation.andSupplierEqualTo(input.getKey());
            // 设置联系信息
            output.setContactInformations(contactInformationDao.selectByExample(contactInformationExample));

            // 查询获取银行信息
            BankInformationExample bankInformationExample = new BankInformationExample();
            BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
            criteriaBankInformation.andSupplierEqualTo(input.getKey());
            // 设置银行信息
            output.setBankInformations(bankInformationDao.selectByExample(bankInformationExample));

            BeanUtils.copyProperties(supplier, output);
            return output;
        } else {
            return null;
        }
    }

    /**
     * @throws Exception
     * @author mx 获取供应商通过备件明细分类
     */
    @Override
    public List<PurcSupplierOutput> getSupplierBySecondSpecial(String[] secondSpecials, String name, String grade)
            throws Exception {
        // 获取
        List<SupplierSpecial> supplierSpecials = new ArrayList<>();

        // if (secondSpecials.length > 0) {
        // for (String secondSpecial : secondSpecials) {
        // SupplierSpecialExample specialExample = new SupplierSpecialExample();
        // SupplierSpecialExample.Criteria criteria = specialExample.createCriteria();
        // criteria.andSecondSpecialEqualTo(secondSpecial);
        // List<SupplierSpecial> specials = new ArrayList<>();
        // specials = supplierSpecialDao.selectByExample(specialExample);
        // if (!specials.isEmpty()) {
        // for (SupplierSpecial supplierSpecial : specials) {
        // supplierSpecials.add(supplierSpecial);
        // }
        // }
        // }
        // }
        // 取明细类别对应供应商
        SupplierSpecialExample specialExample = new SupplierSpecialExample();
        SupplierSpecialExample.Criteria specialCriteria = specialExample.createCriteria();
        specialCriteria.andSecondSpecialIn(Arrays.asList(secondSpecials));
        supplierSpecials = supplierSpecialDao.selectByExample(specialExample);

        // 供应指定公司的供应商
        List<SupplierCompany> companies = new ArrayList<>();
        if (!isHeadCompanyLogin() && getCurrentCompanyKey() != null) {
            SupplierCompanyExample companyExample = new SupplierCompanyExample();
            SupplierCompanyExample.Criteria criteriaCom = companyExample.createCriteria();
            criteriaCom.andCompanyEqualTo(getCurrentCompanyKey());
            companies = supplierCompanyDao.selectByExample(companyExample);
        }
        // 去重
        List<PurcSupplierOutput> outputs = new ArrayList<>();
        HashSet<String> suppliers = new HashSet<>();
        if (!supplierSpecials.isEmpty()) {
            for (SupplierSpecial supplierSpecial : supplierSpecials) {
                suppliers.add(supplierSpecial.getSupplier());
            }
            if (!companies.isEmpty()) {
                for (SupplierCompany supplierCompany : companies) {
                    suppliers.add(supplierCompany.getSupplier());
                }
            }
            for (String string : suppliers) {
                SearchPurcSupplierInput input = new SearchPurcSupplierInput();
                input.setKey(string);
                SupplierExample supplierExample = new SupplierExample();
                SupplierExample.Criteria criteria = supplierExample.createCriteria();
                // 名称与评价等级 模糊查询
                if (name != null && !name.equals("")) {
                    criteria.andNameLike("%" + name + "%");
                }
                if (grade != null && !grade.equals("")) {
                    criteria.andGradeLike("%" + grade + "%");
                }
                //非黑名单
                criteria.andIsBlackEqualTo(CommonEnum.NO.getCode());
                //非特殊关联企业
                criteria.andIsSpecialEqualTo(CommonEnum.NO.getCode());
                //物料供应商
                criteria.andIsMaterialsEqualTo(CommonEnum.YES.getCode());
                criteria.andIsOneTimeEqualTo(CommonEnum.NO.getCode());
                criteria.andIsEliminateEqualTo(CommonEnum.NO.getCode());
                criteria.andUserIdIsNotNull();
                criteria.andAuditStatusEqualTo(AuditStatusEnum.AUDITOK.getCode());
                //未删除
                criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria.andKeyEqualTo(string);
                List<Supplier> supplierList = supplierDao.selectByExample(supplierExample);
                // 复制内容 返回
                if (!supplierList.isEmpty()) {
                    PurcSupplierOutput output = new PurcSupplierOutput();
                    BeanUtils.copyProperties(supplierList.get(0), output);
                    output.setSupplierLangLang(supplierList.get(0).getKey());
                    output.setGradeLangLang(supplierList.get(0).getGrade());
                    output.setSettlementCycleLangLang(supplierList.get(0).getSettlementCycle());

                    // 查询获取联系信息
                    ContactInformationExample contactInformationExample = new ContactInformationExample();
                    ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample
                            .createCriteria();
                    criteriaContactInformation.andSupplierEqualTo(string);
                    // 设置联系信息
                    output.setContactInformations(contactInformationDao.selectByExample(contactInformationExample));

                    outputs.add(output);
                }

            }
        }
        if (outputs.isEmpty()) {
            throw new Exception("NoSupplier");
        } else {
            return outputs;
        }
    }

    /**
     * 供应商审核操作
     */
    @Override
    @Transactional
    public void auditSupplier(Integer[] purcSupplierIds, String[] processInstanceIds, String[] taskIds, String[] auditType) {

        SupplierExample supplierExample = new SupplierExample();
        System.out.println("purcSupplierIds[0]:" + purcSupplierIds[0]);
        for (int i = 0; i < taskIds.length; i++) {
            JSONObject obj = new JSONObject();
            obj.put("taskId", taskIds[i]);

            JSONObject vars = new JSONObject();
            // 发起人ID
            vars.put("userId", getCurrentUserAccount()); //
            // 公司key
            vars.put("companyKey", getCurrentCompanyKey());

            // 用户
            vars.put("userName", getCurrentUserAccount());
            // 时间
            vars.put("auditTime", new Date());

            obj.put("vars", vars);
            // 审核通过
            workFlowFeignClient.complete(obj);

            // 如果审核流程结束，修改状态
            if (workFlowFeignClient.isEndProcess(processInstanceIds[i])) {
                if (purcSupplierIds[i] == -1) {
                    SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                    specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                    List<SpecialSupplierLog> specialSupplierLogs = specialSupplierLogMapper.selectByExample(specialSupplierLogExample);
                    SpecialSupplierLog specialSupplierLog = specialSupplierLogs.get(0);
                    SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
                    specialSupplierExample.createCriteria().andNameEqualTo(specialSupplierLog.getSupplierName());
                    specialSupplierMapper.deleteByExample(specialSupplierExample);
                    specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                    specialSupplierLogMapper.updateByPrimaryKeySelective(specialSupplierLog);
                } else {
                    supplierExample.clear();
                    SupplierExample.Criteria criteria = supplierExample.createCriteria();
                    Integer userid = getCurrentUserId();
                    Date date = new Date();
                    SearchPurcSupplierInput input = new SearchPurcSupplierInput();
                    input.setPurcSupplierId(purcSupplierIds[i]);
                    PurcSupplierOutput purcSupplierOutput = this.getSupplier(input);
                    // 更新审核状态
                    Supplier record = new Supplier();
                    record.setPurcSupplierId(purcSupplierIds[i]);

                    if (auditType[i].equals(AuditTypeEnum.AuditTypeEnum02.getCode())) {
                        record.setIsBlack(CommonEnum.YES.getCode());
                        supplierDao.updateByPrimaryKeySelective(record);
                        SpecialSupplier specialSupplier = new SpecialSupplier();
                        specialSupplier.setName(purcSupplierOutput.getName());
                        specialSupplier.setNameEn(purcSupplierOutput.getNameEn());
                        specialSupplier.setCreateUser(userid);
                        specialSupplier.setUpdateUser(userid);
                        specialSupplier.setCreateTime(date);
                        specialSupplier.setUpdateTime(date);
                        specialSupplierMapper.insertSelective(specialSupplier);
                        SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                        specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                        SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
                        specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                        specialSupplierLogMapper.updateByExampleSelective(specialSupplierLog, specialSupplierLogExample);


                    } else if (auditType[i].equals(AuditTypeEnum.AuditTypeEnum03.getCode())) {
                        record.setIsBlack(CommonEnum.NO.getCode());
                        record.setUpdateUser(userid);
                        record.setUpdateTime(date);
                        supplierDao.updateByPrimaryKeySelective(record);
                        SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
                        specialSupplierExample.createCriteria().andNameEqualTo(purcSupplierOutput.getName());
                        specialSupplierMapper.deleteByExample(specialSupplierExample);
                        SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                        specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                        SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
                        specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                        specialSupplierLogMapper.updateByExampleSelective(specialSupplierLog, specialSupplierLogExample);

                    } else if (auditType[i].equals(AuditTypeEnum.AuditTypeEnum04.getCode())) {
                        record.setIsEliminate(CommonEnum.YES.getCode());
                        supplierDao.updateByPrimaryKeySelective(record);
                        SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                        specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                        SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
                        specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                        specialSupplierLogMapper.updateByExampleSelective(specialSupplierLog, specialSupplierLogExample);


                    } else if (AuditTypeEnum.AuditTypeEnum05.getCode().equals(auditType[i])) {
                        record.setIsEliminate(CommonEnum.NO.getCode());
                        supplierDao.updateByPrimaryKeySelective(record);
                        SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                        specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                        SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
                        specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                        specialSupplierLogMapper.updateByExampleSelective(specialSupplierLog, specialSupplierLogExample);

                    } else if (AuditTypeEnum.AuditTypeEnum01.getCode().equals(auditType[i])) {
                        record.setAuditStatus(AuditStatusEnum.AUDITOK.getCode());
                        supplierDao.updateByPrimaryKeySelective(record);
                        ValidateUserInput validateUserInput = new ValidateUserInput();
                        ContactInformation contactInformation = purcSupplierOutput.getContactInformations().get(0);
                        // 验证用户是否存在
                        validateUserInput.setLoginAccount(contactInformation.getMobilePhone());
                   /* Result<Boolean> result = authFigenClient.validateAccount(validateUserInput);
                    if (!result.getData()) {
                        return;
                    }*/

//				System.out.println(result);
                        // System.out.println(result.getData());

                        // if (result.getData().equals(true)) {
                        // 创建新增用户
                        AddUserInput addUserInput = new AddUserInput();
                        addUserInput.setEmail(contactInformation.getEmailAddress());
                        addUserInput.setMobile(contactInformation.getMobilePhone());
                        addUserInput.setUserName(purcSupplierOutput.getName());
                        // 登录名使用电话
                        addUserInput.setLoginAccount(contactInformation.getMobilePhone());
                        // 这里不设置密码 默认为123456
                        // 默认必填性别
                        addUserInput.setUserSex(1);
                        addUserInput.setSystemType(SystemTypeEnum.SUPPLIER);
                        // 调用插入用户表接口
                        Result userResult = authFigenClient.userAdd(addUserInput);
                        Integer userId = (Integer) userResult.getData();
                        // 向目标供应商插入用户Id
                        Supplier supplier = new Supplier();
                        supplier.setPurcSupplierId(purcSupplierIds[i]);
                        supplier.setUserId(userId);
                        supplierDao.updateByPrimaryKeySelective(supplier);

                        // }
                        // 发送邮件
                        try {
                            MailUtil.sendMail(contactInformation.getEmailAddress(),
                                    "登录名为:" + contactInformation.getMobilePhone() + "密码:123456", "审核成功");
                        } catch (MessagingException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }


            }
        }
    }

    /**
     * 审核驳回处理
     */
    @Override
    public void rejectSupplier(Integer[] purcSupplierIds, String[] processInstanceIds, String[] taskIds, String[] auditType) {
        Integer userId = getCurrentUserId();
        Date date = new Date();
        SupplierExample supplierExample = new SupplierExample();
        supplierExample.clear();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
        for (int i = 0; i < taskIds.length; i++) {
            // 驳回参数为true时驳回到开始
            workFlowFeignClient.rejectTask(taskIds[i], true);
            if (purcSupplierIds[i] == -1) {
                SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                List<SpecialSupplierLog> specialSupplierLogs = specialSupplierLogMapper.selectByExample(specialSupplierLogExample);
                SpecialSupplierLog specialSupplierLog = specialSupplierLogs.get(0);
                specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
                specialSupplierLogMapper.updateByPrimaryKeySelective(specialSupplierLog);
            } else {
                if (!AuditTypeEnum.AuditTypeEnum01.getCode().equals(auditType[i])) {
                    SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
                    specialSupplierLogExample.createCriteria().andProcessInstanceIdEqualTo(processInstanceIds[i]);
                    SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
                    specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
                    specialSupplierLog.setUpdateUser(userId);
                    specialSupplierLog.setUpdateTime(date);
                    specialSupplierLogMapper.updateByExampleSelective(specialSupplierLog, specialSupplierLogExample);
                } else if (AuditTypeEnum.AuditTypeEnum01.getCode().equals(auditType[i])) {


                    // 更新审核状态
                    Supplier record = new Supplier();
                    record.setPurcSupplierId(purcSupplierIds[i]);
                    record.setAuditStatus(AuditStatusEnum.AUDITREJECT.getCode());
                    supplierDao.updateByPrimaryKeySelective(record);
                    SearchPurcSupplierInput input = new SearchPurcSupplierInput();
                    input.setPurcSupplierId(purcSupplierIds[i]);
                    PurcSupplierOutput purcSupplierOutput = this.getSupplier(input);

                    ValidateUserInput validateUserInput = new ValidateUserInput();
                    try {
                        if (!purcSupplierOutput.getContactInformations().isEmpty()) {
                            ContactInformation contactInformation = purcSupplierOutput.getContactInformations().get(0);

                            MailUtil.sendMail(contactInformation.getEmailAddress(), "请修改供应商信息", "审核失败");

                        }
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

    }

    /**
     * @author mx 获取供应商审核列表
     */
    @Override
    public List<SupplierReviewOutput> getSupplierReviewPagedList(SearchSupplierReviewInput input) {
        // 取得已审核数据 TODO
        List<String> processInstanceIdList = new ArrayList<String>();
        Map<String, TaskOutPut> processMap = new HashMap<String, TaskOutPut>();
        if (HasAuditEnum.AUDITED.getCode().equals(input.getAuditStatus())) {
            // 取得符合审核条件的数据
            SearchModelInput smInput = new SearchModelInput();
            smInput.setCategory("采购审核");
            smInput.setName("采购审核");
            smInput.setLoginAccount(getCurrentUserAccount());
            Result result = workFlowFeignClient.queryTaskHistoryAll(smInput);
            if (result != null) {
                ArrayList arrayList = (ArrayList) result.getData();
                for (int i = 0; i < arrayList.size(); i++) {

                    LinkedHashMap jsonObject1 = (LinkedHashMap) arrayList.get(i);
                    String processInstanceId = (String) jsonObject1.get("processInstanceId");
                    processInstanceIdList.add(processInstanceId);

                }

            }
        } else {
            // 调用供应商审核流获取审核列表
            // 符合审核条件的数据 TODO
            SearchModelInput smInput = new SearchModelInput();
            smInput.setCategory("供应商注册");
            smInput.setName("供应商注册");
            smInput.setLoginAccount(getCurrentUserAccount());
            System.out.println(getCurrentUserAccount());
            List<TaskOutPut> taskOutPutList = workFlowFeignClient.getMyAgencyTask(smInput);
            System.out.println(taskOutPutList.size());
            for (TaskOutPut item : taskOutPutList) {
                processInstanceIdList.add(item.getProcessInstanceId());
                processMap.put(item.getProcessInstanceId(), item);
            }
        }

        // 查询供应商公司表 获取需要审核的供应商id

        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteriaSupplier = supplierExample.createCriteria();
        if (processInstanceIdList.isEmpty()) {
            return null;
        }
        criteriaSupplier.andProcessIdIn(processInstanceIdList);


        if (input.getName() != null && !input.getName().equals("")) {
            criteriaSupplier.andNameLike("%" + input.getName() + "%");
        }
        supplierExample.setOrderByClause("create_time desc ");
        criteriaSupplier.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
        SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
        specialSupplierLogExample.createCriteria().andProcessInstanceIdIn(processInstanceIdList);
        List<SupplierReviewOutput> dataList = new ArrayList<SupplierReviewOutput>();
        List<SpecialSupplierLog> specialSupplierLogs = specialSupplierLogMapper.selectByExample(specialSupplierLogExample);
        for (SpecialSupplierLog specialSupplierLog : specialSupplierLogs) {
            SupplierReviewOutput output = new SupplierReviewOutput();


            supplierExample.clear();
            criteriaSupplier = supplierExample.createCriteria();
            criteriaSupplier.andKeyEqualTo(specialSupplierLog.getSupplier());
            List<Supplier> suppliers1 = supplierDao.selectByExample(supplierExample);
            if (suppliers1.isEmpty()) {
                if (StringUtils.isBlank(specialSupplierLog.getSupplier())) {
                    output.setProcessInstanceId(specialSupplierLog.getProcessInstanceId());
                    if (!processMap.isEmpty()) {
                        output.setTaskId(processMap.get(output.getProcessInstanceId()).getTaskId());
                    }
                    output.setPurcSupplierId(-1);
                    if (specialSupplierLog.getOperationType().equals(OperationTypeEnum.OperationTypeEnum01.getCode())) {
                        if (specialSupplierLog.getLogType().equals(SupplierTypeEnum.SupplierTypeEnumD.getCode())) {
                            output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum04.getCode());
                            output.setAuditType(AuditTypeEnum.AuditTypeEnum04.getCode());


                        } else {
                            output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum02.getCode());
                            output.setAuditType(AuditTypeEnum.AuditTypeEnum02.getCode());
                        }
                    } else {
                        if (specialSupplierLog.getLogType().equals(SupplierTypeEnum.SupplierTypeEnumD.getCode())) {
                            output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum05.getCode());
                            output.setAuditType(AuditTypeEnum.AuditTypeEnum05.getCode());

                        } else {
                            output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum03.getCode());
                            output.setAuditType(AuditTypeEnum.AuditTypeEnum03.getCode());

                        }
                    }
                    output.setCompanys(new ArrayList<SupplierCompanyInput>());
                    output.setContactInformations(new ArrayList<ContactInformation>());
                    output.setBankInformations(new ArrayList<>());
                    output.setSpecials(new ArrayList<>());
                    output.setSupplierType(new ArrayList<>());
                    dataList.add(output);
                }

            } else {
                Supplier purcSupplier = suppliers1.get(0);
                BeanUtils.copyProperties(purcSupplier, output);
                BeanUtils.copyProperties(specialSupplierLog, output);
                output.setProcessInstanceId(specialSupplierLog.getProcessInstanceId());
                if (!processMap.isEmpty()){
                    output.setTaskId(processMap.get(output.getProcessInstanceId()).getTaskId());
                }
                output.setIsBlackLangLang(output.getIsBlack());
                output.setIsSpecialLangLang(output.getIsSpecial());
                output.setIsEliminateLangLang(output.getIsEliminate());
                output.setStorehouseTypeLangLang(output.getStorehouseType());
                output.setNatureIdLangLang(output.getNatureId());
                output.setAuditStatusLangLang(output.getAuditStatus());
                output.setSettlementCycleLangLang(output.getSettlementCycle());
                output.setStorehouseTypeLangLang(output.getSettlementType());
                output.setIsMaterialsLangLang(output.getIsMaterials());
                output.setRegistrationMethodLangLang(output.getRegistrationMethod());
                output.setOperationTypeLangLang(specialSupplierLog.getOperationType());
                output.setLogTypeLangLang(specialSupplierLog.getLogType());
                output.setAuditStatus(specialSupplierLog.getAuditStatus());
                output.setAuditStatusLangLang(specialSupplierLog.getAuditStatus());
                output.setProcureTypeLangLang(output.getProcureType());
                output.setGradLangLang(output.getGrade());
                output.setSettlementTypeLangLang(output.getSettlementType());
                if (specialSupplierLog.getOperationType().equals(OperationTypeEnum.OperationTypeEnum01.getCode())) {
                    if (specialSupplierLog.getLogType().equals(SupplierTypeEnum.SupplierTypeEnumD.getCode())) {
                        output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum04.getCode());
                        output.setAuditType(AuditTypeEnum.AuditTypeEnum04.getCode());


                    } else {
                        output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum02.getCode());
                        output.setAuditType(AuditTypeEnum.AuditTypeEnum02.getCode());
                    }
                } else {
                    if (specialSupplierLog.getLogType().equals(SupplierTypeEnum.SupplierTypeEnumD.getCode())) {
                        output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum05.getCode());
                        output.setAuditType(AuditTypeEnum.AuditTypeEnum05.getCode());

                    } else {
                        output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum03.getCode());
                        output.setAuditType(AuditTypeEnum.AuditTypeEnum03.getCode());

                    }
                }
                // 查询获取联系信息
                ContactInformationExample contactInformationExample = new ContactInformationExample();
                ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample.createCriteria();
                criteriaContactInformation.andSupplierEqualTo(purcSupplier.getKey());
                // 设置联系信息
                output.setContactInformations(contactInformationDao.selectByExample(contactInformationExample));

                // 查询获取银行信息
                BankInformationExample bankInformationExample = new BankInformationExample();
                BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
                criteriaBankInformation.andSupplierEqualTo(purcSupplier.getKey());
                // 设置银行信息
                output.setBankInformations(bankInformationDao.selectByExample(bankInformationExample));
// 查询公司列表
                SupplierCompanyExample companyExample = new SupplierCompanyExample();
                SupplierCompanyExample.Criteria criteriaCom = companyExample.createCriteria();
                criteriaCom.andSupplierEqualTo(purcSupplier.getKey());
                List<SupplierCompany> companies = supplierCompanyDao.selectByExample(companyExample);

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
                List<SupplierTypeRelational> supplierTypeRelationals = supplierTypeRelationalDao.selectByExample(supplierTypeRelationalExample);
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
                List<SupplierSpecial> supplierSpecials = supplierSpecialDao.selectByExample(supplierSpecialExample);
                List<SpecialOutput> specialOutputs = new ArrayList<>();
                for (SupplierSpecial supplierSpecial : supplierSpecials) {
                    SpecialOutput specialOutput = new SpecialOutput();
                    BeanUtils.copyProperties(supplierSpecial, specialOutput);
                    specialOutput.setFirstSpecialLangLang(supplierSpecial.getFirstSpecial());
                    specialOutput.setSecondSpecialLangLang(supplierSpecial.getSecondSpecial());
                    specialOutputs.add(specialOutput);
                }
                output.setSpecials(specialOutputs);


                dataList.add(output);

            }

        }
        // 数据组装
        for (Supplier purcSupplier : suppliers) {
            SupplierReviewOutput output = new SupplierReviewOutput();
            // 审核id
            if (!processMap.isEmpty()){
                output.setTaskId(processMap.get(purcSupplier.getProcessId()).getTaskId());

            }
            output.setProcessInstanceId(purcSupplier.getProcessId());
            // 获取供应商
            BeanUtils.copyProperties(purcSupplier, output);
            output.setIsBlackLangLang(output.getIsBlack());
            output.setIsSpecialLangLang(output.getIsSpecial());
            output.setIsEliminateLangLang(output.getIsEliminate());
            output.setStorehouseTypeLangLang(output.getStorehouseType());
            output.setNatureIdLangLang(output.getNatureId());
            output.setAuditStatusLangLang(output.getAuditStatus());
            output.setSettlementCycleLangLang(output.getSettlementCycle());
            output.setStorehouseTypeLangLang(output.getSettlementType());
            output.setIsMaterialsLangLang(output.getIsMaterials());
            output.setRegistrationMethodLangLang(output.getRegistrationMethod());
            output.setAuditTypeLangLang(AuditTypeEnum.AuditTypeEnum01.getCode());
            output.setAuditType(AuditTypeEnum.AuditTypeEnum01.getCode());
            output.setProcureTypeLangLang(output.getProcureType());
            output.setGradLangLang(output.getGrade());
            output.setSettlementTypeLangLang(output.getSettlementType());
            // 查询获取联系信息
            ContactInformationExample contactInformationExample = new ContactInformationExample();
            ContactInformationExample.Criteria criteriaContactInformation = contactInformationExample.createCriteria();
            criteriaContactInformation.andSupplierEqualTo(purcSupplier.getKey());
            // 设置联系信息
            output.setContactInformations(contactInformationDao.selectByExample(contactInformationExample));

            // 查询获取银行信息
            BankInformationExample bankInformationExample = new BankInformationExample();
            BankInformationExample.Criteria criteriaBankInformation = bankInformationExample.createCriteria();
            criteriaBankInformation.andSupplierEqualTo(purcSupplier.getKey());
            // 设置银行信息
            output.setBankInformations(bankInformationDao.selectByExample(bankInformationExample));
// 查询公司列表
            SupplierCompanyExample companyExample = new SupplierCompanyExample();
            SupplierCompanyExample.Criteria criteriaCom = companyExample.createCriteria();
            criteriaCom.andSupplierEqualTo(purcSupplier.getKey());
            List<SupplierCompany> companies = supplierCompanyDao.selectByExample(companyExample);

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
            List<SupplierTypeRelational> supplierTypeRelationals = supplierTypeRelationalDao.selectByExample(supplierTypeRelationalExample);
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
            List<SupplierSpecial> supplierSpecials = supplierSpecialDao.selectByExample(supplierSpecialExample);
            List<SpecialOutput> specialOutputs = new ArrayList<>();
            for (SupplierSpecial supplierSpecial : supplierSpecials) {
                SpecialOutput specialOutput = new SpecialOutput();
                BeanUtils.copyProperties(supplierSpecial, specialOutput);
                specialOutput.setFirstSpecialLangLang(supplierSpecial.getFirstSpecial());
                specialOutput.setSecondSpecialLangLang(supplierSpecial.getSecondSpecial());
                specialOutputs.add(specialOutput);
            }
            output.setSpecials(specialOutputs);

            dataList.add(output);
        }
        // 将分页数据放入结果中
        Collections.sort(dataList, new Comparator<SupplierReviewOutput>() {
            @Override
            public int compare(SupplierReviewOutput o1, SupplierReviewOutput o2) {
                return o2.getCreateTime().compareTo(o1.getCreateTime());
            }
        });
        return dataList;
    }

    /**
     * @author mx 供应商评价
     */
    @Override
    public void addRecevierScore(AddReceiverScoreInput input) {
        ReceiverScore receiverScore = new ReceiverScore();
        // 插入供应商评价表
        receiverScoreDao.insert(receiverScore);
        // 修改供应商评价并加权

        // 计算分数

    }

    /**
     * @author mx 供应商批量导入
     */
    public boolean importSupplier(String filePath) {
        List<Supplier> list = new ArrayList<Supplier>();
//	    HSSFWorkbook workbook = null;
        Workbook workbook = null;
        try {
            // 读取Excel文件
            InputStream inputStream = new FileInputStream(filePath);
//	      workbook = new HSSFWorkbook(inputStream);
            workbook = WorkbookFactory.create(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 循环工作表
        for (int numSheet = 0; numSheet < workbook.getNumberOfSheets(); numSheet++) {
            Sheet hssfSheet = workbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // 循环行
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                Row hssfRow = hssfSheet.getRow(rowNum);
//	        System.out.println("hssfRow1:"+hssfRow.getRowNum());
//	        System.out.println("hssfRow2:"+hssfRow.getLastCellNum());
                if (hssfRow == null) {
                    continue;
                }
                // 将单元格中的内容存入集合
                // 中文名称
                Supplier supplier = new Supplier();
                Cell cell = hssfRow.getCell(2);
                if (cell == null) {
                    continue;
                }
                String name = cell.getStringCellValue();
                System.out.println("name:" + name);
                supplier.setName(name);

                // 英文名称
                cell = hssfRow.getCell(3);
                if (cell == null) {
                    continue;
                }
                String nameEn = cell.getStringCellValue();
                System.out.println("nameEn:" + nameEn);
                supplier.setNameEn(nameEn);

                // 社会统一信用代码
                cell = hssfRow.getCell(4);
                if (cell == null) {
                    continue;
                }
                String creditCode = cell.getStringCellValue();
                System.out.println("creditCode:" + creditCode);
                supplier.setCreditCode(creditCode);

                // 国家
                cell = hssfRow.getCell(4);
                if (cell == null) {
                    continue;
                }
                String country = cell.getStringCellValue();
                System.out.println("country:" + country);
                supplier.setCountry(country);

                // 城市
                cell = hssfRow.getCell(5);
                if (cell == null) {
                    continue;
                }
                String city = cell.getStringCellValue();
                System.out.println("city:" + city);
                supplier.setCity(city);

                // 法人代表
                cell = hssfRow.getCell(6);
                if (cell == null) {
                    continue;
                }
                String legalPerson = cell.getStringCellValue();
                System.out.println("legalPerson:" + legalPerson);
                supplier.setLegalPerson(legalPerson);

                // 服务以及内容
                cell = hssfRow.getCell(7);
                if (cell == null) {
                    continue;
                }
                String servicesContent = cell.getStringCellValue();
                System.out.println("servicesContent:" + servicesContent);
                supplier.setServicesContent(servicesContent);

                //

                list.add(supplier);
            }
        }
        for (Supplier supplier : list) {

        }
        return true;
    }

    /**
     * 根据key取得供应商SAPID
     */
    @Override
    public String getSupplierSAP(String key) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andKeyEqualTo(key);

        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);

        if (!suppliers.isEmpty()) {
            Supplier supplier = suppliers.get(0);
            return supplier.getSapId();
        }
        return null;
    }

    /**
     * 根据key取得供应商币种
     */
    @Override
    public String getCurrencyByKey(String key) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andKeyEqualTo(key);

        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);

        if (!suppliers.isEmpty()) {
            Supplier supplier = suppliers.get(0);
            return supplier.getCurrency();
        }
        return null;
    }

}
