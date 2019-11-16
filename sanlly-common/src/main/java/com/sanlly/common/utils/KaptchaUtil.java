package com.sanlly.common.utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Random;
import java.util.Base64.Encoder;

import javax.imageio.ImageIO;

public class KaptchaUtil {
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 4; i++) {
			print();
		}
	}

	public static void print() throws IOException {
		BufferedImage image = createImageCode("AbC9", 100, 36);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ImageIO.write(image, "png", outputStream);
		// 对字节数组Base64编码
		Encoder encoder = Base64.getEncoder();
		System.out.println(encoder.encodeToString(outputStream.toByteArray()));
	}

	public static BufferedImage createImageCode(String code, int width, int height) {
		if (width <= 0)
			width = 60;
		if (height <= 0)
			height = 20;
		String[] fonts = "宋体,楷体,微软雅黑,Times New Roman".split(",");
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 获取图形上下文
		Graphics g = image.getGraphics();
		// 生成随机类
		Random random = new Random();
		// 设定背景色
		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);
		// 设定字体
		String fontName = fonts[random.nextInt(fonts.length)];
		Font font=new Font(fontName, Font.PLAIN, 25);
		AffineTransform affineTransform = new AffineTransform();
		
		g.setColor(getRandColor(160, 200));
		Graphics2D g2 = (Graphics2D)g;
		//消除锯齿
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
		// 随机产生30条干扰线，使图象中的认证码不易被其它程序探测到
		for (int i = 0; i < 30; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(width);
			int yl = random.nextInt(height);
			g2.setStroke(new BasicStroke(2*random.nextFloat(), BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
			g.drawLine(x, y, xl, yl);
		}
		// 添加噪点
		float yawpRate = 0.05f;// 噪声率
		int area = (int) (yawpRate * width * height);
		for (int i = 0; i < area; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int rgb = getRandomIntColor();
			image.setRGB(x, y, rgb);
		}
		// 取随机产生的码
		String strEnsure = "";
		// 4代表4位验证码,如果要生成更多位的认证码,则加大数值
		String[] codes = code.split("");
		for (int i = 0; i < codes.length; ++i) {
			strEnsure += codes[i];
			// 将认证码显示到图象中
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			// 直接生成
			String str = strEnsure.substring(i, i + 1);
			affineTransform.rotate(Math.toRadians(30-random.nextInt(30)*2));
			Font rotatedFont = font.deriveFont(affineTransform);
			g.setFont(rotatedFont);
			// 设置随便码在背景图图片上的位置
			g.drawString(str, 20 * i + 13, 25);
		}
		// 释放图形上下文
		g.dispose();
		return image;
	}

	// 给定范围获得随机颜色
	private static Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	private static int getRandomIntColor() {
		int[] rgb = getRandomRgb();
		int color = 0;
		for (int c : rgb) {
			color = color << 8;
			color = color | c;
		}
		return color;
	}

	private static int[] getRandomRgb() {
		Random random = new Random();
		int[] rgb = new int[3];
		for (int i = 0; i < 3; i++) {
			rgb[i] = random.nextInt(255);
		}
		return rgb;
	}
}
