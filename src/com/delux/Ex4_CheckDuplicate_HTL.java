package com.delux;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Ex4_CheckDuplicate_HTL {

	public static void main(String[] args) {
		String[] countries={"Cambodia","Vietnam","Thailand","USA","Cambodia","France","England","Vietnam","Cambodia"};
		
		checkDuplicate(new HashSet<String>(), countries);
		checkDuplicate(new TreeSet<String>(), countries);
		checkDuplicate(new LinkedHashSet<String>(), countries);
	}
		
	public static void checkDuplicate(Set<String> set, String[] countries){		
		for(int i=0; i < countries.length; i++){
			set.add(countries[i]);	
		}
		
		System.out.println("Set type = " + set.getClass().getName() + " " + set);
	}
}
