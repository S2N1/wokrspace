package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://gmail.com";

		driver.get(url);

		WebElement EnterMail = driver.findElement(By.id("Email"));

		EnterMail.sendKeys("nikolov2slavcho@gmail.com");

		WebElement NextButton = driver.findElement(By.id("next"));

		NextButton.click();

		WebElement passField = driver.findElement(By.id("Passwd"));

		passField.sendKeys("Trevata12123q!");

		WebElement sighButton = driver.findElement(By.id("signIn"));
		sighButton.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement verification = driver.findElement(By.className("J-Ke n0 aBU"));

		boolean verificationStatus = verification.isDisplayed();

		if (verificationStatus = !true) {
			System.out.println("Test has failed");

		} else {
			System.out.println("Test has passed");
		}

		driver.close();

	}
}
