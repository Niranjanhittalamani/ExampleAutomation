package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assign9page
{
	public static WebDriver oBrowser=null;
	public static  ActiTimePage oPage= null;
	
	static void launch() 
	{
	  try
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\WebAutamation\\Library\\drivers\\chromedriver.exe");
		  oBrowser=new ChromeDriver();
		  oPage = new ActiTimePage(oBrowser);
	  }catch(Exception e)
	  {
		  e.printStackTrace();	
	  }
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(3000);
			oPage.getlogin().click();
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimize()
	{
		try
		{
			oPage.getminiise().click();
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser123()
	{
		try
		{
			//user 1
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("1Niranjan");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("1SH");
			Thread.sleep(2000);
			oPage.getemailid().sendKeys("1Niru@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameinAdduser().sendKeys("1Niru");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(2000);
			
			
			//user 2
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("2Niranjan");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("2SH");
			Thread.sleep(2000);
			oPage.getemailid().sendKeys("2Niru@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameinAdduser().sendKeys("2Niru");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(2000);
			
			//user 2
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("3Niranjan");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("3SH");
			Thread.sleep(2000);
			oPage.getemailid().sendKeys("3Niru@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameinAdduser().sendKeys("3Niru");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getlogout().click();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class Assignpage9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign9page.launch();
		Assign9page.navigate();
		Assign9page.login();
		Assign9page.minimize();
		Assign9page.createuser123();
		Assign9page.logout();
		//Assign9page
		//Assign9page
	}

}
