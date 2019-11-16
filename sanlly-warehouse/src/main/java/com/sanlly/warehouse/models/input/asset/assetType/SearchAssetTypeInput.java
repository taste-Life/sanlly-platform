package com.sanlly.warehouse.models.input.asset.assetType;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchAssetTypeInput
 * Description: 查询资产类别输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class SearchAssetTypeInput extends PageInput{
	private String assetTypeName;
	
	public String getAssetTypeName() {
		return assetTypeName;
	}

	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public SearchAssetTypeInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchAssetTypeInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
	
	

}
