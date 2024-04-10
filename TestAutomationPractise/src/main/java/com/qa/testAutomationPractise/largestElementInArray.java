package com.qa.testAutomationPractise;

public class largestElementInArray {

	public static void main(String[] args) {
	
		int array1[]= {10,9,87,56,33,56,98,101,23};
		int max=array1[0];
		int min=array1[0];
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]<min) {
				min=array1[i];
			}else if(array1[i]>max) {
				max=array1[i];
			}
			
			
		}
		
		System.out.println("Largest Number: " +max+";Smallest number : " +min);

	}

}
