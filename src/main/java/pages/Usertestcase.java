package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Usertestcase extends BrowserFactory{
	@Test
	public static void Login() throws InterruptedException {
		
		
		User us = PageFactory.initElements(driver, User.class);
		us.click();
	}


}
