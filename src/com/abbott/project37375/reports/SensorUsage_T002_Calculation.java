package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class SensorUsage_T002_Calculation extends ReportsHelper {

	@Test
	public void test_T002_Calculation() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           03-02-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,02, 03, 2013, "23:50");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2 and Navigate to
		 *           Home Page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1022_SDAIUIRS1023_SDAIUIRS1024
		 * @Expected Navigate to Sensor Usage Page and Click on 7 Days then
		 *           verify Total number of successful scan attempts 18, average scans 3 and percentage 74
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T002_Calculation_Step1);
		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 7);
		verifySensorUsageScanAttemptsForBasicData(client, 7);
		verifySensorUsageAverageScansPerDayForBasicData(client, 7);
		verifySensorUsagePercentageOfHGDataForBasicData(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1022_SDAIUIRS1023_SDAIUIRS1024
		 * @Expected Navigate to Sensor Usage Page and Click on 14 Days then
		 *           verify Total number of successful scan attempts 49, average scans 4 and percentage 88
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T002_Calculation_Step2);
		clickOnDays(client, 14);
		verifySensorUsageScanAttemptsForBasicData(client, 14);
		verifySensorUsageAverageScansPerDayForBasicData(client, 14);
		verifySensorUsagePercentageOfHGDataForBasicData(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1022_SDAIUIRS1023_SDAIUIRS1024
		 * @Expected Navigate to Sensor Usage Page and Click on 30 Days then
		 *           verify Total number of successful scan attempts 109, average scans 4 and percentage 96
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T002_Calculation_Step3);
		clickOnDays(client, 30);
		verifySensorUsageScanAttemptsForBasicData(client, 30);
		verifySensorUsageAverageScansPerDayForBasicData(client, 30);
		verifySensorUsagePercentageOfHGDataForBasicData(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS1022_SDAIUIRS1023_SDAIUIRS1024
		 * @Expected Navigate to Sensor Usage Page and Click on 90 Days then
		 *           verify Total number of successful scan attempts 227, average scans 3 and percentage 68
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.SensorUsage_T002_Calculation_Step4);
		clickOnDays(client, 90);
		verifySensorUsageScanAttemptsForBasicData(client, 90);
		verifySensorUsageAverageScansPerDayForBasicData(client, 90);
		verifySensorUsagePercentageOfHGDataForBasicData(client, 90);
		capturescreenshot(client, getStepID(), true);



		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
