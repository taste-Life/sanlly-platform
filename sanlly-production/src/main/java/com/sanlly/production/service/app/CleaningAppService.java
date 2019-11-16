package com.sanlly.production.service.app;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.cleaning.CleaningAuditInput;
import com.sanlly.production.models.input.app.cleaning.CleaningPhotoInput;
import com.sanlly.production.models.input.app.cleaning.CleaningSearchInput;
import com.sanlly.production.models.input.app.cleaning.CleaningUploaderInput;
import com.sanlly.production.models.output.app.cleaning.CleaningListOutput;
import com.sanlly.production.models.output.app.cleaning.OdorSpeciesOutput;

/**
 * 洗箱app接口
 * @author RexSheng
 * 2019年8月24日 下午4:09:14
 */
public interface CleaningAppService {

	/**
	 * 获取洗箱列表
	 * @param input
	 * @return
	 */
	PagedList<CleaningListOutput> getCleanPagedList(CleaningSearchInput input);
	
	
	/**
	 * 洗箱员洗箱
	 * @param input
	 */
	void subCleanDetail(CleaningUploaderInput input);
	
	/**
	 * 预检员洗箱
	 * @param input
	 */
	void subCheckCleanDetail(CleaningAuditInput input);
	
	/**
	 * 洗箱完工补充照片
	 * @param input
	 */
	void subCompletePhoto(CleaningPhotoInput input);
	
	/**
	 * 异味种类列表
	 * @return
	 */
	OdorSpeciesOutput[] odorSpeciesList();
}
