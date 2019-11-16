package com.sanlly.auth.models.output.role;

/**
 * 场站输出
 * @author RexSheng
 * 2019年8月16日 上午9:46:30
 */
public class YardOutput {
	
	/**
	 * 场站id
	 */
	private Integer yardId;
	
	/**
	 * 场站名称
	 */
	private String yardName;
	
	/**
	 * 所属公司
	 */
	private Integer companyId;

	public Integer getYardId() {
		return yardId;
	}

	public void setYardId(Integer yardId) {
		this.yardId = yardId;
	}

	public String getYardName() {
		return yardName;
	}

	public void setYardName(String yardName) {
		this.yardName = yardName;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	
	
}
