package com.sanlly.common.utils;

import java.beans.Introspector;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import com.sanlly.common.models.input.EntityFunction;
import com.sanlly.common.models.input.PageInput;

/**
 * 
 * @author RexSheng
 * 2019年11月11日 下午2:53:51
 */
public class EntityFunctionUtil {
	private static final Pattern GET_PATTERN = Pattern.compile("^get[A-Z].*");
    private static final Pattern IS_PATTERN  = Pattern.compile("^is[A-Z].*");

//    @SuppressWarnings("rawtypes")
//	private static String fnToFieldName(EntityFunction fn) {
//        try {
//            Method method = fn.getClass().getDeclaredMethod("writeReplace");
//            method.setAccessible(Boolean.TRUE);
//            SerializedLambda serializedLambda = (SerializedLambda) method.invoke(fn);
//            String getter = serializedLambda.getImplMethodName();
//            if (GET_PATTERN.matcher(getter).matches()) {
//                getter = getter.substring(3);
//            } else if (IS_PATTERN.matcher(getter).matches()) {
//                getter = getter.substring(2);
//            }
//            else {
//            	throw new RuntimeException("Lambda表达式错误，正确示例EntityFunction<TEntity,Integer> fn=TEntity::getEntityId");
//            }
//            return Introspector.decapitalize(getter);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
    
   	public static <T> String fnToFieldName(EntityFunction<T,Object> fn) {
           try {
               Method method = fn.getClass().getDeclaredMethod("writeReplace");
               method.setAccessible(Boolean.TRUE);
               SerializedLambda serializedLambda = (SerializedLambda) method.invoke(fn);
               String getter = serializedLambda.getImplMethodName();
               if (GET_PATTERN.matcher(getter).matches()) {
                   getter = getter.substring(3);
               } else if (IS_PATTERN.matcher(getter).matches()) {
                   getter = getter.substring(2);
               }
               else {
               	throw new RuntimeException("Lambda表达式错误，正确示例EntityFunction<TEntity,Integer> fn=TEntity::getEntityId");
               }
               return Introspector.decapitalize(getter);
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
    
    public static void main(String[] args) {
//    	System.out.println(EntityFunctionUtil.fnToFieldName(PageInput::getPageIndex));
//    	System.out.println(EntityFunctionUtil.fnToFieldName((PageInput a)->a.getPageIndex()));
    }
}
