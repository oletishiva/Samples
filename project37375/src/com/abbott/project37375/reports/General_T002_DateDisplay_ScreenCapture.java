package com.abbott.project37375.reports;


import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class General_T002_DateDisplay_ScreenCapture extends ReportsHelper {

	@Test
	public void test_T002_DateDisplay_ScreenCapture() throws Exception {


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Launch the Application and Do the firstLaunch Activities,
		 *           Load Data file to "7days_autoDate.json" using MOCK_2 and navigate to
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","Autodated", "7days_autoDate.json");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt 
		 * @Expected Navigate to AverageGlucose and select 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step1);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to AverageGlucose and verifying The screen is
		 *           captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step2);

		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt 
		 * @Expected Navigate to AverageGlucose and select 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step3);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to AverageGlucose and verifying The screen is
		 *           captured:The screenshot is emailed.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step4);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 90);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt 
		 * @Expected Navigate to AverageGlucose and select 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step5);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to AverageGlucose and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step6);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 7);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt 
		 * @Expected Navigate to AverageGlucose and select 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step7);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to AverageGlucose and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step8);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 14);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt 
		 * @Expected Navigate to SensorUsage and select 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step9);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to SensorUsage and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step10);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 30);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt 
		 * @Expected Navigate to SensorUsage and select 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step11);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to SensorUsage and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step12);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 90);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt 
		 * @Expected Navigate to SensorUsage and select 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step13);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to SensorUsage and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step14);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 7);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt 
		 * @Expected Navigate to SensorUsage and select 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step15);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to SensorUsage and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step16);

		navigateToScreen(client, "Sensor Usage");
		clickOnDays(client, 14);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);

		/**
		 * 
		 * @stepId Step 17
		 * @Reqt 
		 * @Expected Navigate to TimeInTarget and select 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step17);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to TimeInTarget and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step18);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 30);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt 
		 * @Expected Navigate to TimeInTarget and select 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step19);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to TimeInTarget and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step20);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);

		/**
		 * 
		 * @stepId Step 21
		 * @Reqt 
		 * @Expected Navigate to TimeInTarget and select 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step21);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to TimeInTarget and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step22);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 7);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt 
		 * @Expected Navigate to TimeInTarget and select 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step23);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to TimeInTarget and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step24);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 14);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);



		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "LOW.json" using MOCK_2 and
		 *           navigate to Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC", "LOW.json");

		/**
		 * 
		 * @stepId Step 25
		 * @Reqt 
		 * @Expected Navigate to LowGlucoseEvents and select 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step25);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to LowGlucoseEvents and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step26);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 30);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 27
		 * @Reqt 
		 * @Expected Navigate to LowGlucoseEvents and select 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step27);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 28
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to LowGlucoseEvents and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step28);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 90);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 29
		 * @Reqt 
		 * @Expected Navigate to LowGlucoseEvents and select 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step29);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 30
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to LowGlucoseEvents and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step30);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 7);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 31
		 * @Reqt 
		 * @Expected Navigate to LowGlucoseEvents and select 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step31);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 32
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to LowGlucoseEvents and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step32);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 14);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);



		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "7days_autoDate.json" using
		 *           MOCK_2 and navigate to Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","Autodated", "7days_autoDate.json");

		/**
		 * 
		 * @stepId Step 33
		 * @Reqt 
		 * @Expected Navigate to DailyPattern and select 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step33);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 34
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to DailyPatterns and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step34);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 30);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 35
		 * @Reqt 
		 * @Expected Navigate to DailyPatterns and 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step35);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 36
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to DailyPatterns and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step36);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 37
		 * @Reqt 
		 * @Expected Navigate to DailyPattern and 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step37);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 38
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to DailyPatterns and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step38);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 7);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 39
		 * @Reqt 
		 * @Expected Navigate to DailyPattern and select 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step39);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 40
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to DailyPatterns and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step40);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 14);
		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		/**
		 * 
		 * @stepId Step 41
		 * @Reqt 
		 * @Expected Navigate to EstimatedA1c
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step41);

		if (getEstimatedA1c().equalsIgnoreCase("yes")) {
			navigateToScreen(client, "Estimated A1c");
			capturescreenshot(client, getStepID(), true);
		} else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}
	
		/**
		 * 
		 * @stepId Step 42
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to EstimatedA1c and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step42);

		if (getEstimatedA1c().equalsIgnoreCase("yes")) {
			navigateToScreen(client, "Estimated A1c");
			clickShareButton(client);
			clickEmail(client);
			capturescreenshot(client, getStepID(), true);
			sendEmail(client);
		} else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}
	

		/**
		 * 
		 * @stepId Step 43
		 * @Reqt 
		 * @Expected Navigate to DailyGraph
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step43);

		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 44
		 * @Reqt 
		 * @Expected Navigate to DailyGraph and select previous date to display the report for previous day.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step44);

		clickArrowOnTopLeftOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 45
		 * @Reqt SDAIUIRS954_SDAISRS1171
		 * @Expected Navigate to DailyPatterns and verifying The screen is
		 *           captured:The screenshot is captured.Shared bitmap is saved.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T002_DateDisplay_ScreenCapture_Step45);

		clickShareButton(client);
		clickEmail(client);
		capturescreenshot(client, getStepID(), true);
		sendEmail(client);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
