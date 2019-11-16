package com.sanlly.production.models.output;

import java.util.List;
import java.util.Map;

import com.sanlly.common.models.output.SelectOutput;
/**
 * 一次性下拉选输出类
 * @author zhangkai
 *
 */
public class BaseSelectOutput {

	private List<SelectOutput> payingPartyList;
	
	private List<SelectOutput> companyList;
	
	private List<SelectOutput> yardList;
	
	private List<SelectOutput> sizeList;
	
	private List<SelectOutput> containerUserList;
	
	private List<SelectOutput> containerTypeList;
	
	private List<SelectOutput> containerBelongList;
	
	private List<SelectOutput> containerGradeList;
	
	private List<SelectOutput> courseTypeList;
	
	private List<SelectOutput> unitCompanyList;
	
	private List<SelectOutput> yardCategoryList;
	
	private List<SelectOutput> ediTypeList;
	
	private Map<String, List<SelectEnumOutput>> enumMap;

	public List<SelectOutput> getPayingPartyList() {
		return payingPartyList;
	}

	public void setPayingPartyList(List<SelectOutput> payingPartyList) {
		this.payingPartyList = payingPartyList;
	}

	public List<SelectOutput> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<SelectOutput> companyList) {
		this.companyList = companyList;
	}

	public List<SelectOutput> getYardList() {
		return yardList;
	}

	public void setYardList(List<SelectOutput> yardList) {
		this.yardList = yardList;
	}

	public List<SelectOutput> getSizeList() {
		return sizeList;
	}

	public void setSizeList(List<SelectOutput> sizeList) {
		this.sizeList = sizeList;
	}

	public List<SelectOutput> getContainerUserList() {
		return containerUserList;
	}

	public void setContainerUserList(List<SelectOutput> containerUserList) {
		this.containerUserList = containerUserList;
	}

	public List<SelectOutput> getContainerTypeList() {
		return containerTypeList;
	}

	public void setContainerTypeList(List<SelectOutput> containerTypeList) {
		this.containerTypeList = containerTypeList;
	}

	public List<SelectOutput> getContainerBelongList() {
		return containerBelongList;
	}

	public void setContainerBelongList(List<SelectOutput> containerBelongList) {
		this.containerBelongList = containerBelongList;
	}

	public List<SelectOutput> getContainerGradeList() {
		return containerGradeList;
	}

	public void setContainerGradeList(List<SelectOutput> containerGradeList) {
		this.containerGradeList = containerGradeList;
	}

	public List<SelectOutput> getCourseTypeList() {
		return courseTypeList;
	}

	public void setCourseTypeList(List<SelectOutput> courseTypeList) {
		this.courseTypeList = courseTypeList;
	}

	public List<SelectOutput> getUnitCompanyList() {
		return unitCompanyList;
	}

	public void setUnitCompanyList(List<SelectOutput> unitCompanyList) {
		this.unitCompanyList = unitCompanyList;
	}
	
	

	public List<SelectOutput> getYardCategoryList() {
		return yardCategoryList;
	}

	public void setYardCategoryList(List<SelectOutput> yardCategoryList) {
		this.yardCategoryList = yardCategoryList;
	}

	public Map<String, List<SelectEnumOutput>> getEnumMap() {
		return enumMap;
	}

	public void setEnumMap(Map<String, List<SelectEnumOutput>> enumMap) {
		this.enumMap = enumMap;
	}

	public List<SelectOutput> getEdiTypeList() {
		return ediTypeList;
	}

	public void setEdiTypeList(List<SelectOutput> ediTypeList) {
		this.ediTypeList = ediTypeList;
	}

}
