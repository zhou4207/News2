package com.newcapec.edu.entity;

import java.util.List;

public class PageBean <T>{
	//数据显示的当前页码  ，默认第一页
	private int currentPage=1;
	//设置每一页显示多少数据
	private int pageCount=15;
	//获取数据库有多少数据
	private int totalCount;
/*数据能够显示多少页
* totalPage=totalCount%pageCount==0
* ?totalCount/pageCount:(totalCount/pageCount+1)
	 * */
	private  int totalPage;	
	//相关页面查询到的数据
	private List<T>  pageData;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getPageData() {
		return pageData;
	}
	public void setPageData(List<T> pageData) {
		this.pageData = pageData;
	}
	
	
}
