package com.sanlly.production.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import sun.net.ftp.FtpClient;
import sun.net.ftp.FtpProtocolException;

@SuppressWarnings("restriction")
public class FtpUtil {
	
	public static void main(String[] args) throws Exception {
		FtpUtil ftpClient=new FtpUtil();
		FtpUtil.FtpSetting ftpSetting=ftpClient.getSetting();
		ftpSetting.setFtpServer("192.168.0.242").setFtpPort(21)
		.setLoginUser("demo1").setLoginPassword("Demo1111");
		ftpClient
		.changeDirectory("{home}/pub")
		.upload(new File("D://{EDI类型}_{年月日}.xls"), "xx.xls");
		ftpClient.close();
	}

	protected FtpSetting setting;
	
	protected FtpClient ftpClient;
	
	public FtpUtil() {
		
	}
	
	public FtpUtil(FtpSetting setting) {
		this.setting=setting;
	}
	
	
	public void init() throws Exception {
		if(ftpClient==null) {
			ftpClient=FtpClient.create();
	        SocketAddress addr = new InetSocketAddress(setting.getFtpServer(), setting.getFtpPort());
	        ftpClient.connect(addr);
	        ftpClient.login(setting.getLoginUser(), setting.getLoginPassword().toCharArray());
	        if(setting.getDefaultDirectory()!=null) {
	        	ftpClient.changeDirectory(setting.getDefaultDirectory());
	        }
		}
	}
	
	public FtpUtil changeDirectory(String directory) throws Exception {
		this.init();
		ftpClient.changeDirectory(directory);
		return this;
	}
	
	public Boolean upload(File file,String remoteFile) throws Exception{
		this.init();
		try (OutputStream os=ftpClient.putFileStream(remoteFile)){
			try(FileInputStream is=new FileInputStream(file)){
				byte[] bytes=new byte[1024];
				int c;
				while((c=is.read(bytes))!=-1) {
					os.write(bytes, 0, c);
				}
			}
			catch(Exception e) {
				throw e;
			}
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}
	
	public Boolean upload(FileInputStream file,String remoteFile) throws Exception{
		this.init();
		try (OutputStream os=ftpClient.putFileStream(remoteFile)){
			byte[] bytes=new byte[1024];
			int c;
			while((c=file.read(bytes))!=-1) {
				os.write(bytes, 0, c);
			}
			System.out.println("upload success");
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}
	
	public void download(String remoteFile,String localFile) {
		File file_in = new File(localFile);
        try(InputStream is = ftpClient.getFileStream(remoteFile);
            FileOutputStream os = new FileOutputStream(file_in)){
 
            byte[] bytes = new byte[1024];
            int c;
            while ((c = is.read(bytes)) != -1) {
                os.write(bytes, 0, c);
            }
            System.out.println("download success"+localFile);
        } catch (IOException ex) {
            System.out.println("not download");
            ex.printStackTrace();
        }catch (FtpProtocolException e) {
            e.printStackTrace();
        }
	}
	
	public InputStream download(String remoteFile) throws Exception {
		return ftpClient.getFileStream(remoteFile);
	}
	
	public void close() throws IOException {
		ftpClient.close();
		ftpClient=null;
	}
	
	public FtpSetting getSetting() {
		if(setting==null) {
			setting=new FtpSetting();
		}
		return setting;
	}
	
	public static class FtpSetting{
		private String ftpServer;
		
		private Integer ftpPort;
		
		private String loginUser;
		
		private String loginPassword;
		
		private String defaultDirectory;

		public String getFtpServer() {
			return ftpServer;
		}

		public FtpSetting setFtpServer(String ftpServer) {
			this.ftpServer = ftpServer;
			return this;
		}

		public Integer getFtpPort() {
			return ftpPort==null?21:ftpPort;
		}

		public FtpSetting setFtpPort(Integer ftpPort) {
			this.ftpPort = ftpPort;
			return this;
		}

		public String getLoginUser() {
			return loginUser;
		}

		public FtpSetting setLoginUser(String loginUser) {
			this.loginUser = loginUser;
			return this;
		}

		public String getLoginPassword() {
			return loginPassword;
		}

		public FtpSetting setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
			return this;
		}

		public String getDefaultDirectory() {
			return defaultDirectory;
		}

		public FtpSetting setDefaultDirectory(String defaultDirectory) {
			this.defaultDirectory = defaultDirectory;
			return this;
		}

		
		
	}
}
