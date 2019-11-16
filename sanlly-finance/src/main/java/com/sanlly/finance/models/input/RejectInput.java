package com.sanlly.finance.models.input;
/**
 * 财务驳回输入实体类
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月13日  
 *
 */
public class RejectInput {
	//主表id
	private String id;
	//驳回原因code
	private String rejectCode;
	//备注
	private String remark;


	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRejectCode() {
		return rejectCode;
	}
	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
