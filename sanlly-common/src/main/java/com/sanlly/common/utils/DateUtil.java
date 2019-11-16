package com.sanlly.common.utils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * 日期相关工具类
 * 
 * @author zhangkai
 *
 */
public class DateUtil {

	private DateUtil() {

	}

	/*
	 * 维护一个日子转换格式
	 */
	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 一天中的毫秒数
	 */
	private static final long ONE_DAY_MILLISECOND = 1 * 24 * 60 * 60 * 1000;

	/**
	 * 字符串转日期
	 * 
	 * @param dateString
	 * @return
	 */
	public static Date string2Date(String dateString) {
		Date date = null;
		try {
			date = SDF.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 日期转字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String date2String(Date date) {
		if (date == null) {
			return "";
		}
		return SDF.format(date);
	}

	/**
	 * 获取下一天的日期
	 *
	 * @author lishzh
	 * @param date
	 * @return date of next day
	 */
	public static Date nextDay(Date date) {
		return new Date(date.getTime() + ONE_DAY_MILLISECOND);
	}
	/**
     * date2比date1多的天数
     * @param date1    
     * @param date2
     * @return    
     */
    public static int differentDays(Date date1,Date date2)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
       int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
        
        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年            
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }
            
            return timeDistance + (day2-day1) ;
        }
        else    //不同年
        {
            System.out.println("判断day2 - day1 : " + (day2-day1));
            return day2-day1;
        }
    }

	public static void main(String[] args) throws IOException {
		
		File parentDir=new File("tmp");
		if(!parentDir.exists()) {
			parentDir.mkdir();
		}
		
		File tempFile=File.createTempFile(UUID.randomUUID().toString(), ".txt",parentDir);
		String path=tempFile.getCanonicalPath();
		System.out.println(path);
//		String a="前缀{0:yyMMdd}_{XXXXXX}dd{0:yyMMddHHmmssSSS}ff{XXX}";
//		String b=convertDateFromFormat(a);
//		
//		convertNumberFromFormat(b,34);
		String fileName="adfadf_asdfasfsadfsa.txt";
		String prefix=fileName.substring(0,fileName.lastIndexOf("."));
		String suffix=fileName.substring(fileName.lastIndexOf("."));
		System.out.println(prefix);
		System.out.println(suffix);
		convertDateFromEdiFileFormat("{导出日期:yyyyMMdd }{EDI类型}.exp_{导出日期:yyyyMMdd HHmmss}C.txt");
	}
	
	public static String convertDateFromFormat(String format) {
		String a=format;
		int i=a.indexOf("{0:");
		while(i>-1 && i<a.length()) {
			String dateFormat=a.substring(i,a.indexOf("}",i+1)+1);
			String newDateFormat=dateFormat.substring(3,dateFormat.length()-1);
			SimpleDateFormat sdf=new SimpleDateFormat(newDateFormat);
			a=a.replace(dateFormat, sdf.format(new java.util.Date()));
			i=a.indexOf("{0:",i+1);
		}
		System.out.println(a);
		return a;
	}
	
	public static String convertNumberFromFormat(String format,int currentNumber) {
		int j=format.toUpperCase().indexOf("{X");
		while(j>-1 && j<format.length()) {
			int endIndex=format.toUpperCase().indexOf("}", j+1);
			String cutString=format.substring(j, endIndex+1);
			int length=cutString.length()-2;
			String newNumberStr=String.valueOf(currentNumber);
			while(newNumberStr.length()<length) {
				newNumberStr="0"+newNumberStr;
			}
			newNumberStr=newNumberStr.substring(newNumberStr.length()-length);
			format=format.replace(cutString, newNumberStr);
			j=format.toUpperCase().indexOf("{X",endIndex+1);
		}
		System.out.println(format);
		return format;
	}
	
	public static String convertDateFromEdiFileFormat(String format) {
		String a=format;
		int i=a.indexOf("{导出日期:");
		while(i>-1 && i<a.length()) {
			String dateFormat=a.substring(i,a.indexOf("}",i+1)+1);
			String newDateFormat=dateFormat.substring(6,dateFormat.length()-1);
			SimpleDateFormat sdf=new SimpleDateFormat(newDateFormat);
			a=a.replace(dateFormat, sdf.format(new java.util.Date()));
			i=a.indexOf("{导出日期:",i+1);
		}
		System.out.println(a);
		return a;
	}
	
}
