package TestNg;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSample 
{
	WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Vinay\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
	}
	@BeforeMethod
	public void launchapp()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void src()
	{
		driver.findElement(By.name("login"));
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
