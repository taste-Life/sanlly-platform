package com.sanlly.production.models.input.fix;

import java.util.List;

import com.sanlly.common.models.input.PageInput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单类型查询条件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class PickingListBatchOutInput{

	// TODO 领料单号
	private List<String> referralNoList;

	public List<String> getReferralNoList() {
		return referralNoList;
	}

	public void setReferralNoList(List<String> referralNoList) {
		this.referralNoList = referralNoList;
	}
}
