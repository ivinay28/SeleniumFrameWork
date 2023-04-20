package POMprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeDashboard 
{
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admintab;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimtab;
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leavetab;
	@FindBy(xpath="//span[text()='Time']")
	private WebElement timetab;
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement recruitmenttab;
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myinfotab;
	@FindBy(xpath="//span[text()='Performance']")
	private WebElement performancetab;
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboardtab;
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement directorytab;
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement maintenancetab;
	@FindBy(xpath="//span[text()='Buzz']")
	private WebElement buzztab;
	
	public OrangeDashboard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void adminclick()
	{
		admintab.click();
	}
}
