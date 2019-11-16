package com.sanlly.production.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.production.utils.QrCodeUtils;

@RestController
public class QRCodeController {
	/**
	 * 二维码  前台使用说明：<img  src="/prod/qrcode?content=http://xxxx?id=xx" />
	 * @param request
	 * @param response
	 */
	@RequestMapping("/qrcode")
	public void qrcode( String content,HttpServletRequest request, HttpServletResponse response) {
	    StringBuffer url = request.getRequestURL();
	    // 域名
//	    String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/").toString();

	    // 再加上请求链接
	    String requestUrl = content;
	    try {
	        OutputStream os = response.getOutputStream();
	        //加logo二维码
//	        QrCodeUtils.encode(requestUrl, "/static/images/logo.png", os, true);
	        QrCodeUtils.encode(requestUrl, os);//不加logo二维码
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
