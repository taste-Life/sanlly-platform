package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.foaming.SearchFoamingInput;
import com.sanlly.production.models.output.foaming.SearchFoamingOutput;

/**
 * 发泡接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午3:01:15 
 * @version V1.0   
 */
public interface FoamingService {

	/**
	 * 发泡新增,派工时调用，自动审核派工时调用
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	void addFoaming(String courseId);

	/**
	 * 删除发泡信息
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	void delFoaming(String courseId);

	/**
	 * 发泡列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<T> @throws 
	 */
	PagedList<SearchFoamingOutput> getFoamingPagedList(SearchFoamingInput input);

	/**
	 * 发泡完工
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void finishFoaming(Integer[] listIds);

	/**
	 * 发泡图片上传
	 * 
	 * @Description: TODO
	 * @param foamingId
	 * @param photo
	 *            void @throws 
	 */
	void uploadFoaming(Integer foamingId, String photo);

}
