package com.activiti.models.output;

import java.util.Date;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;

public class ProcessOutPut {

	//流程分类
    private String category;
    
    private String processonDefinitionId;
    private String key;
    private String name;
    private Integer revision;
    private Date deploymentTime;
    private String xmlName;
    private String picName;
    private String deploymentId;
    private Boolean suspend;
    private String description;
    private Integer xAxis;
    private Integer yAxis;
    private Integer width;
    private Integer height;
    

    /**
     * 抽取流程定义需要返回的内容
     *
     * @param processDefinition
     * @param deployment
     * @return
     */
    public static ProcessOutPut toProcessDefDTO(ProcessDefinition processDefinition, Deployment deployment) {
    	ProcessOutPut dto = new ProcessOutPut();
        dto.setCategory(processDefinition.getCategory());
        dto.setProcessonDefinitionId(processDefinition.getId());
        dto.setKey(processDefinition.getKey());
        dto.setName(deployment.getName());
        dto.setRevision(processDefinition.getVersion());
        dto.setDeploymentTime(deployment.getDeploymentTime());
        dto.setXmlName(processDefinition.getResourceName());
        dto.setPicName(processDefinition.getDiagramResourceName());
        dto.setDeploymentId(deployment.getId());
        dto.setSuspend(processDefinition.isSuspended());
        dto.setDescription(processDefinition.getDescription());
        return dto;
    }


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getProcessonDefinitionId() {
		return processonDefinitionId;
	}


	public void setProcessonDefinitionId(String processonDefinitionId) {
		this.processonDefinitionId = processonDefinitionId;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getRevision() {
		return revision;
	}


	public void setRevision(Integer revision) {
		this.revision = revision;
	}


	public Date getDeploymentTime() {
		return deploymentTime;
	}


	public void setDeploymentTime(Date deploymentTime) {
		this.deploymentTime = deploymentTime;
	}


	public String getXmlName() {
		return xmlName;
	}


	public void setXmlName(String xmlName) {
		this.xmlName = xmlName;
	}


	public String getPicName() {
		return picName;
	}


	public void setPicName(String picName) {
		this.picName = picName;
	}


	public String getDeploymentId() {
		return deploymentId;
	}


	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}


	public Boolean getSuspend() {
		return suspend;
	}


	public void setSuspend(Boolean suspend) {
		this.suspend = suspend;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getxAxis() {
		return xAxis;
	}


	public void setxAxis(Integer xAxis) {
		this.xAxis = xAxis;
	}


	public Integer getyAxis() {
		return yAxis;
	}


	public void setyAxis(Integer yAxis) {
		this.yAxis = yAxis;
	}


	public Integer getWidth() {
		return width;
	}


	public void setWidth(Integer width) {
		this.width = width;
	}


	public Integer getHeight() {
		return height;
	}


	public void setHeight(Integer height) {
		this.height = height;
	}
    
    
    
}
