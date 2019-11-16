package com.sanlly.production.models.output.app.partsRepair;

import java.util.List;

import com.sanlly.production.models.output.containerTesting.CourseEntryRelationOutput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.app.partsRepair 
 * @Description: TODO 部件修理分类实体-输出
 * @author tianzhl   
 * @date 2019年8月12日 下午4:35:35 
 * @version V1.0   
 */
public class PartsRepairTypeOutput {

	// TODO 部件修理分类
	private String typeLang;
	// TODO 部件修理列表
	private List<CourseEntryRelationOutput> dataList;

	public String getTypeLang() {
		return typeLang;
	}

	public void setTypeLang(String typeLang) {
		this.typeLang = typeLang;
	}

	public List<CourseEntryRelationOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<CourseEntryRelationOutput> dataList) {
		this.dataList = dataList;
	}

}
