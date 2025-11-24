package assignment.week3;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) {
		
		//ChromeOptions-execute the testcase in Chrome browser in guest mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		// Step 1 Launch the Browser
		ChromeDriver driver = new ChromeDriver(options);
		
		// Step2 Load the url
		driver.get("http://leaftaps.com/opentaps/");
		// Step3:Maximize the browser to clearly view the elements
		driver. manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		// used x-path coz, this is the particular row details, Lead ID, which can change, 
		// so looked for the parent tag - div and used the first instance of a tag
		driver.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		// can't use two methods getText(), click() in the same line so used in two lines.
		driver.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();	
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click(); // not sure what to use
		//when i used "Lead ID as linkText, it is now working as it has two items with the same name, so
		//using this following xpath with class attribute, label tag at the end. 
		driver.findElement(By.xpath("//div[@id ='x-form-el-ext-gen246']/input")).sendKeys("10034");
		driver.findElement(By.linkText("Find Leads")).click(); // not sure what to use
		driver.close();
		
}
}	