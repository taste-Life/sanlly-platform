package com.sanlly.warehouse.models.input.asset.assetType;
/**
 * ClassName: EditAssetTypeInput
 * Description: 修改资产类别输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class EditAssetTypeInput extends AddAssetTypeInput{
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
