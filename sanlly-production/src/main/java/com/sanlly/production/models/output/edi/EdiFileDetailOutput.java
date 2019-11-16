package com.sanlly.production.models.output.edi;

/**
 * EDI文件配置
 * @author RexSheng
 * 2019年10月22日 下午5:45:39
 */
public class EdiFileDetailOutput {

	private Integer fileId;
	
	private String fileFormat;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	
	
}
