package com.sanlly.production.models.input.workgroup;

import com.alibaba.fastjson.JSON;

/**
 * @author zhq
 * @date 2019/10/25
 * @description
 */
public class WorkGroupInputUpdate extends WorkGroupInputAdd {
    private Integer prodWorkGroupId;

    public Integer getProdWorkGroupId() {
        return prodWorkGroupId;
    }

    public void setProdWorkGroupId(Integer prodWorkGroupId) {
        this.prodWorkGroupId = prodWorkGroupId;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
