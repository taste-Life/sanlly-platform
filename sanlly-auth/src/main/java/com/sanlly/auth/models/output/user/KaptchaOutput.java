package com.sanlly.auth.models.output.user;

/**
 * 验证码输出
 * @author RexSheng
 * 2019年8月16日 上午9:47:04
 */
public class KaptchaOutput {
	/**
	 * 验证码
	 */
	private String code;
	
	/**
	 * 图片base64编码
	 */
	private String img;
	
	public KaptchaOutput() {}
	public KaptchaOutput(String code,String img) {
		this.code=code;
		this.img=img;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}
