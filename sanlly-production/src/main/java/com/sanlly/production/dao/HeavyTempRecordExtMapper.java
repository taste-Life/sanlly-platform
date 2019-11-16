package com.sanlly.production.dao;

import java.util.List;

import com.sanlly.production.entity.HeavyTempRecord;

/**
 * 重箱监管-温度采集记录ExtMapper
 * @author zhangkai
 *
 */
public interface HeavyTempRecordExtMapper {
	
	/**
	 * 重箱监管-获取每个箱子最近一条温度采集记录
	 * @return
	 */
	List<HeavyTempRecord> lastTemp();
}
