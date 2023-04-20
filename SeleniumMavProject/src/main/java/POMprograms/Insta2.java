package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta2 {

	public static void main(String[] args) throws Throwable 
	{
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Vinay\\Downloads\\chromedriver_win32(1)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Insta in = new Insta(driver);
		Thread.sleep(3000);
		in.login();

	}

}
