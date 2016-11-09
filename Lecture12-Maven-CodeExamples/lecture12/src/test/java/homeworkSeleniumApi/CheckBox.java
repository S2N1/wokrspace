package homeworkSeleniumApi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		String url = "http://pragmatic.bg/automation/lecture13/Config.html";
		driver = new FirefoxDriver();
		this.driver.get(url);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void testCheckBox() {

		try {
			WebElement airBags = this.driver.findElement(By.xpath("//input[@name='airbags']"));
			// Actions builder = new Actions(driver); when i use the actions
			// class i
			// have strange exceptions,
			// selenium is using move to method, which i googled and it was a
			// selenuim bug. Can you also check it if you have time ?
			// builder.click(airbags).perform();
			if (!airBags.isSelected())
				airBags.click();
			assertTrue(airBags.isSelected());
			WebElement parkSensor = this.driver.findElement(By.xpath("//input[@name='parksensor']"));
			if (!parkSensor.isSelected())
				parkSensor.click();
			assertTrue(airBags.isSelected());

		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
			fail();
		}
	}
}