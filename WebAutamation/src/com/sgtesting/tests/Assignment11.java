package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Usercreateanddelete
{
	public static WebDriver oBrowser = null;
	static void launch()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\WebAutamation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		}
		catch(Exception e)
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
	
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void cruser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("dhanu");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("awanti");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("awantidhanu@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("dj1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("12225");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12225");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
	
	
	static void delete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}	
public class Assignment11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usercreateanddelete.launch();
		Usercreateanddelete.navigate();
		Usercreateanddelete.login();
		Usercreateanddelete.cruser();
		Usercreateanddelete.delete();
		Usercreateanddelete.logout();
		Usercreateanddelete.close();

	}

}
