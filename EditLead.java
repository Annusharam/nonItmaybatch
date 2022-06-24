package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead{
public static void main(String[] arg){
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		WebElement usernameElement = driver.findElement(By.id("username"));	
		usernameElement.sendKeys("Demosalesmanager");
		
		
		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativesubmit"));
loginButton.click();

	WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
	crmsfaElement.click();
	
	WebElement ElementLeads = driver.findElement(By.linkText("Leads"));
	ElementLeads.click();
	
	 WebElement ElementCreateLead = driver.findElement(By.linkText("CreateLead"));
	  ElementCreateLead.click(); 
	  
	  WebElement ElementCompanyName =  driver.findElement(By.id("createLeadForm_CompanyName"));
	 ElementCompanyName.sendKeys("TestLeaf");
	 
	 WebElement ElementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	 ElementFirstName.sendKeys("Anusha");
	 WebElement ElementLastName = driver.findElement(By.id("createLeadForm_last"));
	 ElementLastName .sendKeys("R");
	 WebElement elementFirstNamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNamelocal.sendKeys("Anu");
		
		WebElement elementDepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartmentName.sendKeys("Information Tech");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("collecting data");
		
		WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailAddress.sendKeys("ranuusha1@gmail.com");
		
		WebElement elementStateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateDropDown);
		dd.selectByVisibleText("New York");

		WebElement elementCreateButton = driver.findElement(By.name("submitButton"));
		elementCreateButton.click();
		
		WebElement editElement = driver.findElement(By.xpath("//a[text()='Edit']"));
		editElement.click();
		WebElement updatedescriptionElement = driver.findElement(By.id("updateLeadForm_description"));
		updatedescriptionElement.clear();
		WebElement importantnoteElement = driver.findElement(By.id("updateLeadForm_importantNote"));
		importantnoteElement.sendKeys("yyy-yyyyy-yyyyyyy-yyyyyyyy");
		WebElement updatebuttonElement = driver.findElement(By.className("smallSubmit"));
		updatebuttonElement.click();
		System.out.println("The title of the page is : " +driver.getTitle());	
}
}
		
		
	