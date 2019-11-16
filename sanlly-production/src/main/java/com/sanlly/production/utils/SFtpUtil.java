package com.sanlly.production.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SFtpUtil {
	
	public static void main(String[] args) throws Exception {
		SFtpUtil util=new SFtpUtil();
		util.getSetting().setSftpServer("192.168.0.233").setSftpPort(22).setLoginUser("root")
		.setLoginPassword("123456").setDefaultDirectory("/opt");
		util.upload("d:\\jdk1.8.0_112\\THIRDPARTYLICENSEREADME.txt", "test.txt");
		util.close();
	}

	protected SFtpSetting setting;
	
	private ChannelSftp channel;
	
	private Session  session;
	
	
	public SFtpUtil() {
		
	}
	
	public SFtpUtil(SFtpSetting setting) {
		this.setting=setting;
	}
	
	public void init() throws JSchException {
		if(channel==null) {
			JSch jsch = new JSch();
			// 根据用户名，主机ip，端口获取一个Session对象
	        session = jsch.getSession(setting.getLoginUser(), setting.getSftpServer(), setting.getSftpPort());
	        if (setting.getLoginPassword() != null) {
	            // 设置密码
	            session.setPassword(setting.getLoginPassword());
	        }
	        Properties configTemp = new Properties();
	        configTemp.put("StrictHostKeyChecking", "no");
	        // 为Session对象设置properties
	        session.setConfig(configTemp);
	        // 设置timeout时间
	        session.setTimeout(60000);
	        session.connect();
	        // 通过Session建立链接
	        // 打开SFTP通道
	        channel = (ChannelSftp) session.openChannel("sftp");
	        // 建立SFTP通道的连接
	        channel.connect();
		}
	}
	
	public void changeDirectory(String directory) throws Exception {
		init();
		channel.cd(directory);
	}
	
	public void upload(String localFile,String remoteFile) throws Exception {
		upload(localFile,remoteFile,true);
	}
	
	public void upload(String localFile,String remoteFile,Boolean override) throws Exception {
		init();
		channel.put(localFile,remoteFile,override?ChannelSftp.OVERWRITE:ChannelSftp.RESUME);
		channel.quit();
	}
	
	public void upload(FileInputStream file,String remoteFile,Boolean override) throws Exception {
		init();
		channel.put(file,remoteFile,override?ChannelSftp.OVERWRITE:ChannelSftp.RESUME);
		channel.quit();
	}
	
	public void download(String remoteFile,String localFile) throws Exception {
		init();
		channel.get(remoteFile, localFile);
		channel.quit();
	}
	
	public InputStream download(String remoteFile) throws Exception {
		init();
		InputStream is=channel.get(remoteFile);
		channel.quit();
		return is;
	}
	
	public void close() {
		if(channel!=null) {
			channel.disconnect();
		}
		if(session!=null) {
			session.disconnect();
		}
	}
	
	public SFtpSetting getSetting() {
		if(setting==null) {
			setting=new SFtpSetting();
		}
		return setting;
	}
	
	public static class SFtpSetting{
		private String sftpServer;
		
		private Integer sftpPort;
		
		private String loginUser;
		
		private String loginPassword;
		
		private String defaultDirectory;

		public String getSftpServer() {
			return sftpServer;
		}

		public SFtpSetting setSftpServer(String sftpServer) {
			this.sftpServer = sftpServer;
			return this;
		}

		public Integer getSftpPort() {
			return sftpPort;
		}

		public SFtpSetting setSftpPort(Integer sftpPort) {
			this.sftpPort = sftpPort;
			return this;
		}

		public String getLoginUser() {
			return loginUser;
		}

		public SFtpSetting setLoginUser(String loginUser) {
			this.loginUser = loginUser;
			return this;
		}

		public String getLoginPassword() {
			return loginPassword;
		}

		public SFtpSetting setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
			return this;
		}

		public String getDefaultDirectory() {
			return defaultDirectory;
		}

		public SFtpSetting setDefaultDirectory(String defaultDirectory) {
			this.defaultDirectory = defaultDirectory;
			return this;
		}
		
	}
}
