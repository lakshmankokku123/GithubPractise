package TestAutomationPractise.TestAutomationPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElement ele=null;
		Select sc=new Select(ele);
		WebElement  ele2=sc.getOptions().get(7);
		ele2.getText();
		

	}

}
