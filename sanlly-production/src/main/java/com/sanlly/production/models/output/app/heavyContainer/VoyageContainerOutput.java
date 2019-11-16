package com.sanlly.production.models.output.app.heavyContainer;
/**
 * 航次箱列表输出类
 * @author zhangkai
 *
 */
public class VoyageContainerOutput {

	/*
	 * 重箱id
	 */
	private Integer prodHeavyEnterId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 船名航次
	 */
	private String vesVos;
	/*
	 * 计划装船日期
	 */
	private String shipmentDate;
	public Integer getProdHeavyEnterId() {
		return prodHeavyEnterId;
	}
	public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
		this.prodHeavyEnterId = prodHeavyEnterId;
	}
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getVesVos() {
		return vesVos;
	}
	public void setVesVos(String vesVos) {
		this.vesVos = vesVos;
	}
	public String getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	
	
}
