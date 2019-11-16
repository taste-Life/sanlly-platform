package com.sanlly.warehouse.models.input.asset;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchAssetInput
 * Description: 查询资产输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class SearchAssetInput extends PageInput{
	//所属公司
    private String company;
    //所属部门
    private String departments;
    //账外资产类别
    private String outAssetType;
    //责任人
    private Integer liablePerson;
    //资产编号
    private String assetNo;
    //资产名称
    private String assetName;
    //购买日期
    private Date purchaseDate;
    //使用状态
    private String useStatus;
    
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public String getOutAssetType() {
		return outAssetType;
	}
	public void setOutAssetType(String outAssetType) {
		this.outAssetType = outAssetType;
	}
	public Integer getLiablePerson() {
		return liablePerson;
	}
	public void setLiablePerson(Integer liablePerson) {
		this.liablePerson = liablePerson;
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
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public String getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}
	public SearchAssetInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchAssetInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
    

}
