package com.sanlly.production.controller;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sanlly.production.utils.ITextPdfUtil;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Controller
public class PageController {

	@Autowired
	private Configuration cfg;
	
	@Value("${spring.pdf.location}")
	private String rootPath;
	
	
	@GetMapping("/freemarker")
	public String freemarker(Map<String ,Object> map) {
		map.put("name","张三");
		
		Writer out = new StringWriter();
        try {
            // 获取模板,并设置编码方式
            Template template = cfg.getTemplate("pti.ftl");
//            template.setEncoding("UTF­8");
            // 合并数据模型与模板
            template.process(map, out); //将合并后的数据和模板写入到流中，这里使用的字符流
            out.flush();
            String content=out.toString();
            System.out.println(content);
            File root=new File(rootPath);
            if(!root.exists()) {
            	root.mkdirs();
            }
            File file=new File(rootPath+"aa.pdf");
            ITextPdfUtil.createPdf(content, file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
		return "demo";
	}
	
	
}
