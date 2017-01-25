package com.delux;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertAll_List_Map {


	public static void main(String[] args) {
		List<String> countries = CountiesList.getAllCountries();
		Map<String, String> map = new HashMap<String, String>();
		for(String country : countries){
			map.put(country.substring(0,1), getCountries(country.substring(0,1), countries));
		}
		System.out.println(map.entrySet());

	}
	private static String getCountries(String firstLetterCountry, List<String> countries) {
		String countriesStr = "";
		for(String c : countries){
			if(c.substring(0, 1).equalsIgnoreCase(firstLetterCountry)) countriesStr += c + ",";
		}
		return countriesStr.substring(0, (countriesStr.length()-1));
	}

}
