package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T005_Results_Resolution extends UIGeneralHelper {


	@Test
	public void test_General_T005_Results_Resolution() throws Exception {

		/**
		 *
		 * @stepId Pre Condition
		 * @Reqt
		 * @Expected Time updated to midnight
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setTheTimeAlone(client, "00:00");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected My Glucose screen shows glucose value as 500 mg/dL ( or 27.8 mmol/L for mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step1);
		loadTestData(client, "MOCK_2", "ADC", "BG40-500-Calc39-501.json");
		navigateToMyGlucosePage(client);
		if (getUnits().equals("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"500");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"27.8");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected The Last Scan display 500 mg/dL (or 27.8 mmol/L for mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"500");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyLastScanInHomePage(client,"27.8");
		}		

		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected All Glucose Values in mg/dL are displayed as whole number (or All glucose values in mmol/L are displayed as one decimal for mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step3);
		navigateToScreen(client, "logbook");
		clickOnCalanderArrowButton(client,"back");
		verifyGlucoseValueTypeInLogbook(client, 5);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 4
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected Manual Blood glucose value in mg/dL are displayed as whole number
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/

		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step4);
		if (getUnits().equals("mg/dL")) {
			clickBloodDropIcon(client);
			client.click("NATIVE",
					"xpath=//*[@id='mdtp_ok' and @onScreen='true']", 0, 1);
			setBGR(client, "100");
			verifyBGRValueType(client);
			capturescreenshot(client, getStepID(), true);
			clickOnButtonOption(client, "Done", true);
		}else{
			showNotApplicableScreenShot(client,"Step4_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_Blood glucose not applicable");
		}

		/**
		 *
		 * @stepId Step 5
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected. Glucose value in mg/dL are displayed as whole number (or Glucose value in mmol/L are displayed as one decimal for mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step5);
		clickCreatedNote(client, "17:20");
		if (getUnits().equals("mg/dL")) {
			verifyLogBookDetailsScreenValue(client, "200");
		} else if (getUnits().equals("mmol/L")) {
			verifyLogBookDetailsScreenValue(client, "11.1");
		}

		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 6
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected Glucose Target Range values in mg/dL are displayed as whole number (or Glucose Target Range values in mmol/L are displayed as one decimal for mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step6);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "time_in_target");
		verifyTimeInTargetValueType(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAISRS322_SDAUIRS323_SDAUIRS847_SDAUIRS1222
		 * @Expected All glucose values in mg/dL are displayed as whole numbers (or all glucose values in mmol/L are displayed as one decimal for mmol/L)
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T005_Results_Resolution_Step7);
		navigateToScreen(client, "navigation_drawer_average_glucose");
		verifyAverageGlucoseValueType(client);
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);
	}

}
