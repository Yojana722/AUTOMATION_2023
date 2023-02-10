package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGTestClass {

	@Test
	public void TC1() {
		//System.out.println("Quantum Academy");
		Reporter.log("Quantum Academy");//msg will be displayed on Report only
		Reporter.log("Quantum Academy", false);//msg will be displayed on Report only
		Reporter.log("Quantum Academy", true);//msg will be displayed on Report and console
	}
}
