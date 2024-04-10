package com.qa.testAutomationPractise;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String s1="LakshmanKokkRamu";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char[] c=s1.toCharArray();
		for(char c1: c) {
			if(map.containsKey(c1)) {
					
				map.put(c1, map.get(c1)+1);
				
			}else {
				
				map.put(c1,1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey() +" "+entry.getValue());
			}
			
		}

	}

}
