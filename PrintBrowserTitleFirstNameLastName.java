import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintBrowserTitleFirstNameLastName {

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
		driver.findElement(By.name("submitButton")).click();
		String firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();;
		System.out.println("The First Name is: " +firstname);
		String titl = driver.getTitle();
		System.out.println("The Driver Title is: "+titl);
		driver.close();
		
	}
	
}
