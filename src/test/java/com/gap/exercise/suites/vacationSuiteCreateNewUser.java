package com.gap.exercise.suites;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.gap.exercise.pageobjects.vacationPageObjects;
import com.gap.exercise.steps.vacationSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("dataDriven/data.csv")

public class vacationSuiteCreateNewUser {
	
	private String User;
	private String Password;
	private String strnewusername;
	private String strnewlastname;
	private String strnewemail;
	private String strnumid;
	private String strleadername;
	private String strYear;
	private String strMonth;
	private String strDay;
	
	
	@Managed 
	vacationPageObjects vacationpageobjects;
	
	@Steps
	vacationSteps vacationsteps;
	
	@Test
	public void vacation_gap_creat_new_user() {
						
		vacationsteps.login_vacationGAP(getUser(),getPassword());		
		vacationsteps.newUserVacationGAP(getstrnewusername(),getstrnewlastname(),getstrnewemail(),getstrnumid(),getstrleadername(),getstrYear(),getstrMonth(),getstrDay());
			
	}
	
		
	public void setUser(String User) {
		this.User=User;
	}
	
	public String getUser() {
		return User;
	}
	
	public void setPassword(String Password) {
		this.Password=Password;
	}
	
	public String getPassword() {
		return Password;	}
	
	
	//SET-GET Creating New User
	
	public void setstrnewusername(String strnewusername) {
		this.strnewusername=strnewusername;
	}
	
	public String getstrnewusername() {
		return strnewusername;	}
	
	public void setstrnewlastname(String strnewlastname) {
		this.strnewlastname=strnewlastname;
	}
	
	public String getstrnewlastname() {
		return strnewlastname;	}
	
	public void setstrnewemail(String strnewemail) {
		this.strnewemail=strnewemail;
	}
	
	public String getstrnewemail() {
		return strnewemail;	}
	
	public void setstrnumid(String strnumid) {
		this.strnumid=strnumid;
	}
	
	public String getstrnumid() {
		return strnumid;	}
	
	public void setstrleadername(String strleadername) {
		this.strleadername=strleadername;
	}
	
	public String getstrleadername() {
		return strleadername;	}
	
	public void setstrYear(String strYear) {
		this.strYear=strYear;
	}
	
	public String getstrYear() {
		return strYear;	}
	
	public void setstrMonth(String strMonth) {
		this.strMonth=strMonth;
	}
	
	public String getstrMonth() {
		return strMonth;	}
	
	public void setstrDay(String strDay) {
		this.strDay=strDay;
	}
	
	public String getstrDay() {
		return strDay;	}
	
	
}
