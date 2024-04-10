package TestAutomationPractise.TestAutomationPractise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		//Actions action =new Actions(driver);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the input string ");
		String s1=sc.nextLine();
		System.out.println("output string is "+s1);

	}

}
