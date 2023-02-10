package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {

	// 1. assertEquals - Asserts that two Strings are equal. If they are not, an
	// AssertionError, with the given message,is thrown.
	@Test
	public void test1() {
		Reporter.log("running test1 method", true);
		String expResult = "good night";
		String actResult = "good night";

		Assert.assertEquals(actResult, expResult, "act & exp result is not equal");
	}

	// 2. assertNotEquals
	@Test
	public void test2() {
		Reporter.log("running test2 method", true);
		String expResult = "good night";
		String actResult = "good night1";

		Assert.assertNotEquals(actResult, expResult, "act & exp result is equal");
	}

	// 3. assertTrue
	@Test
	public void test3() {
		Reporter.log("running test3 method", true);
		boolean expResult = true;

		Assert.assertTrue(expResult, "exp result is false");
	}

	// 4. assertFalse
	@Test
	public void test4() {
		Reporter.log("running test4 method", true);
		boolean expResult = false;

		Assert.assertFalse(expResult, "exp result is true");
	}

	// 5. assertNull
	@Test
	public void test5() {
		Reporter.log("running test5 method", true);
		String expResult = null;

		Assert.assertNull(expResult, "exp result is not null");
	}

	// 6. assertNotNull
	@Test
	public void test6() {
		Reporter.log("running test6 method", true);
		String expResult = "qauntum academy";

		Assert.assertNotNull(expResult, "exp result is null");
	}

	// 7. fail
	@Test
	public void test7() {
		Reporter.log("running test7 method", true);
		Assert.fail();
	}
}
