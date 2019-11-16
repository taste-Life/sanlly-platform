package com.activiti.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ModelQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activiti.models.input.ModelFormInput;
import com.activiti.models.input.SearchModelInput;
import com.activiti.service.ModelService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;

import cn.hutool.core.util.StrUtil;
/**
 * 模型实现类
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年7月26日  
*
 */
@Service
public class ModelServiceImpl implements ModelService {
	private static final Logger logger = LoggerFactory.getLogger(ProcessServiceImpl.class);

	@Resource
	private RepositoryService repositoryService;
	@Autowired
	private ObjectMapper objectMapper;
	@Override
	public Model createModel(ModelFormInput input) {
		try {
			ObjectNode editorNode = objectMapper.createObjectNode();
			editorNode.put("id", "canvas");
			editorNode.put("process_id", input.getKey());
			editorNode.put("resourceId", "canvas");
			ObjectNode properties = objectMapper.createObjectNode();
			properties.put("process_author", PlatformConstants.LICENSE);
			editorNode.set("properties", properties);
			ObjectNode stencilset = objectMapper.createObjectNode();
			stencilset.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
			editorNode.set("stencilset", stencilset);

			Model model = repositoryService.newModel();
			model.setKey(input.getKey());
			model.setName(input.getName());
			model.setCategory(input.getCategory());
			model.setVersion(Integer.parseInt(
					String.valueOf(repositoryService.createModelQuery().modelKey(model.getKey()).count() + 1)));
			
			ObjectNode modelObjectNode = objectMapper.createObjectNode();
			modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, input.getName());
			modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, model.getVersion());
			modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, input.getDesc());
			model.setMetaInfo(modelObjectNode.toString());
			// 暂不考虑多租户
			// model.setTenantId(String.valueOf(TenantContextHolder.getTenantId()));

			repositoryService.saveModel(model);
			repositoryService.addModelEditorSource(model.getId(), editorNode.toString().getBytes("utf-8"));
			return model;
		} catch (UnsupportedEncodingException e) {
//	            log.error("UnsupportedEncodingException", e);
			logger.error("UnsupportedEncodingException", e);
		}
		return null;

	}

	@Override
	public PagedList<Model> getModelPage(SearchModelInput input) {
		ModelQuery modelQuery = repositoryService.createModelQuery()
				// 暂不考虑多租户
				// .modelTenantId(String.valueOf(TenantContextHolder.getTenantId()))
				.latestVersion().orderByLastUpdateTime().desc();
		String category = input.getCategory();
		if (category != null && !category.equals("")) {
			modelQuery.modelCategoryLike(category);
		}
		if (input.getName() != null && !input.getName().equals("")) {
			modelQuery.modelNameLike(input.getName());
		}
		Integer totalItemCount = (int) modelQuery.count();
		PagedList<Model> pagedList = new PagedList<Model>(input.getPageIndex(), input.getPageSize(), totalItemCount);
		// 分页查询
		List<Model> list = modelQuery.listPage((input.getPageIndex() - 1) * input.getPageSize(), input.getPageSize());
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(list);
		return pagedList;
	}

	/**
	 * 批量删除模型
	 */
	@Override
	public Boolean removeModelById(String[] dataIds) {
		List<String> list = Arrays.asList(dataIds);
		for (int i = 0; i < list.size(); i++) {
			repositoryService.deleteModel(list.get(i).toString());
		}
		return Boolean.TRUE;
	}

	/**
	 * 部署模型 批量部署
	 */
	@Override
	public Boolean deploy(String [] ids) {
		try {
			List<String> listids=Arrays.asList(ids);
			for (int i = 0; i < listids.size(); i++) {
				 // 获取模型
	            Model model = repositoryService.getModel(listids.get(i));
	            ObjectNode objectNode = (ObjectNode) new ObjectMapper().readTree(repositoryService.getModelEditorSource(model.getId()));
	            BpmnModel bpmnModel = new BpmnJsonConverter().convertToBpmnModel(objectNode);

	            String processName = model.getName();
	            if (!StrUtil.endWithIgnoreCase(processName, ".bpmn20.xml")) {
	                processName += ".bpmn20.xml";
	            }
	            // 部署流程
	            Deployment deployment = repositoryService
	                    .createDeployment().name(model.getName())
	                    .addBpmnModel(processName, bpmnModel)
	                    //暂不考虑多租户
	                    //.tenantId(String.valueOf(TenantContextHolder.getTenantId()))
	                    .deploy();

	            // 设置流程分类
	            List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery()
	                    .deploymentId(deployment.getId())
	                    .list();

	            list.stream().forEach(processDefinition ->
	                    repositoryService.setProcessDefinitionCategory(processDefinition.getId(), model.getCategory()));
			}
           
        } catch (Exception e) {
        	logger.error("部署失败，异常", e);
        }
        return Boolean.TRUE;
	}
}