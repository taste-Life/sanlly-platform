package com.sanlly.production.lang;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class LangTest {

	static Map<String, String> langMap = new HashMap<String, String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestChildEntity testChildEntity = new TestChildEntity();
		testChildEntity.name1 = "测试1";
		testChildEntity.name2 = "测试2";
		testChildEntity.name3 = "测试3";
		testChildEntity.name4 = "测试4";
		testChildEntity.name5 = "测试5";
		testChildEntity.name6 = "测试6";
		testChildEntity.name7 = "测试7";
		testChildEntity.name8 = "测试8";
		testChildEntity.name9 = "测试9";
		testChildEntity.name10 = "测试10";
		testChildEntity.name1_lang = "keytest00010001";
		testChildEntity.name2_lang = "keytest00020001";
		testChildEntity.name3_lang = "keytest00030001";
		testChildEntity.name4_lang = "keytest00040001";
		testChildEntity.name5_lang = "keytest00030005";
		testChildEntity.name6_lang = "keytest00030006";
		testChildEntity.name7_lang = "keytest00030007";
		testChildEntity.name8_lang = "keytest00030008";
		testChildEntity.name9_lang = "keytest00030009";
		testChildEntity.name10_lang = "keytest00030010";
		List<TestChildEntity> testChildEntities = new ArrayList<TestChildEntity>();
		for (int i = 0; i < 200; i++) {
			testChildEntities.add(testChildEntity);
		}

		List<TestEntity> testEntities = new ArrayList<TestEntity>();
		for (int i = 0; i < 200; i++) {
			TestEntity testEntity = new TestEntity();
			testEntity.name1 = "测试1";
			testEntity.name2 = "测试2";
			testEntity.name3 = "测试3";
			testEntity.name4 = "测试4";
			testEntity.name5 = "测试5";
			testEntity.name6 = "测试6";
			testEntity.name7 = "测试7";
			testEntity.name8 = "测试8";
			testEntity.name9 = "测试9";
			testEntity.name10 = "测试10";
			testEntity.name1_lang = "keytest00010001";
			testEntity.name2_lang = "keytest00020001";
			testEntity.name3_lang = "keytest00030001";
			testEntity.name4_lang = "keytest00040001";
			testEntity.name5_lang = "keytest00030005";
			testEntity.name6_lang = "keytest00030006";
			testEntity.name7_lang = "keytest00030007";
			testEntity.name8_lang = "keytest00030008";
			testEntity.name9_lang = "keytest00030009";
			testEntity.name10_lang = "keytest00030010";
//			testEntity.setTestChildEntities(testChildEntities);
			testEntities.add(testEntity);
		}

		String string = JSONObject.toJSONString(testEntities);
		System.err.println(string);

		for (int i = 0; i < 50000; i++) {
			langMap.put("keytest000" + i, "测试国际化" + i);
		}

		Long beginTime = new Date().getTime();
		System.err.println("开始时间：" + beginTime);

		for (int i = 0; i < testEntities.size(); i++) {
			// 获取参数类
			Class cls = testEntities.get(i).getClass();
			// 将参数类转换为对应属性数量的Field类型数组（即该类有多少个属性字段 N 转换后的数组长度即为 N）
			Field[] fields = cls.getDeclaredFields();

			for (int j = 0; j < fields.length; j++) {
				Field f = fields[j];
				if (f.getName() != null && String.class.equals(f.getGenericType()) && f.getName().endsWith("_lang")) {
					try {
						f.set(testEntities.get(i), langMap.get(f.get(testEntities.get(i))));
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}

		Long endTime = new Date().getTime();
		System.err.println("结束时间：" + endTime);
		System.err.println("用时：" + (endTime - beginTime));
//		System.err.println(testEntities.toString());

	}

}
