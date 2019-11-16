package com.sanlly.common.models.output.pagination;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PagedList<T>{


	/**
	 * 当前页码
	 */
	private Integer currentPageIndex;
	
	/**
	 * 总页数
	 */
	@SuppressWarnings("unused")
	private Integer totalPageCount;
	
	/**
	 * 数据总条数
	 */
	private Integer totalItemCount;
	
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	
	/**
	 * 当前数据
	 */
	private List<T> dataList;
	
	@SuppressWarnings("unused")
	private PagedList() {}
	
	public PagedList(PagedList<T> list){
		this(list.getCurrentPageIndex(),list.getPageSize(),list.totalItemCount,list.getDataList());
	}
	public  PagedList(Integer currentPageIndex,Integer pageSize){
		this(currentPageIndex,pageSize,null,null);
	}
	public  PagedList(Integer currentPageIndex,Integer pageSize,Integer totalItemCount){
		this(currentPageIndex,pageSize,totalItemCount,null);
	}
	public  PagedList(Integer currentPageIndex,Integer pageSize,Integer totalItemCount,List<T> pageDataList){
		this.currentPageIndex=currentPageIndex;
		this.pageSize=pageSize;
		this.totalItemCount=totalItemCount==null?0:totalItemCount;
		this.dataList=pageDataList==null?new ArrayList<T>():pageDataList;
	}
	
	@JsonIgnore
	public Integer getLimitStart(){
		if(this.getCurrentPageIndex()<0){
			return this.getCurrentPageIndex();
		}
		int i=this.getCurrentPageIndex().intValue()>0?this.getCurrentPageIndex().intValue():1;
		return (i-1)*this.getPageSize().intValue();
	}
	
	@JsonIgnore
	public Integer getLimitEnd(){
		return this.getPageSize();
	}
	
	public Integer getCurrentPageIndex() {
		return currentPageIndex;
	}

	public void setCurrentPageIndex(Integer currentPageIndex) {
		this.currentPageIndex = currentPageIndex;
	}

	public Integer getTotalPageCount() {
		float yushu=this.getTotalItemCount().floatValue()%this.getPageSize().floatValue();
		int zhengshu=(int)(this.getTotalItemCount().floatValue()/this.getPageSize().floatValue());
		if(yushu==0f){
			return zhengshu;
		}
		else{
			return zhengshu+1;
		}
	}

	public void setTotalPageCount(Integer totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
 
	public Integer getTotalItemCount() {
		return totalItemCount;
	}
	public void setTotalItemCount(Integer totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	
	/**
	 * 一维列表按照指定条数拆分成多维
	 * @param param 参数
	 * @param maxSize 指定最大条数
	 * @return
	 */
	public static <T> List<List<T>> subList(List<T> param,int maxSize){
		List<List<T>> resultList=new ArrayList<List<T>>();
		if(param==null){
			return resultList;
		}
		int currentLength=param.size();
		if(currentLength<maxSize){
			resultList.add(param);
		}
		else{
			int totalCount=currentLength%maxSize==0?currentLength/maxSize:(currentLength/maxSize+1);
			for(int i=0;i<totalCount;i++){
				int startSize=i*maxSize;
				int stopSize=(i+1)*maxSize>currentLength?currentLength:(i+1)*maxSize;
				resultList.add(param.subList(startSize, stopSize));
			}
		}
		return resultList;
	}
	
	/**
	 *   将当前分页数据转为其他类型的分页数据
	 *   相当于:
	 * 
	 * <pre class="code">
	 * List&lt;S&gt; newList=this.getDataList().stream().map(func).collect(Collectors.toList());
	 * return new PagedList&lt;S&gt;(this.getPageIndex(),this.getPageSize(),this.getTotalItemCount(),newList);
	 * </pre>
	 * 使用示例：
	 * <pre class="code">
	 * &#047;&#047;数据库分页查询
	 * PagedList&lt;Source&gt; sourcePagedList=sourceDao.selectByPageWithBLOBs(example, new PageInput(input.getPageIndex(),input.getPageSize()));
	 * &#047;&#047;转为新类型的分页信息
	 * PagedList&lt;TargetOutput&gt; targetPagedList=sourcePagedList.convertType(record->{
	 * 		TargetOutput item=new TargetOutput();
	 * 		BeanUtils.copyProperties(record, item);
	 * 		return item;
	 * 	});
	 * </pre>
	 * @param <S> 新的数据类型
	 * @param mapper 原始数据与新的数据类型的转换
	 * @return 新类型的分页数据
	 */
	public <S> PagedList<S> convertType(Function<? super T,S> mapper){
		if(this.getDataList()==null) {
			return new PagedList<S>(this.getCurrentPageIndex(),this.getPageSize(),this.getTotalItemCount());
		}
		else {
			List<S> newList=this.getDataList().stream().map(mapper).collect(Collectors.toList());
			return new PagedList<S>(this.getCurrentPageIndex(),this.getPageSize(),this.getTotalItemCount(),newList);
		}
	}
}
