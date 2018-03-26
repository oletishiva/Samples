package com.abbott.project37375.reports;

import org.junit.Test;

import com.abbott.project37375.main.LibrelinkConstants;

public class DailyGraph_T003_TimeChange extends ReportsHelper {

	@Test
	public void test_T003_TimeChange() throws Exception {

		/**
		 * 
		 * @stepId Pre-Condition
		 * @Reqt NA
		 * @Expected Settings:Set Time Zone to PST Or PDT and Set Time format to
		 *           12 Hours and Change Time to Today 10:00 and Load Data file
		 *           to "text=4hr-5dAnchorage_local-plus1hr.json" using MOCK_2
		 * @Dependancy Script cannot proceed if this step fails
		 * 
		 **/
		appNetworkTimeCheck(client,true);
		try{
			changeTimeZone(client, LibrelinkConstants.US);
			setTheDateAndTime(client,01,07,2016,"10:00");
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
			launch(client);
			loadTestData(client, "MOCK_2","ADC", "4hr-5dAnchorage_local-plus1hr.json");

			/**
			 * 
			 * @stepId Step 1
			 * @Reqt SDAUIRS1012
			 * @Expected Graph displays a time-change icon around 8:00 am
			 * @Dependancy NA
			 * 
			 **/
			setStepID(LibrelinkConstants.DailyGraph_T003_TimeChange_Step1);
			navigateToScreen(client, "Daily Graph");
			clickArrowOnTopLeftOfTheGraph(client, 4);
			capturescreenshot(client, getStepID(), true);


			/**
			 * 
			 * @stepId Pre-Condition
			 * @Reqt NA
			 * @Expected Settings:Set Time zone to PST/PDT Time format to 12 Hours
			 *           and Change Time to Today 10:00 and Load Data file to
			 *           "4hr-5dChicago_local-2hr.json" using MOCK_2
			 * @Dependancy Script cannot proceed if this step fails
			 * 
			 **/
			changeTimeZone(client, LibrelinkConstants.US);
			setTheDateAndTime(client,1,7,2016,"10:00");
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
			launch(client);
			loadTestData(client, "MOCK_2","ADC","4hr-5dChicago_local-2hr.json");

			/**
			 * 
			 * @stepId Step 2
			 * @Reqt SDAUIRS1012
			 * @Expected Graph displays a time-change icon around 8 am
			 * @Dependancy NA
			 * 
			 **/
			setStepID(LibrelinkConstants.DailyGraph_T003_TimeChange_Step2);
			navigateToScreen(client, "Daily Graph");
			clickArrowOnTopLeftOfTheGraph(client, 4);
			capturescreenshot(client, getStepID(), true);


			/**
			 * 
			 * @stepId Step 3
			 * @Reqt SDAUIRS1013
			 * @Expected The Daily Graph report glucose graph does not allow
			 *           historical glucose traces from before a time change event
			 *           to overlap with those after a time change event:Two hours
			 *           HG data before Time change not displayed. There is No
			 *           overlap traces on graph
			 * @Dependancy NA
			 * 
			 **/
			setStepID(LibrelinkConstants.DailyGraph_T003_TimeChange_Step3);

			capturescreenshot(client, getStepID(), true);



			selectingSASMode(client,"DEFAULT");
			changeTimeZone(client, getDefaultTimeZone());
			currentSystemTime(client);

		}
		catch(Exception e){
			selectingSASMode(client,"DEFAULT");
			changeTimeZone(client, getDefaultTimeZone());
			currentSystemTime(client);
			throw e;
		}



	}

}
