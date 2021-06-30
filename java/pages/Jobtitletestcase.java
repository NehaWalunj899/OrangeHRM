package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Jobtitletestcase extends BrowserFactory {
	@Test
	public static void Login() throws InterruptedException {
		
		
		Jobtitle jt = PageFactory.initElements(driver, Jobtitle.class);
		jt.click();
	}

}
