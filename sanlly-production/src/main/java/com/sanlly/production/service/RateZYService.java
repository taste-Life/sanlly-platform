package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.rate.AddZYRateInput;
import com.sanlly.production.models.input.rate.CopyZYRateInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.rate.SearchZYRateInput;
import com.sanlly.production.models.input.rate.UpdateZYRateInput;
import com.sanlly.production.models.input.rate.ZyFiveInput;
import com.sanlly.production.models.output.rate.SearchZYRateOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.models.output.rate.ZYFiveRateOutput;
import com.sanlly.production.models.output.rate.ZYRateOutput;
import com.sanlly.production.models.output.rate.ZySelectOutput;

/**
 * 中远费率接口类
* @Package com.sanlly.production.service 
* @Description: TODO 
* @author wangxzh   
* @date 2019年8月22日 上午9:43:05 
* @version V1.0   
 */
public interface RateZYService {
	/**
	 * 列表查询
	* @Description: TODO 
	* @param input
	* @return PagedList<SearchZYRateOutput>
	* @throws 
	 */
	PagedList<SearchZYRateOutput> getZYRatePagedList(SearchZYRateInput input);
	/**
	 * 中远费率新增
	* @Description: TODO 
	* @param input void
	* @throws 
	 */
	void addZYRate(AddZYRateInput input);
	/**
	 * 获取单条中原费率信息
	* @Description: TODO 
	* @param rateId
	* @return ZYRateOutput
	* @throws 
	 */
	ZYRateOutput getZYRate(String rateId);
	/**
	 * 中远费率编辑
	* @Description: TODO 
	* @param input void
	* @throws 
	 */
	void updateZYRate(UpdateZYRateInput input);
	/**
	 * 中远费率删除
	* @Description: TODO 
	* @param rateIds void
	* @throws 
	 */
	void delZYRate(String[] rateIds);
	/**
	 * 中远费率拷贝
	* @Description: TODO 
	* @param input void
	* @throws 
	 */
	void copyZYRate(CopyZYRateInput input);
	/**
	 * 是否已存在费率
	* @Description: TODO 
	* @param company
	* @return Boolean
	* @throws 
	 */
	Boolean isExist(String company);
	/**
	 * 费率代码是否已存在
	* @Description: TODO 
	* @param company
	* @return Boolean
	* @throws 
	 */
	Boolean isExistCode(String code,String rateId);
	/**
	 * 五位代码获取
	* @Description: TODO 
	* @param fiveCode
	* @return ZYFiveRateOutput
	* @throws 
	 */
	ZYFiveRateOutput getZYFiveMessage(ZyFiveInput fiveCode);
	/**
	 * 中远返回长宽
	* @Description: TODO 
	* @param input
	* @return List<ZySelectOutput>
	* @throws 
	 */
	List<ZySelectOutput> getZYFiveCodeSelectMessage(GetRateMessageInput input);
}
