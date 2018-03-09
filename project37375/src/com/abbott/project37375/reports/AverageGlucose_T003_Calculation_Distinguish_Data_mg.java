package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class AverageGlucose_T003_Calculation_Distinguish_Data_mg extends
ReportsHelper {

	@Test
	public void test_T003_Calculation_Distinguish_Data_mg() throws Exception {

	/*
		
		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           02-28-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		setTheDateAndTime(client, 28, 02, 2013, "23:50");

		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Launch the application and Do the firstLaunch Activities
		 *           and also Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		loadTestData(client, "MOCK_2","ADC", "Basic Data.json");
		navigateToScreen(client, "Average Glucose");

		*//**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying Average
		 *           value of all historic glucose readings in 14 days: 185 mg/dL
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step1);
		clickOnDays(client, 14);
		verifyAverageHistoricGlucoseForNdays(client, 14);
		capturescreenshot(client, getStepID(), true);


		*//**
		 *
		 * @stepId Step 2
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying Average
		 *           value of all historic glucose readings in 7 days: 199 mg/dL
		 * @Dependancy NA
		 *
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step2);
		clickOnDays(client, 7);
		verifyAverageHistoricGlucoseForNdays(client, 7);
		capturescreenshot(client, getStepID(), true);


		*//**
		 *
		 * @stepId Step 3
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying Average
		 *           value of all historic glucose readings in 90 days: 165 mg/dL
		 * @Dependancy NA
		 *
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step3);
		clickOnDays(client, 90);
		verifyAverageHistoricGlucoseForNdays(client, 90);
		capturescreenshot(client, getStepID(), true);

		*//**
		 *
		 * @stepId Step 4
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying Average
		 *           value of all historic glucose readings in 30 days: 149 mg/dL
		 * @Dependancy NA
		 *
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step4);
		clickOnDays(client, 30);
		verifyAverageHistoricGlucoseForNdays(client, 30);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set Phone timing to 24hr Format and Navigate to Home page
		 * @Expected Settings:Target Glucose Range to 100-140 using Librelink
		 *           Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 100, 140);
		navigateToScreen(client, "Average Glucose");

		*//**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The Average Glucose report for 30 days displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step5);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The Average Glucose report for 7 days displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step6);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);

		*//**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The The Average Glucose report for 90 days displays a bar graph showing
		 *           the average of all historic glucose readings within each
		 *           time period of the day
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step7);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The Average Glucose report for 14 days displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step8);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set device time 00:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		setTheDateAndTime(client, 12, 06, 2016, "00:00");

		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Setting the Target Glucose Range
		 *           to 155-180 using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 155, 180);

		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "High-1data" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		loadTestData(client,  "MOCK_2","ADC", "High-1data.json");
		navigateToScreen(client, "Average Glucose");
		*//**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS993
		 * @Expected The Average Glucose report displays the average value of
		 *           all historic glucose readings in 7 days
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step9);
		clickOnDays(client, 7);
		verifyAverageHistoricGlucoseRange155To180For7Days(client);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS995
		 * @Expected The Average Glucose report displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day:03:00: 501;03:00-06:00: 241;06:00-09:00:
		 *           500;09:00-12:00: 240;12:00-15:00: 239;15:00-18:00:
		 *           70;18:00-21:00: 140;21:00-00:00: 180
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step10);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 501 mg/dL contained within the graph and Y axis is not labelled
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step11);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 500 mg/dL contained within the graph and Y axis is not labelled
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step12);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 500 mg/dL contained within the graph and Y axis is not labelled
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step13);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 500 mg/dL contained within the graph and Y axis is not labelled
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step14);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS1000
		 * @Expected 'The Average Glucose report displays the average glucose
		 *           corresponding to each bar.00:00-03:00: 393;03:00-06:00:
		 *           241;06:00-09:00: 500;09:00-12:00: 240;12:00-15:00:
		 *           239;15:00-18:00: 70;18:00-21:00: 129;21:00-00:00: 180
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step15);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: set the phone Date as CurrentDate+5 DAYS
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		setTheDateAndTime(client, 17, 06, 2016, "00:00");

		*//**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Setting the Target Glucose Range to 155-180 using Librelink
		 *           Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **//*
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 155, 180);
		navigateToScreen(client, "Average Glucose");

		*//**
		 * 
		 * @stepId Step 16.1
		 * @Reqt SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198_SDAIUIRS1199
		 * @Expected The software distinguishes bars with values < 70 mg/dL in
		 *           red ;values 70-154 mg/dL in yellow;values 155-180 mg/dL in
		 *           green;values 181-240 mg/dL in yellow;values >240 mg/dL in
		 *           orange
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_1);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 16.2
		 * @Reqt SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198_SDAIUIRS1199
		 * @Expected The software distinguishes bars with values < 70 mg/dL in
		 *           red ;values 70-154 mg/dL in yellow;values 155-180 mg/dL in
		 *           green;values 181-240 mg/dL in yellow;values >240 mg/dL in
		 *           orange
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_2);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 16.3
		 * @Reqt SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198_SDAIUIRS1199
		 * @Expected The software distinguishes bars with values < 70 mg/dL in
		 *           red ;values 70-154 mg/dL in yellow;values 155-180 mg/dL in
		 *           green;values 181-240 mg/dL in yellow;values >240 mg/dL in
		 *           orange
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_3);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 16.4
		 * @Reqt SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198_SDAIUIRS1199
		 * @Expected The software distinguishes bars with values < 70 mg/dL in
		 *           red ;values 70-154 mg/dL in yellow;values 155-180 mg/dL in
		 *           green;values 181-240 mg/dL in yellow;values >240 mg/dL in
		 *           orange
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_4);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);



		*//**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS1000
		 * @Expected The Average Glucose report displays the average glucose
		 *           corresponding to each bar.00:00-03:00: 501
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step17);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		*//**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS993
		 * @Expected The Average Glucose report displays the average value of
		 *           all historic glucose readings in 7 days: 501 mg/dL
		 * @Dependancy NA
		 * 
		 **//*
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step18);
		verifyTotalAverageHistoricalGlucoseReadingFor7Days(client);
		capturescreenshot(client, getStepID(), true);

*/
		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set device time 00:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/

		
	/*	setTheDateAndTime(client, 01, 07, 2016, "00:00");*/

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "LOW.json" using MOCK_2 and Navigate to
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
	//	loadTestData(client, "MOCK_2","ADC", "LOW.json");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: set the phone Date as CurrentDate
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
	//	setTheDateAndTime(client, 06, 07, 2016, "00:00");
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to around 39 mg/dL contained within the graph
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step19);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to around 100 mg/dL
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step20);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21.1
		 * @Reqt SDAIUIRS1000
		 * @Expected The Average Glucose report displays the average glucose
		 *           corresponding to each bar.00:00-03:00: 39;03:00-06:00:
		 *           69;06:00-09:00: 39;09:00-12:00: 70;12:00-15:00:
		 *           71;15:00-18:00: 100;18:00-21:00: null;21:00-00:00: null
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step21_1);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21.2
		 * @Reqt SDAIUIRS1000
		 * @Expected The Average Glucose report displays the average glucose
		 *           corresponding to each bar.12AM-3AM: 39;3AM-6AM: 69;6AM-9AM:
		 *           39;9AM-12PM: 70;12PM-3PM: 71;3PM-6PM: 100;6PM-9PM:
		 *           null;9PM-12AM: null
		 * @Dependancy NA
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Average Glucose");

		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step21_2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set the Target Glucose Range to
		 *           70-71 using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 70, 71);
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 70 mg/dL in red;
		 * 			 values 70-71 mg/dL in green;values 72-240 mg/dL in yellow;
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step22);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS993
		 * @Expected The Average Glucose report displays the average value of
		 *           all historic glucose readings in 7 days: 39 mg/dL
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step23);
		clickOnDays(client, 7);
		verifyLowAverageHistoricalGlucoseReadingValuesFor7Days(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: set the phone Date as CurrentDate-5 days
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 1, 07, 2016, "00:00");
		/**
		 * 
		 * @stepId Step 24.1
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 70 mg/dL in red;
		 *           values 70-71 mg/dL in green;
		 *           values 72-240 mg/dL in yellow for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_1);
		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24.2
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 70 mg/dL in red;
		 *           values 70-71 mg/dL in green;
		 *           values 72-240 mg/dL in yellow for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24.3
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 70 mg/dL in red;
		 *           values 70-71 mg/dL in green;
		 *           values 72-240 mg/dL in yellow for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_3);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24.4
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 70 mg/dL in red;
		 *           values 70-71 mg/dL in green;
		 *           values 72-240 mg/dL in yellow for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_4);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
