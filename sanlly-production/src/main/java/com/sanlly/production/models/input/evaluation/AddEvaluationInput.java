package com.sanlly.production.models.input.evaluation;

import java.util.List;

/**
 * 估价主表实体
 * 
 * @Package com.sanlly.production.models.input.evaluation 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月5日 上午9:49:42 
 * @version V1.0   
 */
public class AddEvaluationInput {

	/**
	 * 进场id
	 */
	private String course;

	/**
	 * 估价条目
	 */
	private List<AddEvaluationEntryInput> entryList;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<AddEvaluationEntryInput> getEntryList() {
		return entryList;
	}

	public void setEntryList(List<AddEvaluationEntryInput> entryList) {
		this.entryList = entryList;
	}

}
