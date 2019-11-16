package com.sanlly.production.models.output.app.shortcut;

/**   
* @Package com.sanlly.production.models.output.app.shortcut 
* @Description: TODO 快捷条目录入实体-返回
* @author tianzhl   
* @date 2019年8月12日 下午1:55:02 
* @version V1.0   
*/
public class ShortcutOutput {

	// TODO 快捷名称
	private String shortcutName;
	// TODO 快捷代码
	private String shortcutCode;
	// TODO 快捷条目
	private ShortcutDetailOutput shortcutDetail;

	public String getShortcutName() {
		return shortcutName;
	}

	public String getShortcutCode() {
		return shortcutCode;
	}

	public ShortcutDetailOutput getShortcutDetail() {
		return shortcutDetail;
	}

	public void setShortcutName(String shortcutName) {
		this.shortcutName = shortcutName;
	}

	public void setShortcutCode(String shortcutCode) {
		this.shortcutCode = shortcutCode;
	}

	public void setShortcutDetail(ShortcutDetailOutput shortcutDetail) {
		this.shortcutDetail = shortcutDetail;
	}

}
