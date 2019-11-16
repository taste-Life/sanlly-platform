package com.sanlly.warehouse.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockinEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.dao.WareStockinDetailMapper;
import com.sanlly.warehouse.dao.WareStockinMapper;
import com.sanlly.warehouse.dao.WareStockoutDetailMapper;
import com.sanlly.warehouse.dao.WareStockoutMapper;
import com.sanlly.warehouse.dao.WareSurplusLossesDetailMapper;
import com.sanlly.warehouse.dao.WareSurplusLossesMapper;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockin;
import com.sanlly.warehouse.entity.WareStockinDetail;
import com.sanlly.warehouse.entity.WareStockout;
import com.sanlly.warehouse.entity.WareStockoutDetail;
import com.sanlly.warehouse.entity.WareSurplusLosses;
import com.sanlly.warehouse.entity.WareSurplusLossesDetail;
import com.sanlly.warehouse.entity.WareSurplusLossesDetailExample;
import com.sanlly.warehouse.entity.WareSurplusLossesExample;
import com.sanlly.warehouse.entity.WareSurplusLossesExample.Criteria;
import com.sanlly.warehouse.enums.BillStatusEnum;
import com.sanlly.warehouse.enums.SurplusLossesTypeEnum;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stock.EditStockNumInput;
import com.sanlly.warehouse.models.input.surplusLosses.AddSLInput;
import com.sanlly.warehouse.models.input.surplusLosses.EditSLInput;
import com.sanlly.warehouse.models.input.surplusLosses.SearchSLInput;
import com.sanlly.warehouse.models.output.asset.AssetOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.surplusLosses.SLDetailOutput;
import com.sanlly.warehouse.models.output.surplusLosses.SLOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.SurplusLossesService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockinService;
/**
 * 盘盈盘亏接口实现类
 * 
 * @author zhh
 *
 */
@Service
public class SurplusLossesServiceImpl extends BaseServiceImpl implements SurplusLossesService{

	@Autowired
	private WareSurplusLossesMapper surplusDao;
	@Autowired
	private WareSurplusLossesDetailMapper detailDao;
	@Autowired
	private WareSparePartsService sparePartsService;
	@Autowired
	private BillTypeService billService;
	@Autowired
	private WareStockinMapper stockInDao;
	@Autowired
	private WareStockinDetailMapper stockInDetailDao;
	@Autowired
	private WareStockMapper stockDao;
	@Autowired
	private WareStockoutMapper stockoutDao;
	@Autowired
	private WareStockoutDetailMapper stockoutDetailDao;
	@Autowired
	private WareStockService stockService;
	
	/**
     * 盘盈盘亏单分页列表
     * @param input
     * @return
     */
	@Override
	public PagedList<SLOutput> getSLPageList(SearchSLInput input) {
		// TODO Auto-generated method stub
		WareSurplusLossesExample example = new WareSurplusLossesExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andTypeEqualTo(input.getType());
		if(StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		if(StringUtils.isNotEmpty(input.getWarehouse())) {
			criteria.andWarehouseEqualTo(input.getWarehouse());
		}
		if(input.getStartDate()!=null||input.getEndDate()!=null) {
			Calendar calendar = Calendar.getInstance();
			if(input.getStartDate()!=null&&input.getEndDate()==null) {
				criteria.andCreateTimeBetween(input.getStartDate(), new Date());
			}else if(input.getStartDate()==null&&input.getEndDate()!=null) {
				calendar.setTime(input.getEndDate());
				calendar.add(Calendar.DATE, 1);
				criteria.andCreateTimeBetween(new Date(0), calendar.getTime());
			}else if(input.getStartDate()!=null&&input.getEndDate()!=null){
				calendar.setTime(input.getEndDate());
				calendar.add(Calendar.DATE, 1);
				criteria.andCreateTimeBetween(input.getStartDate(), calendar.getTime());
			}
		}
		if(StringUtils.isNotEmpty(input.getSurplusLossesNo())) {
			criteria.andSurplusLossesNoLike("%"+input.getSurplusLossesNo()+"%");
		}
		//根据备件号备件名称模糊查询
		if(StringUtils.isNotEmpty(input.getSparePartsNo())||StringUtils.isNotEmpty(input.getSparePartsName())) {
			List<String> keys = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), input.getSparePartsName());
			if(keys!=null&&keys.size()>0) {
				WareSurplusLossesDetailExample detailExample = new WareSurplusLossesDetailExample();
				detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsIn(keys);
				List<WareSurplusLossesDetail> details = detailDao.selectByExample(detailExample);
				if(details!=null&&details.size()>0) {
					List<Integer> ids = new ArrayList<Integer>();
					for(WareSurplusLossesDetail detail : details) {
						ids.add(detail.getWareSurplusLosses());
					}
					criteria.andWareSurplusLossesIdIn(ids);
				}else {
					return new PagedList<SLOutput>(input.getPageIndex(), input.getPageSize(), 0);
				}
			}else {
				return new PagedList<SLOutput>(input.getPageIndex(), input.getPageSize(), 0);
			}
		}
		if(StringUtils.isNotEmpty(input.getBillStatus())) {
			criteria.andBillStatusEqualTo(input.getBillStatus());
		}
		//查询页数
        Integer totalItemCount =(int) surplusDao.countByExample(example);
        PagedList<SLOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<WareSurplusLosses> surplusLosses = surplusDao.selectByExample(example);
        //返回数据
        List<SLOutput> dataList = new ArrayList<SLOutput>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(WareSurplusLosses sl : surplusLosses) {
        	//封装数据
        	SLOutput output = new SLOutput();
        	BeanUtils.copyProperties(sl, output);
        	output.setBillStatusLangLang(sl.getBillStatus());
        	output.setCreateTime(sdf.format(sl.getCreateTime()));
        	output.setUserName(getUserNameByUserId(sl.getCreateUser()));
        	output.setYardLangLang(sl.getYard());
        	output.setWarehouseLangLang(sl.getWarehouse());
        	//封装明细数据
        	List<SLDetailOutput> detailList = new ArrayList<SLDetailOutput>();
        	WareSurplusLossesDetailExample detailsExample = new WareSurplusLossesDetailExample();
        	detailsExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSurplusLossesEqualTo(sl.getWareSurplusLossesId());
        	List<WareSurplusLossesDetail> detailsList = detailDao.selectByExample(detailsExample);
        	if(detailsList!=null&&detailsList.size()>0) {
        		for(WareSurplusLossesDetail sld : detailsList) {
        			SLDetailOutput detailOutput = new SLDetailOutput();
        			BeanUtils.copyProperties(sld, detailOutput);
        			detailOutput.setCompanyLangLang(sld.getCompany());
        			detailOutput.setWarehouseTypeLangLang(sld.getWarehouseType());
        			detailOutput.setStorageLocation(sld.getStorageLocation());
        			SparePartsBriefOutput spare=sparePartsService.getSparePartsBrief(new EditSparePartsInput(sld.getSpareParts()));
        			detailOutput.setSparePartsNo(spare.getSparePartsNo());
        			detailOutput.setSparePartsName(spare.getSparePartsName());
        			detailOutput.setSparePartsKey(sld.getSpareParts());
        			detailOutput.setSparePartsLangLang(sld.getSpareParts());
        			
        			detailList.add(detailOutput);
        		}
        	}
        	output.setDetailList(detailList);
        	dataList.add(output);
        }
        pagedList.getDataList().addAll(dataList);
		return pagedList;
	}

	/**
     * 添加盘盈盘亏单
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void addSL(AddSLInput input) {
		// TODO Auto-generated method stub
		WareSurplusLosses surplusLosses = new WareSurplusLosses();
		BeanUtils.copyProperties(input, surplusLosses);
		surplusLosses.setIsSbs(CommonEnum.NO.getCode());
		surplusLosses.setCompany(getCurrentCompanyKey());
		surplusLosses.setCreateTime(new Date());
		
		//判断类型为盘盈还是盘亏
		if(SurplusLossesTypeEnum.SURPLUS.getCode().equals(input.getType())) {
			surplusLosses.setSurplusLossesNo(billService.getBillNumberByKey("LKBILLTYPE000088"));
		}else if(SurplusLossesTypeEnum.LOSSES.getCode().equals(input.getType())) {
			surplusLosses.setSurplusLossesNo(billService.getBillNumberByKey("LKBILLTYPE000089"));
		}
		surplusLosses.setIsDel(PlatformConstants.ISDEL_NO);
		surplusDao.insertSelective(surplusLosses);
		//添加明细数据
		if(input.getDetailList()!=null&&input.getDetailList().size()>0) {
			for(SLDetailOutput detailOutput : input.getDetailList()) {
				WareSurplusLossesDetail detail = new WareSurplusLossesDetail();
				BeanUtils.copyProperties(detailOutput, detail);
				detail.setCompany(getCurrentCompanyKey());
				detail.setIsDel(PlatformConstants.ISDEL_NO);
				detail.setSpareParts(detailOutput.getSparePartsKey());
				detail.setWareSurplusLosses(surplusLosses.getWareSurplusLossesId());
				detail.setCreateTime(new Date());
				detail.setCreateUser(input.getCreateUser());
				detailDao.insertSelective(detail);
			}
		}
		
	}

	/**
     * 修改盘盈盘亏单
     * @param input
     * @return
     */
	@Transactional
	@Override
	public void editSL(EditSLInput input) {
		// TODO Auto-generated method stub
		WareSurplusLosses surplusLosses = new WareSurplusLosses();
		BeanUtils.copyProperties(input, surplusLosses);
		
		surplusLosses.setUpdateTime(new Date());
		surplusLosses.setUpdateUser(getCurrentUserId());
		surplusDao.updateByPrimaryKeySelective(surplusLosses);
		//修改明细
		//查询原明细
		WareSurplusLossesDetailExample detailExample = new WareSurplusLossesDetailExample();
		detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSurplusLossesEqualTo(input.getWareSurplusLossesId());
		detailDao.deleteByExample(detailExample);
		//添加明细数据
		if(input.getDetailList()!=null&&input.getDetailList().size()>0) {
			for(SLDetailOutput detailOutput : input.getDetailList()) {
				WareSurplusLossesDetail detail = new WareSurplusLossesDetail();
				BeanUtils.copyProperties(detailOutput, detail);
				detail.setIsDel(PlatformConstants.ISDEL_NO);
				detail.setSpareParts(detailOutput.getSparePartsKey());
				detail.setWareSurplusLosses(surplusLosses.getWareSurplusLossesId());
				detail.setCreateTime(new Date());
				detail.setCreateUser(input.getCreateUser());
				detailDao.insertSelective(detail);
			}
		}
	}

	/**
     * 审核盘盈盘亏单
     * @param ids
     * @return
     */
	@Override
	public void auditSL(Integer[] ids) {
		// TODO Auto-generated method stub
		WareSurplusLossesExample example = new WareSurplusLossesExample();
		example.createCriteria().andWareSurplusLossesIdIn(Arrays.asList(ids));
		WareSurplusLosses surplusLosses = new WareSurplusLosses();
		surplusLosses.setBillStatus(BillStatusEnum.COMPLETE_AUDIT.getCode());
		surplusLosses.setUpdateTime(new Date());
		surplusLosses.setUpdateUser(getCurrentUserId());
		surplusDao.updateByExampleSelective(surplusLosses, example);
	}

	/**
	 * 生成批次号 仓库类型编码/备件号/日期（yyMMdd）八位序列号
	 * 
	 * @param warehouseType
	 * @param sparePartsNo
	 * @return
	 */
	public String getBatch(String warehouseType, String sparePartsNo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		int length = warehouseType.length();
		// 仓库类型编码
		String str = "000";
		if (length >= 3) {
			str = warehouseType.substring(length - 3, length);
		}
		// 日期
		String format = sdf.format(new Date());
		String substring = format.substring(1, format.length());
		// 八位序列号
		String random = genRandomNum();

		String returnStr = str + "/" + sparePartsNo + "/" + substring + "/" + random;

		return returnStr;
	}

	/**
	 * 生成八位随机码
	 * 
	 * @return
	 */
	private String genRandomNum() {
		int maxNum = 36;
		int i;
		int count = 0;
		char[] str = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		StringBuffer pwd = new StringBuffer("");
		Random r = new Random();
		while (count < 8) {
			i = Math.abs(r.nextInt(maxNum));
			if (i >= 0 && i < str.length) {
				pwd.append(str[i]);
				count++;
			}
		}
		return pwd.toString();
	}
	/**
     * 盘盈入库
     * @param ids
     * @return
     */
	@Transactional
	@Override
	public void stockIn(Integer[] ids) {
		// TODO Auto-generated method stub
		//根据id获得盘盈单信息
		List<SLOutput> dataList = getSLlist(ids);
		if(dataList!=null&&dataList.size()>0) {
			for(SLOutput output : dataList) {
				//封装入库单信息
				WareStockin stockin = new WareStockin();
				stockin.setStockinNo(billService.getBillNumberByKey("LKBILLTYPE000022"));
				stockin.setAuditStatus(AuditStateEnum.AUDITED.getCode());
				stockin.setBillType("LKBILLTYPE000022");
				stockin.setCompany(output.getCompany());
				stockin.setCreateTime(new Date());
				stockin.setCreateUser(getCurrentUserId());
				stockin.setEntryStatus(StockinEnum.YESIN.getCode());
				stockin.setEntryWarehouse(output.getWarehouse());
				stockin.setIsDel(PlatformConstants.ISDEL_NO);
				stockin.setIsStockSbs(CommonEnum.YES.getCode());
				stockin.setNo(output.getSurplusLossesNo());
				stockInDao.insertSelective(stockin);
				
				//封装入库明细
				for(SLDetailOutput detailOutput : output.getDetailList()) {
					WareStockinDetail stockinDetail = new WareStockinDetail();
					stockinDetail.setCreateTime(new Date());
					stockinDetail.setCreateUser(getCurrentUserId());
					stockinDetail.setEntryNum(detailOutput.getNum().doubleValue());
					stockinDetail.setEntryPrice(detailOutput.getPrice());
					stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
					stockinDetail.setSpareParts(detailOutput.getSparePartsKey());
					stockinDetail.setStorageLocation(detailOutput.getStorageLocation());
					stockinDetail.setSurplusNum(detailOutput.getNum().doubleValue());
					stockinDetail.setWarehouse(output.getWarehouse());
					stockinDetail.setWarehouseType(detailOutput.getWarehouseType());
					stockinDetail.setWareStockinId(stockin.getWareStockinId());
					SparePartsOutput spare = sparePartsService.getSpareParts(new EditSparePartsInput(detailOutput.getSparePartsKey()));
					stockinDetail.setLength(spare.getLength());
					stockinDetail.setWidth(spare.getWidth());
					stockinDetail.setEntryArea(0D);
					stockinDetail.setStockinBatch(getBatch(detailOutput.getWarehouseType(), spare.getSparePartsNo()));
				    stockinDetail.setSparePartsOriginalBatch(stockinDetail.getStockinBatch());
					stockinDetail.setTotalAmount(detailOutput.getAmount());
				    stockInDetailDao.insertSelective(stockinDetail);
				    
				    //备件入库
				    WareStock wareStock = new WareStock();
					wareStock.setCompany(output.getCompany());
					wareStock.setActualSurplusNum(detailOutput.getNum().doubleValue());
					wareStock.setCreateTime(new Date());
					wareStock.setCreateUser(getCurrentUserId());
					wareStock.setEntryNum(detailOutput.getNum().doubleValue());
					wareStock.setIsDel(PlatformConstants.ISDEL_NO);
					wareStock.setSpareParts(detailOutput.getSparePartsKey());
					wareStock.setSparePartsBatch(stockinDetail.getStockinBatch());
					wareStock.setSparePartsOriginalBatch(stockinDetail.getStockinBatch());
					wareStock.setWarehouse(output.getWarehouse());
					wareStock.setWarehouseType(detailOutput.getWarehouseType());
					
					wareStock.setSparePartsCategories(spare.getSparePartsCategories());
					wareStock.setSparePartsName(spare.getSparePartsName());
					wareStock.setSparePartsNo(spare.getSparePartsNo());
					wareStock.setSparePartsUnit(spare.getSparePartsUnit());
					wareStock.setStockinDate(new Date());
					wareStock.setStockinNo(stockin.getStockinNo());
					wareStock.setStorageLocation(detailOutput.getStorageLocation());
					wareStock.setSurplusNum(detailOutput.getNum().doubleValue());
					wareStock.setUnitPrice(detailOutput.getPrice());
					wareStock.setWidth(spare.getWidth());
					wareStock.setLength(spare.getLength());
					wareStock.setOriginalArea(0D);
					wareStock.setSurplusArea(0D);
					stockDao.insertSelective(wareStock);
					
				}
			}
			
		}
		//修改盘盈单单据状态
		WareSurplusLossesExample example = new WareSurplusLossesExample();
		example.createCriteria().andWareSurplusLossesIdIn(Arrays.asList(ids));
		WareSurplusLosses surplusLosses = new WareSurplusLosses();
		surplusLosses.setBillStatus(BillStatusEnum.ALL_IN.getCode());
		surplusLosses.setUpdateTime(new Date());
		surplusLosses.setUpdateUser(getCurrentUserId());
		surplusDao.updateByExampleSelective(surplusLosses, example);
	}

	/**
     * 盘亏出库
     * @param ids
     * @return
     */
	@Transactional
	@Override
	public void stockOut(Integer[] ids) {
		// TODO Auto-generated method stub
		//根据id获得盘盈单信息
		List<SLOutput> dataList = getSLlist(ids);
		if(dataList!=null&&dataList.size()>0) {
			for(SLOutput output : dataList) {
				//封装出库单信息
				WareStockout stockout = new WareStockout();
				stockout.setStockoutNo(billService.getBillNumberByKey("LKBILLTYPE000023"));
				stockout.setNo(output.getSurplusLossesNo());
				stockout.setCompany(output.getCompany());
				stockout.setWarehouse(output.getWarehouse());
				stockout.setBillType("LKBILLTYPE000023");
				stockout.setStockoutStatus(StockoutEnum.YESOUT.getCode());
				stockout.setStatus(CommonEnum.YES.getCode());
				stockout.setIsStockSbs(CommonEnum.YES.getCode());
				stockout.setAuditStatus(AuditStateEnum.AUDITED.getCode());
				stockout.setIsDel(PlatformConstants.ISDEL_NO);
				stockout.setCreateTime(new Date());
				stockout.setCreateUser(getCurrentUserId());
				stockoutDao.insertSelective(stockout);
				
				//封装出库明细
				for(SLDetailOutput detailOutput : output.getDetailList()) {
					List<StockOutput> batchList = stockService.autoGetStock(output.getWarehouse(), detailOutput.getSparePartsKey(), detailOutput.getNum().doubleValue());
					if(batchList!=null&&batchList.size()>0) {
						for(StockOutput stockOutput : batchList) {
							WareStockoutDetail stockoutDetail = new WareStockoutDetail();
							stockoutDetail.setStockoutArea(DefaultConstants.DOUBLEDEFAULT);
							stockoutDetail.setStockoutSurplusArea(DefaultConstants.DOUBLEDEFAULT);
							stockoutDetail.setStockoutNum(DefaultConstants.DOUBLEDEFAULT);
							stockoutDetail.setStockoutSurplusNum(DefaultConstants.DOUBLEDEFAULT);
							stockoutDetail.setLength(DefaultConstants.DOUBLEDEFAULT);
							stockoutDetail.setWidth(DefaultConstants.DOUBLEDEFAULT);
							stockoutDetail.setWareStockoutId(stockout.getWareStockoutId());
							stockoutDetail.setDefaultWarehouseType(detailOutput.getWarehouseType());
							stockoutDetail.setSparePartsBatch(stockOutput.getSparePartsBatch());
							stockoutDetail.setStockoutNum(stockOutput.getActualSurplusNum());
							stockoutDetail.setSpareParts(detailOutput.getSparePartsKey());
							stockoutDetail.setYard(output.getYard());
							stockoutDetail.setIsDel(PlatformConstants.ISDEL_NO);
							stockoutDetail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
							stockoutDetail.setCreateTime(new Date());
							stockoutDetail.setCreateUser(getCurrentUserId());
							
							stockoutDetailDao.insertSelective(stockoutDetail);
							
							//备件出库
							EditStockNumInput input = new EditStockNumInput();
							input.setWareStockId(stockOutput.getWareStockId());
							input.setNum(stockoutDetail.getStockoutNum());
							stockService.editStockNum(input);
						}
					}
				}
			}
		}
		//修改盘盈单单据状态
		WareSurplusLossesExample example = new WareSurplusLossesExample();
		example.createCriteria().andWareSurplusLossesIdIn(Arrays.asList(ids));
		WareSurplusLosses surplusLosses = new WareSurplusLosses();
		surplusLosses.setBillStatus(BillStatusEnum.ALL_OUT.getCode());
		surplusLosses.setUpdateTime(new Date());
		surplusLosses.setUpdateUser(getCurrentUserId());
		surplusDao.updateByExampleSelective(surplusLosses, example);
	}

	/**
     * 根据id查询单据信息
     * @param id
     * @return
     */
	@Override
	public SLOutput getSL(Integer id) {
		// TODO Auto-generated method stub
		//查询主单
		SLOutput output = new SLOutput();
		WareSurplusLossesExample example = new WareSurplusLossesExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSurplusLossesIdEqualTo(id);
		List<WareSurplusLosses> surplusLosses = surplusDao.selectByExample(example);
		if(surplusLosses!=null&&surplusLosses.size()>0) {
			WareSurplusLosses sLosses = surplusLosses.get(0);
			BeanUtils.copyProperties(sLosses, output);
			//封装明细信息
			List<SLDetailOutput> detailList = new ArrayList<SLDetailOutput>();
			WareSurplusLossesDetailExample detailExample = new WareSurplusLossesDetailExample();
			detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSurplusLossesEqualTo(id);
			List<WareSurplusLossesDetail> details = detailDao.selectByExample(detailExample);
			if(details!=null&&details.size()>0) {
				for(WareSurplusLossesDetail detail : details) {
					SLDetailOutput detailOutput = new SLDetailOutput();
					BeanUtils.copyProperties(detail, detailOutput);
					detailOutput.setSparePartsKey(detail.getSpareParts());
					detailList.add(detailOutput);
				}
			}
			output.setDetailList(detailList);
		}
		return output;
	}

	/**
     * 根据ids查询单据信息
     * @param ids
     * @return
     */
	@Override
	public List<SLOutput> getSLlist(Integer[] ids) {
		// TODO Auto-generated method stub
		//返回数据
		List<SLOutput> dataList = new ArrayList<SLOutput>();
		WareSurplusLossesExample example = new WareSurplusLossesExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSurplusLossesIdIn(Arrays.asList(ids));
		List<WareSurplusLosses> surplusLosses = surplusDao.selectByExample(example);
		if(surplusLosses!=null&&surplusLosses.size()>0) {
			for(WareSurplusLosses sLosses : surplusLosses) {
				SLOutput output = new SLOutput();
				BeanUtils.copyProperties(sLosses, output);
				//封装明细信息
				List<SLDetailOutput> detailList = new ArrayList<SLDetailOutput>();
				WareSurplusLossesDetailExample detailExample = new WareSurplusLossesDetailExample();
				detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andWareSurplusLossesEqualTo(sLosses.getWareSurplusLossesId());
				List<WareSurplusLossesDetail> details = detailDao.selectByExample(detailExample);
				if(details!=null&&details.size()>0) {
					for(WareSurplusLossesDetail detail : details) {
						SLDetailOutput detailOutput = new SLDetailOutput();
						BeanUtils.copyProperties(detail, detailOutput);
						detailOutput.setSparePartsKey(detail.getSpareParts());
						detailList.add(detailOutput);
					}
				}
				output.setDetailList(detailList);
				dataList.add(output);
			}
		}
		return dataList;
	}

}
