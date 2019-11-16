package com.sanlly.auth.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.imageio.ImageIO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.models.output.user.KaptchaOutput;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.utils.KaptchaUtil;
import com.sanlly.common.utils.RandomUtil;

/**
 * 验证码相关
 * @author RexSheng
 * 2019年8月16日 下午1:16:29
 */
@RestController
public class KaptchaController {
//	@Autowired
//	private DefaultKaptcha producer;
	
	/**
	 * 验证码获取
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/kaptcha")
	public Result createKaptcha() throws IOException{
		String token=RandomUtil.createRandomKaptcha(PlatformConstants.KAPTCHA_LENGTH);
		BufferedImage image = KaptchaUtil.createImageCode(token,100,36);
		 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
     // 对字节数组Base64编码
        Encoder encoder = Base64.getEncoder();
        try {
        	ImageIO.write(image, "png", outputStream);
        	KaptchaOutput output=new KaptchaOutput(token,encoder.encodeToString(outputStream.toByteArray()));
    		return Result.Success(output);
        } catch (IOException e) {
        	return Result.Error(null);
        }   finally {
            if (outputStream != null) {
            	outputStream.flush();
            	outputStream.close();
            }
        }
        
//        ByteArrayOutputStream outputStream = null;
//        BufferedImage image = producer.createImage(token);
// 
//        outputStream = new ByteArrayOutputStream();
//        ImageIO.write(image, "jpg", outputStream);
//     // 对字节数组Base64编码
//        Encoder encoder = Base64.getEncoder();
//        KaptchaOutput output=new KaptchaOutput(token,encoder.encodeToString(outputStream.toByteArray()));
//		return Result.Success(output);
	}
}
