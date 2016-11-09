package homeworkSeleniumApi;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;

public class LogIn {

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
	public void testLogIn() {
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
		try {
			WebElement verification = driver.findElement(By.xpath("//div[contains(text(),'You are logged in as')]"));
			assertEquals(" You are logged in as admin", verification.getText());

		} catch (NoSuchElementException e) {
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
