package com.sanlly.production.service.app;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.qualitys.QualitysContInput;
import com.sanlly.production.models.input.app.qualitys.QualitysUnitInput;
import com.sanlly.production.models.input.app.qualitys.SearchQualitysInput;
import com.sanlly.production.models.output.app.qualitys.QualityReasonsOutput;
import com.sanlly.production.models.output.app.qualitys.QualityStandardsOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysContOutput;
import com.sanlly.production.models.output.app.qualitys.QualitysUnitOutput;
import com.sanlly.production.models.output.app.qualitys.SearchQualitysOutput;

/**
 * 质检app接口
 * 
 * @Package com.sanlly.production.service.app 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月9日 下午1:34:16 
 * @version V1.0   
 */
public interface QualitysAppService {

	PagedList<SearchQualitysOutput> getQualitysPagedList(SearchQualitysInput input);

	QualitysContOutput containerQualityDetails(String prodCourseId, String containerCategory);

	QualitysUnitOutput unitReferralDetails(String prodCourseId);

	void updateQualityContEntry(QualitysContInput input);

	void updateQualityUnitEntry(QualitysUnitInput input);

	/**
	 * 获取质检错项原因
	 * 
	 * @Description: TODO
	 * @param name
	 * @return List<SelectItemOutput> @throws 
	 */
	List<QualityReasonsOutput> getQualityReasons(String reasonType);

	/**
	 * 获取返工问题类别和整改标准列表
	 * 
	 * @Description: TODO
	 * @return List<QualityStandardsOutput> @throws 
	 */
	List<QualityStandardsOutput> getQualityStandards(String containerCategory);
}
