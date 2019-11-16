package com.sanlly.purchase.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.SpecialSupplierLogMapper;
import com.sanlly.purchase.dao.SpecialSupplierMapper;
import com.sanlly.purchase.dao.SupplierMapper;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.AuditStatusEnum;
import com.sanlly.purchase.enums.OperationTypeEnum;
import com.sanlly.purchase.enums.SupplierTypeEnum;
import com.sanlly.purchase.models.input.specialsupplier.AddSpecialSupplierInput;
import com.sanlly.purchase.models.input.specialsupplier.EditSpecialSupplierInput;
import com.sanlly.purchase.models.input.specialsupplier.SearchSpecialSupplierInput;
import com.sanlly.purchase.models.output.specialsupplier.SpecialSupplierOutput;
import com.sanlly.purchase.service.AuthFigenClient;
import com.sanlly.purchase.service.SpecialSupplierService;
import com.sanlly.purchase.service.feign.WorkFlowFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class SpecialSupplierServiceImpl extends BaseServiceImpl implements SpecialSupplierService {

    @Autowired
    private SpecialSupplierMapper specialSupplierDao;
    @Autowired
    AuthFigenClient authFigenClient;
    @Autowired
    WorkFlowFeignClient workFlowFeignClient;
    @Autowired
    SpecialSupplierLogMapper specialSupplierLogMapper;
    @Autowired
    SupplierMapper supplierMapper;

    /**
     * @author mx
     * 特殊供应商/黑名单分页列表
     */
    @Override
    public PagedList<SpecialSupplierOutput> getSpecialSupplierPagedList(SearchSpecialSupplierInput input) {

        SpecialSupplierExample example = new SpecialSupplierExample();
        SpecialSupplierExample.Criteria criteria = example.createCriteria();

        //查询条件
        //供应商类型
        if (StringUtils.isNotBlank(input.getSupplierType())) {
            //根据供应商类型查询
            criteria.andSupplierTypeEqualTo(input.getSupplierType());
        }
        if (input.getName() != null && !input.getName().equals("")) {
            criteria.andNameLike("%" + input.getName() + "%");
        }

        //总条数
        Integer totalItemCount = (int) specialSupplierDao.countByExample(example);
        PagedList<SpecialSupplierOutput> pagedList = new PagedList<SpecialSupplierOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<SpecialSupplier> specialSuppliersList = specialSupplierDao.selectByExample(example);
        //构造返回数据
        List<SpecialSupplierOutput> dataList = new ArrayList<SpecialSupplierOutput>();
        for (SpecialSupplier specialSupplier : specialSuppliersList) {
            SpecialSupplierOutput output = new SpecialSupplierOutput();
            BeanUtils.copyProperties(specialSupplier, output);
            output.setSupplierTypeLangLang(output.getSupplierType());
            // 需求申请人
            Result<UserInfoOutput> authRs = authFigenClient.userDetail(specialSupplier.getCreateUser());
            if (authRs != null) {

                output.setUpdateUser(authRs.getData().getUserName());
            }

            dataList.add(output);
        }
        //将分页数据放入结果中
        pagedList.getDataList().addAll(dataList);
        return pagedList;
    }

    /**
     * @author mx
     * 新增特殊供应商/黑名单
     */
    @Override
    public Result addSpecialSupplier(AddSpecialSupplierInput input) {
        for (String supplier : input.getSupplier()) {
            SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
            specialSupplierLogExample.createCriteria().andSupplierEqualTo(supplier)
                    .andAuditStatusEqualTo(AuditStatusEnum.AUDIT.getCode());
            List<SpecialSupplierLog> specialSupplierLogs = specialSupplierLogMapper.selectByExample(specialSupplierLogExample);
            if (!specialSupplierLogs.isEmpty()) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "黑名单或特殊关联企业审核中");
            }
            SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();

        }
        for (String supplier : input.getSupplier()) {

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
            // TODO Auto-generated method stub
            SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
            Date date = new Date();
            Integer userid = getCurrentUserId();
            specialSupplierLog.setProcessInstanceId(processId);
            specialSupplierLog.setLogType(input.getSupplierType());
            specialSupplierLog.setOperationType(OperationTypeEnum.OperationTypeEnum01.getCode());
            specialSupplierLog.setOperationUserId(userid);
            specialSupplierLog.setUpdateUser(userid);
            specialSupplierLog.setCreateUser(userid);
            specialSupplierLog.setCreateTime(date);
            specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
            specialSupplierLog.setSupplier(supplier);
            SupplierExample supplierExample = new SupplierExample();
            supplierExample.createCriteria().andKeyEqualTo(supplier);
            List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);
            if (!suppliers.isEmpty()) {
                specialSupplierLog.setSupplierName(suppliers.get(0).getName());
                specialSupplierLog.setSupplierNameEn(suppliers.get(0).getNameEn());
                specialSupplierLog.setSupplier(suppliers.get(0).getKey());
            }

            specialSupplierLogMapper.insertSelective(specialSupplierLog);

        }

        return Result.Success();


    }

    /**
     * @author mx
     * 获取特殊供应商/黑名单
     */
    @Override
    public SpecialSupplierOutput getSpecialSupplier(EditSpecialSupplierInput input) {

        SpecialSupplier specialSupplier = specialSupplierDao.selectByPrimaryKey(input.getSpecialSupplierId());
        SpecialSupplierOutput output = new SpecialSupplierOutput();
        BeanUtils.copyProperties(specialSupplier, output);
        return output;
    }

    /**
     * @author mx
     * 修改特殊供应商/黑名单
     */
    @Override
    public void updateSpecialSupplier(EditSpecialSupplierInput input) {
        // TODO Auto-generated method stub
        SpecialSupplier specialSupplier = new SpecialSupplier();
        BeanUtils.copyProperties(input, specialSupplier);
        specialSupplier.setUpdateTime(new Date());
        specialSupplier.setUpdateUser(getCurrentUserId());
        specialSupplierDao.updateByPrimaryKeySelective(specialSupplier);

    }

    /**
     * @author mx
     * 批量删除特殊供应商/黑名单
     */
    @Override
    public Result deleteSpecialSupplier(Integer[] specialSupplierIds) {
        Date date = new Date();
        Integer userid = getCurrentUserId();
        for (Integer specialSupplierId : specialSupplierIds) {
            SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
            specialSupplierExample.createCriteria().andSpecialSupplierIdEqualTo(specialSupplierId);
            List<SpecialSupplier> specialSuppliers = specialSupplierDao.selectByExample(specialSupplierExample);
            String supplierName = specialSuppliers.get(0).getName();
            SpecialSupplierLogExample specialSupplierLogExample = new SpecialSupplierLogExample();
            specialSupplierLogExample.createCriteria().andSupplierNameEqualTo(supplierName)
                    .andAuditStatusEqualTo(AuditStatusEnum.AUDIT.getCode());
            List<SpecialSupplierLog> specialSupplierLogs = specialSupplierLogMapper.selectByExample(specialSupplierLogExample);
            if (!specialSupplierLogs.isEmpty()) {
                return Result.Error(ResultCodeEnum.ERROR.getCode(), "黑名单或特殊关联企业审核中");
            }
        }
        for (Integer specialSupplierId : specialSupplierIds) {
            SpecialSupplierExample specialSupplierExample = new SpecialSupplierExample();
            specialSupplierExample.createCriteria().andSpecialSupplierIdEqualTo(specialSupplierId);
            List<SpecialSupplier> specialSuppliers = specialSupplierDao.selectByExample(specialSupplierExample);
            SpecialSupplier specialSupplier = specialSuppliers.get(0);
            String supplierName = specialSuppliers.get(0).getName();
            if (!specialSupplier.getSupplierType().equals(SupplierTypeEnum.SupplierTypeEnumB.getCode())) {
                SupplierExample supplierExample = new SupplierExample();
                supplierExample.createCriteria().andNameEqualTo(supplierName);
                List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);

                SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();
                if (!suppliers.isEmpty()) {
                    specialSupplierLog.setSupplier(suppliers.get(0).getKey());
                    Supplier supplier = new Supplier();
                    if (specialSupplier.getSupplierType().equals(SupplierTypeEnum.SupplierTypeEnumC.getCode())) {
                        supplier.setIsSpecial(CommonEnum.NO.getCode());

                    } else {
                        supplier.setIsBlack(CommonEnum.NO.getCode());

                    }
                    supplierMapper.updateByPrimaryKeySelective(supplier);
                }
                specialSupplierLog.setSupplierName(specialSuppliers.get(0).getName());
                specialSupplierLog.setSupplierNameEn(specialSuppliers.get(0).getNameEn());
                specialSupplierLog.setOperationUserId(userid);
                specialSupplierLog.setUpdateUser(userid);
                specialSupplierLog.setCreateUser(userid);
                specialSupplierLog.setCreateTime(date);
                specialSupplierLog.setLogType(specialSupplier.getSupplierType());
                specialSupplierLog.setOperationType(OperationTypeEnum.OperationTypeEnum02.getCode());
                specialSupplierLogMapper.insertSelective(specialSupplierLog);
                specialSupplierDao.deleteByPrimaryKey(specialSupplierId);

            } else {
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
                SpecialSupplierLog specialSupplierLog = new SpecialSupplierLog();

                specialSupplierLog.setProcessInstanceId(processId);
                specialSupplierLog.setOperationUserId(userid);
                specialSupplierLog.setUpdateUser(userid);
                specialSupplierLog.setCreateUser(userid);
                specialSupplierLog.setCreateTime(date);
                specialSupplierLog.setLogType(specialSupplier.getSupplierType());
                specialSupplierLog.setOperationType(OperationTypeEnum.OperationTypeEnum02.getCode());
                specialSupplierLog.setAuditStatus(AuditStatusEnum.AUDIT.getCode());
                SupplierExample supplierExample = new SupplierExample();
                supplierExample.createCriteria().andNameEqualTo(supplierName);
                List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);
                if (!suppliers.isEmpty()) {
                    specialSupplierLog.setSupplier(suppliers.get(0).getKey());
                    specialSupplierLog.setSupplierName(suppliers.get(0).getName());
                    specialSupplierLog.setSupplierNameEn(suppliers.get(0).getNameEn());
                } else {
                    specialSupplierLog.setSupplierName(specialSuppliers.get(0).getName());
                    specialSupplierLog.setSupplierNameEn(specialSuppliers.get(0).getNameEn());
                }
                specialSupplierLogMapper.insertSelective(specialSupplierLog);

            }
        }


        return Result.Success();
    }

}
