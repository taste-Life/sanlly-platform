package com.sanlly.warehouse.models.output.asset;
/**
 * ClassName: AssetTypeOutput
 * Description: 资产类别输出类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AssetTypeOutput {
	private Integer wareAssetTypeId;

    private String key;
    
    private String assetTypeName;
    
    private String assetTypeNameEn;

    private String assetTypeLangLang;
    
    private String remark;

	public Integer getWareAssetTypeId() {
		return wareAssetTypeId;
	}

	public void setWareAssetTypeId(Integer wareAssetTypeId) {
		this.wareAssetTypeId = wareAssetTypeId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
    

	public String getAssetTypeLangLang() {
		return assetTypeLangLang;
	}

	public void setAssetTypeLangLang(String assetTypeLangLang) {
		this.assetTypeLangLang = assetTypeLangLang;
	}

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
