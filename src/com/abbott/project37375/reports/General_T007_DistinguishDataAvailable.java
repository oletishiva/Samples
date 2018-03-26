package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;


public class General_T007_DistinguishDataAvailable extends ReportsHelper {

	@Test
	public void test_T007_DistinguishDataAvailable() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Change Time Format to 24 Hours and Set device time
		 *           to Sept 1st 2016 10:00, Load Data file to "90days_autoDate.json" using
		 *           MOCK_2 
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		setTheDateAndTime(client,01,9,2016,"10:00");

		loadTestData(client, "MOCK_2","Autodated","90days_autoDate.json");



		/**
		 * 
		 * @stepId Step 1
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Low Glucose Events reports page and Date Available for 7 of 7 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step1);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"7 of 7 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 2
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 14 of 14 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step2);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"14 of 14 days","Black");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 3
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 30 of 30 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step3);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"30 of 30 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 4
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 90 of 90 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step4);

		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"90 of 90 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 5
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Average Glucose reports page and Date Available for 7 of 7 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step5);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"7 of 7 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 6
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 14 of 14 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step6);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"14 of 14 days","Black");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 7
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 30 of 30 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step7);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"30 of 30 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 8
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 90 of 90 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step8);

		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"90 of 90 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 9
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Time In Target reports page and Date Available for 90 of 90 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step9);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"90 of 90 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 10
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 30 of 30 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step10);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"30 of 30 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 11
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 14 of 14 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step11);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"14 of 14 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 12
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 7 of 7 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step12);

		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"7 of 7 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 13
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Daily Patterns reports page and Date Available for 90 of 90 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step13);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"90 of 90 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 14
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 30 of 30 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step14);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"30 of 30 days","Black");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 15
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 14 of 14 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step15);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"14 of 14 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 16
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 7 of 7 days in black color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step16);

		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"7 of 7 days","Black");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 17
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Low Glucose Events reports page and Date Available for 0 of 7 days in red color
		 * @Dependancy NA
		 * 
		 **/
		
		
		setTheDateAndTime(client, 8,9,2016, null);
		
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step17);

		navigateToScreen(client, "Low Glucose Events");
		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"0 of 7 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 18
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 7 of 14 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step18);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"7 of 14 days","Red");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 19
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 23 of 30 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step19);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"23 of 30 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 20
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 83 of 90 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step20);

		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"83 of 90 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 21
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Average Glucose reports page and Date Available for 0 of 7 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step21);

		navigateToScreen(client, "Average Glucose");
		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"0 of 7 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 22
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 7 of 14 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step22);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"7 of 14 days","Red");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 23
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 23 of 30 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step23);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"23 of 30 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 24
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 83 of 90 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step24);

		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"83 of 90 days","Red");
		capturescreenshot(client, getStepID(), true);


		setTheDateAndTime(client,15,9,2016,"10:00");


		/**
		 * 
		 * @stepId Step 25
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Time In Target reports page and Date Available for 76 of 90 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step25);

		navigateToScreen(client, "Time In Target");
		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"76 of 90 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 26
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 16 of 30 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step26);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"16 of 30 days","Red");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 27
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 0 of 14 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step27);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"0 of 14 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 28
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 0 of 7 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step28);

		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"0 of 7 days","Red");
		capturescreenshot(client, getStepID(), true);


		setTheDateAndTime(client,30,9,2016,"10:00");


		/**
		 * 
		 * @stepId Step 29
		 * @Reqt SDAIUIRS1257
		 * @Expected Navigate to Daily Patterns reports page and Date Available for 61 of 90 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step29);

		navigateToScreen(client, "Daily Patterns");
		clickOnDays(client, 90);
		verifyDataAvailableColor(client,"61 of 90 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 30
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 1 of 30 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step30);

		clickOnDays(client, 30);
		verifyDataAvailableColor(client,"1 of 30 days","Red");
		capturescreenshot(client, getStepID(), true);



		/**
		 * 
		 * @stepId Step 31
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 0 of 14 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step31);

		clickOnDays(client, 14);
		verifyDataAvailableColor(client,"0 of 14 days","Red");
		capturescreenshot(client, getStepID(), true);


		/**
		 * 
		 * @stepId Step 32
		 * @Reqt SDAIUIRS1257
		 * @Expected Date Available for 0 of 7 days in red color
		 * @Dependancy NA
		 * 
		 **/
		setStepID(LibrelinkConstants.General_T007_DistinguishDataAvailable_Step32);

		clickOnDays(client, 7);
		verifyDataAvailableColor(client,"0 of 7 days","Red");
		capturescreenshot(client, getStepID(), true);


		selectingSASMode(client,"DEFAULT");
		currentSystemTime(client);

	}


}
