package TestNg;

import org.testng.annotations.Test;

public class OrderOfExecutionEnableDisable 
{
	@Test(enabled = false)
	public void createcontact()
	{
		System.out.println("create contact");
	}
	@Test
	public void modifycontact()
	{
		System.out.println("modify contact");
	}
	@Test
	public void deletecontact()
	{
		System.out.println("delete contact");
	}
}
