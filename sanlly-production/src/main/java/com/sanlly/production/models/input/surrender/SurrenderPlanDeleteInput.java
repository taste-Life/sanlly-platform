package com.sanlly.production.models.input.surrender;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.surrender 
 * @Description: TODO 退租箱-批量删除id
 * @author tianzhl   
 * @date 2019年10月21日 上午10:57:24 
 * @version V1.0   
 */
public class SurrenderPlanDeleteInput {

	// TODO id
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

}