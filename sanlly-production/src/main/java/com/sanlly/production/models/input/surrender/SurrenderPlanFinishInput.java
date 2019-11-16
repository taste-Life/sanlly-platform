package com.sanlly.production.models.input.surrender;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.surrender 
 * @Description: TODO 退租箱-批量设置取消完工
 * @author tianzhl   
 * @date 2019年10月21日 上午10:57:24 
 * @version V1.0   
 */
public class SurrenderPlanFinishInput extends SurrenderPlanDeleteInput {

	// TODO id
	private Boolean isCancel;

	public Boolean getIsCancel() {
		return isCancel;
	}

	public void setIsCancel(Boolean isCancel) {
		this.isCancel = isCancel;
	}

}