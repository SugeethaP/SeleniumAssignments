package week5.Day1Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("inputLogin")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		//Handle second Window		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindow = new ArrayList<String>(windowHandles);		
		driver.switchTo().window(lstWindow.get(1));
		
		//TakeScreenShot
		
		File Source = driver.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./snap/Widget1.png");
		//Merger dest and source
		FileUtils.copyFile(Source, Dest);
		
		//Click on First Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//Switch Back from second to first Window
		driver.switchTo().window(lstWindow.get(0));
		
		//Click on Widget of From Contact
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
				
				//Handle second Window		
				Set<String> windowHandles1= driver.getWindowHandles();
				List<String> lstWindow1 = new ArrayList<String>(windowHandles1);		
				driver.switchTo().window(lstWindow1.get(1));
				
				//TakeScreenShot
				
				File Source1 = driver.getScreenshotAs(OutputType.FILE);
				File Dest1= new File("./snap/Widget2.png");
				//Merger dest and source
				FileUtils.copyFile(Source1, Dest1);
				
				//Click on First Resulting Contact
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
				
		//Switch Back from second to first Window
				driver.switchTo().window(lstWindow.get(0));
				
				//Click on Merge button using Xpath Locator
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				
				//Handle Alert and Accept it
				
				Alert alert = driver.switchTo().alert();
				alert.accept();
				
				//Verify the title of the page
				 String VerifyPageTitle = driver.getTitle();
				 System.out.println(VerifyPageTitle);
				

	}

}
