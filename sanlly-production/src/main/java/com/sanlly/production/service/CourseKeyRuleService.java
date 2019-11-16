package com.sanlly.production.service;

public interface CourseKeyRuleService {

	String generateCourseKey(String containerNo);
	
	String generateCourseEntryKey(String containerNo);
	
	String generateContainerId(String containerNo);
	
	String generateMaintenanceId(String containerNo);
		
}
