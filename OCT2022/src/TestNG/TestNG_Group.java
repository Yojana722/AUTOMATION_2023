package TestNG;

import org.testng.annotations.Test;

public class TestNG_Group {

	@Test(groups = "whatsApp")
	public void TC1() {
		System.out.println("running TC1");
	}
	
	@Test(groups = "Facebook")
	public void TC2() {
		System.out.println("running TC2");
	}
	
	@Test(groups = "Amazon")
	public void TC3() {
		System.out.println("running TC3");
	}
	
	@Test(groups = "whatsApp")
	public void TC4() {
		System.out.println("running TC4");
	}
	
	@Test(groups = "Flipkart")
	public void TC5() {
		System.out.println("running TC5");
	}
	
	@Test(groups = "Facebook")
	public void TC6() {
		System.out.println("running TC6");
	}

}
