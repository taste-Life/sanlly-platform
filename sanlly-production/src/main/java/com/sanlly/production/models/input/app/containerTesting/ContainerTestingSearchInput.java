package com.sanlly.production.models.input.app.containerTesting;

/**   
* @Package com.sanlly.production.models.input.app.containerTesting 
* @Description: TODO 箱体检索条件实体-输入
* @author tianzhl   
* @date 2019年8月9日 下午5:04:25 
* @version V1.0   
*/
public class ContainerTestingSearchInput{

	// TODO 检验状态
	private String checkType;
	
	// TODO 审核状态
	private String auditType;
	
	// TODO 箱类别
	private String containerCategory;
		
	// TODO 箱号
	private String containerNo;
	
	// TODO 第几页
	private Integer index;
	
	// TODO 页大小
	private Integer size;

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
}
