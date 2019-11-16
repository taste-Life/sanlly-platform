package com.sanlly.finance;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

import com.sanlly.finance.entity.BillRepairDetail;

public class Test {

	//运行main方法，拷贝控制台输出的内容，就是sql语句了，放到oracle执行插入（sql仅供参考，具体看自己的表结构）　　
	public static void main(String[] args) throws ParseException {
	        // System.out.println("INSERT INTO `finance_bill_type` VALUES ('1', '1', '1', '1', '1', '0', '0', null, null, null, null, null);");

//	         int i=1;
//	            for (FinanceBillTypeEnum direction : FinanceBillTypeEnum.values()) {
//	            	Integer a=0;
//	            	if(direction.getMessage().indexOf("成本")>0) {
//	            		a=1;
//	            	}
//	                System.out.println("INSERT INTO finance_bill_type  VALUES ('"+i+"', '"+direction.getMessage()+"', '"+direction.getMessage()+"', '"+direction.getCode()+"', "+a+", '0', null, null, null, null, null);");
//	                i++;
//	                 
//	            }
		
		
//		String identityCode=String.format("%07d", 123);
//		
//		System.out.println(identityCode);
		
//		System.out.println(DateUtils.dateFormat(new Date(),"YYYY-MM"));
		
//		List<BillRepairDetail> detailBsList=new ArrayList<BillRepairDetail>();
//		BillRepairDetail brd=new BillRepairDetail();
//		brd.setDeptKey("aaa");
//		brd.setChargeTypeKey("LKF");
//		brd.setRealNotaxTotalCostRmb(100.00);
//		detailBsList.add(brd);
//		
//		brd=new BillRepairDetail();
//		brd.setDeptKey("bbb");
//		brd.setChargeTypeKey("LKF1");
//		brd.setRealNotaxTotalCostRmb(100.00);
//		detailBsList.add(brd);
//		
//		
//		brd=new BillRepairDetail();
//		brd.setDeptKey("aaa");
//		brd.setChargeTypeKey("LKF");
//		brd.setRealNotaxTotalCostRmb(100.00);
//		detailBsList.add(brd);
//		
//		
//		brd=new BillRepairDetail();
//		brd.setDeptKey("aaa");
//		brd.setChargeTypeKey("LKF");
//		brd.setRealNotaxTotalCostRmb(100.00);
//		detailBsList.add(brd);
//		
//		
//		
//		
//		
//		Map<String, Map<String, List<BillRepairDetail>>> menuGroupMap = detailBsList.stream()
//				.collect(Collectors.groupingBy(BillRepairDetail::getDeptKey,
//						Collectors.groupingBy(BillRepairDetail::getChargeTypeKey)));
//		
//		Double aaa=detailBsList.stream().map(x->{
//			if(x.getRealNotaxTotalCostUsa()==null) {
//				return 0.00;
//			}else {
//				return x.getRealNotaxTotalCostUsa();
//			}
//		}).reduce(0.00, Double::sum);
//		
//		System.out.println(menuGroupMap.size());
		
		
//		String formula="(xx)USD*汇率-(xx)CNY";
//		//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
//		String str=formula;
//		String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
//		//去掉第一个括号
//		String tmpStr=str.substring(str.lastIndexOf("("),str.length());
//		String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
//		
//		System.out.println(firstNum);
//		System.out.println(secondNum);
		
//		BigDecimal manHourCost = new BigDecimal("334.19");
////		manHourCost.setScale(2);
//		System.out.println(manHourCost);
		 
		
		DateFormat df = new SimpleDateFormat("yyyy-MM");
		 Calendar cal = Calendar.getInstance();
		 Calendar cal2 = Calendar.getInstance();
	     cal.setTime(df.parse(df.format(new Date())));//设置时间
	     cal2.setTime(df.parse("2019-10"));
	     System.out.println(cal.getTime());
	     System.out.println(cal2.getTime());
	     
	     
	     String aa="2019-10";
	     String bb="2019-09";

	     System.out.println(df.format(new Date()));

	}

}
