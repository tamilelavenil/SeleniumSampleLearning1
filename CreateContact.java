import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

		 public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");;
			driver.findElement(By.id("password")).sendKeys("crmsfa");;
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");;
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tamil");;
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elavenil");;
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			System.out.println("The browser title is :" +title);
			String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println("The Company Name is: " +companyname);
			String statusId = driver.findElement(By.id("viewLead_statusId_sp")).getText();
			System.out.println("The status is: " +statusId);
			driver.findElement(By.linkText("opentaps")).click();
			driver.close();	

			//driver.close();
	}}

