package com.sanlly.production.service;

import com.sanlly.production.models.output.basicfield.BasicFieldOutput;

import java.util.List;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public interface BasicFieldService {
    /**
     * @author zhq
     * @date 2019/11/6
     * @description 获取全部自定义字段
     */
    List<BasicFieldOutput> getBasicField();
}
