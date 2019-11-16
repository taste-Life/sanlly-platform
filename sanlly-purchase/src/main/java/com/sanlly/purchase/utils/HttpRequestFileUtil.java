package com.sanlly.purchase.utils;

import com.sanlly.common.models.output.file.HttpRequestFile;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HttpRequestFileUtil {
	/**
	 * 获取request中上传的文件流
	 * @param request 请求
	 * @return
	 */
	public static List<HttpRequestFile> getUploadStream(HttpServletRequest request) {
		List<HttpRequestFile> output=new ArrayList<HttpRequestFile>();
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator<String> iter = multiRequest.getFileNames();
			try {
				while (iter.hasNext()) {
					HttpRequestFile fileInfo=new HttpRequestFile();
					// 一次遍历所有文件
					MultipartFile file = multiRequest.getFile(iter.next());
 
					fileInfo.setFileName(file.getOriginalFilename());
					fileInfo.setFileStream(file.getInputStream());
					fileInfo.setFileSize(file.getSize());
					fileInfo.setFileType(file.getName());
					output.add(fileInfo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		return output;
	}
	
	/**
	 * 将文件流保存到指定目录的文件中
	 * @param stream 文件流
	 * @param folder 新文件的目录，如果不存在，会自动创建
	 * @param fileName 新文件的文件名，新文件的全路径为 folder+"/"+fileName
	 * @return
	 */
	public static Boolean saveStreamToFile(InputStream stream,String folder,String fileName) {
		FileOutputStream out = null;
		try {
			File dirFile = new File(folder);
			// 判断文件目录是否存在
			if (!dirFile.exists()) {
				// 不存在则创建
				dirFile.mkdirs();
			}
			// 生成新的文件
			File mfile = new File(folder + "/" + fileName);
			// 输出流
			out = new FileOutputStream(mfile);
			// 写入
			byte[] buffer = new byte[8 * 1024];
		    int bytesRead;
		    while ((bytesRead = stream.read(buffer)) != -1) {
		    	out.write(buffer, 0, bytesRead);
		    }
		    return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		finally {
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 将指定文件放入到reponse响应中，返回指定的文件名称供前台下载
	 * @param response 响应
	 * @param path 欲下载的文件路径（具体到文件名）
	 * @param fileName 前台下载显示的文件名称
	 */
	public static void downLoadFile(HttpServletResponse response, String path,String fileName) {
		try {
			// 读到流中
			FileInputStream inStream = new FileInputStream(path);// 文件的存放路径
			// 设置输出的格式
//			response.reset();
			// 新增的

			response.setCharacterEncoding("utf-8");
			response.setContentType("application/x-msdownload");
			//response.setContentType("application/octet-stream");
			response.setContentLength((int)inStream.getChannel().size());
			 
			fileName = URLEncoder.encode(fileName, "UTF-8");
			response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
//			response.addHeader("Access-Control-Allow-Origin", "*");
			
			// 循环取出流中的数据
			byte[] b = new byte[1024];
			int len;
			OutputStream out = response.getOutputStream();
			while ((len = inStream.read(b)) > 0)
				out.write(b, 0, len);
			inStream.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private static byte[] streamToByte(InputStream stream) throws Exception{
		byte[] bte = new byte[stream.available()];
		stream.read(bte);
		return bte;
	}
}