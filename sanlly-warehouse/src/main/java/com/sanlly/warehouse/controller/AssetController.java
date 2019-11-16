package com.sanlly.warehouse.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
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
import com.sanlly.warehouse.models.input.laborInsurance.laborInsuranceType.SearchLaborInsuranceTypeInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.AddSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.models.input.sparepartscategoriesdetails.EditSparePartsCategoriesDetailsInput;
import com.sanlly.warehouse.service.AssetService;
import com.sanlly.warehouse.service.LaborInsuranceTypeService;

import io.swagger.annotations.Api;

/**
 * 资产管理API
 * 
 * @author zhh
 *
 */
@Api(tags = { "资产管理API" })
@RestController
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	/**
	 * 添加资产管理
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/assets")
	public Result addAsset(@RequestBody AddAssetInput input) {
		assetService.addAsset(input);
		return Result.Success();
	}

	/**
	 * 修改资产信息管理
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/assets")
	public Result editAsset(@RequestBody EditAssetInput input) {
		assetService.editAsset(input);
		return Result.Success();
	}

	/**
	 * 分页查询资产管理列表
	 * 
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assets/pages")
	public Result getAssetPageList(@RequestParam(required=false) String company,@RequestParam(required=false) String departments,
			                       @RequestParam(required=false) Integer liablePerson,@RequestParam(required=false) String assetNo,
			                       @RequestParam(required=false) String assetName,@RequestParam(required=false) String outAssetType,
			                       @RequestParam(required=false) Date purchaseDate,@RequestParam(required=false) String useStatus,
			                       @RequestParam Integer index,@RequestParam Integer size) {
		SearchAssetInput input = new SearchAssetInput(index, size);
		input.setAssetName(assetName);
		input.setAssetNo(assetNo);
		input.setCompany(company);
		input.setDepartments(departments);
		input.setLiablePerson(liablePerson);
		input.setOutAssetType(outAssetType);
		input.setPurchaseDate(purchaseDate);
		input.setUseStatus(useStatus);
		return Result.Success(assetService.getAssetPageList(input));
	}

	/**
	 * 资产类别列表
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assetTypes")
	public Result getAssetTypeList() {
		return Result.Success(assetService.getAssetTypeList());
	}
	
	/**
     * 根据员工id获得该员工对应的未报废的资产列表
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assets/{userId}")
	public Result getAssetListByUser(@PathVariable Integer userId) {
		return Result.Success(assetService.getAssetListByUser(userId));
	}
	
	/**
     * 资产类别分页列表查询
     * @param assetTypeName 资产类别
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assetTypes/pages")
    public Result getAssetTypePageList(@RequestParam(required=false) String assetTypeName, @RequestParam Integer index, @RequestParam Integer size){
		SearchAssetTypeInput input = new SearchAssetTypeInput(index, size);
		input.setAssetTypeName(assetTypeName);
		return Result.Success(assetService.getAssetTypePageList(input));
	}
	
	/**
	 * 添加资产类别
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/assetTypes")
	public Result addAssetType(@RequestBody AddAssetTypeInput input) {
		assetService.addAssetType(input);
		return Result.Success();
	}
	
	/**
	 * 修改资产类别
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/assetTypes")
	public Result editAssetType(@RequestBody EditAssetTypeInput input) {
		assetService.editAssetType(input);
		return Result.Success();
	}
	
	/**
	 * 批量删除资产类别
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/assetTypes")
	public Result delAssetType(@RequestParam String[] keys) {
		assetService.delAssetType(keys);
		return Result.Success();
	}
	
	/**
     * 资产分页列表查询
     * @param assetName 资产名称
     * @param assetType 资产类别
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assetInfos/pages")
    public Result getAssetInfoPageList(@RequestParam(required=false) String assetName,@RequestParam(required=false) String assetType, @RequestParam Integer index, @RequestParam Integer size){
		SearchAssetInfoInput input = new SearchAssetInfoInput(index, size);
		input.setAssetName(assetName);
		input.setAssetType(assetType);
		return Result.Success(assetService.getAssetInfoPageList(input));
	}
	
	/**
	 * 添加资产
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/assetInfos")
	public Result addAssetInfo(@RequestBody AddAssetInfoInput input) {
		assetService.addAssetInfo(input);
		return Result.Success();
	}
	
	/**
	 * 修改资产
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/assetInfos")
	public Result editAssetInfo(@RequestBody EditAssetInfoInput input) {
		assetService.editAssetInfo(input);
		return Result.Success();
	}
	
	/**
	 * 批量删除资产
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/assetInfos")
	public Result delAssetInfo(@RequestParam String[] keys) {
		assetService.delAssetInfo(keys);
		return Result.Success();
	}
	
	/**
	 * 添加资产报废申请
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/assets/scrap")
	public Result addAssetScrap(@RequestBody AddAssetApplyInput input) {
		assetService.addAssetScape(input);
		return Result.Success();
	}
	
	/**
	 * 添加资产领用申请
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/assets/receive")
	public Result addAssetReceive(@RequestBody AddAssetApplyInput input) {
		assetService.addAssetReceive(input);
		return Result.Success();
	}
	
	/**
	 * 添加资产调拨申请
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/assets/allot")
	public Result addAssetAllot(@RequestBody AddAssetApplyInput input) {
		assetService.addAssetAllot(input);
		return Result.Success();
	}
	
	/**
     * 资产申请分页列表查询
     * @param assetApplyNo 申请单号
     * @param applyType 申请类别
     * @param auditStatus 审核状态
     * @param applyDate 申请日期
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assets/apply/pages")
    public Result getAssetApplyPageList(@RequestParam(required=false) String assetApplyNo,@RequestParam(required=false) String applyType,@RequestParam(required=false) String auditStatus,@RequestParam(required=false) Date applyDate, @RequestParam Integer index, @RequestParam Integer size){
		SearchAssetApplyInput input = new SearchAssetApplyInput(index, size);
		input.setApplyType(applyType);
		input.setApplyDate(applyDate);
		input.setAssetApplyNo(assetApplyNo);
		input.setAuditStatus(auditStatus);
		return Result.Success(assetService.getAssetApplyPageList(input));
	}
	
	/**
     * 批量审核通过
     * @param ids
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/assets/apply/auditPass")
    public Result auditPass(@RequestParam Integer[] ids){
    	assetService.auditPass(ids);
        return Result.Success();
    }

    /**
     * 批量审核驳回
     * @param ids
     * @param reasonsRejection
     * @return
     */
    @SuppressWarnings("rawtypes")
	@PutMapping("/assets/apply/auditReject")
    public Result auditReject(@RequestParam Integer[] ids,@RequestParam String reasonsRejection){
    	assetService.auditReject(ids,reasonsRejection);
        return Result.Success();
    }
    
    /**
     * 资产日志操作记录分页列表查询
     * @param operator 操作人
     * @param operateType 操作类型
     * @param assetNo 资产编号
     * @param assetName 资产名称
     * @param operateTime 操作时间
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/assets/log/pages")
    public Result getAssetLogPageList(@RequestParam(required=false) Integer operator,@RequestParam(required=false) String operateType,@RequestParam(required=false) String assetNo,@RequestParam(required=false) String assetName,@RequestParam(required=false) Date operateTime, @RequestParam Integer index, @RequestParam Integer size){
		SearchAssetLogInput input = new SearchAssetLogInput(index, size);
		input.setAssetName(assetName);
		input.setAssetNo(assetNo);
		input.setOperateTime(operateTime);
		input.setOperateType(operateType);
		input.setOperator(operator);
		return Result.Success(assetService.getAssetLogPageList(input));
	}
}
