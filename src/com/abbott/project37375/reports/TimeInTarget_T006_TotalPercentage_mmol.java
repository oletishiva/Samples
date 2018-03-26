package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class TimeInTarget_T006_TotalPercentage_mmol extends ReportsHelper {

	@Test
	public void test_T006_TotalPercentage_mmol() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set the Phone Timing to 24 Hours Format and Set
		 *           device Date&time to 02-28-2013 23:50, Load Data file to
		 *           "Basic Data.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           6.1-9.5 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		verifyandsetTGfromSettings(client, 6.1, 9.5);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS977
		 * @Expected Time In Target report_Total Percentage99: All percentages
		 *           displayed in the Time In Target report add to 100%
		 *           according to the number of significant digits being
		 *           displayed:The percentage of >13.3 is 9%;The percentage of
		 *           9.6-13.3 is 37%;The percentage of 6.1-9.5 is 36%;The
		 *           percentage of 3.9-6.0 is 15%;The percentage of <3.9 is 3%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T006_TotalPercentage_mmol_Step1);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS977
		 * @Expected Time In Target report_Total Percentage101: All percentages
		 *           displayed in the Time In Target report add to 100%
		 *           according to the number of significant digits being
		 *           displayed:The percentage of >13.3 is 4%;The percentage of
		 *           9.6-13.3 is 87%;The percentage of 6.1-9.5 is 9%;The
		 *           percentage of 3.9-6.0 is 0%;The percentage of <3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T006_TotalPercentage_mmol_Step2);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           100-140 mg/dL using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		verifyandsetTGfromSettings(client, 9.5, 9.9);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS977
		 * @Expected Time In Target report_Total Percentage101: All percentages
		 *           displayed in the Time In Target report add to 100%
		 *           according to the number of significant digits being
		 *           displayed:The percentage of >13.3 is 4%;The percentage of
		 *           10.0-13.3 is 75%;The percentage of 9.5-9.9 is 13%;The
		 *           percentage of 3.9-9.4 is 8%;The percentage of <3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T006_TotalPercentage_mmol_Step3);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS977
		 * @Expected Time In Target report_Total Percentage101: All percentages
		 *           displayed in the Time In Target report add to 100%
		 *           according to the number of significant digits being
		 *           displayed:The percentage of >13.3 is 2%;The percentage of
		 *           10.0-13.3 is 52%;The percentage of 9.5-9.9 is 17%;The
		 *           percentage of 3.9-9.4 is 29%;The percentage of <3.9 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T006_TotalPercentage_mmol_Step4);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS977
		 * @Expected Time In Target report_Total Percentage99: All percentages
		 *           displayed in the Time In Target report add to 100%
		 *           according to the number of significant digits being
		 *           displayed:The percentage of >13.3 is 1%;The percentage of
		 *           10.0-13.3 is 26%;The percentage of 9.5-9.9 is 9%;The
		 *           percentage of 3.9-9.4 is 57%;The percentage of <3.9 is 7%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T006_TotalPercentage_mmol_Step5);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
