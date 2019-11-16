package com.sanlly.production.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.obs.services.ObsClient;
import com.obs.services.exception.ObsException;
import com.obs.services.model.AccessControlList;
import com.obs.services.model.PutObjectResult;
import com.sanlly.production.service.ObsService;

@Service
public class ObsServiceImpl implements ObsService {
	

	@Override
	public String uploadFile(String fileName) {
		
		ObsClient obsClient = null; 
		try
		{
			String endPoint = "https://obs.cn-north-1.myhuaweicloud.com";
			String ak = "JU5N1XTZ7PCBHCVJ695N";
			String sk = "BdU5sJUdKmN3az0MGwKNJogViWx3WRCAkc9Nytvk";
			String bucketname = "sanlly-2019-test-obs";
			
		    obsClient = new ObsClient(ak, sk, endPoint);
		    File file = new File(fileName);
		    String objectname = file.getName();
		    FileInputStream fis = new FileInputStream(file);
		    PutObjectResult result = obsClient.putObject(bucketname, objectname, fis); 
		    
		    // 可选：调用成功后，记录调用成功的HTTP状态码和服务端请求ID
		    System.out.println(result.getStatusCode());
		    System.out.println(result.getRequestId());
		    System.out.println(result.getObjectUrl());
		    String url = endPoint + "/" +bucketname + "/" +objectname;
		    System.err.println(url);
		    return url;
		}
		catch (ObsException e)
		{
		    // 推荐：发生异常后，记录失败的HTTP状态码、服务端错误码、服务端请求ID等
		    System.out.println("HTTP Code: " + e.getResponseCode());
		    System.out.println("Error Code:" + e.getErrorCode());
		    System.out.println("Request ID:" + e.getErrorRequestId());
		    // 推荐：发生异常后，记录异常堆栈信息
		    e.printStackTrace(System.out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 关闭obsClient
			try {
				obsClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub
		return null;
	}
	
public void deleteFile(String url) {
		if(url != null) {
			ObsClient obsClient = null; 
			try
			{
				String endPoint = "https://obs.cn-north-1.myhuaweicloud.com";
				String ak = "JU5N1XTZ7PCBHCVJ695N";
				String sk = "BdU5sJUdKmN3az0MGwKNJogViWx3WRCAkc9Nytvk";
				String bucketname = "sanlly-2019-test-obs";
			    obsClient = new ObsClient(ak, sk, endPoint);
			    String objectname = url.substring(url.lastIndexOf('/') + 1, url.length());
			    obsClient.deleteObject(bucketname, objectname);

			}
			catch (ObsException e)
			{
			    // 推荐：发生异常后，记录失败的HTTP状态码、服务端错误码、服务端请求ID等
			    System.out.println("HTTP Code: " + e.getResponseCode());
			    System.out.println("Error Code:" + e.getErrorCode());
			    System.out.println("Request ID:" + e.getErrorRequestId());
			    // 推荐：发生异常后，记录异常堆栈信息
			    e.printStackTrace(System.out);
			} finally {
				// 关闭obsClient
				try {
					obsClient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
}
