package bg.pragmatic.lecture14nestedpageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	private static WebDriver driver;

	public static void browserInit() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebDriver driver() {
		return driver;
	}

	public static void open(String url) {
		driver.get(url);
	}

	public static void quit() {
		driver.quit();
	}
}