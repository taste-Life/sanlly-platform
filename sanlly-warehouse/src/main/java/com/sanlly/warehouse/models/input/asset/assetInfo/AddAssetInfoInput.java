package com.sanlly.warehouse.models.input.asset.assetInfo;

/**
 * ClassName: AddAssetInfoInput
 * Description: 添加资产输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AddAssetInfoInput {
	//资产名称
    private String assetName;
    //英文名称
    private String assetNameEn;
    //资产类别
    private String assetType;
    //备注
    private String remark;
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetNameEn() {
		return assetNameEn;
	}
	public void setAssetNameEn(String assetNameEn) {
		this.assetNameEn = assetNameEn;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
	
}
