package TestAutomationPractise.TestAutomationPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		
		List<WebElement> ele= driver.findElements(By.tagName("a"));
		
		for(WebElement ele1:ele) {
			
			String url=ele1.getAttribute("href");
			
			verifyLink(url);
			
		}
		
		

	}
	
	public static void verifyLink(String url1) {
		
		
		
		
	}

}
