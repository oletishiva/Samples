package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class LowGlucoseEvents_T002_DataAvailable extends ReportsHelper {

	@Test
	public void test_T002_DataAvailable() throws Exception {

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
		 * @Expected Load Data file to "High-1data" using MOCK_2 and Navigate to
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "High-1data.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS983
		 * @Expected Verifying Low Glucose Events Report for 7 days:Data
		 *           Available for 4 of 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T002_DataAvailable_Step1);
		navigateToScreen
		(client, "Low Glucose Events");
		clickOnDays(client, 7);
		verifyReportDataAvailableForNdays(client, "LOW GLUCOSE EVENTS", 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS983
		 * @Expected Verifying Low Glucose Events Report for 14 days:Data
		 *           Available for 6 of 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T002_DataAvailable_Step2);
		clickOnDays(client, 14);
		verifyReportDataAvailableForNdays(client, "LOW GLUCOSE EVENTS", 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS983
		 * @Expected Verifying Low Glucose Events Report for 30 days:Data
		 *           Available for 6 of 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T002_DataAvailable_Step3);
		clickOnDays(client, 30);
		verifyReportDataAvailableForNdays(client, "LOW GLUCOSE EVENTS", 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS983
		 * @Expected Verifying Low Glucose Events Report for 90 days:Data
		 *           Available for 6 of 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.LowGlucoseEvents_T002_DataAvailable_Step4);
		clickOnDays(client, 90);
		verifyReportDataAvailableForNdays(client, "LOW GLUCOSE EVENTS", 90);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
