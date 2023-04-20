package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 
{
	WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Vinay\\Downloads\\chromedriver_win\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
	}
	@BeforeMethod
	public void launchapp()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void scr()
	{
		driver.findElement(By.name("login"));
	}
	@AfterMethod
	public void closeapp()
	{
		//logout
		driver.close();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
