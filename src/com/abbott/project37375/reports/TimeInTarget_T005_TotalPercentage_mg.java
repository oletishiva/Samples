package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class TimeInTarget_T005_TotalPercentage_mg extends ReportsHelper {

	@Test
	public void test_T005_TotalPercentage_mg() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set the Phone Timing to 24 Hours Format and Set
		 *           device Date&time to 03-02-2013 23:50, Load Data file to
		 *           "Basic Data.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 02, 03, 2013, "23:50");
		loadTestData(client,  "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           76-172 mg/dL using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");
		verifyandsetTGfromSettings(client, 76, 172);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS977
		 * @Expected The percentage of >240 is 9%;The percentage of 173-240 is
		 *           35%;The percentage of 76-172 is 52%;The percentage of 70-75
		 *           is 1%;The percentage of <70 is 3%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T005_TotalPercentage_mg_Step1);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS977
		 * @Expected The percentage of >240 is 2%;The percentage of 173-240 is
		 *           87%;The percentage of 76-172 is 11%;The percentage of 70-75
		 *           is 0%;The percentage of <70 is 0%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T005_TotalPercentage_mg_Step2);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "TinTarget05.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "TinTarget05.json");

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
		verifyandsetTGfromSettings(client, 100, 140);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS977
		 * @Expected The percentage of >240 is 20%;The percentage of 141-240 is
		 *           20%;The percentage of 100-140 is 31%;The percentage of
		 *           70-99 is 20%;The percentage of <70 is 9%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T005_TotalPercentage_mg_Step3);
		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS977
		 * @Expected The percentage of >240 is 12%;The percentage of 141-240 is
		 *           35%;The percentage of 100-140 is 36%;The percentage of
		 *           70-99 is 12%;The percentage of <70 is 5%
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T005_TotalPercentage_mg_Step4);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);
	}
}
