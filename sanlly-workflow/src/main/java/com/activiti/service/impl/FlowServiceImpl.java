package com.activiti.service.impl;

import com.activiti.domain.ApiResult;
import com.activiti.service.FlowServic;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowServiceImpl implements FlowServic {

    @Autowired
    private RepositoryService repositoryService;
    
	@Override
	public Object open(String id) {
	    try {
	        Model modelData = repositoryService.getModel(id);
	        byte[] bytes = repositoryService.getModelEditorSource(modelData.getId());

	        if (bytes == null) {
	            return ApiResult.error().retMsg("模型为空").build();
	        }
	        JsonNode modelNode = null;
	        modelNode = new ObjectMapper().readTree(bytes);
	        BpmnModel model = new BpmnJsonConverter().convertToBpmnModel(modelNode);
	        if (model.getProcesses().size() == 0) {
	            return ApiResult.error().retMsg("数据不符合要求").build();
	        }
	        byte[] bpmnBytes = new BpmnXMLConverter().convertToXML(model);
	        //发布流程
	        String processName = modelData.getName() + ".bpmn20.xml";
	        String convertToXML = new String(bpmnBytes);

	        Deployment deployment = repositoryService.createDeployment()
	                .name(modelData.getName())
	                .addString(processName, new String(bpmnBytes, "UTF-8"))
	                .deploy();
	        modelData.setDeploymentId(deployment.getId());
	        repositoryService.saveModel(modelData);
	    } catch (IOException e) {
            return ApiResult.error().retMsg("发布数失败").build();
	    }
		return ApiResult.success().build();
	}

}
