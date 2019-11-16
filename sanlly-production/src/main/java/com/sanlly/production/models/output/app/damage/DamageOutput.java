package com.sanlly.production.models.output.app.damage;

/**   
* @Package com.sanlly.production.models.output.app.damage 
* @Description: TODO 损坏实体-输出
* @author tianzhl   
* @date 2019年8月12日 下午4:35:35 
* @version V1.0   
*/
public class DamageOutput {
	
	// TODO 损坏代码
	private String damageCode;
	// TODO 损坏名称
	private String damageName;
	// TODO 损坏key
	private String damageKey;

	public String getDamageCode() {
		return damageCode;
	}

	public String getDamageName() {
		return damageName;
	}

	public String getDamageKey() {
		return damageKey;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public void setDamageName(String damageName) {
		this.damageName = damageName;
	}

	public void setDamageKey(String damageKey) {
		this.damageKey = damageKey;
	}

}
