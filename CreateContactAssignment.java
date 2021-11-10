package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");;
		driver.findElement(By.id("password")).sendKeys("crmsfa");;
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tamil");;
		driver.findElement(By.id("lastNameField")).sendKeys("Elavenil");;
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Elavenil");;
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Tamil");;
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Engineer");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Experienced");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("elavenil0@gmail.com");
		WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Very Important");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}

