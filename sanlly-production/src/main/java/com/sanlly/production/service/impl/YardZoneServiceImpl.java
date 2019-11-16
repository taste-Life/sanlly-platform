package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.ZoneTypeEnum;
import com.sanlly.production.models.input.yardZone.YardZoneInputAdd;
import com.sanlly.production.models.input.yardZone.YardZoneInputUpdate;
import com.sanlly.production.models.input.yardZone.ZoneSearchInput;
import com.sanlly.production.models.output.yardZone.YardZoneOutput;
import com.sanlly.production.models.output.yardZone.ZoneListOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.YardZoneService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 区位接口实现
 *
 * @author RexSheng
 * 2019年8月15日 下午1:15:35
 */
@Service
public class YardZoneServiceImpl extends BaseServiceImpl implements YardZoneService {

    @Autowired
    private YardZoneMapper yardZoneMapper;
    @Autowired
    private LangService langService;


    /**
     * 查询区位列表
     */
    @Override
    public PagedList<ZoneListOutput> getZoneList(ZoneSearchInput input) {
        YardZoneExample example = new YardZoneExample();
        YardZoneExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        //只查询预检区
        criteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode());
        //场站
        if (StringUtils.isNotEmpty(input.getYard())) {
            criteria.andYardEqualTo(input.getYard());
        }
        //区位编号
        if (StringUtils.isNotEmpty(input.getZoneCode())) {
            criteria.andZoneCodeLike("%" + input.getZoneCode() + "%");
        }
        //总数
        int totalItemCount = (int) yardZoneMapper.countByExample(example);
        PagedList<ZoneListOutput> pagedList = new PagedList<>(input.getIndex(), input.getSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        //分页查询
        List<YardZone> zoneList = yardZoneMapper.selectByExample(example);
        List<ZoneListOutput> list = zoneList.stream()
                .map(a -> {
                    ZoneListOutput item = new ZoneListOutput();
                    item.setYardLang(a.getYard());
                    item.setZoneCode(a.getZoneCode());
                    item.setKey(a.getKey());
                    return item;
                }).collect(Collectors.toList());
        pagedList.setDataList(list);
        return pagedList;
    }

    /**
     * @param yardKey
     * @author zhq
     * @date 2019/10/29
     * @description 根据yardid查询zone列表
     */
    @Override
    public List<ZoneListOutput> getZoneListByYardKey(String yardKey) {
        YardZoneExample yardZoneExample = new YardZoneExample();
        yardZoneExample.or().andYardEqualTo(yardKey).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        return yardZoneMapper.selectByExample(yardZoneExample).stream().map(yardZone -> {
            ZoneListOutput zoneListOutput = new ZoneListOutput();
            BeanUtils.copyProperties(yardZone, zoneListOutput);
            return zoneListOutput;
        }).collect(Collectors.toList());
    }

    /**
     * @param yardZoneInputAdd
     * @author zhq
     * @date 2019/11/4
     * @description 新增场站区位
     */
    @Override
    public int addYardZone(YardZoneInputAdd yardZoneInputAdd) {
        YardZone yardZone = new YardZone();
        BeanUtils.copyProperties(yardZoneInputAdd, yardZone);
        yardZone.setKey(langService.getLangRuleKeyByTable("prod_yard_zone"));
        yardZone.setCreateTime(new Date());
        yardZone.setCreateUser(super.getCurrentUserId());
        yardZone.setIsDel(PlatformConstants.ISDEL_NO);
        yardZone.setIsValid(PlatformConstants.ISVALID_YES);
        return yardZoneMapper.insertSelective(yardZone);
    }

    /**
     * @param yardZoneInputUpdate
     * @author zhq
     * @date 2019/11/4
     * @description 修改场站区位
     */
    @Override
    public int updateYardZone(YardZoneInputUpdate yardZoneInputUpdate) {
        YardZone yardZone = new YardZone();
        BeanUtils.copyProperties(yardZoneInputUpdate, yardZone);
        yardZone.setUpdateTime(new Date());
        yardZone.setUpdateUser(super.getCurrentUserId());
        return yardZoneMapper.updateByPrimaryKeySelective(yardZone);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/4
     * @description 删除场站区位
     */
    @Override
    public int deleteYardZone(Integer[] ids) {
        YardZoneExample yardZoneExample = new YardZoneExample();
        yardZoneExample.or().andProdYardZoneIdIn(Arrays.asList(ids));
        YardZone yardZone = new YardZone();
        yardZone.setIsDel(PlatformConstants.ISDEL_YES);
        return yardZoneMapper.updateByExampleSelective(yardZone, yardZoneExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/4
     * @description 设置有效
     */
    @Override
    public int validateYardZone(Integer[] ids, Integer valid) {
        YardZoneExample yardZoneExample = new YardZoneExample();
        yardZoneExample.or().andProdYardZoneIdIn(Arrays.asList(ids));
        YardZone yardZone = new YardZone();
        yardZone.setIsValid(valid);
        return yardZoneMapper.updateByExampleSelective(yardZone, yardZoneExample);
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
    public PagedList<YardZoneOutput> getYardZoneList(Integer index, Integer size, String searchWords) {
        YardZoneExample yardZoneExample = new YardZoneExample();
        yardZoneExample.or().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        int totalNums = (int) yardZoneMapper.countByExample(yardZoneExample);
        PagedList<YardZoneOutput> pagedList = new PagedList<>(index, size, totalNums);
        yardZoneExample.setOrderByClause("create_time desc");
        yardZoneExample.setLimitStart(pagedList.getLimitStart());
        yardZoneExample.setLimitEnd(pagedList.getLimitEnd());
        List<YardZone> yardZoneList = yardZoneMapper.selectByExample(yardZoneExample);
        List<YardZoneOutput> yardZoneOutputList = yardZoneList.stream().map(yardZone -> {
            YardZoneOutput yardZoneOutput = new YardZoneOutput();
            BeanUtils.copyProperties(yardZone, yardZoneOutput);
            yardZoneOutput.setYardNameLang(yardZone.getYard());
            yardZoneOutput.setZoneTypeNameLang(yardZone.getZoneType());
            return yardZoneOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(yardZoneOutputList);
        return pagedList;
    }
}
