package com.sanlly.purchase.dao;

import com.sanlly.purchase.models.output.supplier.SupplierReportOutput;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @Description: TODO
 * @ClassName: SupplierReportExtDao
 * @Date: 2019/10/24 22:24
 * @Version 1.0
 * @Author mqz
 */
public interface SupplierReportExtDao {
    List<SupplierReportOutput> selectSupplierReport(@Param("supplier") String supplier, @Param("startTime") Date startTime, @Param("endTime") Date endTime);
}
