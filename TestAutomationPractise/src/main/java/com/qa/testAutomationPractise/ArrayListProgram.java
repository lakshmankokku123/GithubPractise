package com.qa.testAutomationPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Lakshman");
		list.add("Ramu");
		list.add("lalitha");
		
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		

	}

}
