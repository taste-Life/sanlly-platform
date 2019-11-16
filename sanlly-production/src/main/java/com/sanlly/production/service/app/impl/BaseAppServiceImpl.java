package com.sanlly.production.service.app.impl;

import org.apache.commons.lang.StringUtils;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.OkNotOkEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.service.impl.BaseServiceImpl;

/**
 * 基础app接口
 * @author RexSheng
 * 2019年8月27日 下午1:45:28
 */
public class BaseAppServiceImpl extends BaseServiceImpl{

	/**
	 * 获取pti状态
	 * 好箱体 + 好机组 + 非“待保修”箱；
		* 好箱体 + 坏机组已完工 + 非“待保修”箱；
		* 坏箱体已完工 + 好机组 + 非“待保修”箱；
		* 坏箱体已完工 + 坏机组已完工 + 非“待保修”箱；
		* 好箱体 + 坏机组不修转好 + 非“待保修”箱；
		* 坏箱体不修转好 + 好机组 + 非“待保修”箱；
		* 坏箱体不修转好 + 坏机组不修转好 + 非“待保修”箱。
	 * @param course
	 * @param unitCourse
	 * @param maintenance
	 * @return
	 */
	protected OkNotOkEnum getPtiState(Course course,UnitCourse unitCourse,Maintenance maintenance) {
		Boolean isOk=false;
		if(StringUtils.isNotEmpty(course.getContainerCondition()) &&
				StringUtils.isNotEmpty(unitCourse.getUnitState()) &&
				StringUtils.isNotEmpty(maintenance.getIsMaintenance())) {
			//好箱体 + 好机组 + 非“待保修”箱；
			if(course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode()) &&
					unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			//好箱体 + 坏机组已完工 + 非“待保修”箱；
			else if(course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode()) &&
					unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode()) && 
					StringUtils.isNotEmpty(unitCourse.getReferralState()) &&
					unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			//坏箱体已完工 + 好机组 + 非“待保修”箱；
			else if(course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode()) &&
					StringUtils.isNotEmpty(course.getReferralState()) &&
					course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode()) && 
					unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			//坏箱体已完工 + 坏机组已完工 + 非“待保修”箱；
			else if(course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode()) &&
					StringUtils.isNotEmpty(course.getReferralState()) &&
					course.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode()) && 
					unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode()) && 
					StringUtils.isNotEmpty(unitCourse.getReferralState()) &&
					unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			//好箱体 + 坏机组不修转好 + 非“待保修”箱；
			else if(course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode()) &&
					unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode()) && 
					StringUtils.isNotEmpty(unitCourse.getUseReplyState()) &&
					unitCourse.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			//坏箱体不修转好 + 好机组 + 非“待保修”箱；
			else if(course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode()) &&
					StringUtils.isNotEmpty(unitCourse.getUseReplyState()) &&
					unitCourse.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode()) && 
					unitCourse.getUnitState().equals(UnitStateEnum.GOOD.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			//坏箱体不修转好 + 坏机组不修转好 + 非“待保修”箱。
			else if(course.getContainerCondition().equals(ContainerStateEnum.BAD.getCode()) &&
					StringUtils.isNotEmpty(unitCourse.getUseReplyState()) &&
					unitCourse.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode()) && 
					unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode()) && 
					StringUtils.isNotEmpty(unitCourse.getUseReplyState()) &&
					unitCourse.getUseReplyState().equals(ReplyStateEnum.TURNGOOD.getCode()) && 
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isOk=true;
			}
			
		}
		if(isOk) {
			return OkNotOkEnum.OK;
		}
		else {
			return OkNotOkEnum.NOTOK;
		}
		
	}
	
	/**
	 * 判断是否xx箱
	 * 	好箱体 + 坏机组已完工未批复（待估价，待批复） + 非“待保修”箱；
	* 坏箱体已完工未批复 + 好机组 + 非“待保修”箱；
	* 坏箱体已完工未批复 + 坏机组已完工未批复 + 非“待保修”箱；
	 * @param course
	 * @param unitCourse
	 * @param maintenance
	 * @return
	 */
	protected Boolean getXxState(Course course,UnitCourse unitCourse,Maintenance maintenance) {
		Boolean isXx=false;
		if(StringUtils.isNotEmpty(course.getContainerCondition()) &&
				StringUtils.isNotEmpty(unitCourse.getUnitState()) &&
				StringUtils.isNotEmpty(maintenance.getIsMaintenance())) {
			//好箱体 + 坏机组已完工未批复（待估价，待批复） + 非“待保修”箱；
			if(course.getContainerCondition().equals(ContainerStateEnum.GOOD.getCode()) &&
					unitCourse.getUnitState().equals(UnitStateEnum.BAD.getCode()) && 
					StringUtils.isNotEmpty(unitCourse.getReferralState()) &&
					unitCourse.getReferralState().equals(ReferralStateEnum.COMPLETED.getCode()) && 
					(unitCourse.getUseReplyState().equals(ReplyStateEnum.UNDO.getCode()) || unitCourse.getUseReplyState().equals(ReplyStateEnum.UNREPLY.getCode())) &&
					maintenance.getIsMaintenance().equals(CommonEnum.NO.getCode())) {
				isXx=true;
			}
			else {
				//。。。
			}
		}
		
		return isXx;
	}
}
