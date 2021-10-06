package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	@Parameters({"URL","username"})
	@Test
	public void cardholder1(String urll,String usrn)
	{
		System.out.println(urll);
		System.out.println(usrn);
		System.out.println(urll);
		System.out.println(usrn);
	}
	@Test
	public void cardholder2()
	{
		System.out.println("yyyyy");
	
	}
	@Test
	public void cardholder3(int a)
	{
		System.out.println("hhhyyyyy");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I am before test");
	}
	}


