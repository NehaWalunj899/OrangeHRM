package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Employmentstatus {
	@FindBy(how = How.ID,using = "menu_admin_Job")
	WebElement job;
	
	@FindBy(how = How.ID,using = "menu_admin_employmentStatus")
	WebElement EmploymentStatus;
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement Add;
	
	@FindBy(how = How.ID,using = "empStatus_name")
	WebElement Name;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement Save;
	
	public void click() throws InterruptedException {
		job.click();
		EmploymentStatus.click();
		 Add.click();
		 
		 Name.sendKeys("employe");
		 
		 Save.click();
		 Thread.sleep(5000);
	}

}
