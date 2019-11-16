package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.asset.AddAssetApplyInput;
import com.sanlly.warehouse.models.input.asset.AddAssetInput;
import com.sanlly.warehouse.models.input.asset.EditAssetInput;
import com.sanlly.warehouse.models.input.asset.SearchAssetApplyInput;
import com.sanlly.warehouse.models.input.asset.SearchAssetInput;
import com.sanlly.warehouse.models.input.asset.SearchAssetLogInput;
import com.sanlly.warehouse.models.input.asset.assetInfo.AddAssetInfoInput;
import com.sanlly.warehouse.models.input.asset.assetInfo.EditAssetInfoInput;
import com.sanlly.warehouse.models.input.asset.assetInfo.SearchAssetInfoInput;
import com.sanlly.warehouse.models.input.asset.assetType.AddAssetTypeInput;
import com.sanlly.warehouse.models.input.asset.assetType.EditAssetTypeInput;
import com.sanlly.warehouse.models.input.asset.assetType.SearchAssetTypeInput;
import com.sanlly.warehouse.models.output.asset.AssetApplyOutput;
import com.sanlly.warehouse.models.output.asset.AssetInfoOutput;
import com.sanlly.warehouse.models.output.asset.AssetLogOutput;
import com.sanlly.warehouse.models.output.asset.AssetOutput;
import com.sanlly.warehouse.models.output.asset.AssetTypeOutput;

/**
 * 资产管理接口
 * 
 * @author zhh
 *
 */
public interface AssetService {
	/**
     * 资产管理分页列表查询
     * @param input
     * @return
     */
	PagedList<AssetOutput> getAssetPageList(SearchAssetInput input);
	
	/**
     * 新增资产管理
     * @param input
     * @return
     */
	void addAsset(AddAssetInput input);
	
	/**
     * 修改资产管理信息
     * @param input
     * @return
     */
	void editAsset(EditAssetInput input);
	
	/**
     * 资产类别列表
     * 
     * @return
     */
	List<AssetTypeOutput> getAssetTypeList();
	
	/**
     * 资产类别分页列表查询
     * @param input
     * @return
     */
	PagedList<AssetTypeOutput> getAssetTypePageList(SearchAssetTypeInput input);
	
	/**
     * 新增资产类别
     * @param input
     * @return
     */
	void addAssetType(AddAssetTypeInput input);
	
	/**
     * 修改资产类别
     * @param input
     * @return
     */
	void editAssetType(EditAssetTypeInput input);
	
	/**
     * 批量删除资产类别
     * @param input
     * @return
     */
	void delAssetType(String[] keys);
	
	/**
     * 资产分页列表查询
     * @param input
     * @return
     */
	PagedList<AssetInfoOutput> getAssetInfoPageList(SearchAssetInfoInput input);
	
	/**
     * 新增资产
     * @param input
     * @return
     */
	void addAssetInfo(AddAssetInfoInput input);
	
	/**
     * 修改资产
     * @param input
     * @return
     */
	void editAssetInfo(EditAssetInfoInput input);
	
	/**
     * 批量删除资产
     * @param input
     * @return
     */
	void delAssetInfo(String[] keys);
	
	/**
     * 根据员工id获得该员工对应的未报废的资产列表
     * 
     * @return
     */
	List<AssetOutput> getAssetListByUser(Integer userId);
	
	/**
     * 添加报废申请
     * @param input
     * @return
     */
	void addAssetScape(AddAssetApplyInput input);
	
	/**
     * 添加领用申请
     * @param input
     * @return
     */
	void addAssetReceive(AddAssetApplyInput input);
	
	/**
     * 添加调拨申请
     * @param input
     * @return
     */
	void addAssetAllot(AddAssetApplyInput input);
	
	/**
     * 资产申请分页列表查询
     * @param input
     * @return
     */
	PagedList<AssetApplyOutput> getAssetApplyPageList(SearchAssetApplyInput input);
	
	/**
     * 批量审核通过
     * @param ids
     */
    void auditPass(Integer[] ids);

    /**
     * 批量审核驳回
     * @param ids
     */
    void auditReject(Integer[] ids,String reasonsRejection);
    
    /**
     * 资产操作日志记录分页列表查询
     * @param input
     * @return
     */
	PagedList<AssetLogOutput> getAssetLogPageList(SearchAssetLogInput input);

}
