package com.abbott.project37375.reports;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.abbott.project37375.main.BaseHelper;
import com.experitest.client.Client;


public class ReportsHelper extends BaseHelper {

	

	/**
	 * Author: Devi
	 * 
	 * Verify Network warning message
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void verifyNetworkWarningMsg(Client client) {
		client.waitForElement("NATIVE", "id=parentPanel", 0, 5000);
		client.verifyElementFound("NATIVE",
				"text=${error_networktime_disabled}", 0);
		client.verifyElementFound("NATIVE", "id=icon", 0);
		client.verifyElementFound("NATIVE", "id=message", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='button2' and @text='No']", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='button1' and @text='Yes']", 0);
	}


	/**
	 * Author:Devi
	 * 
	 * Select Yes or No option on time Update in Date and Time settings
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param option
	 *            Option Yes or No
	 */
	public void selectOptioninNetworkWarning(Client client, String option) {

		if (client.isElementFound("NATIVE",
				"xpath=//*[@id='button1' and @text='"+option+"']", 0)) {

			client.click("NATIVE", "xpath=//*[@id='button1' and @text='"+option+"']",0, 1);
			waitFor(client,1);
			if(option.equalsIgnoreCase("yes")){
				client.verifyElementFound("NATIVE","text=Date and time", 0);
			}
			else{
				client.verifyElementNotFound("NATIVE","text=Date and time", 0);
				client.verifyElementFound("NATIVE","xpath=//*[@id='button2' and @text='"+option+"']", 0);

			}

		}
	}


	/**
	 * Author:Devi
	 * 
	 * verify Update Date and Time is not displayed
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */

	public void verifyUpdateDateandTimePopUpNotFound(Client client) {
		client.verifyElementNotFound("NATIVE",
				"text=${error_networktime_disabled}", 0);
	}



	/**
	 * Author:Devi 
	 * 
	 * Method to verify the report
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyHistoricUserTimeReportFor4hrTo5dDatafile(Client client) {

		if (client.waitForElement("NATIVE", "text=Sensor Usage", 0, 1000)) {

			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='total_scan_value' and @text='10']",
					0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='average_value' and @text='1']",
					0);
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='captured_value' and @text='12']",
					0);
		}
	}


	/**
	 * Author:Devi
	 * 
	 * Click on Share Sign Button from the Bottom of screen 
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void clickShareButton(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@id='share' and @onScreen='true']", 0, 10000)) {
			client.click("NATIVE", "xpath=//*[@id='share' and @onScreen='true']", 0, 1);

		}
		waitFor(client, 1);

	}

	/**
	 * Author:Devi
	 * 
	 * Click on Mail option
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void clickEmail(Client client) {
		if(client.isElementFound("NATIVE", "xpath=//*[@text='Gmail']", 0)){
			client.click("NATIVE", "xpath=//*[@text='Gmail']", 0, 1);
		}else{
			client.elementSwipeWhileNotFound("NATIVE",
					"xpath=//*[contains(@id,'list')]", "Left", 0, 2000,
					"NATIVE", "xpath=//*[@text='Gmail']", 0, 1000, 5, true);
		}

		waitFor(client,1);
		client.waitForElement("NATIVE", "xpath=//*[@text='Compose']", 0, 2000);

	}


	/**
	 * Author:Devi
	 * 
	 * Send email
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */


	public void sendEmail(Client client) {

		if (client
				.isElementFound("NATIVE", "xpath=//*[contains(@text,'Compose')]", 0)) {
			client.elementSendText("NATIVE", "xpath=//*[@id='to']", 0,
					"abbott.automation@gmail.com");
		}
		client.click("NATIVE", "xpath=//*[@id='body_wrapper']", 0, 1);
		client.closeKeyboard();
		client.click("NATIVE", "id=send", 0, 1);
		waitFor(client, 2);
	}


	/**
	 * Author:Devi
	 * 
	 * Navigate To graph by selecting from drop down
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param reportname 
	 * 				Set report name
	 * 
	 */

	public void navigateToReportBySlide(Client client, String reportname){
		String xCord = client.elementGetProperty("NATIVE", "xpath=//*[@text='"+reportname+"' and @id='text1']", 0, "x");
		String direction = "Right";
		if(Integer.parseInt(xCord)<0){
			direction = "Left";
		}
		if (client.swipeWhileNotFound(direction, 100, 500, "NATIVE",
				"xpath=//*[@text='"+reportname+"' and @id='text1' and @onScreen='true']", 0, 1000, 8, false)) {
			client.click("NATIVE", "xpath=//*[@text='"+reportname+"' and @id='text1' and @onScreen='true']", 0, 1);
			waitFor(client,1);
		}
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+reportname+"' and @id='text1' and @onScreen='true']", 0);
	}


	/**
	 * Author:Devi
	 * 
	 * Method to verify date header on the report
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Number of days Data
	 * 
	 * @param reportName
	 *            report name
	 *            
	 */

	public void verifyDatePeriodForNDays(Client client, String reportName, int noOfDays) {
		if (client.waitForElement("NATIVE", "xpath=//*[@text='"+reportName+"']", 0, 10000)) {
			if (noOfDays == 7) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='date_header' and @text='22 - 28 February 2013']",0);
			} else if (noOfDays == 14) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='date_header' and @text='15 - 28 February 2013']",0);
			}
			else if (noOfDays == 30) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='date_header' and @text='30 Jan - 28 Feb 2013']",0);
			} else if (noOfDays == 90) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='date_header' and @text='1 Dec 2012 - 28 Feb 2013']",0);
			}
		}
	}


	/**
	 * Author:Devi
	 * 
	 * Verify EstimatedA1c DatePeriod For NDays
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param daysData
	 *            Number of days Data
	 * 
	 */


	public void verifyEstimatedA1cReportDatePeriodForNdays(Client client,
			String daysData) {
		if (client.waitForElement("NATIVE", "text=Estimated A1c", 0, 10000)) {
			if (daysData.equals("24May")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='24 Feb - 24 May 2013']",
						0);
			} else if (daysData.equals("22May")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='22 Feb - 22 May 2013']",
						0);
			} else if (daysData.equals("15May")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='15 Feb - 15 May 2013']",
						0);
			} else if (daysData.equals("29Apr")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='30 Jan - 29 Apr 2013']",
						0);
			} else if (daysData.equals("28Feb")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='1 Dec 2012 - 28 Feb 2013']",
						0);
			} else if (daysData.equals("5Jan")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='8 Oct 2012 - 5 Jan 2013']",
						0);
			} else if (daysData.equals("4Jan")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='7 Oct 2012 - 4 Jan 2013']",
						0);
			}
		}

	}

	/** 
	 * Author:Devi
	 * 
	 * Verify EstimatedA1c,A1c percentage(%) is displayed or not.
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param days
	 *            Number of days Data
	 * 
	 */
	public void verifyEstimatedA1cReportCalPercentageForNdays(Client client,
			String days) {
		if (client.waitForElement("NATIVE", "text=Estimated A1c", 0, 10000)) {
			if (days.equalsIgnoreCase("24May")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='a1c_percent' and @text='8.5']", 0);
			} else if (days.equalsIgnoreCase("22May")) {
				if (getUnits().equalsIgnoreCase("mg/dL")) {
					client.verifyElementFound("NATIVE",
							"xpath=//*[@id='a1c_percent' and @text='8.6']", 0);
				} else if (getUnits().equalsIgnoreCase("mmol/L")) {
					client.verifyElementFound("NATIVE",
							"xpath=//*[@id='a1c_percent' and @text='8.5']", 0);
				}
			} else if (days.equalsIgnoreCase("15May")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='a1c_percent' and @text='8.1']", 0);
			} else if (days.equalsIgnoreCase("29Apr")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='a1c_percent' and @text='6.8']", 0);
			} else if (days.equalsIgnoreCase("28Feb")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='a1c_percent' and @text='7.4']", 0);
			} else if (days.equalsIgnoreCase("5Jan")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='a1c_percent' and @text='5.7']", 0);
			}
		}

	}

	/**
	 * Author:Devi
	 * 
	 * Verify EstimatedA1c, A1c mmol/mol is displayed
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param days
	 *            Number of days Data
	 * 
	 */

	public void verifyEstimatedA1cReportCalmmolForNdays(Client client,
			String days) {
		if (client.waitForElement("NATIVE", "text=Estimated A1c", 0, 10000)) {
			if (days.equalsIgnoreCase("5d")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='units' and @text='( 69 mmol/mol )']", 0);
			} else if (days.equalsIgnoreCase("7d")) {
				if (getUnits().equalsIgnoreCase("mg/dL")) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='units' and @text='( 70 mmol/mol )']",
							0);
				} else if (getUnits().equalsIgnoreCase("mmol/L")) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='units' and @text='( 69 mmol/mol )']",
							0);
				}
			} else if (days.equalsIgnoreCase("14d")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='units' and @text='( 65 mmol/mol )']", 0);
			} else if (days.equalsIgnoreCase("30d")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='units' and @text='( 51 mmol/mol )']", 0);
			} else if (days.equalsIgnoreCase("90d")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='units' and @text='( 57 mmol/mol )']", 0);
			} else if (days.equalsIgnoreCase("6d")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='units' and @text='( 39 mmol/mol )']", 0);
			}
		}


	}
	/**
	 * Author:Devi
	 * 
	 * Verify LowGlucoseEvents Report For TotalEvents
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Number of days Data
	 * 
	 */

	public void verifyLowGlucoseEventsReportForTotalEvents(Client client,
			int noOfDays) {
		if (client
				.waitForElement("NATIVE", "text=Low Glucose Events", 0, 10000)) {
			if (noOfDays==7) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Total Events: 0']",
						0);
			} else if (noOfDays==14) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Total Events: 0']",
						0);
			} else if (noOfDays==30) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Total Events: 8']",
						0);
			} else if (noOfDays==90) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Total Events: 8']",
						0);
			}
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify  XaxisWith_3_HoursPeriod in 12Hours Format
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param report 
	 * 				Set report name
	 * 
	 */

	public void verifyReportXAxisWith3HoursPeriodFor12Hours(
			Client client,String report) {
		client.waitForElement("NATIVE", "text="+report, 0, 1000);
		client.verifyElementFound("TEXT", "12AM", 0);
		client.verifyElementFound("TEXT", "3AM", 0);
		client.verifyElementFound("TEXT", "6AM", 0);
		client.verifyElementFound("TEXT", "9AM", 0);
		client.verifyElementFound("TEXT", "12PM", 0);
		client.verifyElementFound("TEXT", "3PM", 0);
		client.verifyElementFound("TEXT", "6PM", 0);
		client.verifyElementFound("TEXT", "9PM", 0);
		client.verifyElementFound("TEXT", "12AM", 1);
	}

	/**
	 * Author:Devi
	 * 
	 * Verify XaxisWith_3_HoursPeriod in 24Hours Format
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 *  @param report 
	 *  		Set report name
	 *  
	 */

	public void verifyReportXAxisWith3HoursPeriodFor24Hours(
			Client client,String report) {
		client.waitForElement("NATIVE", "text="+report, 0, 1000);
		client.verifyElementFound("TEXT", "00:00", 1);
		client.verifyElementFound("TEXT", "03:00", 0);
		client.verifyElementFound("TEXT", "06:00", 0);
		client.verifyElementFound("TEXT", "09:00", 0);
		client.verifyElementFound("TEXT", "12:00", 0);
		client.verifyElementFound("TEXT", "15:00", 0);
		client.verifyElementFound("TEXT", "18:00", 0);
		client.verifyElementFound("TEXT", "21:00", 0);
		client.verifyElementFound("TEXT", "00:00", 0);


	}

	/**
	 * Author:Devi
	 * 
	 * verify report available period for n days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Number of days Data available
	 * 
	 * @param reportName 
	 *  		  Set report name
	 */

	public void verifyReportDataAvailableForNdays(Client client, String reportName, int noOfDays) {
		if (client.waitForElement("NATIVE", "xpath=//*[@text='"+reportName+"']", 0, 1000)) {
			if (noOfDays==7) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='days_of_data' and @text='Data available for 4 of 7 days']",
						0);
			} else if (noOfDays==14 || noOfDays==30 || noOfDays==90 ) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='days_of_data' and @text='Data available for 6 of "+noOfDays+" days']",
						0);
			}
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify TimeInTarget Range 100-140 mg/dL or 5.6-7.8 mmol/L
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyTimeInTargetRange100To140(Client client) {
		if (client.waitForElement("NATIVE", "text=Time In Target", 0, 1000)) {

			if (getUnits().equalsIgnoreCase("mg/dL")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Target Range: 100 - 140 mg/dL']",
						0);
			} else if (getUnits().equalsIgnoreCase("mmol/L")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Target Range: 5.6 - 7.8 mmol/L']",
						0);
			}
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify TimeInTarget Range 70-180 mg/dL or3.9-10.0 mmol/L
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyTimeInTargetRange70To180(Client client) {
		if (client.waitForElement("NATIVE", "text=Time In Target", 0, 1000)) {

			if (getUnits().equalsIgnoreCase("mg/dL")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Target Range: 70 - 180 mg/dL']",
						0);
			} else if (getUnits().equalsIgnoreCase("mmol/L")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Target Range: 3.9 - 10.0 mmol/L']",
						0);
			}
		}
	}
	/**
	 * Author:Devi
	 * 
	 * Verify Average Historic Glucose for Ndays
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Select the Number of Days for Average Historical Data
	 * 
	 */

	public void verifyAverageHistoricGlucoseForNdays(Client client, int noOfDays) {

		if (client.waitForElement("NATIVE", "xpath=//*[@text='Average Glucose']", 0, 10000)) {
			if (getUnits().equalsIgnoreCase("mg/dL")) {
				if (noOfDays==7) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 199 mg/dL']",
							0);
				} else if (noOfDays==14) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 185 mg/dL']",
							0);
				} else if (noOfDays==30) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 149 mg/dL']",
							0);
				} else if (noOfDays==90) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 165 mg/dL']",
							0);
				}
			} else if (getUnits().equalsIgnoreCase("mmol/L")) {

				if (noOfDays==7) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 11.0 mmol/L']",
							0);
				} else if (noOfDays==14) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 10.3 mmol/L']",
							0);
				} else if (noOfDays==30) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 8.3 mmol/L']",
							0);
				} else if (noOfDays==90) {
					client.verifyElementFound(
							"NATIVE",
							"xpath=//*[@id='chart_summary' and @text='Average: 9.1 mmol/L']",
							0);
				}

			}

		}
	}


	/**
	 * Author:Devi
	 * 
	 * Verify AverageHistoricGlucose Range 155-180 for 7 days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyAverageHistoricGlucoseRange155To180For7Days(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@text='Average Glucose']", 0, 10000)) {
			client.verifyElementFound("NATIVE", "id=column_chart", 0);
			if (getUnits().equalsIgnoreCase("mg/dL")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Average: 250 mg/dL']",
						0);
			} else if (getUnits().equalsIgnoreCase("mmol/L")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Average: 13.9 mmol/L']",
						0);
			}
		}
	}
	/**
	 * Author:Devi
	 * 
	 * Verify Total Average Historical Glucose Reading For 7 Days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */


	public void verifyTotalAverageHistoricalGlucoseReadingFor7Days(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@text='Average Glucose']", 0, 1000)) {
			client.verifyElementFound("NATIVE", "id=column_chart", 0);
			if (getUnits().equalsIgnoreCase("mg/dL")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Average: 501 mg/dL']",
						0);
			} else if (getUnits().equalsIgnoreCase("mmol/L")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Average: 27.8 mmol/L']",
						0);
			}
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify Low Average Historical Glucose Reading Values For 7Days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyLowAverageHistoricalGlucoseReadingValuesFor7Days(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@text='Average Glucose']", 0, 10000)) {
			client.verifyElementFound("NATIVE", "id=column_chart", 0);
			if (getUnits().equalsIgnoreCase("mg/dL")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Average: 39 mg/dL']",
						0);
			} else if (getUnits().equalsIgnoreCase("mmol/L")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='chart_summary' and @text='Average: 2.2 mmol/L']",
						0);
			}
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify Daily Graph View Date 90Days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */


	public void verifyDailyGraphViewDate90Days(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@id='date_header']", 0,
				10000)) {
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='not_enough_data' and @text='Not Enough Sensor Data']",
					0);
			client.verifyElementNotFound("NATIVE", "xpath=//*[@id='back_button' and @hidden='false']", 0);
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Click Arrow On Top Right Of The Graph
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param count 
	 * 			set the count number
	 * 
	 */

	public void clickArrowOnTopRightOfTheGraph(Client client, int count) {
		if (client.isElementFound("NATIVE", "xpath=//*[@id='forward_button' and @onScreen='true']", 0)) {
			try {
				String dateToBeDisplayed = getNewDate(client,count);

				for (int i = 1; i <= count; i++) {
					client.click("NATIVE", "xpath=//*[@id='forward_button' and @onScreen='true']", 0, 1);
				}
				waitFor(client,1);
				client.verifyElementFound("NATIVE","xpath=//*[@text='"+dateToBeDisplayed+"']", 0);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public String getNewDate(Client client, int count) throws ParseException {
		String currentDate = client.elementGetText("NATIVE", "xpath=//*[@id='date_header' and @onScreen='true']", 0);
		SimpleDateFormat sdf;
		Date date;
		String dateToBeDisplayed=null;
		Calendar c1 = null;
		sdf = new SimpleDateFormat("dd MMMMM yyyy");
		date = sdf.parse(currentDate);
		c1 = Calendar.getInstance();
		c1.setTime(date);
		c1.add(Calendar.DATE, count);
		dateToBeDisplayed = sdf.format(c1.getTime());
		return dateToBeDisplayed;
	}

	/**
	 * Author:Devi
	 * 
	 * Click Arrow On Top Left Of The Graph
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param count
	 *            Number of times to Click on Top Left Arrow
	 * 
	 */
	public void clickArrowOnTopLeftOfTheGraph(Client client, int count) {

		if (client.isElementFound("NATIVE", "xpath=//*[@id='back_button' and @onScreen='true']", 0)) {
			try {
				int newcount=-count;
				String dateToBeDisplayed = getNewDate(client,newcount);

				for (int i = 1; i <= count; i++) {
					client.click("NATIVE", "xpath=//*[@id='back_button' and @onScreen='true']", 0, 1);
				}
				waitFor(client,1);
				client.verifyElementFound("NATIVE","xpath=//*[@text='"+dateToBeDisplayed+"']", 0);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify DailyGraph is not displayed for period beyond 90 days
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyDailyGraphForPeriodBeyond90days(Client client) {

		if (client.waitForElement("NATIVE", "xpath=//*[@id='date_header']", 0,
				1000)) {
			client.verifyElementNotFound("NATIVE", "xpath=//*[@text='Daily Graph'and @id='text1' and @hidden='false']", 0);

		}
	}

	/**
	 * Author:Devi
	 * 
	 * Method to click on cancel from the calendar
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void clickCancelfromCalendar(Client client) {
		client.deviceAction("Back");
	}

	/**
	 * Author:Devi
	 * 
	 * Verify SensorUsage Date For 14 Days With Additional Two Days
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifySensorUsageDateFor14DaysWithAdditionalTwoDays(
			Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@id='date_header']", 0,
				10000)) {

			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='date_header' and @text='17 Feb - 2 Mar 2013']",0);  
		}

	}

	/**
	 * Author:Devi
	 * 
	 * Verify SensorUsage Date For 14 Days With LeapYear
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifySensorUsageDateFor14DaysWithLeapYear(Client client) {
		if (client.waitForElement("NATIVE", "xpath=//*[@id='date_header']", 0,
				10000)) {
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='date_header' and @text='18 Feb - 2 Mar 2016']",0);
		}

	}



	/**
	 * Author:Devi
	 * 
	 * Verify Sensor Usage Scan Attempts For BasicData
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Selecting Number of Days Data for SensorUsage
	 * 
	 */

	public void verifySensorUsageScanAttemptsForBasicData(Client client,
			int noOfDays) {
		if (client.waitForElement("NATIVE", "text=Sensor Usage", 0, 10000)) {
			if (noOfDays==7) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='total_scan_value' and @text='18']", 0);
			} else if (noOfDays==14) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='total_scan_value' and @text='49']", 0);
			} else if (noOfDays==30) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='total_scan_value' and @text='109']", 0);
			} else if (noOfDays==90) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='total_scan_value' and @text='227']", 0);
			}
		}
	}


	/**
	 * Author:Devi
	 * 
	 * Verify SensorUsage AverageScans Per Day For Basic Data
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Selecting Number of Days Data for SensorUsage
	 * 
	 */

	public void verifySensorUsageAverageScansPerDayForBasicData(Client client,
			int noOfDays) {
		if (client.waitForElement("NATIVE", "text=Sensor Usage", 0, 10000)) {
			if (noOfDays==7) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='average_value' and @text='3']", 0);
			} else if (noOfDays==14) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='average_value' and @text='4']", 0);
			} else if (noOfDays==30) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='average_value' and @text='4']", 0);
			} else if (noOfDays==90) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='average_value' and @text='3']", 0);
			}
		}
	}



	/**
	 * Author:Devi
	 * 
	 * Verify SensorUsage Percentage Of High Glucose Data For Basic Data
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param noOfDays
	 *            Selecting Number of Days Data for SensorUsage
	 * 
	 */

	public void verifySensorUsagePercentageOfHGDataForBasicData(Client client,
			int noOfDays) {
		if (client.waitForElement("NATIVE", "text=Sensor Usage", 0, 10000)) {
			if (noOfDays==7) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='captured_value' and @text='74']", 0);
			} else if (noOfDays==14) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='captured_value' and @text='88']", 0);
			} else if (noOfDays==30) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='captured_value' and @text='96']", 0);
			} else if (noOfDays==90) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='captured_value' and @text='68']", 0);
			}
		}
	}


	/**
	 * Author:Devi
	 * 
	 * Click On Icon Under Reports Page and verify report message
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param report
	 *            report to be selected
	 * 
	 */

	public void clickOnIconAndVerifyReportMessage(Client client, String report) {
		client.waitForElement("NATIVE", "xpath=//*[@id='info' and @onScreen='true']", 0, 3000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='info' and @onScreen='true']", 0);

		if (report.equals("Daily Patterns")) {
			client.click("NATIVE", "id=info", 0, 1);
			client.verifyElementFound("NATIVE", "text=DAILY PATTERNS", 0);
			client.verifyElementFound("NATIVE", "text=${daily_patterns_info_msg}", 0);

		} else if (report.equals("Time In Target")) {
			client.click("NATIVE", "id=info", 1, 1);
			client.verifyElementFound("NATIVE", "text=TIME IN TARGET", 0);
			client.verifyElementFound("NATIVE", "text=${time_in_target_info_msg}", 0);

		} else if (report.equals("Low Glucose Events")) {
			client.click("NATIVE", "id=info", 1, 1);
			client.verifyElementFound("NATIVE", "text=LOW GLUCOSE EVENTS", 0);
			if(getUnits().contains("mg")){
				client.verifyElementFound("NATIVE", "text=${low_glucose_info_msg_mg}", 0);
			}else{
				client.verifyElementFound("NATIVE", "text=${low_glucose_info_msg_mmol}", 0);
			}


		} else if (report.equals("Average Glucose")) {
			client.click("NATIVE", "id=info", 1, 1);
			client.verifyElementFound("NATIVE", "text=AVERAGE GLUCOSE", 0);
			client.verifyElementFound("NATIVE", "text=${average_glucose_info_msg}", 0);

		} else if (report.equals("Daily Graph")) {
			client.click("NATIVE", "id=info", 1, 1);
			client.verifyElementFound("NATIVE", "text=DAILY GRAPH", 0);
			client.verifyElementFound("NATIVE", "text=${daily_info_msg}", 0);

		} else if (report.equals("Estimated A1c")) {
			client.click("NATIVE", "id=info", 1, 1);
			client.verifyElementFound("NATIVE", "text=ESTIMATED A1c", 0);
			client.verifyElementFound("NATIVE", "text=${a1c_info_msg}", 0);

		} else if (report.equals("Sensor Usage")) {
			client.click("NATIVE", "id=info", 1, 1);
			client.verifyElementFound("NATIVE", "text=SENSOR USAGE", 0);
			client.verifyElementFound("NATIVE", "text=${sensor_usage_info_msg}", 0);

		}

		client.verifyElementFound("NATIVE", "id=message", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='OK']", 0);
		client.verifyElementFound("NATIVE", "id=icon", 0);

	}


	/**
	 * Author:Devi
	 * 
	 * Click OK In Reports Page Pop-Up
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void clickOk(Client client) {
		if (client.isElementFound("NATIVE",
				"xpath=//*[@id='button1' and @text='OK']", 0)) {
			client.click("NATIVE", "xpath=//*[@id='button1' and @text='OK']",
					0, 1);
			client.waitForElement("NATIVE", "text=Reports", 0, 1000);
			client.verifyElementFound("NATIVE", "text=Reports", 0);

		}
	}


	/**
	 * Author:Devi
	 * 
	 * Verify Not Enough Sensor Data Message
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyNotEnoughSensorDataMessage(Client client) {
		if (client.waitForElement("NATIVE", "id=chartLoadingView", 0, 1000)) {
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='not_enough_data' and @text='Not Enough Sensor Data']",
					0);
		}
	}
	

	/**
	 * Author: Devi
	 * 
	 *         Verify Home Screen
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void verifyHomeScreen(Client client) {
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			client.waitForElement("NATIVE", "id=content_title_apply", 0, 10000);
			client.verifyElementFound("NATIVE", "text=Apply New Sensor", 0);
		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			client.waitForElement("NATIVE", "id=content_title_scan", 0, 10000);
			client.verifyElementFound("NATIVE", "id=howToScan", 0);
		}

	}
	/**
	 * Author:Devi
	 * 
	 *         Set The Date In Phone Date Settings
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param date
	 *            Selecting Date from Device Settings
	 * 
	 * @param month
	 *            Selecting month from Device Settings
	 * 
	 * @param year
	 *            Selecting year from Device Settings
	 * 
	 * @param additionalDay 
	 * 				add the additional days
	 * 
	 */
	public void setTheDate(Client client, String date, String month,
			String year, int additionalDay) {


		System.out.println("============================" + date);
		System.out.println("============================" + month);
		System.out.println("============================" + year);
		System.out.println("============================" + additionalDay);


		Calendar c = Calendar.getInstance();

		c.set(Calendar.DATE, Integer.parseInt(date) + additionalDay);
		int mon = Integer.parseInt(month);
		System.out.println("=========" + mon);
		int month1 = mon - 1;
		System.out.println("===========" + month1);
		c.set(Calendar.MONTH, month1);
		c.set(Calendar.YEAR, Integer.parseInt(year));
		System.out.println(c.getTime());

		String DeviceVer = client
				.run("adb shell getprop ro.build.version.release ");
		if (DeviceVer.contains("5.")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmmss");
			String YYYYMMDD = sdf.format(c.getTime());
			System.out.println(YYYYMMDD);
			// This command has been executed twice to overcome the time changing challenges due to day light savings
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
		}
		else{
			SimpleDateFormat altsdf = new SimpleDateFormat("MMddHHmmYY.ss");
			String MMDDYY = altsdf.format(c.getTime());
			System.out.println(MMDDYY);

			client.run("adb shell su -c 'date -u " + MMDDYY + "'");
			// This command has been executed twice to overcome the time changing challenges due to day light savings
			client.run("adb shell su -c 'date " + MMDDYY + "'");

			client.sleep(20000);

		}
		client.sleep(10000);
	}
	/**
	 * Author: Devi
	 * 
	 *         Verify Automatic Date Message(Enable/Disable Mode)
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void verifyAutomaticDateMessage(Client client) {
		client.waitForElement("NATIVE", "id=parentPanel", 0, 5000);
		client.verifyElementFound("NATIVE",
				"text=${error_networktime_disabled}", 0);
		client.verifyElementFound("NATIVE", "id=icon", 0);
		client.verifyElementFound("NATIVE", "id=message", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='button2' and @text='No']", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='button1' and @text='Yes']", 0);
	}

	/**
	 * Author:Devi
	 * 
	 * Verify EstimatedA1c Report Calculated Values
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void verifyEstimatedA1cReportCalculatedValues(Client client) {
		if (client.waitForElement("NATIVE", "text=Estimated A1c", 0, 10000)) {
			client.verifyElementFound("NATIVE", "text=Estimated A1c", 0);
			client.verifyElementFound("NATIVE", "id=percent_layout", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='a1c_percent' and @text='9.4']", 0);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='( 79 mmol/mol )']", 0);
		}
	}

	/**
	 * Author:Devi
	 * 
	 * Verify EstimatedA1c Date on Top of Header
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param date
	 *            Number of Days data
	 *            
	 */

	public void verifyEstimatedA1cDateHeader(Client client, String date) {

		if (client.waitForElement("NATIVE", "text=Estimated A1c", 0, 10000)) {
			client.verifyElementFound("NATIVE", "text=Estimated A1c", 0);
			if (date.equalsIgnoreCase("Apr5")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='6 Jan - 5 Apr 2014']",
						0);
			} else if (date.equalsIgnoreCase("Apr8")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='9 Jan - 8 Apr 2014']",
						0);

			} else if (date.equalsIgnoreCase("Apr11")) {
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='date_header' and @text='12 Jan - 11 Apr 2014']",
						0);
			}

		}

	}


	/**
	 * Author:Devi
	 * 
	 * Verify EstimatedA1c Data Span
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param nofDays 
	 * 				no of days available
	 * 
	 */

	public void verifyEstimatedA1cReportDataSpanForNdays(Client client, int nofDays) {

		if (client.waitForElement("NATIVE", "text=Estimated A1c", 0, 10000)) {
			client.verifyElementFound("NATIVE", "text=Estimated A1c", 0);
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='days_of_data' and @text='Data spans "+nofDays+" of 90 days']",
					0);
		}
	}

	/**
	 * Author:Devi
	 * 
	 *         Verify Error loading data' failure is notified. No Report or Data
	 *         calculations are displayed.
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * 
	 * 
	 */
	public void verifyErrorLoadingData(Client client) {
		if (client.waitForElement("NATIVE", "text=Reports", 0, 10000)) {
			client.verifyElementFound("NATIVE", "text=Error loading data", 0);
		}
	}


	/**
	 * Author:Devi
	 * 
	 * verify color of the content displayed below the graph
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param days 
	 * 			no of days available
	 * 
	 * @param color 
	 * 			set the color
	 * 
	 */

	public void verifyDataAvailableColor(Client client, String days, String color) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Data available for "+days+"' and @onScreen='true']", 0);
		if(color.equalsIgnoreCase("Red")){
			client.verifyElementFound("NATIVE","xpath=//*[@id='days_of_data' and @textColor='0x990000' and @onScreen='true']",0);
		}else{
			client.verifyElementFound("NATIVE","xpath=//*[@id='days_of_data' and @textColor='0x444444' and @onScreen='true']",0);
		}


	}
}
