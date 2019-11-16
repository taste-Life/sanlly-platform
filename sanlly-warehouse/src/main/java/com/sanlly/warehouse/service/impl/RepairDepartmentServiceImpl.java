package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.RepairDepartmentMapper;
import com.sanlly.warehouse.entity.RepairDepartment;
import com.sanlly.warehouse.entity.RepairDepartmentExample;
import com.sanlly.warehouse.models.input.repairdepartment.RepairDepartmentInput;
import com.sanlly.warehouse.models.input.repairdepartment.SearchRepairDepartmentInput;
import com.sanlly.warehouse.models.output.repairdepartment.RepairDepartmentOutput;
import com.sanlly.warehouse.service.RepairDepartmentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 修理部门服务实现类
 *
 * @author lishzh
 */
@Service
public class RepairDepartmentServiceImpl extends BaseServiceImpl implements RepairDepartmentService {

    @Autowired
    private RepairDepartmentMapper repairDepartmentDao;

    private String tableName = "ware_repair_department";

    /**
     * @param input
     */
    @Override
    public void addRepairDepartment(RepairDepartmentInput input) {
        Result<String> result = productionService.getKey(tableName);
        if (result == null || StringUtils.isEmpty(result.getData())) {
            throw new SqlException("insertFail");
        }
        RepairDepartment rd = new RepairDepartment();
        BeanUtils.copyProperties(input, rd);
        rd.setWareRepairDepartmentId(null);
        rd.setKey(result.getData());
        rd.setCreateUser(getCurrentUserId());
        rd.setCreateTime(new Date());
        rd.setIsDel(PlatformConstants.ISDEL_NO);
        repairDepartmentDao.insertSelective(rd);
    }

    /**
     * 修改修理部门
     */
    @Override
    public void editRepairDepartment(RepairDepartmentInput input) {
        RepairDepartment rd = new RepairDepartment();
        BeanUtils.copyProperties(input, rd);
        rd.setUpdateUser(getCurrentUserId());
        rd.setUpdateTime(new Date());
        repairDepartmentDao.updateByPrimaryKeySelective(rd);
    }

    /**
     * 删除修理部门
     */
    @Override
    public void deleteRepairDepartment(List<Integer> ids) {
        ids.forEach(id -> {
            RepairDepartment rd = new RepairDepartment();
            rd.setWareRepairDepartmentId(id);
            rd.setIsDel(PlatformConstants.ISDEL_YES);
            repairDepartmentDao.updateByPrimaryKeySelective(rd);
        });
    }

    /**
     * 分页查询修理部门
     */
    @Override
    public PagedList<RepairDepartmentOutput> getPageRepairDepartment(SearchRepairDepartmentInput input) {
        RepairDepartmentExample example = new RepairDepartmentExample();
        RepairDepartmentExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(input.getName())) {
            if (isChineseRequest()) {
                criteria.andDepartmentNameLike("%" + input.getName() + "%");
            } else {
                criteria.andDepartmentNameEnLike("%" + input.getName() + "%");
            }
        }
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        // 查询总条数
        Integer total = (int) repairDepartmentDao.countByExample(example);
        PagedList<RepairDepartmentOutput> page = new PagedList<RepairDepartmentOutput>(input.getPageIndex(),
                input.getPageSize(), total);
        // 分页查询
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());
        List<RepairDepartmentOutput> outputs = repairDepartmentDao.selectByExample(example).stream().map(rd -> {
            RepairDepartmentOutput output = new RepairDepartmentOutput();
            output.setDepartmentName(rd.getDepartmentName());
            output.setDepartmentNameEn(rd.getDepartmentNameEn());
            output.setKey(rd.getKey());
            output.setKeyLangLang(rd.getKey());
            output.setRemark(rd.getRemark());
            output.setWareRepairDepartmentId(rd.getWareRepairDepartmentId());
            return output;
        }).collect(Collectors.toList());

        page.getDataList().addAll(outputs);
        return page;

    }

    /**
     * 查询所有修理部门
     */
    @Override
    public List<RepairDepartmentOutput> getAllRepairDepartment() {
        RepairDepartmentExample example = new RepairDepartmentExample();
        example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        return repairDepartmentDao.selectByExample(example).stream().map(rd -> {
            RepairDepartmentOutput output = new RepairDepartmentOutput();
            output.setDepartmentName(rd.getDepartmentName());
            output.setDepartmentNameEn(rd.getDepartmentNameEn());
            output.setKey(rd.getKey());
            output.setKeyLangLang(rd.getKey());
            output.setRemark(rd.getRemark());
            output.setWareRepairDepartmentId(rd.getWareRepairDepartmentId());
            return output;
        }).collect(Collectors.toList());
    }

}
