package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeAdmin 
{
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement usernametf;
	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	private WebElement selectdd;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement employeenametf;
	@FindBy(xpath="(//div[text()='-- Select --'])[2]")
	private WebElement stausdd;
	@FindBy(xpath="//button[text()=' Reset ']")
	private WebElement resetbtn;
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement searchbtn;
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement addbtn;
	
	public OrangeAdmin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void admincreate()
	{
		addbtn.click();
	}
}
