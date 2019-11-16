package com.sanlly.production.models.output.app.material;

/**   
* @Package com.sanlly.production.models.output.app.material 
* @Description: TODO 材质实体-输出
* @author tianzhl   
* @date 2019年8月12日 下午4:35:35 
* @version V1.0   
*/
public class MaterialOutput {
	
	// TODO 材质代码
	private String materialCode;
	// TODO 材质名称
	private String materialName;
	// TODO 材质key
	private String materialKey;

	public String getMaterialCode() {
		return materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public String getMaterialKey() {
		return materialKey;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public void setMaterialKey(String materialKey) {
		this.materialKey = materialKey;
	}

}
