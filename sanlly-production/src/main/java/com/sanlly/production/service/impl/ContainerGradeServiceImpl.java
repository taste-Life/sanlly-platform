package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.base.ContainerGradeInput;
import com.sanlly.common.models.output.base.ContainerGradeOutput;
import com.sanlly.production.dao.ContainerGradeMapper;
import com.sanlly.production.entity.ContainerGrade;
import com.sanlly.production.entity.ContainerGradeExample;
import com.sanlly.production.entity.ContainerGradeExample.Criteria;
import com.sanlly.production.service.ContainerGradeService;

@Service
public class ContainerGradeServiceImpl extends BaseServiceImpl implements ContainerGradeService {

    @Autowired
    private ContainerGradeMapper containerGradeMapper;
    @Autowired
    private LangServiceImpl lang;

    /**
     * 查询列表
     *
     * @return
     * @author zhangkai
     */
    @Override
    public List<ContainerGradeOutput> list() {
        List<ContainerGradeOutput> outputList = new ArrayList<ContainerGradeOutput>();
        ContainerGradeExample example = new ContainerGradeExample();
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<ContainerGrade> list = containerGradeMapper.selectByExample(example);
        for (ContainerGrade item : list) {
            ContainerGradeOutput output = new ContainerGradeOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        return outputList;
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return 
     * @author zhangkai
     */
    @Override
    public ContainerGradeOutput query(Integer id) {
        ContainerGrade record = containerGradeMapper.selectByPrimaryKey(id);
        ContainerGradeOutput output = new ContainerGradeOutput();
        BeanUtils.copyProperties(record, output);
        return output;
    }

    /**
     * 根据主键更新
     *
     * @param company
     * @return
     * @author zhangkai
     */
    @Override
    public int update(ContainerGradeInput input) {
        ContainerGrade record = new ContainerGrade();
        BeanUtils.copyProperties(input, record);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return containerGradeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 新增
     *
     * @param input
     * @return
     * @author zhangkai
     */
    @Override
    public int add(ContainerGradeInput input) {
        ContainerGrade record = new ContainerGrade();
        BeanUtils.copyProperties(input, record);
        record.setKey(lang.getLangRuleKeyByTable("prod_container_grade"));
        record.setIsValid(PlatformConstants.ISVALID_YES);
        record.setIsDel(PlatformConstants.ISDEL_NO);
        record.setCreateUser(getCurrentUserId());
        record.setCreateTime(new Date());
        return containerGradeMapper.insertSelective(record);
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     * @author zhangkai
     */
    @Override
    public int delete(Integer id) {
        ContainerGrade record = new ContainerGrade();
        record.setIsDel(PlatformConstants.ISDEL_YES);
        record.setUpdateUser(getCurrentUserId());
        record.setUpdateTime(new Date());
        return containerGradeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * @Description: 箱等级分页列表
     * @Param: [input, searchWords]
     * @return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerGradeOutput>
     * @Author: zjd
     * @date: 2019-09-25
     */
    @Override
    public PagedList<ContainerGradeOutput> pageList(PageInput input, String searchWords) {
        List<ContainerGradeOutput> outputList = new ArrayList<ContainerGradeOutput>();
        ContainerGradeExample example = new ContainerGradeExample();
        example.setOrderByClause("create_time DESC");
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (searchWords != null && !"".equals(searchWords)) {
            criteria.andContainerUserLike("%" + searchWords.trim() + "%");
            Criteria criteria2 = example.createCriteria();
            criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria2.andContainerGradeNameLike("%" + searchWords.trim() + "");
            Criteria criteria3 = example.createCriteria();
            criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria3.andContainerGradeNameEnLike("%" + searchWords.trim() + "%");
            example.or(criteria2);
            example.or(criteria3);
        }
        Integer totalItemCount = (int) containerGradeMapper.countByExample(example);
        PagedList<ContainerGradeOutput> pagedList = new PagedList<ContainerGradeOutput>
                (input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<ContainerGrade> list = containerGradeMapper.selectByExample(example);
        for (ContainerGrade item : list) {
            ContainerGradeOutput output = new ContainerGradeOutput();
            BeanUtils.copyProperties(item, output);
            outputList.add(output);
        }
        pagedList.setDataList(outputList);
        return pagedList;
    }

    /**
    *@Description: 批量删除箱等级
    *@Param: [ids]
    *@return: int
    *@Author: zjd
    *@date: 2019-09-25
    */
    @Override
    public int multiDelete(Integer[] ids) {
        for(Integer id : ids){
            ContainerGrade record = new ContainerGrade();
            record.setIsDel(PlatformConstants.ISDEL_YES);
            record.setProdContainerGradeId(id);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            containerGradeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
    /**
    *@Description: 批量设置有效性
    *@Param: [ids, valid]
    *@return: int
    *@Author: zjd
    *@date: 2019-09-25
    */
    @Override
    public int multiValid(Integer[] ids, int valid) {
        for (Integer id : ids){
            ContainerGrade record = new ContainerGrade();
            record.setIsValid(valid);
            record.setProdContainerGradeId(id);
            record.setUpdateUser(getCurrentUserId());
            record.setUpdateTime(new Date());
            containerGradeMapper.updateByPrimaryKeySelective(record);
        }
        return 1;
    }
}
