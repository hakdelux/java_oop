package com.delux.oop;

public class Employee extends Person implements View{
	private Double salary;
	private String holiday;
	private int years;
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getDataView() {
		return super.getId() + "\n" + super.getcreatedDate() + "\n" +
			   super.getcreatedBy() + "\n" + super.getupdatedDate() + "\n" +
			   super.getupdatedBy() + "\n" + super.getState() + "\n" +
			   super.getversion() + "\n" + super.getLastName() + "\n" + super.getFirstName() + "\n" +
			   getSalary() + "\n" + getHoliday() + "\n" +  getYears();
	}
}
