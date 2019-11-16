package com.sanlly.warehouse.service.impl;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.DeptOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ProdDeptOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.dao.WareAssetApplyMapper;
import com.sanlly.warehouse.dao.WareAssetLogMapper;
import com.sanlly.warehouse.dao.WareAssetManagementMapper;
import com.sanlly.warehouse.dao.WareAssetMapper;
import com.sanlly.warehouse.dao.WareAssetTypeMapper;
import com.sanlly.warehouse.dao.WareAssetTypeRelationMapper;
import com.sanlly.warehouse.entity.WareAsset;
import com.sanlly.warehouse.entity.WareAssetApply;
import com.sanlly.warehouse.entity.WareAssetApplyExample;
import com.sanlly.warehouse.entity.WareAssetExample;
import com.sanlly.warehouse.entity.WareAssetLog;
import com.sanlly.warehouse.entity.WareAssetLogExample;
import com.sanlly.warehouse.entity.WareAssetManagement;
import com.sanlly.warehouse.entity.WareAssetManagementExample;
import com.sanlly.warehouse.entity.WareAssetManagementExample.Criteria;
import com.sanlly.warehouse.enums.AssetApplyTypeEnum;
import com.sanlly.warehouse.enums.AssetUseStatusEnum;
import com.sanlly.warehouse.enums.IsValidEnum;
import com.sanlly.warehouse.entity.WareAssetType;
import com.sanlly.warehouse.entity.WareAssetTypeExample;
import com.sanlly.warehouse.entity.WareAssetTypeRelation;
import com.sanlly.warehouse.entity.WareAssetTypeRelationExample;
import com.sanlly.warehouse.entity.WareLaborInsurance;
import com.sanlly.warehouse.entity.WareLaborInsuranceDetail;
import com.sanlly.warehouse.entity.WareLaborInsuranceExample;
import com.sanlly.warehouse.entity.WareSellProgramme;
import com.sanlly.warehouse.entity.WareSellProgrammeExample;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetails;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample;
import com.sanlly.warehouse.models.input.asset.AddAssetApplyInput;
import com.sanlly.warehouse.models.input.asset.AddAssetInput;
import com.sanlly.warehouse.models.input.asset.EditAssetInput;
import com.sanlly.warehouse.models.input.asset.SearchAssetApplyInput;
import com.sanlly.warehouse.models.input.asset.SearchAssetInput;
import com.sanlly.warehouse.models.input.asset.SearchAssetLogInput;
import com.sanlly.warehouse.models.input.asset.assetInfo.AddAssetInfoInput;
import com.sanlly.warehouse.models.input.asset.assetInfo.EditAssetInfoInput;
import com.sanlly.warehouse.models.input.asset.assetInfo.SearchAssetInfoInput;
import com.sanlly.warehouse.models.input.asset.assetType.AddAssetTypeInput;
import com.sanlly.warehouse.models.input.asset.assetType.EditAssetTypeInput;
import com.sanlly.warehouse.models.input.asset.assetType.SearchAssetTypeInput;
import com.sanlly.warehouse.models.output.asset.AssetApplyOutput;
import com.sanlly.warehouse.models.output.asset.AssetInfoOutput;
import com.sanlly.warehouse.models.output.asset.AssetLogOutput;
import com.sanlly.warehouse.models.output.asset.AssetOutput;
import com.sanlly.warehouse.models.output.asset.AssetTypeOutput;
import com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme.LaborInsuranceSchemeDetailOutput;
import com.sanlly.warehouse.service.AssetService;
import com.sanlly.warehouse.service.BillTypeService;
/**
 * 资产管理接口实现类
 * 
 * @author zhh
 *
 */
@Service
public class AssetServiceImpl extends BaseServiceImpl implements AssetService{
	
	@Autowired
	private WareAssetManagementMapper assetManageDao;
	
	@Autowired
	private WareAssetTypeMapper assetTypeDao;
	
	@Autowired
	private WareAssetMapper assetDao;
	
	@Autowired
	private WareAssetTypeRelationMapper relationDao;
	
	@Autowired
	private WareAssetApplyMapper applyDao;
	
	@Autowired
	private WareAssetLogMapper logDao;
	
	private String assetTypeTable = "ware_asset_type";
	private String assetTable = "ware_asset";
	
	@Autowired
	private BillTypeService billTypeService;
	
	@Override
	public PagedList<AssetOutput> getAssetPageList(SearchAssetInput input) {
		WareAssetManagementExample example = new WareAssetManagementExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//筛选条件
		if(StringUtils.isNotEmpty(input.getCompany())){
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if(StringUtils.isNotEmpty(input.getDepartments())){
			criteria.andDepartmentsEqualTo(input.getDepartments());
		}
		if(StringUtils.isNotEmpty(input.getAssetName())){
		    criteria.andAssetNameLike("%"+input.getAssetName()+"%");
		}
		if(StringUtils.isNotEmpty(input.getAssetNo())){
			criteria.andAssetNoLike("%"+input.getAssetNo()+"%");
		}
		if(StringUtils.isNotEmpty(input.getOutAssetType())){
			criteria.andOutAssetTypeEqualTo(input.getOutAssetType());
		}
		if(StringUtils.isNotEmpty(input.getUseStatus())){
			criteria.andUseStatusEqualTo(input.getUseStatus());
		}
		if(input.getLiablePerson()!=null){
			criteria.andLiablePersonEqualTo(input.getLiablePerson());
			criteria.andUseStatusNotEqualTo(AssetUseStatusEnum.SCRAP.getCode());
		}
		if(input.getPurchaseDate()!=null){
			Calendar c = Calendar.getInstance();
			c.setTime(input.getPurchaseDate());
			c.add(Calendar.DATE, 1);
			criteria.andPurchaseDateBetween(input.getPurchaseDate(), c.getTime());
		}
		//查询页数
        Integer totalItemCount =(int) assetManageDao.countByExample(example);
        PagedList<AssetOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
		List<WareAssetManagement> assetManagements = assetManageDao.selectByExample(example);
		//返回数据
		List<AssetOutput> dataList = new ArrayList<>();
		for(WareAssetManagement assetManagement : assetManagements) {
			//封装数据
			AssetOutput output = new AssetOutput();
			BeanUtils.copyProperties(assetManagement, output);
			output.setAssetNameLangLang(assetManagement.getAsset());
			output.setCompanyNameLang(assetManagement.getCompany());
			output.setDepartmentsNameLang(assetManagement.getDepartments());
			output.setLiablePersonName(getUserNameByUserId(assetManagement.getLiablePerson()));
			output.setOutAssetTypeNameLang(assetManagement.getOutAssetType());
			output.setYardNameLang(assetManagement.getYard());
			output.setUseStatusNameLang(assetManagement.getUseStatus());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(assetManagement.getPurchaseDate()!=null){
				output.setPurchaseDate(sdf.format(assetManagement.getPurchaseDate()));
			}
			if(assetManagement.getScrapDate()!=null){
				output.setScrapDate(sdf.format(assetManagement.getScrapDate()));
			}
			//查询使用人
			WareAssetApplyExample applyExample = new WareAssetApplyExample();
			applyExample.createCriteria().andAssetManageIdEqualTo(assetManagement.getWareAssetManagementId()).andApplyTypeNotEqualTo(AssetApplyTypeEnum.SCRAP.getCode()).andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
			applyExample.setOrderByClause("update_time desc");
			List<WareAssetApply> applies = applyDao.selectByExample(applyExample);
			if(applies!=null&&applies.size()>0){
				WareAssetApply apply = applies.get(0);
				if(apply.getApplyType().equals(AssetApplyTypeEnum.RECEIVE.getCode())){
					output.setUser(apply.getApplyUser());
					output.setUserName(getUserNameByUserId(apply.getApplyUser()));
				}else{
					output.setUser(apply.getOldUser());
					output.setUserName(getUserNameByUserId(apply.getOldUser()));
				}
				//output.setApplyDate(sdf.format(apply.getApplyDate()));
				output.setApplyDate(sdf.format(apply.getUpdateTime()));
			}
			
			dataList.add(output);
		}
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
     * 新增资产管理
     * 
     * @return
     */
	@Transactional
	@Override
	public void addAsset(AddAssetInput input) {
		// TODO Auto-generated method stub
		WareAssetManagement assetManagement = new WareAssetManagement();
		BeanUtils.copyProperties(input, assetManagement);
		assetManagement.setCreateTime(new Date());
		assetManagement.setCreateUser(getCurrentUserId());
		assetManagement.setIsDel(PlatformConstants.ISDEL_NO);
		assetManageDao.insertSelective(assetManagement);
		
		//添加日志记录
		WareAssetLog log = new WareAssetLog();
		log.setOperator(getCurrentUserId());
		log.setCreateTime(new Date());
		log.setCreateUser(getCurrentUserId());
		log.setAsset(input.getAsset());
		log.setAssetName(input.getAssetName());
		log.setAssetNo(input.getAssetNo());
		log.setIsDel(PlatformConstants.ISDEL_NO);
		log.setOperateType(AssetApplyTypeEnum.ADD.getCode());
		log.setOperateTime(new Date());
		log.setAssetManageId(assetManagement.getWareAssetManagementId());
		//操作内容： 操作类型+新增资产内容
		String operateContent = "";
		//操作类型
		String operateType = AssetApplyTypeEnum.ADD.getMessage();
		//新增内容
		//资产名称
		String asset = input.getAssetName();
		//所属部门
		String department = input.getDepartmentsName();
		//责任人姓名
		String liablePerson = getUserNameByUserId(input.getLiablePerson());
		
		operateContent = operateType+"： "+asset+"，"+"责任人为【"+liablePerson+"，"+department+"】";
		
		log.setOperateContent(operateContent);
		logDao.insertSelective(log);
	}

	/**
     * 修改资产管理
     * 
     * @return
     */
	@Transactional
	@Override
	public void editAsset(EditAssetInput input) {
		// TODO Auto-generated method stub
		WareAssetManagementExample example = new WareAssetManagementExample();
		example.createCriteria().andWareAssetManagementIdEqualTo(input.getWareAssetManagementId());
		WareAssetManagement assetManagement = new WareAssetManagement();
		BeanUtils.copyProperties(input, assetManagement);
		assetManagement.setUpdateTime(new Date());
		assetManagement.setUpdateUser(getCurrentUserId());
		
		
		//添加日志记录
		WareAssetLog log = new WareAssetLog();
		log.setOperator(getCurrentUserId());
		log.setCreateTime(new Date());
		log.setCreateUser(getCurrentUserId());
		log.setAsset(input.getAsset());
		log.setAssetName(input.getAssetName());
		log.setAssetNo(input.getAssetNo());
		log.setIsDel(PlatformConstants.ISDEL_NO);
		log.setOperateType(AssetApplyTypeEnum.UPDATE.getCode());
		log.setOperateTime(new Date());
		log.setAssetManageId(assetManagement.getWareAssetManagementId());
		//操作内容： 操作类型+修改资产内容
		String operateContent = "";
		//操作类型
		String operateType = AssetApplyTypeEnum.UPDATE.getMessage();
		//修改内容
		String content = "";
		
		//查询修改内容
		List<WareAssetManagement> managements = assetManageDao.selectByExample(example);
		WareAssetManagement management = managements.get(0);
		if(StringUtils.isNotEmpty(input.getPlace())){
			if(StringUtils.isEmpty(management.getPlace())){
				content+="使用地点由【】更改为【"+input.getPlace()+"】；";
			}else if(!management.getPlace().equals(input.getPlace())){
				content+="使用地点由【"+management.getPlace()+"】更改为【"+input.getPlace()+"】；";
			}
		}
		if(StringUtils.isNotEmpty(input.getAssetNo())){
			if(StringUtils.isEmpty(management.getAssetNo())){
				content+="资产编号由【】更改为【"+input.getAssetNo()+"】；";
			}else if(!management.getAssetNo().equals(input.getAssetNo())){
				content+="资产编号由【"+management.getAssetNo()+"】更改为【"+input.getAssetNo()+"】；";
			}
		}
		if(StringUtils.isNotEmpty(input.getSerial())){
			if(StringUtils.isEmpty(management.getSerial())){
				content+="序列号由【】更改为【"+input.getSerial()+"】；";
			}else if(!management.getSerial().equals(input.getSerial())){
				content+="序列号由【"+management.getSerial()+"】更改为【"+input.getSerial()+"】；";
			}
		}
		
		if(!management.getModel().equals(input.getModel())){
			content+="型号由【"+management.getModel()+"】更改为【"+input.getModel()+"】；";
		}
		
		if(!management.getManufacturer().equals(input.getManufacturer())){
			content+="生产厂商由【"+management.getManufacturer()+"】更改为【"+input.getManufacturer()+"】；";
		}
		
		if(!management.getNum().equals(input.getNum())){
			content+="数量由【"+management.getNum()+"】更改为【"+input.getNum()+"】；";
		}
		
		if(StringUtils.isNotEmpty(input.getWindowsModel())){
			if(StringUtils.isEmpty(management.getWindowsModel())){
				content+="Windows版本由【】更改为【"+input.getWindowsModel()+"】；";
			}else if(!management.getWindowsModel().equals(input.getWindowsModel())){
				content+="Windows版本由【"+management.getWindowsModel()+"】更改为【"+input.getWindowsModel()+"】；";
			}
		}
		if(StringUtils.isNotEmpty(input.getComputerName())){
			if(StringUtils.isEmpty(management.getComputerName())){
				content+="计算机名称由【】更改为【"+input.getComputerName()+"】；";
			}else if(!management.getComputerName().equals(input.getComputerName())){
				content+="计算机名称由【"+management.getComputerName()+"】更改为【"+input.getComputerName()+"】；";
			}
		}
		if(StringUtils.isNotEmpty(input.getIpAddr())){
			if(StringUtils.isEmpty(management.getIpAddr())){
				content+="IP地址由【】更改为【"+input.getIpAddr()+"】；";
			}else if(!management.getIpAddr().equals(input.getIpAddr())){
				content+="IP地址由【"+management.getIpAddr()+"】更改为【"+input.getIpAddr()+"】；";
			}
		}
		DecimalFormat df = new DecimalFormat("0.00");  
	    String str1 = df.format(input.getPurchasePrice());
	    String str2 = df.format(management.getPurchasePrice()); 
		if(!str1.equals(str2)){
			content+="购买价格由【"+str2+"】更改为【"+str1+"】；";
		}
		if(!management.getPurchaseDate().equals(input.getPurchaseDate())){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			content+="购买日期由【"+sdf.format(management.getPurchaseDate())+"】更改为【"+sdf.format(input.getPurchaseDate())+"】；";
		}
		if(StringUtils.isNotEmpty(input.getRemark())){
			if(StringUtils.isEmpty(management.getRemark())){
				content+="备注由【】更改为【"+input.getRemark()+"】；";
			}else if(!management.getRemark().equals(input.getRemark())){
				content+="备注由【"+management.getRemark()+"】更改为【"+input.getRemark()+"】；";
			}
		}
		
		operateContent = operateType+"： "+content;
		log.setOperateContent(operateContent);
		logDao.insertSelective(log);
		assetManageDao.updateByExampleSelective(assetManagement, example);
	}

	/**
     * 资产类别列表
     * 
     * @return
     */
	@Override
	public List<AssetTypeOutput> getAssetTypeList() {
		// TODO Auto-generated method stub
		List<AssetTypeOutput> dataList = new ArrayList<>();
		WareAssetTypeExample example = new WareAssetTypeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareAssetType> assetTypes = assetTypeDao.selectByExample(example);
		for(WareAssetType assetType : assetTypes){
			AssetTypeOutput output = new AssetTypeOutput();
			BeanUtils.copyProperties(assetType, output);
			output.setAssetTypeLangLang(assetType.getKey());
			output.setKey(assetType.getKey());
			output.setWareAssetTypeId(assetType.getWareAssetTypeId());
			dataList.add(output);
		}
		return dataList;
	}

	/**
     * 根据员工id获得该员工对应的未报废的资产列表
     * 
     * @return
     */
	@Override
	public List<AssetOutput> getAssetListByUser(Integer userId) {
		// TODO Auto-generated method stub
		WareAssetManagementExample example = new WareAssetManagementExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andLiablePersonEqualTo(userId);
		List<WareAssetManagement> assetManagements = assetManageDao.selectByExample(example);
		//返回数据
		List<AssetOutput> dataList = new ArrayList<>();
		for(WareAssetManagement assetManagement : assetManagements) {
			//封装数据
			AssetOutput output = new AssetOutput();
			BeanUtils.copyProperties(assetManagement, output);
			output.setCompanyNameLang(assetManagement.getCompany());
			output.setDepartmentsNameLang(assetManagement.getDepartments());
			output.setLiablePersonName(getUserNameByUserId(assetManagement.getLiablePerson()));
			output.setOutAssetTypeNameLang(assetManagement.getOutAssetType());
			output.setYardNameLang(assetManagement.getYard());
			output.setUseStatusNameLang(assetManagement.getUseStatus());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(assetManagement.getPurchaseDate()!=null){
				output.setPurchaseDate(sdf.format(assetManagement.getPurchaseDate()));
			}
			if(assetManagement.getScrapDate()!=null){
				output.setScrapDate(sdf.format(assetManagement.getScrapDate()));
			}
			dataList.add(output);
		}
		return dataList;
	}

	/**
     * 资产类别分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<AssetTypeOutput> getAssetTypePageList(SearchAssetTypeInput input) {
		WareAssetTypeExample example = new WareAssetTypeExample();
		WareAssetTypeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//筛选条件
		if(StringUtils.isNotEmpty(input.getAssetTypeName())){
			if(isChineseRequest()){
				criteria.andAssetTypeNameLike("%"+input.getAssetTypeName()+"%");
			}else if(isEnglishRequest()){
				criteria.andAssetTypeNameEnLike("%"+input.getAssetTypeName()+"%");
			}
		}
		
		//查询页数
        Integer totalItemCount =(int) assetTypeDao.countByExample(example);
        PagedList<AssetTypeOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
		List<WareAssetType> assetTypes = assetTypeDao.selectByExample(example);
		//返回数据
		List<AssetTypeOutput> dataList = new ArrayList<>();
		for(WareAssetType assetType : assetTypes) {
			//封装数据
			AssetTypeOutput output = new AssetTypeOutput();
			BeanUtils.copyProperties(assetType, output);
			output.setAssetTypeLangLang(assetType.getKey());
			dataList.add(output);
		}
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
     * 新增资产类别
     * @param input
     * @return
     */
	@Override
	public void addAssetType(AddAssetTypeInput input) {
		// TODO Auto-generated method stub
		WareAssetTypeExample example = new WareAssetTypeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAssetTypeNameEqualTo(input.getAssetTypeName());
		List<WareAssetType> wList = assetTypeDao.selectByExample(example);
		if(wList!=null&&wList.size()>0){
			//若存在，则抛出异常
			throw new RuntimeException("isExist");
		}
		Result<String> result = productionService.getKey(assetTypeTable);
		if (result==null||StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareAssetType wareAssetType = new WareAssetType();
		BeanUtils.copyProperties(input, wareAssetType);
		wareAssetType.setKey(result.getData());
		wareAssetType.setCreateTime(new Date());
		wareAssetType.setCreateUser(getCurrentUserId());
		wareAssetType.setIsDel(PlatformConstants.ISDEL_NO);
		assetTypeDao.insertSelective(wareAssetType);
	}

	/**
     * 修改资产类别
     * @param input
     * @return
     */
	@Override
	public void editAssetType(EditAssetTypeInput input) {
		// TODO Auto-generated method stub
		WareAssetTypeExample example = new WareAssetTypeExample();
		example.createCriteria().andKeyEqualTo(input.getKey());
		List<WareAssetType> types = assetTypeDao.selectByExample(example);
		if(types!=null&&types.size()>0){
			WareAssetType type = types.get(0);
			if(!type.getAssetTypeName().equals(input.getAssetTypeName())){
				//若存在，则抛出异常
				throw new RuntimeException("isExist");
			}
			
		}
		WareAssetType wareAssetType = new WareAssetType();
		BeanUtils.copyProperties(input, wareAssetType);
		wareAssetType.setUpdateTime(new Date());
		wareAssetType.setUpdateUser(getCurrentUserId());
		assetTypeDao.updateByExampleSelective(wareAssetType, example);
	}

	/**
     * 批量删除资产类别
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void delAssetType(String[] keys) {
		// TODO Auto-generated method stub
		WareAssetTypeExample example = new WareAssetTypeExample();
		example.createCriteria().andKeyIn(Arrays.asList(keys));
		WareAssetType wareAssetType = new WareAssetType();
		wareAssetType.setIsDel(PlatformConstants.ISDEL_YES);
		wareAssetType.setUpdateTime(new Date());
		wareAssetType.setUpdateUser(getCurrentUserId());
		assetTypeDao.updateByExampleSelective(wareAssetType, example);
		
		//清除资产关系
		WareAssetTypeRelationExample relationExample = new WareAssetTypeRelationExample();
		relationExample.createCriteria().andAssetTypeIn(Arrays.asList(keys));
		WareAssetTypeRelation relation = new WareAssetTypeRelation();
		relation.setIsDel(PlatformConstants.ISDEL_YES);
		relation.setUpdateTime(new Date());
		relation.setUpdateUser(getCurrentUserId());
		relationDao.updateByExampleSelective(relation, relationExample);
	}

	/**
     * 资产分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<AssetInfoOutput> getAssetInfoPageList(SearchAssetInfoInput input) {
		// TODO Auto-generated method stub
		WareAssetExample example = new WareAssetExample();
		WareAssetExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//筛选条件
		if(StringUtils.isNotEmpty(input.getAssetName())){
			if(isChineseRequest()){
				criteria.andAssetNameLike("%"+input.getAssetName()+"%");
			}else if(isEnglishRequest()){
				criteria.andAssetNameEnLike("%"+input.getAssetName()+"%");
			}
		}
		if(StringUtils.isNotEmpty(input.getAssetType())){
			WareAssetTypeRelationExample typeRelationExample = new WareAssetTypeRelationExample();
			typeRelationExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAssetTypeEqualTo(input.getAssetType());
			List<WareAssetTypeRelation> relations = relationDao.selectByExample(typeRelationExample);
			if(relations!=null&&relations.size()>0){
				List<String> keys = new ArrayList<>();
				for(WareAssetTypeRelation relation : relations){
					keys.add(relation.getAsset());
				}
				criteria.andKeyIn(keys);
			}else{
				return new PagedList<>(input.getPageIndex(), input.getPageSize(), 0);
			}
		}
		//查询页数
        Integer totalItemCount =(int) assetDao.countByExample(example);
        PagedList<AssetInfoOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
		List<WareAsset> assets = assetDao.selectByExample(example);
		//返回数据
		List<AssetInfoOutput> dataList = new ArrayList<>();
		for(WareAsset asset : assets) {
			//封装数据
			AssetInfoOutput output = new AssetInfoOutput();
			BeanUtils.copyProperties(asset, output);
			output.setAssetNameLang(asset.getKey());
			//查询资产类别
			WareAssetTypeRelationExample typeRelationExample = new WareAssetTypeRelationExample();
			typeRelationExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAssetEqualTo(asset.getKey());
			List<WareAssetTypeRelation> relations = relationDao.selectByExample(typeRelationExample);
			if(relations!=null&&relations.size()>0){
				WareAssetTypeRelation relation = new WareAssetTypeRelation();
				relation=relations.get(0);
				output.setAssetType(relation.getAssetType());
				output.setAssetTypeNameLang(relation.getAssetType());
			}
			dataList.add(output);
		}
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
     * 新增资产
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addAssetInfo(AddAssetInfoInput input) {
		// TODO Auto-generated method stub
		WareAssetExample example = new WareAssetExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAssetNameEqualTo(input.getAssetName());
		List<WareAsset> wList = assetDao.selectByExample(example);
		if(wList!=null&&wList.size()>0){
			//若存在，则抛出异常
			throw new RuntimeException("isExist");
		}
		Result<String> result = productionService.getKey(assetTable);
		if (result==null||StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareAsset wareAsset = new WareAsset();
		BeanUtils.copyProperties(input, wareAsset);
		wareAsset.setKey(result.getData());
		wareAsset.setCreateTime(new Date());
		wareAsset.setCreateUser(getCurrentUserId());
		wareAsset.setIsDel(PlatformConstants.ISDEL_NO);
		assetDao.insertSelective(wareAsset);
		
		//添加资产跟资产类别关系
		WareAssetTypeRelation typeRelation = new WareAssetTypeRelation();
		typeRelation.setAsset(result.getData());
		typeRelation.setAssetType(input.getAssetType());
		typeRelation.setIsDel(PlatformConstants.ISDEL_NO);
		typeRelation.setCreateTime(new Date());
		typeRelation.setCreateUser(getCurrentUserId());
		relationDao.insert(typeRelation);
	}

	/**
     * 修改资产
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void editAssetInfo(EditAssetInfoInput input) {
		// TODO Auto-generated method stub
		WareAssetExample example = new WareAssetExample();
		example.createCriteria().andKeyEqualTo(input.getKey());
		List<WareAsset> assets = assetDao.selectByExample(example);
		if(assets!=null&&assets.size()>0){
			WareAsset asset = assets.get(0);
			if(!asset.getAssetName().equals(input.getAssetName())){
				//若存在，则抛出异常
				throw new RuntimeException("isExist");
			}
		}
		
		WareAsset wareAsset = new WareAsset();
		BeanUtils.copyProperties(input, wareAsset);
		wareAsset.setUpdateTime(new Date());
		wareAsset.setUpdateUser(getCurrentUserId());
		assetDao.updateByExampleSelective(wareAsset, example);
		//修改关系
		WareAssetTypeRelationExample relationExample = new WareAssetTypeRelationExample();
		relationExample.createCriteria().andAssetEqualTo(input.getKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareAssetTypeRelation> relations = relationDao.selectByExample(relationExample);
		WareAssetTypeRelation relation = relations.get(0);
		if(!input.getAssetType().equals(relation.getAssetType())){
			//修改
			relation.setAssetType(input.getAssetType());
			relation.setUpdateTime(new Date());
			relation.setUpdateUser(getCurrentUserId());
			relationDao.updateByExampleSelective(relation, relationExample);
		}
	}

	/**
     * 批量删除资产
     * @param input
     * @return
     */
	@Override
	public void delAssetInfo(String[] keys) {
		// TODO Auto-generated method stub
		WareAssetExample example = new WareAssetExample();
		example.createCriteria().andKeyIn(Arrays.asList(keys));
		WareAsset wareAsset = new WareAsset();
		wareAsset.setIsDel(PlatformConstants.ISDEL_YES);
		wareAsset.setUpdateTime(new Date());
		wareAsset.setUpdateUser(getCurrentUserId());
		assetDao.updateByExampleSelective(wareAsset, example);
		
	}

	/**
     * 添加报废申请
     * @param input
     * @return
     */
	@Override
	public void addAssetScape(AddAssetApplyInput input) {
		// TODO Auto-generated method stub
		WareAssetApply wareAssetApply = new WareAssetApply();
		BeanUtils.copyProperties(input, wareAssetApply);
		wareAssetApply.setAssetApplyNo(billTypeService.getBillNumberByKey("LKBILLTYPE000082"));
		wareAssetApply.setCreateTime(new Date());
		wareAssetApply.setCreateUser(getCurrentUserId());
		wareAssetApply.setIsDel(PlatformConstants.ISDEL_NO);
		wareAssetApply.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		wareAssetApply.setApplyType(AssetApplyTypeEnum.SCRAP.getCode());
		wareAssetApply.setApplyDate(new Date());
		applyDao.insertSelective(wareAssetApply);
	}

	/**
     * 添加领用申请
     * @param input
     * @return
     */
	@Override
	public void addAssetReceive(AddAssetApplyInput input) {
		// TODO Auto-generated method stub
		WareAssetApply wareAssetApply = new WareAssetApply();
		BeanUtils.copyProperties(input, wareAssetApply);
		wareAssetApply.setAssetApplyNo(billTypeService.getBillNumberByKey("LKBILLTYPE000083"));
		wareAssetApply.setCreateTime(new Date());
		wareAssetApply.setCreateUser(getCurrentUserId());
		wareAssetApply.setIsDel(PlatformConstants.ISDEL_NO);
		wareAssetApply.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		wareAssetApply.setApplyType(AssetApplyTypeEnum.RECEIVE.getCode());
		wareAssetApply.setApplyDate(new Date());
		applyDao.insertSelective(wareAssetApply);
	}

	/**
     * 添加调拨申请
     * @param input
     * @return
     */
	@Override
	public void addAssetAllot(AddAssetApplyInput input) {
		// TODO Auto-generated method stub
		WareAssetApply wareAssetApply = new WareAssetApply();
		BeanUtils.copyProperties(input, wareAssetApply);
		wareAssetApply.setAssetApplyNo(billTypeService.getBillNumberByKey("LKBILLTYPE000084"));
		wareAssetApply.setCreateTime(new Date());
		wareAssetApply.setCreateUser(getCurrentUserId());
		wareAssetApply.setIsDel(PlatformConstants.ISDEL_NO);
		wareAssetApply.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		wareAssetApply.setApplyType(AssetApplyTypeEnum.ALLOT.getCode());
		wareAssetApply.setApplyDate(new Date());
		applyDao.insertSelective(wareAssetApply);
	}
	
	/**
     * 批量通过
     * @param ids
     * @param reasonsRejection
     */
	@Transactional
	@Override
	public void auditPass(Integer[] ids) {
		// TODO Auto-generated method stub
		WareAssetApplyExample example = new WareAssetApplyExample();
		example.createCriteria().andWareAssetApplyIdIn(Arrays.asList(ids));
		WareAssetApply wAssetApply = new WareAssetApply();
		wAssetApply.setUpdateTime(new Date());
		wAssetApply.setUpdateUser(getCurrentUserId());
		wAssetApply.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		applyDao.updateByExampleSelective(wAssetApply, example);
		//回调
		List<WareAssetApply> applies = applyDao.selectByExample(example);
		for(WareAssetApply apply : applies){
			WareAssetManagementExample managementExample = new WareAssetManagementExample();
			managementExample.createCriteria().andWareAssetManagementIdEqualTo(apply.getAssetManageId());
			List<WareAssetManagement> wList = assetManageDao.selectByExample(managementExample);
			if(wList!=null&&wList.size()>0){
				WareAssetManagement assetManagement = wList.get(0);
				
				//生成日志记录
				WareAssetLog log = new WareAssetLog();
				log.setOperator(getCurrentUserId());
				log.setCreateTime(new Date());
				log.setCreateUser(getCurrentUserId());
				log.setAsset(assetManagement.getAsset());
				log.setAssetName(assetManagement.getAssetName());
				log.setAssetNo(assetManagement.getAssetNo());
				log.setIsDel(PlatformConstants.ISDEL_NO);
				log.setOperateTime(new Date());
				log.setAssetManageId(assetManagement.getWareAssetManagementId());
				
				//操作内容： 操作类型+内容
				String operateContent = "";
				//操作类型
				String operateType = "";
				//内容
				String content = "";
				//判断申请类型为调拨、领用和报废
				if(AssetApplyTypeEnum.RECEIVE.getCode().equals(apply.getApplyType())){
					//操作类型
					operateType = AssetApplyTypeEnum.RECEIVE.getMessage();
					//日志类型
					log.setOperateType(AssetApplyTypeEnum.RECEIVE.getCode());
					//内容
					String receiveUser = getUserNameByUserId(apply.getApplyUser());
					String receiveDepartment = getDeptName(apply.getApplyDepartment());
					content = "由【"+receiveUser+"，"+receiveDepartment+"】领用";
				}else if(AssetApplyTypeEnum.ALLOT.getCode().equals(apply.getApplyType())){
					//操作类型
					operateType = AssetApplyTypeEnum.ALLOT.getMessage();
					//日志类型
					log.setOperateType(AssetApplyTypeEnum.ALLOT.getCode());
					//内容
					//原责任人
					String oldUser = getUserNameByUserId(assetManagement.getLiablePerson());
					String oldDepartment = getDeptName(assetManagement.getDepartments());
					//现责任人
					String newUser = getUserNameByUserId(apply.getNewUser());
					String newDepartment = getDeptName(apply.getNewDepartment());
					content = "由原责任人【"+oldUser+"，"+oldDepartment+"】更改为现责任人【"+newUser+"，"+newDepartment+"】";
					
					assetManagement.setLiablePerson(apply.getNewUser());
					assetManagement.setDepartments(apply.getNewDepartment());
					
				}else if(AssetApplyTypeEnum.SCRAP.getCode().equals(apply.getApplyType())){
					assetManagement.setUseStatus(AssetUseStatusEnum.SCRAP.getCode());
					assetManagement.setScrapDate(new Date());
					//操作类型
					operateType = AssetApplyTypeEnum.SCRAP.getMessage();
					//日志类型
					log.setOperateType(AssetApplyTypeEnum.SCRAP.getCode());
					content = "报废状态由【"+AssetUseStatusEnum.IN_USE.getMessage()+"】更改为【"+AssetUseStatusEnum.SCRAP.getMessage()+"】";
				}
				//操作内容
				operateContent = operateType+"： "+content;
				log.setOperateContent(operateContent);
				logDao.insertSelective(log);
				
				assetManagement.setUpdateTime(new Date());
				assetManagement.setUpdateUser(getCurrentUserId());
				assetManageDao.updateByPrimaryKeySelective(assetManagement);
				
				
				
			}
		}
		
	}

	/**
     * 批量驳回
     * @param ids
     * @param reasonsRejection
     */
	@Override
	public void auditReject(Integer[] ids, String reasonsRejection) {
		// TODO Auto-generated method stub
		WareAssetApplyExample example = new WareAssetApplyExample();
		example.createCriteria().andWareAssetApplyIdIn(Arrays.asList(ids));
		WareAssetApply wAssetApply = new WareAssetApply();
		wAssetApply.setUpdateTime(new Date());
		wAssetApply.setUpdateUser(getCurrentUserId());
		wAssetApply.setReasonsRejection(reasonsRejection);
		wAssetApply.setAuditStatus(AuditStateEnum.REJECTED.getCode());
		applyDao.updateByExampleSelective(wAssetApply, example);
	}

	/**
     * 资产申请分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<AssetApplyOutput> getAssetApplyPageList(SearchAssetApplyInput input) {
		// TODO Auto-generated method stub
		WareAssetApplyExample example = new WareAssetApplyExample();
		WareAssetApplyExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//筛选条件
		if(StringUtils.isNotEmpty(input.getApplyType())){
			criteria.andApplyTypeEqualTo(input.getApplyType());
		}
		if(StringUtils.isNotEmpty(input.getAssetApplyNo())){
			criteria.andAssetApplyNoLike("%"+input.getAssetApplyNo()+"%");
		}
		if(StringUtils.isNotEmpty(input.getAuditStatus())){
			criteria.andAuditStatusEqualTo(input.getAuditStatus());
		}
		if(input.getApplyDate()!=null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(input.getApplyDate());
			calendar.add(Calendar.DATE, 1);
			criteria.andApplyDateBetween(input.getApplyDate(), calendar.getTime());
		}
		//查询页数
        Integer totalItemCount =(int) applyDao.countByExample(example);
        PagedList<AssetApplyOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
		List<WareAssetApply> assets = applyDao.selectByExample(example);
		//返回数据
		List<AssetApplyOutput> dataList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(WareAssetApply asset : assets) {
			//封装数据
			AssetApplyOutput output = new AssetApplyOutput();
			BeanUtils.copyProperties(asset, output);
			output.setApplyTypeNameLang(asset.getApplyType());
			output.setAuditStatusNameLang(asset.getAuditStatus());
			output.setApplyDate(sdf.format(asset.getApplyDate()));
			dataList.add(output);
		}
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
     * 资产操作日志记录分页列表查询
     * @param input
     * @return
     */
	@Override
	public PagedList<AssetLogOutput> getAssetLogPageList(SearchAssetLogInput input) {
		// TODO Auto-generated method stub
		WareAssetLogExample example = new WareAssetLogExample();
		WareAssetLogExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		//筛选条件
		if(input.getOperator()!=null){
			criteria.andOperatorEqualTo(input.getOperator());
		}
		if(StringUtils.isNotEmpty(input.getOperateType())){
			criteria.andOperateTypeEqualTo(input.getOperateType());
		}
		if(StringUtils.isNotEmpty(input.getAssetName())){
			criteria.andAssetNameLike("%"+input.getAssetName()+"%");
		}
		if(StringUtils.isNotEmpty(input.getAssetNo())){
			criteria.andAssetNoLike("%"+input.getAssetNo()+"%");
		}
		if(input.getOperateTime()!=null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(input.getOperateTime());
			calendar.add(Calendar.DATE, 1);
			criteria.andOperateTimeBetween(input.getOperateTime(), calendar.getTime());
		}
		//查询页数
        Integer totalItemCount =(int) logDao.countByExample(example);
        PagedList<AssetLogOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
		List<WareAssetLog> logs = logDao.selectByExample(example);
		//返回数据
		List<AssetLogOutput> dataList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(WareAssetLog log : logs) {
			//封装数据
			AssetLogOutput output = new AssetLogOutput();
			BeanUtils.copyProperties(log, output);
			output.setOperatorName(getUserNameByUserId(log.getOperator()));
			output.setAssetNameLang(log.getAsset());
			output.setOperateTypeNameLang(log.getOperateType());
			output.setOperateTime(sdf.format(log.getOperateTime()));
			dataList.add(output);
		}
		pagedList.getDataList().addAll(dataList);
		return pagedList;
	}
	
	/**
     * 根据部门key获得部门名称
     * @param dept
     * @return
     */
	String getDeptName(String dept){
		String deptName = "";
		BaseSearchInput input = new BaseSearchInput();
		//Result<List<ProdDeptOutput>> result = productionService.prodDeptList(input);
		Result<List<DeptOutput>> result = productionService.deptList(input);
		if(result!=null&&result.getData()!=null){
			List<DeptOutput> deptList = result.getData();
			for(DeptOutput output : deptList){
				if(dept.equals(output.getKey())){
					deptName = output.getDeptName();
				}
			}
		}
		return deptName;
		
	}

}
