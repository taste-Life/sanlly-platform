package com.sanlly.production.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.sanlly.common.models.input.file.FileUploadInput;
import com.sanlly.common.models.output.file.HttpRequestFile;
import com.sanlly.production.utils.HttpRequestFileUtil;

@Controller
public class BaseController {
	
	/**
	 * 文件上传
	 * 
	 * @param request
	 * @param input
	 * @return
	 */
	protected List<HttpRequestFile> upload(HttpServletRequest request, FileUploadInput input) {
		List<HttpRequestFile> fileList = HttpRequestFileUtil.getUploadStream(request);
		return fileList;
	}

	/**
	 * 文件下载
	 * 
	 * @param request
	 * @param response
	 * @param filename
	 *            要下载的文件名称
	 */
	protected void download(HttpServletRequest request, HttpServletResponse response, String fileFullPath,
			String filename) {
		HttpRequestFileUtil.downLoadFile(response, fileFullPath, filename);
	}
	
}
