package com.sanlly.production.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sanlly.common.models.input.finance.BillSceneMDInput;
import com.sanlly.common.models.input.finance.PoolGonContainerInput;
import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.input.finance.PoolPtiInput;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.input.finance.PoolSourceRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.config.FeignClientConfig;
import com.sanlly.production.service.fallback.FinanceFallback;

@FeignClient(name = "finance", configuration = FeignClientConfig.class, fallback = FinanceFallback.class)
public interface FinanceService {
	/**
	 * 现场收费
	 * 
	 * @param input
	 * @param list
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/billScene/createBill")
	public Result createBill(@RequestBody List<BillSceneMDInput> list);

	/**
	 * 现场收费减免
	 */
	@PostMapping("/billScene/reductionBill")
	public Result<String> reductionBill(@RequestBody List<BillSceneMDInput> list);

	/**
	 * 单箱批复
	 */
	@PostMapping("/poolRepair/oneReply")
	public Result<Boolean> oneReply(@RequestBody List<PoolRepairInput> list);

	/**
	 * 获取最新费率
	 */
	@GetMapping("/exchangeRate/getNewRate")
	Result<String> getNewRate();

	/**
	 * 取消批复删除费用
	 * 
	 * @param input
	 * @return
	 */
	@PostMapping("/poolRepair/cancleReply")
	Boolean cancelReply(@RequestBody PoolRepairInput input);

	/**
	 * 
	 * @Description:pti ok 确认产生pit成本费
	 * @param input
	 * @return Result
	 */
	@PostMapping("/poolPti/ptiOkNode")
	Result<Boolean> ptiOkNode(@RequestBody PoolPtiInput input);

	/**
	 * 洗箱生成
	 * 
	 * @param input
	 * @return
	 */
	@PostMapping("/poolOutSourceRepair/wbFinishedClean")
	Result<Boolean> wbFinishedClean(@RequestBody PoolOutSourceRepairInput input);

	/**
	 * 
	 * @Description:劳务外包完工 修箱
	 * @param input
	 * @return Result
	 */
	@PostMapping("/poolOutSourceRepair/wbFinishedRepair")
	Result<Boolean> wbFinishedRepair(@RequestBody PoolOutSourceRepairInput input);

	/**
	 * 
	 * @Description:干箱完工时，生成费用 判断场站核算模式 是完工产生 还是 修理账单确认产生
	 * @param input
	 * @return Result
	 */
	@PostMapping("/poolSourceRepair/finishedGX")
	Result<Boolean> finishedGX(@RequestBody PoolSourceRepairInput input);

	/**
	 * 挂衣箱批复
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result<Boolean> @throws 
	 */
	@PostMapping("/poolGonContainer/replyAdd")
	Result<Boolean> replyAdd(@RequestBody PoolGonContainerInput input);

	/**
	 * 挂衣箱撤载
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result<Boolean> @throws 
	 */
	@PostMapping("/poolGonContainer/unReplyAdd")
	Result<Boolean> unReplyAdd(@RequestBody PoolGonContainerInput input);
}
