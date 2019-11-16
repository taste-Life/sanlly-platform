package com.sanlly.production.models.input.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 班组指派
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixReferralDesignateInput extends FixReferralBatchInput {

	// TODO 指派班组
	private String designateUser;

	public String getDesignateUser() {
		return designateUser;
	}

	public void setDesignateUser(String designateUser) {
		this.designateUser = designateUser;
	}

}
