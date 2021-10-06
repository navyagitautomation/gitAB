package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {
	
	
	@Test
		public void Registerusertestcase()
	{
		System.out.println("User Registered sucessfully");
	}
	@Test(dependsOnMethods={"Submitapplicationtestcase"})// helper attribute
	public void Createnewapplicationtestcase()
	{
		System.out.println("Application created sucessfully");
	}
	@Test
	public void Submitapplicationtestcase()
	{
		System.out.println("Application submitted sucessfully");
	}
	@Test(timeOut=4000)
	public void Submitapplicationtestcase2()
	{
		System.out.println(" 2nd Application submitted sucessfully");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("I am after in test 3");
	}
	@AfterSuite
	public void beforesuite()
	{
		System.out.println("I am executed last at suite level");
	}
	
	
	
}
