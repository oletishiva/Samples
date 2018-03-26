package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class DailyPatterns_T003_DataAvailable extends ReportsHelper {

	@Test
	public void test_T003_DataAvailable() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to 00:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,07,2016,"00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "High-1data.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "High-1data.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS967
		 * @Expected Navigate to DailyPatterns Page and verifying Availability
		 *           data for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T003_data_Available_Step1);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client,  "DAILY PATTERNS",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS967
		 * @Expected verifying Availability data for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T003_data_Available_Step2);
		clickOnDays(client, 90);
		verifyReportDataAvailableForNdays(client,  "DAILY PATTERNS",90);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS967
		 * @Expected verifying Availability data for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T003_data_Available_Step3);
		clickOnDays(client, 30);
		verifyReportDataAvailableForNdays(client,  "DAILY PATTERNS",30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS967
		 * @Expected verifying Availability data for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.Daily_Patterns_Report_T003_data_Available_Step4);
		clickOnDays(client, 14);
		verifyReportDataAvailableForNdays(client,  "DAILY PATTERNS",14);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
