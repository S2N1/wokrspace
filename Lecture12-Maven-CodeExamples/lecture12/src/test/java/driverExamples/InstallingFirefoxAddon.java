package driverExamples;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.*;



public class InstallingFirefoxAddon {
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	    FirefoxProfile profile = new FirefoxProfile();
	  
	    
	    driver = new FirefoxDriver();
	    driver.get("http://pragmatic.bg/automation/example4.html");
	}
	
//	@After
//	public void tearDown() {
//	    driver.quit();
//	}
	
	@Test
	public void testExamples() {
	    WebElement element = driver.findElement(By.id("nextBid"));
	    element.sendKeys("100");
	}
}
