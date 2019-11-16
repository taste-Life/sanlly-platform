package com.sanlly.production.models.output.app.base;
/**
 * APP端部件明细列表输出类
 * @author zhangkai
 *
 */
public class PartsDetailsSelectOutput {

	/*
	 * 部件明细代码
	 */
	private String partsDetailsCode;
	/*
	 * 部件明细中文名
	 */
	private String partsDetailsName;
	/*
	 * 部件明细英文名
	 */
	private String partsDetailsNameEn;

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public String getPartsDetailsName() {
		return partsDetailsName;
	}

	public void setPartsDetailsName(String partsDetailsName) {
		this.partsDetailsName = partsDetailsName;
	}

	public String getPartsDetailsNameEn() {
		return partsDetailsNameEn;
	}

	public void setPartsDetailsNameEn(String partsDetailsNameEn) {
		this.partsDetailsNameEn = partsDetailsNameEn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partsDetailsCode == null) ? 0 : partsDetailsCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartsDetailsSelectOutput other = (PartsDetailsSelectOutput) obj;
		if (partsDetailsCode == null) {
			if (other.partsDetailsCode != null)
				return false;
		} else if (!partsDetailsCode.equals(other.partsDetailsCode))
			return false;
		return true;
	}
	
	
}
