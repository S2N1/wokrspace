package homeworkSeleniumApi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInNegative {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		
		String url = "http://shop.pragmatic.bg/admin/";
		this.driver = new FirefoxDriver();
		this.driver.get(url);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLogInWrongName() {
		try {
			WebElement userName = this.driver.findElement(By.xpath("//*[@name='username']"));
			userName.sendKeys("ad");
			WebElement passWord = this.driver.findElement(By.xpath("//*[@name='password']"));
			passWord.sendKeys("parola");
			WebElement logInButton = driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
			logInButton.click();

		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
			fail();

		}
		try {
			WebElement errorMessage = this.driver.findElement(By.xpath("//*[@class='warning']"));
			assertEquals("No match for Username and/or Password.", errorMessage.getText());

		} catch (Error e) {
			e.printStackTrace();
			fail();

		}
	}

	@Test
	public void testLogInWrongPass() {
		try {
			WebElement userName = this.driver.findElement(By.xpath("//*[@name='username']"));
			userName.sendKeys("admin");
			WebElement passWord = this.driver.findElement(By.xpath("//*[@name='password']"));
			passWord.sendKeys("parolaaa");
			WebElement logInButton = driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
			logInButton.click();

		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
			fail();

		}
		try {
			WebElement errorMessage = this.driver.findElement(By.xpath("//*[@class='warning']"));
			assertEquals("No match for Username and/or Password.", errorMessage.getText());

		} catch (Error e) {
			e.printStackTrace();
			fail();

		}
	}
    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
