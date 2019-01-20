package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//page factory object repositry    driver.FindElement(By.XPath());
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(.,'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//img[@src='https://d3lh3kd7bj2evy.cloudfront.net/img/logo.png']")
	WebElement crmLogo;
	//initialising the page object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCrmImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
