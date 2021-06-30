package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Jobcategoriestestcase extends BrowserFactory {
	@Test
	public static void Login() throws InterruptedException {
		
		
		Jobcategories cy = PageFactory.initElements(driver, Jobcategories.class);
		cy.click();
	}

}
