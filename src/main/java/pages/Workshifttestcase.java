package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Workshifttestcase extends BrowserFactory {
	@Test
	public static void Login() throws InterruptedException {
		
		
		Workshift ws = PageFactory.initElements(driver, Workshift.class);
		ws.click();
	}

}
