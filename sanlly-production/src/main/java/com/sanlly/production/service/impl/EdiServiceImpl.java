package com.sanlly.production.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.production.config.SpringContextUtil;
import com.sanlly.production.dao.AutomaticEdiPoolMapper;
import com.sanlly.production.dao.AutomaticSendMapper;
import com.sanlly.production.dao.CompanyCodeMapper;
import com.sanlly.production.dao.CompanyCustomerMapper;
import com.sanlly.production.dao.CompanyEdiTypeMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EdiEvaluationSerialMapper;
import com.sanlly.production.dao.EdiFileMapper;
import com.sanlly.production.dao.EdiPoolMapper;
import com.sanlly.production.dao.EdiTypeMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.AutomaticEdiPool;
import com.sanlly.production.entity.AutomaticEdiPoolExample;
import com.sanlly.production.entity.AutomaticSend;
import com.sanlly.production.entity.AutomaticSendExample;
import com.sanlly.production.entity.CompanyCode;
import com.sanlly.production.entity.CompanyCodeExample;
import com.sanlly.production.entity.CompanyCustomer;
import com.sanlly.production.entity.CompanyCustomerExample;
import com.sanlly.production.entity.CompanyEdiType;
import com.sanlly.production.entity.CompanyEdiTypeExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.EdiEvaluationSerial;
import com.sanlly.production.entity.EdiFile;
import com.sanlly.production.entity.EdiFileExample;
import com.sanlly.production.entity.EdiPool;
import com.sanlly.production.entity.EdiPoolExample;
import com.sanlly.production.entity.EdiType;
import com.sanlly.production.entity.EdiTypeExample;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.EdiImportTypeEnum;
import com.sanlly.production.enums.EdiSendStateEnum;
import com.sanlly.production.enums.EdiSendTypeEnum;
import com.sanlly.production.enums.RateCurrencyEnum;
import com.sanlly.production.models.input.edi.AddAutoPoolInput;
import com.sanlly.production.models.input.edi.AddAutoSendInput;
import com.sanlly.production.models.input.edi.AddEdiMessageInput;
import com.sanlly.production.models.input.edi.AddEdiMessageInput.EdiMessageInput;
import com.sanlly.production.models.input.edi.AddEdiPoolInput;
import com.sanlly.production.models.input.edi.AddEdiPoolInput.AddEditPoolDetail;
import com.sanlly.production.models.input.edi.AddEdiSearchInput;
import com.sanlly.production.models.input.edi.AutoIntoPoolSearchInput;
import com.sanlly.production.models.input.edi.AutoSendSearchInput;
import com.sanlly.production.models.input.edi.CompanyCodeSearchInput;
import com.sanlly.production.models.input.edi.CompanyContainerUserSearchInput;
import com.sanlly.production.models.input.edi.CompanyEdiSearchInput;
import com.sanlly.production.models.input.edi.EdiFileSearchInput;
import com.sanlly.production.models.input.edi.EdiPoolSearchInput;
import com.sanlly.production.models.input.edi.EdiTypeContainerUserInput;
import com.sanlly.production.models.input.edi.EditAutoPoolInput;
import com.sanlly.production.models.input.edi.EditAutoSendInput;
import com.sanlly.production.models.input.edi.EditEdiConfigInput;
import com.sanlly.production.models.input.edi.EditEdiPoolInput;
import com.sanlly.production.models.input.edi.GenerateEvaluationNoInput;
import com.sanlly.production.models.input.edi.GenerateEvaluationNoInput.GenerateEvaluationNoDetail;
import com.sanlly.production.models.input.edi.ImportEdiPoolInput;
import com.sanlly.production.models.input.edi.SendEdiInput;
import com.sanlly.production.models.output.edi.AddEdiResponseOutput;
import com.sanlly.production.models.output.edi.AutoIntoPoolDetailOutput;
import com.sanlly.production.models.output.edi.AutoIntoPoolOutput;
import com.sanlly.production.models.output.edi.AutoSendDetailOutput;
import com.sanlly.production.models.output.edi.AutoSendOutput;
import com.sanlly.production.models.output.edi.CompanyCodeOutput;
import com.sanlly.production.models.output.edi.CompanyContainerUserOutput;
import com.sanlly.production.models.output.edi.CompanyEdiConfigOutput;
import com.sanlly.production.models.output.edi.EdiEditInfoOutput;
import com.sanlly.production.models.output.edi.EdiFileDetailOutput;
import com.sanlly.production.models.output.edi.EdiPoolExportDetailOutput;
import com.sanlly.production.models.output.edi.EdiPoolOutput;
import com.sanlly.production.models.output.edi.EditCompanyEdiOutput;
import com.sanlly.production.models.output.edi.ExportEdiOutput;
import com.sanlly.production.models.output.pti.AddEdiPoolOutput;
import com.sanlly.production.service.EdiMessageService;
import com.sanlly.production.service.EdiService;
import com.sanlly.production.service.LangService;
import com.sanlly.production.utils.EmailUtil;
import com.sanlly.production.utils.ExcelUtil;
import com.sanlly.production.utils.FtpUtil;
import com.sanlly.production.utils.SystemUtil;

/**
 * edi接口实现
 * @author RexSheng
 * 2019年10月14日 下午1:33:14
 */
@Service
public class EdiServiceImpl extends BaseServiceImpl implements EdiService{

	@Autowired
	private EdiTypeMapper ediTypeDao;
	
	@Autowired
	private EdiPoolMapper ediPoolDao;
	
	@Autowired
	private CompanyEdiTypeMapper ediConfigDao;
	
	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	
	@Autowired
	private YardMapper yardDao;
	
	@Autowired
	private EdiEvaluationSerialMapper serialDao;
	
	@Autowired
	private EdiFileMapper ediFileDao;
	
	@Autowired
	private EvaluationEntryMapper evaluationEntryDao;
	
	@Autowired
	private CompanyCustomerMapper configDetailDao;
	
	@Autowired
	private AutomaticSendMapper autoSendDao;
	
	@Autowired
	private AutomaticEdiPoolMapper autoPoolDao;
	
	@Autowired
	private CompanyCustomerMapper companyCustomerDao;
	
	@Autowired
	private CompanyCodeMapper companyCodeDao;
	
	@Autowired
	private LangService langService;
	
	@Value("${spring.edi.template-loader-path}")
	private String ediTemplateLocation;
	
	/**
	 * edi池列表查询
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<EdiPoolOutput> getEdiPoolList(EdiPoolSearchInput input) {
		PagedList<EdiPoolOutput> pagedList=new PagedList<>(input.getPageIndex(),input.getPageSize());
		EdiPoolExample example=new EdiPoolExample();
		EdiPoolExample.Criteria criteria=example.createCriteria();
		//edi类型查询
		if(input.getEdiType()!=null && input.getEdiType().length>0) {
			criteria.andEdiTypeIn(Arrays.asList(input.getEdiType()));
		}
		if(StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		if(StringUtils.isNotEmpty(input.getEvaluationNo())) {
			criteria.andEvaluateNoLike("%"+input.getEvaluationNo()+"%");
		}
		if(input.getIsSend()!=null) {
			criteria.andStateEqualTo(input.getIsSend()?EdiSendStateEnum.sended.getCode():EdiSendStateEnum.unSend.getCode());
		}
		if(StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		int totalItemCount=(int)ediPoolDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<EdiPool> list=ediPoolDao.selectByExample(example);
		List<EdiPoolOutput> dataList=list.stream().map(a->{
			EdiPoolOutput item=new EdiPoolOutput();
			item.setPoolId(a.getProdEdiPoolId());
			item.setCourseId(a.getCourse());
			item.setContainerNo(a.getContainerNo());
			Course course=courseDao.selectByPrimaryKey(a.getCourse());
			if(course!=null) {
				item.setYardNameLang(course.getYard());
				item.setContainerUserNameLang(course.getContainerUser());
			}
			item.setEdiTypeKey(a.getEdiType());
			item.setEdiTypeNameLang(a.getEdiType());
			item.setEvaluationNo(a.getEvaluateNo());
			item.setExportNumber(a.getExportNumber());
			item.setContainerCategoryKey(a.getContainerCategory());
			item.setContainerCategoryNameLang(a.getContainerCategory());
			item.setState(a.getState());
			item.setStateNameLang(a.getState());
			item.setCwFee(a.getCwFee());
			item.setDppFee(a.getDppFee());
			//卖方客户代码
			item.setClientCode(a.getClientCode());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * edi池新增数据列表查询
	 * @param input
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<AddEdiResponseOutput> addEdiPoolSearchList(AddEdiSearchInput input) throws Exception {
		String sql1="SELECT c.prod_course_id as courseId,c.container_no as containerNo,c.yard as yardKey,c.yard as yardNameLang, " + 
				"c.container_user as containerUserKey,c.container_user as containerUserLang,c.container_owner as containerOwnerLang,c.course_type as courseTypeLang, " + 
				"c.container_category as containerCategory,c.container_category as containerCategoryNameLang, " + 
				"c.course_time as courseTime,c.audit_time as auditTime,null as unitAuditTime, " + 
				"c.finish_time as finishTime,null as unitFinishTime, " + 
				"c.use_reply_state as useReplyStateLang,null as unitUseReplyStateLang, " + 
				"c.create_time as createTime,c.valuation_no as evaluationNo,null as unitEvaluationNo " + 
				"From prod_course c " + 
				"where c.container_category='LECONTCATE01' " + 
				((input.getYard()!=null && input.getYard().length>0)?("and c.yard in ('"+String.join("','", input.getYard())+"')  "):"")+
				((input.getImportContainerNo()!=null && input.getImportContainerNo().length>0)?("and c.container_no in ('"+String.join("','", input.getImportContainerNo())+"')  "):"")+
				(StringUtils.isNotEmpty(input.getContainerNo())?("and c.container_no like '%"+input.getContainerNo().trim()+"%'  "):"")+
				(StringUtils.isNotEmpty(input.getContainerUser())?("and c.container_user='"+input.getContainerUser().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getContainerOwner())?("and c.container_owner='"+input.getContainerOwner().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getBeginCourseTime())?("and c.course_time>='"+input.getBeginCourseTime().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getEndCourseTime())?("and c.course_time<='"+input.getEndCourseTime().trim()+" 23:59:59'  "):"")+
				(StringUtils.isNotEmpty(input.getBeginAuditTime())?("and c.audit_time>='"+input.getBeginAuditTime().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getEndAuditTime())?("and c.audit_time<='"+input.getEndAuditTime().trim()+" 23:59:59'  "):"")+
				(StringUtils.isNotEmpty(input.getBeginFinishTime())?("and c.finish_time>='"+input.getBeginFinishTime().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getEndFinishTime())?("and c.finish_time<='"+input.getEndFinishTime().trim()+" 23:59:59'  "):"");
		String sql2=
				"SELECT c.prod_course_id as courseId,c.container_no as containerNo,c.yard as yardKey,c.yard as yardNameLang, " + 
				"c.container_user as containerUserKey,c.container_user as containerUserLang,c.container_owner as containerOwnerLang,c.course_type as courseTypeLang, " + 
				"'LECONTCATE05' as containerCategory,'LECONTCATE05' as containerCategoryNameLang, " + 
				"c.course_time as courseTime,c.audit_time as auditTime,u.audit_time as unitAuditTime, " + 
				"c.finish_time as finishTime,u.finish_time as unitFinishTime, " + 
				"c.use_reply_state as useReplyStateLang,u.use_reply_state as unitUseReplyStateLang, " + 
				"c.create_time as createTime,c.valuation_no as evaluationNo,u.valuation_no as unitEvaluationNo " + 
				"From prod_course c " + 
				"left join prod_unit_course u on c.prod_course_id=u.prod_course_id " + 
				"where c.container_category='LECONTCATE02' " + 
				((input.getYard()!=null && input.getYard().length>0)?("and c.yard in ('"+String.join("','", input.getYard())+"')  "):"")+
				((input.getImportContainerNo()!=null && input.getImportContainerNo().length>0)?("and c.container_no in ('"+String.join("','", input.getImportContainerNo())+"')  "):"")+
				(StringUtils.isNotEmpty(input.getContainerNo())?("and c.container_no like '%"+input.getContainerNo().trim()+"%'  "):"")+
				(StringUtils.isNotEmpty(input.getContainerUser())?("and c.container_user='"+input.getContainerUser().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getContainerOwner())?("and c.container_owner='"+input.getContainerOwner().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getBeginCourseTime())?("and c.course_time>='"+input.getBeginCourseTime().trim()+"'  "):"")+
				(StringUtils.isNotEmpty(input.getEndCourseTime())?("and c.course_time<='"+input.getEndCourseTime().trim()+" 23:59:59'  "):"")+ 
				(StringUtils.isNotEmpty(input.getBeginAuditTime())?("and (c.audit_time>='"+input.getBeginAuditTime().trim()+"' or u.audit_time>='"+input.getBeginAuditTime().trim()+"')  "):"")+
				(StringUtils.isNotEmpty(input.getEndAuditTime())?("and (c.audit_time<='"+input.getEndAuditTime().trim()+" 23:59:59' or u.audit_time<='"+input.getEndAuditTime().trim()+" 23:59:59')  "):"")+
				(StringUtils.isNotEmpty(input.getBeginFinishTime())?("and (c.finish_time>='"+input.getBeginFinishTime().trim()+"' or u.finish_time>='"+input.getBeginFinishTime().trim()+"')  "):"")+
				(StringUtils.isNotEmpty(input.getEndFinishTime())?("and (c.finish_time<='"+input.getEndFinishTime().trim()+" 23:59:59' or u.finish_time<='"+input.getEndFinishTime().trim()+" 23:59:59')  "):"")
				;
		String sql_end=" order by  createTime desc";
		String sql_connector=" UNION ALL ";
		String sql=sql1+sql_connector+sql2+sql_end;
		if(StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()) ){
			sql=sql1+sql_end;
		}
		else if(StringUtils.isNotEmpty(input.getContainerCategory()) && input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode()) ){
			sql=sql2+sql_end;
		}
		List<AddEdiResponseOutput> dataList=sqlDao.query(sql, AddEdiResponseOutput.class);
		return dataList;
	}

	/**
	 * edi池导入数据查询
	 * @param input
	 * @return
	 */
	@Override
	public List<AddEdiResponseOutput> importEdiPool(ImportEdiPoolInput input) {
		List<AddEdiResponseOutput> dataList=null;
		if(input.getContainerNos()!=null && input.getContainerNos().length>0) {
			String containerNos=String.join("','", input.getContainerNos());
			String sql1="SELECT c.prod_course_id as courseId,c.container_no as containerNo,c.yard as yardKey,c.yard as yardNameLang, " + 
					"c.container_user as containerUserKey,c.container_user as containerUserLang,c.container_owner as containerOwnerLang,c.course_type as courseTypeLang, " + 
					"c.container_category as containerCategory,c.container_category as containerCategoryNameLang, " + 
					"c.course_time as courseTime,c.audit_time as auditTime,null as unitAuditTime, " + 
					"c.finish_time as finishTime,null as unitFinishTime, " + 
					"c.use_reply_state as useReplyStateLang,null as unitUseReplyStateLang, " + 
					"c.create_time as createTime,c.valuation_no as evaluationNo,null as unitEvaluationNo " + 
					"From prod_course c " + 
					"where c.container_category='LECONTCATE01' " + 
					"and c.container_no in('"+containerNos+"')  ";
			String sql2=
					"SELECT c.prod_course_id as courseId,c.container_no as containerNo,c.yard as yardKey,c.yard as yardNameLang, " + 
					"c.container_user as containerUserKey,c.container_user as containerUserLang,c.container_owner as containerOwnerLang,c.course_type as courseTypeLang, " + 
					"'LECONTCATE05' as containerCategory,'LECONTCATE05' as containerCategoryNameLang, " + 
					"c.course_time as courseTime,c.audit_time as auditTime,u.audit_time as unitAuditTime, " + 
					"c.finish_time as finishTime,u.finish_time as unitFinishTime, " + 
					"c.use_reply_state as useReplyStateLang,u.use_reply_state as unitUseReplyStateLang, " + 
					"c.create_time as createTime,c.valuation_no as evaluationNo,u.valuation_no as unitEvaluationNo " + 
					"From prod_course c " + 
					"left join prod_unit_course u on c.prod_course_id=u.prod_course_id " + 
					"where c.container_category='LECONTCATE02' " + 
					"and c.container_no in('"+containerNos+"')  ";
					
			String sql_end=" order by  createTime desc";
			String sql_connector=" UNION ALL ";
			String sql=sql1+sql_connector+sql2+sql_end;
			
			dataList=sqlDao.query(sql, AddEdiResponseOutput.class);
		}
		return dataList;
	}

	/**
	 * edi池新增
	 * @param input
	 */
	@Override
	@Transactional
	public AddEdiPoolOutput addPool(AddEdiPoolInput input) {
		AddEdiPoolOutput output=new AddEdiPoolOutput();
		int successCount=0;
		Date date=new Date();
		Integer userId=getCurrentUserId();
		String[] ediTypes=input.getEdiType();
		for(String ediType:ediTypes) {
			for(AddEditPoolDetail item:input.getDetails()) {
				//干箱
				if(item.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					/**
					 * 导入干箱判断
					 */
					if(!input.getImportType().equals(EdiImportTypeEnum.Dry.getCode())) {
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"只能选择导入EDI池干箱"));
						continue;
					}
					//查询配置
					Course course=courseDao.selectByPrimaryKey(item.getCourseId());
					YardExample yardExample=new YardExample();
					yardExample.createCriteria().andKeyEqualTo(course.getYard());
					Yard yard=yardDao.selectByExample(yardExample).get(0);
					CompanyEdiTypeExample example=new CompanyEdiTypeExample();
					example.createCriteria().andCompanyEqualTo(yard.getCompany()).andContainerUserEqualTo(course.getContainerUser())
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode()).andEdiTypeEqualTo(ediType)
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
					
					List<CompanyEdiType> configList=ediConfigDao.selectByExample(example);
					if(configList.isEmpty()) {
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"EDI未配置"));
						continue;
					}
					EdiPoolExample ediExample=new EdiPoolExample();
					ediExample.createCriteria().andCourseEqualTo(item.getCourseId()).andContainerCategoryEqualTo(item.getContainerCategory());
					if(ediPoolDao.countByExample(ediExample)>0) {
						//edi池已存在，不能重复添加
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"EDI池已存在，不能重复添加"));
						continue;
					}
					//edi池实体新增
					EdiPool record=new EdiPool();
					record.setCourse(item.getCourseId());
					record.setContainerNo(item.getContainerNo());
					record.setEdiType(ediType);
					if(StringUtils.isNotEmpty(item.getEvaluationNo())) {
						record.setEvaluateNo(item.getEvaluationNo());
					}
					else {
						//自动产生估价单号
						record.setEvaluateNo(generateEvaluationNo(configList.get(0).getEstimateFormat()));
					}
					record.setExportNumber(0);
					record.setEdiVersion(1);
					record.setContainerCategory(ContainerCategoryEnum.CONTAINER_01.getCode());
					record.setState(EdiSendStateEnum.unSend.getCode());
					record.setCreateTime(date);
					record.setCreateUser(userId);
					ediPoolDao.insert(record);
					successCount++;
				}
				else if(item.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())){
					if(input.getImportType().equals(EdiImportTypeEnum.Dry.getCode())) {
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"不能对冷箱进行干箱操作"));
						continue;
					}
					
					//查询冷箱配置
					Course course=courseDao.selectByPrimaryKey(item.getCourseId());
					YardExample yardExample=new YardExample();
					yardExample.createCriteria().andKeyEqualTo(course.getYard());
					Yard yard=yardDao.selectByExample(yardExample).get(0);
					CompanyEdiTypeExample example=new CompanyEdiTypeExample();
					example.createCriteria().andCompanyEqualTo(yard.getCompany()).andContainerUserEqualTo(course.getContainerUser())
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_05.getCode()).andEdiTypeEqualTo(ediType)
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
					
					List<CompanyEdiType> configList=ediConfigDao.selectByExample(example);
					if(configList.isEmpty()) {
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"EDI未配置"));
						continue;
					}
					
					if(StringUtils.isNotEmpty(configList.get(0).getIsUnityQuote())) {
						//统一报价，生成一条数据
						if(configList.get(0).getIsUnityQuote().equals(CommonEnum.YES.getCode())) {
							if(!input.getImportType().equals(EdiImportTypeEnum.Cold.getCode())) {
								output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"该冷箱只能整体导入EDI池"));
								continue;
							}
							
							
							EdiPoolExample ediExample=new EdiPoolExample();
							ediExample.createCriteria().andCourseEqualTo(item.getCourseId())
							.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_05.getCode());
							if(ediPoolDao.countByExample(ediExample)>0) {
								//edi池已存在，不能重复添加
								output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"EDI池已存在，不能重复添加"));
								continue;
							}
							//统一报价
							EdiPool record=new EdiPool();
							record.setCourse(item.getCourseId());
							record.setContainerNo(item.getContainerNo());
							record.setEdiType(ediType);
							if(StringUtils.isNotEmpty(item.getEvaluationNo())) {
								record.setEvaluateNo(item.getEvaluationNo());
							}
							else {
								//自动产生估价单号
								record.setEvaluateNo(generateEvaluationNo(configList.get(0).getEstimateFormat()));
								
								course.setValuationNo(record.getEvaluateNo());
								course.setUpdateTime(date);
								course.setUpdateUser(userId);
								courseDao.updateByPrimaryKey(course);
								UnitCourseExample  uE=new UnitCourseExample();
								uE.createCriteria().andProdCourseIdEqualTo(item.getCourseId());
								UnitCourseWithBLOBs uc=new UnitCourseWithBLOBs();
								uc.setValuationNo(record.getEvaluateNo());
								uc.setUpdateTime(date);
								uc.setUpdateUser(userId);
								unitCourseDao.updateByExampleSelective(uc, uE);
							}
							record.setExportNumber(0);
							record.setEdiVersion(1);
							record.setContainerCategory(ContainerCategoryEnum.CONTAINER_05.getCode());
							record.setState(EdiSendStateEnum.unSend.getCode());
							record.setCreateTime(date);
							record.setCreateUser(userId);
							ediPoolDao.insert(record);
							successCount++;
						}
						else {
							//分开报价
							if(input.getImportType().equals(EdiImportTypeEnum.Cold.getCode())) {
								output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"该冷箱不能整体导入EDI池"));
								continue;
							}
							//分开报价，箱体
							if(input.getImportType().equals(EdiImportTypeEnum.Container.getCode()) || input.getImportType().equals(EdiImportTypeEnum.ContainerUnit.getCode())) {
								EdiPoolExample ediExample=new EdiPoolExample();
								ediExample.createCriteria().andCourseEqualTo(item.getCourseId())
								.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
								if(ediPoolDao.countByExample(ediExample)>0) {
									//edi池已存在，不能重复添加
									output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"EDI池已存在，不能重复添加"));
									continue;
								}
								
								EdiPool record=new EdiPool();
								record.setCourse(item.getCourseId());
								record.setContainerNo(item.getContainerNo());
								record.setEdiType(ediType);
								if(StringUtils.isNotEmpty(item.getEvaluationNo())) {
									record.setEvaluateNo(item.getEvaluationNo());
								}
								else {
									//自动产生估价单号
									record.setEvaluateNo(generateEvaluationNo(configList.get(0).getEstimateFormat()));
									
									course.setValuationNo(record.getEvaluateNo());
									course.setUpdateTime(date);
									course.setUpdateUser(userId);
									courseDao.updateByPrimaryKey(course);
									
								}
								record.setExportNumber(0);
								record.setEdiVersion(1);
								record.setContainerCategory(ContainerCategoryEnum.CONTAINER_02.getCode());
								record.setState(EdiSendStateEnum.unSend.getCode());
								record.setCreateTime(date);
								record.setCreateUser(userId);
								ediPoolDao.insert(record);
								successCount++;
							}
							//分开报价，机组
							if(input.getImportType().equals(EdiImportTypeEnum.Unit.getCode()) || input.getImportType().equals(EdiImportTypeEnum.ContainerUnit.getCode())) {
								EdiPoolExample ediExample=new EdiPoolExample();
								ediExample.createCriteria().andCourseEqualTo(item.getCourseId())
								.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
								if(ediPoolDao.countByExample(ediExample)>0) {
									//edi池已存在，不能重复添加
									output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(item.getContainerNo(),ediType,"EDI池已存在，不能重复添加"));
									continue;
								}
								EdiPool record=new EdiPool();
								record.setCourse(item.getCourseId());
								record.setContainerNo(item.getContainerNo());
								record.setEdiType(ediType);
								if(StringUtils.isNotEmpty(item.getUnitEvaluationNo())) {
									record.setEvaluateNo(item.getUnitEvaluationNo());
								}
								else {
									//自动产生估价单号
									record.setEvaluateNo(generateEvaluationNo(configList.get(0).getEstimateFormat()));
									
									UnitCourseExample  uE=new UnitCourseExample();
									uE.createCriteria().andProdCourseIdEqualTo(item.getCourseId());
									UnitCourseWithBLOBs uc=new UnitCourseWithBLOBs();
									uc.setValuationNo(record.getEvaluateNo());
									uc.setUpdateTime(date);
									uc.setUpdateUser(userId);
									unitCourseDao.updateByExampleSelective(uc, uE);
								}
								record.setExportNumber(0);
								record.setEdiVersion(1);
								record.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
								record.setState(EdiSendStateEnum.unSend.getCode());
								record.setCreateTime(date);
								record.setCreateUser(userId);
								ediPoolDao.insert(record);
								successCount++;
							}
							
						}
					}
					
				}
				
			}
		}
		output.setSuccessCount(successCount);
		return output;
	}
	
	/**
	 * 产生估价单号
	 * @param format
	 * @return
	 */
	@Transactional
	private String generateEvaluationNo(String format) {
		String formatDate=DateUtil.convertDateFromFormat(format);
		//从数据库获取下一条序号
		EdiEvaluationSerial record=serialDao.selectByPrimaryKey(format);
		int number=1;
		if(record!=null) {
			number=record.getCurrentNumber().intValue()+1;
			record.setCurrentNumber(number);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			serialDao.updateByPrimaryKey(record);
		}
		else {
			record=new EdiEvaluationSerial();
			record.setProdEdiFormat(format);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			record.setCurrentNumber(number);
			serialDao.insert(record);
		}
		String numberFormat=DateUtil.convertNumberFromFormat(formatDate, number);

		return numberFormat;
	}
	
	
	
	/**
	 * 重新生成估价单号
	 * @param input
	 */
	@Override
	@Transactional
	public void reGenerateEvaluationNo(GenerateEvaluationNoInput input) {
		Date date=new Date();
		Integer userId=getCurrentUserId();
		for(GenerateEvaluationNoDetail item:input.getDetails()) {
			EdiPoolExample poolExample=new EdiPoolExample();
			poolExample.createCriteria().andCourseEqualTo(item.getCourseId()).andContainerCategoryEqualTo(item.getContainerCategory());
			EdiPool record=ediPoolDao.selectByExample(poolExample).get(0);
			
			
			Course course=courseDao.selectByPrimaryKey(item.getCourseId());
			YardExample yardExample=new YardExample();
			yardExample.createCriteria().andKeyEqualTo(course.getYard());
			Yard yard=yardDao.selectByExample(yardExample).get(0);
			CompanyEdiTypeExample example=new CompanyEdiTypeExample();
			
			if(item.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode()) || item.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
				item.setContainerCategory(ContainerCategoryEnum.CONTAINER_05.getCode());
			}
			example.createCriteria().andCompanyEqualTo(yard.getCompany()).andContainerUserEqualTo(course.getContainerUser())
			.andContainerCategoryEqualTo(item.getContainerCategory()).andEdiTypeEqualTo(record.getEdiType())
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
			
			List<CompanyEdiType> configList=ediConfigDao.selectByExample(example);
			if(configList.isEmpty()) {
				throw new InvalidException("EDI未配置估价单号格式");
			}
			record.setEvaluateNo(generateEvaluationNo(configList.get(0).getEstimateFormat()));
			record.setUpdateTime(date);
			record.setUpdateUser(userId);
			ediPoolDao.updateByPrimaryKey(record);
		}
		
	}

	/**
	 * 校验估价单号格式
	 * @param format
	 * @return
	 */
	@Override
	public Boolean validateEvaluationFormat(String format) {
		String formatDate=DateUtil.convertDateFromFormat(format);
		//从数据库获取下一条序号
		
		DateUtil.convertNumberFromFormat(formatDate, 1);

		return true;
	}
	
	/**
	 * edi池撤销数据
	 * @param input
	 */
	@Override
	public void deletePool(GenerateEvaluationNoInput input) {

		for(GenerateEvaluationNoDetail item:input.getDetails()) {
			EdiPoolExample poolExample=new EdiPoolExample();
			poolExample.createCriteria().andCourseEqualTo(item.getCourseId()).andContainerCategoryEqualTo(item.getContainerCategory());
			ediPoolDao.deleteByExample(poolExample);
		}
	}

	/**
	 * edi池导出数据
	 * @param input
	 * @throws IOException 
	 */
	@Override
	@Transactional
	public ExportEdiOutput exportPool(GenerateEvaluationNoInput input) throws Exception {
		ExportEdiOutput output=new ExportEdiOutput();
		if(input.getDetails()!=null) {
			Date date=new Date();
			Integer userId=getCurrentUserId();
			List<EdiPoolExportDetailOutput> dataList=new ArrayList<>();	
			
			//获取所有的edi配置
			CompanyEdiTypeExample configExample=new CompanyEdiTypeExample();
			configExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
			List<CompanyEdiType> configList=ediConfigDao.selectByExample(configExample);
			
			for(GenerateEvaluationNoDetail detail:input.getDetails()) {
				EdiPoolExample poolExample=new EdiPoolExample();
				poolExample.createCriteria().andCourseEqualTo(detail.getCourseId()).andContainerCategoryEqualTo(detail.getContainerCategory());
				List<EdiPool> poolList=ediPoolDao.selectByExample(poolExample);
				if(poolList.size()>0) {
					
					//获取当前记录
					EdiPool record=poolList.get(0);
					
//					if(StringUtils.isNotEmpty(record.getState()) && record.getState().equals(EdiSendStateEnum.sended.getCode())) {
//						continue;
//					}
					Course course=courseDao.selectByPrimaryKey(record.getCourse());
					YardExample yardExample=new YardExample();
					yardExample.createCriteria().andKeyEqualTo(course.getYard());
					Yard yard=yardDao.selectByExample(yardExample).get(0);
					
					//获取edi配置
					EdiPoolExportDetailOutput item=new EdiPoolExportDetailOutput();
					Optional<CompanyEdiType> optional=configList.stream()
							.filter(a->a.getCompany().equals(yard.getCompany()) 
							&& a.getContainerUser().equals(course.getContainerUser()) 
							&& a.getEdiType().equals(record.getEdiType())
							&& a.getContainerCategory().equals(record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())?ContainerCategoryEnum.CONTAINER_01.getCode():ContainerCategoryEnum.CONTAINER_05.getCode())
							).findFirst();
					if(optional.isPresent()) {
						CompanyEdiType config=optional.get();
						item.setEdiFileFormat(ediFileDao.selectByPrimaryKey(config.getEditFileFormat()).getEditFileFormat());
						item.setEdiMethodName(config.getEdiMethod());
						item.setEdiFileTemplate(config.getEdiFileTemplate());
						if(config.getIsUnityQuote()!=null && config.getIsUnityQuote().equals(CommonEnum.YES.getCode())) {
							if(!detail.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()) && !detail.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
								continue;
							}
						}
						else {
							if(!detail.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()) 
									&& !detail.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())
									&& !detail.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
								continue;
							}
						}
					}
					else {
						continue;
					}
					item.setCourseId(record.getCourse());
					item.setCompany(yard.getCompany());
					item.setContainerCategory(record.getContainerCategory());
					item.setContainerCategoryDryCold(record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())?ContainerCategoryEnum.CONTAINER_01.getCode():ContainerCategoryEnum.CONTAINER_05.getCode());
					item.setContainerUser(course.getContainerUser());
					item.setYard(course.getYard());
					item.setEvaluationNo(record.getEvaluateNo());
					item.setEdiTypeKey(record.getEdiType());
					EdiTypeExample ediTypeExample=new EdiTypeExample();
					ediTypeExample.createCriteria().andKeyEqualTo(record.getEdiType());
					EdiType ediType=ediTypeDao.selectByExample(ediTypeExample).get(0);
					item.setEdiTypeName(ediType.getEdiTypeName());
					
					item.setDppFee(record.getDppFee());
					item.setCwFee(record.getCwFee());
					item.setClientCode(record.getClientCode());
					dataList.add(item);
					
					record.setExportNumber(record.getExportNumber().intValue()+1);
					record.setUpdateTime(date);
					record.setUpdateUser(userId);
					ediPoolDao.updateByPrimaryKey(record);
				}
			}
			List<Map<String,String>> resultList=new ArrayList<>();
			//对符合条件的记录进行查询
			if(dataList.size()>0) {
				Map<String,List<EdiPoolExportDetailOutput>> mapList=dataList.stream().collect(Collectors.groupingBy(new Function<EdiPoolExportDetailOutput,String>(){
					@Override
					public String apply(EdiPoolExportDetailOutput t) {
						// TODO Auto-generated method stub
						return JSON.toJSONString(Arrays.asList(t.getCompany(),t.getContainerUser(),t.getContainerCategoryDryCold(),t.getEdiTypeKey(),t.getEdiTypeName()));
					}
				}));
				for(Entry<String,List<EdiPoolExportDetailOutput>> entrySet:mapList.entrySet()) {
					//EDI文件格式
					String fileFormat=entrySet.getValue().get(0).getEdiFileFormat();
					String fileName=DateUtil.convertDateFromEdiFileFormat(fileFormat)
							.replace("{EDI类型}", entrySet.getValue().get(0).getEdiTypeName());
					//EDI报文方法名称
					String methodName=entrySet.getValue().get(0).getEdiMethodName();
					//判断是否导出到EXCEL
					Boolean isExcel=isEdiExcel(fileFormat);
					
					String[] fileSplits=splitFileName(fileName);
					File parentDir=new File("tmp");
					if(!parentDir.exists()) {
						parentDir.mkdir();
					}
					
					
					if(isExcel) {
						Map<String,List<EdiPoolExportDetailOutput>> yardMap=new HashMap<String,List<EdiPoolExportDetailOutput>>();
						for(EdiPoolExportDetailOutput entryDetail:entrySet.getValue()) {
							if(yardMap.containsKey(entryDetail.getYard())) {
								yardMap.get(entryDetail.getYard()).add(entryDetail);
							}
							else {
								yardMap.put(entryDetail.getYard(), new ArrayList<EdiPoolExportDetailOutput>(Arrays.asList(entryDetail)));
							}
						}
						
						
						for(Entry<String,List<EdiPoolExportDetailOutput>> contentEntry:yardMap.entrySet()) {
							
							//excel模板名称
							String excelTemplateName=entrySet.getValue().get(0).getEdiFileTemplate();
							InputStream inputStream=SystemUtil.getEdiResource(ediTemplateLocation+File.separator+excelTemplateName);
							
							//创建临时文件，填充内容
							File tempFile=File.createTempFile(fileSplits[0], fileSplits[1],parentDir);
							//将模板写入临时新文件
							OutputStream os = null;
							try{
								os=new FileOutputStream(tempFile);
								int len = 8192;
						        byte[] buffer = new byte[len];
						        while ((len = inputStream.read(buffer, 0, len)) != -1) {
						            os.write(buffer, 0, len);
						        }
							}
							catch(Exception ex) {
								
							}
							finally {
								try {
									if(os!=null) {
										os.flush();
										os.close();
									}
									if(inputStream!=null) {
										inputStream.close();
									}
								} catch (IOException e) {
									e.printStackTrace();
								}
								
							}
					        
					        
					        //每个场站生成一个EXCEL文件
					        createEdiExcelContent(tempFile,excelTemplateName,contentEntry.getValue());
					        
					        String sourceFileName=tempFile.getCanonicalPath();
							Map<String,String> map=new HashMap<>();
							map.put(sourceFileName,fileName);
							resultList.add(map);
					        System.out.println(tempFile.getCanonicalPath());
					        
						}
						
					}
					else {
						//获取EDI报文
						try {
							Map<String,List<EdiPoolExportDetailOutput>> yardMap=new HashMap<String,List<EdiPoolExportDetailOutput>>();
							for(EdiPoolExportDetailOutput entryDetail:entrySet.getValue()) {
								if(yardMap.containsKey(entryDetail.getYard())) {
									yardMap.get(entryDetail.getYard()).add(entryDetail);
								}
								else {
									yardMap.put(entryDetail.getYard(), new ArrayList<EdiPoolExportDetailOutput>(Arrays.asList(entryDetail)));
								}
							}
							for(Entry<String,List<EdiPoolExportDetailOutput>> contentEntry:yardMap.entrySet()) {
								AddEdiMessageInput contentInput=new AddEdiMessageInput();
								contentInput.setMethodName(methodName);
//								contentInput.setLoginYard(contentEntry.getKey());
								contentInput.setEdiMessageInputs(contentEntry.getValue().stream().map(a->{
									EdiMessageInput item=new EdiMessageInput();
									item.setCourseId(a.getCourseId());
									item.setContainerCategory(a.getContainerCategory());
									return item;
								}).toArray(EdiMessageInput[]::new));
								
								//查询发送方接收方代码
								CompanyCodeExample companyCodeExample=new CompanyCodeExample();
								companyCodeExample.createCriteria()
									.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
									.andCompanyEqualTo(entrySet.getValue().get(0).getCompany())
									.andYardEqualTo(entrySet.getValue().get(0).getYard())
									.andContainerUserEqualTo(entrySet.getValue().get(0).getContainerUser());
								CompanyCode companyCodeRecord=null;
								List<CompanyCode> companyCodeList=companyCodeDao.selectByExample(companyCodeExample);
								if(companyCodeList.size()>0) {
									companyCodeRecord=companyCodeList.get(0);
								}
								contentInput.setEdiConfig(companyCodeRecord);
								
								String content=getEdiReportContent(contentInput);
								System.out.println(fileName+",EDI报文:"+content);
								
								//创建临时文件，填充内容
								File tempFile=File.createTempFile(fileSplits[0], fileSplits[1],parentDir);
								
								Writer out =new FileWriter(tempFile);
								out.write(content);
								out.close();
								
								
								String sourceFileName=tempFile.getCanonicalPath();
								Map<String,String> map=new HashMap<>();
								map.put(sourceFileName,fileName);
								resultList.add(map);
								
							}
							
							
							
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new InvalidException("EDI生成报文错误");
						}
					}
				}
			}
			output.setFiles(resultList);
		}
		return output;
	}

	/**
	 * EDI池发送数据
	 */
	@Override
	@Transactional
	public AddEdiPoolOutput sendPool(SendEdiInput input) throws Exception {
		AddEdiPoolOutput output=new AddEdiPoolOutput();
		if(input.getPoolId()!=null) {
			Date date=new Date();
			Integer userId=getCurrentUserId();
			List<EdiPoolExportDetailOutput> dataList=new ArrayList<>();	
			
			//获取所有的edi配置
			CompanyEdiTypeExample configExample=new CompanyEdiTypeExample();
			configExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
			List<CompanyEdiType> configList=ediConfigDao.selectByExample(configExample);
			//获取所有的ftp,email信息
			CompanyCustomerExample configDetailExample=new CompanyCustomerExample();
			configDetailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<CompanyCustomer> configDetailList=configDetailDao.selectByExample(configDetailExample);
			for(Integer poolId:input.getPoolId()) {
				//获取当前记录
				EdiPool record=ediPoolDao.selectByPrimaryKey(poolId);
				
				if(record!=null) {
					Course course=courseDao.selectByPrimaryKey(record.getCourse());			
					if(StringUtils.isNotEmpty(record.getState()) && record.getState().equals(EdiSendStateEnum.sended.getCode())) {
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(record.getContainerNo(), record.getEdiType(), "已发送，不能重复发送"));
						continue;
					}
					
					YardExample yardExample=new YardExample();
					yardExample.createCriteria().andKeyEqualTo(course.getYard());
					Yard yard=yardDao.selectByExample(yardExample).get(0);
					
					//获取edi配置
					EdiPoolExportDetailOutput item=new EdiPoolExportDetailOutput();
					Optional<CompanyEdiType> optional=configList.stream()
							.filter(a->a.getCompany().equals(yard.getCompany()) 
							&& a.getContainerUser().equals(course.getContainerUser()) 
							&& a.getEdiType().equals(record.getEdiType())
							&& a.getContainerCategory().equals(record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())?ContainerCategoryEnum.CONTAINER_01.getCode():ContainerCategoryEnum.CONTAINER_05.getCode())
							).findFirst();
					if(optional.isPresent()) {
						CompanyEdiType config=optional.get();
						item.setEdiPoolId(record.getProdEdiPoolId());
						item.setEdiFileFormat(ediFileDao.selectByPrimaryKey(config.getEditFileFormat()).getEditFileFormat());
						item.setEdiMethodName(config.getEdiMethod());
						item.setEdiFileTemplate(config.getEdiFileTemplate());
						if(config.getIsUnityQuote()!=null && config.getIsUnityQuote().equals(CommonEnum.YES.getCode())) {
							if(!record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()) && !record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
								output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(record.getContainerNo(), record.getEdiType(), "只能整体报价"));
								continue;
							}
						}
						else {
							if(!record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()) 
									&& !record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())
									&& !record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
								output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(record.getContainerNo(), record.getEdiType(), "只能分开报价"));
								continue;
							}
						}
						//查询Ftp，邮件发送信息
						Optional<CompanyCustomer> detailOptional=configDetailList.stream()
								.filter(a->a.getCompany().equals(yard.getCompany()) 
								).findFirst();
						if(detailOptional.isPresent()) {
							CompanyCustomer configDetail=detailOptional.get();
							item.setSendType(config.getSendType());
							if(config.getSendType()!=null && config.getSendType().equals(EdiSendTypeEnum.ftp.getCode())) {
								item.setFtpServer(configDetail.getFtpReceiveAddress());
								item.setFtpPort(configDetail.getFtpReceivePort());
								String dir=configDetail.getFtpReceiveDirectory();
								if(StringUtils.isNotEmpty(dir) && dir.startsWith("{home}/")) {
									dir=dir.substring(7);
								}
								if(StringUtils.isNotEmpty(dir) && dir.startsWith("{home}")) {
									dir=dir.substring(6);
								}
								item.setFtpDirectory(dir);
								item.setFtpUser(configDetail.getFtpSendAccount());
								item.setFtpPassword(configDetail.getFtpSendPwd());
							}
							else if(config.getSendType()!=null && config.getSendType().equals(EdiSendTypeEnum.email.getCode())) {
								item.setSmtpServer(configDetail.getSendSmtpContent());
								item.setSmtpPort(configDetail.getSendSmtpPort());
								item.setSendEmailAddress(configDetail.getSendEmailAddress());
								item.setSendEmailUser(configDetail.getEmailUser());
								item.setSendEmailPassword(configDetail.getEmailPwd());
								item.setReceiveEmailUser(config.getSendEmail());
							}
							else {
								output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(record.getContainerNo(), record.getEdiType(), "EDI未配置客户接收信息"));
								continue;
							}
						}
						else {
							output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(record.getContainerNo(), record.getEdiType(), "EDI未配置客户接收信息"));
							continue;
						}
					}
					else {
						output.getError().add(new AddEdiPoolOutput.AddEdiPoolErrorOutput(record.getContainerNo(), record.getEdiType(), "EDI未配置"));
						continue;
					}
					item.setCourseId(record.getCourse());
					item.setCompany(yard.getCompany());
					item.setContainerCategory(record.getContainerCategory());
					item.setContainerCategoryDryCold(record.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())?ContainerCategoryEnum.CONTAINER_01.getCode():ContainerCategoryEnum.CONTAINER_05.getCode());
					item.setContainerUser(course.getContainerUser());
					item.setYard(course.getYard());
					item.setEvaluationNo(record.getEvaluateNo());
					item.setEdiTypeKey(record.getEdiType());
					EdiTypeExample ediTypeExample=new EdiTypeExample();
					ediTypeExample.createCriteria().andKeyEqualTo(record.getEdiType());
					EdiType ediType=ediTypeDao.selectByExample(ediTypeExample).get(0);
					item.setEdiTypeName(ediType.getEdiTypeName());
					
					item.setDppFee(record.getDppFee());
					item.setCwFee(record.getCwFee());
					item.setClientCode(record.getClientCode());
					dataList.add(item);
					
					
				}
			}
			List<Map<String,String>> resultList=new ArrayList<>();
			//对符合条件的记录进行查询
			if(dataList.size()>0) {
				Map<String,List<EdiPoolExportDetailOutput>> mapList=dataList.stream().collect(Collectors.groupingBy(new Function<EdiPoolExportDetailOutput,String>(){
					@Override
					public String apply(EdiPoolExportDetailOutput t) {
						// TODO Auto-generated method stub
						return JSON.toJSONString(Arrays.asList(t.getCompany(),t.getContainerUser(),t.getContainerCategoryDryCold(),t.getEdiTypeKey(),t.getEdiTypeName()));
					}
				}));
				for(Entry<String,List<EdiPoolExportDetailOutput>> entrySet:mapList.entrySet()) {
					//EDI文件格式
					EdiPoolExportDetailOutput detailConfigItem=entrySet.getValue().get(0);
					String fileFormat=detailConfigItem.getEdiFileFormat();
					String fileName=DateUtil.convertDateFromEdiFileFormat(fileFormat)
							.replace("{EDI类型}", detailConfigItem.getEdiTypeName());
					Boolean isFtp=detailConfigItem.getSendType().equals(EdiSendTypeEnum.ftp.getCode());
					//EDI报文方法名称
					String methodName=detailConfigItem.getEdiMethodName();
					//判断是否导出到EXCEL
					Boolean isExcel=isEdiExcel(fileFormat);
					
					String[] fileSplits=splitFileName(fileName);
					File parentDir=new File("tmp");
					if(!parentDir.exists()) {
						parentDir.mkdir();
					}
					
					
					if(isExcel) {
						
						Map<String,List<EdiPoolExportDetailOutput>> yardMap=new HashMap<String,List<EdiPoolExportDetailOutput>>();
						//按照场站分组
						for(EdiPoolExportDetailOutput entryDetail:entrySet.getValue()) {
							if(yardMap.containsKey(entryDetail.getYard())) {
								yardMap.get(entryDetail.getYard()).add(entryDetail);
							}
							else {
								yardMap.put(entryDetail.getYard(), new ArrayList<EdiPoolExportDetailOutput>(Arrays.asList(entryDetail)));
							}
						}
						
						for(Entry<String,List<EdiPoolExportDetailOutput>> contentEntry:yardMap.entrySet()) {
							
							//查询每次发送的最大条数
							AutomaticSendExample autoSendExample=new AutomaticSendExample();
							autoSendExample.createCriteria().andCompanyEqualTo(contentEntry.getValue().get(0).getCompany())
							.andContainerUserEqualTo(contentEntry.getValue().get(0).getContainerUser())
							.andContainerCategoryEqualTo(contentEntry.getValue().get(0).getContainerCategoryDryCold())
							.andYardEqualTo(contentEntry.getKey());
							
							List<AutomaticSend> autoSendList=autoSendDao.selectByExample(autoSendExample);
							//默认最多150
							int maxNumber=150;
							if(autoSendList.size()>0) {
								maxNumber=autoSendList.get(0).getMaxNumber().intValue();
							}
							maxNumber=maxNumber>contentEntry.getValue().size()?contentEntry.getValue().size():maxNumber;
							//单场站要发送的数据
							List<EdiPoolExportDetailOutput> periodList=contentEntry.getValue().subList(0, maxNumber);
							
							//excel模板名称
							String excelTemplateName=detailConfigItem.getEdiFileTemplate();
							InputStream inputStream=SystemUtil.getEdiResource(ediTemplateLocation+File.separator+excelTemplateName);
							//创建临时文件，填充内容
							File tempFile=File.createTempFile(fileSplits[0], fileSplits[1],parentDir);
							//将模板写入临时新文件
							OutputStream os = null;
							try{
								os=new FileOutputStream(tempFile);
								int len = 8192;
						        byte[] buffer = new byte[len];
						        while ((len = inputStream.read(buffer, 0, len)) != -1) {
						            os.write(buffer, 0, len);
						        }
							}
							catch(Exception ex) {
								
							}
							finally {
								try {
									if(os!=null) {
										os.flush();
										os.close();
									}
									if(inputStream!=null) {
										inputStream.close();
									}
								} catch (IOException e) {
									e.printStackTrace();
								}
								
							}
								
							Boolean needSend=createEdiExcelContent(tempFile,excelTemplateName,periodList);
					        if(!needSend) {
					        	//没有估价条目，不发送，不改变EDI发送状态
					        	continue;
					        }
					        String sourceFileName=tempFile.getCanonicalPath();
							Map<String,String> map=new HashMap<>();
							map.put(sourceFileName,fileName);
							resultList.add(map);
							
							//发送
							String nowFileName=DateUtil.convertDateFromEdiFileFormat(fileFormat)
									.replace("{EDI类型}", detailConfigItem.getEdiTypeName());
							if(isFtp) {
								FtpUtil ftpClient=new FtpUtil();
								FtpUtil.FtpSetting ftpSetting=ftpClient.getSetting();
								ftpSetting.setFtpServer(detailConfigItem.getFtpServer()).setFtpPort(detailConfigItem.getFtpPort())
								.setLoginUser(detailConfigItem.getFtpUser()).setLoginPassword(detailConfigItem.getFtpPassword());
								if(StringUtils.isNotEmpty(detailConfigItem.getFtpDirectory())) {
									ftpClient.changeDirectory(detailConfigItem.getFtpDirectory()).upload(tempFile, nowFileName);
								}
								else {
									ftpClient.upload(tempFile, nowFileName);
								}
								ftpClient.close();
							}
							else {
								EmailUtil emailClient=new EmailUtil("smtp",detailConfigItem.getSmtpServer(),detailConfigItem.getSmtpPort());
								emailClient.setFrom(detailConfigItem.getSendEmailAddress()).setTo(detailConfigItem.getReceiveEmailUser())
								.setAuth(detailConfigItem.getSendEmailUser(), detailConfigItem.getSendEmailPassword())
								.addFile(fileName, tempFile).sendText("", fileName);
							}
							//更新已发送状态
							EdiPoolExample poolExample=new EdiPoolExample();
							poolExample.createCriteria().andProdEdiPoolIdIn(periodList.stream().map(a->a.getEdiPoolId()).collect(Collectors.toList()));
							
							EdiPool updateRecord=new EdiPool();
							updateRecord.setState(EdiSendStateEnum.sended.getCode());
							updateRecord.setSendTime(date);
							updateRecord.setUpdateTime(date);
							updateRecord.setUpdateUser(userId);
							ediPoolDao.updateByExampleSelective(updateRecord, poolExample);
							
							System.out.println(tempFile.getCanonicalPath());
						}
				        
					}
					else {
						//获取EDI报文
						try {
							Map<String,List<EdiPoolExportDetailOutput>> yardMap=new HashMap<String,List<EdiPoolExportDetailOutput>>();
							//按照场站分组
							for(EdiPoolExportDetailOutput entryDetail:entrySet.getValue()) {
								if(yardMap.containsKey(entryDetail.getYard())) {
									yardMap.get(entryDetail.getYard()).add(entryDetail);
								}
								else {
									yardMap.put(entryDetail.getYard(), new ArrayList<EdiPoolExportDetailOutput>(Arrays.asList(entryDetail)));
								}
							}
							for(Entry<String,List<EdiPoolExportDetailOutput>> contentEntry:yardMap.entrySet()) {
								
								//查询每次发送的最大条数
								AutomaticSendExample autoSendExample=new AutomaticSendExample();
								autoSendExample.createCriteria().andCompanyEqualTo(contentEntry.getValue().get(0).getCompany())
								.andContainerUserEqualTo(contentEntry.getValue().get(0).getContainerUser())
								.andContainerCategoryEqualTo(contentEntry.getValue().get(0).getContainerCategoryDryCold())
								.andYardEqualTo(contentEntry.getKey());
								
								List<AutomaticSend> autoSendList=autoSendDao.selectByExample(autoSendExample);
								//默认最多150
								int maxNumber=150;
								if(autoSendList.size()>0) {
									maxNumber=autoSendList.get(0).getMaxNumber().intValue();
								}
								maxNumber=maxNumber>contentEntry.getValue().size()?contentEntry.getValue().size():maxNumber;
								//单场站要发送的数据
								List<EdiPoolExportDetailOutput> periodList=contentEntry.getValue().subList(0, maxNumber);
								
								AddEdiMessageInput contentInput=new AddEdiMessageInput();
								contentInput.setMethodName(methodName);
//								contentInput.setLoginYard(contentEntry.getKey());
								contentInput.setEdiMessageInputs(periodList.stream().map(a->{
									EdiMessageInput item=new EdiMessageInput();
									item.setCourseId(a.getCourseId());
									item.setContainerCategory(a.getContainerCategory());
									return item;
								}).toArray(EdiMessageInput[]::new));
								
								//查询发送方接收方代码
								CompanyCodeExample companyCodeExample=new CompanyCodeExample();
								companyCodeExample.createCriteria()
									.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
									.andCompanyEqualTo(entrySet.getValue().get(0).getCompany())
									.andYardEqualTo(entrySet.getValue().get(0).getYard())
									.andContainerUserEqualTo(entrySet.getValue().get(0).getContainerUser());
								CompanyCode companyCodeRecord=null;
								List<CompanyCode> companyCodeList=companyCodeDao.selectByExample(companyCodeExample);
								if(companyCodeList.size()>0) {
									companyCodeRecord=companyCodeList.get(0);
								}
								contentInput.setEdiConfig(companyCodeRecord);
								
								String content=getEdiReportContent(contentInput);
								System.out.println(fileName+",EDI报文:"+content);
								
								//创建临时文件，填充内容
								File tempFile=File.createTempFile(fileSplits[0], fileSplits[1],parentDir);
								
								Writer out =new FileWriter(tempFile);
								out.write(content);
								out.close();
								
								
								String sourceFileName=tempFile.getCanonicalPath();
								Map<String,String> map=new HashMap<>();
								map.put(sourceFileName,fileName);
								resultList.add(map);
								
								//发送
								String nowFileName=DateUtil.convertDateFromEdiFileFormat(fileFormat)
										.replace("{EDI类型}", detailConfigItem.getEdiTypeName());
								if(isFtp) {
									FtpUtil ftpClient=new FtpUtil();
									FtpUtil.FtpSetting ftpSetting=ftpClient.getSetting();
									ftpSetting.setFtpServer(detailConfigItem.getFtpServer()).setFtpPort(detailConfigItem.getFtpPort())
									.setLoginUser(detailConfigItem.getFtpUser()).setLoginPassword(detailConfigItem.getFtpPassword());
									if(StringUtils.isNotEmpty(detailConfigItem.getFtpDirectory())) {
										ftpClient.changeDirectory(detailConfigItem.getFtpDirectory()).upload(tempFile, nowFileName);
									}
									else {
										ftpClient.upload(tempFile, nowFileName);
									}
									
									ftpClient.close();
								}
								else {
									EmailUtil emailClient=new EmailUtil("smtp",detailConfigItem.getSmtpServer(),detailConfigItem.getSmtpPort());
									emailClient.setFrom(detailConfigItem.getSendEmailAddress()).setTo(detailConfigItem.getReceiveEmailUser())
									.setAuth(detailConfigItem.getSendEmailUser(), detailConfigItem.getSendEmailPassword())
									.addFile(fileName, tempFile).sendText("", nowFileName);
								}
								//更新已发送状态
								EdiPoolExample poolExample=new EdiPoolExample();
								poolExample.createCriteria().andProdEdiPoolIdIn(periodList.stream().map(a->a.getEdiPoolId()).collect(Collectors.toList()));
								
								EdiPool updateRecord=new EdiPool();
								updateRecord.setState(EdiSendStateEnum.sended.getCode());
								updateRecord.setSendTime(date);
								updateRecord.setUpdateTime(date);
								updateRecord.setUpdateUser(userId);
								ediPoolDao.updateByExampleSelective(updateRecord, poolExample);
								
							}
							
							
							
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new InvalidException("EDI生成报文错误");
						}
					}
				}
			}
//			output.setFiles(resultList);
		}
		return output;
	}
	/**
	 * 获取单条edi池数据
	 * @param input
	 */
	@Override
	public EdiEditInfoOutput getPoolInfo(Integer poolId) {
		EdiPool record=ediPoolDao.selectByPrimaryKey(poolId);
		
		EdiEditInfoOutput output=new EdiEditInfoOutput();
		output.setPoolId(poolId);
		output.setCwFee(record.getCwFee()==null?null:String.valueOf(record.getCwFee()));
		output.setDppFee(record.getDppFee()==null?null:String.valueOf(record.getDppFee()));
		output.setClientCode(record.getClientCode());
		return output;
	}
	
	/**
	 * 修改edi池数据
	 * @param input
	 */
	@Override
	public void editPool(EditEdiPoolInput input) {
		EdiPool record=ediPoolDao.selectByPrimaryKey(input.getPoolId());
		if(StringUtils.isNotEmpty(input.getCwFee())) {
			record.setCwFee(new BigDecimal(input.getCwFee()));
		}
		else {
			record.setCwFee(null);
		}
		if(StringUtils.isNotEmpty(input.getDppFee())) {
			record.setDppFee(new BigDecimal(input.getDppFee()));
		}
		else {
			record.setDppFee(null);
		}
		record.setClientCode(input.getClientCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		ediPoolDao.updateByPrimaryKey(record);
	}
	
	
	
	/**
	 * 获取edi报文
	 * @param methodName
	 * @param input
	 * @return
	 * @throws Exception
	 */
	private String getEdiReportContent(AddEdiMessageInput input) throws Exception {
		Method m=EdiMessageService.class.getDeclaredMethod(input.getMethodName(), AddEdiMessageInput.class);
		EdiMessageService service=SpringContextUtil.getBean(EdiMessageService.class);
		return String.valueOf(m.invoke(service, input));
	}
	
	/**
	 * 生成excel内容
	 * @param file 
	 * @param templateName excel模板名称
	 * @throws Exception
	 */
	private Boolean createEdiExcelContent(File file,String templateName,List<EdiPoolExportDetailOutput> sourceList) throws Exception {
		List<List<String>> dataList=new ArrayList<>();
		if(templateName.equals("{EDI类型}_{年月日}.xls")) {
			for(EdiPoolExportDetailOutput source:sourceList) {
				EvaluationEntryExample evalutionEntryExample=new EvaluationEntryExample();
				EvaluationEntryExample.Criteria criteria=evalutionEntryExample.createCriteria();
				criteria.andCourseEqualTo(source.getCourseId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				if(source.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
					criteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
					EvaluationEntryExample.Criteria criteria2=evalutionEntryExample.createCriteria();
					criteria2.andCourseEqualTo(source.getCourseId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					criteria2.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
					evalutionEntryExample.or(criteria2);
				}
				else {
					criteria.andContainerCategoryEqualTo(source.getContainerCategory());
				}
				List<EvaluationEntry> evalutionEntryList=evaluationEntryDao.selectByExample(evalutionEntryExample);
				dataList.addAll(evalutionEntryList.stream().map(a->{
					List<String> list=new ArrayList<>();
					Course course=courseDao.selectByPrimaryKey(a.getCourse());
					//箱号
					list.add(course.getContainerNo());
					//位置代码
					list.add(a.getPositionCode());
					//部件代码
					list.add(a.getPartsDetailsCode());
					//维修代码
					list.add(a.getRepairCode());
					//损坏代码
					list.add(a.getDamageCode());
					//材质代码
					list.add(a.getMaterialCode());
					//长度
					list.add(a.getLength()==null?"":String.format("%.2f",a.getLength()));
					//宽度
					list.add(a.getWidth()==null?"":String.format("%.2f",a.getWidth()));
					//数量
					list.add(a.getQuantity()==null?"":String.format("%.2f",a.getQuantity()));
					//付费方
					list.add(a.getPayingParty());
					//估价工时
					list.add(a.getManHour()==null?"":String.format("%.2f",a.getManHour()));
					//估价工时费
					list.add(a.getManHourCost()==null?"":String.format("%.2f", a.getManHourCost().doubleValue()));
					//估价材料费
					list.add(a.getMaterialCost()==null?"":String.format("%.2f",a.getMaterialCost().doubleValue()));
					return list;
				}).collect(Collectors.toList()));
			}
			if(dataList.isEmpty()) {
				return false;
			}
			ExcelUtil.writeTemplate1(file, dataList);
		}
		else if(templateName.equals("{EDI类型}_EDI_{年月日}.xls")) {
			for(EdiPoolExportDetailOutput source:sourceList) {
				EvaluationEntryExample evalutionEntryExample=new EvaluationEntryExample();
				EvaluationEntryExample.Criteria criteria=evalutionEntryExample.createCriteria();
				criteria.andCourseEqualTo(source.getCourseId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				if(source.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
					criteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
					EvaluationEntryExample.Criteria criteria2=evalutionEntryExample.createCriteria();
					criteria2.andCourseEqualTo(source.getCourseId()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					criteria2.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
					evalutionEntryExample.or(criteria2);
				}
				else {
					criteria.andContainerCategoryEqualTo(source.getContainerCategory());
				}
				List<EvaluationEntry> evalutionEntryList=evaluationEntryDao.selectByExample(evalutionEntryExample);
				dataList.addAll(evalutionEntryList.stream().map(a->{
					List<String> list=new ArrayList<>();
					Course course=courseDao.selectByPrimaryKey(a.getCourse());
					UnitCourse unitCourse=null;
					if(a.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
						unitCourse=unitCourseDao.selectByPrimaryKey(a.getCourse());
					}
					//估价单号
					list.add(source.getEvaluationNo());
					//箱号
					list.add(course.getContainerNo());
					//箱大小和箱型
					list.add((course.getSize()==null?"":langValue(course.getSize()))+(course.getContainerType()==null?"":langValue(course.getContainerType())));
					//REPAIRCOMPANYCODE
					list.add("");
					//AGENT CODE
					list.add("");
					//CTN STATUS
					list.add("");
					//ONHIRE FLAG
					list.add("");
					//DPP
					list.add(source.getDppFee()==null?"":String.format("%.2f",source.getDppFee()));
					//DPP CURRENCY
					if(unitCourse!=null) {
						if(StringUtils.isNotEmpty(unitCourse.getValuationCurrency()) && unitCourse.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
							list.add("USD");
						}
						else if(StringUtils.isNotEmpty(unitCourse.getValuationCurrency()) && unitCourse.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
							list.add("CNY");
						}
						else {
							list.add("");
						}
					}
					else {
						if(StringUtils.isNotEmpty(course.getValuationCurrency()) && course.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
							list.add("USD");
						}
						else if(StringUtils.isNotEmpty(course.getValuationCurrency()) && course.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
							list.add("CNY");
						}
						else {
							list.add("");
						}
					}
					
					//LABOUR RATE
					list.add("");
					//CURRENCY RateCurrencyEnum
					if(unitCourse!=null) {
						if(StringUtils.isNotEmpty(unitCourse.getValuationCurrency()) && unitCourse.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
							list.add("USD");
						}
						else if(StringUtils.isNotEmpty(unitCourse.getValuationCurrency()) && unitCourse.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
							list.add("CNY");
						}
						else {
							list.add("");
						}
					}
					else {
						if(StringUtils.isNotEmpty(course.getValuationCurrency()) && course.getValuationCurrency().equals(RateCurrencyEnum.USD.getCode())) {
							list.add("USD");
						}
						else if(StringUtils.isNotEmpty(course.getValuationCurrency()) && course.getValuationCurrency().equals(RateCurrencyEnum.CNY.getCode())) {
							list.add("CNY");
						}
						else {
							list.add("");
						}
					}
					//ESTIMATE_DATE  
					SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmm");
					if(unitCourse!=null) {
						list.add(unitCourse.getValuationTime()==null?"":sdf.format(unitCourse.getValuationTime()));
					}
					else {
						list.add(course.getValuationTime()==null?"":sdf.format(course.getValuationTime()));
					}
					//REMARK
					if(unitCourse!=null) {
						list.add(unitCourse.getValuationRemarks());
					}
					else {
						list.add(course.getValuationRemarks());
					}
					//COMPONENTCODE部件代码
					list.add(a.getPartsDetailsCode());
					//LOCATION CODE位置代码
					list.add(a.getPositionCode());
					//DAMAGE CODE损坏代码
					list.add(a.getDamageCode());
					//REPAIR　CODE维修代码
					list.add(a.getRepairCode());
					//MATERIAL CODE材质代码
					list.add(a.getMaterialCode());
					//SPARE PARTS NO.
					list.add(a.getSparesNumber());
					//LENGTH
					list.add(a.getLength()==null?"":String.format("%.2f",a.getLength()));
					//WIDTH
					list.add(a.getWidth()==null?"":String.format("%.2f",a.getWidth()));
					//QUANTITY
					list.add(a.getQuantity()==null?"":String.format("%.2f",a.getQuantity()));
					//HOUR
					list.add(a.getManHour()==null?"":String.format("%.2f",a.getManHour()));
					//LAHOUR
					list.add(a.getManHourCost()==null?"":String.format("%.2f", a.getManHourCost().doubleValue()));
					//MATERIAL RATE
					list.add(a.getMaterialCost()==null?"":String.format("%.2f",a.getMaterialCost().doubleValue()));
					//MATERIAL
					list.add("");
					
					return list;
				}).collect(Collectors.toList()));
			}
			if(dataList.isEmpty()) {
				return false;
			}
			ExcelUtil.writeTemplate1(file, dataList);
		}
		return true;
	}

	/**
	 * 判断是否生成EXCEL文件
	 * @param fileFormat
	 * @return
	 */
	private Boolean isEdiExcel(String fileFormat) {
		Boolean isExcel=fileFormat.toUpperCase().endsWith(".XLS") || 
				fileFormat.toUpperCase().endsWith(".XLSX") ||
				fileFormat.toUpperCase().endsWith(".CSV");
		return isExcel;
	}


	
	/**
	 * 将文件名拆分
	 * @param fileName
	 * @return
	 */
	private String[] splitFileName(String fileName) {
		String prefix=fileName.substring(0,fileName.lastIndexOf("."));
		String suffix=fileName.substring(fileName.lastIndexOf("."));
		return new String[] {prefix,suffix};
	}
	
	/**
	 * 翻译
	 * @param key
	 * @return
	 */
	private String langValue(String key) {
		if(isChineseRequest()) {
			return langService.langValue(key, LanguageEnum.LANGZH, null);
		}
		else {
			return langService.langValue(key, LanguageEnum.LANGEN, null);
		}
	}
	
	/**
	 * 客户edi类型配置查询
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<CompanyEdiConfigOutput> getCompanyEdiList(CompanyEdiSearchInput input) {
		PagedList<CompanyEdiConfigOutput> pagedList=new PagedList<CompanyEdiConfigOutput>(input.getPageIndex(),input.getPageSize());
		CompanyEdiTypeExample example=new CompanyEdiTypeExample();
		CompanyEdiTypeExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if(StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if(StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		if(StringUtils.isNotEmpty(input.getEdiType())) {
			criteria.andEdiTypeEqualTo(input.getEdiType());
		}
		if(StringUtils.isNotEmpty(input.getIsEnabled())) {
			if(input.getIsEnabled().equals(CommonEnum.YES.getCode())) {
				criteria.andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
			}
			else {
				criteria.andIsEnabledEqualTo(PlatformConstants.ISVALID_NO);
			}
		}
		int totalItemCount=(int)ediConfigDao.countByExample(example);
		
		if(totalItemCount==0) {
			return pagedList;
		}
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<CompanyEdiType> list=ediConfigDao.selectByExample(example);
		List<CompanyEdiConfigOutput> dataList=list.stream().map(a->{
			CompanyEdiConfigOutput item=new CompanyEdiConfigOutput();
			item.setConfigId(a.getProdCompanyEdiTypeId());
			item.setCompanyLang(a.getCompany());
			item.setContainerUserLang(a.getContainerUser());
			item.setContainerCategoryLang(a.getContainerCategory());
			item.setEdiTypeLang(a.getEdiType());
			item.setIsUnityQuoteLang(a.getIsUnityQuote());
			item.setEdiFileFormat(ediFileDao.selectByPrimaryKey(a.getEditFileFormat()).getEditFileFormat());
			item.setEvaluationFormat(a.getEstimateFormat());
			item.setEdiFileTemplate(a.getEdiFileTemplate());
			item.setSendTypeLang(a.getSendType());
			item.setEdiMethod(a.getEdiMethod());
			item.setReceiverEmail(a.getSendEmail());
			item.setIsEnabledLang((a.getIsEnabled()!=null && a.getIsEnabled().equals(PlatformConstants.ISVALID_YES))?CommonEnum.YES.getCode():CommonEnum.NO.getCode());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 获取edi配置信息
	 * @param configId
	 * @return
	 */
	@Override
	public EditCompanyEdiOutput getCompanyEdiInfo(Integer configId) {
		CompanyEdiType record=ediConfigDao.selectByPrimaryKey(configId);
		EditCompanyEdiOutput item=new EditCompanyEdiOutput();
		item.setProdCompanyEdiTypeId(record.getProdCompanyEdiTypeId());
		item.setCompany(record.getCompany());
		item.setContainerUser(record.getContainerUser());
		item.setContainerCategory(record.getContainerCategory());
		item.setEdiType(record.getEdiType());
		item.setIsUnityQuote(record.getIsUnityQuote());
		item.setEditFileFormat(record.getEditFileFormat());
		item.setEstimateFormat(record.getEstimateFormat());
		item.setEdiFileTemplate(record.getEdiFileTemplate());
		item.setSendType(record.getSendType());
		item.setEdiMethod(record.getEdiMethod());
		item.setSendEmail(record.getSendEmail());
		item.setIsEnabled((record.getIsEnabled()!=null && record.getIsEnabled().equals(PlatformConstants.ISVALID_YES))?CommonEnum.YES.getCode():CommonEnum.NO.getCode());
		
		return item;
	}

	/**
	 * 修改edi配置信息
	 * @param input
	 */
	@Override
	public void updateCompanyEdiInfo(EditEdiConfigInput input) {
		CompanyEdiType record=ediConfigDao.selectByPrimaryKey(input.getProdCompanyEdiTypeId());
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setContainerCategory(input.getContainerCategory());
		record.setEdiType(input.getEdiType());
		record.setIsUnityQuote(input.getIsUnityQuote());
		record.setEditFileFormat(input.getEditFileFormat());
		record.setEstimateFormat(input.getEstimateFormat());
		record.setEdiFileTemplate(input.getEdiFileTemplate());
		record.setSendType(input.getSendType());
		record.setEdiMethod(input.getEdiMethod());
		record.setSendEmail(input.getSendEmail());
		if(StringUtils.isNotEmpty(input.getIsEnabled()) && input.getIsEnabled().equals(CommonEnum.YES.getCode())) {
			record.setIsEnabled(PlatformConstants.ISENABLED_YES);
		}
		else {
			record.setIsEnabled(PlatformConstants.ISENABLED_NO);
		}
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		ediConfigDao.updateByPrimaryKey(record);
	}

	/**
	 *  新增edi配置信息
	 * @param input
	 */
	@Override
	public void addCompanyEdiInfo(EditEdiConfigInput input) {
		CompanyEdiType record=new CompanyEdiType();
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setContainerCategory(input.getContainerCategory());
		record.setEdiType(input.getEdiType());
		record.setIsUnityQuote(input.getIsUnityQuote());
		record.setEditFileFormat(input.getEditFileFormat());
		record.setEstimateFormat(input.getEstimateFormat());
		record.setEdiFileTemplate(input.getEdiFileTemplate());
		record.setSendType(input.getSendType());
		record.setEdiMethod(input.getEdiMethod());
		record.setSendEmail(input.getSendEmail());
		if(StringUtils.isNotEmpty(input.getIsEnabled()) && input.getIsEnabled().equals(CommonEnum.YES.getCode())) {
			record.setIsEnabled(PlatformConstants.ISENABLED_YES);
		}
		else {
			record.setIsEnabled(PlatformConstants.ISENABLED_NO);
		}
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		ediConfigDao.insert(record);
	}

	/**
	 *  删除edi配置信息
	 * @param ids
	 */
	@Override
	public void deleteCompanyEdiInfo(Integer[] ids) {
		CompanyEdiTypeExample example=new CompanyEdiTypeExample();
		example.createCriteria().andProdCompanyEdiTypeIdIn(Arrays.asList(ids));
		CompanyEdiType record=new CompanyEdiType();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		ediConfigDao.updateByExampleSelective(record, example);
	}

	/**
	 * 获取所有文件格式名
	 * @return
	 */
	@Override
	public List<SelectOutput> getAllFileFormat() {
		List<EdiFile> list=ediFileDao.selectByExample(null);
		return list.stream().map(a->{
			SelectOutput item=new SelectOutput();
			item.setValue(String.valueOf(a.getEditFileId()));
			item.setLabel(a.getEditFileFormat());
			return item;
		}).collect(Collectors.toList());
	}
	
	/**
	 * 获取所有EXCEL模板
	 * @return
	 */
	@Override
	public List<String> getAllExcelTemplates() {
		return SystemUtil.getEdiTemplate(ediTemplateLocation);
	}
	
	/**
	 * 根据公司，用箱人获取对应的edi类型
	 * @param input
	 * @return
	 */
	@Override
	public List<String> getAllEdiConfigByContainerUser(EdiTypeContainerUserInput input) {
		CompanyEdiTypeExample example=new CompanyEdiTypeExample();
		example.createCriteria().andCompanyEqualTo(input.getCompany()).andContainerUserEqualTo(input.getContainerUser())
		.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(PlatformConstants.ISVALID_YES);
		//无需去重
		return ediConfigDao.selectByExample(example).stream().map(a->a.getEdiType()).collect(Collectors.toList());
	}

	/**
	 * edi自动报价配置，查询列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<AutoSendOutput> getAutoSendList(AutoSendSearchInput input) {
		AutomaticSendExample example=new AutomaticSendExample();
		AutomaticSendExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if(StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if(StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		PagedList<AutoSendOutput> pagedList=new PagedList<AutoSendOutput>(input.getPageIndex(),input.getPageSize());
		//总条数
		int totalItemCount=(int)autoSendDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<AutomaticSend> list=autoSendDao.selectByExample(example);
		List<AutoSendOutput> dataList=list.stream().map(a->{
			AutoSendOutput item=new AutoSendOutput();
			item.setAutoSendId(a.getProdAutomaticSendId());
			item.setCompanyNameLang(a.getCompany());
			item.setContainerUserNameLang(a.getContainerUser());
			item.setContainerCategoryNameLang(a.getContainerCategory());
			item.setYardLang(a.getYard());
			item.setTimeInterval(a.getTimeInterval());
			item.setMaxNumber(a.getMaxNumber());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 新增自动报价配置
	 * @param input
	 */
	@Override
	public void addAutoSendConfig(AddAutoSendInput input) {
		AutomaticSendExample example=new AutomaticSendExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
		.andCompanyEqualTo(input.getCompany()).andYardEqualTo(input.getYard())
		.andContainerUserEqualTo(input.getContainerUser())
		.andContainerCategoryEqualTo(input.getContainerCategory());
		if(autoSendDao.countByExample(example)>0) {
			throw new InvalidException("已存在相同场站的配置");
		}
		AutomaticSend record=new AutomaticSend();
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setContainerCategory(input.getContainerCategory());
		record.setYard(input.getYard());
		record.setTimeInterval(input.getTimeInterval());
		record.setMaxNumber(input.getMaxNumber());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		autoSendDao.insert(record);
	}

	/**
	 * 获取自动报价配置
	 * @param id
	 * @return
	 */
	@Override
	public AutoSendDetailOutput getAutoSendConfig(Integer id) {
		AutomaticSend record=autoSendDao.selectByPrimaryKey(id);
		AutoSendDetailOutput item=new AutoSendDetailOutput();
		item.setAutoSendId(record.getProdAutomaticSendId());
		item.setCompany(record.getCompany());
		item.setContainerUser(record.getContainerUser());
		item.setContainerCategory(record.getContainerCategory());
		item.setYard(record.getYard());
		item.setTimeInterval(record.getTimeInterval());
		item.setMaxNumber(record.getMaxNumber());
		return item;
	}

	/**
	 * 修改自动报价配置
	 * @param input
	 */
	@Override
	public void updateAutoSendConfig(EditAutoSendInput input) {
		AutomaticSend record=autoSendDao.selectByPrimaryKey(input.getAutoSendId());
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setContainerCategory(input.getContainerCategory());
		record.setYard(input.getYard());
		record.setTimeInterval(input.getTimeInterval());
		record.setMaxNumber(input.getMaxNumber());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		autoSendDao.updateByPrimaryKey(record);
	}

	/**
	 * 删除自动报价配置
	 * @param id
	 */
	@Override
	public void deleteAutoSendConfig(Integer[] ids) {
		AutomaticSend record=new AutomaticSend();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		
		AutomaticSendExample example=new AutomaticSendExample();
		example.createCriteria().andProdAutomaticSendIdIn(Arrays.asList(ids));
		
		autoSendDao.updateByExampleSelective(record, example);
	}
	
	/**
	 * 自动进入edi池配置查询列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<AutoIntoPoolOutput> getAutoPoolList(AutoIntoPoolSearchInput input) {
		AutomaticEdiPoolExample example=new AutomaticEdiPoolExample();
		AutomaticEdiPoolExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if(StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if(StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		PagedList<AutoIntoPoolOutput> pagedList=new PagedList<AutoIntoPoolOutput>(input.getPageIndex(),input.getPageSize());
		//总条数
		int totalItemCount=(int)autoPoolDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<AutomaticEdiPool> list=autoPoolDao.selectByExample(example);
		List<AutoIntoPoolOutput> dataList=list.stream().map(a->{
			AutoIntoPoolOutput item=new AutoIntoPoolOutput();
			item.setAutoPoolId(a.getProdAutomaticEdiPoolId());
			item.setCompanyNameLang(a.getCompany());
			item.setContainerUserNameLang(a.getContainerUser());
			item.setContainerCategoryNameLang(a.getContainerCategory());
			item.setReplyStateNameLang(a.getReplyState());
			item.setTimeFieldNameLang(a.getTimeField());
			item.setWaitMiniute(a.getWaitMiniute());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 自动进入edi池详细信息
	 * @param input
	 * @return
	 */
	@Override
	public AutoIntoPoolDetailOutput getAutoPoolDetail(Integer id) {
		AutomaticEdiPool record=autoPoolDao.selectByPrimaryKey(id);
		AutoIntoPoolDetailOutput item=new AutoIntoPoolDetailOutput();
		item.setAutoPoolId(record.getProdAutomaticEdiPoolId());
		item.setCompany(record.getCompany());
		item.setContainerUser(record.getContainerUser());
		item.setContainerCategory(record.getContainerCategory());
		item.setReplyState(record.getReplyState());
		item.setTimeField(record.getTimeField());
		item.setWaitMiniute(record.getWaitMiniute());
		return item;
	}

	/**
	 * 新增自动进入edi池配置
	 * @param input
	 */
	@Override
	public void addAutoPoolConfig(AddAutoPoolInput input) {
		AutomaticEdiPoolExample example=new AutomaticEdiPoolExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
		.andCompanyEqualTo(input.getCompany())
		.andContainerUserEqualTo(input.getContainerUser())
		.andContainerCategoryEqualTo(input.getContainerCategory());
		if(autoPoolDao.countByExample(example)>0) {
			throw new InvalidException("已存在相同公司的配置");
		}
		AutomaticEdiPool record=new AutomaticEdiPool();
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setContainerCategory(input.getContainerCategory());
		record.setReplyState(input.getReplyState());
		record.setTimeField(input.getTimeField());
		record.setWaitMiniute(input.getWaitMiniute());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		autoPoolDao.insert(record);
	}

	/**
	 * 修改自动进入edi池配置
	 * @param input
	 */
	@Override
	public void updateAutoPoolConfig(EditAutoPoolInput input) {
		AutomaticEdiPool record=autoPoolDao.selectByPrimaryKey(input.getAutoPoolId());
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setContainerCategory(input.getContainerCategory());
		record.setReplyState(input.getReplyState());
		record.setTimeField(input.getTimeField());
		record.setWaitMiniute(input.getWaitMiniute());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		autoPoolDao.updateByPrimaryKey(record);
	}

	/**
	 * 删除自动进入edi池配置
	 * @param id
	 */
	@Override
	public void deleteAutoPoolConfig(Integer[] ids) {
		AutomaticEdiPool record=new AutomaticEdiPool();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		
		AutomaticEdiPoolExample example=new AutomaticEdiPoolExample();
		example.createCriteria().andProdAutomaticEdiPoolIdIn(Arrays.asList(ids));
		
		autoPoolDao.updateByExampleSelective(record, example);
	}

	/**
	 * EDI文件格式列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<EdiFileDetailOutput> getFileFormatPagedList(EdiFileSearchInput input) {
		EdiFileExample example=new EdiFileExample();
		if(StringUtils.isNotEmpty(input.getKeyword())) {
			example.createCriteria().andEditFileFormatLike("%"+input.getKeyword()+"%");
		}
		PagedList<EdiFileDetailOutput> pagedList=new PagedList<>(input.getPageIndex(),input.getPageSize());
		int totalItemCount=(int)ediFileDao.countByExample(example);
		if(totalItemCount==0) {
			return pagedList;
		}
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<EdiFile> list=ediFileDao.selectByExample(example);
		pagedList.setDataList(list.stream().map(a->{
			EdiFileDetailOutput item=new EdiFileDetailOutput();
			item.setFileId(a.getEditFileId());
			item.setFileFormat(a.getEditFileFormat());
			return item;
		}).collect(Collectors.toList()));
		
		return pagedList;
	}

	/**
	 * 新增EDI文件格式
	 * @param input
	 * @return
	 */
	@Override
	public void addFileFormat(EdiFileDetailOutput input) {
		EdiFile record=new EdiFile();
		record.setEditFileFormat(input.getFileFormat());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		ediFileDao.insert(record);
	}

	/**
	 * 修改EDI文件格式
	 * @param input
	 * @return
	 */
	@Override
	public void updateFileFormat(EdiFileDetailOutput input) {
		EdiFile record=ediFileDao.selectByPrimaryKey(input.getFileId());
		record.setEditFileFormat(input.getFileFormat());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		ediFileDao.updateByPrimaryKey(record);
	}

	/**
	 * 删除EDI文件格式
	 * @param input
	 * @return
	 */
	@Override
	public void deleteFileFormat(Integer[] ids) {
		CompanyEdiTypeExample deleteExample=new CompanyEdiTypeExample();
		deleteExample.createCriteria().andEditFileFormatIn(Arrays.asList(ids));
		if(ediConfigDao.countByExample(deleteExample)>0) {
			throw new InvalidException("EDI格式已使用，无法删除");
		}
		EdiFileExample example=new EdiFileExample();
		example.createCriteria().andEditFileIdIn(Arrays.asList(ids));
		ediFileDao.deleteByExample(example);
	}

	/**
	 * 获取EDI文件格式
	 * @param input
	 * @return
	 */
	@Override
	public EdiFileDetailOutput getFileFormat(Integer id) {
		EdiFile record=ediFileDao.selectByPrimaryKey(id);
		EdiFileDetailOutput item=new EdiFileDetailOutput();
		item.setFileFormat(record.getEditFileFormat());
		item.setFileId(record.getEditFileId());
		return item;
	}

	/**
	 * 公司-用箱人 接收地址配置搜索条件
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<CompanyContainerUserOutput> getCompanyContainerUserPagedList(
			CompanyContainerUserSearchInput input) {
		PagedList<CompanyContainerUserOutput> pagedList=new PagedList<>(input.getPageIndex(),input.getPageSize());
		CompanyCustomerExample example=new CompanyCustomerExample();
		CompanyCustomerExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if(StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		pagedList.setTotalItemCount((int)companyCustomerDao.countByExample(example));
		if(pagedList.getTotalItemCount().intValue()==0) {
			return pagedList;
		}
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<CompanyCustomer> list=companyCustomerDao.selectByExample(example);
		List<CompanyContainerUserOutput> dataList=list.stream().map(a->{
			CompanyContainerUserOutput item=new CompanyContainerUserOutput();
			item.setPrimaryId(a.getProdEdiTypeId());
			item.setCompany(a.getCompany());
			item.setCompanyNameLang(a.getCompany());
			item.setContainerUser(a.getContainerUser());
			item.setContainerUserNameLang(a.getContainerUser());
			item.setFtpReceiveAddress(a.getFtpReceiveAddress());
			item.setFtpReceivePort(a.getFtpReceivePort());
			item.setFtpReceiveDirectory(a.getFtpReceiveDirectory());
			item.setFtpSendAccount(a.getFtpSendAccount());
			item.setFtpSendPwd(a.getFtpSendPwd());
			item.setSendEmailAddress(a.getSendEmailAddress());
			item.setSendSmtpContent(a.getSendSmtpContent());
			item.setSendSmtpPort(a.getSendSmtpPort());
			item.setEmailUser(a.getEmailUser());
			item.setEmailPwd(a.getEmailPwd());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 获取公司-用箱人 接收地址配置
	 * @param id
	 * @return
	 */
	@Override
	public CompanyContainerUserOutput getCompanyContainerUser(Integer id) {
		CompanyCustomer a=companyCustomerDao.selectByPrimaryKey(id);
		CompanyContainerUserOutput item=new CompanyContainerUserOutput();
		item.setPrimaryId(a.getProdEdiTypeId());
		item.setCompany(a.getCompany());
		item.setCompanyNameLang(a.getCompany());
		item.setContainerUser(a.getContainerUser());
		item.setContainerUserNameLang(a.getContainerUser());
		item.setFtpReceiveAddress(a.getFtpReceiveAddress());
		item.setFtpReceivePort(a.getFtpReceivePort());
		item.setFtpReceiveDirectory(a.getFtpReceiveDirectory());
		item.setFtpSendAccount(a.getFtpSendAccount());
		item.setFtpSendPwd(a.getFtpSendPwd());
		item.setSendEmailAddress(a.getSendEmailAddress());
		item.setSendSmtpContent(a.getSendSmtpContent());
		item.setSendSmtpPort(a.getSendSmtpPort());
		item.setEmailUser(a.getEmailUser());
		item.setEmailPwd(a.getEmailPwd());
		return item;
	}

	/**
	 * 新增公司-用箱人 接收地址配置
	 * @param input
	 */
	@Override
	public void addCompanyContainerUser(CompanyContainerUserOutput input) {
		CompanyCustomer record=new CompanyCustomer();
		 
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setFtpReceiveAddress(input.getFtpReceiveAddress());
		record.setFtpReceivePort(input.getFtpReceivePort());
		record.setFtpReceiveDirectory(input.getFtpReceiveDirectory());
		record.setFtpSendAccount(input.getFtpSendAccount());
		record.setFtpSendPwd(input.getFtpSendPwd());
		record.setSendEmailAddress(input.getSendEmailAddress());
		record.setSendSmtpContent(input.getSendSmtpContent());
		record.setSendSmtpPort(input.getSendSmtpPort());
		record.setEmailUser(input.getEmailUser());
		record.setEmailPwd(input.getEmailPwd());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		companyCustomerDao.insert(record);
	}

	/**
	 * 修改公司-用箱人 接收地址配置
	 * @param input
	 */
	@Override
	public void updateCompanyContainerUser(CompanyContainerUserOutput input) {
		CompanyCustomer record=companyCustomerDao.selectByPrimaryKey(input.getPrimaryId());
		 
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setFtpReceiveAddress(input.getFtpReceiveAddress());
		record.setFtpReceivePort(input.getFtpReceivePort());
		record.setFtpReceiveDirectory(input.getFtpReceiveDirectory());
		record.setFtpSendAccount(input.getFtpSendAccount());
		record.setFtpSendPwd(input.getFtpSendPwd());
		record.setSendEmailAddress(input.getSendEmailAddress());
		record.setSendSmtpContent(input.getSendSmtpContent());
		record.setSendSmtpPort(input.getSendSmtpPort());
		record.setEmailUser(input.getEmailUser());
		record.setEmailPwd(input.getEmailPwd());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		companyCustomerDao.updateByPrimaryKey(record);
	}
	
	/**
	 * 删除公司-用箱人 接收地址配置
	 * @param ids
	 */
	@Override
	public void deleteCompanyContainerUser(Integer[] ids) {
		CompanyCustomer record=new CompanyCustomer();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		
		CompanyCustomerExample example=new CompanyCustomerExample();
		example.createCriteria().andProdEdiTypeIdIn(Arrays.asList(ids));
		
		companyCustomerDao.updateByExampleSelective(record, example);
	}

	/**
	 * 公司与代码对应搜索列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<CompanyCodeOutput> getCompanyCodePagedList(CompanyCodeSearchInput input) {
		CompanyCodeExample example=new CompanyCodeExample();
		CompanyCodeExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(StringUtils.isNotEmpty(input.getCompany())) {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if(StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if(StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		PagedList<CompanyCodeOutput> pagedList=new PagedList<>(input.getPageIndex(),input.getPageSize());
		int totalItemCount=(int)companyCodeDao.countByExample(example);
		if(totalItemCount==0) {
			return pagedList;
		}
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<CompanyCodeOutput> dataList=companyCodeDao.selectByExample(example)
				.stream().map(record->{
					CompanyCodeOutput item=new CompanyCodeOutput();
					item.setCodeId(record.getProdCompanyCodeId());
					item.setCompany(record.getCompany());
					item.setCompanyNameLang(record.getCompany());
					item.setContainerUser(record.getContainerUser());
					item.setContainerUserNameLang(record.getContainerUser());
					item.setYard(record.getYard());
					item.setYardNameLang(record.getYard());
					item.setSendCode(record.getSendCode());
					item.setReceptionCode(record.getReceptionCode());
					item.setFacilityCode(record.getFacilityCode());
					return item;
				}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 获取公司与代码对应
	 * @param id
	 * @return
	 */
	@Override
	public CompanyCodeOutput getCompanyCode(Integer id) {
		CompanyCode record=companyCodeDao.selectByPrimaryKey(id);
		CompanyCodeOutput item=new CompanyCodeOutput();
		item.setCodeId(record.getProdCompanyCodeId());
		item.setCompany(record.getCompany());
		item.setCompanyNameLang(record.getCompany());
		item.setContainerUser(record.getContainerUser());
		item.setContainerUserNameLang(record.getContainerUser());
		item.setYard(record.getYard());
		item.setYardNameLang(record.getYard());
		item.setSendCode(record.getSendCode());
		item.setReceptionCode(record.getReceptionCode());
		item.setFacilityCode(record.getFacilityCode());
		return item;
	}

	/**
	 * 新增公司与代码对应
	 * @param input
	 */
	@Override
	public void addCompanyCode(CompanyCodeOutput input) {
		CompanyCode record=new CompanyCode();
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setYard(input.getYard());
		record.setSendCode(input.getSendCode());
		record.setReceptionCode(input.getReceptionCode());
		record.setFacilityCode(input.getFacilityCode());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		companyCodeDao.insert(record);
	}

	/**
	 * 修改公司与代码对应
	 * @param input
	 */
	@Override
	public void updateCompanyCode(CompanyCodeOutput input) {
		CompanyCode record=companyCodeDao.selectByPrimaryKey(input.getCodeId());
		record.setCompany(input.getCompany());
		record.setContainerUser(input.getContainerUser());
		record.setYard(input.getYard());
		record.setSendCode(input.getSendCode());
		record.setReceptionCode(input.getReceptionCode());
		record.setFacilityCode(input.getFacilityCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		companyCodeDao.updateByPrimaryKey(record);
	}

	/**
	 * 删除公司与代码对应
	 * @param ids
	 */
	@Override
	public void deleteCompanyCode(Integer[] ids) {
		CompanyCode record=new CompanyCode();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		
		CompanyCodeExample example=new CompanyCodeExample();
		example.createCriteria().andProdCompanyCodeIdIn(Arrays.asList(ids));
		
		companyCodeDao.updateByExampleSelective(record, example);
	}
}
