package com.sanlly.production.models.output.guarantee;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.guarantee 
 * @Description: TODO 保修批量提醒
 * @author tianzhl   
 * @date 2019年10月11日 下午3:28:36 
 * @version V1.0   
 */
public class MaintenanceBatchOutput {

	// TODO 保修id
	private Integer prodMaintenanceBatchId;

	// TODO 保修编码
	private String code;

	// TODO 代码类型
	private String noTypeLang;

	// TODO 起始代码
	private String startNo;

	// TODO 终止代码
	private String endNo;

	// TODO 保修描述
	private String descriptionLang;

	private List<MaintenanceBatchDetailOutput> detailList;

	public Integer getProdMaintenanceBatchId() {
		return prodMaintenanceBatchId;
	}

	public void setProdMaintenanceBatchId(Integer prodMaintenanceBatchId) {
		this.prodMaintenanceBatchId = prodMaintenanceBatchId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNoTypeLang() {
		return noTypeLang;
	}

	public void setNoTypeLang(String noTypeLang) {
		this.noTypeLang = noTypeLang;
	}

	public String getStartNo() {
		return startNo;
	}

	public void setStartNo(String startNo) {
		this.startNo = startNo;
	}

	public String getEndNo() {
		return endNo;
	}

	public void setEndNo(String endNo) {
		this.endNo = endNo;
	}

	public String getDescriptionLang() {
		return descriptionLang;
	}

	public void setDescriptionLang(String descriptionLang) {
		this.descriptionLang = descriptionLang;
	}

	public List<MaintenanceBatchDetailOutput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<MaintenanceBatchDetailOutput> detailList) {
		this.detailList = detailList;
	}

}
