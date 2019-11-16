package com.sanlly.production.service;

import com.sanlly.production.models.input.pti.PtiAddInput;
import com.sanlly.production.models.output.pti.PtiDetailOutput;

/**
 * pti接口
 * @author RexSheng
 * 2019年8月19日 上午10:47:49
 */
public interface PtiService {
	
	/**
	 * 根据进场id获取pti信息
	 * @param containerNo
	 * @return
	 */
	PtiDetailOutput getPtiInfoByCourseId(String courseId);
	
	/**
	 * 根据箱号获取pti信息
	 * @param containerNo
	 * @return
	 */
	PtiDetailOutput getPtiInfoByContainerNo(String containerNo);
	
	/**
	 * 修改pti信息
	 * @param input
	 */
	void updatePtiInfo(PtiAddInput input);
	
	/**
	 * 将pti结果翻译出来
	 * @param input
	 * @return
	 */
	Object lang(PtiDetailOutput input);
}
