package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class General_T004_Time_NetworkTime_Setting_Check extends ReportsHelper {

	@Test
	public void test_T004_Time_NetworkTime_Setting_Check() throws Exception {

		appNetworkTimeCheck(client,false);
		closeRunningApplication(client);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1148
		 * @Expected The message is displayed:To use the LibreLink, user must be
		 *           enable the automatic Date & Time from phone
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_Time_Timezone_Settings_Step1);
		try {
			automaticDateAndTime(client, false);
			launch(client);
			verifyAutomaticDateMessage(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1148
		 * @Expected The Home screen is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T004_Time_Timezone_Settings_Step2);
		try {

			selectOptioninNetworkWarning(client,"Yes");
			automaticDateAndTime(client, true);
			launch(client);
			verifyHomeScreen(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

	}

}
