package com.sanlly.production.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.input.file.FileUploadInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.file.HttpRequestFile;
import com.sanlly.production.utils.HttpRequestFileUtil;

/**
 * 文件上传控制器
 * @author 生旭鹏
 *
 */
@RestController
public class FileUploadController extends BaseController {
	private Log log=LogFactory.getLog(this.getClass());
	
	/**
	 * 文件上传
	 * @param request
	 * @param input 用户页面输入，不需要加@RequestBody
	 * @return
	 */
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public Result<List<HttpRequestFile>> uploadFile(HttpServletRequest request,FileUploadInput input){
		List<HttpRequestFile> fileList=super.upload(request, input);
		for(HttpRequestFile file:fileList){
			String prefix = file.getFileName().substring(file.getFileName().lastIndexOf(".") + 1);
			String newFileName=UUID.randomUUID()+"."+prefix;
			String path="upload";
			Boolean success=HttpRequestFileUtil.saveStreamToFile(file.getFileStream(), path, newFileName);
			log.info(success+"接收文件:"+file.getFileName());
			file.setFilePath(path);
			file.setFileNewName(newFileName);
			file.setFileStream(null);
		}
		return new Result<List<HttpRequestFile>>(fileList);
	}
}
