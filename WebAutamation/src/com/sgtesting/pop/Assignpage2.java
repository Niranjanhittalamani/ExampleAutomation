package com.sgtesting.pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
class Assign2page
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
	static void createuser()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("Niranjan");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("SH");
			Thread.sleep(2000);
			oPage.getemailid().sendKeys("Niru@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameinAdduser().sendKeys("Niru");
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
	static void deleteuser()
	{
		try
		{
			oPage.getclickonusertodelete().click();
			Thread.sleep(4000);
			oPage.getclickondeletebutton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}


public class Assignpage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assign2page.launch();
		Assign2page.navigate();
		Assign2page.login();
		Assign2page.minimize();
		Assign2page.createuser();
		Assign2page.deleteuser();
		Assign2page.logout();
		Assign2page.close();
	}

}
