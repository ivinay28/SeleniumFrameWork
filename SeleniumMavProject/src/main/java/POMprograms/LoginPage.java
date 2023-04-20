package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws Throwable 
	{
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Vinay\\Downloads\\chromedriver_win32(1)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Login l = new Login(driver);
		
		l.login();
		
		//using getter method
/*		l.getLoginbtn().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		l.getLoginbtn().click();    */
	

	}

}
