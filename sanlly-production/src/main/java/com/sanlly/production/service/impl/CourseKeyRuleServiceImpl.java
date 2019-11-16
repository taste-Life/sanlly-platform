package com.sanlly.production.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.production.dao.CourseKeyRuleMapper;
import com.sanlly.production.entity.CourseKeyRule;
import com.sanlly.production.entity.CourseKeyRuleExample;
import com.sanlly.production.service.CourseKeyRuleService;

@Service
public class CourseKeyRuleServiceImpl extends BaseServiceImpl implements CourseKeyRuleService {

	@Autowired
	private CourseKeyRuleMapper keyDao;

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public String generateCourseKey(String containerNo) {
		CourseKeyRuleExample example = new CourseKeyRuleExample();
		example.createCriteria().andContainerNoEqualTo(containerNo);
		List<CourseKeyRule> list = keyDao.selectByExample(example);
		Integer newInt = 1;
		if (list.size() > 0) {
			newInt = list.get(0).getCourseValue();
			if (newInt == null) {
				newInt = 1;
			}
			CourseKeyRule record = new CourseKeyRule();
			record.setCourseValue(newInt + 1);
			keyDao.updateByExampleSelective(record, example);
		} else {
			CourseKeyRule record = new CourseKeyRule();
			record.setContainerNo(containerNo);
			record.setCourseValue(newInt + 1);
			record.setCourseEntryValue(1);
			record.setMaintenanceValue(1);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			keyDao.insert(record);
		}

		return containerNo + paddingLeft(String.valueOf(newInt.intValue()), 5, "0");
	}

	private String paddingLeft(String source, int length, String character) {
		while (source.length() < length) {
			source = character + source;
		}
		return source;
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public String generateMaintenanceId(String containerNo) {
		CourseKeyRuleExample example = new CourseKeyRuleExample();
		example.createCriteria().andContainerNoEqualTo(containerNo);
		List<CourseKeyRule> list = keyDao.selectByExample(example);
		Integer newInt = 1;
		if (list.size() > 0) {
			newInt = list.get(0).getMaintenanceValue();
			if (newInt == null) {
				newInt = 1;
			}
			CourseKeyRule record = list.get(0);
			record.setMaintenanceValue(newInt + 1);
			keyDao.updateByPrimaryKey(record);
		} else {
			CourseKeyRule record = new CourseKeyRule();
			record.setContainerNo(containerNo);
			record.setCourseValue(1);
			record.setCourseEntryValue(1);
			record.setMaintenanceValue(newInt + 1);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			keyDao.insert(record);
		}
		return containerNo + "CM" + paddingLeft(String.valueOf(newInt.intValue()), 5, "0");
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public String generateCourseEntryKey(String containerNo) {
		CourseKeyRuleExample example = new CourseKeyRuleExample();
		example.createCriteria().andContainerNoEqualTo(containerNo);
		List<CourseKeyRule> list = keyDao.selectByExample(example);
		Integer newInt = 1;
		if (list.size() > 0) {
			newInt = list.get(0).getCourseEntryValue();
			if (newInt == null) {
				newInt = 1;
			}
			CourseKeyRule record = new CourseKeyRule();
			record.setCourseEntryValue(newInt + 1);
			keyDao.updateByExampleSelective(record, example);
		} else {
			CourseKeyRule record = new CourseKeyRule();
			record.setContainerNo(containerNo);
			record.setCourseValue(1);
			record.setCourseEntryValue(newInt + 1);
			record.setMaintenanceValue(1);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			keyDao.insert(record);
		}
		return containerNo + "CE" + paddingLeft(String.valueOf(newInt.intValue()), 5, "0");
	}

	@Override
	public String generateContainerId(String containerNo) {
		String randomStr = UUID.randomUUID().toString().replace("-", "");
		if (randomStr.length() > 16) {
			randomStr = randomStr.substring(0, 17);
		}
		String mills = String.valueOf(new Date().getTime());
		if (mills.length() > 3) {
			mills = mills.substring(mills.length() - 3);
		}

		return randomStr + mills;
	}

}
