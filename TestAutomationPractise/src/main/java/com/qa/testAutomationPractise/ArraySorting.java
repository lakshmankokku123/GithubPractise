package com.qa.testAutomationPractise;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {
		
		int array1[]= {10,9,45,6,34,66,77,99};
		
		int temp=0;
		
		for(int i=0;i<array1.length-1;i++) {
			
			for(int j=1;j<array1.length-1;j++) {
				
				if(array1[i] > array1[j]){
					
					temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
					
					
					
				}
				
				
			}
			
			
		}
		

		for(int i=0;i<array1.length;i++) {
			
			
			System.out.println(array1[i]);
		}
		
		Arrays.sort(array1);
		System.out.println("-------------------------------");
		for(int i=0;i<array1.length;i++) {
			
			
			
			System.out.println(array1[i]);
		}
	}

}
