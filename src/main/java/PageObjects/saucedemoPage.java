package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseClass;
import Base.Utility;

public class saucedemoPage extends BaseClass{
	Utility utils = new Utility();
	@FindBy(id="user-name")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginButton;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement bikeLight;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement fleeceJacket;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement sauceLabOnesize;
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement shoppingCart;
	@FindBy(id="checkout")
	private WebElement checkout;
	@FindBy(id="first-name")
	private WebElement fName;
	@FindBy(id="last-name")
	private WebElement lName;
	@FindBy(id="postal-code")
	private WebElement pCode;
	@FindBy(id="continue")
	private WebElement conti;
	@FindBy(id="finish")
	private WebElement finishAll;
	public void getUserName() {
		utils.sendKeys(driver, userName, "standard_user", 30);
	}
	public void getPassword() {
		utils.sendKeys(driver, password, "secret_sauce", 30);
	}
	public void getLoginButton() {
		utils.clickOn(driver, loginButton, 10);
	}
	public void getBikeLight() {
		utils.clickOn(driver, bikeLight, 10);
	}
	public void getFleeceJacket() {
		utils.clickOn(driver, fleeceJacket, 10);
	}
	public void getSauceLabOnesize() {
		utils.clickOn(driver, sauceLabOnesize, 10);
	}
	public void getShoppingCart() {
		utils.clickOn(driver, shoppingCart, 10);
	}
	public void getCheckout() {
		utils.clickOn(driver, checkout, 10);
	}
	public void getfName() {
		utils.sendKeys(driver, fName, "ankita", 30);
	}
	public void getlName() {
		utils.sendKeys(driver, lName, "govind",30);
	}
	public void getpCode() {
		utils.sendKeys(driver, pCode, "1234", 30);
	}
	public void getConti() {
		utils.clickOn(driver, conti, 10);
	}
	public void getFinishAll() {
		utils.clickOn(driver, finishAll, 10);
	}
	


	
	


}