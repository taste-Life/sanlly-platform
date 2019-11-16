package com.sanlly.production.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanlly.common.models.input.finance.BillSceneMDInput;
import com.sanlly.common.models.input.finance.PoolGonContainerInput;
import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.input.finance.PoolPtiInput;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.input.finance.PoolSourceRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.service.FinanceService;

@Component
public class FinanceFallback implements FinanceService {

	@SuppressWarnings("rawtypes")
	@Override
	public Result createBill(List<BillSceneMDInput> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<String> reductionBill(List<BillSceneMDInput> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> oneReply(List<PoolRepairInput> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelReply(PoolRepairInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<String> getNewRate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> ptiOkNode(PoolPtiInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> wbFinishedRepair(PoolOutSourceRepairInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> wbFinishedClean(PoolOutSourceRepairInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> finishedGX(PoolSourceRepairInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> replyAdd(PoolGonContainerInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Boolean> unReplyAdd(PoolGonContainerInput input) {
		// TODO Auto-generated method stub
		return null;
	}

}
