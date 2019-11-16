package com.sanlly.purchase.utils;

import java.lang.reflect.Field;

/**
 * @Description: TODO
 * @ClassName: ObjectUtils
 * @Date: 2019/10/23 10:16
 * @Version 1.0
 * @Author mqz
 */
public class ObjectIsNullUtils {

    public static boolean checkObjFieldIsNull(Object obj) throws IllegalAccessException {
        for (Field f : obj.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            if (f.get(obj) != null) {
                return false;
            }
        }
        return true;
    }

}
