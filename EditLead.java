package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");;
		driver.findElement(By.id("password")).sendKeys("crmsfa");;
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		//driver.findElement(By.name("firstName)[3]")).sendKeys("tamil");;
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("tamil");
		//driver.findElement(By.xpath("(//label[text()='First name:']/following::input)[3]")).sendKeys("tamil");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		String title = driver.getTitle();
		Thread.sleep(1000);
		System.out.println(title);
		String title1 = "View Lead";
		boolean check = title.contains(title1);
		System.out.println(check);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		String companyName = "Infosys";
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
		String verify = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (verify.contains(companyName)) {
			System.out.println("The company name is updated successfully as "+ companyName);
		}
		
		driver.close();
	}

}

