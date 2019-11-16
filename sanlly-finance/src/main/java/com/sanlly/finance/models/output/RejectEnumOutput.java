package com.sanlly.finance.models.output;

/**
 * 驳回原因传输实体类
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月12日  
 *
 */
public class RejectEnumOutput {
	//驳回原因编号
	private String rejectCode;
	//驳回原因 国际化
	private String rejectNameLang;
	private Integer status;
	
	public String getRejectCode() {
		return rejectCode;
	}
	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}
	public String getRejectNameLang() {
		return rejectNameLang;
	}
	public void setRejectNameLang(String rejectNameLang) {
		this.rejectNameLang = rejectNameLang;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	 
	
}
