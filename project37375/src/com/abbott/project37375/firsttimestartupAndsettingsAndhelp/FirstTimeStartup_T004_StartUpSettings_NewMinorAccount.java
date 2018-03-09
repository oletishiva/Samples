package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class FirstTimeStartup_T004_StartUpSettings_NewMinorAccount extends
FirstSequenceAndSettingsHelper {

	@Test
	public void test_T004_StartUpSettings_Auto_NewMinorAccount()
			throws Exception {

		setEmail();

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1238
		 * @Expected Create New Account screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step1);
		getStarted(client, true);
		verifyPageTitles(client, "countryOfOriginTitle");
		clickOnButtonOption(client, "Next", true);
		clickCheckBox(client, "termsOfUseTitle",true);
		clickCheckBox(client, "privacyNoticeTitle",true);
		verifyCreateAccountScreenisEditable(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1238_SDAUIRS1240
		 * @Expected Date of birth is used to set up your LibreView account and
		 *           not to determine whether the App is appropriate for your
		 *           use.Please consult the App user's manual before using the
		 *           App displayed "
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step2);
		createMinorAccountDetails(client, "Kid", "Minor");
		clickOnButtonOption(client, "Next", true);
		verifyMinorWarningMessage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS1238_SDAUIRS1240
		 * @Expected A Parent/Guardian Account Login screen get displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step3);
		clickMinorMessageOk(client);
		verifyParentAccountLoginScreenisEditable(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS943
		 * @Expected Unit of Measurement screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step4);
		minorLoginDetails(client, "Parent", "Adult", getEmail(),
				LibrelinkConstants.CURRENT_PASSWORD, LibrelinkConstants.CURRENT_PASSWORD, true);
		clickOnCreateAccount(client);
		verifyUnitOfMeasurementPageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS943
		 * @Expected Target Glucose Range screen gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step5);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client, "targetGlucoseRangeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS943
		 * @Expected Unit of Measurement screen gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step6);
		clickOnBackOrMenuIcon(client);
		verifyPageTitles(client, "unitOfMeasurementTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS943
		 * @Expected Target Glucose Range screen gets displayed with details
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step7);
		clickOnButtonOption(client, "Next", true);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyTargetGlucoseRangePageDetails(client,"100","140");
		}
		else{
			verifyTargetGlucoseRangePageDetails(client,"5.6","7.8");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS943
		 * @Expected App allows to choose Glucose Ranges Low between 70 mg/dL to
		 *           179 mg/dL and High between 71 mg/dL to 180 mg/dL
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step8);

		verifyLowGlucoseRange(client);
		verifyHighGlucoseRange(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS943
		 * @Expected Value 120 md/dL/6.7mmol is not displayed for High Glucose
		 *           range
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step9);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyGlucoseRangeDifference(client, "120", "120");
		} else {
			verifyGlucoseRangeDifference(client, "6.7", "6.7");
		}		
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS943
		 * @Expected Carbohydrate Units screen gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step10);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client, "carbohydrateUnitsTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS943
		 * @Expected App navigates back to Target Glucose Range screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step11);
		clickOnBackOrMenuIcon(client);
		verifyPageTitles(client, "targetGlucoseRangeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS943
		 * @Expected Carbohydrate Units screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step12);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client, "carbohydrateUnitsTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAUIRS943
		 * @Expected servings text and serving bar gets disabled
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step13);
		selectCarbohydrateUnits(client, "grams");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAUIRS943
		 * @Expected Serving Bar allows the user to select the values from 10.0
		 *           grams to 15.0 grams
		 * 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step14);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			selectCarbohydrateUnits(client, "servings");
		}
		else{
			selectCarbohydrateUnits(client, "portions");
		}
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAUIRS943
		 * @Expected Scan Sounds Page is displayed.
		 * 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step15);
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client,"scanSoundsTitle");
		chooseSoundOrVibration(client, "scanSoundsOsDefault");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 16
		 * @Reqt SDAUIRS1292
		 * @Expected Welcome Page with Safety Information is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step16);
		//TODO
		clickOnButtonOption(client, "Next", true);
		verifyWelcomeScreen(client);
		capturescreenshot(client, getStepID(), true);

		if (getSafetyConfig().equalsIgnoreCase("yes")) {
			/**
			 *
			 * @stepId Step 16.1
			 * @Reqt SDAUIRS1292
			 * @Expected Safety Information is displayed
			 * @Dependancy Script cannot proceed if this step fails
			 *
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step16_1);
			//TODO
			verifySafetyInfo(client);
			capturescreenshot(client, getStepID(), true);
			clickOnBackOrMenuIcon(client);

		}else{
			showNotApplicableScreenShot(client,"Step15_1_SDAUIRS1292_Safety Information screen_Not applicable as per Configuration for that build");
		}

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAUIRS1217
		 * @Expected My Glucose Page gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step17);
		//TODO
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client,"myGlucoseExplanationTitle");
		//verifyMyGlucoseInfoPage(client,true);
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 18
		 * @Reqt SDAUIRS1293
		 * @Expected Glucose Background Color Page is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step18);
		//TODO
		clickOnButtonOption(client, "Next", true);
		verifyGlucoseBackgroundColor(client, true);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAUIRS1247
		 * @Expected Glucose Trend Arrow screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step19);
		//TODO
		clickOnButtonOption(client, "Next", true);
		verifyGlucoseTrendArrow(client,true);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {
			/**
			 *
			 * @stepId Step 20
			 * @Reqt SDAUIRS1294
			 * @Expected Treatment Decisions Page 1 is displayed
			 * @Dependancy Script cannot proceed if this step fails
			 *
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step20);
			//TODO
			clickOnButtonOption(client, "Next", true);
			verifyTreatmentDecisionScreen1(client, true);
			capturescreenshot(client, getStepID(), true);

			/**
			 *
			 * @stepId Step 21
			 * @Reqt SDAUIRS1295
			 * @Expected Treatment Decisions Page 2 is displayed
			 * @Dependancy Script cannot proceed if this step fails
			 *
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step21);
			//TODO
			clickOnButtonOption(client, "Next", true);
			verifyTreatmentDecisionScreen2(client, true);
			capturescreenshot(client, getStepID(), true);
		}else{
			showNotApplicableScreenShot(client,"Step19 & 20_SDAUIRS1294_SDAUIRS1295 Treatment Decisions Info screen_Not applicable for Non US build");
		}
		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAUIRS943
		 * @Expected LibreLink Home Screen gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step22);
		clickOnButtonOption(client, "Next", true);
		verifyHomePageDetails(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAUIRS943
		 * @Expected Settings screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step23);
		clickOnSettingsMenu(client, "settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifySettingsPage(client, "off", "servings",15.0,"120 - 121 mg/dL","sound and vibration");
		} else {
			verifySettingsPage(client, "off", "portions", 15.0,"6.7 - 6.8 mmol/L","sound and vibration");
		}	
		capturescreenshot(client, getStepID(), true);

	}



}
