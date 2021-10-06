package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalvariables2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\kbnav\\eclipse-workspace\\testng1\\file1.properties");
		
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\kbnav\\eclipse-workspace\\testng1\\file1.properties");
		prop.store(fos, null);
		
		
		
	}

}
