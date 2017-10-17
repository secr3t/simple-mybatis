package com.sample.demo1.vo;


public class Todo {

	private int no;
	private String title;
	private String dates;
	private String contents;
	private boolean completed;
	private boolean deleted;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCompleted() {
		return completed ? "예" : "아니오";
	}
	public void setCompleted(String completed) {
		this.completed = completed =="예" ? true : false;
	}
	public String getDeleted() {
		return deleted ? "Y" : "N";
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted =="Y" ? true : false;
	}
}
