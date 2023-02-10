package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {
   //soft assert - non static methods
   //hard assert - static methods
	
	@Test
	public void test() {
		String expResult = "good morning";
		String actResult = "good night";
		boolean result = false;
		
		SoftAssert soft = new SoftAssert();
		
		//verification 1
		soft.assertNotEquals(actResult, expResult,"verification 1: act & exp result is equal");
		
		//verification 2
		soft.assertEquals(actResult, expResult,"verification 2 : act & exp result is not equal");
		
		//verification 3
		soft.assertTrue(result, "verification 3 : result is false");
		
		soft.assertAll();
		
		//output:
		//java.lang.AssertionError: The following asserts failed:
		//verification 2 : act & exp result is not equal expected [good morning] but found [good night],
		//verification 3 : result is false expected [true] but found [false]
	}
}
