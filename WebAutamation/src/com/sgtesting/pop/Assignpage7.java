package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assign7page
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
	static void createproject()
	{
		try
		{
			oPage.getclickonaddnewforcustomerandproject().click();
			Thread.sleep(2000);
			oPage.getclickonnewprojectbutton().click();
			Thread.sleep(2000);
			oPage.getnameofproject().sendKeys("Facebook");
			Thread.sleep(2000);
			oPage.getclickoncreateproject().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createnewtask()
	{
		try
		{
		oPage.getclickToAddNEwTASK().click();
		Thread.sleep(2000);
		oPage.getclickToCreateNewTask().click();
		Thread.sleep(2000);
		oPage.getNewNAmeOfTask().sendKeys("do assign task");
		Thread.sleep(2000);
		oPage.getclickonCreateTaskButtonFinally().click();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();	
			
		}
	}
	static void deletetask()
	{
		try
		{
			oPage.getclickToDeleteTaskCheckBok().click();
			Thread.sleep(2000);
			oPage.getclickToDeleteTask().click();
			Thread.sleep(2000);
			oPage.getDeleTeTaskPERMA().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteproject()
	{
		try
		{
			oPage.getclickToEditForProj().click();
			Thread.sleep(2000);
			oPage.getclickActionForProg().click();
			Thread.sleep(2000);
			oPage.getclickToDeleteProj().click();
			Thread.sleep(2000);
			oPage.getclickToDeleteProjPermanat().click();
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
	static void close()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
public class Assignpage7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign7page.launch();
		Assign7page.navigate();
		Assign7page.login();
		Assign7page.minimize();
		Assign7page.createcustomer();
		Assign7page.createproject();
		Assign7page.createnewtask();
		//Assign7page.deletetask();
		Assign7page.deletecustomer();
		Assign7page.deleteproject();
		Assign7page.logout();
		Assign7page.login();
		//Assign7page
		
		
	}

}
