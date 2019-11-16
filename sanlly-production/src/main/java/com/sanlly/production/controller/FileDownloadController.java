package com.sanlly.production.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 文件下载
 * @author 生旭鹏
 *
 */
@Controller
public class FileDownloadController extends BaseController{
	private Log log=LogFactory.getLog(this.getClass());
	
	@RequestMapping(value="/download",method=RequestMethod.GET)
	public void downloadFile(HttpServletRequest request,HttpServletResponse response,@RequestParam String file){
		log.info("请求下载"+file);
		String fileFullPath="upload/"+file;
		super.download(request, response,fileFullPath, file);
	}
	
	@RequestMapping(value="/download/edi",method=RequestMethod.GET)
	public void downloadEdiFile(HttpServletRequest request,HttpServletResponse response,@RequestParam String file,@RequestParam String path){
		log.info("请求下载"+file);
		super.download(request, response,path, file);
	}
}
