package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Qualificationtestcase extends BrowserFactory {
	
	
	@Test
	public static void Login() throws InterruptedException {
		
		
		Qualification qc = PageFactory.initElements(driver, Qualification.class);
		qc.click();
	}


}