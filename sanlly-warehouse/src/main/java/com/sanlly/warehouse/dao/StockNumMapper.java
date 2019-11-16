package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.models.input.stock.SearchStockNumInput;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: StockNumMapper
 * Description: 获取库存数量Dao层
 * date: 2019/9/18 10:30
 *
 * @author wannt
 * @since JDK 1.8
 */
@Mapper
public interface StockNumMapper {

    /**
     *根据公司 备件仓库仓库类型分组
     * @param input
     * @return
     */
    List<WareStock> getStockNum(SearchStockNumInput input);

    /**
     * 获取总数量根据公司 备件仓库仓库类型分组
     * @param input
     * @return
     */
    Integer getTotalCount(SearchStockNumInput input);

    /**
     * 根据公司 备件仓库分组
     * @param input
     * @return
     */
    List<WareStock> getStockNumByCompany(SearchStockNumInput input);

    /**
     * 根据公司 备件仓库分组
     * @param input
     * @return
     */
    Integer getTotalCountByCompany(SearchStockNumInput input);
}
