package assignment2;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {
public static void main(String[] args){
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
	WebElement submitbuttonElement = driver.findElement(By.name("submitButton"));
	submitbuttonElement.click();
	System.out.println("The title of the page is : " +driver.getTitle());
WebElement duplicateleadElement1 = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
duplicateleadElement1.click();
WebElement companyname2Element1 = driver.findElement(By.id("createLeadForm_companyName"));
companyname2Element1.clear();
WebElement firstname2Element1 = driver.findElement(By.id("createLeadForm_firstName"));
firstname2Element1.clear();
companyname2Element1.sendKeys("TCS");
firstname2Element1.sendKeys("Anu");
WebElement submitbutton2Element1 = driver.findElement(By.name("submitButton"));
submitbutton2Element1.click();
System.out.println("The title of the page is : " +driver.getTitle());
}
}


	
		
		
