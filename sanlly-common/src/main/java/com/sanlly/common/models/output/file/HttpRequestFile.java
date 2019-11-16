package com.sanlly.common.models.output.file;

import java.io.InputStream;

/**
 * 文件上传请求
 * @author RexSheng
 * 2019年8月16日 下午1:10:25
 */
public class HttpRequestFile {
	private String fileName;
	
	private InputStream fileStream;
	
	private Long fileSize;
	
	private String fileType;
	
	private String filePath;
	
	private String fileNewName;
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getFileStream() {
		return fileStream;
	}

	public void setFileStream(InputStream fileStream) {
		this.fileStream = fileStream;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
 
	public String getFileNewName() {
		return fileNewName;
	}

	public void setFileNewName(String fileNewName) {
		this.fileNewName = fileNewName;
	}
}
