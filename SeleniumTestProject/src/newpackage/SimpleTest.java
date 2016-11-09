package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://www.seleniumeasy.com/";

		driver.get(URL);

		WebElement appium = driver.findElement(By.xpath("//body//nav//li[8]/a"));

		appium.click();

		WebElement apptutor = driver.findElement(By.xpath("//body//h1"));

		boolean status = apptutor.isDisplayed();

		if (status = true) {

			System.out.println("Yeee");
		} else {
			System.out.println("Boooo");

		}

	}

}
