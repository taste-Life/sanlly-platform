package com.sanlly.production.models.output.app.login;

/**
 * 箱子权限
 * @author RexSheng
 * 2019年8月9日 上午11:31:22
 */
public class ContainerAuth {

	/**
	 * 箱子权限-检验
	 */
	private Integer check;
	
	/**
	 * 箱子权限-修理
	 */
	private Integer repair;

	public Integer getCheck() {
		return check;
	}

	public void setCheck(Integer check) {
		this.check = check;
	}

	public Integer getRepair() {
		return repair;
	}

	public void setRepair(Integer repair) {
		this.repair = repair;
	}
	
	
}
