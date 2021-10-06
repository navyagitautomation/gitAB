package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	
	
	@Test
	
	public void loneholder1()
	{
		System.out.println("aaaaaa");
	}
	//@Parameters({"URL"})
	@Test
	public void loanholder2(String a)
	{
		System.out.println(a);
	}
	
	@Test(dataProvider="getdata")
	public void carloan(String un,String pw)
	{
		System.out.println(un);
		System.out.println(pw);
	}
	
	@Test
	public void Afterclass()
	{
		System.out.println("i after class");
	}
	
	//data providers
	@DataProvider
	public Object[][] getdata()
	{
		 //1 combination username Pw -- with good credit hostory
		//2nd c         UN PW                    no credit history
		//3rd           UN  PW                   fraudlent credit history
		
		Object[][] data=new Object[3][2];  
		data[0][0]="firstUN";
		data[0][1]="firstPW";
		//2nd
		data[1][0]="sectUN";
		data[1][1]="sectPW";
		//3rd 
		data[2][0]="thirdtUN";
		data[2][1]="thirdPW";
		
		
		return data;
		
	}
	
	
}
