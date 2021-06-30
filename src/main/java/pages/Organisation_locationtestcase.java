package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Organisation_locationtestcase extends BrowserFactory{
	@Test
	public static void Login() throws InterruptedException {
		
		
		Organisation_Location loc = PageFactory.initElements(driver, Organisation_Location.class);
		loc.click();
	}

}
