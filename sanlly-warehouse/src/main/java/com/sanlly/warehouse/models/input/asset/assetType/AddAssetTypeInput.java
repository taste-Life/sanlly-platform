package com.sanlly.warehouse.models.input.asset.assetType;

/**
 * ClassName: AddAssetTypeInput
 * Description: 添加资产类别输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AddAssetTypeInput {
	//资产类别
    private String assetTypeName;
    //英文名称
    private String assetTypeNameEn;
    //备注
    private String remark;
	public String getAssetTypeName() {
		return assetTypeName;
	}
	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}
	public String getAssetTypeNameEn() {
		return assetTypeNameEn;
	}
	public void setAssetTypeNameEn(String assetTypeNameEn) {
		this.assetTypeNameEn = assetTypeNameEn;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    
}
