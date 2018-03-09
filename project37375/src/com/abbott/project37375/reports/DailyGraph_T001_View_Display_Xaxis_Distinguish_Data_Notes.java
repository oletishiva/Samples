package com.abbott.project37375.reports;


import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes extends
ReportsHelper {

	@Test
	public void test_T001_View_Display_Xaxis_Distinguish_Data_Notes() throws Exception {


		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from HomePage and verify Daily Graph Report page
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step1);
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from Logbook page and verify Daily Graph Report
		 *           page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step2);
		navigateToScreen(client,"Logbook");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from Reminder page and verify Daily Graph Report
		 *           page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step3);
		navigateToScreen(client,"Reminders");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.1
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from DailyPatterns page and verify Daily Graph
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.2
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from TimeInTarget page and verify Daily
		 *           Graph Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_2);
		navigateToScreen(client, "Time In Target");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.3
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from LowGlucoseEvents page and verify Daily Graph
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.4
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from AverageGlucose page and verify Daily Graph
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_4);
		navigateToScreen(client, "Average Glucose");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4.5
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from Estimated A1c page and verify Daily Graph
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToScreen(client, "Daily Graph");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
		}


		/**
		 *
		 * @stepId Step 4.6
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from Sensor_Usage page and verify Daily Graph
		 *           Report page
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.1
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from DailyPatterns page and verify Daily Graph
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_1);
		navigateToScreen(client, "Daily Patterns");
		navigateToReportBySlide(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 5.2
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from TimeInTarget page and verify Daily
		 *           Graph Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_2);
		navigateToScreen(client, "Time In Target");
		navigateToReportBySlide(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);

		/**
		 *
		 * @stepId Step 5.3
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from LowGlucoseEvents page and verify Daily Graph
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_3);
		navigateToScreen(client, "Low Glucose Events");
		navigateToReportBySlide(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.4
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from AverageGlucose page and verify Daily Graph
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_4);
		navigateToScreen(client, "Average Glucose");
		navigateToReportBySlide(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 5.5
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from Estimated A1c page and verify Daily Graph
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_5);
		if(getEstimatedA1c().equalsIgnoreCase("yes")){
			navigateToScreen(client, "Estimated A1c");
			navigateToReportBySlide(client,"Daily Graph");
			capturescreenshot(client, getStepID(), true);
		}
		else{
			showNotApplicableScreenShot(client,getStepID()+"_NotApplicable");
			}


		/**
		 *
		 * @stepId Step 5.6
		 * @Reqt SDAIUIRS1003_SDAISRS1164_SDAISRS1169
		 * @Expected Navigate from Sensor_Usage page and verify Daily Graph
		 *           Report page by Slide
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_6);
		navigateToScreen(client, "Sensor Usage");
		navigateToReportBySlide(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set device time to 03-01-2013 13:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,03,2013,"13:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "Basicdata" using MOCK_2 and Navigate to
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");
		navigateToScreen(client, "Daily Graph");

		/**
		 *
		 * @stepId Step 6
		 * @Reqt SDAIUIRS955_SDAIUIRS1004
		 * @Expected Navigate from Sensor_Usage page and verify Date '2
		 *           December 2012' is displayed on top of the Daily Graph
		 *           report screen
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step6);

		clickOnCalendarDate(client);
		pickDate(client, getDateFormat("2012-12-02"));
		verifyDailyGraphViewDate90Days(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 7
		 * @Reqt SDAIUIRS955_SDAIUIRS1004
		 * @Expected Date '3 December 2012' is displayed on top of the Daily
		 *           Graph report screen
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step7);

		clickArrowOnTopRightOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 8
		 * @Reqt SDAIUIRS1004
		 * @Expected The Daily Graph report is not displayed
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step8);

		clickOnCalendarDate(client);
		pickDate(client,  getDateFormat("2012-12-01"));
		capturescreenshot(client, getStepID(), true);
		verifyDailyGraphForPeriodBeyond90days(client);
		clickCancelfromCalendar(client);


		/**
		 *
		 * @stepId Step 9
		 * @Reqt SDAIUIRS1004
		 * @Expected The Daily Graph report is not displayed
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step9);

		clickOnCalendarDate(client);
		pickDate(client, getDateFormat("2013-3-02"));
		capturescreenshot(client, getStepID(), true);
		verifyDailyGraphForPeriodBeyond90days(client);
		clickCancelfromCalendar(client);


		/**
		 *
		 * @stepId Step 10
		 * @Reqt SDAIUIRS955_SDAIUIRS1004
		 * @Expected Date '1 January 2013'' is displayed on top of the Daily
		 *           Graph report screen
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step10);
		clickOnCalendarDate(client);
		pickDate(client, getDateFormat("2013-1-01"));
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 11
		 * @Reqt SDAIUIRS955_SDAIUIRS1004
		 * @Expected Date '2 January 2013' is displayed on top of the Daily
		 *           Graph report screen
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step11);

		clickArrowOnTopRightOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 12
		 * @Reqt SDAIUIRS1005
		 * @Expected The Daily Graph report displays a glucose graph.
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step12);

		clickOnCalendarDate(client);
		pickDate(client, getDateFormat("2013-2-28"));
		verifyPageTitles(client,"DAILY GRAPH");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 13
		 * @Reqt SDAIUIRS1004
		 * @Expected Date '18 February 2013' is displayed on top of the Daily
		 *           Graph report screen
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step13);

		clickArrowOnTopLeftOfTheGraph(client, 10);
		verifyPageTitles(client,"DAILY GRAPH");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 14
		 * @Reqt SDAIUIRS1004
		 * @Expected Date '23 February 2013' is displayed on top of the Daily
		 *           Graph report screen
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step14);

		clickArrowOnTopRightOfTheGraph(client, 5);
		verifyPageTitles(client,"DAILY GRAPH");
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Target Glucose Range to 100-140mg/dL or 5.6-7.8
		 *           mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		navigateToScreen(client, "Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}

		/**
		 *
		 * @stepId Step 15
		 * @Reqt SDAIUIRS1195
		 * @Expected Target Range is shaded in green color on glucose graph
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step15);

		navigateToScreen(client, "Daily Graph");
		verifyPageTitles(client,"DAILY GRAPH");
		clickArrowOnTopLeftOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Target Glucose Range to 100-140 mg/dL or 3.9-10.0
		 *           mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		navigateToScreen(client, "Settings");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 70, 180);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 3.9, 10.0);
		}

		/**
		 *
		 * @stepId Step 16
		 * @Reqt SDAIUIRS1195
		 * @Expected Target Range is shaded in green color on glucose graph
		 * @Dependancy Flow will not work if this step fails
		 *
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step16);

		navigateToScreen(client, "Daily Graph");
		verifyPageTitles(client,"DAILY GRAPH");
		clickArrowOnTopLeftOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS1006
		 * @Expected The graph has an X-axis from midnight to midnight.
		 *           00:00-00:00
		 * @Dependancy Flow will not work if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step17);
		verifyReportXAxisWith3HoursPeriodFor24Hours(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set Phone timing to 12hr Format
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);

		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS1006
		 * @Expected The graph has an X-axis from midnight to midnight.
		 *           12AM-12AM
		 * @Dependancy Flow will not work if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step18);

		navigateToScreen(client, "Daily Graph");
		clickArrowOnTopLeftOfTheGraph(client, 1);
		verifyReportXAxisWith3HoursPeriodFor12Hours(client,"Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS1011
		 * @Expected The Daily Graph report glucose graph displays the historic glucose values below 70 mg/dL or 3.9 mmol/L as connected lines in red color: around 1am and 11pm

		 * @Dependancy Flow will not work if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step19);

		clickOnCalendarDate(client);
		pickDate(client, getDateFormat("2013-2-01"));
		verifyPageTitles(client,"DAILY GRAPH");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS1011
		 * @Expected The Daily Graph report glucose graph displays the historic glucose values below 70 mg/dL or 3.9 mmol/L as connected lines in red color: around 9am, 4pm and 11pm

		 * @Dependancy Flow will not work if this step fails
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step20);

		clickOnCalendarDate(client);
		pickDate(client, getDateFormat("2013-2-03"));
		verifyPageTitles(client,"DAILY GRAPH");
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);
	}
}
