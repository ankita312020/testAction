package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseClass;

public class TestCase extends BaseClass {


	@Test
	public void login() {
		// Login with standard user
		home.getUserName();
		home.getPassword();
		home.getLoginButton();
		// Add items to cart
		home.getBikeLight();
		home.getFleeceJacket();
		home.getSauceLabOnesize();
		// Navigate to cart and check items
		home.getShoppingCart();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).click();
//		 Checkout with random details
		home.getCheckout();
		home.getfName();
		home.getlName();
		home.getpCode();
		home.getConti();
		// Verify details and finish checkout
		// Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Bike Light")
		// 		&& driver.getPageSource().contains("Sauce Labs Fleece Jacket")
		// 		&& driver.getPageSource().contains("Sauce Labs Onesie"));
		
		home.getFinishAll1();

	}

}
