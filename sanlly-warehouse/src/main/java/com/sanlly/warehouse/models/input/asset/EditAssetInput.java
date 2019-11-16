package com.sanlly.warehouse.models.input.asset;
/**
 * ClassName: EditAssetInput
 * Description: 修改资产输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class EditAssetInput extends AddAssetInput{
	private Integer wareAssetManagementId;

	public Integer getWareAssetManagementId() {
		return wareAssetManagementId;
	}

	public void setWareAssetManagementId(Integer wareAssetManagementId) {
		this.wareAssetManagementId = wareAssetManagementId;
	}
	

}
