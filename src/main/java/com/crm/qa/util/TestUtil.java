package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long Impliicttimeout=20;
	public static long Pageloadtimeout=20;
	
	
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
	
	
	
}
