package week2.dayy1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9562323533");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String String = driver.findElement(By.linkText("17251")).getText();
		//driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col x-grid3-cell')]//div")).click();
		//String duplicateL = driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]")).getText();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=17251']")).click();
		//String delete = driver.findElement(By.linkText("Delete")).getText();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		///driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//driver.findElement(By.name("id")).sendKeys("17251");
		//driver.findElement(By.name("id")).sendKeys(no);

	}
	
}
