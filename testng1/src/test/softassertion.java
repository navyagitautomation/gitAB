package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {
	@Test
	public void assertion()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbnav\\OneDrive\\Documents\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://yahoo.com");
		String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		String getActualTitle = driver.getTitle();
		
		
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Yahoo Search - Web Search");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(getActualTitle, "Yahoo Search - Web Search");
		softAssert.assertNotEquals(getActualTitle, "Yahoo Search - Web Search");
		softAssert.assertNull(verifyTitle);
		softAssert.assertNotNull(verifyTitle);
		softAssert.assertTrue("yahoo".equals("yahoo"), "First soft assert failed");
		softAssert.assertFalse("yahoo".equals("yahoo"), "Second soft assert failed");
		//softAssert.assertAll();
		System.out.println(ActualTitle);
		//soft
	}
}
