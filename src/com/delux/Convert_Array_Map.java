package com.delux;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Convert_Array_Map {

	static String[] countries={"Cambodia","Vietnam","Thailand","USA","Cambodia","France","England","Vietnam","Cambodia"};
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> tree = new TreeMap<String, Integer>();
		for(Integer i=0;i<countries.length;i++){
			map.put(countries[i], getNumOfDuplicate(countries[i]));
			tree.put(countries[i], getNumOfDuplicate(countries[i]));
		}
		System.out.println("HashMap");
		System.out.println(map.entrySet());
		System.out.println("TreeMap");
		System.out.println(tree.entrySet());

	}
	private static Integer getNumOfDuplicate(String country) {
		int count = 0;
		for(String c : countries){
			if(c.equalsIgnoreCase(country)) count++;
		}
		return count;
	}

}
