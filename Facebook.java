package week2.dayy1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	driver.get("  https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	driver.manage().window().maximize();
	driver.manage().timeouts();
	
	//Thread.sleep(2000);
	driver.findElement(By.name("UserFirstName")).sendKeys("Satvik");
	driver.findElement(By.name("UserLastName")).sendKeys("Santhosh");
	driver.findElement(By.name("UserEmail")).sendKeys("Satvik@gmail.com");
	//driver.findElement(By.name("UserTitle")).sendKeys("SalesManager");
	driver.findElement(By.name("CompanyName")).sendKeys("KVS SOFTWARE");
	driver.findElement(By.xpath("//input[@ name='UserPhone']")).sendKeys("969696966");
	//driver.findElement(By.id("CompanyEmployees-gkvu")).sendKeys("KVS");
	//CompanyEmployees-gkvu
	//driver.close();
	//WebElement eleEmployee=driver.findElement(By.name("companyEmployees"));
	//Select dropdown=new Select("eleEmployee");
	//dropDown.selectByVisibleTest("1 - 15 employees");
	//eleEmployee.sendKeys("1 - 15 employees");
	
	Select job = new Select(driver.findElement(By.name("UserTitle")));
	job.selectByIndex(3);
	Select emp=new Select(driver.findElement(By.name("CompanyEmployees")));
	emp.selectByVisibleText("15 - 100 employees");
	Select com=new Select(driver.findElement(By.name("CompanyCountry"))); 
	//com.selectByVisibleText("IN");
	com.selectByValue("IN");
	//Select state=new Select(driver.findElement(By.name("CompanyState"))); 
	//state.selectByVisibleText("Tamil_Nadu");
	driver.findElement(By.xpath("(//div[contains(@class,'checkbox-ui')])[1]")).click();
	//driver.close();
}
	
}