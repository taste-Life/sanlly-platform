package com.sanlly.production.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.heavyContainer.HeavyContainerSetPositionInput;
import com.sanlly.production.models.input.app.heavyContainer.HeavyContainerSetTempInput;
import com.sanlly.production.models.output.app.heavyContainer.DeviceStateOutput;
import com.sanlly.production.models.output.app.heavyContainer.GuaranteeOuput;
import com.sanlly.production.models.output.app.heavyContainer.HeavyContainerListOutput;
import com.sanlly.production.models.output.app.heavyContainer.HeavyContainerTempsOutput;
import com.sanlly.production.models.output.app.heavyContainer.HeavySupContainerListOutput;
import com.sanlly.production.models.output.app.heavyContainer.VoyageContainerOutput;
import com.sanlly.production.service.HeavyContainerAppService;

import io.swagger.annotations.Api;

/**
 * 
* @Package com.sanlly.production.controller 
* @Description: 重箱监管APP
* @author zhangkai   
* @date 2019年9月2日 上午11:26:57 
* @version V1.0   
 */
@RestController
@Api(tags = {"重箱监管APP"})
@RequestMapping("/heavyContainer")
public class HeavyContainerAppController {
	
	@Autowired
	private HeavyContainerAppService heavyContainerAppService;
	
	/**
	 * 
	* @Description: TODO 码头采集-箱列表
	* @param vesVos
	* @param state
	* @param containerNo
	* @param pageNum
	* @param pageSize
	* @return Result<PagedList<HeavyContainerListOutput>>
	* @throws 
	* @author zhangkai
	 */
	@GetMapping("/heavyContainers")
	public Result<PagedList<HeavyContainerListOutput>> list(
			@RequestParam(required = false, value = "vesVos") String vesVos,
			@RequestParam(required = false, value = "state") String state,
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(heavyContainerAppService.list(vesVos, state, containerNo, pageNum, pageSize));
	}
	
	/**
	 * 重箱监管-批量设置入港时间和位置
	 * @param input
	 * @return
	 * @author zhangkai
	 * @throws ParseException 
	 */
	@PutMapping("/setPosition")
	@SuppressWarnings("rawtypes")
	public Result setPosition(@RequestBody HeavyContainerSetPositionInput input) throws ParseException {
		boolean res = heavyContainerAppService.setPosition(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}	
	}
	
	/**
	 * 重箱监管-温度采集
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@PostMapping("/setTemp")
	@SuppressWarnings("rawtypes")
	public Result setTemp(@RequestBody HeavyContainerSetTempInput input) {
		boolean res = heavyContainerAppService.setTemp(input);
		if (res) {
			return Result.Success();
		} else {
			return Result.Error(ResultCodeEnum.BAD_REQUEST.getCode(), "");
		}
	}
	
	/**
	 * 重箱监管-查看温度记录
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/temps")
	public Result<List<HeavyContainerTempsOutput>> temps(
			@RequestParam(required = true, value = "prodHeavyEnterId") Integer prodHeavyEnterId
			) {
		return Result.Success(heavyContainerAppService.temps(prodHeavyEnterId));
	}
	
	/**
	 * 重箱监管-时间段列表（根据公司key获取）
	 * @param companyKey
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/recordingPeroid")
	public Result<List<String>> recordingPeroid(
			@RequestParam(required = true, value = "companyKey") String companyKey
			) {
		return Result.Success(heavyContainerAppService.recordingPeroids(companyKey));
	}
	
	/**
	 * 重箱监管-监管箱列表
	 * @param recordingPeroid
	 * @param position
	 * @param isCollect
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/heavySupContainers")
	public Result<PagedList<HeavySupContainerListOutput>> heavySupContainers(
			@RequestParam(required = true, value = "recordingPeroid") String recordingPeroid,
			@RequestParam(required = false, value = "position") String position,
			@RequestParam(required = false, value = "isCollect") String isCollect,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(heavyContainerAppService.heavySupContainers(recordingPeroid, position, isCollect, pageNum, pageSize));
	}
	
	/**
	 * 重箱监管-设备状态列表
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/deviceStates")
	public Result<List<DeviceStateOutput>> deviceStates() {
		return Result.Success(heavyContainerAppService.deviceStates());
	}
	
	/**
	 * 重箱监管-船名航次列表（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/voyages")
	public Result<PagedList<String>> voyages(
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(heavyContainerAppService.voyages(pageNum, pageSize));
	}
	
	/**
	 * 航次箱列表-分页
	 * @param vesVos
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/voyageContainers")
	public Result<PagedList<VoyageContainerOutput>> voyageContainers(
			@RequestParam(required = true, value = "vesVos") String vesVos,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(heavyContainerAppService.voyageContainers(vesVos, pageNum, pageSize));
	}
	
	/**
	 * 装船
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/setShipment")
	public Result setShipment(@RequestParam(required = true, value = "prodHeavyEnterIds") String prodHeavyEnterIds) {
		return Result.Success(heavyContainerAppService.setShipment(prodHeavyEnterIds));
	}
	
	/**
	 * 转船
	 * @param prodHeavyEnterId
	 * @param vesVos
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/transshipment")
	public Result transshipment(
			@RequestParam(required = true, value = "prodHeavyEnterIds") String prodHeavyEnterIds,
			@RequestParam(required = true, value = "vesVos") String vesVos
			) {
		return Result.Success(heavyContainerAppService.transshipment(prodHeavyEnterIds, vesVos));
	}

	/**
	 * 退载
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/setBack")
	public Result setBack(
			@RequestParam(required = true, value = "prodHeavyEnterId") String prodHeavyEnterIds
			) {
		return Result.Success(heavyContainerAppService.setBack(prodHeavyEnterIds));
	}
	
	/**
	 * 保函
	 * @param containerNo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/guarantees")
	public Result<PagedList<GuaranteeOuput>> guarantees(
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize) {
		return Result.Success(heavyContainerAppService.guarantees(containerNo, pageNum, pageSize));
	}
}
