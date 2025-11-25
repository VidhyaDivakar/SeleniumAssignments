package assignment.week3;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//use xpath if duplicate
		driver.findElement(By.linkText("Create Lead")).click();
		//enter Company Name field using XPath// USING XPATH FOR ID INPUT TAG
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("FinTech");
		// Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jason");
		// Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Powell");
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jase");
		//Enter the LastName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Pow");
		
		//Enter the Department Field Using Locator.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		
		//Enter the Description Field Using any Locator
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead for the Finance Department, who will be responsible for the entire FinTech's Risk Management ");
		//Enter your email in the E-mail address Field using the locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("JasonPowell@FinTechRisk.com");
		
		// Select State/Province as NewYork Using Visible Text.
		WebElement geoDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdownOptions=new Select(geoDropdown);
		dropdownOptions.selectByValue("NY");
		// Click Submit by locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		// Click Edit, to edit the record used xpath inside the single tag, and then used index, coz there were 7 instances
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		// Clear the Description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		// Add notes in important field, in the Update form
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("FinTech Credential - FinNumber456");
		//for update button using xpath, and it showed three instance, Update button is first of its kind. so did no use index
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.getTitle();
		System.out.println("This is the page");
		driver.close();
		
}
}	