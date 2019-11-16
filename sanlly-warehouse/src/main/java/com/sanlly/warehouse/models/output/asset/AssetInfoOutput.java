package com.sanlly.warehouse.models.output.asset;
/**
 * ClassName: AssetInfoOutput
 * Description: 资产信息输出类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AssetInfoOutput {

	private Integer wareAssetId;

    private String key;

    private String assetNameLang;

    private String assetNameEn;
    
    private String assetType;
    
    private String assetTypeNameLang;
    
    private String remark;

	public Integer getWareAssetId() {
		return wareAssetId;
	}

	public void setWareAssetId(Integer wareAssetId) {
		this.wareAssetId = wareAssetId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAssetNameLang() {
		return assetNameLang;
	}

	public void setAssetNameLang(String assetNameLang) {
		this.assetNameLang = assetNameLang;
	}

	public String getAssetNameEn() {
		return assetNameEn;
	}

	public void setAssetNameEn(String assetNameEn) {
		this.assetNameEn = assetNameEn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssetTypeNameLang() {
		return assetTypeNameLang;
	}

	public void setAssetTypeNameLang(String assetTypeNameLang) {
		this.assetTypeNameLang = assetTypeNameLang;
	}
    
    
}
