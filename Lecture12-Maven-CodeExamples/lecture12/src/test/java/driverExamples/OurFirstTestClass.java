package driverExamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.junit.*;
import org.openqa.selenium.firefox.*;

public class OurFirstTestClass {
	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Libraries - JUnit and Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://pragmatic.bg/automation/example4.html");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testExamples(){
		WebElement element = driver.findElement(By.id("nextBid"));
		element.sendKeys("100");
	}
}
