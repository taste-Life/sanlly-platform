package com.sanlly.production.models.output.valuation;

import java.util.List;

/**
 * 照片导出输出类
 * @author zhangkai
 *
 */
public class PicExportOutput {

	// 箱号
	private String containerNo;
	// 条目
	private List<PicExportDetailOutput> details;
	// 修后照片
	private String afterPhoto;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public List<PicExportDetailOutput> getDetails() {
		return details;
	}

	public void setDetails(List<PicExportDetailOutput> details) {
		this.details = details;
	}

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}
	
	
}
