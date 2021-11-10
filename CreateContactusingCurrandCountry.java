package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactusingCurrandCountry {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");;
	driver.findElement(By.id("password")).sendKeys("crmsfa");;
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Tamil");;
	driver.findElement(By.id("lastNameField")).sendKeys("Elavenil");;
	WebElement dropdown = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
	Select select = new Select(dropdown);
	//select.selectByValue("INR - Indian Rupee");
	select.selectByVisibleText("INR - Indian Rupee");
	WebElement dropdown1 = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
	Select select1 = new Select(dropdown1);
	select1.selectByValue("IND");
	driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	//driver.findElement(By.name("submitButton")).click();
	
	
}



}

