package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
			WebElement contactsLabel;
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement cmpny;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement saveBtn; 
	
	 public ContactsPage() {
		 PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean verifyContactLevel(){
		return contactsLabel.isDisplayed();
	}
	

	public void createNewContactTest(String title ,String ftName,String ltName,String comp){
		Select select=new Select(driver.findElement(By.xpath("//select[@name='title']")));
		select.selectByVisibleText(title);
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		cmpny.sendKeys(comp);
		saveBtn.click();
		
		
	}
	
	
	
	
	
}
