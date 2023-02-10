package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	//annotations - used to control the flow of methods in Test class
	@BeforeClass
	public void openBrowser() {
		//open browser
	}
	
	@BeforeMethod
	public void login() {
		//login
	}
	
	@Test
	public void verifyUN() {
		
	}
	
	@Test
	public void verifyPWD() {
		
	}
	
	
	@AfterMethod
	public void logOut() {
		//log out
	}
	
	@AfterClass
	public void closeBrowser() {
		//close browser
	}
	
	
	
}
