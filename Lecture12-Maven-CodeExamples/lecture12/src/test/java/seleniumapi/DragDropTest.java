package seleniumapi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragDropTest {
	
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Libraries - JUnit and Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test 
	public void testDragDrop() {
		
		driver.get("http://pragmatic.bg/automation/lecture13/DragDropDemo.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
		try
		{
			assertEquals("Dropped!", target.getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}