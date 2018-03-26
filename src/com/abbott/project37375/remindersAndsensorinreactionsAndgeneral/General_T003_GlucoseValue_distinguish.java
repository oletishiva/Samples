package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T003_GlucoseValue_distinguish extends UIGeneralHelper {


	@Test
	public void test_General_T003_GlucoseValue_distinguish() throws Exception {

		/**
		 * 
		 * @stepId Pre requisites
		 * @Reqt NA
		 * @Expected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client,100,140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}		

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1169 SDAISRS325
		 * @Expected 'The software displays the most recent scan result as 'LO'in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step1_1);
		setTheDateAndTime(client,2,8, 2017,"11:50");
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		verifyGlucoseValueandUnitsMyGlucose(client,"LO");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step1_2);
		clickOnBackOrMenuIcon(client);
		verifyLastScanInHomePage(client,"LO");
		capturescreenshot(client, getStepID() , true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step1_3);
		navigateToScreen(client, "logbook");
		verifyGlucoseValueInLogbook(client,"red","LO");
		capturescreenshot(client, getStepID() , true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step1_4);
		clickCreatedNote(client, "LO");
		verifyLogBookDetailsScreenValue(client,"LO");
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS888
		 * @Expected Software distinguishes the historical glucose values and connecting lines that fall below 70 mg/dL or 3.9 mmol/L on graph from around 00:00 to 09:00 in MyGlucose,HomeScreen and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step2_1);
		navigateToScreen(client, "home");
		navigateToMyGlucosePage(client);
		verifyGlucoseValueandUnitsMyGlucose(client,"LO");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step2_2);
		clickOnBackOrMenuIcon(client);
		verifyLastScanInHomePage(client,"LO");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step2_3);
		navigateToScreen(client, "logbook");
		clickCreatedNote(client, "LO");
		verifyLogBookDetailsScreenValue(client,"LO");
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS1170  SDAISRS325
		 * @Expected The software displays the  most recent scan result as HI in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step3_1);
		setTheDateAndTime(client,3, 8, 2017,"14:50");		
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		verifyGlucoseValueandUnitsMyGlucose(client,"HI");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step3_2);
		clickOnBackOrMenuIcon(client);
		verifyLastScanInHomePage(client, "HI");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step3_3);
		navigateToScreen(client, "logbook");
		verifyGlucoseValueInLogbook(client,"orange","HI");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step3_4);
		clickCreatedNote(client, "HI");
		verifyLogBookDetailsScreenValue(client,"HI");
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS1131 SDAUIRS1209 SDAUIRS1204
		 * @Expected Verify the software distinguishes the most recent scan result <70 mg/dL or 3.9 mmol/L in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step4_1);
		setTheDateAndTime(client,02, 8, 2017,"05:50");	
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"69");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"3.8");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step4_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client, "69");
		}else{
			verifyLastScanInHomePage(client,"3.8");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step4_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client, "red","69");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client, "69");
			verifyGlucoseValueInLogBookDetailsScreen(client,"69");
		}else{
			verifyGlucoseValueInLogbook(client,"red","3.8");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client, "3.8");
			verifyGlucoseValueInLogBookDetailsScreen(client,"3.8");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step4_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS1132 SDAUIRS1213 SDAUIRS1208
		 * @Expected Verify the software distinguishes the most recent scan result >240 mg/dL or 13.3 mmol/L in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step5_1);
		setTheDateAndTime(client,3, 8, 2017,"20:50");		
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"241");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"13.4");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step5_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"241");
		}else{
			verifyLastScanInHomePage(client,"13.4");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step5_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"orange","241");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client, "241");
			verifyGlucoseValueInLogBookDetailsScreen(client,"241");
		}else{
			verifyGlucoseValueInLogbook(client,"orange","13.4");
			capturescreenshot(client, getStepID(), true);

			clickCreatedNote(client, "13.4");
			verifyGlucoseValueInLogBookDetailsScreen(client,"13.4");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step5_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS1133 SDAUIRS1211 SDAUIRS872 SDAUIRS1206
		 * @Expected The glucose graph distinguishes the target glucose range in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step6_1);
		setTheDateAndTime(client,2, 8, 2017,"20:50");		
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client,99,180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.5, 10.0);
		}		
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"99");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"5.5");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step6_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"99");
		}else{
			verifyLastScanInHomePage(client,"5.5");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step6_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"green","99");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"99");
			verifyGlucoseValueInLogBookDetailsScreen(client,"99");
		}else{
			verifyGlucoseValueInLogbook(client,"green","5.5");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"5.5");
			verifyGlucoseValueInLogBookDetailsScreen(client,"5.5");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step6_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS1176 SDAUIRS1210 SDAUIRS1205 
		 * @Expected Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step7_1);
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client,100,180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 10.0);
		}	
		navigateToScreen(client, "home");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"99");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"5.5");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step7_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"99");
		}else{
			verifyLastScanInHomePage(client,"5.5");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step7_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"yellow","99");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"99");
			verifyGlucoseValueInLogBookDetailsScreen(client,"99");
		}else{
			verifyGlucoseValueInLogbook(client,"yellow","5.5");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"5.5");
			verifyGlucoseValueInLogBookDetailsScreen(client,"5.5");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step7_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS1133 SDAUIRS1211 SDAUIRS1206
		 * @Expected Verify the software distinguishes the most recent scan result within the Target Glucose Range in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step8_1);
		setTheDateAndTime(client,3,8, 2017,"08:50");	
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"180");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"10.0");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step8_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"180");
		}else{
			verifyLastScanInHomePage(client,"10.0");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step8_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"green","180");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"180");
			verifyGlucoseValueInLogBookDetailsScreen(client,"180");
		}else{
			verifyGlucoseValueInLogbook(client,"green","10.0");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"10.0");
			verifyGlucoseValueInLogBookDetailsScreen(client,"10.0");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step8_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt  SDAUIRS1177 SDAUIRS1212  SDAUIRS1207
		 * @Expected Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step9_1);
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client,100,179);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 9.9);
		}		
		navigateToScreen(client, "home");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"180");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"10.0");
		}
		capturescreenshot(client, getStepID(), true);	
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step9_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"180");
		}else{
			verifyLastScanInHomePage(client,"10.0");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step9_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"yellow","180");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"180");
			verifyGlucoseValueInLogBookDetailsScreen(client,"180");
		}else{
			verifyGlucoseValueInLogbook(client,"yellow","10.0");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"10.0");
			verifyGlucoseValueInLogBookDetailsScreen(client,"10.0");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step9_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS1176 SDAUIRS1210 SDAUIRS1205
		 * @Expected Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step10_1);
		setTheDateAndTime(client,2, 8, 2017,"02:50");	
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"70");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"3.9");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step10_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"70");
		}else{
			verifyLastScanInHomePage(client,"3.9");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step10_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"yellow","70");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"70");
			verifyGlucoseValueInLogBookDetailsScreen(client,"70");
		}else{
			verifyGlucoseValueInLogbook(client,"yellow","3.9");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"3.9");
			verifyGlucoseValueInLogBookDetailsScreen(client,"3.9");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step10_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS1133 SDAUIRS1211 SDAUIRS1206
		 * @Expected Verify the software distinguishes the most recent scan result within the Target Glucose Range in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step11_1);
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client,70,180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 10.0);
		}	
		navigateToScreen(client, "home");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"70");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"3.9");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step11_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"70");
		}else{
			verifyLastScanInHomePage(client,"3.9");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step11_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"green","70");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"70");
			verifyGlucoseValueInLogBookDetailsScreen(client,"70");
		}else{
			verifyGlucoseValueInLogbook(client,"green","3.9");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"3.9");
			verifyGlucoseValueInLogBookDetailsScreen(client,"3.9");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step11_4);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS1177 SDAUIRS1212  SDAUIRS1207
		 * @Expected Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L in MyGlucose, Home Screen, Logbook list and Logbook Detail Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step12_1);
		setTheDateAndTime(client,3, 8, 2017,"02:50");	
		loadTestData(client, "MOCK_2", "ADC","2d-G39-501distinguish.json");
		navigateToMyGlucosePage(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueandUnitsMyGlucose(client,"240");
		}else{
			verifyGlucoseValueandUnitsMyGlucose(client,"13.3");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step12_2);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client,"240");
		}else{
			verifyLastScanInHomePage(client,"13.3");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step12_3);
		navigateToScreen(client, "logbook");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseValueInLogbook(client,"yellow","240");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"240");
			verifyGlucoseValueInLogBookDetailsScreen(client,"240");
		}else{
			verifyGlucoseValueInLogbook(client,"yellow","13.3");
			capturescreenshot(client, getStepID(), true);
			clickCreatedNote(client,"13.3");
			verifyGlucoseValueInLogBookDetailsScreen(client,"13.3");
		}
		setStepID(LibrelinkConstants.General_T003_GlucoseValue_distinguish_Step12_4);
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
