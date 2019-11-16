package com.sanlly.purchase.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {

	public static boolean sendMail(String mail, String text, String subject)
//	public static boolean sendMail(String mail, String text, String subject,String agreement,String server,String from,String code)
			throws AddressException, MessagingException {
		new Thread() {
			@Override
			public void run() {
				// 向目标邮箱发送默认密码123456
				Properties properties = new Properties();

				properties.put("mail.transport.protocol", "smtp");// 连接协议，即：邮件协议
				properties.put("mail.smtp.host", "smtp.exmail.qq.com");// 主机名
//				properties.put("mail.transport.protocol", agreement);// 连接协议，即：邮件协议
//				properties.put("mail.smtp.host", server);// 主机名
				properties.put("mail.smtp.port", 465);// 端口号
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
				properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
				// 得到回话对象
				Session session = Session.getInstance(properties);
				// 获取邮件对象
				Message message = new MimeMessage(session);
				// 设置发件人邮箱地址
				try {
					message.setFrom(new InternetAddress("jianglx@sarnath.cn"));
					// 设置收件人邮箱地址
					// String path = "987305644@qq.com";
					// message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new
					// InternetAddress(input.getMail())});
					message.setRecipients(Message.RecipientType.TO,
							new InternetAddress[] { new InternetAddress(mail) });
					// message.setRecipient(Message.RecipientType.TO, new
					// InternetAddress("xxx@qq.com"));//一个收件人
					// 设置邮件标题
					message.setSubject(subject);
					// 设置邮件内容
					// message.setText("账号激活成功请完善相关信息，账户初始账号为"+input.getPhone()+",初始密码为123456");
					message.setText(text);
					// 得到邮差对象
					Transport transport = session.getTransport();
					// 连接自己的邮箱账户
					transport.connect("jianglx@sarnath.cn", "4wPxLi6zS7p32wzo");// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码（你可以进入你的邮箱的设置里面查看）
					// 发送邮件
					transport.sendMessage(message, message.getAllRecipients());
					transport.close();

				} catch (AddressException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		return true;

	}
}
