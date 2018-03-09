package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class AverageGlucose_T004_Calculation_Distinguish_Data_mmol extends
ReportsHelper {


	@Test
	public void test_T004_Calculation_Distinguish_Data_mmol() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Change Time Format to 24 Hours and Set device time to
		 *           02-28-2013 23:50
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 28, 02, 2013, "23:50");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Launch the application and Do the firstLaunch Activities
		 *           and also Load Data file to "Basicdata" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC", "Basic Data.json");
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying The
		 *           Average Glucose report displays the average value of all
		 *           historic glucose readings in 14 days: 10.3 mmol/L mg/dL
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step1);
		clickOnDays(client, 14);
		verifyAverageHistoricGlucoseForNdays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 2
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying The
		 *           Average Glucose report displays the average value of all
		 *           historic glucose readings in 7 days: 11.0 mmol/L
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step2);
		clickOnDays(client, 7);
		verifyAverageHistoricGlucoseForNdays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 3
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying The
		 *           Average Glucose report displays the average value of all
		 *           historic glucose readings in 90 days: 9.1 mmol/L
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step3);
		clickOnDays(client, 90);
		verifyAverageHistoricGlucoseForNdays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 4
		 * @Reqt SDAIUIRS993
		 * @Expected Navigate to Average Glucose Report and verifying The
		 *           Average Glucose report displays the average value of all
		 *           historic glucose readings in 30 days: 8.3 mmol/L
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step4);
		clickOnDays(client, 30);
		verifyAverageHistoricGlucoseForNdays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Set Phone timing to 24hr Format and Navigate to Home page
		 * @Expected Settings:Target Glucose Range to 5.6-7.8 mmol/L using
		 *           Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 *
		 **/
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 5.6, 7.8);
		navigateToScreen(client, "Average Glucose");

		/**
		 *
		 * @stepId Step 5
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The Average Glucose report displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day:00:00-03:00: 7.4;03:00-06:00:
		 *           8.3;06:00-09:00: 8.6;09:00-12:00: 8.9;12:00-15:00:
		 *           8.8;15:00-18:00: 8.5;18:00-21:00: 8.2;21:00-00:00: 7.7
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step5);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 6
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The Average Glucose report displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day:00:00-03:00: 10.3;03:00-06:00:
		 *           10.9;06:00-09:00: 11.2;09:00-12:00: 11.9;12:00-15:00:
		 *           11.4;15:00-18:00: 11.0;18:00-21:00: 11.2;21:00-00:00: 10.4
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step6);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 7
		 * @Reqt SDAIUIRS995_1000
		 * @Expected The Average Glucose report displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day:00:00-03:00: 8.1;03:00-06:00:
		 *           8.9;06:00-09:00: 9.5;09:00-12:00: 9.7;12:00-15:00:
		 *           9.7;15:00-18:00: 9.6;18:00-21:00: 9.2;21:00-00:00: 8.5
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step7);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 *
		 * @stepId Step 8
		 * @Reqt SDAIUIRS995_SDAIUIRS1000
		 * @Expected The Average Glucose report displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day:00:00-03:00: 9.5;03:00-06:00:
		 *           10.2;06:00-09:00: 10.6;09:00-12:00: 11.0;12:00-15:00:
		 *           10.7;15:00-18:00: 10.5;18:00-21:00: 10.2;21:00-00:00: 9.6
		 * @Dependancy NA
		 *
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step8);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set device time 00:00 and Target
		 *           Glucose Range to 8.6-10.0 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 8.6, 10.0);
		setTheDateAndTime(client, 12, 06, 2016, "00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "High-1data" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "High-1data.json");
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS993
		 * @Expected 'The Average Glucose report displays the average value of
		 *           all historic glucose readings in 7 days: 13.9 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step9);
		clickOnDays(client, 7);
		verifyAverageHistoricGlucoseRange155To180For7Days(client);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS995
		 * @Expected The Average Glucose report displays a bar graph showing the
		 *           average of all historic glucose readings within each time
		 *           period of the day:00:00-03:00: 27.8;03:00-06:00:
		 *           13.4;06:00-09:00: 27.8;09:00-12:00: 13.3;12:00-15:00:
		 *           13.3;15:00-18:00: 3.9;18:00-21:00: 7.8;21:00-00:00: 10.0
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step10);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 27.8 mmol/L contained within the graph.Y axis is not
		 *           labelled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step11);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 27.8 mmol/L contained within the graph.Y axis is not
		 *           labelled
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step12);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 27.8 mmol/L contained within the graph.Y axis is not
		 *           labelled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step13);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);

		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to 27.8 mmol/L contained within the graph.Y axis is not
		 *           labelled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step14);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS1000
		 * @Expected The software distinguishes bars with values 00:00-03:00
		 *           21.8, 03:00-06:00 13.4, 06:00-09:00 27.8, 09:00-12:00 13.3,
		 *           12:00-15:00 3.9, 15:00-21:00 7.2, 21:00-00:00 10.0
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step15);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: set the phone Date as CurrentDate+5 days
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 17, 06, 2016, "00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Setting the Target Glucose Range to 8.6-10.0 mmol/L using
		 *           Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 8.6, 10.0);
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 16_1
		 * @Reqt SDAIUIRS1200, SDAIUIRS1197, SDAIUIRS1198, SDAIUIRS1199
		 * @Expected The software distinguishes bars with values 3.9-8.5 mmol/L
		 *           in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3
		 *           mmol/L in yellow;values >13.3 mmol/L in orange for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_1);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16_2
		 * @Reqt SDAIUIRS1200, SDAIUIRS1197, SDAIUIRS1198, SDAIUIRS1199
		 * @Expected The software distinguishes bars with values 3.9-8.5 mmol/L
		 *           in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3
		 *           mmol/L in yellow;values >13.3 mmol/L in orange for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_2);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16_3
		 * @Reqt SDAIUIRS1200, SDAIUIRS1197, SDAIUIRS1198, SDAIUIRS1199
		 * @Expected The software distinguishes bars with values 3.9-8.5 mmol/L
		 *           in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3
		 *           mmol/L in yellow;values >13.3 mmol/L in orange for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_3);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16_4
		 * @Reqt SDAIUIRS1200, SDAIUIRS1197, SDAIUIRS1198, SDAIUIRS1199
		 * @Expected The software distinguishes bars with values 3.9-8.5 mmol/L
		 *           in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3
		 *           mmol/L in yellow;values >13.3 mmol/L in orange for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_4);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS1000
		 * @Expected The Average Glucose report displays the average value
		 *           corresponding to each bar
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step17);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS993
		 * @Expected The Average Glucose report displays the average value of
		 *           all historic glucose readings in 7 days: 27.8 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step18);
		clickOnDays(client, 7);
		verifyTotalAverageHistoricalGlucoseReadingFor7Days(client);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set device time 00:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 01, 07, 2016, "00:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Load Data file to "LOW.json" using MOCK_2 and Navigate to
		 *           Home page
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client,  "MOCK_2","ADC","LOW.json");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings: set the phone Date as CurrentDate+5 days
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client, 06, 07, 2016, "00:00");
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to around 2.2 mmol/L contained within the graph.Y axis is
		 *           not labelled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step19);
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS997
		 * @Expected The Average Glucose report displays a Y-axis range from 0
		 *           to around 5.6 mmol/L.Y axis is not labelled.
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step20);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21_1
		 * @Reqt SDAIUIRS1000
		 * @Expected Average Glucose report displays the value 00:00-03:00 2.2, 03:00-06:00 3.8,
		 *  		 06:00-09:00 2.2, 09:00-12:00 3.9, 12:00-15:00 3.9, 15:00-18:00 5.6,
		 *   		 18:00-21:00 null, 21:00-00:00 null
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step21_1);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Average Glucose");

		/**
		 * 
		 * @stepId Step 21_2
		 * @Reqt SDAIUIRS1000 
		 * @Expected Average Glucose report displays the value 12am-3am 2.2,
		 *  		 3am-6am 3.8, 6am-9am 2.2, 9am-12pm 3.9, 
		 *  		 12pm-3pm 3.9, 3pm-6pm 5.6, 6pm-9pm null, 9pm-12am null
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step21_2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate to Home page and Set the Target Glucose Range to
		 *           3.9-4.0 mmol/L using Librelink Settings
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
		launch(client);
		navigateToScreen(client, "Settings");
		verifyandsetTGfromSettings(client, 3.9, 4.0);
		navigateToScreen(client, "Average Glucose");


		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 3.9 mmol/L in red;
		 *           values 3.9-4.0 mmol/L in green;
		 *           values 4.1- 13.3 mmol/L in yellow for 30days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step22);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS993
		 * @Expected 'The Average Glucose report displays the average value of
		 *           all historic glucose readings in 7 days: 2.2 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step23);
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
		setTheDateAndTime(client, 01, 07, 2016, "00:00");

		/**
		 * 
		 * @stepId Step 24_1
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 3.9 mmol/L in red;
		 *           values 3.9-4.0 mmol/L in green;
		 *           values 4.1- 13.3 mmol/L in yellow for 7 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_1);
		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 7);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24_2
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 3.9 mmol/L in red;
		 *           values 3.9-4.0 mmol/L in green;
		 *           values 4.1- 13.3 mmol/L in yellow for 14 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_2);
		clickOnDays(client, 14);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24_3
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 3.9 mmol/L in red;
		 *           values 3.9-4.0 mmol/L in green;
		 *           values 4.1- 13.3 mmol/L in yellow for 30 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_3);
		clickOnDays(client, 30);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24_4
		 * @Reqt SDAIUIRS1196_SDAIUIRS1200_SDAIUIRS1197_SDAIUIRS1198
		 * @Expected The software distinguishes bars with values < 3.9 mmol/L in red;
		 *           values 3.9-4.0 mmol/L in green;
		 *           values 4.1- 13.3 mmol/L in yellow for 90 days
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_4);
		clickOnDays(client, 90);
		capturescreenshot(client, getStepID(), true);

		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}

}
