package day4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
// Open Browser
		ChromeDriver driver = new ChromeDriver();
		
//Launch URL "http://leaftaps.com/opentaps/control/login"
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
// Enter UserName and Password Using Id Locator
		
		WebElement UserName =driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		
//Click on Login Button using Class Locator
		
		WebElement Login = driver.findElement(By.className("decorativeSubmit"));
		Login.click();
		
//Get Title of the Page
		String CRMSFA_Page = driver.getTitle();
		System.out.println(CRMSFA_Page);
		
//Click on CRM/SFA Link
		
		WebElement CRMSFA_Link= driver.findElement(By.linkText("CRM/SFA"));
		CRMSFA_Link .click();

//Get Title of the Page
		String CreateLead_Page = driver.getTitle();
		System.out.println(CreateLead_Page);

//Click on Leads Tab
		
		WebElement Lead_Tab = driver.findElement(By.linkText("Leads"));
		Lead_Tab.equals(Lead_Tab);
		
//Click on Create Lead Button
		
		WebElement Lead_Button = driver.findElement(By.linkText("Create Lead"));
		Lead_Button.click();
		
//Enter CompanyName using id Locator
		
		WebElement Company_Name = driver.findElement(By.id("createLeadForm_companyName"));
		Company_Name.sendKeys("Cognizant");
		
//Enter FirstName using id Locator
		
		WebElement First_Name = driver.findElement(By.id("createLeadForm_firstName"));
		First_Name.sendKeys("Sugeetha");
		
//Enter FirstName using id Locator
		
		WebElement Last_Name = driver.findElement(By.id("createLeadForm_lastName"));
		Last_Name.sendKeys("Saibaba");
		
//Enter your mail-id
		
		WebElement 	Email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("psueetha19@gmai.com");
		
// Click on create Lead Button Using name Locator
		
		driver.findElement(By.name("submitButton")).click();
		

//Get Title of the Page
	
		String NextCreateLead = driver.getTitle();
		System.out.println(NextCreateLead);	

	
		
     
	}

}
