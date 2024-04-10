package com.qa.testAutomationPractise;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringOccurence {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String s1="Hi I Love I Love Hi India my Hi India";
		String s2[]=s1.split(" ");
		
		for(String s3:s2) {
			
			if(map.containsKey(s3)) {
				map.put(s3, map.get(s3)+1);
			}else {
				map.put(s3,1);
			}
		
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

	}

}
