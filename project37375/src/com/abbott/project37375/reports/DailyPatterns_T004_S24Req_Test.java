package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class DailyPatterns_T004_S24Req_Test extends ReportsHelper {

	@Test
	public void test_T004_S24Req_Test() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set Time format to 24 Hours and Turn-On network
		 *           time Set the Device Date to 09-13-2016
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 13, 9, 2016, "10:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set the Target Glucose Range to
		 *           100-140 using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "App Settings");

		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 70, 180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 10.0);
		}

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "ADC\S24_OneHour.json" using
		 *           MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "S24_OneHour.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS956, SDAIUIRS941, SDAIUIRS928
		 * @Expected 1. Screenshot is captured.2. The one- hour graph is matched
		 *           the one-hour graph in attached ApolloOneHour.pdf.3.
		 *           One-hour bar chart is shown from 20:30 to 21:30. The bar
		 *           chart are between 70 mg/dL and 180 mg/dL or 3.9-10.0
		 *           mmol/L.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T004_S24Req_Test_Step1);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);




		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "ADC\S24_OneHour.json" using
		 *           MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "S24_ThreeHours.json");

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS956, SDAIUIRS941, SDAIUIRS928
		 * @Expected 1. Screenshot is captured.2. 3-hours graph is shown from
		 *           20:30 to 23:30, Graph is smooth, no sharp angle around
		 *           22:00.3. The graph on report is matched with the graph of
		 *           attached Apollo_ThreeHours.pdf
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T004_S24Req_Test_Step2);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set the Device Date to 09-11-2016
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 11, 9, 2016, "23:30");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Load Data file to
		 *           "ADC\S24_Cross.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "S24_Cross.json");

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS941
		 * @Expected 1. Screenshot is captured.2. The graph is drawn from 20:30
		 *           to 23:30. All percentile lines ends with 50th percentile
		 *           line in both side.at 20:30. all lines start from 40 mg/dL
		 *           or 2.2 mmol/L at 23:30, all lines ends at 70 mg/dL or 3.9
		 *           mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyPatterns_T004_S24Req_Test_Step3);
		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
