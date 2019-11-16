package com.sanlly.production.models.output.utype;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.utype 
 * @Description: TODO 箱体进场机组类型
 * @author tianzhl   
 * @date 2019年9月5日 下午2:53:23 
 * @version V1.0   
 */
public class utypeOutput {

	// TODO 机组类型key
	private String utype;

	// TODO 机组类型编码
	private String utypeCode;

	// TODO 机组类型名
	private String utypeNameLang;

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getUtypeCode() {
		return utypeCode;
	}

	public void setUtypeCode(String utypeCode) {
		this.utypeCode = utypeCode;
	}

	public String getUtypeNameLang() {
		return utypeNameLang;
	}

	public void setUtypeNameLang(String utypeNameLang) {
		this.utypeNameLang = utypeNameLang;
	}

}
