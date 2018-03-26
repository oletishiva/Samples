package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class TimeInTarget_T002_DataAvailable extends ReportsHelper {

	@Test
	public void test_T002_DataAvailable() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set the Phone Timing to 24 Hours Format and Set
		 *           device time to 00:00, Load Data file to "High-1data.json"
		 *           using MOCK_2 then navigate to Time In Target
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,07,2016,"00:00");
		loadTestData(client, "MOCK_2","ADC", "High-1data.json");
		navigateToScreen(client, "Time In Target");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS971
		 * @Expected Navigate to Average Glucose Page and verifying Availability
		 *           data for 7 days:Data Available for 4 of 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T002_DataAvailable_Step1);
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client,  "TIME IN TARGET",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS971
		 * @Expected Navigate to Average Glucose Page and verifying Availability
		 *           data for 90 days:Data Available for 6 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T002_DataAvailable_Step2);
		clickOnDays(client, 90);
		verifyReportDataAvailableForNdays(client,  "TIME IN TARGET",90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS971
		 * @Expected Navigate to TimeInTarget Page and verifying Availability
		 *           data for 30 days:Data Available for 6 of 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T002_DataAvailable_Step3);
		clickOnDays(client, 30);
		verifyReportDataAvailableForNdays(client,  "TIME IN TARGET",30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS971
		 * @Expected Navigate to TimeInTarget Page and verifying Availability
		 *           data for 14 days:Data Available for 6 of 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.TimeInTarget_T002_DataAvailable_Step4);
		clickOnDays(client, 14);
		verifyReportDataAvailableForNdays(client,  "TIME IN TARGET",14);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
