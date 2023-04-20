package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	//Declaration
	@FindBy(id="email")
	private WebElement emailtf;
	@FindBy(id="pass")
	private WebElement passtf;
	@FindBy(name="login")
	private WebElement loginbtn;
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotpasslink;
	@FindBy(xpath="(//a[@role='button'])[3]")
	private WebElement createbtn;
	
	//getter method
	public WebElement getEmailtf() {
		return emailtf;
	}
	public WebElement getPasstf() {
		return passtf;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getForgotpasslink() {
		return forgotpasslink;
	}
	public WebElement getCreatebtn() {
		return createbtn;
	}
	
	//initialization
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public void login()
	{
		emailtf.sendKeys("vinay");
		passtf.sendKeys("12345");
		loginbtn.click();
	}
	
}
