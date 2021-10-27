package week2.dayy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
driver.get("http://leaftaps.com/opentaps");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
//driver.findElement(By.linkText("Lead")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

WebElement elesource=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropDown=new Select(elesource);
dropDown.selectByVisibleText("DirectMail");

WebElement eleIndustry=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dropDown1=new Select(eleIndustry);
dropDown1.selectByIndex(7);

WebElement eleOwnership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dropDow2=new Select(eleOwnership);
dropDown.selectByValue("partnership");

	}

}
