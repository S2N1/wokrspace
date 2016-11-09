package seleniumapi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.os.WindowsUtils;

public class WindowsRegistry {
  
	@Test
	public void testReadRegistry()
	
	{		
		String osname = WindowsUtils
				.readStringRegistryValue("HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\ProductName");
		System.out.println(osname);
	}
	
	@Test
	public void testWriteRegistry()
	{
		WindowsUtils.writeStringRegistryValue("HKEY_CURRENT_USER\\SOFTWARE\\Selenium\\SeleniumVersion", "3.0.0");
		assertEquals("3.0.0",WindowsUtils.readStringRegistryValue("HKEY_CURRENT_USER\\SOFTWARE\\Selenium\\SeleniumVersion"));
	}
}