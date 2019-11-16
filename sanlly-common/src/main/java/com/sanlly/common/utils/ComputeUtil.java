package com.sanlly.common.utils;

import java.math.BigDecimal;


 

 

/**
 *  由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精
 * 确的浮点数运算，包括加减乘除和四舍五入。
* @Package com.sanlly.common.utils 
* @Description: TODO 
* @author fjy   
* @date 2019年9月5日 下午7:44:09 
* @version V1.0   
 */
public class ComputeUtil {

	//默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;
    private static final int roundScale=2;
    //这个类不能实例化
    private ComputeUtil(){
    }
 
    /**
     * 提供精确的加法运算。
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static BigDecimal add(BigDecimal v1,BigDecimal v2){
    	if(v1==null) {
    		v1=BigDecimal.ZERO;
    	}
    	if(v2==null) {
    		v2=BigDecimal.ZERO;
    	}
    	
        return round(v1.add(v2),roundScale);
    }
    /**
     * 提供精确的减法运算。
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static BigDecimal sub(BigDecimal v1,BigDecimal v2){
    	if(v1==null) {
    		v1=BigDecimal.ZERO;
    	}
    	if(v2==null) {
    		v2=BigDecimal.ZERO;
    	}
        return round(v1.subtract(v2),roundScale);
    }
    /**
     * 提供精确的乘法运算。
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static BigDecimal mul(BigDecimal v1,BigDecimal v2){
    	if(v1==null) {
    		v1=BigDecimal.ZERO;
    	}
    	if(v2==null) {
    		v2=BigDecimal.ZERO;
    	}
        return round(v1.multiply(v2),roundScale);
    }
 
    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后10位，以后的数字四舍五入。
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static BigDecimal div(BigDecimal v1,BigDecimal v2){
    	if(v1==null||v2==null) {
    		return BigDecimal.ZERO;
    	}
        return round(div(v1,v2,DEF_DIV_SCALE),roundScale);
    }
 
    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     * @param v1 被除数
     * @param v2 除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static BigDecimal div(BigDecimal v1,BigDecimal v2,int scale){
    	if(v1==null||v2==null) {
    		return BigDecimal.ZERO;
    	}
        if(scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        return round(v1.divide(v2,scale,BigDecimal.ROUND_HALF_UP),roundScale);
    }
 
    /**
     * 提供精确的小数位四舍五入处理。
     * @param v 需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static BigDecimal round(BigDecimal v,int scale){
 
        if(scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
      
        BigDecimal one = new BigDecimal("1");
        return v.divide(one,scale,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * double类型精确加法运算 保留两位小数
     *
     * @param v1 加数1
     * @param v2 加数2
     * @return v1+v2
     * @author lishzh
     */
    public static double add(Double v1,Double v2){
        if (v1==null||v2==null){
            throw new IllegalArgumentException("v1 and v2 can not be null");
        }
        return add(new BigDecimal(v1),new BigDecimal(v2)).doubleValue();
    }
 
    public static void main(String [] args){
    	BigDecimal a = new BigDecimal(0.123);
    	BigDecimal b = new BigDecimal(0.456);
        System.out.println(a.doubleValue() * b.doubleValue());
        System.out.println(ComputeUtil.mul(a,b));
 
    }

    
    
//
//
//    public static BigDecimal add(double v1,double v2){
//        BigDecimal b1 = new BigDecimal(Double.toString(v1));
//        BigDecimal b2 = new BigDecimal(Double.toString(v2));
//        return b1.add(b2);
//    }
//
//    public static BigDecimal sub(double v1,double v2){
//        BigDecimal b1 = new BigDecimal(Double.toString(v1));
//        BigDecimal b2 = new BigDecimal(Double.toString(v2));
//        return b1.subtract(b2);
//    }
//
//
//    public static BigDecimal mul(double v1,double v2){
//        BigDecimal b1 = new BigDecimal(Double.toString(v1));
//        BigDecimal b2 = new BigDecimal(Double.toString(v2));
//        return b1.multiply(b2);
//    }
//
//    public static BigDecimal div(double v1,double v2){
//        BigDecimal b1 = new BigDecimal(Double.toString(v1));
//        BigDecimal b2 = new BigDecimal(Double.toString(v2));
//        return b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);//四舍五入,保留2位小数
//
//        //除不尽的情况
//    }



}