package TestNg;

import org.testng.annotations.Test;

public class OrderOfExecutionMultiple 
{
	@Test(invocationCount=4)
	public void createcontact()
	{
		System.out.println("create contact");
	}
	@Test(dependsOnMethods = "createcontact")
	public void modifycontact()
	{
		System.out.println("modify contact");
	}
	@Test(dependsOnMethods = "modifycontact")
	public void deletecontact()
	{
		System.out.println("delete contact");
	}
}
