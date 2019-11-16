package com.sanlly.production.controller;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.models.input.pti.PtiAddInput;
import com.sanlly.production.models.input.unitTesting.AuditUnitInput;
import com.sanlly.production.models.input.unitTesting.PreFixSearchInput;
import com.sanlly.production.models.input.unitTesting.SetUnitStateInput;
import com.sanlly.production.models.input.unitTesting.UnitTestingSearchInput;
import com.sanlly.production.models.input.unitTesting.UpdateUnitZoneInput;
import com.sanlly.production.models.output.pti.PtiDetailOutput;
import com.sanlly.production.models.output.unitTesting.SetUnitStateOutput;
import com.sanlly.production.service.AuditService;
import com.sanlly.production.service.PtiService;
import com.sanlly.production.service.PtiTypeService;
import com.sanlly.production.service.UnitTestingService;
import com.sanlly.production.utils.ITextPdfUtil;

import cn.hutool.core.lang.UUID;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 机组检验管理
 * @author RexSheng
 * 2019年8月14日 下午7:26:17
 */
@RestController
public class UnitTestingController extends BaseController{

	@Autowired
	private UnitTestingService unitService;
	
	@Autowired
	private PtiTypeService ptiTypeService;
	
	@Autowired
	private PtiService ptiService;
	
	@Autowired
	private AuditService auditService;
	
	@Autowired
	private Configuration cfg;
	
	@Value("${spring.pdf.location}")
	private String rootPath;
	
	/**
	 * 机组检验列表
	 * @param startDate 开始日期
	 * @param endDate 结束日期
	 * @param yard 场站
	 * @param containerNo 箱号
	 * @param containerUser 用箱人
	 * @param courseType 进场类别
	 * @param zone 区位
	 * @param unitState 机组状态
	 * @param testingState 检验状态
	 * @param index 查询的页码
	 * @param size 每页大小
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unit")
	public Result getUnitList(
			@RequestParam(required = false) String startDate,
			@RequestParam(required = false) String endDate,
			@RequestParam(required = false) String yard,
			@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String courseType,
			@RequestParam(required = false) String zone,
			@RequestParam(required = false) Boolean preZone,
			@RequestParam(required = false) String[] unitState,
			@RequestParam(required = false) String[] testingState,
			@RequestParam(required = false) String isSurrender,
			@RequestParam(required = false) String containerOwner,
			@RequestParam(required = true) Integer index,
			@RequestParam(required = true) Integer size) throws Exception {
		UnitTestingSearchInput input=new UnitTestingSearchInput();
		input.setStartDate(startDate);
		input.setEndDate(endDate);
		input.setYard(yard);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setZone(zone);
		input.setPreZone(preZone);
		input.setUnitState(unitState);
		input.setTestingState(testingState);
		input.setIsSurrender(isSurrender);
		input.setContainerOwner(containerOwner);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(unitService.getPageList(input));
	}
	
	/**
	 * 批量设置好机组
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/unit/good")
	public Result setUnitStateGood(@RequestBody SetUnitStateInput input) {
		SetUnitStateOutput output=unitService.setUnitStateGood(input);
		if(output.getCourseId() != null && output.getCourseId().length > 0) {
			for (String courseId : output.getCourseId()) {
				//田战领Revision7515
				auditService.auditAutomatic(courseId, false);
			}
		}
		return Result.Success(output);
	}
	
	/**
	 * 批量设置坏机组
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/unit/bad")
	public Result setUnitStateBad(@RequestBody SetUnitStateInput input) {
		return Result.Success(unitService.setUnitStateBad(input));
	}
	
	/**
	 * 批量提交
	 * @param input
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/unit/submit")
	public Result submitUnitTesting(@RequestBody SetUnitStateInput input) throws Exception {
//		SetContainerStateInput scsInput = new SetContainerStateInput();
//		scsInput.setContainerState(TestingStateEnum.TESTING.getCode());
//		scsInput.setProdCourseIdList(input.getProdCourseIdList());
//		List<String> prodCourseIds = unitService.selectCourseByTestingState(scsInput);
//		input.setProdCourseIdList(prodCourseIds.toArray(new String[prodCourseIds.size()]));
		SetUnitStateOutput output=(unitService.submitUnitTesting(input));
		if(output.getCourseId() != null && output.getCourseId().length > 0) {
			String message = "";
			for (String courseId : output.getCourseId()) {
				try {
					auditService.auditAutomatic(courseId, true);
				} catch (Exception e) {
					message += courseId + ":" + e.getMessage() + ";";
				}
			}
			if(StringUtils.isNotEmpty(message)) {
				output.setErrorMessage(message);
			}
		}
		return Result.Success(output);
	}
	
	/**
	 * 批量审核
	 * @param input
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/unit/audit")
	public Result approveUnitTesting(@RequestBody AuditUnitInput input) throws Exception {
//		SetContainerStateInput scsInput = new SetContainerStateInput();
//		scsInput.setContainerState(TestingStateEnum.UNAUDIT.getCode());
//		scsInput.setProdCourseIdList(input.getProdCourseIdList());
//		List<String> prodCourseIds = unitService.selectCourseByTestingState(scsInput);
//		input.setProdCourseIdList(prodCourseIds.toArray(new String[prodCourseIds.size()]));
		unitService.approveUnitTesting(input);
		SetUnitStateOutput output=new SetUnitStateOutput();
		if(input.getAuditType() != null && TestingStateEnum.AUDITED.getCode().equals(input.getAuditType()) && input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			List<String> courseList = new ArrayList<String>();
			String message = "";
			for (String courseId : input.getProdCourseIdList()) {
				try {
					auditService.AddEvaluationEntry(courseId, true, false);
					auditService.referralAutomatic(courseId, true);
				}catch (Exception e) {
					courseList.add(courseId);
					message += courseId + ":" + e.getMessage() + ";";
				}
			}
			if (courseList.size() > 0) {
				SetContainerStateInput scsInput = new SetContainerStateInput();
				scsInput.setProdCourseIdList(courseList.toArray(new String[courseList.size()]));
				unitService.remarkAsUnAudit(scsInput);
				output.setErrorMessage(message);
			}
		}
		return Result.Success(output);
	}
	
	/**
	 * 批量修改区位
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/unit/zone")
	public Result updateZone(@RequestBody UpdateUnitZoneInput input) {
		unitService.updateZone(input);
		return Result.Success();
	}
	
	/**
	 * pti类型列表
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/pti")
	public Result ptiList() {
		return Result.Success(ptiTypeService.getList());
	}
	
	/**
	 * 获取机组基础信息
	 * @param prodCourseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unit/info")
	public Result getInfo(String prodCourseId) {
		return Result.Success(unitService.getUnitBasicInfo(prodCourseId));
	}
	
	/**
	 * 根据箱号获取机组基础信息
	 * @param prodCourseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/unit/no")
	public Result getInfoByContainerNo(String containerNo) {
		return Result.Success(unitService.getUnitBasicInfoByContainerNo(containerNo));
	}
	
	/**
	 * 根据进场获取pti
	 * @param prodCourseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/pti/{courseId}")
	public Result ptiDetail(@PathVariable("courseId") String prodCourseId) {
		return Result.Success(ptiService.getPtiInfoByCourseId(prodCourseId));
	}
	
	/**
	 * 修改pti信息
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/pti/update")
	public Result ptiUpdate(@RequestBody PtiAddInput input) {
		ptiService.updatePtiInfo(input);
		return Result.Success();
	}
	
	@GetMapping("/pti/export/{courseId}")
	public void exportPti(HttpServletRequest request,HttpServletResponse response,@PathVariable("courseId") String courseId) {
		PtiDetailOutput output=ptiService.getPtiInfoByCourseId(courseId);
		Writer out = new StringWriter();
        try {
            // 获取模板,并设置编码方式
            Template template = cfg.getTemplate("pti.ftl");
//            template.setEncoding("UTF­8");
            Object data=ptiService.lang(output);
            // 合并数据模型与模板
            template.process(data, out); //将合并后的数据和模板写入到流中，这里使用的字符流
            out.flush();
            String content=out.toString();
            System.out.println(content);
            File root=new File(rootPath);
            if(!root.exists()) {
            	root.mkdirs();
            }
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
            
            File file=new File(rootPath+sdf.format(new Date())+UUID.randomUUID().toString()+".pdf");
            ITextPdfUtil.createPdf(content, file.getAbsolutePath());
            download(request, response, file.getAbsolutePath(), "pti.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
	}
	
	/**
	 * 获取pti内容打印页面
	 * @param request
	 * @param response
	 * @param courseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/pti/html/{courseId}")
	public Result getPtiHtml(HttpServletRequest request,HttpServletResponse response,@PathVariable("courseId") String courseId) {
		PtiDetailOutput output=ptiService.getPtiInfoByCourseId(courseId);
		Writer out = new StringWriter();
		String content="";
        try {
            // 获取模板,并设置编码方式
            Template template = cfg.getTemplate("pti.ftl");
//            template.setEncoding("UTF­8");
            Object data=ptiService.lang(output);
            // 合并数据模型与模板
            template.process(data, out); //将合并后的数据和模板写入到流中，这里使用的字符流
            out.flush();
            content=out.toString();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		return Result.Success(content);
	}
	
	/**
	 * 根据进场id获取同一公司下的场站列表
	 * @param courseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/yard/course")
	public Result getCompanyYardList(@RequestParam(value="courseId",required = true) String courseId) {
		
		return Result.Success(unitService.getCompanyYardsByCourse(courseId));
	}
	
	/**
	 * 根据场站key获取必填字段列表
	 * @param courseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/yard/field")
	public Result getYardFieldList(@RequestParam(value="yardKey",required = true) String yardKey) {
		
		return Result.Success(unitService.getFieldListByYard(yardKey));
	}
	
	/**
	 * 先修列表
	 * @param zone 区位
	 * @param containerNo 箱号
	 * @param index 页码
	 * @param size 页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/xianxiu")
	public Result getXianxiuList(@RequestParam(value="zone",required = false) String zone,
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="index") Integer index,
			@RequestParam(value="size") Integer size) {
		PreFixSearchInput input=new PreFixSearchInput();
		input.setZone(zone);
		input.setContainerNo(containerNo);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(unitService.getPreFixPagedList(input));
	}
	
	/**
	 *   删除没有条目的机组进场
	 * @param courseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/unit/delete")
	public Result unitDeLete(String courseId) throws Exception{
		unitService.unitDeLete(courseId);
		return Result.Success();
	}

	/**
	 * 适用机型
	 * @param code
	 * @return
	 */
	@GetMapping("/unit/getUnitToWare")
	public Result<List<String>> getUnitToWare(@RequestParam(value = "code") String code){
		return Result.Success(unitService.getUnitToWare(code));
	}
	
	/**
	 *  机组列表标为不做PTI
	 * @param courseId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/unit/pti/not")
	public Result unitPtiNot(@RequestParam(value="courseIds") String[] courseIds) throws Exception{
		unitService.remarkNotPti(courseIds);
		return Result.Success();
	}
}
