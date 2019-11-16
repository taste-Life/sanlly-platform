package com.sanlly.production.service.impl;

import cn.hutool.core.convert.Convert;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.production.dao.*;
import com.sanlly.production.entity.*;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.EdiSenderEnum;
import com.sanlly.production.models.input.edi.AddEdiMessageInput;
import com.sanlly.production.service.EdiMessageService;
import com.sanlly.production.service.LangService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.ScrollBarUI;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class EdiMessageServiceImpl extends BaseServiceImpl implements EdiMessageService {


    @Autowired
    private EdiPoolMapper ediPoolMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UnitCourseMapper unitCourseMapper;
    @Autowired
    private EvaluationEntryMapper evaluationEntryMapper;
    @Autowired
    private ManhourRateMapper manhourRateMapper;

    @Autowired
    private  ContainerGradeMapper containerGradeMapper;

    @Autowired
    private  PartsTypeMapper partsTypeMapper;

    @Autowired
    private  CourseTypeMapper courseTypeMapper;

    @Autowired
    private LangService langService;

    @Autowired
    private  EdiMessageMapperExt ediMessageMapperExt;

    @Autowired
    private  RateMapper rateMapper;

    @Autowired
    private EdiEvaluationSerialMapper serialDao;

    private String lineBreak = System.getProperty("line.separator");//获取换行符


    /**
     * 生成edi序号
     * @return
     */
    public String generateEdiMessageSequence(String ediTypeKey){
        //从数据库获取下一条序号
        EdiEvaluationSerial record=serialDao.selectByPrimaryKey(ediTypeKey);
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
            record.setProdEdiFormat(ediTypeKey);
            record.setCreateTime(new Date());
            record.setCreateUser(getCurrentUserId());
            record.setCurrentNumber(number);
            serialDao.insert(record);
        }
        String numberFormat="000"+number;
        return numberFormat;
    }

    /**
    *@Description: 中远估价edi
    *@Param: [courses, loginYard]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-16
    */
    @Override
    public String getCOSWestimEDI(AddEdiMessageInput input) {
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");

        String ediText = "";//返回报文串
        String placeCode = "";//位置代码
        String matCode = "";//材质代码
        String partCodeB = "";//部件明细
        int iRowCount = 0; //每个箱子报文行数
        int iCntrCount = 0; //箱子序号数
        int iOCount = 0;
        String feePayer = ""; //付费方
        StringBuilder sb = new StringBuilder();
        //生成一个序号
        String sequence = generateEdiMessageSequence("EDI_COS");
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        //发送方
        String sender = input.getEdiConfig().getSendCode();
        //接收方
        String receiver = input.getEdiConfig().getReceptionCode();
/*        if(loginYard.equals("LKYARD000001")){ //登录的场站  神州场站
            sender = EdiSenderEnum.COS_SENDER_SZX.getCode();
        } else if (loginYard.equals("LKYARD000015"))   //港联海
        {
            sender = EdiSenderEnum.COS_SENDER_GLH.getCode();
        }
        else if (loginYard.equals("LKYARD000018"))  //董家口
        {
            sender = EdiSenderEnum.COS_SENDER_DJK.getCode();
        }
        else
        {
            sender = EdiSenderEnum.COS_SENDER.getCode();
        }*/
        String currentTime = sdfDateTime.format(new Date());
        sb.append("UNB+UNOA:1+"+sender+":ZZ+"+receiver+":ZZ+"+currentTime+"+"+sequence+"'"+lineBreak);

        for(EdiPool ediPool : ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            UnitCourseExample unitCourseExample = new UnitCourseExample();
            unitCourseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);//机组
            UnitCourse  unitCourseEntity = null;
            if(unitCourseList !=null && unitCourseList.size()>0){
                unitCourseEntity = unitCourseList.get(0);
            }
            EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
            if(ContainerCategoryEnum.CONTAINER_05.getCode().equals(ediPool.getContainerCategory())){//整体（冷箱）
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0"));
            }else{
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0")).andContainerCategoryEqualTo(ediPool.getContainerCategory());

            }
            //查询估价信息条数
            long cn = evaluationEntryMapper.countByExample(evaluationEntryExample);
            if( (courseEntity !=null || unitCourseEntity !=null) && cn>0){ //机组或箱体有数据
                String gjdh = ediPool.getEvaluateNo();//估价单号
                Date gjrq; //估价日期
                if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    gjrq = courseEntity.getValuationTime()==null? new Date():courseEntity.getValuationTime();
                }else if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())){//机组
                    gjrq = unitCourseEntity.getValuationTime() == null? new Date():unitCourseEntity.getValuationTime();
                }else{
                    gjrq = new Date();
                }

                iRowCount = 0; //报文行数
                String westimAdvice = ediPool.getWestimAdvice()==null?"":ediPool.getWestimAdvice();
                sb.append("UNH+"+(iCntrCount+1)+"+WESTIM:0+"+westimAdvice+"+1'"+lineBreak);
                sb.append("DTM+ATR+"+sdfDateTime.format(gjrq)+"'"+lineBreak);
                sb.append("RFF+EST+"+gjdh+"+"+sdfDate.format(gjrq)+"'"+lineBreak);
                sb.append("RFF+ADV+1'"+lineBreak);
                sb.append("ACA+CNY+STD:0.00'"+lineBreak);
                sb.append("ACA+CNY+DPP:0.00'"+lineBreak);
                sb.append("LBR+"+getLabRate(containerUser, ediPool.getContainerCategory())+"'"+lineBreak);
                sb.append("NAD+DED+"+sender+"'"+lineBreak);
                sb.append("NAD+LED+"+receiver+"'"+lineBreak);
                sb.append("EQF+CON+"+ediPool.getContainerNo().substring(0,4)+":"+ediPool.getContainerNo().substring(4)+"+"+getISO95CntrSizeAndType(ediPool.getCourse())+"+MGW:0:KGM'"+lineBreak);
                sb.append("ERI++MAN:"+sdfDate.format(gjrq)+"+ACEP'"+lineBreak);

                String containerGrade = ""; //箱等级翻译
                if(StringUtils.isNotBlank(courseEntity.getContainerGrade())){
                    ContainerGradeExample containerGradeExample = new ContainerGradeExample();
                    containerGradeExample.createCriteria().andKeyEqualTo(courseEntity.getContainerGrade());
                    List<ContainerGrade> containerGradeList = containerGradeMapper.selectByExample(containerGradeExample);
                    if(containerGradeList!=null && containerGradeList.size()>0){
                        containerGrade = containerGradeList.get(0).getContainerGradeName();
                    }
                }
                //通过箱等级代码找到箱等级
                if (containerGrade.equals("A"))
                {
                    sb.append("ECI+AAA'"+lineBreak);
                }
                else if (containerGrade.equals("B"))
                {
                    sb.append("ECI+BBB'"+lineBreak);
                }
                else if (containerGrade.equals("C"))
                {
                    sb.append("ECI+CCC'"+lineBreak);
                }
                else
                {
                    sb.append("ECI+D'"+lineBreak);
                }
                sb.append("CUI+TRM:"+sender+"+TRM:"+sdfDate.format(gjrq)+":0000'"+lineBreak);
                iRowCount += 13;
                List<EvaluationEntry> listValuationInfo = getCMAValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory(), false);
                int valinfoCount = 1;
                for(EvaluationEntry evaluationEntry:listValuationInfo){
                    if (StringUtils.isNotBlank(evaluationEntry.getPayingParty())   && evaluationEntry.getPayingParty().equals("T")){
                        feePayer = "1";
                    }else if(StringUtils.isNotBlank(evaluationEntry.getPayingParty())   && evaluationEntry.getPayingParty().equals("O")){
                        feePayer = "0";
                    }else if(StringUtils.isNotBlank(evaluationEntry.getPayingParty())   && evaluationEntry.getPayingParty().equals("R")){
                        feePayer = "17";
                    }else if(StringUtils.isNotBlank(evaluationEntry.getPayingParty())   && evaluationEntry.getPayingParty().equals("TNR")){
                        feePayer = "18";
                    }else{
                        feePayer = evaluationEntry.getPayingParty();
                    }

                    String partTypeCode = "";
                    if (evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())  || evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode()))
                    { //箱体或干箱
                        placeCode = evaluationEntry.getPositionCode();
                        matCode = evaluationEntry.getMaterialCode();
                        partCodeB = convertCOSPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                    }
                    else
                    {
                        //获取部件大类中文
                        partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                        String partType = getpartTypeByCode(partTypeCode);
                        placeCode = getUnitPlaceCodeByPartCodeA(partType);
                        matCode = "MU";
                        partCodeB = convertCOSPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                    }
                    sb.append("DAM+"+(valinfoCount++)+"+"+placeCode+"+"+partCodeB+"+"+evaluationEntry.getDamageCode()+"+SK'"+lineBreak);
                   //长和宽转换为保留两位
                    String length = coverRemainTwo(evaluationEntry.getLength());
                    String width = coverRemainTwo(evaluationEntry.getWidth());
                    double amt =  evaluationEntry.getQuantity();//数量
                    String  quantity = (int)amt+"";
                    sb.append("WOR+"+convertCOSRepCode(evaluationEntry.getRepairCode())+"+CMT:"+length+":"+width+":0+"+quantity+"'"+lineBreak);
                    String manHour = coverRemainTwo(evaluationEntry.getManHour()); //工时
                    String materialCost = coverRemainTwo(evaluationEntry.getMaterialCost().doubleValue());//材料费
                    //获取工时费率
                    String labrate  = coverRemainTwo(Double.parseDouble(getLabRate(containerUser, ediPool.getContainerCategory())));
                    sb.append("COS+00+"+manHour+"+"+materialCost+"+"+feePayer+"+"+labrate+"'"+lineBreak);
                    iRowCount += 3;
                }
                List<Map<String, Object>> feeCostGroupByCntrNoAndFeePayer = getFeeCostGroupByCntrNoAndFeePayer(ediPool.getCourse());
                double dTotalFee = 0;
                double dPTIFee = 0;//CMA固定的PTI费用
                String sPTIRepCode = "";
                String sPTIPartCodeB = "";
                String sPTIDmgCode = "";
                iOCount = 0;
                for(Map<String,Object> map : feeCostGroupByCntrNoAndFeePayer){
                    if((map.get("paying_party")+"").equals("O")){
                        //工时费保留两位小数
                        String man_hour_cost = coverRemainTwo(Double.parseDouble(map.get("man_hour_cost") + ""));
                        //材料费
                        String material_cost = coverRemainTwo(Double.parseDouble(map.get("material_cost") + ""));
                        material_cost = Double.parseDouble(material_cost)+dPTIFee+"";
                        //总费用
                        String sum_money = coverRemainTwo(Double.parseDouble(map.get("sum_money") + ""));
                        sum_money = Double.parseDouble(sum_money)+dPTIFee+"";
                        sb.append("CTO+0+"+man_hour_cost+"+"+material_cost+"+0.00+0.00+"+sum_money+"'"+lineBreak);
                        dTotalFee += Double.parseDouble(map.get("sum_money") + "") + dPTIFee;
                        iRowCount++;
                        iOCount++;
                    }else{
                        String paying_party= (map.get("paying_party")+"").equals("T") ? "1" :map.get("paying_party")+"";
                        //工时费保留两位小数
                        String man_hour_cost = coverRemainTwo(Double.parseDouble(map.get("man_hour_cost") + ""));
                        //材料费
                        String material_cost = coverRemainTwo(Double.parseDouble(map.get("material_cost") + ""));
                        //总费用
                        String sum_money = coverRemainTwo(Double.parseDouble(map.get("sum_money") + ""));
                        sb.append("CTO+"+paying_party+"+"+man_hour_cost+"+"+material_cost+"+0.00+0.00+"+sum_money+"'"+lineBreak);
                        dTotalFee += Double.parseDouble(map.get("sum_money") + "") + dPTIFee;
                        iRowCount++;
                    }
                }
                sb.append("TMA+"+coverRemainTwo(dTotalFee)+"'"+lineBreak);
                iRowCount += 2;
                sb.append("UNT+"+iRowCount+"+"+(iCntrCount+1)+"'"+lineBreak);
                iCntrCount++;

            }
        }
        sb.append("UNZ+"+iCntrCount+"+"+sequence+"'");
        ediText = sb.toString();
        System.out.println(ediText);
        return ediText;
    }
    /**
    *@Description: CMA估价EDI
    *@Param: [courses, loginYard]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-18
    */
    @Override
    public String getCMAWestimEDI(AddEdiMessageInput input) {
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String sender = input.getEdiConfig().getSendCode();//edi发送方
        String receiver = input.getEdiConfig().getReceptionCode(); //接受方
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        String ediText = "";
        String placeCode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";//部件明细
        String gateintype = "";
        int iRowCount = 0, iCntrCount = 0, iDetailCount = 0,iUCount=0;
        StringBuilder sb = new StringBuilder();
       /* if(loginYard.equals("LKYARD000035")){  //中创
            sender = EdiSenderEnum.CMA_CML_SENDER.getCode();
        }else{
            sender = EdiSenderEnum.CMA_SENDER.getCode();
        }
        if(loginYard.equals("LKYARD000013") || loginYard.equals("LKYARD000004")){ // 港联捷    QQCTU
            sender = EdiSenderEnum.CMA_GLJ_SENDER.getCode();
        }*/
        //生成一个序号
        String sequence = generateEdiMessageSequence("EDI_CMA");
        sb.append("UNB+UNOA:1+"+sender+"+"+receiver+"+"+sdfDateTime.format(new Date())+"+"+sequence+"'"+lineBreak);
        for(EdiPool ediPool:ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            UnitCourseExample unitCourseExample = new UnitCourseExample();
            unitCourseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);//机组
            UnitCourse  unitCourseEntity = null;
            if(unitCourseList !=null && unitCourseList.size()>0){
                unitCourseEntity = unitCourseList.get(0);
            }
            //翻译过后的进场类型
            String courseTypeValue = langService.langValue(courseEntity.getCourseType(), LanguageEnum.LANGZH ,null);
            if(courseTypeValue.equals("重箱进口") || courseTypeValue.equals("重箱出口") || courseTypeValue.equals("中转过境")){
                gateintype = "F";
            }else{
                gateintype = "E";
            }
            EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
            if(ContainerCategoryEnum.CONTAINER_05.getCode().equals(ediPool.getContainerCategory())){//整体（冷箱）
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0"));
            }else{
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0")).andContainerCategoryEqualTo(ediPool.getContainerCategory());

            }
            //查询估价信息条数
            long cn = evaluationEntryMapper.countByExample(evaluationEntryExample);
            if( (courseEntity !=null || unitCourseEntity !=null) && cn>0) { //机组或箱体有数据
                String gjdh = ediPool.getEvaluateNo();//估价单号
                Date gjrq; //估价日期
                if (ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {//箱体
                    gjrq = courseEntity.getValuationTime() == null ? new Date() : courseEntity.getValuationTime();
                } else if (ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {//机组
                    gjrq = unitCourseEntity.getValuationTime() == null ? new Date() : unitCourseEntity.getValuationTime();
                } else {
                    gjrq = new Date();
                }
                List<EvaluationEntry> listValuationInfo = getCMAValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory(), false);

                String comm = "";//箱子进场时间？？箱年龄？
                iRowCount = 0; //报文行数
                String westimAdvice = ediPool.getWestimAdvice()==null?"":ediPool.getWestimAdvice();
                sb.append("UNH+"+gjdh+"+WESTIM:0+"+westimAdvice+"+1'"+lineBreak);
                sb.append("DTM+ATR+"+sdfDate.format(gjrq)+"'"+lineBreak);
                sb.append("RFF+EST+"+gjdh+"+"+sdfDate.format(gjrq)+"'"+lineBreak);
//                sb.append("RFF+ADV+1'"+lineBreak);
                sb.append("ACA+CNY+STD:0'"+lineBreak);
                sb.append("ACA+CNY+DPP:0'"+lineBreak);
                sb.append("LBR+"+getLabRate(containerUser, ediPool.getContainerCategory())+"'"+lineBreak);
                sb.append("NAD+DED+"+sender+"'"+lineBreak);
                sb.append("NAD+LED+"+receiver+"'"+lineBreak);
                sb.append("EQF+REF+"+ediPool.getContainerNo().substring(0,4)+":"+ediPool.getContainerNo().substring(4)+"+"+getISO95CntrSizeAndType(ediPool.getCourse())+"'"+lineBreak);
                sb.append("ERI+SK+MAN:"+comm+"+ACEP'"+lineBreak);
                sb.append("ECI+D'");
                sb.append("CUI+++"+gateintype+"'");
                iRowCount += 12;
                int valinfoCount = 1;
                for(EvaluationEntry evaluationEntry : listValuationInfo){
                    if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                        placeCode = evaluationEntry.getPositionCode();
                        matcode = evaluationEntry.getMaterialCode();
                        partcodeB = getCMAPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0, 3));
                      /*  if(courseEntity.getIsSurrender().equals(CommonEnum.NO.getCode())&& containerUser.equals()){

                        }*/
                    }else{
                        String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                        String partType = getpartTypeByCode(partTypeCode);
                        placeCode = getUnitPlaceCodeByPartCodeA(partType);
                        matcode = "MU";
                        partcodeB = getCMAPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0, 3));
                    }
                    sb.append("DAM+"+(valinfoCount++)+"+"+placeCode+"+"+partcodeB+"+"+evaluationEntry.getDamageCode()+"+"+matcode+"'"+lineBreak);

                    //长和宽转换为保留两位
                    String length = coverRemainTwo(evaluationEntry.getLength());
                    String width = coverRemainTwo(evaluationEntry.getWidth());
                    double amt =  evaluationEntry.getQuantity();//数量
                    String  quantity = (int)amt+"";
                    sb.append("WOR+"+convertCOSRepCode(evaluationEntry.getRepairCode())+"+CMT:"+length+":"+width+":0+"+quantity+"'"+lineBreak);
                    String manHour = coverRemainTwo(evaluationEntry.getManHour()); //工时
                    String materialCost = coverRemainTwo(evaluationEntry.getMaterialCost().doubleValue());//材料费
                    //获取工时费率
                    String labrate  = coverRemainTwo(Double.parseDouble(getLabRate(containerUser, ediPool.getContainerCategory())));
                    sb.append("COS+00+"+manHour+"+"+materialCost+"+"+evaluationEntry.getPayingParty()+"+"+labrate+"'"+lineBreak);
                    iRowCount += 3;
                }
                String  valinfoCountstr =  coverRemainTwo(valinfoCount);
                sb.append("DAM+"+valinfoCountstr+"+MXXX+MCO+ZZ+ZZ'");
                sb.append("WOR+PI+CMT:0:0:0+1'");
                String labrateStr  = coverRemainTwo(Double.parseDouble(getLabRate(containerUser, ContainerCategoryEnum.CONTAINER_03.getCode())));
                sb.append("COS+00+0+177.00+U+"+labrateStr+"'");
                iRowCount += 3;
                List<Map<String, Object>> feeCostGroupByCntrNoAndFeePayer = getFeeCostGroupByCntrNoAndFeePayer(ediPool.getCourse());
                double dTotalFee = 0;
                for (Map<String, Object> map :feeCostGroupByCntrNoAndFeePayer)
                {
                    if("U".equals(map.get("paying_party")+"")){
                        //工时费保留两位小数
                        String man_hour_cost = coverRemainTwo(Double.parseDouble(map.get("man_hour_cost") + ""));
                        //材料费
                        String material_cost = coverRemainTwo(Double.parseDouble(map.get("material_cost") + ""));
                        material_cost = Double.parseDouble(material_cost)+177+"";
                        //总费用
                        String sum_money = coverRemainTwo(Double.parseDouble(map.get("sum_money") + ""));
                        sum_money = Double.parseDouble(sum_money)+177+"";
                        sb.append("CTO+0+"+man_hour_cost+"+"+material_cost+"+0.00+0.00+"+sum_money+"'"+lineBreak);
                        dTotalFee += Double.parseDouble(map.get("sum_money") + "") + 177;
                        iRowCount++;
                        iUCount++;
                    }else{
                        String paying_party= map.get("paying_party")+"";
                        //工时费保留两位小数
                        String man_hour_cost = coverRemainTwo(Double.parseDouble(map.get("man_hour_cost") + ""));
                        //材料费
                        String material_cost = coverRemainTwo(Double.parseDouble(map.get("material_cost") + ""));
                        //总费用
                        String sum_money = coverRemainTwo(Double.parseDouble(map.get("sum_money") + ""));
                        sb.append("CTO+"+paying_party+"+"+man_hour_cost+"+"+material_cost+"+0.00+0.00+"+sum_money+"'"+lineBreak);
                        dTotalFee += Double.parseDouble(map.get("sum_money") + "");
                        iRowCount++;
                    }

                }
                if (iUCount == 0)
                {
                    sb.append("CTO+U+0.00+177.00+0.00+0.00+177.00'");
                    dTotalFee += 177;
                    iRowCount++;
                }
                String dTotalFeeStr = coverRemainTwo(dTotalFee);
                sb.append("TMA+"+dTotalFeeStr+"'");
                iRowCount += 2;
                sb.append("UNT+"+iRowCount+"+"+gjdh+"'");
                iCntrCount++;
            }
        }
        sb.append("UNZ+"+iCntrCount+"+"+sequence+"'");
        ediText = sb.toString();
        return ediText;
    }

    /**
    *@Description: CMAPTIEDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-21
    */
    @Override
    public String getCMAPTIEDI(AddEdiMessageInput input) {
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String sender = input.getEdiConfig().getSendCode();//edi发送方
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        String ediText = "";
        String placeCode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";//部件明细
        String gateintype = "";
        int iRowCount = 0, iCntrCount = 0, iDetailCount = 0;
        StringBuilder sb = new StringBuilder();
/*        if(loginYard.equals("LKYARD000035")){ //中创
            sender = EdiSenderEnum.CMA_CML_SENDER.getCode();
        }else{
            sender = EdiSenderEnum.CMA_SENDER.getCode();
        }
        if(loginYard.equals("LKYARD000013") || loginYard.equals("LKYARD000004")){ //港联捷 QQCTU
            sender = EdiSenderEnum.CMA_GLJ_SENDER.getCode();
        }*/
        //生成一个序号
        String sequence = generateEdiMessageSequence("EDI_CMA");
        String currentTime = sdfDateTime.format(new Date());
        sb.append("UNB+UNOA:1+"+sender+":ZZ+"+receiver+"+"+currentTime+"+"+sequence+"'"+lineBreak);
        for(EdiPool ediPool: ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            UnitCourseExample unitCourseExample = new UnitCourseExample();
            unitCourseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);//机组
            UnitCourse  unitCourseEntity = null;
            if(unitCourseList !=null && unitCourseList.size()>0){
                unitCourseEntity = unitCourseList.get(0);
            }
            //翻译过后的进场类型
            String courseTypeValue = langService.langValue(courseEntity.getCourseType(), LanguageEnum.LANGZH,null);
            if(courseTypeValue.equals("重箱进口") || courseTypeValue.equals("重箱出口") || courseTypeValue.equals("中转过境")){
                gateintype = "F";
            }else{
                gateintype = "E";
            }
            EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
            if(ContainerCategoryEnum.CONTAINER_05.getCode().equals(ediPool.getContainerCategory())){//整体（冷箱）
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0"));
            }else{
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0")).andContainerCategoryEqualTo(ediPool.getContainerCategory());

            }
            //查询估价信息条数
            long cn = evaluationEntryMapper.countByExample(evaluationEntryExample);
            String gjdh = ediPool.getEvaluateNo();//估价单号
            Date gjrq; //估价日期
            if (ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {//箱体
                gjrq = courseEntity.getValuationTime() == null ? new Date() : courseEntity.getValuationTime();
            } else if (ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {//机组
                gjrq = unitCourseEntity.getValuationTime() == null ? new Date() : unitCourseEntity.getValuationTime();
            } else {
                gjrq = new Date();
            }
            iRowCount = 0;
            String westim_advice =  ediPool.getWestimAdvice()==null? "":ediPool.getWestimAdvice();
            sb.append("UNH+"+gjdh+"+WESTIM:0+"+westim_advice+"+1'");
            sb.append("DTM+ATR+"+sdfDate.format(gjrq)+"'");
            sb.append("RFF+EST+"+gjdh+"+"+sdfDate.format(gjrq)+"'");
            sb.append("ACA+CNY+STD:0'");
            sb.append("ACA+CNY+DPP:0'");
            sb.append("LBR+"+getLabRate(containerUser, ediPool.getContainerCategory())+"'");
            sb.append("NAD+DED+"+sender+"'");
            sb.append("NAD+LED+"+receiver+"'");
            sb.append("EQF+REF+"+ediPool.getContainerNo().substring(0,4)+":"+ediPool.getContainerNo().substring(4)+"+"+getISO95CntrSizeAndType(ediPool.getCourse())+"'"+lineBreak);
            sb.append("ERI+SK+MAN:"+sdfDate.format(gjrq)+"+ACEP'");
            sb.append("ECI+D'");
            sb.append("CUI+++"+gateintype+"'");
            iRowCount += 12;

            sb.append("DAM+01+MXXX+MCO+ZZ+ZZ'");
            sb.append("WOR+PI+CMT:0:0:0+1'");
            String labRateStr = getLabRate(containerUser, ContainerCategoryEnum.CONTAINER_03.getCode()); //机组
            String labRateRemainTwoStr="";
            if(StringUtils.isNotBlank(labRateStr)){
                labRateRemainTwoStr = coverRemainTwo(Double.parseDouble(labRateStr));
            }
            sb.append("COS+00+0+177.00+U+"+labRateRemainTwoStr+"'");
            iRowCount += 3;
            double dTotalFee = 177;
            sb.append("CTO+U+0.00+177.00+0.00+0.00+177.00'");
            iRowCount++;
            String dTotalFeeStr = coverRemainTwo(dTotalFee);
            sb.append("TMA+"+dTotalFeeStr+"'");
            iRowCount += 2;
            sb.append("UNT+"+iRowCount+"+"+gjdh+"'");
            iCntrCount++;
        }
        sb.append("UNZ+"+iCntrCount+"+"+sequence+"'");
        ediText = sb.toString();
        return ediText;
    }

    /**
    *@Description: ONE 估价EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-22
    */
    @Override
    public String getONEWestimEDI(AddEdiMessageInput input) {
        String strcurrent = "";
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        for(int i=0;i<ediPoolList.size();i++){
            EdiPool ediPool = ediPoolList.get(i);
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationInfo = getOneEvaluationInfo(ediPool.getCourse(), ediPool.getContainerCategory());
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            if(evaluationInfo.size()>0 && courseEntity!=null){
                sb.append(padRight("TF        F",29,' '));
                //进场时间
                sb.append(padRight("F"+sdfDateTime.format(courseEntity.getCourseTime())+"F",18,' '));
                //估价单号
                sb.append(padRight(""+ediPool.getEvaluateNo()+"A",15,' '));
                //edi版本号
                sb.append(padRight(ediPool.getEdiVersion()+"",1,' '));
                //当前时间
                sb.append(padRight(sdfDate.format(new Date()),8,' '));
                //箱号
                sb.append(padRight(courseEntity.getContainerNo(),46,' '));
                if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    sb.append(padRight("RR "+getISO95CntrSizeAndType(courseEntity.getProdCourseId())+"",37,' '));
                }
                if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())){ //机组
                    sb.append(padRight("RU "+getISO95CntrSizeAndType(courseEntity.getProdCourseId())+"",37,' '));
                }
                //进场时间
                sb.append(padRight("CNTAOQOGA"+sdfDateTime.format(courseEntity.getCourseTime())+"",39,' '));
                sb.append(padRight(ediPool.getCondition(),10,' '));
                sb.append(padRight("",5,' '));
                sb.append("ACEP");
                sb.append(padRight(sb.toString(),36,' '));
                sb.append("ONE      T         F         FCNTAOQOGAF");
                sb.append(padRight(sb.toString(),286,' '));
                sb.append("USD");
                sb.append(padRight(sb.toString(),3,' '));
                String labrate = getLabRate(containerUser, ediPool.getContainerCategory());
                sb.append(padLeft(labrate,12,' '));
                sb.append(padRight("USD",23,' '));
                sb.append(padRight("MGWKGMSK",8,' '));

                ClassifiedFeeCost feecost = getTexZDFeeCostById(ediPool.getCourse(), ediPool.getContainerCategory());
               //空
               sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",20,' '));

                sb.append(padLeft(feecost.i_LabCost,10,' '));//有值
                sb.append(padLeft(feecost.i_MatCost,10,' '));//有值
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));

                sb.append(padLeft(feecost.o_LabCost,10,' '));
                sb.append(padLeft(feecost.o_MatCost,10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));

                sb.append(padLeft(feecost.o_TotalCost,10,' '));//有值   以下15个0.00

                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));
                //空
                sb.append(padLeft("0.00",10,' '));

                sb.append(padLeft(feecost.TotalCost,10,' '));//有值显示总额

                sb.append(padRight("ONE",14,' '));
                //股价单号
                sb.append(padRight(ediPool.getEvaluateNo(),55,' '));
                //当前时间
                sb.append(padRight(sdfDate.format(new Date()),17,' '));

                if (i < ediPoolList.size() - 1)
                {
                    sb.append("FFFF\r\n");
                }
                else
                {
                    sb.append("FFFF");
                }
            }
            ediText = sb.toString();
        }
        return ediText;
    }

    /**
    *@Description: ONE 进场EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-23
    */
    @Override
    public String getONEGateInEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        for(int i=0;i<ediPoolList.size();i++){
            EdiPool ediPool=ediPoolList.get(i);
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationInfo = getOneEvaluationInfo(ediPool.getCourse(), ediPool.getContainerCategory());
            if(evaluationInfo.size()>0 ){
                CourseExample courseExample = new CourseExample();
                courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
                List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
                Course courseEntity = null;
                if(courseList!=null && courseList.size()>0){
                    courseEntity = courseList.get(0);
                }
                sb.append(padRight("TF        F",29,' '));
                sb.append(padRight("F        F",18,' '));
                //估价单号
                sb.append(padRight(ediPool.getEvaluateNo(),28,' '));
                //箱号
                sb.append(padRight(courseEntity.getContainerNo()+"CON",44,' '));

                sb.append(padRight(getISO95CntrSizeAndType(ediPool.getCourse())+ediPool.getCondition(),62,' '));
                //进场日期
                sb.append(padRight(sdfDateTime.format(courseEntity.getCourseTime()),50,' '));
                sb.append(padRight("/  SK",15,' '));
                sb.append(padRight("MGWCMTACEP",25,' '));
                sb.append(padRight("/  ONE",12,' '));
                sb.append(padRight("T         F",20,' '));
                sb.append(padRight("FCNTAOQOGAF",188,' '));
                sb.append(padRight("F",48,' '));
                if(i<ediPoolList.size()-1){
                    sb.append("1FFFF\\r\\n");
                }else{
                    sb.append("1FFFF");
                }

            }
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
    *@Description: ONE 修理EDI
    *@Param: [input]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-23
    */
    @Override
    public String getONERepairCompleteEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        for(int i=0;i<ediPoolList.size();i++){
            EdiPool ediPool = ediPoolList.get(i);

            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationInfo = getOneEvaluationInfo(ediPool.getCourse(), ediPool.getContainerCategory());
            Date dtFinDate = new Date(); //最终时间
            if(evaluationInfo.size()>0 ){

                CourseExample courseExample = new CourseExample();
                courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
                List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
                Course courseEntity = null;
                if(courseList!=null && courseList.size()>0){
                    courseEntity = courseList.get(0);
                }
                UnitCourseExample unitCourseExample = new UnitCourseExample();
                unitCourseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
                List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);//机组
                UnitCourse  unitCourseEntity = null;
                if(unitCourseList !=null && unitCourseList.size()>0){
                    unitCourseEntity = unitCourseList.get(0);
                }

                if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    Date finishTime = courseEntity.getFinishTime();//完工时间
                    Date useReplyTime = courseEntity.getUseReplyTime();//用箱人批复时间
                    if(finishTime!=null && useReplyTime !=null){ //完工时间 批复时间 取最晚
                        dtFinDate =   useReplyTime.getTime()>finishTime.getTime()?useReplyTime:finishTime;
                    }else{ //取当前时间
                        dtFinDate = new Date();
                    }
                }else{//取机组时间
                    Date finishTime = unitCourseEntity.getFinishTime();//完工时间
                    Date useReplyTime = unitCourseEntity.getUseReplyTime();//用箱人批复时间
                    if(finishTime!=null && useReplyTime !=null){ //完工时间 批复时间 取最晚
                        dtFinDate =   useReplyTime.getTime()>finishTime.getTime()?useReplyTime:finishTime;
                    }else{ //取当前时间
                        dtFinDate = new Date();
                    }
                }

                sb.append(padRight("TF        F",29,' '));
                sb.append(padRight("F        F",18,' '));
                //估价单号
                sb.append(padRight(ediPool.getEvaluateNo(),28,' '));
                //箱号
                sb.append(padRight(courseEntity.getContainerNo()+"CON",44,' '));
                //ISO95 condition
                sb.append(padRight(getISO95CntrSizeAndType(courseEntity.getProdCourseId())+ediPool.getCondition(),62,' '));
                //最终日期
                sb.append(padRight(sdfDateTime.format(dtFinDate),50,' '));
                sb.append(padRight("/  SK",15,' '));
                sb.append(padRight("MGWCMTACEP",25,' '));
                sb.append(padRight("/  ONE",12,' '));
                sb.append(padRight("T         F",20,' '));
                sb.append(padRight("FCNTAOQOGAF",188,' '));
                sb.append(padRight("F",48,' '));
                if(i<ediPoolList.size()-1){
                    sb.append("1FFFF\r\n");
                }else{
                    sb.append("1FFFF");
                }
            }
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * ONE 估价明细EDI
     * @param input
     * @return
     */
    @Override
    public String getONEWestimdtEDI(AddEdiMessageInput input) {
        String strcurrent = "";
        String ediText = "";
        String placecode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        double amt;
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        for(int i=0;i<ediPoolList.size();i++){
            EdiPool ediPool = ediPoolList.get(i);
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationInfo = getOneEvaluationInfo(ediPool.getCourse(), ediPool.getContainerCategory());
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            for(int j=0;j<evaluationInfo.size();j++){
                EvaluationEntry  evaluationEntry = evaluationInfo.get(j);
                sb.append(padRight("F        F",9,' '));

                //进场时间
                sb.append(padRight(sdfDate.format(courseEntity.getCourseTime()),8,' '));
                //估价单号
                sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
                //edi版本号
                sb.append(padRight(ediPool.getEdiVersion()+"",1,' '));
                //当前时间
                sb.append(padRight(sdfDate.format(new Date()),8,' '));
                //箱号
                sb.append(padRight(sdfDate.format(new Date()),71,' '));
                //获取工时费率
                sb.append(padRight(getLabRate(containerUser,evaluationEntry.getContainerCategory()),4,' '));
                //修理代码
                sb.append(padRight(evaluationEntry.getRepairCode(),4,' '));
                if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    partcodeB = evaluationEntry.getPartsDetailsCode().substring(0, 3);
                    matcode = evaluationEntry.getMaterialCode();
                    placecode = evaluationEntry.getPositionCode();
                }else{
                    partcodeB = evaluationEntry.getPartsDetailsCode().substring(0, 3);
                    matcode = "MU";
                    //获取部件大类中文
                    String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                    String partType = getpartTypeByCode(partTypeCode);
                    placecode = getUnitPlaceCodeByPartCodeA(partType);
                }
                if(evaluationEntry.getQuantity()>=1){
                    //四舍五入
                    double   f   =   evaluationEntry.getQuantity();
                    BigDecimal   b   =   new   BigDecimal(f);
                    amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();

                }else{
                    amt = 1;
                }
                //数量
                sb.append(padLeft(amt+"",3,' '));

                //损坏代码，部件明细代码，材质代码
                sb.append(padRight(evaluationEntry.getDamageCode()+partcodeB+matcode,7,' '));
                //位置代码
                sb.append(padRight(placecode,4,' '));
                //长
                Double length = evaluationEntry.getLength();
                String  lengthStr = coverRemainTwo(length);
                sb.append(padLeft(lengthStr,8,' '));
                //宽
                Double width = evaluationEntry.getWidth();
                String  widthStr = coverRemainTwo(width);
                sb.append(padLeft(widthStr,8,' '));
                //空
                sb.append(padLeft("0.00",8,' '));
                sb.append(padLeft("CMT",3,' '));
                //工时
                Double manHour = evaluationEntry.getManHour();
                String  manHourStr = coverRemainTwo(manHour);
                sb.append(padLeft(manHourStr,6,' '));
                
                sb.append(padLeft("00",2,' '));
                //材料费
                double materialCost = evaluationEntry.getMaterialCost().doubleValue();
                String  materialCostStr = coverRemainTwo(materialCost);
                sb.append(padLeft(materialCostStr,15,' '));
                if(i==ediPoolList.size()-1 && j==evaluationInfo.size()-1){
                    sb.append(evaluationEntry.getPayingParty()+"N");
                }else{
                    sb.append(evaluationEntry.getPayingParty()+"N\r\n");
                }
            }
            ediText = sb.toString();
        }
        return ediText;
    }

    /**
     * GMS 估价EDI
     * @param input
     * @return
     */
    @Override
    public String getGMSWestimEDI(AddEdiMessageInput input) {
        String unitlocationcode = "";
        int rowCount = 0,currentrowCount=0;
        String ediText = "";//EDI文本
        String senderid = input.getEdiConfig().getSendCode();
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
   /*     if(input.getLoginYard().equals("LKYARD000035")){//中创
            senderid = "CNTAOMAFA";
        }else{
            senderid = "CNQ000005";
        }*/
        Date now = new Date();//当前时间
        sb.append("UNB+UNOA:1+"+senderid+":MTR1+EVG+"+sdfDate.format(now)+":"+sdfTime.format(now)+"+"+sdfDateTime.format(now)+"++DESTIM'"+lineBreak);
        rowCount++;
        for(EdiPool ediPool:ediPoolList){
            currentrowCount = rowCount;//记录当前行数
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            //报文头
            //生成一个序号
            String sequence = generateEdiMessageSequence("EDI_GMS");

            sb.append("UNH+"+sequence+"+DESTIM:D:96B:UN+UNKNOWN+1'"+lineBreak);
            sb.append("BGM+28+258+9'"+lineBreak);
            sb.append("DTM+137:"+sdfDate.format(now)+":102'"+lineBreak);//这里待定 取机组还是箱体估价日期？
            //进场日期
            sb.append("DTM+2:"+sdfDate.format(courseEntity.getCourseTime())+":102'"+lineBreak);
            sb.append("RFF+AME:GMS"+sdfDateHour.format(now)+"'"+lineBreak);
            //箱号
            sb.append("EQD+CN+"+courseEntity.getContainerNo()+"+"+4532+":102:5'"+lineBreak);
            //发送方
            sb.append("NAD+MS+"+senderid+":160:ZZZ'"+lineBreak);
            sb.append("NAD+TR+CNQNDF:72:ZZZ'"+lineBreak);
            sb.append("UNS+D'"+lineBreak);
            rowCount += 9;

            List<EvaluationEntry> evaluationEntryList = getGMSValInfo(ediPool.getCourse(), ediPool.getContainerCategory());
            //估价明细
            if(evaluationEntryList.size()>0){
                int countinfo = 1;
                for(EvaluationEntry evaluationEntry:evaluationEntryList){

                    sb.append("LIN+"+(countinfo++)+"+1'"+lineBreak);
                    //长 宽
                    sb.append("DIM+10+CMT:"+evaluationEntry.getLength()+":"+evaluationEntry.getWidth()+":0'"+lineBreak);
                    sb.append("QTY+"+evaluationEntry.getQuantity()+":1'"+lineBreak);
                    rowCount += 3;

                    RateExample rateExample = new RateExample();
                    rateExample.createCriteria().andProdRateIdEqualTo(evaluationEntry.getRateId());
                    List<Rate> rates = rateMapper.selectByExample(rateExample);
                    Rate rate = null;
                    if(rates!=null & rates.size()>0){
                        rate= rates.get(0);
                        sb.append("FTX+AAI+++"+rate.getRateNameEn()+"'"+lineBreak);
                    }else{
                        sb.append("FTX+AAI+++"+""+"'"+lineBreak);
                    }

                    if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体明细
                            //箱体费率实体
                        sb.append("FTX+MKS++NOT EGL::88+NO NUMBER'"+lineBreak);
                        sb.append("DAM+ZZZ+"+evaluationEntry.getDamageCode()+":AD:5+"+evaluationEntry.getPositionCode()+":AC++"+evaluationEntry.getRepairCode()+":AF'"+lineBreak);
                        sb.append("COD+"+evaluationEntry.getPartsDetailsCode()+":AK:5'"+lineBreak);
                        rowCount += 4;
                    }else{//机组明细
                         if(StringUtils.isNotBlank(evaluationEntry.getDevice())){ //主件
                                if(evaluationEntry.getDevice().equals("FRESON SEAL")){
                                    sb.append("FTX+MKS++NOT EGL::87+"+evaluationEntry.getDevice()+"*"+evaluationEntry.getQuantity()+"'"+lineBreak);
                                }else{
                                    sb.append("FTX+MKS++NOT EGL::87+"+evaluationEntry.getDevice()+"'"+lineBreak);

                                }
                         }else{
                             sb.append("FTX+MKS++NOT EGL::88+NO NUMBER'"+lineBreak);
                         }
                         //获取部件大类中文
                       String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                        String partType = getpartTypeByCode(partTypeCode);
                        unitlocationcode = getUnitPlaceCodeByPartCodeA(partType);//机组位置代码对应
                        sb.append("DAM+ZZZ+"+evaluationEntry.getDamageCode()+":AD:5+"+unitlocationcode+":AC++"+evaluationEntry.getRepairCode()+":AF'"+lineBreak);
                        sb.append("COD+290:AK:5:"+getGMSPartCodeB(evaluationEntry.getPartsDetailsCode())+"'"+lineBreak);
                        rowCount += 4;
                    }
                    sb.append("RTE+2:1997'"+lineBreak);
                    sb.append("QTY+207:"+evaluationEntry.getManHour()+"'"+lineBreak);
                    sb.append("NAD+EO+EVERGREEN:ZZZ:ZZZ'"+lineBreak);
                    sb.append("MOA+186:"+evaluationEntry.getMaterialCost()+":USD:10:3'"+lineBreak);
                    sb.append("MOA+185:"+evaluationEntry.getManHourCost()+":USD:10:3'"+lineBreak);
                    rowCount += 5;
                }
            }
            sb.append("CNT+3:"+evaluationEntryList.size()+"'"+lineBreak);
            rowCount+=2;
            sb.append("UNT+"+(rowCount-currentrowCount)+"+"+sequence+"'"+lineBreak);
        }
        sb.append("UNZ+"+ediPoolList.size()+"+"+sdfDateTime.format(now)+"'"+lineBreak);
        ediText = sb.toString();
        return ediText;
    }

    /**
     * GMS PTI EDI
     * @param input
     * @return
     */
    @Override
    public String getGMSPTIEDI(AddEdiMessageInput input) {
        String unitlocationcode = "";
        int rowCount = 0,currentrowCount=0;
        String ediText = "";//EDI文本
        String senderid = input.getEdiConfig().getSendCode();
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
/*        if(input.getLoginYard().equals("LKYARD000035")){//中创
            senderid = "CNTAOMAFA";
        }else{
            senderid = "CNQ000005";
        }*/
        Date now = new Date();//当前时间
        sb.append("UNB+UNOA:1+"+senderid+":MTR1+EVG+"+sdfDate.format(now)+":"+sdfTime.format(now)+"+"+sdfDateTime.format(now)+"++DESTIM'"+lineBreak);
        rowCount++;
        for(EdiPool ediPool:ediPoolList){
            currentrowCount = rowCount;//记录当前行数
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            //edi报文头
            //生成一个序号
            String sequence = generateEdiMessageSequence("EDI_GMS");

            sb.append("UNH+"+sequence+"+DESTIM:D:96B:UN+UNKNOWN+1'"+lineBreak);
            sb.append("BGM+28+258+9'"+lineBreak);
            sb.append("DTM+137:"+sdfDate.format(now)+":102'"+lineBreak);//这里待定 取机组还是箱体估价日期？
            //进场日期
            sb.append("DTM+2:"+sdfDate.format(courseEntity.getCourseTime())+":102'"+lineBreak);
            sb.append("RFF+AME:GMS"+sdfDateHour.format(now)+"'"+lineBreak);
            //箱号
            sb.append("EQD+CN+"+courseEntity.getContainerNo()+"+"+4532+":102:5'"+lineBreak);
            //发送方
            sb.append("NAD+MS+"+senderid+":160:ZZZ'"+lineBreak);
            sb.append("NAD+TR+CNQNDF:72:ZZZ'"+lineBreak);
            sb.append("UNS+D'"+lineBreak);
            rowCount += 9;

            sb.append("LIN+"+1+"+1'"+lineBreak);
            sb.append("DIM+10+CMT:"+0+":"+0+":0'"+lineBreak);
            sb.append("QTY+"+1+":1'"+lineBreak);
            rowCount += 3;

            sb.append("FTX+AAI+++PTI:'"+lineBreak);
            sb.append("FTX+MKS++NOT EGL::87+PTI'"+lineBreak);
            unitlocationcode = "201";//机组位置代码对应
            sb.append("DAM+ZZZ+ZZ:AD:5+201:AC++RP:AF'"+lineBreak);
            sb.append("COD+PTI:AK:5:PTI'"+lineBreak);
            rowCount += 4;

            sb.append("RTE+2:1997'"+lineBreak);
            sb.append("QTY+207:"+0+"'"+lineBreak);
            sb.append("NAD+EO+EVERGREEN:ZZZ:ZZZ'"+lineBreak);
            sb.append("MOA+186:"+185+":USD:10:3'"+lineBreak);
            sb.append("MOA+185:"+0+":USD:10:3'"+lineBreak);
            rowCount += 4;

            sb.append("CNT+3:"+1+"'"+lineBreak);
            rowCount += 2;
            sb.append("UNT+"+23+"+"+sequence+"'"+lineBreak);
        }
        sb.append("UNZ+"+ediPoolList.size()+"+"+sdfDateTime.format(now)+"'"+lineBreak);
        ediText = sb.toString();
        return ediText;
    }

    /**
     * TRTN 估价EDI
     * @param input
     * @return
     */
    @Override
    public String getTRTNWestimNewEDI(AddEdiMessageInput input) {
        String ediText = "";
        String placecode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";//部件明细
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        int iRowCount = 0, iCntrCount = 0, iDetailCount = 0, iOCount = 0;
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
        //生成一个序号
        String sequence = generateEdiMessageSequence("EDI_TRTN");
        String sender = input.getEdiConfig().getSendCode(); //发送发
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        Date now = new Date();
        sb.append("UNB+UNOA:1+"+sender+":ZZ+"+receiver+":ZZ+"+sdfDateTime.format(now)+"+"+sequence+"'"+lineBreak);
        for(EdiPool ediPool: ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            UnitCourseExample unitCourseExample = new UnitCourseExample();
            unitCourseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);//机组
            UnitCourse  unitCourseEntity = null;
            if(unitCourseList !=null && unitCourseList.size()>0){
                unitCourseEntity = unitCourseList.get(0);
            }
            EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
            if(ContainerCategoryEnum.CONTAINER_05.getCode().equals(ediPool.getContainerCategory())){//整体（冷箱）
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0"));
            }else{
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0")).andContainerCategoryEqualTo(ediPool.getContainerCategory());

            }
            //查询估价信息条数
            long cn = evaluationEntryMapper.countByExample(evaluationEntryExample);
            if((courseEntity!=null || unitCourseEntity!=null ) && cn>0){
                String gjdh = ediPool.getEvaluateNo();
                Date gjrq = new Date();
                iRowCount = 0;
                String westim_advice = ediPool.getWestimAdvice()==null?"":ediPool.getWestimAdvice();
                sb.append("UNH+"+(iCntrCount + 1)+"+WESTIM:0+"+westim_advice+"+0'"+lineBreak);
                sb.append("DTM+ATR+"+sdfDate.format(gjrq)+"'"+lineBreak);
                sb.append("RFF+EST+"+gjdh+"+"+sdfDate.format(gjrq)+"'"+lineBreak);
                sb.append("RFF+ADV+1'"+lineBreak);
                sb.append("ACA+USD+STD:0.00'"+lineBreak);
                sb.append("ACA+USD+DPP:DPP金额，界面维护'"+lineBreak);
                sb.append("LBR+"+getLabRate(containerUser,ediPool.getContainerCategory())+"'"+lineBreak);
                //发送方
                sb.append("NAD+DED+"+sender+"'"+lineBreak);
                //接收方
                sb.append("NAD+LED+"+receiver+"'"+lineBreak);
                sb.append("EQF+CON+"+ediPool.getContainerNo().substring(0,4)+":"+ediPool.getContainerNo().substring(4)+"+"+getISO95CntrSizeAndType(ediPool.getCourse())+"+MGW:0:KGM'"+lineBreak);
                sb.append("ERI+SK+MAN:01'"+lineBreak);
                sb.append("ECI+D'"+lineBreak);
                sb.append("CUI+TRM:"+sender+"+TRM:"+sdfDate.format(gjrq)+":0000'"+lineBreak);
                iRowCount += 13;

                List<EvaluationEntry> evaluationEntryList = getValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory());
                int valinfoCount = 1;
                for(EvaluationEntry evaluationEntry:evaluationEntryList){
                    if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode()) ||
                            evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())){//箱体 或 干箱
                        placecode = evaluationEntry.getPositionCode();
                        matcode = StringUtils.isBlank(evaluationEntry.getMaterialCode())?"MU":evaluationEntry.getMaterialCode();
                        partcodeB = convertTRTNPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                    }else{
                        //获取部件大类中文
                        String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                        String partType = getpartTypeByCode(partTypeCode);
                        placecode = getUnitPlaceCodeByPartCodeA(partType);
                        matcode = "MU";
                        partcodeB = convertTRTNPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                    }

                    if(placecode.equals("ZZZZ") && partcodeB.equals("ZZZ") && evaluationEntry.getDamageCode().equals("ZZ") && matcode.equals("ZZ")){
                        sb.append("DAM+"+(valinfoCount++)+"+"+placecode+"+"+partcodeB+"+"+evaluationEntry.getDamageCode()+"+"+matcode+"+25'"+lineBreak);
                    }else{
                        sb.append("DAM+"+(valinfoCount++)+"+"+placecode+"+"+partcodeB+"+"+evaluationEntry.getDamageCode()+"+"+matcode+"'"+lineBreak);
                    }
                    //长
                    Double length = evaluationEntry.getLength();
                    String  lengthStr = coverRemainTwo(length);  //保留两位精度
                    //宽
                    Double width = evaluationEntry.getWidth();
                    String  widthStr = coverRemainTwo(width);

                    double amt = 0;
                    if(evaluationEntry.getQuantity()>=1){
                        //四舍五入
                        double   f   =   evaluationEntry.getQuantity();
                        BigDecimal   b   =   new   BigDecimal(f);
                        amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                    }else{
                        amt = 1;
                    }

                    sb.append("WOR+"+evaluationEntry.getRepairCode()+"+CMT:"+lengthStr+":"+widthStr+":0+"+amt+"'"+lineBreak);
                    String paying_party=  "T".equals(evaluationEntry.getPayingParty())?"T":evaluationEntry.getPayingParty();
                    //工时费保留两位小数
                    String man_hour_cost = coverRemainTwo(evaluationEntry.getManHourCost().doubleValue());
                    //材料费
                    String material_cost = coverRemainTwo(evaluationEntry.getManHourCost().doubleValue());
                    String labRate = getLabRate(containerUser, evaluationEntry.getContainerCategory());
                    String labRateStr = coverRemainTwo(Double.parseDouble(labRate));


                    sb.append("COS+00+"+man_hour_cost+"+"+material_cost+"+"+paying_party+"+"+labRateStr+"'"+lineBreak);
                    iRowCount += 3;
                }
                List<Map<String, Object>> feeCostGroupByCntrNoAndFeePayer = getFeeCostGroupByCntrNoAndFeePayer(ediPool.getCourse());
                double dTotalFee = 0;
                double dPTIFee = 0;//CMA固定的PTI费用
                String sPTIRepCode = "", sPTIPartCodeB = "", sPTIDmgCode = "";
                iOCount = 0;
                for(Map<String, Object> map :feeCostGroupByCntrNoAndFeePayer){
                    if("O".equals(map.get("paying_party")+"")){
                        String paying_party = map.get("paying_party")+"";
                        //工时费保留两位小数
                        String man_hour_cost = coverRemainTwo(Double.parseDouble(map.get("man_hour_cost") + ""));
                        //材料费
                        String material_cost = coverRemainTwo(Double.parseDouble(map.get("material_cost") + ""));
                        material_cost = Double.parseDouble(material_cost)+dPTIFee+"";
                        //总费用
                        String sum_money = coverRemainTwo(Double.parseDouble(map.get("sum_money") + ""));
                        sum_money = Double.parseDouble(sum_money)+dPTIFee+"";
                        sb.append("CTO+"+paying_party+"+"+man_hour_cost+"+"+material_cost+"+0.00+0.00+"+sum_money+"'"+lineBreak);
                        dTotalFee += Double.parseDouble(map.get("sum_money") + "") + dPTIFee;
                        iRowCount++;
                        iOCount++;
                    }else{
                        String paying_party = "T".equals(map.get("paying_party")+"")?"T":"1";
                        //工时费保留两位小数
                        String man_hour_cost = coverRemainTwo(Double.parseDouble(map.get("man_hour_cost") + ""));
                        //材料费
                        String material_cost = coverRemainTwo(Double.parseDouble(map.get("material_cost") + ""));
                        material_cost = Double.parseDouble(material_cost)+dPTIFee+"";
                        //总费用
                        String sum_money = coverRemainTwo(Double.parseDouble(map.get("sum_money") + ""));
                        sum_money = Double.parseDouble(sum_money)+dPTIFee+"";
                        sb.append("CTO+"+paying_party+"+"+man_hour_cost+"+"+material_cost+"+0.00+0.00+"+sum_money+"'"+lineBreak);
                        dTotalFee += Double.parseDouble(map.get("sum_money") + "") + dPTIFee;
                        iRowCount++;
                    }
                }
                String dTotalFeeStr = coverRemainTwo(dTotalFee);
                sb.append("TMA+"+dTotalFeeStr+"'"+lineBreak);
                iRowCount += 2;
                sb.append("UNT+"+iRowCount+"+"+(iCntrCount + 1)+"'"+lineBreak);
                iCntrCount++;
            }
        }
        sb.append("UNZ+"+iCntrCount+"+"+sequence+"'"+lineBreak);
        ediText = sb.toString();
        return ediText;
    }

    /**
     * TRTN 修理EDI
     * @param input
     * @return
     */
    @Override
    public String getTRTNRepairCompleteNEWEDI(AddEdiMessageInput input) {
        StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
        SimpleDateFormat sdfDateHour00 = new SimpleDateFormat("yyMMdd:HH00");
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        //获取用箱人key
        String containerUser = input.getEdiConfig().getContainerUser();
        String ediText = "";
        String placecode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";//部件明细
        int iRowCount = 0, iCntrCount = 0, iDetailCount = 0, iOCount = 0;
        String sequence = generateEdiMessageSequence("EDI_TRTN");
        String sender = input.getEdiConfig().getSendCode(); //发送方
        String receiver = input.getEdiConfig().getReceptionCode(); //接收方
        Date now  = new Date();
        sb.append("UNB+UNOA:1+"+sender+":ZZ+"+receiver+":ZZ+"+sdfDate.format(now)+"+"+sequence+"'");
        for(EdiPool ediPool : ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            UnitCourseExample unitCourseExample = new UnitCourseExample();
            unitCourseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<UnitCourse> unitCourseList = unitCourseMapper.selectByExample(unitCourseExample);//机组
            UnitCourse  unitCourseEntity = null;
            if(unitCourseList !=null && unitCourseList.size()>0){
                unitCourseEntity = unitCourseList.get(0);
            }
            EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
            if(ContainerCategoryEnum.CONTAINER_05.getCode().equals(ediPool.getContainerCategory())){//整体（冷箱）
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0"));
            }else{
                evaluationEntryExample.createCriteria().andCourseEqualTo(ediPool.getCourse()).andIsRepairEqualTo(CommonEnum.YES.getCode()).andSumMoneyNotEqualTo(new BigDecimal("0")).andContainerCategoryEqualTo(ediPool.getContainerCategory());

            }
            //查询估价信息条数
            long cn = evaluationEntryMapper.countByExample(evaluationEntryExample);
            if((courseEntity!=null || unitCourseEntity!=null) && cn>0){
                String gjdh = ediPool.getEvaluateNo();
                Date gjrq = new Date();
                iRowCount = 0;
                //获取用箱人翻译
                String containerUserStr = langService.langValue(containerUser, LanguageEnum.LANGZH, null);
                sb.append("UNH+"+gjdh+"+GATEIN:0+"+containerUserStr+"+0'");
                sb.append("DTM+ATR+"+sdfDateHour00.format(gjrq)+"'");
                sb.append("RFF+EIR+"+gjdh+"'");
                sb.append("NAD+LED+"+receiver+"'");
                sb.append("NAD+DED+"+sender+"'");
                sb.append("EQF+CON+"+ediPool.getContainerNo().substring(0,4)+":"+ediPool.getContainerNo().substring(4)+"+"+getISO95CntrSizeAndType(ediPool.getCourse())+"'");
                sb.append("ERI+SK+MAN:01'");
                sb.append("ECI+C'");
                sb.append("UNT+9+"+padLeft((iCntrCount + 1)+"",4,'0')+"'");
                iCntrCount++;
            }
        }
        sb.append("UNZ+"+padLeft(iCntrCount+"",4,'0')+"+"+sequence+"'");
        ediText = sb.toString();
        return ediText;
    }

    /**
     * TRTN 联合检验 明细 EDI
     * @param input
     * @return
     */
    @Override
    public String getTRTNJointSurveydtEDI(AddEdiMessageInput input) {
    /*    StringBuilder sb = new StringBuilder();
        //查询对应edi信息
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
        SimpleDateFormat sdfDateHour00 = new SimpleDateFormat("yyMMdd:HH00");
        String strcurrent = "";
        String ediText = "";
        String placecode = "";
        String feepayer = "";
        String matcode = "";
        String partcodeB = "";
        double amt=0;
        for(EdiPool ediPool:ediPoolList){
            List<EvaluationEntry> evaluationEntryList = getValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory());
            for(EvaluationEntry evaluationEntry : evaluationEntryList){
                Date now = new Date();
                sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
                sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
                sb.append(padLeft("1"+sdfDate.format(now),9,' '));
                String cntrOrUnit = ContainerCategoryEnum.CONTAINER_03.getCode().equals(evaluationEntry.getContainerCategory())?"M":"C";
                sb.append(padRight(ediPool.getContainerNo()+""+cntrOrUnit,60,' '));
                String containerUser = input.getEdiConfig().getContainerUser();   //用箱人
                sb.append(padRight(getLabRate(containerUser,ediPool.getContainerCategory()),15,' '));//取工时费率
                //表中无sortcode字段   valEntity.SortCode
                sb.append(padRight("",2,' '));

                if(evaluationEntry.getQuantity()>=1){
                    //四舍五入
                    double   f   =   evaluationEntry.getQuantity();
                    BigDecimal   b   =   new   BigDecimal(f);
                    amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                }else{
                    amt = 1;
                }
                sb.append(padRight(evaluationEntry.getRepairCode()+""+amt,5,' '));
                if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    placecode = evaluationEntry.getPositionCode();
                    matcode = evaluationEntry.getMaterialCode();
                    partcodeB = convertTRTNPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                }else{
                    //获取部件大类中文
                    String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                    String partType = getpartTypeByCode(partTypeCode);
                    placecode = getUnitPlaceCodeByPartCodeA(partType);
                    matcode = "MU";
                    partcodeB = convertTRTNPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                }


            }

        }*/

        return null;
    }

    /**
     * SEACO 进场 EDI
     * @param input
     * @return
     */
    @Override
    public String getGESGateInEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String sender = input.getEdiConfig().getSendCode();
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
        SimpleDateFormat sdfDateHour00 = new SimpleDateFormat("yyMMdd:HH00");
        for(EdiPool ediPool : ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }

            sb.append(padRight("TF        F",29,' '));
            //创建一个序号
            String sequence = generateEdiMessageSequence("EDI_SEACO");
            String gatein_advice = ediPool.getGateinAdvice()==null?"":ediPool.getGateinAdvice();  // gatein_advice   edipool 表中不存在
            sb.append(padRight("F"+sdfDate.format(courseEntity.getCourseTime())+"F"+sdfDate.format(courseEntity.getCourseTime())+"BASE"+sdfDate.format(new Date())+""+sequence+""+gatein_advice+"",46,' '));
            //箱号
            sb.append(padRight(""+ediPool.getContainerNo()+"REF",44,' '));

            sb.append(padRight(getISO95CntrSizeAndType(courseEntity.getProdCourseId())+ediPool.getCondition(),62,' '));
            sb.append(padRight(sdfDate.format(courseEntity.getCourseTime())+"12:00",93,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F         F"+sender+"F",198,' '));
            sb.append(padRight("F",18,' '));
            sb.append(padRight(sender,30,' '));
            sb.append("0FFFF\r\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 出场 EDI
     * @param input
     * @return
     */
    @Override
    public String getGESGateOutEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String sender = input.getEdiConfig().getSendCode();
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdfDateHour = new SimpleDateFormat("yyMMddHH");
        SimpleDateFormat sdfDateHour00 = new SimpleDateFormat("yyMMdd:HH00");
        for(EdiPool ediPool : ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }

            sb.append(padRight("TF        F",29,' '));
            //创建一个序号
            String sequence = generateEdiMessageSequence("EDI_SEACO");

            Date  gateout_impordate = ediPool.getGateoutImpordate()==null?new Date():ediPool.getGateoutImpordate();   // edimainEntity.GATEOUT_IMPORDATE     edipool 表中不存在
            String  gateout_advice = ediPool.getGateoutAdvice()==null?"":ediPool.getGateoutAdvice();    //  edimainEntity.GATEOUT_ADVICE     edipool 表中不存在

            String  strcurrent = "F";
            strcurrent +=padLeft(sdfDate.format(gateout_impordate),8,' ');
            strcurrent +="F";
            strcurrent +=padLeft(sdfDate.format(gateout_impordate),8,' ');
            strcurrent +="BASE";
            strcurrent +=sdfDate.format(new Date());
            strcurrent +=sequence;
            strcurrent +=gateout_advice;
            sb.append(padRight(strcurrent,46,' '));
            //箱号
            sb.append(padRight(ediPool.getContainerNo()+"REF",44,' '));
            String condition = ediPool.getCondition()==null?"":ediPool.getCondition(); //edi条件
            sb.append(padRight(getISO95CntrSizeAndType(courseEntity.getProdCourseId())+condition,62,' '));
            sb.append(padRight(sdfDate.format(gateout_impordate),8,' '));
            sb.append(padRight("12:00",85,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F         F"+sender+"F",198,' '));
            sb.append(padRight("F",18,' '));
            sb.append(padRight(sender,30,' '));
            sb.append("0FFFF\r\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 修理 EDI
     * @param input
     * @return
     */
    @Override
    public String getGESRepairCompleteEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String sender = input.getEdiConfig().getSendCode();
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");

        for(EdiPool ediPool : ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }

            sb.append(padRight("TF        F",29,' '));
            //创建一个序号
            String sequence = generateEdiMessageSequence("EDI_SEACO");
            Date now = new Date(); //今天
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(now);
            calendar.add(Calendar.DATE,-1);
            Date yesterDay = calendar.getTime(); //前一天
            sb.append(padRight("F"+sdfDate.format(yesterDay)+"F"+sdfDate.format(yesterDay)+"BASE"+sdfDate2yy.format(now)+""+sequence+"",46,' '));
            //箱号
            sb.append(padRight(courseEntity.getContainerNo()+"REF",44,' '));
            String condition = ediPool.getCondition()==null? "":ediPool.getCondition();
            sb.append(padRight(getISO95CntrSizeAndType(courseEntity.getProdCourseId())+condition,62,' '));
            String gatein_refference = ediPool.getGateinRefference()==null?"":ediPool.getGateinRefference();   //todo edimainEntity.GATEIN_REFFERENCE   edipool中没有
            sb.append(padRight(""+sdfDate.format(yesterDay)+"12:00"+gatein_refference+"",93,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F         F"+sender+"F",198,' '));
            sb.append(padRight("F",18,' '));
            sb.append(padRight(sender,30,' '));
            sb.append("0FFFF\r\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 估价 EDI
     * @param input
     * @return
     */
    @Override
    public String getGESWestimEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        for (EdiPool ediPool : ediPoolList) {
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            Date now = new Date();
            sb.append(padRight("TF        F",29,' '));
            sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
            //估价单号
            sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
            sb.append(padLeft("0",2,' '));
            sb.append(padLeft(sdfDate.format(now),8,' '));

            sb.append(padRight(ediPool.getContainerNo()+"R",46,' '));

            sb.append(padRight("REF"+getISO95CntrSizeAndType(courseEntity.getProdCourseId()),46,' '));
            sb.append(padRight(""+sdfDate.format(now)+"12:00",32,' '));
            String condition = ediPool.getCondition()==null ? "":ediPool.getCondition();
            sb.append(padRight(condition,49,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F",10,' '));
            sb.append(padRight("F"+sender+"F",38,' '));
            sb.append(padRight("0.000",9,' '));

            String strcurrent = "";
            if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                if(ediPool!=null && ediPool.getCwFee()!=null){
                    strcurrent = "CW" + ediPool.getCwFee();

                }else{
                    strcurrent = "CW";
                }
            }else{
                strcurrent = "CW0";
            }
            sb.append(padRight(strcurrent,210,' '));

            String labrate = getLabRate(containerUser,ediPool.getContainerCategory());
            sb.append(padRight("CNY"+labrate+"",15,' '));
            sb.append(padRight("CNY",31,' '));


            ClassifiedFeeCost feecost = getFeeCostById(ediPool.getCourse(),ediPool.getContainerCategory());
            sb.append(padRight(feecost.u_LabCost,10,' '));
            sb.append(padRight(feecost.u_MatCost,20,' '));
            sb.append(padRight("0",10,' '));
            sb.append(padRight(feecost.u_TotalCost,10,' '));
            sb.append(padRight(feecost.i_LabCost,10,' '));
            sb.append(padRight(feecost.i_MatCost,30,' '));
            sb.append(padRight(feecost.i_TotalCost,10,' '));
            sb.append(padRight(feecost.o_LabCost,10,' '));
            sb.append(padRight(feecost.o_MatCost,30,' '));
            sb.append(padRight(feecost.o_TotalCost,160,' '));
            sb.append(padRight(feecost.TotalCost,10,' '));
            sb.append(padRight("",30,' '));
            sb.append(padRight(feecost.i_TotalCost,12,' '));
            sb.append(padRight("",27,' '));
            sb.append(padRight(sdfDate.format(new Date()),17,' '));
            sb.append("FFFF\r\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 估价明细 EDI
     * @param input
     * @return
     */
    @Override
    public String getGESWestimdtEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        String placecode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";
        for(EdiPool ediPool:ediPoolList){
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationEntryList = getValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory());
            for(EvaluationEntry evaluationEntry : evaluationEntryList){
                sb.append(padRight("F"+sdfDate.format(new Date())+"F",18,' '));
                //估价单号
                sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
                sb.append(padLeft("0"+sdfDate.format(new Date()),9,' '));
                sb.append(padRight(ediPool.getContainerNo()+"R",60,' '));
                sb.append(padRight(getLabRate(containerUser,ediPool.getContainerCategory()),15,' '));//取工时费率
                //TODO 估价表中无  valEntity.SortCode
                String sortCode = evaluationEntry.getSortcode()==null?"":evaluationEntry.getSortcode();
                sb.append(padRight("",2,' '));

                double amt = 0;
                if(evaluationEntry.getQuantity()>=1){
                    //四舍五入
                    double   f   =   evaluationEntry.getQuantity();
                    BigDecimal   b   =   new   BigDecimal(f);
                    amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                }else{
                    amt = 1;
                }

                sb.append(padRight(evaluationEntry.getRepairCode()+""+amt,5,' '));
                if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    placecode = evaluationEntry.getPositionCode();
                    matcode = evaluationEntry.getMaterialCode();
                    partcodeB = evaluationEntry.getPartsDetailsCode().substring(0,3);
                }else{
                    //获取部件大类中文
                    String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                    String partType = getpartTypeByCode(partTypeCode);
                    placecode = getUnitPlaceCodeByPartCodeA(partType);
                    matcode = "MU";
                    partcodeB = getGMSPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                }
                String  strcurrent= "";
                strcurrent +=padLeft(evaluationEntry.getDamageCode(),2,' ');
                strcurrent +=padLeft(partcodeB,3,' ');
                strcurrent +=padLeft(matcode,2,' ');
                strcurrent +=padLeft(placecode,4,' ');
                sb.append(padRight(strcurrent,11,' '));

                strcurrent="";
                if(evaluationEntry.getPartsDetailsCode().contains("BUL")){
                    if(StringUtils.isBlank(evaluationEntry.getPartsDetailsCode()) || StringUtils.isBlank( evaluationEntry.getPartsDetailsCode().substring(3))){
                        strcurrent = evaluationEntry.getLength()+"";
                    }else{
                        strcurrent = evaluationEntry.getPartsDetailsCode().substring(3);
                    }
                }else{
                    strcurrent = evaluationEntry.getLength()==0?"":evaluationEntry.getLength()+"";
                }
                sb.append(padRight(strcurrent,8,' '));
                String width = evaluationEntry.getWidth()==0?"":evaluationEntry.getWidth()+"";
                sb.append(padRight(width,16,' '));
                sb.append(padRight("CMT"+evaluationEntry.getManHour()+"",11,' '));
                sb.append(padRight(evaluationEntry.getManHourCost()+"",15,' '));
                sb.append(evaluationEntry.getPayingParty()+"\r\n");
            }

        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 估价批复EDI
     * @param input
     * @return
     */
    @Override
    public String getGESWestimAUTEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");

        for(EdiPool ediPool :ediPoolList){
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            Date now = new Date();
            sb.append(padRight("TF        F",29,' '));
            sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
            //估价单号
            sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
            sb.append(padLeft("u1",2,' '));
            sb.append(padLeft(sdfDate.format(now),8,' '));
            sb.append(padRight(ediPool.getContainerNo()+"R",46,' '));
            sb.append(padRight("REF"+getISO95CntrSizeAndType(ediPool.getCourse()),46,' '));
            sb.append(padRight(sdfDate.format(now)+"12:00",32,' '));
            String condition = ediPool.getCondition()==null?"":ediPool.getCondition();
            sb.append(padRight(condition,49,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F",10,' '));
            sb.append(padRight("F"+sender+"F",38,' '));
            sb.append(padRight("0.000",9,' '));
            String  strcurrent = "";
            if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){ //箱体
                if(StringUtils.isNotBlank(ediPool.getCwFee()+"")){
                    strcurrent = "CW" + ediPool.getCwFee();
                }else{
                    strcurrent = "CW";
                }
            }else{
                strcurrent = "CW0";
            }
            sb.append(padRight(strcurrent,210,' '));
            String labrate = getLabRate(containerUser,ediPool.getContainerCategory());
            sb.append(padRight("CNY"+labrate,15,' '));
            sb.append(padRight("CNY",31,' '));
            ClassifiedFeeCost feecost = getFeeCostById(ediPool.getCourse(),ediPool.getContainerCategory());
            sb.append(padRight(feecost.u_LabCost,10,' '));
            sb.append(padRight(feecost.u_MatCost,20,' '));
            sb.append(padRight("0",10,' '));
            sb.append(padRight(feecost.u_TotalCost,60,' '));
            sb.append(padRight(feecost.o_LabCost,10,' '));
            sb.append(padRight(feecost.o_MatCost,30,' '));
            sb.append(padRight(feecost.o_TotalCost,160,' '));
            sb.append(padRight(feecost.TotalCost,10,' '));
            sb.append(padRight("",28,' '));
            sb.append(padRight(ediPool.getEvaluateNo().substring(6),14,' '));
            String westim_authamt = ediPool.getWestimAuthamt()==null?"":ediPool.getWestimAuthamt();  //TODO edi池中无  WESTIM_AUTHAMT
            sb.append(padRight(westim_authamt,27,' '));//这里是用于批复的
            sb.append(padRight(sdfDate.format(now),17,' '));
            sb.append("FFFF\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 估价明细批复EDI
     * @param input
     * @return
     */
    @Override
    public String getGESWestimdtAUTEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();   //发送发
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        String placecode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";
        double amt;
        Date now = new Date();
        for (EdiPool ediPool : ediPoolList) {
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationEntryList = getValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory());
            for (EvaluationEntry evaluationEntry : evaluationEntryList) {
                sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
                //估价单号
                sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
                sb.append(padLeft(sdfDate.format(now),9,' '));
                sb.append(padRight(ediPool.getContainerNo()+"R",60,' '));
                sb.append(padRight(getLabRate(containerUser,ediPool.getContainerCategory()),15,' '));//取工时费率
                String sortCode = evaluationEntry.getSortcode()==null?"":evaluationEntry.getSortcode(); //TODO 估价表中无 valEntity.SortCode
                sb.append(padRight(sortCode,2,' '));

                if(evaluationEntry.getQuantity()>=1){
                    //四舍五入
                    double   f   =   evaluationEntry.getQuantity();
                    BigDecimal   b   =   new   BigDecimal(f);
                    amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                }else{
                    amt = 1;
                }

                sb.append(padRight(evaluationEntry.getRepairCode()+amt,5,' '));
                if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    placecode = evaluationEntry.getPositionCode();
                    matcode = evaluationEntry.getMaterialCode();
                    partcodeB = evaluationEntry.getPartsDetailsCode().substring(0,3);
                }else{
                    //获取部件大类中文
                    String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                    String partType = getpartTypeByCode(partTypeCode);
                    placecode = getUnitPlaceCodeByPartCodeA(partType);
                    matcode = "MU";
                    partcodeB = getGMSPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                }
                String  strcurrent= "";
                strcurrent +=padLeft(evaluationEntry.getDamageCode(),2,' ');
                strcurrent +=padLeft(partcodeB,3,' ');
                strcurrent +=padLeft(matcode,2,' ');
                strcurrent +=padLeft(placecode,4,' ');
                sb.append(padRight(strcurrent,11,' '));

                strcurrent="";
                if(evaluationEntry.getPartsDetailsCode().contains("BUL")){
                    if(StringUtils.isBlank(evaluationEntry.getPartsDetailsCode().substring(3))){
                        strcurrent = evaluationEntry.getLength()+"";
                    }else{
                        strcurrent = evaluationEntry.getPartsDetailsCode().substring(3);
                    }
                }else{
                    strcurrent = evaluationEntry.getLength()==0?"":evaluationEntry.getLength()+"";
                }
                sb.append(padRight(strcurrent,8,' '));
                strcurrent=evaluationEntry.getWidth()==0?"":evaluationEntry.getWidth()+"";
                sb.append(padRight(strcurrent,16,' '));
                sb.append(padRight("CMT"+evaluationEntry.getManHour(),11,' '));
                sb.append(padRight(evaluationEntry.getManHourCost()+"",15,' '));
                sb.append(evaluationEntry.getPayingParty()+"\n");

            }
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 检验EDI
     * @param input
     * @return
     */
    @Override
    public String getGESJointSurveyEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();   //发送发
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        Date now = new Date();
        for (EdiPool ediPool : ediPoolList) {
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andProdCourseIdEqualTo(ediPool.getCourse());
            List<Course> courseList = courseMapper.selectByExample(courseExample);//干箱箱体
            Course courseEntity = null;
            if(courseList!=null && courseList.size()>0){
                courseEntity = courseList.get(0);
            }
            sb.append(padRight("TF        F",29,' '));
            sb.append(padRight(sdfDate.format(now),18,' '));
            //估价单号
            sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
            sb.append(padLeft("1",2,' '));
            sb.append(padLeft(sdfDate.format(now),8,' '));
            sb.append(padRight(ediPool.getEvaluateNo()+"R",46,' '));
            sb.append(padRight("REF"+getISO95CntrSizeAndType(ediPool.getCourse()),46,' '));
            sb.append(padRight(sdfDate.format(now)+"12:00",32,' '));
            String condition = ediPool.getCondition()==null?"":ediPool.getCondition();
            sb.append(padRight(condition,49,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F",10,' '));
            sb.append(padRight("F"+sender+"F",38,' '));
            sb.append(padRight("0.000",9,' '));
            String strcurrent="";
            if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                if(StringUtils.isNotBlank(ediPool.getCwFee()+"")){
                    strcurrent = "CW" + ediPool.getCwFee();
                }else{
                    strcurrent = "CW";
                }
            }else{
                strcurrent = "CW0";
            }
            sb.append(padRight(strcurrent,210,' '));
            String labrate = getLabRate(containerUser,ediPool.getContainerCategory());
            sb.append(padRight("CNY"+labrate,15,' '));
            sb.append(padRight("CNY",31,' '));

            ClassifiedFeeCost feecost = getFeeCostById(ediPool.getCourse(), ediPool.getContainerCategory());
            sb.append(padRight(feecost.u_LabCost,10,' '));
            sb.append(padRight(feecost.u_MatCost,20,' '));
            sb.append(padRight("0",10,' '));
            sb.append(padRight(feecost.u_TotalCost,60,' '));
            sb.append(padRight(feecost.o_LabCost,10,' '));
            sb.append(padRight(feecost.o_MatCost,30,' '));
            sb.append(padRight(feecost.o_TotalCost,160,' '));
            sb.append(padRight(feecost.TotalCost,10,' '));

            sb.append(padRight(" ",69,' '));
            sb.append(padRight(sdfDate.format(now),17,' '));
            sb.append("FFFF\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 检验批复EDI
     * @param input
     * @return
     */
    @Override
    public String getGESJointSurveyAUTEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();   //发送发
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        Date now = new Date();
        for (EdiPool ediPool : ediPoolList) {
            sb.append(padRight("TF        F",29,' '));
            sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
            //估价单号
            sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
            sb.append(padLeft("u2",2,' '));
            sb.append(padLeft(sdfDate.format(now),8,' '));
            sb.append(padRight(ediPool.getContainerNo()+"R",46,' '));
            sb.append(padRight("REF"+getISO95CntrSizeAndType(ediPool.getCourse()),46,' '));
            sb.append(padRight(sdfDate.format(now)+"12:00",32,' '));
            String condition = ediPool.getCondition()==null?"":ediPool.getCondition();
            sb.append(padRight(condition,49,' '));
            sb.append(padRight(receiver,19,' '));
            sb.append(padRight("F",10,' '));
            sb.append(padRight(sender,38,' '));
            sb.append(padRight("0.000",9,' '));
            String strcurrent="";
            if(ediPool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                if(StringUtils.isNotBlank(ediPool.getCwFee()+"")){
                    strcurrent = "CW" + ediPool.getCwFee();
                }else{
                    strcurrent = "CW";
                }
            }else{
                strcurrent = "CW0";
            }
            sb.append(padRight(strcurrent,210,' '));
            String labrate = getLabRate(containerUser,ediPool.getContainerCategory());
            sb.append(padRight("CNY"+labrate,15,' '));
            sb.append(padRight("CNY",31,' '));

            ClassifiedFeeCost feecost = getFeeCostById(ediPool.getCourse(), ediPool.getContainerCategory());
            sb.append(padRight(feecost.u_LabCost,10,' '));
            sb.append(padRight(feecost.u_MatCost,20,' '));
            sb.append(padRight("0",10,' '));
            sb.append(padRight(feecost.u_TotalCost,60,' '));
            sb.append(padRight(feecost.o_LabCost,10,' '));
            sb.append(padRight(feecost.o_MatCost,30,' '));
            sb.append(padRight(feecost.o_TotalCost,160,' '));
            sb.append(padRight(feecost.TotalCost,10,' '));

            sb.append(padRight(" ",28,' '));
            sb.append(padRight(ediPool.getEvaluateNo().substring(6),14,' '));
            String westim_authamt = ediPool.getWestimAuthamt()==null?"":ediPool.getWestimAuthamt();//TODO  edimainEntity.WESTIM_AUTHAMT    edi池表中无此字段
            sb.append(padRight(westim_authamt,27,' '));//这里是用于批复的
            sb.append(padRight(sdfDate.format(now),17,' '));
            sb.append("FFFF\n");
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     *SEACO 检测明细EDI
     * @param input
     * @return
     */
    @Override
    public String getGESJointSurveydtEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();   //发送发
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        String placecode = "";
        String matcode = "";
        String partcodeB = "";
        double amt = 0;
        Date now = new Date();
        for (EdiPool ediPool : ediPoolList) {
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationEntryList = getValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory());
            for (EvaluationEntry evaluationEntry : evaluationEntryList) {

                sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
                //估价单号
                sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
                sb.append(padLeft("1"+sdfDate.format(now),9,' '));
                sb.append(padRight(ediPool.getContainerNo()+"R",60,' '));
                sb.append(padRight(getLabRate(containerUser,ediPool.getContainerCategory()),15,' '));//取工时费率
                String sortCode = evaluationEntry.getSortcode()==null?"":evaluationEntry.getSortcode(); //TODO 估价表中不存在valEntity.SortCode
                sb.append(padRight(sortCode,2,' '));

                if(evaluationEntry.getQuantity()>=1){
                    //四舍五入
                    double   f   =   evaluationEntry.getQuantity();
                    BigDecimal   b   =   new   BigDecimal(f);
                    amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                }else{
                    amt = 1;
                }
                sb.append(padRight(evaluationEntry.getRepairCode()+amt,5,' '));

                if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    placecode = evaluationEntry.getPositionCode();
                    matcode = evaluationEntry.getMaterialCode();
                    partcodeB = evaluationEntry.getPartsDetailsCode().substring(0,3);
                }else{
                    //获取部件大类中文
                    String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                    String partType = getpartTypeByCode(partTypeCode);
                    placecode = getUnitPlaceCodeByPartCodeA(partType);
                    matcode = "MU";
                    partcodeB = getGMSPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                }

                String  strcurrent= "";
                strcurrent +=padLeft(evaluationEntry.getDamageCode(),2,' ');
                strcurrent +=padLeft(partcodeB,3,' ');
                strcurrent +=padLeft(matcode,2,' ');
                strcurrent +=padLeft(placecode,4,' ');
                sb.append(padRight(strcurrent,11,' '));

                strcurrent="";
                if(evaluationEntry.getPartsDetailsCode().contains("BUL")){
                    if(StringUtils.isBlank(evaluationEntry.getPartsDetailsCode().substring(3))){
                        strcurrent = evaluationEntry.getLength()+"";
                    }else{
                        strcurrent = evaluationEntry.getPartsDetailsCode().substring(3);
                    }
                }else{
                    strcurrent = evaluationEntry.getLength()==0?"":evaluationEntry.getLength()+"";
                }
                sb.append(padRight(strcurrent,8,' '));
                String width = evaluationEntry.getWidth()==0?"":evaluationEntry.getWidth()+"";
                sb.append(padRight(width,16,' '));
                sb.append(padRight("CMT"+evaluationEntry.getManHour(),11,' '));
                sb.append(padRight(evaluationEntry.getManHourCost()+"",15,' '));
                sb.append(evaluationEntry.getPayingParty()+"\r\n");
            }
        }
        ediText = sb.toString();
        return ediText;
    }

    /**
     * SEACO 检验明细批复EDI
     * @param input
     * @return
     */
    @Override
    public String getGESJointSurveydtAUTEDI(AddEdiMessageInput input) {
        String ediText = "";
        StringBuilder sb = new StringBuilder();
        if(input.getEdiConfig()==null || input.getEdiConfig().getContainerUser()==null){
            throw new InvalidException("EDI报文数据未配置，请维护");
        }
        String containerUser = input.getEdiConfig().getContainerUser();
        String sender = input.getEdiConfig().getSendCode();   //发送发
        String receiver = input.getEdiConfig().getReceptionCode();//接收方
        List<EdiPool> ediPoolList = getEdiPoolByEdiMessageInput(input);
        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyMMdd:HHmm");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfDate2yy = new SimpleDateFormat("yyMMdd");
        Date now = new Date();
        String strcurrent = "";
        String placecode = "";//位置代码
        String matcode = "";//材质代码
        String partcodeB = "";
        String feepayer = "";
        double amt;
        for (EdiPool ediPool : ediPoolList) {
            //取估价信息，箱体或者机组
            List<EvaluationEntry> evaluationEntryList = getValInfoByCntrIdAndCntrorUnit(ediPool.getCourse(), ediPool.getContainerCategory());
            for (EvaluationEntry evaluationEntry : evaluationEntryList) {
                sb.append(padRight("F"+sdfDate.format(now)+"F",18,' '));
                sb.append(padRight(ediPool.getEvaluateNo(),14,' '));
                sb.append(padLeft("2"+sdfDate.format(now),9,' '));
                sb.append(padRight(ediPool.getContainerNo()+"R",60,' '));
                sb.append(padRight(getLabRate(containerUser,ediPool.getContainerCategory()),15,' '));//取工时费率
                String sortCode = "";//TODO  估价表中不存在  valEntity.SortCode
                sb.append(padRight(sortCode,2,' '));

                if(evaluationEntry.getQuantity()>=1){
                    //四舍五入
                    double   f   =   evaluationEntry.getQuantity();
                    BigDecimal   b   =   new   BigDecimal(f);
                    amt  =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                }else{
                    amt = 1;
                }
                sb.append(padRight(evaluationEntry.getRepairCode()+amt,5,' '));

                if(evaluationEntry.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
                    placecode = evaluationEntry.getPositionCode();
                    matcode = evaluationEntry.getMaterialCode();
                    partcodeB = evaluationEntry.getPartsDetailsCode().substring(0,3);
                }else{
                    //获取部件大类中文
                    String partTypeCode = evaluationEntry.getPartsTypeCode()==null?"":evaluationEntry.getPartsTypeCode();
                    String partType = getpartTypeByCode(partTypeCode);
                    placecode = getUnitPlaceCodeByPartCodeA(partType);
                    matcode = "MU";
                    partcodeB = getGMSPartCodeB(evaluationEntry.getPartsDetailsCode().substring(0,3));
                }
                strcurrent= "";
                strcurrent +=padLeft(evaluationEntry.getDamageCode(),2,' ');
                strcurrent +=padLeft(partcodeB,3,' ');
                strcurrent +=padLeft(matcode,2,' ');
                strcurrent +=padLeft(placecode,4,' ');
                sb.append(padRight(strcurrent,11,' '));

                strcurrent="";
                if(evaluationEntry.getPartsDetailsCode().contains("BUL")){
                    if(StringUtils.isBlank(evaluationEntry.getPartsDetailsCode().substring(3))){
                        strcurrent = evaluationEntry.getLength()+"";
                    }else{
                        strcurrent = evaluationEntry.getPartsDetailsCode().substring(3);
                    }
                }else{
                    strcurrent = evaluationEntry.getLength()==0?"":evaluationEntry.getLength()+"";
                }
                sb.append(padRight(strcurrent,8,' '));
                String width = evaluationEntry.getWidth()==0?"":evaluationEntry.getWidth()+"";
                sb.append(padRight(width,16,' '));
                sb.append(padRight("CMT"+evaluationEntry.getManHour(),11,' '));
                sb.append(padRight(evaluationEntry.getMaterialCost()+"",15,' '));
                sb.append(evaluationEntry.getPayingParty()+"\r\n");
            }
        }
        ediText = sb.toString();
        return ediText;
    }


    /**
     * TRTN  转换部件明细代码
     * @param partcodeb
     * @return
     */
    public  String convertTRTNPartCodeB(String partcodeb)
    {
        String newcode = "";
        switch (partcodeb)
        {
            case "CIL": newcode = "CPH"; break;
            default: newcode = partcodeb; break;
        }
        return newcode;
    }


    public List<EvaluationEntry> getValInfoByCntrIdAndCntrorUnit(String courseId,String containerCategory){
        List<EvaluationEntry> list = new ArrayList<EvaluationEntry>();
        EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
        EvaluationEntryExample.Criteria criteria = evaluationEntryExample.createCriteria();
        if (!containerCategory.equals(ContainerCategoryEnum.CONTAINER_05.getCode()))
        {
            criteria.andCourseEqualTo(courseId);
            criteria.andContainerCategoryEqualTo(containerCategory);
            criteria.andIsDelEqualTo(PlatformConstants.IS_ADMIN_NO);
            criteria.andIsRepairEqualTo(CommonEnum.YES.getCode());
            evaluationEntryExample.setOrderByClause("container_category desc");
//                sql = string.Format("SELECT * FROM PM_ValuationInfo WHERE PARENTID='{0}' AND CNTRORUNIT='{1}' AND (ISGUA=0 OR ISGUA IS NULL)AND ENABLED=1 AND DELETIONSTATECODE=0 AND IsAgreeRep=1 AND (IsExportEDI=1 OR IsExportEDI IS NULL) ORDER BY CntrOrUnit DESC,SORTCODE", cntrId, cntrOrunit);
        }
        else//整体导入，TRTN 移除机组箱体限制。
        {
            criteria.andCourseEqualTo(courseId);
            criteria.andIsDelEqualTo(PlatformConstants.IS_ADMIN_NO);
            criteria.andIsRepairEqualTo(CommonEnum.YES.getCode());
            evaluationEntryExample.setOrderByClause("container_category desc");
//                sql = string.Format("SELECT * FROM PM_ValuationInfo WHERE PARENTID='{0}'  AND (ISGUA=0 OR ISGUA IS NULL)AND ENABLED=1 AND DELETIONSTATECODE=0 AND IsAgreeRep=1 AND (IsExportEDI=1 OR IsExportEDI=0 OR IsExportEDI IS NULL) ORDER BY  CntrOrUnit DESC,SORTCODE", cntrId);

        }
        List<EvaluationEntry> evaluationEntryList = evaluationEntryMapper.selectByExample(evaluationEntryExample);

        int sortCode = 1;
        for (EvaluationEntry  evaluationEntry:evaluationEntryList)
        {
            //解决工时费 材料费同时为0时 westimdt不体现该条目的问题
            if(evaluationEntry.getManHourCost().compareTo(BigDecimal.ZERO)==0 && evaluationEntry.getMaterialCost().compareTo(BigDecimal.ZERO)==0){
                if(evaluationEntry.getPartsDetailsCode().equals("ZZZ")){
                    list.add(evaluationEntry);
                }else{
                    continue;
                }
            }else{
//                dr["SortCode"] = sortCode++;//解决TRTN机组箱体一起排序的问题  ???
//                PMValuationInfoEntity valEntity = new PMValuationInfoEntity(dr);
//                list.Add(valEntity);
                list.add(evaluationEntry);
            }
        }
        return list;

    }

    static String getGMSPartCodeB(String partCodeB)
    {
        String newcode = partCodeB;
        switch (partCodeB)
        {
            case "SRT": newcode = "SSA"; break;
            case "CIL": newcode = "CPH"; break;
            case "DPP": newcode = "ERC"; break;
            case "DUC": newcode = "VLT"; break;
            case "DUV": newcode = "VLS"; break;
            case "DWC": newcode = "DRN"; break;
            case "DWF": newcode = "DRN"; break;
            case "EXV": newcode = "VEX"; break;
            case "VSC": newcode = "VDI"; break;
            case "RVN": newcode = "HWR"; break;
            case "FCC": newcode = "HWR"; break;
            case "PCT": newcode = "HVM"; break;
            case "EEC": newcode = "VLT"; break;
            case "VPS": newcode = "SRT"; break;
            case "ETS": newcode = "SRT"; break;
        }
        return newcode;
    }

    /**
     * 获取CMS EDI 估价信息
     * @param cntrId
     * @param cntrOrunit
     * @return  todo
     */
    private  List<EvaluationEntry> getGMSValInfo(String cntrId, String cntrOrunit)
    {
        List<EvaluationEntry> list = new ArrayList<EvaluationEntry>();
        List<Map<String, String>> gmsValInfos = ediMessageMapperExt.getGMSValInfo(cntrId);
        for(Map<String, String> map : gmsValInfos){
            try {
                if(map.get("GMSPARTCODE")!=null && StringUtils.isNotBlank(map.get("GMSPARTCODE"))){
                       map.put("parts_details_code",map.get("GMSPARTCODE")+"");
                }
                EvaluationEntry evaluationEntry = (EvaluationEntry) convertMap(EvaluationEntry.class, map);
                list.add(evaluationEntry);
            } catch (Exception e) {

            }
        }
        return list;
    }


    /**
     * Map转实体类共通方法
     *
     * @param type 实体类class
     * @param map map
     * @return Object
     * @throws Exception
     */
    public static Object convertMap(Class type, Map map) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        Object obj = type.newInstance();
        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : propertyDescriptors) {
            String propertyName = descriptor.getName();
            if (map.containsKey(propertyName)) {
                Object value = map.get(propertyName);
                descriptor.getWriteMethod().invoke(obj, value);
            }
        }
        return obj;
    }



    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(padLeft("zzz",16,' '));
        System.out.println(sb.toString()+"2");
    }


    public class ClassifiedFeeCost
    {
        public String u_LabCost = "0.00";
        public String u_MatCost = "0.00";
        public String u_TotalCost = "0.00";
        public String o_LabCost = "0.00";
        public String o_MatCost = "0.00";
        public String o_TotalCost = "0.00";
        public String i_LabCost = "0.00";
        public String i_MatCost = "0.00";
        public String i_TotalCost = "0.00";
        public String TotalCost = "0.00";
    }

    /**
     * SEACO 计算费用
     * @param courseId
     * @param cntrOrUnit
     * @return
     */
    public ClassifiedFeeCost getFeeCostById(String courseId,String cntrOrUnit){
        ClassifiedFeeCost feecostref = new ClassifiedFeeCost();
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        if(cntrOrUnit.equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
            list = ediMessageMapperExt.getSEACOFeeCostByIdForBox(courseId);
        }else{//机组
            list = ediMessageMapperExt.getSEACOFeeCostByIdForUnit(courseId);
        }
        if(list != null && list.size()>0){
            feecostref.u_LabCost = StringUtils.isBlank(list.get(0).get("U_LABCOST")) ? "0.00" : list.get(0).get("U_LABCOST");
            feecostref.u_MatCost = StringUtils.isBlank(list.get(0).get("U_MATCOST")) ? "0.00" : list.get(0).get("U_MATCOST");
            feecostref.u_TotalCost = StringUtils.isBlank(list.get(0).get("U_TOTALCOST")) ? "0.00" : list.get(0).get("U_TOTALCOST");
            feecostref.o_LabCost = StringUtils.isBlank(list.get(0).get("O_LABCOST")) ? "0.00" : list.get(0).get("O_LABCOST");
            feecostref.o_MatCost = StringUtils.isBlank(list.get(0).get("O_MATCOST")) ? "0.00" : list.get(0).get("O_MATCOST");
            feecostref.o_TotalCost = StringUtils.isBlank(list.get(0).get("O_TOTALCOST")) ? "0.00" : list.get(0).get("O_TOTALCOST");
            feecostref.i_LabCost = StringUtils.isBlank(list.get(0).get("I_LABCOST")) ? "0.00" : list.get(0).get("I_LABCOST");
            feecostref.i_MatCost = StringUtils.isBlank(list.get(0).get("I_MATCOST")) ? "0.00" : list.get(0).get("I_MATCOST");
            feecostref.i_TotalCost = StringUtils.isBlank(list.get(0).get("I_TOTALCOST")) ? "0.00" : list.get(0).get("I_TOTALCOST");
            feecostref.TotalCost = StringUtils.isBlank(list.get(0).get("TOTALCOST")) ? "0.00" : list.get(0).get("TOTALCOST");
        }

        return  feecostref;
    }


    public ClassifiedFeeCost getTexZDFeeCostById(String courseId,String cntrOrUnit){
        ClassifiedFeeCost feecostref = new ClassifiedFeeCost();
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        if(cntrOrUnit.equals(ContainerCategoryEnum.CONTAINER_02.getCode())){//箱体
            list = ediMessageMapperExt.getTexZDFeeCostByIdForBox(courseId);
        }else{//机组
            list = ediMessageMapperExt.getTexZDFeeCostByIdForUnit(courseId);
        }
        if(list != null && list.size()>0){
            feecostref.u_LabCost = StringUtils.isBlank(list.get(0).get("U_LABCOST")) ? "0.00" : list.get(0).get("U_LABCOST");
            feecostref.u_MatCost = StringUtils.isBlank(list.get(0).get("U_MATCOST")) ? "0.00" : list.get(0).get("U_MATCOST");
            feecostref.u_TotalCost = StringUtils.isBlank(list.get(0).get("U_TOTALCOST")) ? "0.00" : list.get(0).get("U_TOTALCOST");
            feecostref.o_LabCost = StringUtils.isBlank(list.get(0).get("O_LABCOST")) ? "0.00" : list.get(0).get("O_LABCOST");
            feecostref.o_MatCost = StringUtils.isBlank(list.get(0).get("O_MATCOST")) ? "0.00" : list.get(0).get("O_MATCOST");
            feecostref.o_TotalCost = StringUtils.isBlank(list.get(0).get("O_TOTALCOST")) ? "0.00" : list.get(0).get("O_TOTALCOST");
            feecostref.i_LabCost = StringUtils.isBlank(list.get(0).get("I_LABCOST")) ? "0.00" : list.get(0).get("I_LABCOST");
            feecostref.i_MatCost = StringUtils.isBlank(list.get(0).get("I_MATCOST")) ? "0.00" : list.get(0).get("I_MATCOST");
            feecostref.i_TotalCost = StringUtils.isBlank(list.get(0).get("I_TOTALCOST")) ? "0.00" : list.get(0).get("I_TOTALCOST");
            feecostref.TotalCost = StringUtils.isBlank(list.get(0).get("TOTALCOST")) ? "0.00" : list.get(0).get("TOTALCOST");
        }

        return  feecostref;
    }


        /**
         *@Description: 获取One估价信息
         *@Param: [course, containerCategory]
         *@return: java.util.List<com.sanlly.production.entity.EvaluationEntry>
         *@Author: zjd
         *@date: 2019-10-22
         */
        public List<EvaluationEntry> getOneEvaluationInfo(String course, String containerCategory){
            List<String> noPayingParty = new ArrayList<>();
            noPayingParty.add("T");
            noPayingParty.add("U");
            EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
            evaluationEntryExample.createCriteria().andCourseEqualTo(course).
                    andIsRepairEqualTo(CommonEnum.YES.getCode()).
                    andSumMoneyNotEqualTo(new BigDecimal("0"))
                    .andContainerCategoryEqualTo(containerCategory).andPayingPartyNotIn(noPayingParty).
                    andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            List<EvaluationEntry> evaluationEntryList = evaluationEntryMapper.selectByExample(evaluationEntryExample);
            return evaluationEntryList;
        }

    /**
    *@Description: String左对齐 向右补齐
    *@Param: [src, len, ch]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-23
    */
    public static String padRight(String src, int len, char ch) {
        int diff = len - src.length();
        if (diff <= 0) {
            return src;
        }

        char[] charr = new char[len];
        System.arraycopy(src.toCharArray(), 0, charr, 0, src.length());
        for (int i = src.length(); i < len; i++) {
            charr[i] = ch;
        }
        return new String(charr);
    }

    /**
    *@Description: String 右对齐 向左补齐
    *@Param: [src, len, ch]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-23
    */
    public static String padLeft(String src, int len, char ch) {
        int diff = len - src.length();
        if (diff <= 0) {
            return src;
        }

        char[] charr = new char[len];
        System.arraycopy(src.toCharArray(), 0, charr, diff, src.length());
        for (int i = 0; i < diff; i++) {
            charr[i] = ch;
        }
        return new String(charr);
    }


    /**
    *@Description: append添加空格
    *@Param: []
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-22
    */
    public StringBuilder addSpace(int lenght,StringBuilder sb){
         for(int i=0;i<lenght;i++){
             sb.append(" ");
         }
         return sb;
    }

    /**
    *@Description: 获取CMA部件明细代码
    *@Param: [partCodeB]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-21
    */
    public String getCMAPartCodeB(String partCodeB)
    {
        String newcode = partCodeB;
        switch (partCodeB)
        {
            case "SRT": newcode = "SSA"; break;
            case "CIL": newcode = "CPH"; break;
            case "DPP": newcode = "ERC"; break;
            case "DUC": newcode = "VLT"; break;
            case "DUV": newcode = "VLS"; break;
            case "DWC": newcode = "DRN"; break;
            case "DWF": newcode = "DRN"; break;
            case "EXV": newcode = "VEX"; break;
            case "VSC": newcode = "VDI"; break;
            case "RVN": newcode = "HWR"; break;
            case "FCC": newcode = "HWR"; break;
            case "PCT": newcode = "HVM"; break;
            case "EEC": newcode = "VLT"; break;
            case "VPS": newcode = "SRT"; break;
            case "ETS": newcode = "SRT"; break;
        }
        return newcode;
    }

    /**
    *@Description: 查询选中进场id,箱类型,对应edi信息
    *@Param:
    *@return:
    *@Author: zjd
    *@date: 2019-10-19
    */
    public List<EdiPool>  getEdiPoolByEdiMessageInput(AddEdiMessageInput input){
        AddEdiMessageInput.EdiMessageInput[] ediMessageInputs = input.getEdiMessageInputs();
        EdiPoolExample ediPoolExample = new EdiPoolExample();
        for(AddEdiMessageInput.EdiMessageInput ediMessageInput : ediMessageInputs){
            EdiPoolExample.Criteria ediPoolExampleCriteria = ediPoolExample.createCriteria();
            String courseId = ediMessageInput.getCourseId();
            String containerCategory = ediMessageInput.getContainerCategory();
            ediPoolExampleCriteria.andCourseEqualTo(courseId).andContainerCategoryEqualTo(containerCategory);
            ediPoolExample.or(ediPoolExampleCriteria);
        }
        //查询选中进场id,箱类型,对应edi信息
        List<EdiPool> ediPoolList = ediPoolMapper.selectByExample(ediPoolExample);
        return ediPoolList;
    }


    /**
    *@Description: 转化保留两位小数，不足补0
    *@Param:
    *@return:
    *@Author: zjd
    *@date: 2019-10-17
    */
    public String coverRemainTwo(double d){
        String format = String.format("%.2f", d);
         return format;
    }

    /**
    *@Description: 根据部件大类代码获取中文
    *@Param:
    *@return:
    *@Author: zjd
    *@date: 2019-10-17
    */
    public String getpartTypeByCode(String partTypeCode){
        String partType = "";
        if(StringUtils.isNotBlank(partTypeCode)){
            PartsTypeExample partsTypeExample = new PartsTypeExample();
            partsTypeExample.createCriteria().andPartsTypeCodeEqualTo(partTypeCode);
            List<PartsType> partsTypes = partsTypeMapper.selectByExample(partsTypeExample);
            if(partsTypes!=null && partsTypes.size()>0){
                partType = partsTypes.get(0).getPartsTypeName();
            }
        }
        return partType;
    }


    /**
    *@Description: 根据用箱人查询对应箱型的工时费率
    *@Param: [cntrUser, cntrOrUnit]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-16
    */
    protected  String getLabRate(String cntrUser, String cntrOrUnit)
    {
        String labrate = "";
        //根据用箱人查询工时费率
        ManhourRateExample manhourRateExample = new ManhourRateExample();
        manhourRateExample.createCriteria().andContainerUserEqualTo(cntrUser);
        List<ManhourRate> manhourRateList = manhourRateMapper.selectByExample(manhourRateExample);
        if (manhourRateList!=null &&  manhourRateList.size() > 0)
        {
            if (cntrOrUnit.equals(ContainerCategoryEnum.CONTAINER_02.getCode())) //箱体
                labrate =manhourRateList.get(0).getContbodyManhourRate()+"";
            else if (cntrOrUnit.equals(ContainerCategoryEnum.CONTAINER_03.getCode()))//机组
                labrate =manhourRateList.get(0).getUnitManhourRate()+"";
            else if (cntrOrUnit.equals(ContainerCategoryEnum.CONTAINER_01.getCode()))  //干箱
            {
                labrate =manhourRateList.get(0).getDrycontManhourRate()+"";
            }
            else{
                labrate =manhourRateList.get(0).getContbodyManhourRate()+"";
            }
        }
        else
        {
            System.out.println("没有检测到对应用箱人【"+cntrUser+"】的工时费率信息。");
        }
        return labrate;
    }


    /**
    *@Description: 获取iso95 尺寸箱型
    *@Param: [size, type, cntrid]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-16
    */
    private  String getISO95CntrSizeAndType(String cntrid)
    {
        String cntrSizeAndType = "";
        List<Map<String, String>> iso95CntrSizeAndTypeList = ediMessageMapperExt.getISO95CntrSizeAndType(cntrid);
        if(iso95CntrSizeAndTypeList != null && iso95CntrSizeAndTypeList.size()>0){
            cntrSizeAndType = iso95CntrSizeAndTypeList.get(0).get("iso95");
        }
        return cntrSizeAndType;
    }


    private  List<EvaluationEntry> getCMAValInfoByCntrIdAndCntrorUnit(String cntrId, String cntrOrunit, boolean isAUT)
    {
        //SortCode   ???
        //DELETIONSTATECODE    ???
        //IsExportEDI   估价表中无字段???
        List<EvaluationEntry> list = new ArrayList<EvaluationEntry>();
        EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
        EvaluationEntryExample.Criteria criteria = evaluationEntryExample.createCriteria();
        if (!cntrOrunit.equals(ContainerCategoryEnum.CONTAINER_05.getCode()))
        {
                criteria.andCourseEqualTo(cntrId);
                criteria.andContainerCategoryEqualTo(cntrOrunit);
                criteria.andIsDelEqualTo(PlatformConstants.IS_ADMIN_NO);
                criteria.andIsRepairEqualTo(CommonEnum.YES.getCode());
                evaluationEntryExample.setOrderByClause("container_category desc");
//                sql = string.Format("SELECT * FROM PM_ValuationInfo WHERE PARENTID='{0}' AND CNTRORUNIT='{1}' AND (ISGUA=0 OR ISGUA IS NULL)AND ENABLED=1 AND DELETIONSTATECODE=0 AND IsAgreeRep=1 AND (IsExportEDI=1 OR IsExportEDI IS NULL) ORDER BY CntrOrUnit DESC,SORTCODE", cntrId, cntrOrunit);
        }
        else//整体导入，TRTN 移除机组箱体限制。
        {
            criteria.andCourseEqualTo(cntrId);
            criteria.andIsDelEqualTo(PlatformConstants.IS_ADMIN_NO);
            criteria.andIsRepairEqualTo(CommonEnum.YES.getCode());
            evaluationEntryExample.setOrderByClause("container_category desc");
//                sql = string.Format("SELECT * FROM PM_ValuationInfo WHERE PARENTID='{0}'  AND (ISGUA=0 OR ISGUA IS NULL)AND ENABLED=1 AND DELETIONSTATECODE=0 AND IsAgreeRep=1 AND (IsExportEDI=1 OR IsExportEDI=0 OR IsExportEDI IS NULL) ORDER BY  CntrOrUnit DESC,SORTCODE", cntrId);

        }
        List<EvaluationEntry> evaluationEntryList = evaluationEntryMapper.selectByExample(evaluationEntryExample);

        int sortCode = 1;
        for (EvaluationEntry  evaluationEntry:evaluationEntryList)
        {
            //解决工时费 材料费同时为0时 westimdt不体现该条目的问题
            if(evaluationEntry.getManHourCost().compareTo(BigDecimal.ZERO)==0 && evaluationEntry.getMaterialCost().compareTo(BigDecimal.ZERO)==0){
                continue;
            }else{
//                dr["SortCode"] = sortCode++;//解决TRTN机组箱体一起排序的问题  ???
//                PMValuationInfoEntity valEntity = new PMValuationInfoEntity(dr);
//                list.Add(valEntity);
                list.add(evaluationEntry);
            }


        }
        return list;
    }

    /**
    *@Description: 转化为中远的部件明细
    *@Param: [partcodeb]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-17
    */
    public  String convertCOSPartCodeB(String partcodeb)
    {
        String newcode = "";
        switch (partcodeb)
        {
            case "DSC": newcode = "DSH"; break;
            case "GAS": newcode = "DCS"; break;
            case "HGP": newcode = "DAA"; break;
            case "FRSS": newcode = "MCO"; break;
            case "PVT": newcode = "VRA"; break;
            case "TSG": newcode = "RLG"; break;
            case "LBR": newcode = "LBA"; break;
            case "FLT": newcode = "FLW"; break;
            case "TUS": newcode = "TUC"; break;
            case "LBL": newcode = "DHH"; break;

            case "SPA":
            case "FPA":
            case "RPA":
            case "DPA": newcode = "PAA"; break;
            //case "BSG":
            //case "RTG":
            //case "RBG": newcode = "RLG"; break;
            case "FTR":
            case "FBR":
            case "RTR":
            case "RBR":
            case "BSR": newcode = "RLA"; break;
            //case "DHL": newcode = "LBH"; break;
            //case "LBL":
            //case "HWR":
            //case "DHR": newcode = "DHC"; break;

            //2017-02-23修改
            case "BSP": newcode = "ESP"; break;
            case "RSP":
            case "LSP":
            case "USP":
            case "SPR": newcode = "FRS"; break;
            case "HWR": newcode = "SCW"; break;
            case "BST": newcode = "EST"; break;
            case "MOL": newcode = "MRU"; break;
            case "CCA": newcode = "CPA"; break;
            case "CCJ": newcode = "CPJ"; break;
            case "ERB": newcode = "JEO"; break;
            case "EAS": newcode = "CAS"; break;
            case "EPP": newcode = "ECB"; break;
            case "RFU":
            case "FAS": newcode = "RCF"; break;
            case "FCP": newcode = "CPA"; break;
            case "CTK": newcode = "CHR"; break;
            case "PCU": newcode = "RCI"; break;
            case "FRS": newcode = "SLC"; break;
            case "BSG": newcode = "RLG"; break;
            case "OHPC": newcode = "HPP"; break;

            case "CIL": newcode = "CPH"; break;
            case "DPP": newcode = "ERC"; break;
            case "DUC": newcode = "VLT"; break;
            case "DUV": newcode = "VLS"; break;
            case "DWC": newcode = "DRN"; break;
            case "DWF": newcode = "DRN"; break;
            case "EXV": newcode = "VEX"; break;
            case "VSC": newcode = "VDI"; break;
            case "RVN": newcode = "HWR"; break;
            case "FCC": newcode = "HWR"; break;
            case "PCT": newcode = "HVM"; break;
            case "EEC": newcode = "VLT"; break;
            case "VPS": newcode = "SRT"; break;
            case "ETS": newcode = "SRT"; break;

            default: newcode = partcodeb; break;
        }
        return newcode;
    }


    /**
    *@Description: 机组部件大类与位置代码对应
    *@Param: [partcodeA] 机组部件大类
    *@return: java.lang.String  位置代码
    *@Author: zjd
    *@date: 2019-10-17
    */
    public static String getUnitPlaceCodeByPartCodeA(String partcodeA)
    {
        String placecodeA = "";
        switch (partcodeA)
        {
            case "压缩机部分": placecodeA = "MQNN"; break;
            case "冷凝器部分": placecodeA = "MKNN"; break;
            case "蒸发器部分": placecodeA = "MVNN"; break;
            case "电器部分": placecodeA = "MENN"; break;
            case "控制部分": placecodeA = "MCNN"; break;
            case "记录钟部分": placecodeA = "MCNN"; break;
            case "管路部分": placecodeA = "MPNN"; break;
            case "传感器部分": placecodeA = "MCNN"; break;
            case "机组框架部分": placecodeA = "MFNN"; break;
            case "其它部分": placecodeA = "MZNN"; break;
            case "ZZZ": placecodeA = "ZZZZ"; break;
            default: break;
        }
        return placecodeA;
    }

    /**
    *@Description: 转换为中远的修理代码
    *@Param: [repcode]
    *@return: java.lang.String
    *@Author: zjd
    *@date: 2019-10-17
    */
    public  String convertCOSRepCode(String repcode)
    {
        String newcode = "";
        //if (partcodeb == "DCS")
        //{
        //    switch (repcode)
        //    {
        //        case "SE": newcode = "BD"; break;
        //        case "RR": newcode = "BD"; break;
        //        default: break;
        //    }
        //}
        //else
        if (repcode == "CP")
            newcode = "CC";
        else
            newcode = repcode;
        return newcode;

    }
    /**
    *@Description: 根据箱号和付费方查询费用
    *@Param: [cntrId]
    *@return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
    *@Author: zjd
    *@date: 2019-10-18
    */
    private   List<Map<String,Object>> getFeeCostGroupByCntrNoAndFeePayer(String cntrId)
    {
        List<Map<String,Object>> list = ediMessageMapperExt.getFeeCostGroupByCntrNoAndFeePayer(cntrId);

        return list;
    }

}
