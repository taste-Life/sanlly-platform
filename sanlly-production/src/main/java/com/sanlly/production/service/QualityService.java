package com.sanlly.production.service;

import java.text.ParseException;
import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.quality.QaQualityInput;
import com.sanlly.production.models.input.quality.QualityCourseEntryInfoInput;
import com.sanlly.production.models.input.quality.QualityEntryListInput;
import com.sanlly.production.models.input.quality.SearchQaListInput;
import com.sanlly.production.models.input.quality.SearchSonQualityListInput;
import com.sanlly.production.models.output.quality.QualityInfoOutput;
import com.sanlly.production.models.output.quality.SearchQaListOutput;
import com.sanlly.production.models.output.quality.SearchSonQualityListOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 安全品控接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月10日 下午1:30:50 
 * @version V1.0   
 */
public interface QualityService {

	/**
	 * 子公司现场质检列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return List<E> @throws 
	 */
	PagedList<SearchSonQualityListOutput> getSonQualityList(SearchSonQualityListInput input) throws ParseException;;

	/**
	 * 子公司现场质检合格
	 * 
	 * @Description: TODO
	 * @param course
	 * @param photo
	 *            void @throws 
	 */
	void sonQualityYes(String courseId, String photo);

	/**
	 * 子公司复检合格
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param photo
	 *            void @throws 
	 */
	void sonQualityAgainYes(String courseId, String photo);

	/**
	 * 根据进场id和箱类别获取质检条目数据
	 * 
	 * @Description: TODO void @throws 
	 */
	QualityInfoOutput getQualityEntryList(String prodCourseId, String containerCategory);

	/**
	 * 删除质检明细
	 */
	void qualityEntryDelete(QualityEntryListInput input);

	/**
	 * 质检保存
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void saveQualityCourserEntryInfo(QualityCourseEntryInfoInput input);

	/**
	 * 质检好转坏
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void uploadQualityCourserEntryInfo(QualityCourseEntryInfoInput input);

	/**
	 * 获取问题类别
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getQuestionList(String containerCategory);

	/**
	 * 整改标准
	 * 
	 * @Description: TODO
	 * @param containerCategory
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getStandardList(String question);

	/**
	 * 错项、漏项、返工原因
	 * 
	 * @Description: TODO
	 * @param reasonType
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getQualityCauseList(String reasonType);

	/**
	 * 品控质检列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchQaListOutput> @throws 
	 */
	PagedList<SearchQaListOutput> getQaList(SearchQaListInput input) throws ParseException;

	/**
	 * 品控部质检通过
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param containerCategory
	 *            void @throws 
	 */
	void qaQualityYes(QaQualityInput input);

	/**
	 * 品控部质检不通过
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param containerCategory
	 *            void @throws 
	 */
	void qaQualityNo(QaQualityInput input);

	/**
	 * 复检合格
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void recheckOk(QualityCourseEntryInfoInput input);

	/**
	 * 复检不合格
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void recheckNo(QualityCourseEntryInfoInput input);
}
