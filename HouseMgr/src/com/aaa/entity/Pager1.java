package com.aaa.entity;

import java.util.ArrayList;
import java.util.List;

public class Pager1 {
	//传参或者定
	private int curPage;
	private int pageSize;
	
	//需要从数据库中找出
	private long rowCount;
	private List<?> list;
	
	//可以根据上面属性计算得到
	private int totalPages;
	private int startRow;
	private int first=1;
	private int last;
	private int next;
	private int prev;
	
	private int start;
	private int end;
	private int numCount=10;
	public List<String> showPages=new ArrayList<String>();
	private String queryUrl;
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		if(curPage<=0) 
			this.curPage=1;
		else
			this.curPage = curPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getRowCount() {
		return rowCount;
	}
	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getPrev() {
		return prev;
	}
	public void setPrev(int prev) {
		this.prev = prev;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getNumCount() {
		return numCount;
	}
	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}
	public List<String> getShowPages() {
		return showPages;
	}
	public void setShowPages(List<String> showPages) {
		this.showPages = showPages;
	}
	public String getQueryUrl() {
		return queryUrl;
	}
	public void setQueryUrl(String queryUrl) {
		this.queryUrl = queryUrl;
	}
	
	public Pager1(int curPage,int pageSize,long rowCount){
		this.curPage=curPage;
		this.pageSize=pageSize;
		this.rowCount=rowCount;
		
		//总页数
		this.totalPages=(int)Math.ceil((double)rowCount/pageSize);
		this.startRow=(this.curPage-1)*pageSize;
		this.last=this.totalPages;
		this.next=Math.min(this.totalPages, this.curPage+1);
		this.prev=Math.max(1, this.curPage-1);
		
		//计算page控制
		start=Math.max(this.curPage-numCount/2, first);
		end=Math.min(start+numCount, last);
		if(end-start<numCount){
			start=Math.max(end-numCount, 1);
		}
		for (int i = start; i <=end; i++) {
			showPages.add(String.valueOf(i));
		}
		
		
	}
	
	
}
