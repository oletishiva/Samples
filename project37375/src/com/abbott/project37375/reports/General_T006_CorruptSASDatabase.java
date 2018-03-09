package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;
import com.experitest.client.Client;

public class General_T006_CorruptSASDatabase extends ReportsHelper {

	@Test
	public void test_T006_CorruptSASDatabase() throws Exception {
	
		/**
		 * 
		 * @stepId Step 1:Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set the smart device Date to Mar 15 2016.From
		 *           Debug Drawer, set the SAS DB to 'CORRUPT
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step1);
		setToDefault(client);
		setTheDate(client, "15", "03", "2016", 0);
		setToSASModeToCorrupt(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDASRS829
		 * @Expected Navigate to Daily Patterns Report and verifying 1. 'Error
		 *           loading data' failure is notified , 2. No Report or Data
		 *           calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step2);
		try {
			navigateToScreen(client, "Daily Patterns");
			clickOnDays(client, 90);
			verifyErrorLoadingData(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDASRS829
		 * @Expected Navigate to Time In Target Report and verifying 1. 'Error
		 *           loading data' failure is notified , 2. No Report or Data
		 *           calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step3);
		try {
			navigateToScreen(client, "Time In Target");
			clickOnDays(client, 90);
			verifyErrorLoadingData(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDASRS829
		 * @Expected Navigate to Low Glucose Events Report and verifying 1.
		 *           'Error loading data' failure is notified , 2. No Report or
		 *           Data calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step4);
		try {
			navigateToScreen(client, "Low Glucose Events");
			clickOnDays(client, 90);
			verifyErrorLoadingData(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDASRS829
		 * @Expected Navigate to Average Glucose Report and verifying 1. 'Error
		 *           loading data' failure is notified , 2. No Report or Data
		 *           calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step5);
		try {
			navigateToScreen(client, "Average Glucose");
			clickOnDays(client, 90);
			verifyErrorLoadingData(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDASRS829
		 * @Expected Navigate to Daily Graph Report and verifying 1. 'Error
		 *           loading data' failure is notified , 2. No Report or Data
		 *           calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step6);
		try {
			navigateToScreen(client, "Daily Graph");
			verifyErrorLoadingData(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDASRS829
		 * @Expected Navigate to Estimated A1C Report and verifying 1. 'Error
		 *           loading data' failure is notified , 2. No Report or Data
		 *           calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step7);
		try {
			if(getProperty("estimatedA1cgraph").equalsIgnoreCase("yes")){
				navigateToScreen(client, "Estimated A1c");
				verifyErrorLoadingData(client);
				capturescreenshot(client, getStepID(), true);
			}
			else{
				capturescreenshot(client, getStepID()+"_NotApplicable", true);
			}
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDASRS829
		 * @Expected Navigate to Sensor Usage Report and verifying 1. 'Error
		 *           loading data' failure is notified , 2. No Report or Data
		 *           calculations are displayed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_CorruptSASDatabase_Step8);
		try {
			navigateToScreen(client, "Sensor Usage");
			clickOnDays(client, 90);
			verifyErrorLoadingData(client);
			capturescreenshot(client, getStepID(), true);
		} catch (Exception e) {
			capturescreenshot(client, getStepID()
					+ LibrelinkConstants.exceptionTxt + e, false);
		}


		setSASDBToDefault(client);
		currentSystemTime(client);
		debugDrawerClearData(client);


	}

	private void setSASDBToDefault(Client client) {
		openDebugDrawer(client);

		client.click(
				"NATIVE",
				"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_database']]",
				0, 1);
		if (client.waitForElement("NATIVE",
				"xpath=//*[@id='text1' and @text='DEFAULT']", 0, 2000)) {
			client.click(
					"NATIVE",
					"xpath=//*[@text='DEFAULT' and @class='android.support.v7.widget.AppCompatCheckedTextView']",
					0, 1);
		}
		client.sleep(1000);

	}

	private void setToSASModeToCorrupt(Client client) {
		openDebugDrawer(client);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_mode']]",
				0);

		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_database']]",
				0);

		client.click(
				"NATIVE",
				"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_database']]",
				0, 1);
		if (client.waitForElement("NATIVE",
				"xpath=//*[@id='text1' and @text='CORRUPT']", 0, 2000)) {
			client.click(
					"NATIVE",
					"xpath=//*[@text='CORRUPT' and @class='android.support.v7.widget.AppCompatCheckedTextView']",
					0, 1);
		}
		client.sleep(10000);
	}

}
