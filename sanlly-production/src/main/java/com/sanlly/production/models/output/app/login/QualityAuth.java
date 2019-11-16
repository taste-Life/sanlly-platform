package com.sanlly.production.models.output.app.login;

/**
 * 质检权限
 * @author RexSheng
 * 2019年8月9日 上午11:44:24
 */
public class QualityAuth {

	/**
	 * 干箱
	 */
	private Integer dryContainer;
	
	/**
	 * 冷箱
	 */
	private Integer iceContainer;
	
	/**
	 * 机组
	 */
	private Integer unit;

	public Integer getDryContainer() {
		return dryContainer;
	}

	public void setDryContainer(Integer dryContainer) {
		this.dryContainer = dryContainer;
	}

	public Integer getIceContainer() {
		return iceContainer;
	}

	public void setIceContainer(Integer iceContainer) {
		this.iceContainer = iceContainer;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	
	
}
