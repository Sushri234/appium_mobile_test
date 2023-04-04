package Utility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apputils {

	
	@BeforeTest
	public void login()
	{
	System.out.println("for practice purpose");
}
	@AfterTest
	public void logout()
	{
	System.out.println("logout method is execute after all testcases and method");
	}
	@BeforeSuite
	public void LaunchAPP()
	{
	System.out.println("write code for launching any website or browser");
	}
	@AfterSuite
	public void CloseApp()
	{
	System.out.println("Logout action");
	}
}
	
	
	
