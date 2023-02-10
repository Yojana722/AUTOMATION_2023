package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	//1. invocationCount
	//2. enabled
	/*@Test(invocationCount = 5, enabled = false)
	public void TC1() {
       Reporter.log("running TC1", true);
	}*/
	
	//3. priority
	@Test(priority = 2)
	public void TC2() {
		Reporter.log("running TC2", true);
	}
	
	@Test(priority = -2)
	public void TC3() {
		Assert.fail();
		Reporter.log("running TC3", true);
	}
	
	@Test(enabled = false)
	public void TC4() {//by default, priority = 0
		Reporter.log("running TC4", true);
	}
	
	//4. timeOut
	//5. dependsOnMethods
	@Test(timeOut = 2000, dependsOnMethods = {"TC2","TC3"})
	public void TC5() throws InterruptedException {
		//Thread.sleep(3000);
		Reporter.log("running TC5", true);
	}

}
