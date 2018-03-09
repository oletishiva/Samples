package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class DailyGraph_T002_Gap_LowG_YaxisRange extends ReportsHelper {

	@Test
	public void test_T002_Gap_LowG_YaxisRange() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Change Time to Current system Time and Load Data
		 *           file to "1daylow2high" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,07,2016,"00:00");
		loadTestData(client, "MOCK_2","ADC", "1daylow2high-5d.json");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Navigate Home page and Target Glucose Range to
		 *           100-140 using Librelink Settings
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
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1007
		 * @Expected The Daily Graph report displays a Y-axis range from 0 to
		 *           500 mg/dL or 0-27 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step1);
		navigateToScreen(client, "Daily Graph");
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			clickArrowOnTopLeftOfTheGraph(client, 2);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			clickArrowOnTopLeftOfTheGraph(client, 1);
		}
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1007
		 * @Expected The Daily Graph report displays a Y-axis range from 0 to
		 *           350 mg/dL or 0-21 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step2);
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			clickArrowOnTopLeftOfTheGraph(client, 2);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			clickArrowOnTopLeftOfTheGraph(client, 3);
		}
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1007
		 * @Expected 'The Daily Graph report displays a Y-axis range from 0 to
		 *           500 mg/dL or 0-27 mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step3);
		clickArrowOnTopLeftOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS1009
		 * @Expected The Daily Graph report glucose graph displays historical
		 *           glucose values:A connecting line  with color black when 
		 *           values >69 mg/dL or 3.8 mmol/L, and red
		 *           when values <70mg/dL or 3.9 mmol/L is displayed
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step4);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS1010
		 * @Expected The Daily Graph report glucose graph connects historical
		 *           glucose values that were recorded consecutively, in the
		 *           same time epoch, and have user timestamps within 20 minutes
		 *           of each other:There is a continuous line from 00:00 to
		 *           10:45
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step5);
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Navigate Home page ,Change Time Format to 12 Hours and Set
		 *           device time to 14:00
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,07,2016,"14:00");

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Load Data file to "Gaps21min-19m20m.json" using
		 *           MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		loadTestData(client, "MOCK_2","ADC", "Gaps21min-19m20m.json");

		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS1010
		 * @Expected The Daily Graph report glucose graph connects historical
		 *           glucose values that were recorded consecutively, in the
		 *           same time epoch, and have user timestamps within 20 minutes
		 *           of each other:No gaps around 09:19 to 09:39;No gaps around
		 *           12:30 to 12:50 : Note: HG < or = 20 mins apart
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step6);
		navigateToScreen(client, "Daily Graph");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS1010
		 * @Expected The Daily Graph report glucose graph connects historical
		 *           glucose values that were recorded consecutively, in the
		 *           same time epoch, and have user timestamps within 20 minutes
		 *           of each other:Gap around 07:39 to 08:00 and Gap around10:54
		 *           to 11:15 Note: HG > 20 mins apart
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.DailyGraph_T002_Gap_LowG_YaxisRange_Step7);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}
}
