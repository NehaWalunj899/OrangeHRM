package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Paygradetestcase extends BrowserFactory {
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		Paygrade pg = PageFactory.initElements(driver, Paygrade.class);
		pg.click();
	}


}