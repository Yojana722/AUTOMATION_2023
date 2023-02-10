package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAnnotation {

	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"Automation Testing"},{"SQL"},{"API Testing"},{"Manual Testing"}};
	}
	
	@Test(dataProvider = "data-provider")
	public void TC1(String value) {
		System.out.println(value);
	}
}
