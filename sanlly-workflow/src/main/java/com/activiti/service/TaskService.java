package com.activiti.service;

import com.activiti.models.input.SearchModelInput;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.activiti.AuditTaskInfoOutput;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.common.models.output.pagination.PagedList;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricTaskInstance;

import java.util.List;
import java.util.Map;

/**
 * @version: v1.0
 * @Description: 任务Service接口
 * @author: wupzh
 * @date: 2019年6月20日
 */
public interface TaskService {
    /**
     * 根据用户id获取任务列表
     * @param param
     */
    List getByUserId(JSONObject param);

    /**
     * 根据任务id完成任务
     * @param param
     */
    void complete(JSONObject param);

    /**
     * 设置任务办理人, 多个用户id使用,分割
     * @param param
     */
    void setAssignee(JSONObject param);

    /**
     * 设置多个任务办理候选人
     * @param param
     */
    void setCandidateUsers(JSONObject param);

    /**
     * 保存任务变量
     * 适用于流程过程中数据变化的情况, 如表单的修改
     */
    void setTaskVars(JSONObject param);

    /**
     * 根据任务Id获取相关变量
     * @param param
     * @return
     */
    Map getTaskVars(JSONObject param);

    /**
     * 根据流程实例Id查询任务列表
     * @param param
     * @return
     */
    List<Map<String, Object>> getByProcessInstanceId(JSONObject param);
    
    /**
     * 我的代办任务
     * @Description:   
     * @param input
     * @return
     */
    List<TaskOutPut> getMyAgencyTask(SearchModelInput input);
    
    /**
     * 驳回任务
     * @Description:   
     * @param taskId
     * @param returnStart
     */
    void rejectTask(String taskId,boolean returnStart);
    
	/**
	 * 历史任务查询
	 */
    PagedList<HistoricTaskInstance> queryTaskHistory(SearchModelInput input);
    public List<HistoricTaskInstance> queryTaskHistoryALL(SearchModelInput input) ;
        /**
         * 历史活动查询
         */
    List<HistoricActivityInstance> historyActInstanceList(SearchModelInput input);
    
	/**
	 * 4.查询历史流程变量(act_hi_varinst表)
	 */
    List<AuditTaskInfoOutput> findHistoryProcessVariables(SearchModelInput input);
    
}
