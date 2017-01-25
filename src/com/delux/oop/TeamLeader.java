package com.delux.oop;

public class TeamLeader extends Employee implements View {
	private int projectNum;
	private Employee emp;
	
	public void setProjectNum(int projectNum){
		this.projectNum = projectNum;
	}
	public int getProjectNum(){
		return this.projectNum;
	}
	
	public TeamLeader(Employee emp){
		this.emp = emp;
	}

	public String getDataView() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.emp.getLastName().toUpperCase() + " " + this.emp.getFirstName().toUpperCase());
		sb.append("\t" + getProjectNum());
		return sb.toString();
	}	
}
