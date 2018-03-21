package com.abbott.project37375.notesAndlogbook;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;




import org.junit.Assert;

import com.abbott.project37375.main.BaseHelper;
import com.abbott.project37375.main.LibrelinkConstants;
import com.experitest.client.Client;

public class NoteHelper extends BaseHelper {

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to verify Notes in Logbook list page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param time
	 *            time of note created
	 * @param attributesCnt
	 * 				no of attributes tagged to the note
	 */

	public void verifyNotesInLogBookList(Client client, String time, String attributesCnt){
		time=setAMPM(client,time);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Note']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"
				+ time + "']", 0);
		if (!(attributesCnt.contains("0"))) {
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='badge' and @text ='" + attributesCnt
					+ "']", 0);
		}
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Unselect Note Attribute
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * 
	 * @param attribute
	 *          set the Attribute
	 * 
	 */

	public void unSelectNoteAttribute(Client client, String attribute) {

		if(!client.isElementFound("NATIVE", "xpath=//*[contains(@id,'"+attribute+"') and @knownSuperClass='android.widget.CheckBox' and @checked='true']", 0)){
			client.click(
					"NATIVE",
					"xpath=//*[contains(@id,'"+attribute+"') and @knownSuperClass='android.widget.CheckBox']", 0, 1);
			waitFor(client, 1);
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method for Select And Verify Note Attribute

	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param attribute
	 * 			sending attribute name
	 * 
	 * @param verify 
	 *            true or False
	 */

	public void selectAndVerifyNoteAttribute(Client client, String attribute,
			boolean verify) {
		selectNoteAttribute(client, attribute);
		if (verify) {
			if (attribute.equalsIgnoreCase("food")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@text='Meal']", 0);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='spinner_food_type']", 0);
			} else if (attribute.equalsIgnoreCase("exercise")) {
				scrollToBottomAddNotePage(client);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@text='Select Intensity']", 0);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='spinner_exercise_intensity']", 0);

			} else if (attribute.equalsIgnoreCase("fast_insulin")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='rapidInsulinField']", 0);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@text='units' and ./parent::*[@id='rapidInsulinGroup']]", 0);

			} else if (attribute.equalsIgnoreCase("slow_insulin")) {
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='slowInsulinField']", 0);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@text='units' and ./parent::*[@id='slowInsulinGroup']]", 0);
			}

		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify Food Attribute Content
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * 
	 * 
	 */

	public void verifyFoodAttributeContent(Client client) {
		client.click("NATIVE","xpath=//*[@id='spinner_food_type']",0, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Breakfast' and ./parent::*[@class='android.widget.ListPopupWindow$DropDownListView']]", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Lunch' and ./parent::*[@class='android.widget.ListPopupWindow$DropDownListView']]", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Dinner' and ./parent::*[@class='android.widget.ListPopupWindow$DropDownListView']]", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Snack' and ./parent::*[@class='android.widget.ListPopupWindow$DropDownListView']]", 0);
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify the Food Error
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param units
	 *        sending units(grams/servings(portions))
	 */
	public void verifyFoodError(Client client, String units) {
		if (units.equalsIgnoreCase("grams")) {
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='etext_food_carbs' and @error='Value should be a whole number between 0 and 400']",
					0);
		} else {
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='etext_food_carbs' and @error='Value should be a multiple of 0.5 and between 0 and 40']",
					0);		
		}
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='Done'and @enabled='false']", 0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify the Insulin Error
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *
	 */
	public void verifyInsulinError(Client client) {
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@error='Value should be a multiple of 0.1 and between 0.1 and 200']",
				0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='Done'and @enabled='false']", 0);
	}


	/**
	 * Author: Amaresh
	 * 
	 * Method to Set and get the Carbohydrate units
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * @param carbUnit
	 *            set the carbUnits
	 */
	public void setAndGetCarbUnit(Client client, String carbUnit) {
		clickOnSettingsMenu(client, " App Settings");
		client.waitForElement("NATIVE",
				"xpath=//*[@text='Carbohydrate Units']", 0, 10000);
		client.click("NATIVE", "xpath=//*[@text='Carbohydrate Units']", 0, 1);
		client.waitForElement("NATIVE",
				"xpath=//*[@text='grams']", 0, 10000);
		client.click("NATIVE", "text=${"+carbUnit+"}", 0, 1);
		
		client.click("NATIVE", "xpath=//*[@text='Save']", 0, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+getLangPropValue(carbUnit)+"' and @checked='true']", 0);
		waitFor(client,1);
		
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify No Attribute in LogBook Detail Page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param attribute
	 *            set the attribute type
	 */
	public void verifyNoAttributeInLogBookDetailPage(Client client, String attribute) {
		client.verifyElementNotFound("NATIVE", "xpath=//*[@text='" + attribute+ "]", 0);

	}

	
	/**
	 * Author: Amaresh
	 * 
	 * Method to Verify Required Date Is Displayed
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation 
	 *          
	 * @param currentDate
	 *            check current date
	 *            
	 * @param minusDays
	 *             add days for required date  
	 *                 
	 * @throws ParseException
	 * 			throws Parse Exception for date selection
	 */
	public void verifyRequiredDateIsDisplayed(Client client, Date currentDate,
			int minusDays) throws ParseException {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, -minusDays);
		verifyPickedDateIsDisplayed(client, calendar.getTime());
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Click On Calendar Right Button
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param count
	 *         click no of times as count
	 */
	public void clickCalanderRightButton(Client client, int count) {
		for (int click = 0; click < count; click++) {
			client.click("NATIVE", "id=forwardButton", 0, 1);
			waitFor(client,1);

		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Click On Calendar Left Button
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param count
	 *        click no of times as count
	 */
	public void clickCalanderLeftButton(Client client, int count) {
		for (int click = 0; click < count; click++) {
			client.click("NATIVE", "id=backButton", 0, 1);
			waitFor(client,1);
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify Insulin Note in LogBook Detail Page 
	 * 
	 * @param client
	 *           Itegrate SeeTestAutomation
	 * @param insulinType
	 *            set the insulin type
	 * @param insulinUnit
	 *            set the insulin Units
	 */

	public void verifyInsulinNotFound(Client client, String insulinType,
			String insulinUnit) {

		if (insulinUnit.equals("none")) {
			client.verifyElementNotFound("NATIVE", "xpath=//*[@text='"
					+ insulinType + "-Acting Insulin' and @top='true']", 0);
		} else {
			if ((insulinUnit.equals("1"))) {
				client.verifyElementNotFound("NATIVE", "xpath=//*[@text='"
						+ insulinType
						+ "-Acting Insulin (1 unit)' and @top='true']", 0);
			} else {
				client.verifyElementNotFound("NATIVE", "xpath=//*[@text='"
						+ insulinType + "-Acting Insulin (" + insulinUnit
						+ " units)' and @top='true']", 0);

			}
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify AddNotePage Date and Time
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param datefromLogbook
	 *        set the date from logbook calendar
	 *        
	 * @param time
	 *        set the time
	 *        
	 * @throws ParseException 
	 * 			throws Parse Exception for date selection
	 */
	public void verifyAddNotePageDateTime(Client client, String datefromLogbook, String time) throws ParseException {
		if(getCountryCode().equalsIgnoreCase("United Kingdom")){
			time=time.toLowerCase();
		}	
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + time
				+ "']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + datefromLogbook
				+ "']", 0);

	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify Exercise Content
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * 
	 */

	public void verifyExerciseContents(Client client) {
		selectNoteAttribute(client, "exercise");
		if (client.waitForElement("NATIVE",
				"xpath=//*[@id='cbox_exercise_note' and @checked='true']", 0,
				10000)) {
			client.click("NATIVE", "xpath=//*[@id='spinner_exercise_intensity']",
					0, 1);
			waitFor(client,1);
			client.verifyElementFound("NATIVE", "text=Select Intensity", 0);
			client.verifyElementFound("NATIVE", "text=Low Intensity", 0);
			client.verifyElementFound("NATIVE", "text=Medium Intensity", 0);
			client.verifyElementFound("NATIVE", "text=High Intensity", 0);
		}

	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Edit Note details from pop up
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param time
	 *        click on note time
	 */
	public void editNoteFromPopUp(Client client,String time) {
		if(getCountryCode().equalsIgnoreCase("United Kingdom")){
			time=time.toLowerCase();
		}
		client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='balloon_scroll']", "Down", 0, 2000, "NATIVE", "xpath=//*[@id='noteButton' and ./preceding-sibling::*[./*[@text='"+time+"']]]", 0, 1000, 2, false);	 
		client.click("NATIVE", "xpath=//*[@id='noteButton' and ./preceding-sibling::*[./*[@text='"+time+"']]]", 0, 1);
		waitFor(client,1);
		client.waitForElement("NATIVE",
				"xpath=//*[@text='Edit Note']", 0, 2000);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='Edit Note']", 0);

	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Edit Note details from Logbook detail screen
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void editNotefromLogBookDetail(Client client) {
		client.click("NATIVE", "xpath=//*[@id='lbdetail_note_btn']", 0, 1);
		waitFor(client,1);
		client.waitForElement("NATIVE",
				"xpath=//*[@text='Edit Note']", 0, 2000);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='Edit Note']", 0);

	}


	/**
	 * Author: ShabinaSherif
	 * 
	 *   Method to  Enter Notes Comments
	 *   
	 * @param client
	 *          Integrate SeeTestAutomation 
	 *           
	 * @param notesComments
	 *            set the comments
	 */
	public void enterNotesComments(Client client, String notesComments) {
		client.elementSendText("NATIVE",
				"xpath=//*[@id='etext_note_comments']", 0, notesComments);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to  Verify Notes Comments
	 *  
	 * @param client
	 *          Integrate SeeTestAutomation  
	 *          
	 * @param notesComments
	 *            verify the notes comments
	 */
	public void verifyNotesComments(Client client, String notesComments) {
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='lbdetail_note_description' and contains(@text,'"
						+ notesComments + "')]", 0);

	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify Exercise Intensity in LogBook Detail Page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param intensity
	 *            set intensity

	 */
	public void verifyExerciseIntensityRemovedInLogBookDetailPage(Client client,
			String intensity) {
		client.verifyElementNotFound("NATIVE",
				"xpath=//*[@id='lbdetail_note_description' and contains(@text,'Exercise "
						+ intensity + " Intensity')]", 0);
	}	

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Pick and verify the previous date in calendar 
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param currentDate
	 *            check current date
	 *            
	 *  @param count  
	 *          set count of previous days         
	 * @throws ParseException
	 * 			throws Parse Exception for date selection
	 */
	public void pickAndVerifyPreviousDateIsDisplayed(Client client,
			Date currentDate, int count) throws ParseException {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, -count);
		pickDate(client, calendar.getTime());
		verifyPickedDateIsDisplayed(client, calendar.getTime());
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to  Click Blood Drop Icon
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickBloodDropIcon(Client client) {
		client.click("NATIVE",
				"xpath=//*[@id='logbook_bg_btn']", 0, 1);
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Open BGR Time Picker
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 *
	 */
	public void openBGRTimePicker(Client client) {
		if(!client.isElementFound("NATIVE", "xpath=//*[@class='LibreLink.BGRDateTimePickerCell' and @onScreen='true']", 0)){
			client.click("NATIVE", "text=Edit Time", 0, 1);
		} 
		waitFor(client, 1);
	}
	
	/**
	 * Author: Amaresh
	 * 
	 *   Method to Verify selected Blood Glucose Result time
	 *   
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 * @param date
	 *            select the date
	 * @param logBookHour
	 *            select the hour
	 *            
	 * @param logBookMin
	 *            select the min
	 *            
	 * @param logBookAmPm
	 *            select the am/pm
	 */
	//TODO
	public void verifyselectedBGRTime(Client client, String date, int logBookHour,
			int logBookMin, String logBookAmPm) {
		openBGRTimePicker(client);
		String hour, mins;
		int logBookHours;
		String time = date + " " + logBookHour + "." + logBookMin + "";
		if (logBookAmPm != null) {

			if (logBookAmPm.equalsIgnoreCase("PM")&&logBookHour!=12){
				logBookHours=12+logBookHour;
			}else if(logBookAmPm.equalsIgnoreCase("AM")&&logBookHour==12){
				logBookHours=0;
			}
			else{
				logBookHours=logBookHour;
			}
			time = date + " " + logBookHours + "." + logBookMin + "";
		}
		client.elementSetProperty("NATIVE", "xpath=//*[@class='UIDatePicker']",
				0, "datetime", time);
		if (logBookHour<=9){
			hour= "0"+String.valueOf(logBookHour);}
		else{
			hour= String.valueOf(logBookHour);
		}
		if (logBookMin<=9 ){
			mins="0"+String.valueOf(logBookMin);}
		else{
			mins=String.valueOf(logBookMin);
		}

		String settime = hour + ":" + mins + "";
		if (logBookAmPm != null) {
			settime = logBookHour + ":" + mins + " "+ logBookAmPm;
		}
		String appSetTime = client.elementGetText("NATIVE", "xpath=//*[@placeholder='Edit Time' and @top='true']", 0);
		Assert.assertEquals(settime, appSetTime);

	}


	/**
	 * Author: ShabinaSherif
	 * 
	 *   Method to Set the blood glucose result in MGDL
	 *   
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param value
	 *            select the value
	 */
	public void setBGR(Client client, String value) {
		client.verifyElementFound("NATIVE", "id=manualbg_number", 0);
		client.elementSendText("NATIVE", "id=manualbg_number", 0, value);
		client.closeKeyboard();
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Verify Blood Glucose Result Page
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 */
	//TODO use this method somewhere
	public void verifyBloodGlucoseResultPage(Client client) {
		client.verifyElementFound("NATIVE", "text=Blood Glucose Result", 0);
		client.verifyElementFound("NATIVE",
				"text=Enter the result from your blood glucose test.", 0);
		client.verifyElementFound("NATIVE", "id=manualbg_number", 0);
		client.verifyElementFound("NATIVE", "text=" + getUnits(), 0);
		client.verifyElementFound("NATIVE", "text=Done", 0);
		client.verifyElementFound("NATIVE", "text=Cancel", 0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Verify Logbook Blood Glucose Result
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param logBookTime
	 *            set the time
	 *            
	 * @param value
	 *        set the scan value
	 */
	//TODO need to verify timezone
	public void verifyLogBookBGR(Client client, String value, String logBookTime) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+value+"' and ./following-sibling::*[@text='"+getUnits()+"']]",
				0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_list_item' and ./descendant::*[@text='"+value+"'] and ./descendant::*[@text='"+logBookTime+"']]",
				0);
		client.verifyIn("NATIVE", "xpath=//*[@text='"+value+"']", 0, "Left", "NATIVE", "xpath=//*[@id='logbook_item_glucose_state' and @backColor='0x757575']", 0, 0);

		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_note' and contains(@contentDescription,'No Icon')]", 0);
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Verify BG error
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 */
	public void verifyBGError(Client client) {
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@error='Value should be a whole number between 20 and 500']",
				0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Verify number of Blood Glucose values
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 * @param value 
	 *        Set the value
	 *
	 * @param time  
	 *        Set the Time
	 *
	 *@param count 
	 *      set count
	 */
	public void verifyNoOfBGValue(Client client, String value, String time ,int count) {
		int BGcount = client.getElementCount("NATIVE", "xpath=//*[@id='logbook_list_item' and ./descendant::*[@text='"+value+"'] and ./descendant::*[@text='"+time+"']]");
		Assert.assertEquals(count,BGcount);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Close Edit Note Popup
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void closeEditNotePopUp(Client client) {
		if(client.isElementFound("NATIVE", "xpath=//*[@id='balloon_scroll' and @hidden='false']", 0)){
			client.click("NATIVE", "id=glucose_line_chart", 0, 1);
			waitFor(client,1);
		}
	}
	
	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify Logbook Page details
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 */

	public void verifyLogbookPageContents(Client client) {
		client.waitForElement("NATIVE", "xpath=//*[@text='Logbook']", 0, 10000);          
		client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView' and ./parent::*[@id='logbook_datebar']]", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@contentDescription='More options']", 0); 
		client.verifyElementFound("NATIVE", "xpath=//*[@contentDescription='Navigate up']", 0); 
		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_note_btn' and @contentDescription='Add Note']", 0); 
		if (getCountryCode().equalsIgnoreCase("United States")) {
			client.verifyElementFound("NATIVE", "id=logbook_bg_btn", 0);
		}
		else{
			client.verifyElementNotFound("NATIVE", "xpath=//*[@id='logbook_bg_btn' and @hidden='false']", 0);
		}
	}
	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to  Verify LogBook from menu option
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *  @param click  
	 *          click if true(true/false)        
	 */
	public void verifyLogBookMenu(Client client, boolean click) {
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='design_menu_item_text' and @text='Logbook' and @textColor='0x138BE8']",
				0);
		if(click)
			client.click(
					"NATIVE",
					"xpath=//*[@id='design_menu_item_text' and @text='Logbook' and @textColor='0x138BE8']",
					0, 1);
		waitFor(client, 1);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *   Method to Verify added Note
	 *   
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param time
	 *        verify added note by using created Time      
	 */
	//TODO need to verify time zone
	public void verifyaddedNote(Client client, String time) {		
		if(getCountryCode().equalsIgnoreCase("United Kingdom")){
			time=time.toLowerCase();
		}
		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbookItemText' and @text='Note' and @hidden='false']",
				0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_list_item' and ./descendant::*[@text='Note'] and ./descendant::*[@text='"+time+"']]",
				0);
		client.verifyIn("NATIVE", "xpath=//*[@text='Note']", 0, "Left", "NATIVE", "xpath=//*[@id='logbook_item_glucose_state' and @backColor='0x757575']", 0, 0);

		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_note']", 0);
	}
	
	/**
	 * Author: ShabinaSherif
	 * 
	 *   Method to  Verify LogBook is Empty
	 *   
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 */
	public void verifyLogBookEmpty(Client client) {
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='No entries exist for this date.']", 0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Verify number of Scan results
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 *@param count 
	 *        set count of scan results
	 */
	public void verifyNoOfScanResult(Client client, int count) {
		int scancount = client.getElementCount("NATIVE", "xpath=//*[@id='logbook_item_glucose_trend' and not(contains(@contentDescription,'-1'))]");
		Assert.assertEquals(count,scancount);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Verify Glucose details in Logbook Details page
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param value
	 *        set the value
	 *        
	 * @param trend
	 *          set the trend 
	 *            
	 * @param datefromLogbook
	 *          set the datefromLogbook 
	 *          
	 * @param time
	 *         set the time 
	 *         
	 * @param color
	 *          set the color 
	 *          
	 * @throws ParseException 
	 * 			Throws parse exception on setting date
	 * 		
	 */
	public void verifyLogbookDetail(Client client, String value, String trend, String datefromLogbook, String time, String color) throws ParseException {
		client.verifyElementFound("NATIVE", "text=Logbook Detail", 0);
		value=value.replace(" ", "");
		if (!(value.equals("HI") || value.equals("LO"))) {

			if(getUnits().contains("mg")){
				client.verifyElementFound("NATIVE", "text="+value, 0);
			}else{
				float newValue = Float.parseFloat(value);
				newValue=(newValue/18);
				DecimalFormat df = new DecimalFormat("#.#");
				double value1=Double.parseDouble(df.format(newValue));
				client.verifyElementFound("NATIVE", "text="+value1, 0);
			}
		}else{
			client.verifyElementFound("NATIVE", "xpath=//*[contains(@text,'"+value+"')]", 0);
		}
		if(trend!=null){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_glucose_trend' and contains(@contentDescription,'"+trend+"')]", 0);
		}
		client.verifyElementFound("NATIVE", "xpath=//*[@id='scanResultTime' and @text='"+time+"']", 0);
		client.verifyElementFound("NATIVE", "text="+getUnits(), 0);	
		SimpleDateFormat deviceFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date d = deviceFormat.parse(datefromLogbook);
		if (getCountryCode().contains("United States")) {
			deviceFormat.applyPattern("EEE, d MMM");
		}else{
			deviceFormat.applyPattern("EEE d MMM");
		}
		String datenewFormat = deviceFormat.format(d);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='scanResultDate' and @text='"+datenewFormat +"']", 0);
		verifyColor(client,color,time,"logbookdetail");

	}

	/**
	 * Author: ShabinaSherif
	 * 
	 *  Method to Verify Glucose details in Logbook List
	 *  
	 *@param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param value
	 *        set the value
	 *        
	 * @param trend
	 *          set the trend   
	 *          
	 * @param time
	 *         set the time 
	 *         
	 * @param color
	 *          set the color 
	 *          
	 * @throws ParseException 
	 * 		Throws parse exception on setting date
	 */
	public void verifyLogbookListForGlucoseValues(Client client, String value, String trend, String time, String color) throws ParseException {
		client.verifyElementFound("NATIVE", "text=Logbook", 0);
		if(getCountryCode().equals("United Kingdom")){
			time=time.toLowerCase();
		}
		System.out.println("=getTimeZoneValue(LibrelinkConstants.US)="+getTimeZoneValue(LibrelinkConstants.US));
		client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='logbook_list']", "down", 0, 500, "NATIVE", "text="+time, 0, 2000, 2, false);
		
		if(trend!=null){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_item_glucose_trend' and contains(@contentDescription,'Falling') and ./following-sibling::*[@class='android.widget.LinearLayout' and ./descendant::*[@text='"+time+"']]]", 0);
		}
		if(!(value.equalsIgnoreCase("LO")||value.equalsIgnoreCase("HI"))){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='units' and @text='"+getUnits()+"' and ../parent::*[@id='logbook_item_glucose_trend' and ./following-sibling::*[@class='android.widget.LinearLayout' and ./descendant::*[@text='"+time+"']]]]", 0);
			if(getUnits().contains("mg")){
				client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityLabel='"+value+"' and ./parent::*[@class='UIView' and ./preceding-sibling::*[@text='"+time+"']]]", 0);
			}else{
				float newValue = Float.parseFloat(value);
				newValue=(newValue/18);
				DecimalFormat df = new DecimalFormat("#.#");
				double value1=Double.parseDouble(df.format(newValue));
				client.verifyElementFound("NATIVE", "xpath=//*[@id='value' and @text='"+value1+"' and ../parent::*[@id='logbook_item_glucose_trend' and ./following-sibling::*[@class='android.widget.LinearLayout' and ./descendant::*[@text='"+time+"']]]]", 0);
			}
		}else{
			client.verifyElementFound("NATIVE", "xpath=//*[@id='value' and @text='"+value+"' and ../parent::*[@id='logbook_item_glucose_trend' and ./following-sibling::*[@class='android.widget.LinearLayout' and ./descendant::*[@text='"+time+"']]]]", 0);
		}
		if(trend!=null){
			verifyColor(client,color,time,"logbooklist");
		}
	}	


	public void verifyColor(Client client, String colorCode, String time, String pageName){
		if(pageName.contains("list")){
			if(colorCode.contains("orange")){
				client.verifyElementFound("NATIVE", "xpath=//*[@class='android.widget.LinearLayout' and ./child::*[@text='"+time+"'] and ./preceding-sibling::*[@id='logbook_item_glucose_state' and @backColor='0xEF6C00']]", 0);
			}else if(colorCode.contains("green")){
				client.verifyElementFound("NATIVE", "xpath=//*[@class='android.widget.LinearLayout' and ./child::*[@text='"+time+"'] and ./preceding-sibling::*[@id='logbook_item_glucose_state' and @backColor='0x8FCB3A']]", 0);
			}else if(colorCode.contains("yellow")){
				client.verifyElementFound("NATIVE", "xpath=//*[@class='android.widget.LinearLayout' and ./child::*[@text='"+time+"'] and ./preceding-sibling::*[@id='logbook_item_glucose_state' and @backColor='0xFFBC00']]", 0);
			}else if(colorCode.contains("red")){
				client.verifyElementFound("NATIVE", "xpath=//*[@class='android.widget.LinearLayout' and ./child::*[@text='"+time+"'] and ./preceding-sibling::*[@id='logbook_item_glucose_state' and @backColor='0xED1C24']]", 0);
			}
		}else{
			if(colorCode.contains("orange")){
				client.verifyElementFound("NATIVE", "xpath=//*[@id='scanResultState' and @backColor='0xEF6C00' and ./descendant::*[@text='"+time+"']]", 0);
			}else if(colorCode.contains("green")){
				client.verifyElementFound("NATIVE", "xpath=//*[@id='scanResultState' and @backColor='0x8FCB3A' and ./descendant::*[@text='"+time+"']]", 0);
			}else if(colorCode.contains("yellow")){
				client.verifyElementFound("NATIVE", "xpath=//*[@id='scanResultState' and @backColor='0xFFBC00' and ./descendant::*[@text='"+time+"']]", 0);
			}else if(colorCode.contains("red")){
				client.verifyElementFound("NATIVE", "xpath=//*[@id='scanResultState' and @backColor='0xED1C24' and ./descendant::*[@text='"+time+"']]", 0);
			}
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify added scan notes
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param value
	 *            set the value
	 */
	public void verifyAddedScanOrNote(Client client, String value) {
		if(!(value.equalsIgnoreCase("LO")||value.equalsIgnoreCase("HI")||value.contains("Note"))){
			client.verifyElementFound("NATIVE", "xpath=//*[@text='"+getUnits()+"']", 0);
			if(getUnits().contains("mg")){
				client.verifyElementFound("NATIVE", "xpath=//*[@text='"+value+"']", 0);
			}else {
				float newValue = Float.parseFloat(value);
				newValue=(newValue/18);
				System.out.println("====="+newValue);
				DecimalFormat df = new DecimalFormat("#.#");
				double value1=Double.parseDouble(df.format(newValue));
				System.out.println("====="+value1);
				client.verifyElementFound("NATIVE", "xpath=//*[@text='"+value1+"']", 0);
			}
		}else{
			client.verifyElementFound("NATIVE", "xpath=//*[@text='"+value+"']", 0);
		}
	}

	/**
	 * Author: ShabinaSherif
	 *
	 * Method to Click calendar cancel button
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 */
	public void clickCalendarCancelButton(Client client) {
		client.deviceAction("Back");
		waitFor(client, 1);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Pick and verify the previous date in calendar 
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param currentDate
	 *            check current date
	 *            
	 * @param count
	 *        number of days(count)  
	 *                 
	 * @throws ParseException
	 * 			Throws parse exception on setting date
	 */
	public void verifyRequiredPreviousDateIsDisplayed(Client client,
			Date currentDate, int count) throws ParseException {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, -count);
		verifyDate(client, calendar.getTime());
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Method to Verify Date
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 * @param date
	 *            check current date
	 *            
	 * @throws ParseException
	 * 			Throws parse exception on setting date
	 */
	//TODO - need a better strategy
	public void verifyDate(Client client, Date date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");

		String monthTitle = dateFormat.format(date);
		System.out.println("monthTitle" + monthTitle);

		String appCalendarDate = client
				.elementGetText(
						"NATIVE",
						"xpath=//*[@class='LibreLink.RegularLabel' and @textColor='0xFFFFFF' and @onScreen='true']",
						0);
		DateFormat appFormat;
		String direction = "up";
		if (!getLanguage().contains("U.K.")) {
			appFormat = new SimpleDateFormat("MMMMM d, yyyy");

			if (appFormat.parse(appCalendarDate).before(date)) {

				direction = "down";
			}
		} else {
			appFormat = new SimpleDateFormat("d MMMMM yyyy");

			if (appFormat.parse(appCalendarDate).before(date)) {

				direction = "down";
			}
		}
		if (!client
				.isElementFound(
						"NATIVE",
						"xpath=//*[@text='"
								+ monthTitle
								+ "' and @class='LibreLink.BoldLabel' and @onScreen='true']",
								0)) {
			client.elementSwipeWhileNotFound(
					"NATIVE",
					"xpath=//*[@class='UICollectionView']",
					direction,
					300,
					1000,
					"NATIVE",
					"xpath=//*[@text='"
							+ monthTitle
							+ "' and @class='LibreLink.BoldLabel' and @onScreen='true']",
							0, 0, 25, false);
		}
		client.sleep(500);
		int titlePosition = getTextPosition(client, monthTitle, 0);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.add(Calendar.DATE, -1);		
		int oneDayBefore = calendar.get(Calendar.DATE);
		int dateCount = 0;
		if (client.isElementFound("NATIVE", "xpath=//*[@text='" + dayOfMonth
				+ "']")) {
			dateCount = client.getElementCount("NATIVE", "xpath=//*[@text='"
					+ dayOfMonth + "']");
		}
		for (int eleIndex = 0; eleIndex < dateCount; eleIndex++) {
			if (getTextPosition(client, String.valueOf(dayOfMonth), eleIndex) > titlePosition) {

				if (client.isElementFound("NATIVE", "xpath=//*[@text='"
						+ dayOfMonth + "' and @textColor='0x138BE8']", 0)) {

					client.verifyElementFound("NATIVE", "xpath=//*[@text='"
							+ dayOfMonth + "' and @textColor='0x138BE8']",
							eleIndex);
				} else {
					client.verifyElementFound("NATIVE", "xpath=//*[@text='"
							+ dayOfMonth + "' and @textColor='0x000000']",
							eleIndex);
				}
				client.verifyElementFound("NATIVE", "xpath=//*[@text='"
						+ oneDayBefore + "' and @textColor='0xAAAAAA']",
						0);
				break;
			}
		}
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Get the Y axis position of selected day
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param text
	 *            select text
	 *            
	 * @param index
	 *            set the Index
	 *  @return x
	 *  	return the text position
	 */
	//TODO do we need this
	public int getTextPosition(Client client, String text, int index) {
		int y = -1;
		try {
			if (client.isElementFound("NATIVE", "xpath=//*[@text='" + text
					+ "']")) {
				y = Integer.valueOf(client.elementGetProperty("NATIVE",
						"xpath=//*[@text='" + text + "']", index, "y"));
			}
		} catch (NumberFormatException nfe) {

		}
		return y;
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Method to Verify Date and Time in Logbook Detail page
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param date
	 *            Check the date
	 *            
	 * @param scantime
	 *        check the Scantime
	 */
	//TODO Same as addedNotePageDateandTime
	public void verifyLogbookDetailDateTime(Client client, String scantime,
			String date) {
		client.waitForElement("NATIVE", "text=Logbook Detail", 0, 10000);
		client.verifyElementFound("NATIVE", "text=" + scantime, 0);
		client.verifyElementFound("NATIVE", "text=" + date, 0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify Required Date Is Displayed
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param currentDate
	 *            check current date
	 *            
	 *  @param count 
	 *         set the count of days  
	 *                
	 * @throws ParseException
	 * 			Throws parse exception on setting date
	 */
	public void VerifyRequiredDateIsDisplayed(Client client, Date currentDate,
			int count) throws ParseException {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, -count);
		verifyPickedDateIsDisplayed(client, calendar.getTime());
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Method to Verify the Leap year
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 * @param year
	 *        set the year
	 *        
	 * @throws ParseException
	 * 			Throws parse exception on setting date
	 */
	//TODO
	public void verifyLeapYear(Client client, int year) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -32);
		String monthTitle = dateFormat.format(calendar.getTime());
		String direction = "up";
		client.elementSwipeWhileNotFound("NATIVE",
				"xpath=//*[@class='UICollectionView']", direction, 300, 400,
				"TEXT", monthTitle, 0, 100, 100, true);
		int titlePosition = getTextPosition(client, monthTitle, 0);
		calendar.setTime(calendar.getTime());
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dateCount = 0;

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");

		else {
			System.out.println("Year " + year + " is a not leap year");
		}
		if (client.isElementFound("NATIVE", "xpath=//*[@text='" + dayOfMonth
				+ "']")) {
			dateCount = client.getElementCount("NATIVE", "xpath=//*[@text='"
					+ dayOfMonth + "']");
		}
		for (int eleIndex = 0; eleIndex < dateCount; eleIndex++) {
			if (getTextPosition(client, String.valueOf(dayOfMonth), eleIndex) > titlePosition) {
				client.verifyElementFound("NATIVE", "xpath=//*[@text='"
						+ dayOfMonth + "' and @textColor='0x138BE8']", eleIndex);

				break;
			}
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify LogBook displays current date 
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param systemDateTime
	 *         set systemDateTime
	 * @throws ParseException
	 * 		Throws parse exception on setting date
	 */
	public void verifyLogBookDisplaysStaticDate(Client client,
			String systemDateTime) throws ParseException {

		String appDate = client.elementGetText("NATIVE",
				"xpath=//*[@id='logbook_date_text' and @textColor='0xFFFFFF']", 0);
		Assert.assertEquals(appDate, systemDateTime);
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Method to Verify Calendar Date Difference
	 * 
	 * @param client
	 *            verify Leap Date Is Displayed
	 *            
	 * @param year
	 *            check date
	 *            
	 * @throws ParseException
	 * 			Throws parse exception on setting date
	 */
	//TODO
	public void verifyCalenderDateDifference(Client client, int year)
			throws ParseException {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -89);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='1' and @textColor='0xFFFFFF']", 0);
		verifyDate(client, calendar.getTime());

	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Method to Verify Data With Bold Letters
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	//TODO this method logic is incorrect
	public void verifyDataWithBoldLetters(Client client) {
		client.elementSwipeWhileNotFound(
				"NATIVE",
				"xpath=//*[@class='UICollectionView']",
				"Down",
				300,
				400,
				"NATIVE",
				"xpath=//*[@class='LibreLink.RegularLabel' and @textColor='0xFFFFFF' and @backgroundColor='0x000000']",
				0, 100, 100, false);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@class='LibreLink.RegularLabel' and @textColor='0xFFFFFF' and @backgroundColor='0x000000']",
				0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Click And Verify Glucose Graph
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param glucoseValue
	 *        set glucoseValue
	 */
	public void clickAndVerifyGlucoseGraph(Client client, String glucoseValue) {
		client.click("NATIVE", "xpath=//*[@id='value' and @text='"+glucoseValue+"']",
				0, 1);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='units' and @text='"+getUnits()+"']",
				0);
		client.waitForElement("NATIVE", "text=Logbook Detail", 0, 10000);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@id='value' and @text='"+glucoseValue+"']",
						0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='glucose_line_chart' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@class='com.librelink.app.ui.widget.mpchart.datadecorators.GlucoseDecorator' and contains(@contentDescription,'"+glucoseValue+"')]", 0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Select Date Without Bold Letter
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param date
	 *        set the date
	 */
	public void selectDateWithoutBoldLetter(Client client, String date) {
		client.click("NATIVE", "xpath=//*[@text='" + date
				+ "' and @textColor='0x757575']", 0, 1);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Add static Scan Data and time for real or Historic with Static time
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param type 
	 *        set the type(Historic/Realtime)
	 *        
	 * @param minutes
	 *            Select minutes
	 *            
	 * @param date           
	 *         set the date
	 *         
	 * @param value
	 *            set the value
	 *            
	 * @param hours
	 *            Select Hour
	 *            
	 * @param isTimeReqd
	 *         true/false
	 * 
	 * */

	public void addScanDataWithStaticDateAndTime(Client client, String type, String value,String date, boolean isTimeReqd, 
			int hours, int minutes) {
		clickAddSensorDataMethod(client);
		client.click("NATIVE", "text=" + type, 0, 1);
		enterBGValue(client, value);
		if(isTimeReqd){
			try {
				enterStaticTime(client, hours, minutes);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(date!=null){
			enterStaticDate(client,date);
		}
		clickAddScannedValue(client);
	}


	public void enterStaticDate(Client client,String scandate) {
		/*DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Calendar cal = Calendar.getInstance();
		String scanDate = client.elementGetText("NATIVE",
				"xpath=//*[@class='UIButtonLabel' and contains(@text,'-')]", 0);
		String[] date = scandate.split("-");
		int a = Integer.parseInt(date[0]);
		int b = Integer.parseInt(date[1]);
		int c = Integer.parseInt(date[2]);
		cal.set(Calendar.YEAR, a);
		cal.set(Calendar.MONTH, b-1);
		cal.set(Calendar.DATE, c);
		String dateTime = dateFormat.format(cal.getTime());
		String inputActivationDate = dateTime.replace("/", "-");
		String Date = inputActivationDate.substring(0, 10);
		String time = inputActivationDate.substring(11, 16);
		System.out.println(Date);
		String inputDate[] = Date.split("-");
		System.out.println(time);
		if(!scanDate.contains(scandate)){
			client.click("NATIVE", "xpath=//*[@accessibilityLabel='"+scanDate+"' and @class='UIButton']", 0, 1);
			client.waitForElement("NATIVE", "text=Select Scan Date:", 0, 5000);
			client.elementSetProperty("NATIVE",
					"xpath=//*[@class='UIDatePicker' and @hidden='false']", 0,
					"date", inputDate[2] + "." + inputDate[1] + "." + inputDate[0]);
			waitFor(client, 2);
			client.click("NATIVE", "accessibilityLabel=OK", 0, 1);
			client.verifyElementFound("NATIVE", "text="+Date, 0);

		}*/
		client.elementSendText("NATIVE", "id=debug_sensor_scan_date", 0, ""
				+ scandate);
		waitFor(client,1);
		
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Verify TrashIcon
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation 
	 * @param click
	 * 			true/false
	 */

	public void verifyAndClickTrashIcon(Client client,boolean click) {
		client.waitForElement("NATIVE", "id=note_discard", 0, 5000);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Delete']", 0);
		waitFor(client, 1);
		if(click){
			client.click("NATIVE", "xpath=//*[@text='Delete']", 0, 1);	
			waitFor(client,1);
		}
	}	

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to verify Note Not Found in Logbook list
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation 
	 * @param time 
	 *        Set the time for verification
	 */

	public void verifyElementNotFoundInLogbookList(Client client,String time) {
		if(getCountryCode().contains("United Kingdom")){
			System.out.println("=====");
			time=time.toLowerCase();
		}
		client.waitForElement("NATIVE", "xpath=//*[@text='Logbook']", 0, 5000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='logbook_list_item' and ./descendant::*[@text='Note'] and ./descendant::*[@text='"+time+"']]",
				0);
	}	

	
}
