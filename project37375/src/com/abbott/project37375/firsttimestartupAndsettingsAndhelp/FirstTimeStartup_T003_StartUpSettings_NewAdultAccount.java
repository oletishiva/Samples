package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class FirstTimeStartup_T003_StartUpSettings_NewAdultAccount extends
FirstSequenceAndSettingsHelper {

	@Test
	public void test_T003_StartUpSettings_Auto_NewAdultAccount()
			throws Exception {

		setEmail();

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1238_SDAUIRS1239
		 * @Expected Create New Account screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step1);
		getStarted(client, true);
		verifyPageTitles(client, "countryOfOriginTitle");
		clickOnButtonOption(client, "Next", true);
		clickCheckBox(client, "termsOfUseTitle", true);
		clickCheckBox(client, "privacyNoticeTitle", true);
		verifyCreateAccountScreenisEditable(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1238_SDAUIRS1239
		 * @Expected adult Account Login screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step2);
		createNewAccountDetails(client, "Tester", "Adult", "5", "17", "1960");
		clickOnButtonOption(client, "Next", true);
		verifyAdultAccountLoginScreenisEditable(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS943
		 * @Expected Unit of Measurement screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step3);
		adultLoginDetails(client, getEmail(), LibrelinkConstants.CURRENT_PASSWORD, LibrelinkConstants.CURRENT_PASSWORD, true);
		clickOnCreateAccount(client);
		verifyUnitOfMeasurementPageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS943
		 * @Expected Target Glucose Range screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step4);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client, "targetGlucoseRangeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS943
		 * @Expected Unit of Measurement screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step5);
		clickOnBackOrMenuIcon(client);
		verifyPageTitles(client, "unitOfMeasurementTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS943
		 * @Expected Target Glucose Range screen is displayed with details
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step6);
		clickOnButtonOption(client, "Next", true);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
		verifyTargetGlucoseRangePageDetails(client,"100","140");
		}else{
			verifyTargetGlucoseRangePageDetails(client,"5.6","7.8");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS943
		 * @Expected App doesn't allow us to set both low and high target glucose range as same
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step7);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseRangeDifference(client, "120", "120");
		} else {
			verifyGlucoseRangeDifference(client, "6.7", "6.7");
		}		
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS943
		 * @Expected App allows to choose Glucose Ranges Low between (70mg/dL to
		 *           179mg/dL and High between 71 mg/dL to 180 mg/dL( or Low
		 *           between 3.9mmol/L to 9.9mmol/L , High between 4.0mmol/L to
		 *           10.0mmol/L for mmol/L build
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step8);
			verifyLowGlucoseRange(client);
			verifyHighGlucoseRange(client);
			capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 9
		 * @Reqt SDAUIRS943
		 * @Expected Carbohydrate Units screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step9);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client, "carbohydrateUnitsTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 10
		 * @Reqt SDAUIRS943
		 * @Expected App navigates back to Target Glucose Range screen
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step10);
		clickOnBackOrMenuIcon(client);
		verifyPageTitles(client, "targetGlucoseRangeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 11
		 * @Reqt SDAUIRS943
		 * @Expected Carbohydrate Units screen is displayed with details
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step11);
		clickOnButtonOption(client, "Next", true);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			selectCarbohydrateUnits(client, "servings");
		}
		else{
		carbohydrateUnitsPageDetails(client,"portions");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 12
		 * @Reqt SDAUIRS943
		 * @Expected Serving Bar allows the user to select the values from 10.0 grams to 15.0 grams
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step12);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			selectCarbohydrateUnits(client, "servings");
		}
		else{
		selectCarbohydrateUnits(client,"portions");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 13
		 * @Reqt SDAUIRS943
		 * @Expected servings text and serving bar is disabled
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step13);
		selectCarbohydrateUnits(client, "grams");
				capturescreenshot(client, getStepID(), true);
		
		
		
		/**
		 *
		 * @stepId Step 14
		 * @Reqt SDAUIRS943
		 * @Expected Scan Sounds Page displayed.
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step14);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client,"scanSoundsTitle");
		chooseSoundOrVibration(client, "scanSoundsOsDefault");
		capturescreenshot(client, getStepID(), true);
		clickOnButtonOption(client, "Next", true);

		/**
		 *
		 * @stepId Step 15
		 * @Reqt SDAUIRS1292
		 * @Expected Welcome Page with Safety Information is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step15);
		clickOnButtonOption(client, "Next", true);
		//TODO
		verifyWelcomeScreen(client);
		capturescreenshot(client, getStepID(), true);
		
		if (getSafetyConfig().equalsIgnoreCase("yes")) {
		/**
		 *
		 * @stepId Step 15.1
		 * @Reqt SDAUIRS1292
		 * @Expected Safety Information is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step15_1);
		//TODO
		verifySafetyInfo(client);
		capturescreenshot(client, getStepID(), true);
		clickOnBackOrMenuIcon(client);
		
		}else{
			showNotApplicableScreenShot(client,"Step14_1_SDAUIRS1292_Safety Information screen_Not applicable as per Configuration for that build");
		}
		
		/**
		 *
		 * @stepId Step 16
		 * @Reqt SDAUIRS1217
		 * @Expected My Glucose Page is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step16);
		//TODO
		verifyPageTitles(client,"myGlucoseExplanationTitle");
		verifyMyGlucoseInfoPage(client, true);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 17
		 * @Reqt SDAUIRS1293
		 * @Expected Glucose Background Color Page is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step17);
		//TODO
		clickOnButtonOption(client, "Next", true);
		verifyGlucoseBackgroundColor(client, true);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 18
		 * @Reqt SDAUIRS1247
		 * @Expected Glucose Trend Arrow screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step18);	
		//TODO
		clickOnButtonOption(client, "Next", true);
		verifyGlucoseTrendArrow(client,true);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {
			/**
			 *
			 * @stepId Step 19
			 * @Reqt SDAUIRS1294
			 * @Expected Treatment Decisions Page 1 is displayed
			 * @Dependancy Script cannot proceed if this step fails
			 *
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step19);
			//TODO
			clickOnButtonOption(client, "Next", true);
			verifyTreatmentDecisionScreen1(client, true);
			capturescreenshot(client, getStepID(), true);

			/**
			 *
			 * @stepId Step 20
			 * @Reqt SDAUIRS1295
			 * @Expected Treatment Decisions Page 2 is displayed
			 * @Dependancy Script cannot proceed if this step fails
			 *
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step20);
			//TODO
			clickOnButtonOption(client, "Next", true);
			verifyTreatmentDecisionScreen2(client, true);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step18 & 19_SDAUIRS1294_SDAUIRS1295 Treatment Decisions Info screen_Not applicable for Non US build");
		}

		/**
		 *
		 * @stepId Step 21
		 * @Reqt SDAUIRS943
		 * @Expected LibreLink Home Screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step21);
		clickOnButtonOption(client, "Next", true);
		verifyHomePageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 22
		 * @Reqt SDAUIRS943
		 * @Expected App settings screen is displayed with selected values
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step22);
		clickOnSettingsMenu(client,"settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifySettingsPage(client, "off", "grams",0, "70 - 180 mg/dL","sound and vibration");
		} else {
			verifySettingsPage(client, "off", "grams",0, "3.9 - 10.0 mmol/L","sound and vibration");
		}
		capturescreenshot(client, getStepID(), true);


	}

	}

