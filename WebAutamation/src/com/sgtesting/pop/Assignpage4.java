package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assign4page
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
			Thread.sleep(3000);
			
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
	static void modifycustomer()
	{
		try
		{
			oPage.getclickonsettingbutton().click();
			Thread.sleep(2000);
			oPage.getcustomerdescription().sendKeys("oh sorry,Im  a google man");
			//Thread.sleep(2000);
			oPage.getclosebutton().click();
			Thread.sleep(3000);
			
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
public class Assignpage4 {

	public static void main(String[] args) {
		Assign4page.launch();
		Assign4page.navigate();
		Assign4page.login();
		Assign4page.minimize();
		Assign4page.createcustomer();
		//Assign4page.modifycustomer();
		Assign4page.deletecustomer();;
		Assign4page.logout();
		

	}

}
