package com.delux.oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setcreatedDate(new Date());
		emp.setcreatedBy("Engineering");
		emp.setupdatedDate(new Date());
		emp.setupdatedBy("IT");
		emp.setState("Banteay Meanchey");
		emp.setversion("1.0.0");
		emp.setBirthDate(new Date());
		emp.setFirstName("Hak");
		emp.setLastName("Delux");
		emp.setSalary(1000.0);
		emp.setHoliday("Happy New Year");
		emp.setYears(5);
		
		Developer dev = new Developer(emp);
		dev.setComment("Programmer");
		
		TeamLeader leader = new TeamLeader(emp);
		leader.setProjectNum(5);
		
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(dev);
		list.add(leader);
		
		for(Employee e : list){
			System.out.println(e.getDataView());
		}

	}

}
