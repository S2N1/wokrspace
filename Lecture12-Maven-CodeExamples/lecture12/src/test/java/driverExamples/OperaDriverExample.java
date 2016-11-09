package driverExamples;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class OperaDriverExample {
	static WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.opera.driver","C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Drivers\\operadriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("opera.binary", "C:\\Program Files\\Opera x64\\opera.exe");
		capabilities.setCapability("opera.log.level", "CONFIG");
		driver = new OperaDriver(capabilities);
		driver.get("http://pragmatic.bg/automation/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testExamples() {
		WebElement element = driver.findElement(By.partialLinkText("Example4"));
		element.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  
		// Assert that we only have 1 link
		Assert.assertEquals(1, driver.findElements(By.tagName("a")).size());
	}
}
