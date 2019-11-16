package com.sanlly.warehouse.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.masterdevice.AddMasterDeviceInput;
import com.sanlly.warehouse.models.input.masterdevice.AddMasterDeviceSparePartsRelation;
import com.sanlly.warehouse.models.input.masterdevice.EditMasterDeviceInput;
import com.sanlly.warehouse.models.input.masterdevice.SearchMasterDeviceInput;
import com.sanlly.warehouse.service.WareMasterDeviceService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: WareMasterDeviceController Description: 主件Controller层 date:
 * 2019/7/24 14:06
 *
 * @author wannt
 * @since JDK 1.8
 */
@RestController
@Api(value = "主件controller", tags = { "主件操作接口" })
public class WareMasterDeviceController {

	@Autowired
	private WareMasterDeviceService wareMasterDeviceService;

	/**
	 * 主件列表查询
	 * 
	 * @param masterDeviceName
	 * @param masterDeviceNameEn
	 * @param masterDeviceNo
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "主件列表查询", tags = { "主件列表查询" })
	@ApiImplicitParams({ @ApiImplicitParam(name = "masterDeviceName", value = "主件名", dataType = "String"),
			@ApiImplicitParam(name = "masterDeviceNameEn", value = "主件英文名", dataType = "String"),
			@ApiImplicitParam(name = "masterDeviceNo", value = "主件号", dataType = "String") })
	@GetMapping("/masterDevice")
	public Result masterDevicePagedList(@RequestParam(required = false) String masterDeviceName,
			@RequestParam(required = false) String masterDeviceNameEn,
			@RequestParam(required = false) String masterDeviceNo, @RequestParam Integer index,
			@RequestParam Integer size) {
		SearchMasterDeviceInput input = new SearchMasterDeviceInput();
		input.setMasterDeviceName(masterDeviceName);
		input.setMasterDeviceNo(masterDeviceNo);
		input.setMasterDeviceNameEn(masterDeviceNameEn);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(wareMasterDeviceService.getMasterDevicePageList(input));
	}

	/**
	 * 根据key获取主件信息
	 * 
	 * @param masterDeviceKey
	 *            主件Key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "根据key获取主件信息", tags = { "根据key获取主件信息" })
	@ApiImplicitParams({ @ApiImplicitParam(name = "masterDeviceKey", value = "主件Key", dataType = "String") })
	@GetMapping("/masterDevice/{masterDeviceKey}")
	public Result getMasterDevice(@PathVariable(value = "masterDeviceKey") String masterDeviceKey) {
		EditMasterDeviceInput input = new EditMasterDeviceInput();
		input.setKey(masterDeviceKey);
		return Result.Success(wareMasterDeviceService.getMasterDeviceDetail(input));
	}

	/**
	 * 新增主件
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "新增主件", tags = { "新增主件" })
	@PostMapping("/masterDevice")
	public Result addMasterDevice(@RequestBody AddMasterDeviceInput input) {
		wareMasterDeviceService.addMasterDevice(input);
		return Result.Success();
	}

	/**
	 * 修改主件
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "修改主件", tags = { "修改主件" })
	@PutMapping("/masterDevice")
	public Result editMasterDevice(@RequestBody EditMasterDeviceInput input) {
		wareMasterDeviceService.updateMasterDevice(input);
		return Result.Success();
	}

	/**
	 * 根据主件id删除主件
	 * 
	 * @param masterDeviceIds
	 *            主件id数组
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "根据主件id删除主件", tags = { "根据主件id删除主件" })
	@ApiImplicitParams({ @ApiImplicitParam(name = "masterDeviceIds", value = "主件ID数组", dataType = "Integer[]") })
	@DeleteMapping("/masterDevice")
	public Result deleteMasterDevice(@RequestParam Integer[] masterDeviceIds) {
		wareMasterDeviceService.deleteMasterDevice(masterDeviceIds);
		return Result.Success();
	}

	/**
	 * 添加主件备件关系
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "添加主件备件关系", tags = { "添加主件备件关系" })
	@PostMapping("/masterDeviceSpareParts")
	public Result addMasterDeviceSpareParts(@RequestBody List<AddMasterDeviceSparePartsRelation> input) {
		wareMasterDeviceService.addMasterDeviceSparePartsRelation(input);
		return Result.Success();
	}

	/**
	 * 根据ID删除主件备件关系
	 * 
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "根据ID删除主件备件关系", tags = { "根据ID删除主件备件关系" })
	@DeleteMapping("/masterDeviceSpareParts")
	public Result deleteMasterDeviceSpareParts(@RequestParam Integer[] ids) {
		wareMasterDeviceService.deleteMasterDeviceSparePartsRelation(ids);
		return Result.Success();
	}

	/**
	 * 根据主件查询所属备件列表
	 * 
	 * @param masterDeviceNo
	 * @return
	 */
	@ApiOperation(value = "根据主件查询所属备件列表", tags = { "根据主件查询所属备件列表" })
	@ApiImplicitParams({ @ApiImplicitParam(name = "masterDeviceKey", value = "主件key", dataType = "String"), })
	@GetMapping("/masterDeviceSpareParts")
	public Result getSparePartsPageListByMasterDeice(@RequestParam(value = "masterDeviceNo") String masterDeviceNo) {
		return Result.Success(
				wareMasterDeviceService.getSparePartsPageListByMasterDeice(masterDeviceNo));
	}

	/**
	 * 根据主件号查询所属备件列表
	 * 
	 * @param masterDevice
	 * @return
	 */
	@ApiOperation(value = "根据主件查询所属备件列表", tags = { "根据主件查询所属备件列表" })
	@ApiImplicitParams({ @ApiImplicitParam(name = "masterDevice", value = "主件号", dataType = "String"), })
	@GetMapping("/getSparesByDevice")
	public Result getSparesByDevice(@RequestParam(value = "masterDevice") String masterDevice) {
		return Result.Success(wareMasterDeviceService.getSparesByDevice(new EditMasterDeviceInput(masterDevice)));
	}

	/**
	 * 根据主件号查询备件号列表
	 * 
	 * @param masterDeviceNo
	 * @return
	 */
	@GetMapping("/getSpListByMdNo")
	public Result getSPListByMDNo(@RequestParam String masterDeviceNo) {
		return Result.Success(wareMasterDeviceService.getSPListByMDNo(masterDeviceNo));
	}

	/**
	 * 获取主件列表
	 * 
	 * @return
	 */
	@GetMapping("/masterDevice/getList")
	public Result getList() {
		return Result.Success(wareMasterDeviceService.getList());
	}

}
