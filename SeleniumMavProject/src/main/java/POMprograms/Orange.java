package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange 
{
	@FindBy(name="username")
	private WebElement usernametf;
	@FindBy(name="password")
	private WebElement passwordtf;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement forgotlink;
	
	public WebElement getUsernametf() {
		return usernametf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getForgotlink() {
		return forgotlink;
	}

	public Orange(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		usernametf.sendKeys("Admin");
		passwordtf.sendKeys("admin123");
		loginbtn.click();
	}
	public void forgotpwd()
	{
		forgotlink.click();
	}
}
