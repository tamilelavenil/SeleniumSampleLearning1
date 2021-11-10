package week2.day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateNewAccountFacebook {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tamil");
		driver.findElement(By.name("lastname")).sendKeys("Elavenil");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("elavenil@gmail.com");
		driver.findElement(By.xpath("(//input[@name='reg_email_confirmation__'])[1]")).sendKeys("elavenil@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("QWEasd@123");
		WebElement dropdown = driver.findElement(By.name("birthday_day"));
		Select select = new Select(dropdown);
		select.selectByValue("6");
		WebElement dropdown1 = driver.findElement(By.name("birthday_month"));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("9");
		WebElement dropdown2 = driver.findElement(By.name("birthday_year"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("1996");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}



