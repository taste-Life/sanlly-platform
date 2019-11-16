package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.RepairMapper;
import com.sanlly.production.entity.Repair;
import com.sanlly.production.entity.RepairExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.repair.RepairInput;
import com.sanlly.production.models.output.repair.RepairOutput;
import com.sanlly.production.service.RepairService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RepairServiceImpl extends  BaseServiceImpl implements RepairService {

    @Autowired
    private RepairMapper repairMapper;

    @Autowired
    private LangServiceImpl lang;

    @Override
    public List<RepairOutput> list() {
        return null;
    }

    @Override
    public RepairOutput query(Integer id) {
        return null;
    }

    @Override
    public int update(RepairInput input) {
        Repair record = new Repair();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return repairMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int add(RepairInput input) {
        Repair record = new Repair();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_repair"));
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return repairMapper.insertSelective(record);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
    *@Description: 修理分页列表
    *@Param: [input, searchWords]
    *@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.production.models.output.repair.RepairOutput>
    *@Author: zjd
    *@date: 2019-09-26
    */
    @Override
    public PagedList<RepairOutput> pageList(PageInput input, String searchWords) {
        List<RepairOutput> outputList = new ArrayList<RepairOutput>();
        RepairExample example = new RepairExample();
        example.setOrderByClause("create_time DESC");
        RepairExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andRepairCodeLike("%"+searchWords.trim()+"%");
            RepairExample.Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andRepairNameLike("%"+searchWords.trim()+"");
            RepairExample.Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andRepairNameEnLike("%"+searchWords.trim()+"%");
            example.or(criteria2);
            example.or(criteria3);
            //通过message查询code,模糊查询category
            String containerCategory = ContainerCategoryEnum.getCodeByMessage(searchWords);
            if(containerCategory != null){
                RepairExample.Criteria criteria4 = example.createCriteria();
                criteria4.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                criteria4.andContainerCategoryLike("%"+containerCategory.trim()+"%");
                example.or(criteria4);
            }

        }
        Integer totalItemCount = (int)repairMapper.countByExample(example);
        PagedList<RepairOutput> pagedList = new PagedList<RepairOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<Repair> list = repairMapper.selectByExample(example);
        for (Repair item : list) {
            RepairOutput output = new RepairOutput();
            BeanUtils.copyProperties(item, output);
            output.setContainerCategory(ContainerCategoryEnum.getMessagebyCode(item.getContainerCategory()));
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            Repair record = new Repair();
            record.setProdRepairId(id);
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            repairMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }

    @Override
    public int multiValid(Integer[] ids, int valid) {
        for(Integer id : ids){
            Repair record = new Repair();
            record.setProdRepairId(id);
            record.setIsValid(valid);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            repairMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
