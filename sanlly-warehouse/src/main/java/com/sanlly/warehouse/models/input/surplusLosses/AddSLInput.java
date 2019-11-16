package com.sanlly.warehouse.models.input.surplusLosses;
/**
 * ClassName: AddSLInput
 * Description: 添加盘盈盘亏输入类
 * date: 2019/10/30 10:51
 *
 * @author zhh
 */

import java.util.List;

import com.sanlly.warehouse.models.output.surplusLosses.SLDetailOutput;

public class AddSLInput {

	//所属场站
	private String yard;
	//所属仓库
	private String warehouse;
	//单据状态
	private String billStatus;
	//单据类型
	private String type;
	//制单人
	private Integer createUser;
	
	//备注
	private String remark;
	//单据明细
	private List<SLDetailOutput> detailList;
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public Integer getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<SLDetailOutput> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<SLDetailOutput> detailList) {
		this.detailList = detailList;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	
	
}
