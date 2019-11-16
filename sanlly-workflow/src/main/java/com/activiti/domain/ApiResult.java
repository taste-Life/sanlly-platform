package com.activiti.domain;

import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @version: v1.0
 * @Description: Controller层统一返回结果类
 * @author: wupzh
 * @date: 2019年6月20日
 */
public class ApiResult {
    private Integer retCode;
    private String retMsg;
    private Object retData;

    public static ApiResult.ApiResultBuilder success() {
        ApiResult.ApiResultBuilder resultBuilder = builder();
        resultBuilder.retCode = 200;
        resultBuilder.retMsg = "成功";
        return resultBuilder;
    }

    public static ApiResult.ApiResultBuilder error() {
        ApiResult.ApiResultBuilder resultBuilder = builder();
        resultBuilder.retCode = 500;
        resultBuilder.retMsg = "失败";
        return resultBuilder;
    }

    public static ApiResult.ApiResultBuilder builder() {
        return new ApiResult.ApiResultBuilder();
    }

    public Integer getRetCode() {
        return this.retCode;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public Object getRetData() {
        return this.retData;
    }

    @ConstructorProperties({"retCode", "retMsg", "retData"})
    public ApiResult(Integer retCode, String retMsg, Object retData) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.retData = retData;
    }

    public static class ApiResultBuilder {
        private Integer retCode;
        private String retMsg;
        private Object retData;

        ApiResultBuilder() {
        }

        public ApiResult.ApiResultBuilder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        public ApiResult.ApiResultBuilder retMsg(String retMsg) {
            this.retMsg = retMsg;
            return this;
        }

        public ApiResult.ApiResultBuilder retData(Object retData) {
            this.retData = retData;
            return this;
        }

        public ApiResult build() {
            return new ApiResult(this.retCode, this.retMsg, this.retData);
        }

        public String toString() {
            return "ApiResult.ApiResultBuilder(retCode=" + this.retCode + ", retMsg=" + this.retMsg + ", retData=" + this.retData + ")";
        }
    }
    
    public static String jsonStrng(long count,List<?> data,Map<String, Map<String,Object>> map,String node){
        JSONArray jsonArray=JSONArray.parseArray(JSON.toJSONString(data));
        JSONObject object=new JSONObject();
        for(int i=0;i<jsonArray.size();i++){
          JSONObject jsonData = (JSONObject) jsonArray.get(i);
          jsonData.putAll(map.get(jsonData.get(node)));
        }
        object.put("count",count);
        object.put("data",jsonArray);
        return object.toJSONString();
      }
}
