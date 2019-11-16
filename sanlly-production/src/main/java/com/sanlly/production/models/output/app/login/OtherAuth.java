package com.sanlly.production.models.output.app.login;

/**
 * 主页剩余权限
 * @author RexSheng
 * 2019年8月9日 上午11:45:30
 */
public class OtherAuth {

	/**
	 * 机组
	 */
	private Integer unitAuth;
	
	/**
	 * 洗箱
	 */
	private Integer wash;
	
	/**
	 * 重箱监管
	 */
	private Integer supervise;
	
	/**
	 * 出箱
	 */
	private Integer out;
	
	/**
	 * 发泡
	 */
	private Integer bubble;
	
	/**
	 * 仓库出库
	 */
	private Integer warehouse;
	
	/**
	 * 先修
	 */
	private Integer xx;
	
	/**
	 * 新箱
	 */
	private Integer newContainer;

	public Integer getUnitAuth() {
		return unitAuth;
	}

	public void setUnitAuth(Integer unitAuth) {
		this.unitAuth = unitAuth;
	}

	public Integer getWash() {
		return wash;
	}

	public void setWash(Integer wash) {
		this.wash = wash;
	}

	public Integer getSupervise() {
		return supervise;
	}

	public void setSupervise(Integer supervise) {
		this.supervise = supervise;
	}

	public Integer getOut() {
		return out;
	}

	public void setOut(Integer out) {
		this.out = out;
	}

	public Integer getBubble() {
		return bubble;
	}

	public void setBubble(Integer bubble) {
		this.bubble = bubble;
	}

	public Integer getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Integer warehouse) {
		this.warehouse = warehouse;
	}

	public Integer getXx() {
		return xx;
	}

	public void setXx(Integer xx) {
		this.xx = xx;
	}

	public Integer getNewContainer() {
		return newContainer;
	}

	public void setNewContainer(Integer newContainer) {
		this.newContainer = newContainer;
	}
	
	
}
