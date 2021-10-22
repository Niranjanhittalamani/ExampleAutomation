package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assign3Page
{
	public static  WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\WebAutamation\\Library\\drivers\\chromedriver.exe");
			 oBrowser=new ChromeDriver();
			 oPage=new ActiTimePage(oBrowser);
			 
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
	
	static void createcustomer()
	{
		try
		{
			oPage.getclickontaskbutton().click();
			Thread.sleep(2000);
			oPage.getclickonaddnewforcustomerandproject().click();
			Thread.sleep(2000);
			oPage.getclickonnewcustomer().click();
			Thread.sleep(2000);
			oPage.getcustomername().sendKeys("Google");
			Thread.sleep(2000);
			oPage.getcustomerdescription().sendKeys("Im not a google man");
			Thread.sleep(2000);
			oPage.getclickCreateCustomButton().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try
		{
			oPage.getclickonsettingbutton().click();
			Thread.sleep(2000);
			oPage.getclickOnActionForCustomer().click();
			Thread.sleep(2000);
			oPage.getclickondeletebuttonincustomer().click();
			Thread.sleep(2000);
			oPage.getclickonpermanentlydelete().click();
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
public class Assignpage3 {

	public static void main(String[] args) {
		Assign3Page.launch();
		Assign3Page.navigate();
		Assign3Page.login();
		Assign3Page.minimize();
		Assign3Page.createcustomer();
		Assign3Page.deletecustomer();
        Assign3Page.logout();
		
	}

}
