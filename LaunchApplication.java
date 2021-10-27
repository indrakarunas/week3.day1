package week2.dayy1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();

ChromeDriver driver=new ChromeDriver();

//to maximize the window

//driver.manage().window().maximize();


driver.get("http://leaftaps.com/opentaps");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//driver.findElement=driver.findElement(By.id("Username"));
//WebElement ele= driver.findElement(By.id("Username"));
//ele.sendKeys("Demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
//WebElement password=Driver.findElement(By.name("password"));
//Password.sendkeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
//driver.findElement(By.linkText("Lead")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Satvik");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Santhosh");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Satvik");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Santhosh");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("HAI");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/05/2018");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/05/2018");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20000");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("KVS");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0100");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@123");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testing note");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9562323533");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("052");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Indra");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testing@gmail.com");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("NAME");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("indu@gmail.com");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Virugambakkam");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("600092");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620013");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("620013");
driver.findElement(By.name("submitButton")).click();
	}
}

