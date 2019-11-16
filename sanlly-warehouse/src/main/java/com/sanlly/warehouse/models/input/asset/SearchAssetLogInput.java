package com.sanlly.warehouse.models.input.asset;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchAssetLogInput
 * Description: 查询资产操作日志输入类
 * date: 2019/10/17 17:51
 *
 * @author zhh
 */
public class SearchAssetLogInput extends PageInput{
    //操作人
	private Integer operator;
    //操作类型
    private String operateType;
    //资产编号
    private String assetNo;
    //资产名称
    private String assetName;
    //操作时间
    private Date operateTime;
	
	
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
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public SearchAssetLogInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchAssetLogInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
    
}
