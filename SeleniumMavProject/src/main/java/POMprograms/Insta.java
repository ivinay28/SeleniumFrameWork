package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insta 
{
	@FindBy(name="username")
	private WebElement usertf;
	@FindBy(name="password")
	private WebElement passtf;
	@FindBy(xpath="//div[text()='Log in']")
	private WebElement loginbtn;
	@FindBy(xpath="//span[text()='Log in with Facebook']")
	private WebElement fblink;
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgotlink;
	@FindBy(xpath="//span[text()='Sign up']")
	private WebElement newaccountlink;
	
	public WebElement getUsertf() {
		return usertf;
	}
	public WebElement getPasstf() {
		return passtf;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getFblink() {
		return fblink;
	}
	public WebElement getForgotlink() {
		return forgotlink;
	}
	public WebElement getNewaccountlink() {
		return newaccountlink;
	}
	
	public Insta(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		usertf.sendKeys("Vinay");
		passtf.sendKeys("123123");
		loginbtn.click();
	}
}
