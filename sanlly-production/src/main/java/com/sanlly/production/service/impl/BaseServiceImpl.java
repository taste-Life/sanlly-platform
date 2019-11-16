package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.SqlMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;

@Service
public class BaseServiceImpl {
	
	@Autowired
	private YardMapper yardDao;
	
	@Autowired
	protected SqlMapper sqlDao;
	
	
	/**
	 * 获取当前登陆用户ID
	 * @return
	 */
	protected  Integer getCurrentUserId(){
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if(requestAttributes==null) {
			return null;
		}
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("userId");
		if(StringUtils.isNotEmpty(value)) {
			return Integer.parseInt(value);
		}
		return null;
	}
	
	/**
	 * 获取当前登陆用户账号
	 * @return
	 */
	protected  String getCurrentUserAccount(){
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("loginAccount");
		return value;
	}
	
	/**
	 * 当前登陆用户是否是超级管理员
	 * @return true是超级管理员，false不是超级管理员
	 */
	protected Boolean isUserAdmin() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("isAdmin");
		if(StringUtils.isNotEmpty(value)) {
			return Boolean.parseBoolean(value);
		}
		return false;
	}
	
	protected  String[] getUserAuthList(){
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("auth");
		if(StringUtils.isNotEmpty(value)) {
			return value.split("\\|");
		}
		return new String[0];
	}
	
	/**
	 * 判断当前登陆用户是否包含所有指定的权限
	 * @param permissions 权限code数组
	 * @return permissions全部包含返回true
	 */
	protected Boolean hasPermissionMust(String... permissions) {
		String[] auth=getUserAuthList();
		if(auth!=null) {
			List<String> authList=Arrays.asList(auth);
			return Arrays.asList(permissions).stream().allMatch(a->authList.contains(a));
		}
		return false;
	}
	
	/**
	 * 判断当前登陆用户是否满足指定的权限中的一种
	 * @param permissions 权限code数组
	 * @return permissions中至少拥有一个返回true
	 */
	protected Boolean hasPermissionOr(String... permissions) {
		String[] auth=getUserAuthList();
		if(auth!=null) {
			List<String> permissionList=Arrays.asList(auth);
			return Arrays.asList(permissions).stream().anyMatch(a->permissionList.contains(a));
		}
		return false;
	}
	
	/**
	 * 当前用户登陆时，是否有总部权限
	 * @return
	 */
	protected Boolean isHeadCompanyLogin() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("isHeadCompany");
		if(StringUtils.isNotEmpty(value)) {
			return Boolean.parseBoolean(value);
		}
		return false;
	}
	
	/**
	 * 获取用户登陆选择的公司Key
	 * @return
	 */
	protected String getCurrentCompanyKey() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("Lang");
		if(StringUtils.isNotEmpty(value)) {
			String[] arr=value.split(";");
			if(arr.length>1) {
				return arr[1];
			}
		}
		return null;
	}
	
	/**
	 * 获取用户登陆选择的场站Key
	 * @return
	 */
	protected String getCurrentYardKey() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("Lang");
		if(StringUtils.isNotEmpty(value)) {
			String[] arr=value.split(";");
			if(arr.length>2) {
				return arr[2];
			}
		}
		return null;
	}
	
	/**
	 * 获取用户权限范围内的场站key
	 * @return
	 */
	protected String[] getPermittedYardKeys() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("yard");
		if(StringUtils.isNotEmpty(value)) {
			return value.split("\\|");
		}
		return new String[0];
	}
	
	/**
	 * 获取用户权限范围内的场站列表
	 * @return
	 */
	protected List<Yard> getPermittedYards() {
		String[] yardKeys=getPermittedYardKeys();
		if(yardKeys.length>0) {
			YardExample yardExample=new YardExample();
			yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyIn(Arrays.asList(yardKeys));
			return yardDao.selectByExample(yardExample);
		}
		return new ArrayList<>();
	}
	
	/**
	 * 中文请求
	 * @return
	 */
	protected Boolean isChineseRequest() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if(requestAttributes==null) {
			return true;
		}
		HttpServletRequest request = requestAttributes.getRequest();
		String value=request.getHeader("Lang");
		if(StringUtils.isNotEmpty(value)) {
			String[] arr=value.split(";");
			if(arr[0].equals("en") || arr[0].toLowerCase().equals("en-us")) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 英文请求
	 * @return
	 */
	protected Boolean isEnglishRequest() {
		return !isChineseRequest();
	}
	
}
