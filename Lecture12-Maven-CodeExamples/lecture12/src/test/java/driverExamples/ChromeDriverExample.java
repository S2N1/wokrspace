package driverExamples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;

public class ChromeDriverExample {
	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		;

		driver = new ChromeDriver();
		driver.get("http://pragmatic.bg/automation/example4.html");
	}

	// @After
	// public void tearDown() {
	// driver.quit();

	@Test
	public void testExamples() {
		WebElement element = driver.findElement(By.id("selectLoad"));
		String value = element.getAttribute("value");
		Assert.assertEquals("Click to load the select below", value);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}