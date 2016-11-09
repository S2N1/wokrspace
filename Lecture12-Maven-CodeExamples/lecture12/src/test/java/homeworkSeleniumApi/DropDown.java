package homeworkSeleniumApi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		String url = "http://shop.pragmatic.bg/admin/";
		this.driver = new FirefoxDriver();
		this.driver.get(url);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			WebElement userName = this.driver.findElement(By.xpath("//*[@name='username']"));
			userName.sendKeys("admin");
			WebElement passWord = this.driver.findElement(By.xpath("//*[@name='password']"));
			passWord.sendKeys("parola");
			WebElement logInButton = driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
			logInButton.click();

		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
			fail();
		}
	}

	@Test
	public void checkDropDown() {
		try {
			Select range = new Select(driver.findElement(By.id("range")));
			assertFalse(range.isMultiple());
			assertEquals(4, range.getOptions().size());

			List<String> exp_range = Arrays.asList(new String[] { "Today", "This Week", "This Month", "This Year" });
			List<String> act_range = new ArrayList<>();

			for (WebElement range1 : range.getOptions())
				act_range.add(range1.getText());
			assertArrayEquals(exp_range.toArray(), act_range.toArray());

		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
			fail();
		} catch (Error e) {
			System.out.println(e.toString());
			fail();

		}
	}

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
	
}