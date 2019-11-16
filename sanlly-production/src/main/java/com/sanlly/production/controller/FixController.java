package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.fix.FixDeviceListInput;
import com.sanlly.production.models.input.fix.FixReferralBatchInput;
import com.sanlly.production.models.input.fix.FixReferralDesignateInput;
import com.sanlly.production.models.input.fix.FixReferralEntryInput;
import com.sanlly.production.models.input.fix.FixReferralFinishInput;
import com.sanlly.production.models.input.fix.FixReferralSingleInput;
import com.sanlly.production.models.input.fix.FixReferralsListInput;
import com.sanlly.production.models.input.fix.FixReplaceSparesInput;
import com.sanlly.production.models.input.fix.FixSparesNumSubmitInput;
import com.sanlly.production.models.input.fix.PickingListBatchOutInput;
import com.sanlly.production.models.input.fix.PickingListOutInput;
import com.sanlly.common.models.input.fixIn.PickingListSearchInput;
import com.sanlly.production.service.FixService;
import com.sanlly.production.service.XxService;

/**
 *    
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO 生产维修接口
 * @author tianzhl   
 * @date 2019年9月7日 下午3:36:45 
 * @version V1.0   
 */
@RestController
public class FixController {

	@Autowired
	private FixService fixService;
	
	@Autowired
	private XxService xxService;

	/**
	 *  
	 * 
	 * @Description: TODO 派工单列表 -- web
	 * @param input
	 * @return
	 * @throws Exception Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fixs/referrals/list")
	public Result fixReferrals(FixReferralsListInput input) throws Exception {
		return Result.Success(fixService.fixReferralsList(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 派工单详情
	 * @param input
	 * @return
	 * @throws Exception Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fixs/referrals/info")
	public Result fixReferrals(FixReferralSingleInput input) throws Exception {
		return Result.Success(fixService.fixReferralsInfo(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取领料备件列表
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/spares")
	public Result fixSpares(@RequestBody FixReferralBatchInput input) throws Exception {
		return Result.Success(fixService.fixSpares(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量领料
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/picking")
	public Result fixPicking(@RequestBody FixReferralBatchInput input) throws Exception {
		fixService.fixPicking(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 单箱领料
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/picking/single")
	public Result fixPickingSingle(@RequestBody FixReferralEntryInput input) throws Exception {
		
		fixService.fixPickingSingle(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量完工
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/finish")
	public Result fixFinish(@RequestBody FixReferralBatchInput input) throws Exception {
		fixService.fixFinish(input);
		if(input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			for (String prodCourseId : input.getProdCourseIdList()) {
				xxService.createPtiInfo(prodCourseId);
			}
		}
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量质检完工
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/finish/quality")
	public Result fixQualityFinish(@RequestBody FixReferralBatchInput input) throws Exception{
		fixService.fixQualityFinish(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 单箱完工
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/finish/single")
	public Result fixFinishSingle(@RequestBody FixReferralFinishInput input) throws Exception {
		fixService.fixFinishSingle(input);
		if(input.getProdCourseId() != null) {
			xxService.createPtiInfo(input.getProdCourseId());
		}
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 派工单明细
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fixs/referral/details")
	public Result fixreFerralDetails(FixReferralSingleInput input) throws Exception {

		return Result.Success(fixService.fixreFerralDetails(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 上传修后照片
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containers/afterPhoto/upload")
	public Result containerUploadAfterPhoto(@RequestBody FixReferralFinishInput input) throws Exception {
		fixService.containerUploadAfterPhoto(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取修后照片
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containers/afterPhoto")
	public Result containerAfterPhoto(FixReferralSingleInput input) throws Exception {

		return Result.Success(fixService.containerAfterPhoto(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 强制不出
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/notout")
	public Result fixNotout(@RequestBody FixReferralEntryInput input) throws Exception {
		fixService.fixNotout(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 根据主件获取备件列表
	 * @param input
	 * @return String 主件
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fixs/spareNums")
	public Result spareNumList(String device) throws Exception {
		return Result.Success(fixService.spareNumList(device));
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 根据主件列表获取主件备件列表
	 * @param input
	 * @return List<FixSparesListOutput> 主件
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/device/spareNums")
	public Result deviceSpareNumList(@RequestBody FixDeviceListInput input) throws Exception{
		return Result.Success(fixService.deviceSpareNumList(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 提交备件号
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/sparesNum/sub")
	public Result sparesNumSubmit(@RequestBody FixSparesNumSubmitInput input) throws Exception {
		fixService.sparesNumSubmit(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 换件
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/sparesNum/replace")
	public Result sparesNumReplace(@RequestBody FixReplaceSparesInput input) throws Exception{
		fixService.sparesNumReplace(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 获取领料单
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fixs/picking/list")
	public Result pickingList(FixReferralSingleInput input) throws Exception{
		return Result.Success(fixService.pickingList(input));
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量指派
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/designate")
	public Result fixDesignate(@RequestBody FixReferralDesignateInput input) throws Exception{
		fixService.fixDesignate(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单出库列表
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/pickinglist")
	public Result pickingList(@RequestBody PickingListSearchInput input) throws Exception{
		return Result.Success(fixService.pickingList(input));
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单批量出库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/pickinglist/out")
	public Result pickingListBatchOut(@RequestBody PickingListBatchOutInput input) throws Exception{
		fixService.pickingListBatchOut(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 出库领料单
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fixs/pickinglist/detail")
	public Result pickingListDetail(@RequestParam String referralNo) throws Exception{
		return Result.Success(fixService.pickingListDetail(referralNo));
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单出库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/pickinglist/detail/out")
	public Result pickingListOut(@RequestBody PickingListOutInput input) throws Exception{
		fixService.pickingListOut(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单退库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/fixs/pickinglist/detail/back")
	public Result pickingListBack(@RequestBody PickingListOutInput input) throws Exception{
		fixService.pickingListBack(input);
		return Result.Success();
	}

}
