package assignment.week2;

//Facebook Registration Automation
// this is to import the WebElement class, to handle the elements on the web page
import org.openqa.selenium.WebElement;
// this is to import the By class, to locate elements on the web page
import org.openqa.selenium.By;
// this is to import the ChromeDriver class, to use the Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
// this is to import the Duration class, to set timeouts
import java.time.Duration;
// this is to import the Select class, to handle dropdowns
import org.openqa.selenium.support.ui.Select;

// this is the main class to automate Facebook registration
public class AutoFbRegistration {
    public static void main(String[] args) {
        // chrome driver setup
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        // to maximize the browser window
        driver.manage().window().maximize();
        // to set an implicit wait of 10 seconds, this will wait for elements to load
        // before throwing an exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // to find all the elements and perform actions in the facebook registration form
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Vidhya");
        driver.findElement(By.name("lastname")).sendKeys("Divakar");
        driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
        // here we are handling the dropdowns for date of birth using the Select class
        // and other dropdown methods
        //here daydropdownOptions, monthdropdownOptions, yeardropdownOptions are object names for Select class
        // you can use selectByValue() and selectByVisibleText() interchangeably, 
        //as long as the option has both a value and visible text that match what you expect.
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select daydropdownOptions = new Select(dayDropdown);
        daydropdownOptions.selectByValue("21");
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select monthdropdownOptions = new Select(monthDropdown);
        monthdropdownOptions.selectByVisibleText("May");
        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select yeardropdownOptions = new Select(yearDropdown);
        yeardropdownOptions.selectByVisibleText("1995");
        // Selecting the radio button using xpath
        driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();

    }
}