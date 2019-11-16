package com.sanlly.production.lang;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class TestEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name1;
	public String name2;
	public String name3;
	public String name4;
	public String name5;
	public String name6;
	public String name7;
	public String name8;
	public String name9;
	public String name10;
	public String name1_lang;
	public String name2_lang;
	public String name3_lang;
	public String name4_lang;
	public String name5_lang;
	public String name6_lang;
	public String name7_lang;
	public String name8_lang;
	public String name9_lang;
	public String name10_lang;

//	public List<TestChildEntity> testChildEntities;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public String getName5() {
		return name5;
	}

	public void setName5(String name5) {
		this.name5 = name5;
	}

	public String getName6() {
		return name6;
	}

	public void setName6(String name6) {
		this.name6 = name6;
	}

	public String getName7() {
		return name7;
	}

	public void setName7(String name7) {
		this.name7 = name7;
	}

	public String getName8() {
		return name8;
	}

	public void setName8(String name8) {
		this.name8 = name8;
	}

	public String getName9() {
		return name9;
	}

	public void setName9(String name9) {
		this.name9 = name9;
	}

	public String getName10() {
		return name10;
	}

	public void setName10(String name10) {
		this.name10 = name10;
	}

	public String getName1_lang() {
		return name1_lang;
	}

	public void setName1_lang(String name1_lang) {
		this.name1_lang = name1_lang;
	}

	public String getName2_lang() {
		return name2_lang;
	}

	public void setName2_lang(String name2_lang) {
		this.name2_lang = name2_lang;
	}

	public String getName3_lang() {
		return name3_lang;
	}

	public void setName3_lang(String name3_lang) {
		this.name3_lang = name3_lang;
	}

	public String getName4_lang() {
		return name4_lang;
	}

	public void setName4_lang(String name4_lang) {
		this.name4_lang = name4_lang;
	}

	public String getName5_lang() {
		return name5_lang;
	}

	public void setName5_lang(String name5_lang) {
		this.name5_lang = name5_lang;
	}

	public String getName6_lang() {
		return name6_lang;
	}

	public void setName6_lang(String name6_lang) {
		this.name6_lang = name6_lang;
	}

	public String getName7_lang() {
		return name7_lang;
	}

	public void setName7_lang(String name7_lang) {
		this.name7_lang = name7_lang;
	}

	public String getName8_lang() {
		return name8_lang;
	}

	public void setName8_lang(String name8_lang) {
		this.name8_lang = name8_lang;
	}

	public String getName9_lang() {
		return name9_lang;
	}

	public void setName9_lang(String name9_lang) {
		this.name9_lang = name9_lang;
	}

	public String getName10_lang() {
		return name10_lang;
	}

	public void setName10_lang(String name10_lang) {
		this.name10_lang = name10_lang;
	}

//	public List<TestChildEntity> getTestChildEntities() {
//		return testChildEntities;
//	}
//
//	public void setTestChildEntities(List<TestChildEntity> testChildEntities) {
//		this.testChildEntities = testChildEntities;
//	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
