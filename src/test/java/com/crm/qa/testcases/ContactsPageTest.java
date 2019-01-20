package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginpage;
	 HomePage homepage;
	 TestUtil testutil;
	 ContactsPage contactspage;
	
	public ContactsPageTest(){
      super();
	}
	
	@BeforeMethod
	
	public void setUp(){
		initialization();
	     testutil=new TestUtil();
		loginpage =new LoginPage();
		contactspage=new ContactsPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		testutil.switchToFrame();
		contactspage=homepage.verifyContactpage();
		} 
	@Test(priority=1)
	public void verifyContactsPageTest(){
		testutil.switchToFrame();
			Assert.assertTrue(contactspage.verifyContactLevel());
			
	} 
	@Test(priority=2)
	public void validateCreateNewContact(){
		homepage.clickOnNewContactLink();
		contactspage.createNewContactTest("Mr.","tom", "tommy", "google");
		}
	
		
	@AfterMethod
	public void closeBrowseer(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}