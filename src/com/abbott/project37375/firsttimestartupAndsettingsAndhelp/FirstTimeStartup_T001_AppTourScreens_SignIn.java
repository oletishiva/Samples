package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;



public class FirstTimeStartup_T001_AppTourScreens_SignIn extends
FirstSequenceAndSettingsHelper {


	@Test
	public void test_T001_AppTourScreens_SignIn() throws Exception {
		setEmail();

	/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS937_SDAUIRS1237
		 * @Expected LibreLink welcome screen is displayed with Splash Screen App Tour 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step1);
		librelinkWelcomePage(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1237
		 * @Expected The text Check your glucose with your smartphone Statement gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step2);
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"checkGlucoseWithPhone");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS1237
		 * @Expected The text You can have quick access to your glucose information Statement gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step3);
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"instantAccess");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS1237
		 * @Expected The text You can gain insights to help you make more informed decisions Statement gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step4);
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"actionableInsights");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS1237
		 * @Expected The text You can share your glucose information with your health care professional and loved ones Statement gets displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step5);
		swipeWelcomescreen(client);
		verifyAppTourScreens(client,"shareGlucoseInformation");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS938
		 * @Expected Confirm Country page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step6);
		getStarted(client,true);
		verifyConfirmCountryPage(client);
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS938
		 * @Expected Terms of Use page gets displayed without check glucose icon.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step7);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"termsOfUseTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS938
		 * @Expected Privacy Notice page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step8);
		clickOnButtonOption(client,"Accept",true);
		clickCheckBox(client,"termsOfUseTitle",true);
		verifyPageTitles(client,"privacyNoticeTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS938
		 * @Expected Create New Account page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step9);
		clickOnButtonOption(client,"Accept",true);
		clickCheckBox(client,"privacyNoticeTitle",true);
		verifyPageTitles(client,"createNewAccountText");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAUIRS938
		 * @Expected Account Login Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step10);
		createNewAccountDetails(client,"Test","User","10","11","1975");
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"adultRegistrationTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAUIRS938
		 * @Expected Unit of Measurement Screen Page gets displayed without check glucose icon.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step11);		
		adultLoginDetails(client,getEmail(),LibrelinkConstants.CURRENT_PASSWORD,LibrelinkConstants.CURRENT_PASSWORD,true);		
		clickOnCreateAccount(client);
		verifyPageTitles(client,"unitOfMeasurementTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAUIRS938
		 * @Expected Target Glucose Range Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step12);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"targetGlucoseRangeTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAUIRS938
		 * @Expected Carbohydrate Units Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step13);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"carbohydrateUnitsTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAUIRS938
		 * @Expected Scan Sounds page displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step14);
		selectCarbohydrateUnits(client,"grams");
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"scanSoundsTitle");
		chooseSoundOrVibration(client, "scanSoundsOsDefault");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAUIRS938
		 * @Expected Welcome Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step14);
		//TODO
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"welcome");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAUIRS938
		 * @Expected My Glucose Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step16);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"myGlucoseExplanationTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAUIRS938
		 * @Expected Glucose Background Color Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step17);
		//TODO
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"backgroundGlucoseColorsTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAUIRS938
		 * @Expected Glucose Trend Arrow gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step18);
		//TODO
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"trendExplanationTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 19
			 * @Reqt SDAUIRS938
			 * @Expected Treatment Decisions page 1 gets displayed without check glucose icon
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step19);
			//TODO
			clickOnButtonOption(client,"Next",true);
			verifyPageTitles(client,"treatmentDecisions");
			verifyCheckGlucoseIcon(client,false);
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 20
			 * @Reqt SDAUIRS938
			 * @Expected Treatment Decisions page 2 gets displayed without check glucose icon
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step20);
			//TODO
			clickOnButtonOption(client,"Next",true);
			verifyPageTitles(client,"treatmentDecisions");
			verifyCheckGlucoseIcon(client,false);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step18 & 19_Treatment Decisions Info screen_Not applicable for Non US build");
		}

		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAUIRS938
		 * @Expected LibreLink Home Page gets displayed with scan data and check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step21);
		clickOnButtonOption(client,"Next",true);
		verifyHomePageDetails(client);
		selectingSASMode(client, "MOCK_1");
		if(getCountryCode().contains("United States")){
			editConfiguration(client,-1,0,0,"12/11");
		}
		openDebugDrawer(client);
		bgValueWithStaticTime(client,"Realtime","100",false,0,0);
		scanMockSensor(client,null);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client, "100");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyLastScanInHomePage(client, "5.6");
		}
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAUIRS940
		 * @Expected Sign In Page gets displayed. Check Glucose button is not available
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step22);
		clearData(client);
		clickSignInButton(client,true);
		verifyCheckGlucoseIcon(client,false);
		verifyPageTitles(client,"signIn");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAUIRS940
		 * @Expected Terms of Use Page gets displayed. Check Glucose button is not available
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step23);
		signInClick(client,LibrelinkConstants.Username,LibrelinkConstants.CURRENT_PASSWORD, true);
		verifyPageTitles(client,"termsOfUseTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAUIRS937
		 * @Expected Privacy Notice Page gets displayed. Check Glucose button is not available
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step24);
		clickOnButtonOption(client,"Accept",true);
		clickCheckBox(client,"termsOfUseTitle",true);
		verifyPageTitles(client,"privacyNoticeTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 25
		 * @Reqt SDAUIRS937
		 * @Expected Unit of Measurement Page gets displayed. Check Glucose button is not available
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step25);
		clickOnButtonOption(client,"Accept",true);
		clickCheckBox(client,"privacyNoticeTitle",true);
		verifyPageTitles(client,"unitOfMeasurementTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAUIRS937, SDAUIRS938
		 * @Expected Target Glucose Range Page gets displayed without check glucose icon. 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step26);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"targetGlucoseRangeTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 27
		 * @Reqt SDAUIRS937
		 * @Expected Carbohydrate Units Page gets displayed . Check Glucose button is not available 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step27);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"carbohydrateUnitsTitle");
		selectCarbohydrateUnits(client,"grams");
		capturescreenshot(client, getStepID(), true);
		
		/**
		 * 
		 * @stepId Step 28
		 * @Reqt SDAUIRS937
		 * @Expected Scan Sounds Page is displayed.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step28);
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"scanSoundsTitle");
		chooseSoundOrVibration(client, "scanSoundsOsDefault");
		capturescreenshot(client, getStepID(), true);

		/**

		/**
		 * 
		 * @stepId Step 29
		 * @Reqt SDAUIRS937 SDAUIRS1292
		 * @Expected Welcome Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step29);
		selectCarbohydrateUnits(client,"grams");
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"scanSoundsTitle");
		chooseSoundOrVibration(client, "scanSoundsOsDefault");
		//TODO
		verifyPageTitles(client,"welcome");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);
		//TODO
		if (getSafetyConfig().equalsIgnoreCase("yes")) {
		verifySafetyInfo(client);
		capturescreenshot(client, "Step27_1_SDAUIRS1292_Safety Information link is displayed", true);
		clickOnBackOrMenuIcon(client);
		
		}else{
			showNotApplicableScreenShot(client,"Step27_1_SDAUIRS1292_Safety Information screen_Not applicable as per Configuration for that build");
		}

		/**
		 * 
		 * @stepId Step 30
		 * @Reqt SDAUIRS937
		 * @Expected My Glucose Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step30);
		
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"myGlucoseExplanationTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 31
		 * @Reqt SDAUIRS937
		 * @Expected Glucose Background Color Page gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step31);
		//TODO
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"backgroundGlucoseColorsTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 32
		 * @Reqt SDAUIRS937
		 * @Expected Glucose Trend Arrow gets displayed without check glucose icon
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step32);
		
		clickOnButtonOption(client,"Next",true);
		verifyPageTitles(client,"trendExplanationTitle");
		verifyCheckGlucoseIcon(client,false);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 33
			 * @Reqt SDAUIRS937
			 * @Expected Treatment Decisions page 1 gets displayed without check glucose icon
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step33);
			//TODO
			clickOnButtonOption(client,"Next",true);
			verifyPageTitles(client,"treatmentDecisions");
			verifyCheckGlucoseIcon(client,false);
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 34
			 * @Reqt SDAUIRS937
			 * @Expected Treatment Decisions page 2 gets displayed without check glucose icon
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step34);
			//TODO
			clickOnButtonOption(client,"Next",true);
			verifyPageTitles(client,"treatmentDecisions");
			verifyCheckGlucoseIcon(client,false);
			capturescreenshot(client, getStepID(), true);
		}else{
			showNotApplicableScreenShot(client,"Step31 & 32_Treatment Decisions Info screen_Not applicable for Non US build");
		}

		/**
		 * 
		 * @stepId Step 35
		 * @Reqt SDAUIRS937, SDAUIRS938
		 * @Expected Home Page gets displayed with scan data 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.FirstTimeStartup_T001_AppTourScreens_SignIn_Step35);
		clickOnButtonOption(client,"Next",true);
		verifyHomePageDetails(client);
		capturescreenshot(client, "Step35_1_SDAUIRS937 SDAUIRS938_Home Screen displays Apply a new sensor message", true);
		verifyHowToScanNewSensorLink(client, false);
		capturescreenshot(client, "Step35_2_SDAUIRS937 SDAUIRS938_Home Screen displays Scan new sensor button with no message", true);
		selectingSASMode(client, "MOCK_1");
		if(getCountryCode().contains("United States")){
			editConfiguration(client,-1,0,0,"12/11");
		}
		openDebugDrawer(client);
		bgValueWithStaticTime(client, "Realtime", "100", false, 0, 0);
		scanMockSensor(client,null);
		clickOnBackOrMenuIcon(client);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyLastScanInHomePage(client, "100");
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyLastScanInHomePage(client, "5.6");
		}
		capturescreenshot(client, getStepID().replace("Step35", "Step35_3"), true);


	}

}

	
