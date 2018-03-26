package com.abbott.project37375.firsttimestartupAndsettingsAndhelp;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class UIHelp_T001_Help_About_Content extends HelpHelper {

	@Test
	public void test_T001_Help_About_Content() throws Exception {

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAUIRS1137
		 * @Expected How to Apply A Sensor link is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step1);
		verifyHowToApplyNewSensorLink(client, false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAUIRS1137
		 * @Expected Applying a Sensor section contains total 10 screens with instructions for How to Apply a new sensor.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step2);
		verifyHowToApplyNewSensorLink(client, true);
		verifyHowToApplyNewSensorSteps(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAUIRS1138
		 * @Expected How to scan a Sensor link is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step3);
		clickOnBackOrMenuIcon(client);
		clickOnButtonOption(client, "Next", true);
		verifyHowToScanNewSensorLink(client, false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAUIRS1138
		 * @Expected Scanning a Sensor section contains total 3 screens with instructions for How to Scan a sensor.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step4);
		verifyHowToScanNewSensorLink(client, true);
		verifyHowToScanSensorPages(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAUIRS929
		 * @Expected Application version is displayed in the About screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step5);
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client, "about");
		verifyAboutInfo(client);
		verifyApplicationVersion(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAUIRS929
		 * @Expected About screen displays App's UDI / CE Mark / Registration Number (as applicable) and support website
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step6);
		verifyUDI(client);
		capturescreenshot(client, getStepID()+"_UDI Screenshot", true);
		verifyCEWebSite(client);
		capturescreenshot(client, getStepID()+"_CE logo/Website Info Screenshot", true);

		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAUIRS1187
		 * @Expected The End User License Agreement link is displayed as Terms of Use under Help section
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step7);
		clickOnBackOrMenuIcon(client);
		clickOnSettingsMenu(client,"help");
		verifyandClickHelpSubMenu(client, "termsOfUseTitle", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAUIRS1187
		 * @Expected The End User License Agreement screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step8);
		verifyandClickHelpSubMenu(client, "termsOfUseTitle", true);
		verifyPageTitles(client, "termsOfUseTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAUIRS1191
		 * @Expected Privacy notice link is displayed under Help section.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step9);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "privacyNoticeTitle", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt  SDAUIRS1191
		 * @Expected Privacy Notice screen is displayed.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step10);
		verifyandClickHelpSubMenu(client, "privacyNoticeTitle", true);
		verifyPageTitles(client, "privacyNoticeTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 11
		 * @Reqt  SDAUIRS1137
		 * @Expected How to apply a Sensor link is displayed under Help section.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step11);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "helpItemTitleApplySensor", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 12
		 * @Reqt  SDAUIRS1137
		 * @Expected Applying a Sensor screen is displayed with instructions.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step12);
		verifyandClickHelpSubMenu(client, "helpItemTitleApplySensor", true);
		verifyPageTitles(client, "applySensorTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 13
		 * @Reqt  SDAUIRS1137
		 * @Expected Applying a Sensor section contains total 10 screens with instructions for How to Apply a new sensor.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step13);
		verifyHowToApplyNewSensorSteps(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt  SDAUIRS1138
		 * @Expected How to scan a Sensor link is displayed under Help section.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step14);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "helpItemTitleScanSensor", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 15
		 * @Reqt  SDAUIRS1138
		 * @Expected Scanning a Sensor screen is displayed with instructions.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step15);
		verifyandClickHelpSubMenu(client, "helpItemTitleScanSensor", true);
		verifyPageTitles(client, "scanSensorTitle");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 16
		 * @Reqt  SDAUIRS1138
		 * @Expected Scanning a Sensor section contains total 3 screens with instructions for How to Scan a sensor.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step16);
		verifyHowToScanSensorPages(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAUIRS1139
		 * @Expected Event Log link is displayed under Help section.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step17);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "helpItemTitleEventLog", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAUIRS1139
		 * @Expected Event Log screen is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step18);
		verifyandClickHelpSubMenu(client, "helpItemTitleEventLog", true);
		verifyPageTitles(client, "eventLog");
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAUIRS1140_SDAISRS249
		 * @Expected  User's Manual Link is displayed under Help section.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step19);
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "helpItemTitleUserGuide", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAUIRS1140
		 * @Expected The User's Manual is displayed
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step20);
		verifyandClickHelpSubMenu(client, "helpItemTitleUserGuide", true);
		verifyUsersManualGuide(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAUIRS1283 SDAISRS249
		 * @Expected Glucose Reading link is displayed under Help screen
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step21);
		//TODO
		clickOnBackOrMenuIcon(client);
		verifyandClickHelpSubMenu(client, "helpItemTitleGlucoseHelp", false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 22
		 * @Reqt  SDAUIRS1284
		 * @Expected Verify that Glucose Readings tutorial is opened when tapping on the glucose reading link
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		//TODO
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step22);
		verifyandClickHelpSubMenu(client, "helpItemTitleGlucoseHelp", true);
		verifyPageTitles(client, "helpItemTitleGlucoseHelp");
		verifyMyGlucoseInfoPage(client,false);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt  SDAUIRS1285
		 * @Expected Verify Glucose Reading second screen is displayed and it shows Background color explanation
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step23);
		//TODO
		swipePage(client, "Right");
		verifyGlucoseBackgroundColor(client,false);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 24
		 * @Reqt  SDAUIRS1286
		 * @Expected Glucose Reading third screen is displayed and it shows Trend Arrow explanation
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step24);
		//TODO
		swipePage(client, "Right");
		verifyGlucoseTrendArrow(client,false);
		capturescreenshot(client, getStepID(), true);

		if (getNAIconConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 25
			 * @Reqt  SDAUIRS1287
			 * @Expected Glucose Reading fourth screen is displayed and it shows Non-Actionable Icon image
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step25);
			//TODO
			swipePage(client, "Right");
			verifyTreatmentDecisionScreen1(client,false);
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 26
			 * @Reqt  SDAUIRS1288
			 * @Expected Glucose Reading 5th screen is displayed and it shows the action to be performed on observing Non-actionable result
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step26);
			//TODO
			swipePage(client, "Right");
			verifyTreatmentDecisionScreen2(client,false);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step25 & 26_SDAUIRS1287_SDAUIRS1288 Treatment Decisions Info screen_Not applicable as per Configuration for that build");
		}


		if (getSafetyConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 27
			 * @Reqt  SDAUIRS1289 SDAISRS249
			 * @Expected App displays an option to access the Safety Information
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step27);
			//TODO
			clickOnBackOrMenuIcon(client);
			verifyandClickHelpSubMenu(client, "safetyInformation", false);
			verifyHelpLinksInOrder(client,"safetyInformation", "below");
			capturescreenshot(client, getStepID(), true);



			/**
			 * 
			 * @stepId Step 28
			 * @Reqt  SDAUIRS1289
			 * @Expected Safety Information  page is opened
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step28);
			//TODO
			verifyandClickHelpSubMenu(client, "safetyInformation", true);
			verifySafetyInformation(client);
			capturescreenshot(client, getStepID(), true);


		}else{
			showNotApplicableScreenShot(client,"Step27 & 28_SDAUIRS1289_Safety Information screen_Not applicable as per Configuration for that build");
		}

		if (getQuickStartConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 29
			 * @Reqt  SDAUIRS1290 SDAISRS249
			 * @Expected App displays an option to access the Quick start guide
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step29);
			//TODO
			clickOnBackOrMenuIcon(client);
			verifyandClickHelpSubMenu(client, "quickStartGuide", false);
			verifyHelpLinksInOrder(client,"quickStartGuide", "above");
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 30
			 * @Reqt  SDAUIRS1290
			 * @Expected Quick Start Guide is opened
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step30);
			//TODO
			verifyandClickHelpSubMenu(client, "quickStartGuide", true);
			verifyQuickStartGuide(client);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step29 & 30_SDAUIRS1290_Quick Start Guide screen_Not applicable as per Configuration for that build");
		}

		if (getQuickRefConfig().equalsIgnoreCase("yes")) {
			/**
			 * 
			 * @stepId Step 31
			 * @Reqt  SDAUIRS1291 SDAISRS249
			 * @Expected App displays an option to access the Quick Reference Guide
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step31);
			//TODO
			clickOnBackOrMenuIcon(client);
			verifyandClickHelpSubMenu(client, "quickReferenceGuide", false);
			verifyHelpLinksInOrder(client,"quickReferenceGuide", "above");
			capturescreenshot(client, getStepID(), true);

			/**
			 * 
			 * @stepId Step 32
			 * @Reqt  SDAUIRS1291
			 * @Expected Quick Reference guide is opened
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			setStepID(LibrelinkConstants.Help_LibreLink_T001_Help_Content_Step32);
			//TODO
			verifyandClickHelpSubMenu(client, "quickReferenceGuide", true);
			verifyQuickReferenceGuide(client);
			capturescreenshot(client, getStepID(), true);

		}else{
			showNotApplicableScreenShot(client,"Step31 & 32_SDAUIRS1291_Quick Reference Guide screen_Not applicable as per Configuration for that build");
		}
		// End of Help_LibreLink_T001_Help_Content class
	}
}