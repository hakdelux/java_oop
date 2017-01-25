package com.delux;

import java.util.Set;
import java.util.TreeSet;

public class Duplicate_Country_TreeSet {


	public static void main(String[] args) {
		String[] countries={"Cambodia","Vietnam","Thailand","USA","Cambodia","France","England","Vietnam","Cambodia"};
		
		Set<String> uniqeSet = new TreeSet<String>();
		Set<String> duplicateSet = new TreeSet<String>();
		
		for (int i=0; i < countries.length; i++){
			if(!uniqeSet.add(countries[i])){
				duplicateSet.add(countries[i]);
			}
			
		}
		System.out.println("Result of Duplicate Country Name are:");
		for(String duplicate: duplicateSet){
			System.out.println(duplicate);
			
		}
		System.out.println("-------------------------------------");
		System.out.println("There are "+ uniqeSet.size()+ " counties: "+ uniqeSet);
		

	}

}
