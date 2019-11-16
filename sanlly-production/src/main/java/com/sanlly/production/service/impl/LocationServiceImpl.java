package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.LocationMapper;
import com.sanlly.production.entity.Location;
import com.sanlly.production.entity.LocationExample;
import com.sanlly.production.models.input.location.LocationInputAdd;
import com.sanlly.production.models.input.location.LocationInputUpdate;
import com.sanlly.production.models.output.location.LocationOutput;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.LocationService;
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
 * @date 2019/11/7
 * @description
 */
@Service
public class LocationServiceImpl extends BaseServiceImpl implements LocationService {

    @Autowired
    private LocationMapper locationMapper;
    @Autowired
    private LangService langService;

    /**
     * @param locationInputAdd
     * @author zhq
     * @date 2019/11/7
     * @description 新增码头位置
     */
    @Override
    public int addLocation(LocationInputAdd locationInputAdd) {
        Location location = new Location();
        BeanUtils.copyProperties(locationInputAdd, location);
        location.setKey(langService.getLangRuleKeyByTable("prod_location"));
        location.setCreateTime(new Date());
        location.setCreateUser(super.getCurrentUserId());
        location.setIsDel(PlatformConstants.ISDEL_NO);
        location.setIsValid(PlatformConstants.ISVALID_YES);
        return locationMapper.insertSelective(location);
    }

    /**
     * @param locationInputUpdate
     * @author zhq
     * @date 2019/11/7
     * @description 修改码头位置
     */
    @Override
    public int updateLocation(LocationInputUpdate locationInputUpdate) {
        Location location = new Location();
        BeanUtils.copyProperties(locationInputUpdate, location);
        location.setUpdateTime(new Date());
        location.setUpdateUser(super.getCurrentUserId());
        return locationMapper.updateByPrimaryKeySelective(location);
    }

    /**
     * @param ids
     * @author zhq
     * @date 2019/11/7
     * @description 删除码头位置
     */
    @Override
    public int deleteLocation(Integer[] ids) {
        LocationExample locationExample = new LocationExample();
        locationExample.or().andProdLocationIdIn(Arrays.asList(ids));
        Location location = new Location();
        location.setIsDel(PlatformConstants.ISDEL_YES);
        return locationMapper.updateByExampleSelective(location, locationExample);
    }

    /**
     * @param ids
     * @param valid
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    @Override
    public int validateLocation(Integer[] ids, Integer valid) {
        LocationExample locationExample = new LocationExample();
        locationExample.or().andProdLocationIdIn(Arrays.asList(ids));
        Location location = new Location();
        location.setIsValid(valid);
        return locationMapper.updateByExampleSelective(location, locationExample);
    }

    /**
     * @param index
     * @param size
     * @param searchWords
     * @author zhq
     * @date 2019/11/7
     * @description 分页查询
     */
    @Override
    public PagedList<LocationOutput> getLocationList(Integer index, Integer size, String searchWords) {
        LocationExample locationExample = new LocationExample();
        LocationExample.Criteria criteria = locationExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (StringUtils.isNotBlank(searchWords)) {
            String bySearchWords = "%" + searchWords + "%";
            criteria.andLocationNameLike(bySearchWords);
        }
        int totalNums = (int) locationMapper.countByExample(locationExample);
        PagedList<LocationOutput> pagedList = new PagedList<>(index, size, totalNums);
        locationExample.setOrderByClause("create_time desc");
        locationExample.setLimitStart(pagedList.getLimitStart());
        locationExample.setLimitEnd(pagedList.getLimitEnd());
        List<Location> locationList = locationMapper.selectByExample(locationExample);
        List<LocationOutput> locationOutputList = locationList.stream().map(location -> {
            LocationOutput locationOutput = new LocationOutput();
            BeanUtils.copyProperties(location, locationOutput);
            locationOutput.setDockNameLang(location.getDock());
            return locationOutput;
        }).collect(Collectors.toList());
        pagedList.setDataList(locationOutputList);
        return pagedList;
    }
}
