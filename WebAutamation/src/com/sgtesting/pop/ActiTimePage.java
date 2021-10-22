package com.sgtesting.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	
	//user name text filed
	
		private WebElement username;
		public WebElement getusername()
		{
			return username;
		}
		
		// pasword text filed 
		
		private WebElement pwd;
		public WebElement getpassword()
		{
			return pwd;
		}
		
		// login button in login page
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement loginbutton;
		public WebElement getlogin()
		{
			return loginbutton;
		}
	
		// Minimise winow
		
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getminiise()
		{
			return gettingStartedShortcutsPanelId;
		}
	
	
	
	//user image click
    @FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement userlist;
	public WebElement getclickonuserlist()
	{
		return userlist;
	}
	
	//add user
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	
	//Firstname textfield
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	
	//lastname text filed
	private WebElement lastName;
	public WebElement getlastname()
	{
		return lastName; 
	}
	
	
	//enter gmail textfield
	
	private WebElement email;
	public WebElement getemailid()
	{
		return email;
	}
	
	//enter username text filed
	private WebElement userDataLightBox_usernameField;
	public WebElement getusernameinAdduser()
	{
		return userDataLightBox_usernameField;
	}
	
	//enter password text field
	
	private WebElement password;
	public WebElement getpasswordinadduser()
	{
		return password;
	}	
	
	//reenter password text field

	private WebElement passwordCopy;
	public WebElement getpasswordCopyinAdduser()
	{
		return passwordCopy;
	}
	
	//creatuser button
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
	private WebElement createuser ;
	public WebElement getclickonCreateuser()
	{
		return createuser;		
	}
	
	
	//deleteuser
     @FindBy(xpath="//span[text()='SH, Niranjan']")
     private WebElement userclick;
	 public WebElement getclickonusertodelete()
	 {
		 return userclick;
	 }
	 
	 //delete button
	 private WebElement userDataLightBox_deleteBtn;
	 public WebElement getclickondeletebutton()
	 {
		 return userDataLightBox_deleteBtn;
	 }
	
	 //click on task
	 @FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")
	private WebElement Taskbutton;
	 public WebElement getclickontaskbutton()
	 {
		 return Taskbutton;
	 }
	 
	 // click on add new  to create customer and project 
	 @FindBy(xpath="//div[text()='Add New']")
	 private WebElement addnew;
	 public WebElement getclickonaddnewforcustomerandproject()
	 {
		 return addnew;
	 }
	 
	// click on add new customer
	 @FindBy(xpath="/html/body/div[14]/div[1]")
	 private WebElement newcustomer;
	 public WebElement getclickonnewcustomer()
	 {
		 return newcustomer;
	 }
	 
	 //enter customer field
	 private WebElement customerLightBox_nameField;
	 
	 public WebElement getcustomername()
	 {
		 return customerLightBox_nameField;
	 }
	 
	// Enter discription of customer  customerLightBox_descriptionField
	 
	 private WebElement customerLightBox_descriptionField;
	 public WebElement getcustomerdescription()
	 {
		 return customerLightBox_descriptionField;
	 }
	 
	 //creat customerbutton
	 @FindBy(xpath="//span[text()='Create Customer']")
	 private WebElement createcustombutton ;
	 public WebElement getclickCreateCustomButton()
	{
		return createcustombutton ;
			
	}
	 
	 //close button
	 @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	 private WebElement closebutton;
	 public WebElement getclosebutton()
	 {
		 return closebutton;
	 }
		
	 //setting button
	 @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	 private WebElement settingbutton;
	 public WebElement getclickonsettingbutton()
	 {
		 return settingbutton;
	 }
	 
	 //click on Action button to delete  
	 @FindBy(xpath="//div[text()='ACTIONS']")
	 private WebElement action;
	 public WebElement getclickOnActionForCustomer()
	 {
		return action ;
			
	}	
	
	 //click on delete button  //div[text()='Delete']
	 @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	 private WebElement deletebutton;
	 public WebElement getclickondeletebuttonincustomer()
	 {
		 return deletebutton;
	 }
	 
	
	
	//delete permanently
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getclickonpermanentlydelete()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//creat newproject button
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newprojectbutton;
	public WebElement getclickonnewprojectbutton()
	{
		return newprojectbutton;
	}
	
	//enter projectname
	private WebElement projectPopup_projectNameField;
	public WebElement getnameofproject()
	{
		return projectPopup_projectNameField;
	}
	//click on creatproject
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createprojectbutton;
	public WebElement getclickoncreateproject()
	{
		return createprojectbutton;
	}
	// edit buuton for project setting button //*[@id="cpTreeBlock"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement edit;
	public WebElement getclickToEditForProj()
	{
		return edit ;
		
	}
	
	// Action button for project        //*[@id="taskListBlock"]/div[4]/div[1]/div[2]/div[3]/div/div
		@FindBy(xpath="  //*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement actionforproj;
		public WebElement getclickActionForProg()
		{
			return actionforproj ;
			
		}
	// Delete button for project    //div[text()='Delete']
		
    @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	//@FindBy(xpath="//span[text()='Delete']")
	private WebElement deleteproj;
	public WebElement getclickToDeleteProj()
	{
		return deleteproj ;
		
	}	
	
	// Delete project Permanently    projectPanel_deleteConfirm_submitTitle
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getclickToDeleteProjPermanat()
	{
			return projectPanel_deleteConfirm_submitTitle;
	}
	
	//add new task button
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement addnewtask;
	public WebElement getclickToAddNEwTASK()
	{
		return addnewtask ;
		
	}
   //  click on create new task    /html/body/div[13]/div[1]
	@FindBy(xpath="   /html/body/div[13]/div[1]")
	private WebElement createnewtask;
	public WebElement getclickToCreateNewTask()
	{
		return createnewtask ;
		
	}
	
//  Name field of task   //*[@id="createTasksPopup_createTasksTableContainer"]/table/tbody/tr[1]/td[1]/input
	
	@FindBy(xpath="  //*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement nameoftask;
	public WebElement getNewNAmeOfTask()
	{
		return nameoftask ;
		
	}
	
	// button of create task  //span[text()='Create Tasks']
	
	
		@FindBy(xpath=" //span[text()='Create Tasks']")
		private WebElement createtaskbutton;
		public WebElement getclickonCreateTaskButtonFinally()
		{
			return createtaskbutton ;
			
		}	
		
		
		// Delete alll task   check box    //*[@id='taskListBlock']/div[1]/table/tbody/tr/td[1]/div/div
		
        
		@FindBy(xpath="//*[@id='taskListBlock']/div[1]/table/tbody/tr/td[1]/div/div")
		private WebElement deletetaskbox;
		public WebElement getclickToDeleteTaskCheckBok()
		{
			return deletetaskbox ;
			
		}	
		
		//deletebutton  span[text()='Delete']
		
		               
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[1]/div/div[1]/div")
		private WebElement deletetask;
		public WebElement getclickToDeleteTask()
		{
			return deletetask ;
			
		}
		
		private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
		public WebElement getDeleTeTaskPERMA()
		{
			return deleteTaskPopup_deleteConfirm_submitTitle;
		}
		
	
	//log out
		private WebElement logoutLink;
		public WebElement getlogout()
		{
			return logoutLink;
		}

}
