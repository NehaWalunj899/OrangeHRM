
package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Admintestcase extends BrowserFactory {
	@Test
	public static void Admin() throws InterruptedException{
		Admin ad = PageFactory.initElements(driver, Admin.class);
		ad.click();
	}

}
