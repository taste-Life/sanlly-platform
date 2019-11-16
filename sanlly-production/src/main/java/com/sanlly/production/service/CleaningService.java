package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.cleaning.CleaningAddInput;
import com.sanlly.production.models.input.cleaning.CleaningSearchInput;
import com.sanlly.production.models.output.cleaning.CleaningListOutput;

/**
 * 洗箱接口
 * @author RexSheng
 * 2019年8月21日 下午4:46:08
 */
public interface CleaningService {

	/**
	 * 获取异味种类列表
	 * @return
	 */
	List<SelectOutput> getFlavorList();
	
	/**
	 * 洗箱列表
	 * @param input
	 * @return
	 */
	PagedList<CleaningListOutput> getPagedList(CleaningSearchInput input);
	
	/**
	 * 洗箱完工
	 * @param cleanIds
	 */
	void setComplete(Integer[] cleaningIds);
	
	/**
	 * 洗箱完工补充照片
	 * @param cleanIds
	 */
	void setCompletePhoto(Integer cleaningId,String photo);
	
	/**
	 * 洗箱审核
	 * @param cleaningId 
	 * @param photo 审核照片
	 */
	void setAudited(Integer cleaningId,String photo);
	
	/**
	 * 洗箱驳回
	 * @param cleaningIds
	 */
	/* void setRejected(Integer[] cleaningIds); */
	
	/**
	 * 设置洗箱图片及异味种类，正常箱直接标记为完工已审核。特殊箱需要审核
	 * @param photo
	 * @param flavor
	 */
	void setPhotoAndFlavor(Integer cleaningId,String photo,String flavor,String isSepcial,String remark);
	
	/**
	 * 新增洗箱
	 * @param input
	 */
	void addCleaning(CleaningAddInput input);
}
