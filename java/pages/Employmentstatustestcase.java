package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Employmentstatustestcase extends BrowserFactory{
	@Test
	public static void Login() throws InterruptedException {
		
		
		Employmentstatus emp = PageFactory.initElements(driver, Employmentstatus.class);
		emp.click();
	}
	

}
