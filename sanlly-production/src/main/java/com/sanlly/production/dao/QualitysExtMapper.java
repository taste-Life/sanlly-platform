package com.sanlly.production.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sanlly.production.models.input.app.qualitys.SearchQualitysInput;
import com.sanlly.production.models.output.app.qualitys.QualitysContEntryOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysUnitEntryOutput;
import com.sanlly.production.models.output.app.qualitys.SearchQualitysOutput;

/**
 * 质检自定义
 * 
 * @Package com.sanlly.production.dao 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月8日 下午3:58:10 
 * @version V1.0   
 */
public interface QualitysExtMapper {

	/**
	 * app质检列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return List<SearchQualitysOutput> @throws 
	 */
	List<SearchQualitysOutput> getQualitysPagedList(SearchQualitysInput input);

	/**
	 * app质检列表总数
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Integer @throws 
	 */
	Integer getQualitysPagedCount(SearchQualitysInput input);

	/**
	 * 质检明细-箱体
	 * 
	 * @Description: TODO
	 * @param prodCourseId
	 * @param containerCategory
	 * @return List<QualitysContEntryOutput> @throws 
	 */
	List<QualitysContEntryOutput> getQualitysContList(@Param(value = "prodCourseId") String prodCourseId,
			@Param(value = "containerCategory") String containerCategory);

	/**
	 * 质检明细-机组
	 * 
	 * @Description: TODO
	 * @param prodCourseId
	 * @return List<QualitysUnitEntryOutput> @throws 
	 */
	List<QualitysUnitEntryOutput> getQualitysUnitList(@Param(value = "prodCourseId") String prodCourseId,
			@Param(value = "containerCategory") String containerCategory);

}
