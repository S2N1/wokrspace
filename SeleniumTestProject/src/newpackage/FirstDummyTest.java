package newpackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDummyTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		String url = "https://gmail.com";

		driver.get(url);
	}

	}
