package seleniumapi;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowMaximize {
	@Test
	public void testRowSelectionUsingControlKey() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Libraries - JUnit and Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.quit();
	}
}
