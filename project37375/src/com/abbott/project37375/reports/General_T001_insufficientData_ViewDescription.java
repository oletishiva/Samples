package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class General_T001_insufficientData_ViewDescription extends
ReportsHelper {

	@Test
	public void test_T001_insufficientData_ViewDescription() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           07-03-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 07, 03,2013,"23:50");
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Average Glucose From Menu and Verifying The
		 *           description of Average Glucose report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step1);
		navigateToScreen(client, "Average Glucose");
		clickOnIconAndVerifyReportMessage(client, "Average Glucose");
		capturescreenshot(client, getStepID(), true);
		clickOk(client);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Daily Graph From Menu and Verifying The
		 *           description of Daily Graph report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step2);
		navigateToScreen(client, "Daily Graph");
		clickOnIconAndVerifyReportMessage(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);
		clickOk(client);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Sensor Usage From Menu and Verifying The
		 *           description of Sensor Usage report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step3);
		navigateToScreen(client, "Sensor Usage");
		clickOnIconAndVerifyReportMessage(client, "Sensor Usage");
		capturescreenshot(client, getStepID(), true);
		clickOk(client);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Low Glucose Events From Menu and Verifying The
		 *           description of Low Glucose Events report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step4);
		navigateToScreen(client, "Low Glucose Events");
		clickOnIconAndVerifyReportMessage(client, "Low Glucose Events");
		capturescreenshot(client, getStepID(), true);
		clickOk(client);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Time In Target From Menu and Verifying The
		 *           description of Time In Target report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step5);
		navigateToScreen(client, "Time In Target");
		clickOnIconAndVerifyReportMessage(client, "Time In Target");
		capturescreenshot(client, getStepID(), true);
		clickOk(client);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Daily Patterns From Menu and Verifying The
		 *           description of Daily Patterns report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step6);
		navigateToScreen(client, "Daily Patterns");
		clickOnIconAndVerifyReportMessage(client, "Daily Patterns");
		capturescreenshot(client, getStepID(), true);
		clickOk(client);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS953_SDAISRS299
		 * @Expected Selecting Estimated A1c From Menu and Verifying The
		 *           description of Estimated A1c report is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step7);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			clickOnIconAndVerifyReportMessage(client, "Estimated A1c");
			capturescreenshot(client, getStepID(), true);
			clickOk(client);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set device time to 03-11-2013 00:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 11, 03,2014,"00:00");

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 30 days from Average Glucose and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step8);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 30);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 90 days From Average Glucose and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step9);

		clickOnDays(client, 90);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 14 days From Average Glucose and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step10);

		clickOnDays(client, 14);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 7 days From Average Glucose and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step11);

		clickOnDays(client, 7);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 7 days From Daily Pattern and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step12);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 7);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 30 days From Daily Pattern and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step13);

		clickOnDays(client, 30);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 14 days From Daily Pattern and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step14);

		clickOnDays(client, 14);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 90 days From Daily Pattern and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step15);

		clickOnDays(client, 90);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 90 days From Time In Target and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step16);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 7 days From Time In Target and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step17);

		clickOnDays(client, 7);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 14 days From Time In Target and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step18);

		clickOnDays(client, 14);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 30 days From Time In Target and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step19);

		clickOnDays(client, 30);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS957
		 * @Expected Navigate to Daily Graph From Menu and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step20);

		navigateToScreen(client, "Daily Graph");
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUIRS957
		 * @Expected Go to previous Daily Graph report (Tap arrow on top left)
		 *           and Verifying Not Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step21);

		clickArrowOnTopLeftOfTheGraph(client, 1);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 7 days From SensorUsage and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step22);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 7);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 14 days From SensorUsage and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step23);

		clickOnDays(client, 14);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 90 days From SensorUsage and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step24);

		clickOnDays(client, 90);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 25
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 30 days From SensorUsage and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step25);

		clickOnDays(client, 30);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting Estimated A1c from menu and Verifying Not Enough
		 *           Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step26);

		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			verifyNotEnoughSensorDataMessage(client);
			capturescreenshot(client, getStepID(), true);
		} else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}

		/**
		 * 
		 * @stepId Step 27
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 90 days From Low Glucose Events and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step27);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 90);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 28
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 30 days From Low Glucose Events and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step28);

		clickOnDays(client, 30);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 29
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 14 days From Low Glucose Events and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step29);

		clickOnDays(client, 14);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 30
		 * @Reqt SDAIUIRS957
		 * @Expected Selecting 7 days From Low Glucose Events and Verifying Not
		 *           Enough Sensor Data message is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T001_insufficientData_ViewDescription_Step30);

		clickOnDays(client, 7);
		verifyNotEnoughSensorDataMessage(client);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
