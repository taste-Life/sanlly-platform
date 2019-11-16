package com.sanlly.production.service.app;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.outYard.OutYardInput;
import com.sanlly.production.models.output.app.qualitys.SearchQualitysOutput;
import com.sanlly.production.models.output.outYard.OutContainerNoListOutput;
import com.sanlly.production.models.output.outYard.SearchOutYardOutput;

/**
 * 出厂接口
 * 
 * @Package com.sanlly.production.service.app 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年11月7日 下午6:13:48 
 * @version V1.0   
 */
public interface OutYardAPPService {

	/**
	 * 出厂
	 * 
	 * @Description: TODO void @throws 
	 */
	void outYard(OutYardInput input);

	/**
	 * 出厂列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return PagedList<SearchOutYardOutput> @throws 
	 */
	PagedList<SearchOutYardOutput> getOutYardList(String containerNo, String outState, Integer index, Integer size);

	/**
	 * 获取场站出厂箱号
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @return List<OutContainerNoListOutput> @throws 
	 */
	List<OutContainerNoListOutput> getOutYardContainerNOList(String containerNo);

}
