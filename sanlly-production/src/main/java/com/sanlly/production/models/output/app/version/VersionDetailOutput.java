package com.sanlly.production.models.output.app.version;

/**
 * app版本信息
 * @author RexSheng
 * 2019年8月28日 上午10:12:02
 */
public class VersionDetailOutput {

	/**
	 * 版本号
	 */
	private String versionCode;
	
	/**
	 * 版本名称
	 */
	private String versionName;
	
	/**
	 * 版本描述
	 */
	private String remarks;
	
	/**
	 * apk文件路径
	 */
	private String apkFilePath;

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getApkFilePath() {
		return apkFilePath;
	}

	public void setApkFilePath(String apkFilePath) {
		this.apkFilePath = apkFilePath;
	}
	
	
}
