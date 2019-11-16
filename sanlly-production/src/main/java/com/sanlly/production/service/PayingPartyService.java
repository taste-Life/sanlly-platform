package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.paying.PayingPartyInput;
import com.sanlly.production.models.output.paying.PayingPartyOutput;

public interface PayingPartyService {

    /**
     * 根据主键查询
     * @param id
     * @return
     * @author zjd
     */
    PayingPartyOutput query(Integer id);

    /**
     * 根据主键更新
     * @param input
     * @return
     * @author zjd
     */
    int update(PayingPartyInput input);

    /**
     * 新增
     * @param input
     * @return
     * @author zjd
     */
    int add(PayingPartyInput input);

    /**
     * 逻辑删除
     * @param id
     * @return
     * @author zjd
     */
    int delete(Integer id);

    PagedList<PayingPartyOutput> pageList(PageInput input, String searchWords);

    int multiDelete(Integer[] ids);

    int multiValid(Integer[] ids, int valid);
}
