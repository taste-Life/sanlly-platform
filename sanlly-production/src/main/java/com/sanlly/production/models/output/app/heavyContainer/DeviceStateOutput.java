package com.sanlly.production.models.output.app.heavyContainer;

/**
 * 重箱监管-设备状态列表输出类
 * @author zhangkai
 *
 */
public class DeviceStateOutput {

	/*
	 * tag枚举key 警告标识
	 */
	private String deviceStateKey;
	/*
	 * tag枚举名称 警告标识
	 */
	private String deviceStateNameLang;

	public String getDeviceStateKey() {
		return deviceStateKey;
	}

	public void setDeviceStateKey(String deviceStateKey) {
		this.deviceStateKey = deviceStateKey;
	}

	public String getDeviceStateNameLang() {
		return deviceStateNameLang;
	}

	public void setDeviceStateNameLang(String deviceStateNameLang) {
		this.deviceStateNameLang = deviceStateNameLang;
	}
	
	
}
