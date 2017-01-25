package com.delux;

import java.util.LinkedHashSet;
import java.util.Set;

public class Convert_Array_LinkedHashSet {

	
	public static void main(String[] args) {
		String[] countries={"Cambodia","Vietnam","Thailand","USA","Cambodia","France","England","Vietnam","Cambodia"};

		Set<String> linkHashSet = new LinkedHashSet<String>();
		for(int i=0; i < countries.length; i++){
			linkHashSet.add(countries[i]);	
		}
		
		System.out.println("Country name : " + "Cambodia " + (isCountryExist(linkHashSet, "Cambodia") ? "is found in the object" : "is not found in the object"));
		System.out.println("Country name : " + "Singapore " + (isCountryExist(linkHashSet, "Singapore") ? "is found in the object" : "is not found in the object"));
		
	}
	
	public static boolean isCountryExist(Set<String> Set, String countryName){
		return (Set.contains(countryName));
	}

}
