package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class structuretestcase extends BrowserFactory {
	
	@Test
	public static void Login() throws InterruptedException {
		
		
		structure st = PageFactory.initElements(driver, structure.class);
		st.click();
	}


}