package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class AverageGlucose_T002_DataAvailable extends ReportsHelper {

	@Test
	public void test_T002_DataAvailable() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set Phone timing to 24hr Format and Set the phone time to
		 *           00:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 01, 07, 2016,"00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "High-1data" using MOCK_2 and Navigate
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC","High-1data.json");
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS994
		 * @Expected Navigate to Average Glucose Page and verifying Availability
		 *           data for 7days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T002_DataAvailable_Step1);
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client,  "AVERAGE GLUCOSE",7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS994
		 * @Expected verifying Availability data for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T002_DataAvailable_Step2);
		clickOnDays(client, 14);
		verifyReportDataAvailableForNdays(client, "AVERAGE GLUCOSE", 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS994
		 * @Expected verifying Availability data for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T002_DataAvailable_Step3);
		clickOnDays(client, 30);
		verifyReportDataAvailableForNdays(client, "AVERAGE GLUCOSE", 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS994
		 * @Expected verifying Availability data for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T002_DataAvailable_Step4);
		clickOnDays(client, 90);
		verifyReportDataAvailableForNdays(client, "AVERAGE GLUCOSE", 90);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
