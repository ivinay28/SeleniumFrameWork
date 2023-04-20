package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriPOM1 
{	
		@FindBy (id="usernameField")
		private WebElement usernametf;	
		@FindBy (id="passwordField")
		private WebElement passwordtf;
		@FindBy (xpath="//small[text()=\"Show\"]")
		private WebElement showlink;		
		@FindBy (xpath="//small[text()=\"Forgot Password?\"]")
		private WebElement forgotlink;
		@FindBy (xpath="//button[text()=\"Login\"]")
		private WebElement loginbtn;
		
		public NaukriPOM1 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void login()
		{
			usernametf.sendKeys("vinay@gmail.com");
			passwordtf.sendKeys("121254");
			loginbtn.click();
		}
}
