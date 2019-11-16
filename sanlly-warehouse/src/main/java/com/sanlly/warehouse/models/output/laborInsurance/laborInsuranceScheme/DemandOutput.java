package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme;

import java.util.List;
/**
 * ClassName: DemandOutput
 * Description: 劳保福利需求预估信息输出类
 * date: 2019/10/08 14:50
 *
 * @author zhh
 */
public class DemandOutput {

	List<DemandEstimationOutput> detailList;
	
	List<DemandEstimationOutput> dataList;

	public List<DemandEstimationOutput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<DemandEstimationOutput> detailList) {
		this.detailList = detailList;
	}

	public List<DemandEstimationOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<DemandEstimationOutput> dataList) {
		this.dataList = dataList;
	}
	
	
}
