package com.sanlly.warehouse.models.input.asset.assetInfo;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchAssetInfoInput
 * Description: 查询资产输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class SearchAssetInfoInput extends PageInput{
	private String assetName;
	
	private String assetType;
	
	
	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public SearchAssetInfoInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchAssetInfoInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

	
}
