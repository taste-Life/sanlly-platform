package com.activiti.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.activiti.models.input.SearchModelInput;
import com.activiti.models.output.ProcessOutPut;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.pagination.PagedList;

/**
 * @version: v1.0
 * @Description: 流程Service接口
 * @author: wupzh
 * @date: 2019年6月20日
 */
public interface ProcessService {
    /**
     * 根据key获取流程定义的最新版本
     * @param param
     * @return
     */
    Map<String, Object> getByKeyAndLatestVersion(JSONObject param);

    /**
     * 根据key获取流程定义的各个版本
     * @param param
     * @return
     */
    List getByKey(JSONObject param);

    /**
     * 获取所有流程定义,支持分页
     * @return
     */
    Map getProcessDefinitions(JSONObject param);

    /**
     * 获取所有流程定义,支持分页
     * @return
     */
    Map getProcessInstances(JSONObject param);

    /**
     * 获取所有流程定义的最新版本
     * @return
     */
    List getByLatestVersion();

    /**
     * 根据流程定义的key启动流程实例
     * @param param
     */
    void startByKey(JSONObject param);

    /**
     * 根据流程定义的key启动流程实例同时设置流程变量, 可用于传递表单数据
     * @param param
     */
    String startByKeyWithVars(JSONObject param);

    /**
     * 根据流程实例Id获取流程变量
     * 办理任务时可通过该方法获取表单数据渲染表单, 适用于流程过程中表单数据不变的情况
     * @param param
     */
    Map getProcessVars(JSONObject param);

    /**
     * 根据流程定义的key获取流程实例列表
     * @param param
     * @return
     */
    List getProcessInstancesByKey(JSONObject param);

    /**
     * 流程挂起
     * @param param
     */
    void suspend(JSONObject param);

    /**
     * 流程激活
     * @param param
     */
    void activate(JSONObject param);

    /**
     * 查看流程实例对应的图片
     * @param
     */
    InputStream getImgByProcessInstanceId(JSONObject param);

    /**
     * 根据流程定义Id获取模型Id
     * @param param
     */
    Map<String, Object> getModelIdByProcessDefinitionId(JSONObject param);

    /**
     * 插入一条数据
     * @param param
     */
    void insertProcInstForm(JSONObject param);

    /**
     * 根据表单id获取流程实例id
     * @param param
     * @return
     */
    String selectProcInstIdByFormId(JSONObject param);

    
    /*****************************************/
    /**
     * 分页查询流程列表
     *
     * @param params
     * @return
     */
    PagedList<ProcessOutPut> getProcessByPage(SearchModelInput input);
    
    /**
     * 读取xml/image资源
     *
     * @param procDefId
     * @param proInsId
     * @param resType
     * @return
     */
    InputStream readResource(String procDefId, String proInsId, String resType);

    /**
     * 更新状态
     *
     * @param status
     * @param procDefId
     * @return
     */
    Boolean updateStatus(String status, String [] procDefId);

    /**
     * 删除流程实例
     *
     * @param deploymentId
     * @return
     */
    Boolean removeProcIns(String [] deploymentId);

    /**
     * 启动流程、更新请假单状态
     *
     * @param deploymentId
     * @return
     */
    Boolean saveStartProcess(String [] deploymentId);

    /**
     * 查询一个流程是否结束
     *@Description:（方法功能描述） 
     * @param processInstanceId
     * @return（展示方法参数和返回值）
     */
    Boolean isEndProcess(String processInstanceId);
    /**
     * 删除流程  只删除流程
     *@Description:（方法功能描述） 
     * @param processInstanceId
     * @return（展示方法参数和返回值）
     */
    Boolean removeProcessByProcessId(String processInstanceId);

}
