package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.facebook.com/";

		driver.get(url);

		WebElement EnterMail = driver.findElement(By.id("email"));

		EnterMail.sendKeys("slavcho_nikolov1@abv.bg");

		WebElement EnterPass = driver.findElement(By.id("pass"));

		EnterPass.sendKeys("SeatIbiza12123");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement button = driver.findElement(By.id("u_0_q"));

		button.click();

		WebElement verification = driver.findElement(By.id("userNavigationLabel"));

		boolean status = verification.isDisplayed();

		if (status = !true) {
			System.out.println("The Test has failed");
		} else {
			System.out.println("The Test has succeed");

		}

	}
}