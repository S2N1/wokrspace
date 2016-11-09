package driverExamples;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.Test;


public class OurSecondExampleClass {
	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Libraries - JUnit and Selenium\\geckodriver.exe");
	    FirefoxProfile profile = new FirefoxProfile();
	    profile.setPreference("browser.startup.homepage", "http://pragmatic.bg/automation/example4.html");
	    driver = new FirefoxDriver(profile);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
	    driver.quit();
	}
	
	@Test
	public void testExamples(){
	    WebElement element = driver.findElement(By.linkText("Index"));
	    element.click();
	}


}
