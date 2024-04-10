package com.qa.testAutomationPractise;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {10,23,1,3,4,6};
		int sum=0;
		for(int i=0;i<array1.length;i++) {
			
			sum =array1[i]+sum;

		}
		System.out.println(sum);
	}

}
