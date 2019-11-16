package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ShortcutRecordMapper;
import com.sanlly.production.entity.ShortcutRecord;
import com.sanlly.production.entity.ShortcutRecordExample;
import com.sanlly.production.models.input.shortcutrecord.ShortcutRecordInputAdd;
import com.sanlly.production.models.input.shortcutrecord.ShortcutRecordInputUpdate;
import com.sanlly.production.models.output.shortcutrecord.ShortcutRecordOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.ShortcutRecordService;
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
 * @date 2019/11/4
 * @description
 */
@Service
public class ShortcutRecordServiceImpl extends BaseServiceImpl implements ShortcutRecordService {
    @Autowired
    private ShortcutRecordMapper shortcutRecordMapper;
    @Autowired
    private LangService langService;

    /**
     * @param shortcutRecordInputAdd
     * @author zhq
     * @date 2019/11/4
     * @description 新增快捷录入维护表
     */
    @Override
    public int addShortcutRecord(ShortcutRecordInputAdd shortcutRecordInputAdd) {
        ShortcutRecord shortcutRecord = new ShortcutRecord();
        BeanUtils.copyProperties(shortcutRecordInputAdd, shortcutRecord);
        shortcutRecord.setCreateTime(new Date());
        shortcutRecord.setCreateUser(super.getCurrentUserId());
        shortcutRecord.setIsDel(PlatformConstants.ISDEL_NO);
        shortcutRecord.setIsValid(PlatformConstants.ISVALID_YES);
        return shortcutRecordMapper.insertSelective(shortcutRecord);
    }

    /**
     * @param shortcutRecordInputUpdate
     * @author zhq
     * @date 2019/11/4
     * @description 修改快捷录入维护表
     */
    @Override
    public int updateShortcutRecord(ShortcutRecordInputUpdate shortcutRecordInputUpdate) {

        ShortcutRecord shortcutRecord = new ShortcutRecord();
        BeanUtils.copyProperties(shortcutRecordInputUpdate, shortcutRecord);
        shortcutRecord.setUpdateTime(new Date());
        shortcutRecord.setUpdateUser(super.getCurrentUserId());
        return shortcutRecordMapper.updateByPrimaryKeySelective(shortcutRecord);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/4
     * @description 删除快捷录入
     */
    @Override
    public int deleteShortcutRecord(Integer[] ids) {
        ShortcutRecordExample shortcutRecordExample = new ShortcutRecordExample();
        shortcutRecordExample.createCriteria().andProdShortcutRecordIdIn(Arrays.asList(ids));
        ShortcutRecord shortcutRecord = new ShortcutRecord();
        shortcutRecord.setIsDel(PlatformConstants.ISDEL_YES);
        return shortcutRecordMapper.updateByExampleSelective(shortcutRecord, shortcutRecordExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/4
     * @description 设置有效无效
     */
    @Override
    public int validateShortcutRecord(Integer[] ids, Integer valid) {
        ShortcutRecordExample shortcutRecordExample = new ShortcutRecordExample();
        shortcutRecordExample.createCriteria().andProdShortcutRecordIdIn(Arrays.asList(ids));
        ShortcutRecord shortcutRecord = new ShortcutRecord();
        shortcutRecord.setIsValid(valid);
        return shortcutRecordMapper.updateByExampleSelective(shortcutRecord, shortcutRecordExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/4
     * @description 分页查询
     */
    @Override
    public PagedList<ShortcutRecordOutput> getShortcutRecordList(Integer index, Integer size, String searchWords) {
        ShortcutRecordExample shortcutRecordExample = new ShortcutRecordExample();
        ShortcutRecordExample.Criteria criteria = shortcutRecordExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andShortcutNameLike(bySearchWords);
        }
        int totalNums = (int) shortcutRecordMapper.countByExample(shortcutRecordExample);
        PagedList<ShortcutRecordOutput> pagedList = new PagedList<>(index, size, totalNums);
        shortcutRecordExample.setLimitStart(pagedList.getLimitStart());
        shortcutRecordExample.setLimitEnd(pagedList.getLimitEnd());
        shortcutRecordExample.setOrderByClause("create_time desc");
        List<ShortcutRecord> shortcutRecordList = shortcutRecordMapper.selectByExample(shortcutRecordExample);
        List<ShortcutRecordOutput> shortcutRecordOutputList = shortcutRecordList.stream().map(shortcutRecord -> {
            ShortcutRecordOutput shortcutRecordOutput = new ShortcutRecordOutput();
            BeanUtils.copyProperties(shortcutRecord, shortcutRecordOutput);
            shortcutRecordOutput.setContainerCategoryNameLang(shortcutRecord.getContainerCategory());
            shortcutRecordOutput.setPartsTypeCodeNameLang(shortcutRecord.getPartsTypeCode());
            shortcutRecordOutput.setPartsDetailsCodeNameLang(shortcutRecord.getPartsDetailsCode());
            shortcutRecordOutput.setPartsRepairCodeNameLang(shortcutRecord.getPartsRepairCode());
            shortcutRecordOutput.setDamageCodnNameLang(shortcutRecord.getDamageCode());
            shortcutRecordOutput.setRepairCodeNameLang(shortcutRecord.getRepairCode());
            shortcutRecordOutput.setMaterialCodeNameLang(shortcutRecord.getMaterialCode());
            return shortcutRecordOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(shortcutRecordOutputList);
        return pagedList;
    }
}
