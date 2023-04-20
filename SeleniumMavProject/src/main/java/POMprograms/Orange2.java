package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange2 {

	public static void main(String[] args) throws Throwable
	{
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Vinay\\Downloads\\chromedriver_win32(1)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Orange o = new Orange(driver);
		Thread.sleep(3000);
		//o.login();
		
		o.getUsernametf().sendKeys("Admin");
		o.getPasswordtf().sendKeys("admin123");
		o.getLoginbtn().click();
		
		OrangeDashboard od = new OrangeDashboard(driver);
		Thread.sleep(2000);
		od.adminclick();
		
		OrangeAdmin oa = new OrangeAdmin(driver);
		Thread.sleep(2000);
		oa.admincreate();
		
	}
}
