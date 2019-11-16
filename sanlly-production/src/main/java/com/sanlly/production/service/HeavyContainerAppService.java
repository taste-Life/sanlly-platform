package com.sanlly.production.service;

import java.text.ParseException;
import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.heavyContainer.HeavyContainerSetPositionInput;
import com.sanlly.production.models.input.app.heavyContainer.HeavyContainerSetTempInput;
import com.sanlly.production.models.output.app.heavyContainer.DeviceStateOutput;
import com.sanlly.production.models.output.app.heavyContainer.GuaranteeOuput;
import com.sanlly.production.models.output.app.heavyContainer.HeavyContainerListOutput;
import com.sanlly.production.models.output.app.heavyContainer.HeavyContainerTempsOutput;
import com.sanlly.production.models.output.app.heavyContainer.HeavySupContainerListOutput;
import com.sanlly.production.models.output.app.heavyContainer.VoyageContainerOutput;
/**
 * 
* @Package com.sanlly.production.service.impl 
* @Description: APP重箱监管 
* @author zhangkai   
* @date 2019年9月2日 下午1:21:02 
* @version V1.0   
 */
public interface HeavyContainerAppService {
	
	/**
	 * 码头采集-箱列表
	 * @author zhangkai
	 */
	PagedList<HeavyContainerListOutput> list(String vesVos, String state, String containerNo, Integer pageNum, Integer pageSize);

	/**
	 * 重箱监管-批量设置入港时间和位置
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	boolean setPosition(HeavyContainerSetPositionInput input) throws ParseException;
	
	/**
	 * 重箱监管-温度采集
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	boolean setTemp(HeavyContainerSetTempInput input);
	
	/**
	 * 重箱监管-查看温度记录
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	List<HeavyContainerTempsOutput> temps(Integer prodHeavyEnterId);
	
	/**
	 * 重箱监管-时间段列表（根据公司key获取）
	 * @param companyKey
	 * @return
	 * @author zhangkai
	 */
	List<String> recordingPeroids(String companyKey);
	
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
	PagedList<HeavySupContainerListOutput> heavySupContainers(
				String recordingPeroid,
				String position,
				String isCollect,
				Integer pageNum,
				Integer pageSize
			);
	
	/**
	 * 重箱监管-设备状态列表
	 * @return
	 * @author zhangkai
	 */
	List<DeviceStateOutput> deviceStates();
	
	/**
	 * 重箱监管-船名航次列表（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	PagedList<String> voyages(Integer pageNum, Integer pageSize);
	
	/**
	 * 航次箱列表-分页
	 * @param vesVos
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	PagedList<VoyageContainerOutput> voyageContainers(String vesVos, Integer pageNum, Integer pageSize);
	
	/**
	 * 装船
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	boolean setShipment(String prodHeavyEnterIds);
	
	/**
	 * 转船
	 * @param prodHeavyEnterId
	 * @param vesVos
	 * @return
	 * @author zhangkai
	 */
	boolean transshipment(String prodHeavyEnterIds, String vesVos);
	
	/**
	 * 退载
	 * @param prodHeavyEnterId
	 * @return
	 * @author zhangkai
	 */
	boolean setBack(String prodHeavyEnterIds);
	
	/**
	 * 保函
	 * @param containerNo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author zhangkai
	 */
	PagedList<GuaranteeOuput> guarantees(String containerNo, Integer pageNum, Integer pageSize);
}
