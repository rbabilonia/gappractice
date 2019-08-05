package com.gap.exercise.steps;

import com.gap.exercise.pageobjects.vacationPageObjects;
import net.thucydides.core.annotations.Step;

public class vacationSteps  {
 
	vacationPageObjects vacationpageobjects;
	
	@Step
	public void login_vacationGAP(String strUser, String strPass)
	{		
		vacationpageobjects.open();		
		vacationpageobjects.dataSetLogin(strUser, strPass);		
		
	}
	
	@Step
	public void newUserVacationGAP(String strnewusername,String strnewlastname,String strnewemail,String strnumid,String strleadername,String strYear,String strMonth,String strDay)
	{			
		vacationpageobjects.newUsergapVacation(strnewusername, strnewlastname, strnewemail, strnumid, strleadername,strYear,strMonth,strDay);
		
	}
}