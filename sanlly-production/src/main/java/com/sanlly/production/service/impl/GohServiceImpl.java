package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.finance.PoolGonContainerInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.GohContRequireMapper;
import com.sanlly.production.dao.GohContainerCostMapper;
import com.sanlly.production.dao.GohContainerEntryMapper;
import com.sanlly.production.dao.GohContainerMapper;
import com.sanlly.production.dao.GohContainerRateMapper;
import com.sanlly.production.dao.PickingListMapper;
import com.sanlly.production.dao.PlanStockMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.CompanyExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.GohContRequire;
import com.sanlly.production.entity.GohContRequireExample;
import com.sanlly.production.entity.GohContainer;
import com.sanlly.production.entity.GohContainerCost;
import com.sanlly.production.entity.GohContainerCostExample;
import com.sanlly.production.entity.GohContainerEntry;
import com.sanlly.production.entity.GohContainerEntryExample;
import com.sanlly.production.entity.GohContainerExample;
import com.sanlly.production.entity.GohContainerRate;
import com.sanlly.production.entity.GohContainerRateExample;
import com.sanlly.production.entity.PickingList;
import com.sanlly.production.entity.PlanStock;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.GohStateEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.models.input.goh.GohContainerCourseAddInput;
import com.sanlly.production.models.input.goh.GohContainerEntryInput;
import com.sanlly.production.models.input.goh.GohContainerGohAddInput;
import com.sanlly.production.models.input.goh.GohEntryRateInput;
import com.sanlly.production.models.input.goh.GohListInput;
import com.sanlly.production.models.input.goh.GohRequireAddInput;
import com.sanlly.production.models.input.goh.GohRequireUpdateInput;
import com.sanlly.production.models.input.goh.SearchGohContainerInput;
import com.sanlly.production.models.input.goh.SearchGohRequireInput;
import com.sanlly.production.models.output.goh.GohContainerEntryOutput;
import com.sanlly.production.models.output.goh.GohContainerOutput;
import com.sanlly.production.models.output.goh.GohRequireOutput;
import com.sanlly.production.models.output.goh.SearchCourseOutput;
import com.sanlly.production.models.output.goh.SearecGohOutput;
import com.sanlly.production.models.output.goh.SearecGohRequireOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.service.FinanceService;
import com.sanlly.production.service.GohService;
import com.sanlly.production.service.WarehouseClient;

/**
 * 挂衣箱实现类
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月21日 下午4:10:54 
 * @version V1.0   
 */
@Service
public class GohServiceImpl extends BaseServiceImpl implements GohService {

	@Autowired
	private GohContRequireMapper gohContRequireMapper;

	@Autowired
	private GohContainerMapper gohContainerMapper;

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private GohContainerEntryMapper gohContainerEntryMapper;

	@Autowired
	private GohContainerRateMapper gohContainerRateMapper;

	@Autowired
	private GohContainerCostMapper gohContainerCostMapper;

	@Autowired
	private WarehouseClient warehouseClient;

	@Autowired
	private PickingListMapper pickingListMapper;

	@Autowired
	private PlanStockMapper planStockMapper;

	@Autowired
	private FinanceService financeService;

	@Autowired
	private YardMapper yardMapper;

	/**
	 * 改制要求列表
	 */
	@Override
	public PagedList<SearecGohRequireOutput> getGohList(SearchGohRequireInput input) {
		// 查询条件
		GohContRequireExample example = new GohContRequireExample();
		example.setOrderByClause("create_time desc");
		GohContRequireExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (StringUtils.isNotEmpty(input.getEntryName())) {
			criteria.andRequireNameEqualTo(input.getEntryName());
		}
		// 总条数
		Integer totalItemCount = (int) gohContRequireMapper.countByExample(example);
		PagedList<SearecGohRequireOutput> pagedList = new PagedList<SearecGohRequireOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<GohContRequire> forthList = gohContRequireMapper.selectByExampleWithBLOBs(example);
		// 构造返回数据
		List<SearecGohRequireOutput> backList = new ArrayList<>();
		for (GohContRequire item : forthList) {
			SearecGohRequireOutput model = new SearecGohRequireOutput();
			model.setGohId(item.getProdGohContRequireId());
			model.setRequireName(item.getRequireName()); // 改制要求名称
			model.setEstimatedQuantity(item.getEstimatedQuantity()); // 预计改制个数
			model.setBeamQuantity(item.getBeamQuantity()); // 梁数
			model.setRopeQuantity(item.getRopeQuantity()); // 绳数
			model.setKnotQuantity(item.getKnotQuantity()); // 结数
			model.setBeamDistance(item.getBeamDistance()); // 梁距
			model.setKnotDistance(item.getKnotDistance()); // 结距
			model.setAroundDistance(item.getAroundDistance()); // 前后板距离
			model.setRemarks(item.getRemarks()); // 备注
			model.setRequireContent(item.getRequireContent()); // 改制要求
			backList.add(model);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(backList);
		return pagedList;
	}

	/**
	 * 根据改制要求获取挂衣箱
	 */
	@Override
	public PagedList<SearecGohOutput> getGohOne(Integer gohId, Integer index, Integer size) {
		GohContainerExample example = new GohContainerExample();
		example.createCriteria().andGohContRequireEqualTo(gohId);
		example.setOrderByClause("create_time desc");
		// 总条数
		Integer totalItemCount = (int) gohContainerMapper.countByExample(example);
		PagedList<SearecGohOutput> pagedList = new PagedList<SearecGohOutput>(index, size, totalItemCount);
		// // 分页查询
		// example.setLimitStart(pagedList.getLimitStart());
		// example.setLimitEnd(pagedList.getLimitEnd());

		List<GohContainer> list = gohContainerMapper.selectByExample(example);
		List<SearecGohOutput> outList = list.stream().map(a -> {
			SearecGohOutput model = new SearecGohOutput();
			model.setGohContainerId(a.getProdGohContainerId());
			model.setContainerNo(a.getContainerNo()); // 箱号
			model.setContainerUserLang(a.getContainerUser()); // 用箱人
			model.setYardLang(a.getYard()); // 场站
			model.setSumBeamNumber(a.getSumBeamNumber()); // 共多少梁
			model.setLoseBeamNumber(a.getLoseBeamNumber()); // 丢失多少梁
			model.setHorizontalDistance(a.getHorizontalDistance()); // 水平梁距
			model.setUpdownDistance(a.getUpdownDistance()); // 上下梁距
			return model;
		}).collect(Collectors.toList());
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(outList);
		return pagedList;
	}

	/**
	 * 获取挂衣箱列表
	 */
	@Override
	public PagedList<SearecGohOutput> getGohList(GohListInput input) {
		GohContainerExample example = new GohContainerExample();
		GohContainerExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time desc");
		criteria.andGohContRequireEqualTo(0);
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if (StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		// 总条数
		Integer totalItemCount = (int) gohContainerMapper.countByExample(example);
		PagedList<SearecGohOutput> pagedList = new PagedList<SearecGohOutput>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());

		List<GohContainer> list = gohContainerMapper.selectByExample(example);
		List<SearecGohOutput> outList = list.stream().map(a -> {
			SearecGohOutput model = new SearecGohOutput();
			model.setGohContainerId(a.getProdGohContainerId());
			model.setContainerNo(a.getContainerNo()); // 箱号
			model.setContainerUserLang(a.getContainerUser()); // 用箱人
			model.setYardLang(a.getYard()); // 场站
			model.setSumBeamNumber(a.getSumBeamNumber()); // 共多少梁
			model.setLoseBeamNumber(a.getLoseBeamNumber()); // 丢失多少梁
			model.setHorizontalDistance(a.getHorizontalDistance()); // 水平梁距
			model.setUpdownDistance(a.getUpdownDistance()); // 上下梁距
			return model;
		}).collect(Collectors.toList());
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(outList);
		return pagedList;
	}

	/**
	 * 改制要求新增
	 */
	@Override
	public void addRequire(GohRequireAddInput input) {
		GohContRequire model = new GohContRequire();
		model.setRequireName(input.getRequireName()); // 改制要求名称
		model.setEstimatedQuantity(input.getEstimatedQuantity()); // 预计改制个数
		model.setBeamQuantity(input.getBeamQuantity()); // 梁数
		model.setRopeQuantity(input.getRopeQuantity()); // 绳数
		model.setKnotQuantity(input.getKnotQuantity()); // 结数
		model.setBeamDistance(input.getBeamDistance()); // 梁距
		model.setKnotDistance(input.getKnotDistance()); // 绳距
		model.setAroundDistance(input.getAroundDistance()); // 前后板距离
		model.setRequireContent(input.getRequireContent()); // 改制要求
		model.setRemarks(input.getRemarks()); // 备注
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		// 返回主键
		gohContRequireMapper.insert(model);
		Integer id = model.getProdGohContRequireId();
		// 绑定挂衣箱
		if (input.getContainerIds().length > 0) {
			GohContainerExample example = new GohContainerExample();
			example.createCriteria().andProdGohContainerIdIn(Arrays.asList(input.getContainerIds()));
			GohContainer goh = new GohContainer();
			goh.setGohContRequire(id);
			goh.setUpdateUser(getCurrentUserId());
			goh.setUpdateTime(new Date());
			gohContainerMapper.updateByExampleSelective(goh, example);
		}
	}

	/**
	 * 获取单条改制规则信息
	 */
	@Override
	public GohRequireOutput getGohRequire(Integer requireId) {
		GohContRequire goh = gohContRequireMapper.selectByPrimaryKey(requireId);
		GohRequireOutput model = new GohRequireOutput();
		model.setGohId(goh.getProdGohContRequireId());
		model.setRequireName(goh.getRequireName()); // 改制要求名称
		model.setEstimatedQuantity(goh.getEstimatedQuantity()); // 预计改制个数
		model.setBeamQuantity(goh.getBeamQuantity()); // 梁数
		model.setRopeQuantity(goh.getRopeQuantity()); // 绳数
		model.setKnotQuantity(goh.getKnotQuantity()); // 结数
		model.setBeamDistance(goh.getBeamDistance()); // 梁距
		model.setKnotDistance(goh.getKnotDistance()); // 绳距
		model.setAroundDistance(goh.getAroundDistance()); // 前后板距离
		model.setRequireContent(goh.getRequireContent()); // 改制要求
		model.setRemarks(goh.getRemarks()); // 备注
		// 查询绑定的挂衣箱
		GohContainerExample example = new GohContainerExample();
		example.createCriteria().andGohContRequireEqualTo(model.getGohId());
		List<GohContainer> gohList = gohContainerMapper.selectByExample(example);
		List<SearecGohOutput> outList = gohList.stream().map(a -> {
			SearecGohOutput out = new SearecGohOutput();
			out.setGohContainerId(a.getProdGohContainerId());
			out.setContainerNo(a.getContainerNo()); // 箱号
			out.setContainerUserLang(a.getContainerUser()); // 用箱人
			out.setYardLang(a.getYard()); // 场站
			out.setSumBeamNumber(a.getSumBeamNumber()); // 共多少梁
			out.setLoseBeamNumber(a.getLoseBeamNumber()); // 丢失多少梁
			out.setHorizontalDistance(a.getHorizontalDistance()); // 水平梁距
			out.setUpdownDistance(a.getUpdownDistance()); // 上下梁距
			return out;
		}).collect(Collectors.toList());
		model.setGohList(outList);
		return model;
	}

	/**
	 * 删除改制要求和挂衣箱的绑定关系
	 */
	@Override
	public void delGohList(Integer[] gohIds) {
		GohContainerExample example = new GohContainerExample();
		example.createCriteria().andProdGohContainerIdIn(Arrays.asList(gohIds));
		GohContainer model = new GohContainer();
		model.setGohContRequire(0);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		gohContainerMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 改制要求编辑
	 */
	@Override
	public void updateRequire(GohRequireUpdateInput input) {
		GohContRequire model = gohContRequireMapper.selectByPrimaryKey(input.getGohId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setRequireName(input.getRequireName()); // 改制要求名称
			model.setEstimatedQuantity(input.getEstimatedQuantity()); // 预计改制个数
			model.setBeamQuantity(input.getBeamQuantity()); // 梁数
			model.setRopeQuantity(input.getRopeQuantity()); // 绳数
			model.setKnotQuantity(input.getKnotQuantity()); // 结数
			model.setBeamDistance(input.getBeamDistance()); // 梁距
			model.setKnotDistance(input.getKnotDistance()); // 绳距
			model.setAroundDistance(input.getAroundDistance()); // 前后板距离
			model.setRequireContent(input.getRequireContent()); // 改制要求
			model.setRemarks(input.getRemarks()); // 备注
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			GohContRequireExample gohExample = new GohContRequireExample();
			gohExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andProdGohContRequireIdEqualTo(input.getGohId());
			gohContRequireMapper.updateByExampleWithBLOBs(model, gohExample);
			// 绑定挂衣箱
			if (input.getContainerIds().length > 0) {
				GohContainerExample example = new GohContainerExample();
				example.createCriteria().andProdGohContainerIdIn(Arrays.asList(input.getContainerIds()));
				GohContainer goh = new GohContainer();
				goh.setGohContRequire(input.getGohId());
				goh.setUpdateUser(getCurrentUserId());
				goh.setUpdateTime(new Date());
				gohContainerMapper.updateByExampleSelective(goh, example);
			}
			return;
		}
		throw new InvalidException("编辑失败");

	}

	/**
	 * 挂衣箱基础信息添加
	 */
	@Override
	public void addGohContainer(GohContainerCourseAddInput input) {
		// TODO Auto-generated method stub
		Course course = courseMapper.selectByPrimaryKey(input.getProdCourseId());
		if (!CommonEnum.YES.getCode().equals(course.getIsGonContainer())) {
			// 删除本次进场已添加挂衣箱
			GohContainerExample example = new GohContainerExample();
			example.createCriteria().andCourseEqualTo(input.getProdCourseId());
			gohContainerMapper.deleteByExample(example);
			return;
		}
		// 判断是否已经存在挂衣箱信息，存在修改，不存在新增
		GohContainerExample example = new GohContainerExample();
		example.createCriteria().andCourseEqualTo(course.getProdCourseId());
		List<GohContainer> gohList = gohContainerMapper.selectByExample(example);
		if (gohList.size() > 0) {
			GohContainer model = gohList.get(0);
			model.setStructure(input.getStructure()); // 结构s
			model.setSumBeamNumber(input.getSumBeamNumber()); // 共多少梁
			model.setLoseBeamNumber(input.getLoseBeamNumber()); // 丢失多少梁
			model.setHorizontalDistance(input.getHorizontalDistance()); // 水平梁距
			model.setUpdownDistance(input.getUpdownDistance()); // 上下梁距
			if (CommonEnum.YES.getCode().equals(course.getIsGonContainer())) {
				model.setIsGoh(CommonEnum.YES.getCode()); // 进场时是否标为挂衣箱
			} else {
				model.setIsGoh(CommonEnum.NO.getCode()); // 进场时是否标为挂衣箱
			}
			model.setRemarks(input.getGohRemark()); // 备注
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			gohContainerMapper.updateByPrimaryKey(model);
		} else {
			GohContainer model = new GohContainer();
			model.setCourse(course.getProdCourseId()); // 进场id
			model.setGohContRequire(0); // 改制要求id
			model.setContainerNo(course.getContainerNo()); // 箱号
			model.setContainerUser(course.getContainerUser()); // 用箱人
			model.setYard(course.getYard()); // 场站
			model.setSize(course.getSize()); // 尺寸
			model.setBeforeContainerType(course.getContainerType()); // 改前箱型
			model.setStructure(input.getStructure()); // 结构
			model.setSumBeamNumber(input.getSumBeamNumber()); // 共多少梁
			model.setLoseBeamNumber(input.getLoseBeamNumber()); // 丢失多少梁
			model.setHorizontalDistance(input.getHorizontalDistance()); // 水平梁距
			model.setUpdownDistance(input.getUpdownDistance()); // 上下梁距
			if (CommonEnum.YES.getCode().equals(course.getIsGonContainer())) {
				model.setIsGoh(CommonEnum.YES.getCode()); // 进场时是否标为挂衣箱
			} else {
				model.setIsGoh(CommonEnum.NO.getCode()); // 进场时是否标为挂衣箱
			}
			model.setTestingState(GohStateEnum.GIHSTATE_01.getCode()); // 状态
			model.setRemarks(input.getGohRemark()); // 备注
			model.setCreateUser(getCurrentUserId());
			model.setCreateTime(new Date());
			gohContainerMapper.insert(model);
		}
	}

	/**
	 * 挂衣箱列表
	 */
	@Override
	public PagedList<SearecGohOutput> getGohContainerList(SearchGohContainerInput input) {
		GohContainerExample example = new GohContainerExample();
		GohContainerExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time desc");
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if (StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		if (StringUtils.isNotEmpty(input.getIsEntry())) {
			criteria.andIsEntryEqualTo(input.getIsEntry());
		}
		if (StringUtils.isNotEmpty(input.getReshapeType())) {
			criteria.andReshapeTypeEqualTo(input.getReshapeType());
		}
		// 总条数
		Integer totalItemCount = (int) gohContainerMapper.countByExample(example);
		PagedList<SearecGohOutput> pagedList = new PagedList<SearecGohOutput>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());

		List<GohContainer> list = gohContainerMapper.selectByExample(example);
		List<SearecGohOutput> outList = list.stream().map(a -> {
			SearecGohOutput model = new SearecGohOutput();
			model.setGohContainerId(a.getProdGohContainerId());
			model.setContainerNo(a.getContainerNo()); // 箱号
			model.setContainerUserLang(a.getContainerUser()); // 用箱人
			model.setYardLang(a.getYard()); // 场站
			model.setSumBeamNumber(a.getSumBeamNumber()); // 共多少梁
			model.setLoseBeamNumber(a.getLoseBeamNumber()); // 丢失多少梁
			model.setHorizontalDistance(a.getHorizontalDistance()); // 水平梁距
			model.setUpdownDistance(a.getUpdownDistance()); // 上下梁距
			model.setReshapeTypeLang(a.getReshapeType()); // 改制类型
			return model;
		}).collect(Collectors.toList());
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(outList);
		return pagedList;
	}

	/**
	 * 挂衣箱条目
	 */
	@Override
	public List<GohContainerEntryOutput> getGohContainerEntryList(Integer gohId) {
		GohContainerEntryExample example = new GohContainerEntryExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andGohContainerEqualTo(gohId);
		List<GohContainerEntry> gohEntryList = gohContainerEntryMapper.selectByExample(example);
		List<GohContainerEntryOutput> list = gohEntryList.stream().map(a -> {
			GohContainerEntryOutput model = new GohContainerEntryOutput();
			model.setEntryId(a.getProdGohContainerEntryId());
			model.setEntryName(a.getEntryName()); // 条目名称
			model.setSparesNumber(a.getSparesNumber()); // 备件号
			model.setQuantity(a.getQuantity()); // 数量
			model.setManHour(a.getManHour()); // 工时
			model.setPayingParty(a.getPayingParty()); // 付费方
			model.setStandardCost(a.getStandardCost()); // 标准费用
			model.setNonstandardCost(a.getNonstandardCost()); // 非标准费用
			model.setIsDevanning(a.getIsDevanning()); // 是否拆箱条目
			model.setRemarks(a.getRemarks()); // 备注
			return model;
		}).sorted((a, b) -> {
			if (!StringUtils.isNotEmpty(a.getIsDevanning()))
				return 1;
			return -1;
		}).collect(Collectors.toList());
		return list;
	}

	/**
	 * 挂衣箱添加
	 * 
	 * @throws ParseException
	 */
	@Override
	public Integer addGohContainerByGoh(GohContainerGohAddInput input) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		if (input.getGohContainerId() != null) {
			GohContainer goh = gohContainerMapper.selectByPrimaryKey(input.getGohContainerId());
			goh.setGohContRequire(input.getRequireId()); // 改制要求id
			goh.setContainerNo(input.getContainerNo()); // 箱号
			goh.setContainerUser(input.getContainerUser()); // 用箱人
			goh.setYard(input.getYard()); // 场站
			goh.setSize(input.getSize()); // 尺寸
			goh.setBeforeContainerType(input.getBeforeContainerType()); // 改前箱型
			goh.setAfterContainerType(input.getAfterContainerType()); // 改后箱型
			goh.setStructure(input.getStructure()); // 结构
			goh.setTierNumber(input.getTierNumber()); // 层数
			goh.setReshapeType(input.getReshapeType()); // 改制类型
			goh.setSumBeamNumber(input.getSumBeamNumber()); // 共所少梁
			goh.setLoseBeamNumber(input.getLoseBeamNumber()); // 丢失多少梁
			goh.setHorizontalDistance(input.getHorizontalDistance()); // 水平梁距
			goh.setUpdownDistance(input.getUpdownDistance()); // 上下梁距
			goh.setIsEntry(CommonEnum.NO.getCode()); // 是否存在条目
			goh.setContainerWeight(input.getContainerWeight()); // 箱皮净重
			goh.setMaterialWeight(input.getMaterialWeight()); // 材料重
			goh.setVesselVoyage(input.getVesselVoyage()); // 船名航次
			goh.setBillOfLadingNo(input.getBillOfLadingNo()); // 提单号
			goh.setDestinationPort(input.getDestinationPort()); // 目的港
			if (StringUtils.isNotEmpty(input.getExtractContTime()))
				goh.setExtractContTime(sdf.parse(input.getExtractContTime())); // 提箱日期
			goh.setRemarks(input.getContainerRemarks()); // 备注
			goh.setUpdateTime(new Date());
			goh.setUpdateUser(getCurrentUserId());
			goh.setContainerCost(input.getContainerCost()); // 客户费用
			goh.setThirdPartyCost(input.getThirdPartyCost()); // 第三方费用
			Double manHour = input.getEntryList().stream().mapToDouble(a -> a.getManHour()).sum();
			goh.setManHour(manHour);
			if (input.getRequireId() != null && input.getEntryList().size() > 0) {
				goh.setTestingState(GohStateEnum.GIHSTATE_02.getCode());
				goh.setReferralState(ReferralStateEnum.UNREFERRAL.getCode());
				goh.setPickingState(PickingStateEnum.NOPICKING.getCode());
			}
			gohContainerMapper.updateByPrimaryKey(goh);
			// 条目添加
			addGohContainerEntry(input.getEntryList(), goh.getProdGohContainerId());
			return goh.getProdGohContainerId();
		} else {
			GohContainer model = new GohContainer();
			model.setGohContRequire(input.getRequireId()); // 改制要求id
			model.setContainerNo(input.getContainerNo()); // 箱号
			model.setContainerUser(input.getContainerUser()); // 用箱人
			model.setYard(input.getYard()); // 场站
			model.setSize(input.getSize()); // 尺寸
			model.setBeforeContainerType(input.getBeforeContainerType()); // 改前箱型
			model.setAfterContainerType(input.getAfterContainerType()); // 改后箱型
			model.setStructure(input.getStructure()); // 结构
			model.setTierNumber(input.getTierNumber()); // 层数
			model.setReshapeType(input.getReshapeType()); // 改制类型
			model.setSumBeamNumber(input.getSumBeamNumber()); // 共所少梁
			model.setLoseBeamNumber(input.getLoseBeamNumber()); // 丢失多少梁
			model.setHorizontalDistance(input.getHorizontalDistance()); // 水平梁距
			model.setUpdownDistance(input.getUpdownDistance()); // 上下梁距
			model.setIsGoh(CommonEnum.YES.getCode()); // 是否继续作挂衣箱
			model.setIsEntry(CommonEnum.NO.getCode()); // 是否存在条目
			model.setContainerWeight(input.getContainerWeight()); // 箱皮净重
			model.setMaterialWeight(input.getMaterialWeight()); // 材料重
			model.setTestingState(GohStateEnum.GIHSTATE_01.getCode()); // 状态
			model.setVesselVoyage(input.getVesselVoyage()); // 船名航次
			model.setBillOfLadingNo(input.getBillOfLadingNo()); // 提单号
			model.setDestinationPort(input.getDestinationPort()); // 目的港
			if (StringUtils.isNotEmpty(input.getExtractContTime()))
				model.setExtractContTime(sdf.parse(input.getExtractContTime())); // 提箱日期
			model.setRemarks(input.getContainerRemarks()); // 备注
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());
			model.setContainerCost(input.getContainerCost()); // 客户费用
			model.setThirdPartyCost(input.getThirdPartyCost()); // 第三方费用
			Double manHour = input.getEntryList().stream().mapToDouble(a -> a.getManHour()).sum();
			model.setManHour(manHour);
			if (input.getRequireId() != null && input.getEntryList().size() > 0) {
				model.setTestingState(GohStateEnum.GIHSTATE_02.getCode());
				model.setReferralState(ReferralStateEnum.UNREFERRAL.getCode());
				model.setPickingState(PickingStateEnum.NOPICKING.getCode());
			}
			gohContainerMapper.insert(model);
			// 条目添加
			addGohContainerEntry(input.getEntryList(), model.getProdGohContainerId());
			return model.getProdGohContainerId();
		}

	}

	/**
	 * 条目添加
	 * 
	 * @Description: TODO
	 * @param entryList
	 * @param prodGohContainerId
	 *            void @throws 
	 */
	private void addGohContainerEntry(List<GohContainerEntryInput> entryList, Integer prodGohContainerId) {
		if (entryList.size() > 0) {
			for (GohContainerEntryInput item : entryList) {
				if (item.getEntryId() != null) {
					GohContainerEntry model = gohContainerEntryMapper.selectByPrimaryKey(item.getEntryId());
					model.setEntryName(item.getEntryName()); // 条目名称
					model.setSparesNumber(item.getSparesNumber()); // 备件名称
					model.setNumberExplain(item.getNumberExplain()); // 对应数量选择
					model.setQuantity(item.getQuantity()); // 实际数量
					model.setManHour(item.getManHour()); // 工时
					model.setNonstandardCost(item.getNonstandardCost()); // 非标准费用
					model.setStandardCost(item.getStandardCost()); // 标准费用
					model.setPayingParty(item.getPayingParty()); // 付费方
					model.setIsDevanning(item.getIsDevanning()); // 是否拆箱条目
					model.setRemarks(item.getRemarks()); // 备注
					model.setUpdateTime(new Date());
					model.setUpdateUser(getCurrentUserId());
					gohContainerEntryMapper.updateByPrimaryKey(model);
				} else {
					GohContainerEntry model = new GohContainerEntry();
					model.setGohContainer(prodGohContainerId); // 挂衣箱id
					model.setEntryName(item.getEntryName()); // 条目名称
					model.setSparesNumber(item.getSparesNumber()); // 备件号
					model.setNumberExplain(item.getNumberExplain()); // 对应数量选择
					model.setQuantity(item.getQuantity()); // 数量
					model.setManHour(item.getManHour()); // 工时
					model.setNonstandardCost(item.getNonstandardCost()); // 非标准费用
					model.setStandardCost(item.getStandardCost()); // 标准费用
					model.setPayingParty(item.getPayingParty()); // 付费方
					model.setIsDevanning(item.getIsDevanning()); // 是否拆箱条目
					model.setRemarks(item.getRemarks()); // 备注
					model.setIsDel(PlatformConstants.ISDEL_NO);
					model.setCreateTime(new Date());
					model.setCreateUser(getCurrentUserId());
					gohContainerEntryMapper.insert(model);
				}
			}
		}
	}

	/**
	 * 获取进场列表
	 */
	@Override
	public PagedList<SearchCourseOutput> getCourseList(GohListInput input) {
		// 查询箱体进场表不是挂衣箱、干箱、完工的进场信息
		CourseExample example = new CourseExample();
		CourseExample.Criteria criteria = example.createCriteria();
		criteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_01.getCode())
				.andReferralStateNotEqualTo(ReferralStateEnum.COMPLETED.getCode())
				.andIsGonContainerNotEqualTo(CommonEnum.YES.getCode());
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		if (StringUtils.isNotEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}

		// 总条数
		Integer totalItemCount = (int) courseMapper.countByExample(example);
		PagedList<SearchCourseOutput> pagedList = new PagedList<SearchCourseOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<Course> list = courseMapper.selectByExample(example);
		List<SearchCourseOutput> outList = list.stream().map(a -> {
			SearchCourseOutput model = new SearchCourseOutput();
			model.setCourseId(a.getProdCourseId());
			model.setContainerNo(a.getContainerNo()); // 箱号
			model.setContainerUserLang(a.getContainerUser()); // 用箱人
			model.setYardLang(a.getYard()); // 场站
			model.setCourseTypeLang(a.getCourseType()); // 进场类型
			model.setSizeLang(a.getSize()); // 尺寸
			model.setContainerTypeLang(a.getContainerType()); // 箱型
			model.setCourseTime(sdf.format(a.getCourseTime())); // 进场时间
			return model;
		}).collect(Collectors.toList());
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(outList);
		return pagedList;
	}

	/**
	 * 根据进场id添加挂衣箱
	 */
	@Override
	public void addGohContainerByCourseIds(String[] listIds) {
		// 添加挂衣箱数据
		for (String courseId : listIds) {
			Course course = courseMapper.selectByPrimaryKey(courseId);
			GohContainer model = new GohContainer();
			model.setCourse(course.getProdCourseId()); // 进场id
			model.setContainerNo(course.getContainerNo()); // 箱号
			model.setContainerUser(course.getContainerUser()); // 用箱人
			model.setYard(course.getYard()); // 场站
			model.setSize(course.getSize()); // 尺寸
			model.setBeforeContainerType(course.getContainerType()); // 改前箱型
			model.setIsGoh(CommonEnum.NO.getCode()); // 进场时是否标为挂衣箱
			model.setTestingState(GohStateEnum.GIHSTATE_01.getCode()); // 状态
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());
			gohContainerMapper.insert(model);
		}
		// 修改进场表挂衣箱字段
		CourseExample example = new CourseExample();
		example.createCriteria().andProdCourseIdIn(Arrays.asList(listIds));
		CourseWithBLOBs cc = new CourseWithBLOBs();
		cc.setIsGonContainer(CommonEnum.YES.getCode());
		cc.setUpdateTime(new Date());
		cc.setUpdateUser(getCurrentUserId());
		courseMapper.updateByExampleSelective(cc, example);
	}

	/**
	 * 获取挂衣箱信息
	 */
	@Override
	public GohContainerOutput getGohContainer(Integer gohId) {
		GohContainerOutput model = new GohContainerOutput();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 挂衣箱信息
		GohContainer goh = gohContainerMapper.selectByPrimaryKey(gohId);
		model.setGohContainerId(goh.getProdGohContainerId());
		model.setContainerNo(goh.getContainerNo()); // 箱号
		model.setContainerUser(goh.getContainerUser()); // 用箱人
		model.setYard(goh.getYard()); // 场站
		model.setSize(goh.getSize()); // 尺寸
		model.setBeforeContainerType(goh.getBeforeContainerType()); // 改前箱型
		model.setAfterContainerType(goh.getAfterContainerType()); // 改后箱型
		model.setStructure(goh.getStructure()); // 结构
		model.setTierNumber(goh.getTierNumber()); // 层数
		model.setReshapeType(goh.getReshapeType()); // 改制类型
		model.setSumBeamNumber(goh.getSumBeamNumber()); // 共所少梁
		model.setLoseBeamNumber(goh.getLoseBeamNumber()); // 丢失多少梁
		model.setHorizontalDistance(goh.getHorizontalDistance()); // 水平梁距
		model.setUpdownDistance(goh.getUpdownDistance()); // 上下梁距
		model.setContainerWeight(goh.getContainerWeight()); // 箱皮净重
		model.setMaterialWeight(goh.getMaterialWeight()); // 材料重
		model.setVesselVoyage(goh.getVesselVoyage()); // 船名航次
		model.setBillOfLadingNo(goh.getBillOfLadingNo()); // 提单号
		model.setDestinationPort(goh.getDestinationPort()); // 目的港
		model.setContainerCost(goh.getContainerCost()); // 客户费用
		model.setThirdPartyCost(goh.getThirdPartyCost()); // 第三方费用
		if (goh.getExtractContTime() != null)
			model.setExtractContTime(sdf.format(goh.getExtractContTime())); // 提箱日期
		model.setTestingState(goh.getTestingState()); // 检验状态
		model.setReferralState(goh.getReferralState()); // 派工状态
		model.setPickingState(goh.getPickingState()); // 领料状态
		model.setTestingStateLang(goh.getTestingState());
		model.setReferralStateLang(goh.getReferralState());
		model.setContainerRemarks(goh.getRemarks()); // 备注
		// 改制要求
		GohContRequire require = gohContRequireMapper.selectByPrimaryKey(goh.getGohContRequire());
		if (require != null) {
			model.setRequireName(require.getRequireName()); // 改制要求名称
			model.setEstimatedQuantity(require.getEstimatedQuantity()); // 预计改制个数
			model.setBeamQuantity(require.getBeamQuantity()); // 梁数
			model.setRopeQuantity(require.getRopeQuantity()); // 绳数
			model.setKnotQuantity(require.getKnotQuantity()); // 结数
			model.setBeamDistance(require.getBeamDistance()); // 梁距
			model.setKnotDistance(require.getKnotDistance()); // 绳距
			model.setAroundDistance(require.getAroundDistance()); // 前后板距离
			model.setRequireContent(require.getRequireContent()); // 改制要求
			model.setRemarks(require.getRemarks()); // 备注
		}
		// 挂衣箱条目
		GohContainerEntryExample example = new GohContainerEntryExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andGohContainerEqualTo(goh.getProdGohContainerId());
		List<GohContainerEntry> list = gohContainerEntryMapper.selectByExample(example);
		List<GohContainerEntryInput> outList = list.stream().map(a -> {
			GohContainerEntryInput cc = new GohContainerEntryInput();
			cc.setEntryId(a.getProdGohContainerEntryId()); // 条目id
			cc.setEntryName(a.getEntryName()); // 条目名称
			cc.setSparesNumber(a.getSparesNumber()); // 备件号
			cc.setNumberExplain(a.getNumberExplain()); // 对应数量选择
			cc.setQuantity(a.getQuantity()); // 数量
			cc.setManHour(a.getManHour()); // 工时
			cc.setNonstandardCost(a.getNonstandardCost()); // 非标准费用
			cc.setStandardCost(a.getStandardCost()); // 标准费用
			cc.setPayingParty(a.getPayingParty()); // 付费方
			cc.setIsDevanning(a.getIsDevanning()); // 是否拆箱条目
			cc.setRemarks(a.getRemarks()); // 备注
			return cc;
		}).sorted((a, b) -> {
			if (!StringUtils.isNotEmpty(a.getIsDevanning()))
				return 1;
			return -1;
		}).collect(Collectors.toList());
		model.setEntryList(outList);
		return model;
	}

	/**
	 * 获取挂衣箱费率
	 */
	@Override
	public List<SelectItemOutput> getRateNameSelectList(GohEntryRateInput input) {
		GohContainerRateExample example = new GohContainerRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStructureEqualTo(input.getStructure())
				.andReshapeTypeEqualTo(input.getReshapeType()).andTierNumberEqualTo(input.getTierNumber())
				.andSizeEqualTo(input.getSize());
		List<GohContainerRate> rateList = gohContainerRateMapper.selectByExample(example);
		List<String> nameList = rateList.stream().map(a -> a.getRateName()).distinct().collect(Collectors.toList());
		List<SelectItemOutput> list = nameList.stream().map(a -> {
			SelectItemOutput model = new SelectItemOutput();
			model.setValue(a);
			model.setCode(a);
			return model;
		}).collect(Collectors.toList());
		return list;
	}

	/**
	 * 获取备件号
	 */
	@Override
	public List<SelectItemOutput> getSparesNumberSelectList(GohEntryRateInput input) {
		GohContainerRateExample example = new GohContainerRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStructureEqualTo(input.getStructure())
				.andReshapeTypeEqualTo(input.getReshapeType()).andTierNumberEqualTo(input.getTierNumber())
				.andSizeEqualTo(input.getSize()).andRateNameEqualTo(input.getEntryName());
		List<GohContainerRate> rateList = gohContainerRateMapper.selectByExample(example);
		List<String> nameList = rateList.stream().map(a -> a.getSparesNumber()).distinct().collect(Collectors.toList());
		List<SelectItemOutput> list = nameList.stream().map(a -> {
			SelectItemOutput model = new SelectItemOutput();
			model.setValue(a);
			model.setCode(a);
			return model;
		}).collect(Collectors.toList());
		return list;
	}

	/**
	 * 获取对应数量
	 */
	@Override
	public List<SelectItemOutput> getQuantitySelectList(GohEntryRateInput input) {
		GohContainerRateExample example = new GohContainerRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStructureEqualTo(input.getStructure())
				.andReshapeTypeEqualTo(input.getReshapeType()).andTierNumberEqualTo(input.getTierNumber())
				.andSizeEqualTo(input.getSize()).andRateNameEqualTo(input.getEntryName())
				.andSparesNumberEqualTo(input.getSparesNumber());
		List<GohContainerRate> rateList = gohContainerRateMapper.selectByExample(example);
		List<SelectItemOutput> list = rateList.stream().map(a -> {
			SelectItemOutput model = new SelectItemOutput();
			model.setValue(a.getNumberExplain());
			model.setCode(a.getNumberExplain());
			return model;
		}).collect(Collectors.toList());
		return list;
	}

	/**
	 * 计算工时
	 */
	@Override
	public String getManHourInfo(GohEntryRateInput input) {
		String manHour = "0";
		GohContainerRateExample example = new GohContainerRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStructureEqualTo(input.getStructure())
				.andReshapeTypeEqualTo(input.getReshapeType()).andTierNumberEqualTo(input.getTierNumber())
				.andSizeEqualTo(input.getSize()).andRateNameEqualTo(input.getEntryName())
				.andSparesNumberEqualTo(input.getSparesNumber()).andNumberExplainEqualTo(input.getNumberExplain());
		List<GohContainerRate> rateList = gohContainerRateMapper.selectByExample(example);
		if (rateList.size() > 0) {
			GohContainerRate rate = rateList.get(0);
			// 工时需要乘以数量
			if (CommonEnum.YES.getCode().equals(rate.getIsMultiplyQuantity())) {
				// 数量大于费率基数时，（数量-基数）*工时，否则返回0
				if (input.getQuantity() > rate.getCardinalNumber()) {
					manHour = new BigDecimal(rate.getManHour())
							.multiply(new BigDecimal(input.getQuantity() - rate.getCardinalNumber()))
							.setScale(2, BigDecimal.ROUND_UP).toString();
				} else {
					manHour = "0";
				}
			} else {
				manHour = rate.getManHour().toString();
			}
		}
		return manHour;
	}

	/**
	 * 删除挂衣箱条目
	 */
	@Override
	public void delGohEntryList(Integer[] ids) {
		GohContainerEntryExample example = new GohContainerEntryExample();
		example.createCriteria().andProdGohContainerEntryIdIn(Arrays.asList(ids));
		GohContainerEntry model = new GohContainerEntry();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		gohContainerEntryMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 获取挂衣箱改制费用
	 */
	@Override
	public String getGohMoney(GohEntryRateInput input) {
		GohContainerCostExample example = new GohContainerCostExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andReshapeTypeEqualTo(input.getReshapeType()).andTierNumberEqualTo(input.getTierNumber())
				.andSizeEqualTo(input.getSize()).andWeightEqualTo(input.getWeight());
		List<GohContainerCost> costList = gohContainerCostMapper.selectByExample(example);
		if (costList.size() > 0 && costList.get(0).getInvoiceCost() != null) {
			return costList.get(0).getInvoiceCost().toString();
		}
		return "0";
	}

	/**
	 * 检验状态
	 */
	@Override
	public void updateTestingState(Integer id, String state) {
		GohContainer goh = gohContainerMapper.selectByPrimaryKey(id);
		// 判断状态
		if (GohStateEnum.GIHSTATE_04.getCode().equals(state)) {
			PoolGonContainerInput input = new PoolGonContainerInput();
			input.setId(goh.getProdGohContainerId()); // 主键
			input.setProdCourseId(goh.getCourse()); // 进场主键
			input.setContainerNo(goh.getContainerNo()); // 箱号
			input.setReplyTime(new Date()); // 批复时间
			input.setIsBackLease(0); // 是否退租箱
			input.setContainerUser(goh.getContainerUser()); // 用箱人
			if (GohStateEnum.GIHSTATE_05.getCode().equals(goh.getTestingState())) {
				input.setAmount(goh.getSumCost()); // 第三方费用
			} else {
				input.setAmount(goh.getThirdPartyCost()); // 第三方费用
				input.setRealTaxTotalCostRmb(goh.getContainerCost()); // 客户费用
			}
			input.setContainerCategory(ContainerCategoryEnum.CONTAINER_01.getCode()); // 箱类别
			if (StringUtils.isNotEmpty(goh.getCourse())) {
				Course course = courseMapper.selectByPrimaryKey(goh.getCourse());
				input.setYard(course.getYard());
				YardExample yardExample = new YardExample();
				yardExample.createCriteria().andKeyEqualTo(course.getYard());
				List<Yard> yardList = yardMapper.selectByExample(yardExample);
				if (yardList.size() > 0)
					input.setCompanyKey(yardList.get(0).getCompany());
			}
			input.setIsDel(PlatformConstants.ISDEL_NO);
			input.setCreateUser(getCurrentUserId());
			input.setCreateTime(new Date());
			financeService.replyAdd(input);
		} else if (GohStateEnum.GIHSTATE_05.getCode().equals(state)) {
			PoolGonContainerInput input = new PoolGonContainerInput();
			input.setProdCourseId(goh.getCourse());
			Result<Boolean> isTrue = financeService.unReplyAdd(input);
			if (isTrue != null && isTrue.getData())
				throw new InvalidException("财务已生成账单，不能撤载");
		}
		goh.setTestingState(state);
		goh.setUpdateTime(new Date());
		goh.setUpdateUser(getCurrentUserId());
		gohContainerMapper.updateByPrimaryKey(goh);
	}

	/**
	 * 派工状态
	 */
	@Override
	public void updateReferralState(Integer id, String state) {
		GohContainer goh = gohContainerMapper.selectByPrimaryKey(id);
		goh.setReferralState(state);
		goh.setUpdateTime(new Date());
		goh.setUpdateUser(getCurrentUserId());
		gohContainerMapper.updateByPrimaryKey(goh);
	}

	/**
	 * 获取拆箱条目
	 */
	@Override
	public GohContainerEntryInput getDevanning(GohEntryRateInput input) {
		GohContainerRateExample example = new GohContainerRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStructureEqualTo(input.getStructure())
				.andReshapeTypeEqualTo(input.getReshapeType()).andTierNumberEqualTo(input.getTierNumber())
				.andSizeEqualTo(input.getSize());
		List<GohContainerRate> rateList = gohContainerRateMapper.selectByExample(example);
		if (rateList.size() > 0) {
			GohContainerEntryInput model = new GohContainerEntryInput();
			GohContainerRate rate = rateList.get(0);
			model.setEntryName(rate.getRateName()); // 条目名称
			model.setManHour(rate.getManHour()); // 工时
			model.setRemarks(rate.getRemarks()); // 备注
			model.setIsDevanning(CommonEnum.YES.getCode()); // 是否拆箱条目
			return model;
		}
		return null;
	}

	/**
	 * 领料
	 */
	@Override
	public void addPickingList(Integer id) {
		// 挂衣箱条目
		GohContainerEntryExample example = new GohContainerEntryExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andGohContainerEqualTo(id);
		List<GohContainerEntry> entryList = gohContainerEntryMapper.selectByExample(example);
		// 获取包含备件号的条目
		entryList = entryList.stream().filter(a -> {
			if (StringUtils.isNotEmpty(a.getSparesNumber()))
				return true;
			return false;
		}).collect(Collectors.toList());
		if (entryList.size() > 0) {
			// 修改主表领料状态
			GohContainer goh = gohContainerMapper.selectByPrimaryKey(id);
			goh.setPickingState(PickingStateEnum.PICKINGED.getCode());
			goh.setUpdateTime(new Date());
			goh.setUpdateUser(getCurrentUserId());
			gohContainerMapper.updateByPrimaryKey(goh);
			// 生成领料单
			PickingList picking = new PickingList();
			String referralNo = "";
			Result<String> referralNoResult = warehouseClient.getBillNumberBykey("LKBILLTYPE000085",
					getCurrentCompanyKey());
			if (referralNoResult != null)
				referralNo = referralNoResult.getData();
			picking.setReferralNo(referralNo);
			picking.setPickingUser(getCurrentUserId());
			picking.setPickingTime(new Date());
			picking.setPickingState(PickingStateEnum.PICKINGED.getCode());
			picking.setCreateUser(getCurrentUserId());
			picking.setCreateTime(new Date());
			pickingListMapper.insert(picking);
			// 预出库单
			for (GohContainerEntry item : entryList) {
				PlanStock model = new PlanStock();
				model.setCourse(goh.getProdGohContainerId() + ""); // 进场id
				model.setContainerCategory(ContainerCategoryEnum.CONTAINER_01.getCode()); // 箱类别
				model.setContainerNo(goh.getContainerNo()); // 箱号
				model.setReferralNo(referralNo); // 领料单号
				model.setReferralEntryId(item.getProdGohContainerEntryId() + ""); // 挂衣箱条目id
				model.setSparesNumber(item.getSparesNumber()); // 备件号
				model.setQuantity(item.getQuantity()); // 数量
				model.setPickingQuantity(0.d); // 已领数量
				model.setBorrowQuantity(0.d); // 借件数量
				model.setPickingState(PickingStateEnum.PICKINGED.getCode()); // 领料状态
				model.setIsDel(PlatformConstants.ISDEL_NO);
				model.setCreateTime(new Date());
				model.setCreateUser(getCurrentUserId());
				planStockMapper.insert(model);
			}
		}
	}

}
