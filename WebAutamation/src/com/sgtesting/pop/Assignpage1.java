package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assign1page
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





public class Assignpage1 {

	public static void main(String[] args) {
		Assign1page.launch();
		Assign1page.navigate();
		Assign1page.login();
		Assign1page.minimize();
		Assign1page.logout();

	}

}
