package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Tamil");
		
		driver.findElement(By.name("UserLastName")).sendKeys("Elavenil");
		
		driver.findElement(By.xpath("(//input[@name='UserEmail'])[1]")).sendKeys("elavenil@testleaf.com");
		
		WebElement dropdown = driver.findElement(By.xpath("(//select[@name='UserTitle'])[1]"));
		
		Select select = new Select(dropdown);
		
		select.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		WebElement dropdown1 = driver.findElement(By.name("CompanyEmployees"));
		
		Select select1 = new Select(dropdown1);
		
		select1.selectByValue("75");
		
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		WebElement dropdown2 = driver.findElement(By.name("CompanyCountry"));
		
		Select select2 = new Select(dropdown2);
		
		select2.selectByValue("IN");
		
//		WebElement dropdown3 = driver.findElement(By.name("CompanyState"));
//		
//		Select select3 = new Select(dropdown3);
//		
//		select3.selectByValue("Tamil_Nadu");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}

	
	}




