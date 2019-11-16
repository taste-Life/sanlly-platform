package com.sanlly.production.service;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.base.ProdDeptOutput;

import java.util.List;

/**
 * 部门实体类
 *
 * @author fjy   
 * @version V1.0   
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @date 2019年9月9日 下午1:33:18 
 */
public interface DeptService {

    /**
     * 查询列表  部门表
     *
     * @return
     */
    List<DeptOutput> deptList(BaseSearchInput input);

    /**
     * 查询列表 生产部门表
     *
     * @return
     */
    List<ProdDeptOutput> prodDeptList(BaseSearchInput input);

    /**
     * @author zhq
     * @date 2019/10/28
     * @description 根据companyKey获取该公司下的生产部门列表
     */
    List<DeptOutput> getDeptListByCompanyKey(String companyKey);

}
