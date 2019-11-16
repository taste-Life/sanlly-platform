package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.compressormaterial.CompressorMaterialInput;
import com.sanlly.warehouse.models.input.compressormaterial.SearchCompressorMaterialInput;
import com.sanlly.warehouse.models.output.compressormaterial.CompressorMaterialOutput;

import java.util.List;

/**
 * 维修压缩机用料
 * @author lishzh
 */
public interface CompressorMaterialService {

    /**
     *添加维修压缩机用料条目
     *
     *@author lishzh
     */
    void addCompressorMaterial(CompressorMaterialInput input);

    /**
     *编辑维修压缩机用料条目
     *
     *@author lishzh
     */
    void editCompressorMaterial(CompressorMaterialInput input);

    /**
     *删除维修压缩机用料条目
     *
     *@author lishzh
     */
    void deleteCompressorMaterial(List<Integer> ids);

    /**
     *查询维修压缩机用料条目
     *
     *@author lishzh
     */
    PagedList<CompressorMaterialOutput> getPageList(SearchCompressorMaterialInput input);
}
