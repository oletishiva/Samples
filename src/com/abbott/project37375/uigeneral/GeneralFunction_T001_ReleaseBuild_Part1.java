package com.abbott.project37375.uigeneral;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class GeneralFunction_T001_ReleaseBuild_Part1 extends GeneralReleaseBaseHelper {

	/**
	 * Author: ShabinaSherif
	 * 
	 * Script to verify Release Build - Covers Below areas 
	 * Time format: 24 and 12 hour format, Network, Target Glucose Range, Settings
	 * Carbohydrate, Unit of Measure, Settings, Connected Account Settings
	 * Connected Account, adult-create, adult-signin, Logbook, Manual BG: add,
	 * date and time, error message Notes: add, edit, date and time, error message (Not
	 * including note associated with scan result) : multi Reminders: Help (All
	 * but 'Event Log'): First-Time Startup (all): Target Glucose Range Settings,
	 * Carbohydrate, Unit of Measure Settings, Connected Account Settings,
	 * Connected Account
	 *  @throws Exception
	 *  		Throws Exception as it involves date selection
	 */

	@Test
	public void test_T001_ReleaseBuild_Part1() throws Exception {

		/**
		 * 
		 * @stepId Pre requisites
		 * @Reqt NA
		 * @Expected
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setEmail();
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		launch(client);


		/**
		 * @stepId Step 1
		 * @Reqt SDAUIRS937 SDAUIRS938
		 * @Expected Verify the welcome screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step1);
		verifyAppTourScreens(client,1,"");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,2,"checkGlucoseWithPhone");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,3,"instantAccess");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,4,"actionableInsights");
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,5,"shareGlucoseInformation");
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 2
		 * @Reqt SDAUIRS939
		 * @Expected Verify the Confirm country screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step2);
		getStarted(client,true);
		verifyConfirmCountryPageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 3
		 * @Reqt SDAUIRS939
		 * @Expected Verify Terms Of Use Screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step3);
		clickOnButtonOptions(client, "next", true);
		verifyTermsAndPolicyPageDetails(client, "termsOfUseAcceptanceStatement",true);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 4
		 * @Reqt SDAUIRS939
		 * @Expected Privacy Notice Page gets displays with following details
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step4);
		clickCheckBox(client, true);
		verifyTermsAndPolicyPageDetails(client, "privacyNoticeTitle",true);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 5
		 * @Reqt SDAUIRS939
		 * @Expected The Pop-up displays with checkbox message I have read and explicitly accept the Privacy Notice 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step5);
		clickCheckBox(client, false);
		verifyPagePopUp(client,"privacyNoticeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 6
		 * @Reqt SDAUIRS939
		 * @Expected Accept Privacy notice from pop up and it should display Create account screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step6);
		clickCheckBox(client, true);
		verifyPageTitles(client, "nameAndBirthDateTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 7
		 * @Reqt SDAUIRS1238 SDAUIRS938
		 * @Expected A adult Account Login screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step7);
		createNewAccountDetails(client, "Tester", "Adult", "27");
		clickOnButtonOptions(client, "next", true);
		verifyAdultLoginScreen(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 8
		 * @Reqt SDAUIRS1238 SDAUIRS1239
		 * @Expected Enter email and password and click on create account, Also verify UOM screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step8);
		adultLoginDetails(client, getEmail(), LibrelinkConstants.CURRENT_PASSWORD, LibrelinkConstants.CURRENT_PASSWORD, true);
		clickOnCreateAccount(client);
		verifyUnitOfMeasurementPageDetails(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * @stepId Step 9
		 * @Reqt SDAUIRS943
		 * @Expected Click Next and verify Target Glucose default screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step9);
		if(client.isElementFound("NATIVE", "xpath=//*[@id='button1']", 0)){
			client.click("NATIVE", "xpath=//*[@id='button1']", 0, 1);
		}else {
			clickOnButtonOptions(client, "next", true);
		}
		verifyTargetGlucoseRangePageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 10
		 * @Reqt SDAUIRS943
		 * @Expected Modify glucose range and click on Next. Carbohydrates Unit screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step10);
		if(getUnits().contains("mg")){
			setGlucoseRange(client,"71","70");
		}else{
			setGlucoseRange(client,"4.0","3.9");
		}
		clickOnButtonOptions(client, "next", true);
		verifyCarbohydrateUnitsPageDetails(client,"Servings");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 11
		 * @Reqt SDAUIRS1292
		 * @Expected Select Gram option and click on done, Welcome screen should be displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step11);
		//TODO
		selectCarbohydrateUnits(client, "grams");
		clickOnButtonOptions(client, "next", true);
		verifyWelcomeScreen(client);
		capturescreenshot(client, getStepID(), true);


		if (getSafetyConfig().equalsIgnoreCase("yes")) {
			/**
			 * @stepId Step 12
			 * @Reqt SDAUIRS1292
			 * @Expected click on Safety Information and Safety information content should be displayed
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			//TODO
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step12);
			verifySafetyInfo(client);
			capturescreenshot(client, getStepID(), true);
			clickOnBackOrMenuIcon(client);
		}
		else
		{
			showNotApplicableScreenShot(client,"Step12_SDAUIRS1292_Safety Information screen_Not applicable as per Configuration for that build");
		}
		/**
		 * @stepId Step 13
		 * @Reqt SDAUIRS1217
		 * @Expected My Glucose screen should be displayed on the tap of NEXT in welcome screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		//TODO
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step13);
		clickOnButtonOptions(client, "next", true);
		verifyPageTitles(client,"myGlucoseExplanationTitle");
		verifyMyGlucoseInfoPage(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 14
		 * @Reqt SDAUIRS1293
		 * @Expected Glucose Background Color Screen displays the various results colors.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		//TODO
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step14);
		swipePage(client, "Right");
		verifyPageTitles(client, "backgroundGlucoseColorsTitle");
		verifyGlucoseBackgroundColor(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 15
		 * @Reqt SDAUIRS1247
		 * @Expected Glucose Trend Arrow screen gets displayed.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		//TODO
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step15);
		clickOnButtonOptions(client, "next", true);
		verifyPageTitles(client, "trendExplanationTitle");
		verifyGlucoseTrendArrow(client,false);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {

			/**
			 * 
			 * @stepId Step 16
			 * @Reqt  SDAUIRS1294
			 * @Expected Glucose Reading fourth screen is displayed and it shows Non-Actionable Icon image
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			//TODO
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step16);
			clickOnButtonOptions(client, "next", true);
			verifyPageTitles(client,"treatmentDecisions");
			verifyTreatmentDecisionScreen1(client,false);
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 17
			 * @Reqt  SDAUIRS1295
			 * @Expected Glucose Reading 5th screen is displayed and it shows the action to be performed on observing Non-actionable result
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			//TODO
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step17);
			clickOnButtonOptions(client, "next", true);
			verifyPageTitles(client,"treatmentDecisions");
			verifyTreatmentDecisionScreen2(client,false);
			capturescreenshot(client, getStepID(), true);
		}
		else
		{
			showNotApplicableScreenShot(client,"Step16 & 17_SDAUIRS1294_SDAUIRS1295_Treatment Decisions screen are not applicable as per Configuration for that build");
		}

		/**
		 * 
		 * @stepId Step 18
		 * @Reqt  SDAUIRS943
		 * @Expected On Allowing notification,Home Screen gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step18);
		clickOnButtonOptions(client, "done", true);
		capturescreenshot(client, getStepID(), true);
		waitFor(client, 10);
		/**
		 * @stepId Step 19
		 * @Reqt SDAUIRS1137
		 * @Expected click on how to apply a sensor link from Help and verify all 10 screens
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step19);
		verifyHowToApplyNewSensorLink(client, true);
		verifyHowToApplyNewSensorSteps(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAUIRS1137
		 * @Expected Applying a Sensor section contains total 10 screens with instructions for How to Apply a new sensor.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step20);
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client,"help");
		verifyandClickHelpSubMenu(client,"helpItemTitleApplySensor",true);
		verifyHowToApplyNewSensorSteps(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 21
		 * @Reqt SDAUIRS1138
		 * @Expected click on how to scan a sensor link and verify all 3 screens
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step21);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client,"home");
		clickOnButtonOptions(client, "next", true);
		verifyandClickHelpSubMenu(client,"helpItemTitleScanSensor",true);
		verifyHowToScanSensorSteps(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 22
		 * @Reqt SDAUIRS1138
		 * @Expected click on how to scan a sensor link from Help and verify all 3 screens
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step22);
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client,"help");
		verifyandClickHelpSubMenu(client, "helpItemTitleScanSensor", true);
		verifyHowToScanSensorSteps(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 23
		 * @Reqt SDAUIRS1283 SDAUIRS1284
		 * @Expected click on Glucose readings link from help and verify 5 screens
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step23);
		clickOnBackOrMenuIcon(client);
		//TODO
		verifyandClickHelpSubMenu(client, "Glucose Readings", true);
		verifyMyGlucoseInfoPage(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 24
		 * @Reqt  SDAUIRS1285
		 * @Expected Verify Glucose Reading second screen is displayed and it shows Background color explanation
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step24);
		swipePage(client, "Right");
		//TODO
		verifyGlucoseBackgroundColor(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 25
		 * @Reqt  SDAUIRS1286
		 * @Expected Glucose Reading third screen is displayed and it shows Trend Arrow explanation
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step25);
		swipePage(client, "Right");
		//TODO
		verifyGlucoseTrendArrow(client,false);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 26
			 * @Reqt  SDAUIRS1287
			 * @Expected Glucose Reading fourth screen is displayed and it shows Non-Actionable Icon image
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step26);
			swipePage(client, "Right");
			//TODO
			verifyTreatmentDecisionScreen1(client,false);
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 27
			 * @Reqt  SDAUIRS1288
			 * @Expected Glucose Reading 5th screen is displayed and it shows the action to be performed on observing Non-actionable result
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step27);
			swipePage(client, "Right");
			//TODO
			verifyTreatmentDecisionScreen2(client,false);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step26 & 27_SDAUIRS1287 SDAUIRS1288_Treatment Decisions Info screen_Not applicable as per Configuration for that build");
		}
		/**
		 * @stepId Step 28
		 * @Reqt SDAUIRS1140
		 * @Expected click on User Manual link from help and verify User Manual is not blank
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step28);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "helpItemTitleUserGuide", true);
		waitForProgress(client);
		verifyUsersManualGuide(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 29
		 * @Reqt SDAUIRS1187
		 * @Expected click on Terms of Use link from help and verify it gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step29);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "termsOfUseTitle", true);
		verifyPageTitles(client,"termsOfUseTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 30
		 * @Reqt SDAUIRS1191
		 * @Expected click on Privacy Notice link from help and verify it gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step30);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "privacyNoticeTitle", true);
		verifyPageTitles(client,"privacyNoticeTitle");
		capturescreenshot(client, getStepID(), true);


		if (getSafetyConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 31
			 * @Reqt  SDAUIRS1289 
			 * @Expected App displays an option to access the Safety Information and on click Safety information page should opened
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step31);
			clickOnBackOrMenuIcon(client);
			//TODO
			verifyHelpLinksInOrder(client,"Safety Information", "below");
			verifyandClickHelpSubMenu(client, "Safety Information", true);
			verifySafetyInformation(client);
			capturescreenshot(client, getStepID(), true);


		}else{
			showNotApplicableScreenShot(client,"Step31_SDAUIRS1289_Safety Information screen_Not applicable as per Configuration for that build");
		}

		if (getQuickStartConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 32
			 * @Reqt  SDAUIRS1290
			 * @Expected App displays an option to access the Quick start guide,On click Quick start guide should be displayed
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step32);
			clickOnBackOrMenuIcon(client);
			//TODO
			verifyHelpLinksInOrder(client,"Quick Start Guide", "above");
			verifyandClickHelpSubMenu(client, "Quick Start Guide", true);
			verifyQuickStartGuide(client);	
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,"Step32_SDAUIRS1290_Quick Start Guide screen_Not applicable as per Configuration for that build");
		}

		if (getQuickRefConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 33
			 * @Reqt  SDAUIRS1291 SDAISRS249
			 * @Expected App displays an option to access the Quick Reference Guide,on click Quick reference guide should displayed
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step33);
			clickOnBackOrMenuIcon(client);
			//TODO
			verifyHelpLinksInOrder(client,"Quick Reference Guide", "above");
			verifyandClickHelpSubMenu(client, "Quick Reference Guide", true);
			verifyQuickReferenceGuide(client);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step33_SDAUIRS1291_SDAISRS249_Quick Reference Guide screen_Not applicable as per Configuration for that build");
		}

		/**
		 * @stepId Step 34
		 * @Reqt SDAUIRS893
		 * @Expected The Note created with food attribute Breakfast 400 grams with today date and time 05:30
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step34);
		clickOnBackOrMenuIcon(client);
		waitFor(client, 2);
		navigateToScreen(client,"logbook");
		createNewNote(client, 5,30, null);
		selectNoteAttribute(client, "cbox_food_note");
		selectAndVerifyFoodItemFromMenu(client, "breakfast");
		if(!getCountryCode().contains("United Kingdom")){
			setAndGetCarbAmount(client,"400");
		}else{
			setAndGetCarbAmount(client,"40");
		}
		clickOnButtonOptions(client, "done", true);
		clickCreatedNote(client, "05:30");
		if(!getCountryCode().contains("United Kingdom")){
			verifyFoodInLogBookDetailPage(client, "breakfast", "grams", "400");
		}else{
			verifyFoodInLogBookDetailPage(client, "breakfast", "portions", "40.0");
		}

		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 35
		 * @Reqt SDAUIRS1134
		 * @Expected Edit note and enter value 401. Error msg will be displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step35);
		editNote(client);
		if(!getCountryCode().contains("United Kingdom")){
			setAndGetCarbAmount(client,"401");
			verifyFoodError(client,"grams");
		}else{
			setAndGetCarbAmount(client,"41");
			verifyFoodError(client,"portions");
		}


		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 36
		 * @Reqt SDAUIRS894
		 * @Expected The Note created with food attribute Breakfast 0 grams with today date and time 05:30 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step36);
		setAndGetCarbAmount(client,"0");
		clickOnButtonOptions(client, "done", true);
		if(!getCountryCode().contains("United Kingdom")){
			verifyFoodInLogBookDetailPage(client, "breakfast", "grams", "0");
		}else{
			verifyFoodInLogBookDetailPage(client, "breakfast", "portions", "0.0");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 37
		 * @Reqt SDAUIRS893
		 * @Expected The Note created with Rapid_Acting Insulin 200 units with yesterday date and time 12:00 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step37);
		clickOnBackOrMenuIcon(client);
		clickOnCalendarDate(client);
		pickDate(client, getDateFormat(-1));
		createNewNote(client, 12, 00,null);
		selectNoteAttribute(client, "cbox_fast_insulin_note");
		addNoteForInsulin(client,"rapidActingInsulin", "200");
		clickOnButtonOptions(client, "done", true);
		clickCreatedNote(client, "12:00");
		verifyInsulinLogBookDetailPage(client,"rapidActingInsulin", "200");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 38
		 * @Reqt SDAUIRS1201
		 * @Expected Edit insulin note for 201 and verify the error msg
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step38);
		editNote(client);
		addNoteForInsulin(client,"rapidActingInsulin", "201");
		verifyInsulinError(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 39
		 * @Reqt SDAUIRS894
		 * @Expected The Note created with Rapid_Acting Insulin 0.1 units 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step39);
		addNoteForInsulin(client,"rapidActingInsulin", "0.1");
		clickOnButtonOptions(client, "done", true);
		verifyInsulinLogBookDetailPage(client,"rapidActingInsulin", "0.1");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 40
		 * @Reqt SDAUIRS893
		 * @Expected The Note created with Long_Acting Insulin 0.1 units

		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step40);
		clickOnBackOrMenuIcon(client);
		createNewNote(client, 23,59,null);
		selectNoteAttribute(client, "cbox_slow_insulin_note");
		addNoteForInsulin(client,"longActingInsulin", "0.1");
		clickOnButtonOptions(client, "done", true);
		clickCreatedNote(client, "23:59");
		verifyInsulinLogBookDetailPage(client,"longActingInsulin", "0.1");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 41
		 * @Reqt SDAUIRS1201
		 * @Expected Edit insulin note for 201 and verify the error msg
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step41);
		editNote(client);
		addNoteForInsulin(client, "longActingInsulin","201");
		verifyInsulinError(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 42
		 * @Reqt SDAUIRS894
		 * @Expected Enter value 200 and submit the note and verify The Note created with Long_Acting Insulin 200 units
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step42);
		addNoteForInsulin(client,"longActingInsulin", "200");
		clickOnButtonOptions(client, "done", true);
		verifyInsulinLogBookDetailPage(client,"longActingInsulin", "200");
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);

		if(getCountryCode().contains("United States")){
			/**
			 * @stepId Step 43
			 * @Reqt SDAUIRS909_SDAUIRS908
			 * @Expected Create a Manual BG note value 20 mg/dL
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step43);
			clickCalendarArrow(client,1);
			createManualBGNote(client, 5, 30, null, "20");			
			verifyManualBGinLogbookList(client,"20","05:30");
			capturescreenshot(client, getStepID(), true);

			/**
			 * @stepId Step 44
			 * @Reqt SDAUIRS1188
			 * @Expected Error displayed when Manual BG value is less than 20
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step44);
			clickOnCalendarDate(client);
			pickDate(client, getDateFormat(-2));
			createManualBGNote(client, 12, 30, null, "19");
			verifyBGError(client);
			capturescreenshot(client, getStepID(), true);

			/**
			 * @stepId Step 45
			 * @Reqt SDAUIRS909 SDAUIRS1182
			 * @Expected The Manual BG is displayed at Logbook list:value 500 mg/dL
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step45);
			client.elementSendText("NATIVE", "id=manualbg_number", 0, "500");
			client.click("NATIVE", "text=Done", 0, 1);
			verifyManualBGinLogbookList(client,"500","12:30");
			capturescreenshot(client, getStepID(), true);
		}

		else{
			showNotApplicableScreenShot(client,"Step43,44 & 45 ReqtNo SDAUIRS908_SDAUIRS909_SDAUIRS1188_SDAUIRS1182_ManualBG_NotApplicable for Non US build");
		}

		/**
		 * @stepId Step 46
		 * @Reqt SDAUIRS893
		 * @Expected The Note created with Exercise attribute 12 hr 59 mins
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step46);
		navigateToScreen(client, "home");
		navigateToScreen(client, "logbook");
		createNewNote(client, 12,00, null);
		addNoteForExercise(client, "lowIntensity", 12, 59);
		clickOnButtonOption(client, "done", true);
		clickCreatedNote(client, "12:00");
		verifyExerciseIntensityInLogBookDetailPage(client, "lowIntensity", "12", "59");
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 47
		 * @Reqt SDAUIRS894
		 * @Expected Verify The Note created with comment attribute:
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step47);
		editNote(client);
		unSelectNoteAttribute(client,"cbox_exercise_note");
		scrollToBottomAddNotePage(client);
		enterNotesComments(client,
				LibrelinkConstants.TWENTY_CHARACTERS_COMMENTS);
		clickOnButtonOptions(client, "done", true);
		verifyNotesComments(client,
				LibrelinkConstants.TWENTY_CHARACTERS_COMMENTS);
		capturescreenshot(client, getStepID(), true);

		/**
		 * @stepId Step 48
		 * @Reqt SDAUIRS879_SDAUIRS1219
		 * @Expected Verify Created notes icon on Logbook list screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step48_1);
		clickOnBackOrMenuIcon(client);
		verifyaddedNote(client,"12:00","1");
		verifyaddedNote(client,"05:30","1");
		if(getCountryCode().contains("United States")){
			verifyManualBGinLogbookList(client,"20","05:30");
		}
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step48_2);
		clickCalendarArrow(client,-1);
		verifyaddedNote(client,"23:59","1");
		verifyaddedNote(client,"12:00","1");
		capturescreenshot(client, getStepID(), true);     

		/**
		 * @stepId Step 49
		 * @Reqt SDAUIRS891_SDAUIRS1014
		 * @Expected Verify Created notes icon on Logbook detail and Daily Graph screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step49_1);
		clickCreatedNote(client, "12:00");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step49_2);
		clickOnBackOrMenuIcon(client);
		clickCalendarArrow(client,1);
		clickCreatedNote(client, "12:00");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step49_3);
		clickOnBackOrMenuIcon(client);
		navigateToScreen(client,"daily_graph");
		capturescreenshot(client, getStepID(), true);
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step49_4);
		clickArrowOnDateBar(client,"back",1);
		capturescreenshot(client, getStepID(), true);
		navigateToScreen(client,"home");


		/**
		 * @stepId Step 50
		 * @Reqt SDAUIRS1239_SDAUIRS1145_SDAUIRS1146
		 * @Expected Home screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.GeneralFunction_T001_ReleaseBuild_Part1_Step50);
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		unInstall(client);
		install(client);
		launch(client);
		signIn(client, getEmail(),LibrelinkConstants.CURRENT_PASSWORD);
		termsOfPageAccept(client);
		clickAndAcceptPrivacyNoticePage(client);
		defaultSettings(client,"servings",12.5);
		launch(client);
		verifyHomePage(client);
		capturescreenshot(client, getStepID(), true);

	}
}
