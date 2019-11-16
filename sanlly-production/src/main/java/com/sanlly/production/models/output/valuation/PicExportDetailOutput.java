package com.sanlly.production.models.output.valuation;
/**
 * 照片导出明细输出类
 * @author zhangkai
 *
 */
public class PicExportDetailOutput {

	// 条目序号
	private Integer detailNo;
	// 修前照片
	private String beforePhoto;
	
	public Integer getDetailNo() {
		return detailNo;
	}
	public void setDetailNo(Integer detailNo) {
		this.detailNo = detailNo;
	}
	public String getBeforePhoto() {
		return beforePhoto;
	}
	public void setBeforePhoto(String beforePhoto) {
		this.beforePhoto = beforePhoto;
	}
	
	
}
