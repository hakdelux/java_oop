package com.delux.oop;

public class Developer extends Employee implements View {
	private String comment;
	private Employee emp;
	
	public void setComment(String comment){
		this.comment = comment;
	}
	public String getComment(){
		return this.comment;
	}
	
	public Developer(Employee emp){
		this.emp = emp;
	}
	
	public String getDataView(){
		return this.emp.getLastName() + " " + this.emp.getFirstName() + "\t" + getComment() + "\t" + this.emp.getSalary();
	}
}
