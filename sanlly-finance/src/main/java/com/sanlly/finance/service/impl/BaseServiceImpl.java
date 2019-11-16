package com.sanlly.finance.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sanlly.common.enums.FinanceBillTypeEnum;
import com.sanlly.common.enums.FinanceBudgetTypeEnum;
import com.sanlly.finance.dao.BaseBillTypeExtMapper;
import com.sanlly.finance.dao.BaseBillTypeMapper;
import com.sanlly.finance.entity.BaseBillType;
import com.sanlly.finance.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService {
	
	@Autowired
	private BaseBillTypeExtMapper billTypeExtdao;
	
	@Autowired
	private BaseBillTypeMapper billTypedao;
	
	/**
	 * 获取当前登陆用户ID
	 * @return
	 */
	protected  Integer getCurrentUserId(){
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
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
		return null;
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
	 * 中文请求
	 * @return
	 */
	protected Boolean isChineseRequest() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
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

	/**
	 * 根据账单类型 langkey获取相应的账单编号
	* @Description: TODO 
	* @param billTypeEnum  账单类型枚举
	* @param inoutEnum  收支类型枚举
	* @param companyCode  公司代码
	* @return String  账单号
	* @throws 账单标记（1）+ 账单类型（2）+ 收入/成本标记（1）+ 公司代码（4）+ 账单号递增排序（7）+ 调账版本（3） 
	* 最后的调账版本 在外部拼接 没有就不拼接
	 */
	@Override
	@Transactional
	public String getBillCode(FinanceBillTypeEnum billTypeEnum,FinanceBudgetTypeEnum inoutEnum,String companyCode) {
		// TODO Auto-generated method stub
		// 获取行锁 注：需要添加@Transactional注解才能生效，整个SQL结束时生效
		BaseBillType billType = billTypeExtdao.selectByKeyForUpdate(billTypeEnum.getCode());
		if (billType != null) {
			//构建自增
			Integer number=Integer.parseInt(billType.getBillIdentityCode());
			String identityCode=String.format("%07d", number+1);
			//收入是I  支出是  O
			String inOutStr=inoutEnum.getCode()==FinanceBudgetTypeEnum.INCOME.getCode() ? "I":"O";
			// 编码加一
			billType.setBillIdentityCode(identityCode);
			billType.setUpdateTime(new Date());
			billTypedao.updateByPrimaryKey(billType);
			//开始拼接账单号
			//账单标记（1）+ 账单类型（2）+ 收入/成本标记（1）+ 公司代码（4）+ 账单号递增排序（7）+ 调账版本（3） 在外部拼接
			String billCode=billType.getBillPrefix()+billType.getBillCode()+inOutStr+companyCode+identityCode;
			// 返回自动生成编码
			return billCode;
		}
		return null;
	}

	
}
