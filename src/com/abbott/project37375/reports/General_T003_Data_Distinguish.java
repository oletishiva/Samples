package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T003_Data_Distinguish extends ReportsHelper {

	@Test
	public void test_T003_Data_Distinguish() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Change Time Format to 24 Hours and Set device time
		 *           to 00:00, Load Data file to "1dayLow2High.json" using
		 *           MOCK_2 and Navigate to MyGlucose and set the Target Glucose
		 *           Range to 100-140 mg/dL or 5.6-7.8 mmol/L.
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,07,2016,"00:00");
		clickOnSettingsMenu(client, "App Settings");

		if (getUnits().equalsIgnoreCase("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}
		loadTestData(client, "MOCK_2","ADC", "1dayLow2High.json");



		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1152
		 * @Expected Graph that show individual historical glucose traces
		 *           distinguishes the sections of those traces that are < 70
		 *           mg/dL or 3.9 mmol/L:The section of HG traces around
		 *           6am:Before 6am:data line before 6am: Historic glucose
		 *           values.are displayed in red color line when values <70
		 *           mg/dL or <3.9 mmol/L;After 6am: Historic glucose values are
		 *           displayed in black color line when values >69 mg/d or >3.8
		 *           mmol/L
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T003_Data_Distinguish_Step1);

		navigateToScreen(client, "Daily Graph");
		clickArrowOnTopLeftOfTheGraph(client, 1);
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}


}
