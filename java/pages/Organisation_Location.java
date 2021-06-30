package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Organisation_Location{
	@FindBy(how = How.ID,using = "menu_admin_Organization")
	WebElement organization;
	
	@FindBy(how = How.ID,using = "menu_admin_viewLocations")
	WebElement location;
	
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement add;
	
	@FindBy(how = How.ID,using = "location_name")
	WebElement Name;
	
	@FindBy(how = How.ID,using = "location_country")
	WebElement country;
	
	@FindBy(how = How.ID,using = "location_province")
	WebElement state;
	

	@FindBy(how = How.ID,using = "location_city")
	WebElement city ;
	
	@FindBy(how = How.ID,using = "location_phone")
	WebElement phone;
	

	@FindBy(how = How.ID,using = "btnSave")
	WebElement save ;
	
	
	public void click() throws InterruptedException {
		organization.click();
		location.click();
		 add.click();
		 
		 Name.sendKeys("Bvp Office");
		 Thread.sleep(5000);
		 country.sendKeys("India");
		state.sendKeys("maharashta");
		phone.sendKeys("4597534856");
		 
		 city.sendKeys("pune");
		 country.sendKeys("India");
		 
		 save.click();
		 Thread.sleep(10000);
	}
}

