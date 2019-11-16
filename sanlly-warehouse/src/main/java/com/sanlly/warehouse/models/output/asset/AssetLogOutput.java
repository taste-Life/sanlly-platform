package com.sanlly.warehouse.models.output.asset;

/**
 * ClassName: AssetLogOutput
 * Description: 资产操作日志输出类
 * date: 2019/10/17 17:51
 *
 * @author zhh
 */
public class AssetLogOutput {
	//操作人
	private Integer operator;
	//操作人姓名
	private String operatorName;
    //操作类型
    private String operateType;
    //国际化操作类型
    private String operateTypeNameLang;
    //资产
    private String asset;
    //资产编号
    private String assetNo;
    //国际化资产名称
    private String assetNameLang;
    //操作时间
    private String operateTime;
    //操作内容
    private String operateContent;
    
	public Integer getOperator() {
		return operator;
	}
	public void setOperator(Integer operator) {
		this.operator = operator;
	}
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	
	public String getOperateTypeNameLang() {
		return operateTypeNameLang;
	}
	public void setOperateTypeNameLang(String operateTypeNameLang) {
		this.operateTypeNameLang = operateTypeNameLang;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getAssetNameLang() {
		return assetNameLang;
	}
	public void setAssetNameLang(String assetNameLang) {
		this.assetNameLang = assetNameLang;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateContent() {
		return operateContent;
	}
	public void setOperateContent(String operateContent) {
		this.operateContent = operateContent;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
    

}
