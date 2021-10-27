package week2.dayy1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		//driver.findElement(By.xpath("//a[@href='crsfa/control/createContactForm']")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Vishnu");
		driver.findElement(By.id("lastNameField")).sendKeys("Santhosh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("name Local");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("name Local1");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("SANTHOSH STORES");
		//driver.findElement(By.xpath("//input[@id='createContactForm_importantNote']")).sendKeys("TestLeaf");
		driver.findElement(By.id("createContactForm_description")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("name Local1");
		Select state1=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.xpath("/crmsfa/control/updateContactForm?partyId=17973']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		//driver.findElement(By.xpath("//input[@id='updateContactForm_importantNote']")).sendKeys("notes");
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("NEW NOTES");
		driver.findElement(By.name("submitButton")).click();
		//System.out.println(driver.getTitle());
	}
	
	
}
