package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Email:']/following::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password:']/following::input")).sendKeys("leaf@12");
		//driver.findElement(By.className("btn btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='control-group form-group']/following-sibling::button[1]")).click();
		driver.close();
	}

}


//kumar.testleaf@gmail.com

//label[text()='Email:']/following::input