package com.abbott.project37375.remindersAndsensorinreactionsAndgeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;
import com.experitest.client.Client;

public class General_T006_Results_WithUOM extends UIGeneralHelper {

	@Test
	public void test_General_T006_Results_WithUOM() throws Exception {

		/**
		 * 
		 * @stepId Pre Condition
		 * @Reqt
		 * @Expected Carbohydrate Unit is set to grams
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		clickOnSettingsMenu(client, "settings");
		navigateToSubMenuScreens(client, "carbohydrateUnitsTitle");
		setCarbohydrateUnits(client, "grams");
		clickOnBackOrMenuIcon(client);

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAISRS1175
		 * @Expected About screen is displayed the smart device Model and OS version details
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step1);
		clickOnSettingsMenu(client,"about");
		verifyOSDetails(client);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 *
		 * @stepId Step 2
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected The Add Note screen unit-of-measure is displays as:Breakfast - grams,Rapid-Acting Insulin - units,Long-acting Insulin - units
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step2);
		navigateToScreen(client,"logbook");
		createNewNote(client,3,30,null);
		clickAndSetFoodAttribute(client, "breakfast", "20");
		addNoteForInsulin(client,"Rapid", "2.0");
		addNoteForInsulin(client,"Long", "3.0");
		addNoteForExercise(client, "lowIntensity", 12, 02);
		client.swipe("Up", 500, 500);
		verifyFoodEntry(client,"Breakfast","grams","20");
		verifyInsulinUnits(client,"Rapid","2.0");
		verifyInsulinUnits(client,"Long","3.0");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 3
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected In Logbook Details screen, the numerical values unit of measurements are displayed for selected attributes
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step3);
		clickOnButtonOption(client, "Done", true);
		clickCreatedNote(client, "03:30");
		verifyFoodInLogBookDetailPage(client, "breakfast", "grams", "20");
		verifyInsulinLogBookDetailPage(client, "rapidActingInsulin", "2");
		verifyInsulinLogBookDetailPage(client, "longActingInsulin", "3");
		verifyExerciseIntensityInLogBookDetailPage(client, "Low", 12, 2);		
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 *
		 * @stepId Step 4
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected The Average Glucose readings displayed with unit of measurement mg/dL or mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step4);
		loadTestData(client, "MOCK_2", "Autodated","90days_autoDate.json");
		navigateToScreen(client,"home");
		verifyAvgGlucoseUnitsinHome(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 5
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected DAILY PATTERNS report Y-axis Glucose values are displayed with unit of measurement mg/dL or mmol/L  for 7 days, 14 days, 30 days and 90 days date ranges.
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step5);
		navigateToScreen(client, "daily_patterns");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID().replace("Step5", "Step5.1") + "_7 days", true);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID().replace("Step5", "Step5.2") + "_14 days", true);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID().replace("Step5", "Step5.3") + "_30 days", true);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID().replace("Step5", "Step5.4") + "_90 days", true);

		/**
		 *
		 * @stepId Step 6
		 * @Reqt SDAISRS354 _SDAUIRS842
		 * @Expected The Target Glucose Range glucose values displays with UOM mg/dL or mmol/L for 7 days, 14 days, 30 days & 90 days� range. and The Target Glucose Range report display each bar with numerical %
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step6);
		navigateToScreen(client, "time_in_target");
		clickOnDays(client, 7);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step6", "Step6.1") + "_7 days", true);
		clickOnDays(client, 14);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step6", "Step6.2") + "_14 days", true);
		clickOnDays(client, 30);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step6", "Step6.3") + "_30 days", true);
		clickOnDays(client, 90);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step6", "Step6.4") + "_90 days", true);

		/**
		 *
		 * @stepId Step 7
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected AVERAGE GLUCOSE report is displayed the Average  Glucose value with unit of measurement mg/dL or mmol/L for 7 days, 14 days, 30 days and 90 days.
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step7);
		navigateToScreen(client, "navigation_drawer_average_glucose");
		clickOnDays(client, 7);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step7", "Step7.1") + "_7 days", true);
		clickOnDays(client, 14);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step7", "Step7.2") + "_14 days", true);
		clickOnDays(client, 30);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step7", "Step7.3") + "_30 days", true);
		clickOnDays(client, 90);
		verifyGlucoseUnits(client);
		capturescreenshot(client, getStepID().replace("Step7", "Step7.4") + "_90 days", true);

		/**
		 *
		 * @stepId Step 8
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected DAILY GRAPH report is displayed  the Y-axis Glucose values with unit of measurement mg/dL or mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step8);
		navigateToScreen(client, "daily_graph");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 9
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected 'In Target Glucose Range screen, the Target Glucose Range values are displayed with UOM as mg/dL or mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step9);
		clickOnSettingsMenu(client, "settings");
		navigateToSubMenuScreens(client, "targetGlucoseRangeTitle");
		verifyTargetRangeUOM(client);
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOption(client,"Save", true);
		/**
		 *
		 * @stepId Step 10
		 * @Reqt SDAISRS354
		 * @Expected In Carbohydrate Units screen, the UOM for Carbohydrate is displayed as grams and servings. ( for UK, it is displayed as gram and portions)
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step10);
		navigateToSubMenuScreens(client, "carbohydrateUnitsTitle");
		verifyCarbohydrateOptions(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 11
		 * @Reqt SDAISRS354
		 * @Expected 'The unit-of-measure for Breakfast is displayed as servings. ( for UK , it is displayed as portions)
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step11);
		clickCarbohydrateUnit(client,"servings");
		clickOnButtonOption(client,"Save", true);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "logbook");
		createNewNote(client,4,35,null);
		clickAndSetFoodAttribute(client, "breakfast", "20");
		verifyFoodEntry(client,"Breakfast","servings","20");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 12
		 * @Reqt SDAISRS354
		 * @Expected The unit-of-measure for Breakfast is displayed as svg (servings); For UK, it is displayed as ptn (portions).
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step12);
		clickOnButtonOption(client, "Done", true);
		clickCreatedNote(client, "04:35");
		verifyFoodInLogBookDetailPage(client, "breakfast", "servings", "20.0");
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		/**
		 *
		 * @stepId Step 13
		 * @Reqt SDAISRS354_SDAUIRS842
		 * @Expected  My Glucose screen is displayed the values with UOM as:Breakfast servings(20.0svg)  ( or Portions( 20.0 ptns) for UK build ),Rapid-Acting Insulin units(2 units),Long-acting Insulin units(3 units),Exercise Low Intensity Hrs(12 hours 2 minutes).
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step13);
		selectingSASMode(client, "MOCK_1");
		debugDrawerClearData(client);
		openDebugDrawer(client);
		bgValueWithStaticTime(client,"Realtime","100",false,0,0);
		scanMockSensor(client, null);
		clickAddNoteInMyGlucose(client);
		clickAndSetFoodAttribute(client, "breakfast", "20");
		addNoteForInsulin(client,"Rapid", "2.0");
		addNoteForInsulin(client,"Long", "3.0");
		addNoteForExercise(client, "lowIntensity", 12, 02);
		clickOnButtonOption(client, "Done", true);
		waitFor(client, 2);
		navigateToMyGlucosePage(client);
		clickOnNotesorTimeZoneorBG(client,"note",0);
		verifyNotePopUpDetail(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 14
		 * @Reqt SDAISRS354
		 * @Expected Home screen is displayed the values with UOM as:Breakfast servings(20.0svg)  ( or Portions( 20.0 ptns) for UK build ),Rapid-Acting Insulin units(2 units),Long-acting Insulin units(3 units),Exercise Low Intensity Hrs(12 hours 2 mins).
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step14);
		clickOnBackOrMenuIcon(client);
		waitFor(client, 1);
		clickOnNotesorTimeZoneorBG(client,"note",0);
		verifyNotePopUpDetail(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 15
		 * @Reqt  SDAISRS354_SDAUIRS842
		 * @Expected Home screen is displayed Sensor Life in 'DAYS' and UOM for Glucose Reading as mg/dL or mmol/L
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step15);
		debugDrawerClearData(client);
		selectingSASMode(client, "MOCK_1");
		debugDrawerClearData(client);
		openDebugDrawer(client);
		bgValueWithStaticTime(client,"Realtime","100",false,0,0);
		scanMockSensor(client, null);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client, "home");
		verifySensorlife(client, "days");
		verifyLastScanUnitsInHomePage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 16
		 * @Reqt SDAISRS354
		 * @Expected Home screen displayed the Sensor life in HOURS.
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step16);
		debugDrawerClearData(client);
		editConfiguration(client, -13, -21, -30,"1/14");
		verifySensorlife(client, "hours");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 17
		 * @Reqt SDAISRS354
		 * @Expected Home screen displayed the Sensor life in MINUTES.
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step17);
		editConfiguration(client, -13, -23, -30,"1/14");
		verifySensorlife(client, "minutes");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 18
		 * @Reqt SDAUIRS842
		 * @Expected No unit of measure for numerical value with a percentage
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step18);
		debugDrawerClearData(client);
		loadTestData(client, "MOCK_2", "Autodated","90days_autoDate.json");
		verifyTimeintargetinHome(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 19
		 * @Reqt SDAUIRS842
		 * @Expected No unit of measure for numerical value with Time
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step19);
		verifyTimeinLastScan(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 20
		 * @Reqt SDAUIRS842
		 * @Expected No unit of measure for numerical value with a count
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step20);
		navigateToScreen(client, "navigation_drawer_sensor_usage");
		verifySensorscanpage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 21
		 * @Reqt SDAUIRS842
		 * @Expected No unit of measure for numerical value with a date
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step21);
		navigateToScreen(client, "logbook");
		client.click("NATIVE", "xpath=//*[@id='logbook_item_glucose_trend' and @class='com.librelink.app.ui.widget.GlucoseTrendView' and @onScreen='true']", 0, 1);
		verifyTimeinLogbookDetails(client);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		/**
		 *
		 * @stepId Step 22
		 * @Reqt SDAUIRS842
		 * @Expected No unit of measure for the numerical value is associated with a bar in a graph
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.General_T006_Results_WithUOM_Step22);
		navigateToScreen(client, "navigation_drawer_average_glucose");
		verifyAverageGlucoseValue(client);
		capturescreenshot(client, getStepID(), true);
		selectingSASMode(client,"DEFAULT");

	}

	/**
	 * Author:NagarajuKasarla
	 * 
	 * verify Note Pop-Up
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */
	public void verifyNotePopUpDetail(Client client) {
		verifyNotePopUpDetails(client,"Breakfast (20.0svg)");
		verifyNotePopUpDetails(client, "Rapid-Acting Insulin (2 units)");
		verifyNotePopUpDetails(client, "Long-Acting Insulin (3 units)");
		verifyNotePopUpDetails(client, "Exercise Low Intensity (12 hrs 2 mins)");
	}

}
