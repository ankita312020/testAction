package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PageObjects.saucedemoPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static FileInputStream fisReader = null;
	public static Properties property = null;
	public static WebDriverWait wait = null;
	public static WebDriver driver = null;
	public static saucedemoPage home = null;

	@BeforeSuite
	public void initialization() throws IOException {
		fisReader = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
		property = new Properties();
		property.load(fisReader);	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(property.getProperty("URL"));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	@BeforeTest
	public void execution() {
		// Initialize the PageFactory for the saucedemoPage class
		home = PageFactory.initElements(driver, saucedemoPage.class);
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}

}
