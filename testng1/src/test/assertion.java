package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assertion {
	@Test
	public void assertion()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbnav\\OneDrive\\Documents\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://yahoo.com");
		
		
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String verifyAssertNull=null;
		String ExpectedTitle = "Yahoo Search - Web Search";
		Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Yahoo Search - Web Search");
		Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | Yahoo Search ");
		
		
		assertEquals(ExpectedTitle, ActualTitle);
		
		assertNotEquals(ExpectedTitle, "Yahoo Search - Web Search");
		
		assertTrue(verifyTitleIsPresent);
		
		assertFalse(verifyTitleIsChanged);
		
		assertNotNull(verifyTitleIsPresent);
		assertNull(verifyAssertNull);
		System.out.println(ActualTitle);
	
	}
}
