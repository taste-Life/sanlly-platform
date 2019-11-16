package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.fixIn.PickingListSearchInput;
import com.sanlly.common.models.output.fixOut.PickingListDetailOutput;
import com.sanlly.common.models.output.fixOut.PickingListOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.production.models.input.fix.FixDeviceListInput;
import com.sanlly.production.models.input.fix.FixReferralBatchInput;
import com.sanlly.production.models.input.fix.FixReferralDesignateInput;
import com.sanlly.production.models.input.fix.FixReferralEntryInput;
import com.sanlly.production.models.input.fix.FixReferralFinishInput;
import com.sanlly.production.models.input.fix.FixReferralSingleInput;
import com.sanlly.production.models.input.fix.FixReferralsListInput;
import com.sanlly.production.models.input.fix.FixReferralsSearchInput;
import com.sanlly.production.models.input.fix.FixReplaceSparesInput;
import com.sanlly.production.models.input.fix.FixSparesNumSubmitInput;
import com.sanlly.production.models.input.fix.PickingListBatchOutInput;
import com.sanlly.production.models.input.fix.PickingListOutInput;
import com.sanlly.production.models.output.fix.FixPickingListOutput;
import com.sanlly.production.models.output.fix.FixReferralsDetailsOutput;
import com.sanlly.production.models.output.fix.FixReferralsListOutput;
import com.sanlly.production.models.output.fix.FixReferralsOutput;
import com.sanlly.production.models.output.fix.FixSparesListOutput;
import com.sanlly.production.models.output.fix.FixSparesOutput;

/**
 *    
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO 生产维修相关接口
 * @author tianzhl   
 * @date 2019年9月7日 下午4:39:43 
 * @version V1.0   
 */
public interface FixService {

	/**
	 *  
	 * 
	 * @Description: TODO 派工单列表 -- app
	 * @param input
	 * @return PagedList<FixSparesOutput> 派工单列表
	 * @throws Exception
	 */
	public PagedList<FixReferralsOutput> fixReferrals(FixReferralsSearchInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 派工单列表  -- web
	 * @param input
	 * @return PagedList<FixReferralsListOutput> 派工单列表
	 * @throws Exception
	 */
	public PagedList<FixReferralsListOutput> fixReferralsList(FixReferralsListInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 派工单基本信息 -- web
	 * @param input
	 * @return FixReferralsListOutput 派工单列表
	 * @throws Exception
	 */
	public FixReferralsListOutput fixReferralsInfo(FixReferralSingleInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 获取领料备件列表
	 * @param input
	 * @return List<FixSparesOutput> 领料备件列表
	 * @throws Exception
	 */
	public List<FixSparesOutput> fixSpares(FixReferralBatchInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 获取领料备件列表
	 * @param input
	 * @return List<FixSparesOutput> 领料备件列表
	 * @throws Exception
	 */
	public List<FixSparesOutput> fixSparesSingle(FixReferralEntryInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 批量领料
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixPicking(FixReferralBatchInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 单箱领料
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixPickingSingle(FixReferralEntryInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 批量完工
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixFinish(FixReferralBatchInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量质检完工
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixQualityFinish(FixReferralBatchInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 单箱完工
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixFinishSingle(FixReferralFinishInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 单箱质检完工
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixQualityFinishSingle(FixReferralFinishInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 派工单明细
	 * @param input
	 * @return List<FixReferralsDetailsOutput> 派工单明细
	 * @throws Exception
	 */
	public List<FixReferralsDetailsOutput> fixreFerralDetails(FixReferralSingleInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 上传修后照片
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void containerUploadAfterPhoto(FixReferralFinishInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 获取修后照片
	 * @param input
	 * @return String 修后照片
	 * @throws Exception
	 */
	public String containerAfterPhoto(FixReferralSingleInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 强制不出
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixNotout(FixReferralEntryInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 延期出库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixPostpone(FixReferralEntryInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 根据主件获取备件列表
	 * @param input
	 * @return String 主件
	 * @throws Exception
	 */
	public List<SpareTestingOutput> spareNumList(String device) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 提交备件号
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void sparesNumSubmit(FixSparesNumSubmitInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 换件
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void sparesNumReplace(FixReplaceSparesInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 获取领料单
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public List<FixPickingListOutput> pickingList(FixReferralSingleInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 根据主件列表获取主件备件列表
	 * @param input
	 * @return String 主件
	 * @throws Exception
	 */
	public List<FixSparesListOutput> deviceSpareNumList(FixDeviceListInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量指派
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void fixDesignate(FixReferralDesignateInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单出库列表
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public PagedList<PickingListOutput> pickingList(PickingListSearchInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单批量出库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void pickingListBatchOut(PickingListBatchOutInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 出库领料单
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public PickingListDetailOutput pickingListDetail(String referralNo) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单出库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void pickingListOut(PickingListOutInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 领料单退库
	 * @param input
	 * @return 
	 * @throws Exception
	 */
	public void pickingListBack(PickingListOutInput input) throws Exception;
	
}
