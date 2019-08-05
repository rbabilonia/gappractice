package com.gap.exercise.pageobjects;

import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//<2019-08-03 rbabilonia>: GAP Vacation
@DefaultUrl("https://vacations-management.herokuapp.com/users/sign_in")

public class vacationPageObjects extends PageObject {
	
		// user field
		@FindBy(xpath="//INPUT[@id='user_email']") 
		public WebElementFacade txtUsername;
		
		// password field
		@FindBy(xpath="//INPUT[@id='user_password']") 
		public WebElementFacade txtPassword;
		
		// login button
		@FindBy(xpath="//INPUT[@class='submit']") 
		public WebElementFacade btnSignIn;
		
		//LBL HOMEPAGE
		@FindBy(xpath="//IMG[@alt='GAP Vacations Management']") 
		public WebElementFacade lblHomePage;
		

		
		//ADMIN USER - TAB
		@FindBy(xpath="//A[@href='/employees/new'][text()='Create a new employee']") 
		public WebElementFacade lnlcreateUser;
		
		//TXT FIRST NAME
		@FindBy(xpath="//INPUT[@id='employee_first_name']") 
		public WebElementFacade txtNewuserName;
		
		//TXT LAST NAME
		@FindBy(xpath="//INPUT[@id='employee_last_name']") 
		public WebElementFacade txtNewlastName;
		
		//TXT email
		@FindBy(xpath="//INPUT[@id='employee_email']") 
		public WebElementFacade txtNewemail;
		
		//TXT password
		@FindBy(xpath="//INPUT[@id='employee_identification']") 
		public WebElementFacade txtnumid;
		
		//TXT confirm password
		@FindBy(xpath="//INPUT[@id='employee_leader_name']") 
		public WebElementFacade txtleadername;
		
		//CMB YEAR
		@FindBy(id="employee_start_working_on_1i") 
		public WebElementFacade cmbyear;
		
		//CMB MONTH
		@FindBy(id="employee_start_working_on_2i") 
		public WebElementFacade cmbMonth;
		
		//CMB DAY
		@FindBy(id="employee_start_working_on_3i") 
		public WebElementFacade cmbDay;
		
		//BTN SAVE NEW USER
		@FindBy(css="#new_employee > div.actions > input[type=submit]") 
		public WebElementFacade btnsavenewuser;
		
		//assert
		@FindBy(xpath="(//TD[text()='Ronald Babilonia'])") 
		public WebElementFacade validarusuario;	
		
		
		//btnback
		@FindBy(xpath="//A[@href='/employees'][text()='Back']") 
		public WebElementFacade buttonback;
		
		
		//btnlogout
		@FindBy(xpath="//A[@href='/users/sign_out'][text()='Logout']") 
		public WebElementFacade buttonlogout;
		

		
		//Login Method
		public void dataSetLogin(String strUser, String strPass)
		{
			Serenity.takeScreenshot();			
			txtUsername.sendKeys(strUser);
			txtPassword.sendKeys(strPass);
			Serenity.takeScreenshot();
			btnSignIn.click();
			Serenity.takeScreenshot();
		}
		
		//Creating New USer
		public void newUsergapVacation(String strnewusername,String strnewlastname,String strnewemail,String strnumid,String strleadername,String strYear,String strMonth,String strDay)
		{

			lnlcreateUser.waitUntilVisible();
			lnlcreateUser.click();
			Serenity.takeScreenshot();
			txtNewuserName.waitUntilVisible();
			txtNewuserName.sendKeys(strnewusername);
			txtNewlastName.sendKeys(strnewlastname);
			txtNewemail.sendKeys(strnewemail);
			txtnumid.sendKeys(strnumid);
			txtleadername.sendKeys(strleadername);
			Serenity.takeScreenshot();		
			new Select(cmbyear).selectByVisibleText(strYear);
			new Select(cmbMonth).selectByVisibleText(strMonth);		
			new Select(cmbDay).selectByVisibleText(strDay);
			Serenity.takeScreenshot();
			
			//ASERT
			btnsavenewuser.click();
			buttonback.click();
			validarusuario.waitUntilVisible();
			
			String lblexpectedresult="Ronald Babilonia";
			String strMsglblconfirmation=validarusuario.getText();
			assertThat(lblexpectedresult,containsString(strMsglblconfirmation)); 
			
			
			buttonlogout.click();
			Serenity.takeScreenshot();
		}
		
		
}
