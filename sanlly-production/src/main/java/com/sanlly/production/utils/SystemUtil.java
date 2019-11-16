package com.sanlly.production.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

@Component
public class SystemUtil {
	public static void main(String[] args){
		try {
			initTemplates();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 判断当前服务器是否是windows操作系统
	 * @return true:windows系统，false:其他操作系统
	 */
	public static Boolean isWindows(){
		String os = System.getProperty("os.name"); 
		return os.toLowerCase().startsWith("win");
	}
	
	public static List<String> getTemplateNames(String folderPath,String extension){
		return getTemplateNames(new File(folderPath),extension,false);
	}
	
	public static List<String> getTemplateNames(File folder,String extension,Boolean deep){
		File[] tempFiles=folder.listFiles();
		List<String> result=new ArrayList<String>();
		for(File file:tempFiles){
			if(file.isFile()){
				if(file.getName().endsWith(extension)){
					result.add(file.getName().substring(0, file.getName().lastIndexOf(extension)));
				}
			}
			else if(deep && file.isDirectory()){
				if(file.listFiles().length>0){
					result.addAll(getTemplateNames(file,extension,true));
				}
			}
		}
		return result;
	}
	
	public static List<String> getEdiTemplate(String folderPath){
		List<String> result=new ArrayList<String>();
		
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources;
		try {
			resources = resolver.getResources(folderPath+"/*");
			for (int i = 0; i < resources.length; i++) {
				Resource resource = resources[i];
				// 以jar运行时，resource.getFile().isFile()
				try {
	                //以jar运行时，resource.getFile().isFile() 无法获取文件类型，会报异常，抓取异常后直接生成新的文件即可；以非jar运行时，需要判断文件类型，避免如果是目录会复制错误，将目录写成文件。
					if(resource.getFile().isFile()) {
	                	if(StringUtils.isNotEmpty(resource.getFilename())){
	                		result.add(resource.getFilename());
	                	}
	                }
	            }catch (Exception e) {
	            	if(StringUtils.isNotEmpty(resource.getFilename())){
	            		result.add(resource.getFilename());
	            	}
	            }
				
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return result;
	}
	
	public static InputStream getEdiResource(String filePath){
		
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource  resource;
		try {
			resource= resolver.getResource(filePath);
			 return resource.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	
	
	public static void initTemplates() throws IOException{
		initDirectory("**","templates");
	}
	
	private static void initDirectory(String orgDir,String tagDir) throws IOException {
		File f=new File(tagDir);
		if(!f.exists()){
			f.mkdirs();
		}
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources("templates/"+orgDir+"/*");
		for (int i = 0; i < resources.length; i++) {
			Resource resource = resources[i];
			// 以jar运行时，resource.getFile().isFile()
			try {
                //以jar运行时，resource.getFile().isFile() 无法获取文件类型，会报异常，抓取异常后直接生成新的文件即可；以非jar运行时，需要判断文件类型，避免如果是目录会复制错误，将目录写成文件。
				if(resource.getFile().isFile()) {
                	if(StringUtils.isNotEmpty(resource.getFilename())){
	                    makeFile(tagDir+"/"+resource.getFilename());
	                    InputStream stream = resource.getInputStream();
	                    write2File(stream, tagDir+"/"+resource.getFilename()); 
                	}
                }
            }catch (Exception e) {
            	if(StringUtils.isNotEmpty(resource.getFilename())){
            		makeFile(tagDir+"/"+resource.getFilename());
                    InputStream stream = resource.getInputStream();
                    write2File(stream, tagDir+"/"+resource.getFilename()); 
            	}
            }
			
		}
	}
	
	 public static boolean makeFile(String path) {  
	        File file = new File(path);  
	        if(file.exists()) {   
	            return false;  
	        }  
	        if (path.endsWith(File.separator)) {   
	            return false;  
	        }  
	        if(!file.getParentFile().exists()) {   
	            if(!file.getParentFile().mkdirs()) { 
	                return false;  
	            }  
	        }  
	        try {  
	            if (file.createNewFile()) {   
	                return true;  
	            } else {   
	                return false;  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	            return false;  
	        }  
	    }
	 public static void write2File(InputStream is, String filePath) throws IOException {
		 System.out.println(filePath);
	        OutputStream os = new FileOutputStream(filePath);
	        int len = 8192;
	        byte[] buffer = new byte[len];
	        while ((len = is.read(buffer, 0, len)) != -1) {
	            os.write(buffer, 0, len);
	        }
	        os.close();
	        is.close();
	    }
}
