package com.sanlly.warehouse.models.input.laborInsurance.laborReceive;

import java.util.List;

import com.sanlly.warehouse.models.output.laborInsurance.laborSell.LaborSellDetailOutput;

/**
 * ClassName: AddLaborSellInput
 * Description: 添加劳保销售申请单输入类
 * date: 2019/9/3 16:15
 *
 * @author zhh
 */
public class AddLaborSellInput{
	//购买方
	private String buyer;
	//购买人
	private String buyerUser;
	//申请明细
    private List<LaborSellDetailOutput> detailList;
    //申请部门
    private String applyDepartment;
    //申请人
    private Integer applyUser;
    //单据类型
    private String billType;
    //备注
    private String remark;
    
	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public List<LaborSellDetailOutput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<LaborSellDetailOutput> detailList) {
		this.detailList = detailList;
	}

	public String getApplyDepartment() {
		return applyDepartment;
	}

	public void setApplyDepartment(String applyDepartment) {
		this.applyDepartment = applyDepartment;
	}

	public Integer getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(Integer applyUser) {
		this.applyUser = applyUser;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getBuyerUser() {
		return buyerUser;
	}

	public void setBuyerUser(String buyerUser) {
		this.buyerUser = buyerUser;
	}
	
	
}
