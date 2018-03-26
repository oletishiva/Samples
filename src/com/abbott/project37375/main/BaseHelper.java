package com.abbott.project37375.main;

import static java.time.temporal.ChronoUnit.DAYS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import jxl.read.biff.BiffException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.experitest.client.Client;

public class BaseHelper {

	private int port;
	private String host;
	protected MyClient client = null;
	protected String usedDeviceName = null;
	protected Map<String, String> data = null;
	protected int dataIndex = 0;
	protected boolean didFail = false;
	protected Throwable exception = null;
	Date date = new Date();
	private String apkPackage;
	String testStartTimeStamp = null;
	private String deviceOSVer = null;
	private String email = null;

	private String stepID;
	private String language;
	private String countrycode;
	private String apkFileName;
	private String units;
	private String appversion;
	private String appudi;

	private String estimatedA1c;
	private String texttospeech;
	private String safety;
	private String naIcon;
	private String quickRef;
	private String quickStart;
	private String aboutInfo;
	private String languagefilename;
	private static String ValueFilpath;
	private static String FinalLocation;
	private static String ConvertedFilename="";
	private String defaulttimezone;
	private String countryOfExecution;
	private String defaultCOEtimezone;
	private String timezone;
	private String pstformat;
	private String mstformat;
	private String akdtformat;
	private String estformat;
	private String cstformat;
	private String apkActivity;
	private String reportLocation;

	public String getapkPackage() {
		return apkPackage;
	}

	public void setapkPackage(String ipaPackage) {
		this.apkPackage = ipaPackage;
	}

	public String getapkFileName() {
		return apkFileName;
	}

	public void setapkFileName(String ipaFileName) {
		this.apkFileName = ipaFileName;
	}

	public String getDeviceOSVer() {
		return deviceOSVer;
	}

	public void setDeviceOSVer(String deviceOSVer) {
		this.deviceOSVer = deviceOSVer;
	}
	public String getStepID() {
		return stepID;
	}

	public void setStepID(String stepID) {
		this.stepID = stepID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountryCode() {
		return countrycode;
	}

	public void setCountryCode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}
	public String getAppudi() {
		return appudi;
	}

	public void setAppudi(String appudi) {
		this.appudi = appudi;
	}

	public String getLanguageFileName() {
		return languagefilename;
	}

	public void setLanguageFileName(String languagefilename) {
		this.languagefilename = languagefilename;
	}

	public String getDefaultTimeZone() {
		return defaulttimezone;
	}

	public void setDefaultCOETimeZone(String defaultCOEtimezone) {
		this.defaultCOEtimezone = defaultCOEtimezone;
	}

	public String getDefaultCOETimeZone() {
		return defaultCOEtimezone;
	}

	public void setDefaultTimeZone(String defaulttimezone) {
		this.defaulttimezone = defaulttimezone;
	}

	public String getCountryofExecution() {
		return countryOfExecution;
	}

	public void setCountryofExecution(String countryOfExecution) {
		this.countryOfExecution = countryOfExecution;
	}

	public String getTimeZone() {
		return timezone;
	}

	public void setTimeZone(String timezone) {
		this.timezone = timezone;
	}

	public String getPstformat() {
		return pstformat;
	}

	public void setPstformat(String pstformat) {
		this.pstformat = pstformat;
	}

	public String getMstformat() {
		return mstformat;
	}

	public void setMstformat(String mstformat) {
		this.mstformat = mstformat;
	}

	public String getAkdtformat() {
		return akdtformat;
	}

	public void setAkdtformat(String akdtformat) {
		this.akdtformat = akdtformat;
	}

	public String getEstformat() {
		return estformat;
	}

	public void setEstformat(String estformat) {
		this.estformat = estformat;
	}

	public String getCstformat() {
		return cstformat;
	}

	public void setCstformat(String cstformat) {
		this.cstformat = cstformat;
	}

	public long diffInDays(LocalDate a, LocalDate b) {
		return DAYS.between(a, b);
	}

	public String getEstimatedA1c() {
		return estimatedA1c;
	}
	public void setEstimatedA1c(String estimatedA1c) {
		this.estimatedA1c = estimatedA1c;
	}
	public String getTextToSpeech() {
		return texttospeech;
	}
	public void setTextToSpeech(String texttospeech) {
		this.texttospeech = texttospeech;
	}

	public String getSafetyConfig() {
		return safety;
	}
	public void setSafetyConfig(String safety) {
		this.safety = safety;
	}

	public String getNAIconConfig() {
		return naIcon;
	}
	public void setNAIconConfig(String naIcon) {
		this.naIcon = naIcon;
	}

	public String getQuickRefConfig() {
		return quickRef;
	}
	public void setQuickRefConfig(String quickRef) {
		this.quickRef = quickRef;
	}

	public String getQuickStartConfig() {
		return quickStart;
	}
	public void setQuickStartConfig(String quickStart) {
		this.quickStart = quickStart;
	}

	public String getAboutInfo() {
		return aboutInfo;
	}
	public void setAboutInfo(String aboutInfo) {
		this.aboutInfo = aboutInfo;
	}

	public String getapkActivity() {
		return apkActivity;
	}

	public void setapkActivity(String apkActivity) {
		this.apkActivity = apkActivity;
	}

	public String getReportLocation() {
		return reportLocation;
	}
	public void setReportLocation(String reportLocation)
	{
		this.reportLocation = reportLocation;
	}
	
	public void setEmail() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		SimpleDateFormat sampledate = new SimpleDateFormat("HHmmMMddYY");
		String MMDDYY = sampledate.format(c.getTime());
		String Email = "auto" + MMDDYY + "@gmail.com";
		this.email = Email;
	}

	public String getEmail() {
		return email;
	}

	@Before
	public void setUp() throws Exception  {
		setValues();
		initClientAndDevice();	
		client.setShowReport(false);
		System.out.println(usedDeviceName);
		client.setDevice(usedDeviceName);
		client.openDevice();
		System.out.println("__________"+getTestName());

		String DeviceVer = client.getDeviceProperty("device.version");
		setDeviceOSVer(DeviceVer);
		if( !getTestName().contains("PreRequisite")){
			setInputLanguage(client,getLanguageFileName());
			launch(client);
			if((!getTestName().contains("ReleaseBuild"))){
				
				if(!client.isElementFound("NATIVE", "xpath=//*[@id='getStartedNow' and @onScreen='true']", 0)){
					clearData(client);
				}
				
				if( (!getTestName().contains("FirstTime")) && (!getTestName().contains("AccountSettings"))){
					byPassSetup(client);					
				}else{
					selectNetworkMode(client,"Use Real Servers");
				}
			}
			
		}else{
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
			automaticDateAndTime(client, true);
			automaticDateAndTimeZone(client, true);
		}
	}
	
	/**
	 * Author: Devi
	 * 
	 * To bypass the setup 
	 * 
	 * @param client
	 *            
	 * 
	 */
	public void byPassSetup(Client client) {
		
		openDebugDrawer(client);
		client.elementSwipeWhileNotFound("NATIVE", "id=debug_drawer", "Down",
				100, 2000, "NATIVE", "xpath=//*[@id='debug_overrides_skip_startup_wizard']", 14, 1000, 1,
				false);
		client.waitForElement("NATIVE", "xpath=//*[@id='debug_overrides_skip_startup_wizard']", 0, 3000);
		client.click("NATIVE", "xpath=//*[@id='debug_overrides_skip_startup_wizard']", 0, 1);
		waitFor(client, 10);
	}
	
	/**
	 * 
	 * Enable/disable application NetworkTimeCheck
	 * 
	 * @param client
	 *            
	 * @param on
	 *            true to on
	 */
	public void appNetworkTimeCheck(Client client, boolean on) {
		client.waitForElement("NATIVE", "id=toolbar_actionbar", 0, 2000);
		openDebugDrawer(client);
		if (on) {
			if (client
					.isElementFound(
							"NATIVE",
							"xpath=//*[@id='debug_overrides_network_time_check' and @checked='false']",
							0)) {
				client.click("NATIVE", "id=debug_overrides_network_time_check",
						0, 1);
				client.click("NATIVE",
						"xpath=//*[@id='button1' and @text='Yes']", 0, 1);
			}
		} else {
			if (client
					.isElementFound(
							"NATIVE",
							"xpath=//*[@id='debug_overrides_network_time_check' and @checked='true']",
							0)) {
				client.click("NATIVE", "id=debug_overrides_network_time_check",
						0, 1);
			}
		}
		closeDebugDrawer(client);
	}
	

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to select Real server network mode
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param networkMode
	 * 			set the network mode(USE REAL SERVERS/MOCK)
	 *        
	 * 
	 */

	public void selectNetworkMode(Client client, String networkMode){
		openDebugDrawer(client);
		client.elementSwipeWhileNotFound("NATIVE", "id=debug_drawer", "Down",
				100, 2000, "NATIVE", "id=debug_network_mode", 14, 1000, 1,
				false);
		client.waitForElement("NATIVE", "id=debug_network_mode", 0, 3000);
		client.click("NATIVE", "id=debug_network_mode", 0, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + networkMode
				+ "' and @top='true']", 0);
		client.click("NATIVE", "xpath=//*[@text='" + networkMode
				+ "' and @onScreen='true']", 0, 1);
		closeDebugDrawer(client);
		waitForProgress(client);			
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to set the values from Setup Property File
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * 
	 */

	public void setValues() throws IOException, ParserConfigurationException, SAXException{
		String DataFilePath = getProperty("user.dir") +getProperty("test.buildConfigFilePath");
		ArrayList<ArrayList<Object>> dataFromExcel=ReadExcelData(DataFilePath,"ConfigSheet",getProperty("test.countryKeyCode"));
		String[] configData = dataFromExcel.get(0).toArray(new String[dataFromExcel.get(0).size()]);
		setCountryCode(configData[0]);
		setapkFileName(configData[1]+"-"+getProperty("test.buildType")+"-"+getProperty("test.softwareVersion")+".apk");
		setLanguage(configData[2]);
		setLanguageFileName(configData[3]);
		setapkPackage(configData[4]);
		setapkActivity(configData[4] +getProperty("apkactivity.extension"));
		setUnits(configData[5]);
		setAppudi(configData[6]+getProperty("test.softwareVersion"));
		setEstimatedA1c(configData[7]);
		setTextToSpeech(configData[8]);
		setSafetyConfig(configData[9]);
		setNAIconConfig(configData[10]);
		setQuickRefConfig(configData[11]);
		setQuickStartConfig(configData[12]);
		setAboutInfo(configData[13]);
		setAppversion(getProperty("test.softwareVersion"));
		for(int i =0; i<dataFromExcel.get(0).size();i++){
			System.out.println("configData["+i+"]==>"+ configData[i]);
		}

		String testtimezoneproperties = getProperty("test.countryofExecution");
		setCountryofExecution(testtimezoneproperties);

		if (getCountryofExecution().contains("US")) {
			setDefaultTimeZone(LibrelinkConstants.US);
			setDefaultCOETimeZone(LibrelinkConstants.US);
		} else {
			setDefaultTimeZone(LibrelinkConstants.India);
			setDefaultCOETimeZone(LibrelinkConstants.India);
		}
		String[] testzone;

		if(getTimeZoneValue(LibrelinkConstants.US).contains("GMT-07:00")){
			testzone= getProperty("test.timezoneformat.1").split(";");
		}else{
			testzone= getProperty("test.timezoneformat.0").split(";");
		}


		setPstformat(testzone[0]);
		setMstformat(testzone[1]);
		setEstformat(testzone[2]);
		setAkdtformat(testzone[3]);
		setCstformat(testzone[4]);

	}


	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to Set Input Language
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 *  @param language        
	 *         set the Language file name  
	 */
	public void setInputLanguage(Client client, String language) {
		String appLanguageFilePath = getProperty("user.dir") + getProperty("Languagefile") +  language + ".properties";
		System.out.println("<--- SETTING APP LANGUAGE FILE --- " + appLanguageFilePath + " --->");
		client.setLanguagePropertiesFile(appLanguageFilePath);
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Tear down method to handle exceptions and generate reports
	 * 
	 */

	public void tearDown()  {
		if (didFail) {
			System.out.println("<--- FAIL --- " + exception.toString()
			+ " --->");

			if ((getStepID() != null) || (exception != null)) {
				capturescreenshot(client,
						getStepID() + "----------EXCEPTION----------"
								+ exception.toString(), false);
			} else {
				capturescreenshot(client,
						"No information on exception occurred", false);
			}
			if( !getTestName().contains("PreRequisite") && (!getTestName().contains("ReleaseBuild"))){
				System.out.println(client.getDeviceLog());
				closeNotification(client);
				
				//TODO check if time zone is not enabled to automatic then update timezone and reset it
			
			}

		} else {
			System.out.println("<--- SUCCESS --- " + usedDeviceName + " --- "
					+ getTestName() + " --->");
		}

		if( !getTestName().contains("PreRequisite") && (!getTestName().contains("ReleaseBuild"))){
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
			automaticDateAndTime(client, true);
			automaticDateAndTimeZone(client, true);
			clearData(client);
			//include current time TODO
			
		}
		client.generateReport(true);
		changeReportName();
		didFail = false;
		exception = null;
	}

	/**
	 * Author : Devi
	 * 
	 * Method to change report name
	 */

	public  void changeReportName() {

		File oldFile=new File(getReportLocation()+ "\\index.pdf");
		File newFile=new File(getReportLocation() +"\\"+getClass().getSimpleName()+".pdf");
		boolean success=oldFile.renameTo(newFile);
		if(success) {
			System.out.println("Rename the report");
		}else {
			System.out.println("Failed to rename the report");
		}
	}
	
	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to Initialize driver and device
	 * 
	 * @throws NumberFormatException
	 * 		Throws this exception for host no
	 * @throws BiffException
	 * 		Throws this exception for file transfer or conversions
	 * @throws Exception
	 * 		Throws this exception for all other generic issues
	 */

	public void initClientAndDevice() throws NumberFormatException,
	BiffException, Exception {
		//				try {
		//					writeConsole();
		//				} catch (IOException e) {
		//		
		//					e.printStackTrace();
		//				}
		initHost();
		initPort();
		client = new MyClient(host, port);
		initDevice();
		initProjectBaseDirectory();
		initReport();

	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to setup host name
	 * 
	 */

	private void initHost() {
		if (host == null) {
			host = getProperty("seetest.client.host");
		}
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to set up port number
	 * 
	 */

	private void initPort() {
		if (port == 0) {
			port = Integer.valueOf(getProperty("seetest.client.port"));
		}
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to set up device
	 * 
	 */

	private void initDevice() {
		if (usedDeviceName != null) {
			return;
		}
		usedDeviceName = getProperty("device.name").contains(":") ? getProperty("device.name")
				: client.waitForDevice(getProperty("device.name"), 300000);
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to set up object repository
	 * 
	 */

	private void initProjectBaseDirectory() {
		String projectBaseDirectory = getProperty("user.dir")
				+ getProperty("project.base.directory");
		client.setProjectBaseDirectory(projectBaseDirectory);
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla/Devi
	 * 
	 * Method to set up report location
	 * 
	 */

	private void initReport() {
		testStartTimeStamp = new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(Calendar.getInstance().getTime()); // Get current datetime as string.	
		String reportFolder = getProperty("user.dir") + "\\Reports\\reports\\"+  getReportName()+"\\" +getCountryCode() +"\\"+testStartTimeStamp ;

		client.setReporter("pdf", reportFolder,  getReportName() );
		setReportLocation(reportFolder+"\\test0");

	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to get the test name
	 * 
	 * @return TestName
	 * 		Returns the test name
	 */

	public String getTestName() {
		String[] klassNameSplit = this.getClass().getName().split("\\.");
		return klassNameSplit[klassNameSplit.length - 1];

	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to get the report name
	 * 
	 * @return reportName
	 * 		Returns reportname
	 */

	public String getReportName() {
		String testname =  getTestName();
		testname = testname.replaceAll("_", " ");
		return testname;
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to look for exceptions
	 * 
	 */

	@Rule
	public TestWatcher rule = new TestWatcher() {
		protected void failed(Throwable e, Description description) {
			didFail = true;
			exception = e;

			tearDown();

		}

		protected void succeeded(Description description) {
			tearDown();
		}
	};

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method To write the console to a file
	 * 
	 * @throws IOException 
	 * 		Throws IO Exception for file transfer or conversions
	 */

	public void writeConsole() throws IOException{

		System.setOut(new PrintStream(new FileOutputStream(getProperty("user.dir") + "\\Reports\\consoleOutput\\"+getTestName()+"_"+getCountryCode()+".txt")));
		System.out.println("This is the console output");

	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to Capture screen shot
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *            
	 * @param string
	 *            screen name
	 *            
	 * @param status
	 *            true to take screen shot
	 *            
	 */

	public void capturescreenshot(Client client, String string, boolean status) {
		waitFor(client,1);
		client.setShowReport(true);
		client.report(string, status);
		client.setShowReport(false);
		waitFor(client,5);
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Move App to background
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * 
	 */

	public void moveApptoBackground(Client client) {
		client.deviceAction("Home");
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to Get Property from property file
	 * 
	 * @param property
	 *         set the property file name
	 * @return propertyValue
	 * 		Returns the propertyValue
	 */

	public static String getProperty(String property) {
		if (System.getProperty(property) != null) {
			return System.getProperty(property);
		}
		File setupPropFile = new File("setup.properties");
		if (setupPropFile.exists()) {
			Properties prop = new Properties();
			FileReader reader;
			try {
				reader = new FileReader(setupPropFile);
				prop.load(reader);
				reader.close();
				return prop.getProperty(property);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Install application
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation  
	 *            
	 */

	public void install(Client client) {
		System.out.println("============================"+getapkFileName());
		client.install(getProperty("user.dir") + getProperty("apklocation")+getapkFileName(), true, false);
	}

	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Method to Launch application
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation     
	 */

	public void launch(Client client) {
		client.launch(getapkActivity(), true, true);
	}



	/**
	 * Author: ShabinaSherif/NagarajuKasarla
	 * 
	 * Set No Error in Debug drawer
	 * 
	 * @param client
	 * 
	 */
	public void setNoErrorOnDebugDrawer(Client client) {
		openDebugDrawer(client);
		client.elementSwipeWhileNotFound("NATIVE", "id=debug_drawer", "Down", 300, 1000, "NATIVE", "xpath=//*[@id='debug_network_error' and @onScreen='true']", 0, 1000, 3, true);
		waitFor(client, 1);
		client.click("NATIVE", "text=None", 0, 1);
		waitFor(client, 1);
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='debug_drawer']", 0, "view.scrollTo(9999999, 0);");
		closeDebugDrawer(client);
	}


	/**
	 * Author: Shabina/NagarajuKasarla
	 * 
	 * Method to Wait for the progress to be completed
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation     
	 */

	public void waitForProgress(Client client) {
		client.waitForElementToVanish(
				"NATIVE",
				"xpath=//*[@id='progress'] and @top='true']",
				0, 80000);
	}

	/**
	 * Author: Shabina/NagarajuKasarla
	 * 
	 * Method to UnInstall application
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation    
	 */

	public void unInstall(Client client) {
		client.uninstall(getapkActivity());
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to click on Add Note
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation   
	 */

	public void clickAddNote(Client client) {
		client.waitForElement("NATIVE","xpath=//*[@id='logbook_note_btn']",0, 1000);
		client.click("NATIVE","xpath=//*[@id='logbook_note_btn']",0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Startup to navigate to HomeScreen
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation 
	 * @throws ParseException 
	 */

	public void startUp(Client client) throws ParseException {
		clearData(client);
		clickSignInButton(client,true);
		signInClick(client, LibrelinkConstants.Username, LibrelinkConstants.Password, true);
		termsOfPageAndPrivacyNoticeAccept(client,"Terms of Use");
		termsOfPageAndPrivacyNoticeAccept(client,"Privacy Notice");
		defaultSettings(client, "grams");			
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Verify Terms of Use and Privacy Notice page Accept option
	 * 
	 * @param client
	 *            
	 */
	public void termsOfPageAndPrivacyNoticeAccept(Client client,String title) {
		client.waitForElement("NATIVE", "xpath=//*[@text='Accept' and @onScreen='true']", 0, 3000);
		client.click("NATIVE", "xpath=//*[@text='Accept' and @onScreen='true']", 0, 1);
		waitFor(client, 3);
		client.waitForElement("NATIVE", "xpath=//*[@id='button1']", 0, 1000);
		client.click("NATIVE", "xpath=//*[@text='I have read and explicitly accept the "+title+".' and @hidden='false']", 0, 1);
		client.click("NATIVE", "xpath=//*[@id='button1']", 0, 1);
		client.waitForElementToVanish("NATIVE", "id=progress", 0, 60000);
		waitFor(client, 5);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method To convert string files to property files
	 * 
	 */

	public static void createPropertyFiles() {
		ValueFilpath=getProperty("user.dir") +"\\strings";
		FinalLocation=getProperty("user.dir") +"\\languagefiles";
		File finalPath = new File(FinalLocation);
		if (!finalPath.exists())
			finalPath.mkdir();
		else {
			/*
			 * Empty existing files
			 */
			File[] tempFiles = finalPath.listFiles();
			for (File tempFile : tempFiles) {
				tempFile.delete();
			}
		}
		convertAll(new File(ValueFilpath));
	}

	public static void convertAll(File node) {
		String propertyContent = "";
		if (node.isDirectory() && !(node.getName().equalsIgnoreCase("languagefiles"))) {
			System.out.println(node.getAbsoluteFile());
			String[] subNote = node.list();
			for (String filename : subNote) {
				convertAll(new File(node, filename));
			}
		} else {
			if (node.isFile()  && !(node.getName().equalsIgnoreCase("README.txt"))) {
				System.out.println(node.getAbsoluteFile());                          
				propertyContent = convertFiles(node);                         

				ConvertedFilename = node.getParentFile().getName();
				File finalPath = new File(FinalLocation);
				if (!finalPath.exists())
					finalPath.mkdir();
				try {

					File file = new File(FinalLocation, ConvertedFilename + ".properties");
					file.createNewFile();                                  
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(
							new FileOutputStream(file), "UTF-8"));                                                      
					bw1.write(propertyContent);
					bw1.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

	/**
	 * Author:  LourdeNoelRini
	 * 
	 *   Get value from XML file
	 * 
	 * 
	 */

	public static String getValue(NodeList nList, String key) {
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getAttribute("name").equalsIgnoreCase(key))
					return nNode.getFirstChild().getNodeValue();
			}
		}
		return null;
	}
	
	/**
	 * Author: LourdeNoelRini
	 * 
	 *   Converting individual files
	 * 
	 * 
	 */

	public static String convertFiles(File file) {
		String propertyContent = "";
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			// For Plurals
			NodeList nListPlurals = doc.getElementsByTagName("plurals");
			for (int temp = 0; temp < nListPlurals.getLength(); temp++) {
				Node nNode = nListPlurals.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String parentName = eElement.getAttribute("name");
					NodeList nSubList = eElement.getElementsByTagName("item");
					if (nSubList != null) {
						for (int idx = 0; idx < nSubList.getLength(); idx++) {
							Node nSubNode = nSubList.item(idx);
							if (nSubNode.getNodeType() == Node.ELEMENT_NODE) {
								Element eSubElement = (Element) nSubNode;
								String childName = "";
								if (eSubElement.getAttribute("quantity")
										.equalsIgnoreCase("one")) {
									childName = "_singular";
									propertyContent += parentName
											+ childName
											+ "="
											+ nSubNode.getFirstChild()
											.getNodeValue()
											+ System.lineSeparator();
								} else {
									childName = "_plural";
									propertyContent += parentName + childName
											+ "=" + nSubNode.getTextContent()
											+ System.lineSeparator();
								}
							}
						}
					}
				}
			}
			// For Strings
			NodeList nListStrings = doc.getElementsByTagName("string");
			for (int temp = 0; temp < nListStrings.getLength(); temp++) {
				Node nNode = nListStrings.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					if (nNode.getFirstChild().getNodeValue()!=null && nNode.getFirstChild().getNodeValue()
							.contains("@string")) {
						propertyContent += eElement.getAttribute("name")
								+ "="
								+ getValue(nListStrings, nNode.getFirstChild()
										.getNodeValue().split("/")[1])
								+ System.lineSeparator();
					} else {
						propertyContent += eElement.getAttribute("name") + "="
								+ ((nNode.getFirstChild().getNodeValue() != null) ?(nNode.getFirstChild().getTextContent().replaceAll("<b>", "").replaceAll("</b>", "").replaceAll("<u>", "").replaceAll("</u>", "")):nNode.getTextContent())
								+ System.lineSeparator();

					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception during convertion" + e);
		}
		return propertyContent;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Close Application
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void closeApplication(Client client) {
		client.applicationClose(getapkPackage());
	}


	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to Wait for n secs
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param secs    
	 *        set the time for sleep          
	 */

	public void waitFor(Client client, int secs) {
		secs = secs * 1000;
		client.sleep(secs);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Open phone settings
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 */

	public void openPhoneSettings(Client client) {
		client.run("adb shell am start -n 'com.android.settings/.Settings'");
		waitFor(client, 2);
		if(!(client.isElementFound("NATIVE", "xpath=//*[@id='Settings']",0))&&!(client.isElementFound("NATIVE", "xpath=//*[@text='SETTINGS']",0))){
			client.run("adb shell am start -a android.settings.SETTINGS");

		}
		waitFor(client, 2);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Open date and time settings
	 * 
	 * @param client
	 *            
	 */
	public void openDateTimeSettings(Client client) {
		client.run("adb shell am start -n 'com.android.settings/.DateTimeSettingsSetupWizard'");
		waitFor(client, 2);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Change Phone time format to 12/24 hours
	 * @param client
	 *            
	 *
	 */
	public void changePhoneHourTimeFormat(Client client, String hourFormat) {
		/*openDateTimeSettings(client);
		if(client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='list']", "Down", 200, 2000, "NATIVE", "xpath=//*[@text='Use 24-hour format']", 0, 1000, 3, false)){
			// If statement
		}
		if(hourFormat.contains("24")){
			if(client.isElementFound("NATIVE", "xpath=//*[@id='checkbox' and @checked='false' and ./parent::*[./preceding-sibling::*[./*[@text='Use 24-hour format']]]]", 0)){
				client.click("NATIVE", "xpath=//*[@id='checkbox' and ./parent::*[./preceding-sibling::*[./*[@text='Use 24-hour format']]]]", 0, 1);
			}
		}else{
			if(client.isElementFound("NATIVE", "xpath=//*[@id='checkbox' and @checked='true' and ./parent::*[./preceding-sibling::*[./*[@text='Use 24-hour format']]]]", 0)){
				client.click("NATIVE", "xpath=//*[@id='checkbox' and ./parent::*[./preceding-sibling::*[./*[@text='Use 24-hour format']]]]", 0, 1);
			}
		}
		client.click("NATIVE", "xpath=//*[@resource-id='com.android.settings:id/next_button']", 0, 1);
	*/	//TODO use android back button

		client.run("adb shell settings put system time_12_24 " + hourFormat + "");
		waitFor(client, 10);
	}

	/**
	 * Author: NagarajuKasarla/Devi
	 * 
	 * Method to Navigate To Screen
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param Screen
	 *            Navigate to Screens
	 * 
	 */


	public void navigateToScreen(Client client, String Screen) {
		clickOnBackOrMenuIcon(client);
		waitFor(client,1);
		if (client.waitForElement("NATIVE", "text="+Screen, 0, 10000)) {
			if (client.elementSwipeWhileNotFound("NATIVE",
					"id=design_navigation_view", "Down", 100, 2000,
					"NATIVE", "xpath=//*[@id='design_menu_item_text' and @text='"+Screen+"']" , 0, 1000, 5, false)) {
			}
			waitFor(client,2);
			client.click("NATIVE", "xpath=//*[@id='design_menu_item_text' and @text='"+Screen+"']", 0, 1);
			waitFor(client,1);
		}		
		if (Screen.equalsIgnoreCase("home")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView']", 0);
		} else {
			verifyPageTitles(client, Screen);
		} 
	}

	/**
	 * Author: NagarajuKasarla/Devi
	 * 
	 * Method to Verify Page title gets displayed
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param title
	 *            Enter page title
	 *            
	 */


	public void verifyPageTitles(Client client, String title) {
		client.waitForElement("NATIVE", "text=" + title+"", 0, 10000);
		client.verifyElementFound("NATIVE", "text=" + title+"", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Home Page title
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void verifyHomePage(Client client) {	
		client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@contentDescription='More options' and @onScreen='true']", 0);}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set Current System Time in device
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *@throws ParseException
	 *		Throws parse exception for setting date
	 */

	public void currentSystemTime(Client client) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		String DeviceVer = client.run("adb shell getprop ro.build.version.release ");
		if (DeviceVer.contains("5.")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmmss");
			String YYYYMMDD = sdf.format(c.getTime());
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
		} else {		
			SimpleDateFormat altsdf = new SimpleDateFormat("MMddHHmmYY.ss");
			String MMDDYY = altsdf.format(c.getTime());
			System.out.println(MMDDYY);

			client.run("adb shell su -c 'date -u " + MMDDYY + "'");
			client.run("adb shell su -c 'date " + MMDDYY + "'");

			waitFor(client, 20);
		}
		waitFor(client, 10);



	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Enable/disable Automatic DateAndTime
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param on
	 *            true to on
	 *            
	 */

	public void automaticDateAndTime(Client client, boolean on) {
		if (on) {
			client.run("adb shell settings put global auto_time 1");
		} else {
			client.run("adb shell settings put global auto_time 0");
		}
	}

	/**
	 * Author: Devi
	 * 
	 * Method to Set The Date And Time In Phone Date Settings
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param day
	 *            Selecting Date from Device Settings
	 *            
	 * @param month
	 *            Selecting month from Device Settings
	 *            
	 * @param year
	 *            Selecting year from Device Settings
	 *            
	 * @param time
	 *            Selecting time from Device Settings
	 *            
	 * @throws ParseException
	 * 			Throws Parse Exception for setting date
	 */

	public void setTheDateAndTime(Client client, int date, int month,int year, String time) throws ParseException {
		appNetworkTimeCheck(client,true);
		automaticDateAndTime(client, false);
		String timeformat = getTimeFormat(client);
		if(timeformat.contains("12")){
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
			waitFor(client, 5);
		}
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, date);
		System.out.println("=========" + month);
		int month1 = month - 1;
		System.out.println("===========" + month1);
		c.set(Calendar.MONTH, month1);
		c.set(Calendar.YEAR, year);
		System.out.println(c.getTime());
		if(time != null)
		{
		String[] t=time.split(":");
		System.out.println("============**================" + date);
		System.out.println("============*================" + month);
		System.out.println("============**================" + year);
		System.out.println("============**================" + t[0]);
		System.out.println("============**================" + t[1]);
		c.set(Calendar.HOUR_OF_DAY, Integer.parseInt(t[0]));
		System.out.println("============");
		c.set(Calendar.MINUTE, Integer.parseInt(t[1]));
		c.set(Calendar.SECOND, 00);
		System.out.println(c.getTime());
		}
	
		
		String DeviceVer = client
				.run("adb shell getprop ro.build.version.release ");
		if (DeviceVer.contains("5.")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmmss");
			String YYYYMMDD = sdf.format(c.getTime());
			System.out.println(YYYYMMDD);
			// This command has been executed twice to overcome the time changing challenges due to day light savings
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "; am broadcast -a android.intent.action.TIME_SET'");
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "; am broadcast -a android.intent.action.TIME_SET'");
	
		}
		else{
			SimpleDateFormat altsdf = new SimpleDateFormat("MMddHHmmYY.ss");
			String MMDDYY = altsdf.format(c.getTime());
			System.out.println(MMDDYY);

			client.run("adb shell su -c 'date -u " + MMDDYY + "; am broadcast -a android.intent.action.TIME_SET'");
			// This command has been executed twice to overcome the time changing challenges due to day light savings
			client.run("adb shell su -c 'date " + MMDDYY + "; am broadcast -a android.intent.action.TIME_SET'");

		
			waitFor(client, 20);

		}
		waitFor(client, 10);
		openBackgroundApp(client);
		navigateToScreen(client, "Home");
		if(timeformat.contains("12")){
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
			waitFor(client, 5);
		}

	}

	/**
	 * Author: Devi
	 * 
	 * Method to Set The Time Alone
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 *           
	 * @param time
	 *        set the time
	 * @throws ParseException
	 * 		Throws parse exception for setting date        
	 * 
	 */	
	
	public void setTheTimeAlone(Client client, String time) throws ParseException{
		appNetworkTimeCheck(client,true);
		automaticDateAndTime(client, false);
		String deviceTime=client.getDeviceProperty("device.time");
		String[] dateFromDevice=deviceTime.split("-");
		System.out.println("Year============================" + dateFromDevice[0]);
		System.out.println("Month============================" + dateFromDevice[1]);
		System.out.println("Date============================" + dateFromDevice[2].split(" ")[0]);
		
		String[] t=time.split(":");
		System.out.println("============================" + t[0]);
		System.out.println("============================" + t[1]);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, Integer.parseInt(dateFromDevice[0]));
		int month1= Integer.parseInt(dateFromDevice[1])-1;
		c.set(Calendar.MONTH,month1);
		c.set(Calendar.DATE, Integer.parseInt(dateFromDevice[2].split(" ")[0]));
		c.set(Calendar.HOUR_OF_DAY, Integer.parseInt(t[0]));
		System.out.println("============");
		c.set(Calendar.MINUTE, Integer.parseInt(t[1]));
		c.set(Calendar.SECOND, 00);
		
		System.out.println("c.getTime:"+c.getTime());
		String DeviceVer = client
				.run("adb shell getprop ro.build.version.release ");
		if (DeviceVer.contains("5.")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmmss");
			String YYYYMMDD = sdf.format(c.getTime());
			System.out.println("Time set:"+YYYYMMDD);	
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
		} else {
			SimpleDateFormat altsdf = new SimpleDateFormat("MMddHHmmYY.ss");
			String MMDDYY = altsdf.format(c.getTime());
			System.out.println("MMDDYY:"+MMDDYY);
			client.run("adb shell su -c 'date -u " + MMDDYY + "'");
			client.run("adb shell su -c 'date " + MMDDYY + "'");
			waitFor(client, 20);
		}
		waitFor(client, 10);

	}


		
		
		
	

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Open Background Application
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void openBackgroundApp(Client client) {
		client.sendText("{HOME}");
		waitFor(client, 3);
		client.run("adb shell input keyevent KEYCODE_APP_SWITCH");
		waitFor(client, 3);
		if (client
				.isElementFound(
						"Native",
						"xpath=//*[@text='LibreLink Debug']",
						0)) {
			client.click(
					"Native",
					"xpath=//*[@text='LibreLink Debug']",
					0, 1);

		}
		waitFor(client, 1);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to swipe the page
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 *           
	 * @param direction   
	 *        set the directions(Left/Right/Up/Down)     
	 * 
	 */

	public void swipePage(Client client, String direction) {
		client.swipe(direction, 0, 500);
		waitFor(client,2);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Select SAS mode from Debug drawer
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param sasmode
	 *            SAS mode name(Mock1/Mock2/Default)
	 *            
	 */

	public void selectingSASMode(Client client, String sasmode) {
		openDebugDrawer(client);
		waitFor(client, 2);
		client.waitForElement("NATIVE",
				"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_mode']]",
				0, 5000);
		String mode = client.elementGetText("NATIVE",
				"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_mode']]",
				0);
		if (mode.equalsIgnoreCase(sasmode)) {
			closeDebugDrawer(client);
		} else {
			client.click(
					"NATIVE",
					"xpath=//*[@id='text1' and ./parent::*[@id='debug_sas_mode']]",
					0, 1);
			client.waitForElement("NATIVE",
					"xpath=//*[@id='text1' and @text='"+sasmode+"']", 0, 2000);
			client.click(
					"NATIVE",
					"xpath=//*[@text='"+sasmode+"' and @class='android.support.v7.widget.AppCompatCheckedTextView']",
					0, 1);
			waitFor(client, 2);
		}
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Close Debug Drawer
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void closeDebugDrawer(Client client) {

		if (client.isElementFound("NATIVE",
				"xpath=//*[@text='LibreLink Debug' and @onScreen='true']", 0)) {
			client.elementSwipe("NATIVE", "id=debug_drawer", 0, "Left", 0, 1000);
		}
	}
	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Open Debug Drawer
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void openDebugDrawer(Client client) {
		if (client.isElementFound("NATIVE",
				"xpath=//*[@text='LibreLink Debug' and @onScreen='false']", 0)) {
			client.swipe("Right", 0, 500);
		}
		client.waitForElement("NATIVE", "id=debug_drawer", 0, 1000);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Change System time or Device Time
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * @param hour
	 *            add or decrease hours
	 *            
	 * @param min
	 *            add or decrease minutes
	 *            
	 * @throws ParseException
	 * 		Throws parse exception for setting date
	 */

	public void advanceTime(Client client, int hour, int min)
			throws ParseException {
		String timeformat = getTimeFormat(client);
		if(timeformat.contains("12")){
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWENTYFOUR_HOUR_FORMAT);
			waitFor(client, 5);
		}
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());


		c.add(Calendar.HOUR, hour);
		c.add(Calendar.MINUTE, min);

		String DeviceVer = client
				.run("adb shell getprop ro.build.version.release ");

		if (DeviceVer.contains("5.")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmmss");
			String YYYYMMDD = sdf.format(c.getTime());
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
			client.run("adb shell su -c 'date -s " + YYYYMMDD + "'");
		} else {
			SimpleDateFormat altsdf = new SimpleDateFormat("MMddHHmmYY.ss");
			String MMDDYY = altsdf.format(c.getTime());
			client.run("adb shell su -c 'date -u " + MMDDYY + "'");
			client.run("adb shell su -c 'date " + MMDDYY + "'");
			waitFor(client, 20);
		}
		waitFor(client, 10);
		if(timeformat.contains("12")){
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
			changePhoneHourTimeFormat(client, LibrelinkConstants.TWELVE_HOUR_FORMAT);
			waitFor(client, 5);
		}
	}

	/**
	 * Author: NagarajuKasarla  
	 * 
	 * Get the time format
	 * @param client
	 *            
	 */

	public String getTimeFormat(Client client){
		String timeformat = client.run("adb shell settings get system time_12_24");

		return timeformat;
	}


	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to Re launch the application
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 */

	public void reLaunch(Client client) {
		client.launch(getapkActivity(), true, false);
		waitFor(client, 3);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to Open Notification 
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 */

	public void openNotification(Client client) {
		client.sendText("{NOTIFICATION}");
		waitFor(client, 3);

	}

	/**
	 * Author: ShabinaSherif
	 *            
	 * Method to clear All Notifications
	 *  
	 * @param client
	 *         Integrate SeeTestAutomation
	 */
	public void clearAllNotification(Client client) {
		try {
			openNotification(client);
			String text = "Alarm Expired";
			for (int i = 0; i <= 15; i++) {
				if (client.isElementFound("TEXT",""+text, 0) == true) {
					if (getDeviceOSVer().contains("7.")) {
						client.click("TEXT",""+text, 0, 2);
						openNotification(client);
						client.click("TEXT","LibreLink Debug",0,1);
					}else{
						client.elementSwipe("TEXT",""+text, 0, "Right", 500,
								1000);
					}
				} else {
					break;
				}
			}

			client.verifyElementNotFound("TEXT",""+text, 0);
			closeNotification(client);

		} catch (Exception e) {
			System.out.println("Could not get device log");
			closeNotification(client);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to clear Single Notification 
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param notificationName
	 *           set and clear the notification
	 *            
	 */

	public void clearSingleNotification(Client client, String notificationName) {
		if(client.isElementFound("NATIVE", "xpath=//*[contains(@text,'"+notificationName+"')]",0)){
			client.elementSwipe("NATIVE", "xpath=//*[contains(@text,'"+notificationName+"')]", 0, "Right", 100, 500);
			waitFor(client,2);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * Method to Close Notification screen
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void closeNotification(Client client) {
		client.swipe("Down", 0, 1000);
		waitFor(client,2);

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Navigate To Sub Menu Screens
	 *
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param subscreen
	 *         setting sub menu screen name
	 *
	 */

	public void navigateToSubMenuScreens(Client client,
			String subscreen) {
		waitFor(client,1);
		client.waitForElement("NATIVE", "text=${settings}", 0,
				10000);
		client.click("NATIVE", "text=${" + subscreen + "}", 0, 1);
		waitFor(client, 1);
		client.verifyElementFound("NATIVE", "text=${" + subscreen + "}", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify button status
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param option
	 *            NEXT, OK, SAVE , CANCEL , SUBMIT, ACCEPT, REJECT Buttons
	 *            
	 * @param enable
	 *           true/false
	 *           
	 */
	public void verifyButtonStatus (Client client, String option, boolean enable) {
		if (enable) {
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${"+ option +"}' and @enabled='true']]", 0);
		} else {
			client.verifyElementFound("NATIVE",
					"xpath=//*[@text='${"+ option +"}' and @enabled='false']]", 0);
		}
		waitFor(client, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on Next or Save or Ok or Cancel Buttons
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param option
	 *            NEXT, OK, SAVE , CANCEL , SUBMIT, ACCEPT, REJECT, Radio Options like Grams and Servings
	 *            
	 * @param click
	 *          true/false
	 *          
	 */
	public void clickOnButtonOption(Client client, String option,
			boolean click) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"+option+"' and @class='android.support.v7.widget.AppCompatButton' and @onScreen='true']", 0);
		if (click){
			client.click("NATIVE", "xpath=//*[@text='"+option+"' and @class='android.support.v7.widget.AppCompatButton' and @onScreen='true']", 0,
					1);
		}
		waitFor(client,1);
		waitForProgress(client);

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Click on back or Menu icon
	 *
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void clickOnBackOrMenuIcon(Client client) {
		client.waitForElement("NATIVE", "xpath=//*[@contentDescription='Navigate up' and @onScreen='true']", 0,
				10000);
		client.click("NATIVE",
				"xpath=//*[@class='android.support.v7.widget.AppCompatImageButton' and @contentDescription='Navigate up' and @onScreen='true']", 0, 1);
		waitFor(client, 1);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set The BG value for real or Historic with Static time
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param type
	 *            Select type
	 * 
	 * @param value
	 *            set the value
	 * 
	 * @param isTimeReqd
	 *            true to set the static time(true/false)           
	 *            
	 * @param hours
	 *            Select Hour
	 *            
	 * @param minutes
	 *            Select minutes           
	 * @throws ParseException 
	 * 
	 * */

	public void bgValueWithStaticTime(Client client, String type, String value, boolean isTimeReqd, 
			int hours, int minutes) throws ParseException {
		client.verifyElementFound("NATIVE", "id=debug_sensor_add_data", 0);
		client.click("NATIVE", "id=debug_sensor_add_data", 0, 1);
		if (client.waitForElement("NATIVE", "text=Add Sensor Data", 0, 10000)) {
			client.click("NATIVE", "text=" + type, 0, 1);
			enterBGValue(client, value);
			if(isTimeReqd){
				enterStaticTime(client, hours, minutes);
			}
			clickAddScannedValue(client);
			waitFor(client,6);
			System.out.println("clicked add  data");

		}
	}

	/**
	 * @author NagarajuKasarla
	 * 
	 * Method to Click on ADD DATA Button
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void clickAddSensorDataMethod(Client client) {
		client.click("NATIVE", "xpath=//*[@id='debug_sensor_add_data']", 0, 1);
		waitFor(client,1);
	}

	/**
	 * @author NagarajuKasarla
	 * 
	 * Method to enter Blood Glucose value
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param value
	 * 			text value to be entered
	 * 
	 */

	public void enterBGValue(Client client, String value) {
		client.waitForElement(
				"NATIVE",
				"xpath=//*[@id='debug_sensor_scan_value']",	0, 10000);
		client.elementSendText(
				"NATIVE","xpath=//*[@id='debug_sensor_scan_value']",0,value);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Enter the scan and activation date and time
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param days
	 * 			days to be set
	 * 
	 * @param hours
	 * 			hours to be set
	 * 
	 * @param minutes
	 * 			minutes to be set
	 * @throws ParseException 
	 * 			Throws ParseException for settings date/time
	 */

	public void enterScanActivationDateAndTime(Client client,int days, int hours,
			int minutes) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Calendar cal = Calendar.getInstance();
		String scanDate = client.elementGetText("NATIVE",
				"xpath=//*[@id='debug_sensor_scan_date' and @onScreen='true']", 0);
		String[] date = scanDate.split("-");
		int a = Integer.parseInt(date[0]);
		int b = Integer.parseInt(date[1]);
		int c = Integer.parseInt(date[2]);
		cal.set(Calendar.YEAR, a);
		cal.set(Calendar.MONTH, b-1);
		cal.set(Calendar.DATE, c);
		cal.add(Calendar.DAY_OF_MONTH, days);
		String str0 = client.elementGetText("NATIVE",
				"id=debug_sensor_scan_time", 0);
		int x = Integer.parseInt(str0.substring(0, 2));
		int y = Integer.parseInt(str0.substring(3));
		cal.set(Calendar.HOUR_OF_DAY, x);
		cal.set(Calendar.MINUTE, y);
		cal.set(Calendar.SECOND, 0);
		cal.add(Calendar.HOUR, hours);
		cal.add(Calendar.MINUTE, minutes);
		String dateTime = dateFormat.format(cal.getTime());
		String inputDate[] = dateTime.split(" ");
		client.elementSendText("NATIVE", "id=debug_sensor_scan_time", 0, ""
				+ inputDate[1]);
		client.elementSendText("NATIVE", "id=debug_sensor_scan_date", 0, ""
				+ inputDate[0]);
	}


	/**
	 * @author NagarajuKasarla
	 * 
	 * Method to Click on ADD for scan value
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void clickAddScannedValue(Client client) {
		client.waitForElement("NATIVE", "xpath=//*[@id='button1']", 0, 10000);
		client.click("NATIVE", "xpath=//*[@id='button1']", 0, 1);
		waitFor(client,2);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Scan Mock Sensor
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param errorCondition
	 *           Set the error condition 
	 * 
	 */

	public void scanMockSensor(Client client, String errorCondition) {
		client.verifyElementFound("NATIVE","xpath=//*[@id='debug_sensor_scan' and @text='Scan Mock Sensor']",0);
		client.click("NATIVE","xpath=//*[@id='debug_sensor_scan' and @text='Scan Mock Sensor']",0, 1);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='alertTitle' and @text='Scan Mock Sensor']", 0);
		if(errorCondition!=null){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='debug_sensor_scan_error' and @enabled='true']", 0);
			client.click("NATIVE", "xpath=//*[@id='debug_sensor_scan_error' and @enabled='true']", 0, 1);
			client.waitForElement("NATIVE","xpath=//*[@class='android.widget.ListPopupWindow$DropDownListView']",0, 10000);
			waitFor(client, 2);
			client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@class='android.widget.ListPopupWindow$DropDownListView']", "Down", 0, 500, "NATIVE", "text="+errorCondition, 0, 1000, 3, false);
			client.click("NATIVE", "text="+errorCondition, 0, 1);
		}
		if (client.isElementFound("NATIVE",	"xpath=//*[@id='debug_sensor_scan_skip' and @text='Go directly to scan results' and @checked='false']",
				0)) {
			client.click("NATIVE","xpath=//*[@id='debug_sensor_scan_skip' and @text='Go directly to scan results']",
					0, 1);
		}

		client.waitForElement("NATIVE", "xpath=//*[@id='alertTitle' and @text='Scan Mock Sensor']",
				0, 1000);
		client.click("NATIVE", "xpath=//*[@id='button1' and @text='Scan Now']",0, 1);
		waitFor(client,5);

	}




	/**
	 * Author: NagarajuKasarla
	 * 
	 * Get the language value from property file
	 * 
	 * @param property
	 *         set the property file name
	 * 
	 * @return propertyvalue
	 * 			Returns the propertyvalue from String file
	 */
	public String getLangPropValue(String property) {
		if (System.getProperty(property) != null) {
			return System.getProperty(property);
		}
		File langPropFile = new File(getProperty("user.dir")
				+ getProperty("Languagefile") + getLanguageFileName()
				+ ".properties");
		if (langPropFile.exists()) {
			Properties prop = new Properties();
			FileReader reader;
			try {
				reader = new FileReader(langPropFile);
				prop.load(reader);
				reader.close();
				return prop.getProperty(property);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to create an default account
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param ageGroup
	 *        Set the Age group(Adult/Minor)         
	 * @throws ParseException 
	 *            
	 */
	public void createDefaultAccount(Client client, String ageGroup) throws ParseException {
		setEmail();
		clearData(client);
		client.click("NATIVE","xpath=//*[@id='getStartedNow']", 0, 1);
		waitFor(client,1);
		clickOnButtonOption(client, "Next", true);
		clickCheckBox(client,"termsOfUseTitle",true);
		clickCheckBox(client,"privacyNoticeTitle",true);
		if (ageGroup.equalsIgnoreCase("Adult")) {
			createNewAccountDetails(client, "Tester", "Adult", "5", "17",
					"1960");
			clickOnButtonOption(client, "Next", true);
			adultLoginDetails(client, getEmail(),
					LibrelinkConstants.CURRENT_PASSWORD,
					LibrelinkConstants.CURRENT_PASSWORD, true);
		} else {
			createMinorAccountDetails(client, "Kid", "Minor");
			clickOnButtonOption(client, "Next", true);
			clickMinorMessageOk(client);
			minorLoginDetails(client, "ParentFirstName", "ParentLastName", getEmail(),
					LibrelinkConstants.CURRENT_PASSWORD,
					LibrelinkConstants.CURRENT_PASSWORD, true);
		}

		clickOnCreateAccount(client);
		defaultSettings(client,"grams");
		//	allowNotifications(client);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Minor login details for Create an account
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param parentfname
	 *            Enter parent firstname
	 *            
	 * @param parentlname
	 *            Enter parent lastname
	 *            
	 * @param email
	 *            Enter email           
	 *            
	 * @param password
	 *            Enter password
	 *            
	 * @param confirmpassword
	 *            confirm password
	 * @param  click  
	 *         true to click     
	 */

	public void minorLoginDetails(Client client, String parentfname,
			String parentlname, String email, String password,
			String confirmpassword, boolean click) {
		client.elementSendText("NATIVE", "xpath=//*[@id='firstName']", 0, parentfname);
		client.elementSendText("NATIVE", "xpath=//*[@id='lastName']", 0, parentlname);
		client.elementSendText("NATIVE", "xpath=//*[@id='email']", 0, email);
		client.elementSendText("NATIVE", "xpath=//*[@id='password']", 0, password);
		client.elementSendText("NATIVE", "xpath=//*[@id='confirm']", 0, confirmpassword);
		client.swipe("Down", 1000, 400);

		if (click) {
			client.click("NATIVE", "xpath=//*[@id='yes']", 0, 1);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Click 'OK' on Minor warning message
	 *
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void clickMinorMessageOk(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='OK']", 0);
		client.click("NATIVE", "xpath=//*[@text='OK']", 0, 1);
		waitForProgress(client);
	}


	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Create an Minor Account
	 *
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param fname
	 *            Enter fname as FirstName
	 *            
	 * @param lname
	 *            Enter lname as LastName
	 *            
	 *            
	 */

	public void createMinorAccountDetails(Client client, String fname,
			String lname) {
		setFirstAndLastName(client, fname, lname);

		String age = "12";
		if(getCountryCode().contains("United Kingdom")){
			age = "3";
		}
		enterAgePickDOB(client, age);

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Select Minor DOB "X" years from date picker
	 *
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param age
	 *            select age from calendar
	 *            
	 */

	public void enterAgePickDOB(Client client, String age) {
		int year = Integer.parseInt(age);
		SimpleDateFormat y = new SimpleDateFormat("MM,d,yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -year);
		String requiredYear = y.format(cal.getTime());
		String[] date = requiredYear.split(",");
		String day = date[1];
		System.out.println(day);
		int month = Integer.parseInt(date[0]);
		int year1 = Integer.parseInt(date[2]);
		int requiredYearIndex = year1 - 1900;
		int requiredMonthIndex = requiredYearIndex * 12 + month - 1;
		System.out.println(requiredMonthIndex);
		client.waitForElement("NATIVE", "id=mdtp_animator", 0, 5000);
		client.click("NATIVE", "id=mdtp_animator", 0, 1);
		client.elementScrollToTableRow(
				"NATIVE",
				"xpath=//*[@class='com.wdullaer.materialdatetimepicker.date.SimpleDayPickerView']",
				0, requiredMonthIndex);
		waitFor(client, 2);
		client.click("NATIVE", "xpath=//*[@class='com.wdullaer.materialdatetimepicker.date.SimpleDayPickerView']", 0, 1);
		waitFor(client, 1);
		client.click("NATIVE", "id=mdtp_ok", 0, 1);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Adult login details for Create an account
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 *           
	 * @param email
	 *            email from getEmail          
	 *           
	 * @param password
	 *            Enter password
	 *            
	 * @param confirmpassword
	 *            confirm password
	 *            
	 * @param click
	 *            true/false
	 */

	public void adultLoginDetails(Client client, String email, String password,
			String confirmpassword, boolean click) {
		client.elementSendText("NATIVE", "id=email", 0, email);
		client.elementSendText("NATIVE", "id=password", 0, password);
		client.elementSendText("NATIVE", "id=confirm", 0, confirmpassword);
		if (click) {
			client.click("NATIVE", "id=yes", 0, 1);
		}


	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set Email And Password
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param email
	 *            Enter email 
	 *                     
	 * @param password
	 *            Enter password
	 *            
	 * @param confirmpassword
	 *            enter confirm password
	 *            
	 */

	public void setEmailAndPassword(Client client, String email,
			String password, String confirmpassword) {
		client.elementSendText("NATIVE", "xpath=//*[@id='email']", 0, email);
		client.elementSendText("NATIVE", "xpath=//*[@id='password']", 0,password);
		client.closeKeyboard();
		waitFor(client,1);
		client.elementSendText("NATIVE", "xpath=//*[@id='confirm']",0, confirmpassword);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to  Click on CreateAccount page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void clickOnCreateAccount(Client client) {
		client.waitForElement("NATIVE", "xpath=//*[@id='submit']", 0, 10000);
		client.click("NATIVE", "xpath=//*[@id='submit']", 0, 1);
		waitForProgress(client);

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Enter first name and last name details for Creat a New account
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param fname
	 *            Enter fname as FirstName
	 *            
	 * @param lname
	 *            Enter lname as LastName
	 *            
	 * @param day
	 *            Select day
	 *            
	 * @param month
	 *            Enter month
	 *            
	 * @param year
	 *            Enter year
	 * 
	 */

	public void createNewAccountDetails(Client client, String fname,
			String lname, String month, String day, String year) {
		setFirstAndLastName(client, fname, lname);
		client.click("NATIVE", "id=dateOfBirth", 0, 1);
		enterDOB(client, month, day, year);

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set the first and last name
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 * @param fname
	 *           first name
	 * 
	 * @param lname
	 *           last name
	 * 
	 */

	public void setFirstAndLastName(Client client, String fname, String lname) {
		client.elementSendText("NATIVE", "xpath=//*[@id='firstName']", 0, fname);
		client.elementSendText("NATIVE", "xpath=//*[@id='lastName']", 0, lname);
		client.closeKeyboard();

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Select The DateOfBirth from Application Calendar for Create an account
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 * 
	 * @param DOB
	 *            set the Date Of Birth
	 * 
	 * 
	 */

	public void enterDOB(Client client, String mon, String day, String year) {
		clickDOB(client);
		int month = Integer.parseInt(mon);
		int year1 = Integer.parseInt(year);
		int requiredYearIndex = year1 - 1900;
		int requiredMonthIndex = requiredYearIndex * 12 + month - 1;

		client.waitForElement("NATIVE", "xpath=//*[@id='mdtp_date_picker_month_and_day']", 0, 5000);
		client.click("NATIVE", "xpath=//*[@id='mdtp_date_picker_month_and_day']", 0, 1);

		client.elementScrollToTableRow(
				"NATIVE",
				"class=com.wdullaer.materialdatetimepicker.date.SimpleDayPickerView",
				0, requiredMonthIndex);
		waitFor(client, 1);
		client.click("NATIVE", "xpath=//*[@class='com.wdullaer.materialdatetimepicker.date.SimpleDayPickerView']", 0, 1);
		client.clickIn(
				"NATIVE",
				"xpath=//*[@class='com.wdullaer.materialdatetimepicker.date.SimpleMonthView' and contains(@tag,'month="+(month-1)+"')]",
				0, "Inside", "TEXT", day, 0, 0, 0, 1);

		waitFor(client, 1);
		client.click("NATIVE", "xpath=//*[@id='mdtp_ok']", 0, 1);

		waitFor(client,1);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click on DOB
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * 
	 */
	public void clickDOB(Client client) {
		client.click("NATIVE", "xpath=//*[@id='dateOfBirth' and @onScreen='true']", 0, 1);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click on Sign In button
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param click
	 *            true to click
	 *            
	 */

	public void clickSignInButton(Client client, boolean click) {
		if (click) {
			client.waitForElement("NATIVE",	"xpath=//*[@id='appTourImage']", 0,		1000);
			client.click("NATIVE","xpath=//*[@id='signIn']", 0, 1);
			client.waitForElement("NATIVE","xpath=//*[@id='toolbar_actionbar']", 0, 10000);

		} else {
			client.verifyElementFound("NATIVE","xpath=//*[@text='Already have a LibreView account?']", 0);
			client.verifyElementFound("NATIVE", "xpath=//*[@id='signIn']", 0);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Sign In functionality
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param Email
	 *            sending email id
	 *            
	 * @param Pwd
	 *            sending  password
	 *            
	 * @param clickSignIn
	 *            clicking on SignIn if it is true
	 *            
	 */

	public void signInClick(Client client, String Email, String Pwd,
			boolean clickSignIn) {
		client.waitForElement("NATIVE", "text=Sign In", 0, 10000);
		client.verifyElementFound("NATIVE","text=Please enter your LibreView account login.", 0);
		client.elementSendText("NATIVE", "xpath=//*[@id='email']", 0, Email);
		client.elementSendText("NATIVE", "xpath=//*[@id='password']", 0, Pwd);
		if (clickSignIn) {		
			submitSignIn(client);	
		}
	}

	public void submitSignIn(Client client) {
		client.waitForElement("NATIVE", "xpath=//*[@id='submit']", 0, 10000);
		client.click("NATIVE", "xpath=//*[@id='submit']", 0, 1);
		waitForProgress(client);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * click and Accept Terms of Use /Privacy Notice page
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param page
	 *            terms of use or privacy notice page
	 *            
	 */

	public void clickAndAcceptPage (Client client, String page) {
		verifyPageTitles(client,page);
		waitForProgress(client);
		client.waitForElement("NATIVE","xpath=//*[@id='accept'and @onScreen='true']",
				0, 3000);
		client.click("NATIVE","xpath=//*[@id='accept'and @onScreen='true']",0, 1);
		waitFor(client,1);
		client.click("NATIVE", "xpath=//*[@id='checkBox'and @top='true']", 0, 1);
		waitFor(client,1);
		client.click("NATIVE","xpath=//*[@id='button1' and @onScreen='true']",0, 1);
		waitFor(client,2);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Close Running Browser
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void closeRunningBrowser(Client client) {
		String browser = client.getCurrentApplicationName();
		waitFor(client, 5);
		client.applicationClose(browser);
		waitFor(client, 5);

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Enter the static time
	 *
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param hours
	 *			hours to be set
	 *
	 * @param minutes
	 *			minutes to be set
	 * @throws ParseException 
	 * 		Throws ParseException on setting date/time
	 *
	 */

	public void enterStaticTime(Client client, int hours,
			int minutes) throws ParseException {
		client.waitForElement("NATIVE","xpath=//*[@id='debug_sensor_scan_time' and @onScreen='true']",0, 10000);
		String time = hours+":"+minutes;
		client.elementSendText("NATIVE", "xpath=//*[@id='debug_sensor_scan_time']", 0, time);
		waitFor(client, 2);
	}



	/**
	 * Author: NagarajuKasarla/Devi
	 * 
	 * Method to Load Data File From SAS DB using Mock mode
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param sasmode
	 *            Selecting SASMode from Device Debug_sas_mode(Mock1/Mock2)
	 *            
	 * @param folder
	 *          selecting folder name(ADC/ OR Autodated/)           
	 *            
	 * @param jsonfile
	 *            Selecting jsonfile from DataSet list
	 * 
	 */

	public void loadTestData(Client client, String sasmode, String folder,
			String jsonfile) {
		debugDrawerClearData(client);
		//TODO need to remove the default option in new build
		selectingSASMode(client, "DEFAULT");
		selectingSASMode(client, sasmode);
		//TODO Remove the command when it's implemented
		/*client.click("NATIVE", "xpath=//*[@id='debug_sas_mode_edit']",0,1);
		waitFor(client, 1);*/
		if (folder != null) {

			client.click("NATIVE", "xpath=//*[@text='" + folder
					+ "/']", 0, 1);
		}
		waitFor(client, 1);

		if (client
				.waitForElement(
						"NATIVE",
						"xpath=//*[@text='Set Mock Data File' and @id='alertTitle']",
						0, 10000)) {

			if (client.elementSwipeWhileNotFound("NATIVE",
					"id=parentPanel", "Down", 100, 2000, "NATIVE",
					"text=" + jsonfile, 0, 1000, 6, false)) {
			}
			client.click("NATIVE", "text=" + jsonfile, 0, 1);
		}
		waitFor(client, 10);


	}
	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On number of Days Data
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param noOfDays
	 *            Number of days Data
	 * 
	 */

	public void clickOnDays(Client client, int noOfDays) {

		if(noOfDays==90){
			client.click("NATIVE", "xpath=//*[@id='time90' and @hidden='false' and @x>0]", 0, 1);
		}else{
			client.click("NATIVE", "xpath=//*[@id='time"+noOfDays+"' and @onScreen='true']", 0, 1);
		}
		waitFor(client, 5);

	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify default settings
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param Units
	 *            units
	 */
	public void defaultSettings(Client client, String Units) {
		verifyPageTitles(client,"unitOfMeasurementTitle");	
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client,"targetGlucoseRangeTitle");	
		clickOnButtonOption(client, "Next", true);
		verifyPageTitles(client,"carbohydrateUnitsTitle");
		if (Units.equals("grams")) {
			client.click("NATIVE", "text=grams", 0, 1);
		} else {
			client.click("NATIVE", "text=${servings}", 0, 1);
		}
		clickOnButtonOption(client, "Next", true);
		chooseSoundOrVibration(client, "scanSoundsOsDefault");
		clickOnButtonOption(client, "Next", true);
		//TODO
		//	verifyPageTitles(client,"Welcome!");	
		//clickOnButtonOption(client, "Next", true);
		//verifyPageTitles(client,"My Glucose");	
		clickOnButtonOption(client, "Next", true);
		//verifyPageTitles(client,"backgroundGlucoseColorsTitle");
		//clickOnButtonOption(client, "Next", true);
		//verifyPageTitles(client,"Glucose Trend Arrow");	
		/*if (getNAIconConfig().equalsIgnoreCase("yes")) {
		clickOnButtonOption(client, "NEXT", true);
		verifyPageTitles(client,"Treatment Decisions");	
		clickOnButtonOption(client, "NEXT", true);
		verifyPageTitles(client,"Treatment Decisions");	
	}*/
		clickOnButtonOption(client, "Next", true);
		waitForProgress(client);
	}	

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set TargetGlucose Range
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * 
	 * @param low
	 *            Set Target Glucose Low Range
	 * 
	 * @param high
	 *            Set Target Glucose high Range
	 * 
	 */

	public void verifyandsetTGfromSettings(Client client, double low, double high) {
		String lowValue,highValue;
		if(getUnits().contains("mg")){
			lowValue = (int)low+"";
			highValue = (int)high+"";
		}else{
			lowValue = low+"";
			highValue = high+"";
		}
		boolean alreadyTGSet = verifyTargetGlucoseRange(client,lowValue,highValue);
		if(!alreadyTGSet){
			client.click("NATIVE",
					"xpath=//*[@text='Target Glucose Range']", 0, 1);
			waitFor(client, 1);
			setGlucoseRange(client, highValue, lowValue);
			waitFor(client, 1);

			client.click("NATIVE", "id=done", 0, 1);

			if (client
					.isElementFound("NATIVE", "contentDescription=Navigate up", 0)) {
				client.verifyElementFound("NATIVE", "text=" + lowValue + " - " + highValue + " "+ getUnits() +"", 0);
			}
		}
		if (client.isElementFound("NATIVE",
				"contentDescription=Navigate up", 0)) {
			clickOnBackOrMenuIcon(client);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Set Glucose Range
	 * 
	 * @param client
	 *            
	 * @param High
	 *            change High glucose value
	 * @param Low
	 *            change Low glucose value
	 */
	public void setGlucoseRange(Client client, String High, String Low)
	{
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			int highvalue = Integer.parseInt(High);
			int lowvalue = Integer.parseInt(Low);
			if (client.waitForElement("NATIVE",
					"xpath=//*[@text='Target Glucose Range']", 0, 10000)) {
				String str0 = client
						.elementGetText(
								"NATIVE",
								"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
								0);
				System.out.println("==========" + str0);
				String str1 = client
						.elementGetText(
								"NATIVE",
								"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
								0);
				System.out.println("==========" + str1);

				int Prevhighvalue = Integer.parseInt(str1);

				if (highvalue == 180) {
					highvalue = highvalue - 1;
				} else {
					highvalue = highvalue + 1;
				}

				if (lowvalue == 70) {
					lowvalue = lowvalue + 1;
				} else {
					lowvalue = lowvalue - 1;
				}

				if (Prevhighvalue < highvalue) {
					setHighGlucoseRange(client, highvalue, High);
					setLowGlucoseRange(client, lowvalue, Low);
				} else {

					setLowGlucoseRange(client, lowvalue, Low);
					setHighGlucoseRange(client, highvalue, High);
				}

			}

		} else if (getUnits().equalsIgnoreCase("mmol/L")) {
			System.out.println("===================MMOL");
			Double highvalue = Double.parseDouble(High);
			int highvalue1 = (int) (highvalue * 10);
			Double lowvalue = Double.parseDouble(Low);
			int lowvalue1 = (int) (lowvalue * 10);

			if (client.waitForElement("NATIVE",
					"xpath=//*[@text='Target Glucose Range']", 0, 10000)) {
				String str0 = client
						.elementGetText(
								"NATIVE",
								"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeLow']]",
								0);
				System.out.println("==========" + str0);
				String str1 = client
						.elementGetText(
								"NATIVE",
								"xpath=//*[@id='numberpicker_input' and ./parent::*[@id='rangeHigh']]",
								0);
				System.out.println("==========" + str1);

				Double Prevhighvalue = Double.parseDouble(str1);

				if (High == "10.0") {
					highvalue1 = 99;
				} else {
					highvalue1 = highvalue1 + 1;
				}


				if (lowvalue == 3.9) {
					lowvalue1 = lowvalue1 + 1;
				} else {
					lowvalue1 = lowvalue1 - 1;
				}

				if (Prevhighvalue <= highvalue) {
					System.out.println("=========");
					setHighGlucoseRange(client, highvalue1, High);
					setLowGlucoseRange(client, lowvalue1, Low);
				} else {
					System.out.println("***************");
					setLowGlucoseRange(client, lowvalue1, Low);
					setHighGlucoseRange(client, highvalue1, High);
				}

			}

		}


	}


	/**
	 * Author: NagarajuKasarla/Devi
	 * 
	 * Set Glucose Range
	 * 
	 * @param client
	 *            
	 * @param highvalue
	 *            give high value
	 * @param High
	 *            change High glucose value
	 */
	public void setHighGlucoseRange(Client client, int highvalue, String High)
	{
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeHigh']", 0,
				"view.setValue(" + highvalue + ");");
		if (getUnits().equalsIgnoreCase("mg/dL") && High.equals("180")||getUnits().equalsIgnoreCase("mmol/L") && High.equals("10.0")) {
		//to overcome refresh issue to get low values
			client.elementSwipe("NATIVE", "xpath=//*[@id='rangeHigh']", 0, "Up", 300, 1000);
			client.elementSwipe("NATIVE", "xpath=//*[@id='rangeHigh']", 0, "Down", 150, 1000);
			waitFor(client, 3);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']", 0, "Inside", "NATIVE", "xpath=//*[@id='numberpicker_input' and @text='"+High+"']", 0, 0, 0, 1);
			
		}
		else {
			waitFor(client, 4);
			client.elementSwipe("NATIVE","xpath=//*[@id='numberpicker_input']", 1, "Down", 300, 2000);
			waitFor(client, 4);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeHigh']", 0, "Inside", "NATIVE", "xpath=//*[@id='numberpicker_input' and @text='"+High+"']", 0, 0, 0, 1);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Set Glucose Range
	 * 
	 * @param client
	 *            
	 * @param lowvalue
	 *            give low value
	 * @param Low
	 *            change Low glucose value
	 */
	public void setLowGlucoseRange(Client client, int lowvalue, String Low)
	{
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='rangeLow']", 0,
				"view.setValue(" + lowvalue + ");");

		if (getUnits().equalsIgnoreCase("mg/dL") && Low.equals("70")||getUnits().equalsIgnoreCase("mmol/L") && Low.equals("3.9")) {
			client.elementSwipe("NATIVE", "xpath=//*[@id='rangeHigh']", 0, "Down", 300, 1000);
			client.elementSwipe("NATIVE", "xpath=//*[@id='rangeLow']", 0, "Up", 150, 1000);
			waitFor(client, 3);
			client.clickIn("NATIVE", "xpath=//*[@id='rangeLow']", 0, "Inside", "NATIVE", "xpath=//*[@id='numberpicker_input' and @text='"+Low+"']", 0, 0, 0, 1);

		} else {
			waitFor(client, 4);
			// pixel was changed from 150 to 300
			client.elementSwipe("NATIVE", "id=numberpicker_input", 0, "Up", 300, 2000);
			waitFor(client, 3);
			client.clickIn("NATIVE", "id=rangeLow", 0, "Inside", "NATIVE", "xpath=//*[@id='numberpicker_input' and @text='"+Low+"']", 0, 0, 0, 1);

		}
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Target glucose range value
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param low
	 *            Target Glucose Low Range
	 * 
	 * @param high
	 *            Target Glucose high Range
	 * @return verifyTG
	 * 		return true/false for TG validation
	 */

	public boolean verifyTargetGlucoseRange(Client client, String low,
			String high) {
		boolean alreadySet = false;
		System.out.println("'" + low + " - " + high + " " + getUnits() + "'");
		if (client.isElementFound("NATIVE", "text=" + low + " - " + high + " "
				+ getUnits(), 0)) {

			alreadySet = true;
		}

		return alreadySet;

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click clear data in debug drawer
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void debugDrawerClearData(Client client) {
		openDebugDrawer(client);
		if(client.isElementFound("NATIVE", "xpath=//*[@id='debug_sensor_clear_data' and @text='Clear Data' and @enabled='true']", 0)){
			waitFor(client, 1);
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='debug_sensor_clear_data' and @text='Clear Data']",
					0);
			client.click(
					"NATIVE",
					"xpath=//*[@id='debug_sensor_clear_data' and @text='Clear Data']",
					0, 1);
			client.waitForElementToVanish("NATIVE", "xpath=//*[@text='LibreLink Debug' and @onScreen='true']", 0, 10000);
			waitFor(client, 3);
		}else
		{
			closeDebugDrawer(client);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Change Language in Device
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 */
	public void changeLanguageAndRegioninDevice(Client client) {
		setInputLanguage(client,getLanguageFileName());
		changeLanguageinDevice(client,getLanguage());
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Change Language in Device
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * 
	 */
	public void openSettings(Client client) {
		client.run("adb shell am start -n 'com.android.settings/.Settings'");
		waitFor(client, 1);
		if (!client.isElementFound("NATIVE", "xpath=//*[@id='Settings']", 0)) {
			client.run("adb shell am start -a android.settings.SETTINGS");

		}
		waitFor(client, 2);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Change Language in Device
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *            
	 * @param tobeSetLanguage
	 *          set the language            
	 */
	public void changeLanguageinDevice(Client client, String tobeSetLanguage) {
		client.run("adb shell am start -a android.intent.action.MAIN -n com.android.settings/.LanguageSettings");
		waitFor(client, 3);
		if (getDeviceOSVer().contains("7.")) {
			client.click("NATIVE", "id=summary", 0, 1);
			waitFor(client, 3);
			int size = client.getElementCount("NATIVE", "xpath=//*[@class='android.widget.RelativeLayout']");
			if(size>1){
				for (int i=1; i<size; i++){
					client.click("NATIVE", "xpath=//*[@class='android.widget.Button']", 0, 1);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@id='checkbox']", 0, 1);
					waitFor(client, 1);
					client.waitForElement("NATIVE", "xpath=//*[@class='android.widget.Button']", 0, 5000);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@class='android.widget.Button']", 0, 1);
					waitFor(client, 1);
					client.waitForElement("NATIVE", "xpath=//*[@id='button1']", 0, 5000);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@id='button1']", 0, 1);
					waitFor(client, 2);
				}
			}
			String count;
			count = client.elementGetText("NATIVE","xpath=//*[@id='label']", 0);

			if(count.contains(tobeSetLanguage)){
				client.deviceAction("Back");
			}else{
				client.click("NATIVE", "xpath=//*[@id='add_language']", 0, 1);
				String country= null;
				String lang= null;
				if (tobeSetLanguage.contains(")")){
					String[] parts = tobeSetLanguage.split("\\(");
					lang = parts[0].trim(); 
					country = parts[1]; 
					country = country.replace(")", "");
					System.out.println(lang);
				}
				else{
					lang=tobeSetLanguage;
					country=null;        
				}
				waitFor(client, 1);
				client.elementSwipeWhileNotFound("NATIVE","xpath=//*[@id='listContainer']", "Down", 400, 2000,
						"NATIVE", "xpath=//*[@text='"+lang+"']", 0, 1000, 4, false);
				waitFor(client, 1);
				client.click("NATIVE", "xpath=//*[@id='locale' and @text='"+lang+"']",0, 1, -500, 0);
				waitFor(client, 1);
				if(country!=null){
					client.waitForElement("NATIVE", "xpath=//*[@id='section_header']", 0, 5000);
					client.elementSwipeWhileNotFound("NATIVE","xpath=//*[@id='listContainer']", "Down", 400, 2000,
							"NATIVE", "xpath=//*[@text='"+country+"']", 0, 1000, 4, false);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@id='locale' and @text='"+country+"']", 0, 1, -500, 0);
				}
				while(!client.elementGetText("NATIVE", "xpath=//*[@id='label']", 0).contains(tobeSetLanguage)){
					client.click("NATIVE", "xpath=//*[@class='android.widget.Button']", 0, 1);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@id='checkbox']", 0, 1);
					waitFor(client, 1);
					client.waitForElement("NATIVE", "xpath=//*[@class='android.widget.Button']", 0, 5000);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@class='android.widget.Button']", 0, 1);
					waitFor(client, 1);
					client.waitForElement("NATIVE", "xpath=//*[@id='button1']", 0, 5000);
					waitFor(client, 1);
					client.click("NATIVE", "xpath=//*[@id='button1']", 0, 1);
					waitFor(client, 2);


				}
				client.deviceAction("Back");
				client.deviceAction("Back");
			}

		}
		else{
			String str0 = client.elementGetText("NATIVE", "id=summary", 0);


			if (!str0.contains(tobeSetLanguage)) {
				client.click(
						"NATIVE",
						"xpath=(//*[@class='android.widget.ListView']/*/*[@class='android.widget.RelativeLayout'])[1]",
						0, 1);
				waitFor(client, 1);
				client.elementSwipeWhileNotFound("NATIVE","class=android.widget.ListView", "Down", 400, 2000,
						"NATIVE", "xpath=//*[@text='"+tobeSetLanguage+"']", 0, 1000, 20, true);
				client.waitForElement("NATIVE", "id=summary", 0, 5000);


			}
			if(!client.isElementFound("NATIVE", "id=summary")){
				client.deviceAction("Back");
			}
			str0 = client.elementGetText("NATIVE", "id=summary", 0);
			if (!str0.contains(tobeSetLanguage)){
				throw null;
			}

		}
		System.out
		.println("*************Language Changed !!! *************");
		if(client.isElementFound("NATIVE", "id=button1", 0)){
			client.click("NATIVE", "id=button1", 0, 1);
		}
	}

	/**
	 * Author: NagarajuKasarla/Devi
	 *
	 * Method to Set Default Target glucose range
	 *
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void cleanUpForTG(Client client)  {
		clickOnSettingsMenu(client, "App Settings");
		if (getUnits().equals("mg/dL")) {
			verifyandsetTGfromSettings(client, 100, 140);
		} else if (getUnits().equals("mmol/L")) {
			verifyandsetTGfromSettings(client, 5.6, 7.8);
		}
		navigateToScreen(client, "Home");
	}

	/**
	 * Author: NagarajuKasarla/Devi
	 * 
	 * Set Time Zone in Device settings
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param zone
	 *            Set Zone
	 */
	public void changeTimeZone(Client client, String zone) {
		automaticDateAndTime(client, false);
		automaticDateAndTimeZone(client, false);

		if (getDeviceOSVer().contains("7.")) {
			openDateTimeSettings(client);
		}else{
			openPhoneSettings(client);
			client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='content']",
					"Down", 200, 2000, "NATIVE", "partial_text=Date", 0, 1000, 5,
					true);
			client.sleep(1000);
		}
		client.waitForElement("NATIVE", "text=Select time zone", 0, 10000);
		String str0 = client.elementGetText("NATIVE",
				"xpath=//*[@id='summary' and contains(@text,'GMT')]", 0);
		System.out.println("str0=="+str0);
		if (!str0.contains(getZone(zone))) {
			client.click("NATIVE", "text=Select time zone", 0, 1);
			client.sleep(2000);
			client.elementSwipeWhileNotFound("NATIVE",
					"xpath=//*[@class='android.widget.ListView']", "Up", 600,
					1000, "NATIVE", "xpath=//*[@text='Midway']", 0, 1000, 15,
					false);
			client.sleep(1000);
			if (zone.equalsIgnoreCase("America/Denver")) {
				client.run("adb shell input swipe 300 300 0 10000");
				/*client.elementSwipeWhileNotFound("NATIVE",
						"xpath=//*[@class='android.widget.ListView']", "Down",
						600, 1000, "NATIVE", "xpath=//*[@text='"
								+ getZone(zone) + "']", 1, 1000, 15, true);*/
				client.sleep(500);
				if(!client.isElementFound("NATIVE","xpath=//*[@id='summary']",0)){
					client.click("NATIVE", "xpath=//*[@text='"+getZone(zone)+ "']", 1, 1);
				}
			} else if(getZone(zone).equals("GMT-05:00"))
			{
				client.elementSwipeWhileNotFound("NATIVE",
						"xpath=//*[@class='android.widget.ListView']", "Down",
						600, 1000, "NATIVE", "xpath=//*[@text='"+ getZone(zone) + "']", 1, 1000, 15, true);
				client.sleep(1000);
				if(!client.isElementFound("NATIVE","xpath=//*[@id='summary']",0)){
					client.click("NATIVE", "xpath=//*[@text='"+ getZone(zone) + "']", 0, 1);
				}
			}
			else{
				client.elementSwipeWhileNotFound("NATIVE",
						"xpath=//*[@class='android.widget.ListView']", "Down",
						600, 1000, "NATIVE", "xpath=//*[@text='"
								+ getZone(zone) + "']", 0, 1000, 15, true);
				client.sleep(1000);
				if(!client.isElementFound("NATIVE","xpath=//*[@id='summary']",0)){
					client.click("NATIVE", "xpath=//*[@text='"+getZone(zone)+ "']", 0, 1);
				}
			}
		}
		client.sleep(2000);
		String str1 = client.elementGetText("NATIVE",
				"xpath=//*[@id='summary' and contains(@text,'GMT')]", 0);
		Assert.assertTrue(str1.contains(getZone(zone)));
		System.out.println("*************Time Zone Changed !!! *************");
		client.sleep(20000);
		if (getDeviceOSVer().contains("7.")) {
			client.deviceAction("Back");
		}
		//TODO why do we need this automaticDateAndTime(client, true);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Enable/disable Automatic DateAndTime Zone
	 * 
	 * @param client
	 *            
	 * @param on
	 *            true to on
	 */
	public void automaticDateAndTimeZone(Client client, boolean on) {
		if (on) {
			client.run("adb shell settings put global auto_time_zone 1");
		} else {
			client.run("adb shell settings put global auto_time_zone 0");
		}

	}

	/**
	 * Author: Devi
	 * 
	 * Close Running Application
	 * 
	 * @param client
	 *            
	 */

	public void closeRunningApplication(Client client) {
		client.applicationClose(getapkPackage());
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Get Zone Time As GMT format
	 * 
	 * @param zone
	 *            Set Zone

	 */
	public String getZone(String zone) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		Date date = c.getTime();
		TimeZone tz = TimeZone.getTimeZone(zone);
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
				- TimeUnit.HOURS.toMinutes(hours);
		minutes = Math.abs(minutes);
		if (tz.inDaylightTime(date)) {
			hours = hours + 1;
		}
		String timeZoneString;
		String hr = null;
		if (hours > 0) {
			hr = "0" + hours;
		} else if (hours <= -10) {
			hr = "" + hours;
		} else {
			String newhr = String.valueOf(hours);
			hr = newhr.replace("-", "-0");
		}

		if (hours > 0) {
			timeZoneString = String.format("GMT+%s:%02d", hr, minutes);
		} else {

			timeZoneString = String.format("GMT%s:%02d", hr, minutes);
		}
		System.out.println("timeZoneString===" +timeZoneString);
		return timeZoneString;
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to get the Device date
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @throws ParseException
	 * 		Throws parse exception for setting date
	 * @return date
	 * 		Returns device date
	 */
	public Date getDeviceDate(Client client) throws ParseException {

		String systemDateTime = client.getDeviceProperty("device.time");
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = ft.parse(systemDateTime);
		ft.applyPattern("EEE MMM d HH:mm:ss z yyyy");
		System.out.println(date);
		return date;

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 * Method ot Get the date format
	 *
	 * @param dateString
	 *        set the date for dateformat
	 *         
	 * @throws ParseException
	 * 			Throws Parse exception for date selection
	 * @return date
	 * 		Returns the date
	 */
	public Date getDateFormat(String dateString) throws ParseException {

		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		Date date = ft.parse(dateString);
		ft.applyPattern("EEE MMM d HH:mm:ss z yyyy");
		System.out.println(date);
		return date;

	}

	/**
	 * Author: NagarajuKasarla
	 *
	 *  Method to Picks the selected date in calendar
	 *  
	 * @param client
	 *            Integrate SeeTestAutomation
	 *
	 * @param date
	 *            check current date
	 * @throws ParseException
	 * 			Throws Parse exception for date selection
	 */
	public void pickDate(Client client, Date date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
		String monthTitle = dateFormat.format(date);
		SimpleDateFormat dayformat = new SimpleDateFormat("dd");
		int day = Integer.parseInt(dayformat.format(date));
		String appCalendarDate = client.elementGetText("NATIVE",
				"xpath=//*[@id='calendarpicker_title']", 0);
		DateFormat appFormat;
		String direction = "up";
		if (!getCountryCode().contains("United Kingdom")&&getLanguage().contains("English")) {
			appFormat = new SimpleDateFormat("MMMMM d, yyyy");

			if (appFormat.parse(appCalendarDate).before(date)) {

				direction = "down";
			}

		} else if (getCountryCode().contains("United Kingdom")) {
			appFormat = new SimpleDateFormat("d MMMMM yyyy");
			if (appFormat.parse(appCalendarDate).before(date)) {

				direction = "down";
			}

		}

		if(!client.isElementFound("NATIVE", "xpath=//*[@id='calendar_grid' and ./preceding-sibling::*[@text='"+monthTitle+"']]", 0)){
			client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='calendarpicker_picker']", direction, 300, 1000, "NATIVE", "xpath=//*[@id='calendar_grid' and ./preceding-sibling::*[@text='"+monthTitle+"']]", 0, 0, 3, false);
		}
		client.clickIn("NATIVE", "xpath=//*[@id='calendar_grid' and ./preceding-sibling::*[@text='"+monthTitle+"']]", 0, "Inside", "NATIVE", "xpath=//*[@text='"+day+"' and @enabled='true']", 0, 0, 0, 1);
		waitFor(client, 1);
		//TODO need to very if the date is picked correctly
	}



	/**
	 * Author: NagarajuKasarla
	 *
	 * Method to Verify previous date is displayed
	 *
	 * @param client
	 *         Integrate SeeTestAutomation 
	 *
	 * @param date
	 *            check current date
	 *            
	 * @throws ParseException
	 * 		Throws parse exception for date selection
	 */
	//TODO check if date format is different based on Language
	public void verifyPickedDateIsDisplayed(Client client, Date date)
			throws ParseException {
		if (!getCountryCode().contains("United Kingdom")&&getLanguage().contains("English")) {
			DateFormat deviceFormat = new SimpleDateFormat("MMMMM d, yyyy");
			String appDate = deviceFormat.format(date);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='logbook_date_text' and @text = '" + appDate
					+ "']", 0);
		} else if (getCountryCode().contains("United Kingdom")) {
			DateFormat deviceFormat = new SimpleDateFormat("d MMMMM yyyy");
			String appDate = deviceFormat.format(date);
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='logbook_date_text' and @text = '" + appDate
					+ "']", 0);
		}

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Navigate To MyGlucose Page
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * 
	 */
	public void navigateToMyGlucosePage(Client client) {
		waitFor(client,2);
		if (!client.isElementFound("NATIVE", "xpath=//*[@id='scan_result_detail']", 0)) {
			client.click("Native",
					"xpath=//*[@id='sensorStatus' and @text='Ready to Scan']", 0, 1);
		} else{
			openDebugDrawer(client);
			scanMockSensor(client, null);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify GlucoseValue and Units in My Glucose
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 * @param glucoseValue
	 *           set the Scanned glucose value
	 */
	public void verifyGlucoseValueandUnitsMyGlucose(Client client,
			String glucoseValue) {
		client.waitForElement("NATIVE","text=${myGlucoseExplanationTitle}", 0, 1000);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='"
				+ glucoseValue + "']", 0);
		if (!(glucoseValue.equals("HI") || glucoseValue.equals("LO"))) {
			client.verifyElementFound("NATIVE", "xpath=//*[@text='"+ getUnits() + "']", 0);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to click on the Notes or Timezone in the  graph
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * @param element
	 *            notes/timezone
	 * @param index
	 * 				position of the element in the graph
	 */	
	public void clickOnNotesorTimeZoneorBG(Client client, String element, int index) {
		if(element.contains("note")){
			client.click("NATIVE", "xpath=//*[@id='note_icon' and @onScreen='true']", index, 1);
		}else{
			client.click(
					"NATIVE",
					"xpath=//*[@class='com.librelink.app.ui.widget.mpchart.datadecorators.TimeZoneDecorator']",
					index, 2);
		}

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Get Zone Time As GMT format
	 * 
	 * @param zone
	 *            Set the Zone
	 * @return timezoneValue
	 * 		Returns time zone value
	 */
	public String getTimeZoneValue(String zone) {
		String timeZoneString;
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		Date date = c.getTime();
		TimeZone tz = TimeZone.getTimeZone(zone);
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
				- TimeUnit.HOURS.toMinutes(hours);
		minutes = Math.abs(minutes);
		if (tz.inDaylightTime(date)) {
			hours = hours + 1;
		}
		String hr = null;
		if (hours > 0) {
			hr = "0" + hours;
		} else if (hours <= -10) {
			hr = "" + hours;
		} else {
			String newhr = String.valueOf(hours);
			hr = newhr.replace("-", "-0");
		}
		if (hours > 0) {
			timeZoneString = String.format("GMT+%s:%02d", hr, minutes);
		} else {

			timeZoneString = String.format("GMT%s:%02d", hr, minutes);
		}

		return timeZoneString;



	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to Click Back button From MyGlucose page
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickBackFromMyGlucose(Client client) {
		if(client.isElementFound("NATIVE", "text=${myGlucoseExplanationTitle}", 0)){
			clickOnBackOrMenuIcon(client);
		}		
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify LogBook Detail Page for Insulin Note
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *           
	 * @param insulinType
	 *            set the insulin type
	 *            
	 * @param insulinUnit
	 *            set the insulin Units
	 */
	public void verifyInsulinLogBookDetailPage(Client client,
			String insulinType, String insulinUnit) {
		String value = getLangPropValue(insulinType);
		if(insulinUnit!=null){
				if ((insulinUnit.equals("1"))) {
					value = value+" ("+getLangPropValue("insulinUnits_singular").replace("%1$s", "1")+")";
				} else {
					value = value+" ("+getLangPropValue("insulinUnits_plural").replace("%1$s", insulinUnit)+")";

				}
			}
			client.verifyElementFound("NATIVE", "xpath=//*[@id='lbdetail_note_description' and contains(@text,'"+value+"')]", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click on Created Note
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param notetimeorValue
	 *            set the notetime or Value
	 */
	public void clickCreatedNote(Client client, String notetime) {
		waitFor(client, 3);
		notetime=setAMPM(client,notetime);
		waitFor(client,2);
		if(!client.isElementFound("NATIVE", "xpath=//*[@text='" + notetime + "']", 0)){
			client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='logbook_list' and @class='android.widget.ListView' and @onScreen='true']", "Down", 0, 2000, "NATIVE", "xpath=//*[@id='value' and @text='"+notetime+"' and @class='android.support.v7.widget.AppCompatTextView']", 0, 1000, 5, false);
		}	
		waitFor(client,2);
		client.click("NATIVE", "xpath=//*[@text='"+notetime+"']", 0, 1);
		waitFor(client,2);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click On Calendar Date On Application Calendar
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */

	public void clickOnCalendarDate(Client client) {
		if (client.isElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView' and @onScreen='true']", 0)) {
			client.click("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatImageView' and @onScreen='true']", 0, 1);
			waitFor(client,2);
		}
	}


	/**
	 * Author: ShabinaSherif
	 *
	 * Method to Get the date format
	 *
	 * @param noOfdayFromCurrent
	 *           date from current day
	 *           
	 * @throws ParseException
	 * 			Throws parse exception on setting date
	 * @return Date
	 * 		Returns the date in right format
	 */
	public Date getDateFormatFromPastNoOfDays(int noOfdayFromCurrent) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.add( Calendar.DAY_OF_YEAR, noOfdayFromCurrent);
		Date dateBefore = cal.getTime();
		System.out.println(dateBefore);
		return dateBefore;

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Food in LogBook Detail Page
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 *           
	 * @param mealType
	 *            set the meal type(breakfast/lunch/dinner/snack)
	 *            
	 * @param carbUnit
	 *            set the carbohydrate units
	 *            
	 * @param carbAmount
	 *            set the Amount of Carbohydrates
	 */
	public void verifyFoodInLogBookDetailPage(Client client, String mealType,
			String carbUnit, String carbAmount) {
		String value=null;
		if(mealType!=null){
			value = getLangPropValue(mealType);
		}else{
			value = getLangPropValue("food");
		}
		if (carbUnit.equals("grams")) {
			value = value+" ("+carbAmount+getLangPropValue("gramsSymbol")+")";

		} else if (carbUnit.equals("servings") || carbUnit.equals("portions")) {
			value = value+" ("+carbAmount+getLangPropValue("servingsSymbol")+")";

		}
		client.verifyElementFound("NATIVE", "xpath=//*[@id='lbdetail_note_description' and contains(@text,'"+value+"')]", 0);
	}




	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Exercise Note with Intensity with set time on LogBook Detail Page
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 *           
	 * @param intensity
	 *            set intensity
	 * @param hr
	 *            set hour
	 * @param min
	 *            set minute
	 */	
	public void verifyExerciseIntensityInLogBookDetailPage(Client client,
			String intensity, int hr, int min) {
		String hour=Integer.toString(hr);
		String minute=Integer.toString(min);
		String text=null;
		if (minute.equals("0")) {
			if (hour.equals("1")) {

				String abbrevDurationHrs_singular = getLangPropValue("abbrevDurationHrs_singular");
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationHrs_singular+ ")";
			} else {

				String abbrevDurationHrs_plural = getLangPropValue("abbrevDurationHrs_plural");
				abbrevDurationHrs_plural = abbrevDurationHrs_plural.replace(
						"%d", hour);
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationHrs_plural+ ")";
			}

		} else if (hour.equals("0")) {
			if (minute.equals("1")) {

				String abbrevDurationMins_singular = getLangPropValue("abbrevDurationMins_singular");
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationMins_singular+ ")";
			} else {
				String abbrevDurationMins_plural = getLangPropValue("abbrevDurationMins_plural");
				abbrevDurationMins_plural = abbrevDurationMins_plural.replace(
						"%d", minute);
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationMins_plural+ ")";
			}
		} else {

			if (minute.equals("1") && (hour.equals("1"))) {
				String abbrevDurationHrs_singular = getLangPropValue("abbrevDurationHrs_singular");
				String abbrevDurationMins_singular = getLangPropValue("abbrevDurationMins_singular");
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationHrs_singular+ " " + abbrevDurationMins_singular + ")";
			} else if (minute.equals("1")) {
				String abbrevDurationHrs_plural = getLangPropValue("abbrevDurationHrs_plural");
				abbrevDurationHrs_plural = abbrevDurationHrs_plural.replace(
						"%1$d", hour);
				String abbrevDurationMins_singular = getLangPropValue("abbrevDurationMins_singular");
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationHrs_plural+ " " + abbrevDurationMins_singular + ")";
			} else if (hour.equals("1")) {
				String abbrevDurationHrs_singular = getLangPropValue("abbrevDurationHrs_singular");
				String abbrevDurationMins_plural = getLangPropValue("abbrevDurationMins_plural");
				abbrevDurationMins_plural = abbrevDurationMins_plural.replace(
						"%d", minute);
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationHrs_singular+ " " + abbrevDurationMins_plural + ")";
			} else {
				String abbrevDurationHrs_plural = getLangPropValue("abbrevDurationHrs_plural");
				abbrevDurationHrs_plural = abbrevDurationHrs_plural.replace(
						"%d", hour);
				String abbrevDurationMins_plural = getLangPropValue("abbrevDurationMins_plural");
				abbrevDurationMins_plural = abbrevDurationMins_plural.replace(
						"%d", minute);
				text=getLangPropValue("exercise")+" "+intensity+" Intensity (" + abbrevDurationHrs_plural+ " " + abbrevDurationMins_plural + ")";
			}
		}
		client.verifyElementFound("NATIVE", "xpath=//*[@id='lbdetail_note_description' and contains(@text,'"+text+"')]", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Carbohydrate Options
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */

	public void verifyCarbohydrateOptions(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@class='UIImageView' and ./parent::*[@class='UITableViewCellContentView'] and ./following-sibling::*[@text='${grams}']]", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@class='UIImageView' and ./parent::*[@class='UITableViewCellContentView'] and ./following-sibling::*[@text='${servings}']]", 0); 
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click on Edit Icon Button
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickEditConfIcon(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@id='debug_sensor_edit_config' and @onScreen='true']", 0);
		client.click("NATIVE", "xpath=//*[@id='debug_sensor_edit_config' and @onScreen='true']", 0, 1);
	}

	/**
	 * Author: Amaresh
	 * 
	 * Method to verify food entry
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param mealType
	 *            set the meal type(breakfast/lunch/dinner/snack)
	 *            
	 * @param carbUnit
	 *            set the carbohydrate units
	 *            
	 * @param carbAmount
	 *            set the Amount of Carbohydrates
	 */
	//	
	public void verifyFoodEntry(Client client, String mealType,
			String carbUnit, String carbAmount) {
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + mealType
				+ "' and @top='true']", 0);
		if (carbUnit.equals("grams")) {
			client.verifyIn("NATIVE", "xpath=//*[@text='" + carbAmount
					+ "' and @class='android.support.v7.widget.AppCompatEditText']", 0, "Right", "NATIVE",
					"text=${gramsOfCarbs}", 0, 0);
		} else {
			client.verifyIn("NATIVE", "xpath=//*[@text='" + carbAmount
					+ "' and @class='android.support.v7.widget.AppCompatEditText']", 0, "Right", "NATIVE",
					"text=${servingsOfCarbs}", 0, 0);

		}

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Scroll To Bottom of Add Note Page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */
	public void scrollToBottomAddNotePage(Client client) {
		waitFor(client, 2);
		client.runNativeAPICall("NATIVE", "xpath=//*[@class='android.widget.ScrollView']", 0, "view.scrollTo(0, 99999);");
	}

	/**
	 * Author: Devi
	 * 
	 * Method for Unselect Note Attribute
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param attribute
	 *  	   set the Attribute
	 * 
	 */
	public void unSelectNoteAttribute(Client client, String attribute) {
		if(!client.isElementFound("NATIVE", "xpath=//*[contains(@id,'"+attribute+"') and @knownSuperClass='android.widget.CheckBox' and @checked='false']", 0)){
			client.click(
					"NATIVE",
					"xpath=//*[contains(@id,'"+attribute+"') and @knownSuperClass='android.widget.CheckBox']", 0, 1);
			waitFor(client, 1);
		}

	}/**
	 * Author: NagarajuKasarla/Devi(not deleted)
	 * 
	 * Method for select Note Attribute
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param attribute
	 *  	   set the Attribute
	 * 
	 */
	public void selectNoteAttribute(Client client, String attribute) {
		if(client.isElementFound("NATIVE", "xpath=//*[contains(@id,'"+attribute+"') and @knownSuperClass='android.widget.CheckBox' and @checked='false']", 0)){
			client.click(
					"NATIVE",
					"xpath=//*[contains(@id,'"+attribute+"') and @knownSuperClass='android.widget.CheckBox']", 0, 1);
			waitFor(client, 1);
		}

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Click and Set food Attribute
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param foodType
	 *           Enter the Food Type
	 *           
	 * @param value
	 *         Enter value of carbohydrates
	 */

	public void clickAndSetFoodAttribute(Client client, String foodType,
			String value) {
		selectNoteAttribute(client, "food");
		waitFor(client, 2);
		if(foodType!=null){		
			String str0 = client.elementGetText(
					"NATIVE",
					"xpath=//*[@id='text1' and ./parent::*[@id='spinner_food_type']]",
					0);
			if (!str0.equalsIgnoreCase(foodType)) {
				client.verifyElementFound("NATIVE", "id=spinner_food_type", 0);
				client.click("NATIVE", "id=spinner_food_type", 0, 1);
				waitFor(client, 2);
				client.click("NATIVE", "text=${"+foodType+"}", 0, 1);
			}
			if (value!=null) {
				setAndGetCarbAmount(client, value);
			}
		}
		client.closeKeyboard();

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Get the Calendar date
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *            
	 * @throws ParseException
	 * 				Throws Parse exception on settings date
	 * @return date
	 * 		Return date in string format
	 */
	public String getCalendarDateForLogbook(Client client) throws ParseException {
		String systemDateTime = client.elementGetText("NATIVE",
				"xpath=//*[@id='logbook_date_text' and @textColor='0xFFFFFF']", 0);
		SimpleDateFormat deviceFormat = new SimpleDateFormat("MMMMM d, yyyy");
		Date d = deviceFormat.parse(systemDateTime);
		deviceFormat.applyPattern("EEE, d MMM");
		String devicedate = deviceFormat.format(d);
		return devicedate;


	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Set LogBook Time
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * 
	 * @param date
	 *            Set the date
	 *            
	 * @param logbookTime
	 *            Set the logbookTime
	 *            
	 * @throws ParseException
	 *			Throws parse exception on settings date
	 */
	public void setLogBookTime(Client client, int logBookHour,
			int logBookMin, String logBookAmPm) {

		client.runNativeAPICall("NATIVE", "xpath=//*[@id='mdtp_time_picker']", 0, 
				"view.setTime(new com.wdullaer.materialdatetimepicker.time.Timepoint(" + logBookHour + "," + logBookMin + "))");
		waitFor(client, 1);
		if(logBookAmPm!=null){
			if (logBookAmPm.equalsIgnoreCase("AM")) {
				client.runNativeAPICall("NATIVE", "xpath=//*[@id='mdtp_time_picker']", 0, "view.setAmOrPm(0)");

			} else if (logBookAmPm.equalsIgnoreCase("PM")) {

				client.runNativeAPICall("NATIVE", "xpath=//*[@id='mdtp_time_picker']", 0, "view.setAmOrPm(1)");

			}
		}
		waitFor(client, 1);
		client.click("NATIVE", "xpath=//*[@id='mdtp_ok']", 0, 1);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify LogBookDetail Page NotesContent
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *            
	 * @param content
	 *            Set the content
	 *            
	 */
	public void verifyLogBookDetailPageNotesContent(Client client, String content){
		if(content.contains("svg")&&getUnits().contains("mmol/L")){ 
			content=content.replace("svg", "ptn");
			client.verifyElementFound("NATIVE", "xpath=//*[@id='lbdetail_note_description' and contains(@text,'"+content+"')]", 0);
		}else{
			client.verifyElementFound("NATIVE", "xpath=//*[@id='lbdetail_note_description' and contains(@text,'"+content+"')]", 0);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *  Method to Create New Note
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 * 
	 * @param date
	 *        set the date for new Note
	 *        
	 * @param time
	 *         set the time for new Note
	 *         
	 * @throws ParseException
	 * 			Throws Parse exception on setting date
	 */
	public void createNewNote(Client client,int logBookHour,
			int logBookMin, String logBookAmPm) throws ParseException {
		clickAddNote(client);
		setLogBookTime(client, logBookHour, logBookMin, logBookAmPm);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *   Method to Verify Glucose Units
	 *   
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void verifyGlucoseUnits(Client client) {
		waitFor(client, 2);
		client.verifyElementFound("NATIVE", "partial_text="+getUnits(), 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify LastScan In HomePage
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param value
	 *         Sending the Scan value
	 */

	public void verifyLastScanInHomePage(Client client,String value) {
		client.waitForElement("NATIVE","xpath=//*[@id='last24' and @onScreen='true']", 0, 10000);
		if (value.equals("HI") || value.equals("LO")) {
			client.verifyElementFound("NATIVE", "xpath=//*[@text='"+value+"' and ./parent::*[@id='last_scan']]", 0);
		} else {	
			client.verifyElementFound("NATIVE",
					"contentDescription=Last Scan: " + value, 0);
			verifyLastScanUnitsInHomePage(client);
		}
	}	

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify LastScan Units In HomePage
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 */
	public void verifyLastScanUnitsInHomePage(Client client) {
		String[] units=getUnits().split("/");
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@text='"
						+ units[0]
								+ "' and ./parent::*[./parent::*[./parent::*[@id='last_scan']]]]",
								0);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@text='"
						+ units[1]
								+ "' and ./parent::*[./parent::*[./parent::*[@id='last_scan']]]]",
								0);
	}
	
	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method for Calculate and enter details in "Edit Sensor Config" dialog box
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *                       
	 * @param days
	 *            add or decrease date
	 * @param hours
	 *            add or decrease hours
	 * @param minutes
	 *            add or decrease minutes
	 * @param sensorType
	 * 				10 day or 14 day sensor
	 * @throws ParseException 
	 * 			Throws Parse Exception for settings date/time
	 */

	public void editConfiguration(Client client, int days, int hours, int minutes,String sensorType) throws ParseException 
	{
		openDebugDrawer(client);
		clickEditConfIcon(client);

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Calendar cal = Calendar.getInstance();
		String scanDate = client.elementGetText("NATIVE",
				"xpath=//*[@id='debug_sensor_activation_date' and @onScreen='true']", 0);
		String[] date = scanDate.split("-");
		int a = Integer.parseInt(date[0]);
		int b = Integer.parseInt(date[1]);
		int c = Integer.parseInt(date[2]);
		cal.set(Calendar.YEAR, a);
		cal.set(Calendar.MONTH, b-1);
		cal.set(Calendar.DATE, c);
		cal.add(Calendar.DAY_OF_MONTH, days);
		String[] str0 = client.elementGetText("NATIVE",
				"xpath=//*[@id='debug_sensor_activation_time' and @onScreen='true']", 0).split(":");
		int x = Integer.parseInt(str0[0]);
		int y = Integer.parseInt(str0[1]);
		cal.set(Calendar.HOUR_OF_DAY, x);
		cal.set(Calendar.MINUTE, y);
		cal.set(Calendar.SECOND, 0);
		cal.add(Calendar.HOUR, hours);
		cal.add(Calendar.MINUTE, minutes);

		String[] inputActivationDate = dateFormat.format(cal.getTime()).split(" ");	
		client.waitForElement("NATIVE",	"xpath=//*[@id='alertTitle' and @onScreen='true']",0, 10000);
		client.verifyElementFound("NATIVE",	"xpath=//*[@text='Activation Date: ' and @onScreen='true']", 0);
		client.elementSendText("NATIVE","xpath=//*[@id='debug_sensor_activation_date' and @onScreen='true']", 0, inputActivationDate[0]);
		client.verifyElementFound("NATIVE","xpath=//*[@text='Activation Time: ']", 0);
		client.elementSendText("NATIVE", "xpath=//*[@id='debug_sensor_activation_time'and @onScreen='true']",0, inputActivationDate[1]);

		String str1 = client.elementGetText("NATIVE", "xpath=//*[@id='text1' and ./parent::*[@id='debug_sensor_type']]", 0);
		if(!str1.equals(sensorType)){
			client.verifyElementFound("NATIVE","xpath=//*[@id='debug_sensor_type' and @onScreen='true']", 0);
			client.click("NATIVE", "xpath=//*[@id='debug_sensor_type' and @onScreen='true']", 0, 1);
			client.waitForElement("NATIVE",	"xpath=//*[@id='text1' and @text='"+sensorType+"' and @onScreen='true']",0, 10000);
			client.click("NATIVE", "xpath=//*[@id='text1' and @text='"+sensorType+"' and @onScreen='true']", 0, 1);
		}				
		client.click("NATIVE", "xpath=//*[@id='button1' and @onScreen='true']", 0, 1);
		waitFor(client,1);
		closeDebugDrawer(client);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify the get started button
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 *         
	 * @param click
	 *            click if it is true
	 *            
	 */

	public void getStarted(Client client, boolean click) {		
		if (click) {
			client.click("NATIVE",
					"xpath=//*[@id='getStartedNow' and @top='true']", 0, 1);
			client.waitForElement("NATIVE", "text=${countryOfOriginTitle}", 0, 1000);

		} else  {
			client.verifyElementFound("NATIVE", "xpath=//*[@id='getStartedNow' and @top='true']", 0);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Confirm Country Page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void verifyConfirmCountryPage(Client client) {
		client.waitForElement("NATIVE", "text=Confirm Country", 0, 1000);
		client.verifyElementFound("NATIVE", "text=Confirm Country", 0);
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Terms of Page and Privacy Policy page details
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param page
	 *            Verify the page title
	 * 
	 */

	public void verifyTermsAndPolicyPageDetails(Client client, String page,boolean verifyCheckbox) {
		verifyPageTitles(client,page);
		waitFor(client, 5);
		client.runNativeAPICall("NATIVE", "xpath=//*[@id='scrollView']", 0,
				"view.scrollTo(0, 0);");
		verifyPageTitles(client, page);
		client.verifyElementFound("NATIVE", "text=${reject}", 0);
		client.verifyElementFound("NATIVE", "text=${accept}", 0);
		if (verifyCheckbox) {
			client.runNativeAPICall("NATIVE", "id=scrollView", 0,
					"view.scrollTo(0, 9999999)");
			if(page.equalsIgnoreCase("termsOfUseTitle")){
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='checkBox' and @text='${termsOfUseAcceptanceStatement}']",
						0);
			}else{
				client.verifyElementFound(
						"NATIVE",
						"xpath=//*[@id='checkBox' and @text='${privacyNoticeAcceptanceStatement}']",
						0);
			}
		}

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Terms of Page and Privacy Policy page details
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 *          
	 * @param page
	 *            Verify the page title
	 *            
	 * @param clickCheckbox
	 *            true/false
	 * 
	 */

	public void clickCheckBox(Client client,String page, boolean clickCheckbox) {
		verifyPageTitles(client,page);
		if(!client.isElementFound("NATIVE", "xpath=//*[@id='checkBox' and @top='true']", 0)){
			try{

				client.runNativeAPICall("NATIVE", "xpath=//*[@id='scrollView']", 0, "view.scrollTo(0, 999999);");

			}  
			catch(Exception e){
				client.elementSwipeWhileNotFound("NATIVE", "xpath=//*[@id='scrollView' and @class='android.widget.ScrollView']", "Down", 0, 2000, "NATIVE", "xpath=//*[@id='checkBox' and @top='true']", 0, 1000, 5, false);
			}
		}
		waitFor(client,2);

		if (clickCheckbox) {
			if(client.isElementFound("NATIVE", "xpath=//*[@id='checkBox' and @checked='false' and @onScreen='true']", 0)){
				client.click("NATIVE",
						"xpath=//*[@id='checkBox' and @onScreen='true']",
						0, 1);
				client.verifyElementFound("NATIVE",
						"xpath=//*[@id='checkBox' and @checked='true' and @onScreen='true']", 0);
			}
		} 
		clickOnButtonOption(client, "Accept", true);
		waitFor(client,1);
	}



	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify GetStartedNow and SignIn
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 */

	public void verifyGetStartedNowandSignIn(Client client) {
		client.verifyElementFound("NATIVE", "xpath=//*[@id='getStartedNow']", 0);
		client.verifyElementFound("NATIVE",
				"text=Already have a LibreView account?", 0);
		client.verifyElementFound("NATIVE",
				"text=Sign In", 0);

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Librelink Tour page
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param page
	 *            select the page to verify
	 *            
	 */

	public void verifyAppTourScreens(Client client, String page) {
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='appTourImage']", 0);
		client.verifyElementFound("NATIVE","xpath=//*[@text= '${" + page + "}']",0);
		verifyGetStartedNowandSignIn(client);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Swipe right Librelink welcome page
	 * 
	 * @param client
	 *           Integrate SeeTestAutomation
	 */

	public void swipeWelcomescreen(Client client) {
		client.elementSwipe("NATIVE", "xpath=//*[@id='appTourPager' and @class='android.support.v4.view.ViewPager']", 0, "Right", 100, 2000);
		waitFor(client,2);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify Librelink Welcome page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void librelinkWelcomePage(Client client) {
		client.waitForElement("NATIVE","xpath=//*[@id='appTourImage' and @onScreen='true']", 0, 5000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='appTourImage' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='appTourText' and @text='']", 0);
		verifyGetStartedNowandSignIn(client);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify create account Page
	 * 
	 * @param client
	 *          Integrate SeeTestAutomation
	 */

	public void verifyCreateAccountScreen(Client client) {
		waitFor(client, 2);
		client.verifyElementFound("NATIVE", "xpath=//*[@class='android.support.v7.widget.AppCompatEditText' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='topText' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='firstName']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='lastName']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='dateOfBirth']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='submit']", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Select Long insulin and set Glucose value
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation
	 * 
	 * @param value
	 *            set the glucose value
	 */

	public void addNoteForInsulin(Client client,String insulin, String value) {
		if(insulin.equalsIgnoreCase("Rapid")){
			client.click("NATIVE","id=rapidInsulinField", 0, 1);	
			client.elementSendText("NATIVE", "id=rapidInsulinField", 0, value);
			client.closeKeyboard();
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='rapidInsulinField' and @text='" + value + "']",
					0);
		}else{
			client.click("NATIVE","id=slowInsulinField", 0, 1);
			client.elementSendText("NATIVE", "id=slowInsulinField", 0, value);
			client.closeKeyboard();
			client.verifyElementFound("NATIVE",
					"xpath=//*[@id='slowInsulinField' and @text='" + value + "']",
					0);
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Select Exercise type and set the Hours and minutes
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation
	 *        
	 * @param intensity
	 *            set the require intensity
	 * @param hrs
	 *            set the hours
	 * @param mins
	 *            set the minutes
	 */

	public void addNoteForExercise(Client client, String intensity, int hrs,
			int mins) {
		String hours= Integer.toString(hrs);
		String minutes= Integer.toString(mins);
		selectNoteAttribute(client,"exercise");
		scrollToBottomAddNotePage(client);
		waitFor(client, 2);
		if(intensity!=null){
			setAndGetIntensity(client, intensity);
		}
		scrollToBottomAddNotePage(client);
		verifyExcerciseIntensityTimeDurationRanges(client, hours, minutes);
		waitFor(client,1);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to click on Add Note in MyGlucose Screen
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation    
	 */

	public void clickAddNoteInMyGlucose(Client client) {
		waitFor(client, 3);
		client.click("NATIVE", "xpath=//*[@id='scan_result_add_note']", 0, 1);
		waitFor(client, 1);
	}


	/**
	 * Author: NagarajuKasar
	 * 
	 * Method to verify  Note Pop-Up Details
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation 
	 *         
	 * @param attributes 
	 *        sending attributes(food/rapid/long/exercise) for verification
	 *        
	 */
	public void verifyNotePopUpDetails(Client client, String attributes) {
		if(attributes.contains("svg")&&getUnits().contains("mmol/L")){ 
			attributes=attributes.replace("svg", "ptn");
			client.verifyElementFound("NATIVE", "xpath=//*[@id='note_contents' and contains(@text,'"+attributes+"')]", 0);
		}else{
			client.verifyElementFound("NATIVE", "xpath=//*[@id='note_contents' and contains(@text,'"+attributes+"')]", 0);
		}

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to Verify time in Note Pop-Up
	 * 
	 * @param client
	 *         Integrate SeeTestAutomation 
	 *         
	 * @param time 
	 *        sending time for verification
	 *        
	 * @param present
	 *        if it's true then verify Note found       
	 */

	public void verifyTimeInNotePopUp(Client client,String time,boolean present) {
		time=setAMPM(client,time);
		waitFor(client, 1);
		if(present){
			client.verifyElementFound("NATIVE", "xpath=//*[@id='timeView' and @text='"+time+"' and @onScreen='true']", 0);
		}else{
			client.verifyElementNotFound("NATIVE", "xpath=//*[@id='timeView' and @text='"+time+"' and @onScreen='true']", 0);

		}
		waitFor(client, 1);
	}			
	/**
	 * Author: NagarajuKasarla
	 * 
	 * Method to verify US Specific HomeScreen
	 * 
	 * @param client
	 *        Integrate SeeTestAutomation    
	 */

	public void verifyHomePageDetails(Client client){
		client.verifyElementFound("NATIVE",
				"xpath=//*[@class='android.support.v7.widget.AppCompatImageView' and @width>0 and ./parent::*[@id='toolbar_actionbar']]", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@contentDescription='More options']", 0);
	}


	/**
	 * Author: Nagaraju----
	 * 
	 *  Click Alert (i) icon
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickAlertIcon(Client client) {
		navigateToMyGlucosePage(client);
		waitFor(client, 1);
		client.click("NATIVE",
				"xpath=//*[@id='scanResultAlarm' and @onScreen='true']", 0, 1);
		client.waitForElement("NATIVE",
				"xpath=//*[@id='contentPanel' and @class='android.widget.FrameLayout' and @onScreen='true']", 0,
				1000);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click and verify Check Glucose Reminder
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * 
	 */
	public void clickSetCheckGlucoseReminder(Client client) {
		client.click(
				"NATIVE",
				"xpath=//*[@id='button1' and @text='Set' and @onScreen='true']",
				0, 1);
		client.waitForElement("NATIVE", "xpath=//*[@text='Set' and @onScreen='true']", 0,
				2000);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Set' and @onScreen='true']",
				0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * select Low Reminder Time
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param value
	 *            click time
	 */
	public void selectLowReminderTime(Client client, int value) {
		client.click("NATIVE", "xpath=//*[@id='timerDuration' and @class='android.support.v7.widget.AppCompatSpinner']", 0, 1);
		client.click("NATIVE", "text=" + value + " mins", 0, 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='" + value
				+ " mins' and @top='true']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * verify CheckGlucose Reminder Countdown
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param time
	 *            reminder time to verify
	 */
	public void verifyCheckGlucoseReminderCountdown(Client client, String time) {		
		client.verifyElementFound("NATIVE", "text=Check Glucose", 0);
		client.waitForElement(
				"NATIVE",
				"xpath=//*[@id='nextReminderText' and contains(@text,'Next Reminder: "+time+"20, Check Glucose')]",
				0, 60000);
		client.verifyElementFound("NATIVE", "xpath=//*[@id='nextReminderText' and contains(@text,'Next Reminder: "+time+"19, Check Glucose')]", 0);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='nextReminderText' and @backColor='0x138BE8']",
				0);

		String t1 = client
				.elementGetText(
						"NATIVE",
						"xpath=//*[@class='com.librelink.app.ui.widget.CountDownTextView' and ./following-sibling::*[@text='Check Glucose']]",
						0);
		waitFor(client,5);
		String t2 = client
				.elementGetText(
						"NATIVE",
						"xpath=//*[@class='com.librelink.app.ui.widget.CountDownTextView' and ./following-sibling::*[@text='Check Glucose']]",
						0);
		String t3 = t2.substring(0, t2.length() - 2);
		String newtime=time.substring(0,time.length()-2);


		if (!t1.equals(t2)) {
			Assert.assertTrue(t3.contains(newtime));

			System.out
			.println("Check Glucose TIMERS reminder displayed a countdown timer which started from "
					+ t3 + "XX");
		}

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * verify Timer Expired Notification
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */
	public void verifyTimerExpiredNotification(Client client) {
		waitFor(client, 10);
		navigateToScreen(client, "home");
		navigateToScreen(client, "reminders");
		waitFor(client, 1);
		client.waitForElementToVanish("NATIVE",
				"xpath=//*[contains(@text,'Next Reminder')]", 0, 90000);
		if(client.isElementFound("NATIVE", "xpath=//*[contains(@text,'Next Reminder: 00:00')]", 0)){
			launch(client);
		}
		openNotification(client);
		client.verifyElementFound("TEXT","Timer Expired", 0);
		closeNotification(client);
		navigateToScreen(client, "reminders");
		waitFor(client,3);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='--:--']", 0);
		client.verifyElementFound(
				"NATIVE",
				"xpath=//*[@class='android.support.v7.widget.SwitchCompat']",
				0);

	}

	/**
	 * Author: Meenakshi
	 * 
	 * Set values from build config file
	 * 
	 * @param fileName
	 *            Filename
	 * @param SheetName
	 *            SheetName in the file
	 * @param countryKeyCode
	 *            country code
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */

	public ArrayList<ArrayList<Object>>  ReadExcelData(String fileName,String SheetName,String countryKeyCode) throws IOException, ParserConfigurationException, SAXException
	{	
		int column = 0, rowCount;
		FileInputStream inputStream = new FileInputStream(new File(fileName));
		ArrayList<ArrayList<Object>> list = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> singleRows = new ArrayList<Object>();

		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheet(SheetName);
		Iterator<Row> iterator = firstSheet.iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				String Key = cell.getStringCellValue();
				for ( rowCount = firstSheet.getFirstRowNum();rowCount<=firstSheet.getLastRowNum();rowCount++)
				{
					if(Key.equalsIgnoreCase(countryKeyCode))
					{	 

						for(column = 1; column<nextRow.getPhysicalNumberOfCells();column++)
						{
							while (cellIterator.hasNext()) {
								Cell cell1 = cellIterator.next();
								if (cell1.getCellTypeEnum() == CellType.STRING)
								{
									System.out.print("cell1.getStringCellValue()"+cell1.getStringCellValue()+"\t");
									singleRows.add(cell1.getStringCellValue());
								}

								else if(cell1.getCellTypeEnum() ==CellType.BOOLEAN)      
								{
									System.out.print(cell1.getBooleanCellValue()+"\t");
									singleRows.add(cell1.getBooleanCellValue());
								}
								else if(cell1.getCellTypeEnum() ==CellType.NUMERIC)
								{
									System.out.print(cell1.getNumericCellValue()+"\t");
									singleRows.add(cell1.getNumericCellValue());
								}
							}
						}
					}

					list.add(singleRows);

				}

			}
		}
		workbook.close();
		inputStream.close();

		return list;
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to display not applicable screenshot
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 */

	public void showNotApplicableScreenShot(Client client, String message){
		waitFor(client,1);
		client.setShowReport(true);
		client.report(getProperty("user.dir") + "\\Reports\\notapplicable_snapshot.PNG",message, true);
		client.setShowReport(false);
		waitFor(client,1);
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Verify My Glucose Info Page
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param verifyNext
	 * 			Verify if NEXT button is present true/false
	 */

	public void verifyMyGlucoseInfoPage(Client client, boolean verifyNext) {
		//TODO
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			client.verifyElementFound("NATIVE", "accessibilityIdentifier=my_glucose_overview_mg" , 0);
		}else{
			client.verifyElementFound("NATIVE", "accessibilityIdentifier=my_glucose_overview_mmol" , 0);
		}
		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("myGlucoseExplanationUpdate"),0);
		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("myGlucoseExplanationTitle"),0);
		if(verifyNext){
			verifyButtonStatus(client, "NEXT", true);
		}
	}

	/**
	 * Author: Lourde Noel Rini
	 * 
	 * Verify Glucose Trend arrow Page Contents
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * 
	 * @param verifyNext
	 * 			Verify if NEXT button is present true/false
	 */

	public void verifyGlucoseTrendArrow(Client client,boolean verifyNext) {
		//TODO
		//client.verifyElementFound("NATIVE", "xpath=//*[@id='topText' and @clickable='false' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Glucose is rising quickly' and @onScreen='true']",0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Glucose is rising' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Glucose is changing slowly' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Glucose is falling' and @onScreen='true']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Glucose is falling quickly'  and @onScreen='true']", 0);
		verifyButtonStatus(client, "Next", true);

	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to verify Welcome screen
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 *
	 * */
	public void verifyWelcomeScreen(Client client){
		//TODO
		client.verifyElementFound("NATIVE", "accessibilityIdentifier=Freestyle_logo", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityLabel='Welcome!' and @backgroundColor='0x000000']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityLabel='Welcome!']", 1);
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityLabel='Take a few moments to learn how to understand your glucose readings with this app.']", 0);
		verifyButtonStatus(client, "NEXT", true);
	}

	/**
	 * Author: ShabinaSherif 
	 * 
	 * verify safety information
	 *         
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */
	//TODO
	public void verifySafetyInfo(Client client){
		//TODO
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityLabel='SAFETY INFORMATION']", 0);
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityIdentifier='BlueQuestion']", 0);
		client.click("NATIVE", "xpath=//*[@accessibilityLabel='SAFETY INFORMATION']", 0,1);
		waitFor(client,2);
		waitForProgress(client);
		waitFor(client,10);
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityLabel='Safety Information' and @class='UILabel']", 0);

	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Verify Glucose Screen Background color
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param verifyNext
	 * 			Verify if NEXT button is present true/false
	 */

	public void verifyGlucoseBackgroundColor(Client client,boolean verifyNext) {
		//TODO
		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("backgroundGlucoseColorsDetail"),0);
		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("backgroundGlucoseColorsTitle"),0);
		if(getUnits().contains("mg/dL")){
			client.verifyElementFound("NATIVE", "text=${glucoseHighAbove240Mgdl}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseBetweenTarget240Mgdl}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseTargetRange}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseBetweenTarget70Mgdl}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseLowBelow70Mgdl}", 0);
		}else{
			client.verifyElementFound("NATIVE", "text=${glucoseHighAbove240Mmol}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseBetweenTarget240Mmol}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseTargetRange}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseBetweenTarget70Mmol}", 0);
			client.verifyElementFound("NATIVE", "text=${glucoseLowBelow70Mmol}", 0);
		}
		if(verifyNext){
			verifyButtonStatus(client, "NEXT", true);
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to verify Treatment Decision Screen 1
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param verifyNext
	 * 			Verify if NEXT button is present true/false
	 * */

	public void verifyTreatmentDecisionScreen1(Client client,boolean verifyNext) {
		//TODO
		if (getUnits().equalsIgnoreCase("mg/dL")) {
			client.verifyElementFound("NATIVE", "accessibilityIdentifier=treatment_decisions_step_5_mgdl" , 0);
		}else{
			client.verifyElementFound("NATIVE", "accessibilityIdentifier=treatment_decisions_step_5_mmol" , 0);
		}

		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("treatmentDecisionsSymbol"),0);
		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("treatmentDecisions"),0);
		if(verifyNext){
			verifyButtonStatus(client, "NEXT", true);
		}
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Method to verify Treatment Decision Screen 2
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param verifyNext
	 * 			Verify if NEXT button is present true/false
	 * */

	public void verifyTreatmentDecisionScreen2(Client client,boolean verifyNext) {
		//TODO
		client.verifyElementFound("NATIVE", "xpath=//*[@accessibilityIdentifier='treatment_decisions_step_6']" , 0);
		client.verifyElementFound("NATIVE","partial_text="+getLangPropValue("treatmentDecisionsTest"),0);
		client.verifyElementFound("NATIVE","xpath=//*[contains(@text,'"+getLangPropValue("treatmentDecisions")+"')]",0);
		if(verifyNext){
			verifyButtonStatus(client, "DONE", true);
		}
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * navigate To SubMenu Screens from Help
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param subscreen
	 *          App settings sub menu screen name
	 * 
	 * @param click
	 * 			true/false
	 */

	public void verifyandClickHelpSubMenu(Client client,
			String subscreen, boolean click) {
		if(click){
			client.waitForElement("NATIVE", "text=${"+subscreen+"}", 0, 1000);
			client.click("NATIVE","text=${"+subscreen+"}",0,1);
		}
		else{
			client.waitForElement("NATIVE", "text=${"+subscreen+"}", 0, 1000);
			client.click("NATIVE","text=${"+subscreen+"}",0,1);
		}


	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Verify How to Apply new sensor link
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param click
	 * 			true/false
	 * 
	 */

	public void verifyHowToApplyNewSensorLink(Client client, boolean click) {
		if (click){
			client.waitForElement("NATIVE", "text=${applyNewSensorDetail}", 0, 1000);
			client.click(
					"NATIVE",
					"xpath=//*[@id='howToApply' and @textColor='0xFFFFFF' and @onScreen='true']",
					0,1);}
		else{

			client.verifyElementFound("NATIVE", "text=${applyNewSensorDetail}", 0);
			client.verifyElementFound(
					"NATIVE",
					"xpath=//*[@id='howToApply' and @textColor='0xFFFFFF' and @onScreen='true']",
					0);
		}

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Verify How to scan a new sensor link
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param click
	 * 			true/false
	 * 
	 */

	public void verifyHowToScanNewSensorLink(Client client, boolean click) {if (click)
	{
		client.waitForElement("NATIVE", "xpath=//*[@id='content_title_scan']", 0, 1000);
		client.click("NATIVE","xpath=//*[@id='howToScan' and @textColor='0xFFFFFF']",
				0,1);
	}else{
		client.verifyElementFound("NATIVE", "xpath=//*[@id='content_title_scan']", 0);
		client.verifyElementFound("NATIVE",	"xpath=//*[@id='howToScan' and @textColor='0xFFFFFF']",
				0);
	}}

	/**
	 * Author: ShabinaSherif 
	 * 
	 * verify safety information
	 *         
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */
	public void verifySafetyInformation(Client client) {
		//TODO
		waitFor(client,2);
		waitForProgress(client);
		waitFor(client,10);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Safety Information' and @class='UILabel']", 0);

	}


	/**
	 * Author: ShabinaSherif 
	 * 
	 * verify user's manual Guide
	 *         
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */
	public void verifyQuickReferenceGuide(Client client) {	
		//TODO
		waitFor(client,2);
		waitForProgress(client);
		waitFor(client,10);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Quick Reference Guide' and @class='UILabel']", 0);

	}


	/**
	 * Author: ShabinaSherif 
	 * 
	 * verify quick start guide
	 *         
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */
	public void verifyQuickStartGuide(Client client) {	
		//TODO
		waitFor(client,2);
		waitForProgress(client);
		waitFor(client,10);
		client.verifyElementFound("NATIVE", "xpath=//*[@text='Quick Start Guide' and @class='UILabel']", 0);

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Verify About Information
	 * 
	 * @param client
	 * 		Integrate SeeTestAutomation
	 */

	public void verifyAboutInfo(Client client) {
		if(getAboutInfo().contains("yes")){
			client.verifyElementFound("NATIVE", "text=${appPartOfSystem}", 0);
		}else{
			client.verifyElementFound("NATIVE", "xpath=//*[@text='Part of the FreeStyle Libre Flash Glucose Monitoring System' and @onScreen='false']", 0);
		}
		client.verifyElementFound("NATIVE", "xpath=//*[@text='FreeStyle LibreLink']", 0);
	}

	/**
	 * Author: ShabinaSherif
	 * 
	 * Verify the links are in order
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 */

	public void verifyHelpLinksInOrder(Client client, String link, String order) {
		//TODO
		String ylink1 = client.elementGetProperty("NATIVE", "xpath=//*[@text='User’s Manual']", 0, "y");
		String ylink2 = client.elementGetProperty("NATIVE", "xpath=//*[@text='"+link+"']", 0, "y");
		if(order.contains("above")){
			Assert.assertTrue(Integer.parseInt(ylink1)>Integer.parseInt(ylink2));
		}else{
			Assert.assertTrue(Integer.parseInt(ylink1)<Integer.parseInt(ylink2));
		}

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Set servings value
	 * 
	 * @param client
	 * 			Integrate SeeTestAutomation
	 * @param val
	 *            value of grams
	 *            
	 */
	public void setServingsValue(Client client, String val) {
		client.elementSetProperty("NATIVE", "id=servingSizeBar", 0,
				"slide", val);
	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 * Clear application data
	 * 
	 * @param client
	 */
	public void clearData(Client client) {
		client.applicationClearData(getapkPackage());
		client.launch(getapkActivity(), true, true);
		setNoErrorOnDebugDrawer(client);
		client.waitForElement("NATIVE", "text=Get Started Now", 0, 4000);

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 *         Set and Get the Carb Amount
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param carbAmount
	 *            set the carb amount
	 */
	public void setAndGetCarbAmount(Client client, String carbAmount) {
		client.click("NATIVE", "id=etext_food_carbs", 0, 1);
		client.closeKeyboard();
		client.elementSendText("NATIVE", "id=etext_food_carbs", 0, carbAmount);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@id='etext_food_carbs' and @text ='" + carbAmount
				+ "']", 0);

	}


	/**
	 * Author: NagarajuKasarla
	 * 
	 *         Setting/Getting Exercise Intensity
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param intensity
	 *            set intensity
	 *
	 */
	public void setAndGetIntensity(Client client, String intensity) {
		if(!client.isElementFound("NATIVE", "xpath=//*[@id='text1' and @text='"+getLangPropValue(intensity)+"' and @onScreen='true' and @top='true']", 0)){
			client.waitForElement("NATIVE",
					"xpath=//*[@id='spinner_exercise_intensity']", 0, 10000);
			client.click("NATIVE", "id=spinner_exercise_intensity", 0, 1);
			waitFor(client, 2);
			client.click("NATIVE", "xpath=//*[@text= '${" + intensity + "}']", 0, 1);
			if (client.waitForElement("NATIVE", "id=spinner_exercise_intensity", 0,
					10000)) {
				client.verifyElementFound("NATIVE", "xpath=//*[@text='${"
						+ intensity + "}']", 0);
			}
		}
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 *         Set and verify the Exercise Intensities duration
	 * @param client
	 *            Integrate SeeTestAutomation
	 * @param exerciseHours
	 *            set the hours
	 * @param exerciseMinutes
	 *            set th eminute
	 */
	public void verifyExcerciseIntensityTimeDurationRanges(Client client,
			String exerciseHours, String exerciseMinutes) {
		client.runNativeAPICall("NATIVE",
				"xpath=//*[@id='picker_exercise_hours']", 0, "view.setValue("
						+ exerciseHours + ");");
		client.runNativeAPICall("NATIVE",
				"xpath=//*[@id='picker_exercise_minutes']", 0, "view.setValue("
						+ exerciseMinutes + ");");
		Assert.assertEquals(exerciseMinutes, client.runNativeAPICall("NATIVE",
				"xpath=//*[@id='picker_exercise_minutes']", 0,
				"view.getValue()"));
		Assert.assertEquals(exerciseHours, client.runNativeAPICall("NATIVE",
				"xpath=//*[@id='picker_exercise_hours']", 0, "view.getValue()"));

	}

	/**
	 * Author: Devi
	 * 
	 * Click on settings menu
	 * @param client
	 *            
	 * 
	 * @throws Exception
	 */
	public void clickOnSettingsMenu(Client client,String subSetting) {
		client.waitForElement("NATIVE", "xpath=//*[@contentDescription='More options' and @onScreen='true']", 0,
				10000);
		client.click("NATIVE",
				"xpath=//*[@contentDescription='More options']", 0, 1);
		waitFor(client, 1);
		client.waitForElement("NATIVE", "xpath=//*[@text='"+subSetting+"']", 0,10000);
		client.click("NATIVE","xpath=//*[@text='"+subSetting+"']", 0, 1);
	}

	/**
	 * Author: NagarajuKasarla
	 *            
	 * 
	 * Verify Reminders Page
	 * @param client
	 * 
	 */

	public void verifyRemindersPage(Client client) {
		client.verifyElementFound("NATIVE", "text=Reminders", 0);
		client.verifyElementFound("NATIVE", "text=No active reminders.", 0);
		client.verifyElementFound("NATIVE", "text=Scan Sensor", 0);
		client.verifyElementFound("NATIVE", "text=Timers", 0);
		//TODO this will be changed
		client.verifyElementFound("NATIVE", "text=Alarms", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Click on Sounds and Vibrations or Vibration only on Sounds Page
	 * @param client
	 * 
	 * @param type
	 *            can be either Sound and Vibration or Vibration only
	 * 
	 */

	public void chooseSoundOrVibration(Client client, String type) {
		client.verifyElementFound("NATIVE", "text=${"+type+"}", 0);
		client.click("NATIVE", "text=${"+type+"}", 0, 1);
		client.verifyElementFound("NATIVE",
				"xpath=//*[@text='"+getLangPropValue(type)+"' and @checked='true']", 0);
	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * closeOpenApps
	 * 
	 * @param client
	 */	

	public void closeOpenApps(Client client) {
		client.run("adb shell input keyevent KEYCODE_APP_SWITCH");
		waitFor(client, 3);
		if (client
				.isElementFound(
						"Native",
						"xpath=//*[@contentDescription='Close all']",
						0)) {
			client.click(
					"Native",
					"xpath=//*[@contentDescription='Close all']",
					0, 1);

		}

	}

	/**
	 * Author: NagarajuKasarla
	 * 
	 * Setting AM/PM
	 * 
	 * @param client
	 *            Integrate SeeTestAutomation
	 *            
	 * @param noteTime
	 *                set the notetime       
	 */
	public String setAMPM(Client client, String noteTime){
		if (getCountryCode().contains("United Kingdom")&&! getDeviceOSVer().contains("6.")) {
			noteTime = noteTime.replace("PM", "pm");
			noteTime = noteTime.replace("AM", "am");
		}else if (getCountryCode().contains("United Kingdom")){
			noteTime = noteTime.replace("PM", "p.m.");
			noteTime = noteTime.replace("AM", "a.m.");
		}
		else if(!getCountryCode().contains("United Kingdom")&&getLanguage().contains("English")){
			//no change
		}else{
			noteTime = noteTime.substring(0, 4);
		}
		return noteTime;
	}


}
