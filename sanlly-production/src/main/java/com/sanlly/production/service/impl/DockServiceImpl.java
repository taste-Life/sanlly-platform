package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.DockMapper;
import com.sanlly.production.entity.Dock;
import com.sanlly.production.entity.DockExample;
import com.sanlly.production.models.input.dock.DockInputAdd;
import com.sanlly.production.models.input.dock.DockInputUpdate;
import com.sanlly.production.models.output.dock.DockOutput;
import com.sanlly.production.service.DockService;
import com.sanlly.production.service.LangService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
@Service
public class DockServiceImpl extends BaseServiceImpl implements DockService {

    @Autowired
    private DockMapper dockMapper;
    @Autowired
    private LangService langService;

    /**
     * @param dockInputAdd
     * @author zhq
     * @date 2019/11/6
     * @description 新增
     */
    @Override
    public int addDock(DockInputAdd dockInputAdd) {
        Dock dock = new Dock();
        BeanUtils.copyProperties(dockInputAdd, dock);
        dock.setKey(langService.getLangRuleKeyByTable("prod_dock"));
        dock.setCreateTime(new Date());
        dock.setCreateUser(super.getCurrentUserId());
        dock.setIsDel(PlatformConstants.ISDEL_NO);
        dock.setIsValid(PlatformConstants.ISVALID_YES);
        return dockMapper.insertSelective(dock);
    }

    /**
     * @param dockInputUpdate
     * @author zhq
     * @date 2019/11/6
     * @description 修改
     */
    @Override
    public int updateDock(DockInputUpdate dockInputUpdate) {
        Dock dock = new Dock();
        BeanUtils.copyProperties(dockInputUpdate, dock);
        dock.setUpdateTime(new Date());
        dock.setUpdateUser(super.getCurrentUserId());
        return dockMapper.updateByPrimaryKeySelective(dock);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/6
     * @description 删除
     */
    @Override
    public int deleteDock(Integer[] ids) {
        DockExample dockExample = new DockExample();
        dockExample.or().andProdDockIdIn(Arrays.asList(ids));
        Dock dock = new Dock();
        dock.setIsDel(PlatformConstants.ISDEL_YES);
        return dockMapper.updateByExampleSelective(dock, dockExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/6
     * @description 设置有效
     */
    @Override
    public int validateDock(Integer[] ids, Integer valid) {
        DockExample dockExample = new DockExample();
        dockExample.or().andProdDockIdIn(Arrays.asList(ids));
        Dock dock = new Dock();
        dock.setIsValid(valid);
        return dockMapper.updateByExampleSelective(dock, dockExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/6
     * @description 分页查询
     */
    @Override
    public PagedList<DockOutput> getDocklist(Integer index, Integer size, String searchWords) {
        DockExample dockExample = new DockExample();
        DockExample.Criteria criteria = dockExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andDockNameLike(bySearchWords);
        }
        int totalNums = (int) dockMapper.countByExample(dockExample);
        PagedList<DockOutput> pagedList = new PagedList<>(index, size, totalNums);
        dockExample.setOrderByClause("create_time desc");
        dockExample.setLimitStart(pagedList.getLimitStart());
        dockExample.setLimitEnd(pagedList.getLimitEnd());
        List<Dock> dockList = dockMapper.selectByExample(dockExample);
        List<DockOutput> dockOutputList = dockList.stream().map(dock -> {
            DockOutput dockOutput = new DockOutput();
            BeanUtils.copyProperties(dock, dockOutput);
            dockOutput.setCompanyNameLang(dock.getCompany());
            return dockOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(dockOutputList);
        return pagedList;
    }

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 查询全部码头
     */
    @Override
    public List<DockOutput> getAllDockList() {
        DockExample dockExample = new DockExample();
        dockExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        List<Dock> dockList = dockMapper.selectByExample(dockExample);
        return dockList.stream().map(dock -> {
            DockOutput dockOutput = new DockOutput();
            BeanUtils.copyProperties(dock, dockOutput);
            dockOutput.setCompanyNameLang(dock.getCompany());
            dockOutput.setKeyNameLang(dock.getKey());
            return dockOutput;
        }).collect(Collectors.toList());
    }
}
