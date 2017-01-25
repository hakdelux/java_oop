package com.delux.oop;

import java.util.Date;

public class DCommon {
	private int id;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	private String state;
	private String version;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getcreatedDate(){
		return createdDate;
	}
	public void setcreatedDate(Date createdDate){
		this.createdDate=createdDate;
	}
	
	public Date getupdatedDate(){
		return updatedDate;
	}
	public void setupdatedDate(Date updatedDate){
		this.updatedDate=updatedDate;
	}
	public String getcreatedBy(){
		return createdBy;
	}
	public void setcreatedBy(String createdBy){
		this.createdBy=createdBy;
	}
	public String getupdatedBy(){
		return updatedBy;
	}
	public void setupdatedBy(String updatedBy){
		this.updatedBy=updatedBy;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getversion(){
		return version;
	}
	public void setversion(String version){
		this.version=version;
	}
}
