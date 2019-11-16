package com.sanlly.production.models.output.outYard;

/**
 * 场站出厂箱号
 * 
 * @Package com.sanlly.production.models.output.outYard 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年11月7日 下午6:34:58 
 * @version V1.0   
 */
public class OutContainerNoListOutput {
	// 进场id
	private String prodCourseId;
	// 箱号
	private String containerNo;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

}
