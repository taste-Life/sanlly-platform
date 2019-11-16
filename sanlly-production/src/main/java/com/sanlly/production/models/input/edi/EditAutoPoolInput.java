package com.sanlly.production.models.input.edi;

/**
 * 修改自动进入EDI池配置
 * @author RexSheng
 * 2019年10月22日 下午3:55:20
 */
public class EditAutoPoolInput extends AddAutoPoolInput{

	private Integer autoPoolId;

	public Integer getAutoPoolId() {
		return autoPoolId;
	}

	public void setAutoPoolId(Integer autoPoolId) {
		this.autoPoolId = autoPoolId;
	}
	
	
}
