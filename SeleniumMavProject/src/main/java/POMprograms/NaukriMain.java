package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriMain {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Vinay\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		NaukriPOM1 n = new NaukriPOM1(driver);
		Thread.sleep(2000);
		n.login();

	}

}
