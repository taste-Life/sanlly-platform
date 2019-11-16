package com.sanlly.production.models.input;

import com.sanlly.common.models.input.PageInput;

public class ActiveProcessInput extends PageInput{

	public ActiveProcessInput(){
		 
	}
	
	public ActiveProcessInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}

	/**
	 * 流程名称
	 */
	private String processName;
	
	/**
	 * 流程版本号
	 */
	private String processVersion;

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessVersion() {
		return processVersion;
	}

	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;
	}
	
}
