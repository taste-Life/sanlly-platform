package com.activiti.service;

import org.activiti.engine.repository.Model;

import com.activiti.models.input.ModelFormInput;
import com.activiti.models.input.SearchModelInput;
import com.sanlly.common.models.output.pagination.PagedList;

/**
 * 模型Service接口
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年7月26日  
*
 */
public interface ModelService {
	/**
     * 创建模型
     *
     * @param name
     * @param key
     * @param desc
     * @param category
     * @return
     */
    Model createModel(ModelFormInput input);

    /**
     * 分页获取流程
     *
     * @param params
     * @return
     */
    PagedList<Model> getModelPage(SearchModelInput input);

    /**
     * 删除流程
     *
     * @param id
     * @return
     */
    Boolean removeModelById(String [] dataIds);

    /**
     * 部署流程
     *
     * @param id
     * @return
     */
    Boolean deploy(String [] ids);
}
