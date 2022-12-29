package com.lec.mvc.vo;

public class PageInfo {

	private int currentPage;
	private int totalPage;
	private int startPage;
	private int endPage;
	private int totalCount;



	public int getCurrentPage() {return currentPage;}
	public void setCurrentPage(int currentPage) {this.currentPage = currentPage;}

	public int getTotalPage() {return totalPage;}
	public void setTotalPage(int totalPage) {this.totalPage = totalPage;}

	public int getStartPage() {return startPage;}
	public void setStartPage(int startPage) {this.startPage = startPage;}

	public int getEndPage() {return endPage;}
	public void setEndPage(int endPage) {this.endPage = endPage;}

	public int getTotalCount() {return totalCount;}
	public void setTotalCount(int totalCount) {this.totalCount = totalCount;}


	@Override
	public String toString() {
		return "PageInfo [currentPage=" + currentPage + ", totalPage=" + totalPage + ", startPage=" + startPage
				+ ", endPage=" + endPage + ", totalCount=" + totalCount + "]";
	}
	
}