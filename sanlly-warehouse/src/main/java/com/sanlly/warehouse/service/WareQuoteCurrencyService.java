package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.quotecurrency.AddQuoteCurrencyInput;
import com.sanlly.warehouse.models.input.quotecurrency.EditQuoteCurrencyInput;
import com.sanlly.warehouse.models.output.quotecurrency.QuoteCurrencyOutput;

import java.util.List;

/**
 * ClassName: WareQuoteCurrencyService
 * Description: 币种服务层
 * date: 2019/7/25 17:08
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareQuoteCurrencyService {

    /**
     * 获取币种列表
     * @return
     */
    List<QuoteCurrencyOutput> getQuoteCurrencyList();

    /**
     * 币种获取
     * @param input
     * @return
     */
    QuoteCurrencyOutput getQuoteCurrency(EditQuoteCurrencyInput input);

    /**
     * 添加币种
     * @param input
     */
    void addQuoteCurrency(AddQuoteCurrencyInput input);

    /**
     * 修改币种
     * @param input
     */
    void updateQuoteCurrency(EditQuoteCurrencyInput input);

    /**
     * 根据ID批量删除币种
     * @param quoteCurrencyIds
     */
    void deleteQuoteCurrency(Integer[] quoteCurrencyIds);
}
