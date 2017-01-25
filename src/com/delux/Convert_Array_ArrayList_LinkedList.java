package com.delux;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Convert_Array_ArrayList_LinkedList {

	public static void main(String[] args) {
		
		String[] countries={"Cambodia","Vietnam","Thailand","USA","Cambodia","France","England","Vietnam","Cambodia"};
		
		List<String> list = new ArrayList<String>();
		List<String> linkList = new LinkedList<String>();
		for(Integer i=0;i<countries.length;i++){
			list.add(countries[i]);
			linkList.add(countries[i]);
		}
		
		System.out.println("List type: " + list.getClass().getSimpleName() + " , total size : " + list.size() + "\nElements : " + list);

	}

}
