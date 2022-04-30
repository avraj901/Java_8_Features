package com.sor.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("eight", 8);
		map.put("four", 4);
		map.put("Ten", 2);
		map.put("Two", 10);
		
		List<Entry<String, Integer>>  entries = new ArrayList<>(map.entrySet());
		
		/*
		 * Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
		 * 
		 * 
		 * @Override public int compare(Entry<String, Integer> arg0, Entry<String,
		 * Integer> arg1) { //return arg0.getKey().compareTo(arg1.getKey()); return
		 * arg0.getValue()- arg1.getValue(); }
		 * 
		 * });
		 * 
		 * 
		 * 
		 * });
		 */
		
	/*	Collections.sort(entries, (arg0,  arg1) -> {
				//return arg0.getKey().compareTo(arg1.getKey());
				return arg0.getValue()- arg1.getValue();
			});
	
	for(Entry<String, Integer> entry : entries) {
		System.out.println(entry.getKey() +" "+ entry.getValue());
	}*/
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
