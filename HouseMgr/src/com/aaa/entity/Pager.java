package com.aaa.entity;

import java.util.List;

public class Pager {
	private List datas;
	private int totalPages;
	private int curPage;
	private int pageSize=2;
	private int totalRecords;
	public List getDatas() {
		return datas;
	}
	public void setDatas(List datas) {
		this.datas = datas;
	}
	public int getTotalPages() {
		return (getTotalRecords()+getPageSize()-1)/getPageSize();
	}

	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		if(curPage<1){
			this.curPage=1;
		}else{
			this.curPage = curPage;
		}
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public int getFirstPage(){
		return 1;
	}
	
	public int getPrevPage(){
		return getCurPage()<=1?1:getCurPage()-1;
	}
	
	public int getNextPage(){
		return getCurPage()>=getTotalPages()?getTotalPages():getCurPage()+1;
	}
	
	public int getLastPage(){
		return getTotalPages()==0?1:getTotalPages();
	}
	
	
	

}
