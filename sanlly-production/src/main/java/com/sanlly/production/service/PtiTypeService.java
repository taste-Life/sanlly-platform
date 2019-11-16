package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.ptitype.PtiTypeInputAdd;
import com.sanlly.production.models.input.ptitype.PtiTypeInputUpdate;
import com.sanlly.production.models.output.pti.PtiTypeDetailOutpput;
import com.sanlly.production.models.output.ptitype.PtiTypeOutput;

import java.util.List;

/**
 * pti类型
 * @author RexSheng
 * 2019年8月17日 下午1:49:56
 */
public interface PtiTypeService {

	/**
	 * 获取列表
	 * @return
	 */
	List<PtiTypeDetailOutpput> getList();

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 新增pti类型
     */
    int addPtiType(PtiTypeInputAdd ptiTypeInputAdd);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 修改pti类型
     */
    int updatePtiType(PtiTypeInputUpdate ptiTypeInputUpdate);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 删除pti类型
     */
    int deletePtiType(Integer[] ids);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 设置有效
     */
    int validatePtiType(Integer[] ids, Integer valid);

    /**
     * @author zhq
     * @date 2019/11/7
     * @description 分页查询
     */
    PagedList<PtiTypeOutput> getPtiTypeList(Integer index, Integer size, String searchWords);
}
