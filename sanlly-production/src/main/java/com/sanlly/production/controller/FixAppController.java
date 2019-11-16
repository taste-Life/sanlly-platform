package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.fix.FixReferralBatchInput;
import com.sanlly.production.models.input.fix.FixReferralEntryInput;
import com.sanlly.production.models.input.fix.FixReferralFinishInput;
import com.sanlly.production.models.input.fix.FixReferralSingleInput;
import com.sanlly.production.models.input.fix.FixReferralsSearchInput;
import com.sanlly.production.models.input.fix.FixSparesNumSubmitInput;
import com.sanlly.production.service.FixService;


/**   
* @Package com.sanlly.production.controller 
* @Description: TODO 生产维修接口
* @author tianzhl   
* @date 2019年9月7日 下午3:36:45 
* @version V1.0   
*/
@RestController
public class FixAppController {
	
	@Autowired
	private FixService fixService;

	
	/** 
	* @Description: TODO 派工单列表
	* @param input 
	* @return
	* @throws Exception Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@GetMapping("/fix/referrals")
	public Result fixReferrals(FixReferralsSearchInput input) throws Exception {
		return Result.Success(fixService.fixReferrals(input));
	}
	
	/** 
	* @Description: TODO 获取领料备件列表
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/spares")
	public Result fixSpares(FixReferralBatchInput input) throws Exception  {
		return Result.Success(fixService.fixSpares(input));
	}
	
	/** 
	* @Description: TODO 获取领料备件列表
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/spares/single")
	public Result fixSparesSingle(FixReferralEntryInput input) throws Exception  {
		return Result.Success(fixService.fixSparesSingle(input));
	}
	
	/** 
	* @Description: TODO 批量领料
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/picking")
	public Result fixPicking(FixReferralBatchInput input)  throws Exception {
		fixService.fixPicking(input);
		return Result.Success();
	}
	
	/** 
	* @Description: TODO 单箱领料
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/picking/single")
	public Result fixPickingSingle(FixReferralEntryInput input)  throws Exception {
		fixService.fixPickingSingle(input);
		return Result.Success();
	}
	
	/** 
	* @Description: TODO 批量完工
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/finish")
	public Result fixFinish(FixReferralBatchInput input)  throws Exception {
		fixService.fixFinish(input);
		return Result.Success();
	}
	
	/** 
	* @Description: TODO 单箱完工
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/finish/single")
	public Result fixFinishSingle(FixReferralFinishInput input)  throws Exception {
		fixService.fixFinishSingle(input);
		return Result.Success();
	}
	

	/** 
	* @Description: TODO 批量质检完工
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/quality")
	public Result fixQualityFinish(FixReferralBatchInput input)  throws Exception {
		fixService.fixQualityFinish(input);
		return Result.Success();
	}
	
	/** 
	* @Description: TODO 单箱质检完工
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/quality/single")
	public Result fixQualityFinishSingle(FixReferralFinishInput input)  throws Exception {
		fixService.fixQualityFinishSingle(input);
		return Result.Success();
	}
	
	
	/** 
	* @Description: TODO 派工单明细
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@GetMapping("/fix/referral/details")
	public Result fixreFerralDetails(FixReferralSingleInput input) throws Exception  {
		
		return Result.Success(fixService.fixreFerralDetails(input));
	}
	
	/** 
	* @Description: TODO 上传修后照片
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/container/afterPhoto/upload")
	public Result containerUploadAfterPhoto(FixReferralFinishInput input)  throws Exception {
		fixService.containerUploadAfterPhoto(input);
		return Result.Success();
	}
	
	/** 
	* @Description: TODO 获取修后照片
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@GetMapping("/container/afterPhoto")
	public Result containerAfterPhoto(FixReferralSingleInput input)  throws Exception {
		
		return Result.Success(fixService.containerAfterPhoto(input));
	}
	
	/** 
	* @Description: TODO 强制不出
	* @param input
	* @return Result
	* @throws 
	*/
	@SuppressWarnings("rawtypes")
	@PutMapping("/fix/notout")
	public Result fixNotout(FixReferralEntryInput input) throws Exception  {
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
	@GetMapping("/fix/spareNums")
	public Result SpareNumList(String device) throws Exception {
		return Result.Success(fixService.spareNumList(device));
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
	@PutMapping("/fix/sparesNum/sub")
	public Result sparesNumSubmit(FixSparesNumSubmitInput input) throws Exception {
		fixService.sparesNumSubmit(input);
		return Result.Success();
	}

	
}
