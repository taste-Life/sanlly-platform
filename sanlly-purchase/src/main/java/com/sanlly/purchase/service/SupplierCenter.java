package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.suppliercenter.SupplierCenterInput;
import com.sanlly.purchase.models.output.SupplierBascialInfoOutput;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.models.output.suppliercenter.SupplierQuotionOutput;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Description: 供应商信息中心
 *
 * @ClassName: SupplierCenter
 * @Version 1.0
 * @Author mqz
 */
@Service
public interface SupplierCenter {
    /**
     * 根据供应商key 查询供应商详细信息
     * @param key
     * @return
     */
    public  PurcSupplierOutput getSupplierDetailByKey(String key);
    /**
     * @Description 根据key查询供应商基本信息
     * @Param SupplierCenterInput
     **/
  public List<SupplierBascialInfoOutput> querySuppplierBascialInfo(SupplierCenterInput supplierCenterInput );

    /**
     * 下载供应商文件
     * @param response
     * @param supplier
     * @param file
     * @param type
     */
 public  void  downloadFile(HttpServletResponse response,String supplier,String file,String type);

    /**
     * 获取供应商报价情况
     * @param 供应商key
     * @param startTime开始时间
     * @param  endtime 结束时间
     */
    public SupplierQuotionOutput getSupplierQuotion(String key,Date startTime,Date endtime);
    public PagedList<PurcSupplierOutput> getSupplierByGrade(Integer index,Integer size,String name, String grade);
}
