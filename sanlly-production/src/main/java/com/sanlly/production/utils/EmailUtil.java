package com.sanlly.production.utils;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;


/**
 * 使用SMTP协议发送电子邮件
 */
public class EmailUtil {
	
	public static void main(String[] args) throws Exception {
		EmailUtil util=new EmailUtil("smtp","smtp.126.com",25);
		util.setFrom("shengxupeng@126.com").setTo("shengxp@sarnath.cn")
		.setAuth("shengxupeng", "sxp900315")
		.addFile("a.html", new File("f:\\bookmarks_2019_9_12.html"))
		.sendText("使用POP3协议发送文本邮件测试!!!", "title标题");
		util.setFrom("shengxupeng@126.com").setTo("shengxp@sarnath.cn")
		.setAuth("shengxupeng", "sxp900315")
		.addFile("b.docx", new File("d:\\权限管理.docx"))
		.addFile("c.doc", new File("d:\\用户需求说明书-仓储管理 V1.0.doc"))
		.sendHtml("<span style='color:red;'>html邮件测试...协议发送文本邮件测试!!!</span>","标题");
		System.err.println("发送成功");
	}
	
	private String protocol;
	
	private String host;
	
	private Integer port;
	
	private Boolean isAuth;
	
	private String fromUser;
	
	private String toUser;
	
	private String authUser;
	
	private String authPassword;
	
	private Multipart multiPart;
	
	private Boolean isDebug;
	 
	/**
	 * 
	 * @param protocol 邮件发送协议
	 * @param host SMTP邮件服务器
	 * @param port SMTP邮件服务器默认端口25
	 */
	public EmailUtil(String protocol,String host,Integer port) {
		this.protocol=protocol;
		this.host=host;
		this.port=port;
		this.isAuth=false;
		this.isDebug=false;
		this.multiPart=new MimeMultipart();
	}
	
	public EmailUtil setFrom(String from) {
		this.fromUser=from;
		return this;
	}
	
	public EmailUtil setTo(String to) {
		this.toUser=to;
		return this;
	}
	
	public EmailUtil setAuth(String user,String password) {
		this.isAuth=true;
		this.authUser=user;
		this.authPassword=password;
		return this;
	}
	
	public EmailUtil setDebug(Boolean isDebug) {
		this.isDebug=isDebug;
		return this;
	}
	
	public EmailUtil addFile(String fileName,File file) throws Exception {
		MimeBodyPart attach = new MimeBodyPart(); 
		DataSource ds = new FileDataSource(file);
		attach.setDataHandler(new DataHandler(ds));
		attach.setFileName(MimeUtility.encodeText(fileName,"utf-8",null));
		multiPart.addBodyPart(attach);
		return this;
	}
	
	
	public Boolean sendText(String content,String subject) throws Exception{
		return send(content,subject,false);
	}
	
	public Boolean sendHtml(String content,String subject) throws Exception{

		return send(content,subject,true);
	}
	
	public Boolean send(String content,String subject,Boolean isHtml) throws Exception{
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", protocol);
		props.setProperty("mail.smtp.host", host);
		props.setProperty("mail.smtp.port", String.valueOf(port));
		props.setProperty("mail.smtp.auth", isAuth?"true":"false");
		props.setProperty("mail.debug", isDebug?"true":"false");
		Session session = isAuth?Session.getInstance(props,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(authUser,authPassword);
			}
		}):Session.getDefaultInstance(props);
		// 创建MimeMessage实例对象
		MimeMessage message = new MimeMessage(session);
		// 设置发件人
		message.setFrom(new InternetAddress(fromUser));
		// 设置邮件主题
		if(subject!=null && subject!="") {
			message.setSubject(subject);
		}
		// 设置收件人
		message.setRecipient(RecipientType.TO, new InternetAddress(toUser));
		//文本内容
		BodyPart contentPart = new MimeBodyPart();
		if(isHtml!=null && isHtml.equals(true)) {
			contentPart.setContent(content, "text/html;charset=UTF-8");
		}
		else {
			// 设置纯文本内容为邮件正文
			contentPart.setText(content);
		}
		multiPart.addBodyPart(contentPart);
		
		message.setContent(multiPart);
		// 保存并生成最终的邮件内容
		message.saveChanges();
//		Transport.send(message);
		// 获得Transport实例对象
		Transport transport = session.getTransport();
		// 打开连接
		transport.connect();
		// 将message对象传递给transport对象，将邮件发送出去
		transport.sendMessage(message, message.getAllRecipients());
		// 关闭连接
		transport.close();
		return true;
	}

 
}