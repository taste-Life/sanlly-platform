package com.sanlly.warehouse.models.input.asset.assetInfo;
/**
 * ClassName: EditAssetInfoInput
 * Description: 修改资产输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class EditAssetInfoInput extends AddAssetInfoInput{
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
