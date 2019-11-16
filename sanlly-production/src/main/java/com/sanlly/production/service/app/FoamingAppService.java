package com.sanlly.production.service.app;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.foamoing.UpdateFoamingInput;
import com.sanlly.production.models.output.app.Foaming.SearchFoamingAppOutput;

/**
 * 发泡接口
 * 
 * @Package com.sanlly.production.service.app 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午1:54:49 
 * @version V1.0   
 */
public interface FoamingAppService {

	/**
	 * 发泡列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return PagedList<SearchFoamingAppOutput> @throws 
	 */
	PagedList<SearchFoamingAppOutput> getFoamingsPagedList(String containerNo, String foamingState, Integer index,
			Integer size);

	/**
	 * 发泡保存
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateFoaming(UpdateFoamingInput input);

	/**
	 * 批量发泡
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void subFoaming(String[] listIds);

	/**
	 * 单箱发泡
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void subFoamingSingle(UpdateFoamingInput input);

}
