package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
 LoginPage loginpage;
 HomePage homepage;
 TestUtil testutil;
 ContactsPage contactspage;
	public HomePageTest(){
		super();
	}
	//test case should be separated--independent with each other
	//before each test cases launch the browser and login
	//@test execute the test
	//after each test cases close the browwser
	@BeforeMethod
	public void setUp(){
		initialization();
	     testutil=new TestUtil();
		loginpage =new LoginPage();
		contactspage=new ContactsPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
	
	@Test(priority=1 )
	public void verifyHomePageTitleTest(){
         String homepagetitle=homepage.verifyHomePageTitle();
         Assert.assertEquals(homepagetitle,"CRMPRO","HOME PAGE NOT CORRECT");
	}
	@Test(priority=2)
	public void verifyUserNameTest(){
		testutil.switchToFrame();
		Assert.assertTrue(homepage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactLinkTest(){
		testutil.switchToFrame();
		contactspage=homepage.verifyContactpage();
	}
	
	
		@AfterMethod
	    public void closeBrowser(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
