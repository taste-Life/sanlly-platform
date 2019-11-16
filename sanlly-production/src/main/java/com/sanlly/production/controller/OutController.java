package com.sanlly.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.out.OutIdsInput;
import com.sanlly.production.models.input.out.OutRemarksInput;
import com.sanlly.production.models.output.app.out.OutRecordListOutput;
import com.sanlly.production.models.output.out.MoveListOutput;
import com.sanlly.production.models.output.out.OperatorOutput;
import com.sanlly.production.models.output.out.OutListOutput;
import com.sanlly.production.service.OutService;

import io.swagger.annotations.Api;

/**
 * 
* @Package com.sanlly.production.controller 
* @Description: 出箱 
* @author zhangkai   
* @date 2019年8月28日 下午2:13:05 
* @version V1.0   
 */
@RestController
@Api(tags = {"出箱操作相关API"})
public class OutController {

	@Autowired
	private OutService outService;
	
	/**
	 * 
	* @Description: 出箱列表
	* @param zoneKeys
	* @param containerNo
	* @param ptiResult
	* @param index
	* @param size
	* @return PagedList<OutListOutput>
	* @throws 
	* @author zhangkai
	 */
	@GetMapping("/out/list")
	public Result<PagedList<OutListOutput>> list(
			@RequestParam(required = false, value = "zoneKeys") String[] zoneKeys,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "ptiResult") String ptiResult,
			@RequestParam(required = true, value = "index") Integer index,
			@RequestParam(required = true, value = "size") Integer size
			) {
		return Result.Success(outService.list(zoneKeys, containerNo, ptiResult, index, size));
	}
	
	/**
	 * 
	* @Description: 保存出箱备注 
	* @param inputList
	* @return Result<Boolean>
	* @throws 
	* @author zhangkai
	 */
	@PutMapping("/out/saveRemarks")
	public Result<Boolean> saveRemarks(@RequestBody OutRemarksInput inputList) {
		return Result.Success(outService.saveRemarks(inputList));
	}
	
	/**
	 * 原移
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/out/setMove")
	public Result setMove(@RequestBody OutIdsInput input) {
		Boolean res = outService.setMove(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 出箱列表PTIOK
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/out/setPtiOk")
	public Result setPtiOk(@RequestBody OutIdsInput input) {
		Boolean res = outService.setPtiOk(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 出箱操作
	 * @param prodCourseIds
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/out/setOut")
	public Result setOut(@RequestBody OutIdsInput input) {
		Boolean res = outService.outLeave(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
		
	}
	
	/**
	 * 原移列表
	 * @param zoneKeys
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/out/moveList")
	public Result<PagedList<MoveListOutput>> moveList(
			@RequestParam(required = false, value = "zoneKeys") String[] zoneKeys,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = true, value = "index") Integer index,
			@RequestParam(required = true, value = "size") Integer size
			) {
		return Result.Success(outService.moveList(zoneKeys, containerNo, index, size));
	}
	
	/**
	 * 取消原移
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/out/cancelMove")
	public Result cancelMove(@RequestBody OutIdsInput input) {
		Boolean res = outService.cancelMove(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 出箱记录列表
	 * @param batchNum
	 * @param containerNo
	 * @param operator
	 * @param startTime
	 * @param endTime
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/out/outRecordList")
	public Result<PagedList<OutRecordListOutput>> outRecordList(
			@RequestParam(required = false, value = "batchNum") String batchNum,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "operator") Integer operator,
			@RequestParam(required = false, value = "startTime") String startTime,
			@RequestParam(required = false, value = "endTime") String endTime,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(outService.outRecordList(batchNum, containerNo, operator, startTime, endTime, pageNum, pageSize));
	}
	
	/**
	 * 出箱记录操作人列表
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/out/operators")
	public Result<List<OperatorOutput>> operators() {
		return Result.Success(outService.operators());
	}
	
	/**
	 * 取消出箱
	 * @param ids
	 */
	@DeleteMapping("/out/cancel")
	@SuppressWarnings("rawtypes")
	public Result cancelOut(@RequestParam(required = true, value = "ids") Integer[] ids) {
		outService.cancelOut(ids);
		return Result.Success();
	}
}
