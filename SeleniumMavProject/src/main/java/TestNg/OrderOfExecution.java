package TestNg;

import org.testng.annotations.Test;

public class OrderOfExecution 
{
	//1st push
	@Test(priority = 1)
	public void createcontact()
	{
		System.out.println("create contact");
	}
	@Test(priority = 2)
	public void modifycontact()
	{
		System.out.println("modify contact");
	}
	@Test(priority = 3)
	public void deletecontact()
	{
		System.out.println("delete contact");
	}
}
