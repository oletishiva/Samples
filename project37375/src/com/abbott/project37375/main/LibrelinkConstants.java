package com.abbott.project37375.main;


public class LibrelinkConstants {

	// Exception
	public static final String exceptionTxt= "----------EXCEPTION----------";

	// String Literals
	public static final String TWELVE_HOUR_FORMAT= "12";
	public static final String TWENTYFOUR_HOUR_FORMAT= "24";
	public static final String TWOFIFTYSIX_CHARACTERS_COMMENTS= "A glucose meter (or glucometer) is a medical device for determining the approximate concentration of glucose in the blood.It can also be a strip of glucose paper dipped into a substance and measured to the glucose chart. It is a key element of home blood. ";
	public static final String FIFTYCHARACTER_REMINDER_NAME= "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";
	public static final String FIFTYPLUSCHARACTER_REMINDER_NAME= "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxAA";
	public static final String FIFTYCHARACTER_Mixed_REMINDER_NAME= "1234567890@#$%^12345123456789012345678901234567890";
	public static final String SPL_COMMENTS = "@#$%^ ;)";
	public static final String NEW_LINE_NUMBER_COMMENTS = "123@ \nFreestyle\nLibre\nLink";
	public static final String TWENTY_CHARACTERS_COMMENTS= "Abbott Glucose Meter";

	//Time Zone Constants
	public static final String US= "America/Los_Angeles";  
	public static final String CST= "America/Chicago";
	public static final String AKDT ="America/Anchorage";
	public static final String India= "IST";
	public static final String EST ="America/New_York";
	// Country Time Zone 
	public static final String IndiaZone= "Mumbai";
	public static final String USZone= "Cupertino";  
	public static final String CSTZone= "Chicago";
	public static final String ESTZone ="New York";
	public static final String AKDTZone ="Anchorage";   

	//Settings constants
	public static final String CURRENT_PASSWORD= "Abbott@123";
	public static final String INVALID_PASSWORD= "abbott123";
	public static final String NEW_PASSWORD= "Abbott@1234";
	public static final String NUMBER_PASSWORD= "123456789";
	public static final String CHAR_PASSWORD= "abcdefghi";
	public static final String CAPS_PASSWORD= "ABBOTTABCD1";
	public static final String LOWER_PASSWORD= "aabbccddee1";
	public static final String SEVEN_CHAR_PASSWORD= "Abbott1";
	public static final String EIGHT_CHAR_PASSWORD= "Abbott@1";
	public static final String THIRTYSEVEN_CHAR_PASSWORD= "Abcdefghijklmnopqrstuvwxyzabcdefghi@1";
	public static final String THIRTYSIX_CHAR_PASSWORD= "Abcdefghijklmnopqrstuvwxyzabcdefgh@1";

	//Login credentials
	public static final String Username= "abbott.automation@gmail.com";
	public static final String Password= "Abbott123";  

	// Reminder_TC001_Alarm_Reminder_UI_Check
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step1="Step1_SDAUIRS912_SDAUIRS914_SDAISRS1156 SDAUIRS915_SDAUIRS1203_Reminder created successfully in 24 hr format";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step2="Step2_SDAUIRS912 SDAUIRS914_SDAUIRS915_Reminder created successfully in 12 hr format";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step3="Step3_SDAUIRS260_SDAUIRS916_SDAISRS1156_SDAUIRS915_Reminder created with repeating options";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step4="Step4_SDAUIRS260_SDAUIRS914_SDAUIRS915_Reminder updates not saved on clicking cancel";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step5="Step5_SDAUIRS1123_SDAUIRS914_SDAISRS1156_Reminder AAAAAA successfully deleted";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step6="Step6_SDAUIRS913_SDAUIRS914_more than 12 reminders are created and verified";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step7="Step7_SDAUIRS915_SDAUIRS1155_Reminder name is created with only 50 characters not more than that";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step8="Step8_SDAUIRS915_Reminder name displays special characters";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step9="Step9_SDAUIRS262_SDAUIRS1183_Reminder created with approximately current time + few mins";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step10="Step10_SDAUIRS262_SDAUIRS916_SDAUIRS1158_Reminder notification is displayed when app is running background and on clicking the notification App will be opened";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step11="Step11_SDAUIRS262_SDAUIRS916_Reminder notification is displayed when app is closed and on clicking the notification App is opened";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step12="Step12_SDAUIRS262_Multiple reminders edited with current time + few mins and verified";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step13="Step13_SDAUIRS262_SDAUIRS916_SDAUIRS1183_SDAUIRS1158_Reminder notification dialog is displayed after few minutes and on clicking OK it gets dismissed";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step14="Step14_SDAUIRS262_Multiple reminders edited with current time + few mins and verified";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step15="Step15_SDAUIRS262_SDAUIRS916_SDAUIRS1183_Reminder notification is displayed after few mins when app is running background and reminders are disabled";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step16="Step16_SDAUIRS262_Multiple reminders edited with current time + few mins and verified";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step17="Step17_SDAUIRS262_SDAUIRS916_SDAUIRS1183_Reminder notification is displayed after few mins when app is closed and reminders are disabled";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step18="Step18_SDAUIRS918_Enable reminder trigger is verified for multiple reminders";
	public static final String Reminder_TC001_Alarm_Reminder_UI_Check_Step19="Step19_SDAUIRS1183_Disable reminder trigger is verified for multiple reminders";

	// Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step1="Step1_SDAUIRS916_Days checkboxes are displayed and not checked. ";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step2="Step2_SDAUIRS916_Days checkboxes are checked when All option is selected";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step3="Step3_SDAUIRS916_Days checkboxes are not displayed when repeating option is disabled";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step4="Step4_SDAUIRS916_Days checkboxes are displayed and checked when repeating is enabled again";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step5="Step5_SDAUIRS916_Days checkboxes only Monday is unchecked, hence All is also unchecked";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step6="Step6_SDAUIRS916_Days checkboxes are checked when All option is checked";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step7="Step7_SDAUIRS916_ALL checkbox is not checked when every single day option is unchecked";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step8="Step8_SDAUIRS916_All checkboxes are checked when every single day is checked";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step9="Step9_SDAUIRS916_SDAUIRS917_After one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step10="Step10_SDAUIRS916_SDAUIRS917_After one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step11="Step11_SDAUIRS916_SDAUIRS917_After one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step12="Step12_SDAUIRS916_SDAUIRS917_after one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step13="Step13_SDAUIRS916_SDAUIRS917_After one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step14="Step14_SDAUIRS916_SDAUIRS917_After one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";
	public static final String Reminder_T002_Alarm_Reminder_UI_RepeatingOptions_Check_Step15="Step15_SDAUIRS916_SDAUIRS917_after one minute a notification is displayed in Smart Device that the Alarm is Expired and Before Dinner Alarm reminder is enabled with repeating symbol";

	// Reminder_TC003_Timer_Reminder_UI_Check
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step1="Step1_SDAUIRS920_SDAISRS1156_The App Navigates to Reminder screen and Scan Sensor reminder displays a Toggle button to enable & disable the reminder";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step2="Step2_SDAUIRS920_SDAISRS1156_Scan Sensor reminder displays a Toggle button which is in enabled state";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step3="Step3_SDAUIRS1184_Scan Sensor reminder displays a Toggle button which is in disabled state and countdown timer is displayed";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step4="Step4_SDAUIRS920_Scan Sensor reminder displays a Toggle button which is in enabled state and countdown timer is displayed";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step5="Step5_SDAUIRS922_Hours displayed from 1hr to 12 hrs with the interval 1 during 24 hr time format";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step6="Step6_SDAUIRS922_Hours displayed from 1hr to 12 hrs with the interval 1 during 12 hr time format";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step7="Step7_SDAUIRS922_SDAUIRS923_Scan Sensor reminder displays a Toggle button which is in enabled state and countdown timer is displayed as blank after the notification is verified when app is closed";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step8="Step8_SDAUIRS922_SDAUIRS923_Scan Sensor reminder displays a Toggle button which is in enabled state and countdown timer is displayed as blank after the notification is verified when app is opened";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step9= "Step9_SDAUIRS922_SDAUIRS923_Scan Sensor reminder displays a countdown timer which starts from 11:59:XX";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step10="Step10_SDAUIRS922_SDAUIRS923_Scan Sensor reminder displays a countdown timer which starts from 5:5X:XX";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step11="Step11_SDAUIRS922_SDAISRS1156 SDAUIRS923_Scan Sensor reminder displays a countdown timer which starts from 11:59:XX";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step12="Step12_SDAUIRS922_SDAUIRS923_Scan Sensor reminder displays a Toggle button which is in disabled state and countdown timer is displayed";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step13="Step13_SDAUIRS922_SDAUIRS923_Scan Sensor reminder displays a Toggle button which is in enabled state and countdown timer as blank";
	public static final String Reminder_TC003_Timer_Reminder_UI_Check_Step14="Step14_SDAUIRS1256_Default Reminder setting will reset the Scan Sensor reminder for 1hr for Next Reminder";

	/**
	 * First Sequence Pages function steps constants
	 */
	// FirstTimeStartup_T001_AppTourScreens_SignIn
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step1= "Step1_SDAUIRS937,SDAUIRS1237_LibreLink welcome screen is displayed with Sign In and getting started options";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step2= "Step2_SDAUIRS1237_The text Check your glucose with your smartphone is displayed";         
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step3= "Step3_SDAUIRS1237_The text You can have quick access to your glucose information is displayed";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step4= "Step4_SDAUIRS1237_The text You can gain insights to help you make more informed decisions is displayed";          
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step5= "Step5_SDAUIRS1237_The text You can share your glucose information with your health care professional and loved ones is displayed";      
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step6= "Step6_SDAUIRS938_Confirm Country page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step7= "Step7_SDAUIRS938_Terms of Use page is displayed without check glucose icon";           
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step8= "Step8_SDAUIRS938_Privacy Notice page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step9= "Step9_SDAUIRS938_Create New Account page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step10= "Step10_SDAUIRS938_Account Login Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step11= "Step11_SDAUIRS938_Unit of Measurement Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step12= "Step12_SDAUIRS938_Target Glucose Range Page is displayed without check glucose icon";         
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step13= "Step13_SDAUIRS938_Carbohydrate Units Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step14= "Step14_SDAUIRS938_Scan Sounds page displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step15= "Step15_SDAUIRS938_Welcome Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step16= "Step16_SDAUIRS938_My Glucose Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step17= "Step17_SDAUIRS938_Glucose Background Color Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step18= "Step18_SDAUIRS938_Glucose Trend Arrow page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step19= "Step19_SDAUIRS938_Treatment Decisions Page1 is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step20= "Step20_SDAUIRS938_Treatment Decisions Page2 is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step21= "Step21_SDAUIRS938_LibreLink Home Page is displayed after completing the initial setup with check glucose icon and also shows successfull scan";             
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step22= "Step22_SDAUIRS940_Sign In Page is displayed without Check Glucose icon";         
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step23= "Step23_SDAUIRS940_Terms of Use Page is displayed without Check Glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step24= "Step24_SDAUIRS937_Privacy Notice Page is displayed without Check Glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step25= "Step25_SDAUIRS937_Unit of Measurement Page is displayed without Check Glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step26= "Step26_SDAUIRS937,SDAUIRS938_Target Glucose Range Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step27= "Step27_SDAUIRS937_Carbohydrate Units Page is displayed without Check Glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step28= "Step28_SDAUIRS937_Scan Sounds is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step29= "Step28_SDAUIRS937_Welcome Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step30= "Step29_SDAUIRS937_My Glucose Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step31= "Step30_SDAUIRS937_Glucose Background Color Page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step32= "Step31_SDAUIRS937_Glucose Trend Arrow page is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step33= "Step32_SDAUIRS937_Treatment Decisions Page1 is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step34= "Step33_SDAUIRS937_Treatment Decisions Page2 is displayed without check glucose icon";
	public static final String FirstTimeStartup_T001_AppTourScreens_SignIn_Step35= "Step34_SDAUIRS937,SDAUIRS938_LibreLink Home Page is displayed after completing the initial setup with check glucose icon and also shows successfull scan";

	// FirstTimeStartup_T002_TermsOfUseandPrivacyNotice
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step1= "Step1_SDAUIRS939_Confirm country screen is displayed on clicking Get Started Now";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step2= "Step2_SDAUIRS939_Terms of Use Screen is displayed on clicking Next";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step3= "Step3_SDAUIRS939_App displays the welcome screen on clicking Reject";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step4= "Step4_SDAUIRS939_Terms of Use Screen is displayed";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step5= "Step5_SDAUIRS939_Privacy Notice screen is displayed on clicking Accept";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step6= "Step6_SDAUIRS939_Terms of Page is displayed on clicking Back from Application";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step7= "Step7_SDAUIRS939_The Pop-up window displays the message I have read and explicitly accept the Terms of Use and CANCEL and ACCEPT button are in enabled state";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step8= "Step8_SDAUIRS939_App displays the Terms of Use screen on clicking Cancel";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step9= "Step9_SDAUIRS939_Privacy Notice is displayed on clicking Accept";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step10= "Step10_SDAUIRS939_App displays the welcome screen on clicking Reject";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step11= "Step11_SDAUIRS939_Privacy Notice screen is displayed with details";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step12= "Step12_SDAUIRS939_The Pop-up window displays the message I have read and explicitly accept the Privacy Notice and CANCEL and ACCEPT button are in enabled state";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step13= "Step13_SDAUIRS939_Create New Account screen is displayed on clicking Accept";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step14= "Step14_SDAUIRS939_Confirm Country screen is displayed with NEXT button on clicking Back from Application";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step15= "Step15_SDAUIRS939_The Pop-up window displays the message I have read and explicitly accept the Terms of Use. CANCEL and ACCEPT button are in enabled state";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step16= "Step16_SDAUIRS939_The Privacy Notice Page is displayed";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step17= "Step17_SDAUIRS939_Create New Account Screen is displayed";
	public static final String FirstTimeStartup_T002_TermsOfUseandPrivacyNotice_Step18= "Step18_SDAUIRS939_Privacy notice page is displayed on performing accept actions from Confirm Country screen";        

	// FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step1= "Step1_SDAUIRS1238,SDAUIRS1239_Create New Account page is displayed";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step2= "Step2_SDAUIRS1238,SDAUIRS1239_Adult Account Login page is displayed";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step3= "Step3_SDAUIRS943_Unit of Measurement page is displayed on successful Sign In";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step4= "Step4_SDAUIRS943_Target Glucose Range page is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step5= "Step5_SDAUIRS943_Unit of Measurement page is displayed on clicking back icon on Application";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step6= "Step6_SDAUIRS943_Target Glucose Range screen is displayed with details on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step7= "Step7_SDAUIRS943_App doesn't allow the user to set both low and high target glucose range as same";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step8= "Step8_SDAUIRS943_App allows the user to choose Glucose Ranges Low between (70mg/dL to 179mg/dL and High between 71 mg/dL to 180 mg/dL( or Low between 3.9mmol/L to 9.9mmol/L , High between 4.0mmol/L to 10.0mmol/L for mmol/L build";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step9= "Step9_SDAUIRS943_Carbohydrate Units page is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step10= "Step10_SDAUIRS943_App navigates back to Target Glucose Range screen on clicking Back icon on Application";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step11= "Step11_SDAUIRS943_Carbohydrate Units screen is displayed with details on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step12= "Step12_SDAUIRS943_Serving Bar allows the user to select the values from 10.0 grams to 15.0 grams";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step13= "Step13_SDAUIRS943_Servings text and serving bar is disabled on selecting grams";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step14= "Step14_SDAUIRS943_Scan Sounds Page displayed";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step15= "Step15_SDAUIRS1292_Welcome Page is displayed on clicking DONE";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step15_1= "Step15.1_SDAUIRS1292_Safety Information screen is displayed";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step16= "Step16_SDAUIRS1217_My Glucose Page is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step17= "Step17_SDAUIRS1293_Glucose Background Color Page is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step18= "Step18_SDAUIRS1247_Glucose Trend Arrow screen is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step19= "Step19_SDAUIRS1294_Treatment Decisions Page1 is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step20= "Step20_SDAUIRS1295_Treatment Decisions Page2 is displayed on clicking Next";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step21= "Step21_SDAUIRS943_LibreLink Home Screen is displayed on clicking DONE";
	public static final String FirstTimeStartup_T003_StartUpSettings_Auto_NewAdultAccount_Step22= "Step22_SDAUIRS943_App settings screen is displayed with selected values";

	// FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step1= "Step1_SDAUIRS1238_Create New Account page is displayed";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step2= "Step2_SDAUIRS1238,SDAUIRS1240_Date of birth is used to set up your LibreView account and not to determine whether the App is appropriate for your use.Please consult the App user's manual before using the App message is displayed on entering Minor DOB";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step3= "Step3_SDAUIRS1238,SDAUIRS1240_Parent/Guardian Account Login page is displayed on clicking OK";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step4= "Step4_SDAUIRS943_Unit of Measurement page is displayed on clicking create account after providing all valid details";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step5= "Step5_SDAUIRS943_Target Glucose Range page is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step6= "Step6_SDAUIRS943_Unit of Measurement page is displayed on clicking back";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step7= "Step7_SDAUIRS943_Target Glucose Range page is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step8= "Step8_SDAUIRS943_App allows the user to choose Glucose Ranges Low between 70 mg/dL to 179 mg/dL and High between 71 mg/dL to 180 mg/dL( or Low between 3.9 mmol/L to 9.9 mmol/L , High between 4.0 mmol/L to 10.0 mmol/L for mmol/L build)";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step9= "Step9_SDAUIRS943_App doesn't allow the user to set both low and high target glucose range as same";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step10= "Step10_SDAUIRS943_Carbohydrate Units page is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step11= "Step11_SDAUIRS943_Target Glucose Range screen is displayed on clicking back";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step12= "Step12_SDAUIRS943_Carbohydrate Units page is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step13= "Step13_SDAUIRS943_Servings text and serving bar is disabled on selecting grams";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step14= "Step14_SDAUIRS943_Serving Bar allows the user to select the values from 10.0 grams to 15.0 grams";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step15= "Step15_SDAUIRS1292_Scan Sounds Page is displayed";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step16= "Step16_SDAUIRS1292_Welcome Page is displayed on clicking DONE";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step16_1= "Step16.1_SDAUIRS1292_Safety Information screen is displayed";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step17= "Step17_SDAUIRS1217_My Glucose Page is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step18= "Step18_SDAUIRS1293_Glucose Background Color Page is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step19= "Step19_SDAUIRS1247_Glucose Trend Arrow screen is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step20= "Step20_SDAUIRS1294_Treatment Decisions Page 1 is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step21= "Step21_SDAUIRS1295_Treatment Decisions Page 2 is displayed on clicking Next";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step22= "Step22_SDAUIRS943_LibreLink Home Screen is displayed on clicking DONE";
	public static final String FirstTimeStartup_T004_StartUpSettings_Auto_NewMinorAccount_Step23= "Step23_SDAUIRS943_Settings screen is displayed with selected values";       
	// Help_LibreLink_T001_Help_Content
	public static final String Help_LibreLink_T001_Help_Content_Step1 = "Step1_SDAUIRS1137_How to Apply A Sensor link is displayed";
	public static final String Help_LibreLink_T001_Help_Content_Step2 = "Step2_SDAUIRS1137_Applying a Sensor section contains total 10 screens with instructions for How to Apply a new sensor";
	public static final String Help_LibreLink_T001_Help_Content_Step3 = "Step3_SDAUIRS1138_How to scan a Sensor link is displayed";
	public static final String Help_LibreLink_T001_Help_Content_Step4 = "Step4_SDAUIRS1138_Scanning a Sensor section contains total 3 screens with instructions for How to Scan a sensor";
	public static final String Help_LibreLink_T001_Help_Content_Step5 = "Step5_SDAUIRS929_Application version is displayed in the About screen";
	public static final String Help_LibreLink_T001_Help_Content_Step6 = "Step6_SDAUIRS929_About screen displays Application UDI / CE Mark / Registration Number (as applicable) and support website";
	public static final String Help_LibreLink_T001_Help_Content_Step7 = "Step7_SDAUIRS1187_Terms of Use link is displayed under Help section";
	public static final String Help_LibreLink_T001_Help_Content_Step8 = "Step8_SDAUIRS1187_Terms of Use screen is displayed";
	public static final String Help_LibreLink_T001_Help_Content_Step9 = "Step9_SDAUIRS1191_Privacy notice link is displayed under Help section";
	public static final String Help_LibreLink_T001_Help_Content_Step10 = "Step10_SDAUIRS1191_Privacy Notice screen is displayed";
	public static final String Help_LibreLink_T001_Help_Content_Step11 = "Step11_SDAUIRS1137_How to apply a Sensor link is displayed under Help section";
	public static final String Help_LibreLink_T001_Help_Content_Step12 = "Step12_SDAUIRS1137_Applying a Sensor screen is displayed with instructions";
	public static final String Help_LibreLink_T001_Help_Content_Step13 = "Step13_SDAUIRS1137_Applying a Sensor section contains total 10 screens with instructions for How to Apply a new sensor";
	public static final String Help_LibreLink_T001_Help_Content_Step14 = "Step14_SDAUIRS1138_How to scan a Sensor link is displayed under Help section";
	public static final String Help_LibreLink_T001_Help_Content_Step15 = "Step15_SDAUIRS1138_Scanning a Sensor screen is displayed with instructions";
	public static final String Help_LibreLink_T001_Help_Content_Step16 = "Step16_SDAUIRS1138_Scanning a Sensor section contains total 3 screens with instructions for How to Scan a sensor";
	public static final String Help_LibreLink_T001_Help_Content_Step17 = "Step17_SDAUIRS1139_Event Log link is displayed under Help section";
	public static final String Help_LibreLink_T001_Help_Content_Step18 = "Step18_SDAUIRS1139_Event Log screen is displayed";
	public static final String Help_LibreLink_T001_Help_Content_Step19 = "Step19_SDAUIRS1140_SDAISRS249_User Manual Link is displayed under Help section";
	public static final String Help_LibreLink_T001_Help_Content_Step20 = "Step20_SDAUIRS1140_The User Manual link is opened";
	public static final String Help_LibreLink_T001_Help_Content_Step21 = "Step21_SDAUIRS1283_SDAISRS249_Glucose Reading link is displayed under Help screen";
	public static final String Help_LibreLink_T001_Help_Content_Step22 = "Step22_SDAUIRS1284_Glucose Reading link  tutorial displays Image with 4 indicators and text for 4 indicators";
	public static final String Help_LibreLink_T001_Help_Content_Step23 = "Step23_SDAUIRS1285_Verify Glucose Reading second screen is displayed and it shows Background color explanation";
	public static final String Help_LibreLink_T001_Help_Content_Step24 = "Step24_SDAUIRS1286_Glucose Reading third screen is displayed and it shows Trend Arrow explanation";
	public static final String Help_LibreLink_T001_Help_Content_Step25 = "Step25_SDAUIRS1287_Glucose Reading fourth screen is displayed and it shows Non-Actionable Icon image";
	public static final String Help_LibreLink_T001_Help_Content_Step26 = "Step26_SDAUIRS1288_Glucose Reading 5th screen is displayed and it shows the action to be performed on observing Non-actionable result";
	public static final String Help_LibreLink_T001_Help_Content_Step27 = "Step27_SDAUIRS1289_SDAISRS249_App displays an option to access the Safety Information";
	public static final String Help_LibreLink_T001_Help_Content_Step28 = "Step28_SDAUIRS1289_Safety Information  is opened";
	public static final String Help_LibreLink_T001_Help_Content_Step29 = "Step29_SDAUIRS1290_SDAISRS249_App displays an option to access the Quick start guide";
	public static final String Help_LibreLink_T001_Help_Content_Step30 = "Step30_SDAUIRS1290_Quick Start Guide is opened";
	public static final String Help_LibreLink_T001_Help_Content_Step31 = "Step31_SDAUIRS1291_SDAISRS249_App displays an option to access the Quick Reference Guide";
	public static final String Help_LibreLink_T001_Help_Content_Step32 = "Step32_SDAUIRS1291_Quick Reference guide is opened";

	// Settings_T001_AppSettings
	public static final String Settings_T001_AppSettings_Step1= "Step1_SDAUIRS1144_SDAUIRS1253_The App Navigates to Target Glucose Range screen and has an option to set the Target Glucose Range";
	public static final String Settings_T001_AppSettings_Step2= "Step2_SDAUIRS1144_SDAUIRS1253_SDAISRS172_The App allows the user to set the Upper Value between 71-180 mg/dL or 4.0 -10.0 mmol/L";
	public static final String Settings_T001_AppSettings_Step3= "Step3_SDAUIRS1144_SDAUIRS1253_SDAISRS172_The App allows the user to set the Upper Value between 101-180 mg/dL or 5.7-10.0 mmol/L";
	public static final String Settings_T001_AppSettings_Step4= "Step4_SDAUIRS1144_SDAUIRS1253_SDAISRS172_The App allows the user to set the Lower Value between 70 -179 mg/dL or 3.9 - 9.9 mmol/L";
	public static final String Settings_T001_AppSettings_Step5= "Step5_SDAUIRS1144_SDAUIRS1253_SDAISRS172_The App allows the user to set the Lower Value as 70 mg/dL or 3.9 mmol/L";
	public static final String Settings_T001_AppSettings_Step6= "Step6_SDAUIRS1144_SDAUIRS1253_SDAISRS172_The App allows the user to set the Lower Value  between 70 -139 mg/dL or 3.9 - 7.7 mmol/L";
	public static final String Settings_T001_AppSettings_Step7= "Step7_SDAUIRS1145_The App Navigates to Carbohydrate Units screen and has an option to set the Carbohydrate Units as grams or servings";
	public static final String Settings_T001_AppSettings_Step8= "Step8_SDAUIRS1145_SDAISRS830_grams UOM is selected & serving size selection is disabled";
	public static final String Settings_T001_AppSettings_Step9= "Step9_SDAUIRS1145_SDAUIRS1146_SDAISRS830_servings UOM is selected & the App allows the user to set 1 servings/portions as 10 -15 grams, in 0.5 grams increments. ";	
	public static final String Settings_T001_AppSettings_Step10= "Step10_SDAUIRS1245_Text to Speech feature is dsplayed as ON in App Settings screen ";
	public static final String Settings_T001_AppSettings_Step11= "Step11_SDAUIRS1246_Text to Speech feature is dsplayed as OFF in App Settings screen";
	public static final String Settings_T001_AppSettings_Step12= "Step12_SDAUIRS1144_SDAUIRS1145_SDAUIRS1246_The App Settings screen is displayed the:Target Glucose Range with range 100-140 mg/dL ( or 5.6-7.8  mmol/L),Carbohydrate Units with UOM as servings/portions and Text to Speech  Setting is set to off";
	public static final String Settings_T001_AppSettings_Step13= "Step13_SDAUIRS1144_SDAUIRS1145_SDAUIRS1245 SDAUIRS1246_SDAISRS172_SDAISRS830 The App Settings screen is displayed:Target Glucose Range with range 140-160 mg/dL ( or 7.8-8.9  mmol/L),Carbohydrate Units with UOM as grams and Text to Speech setting is set to on";

	// Settings_T002_MinorAccountSettings
	public static final String Settings_T002_MinorAccountSettings_Step1= "Step1_SDAUIRS1238_First Name, Last Name, Date of Birth are displayed on App's New Account registration page";
	public static final String Settings_T002_MinorAccountSettings_Step2= "Step2_SDAUIRS1238_Date of birth is used to set up your LibreView account and not to determine whether the App is appropriate for your use. Please consult the App user's manual before using the App,warning message is displayed.";
	public static final String Settings_T002_MinorAccountSettings_Step3= "Step3_SDAUIRS1238_Parent/Guardian Account Login screen is displayed on clicking OK";
	public static final String Settings_T002_MinorAccountSettings_Step4= "Step4_SDAUIRS1238_Unit of Measure screen is displayed without any account creation errors";
	public static final String Settings_T002_MinorAccountSettings_Step5= "Step5_SDAUIRS1238_HOME screen is displayed on completing the initial setup";
	public static final String Settings_T002_MinorAccountSettings_Step6= "Step6_SDAUIRS925_SDAUIRS926_Account Settings screen is displayed with an option to modify the fields";
	public static final String Settings_T002_MinorAccountSettings_Step7= "Step7_SDAUIRS925_SDAUIRS926_Date of birth is used to set up your LibreView account and not to determine whether the App is appropriate for your use. Please consult the App user's manual before using the App,warning message is displayed.";
	public static final String Settings_T002_MinorAccountSettings_Step8= "Step8_SDAUIRS925_SDAUIRS926_On clicking OK, details are updated and Settings screen is displayed.";
	public static final String Settings_T002_MinorAccountSettings_Step9= "Step9_SDAUIRS925_SDAUIRS926_The following fields are updated and saved, First Name, Last Name, Parent/Legal Guardian First Name, Parent/Legal Guardian Last Name";         
	public static final String Settings_T002_MinorAccountSettings_Step10= "Step10_SDAUIRS926_Account Password Screen and has the fields Current Password, New Password, Confirm password. SUBMIT button is disabled";  
	public static final String Settings_T002_MinorAccountSettings_Step11= "Step11_SDAUIRS926_SDAUIRS1255_Error message is displayed for invalid password and App does not allow the user to change the password";
	public static final String Settings_T002_MinorAccountSettings_Step12= "Step12_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without numbers and App does not allow the user to change the password";
	public static final String Settings_T002_MinorAccountSettings_Step13= "Step13_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without letters and App does not allow the user to change the password";
	public static final String Settings_T002_MinorAccountSettings_Step14= "Step14_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without lower case letters and App does not allow the user to change the password";
	public static final String Settings_T002_MinorAccountSettings_Step15= "Step15_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without upper case letters and App does not allow the user to change the password";
	public static final String Settings_T002_MinorAccountSettings_Step16= "Step16_SDAUIRS926_SDAUIRS1255_Error message is displayed for password with 7 characters and App does not allow the user to change the password";
	public static final String Settings_T002_MinorAccountSettings_Step17= "Step17_SDAUIRS926_SDAUIRS1255_App does not allow the user to enter 37 characters in a password";
	public static final String Settings_T002_MinorAccountSettings_Step18= "Step18_SDAUIRS926_SDAUIRS1255_The app allows the user to change the password when it is valid and Settings screen is displayed on success";
	public static final String Settings_T002_MinorAccountSettings_Step19= "Step19_SDAUIRS926_The App allows the user to Log in with updated credentials";
	public static final String Settings_T002_MinorAccountSettings_Step20= "Step20_SDAUIRS926_Unit of Measurement Screen displays country details with its Unit of Measurement after succesful login";
	public static final String Settings_T002_MinorAccountSettings_Step21= "Step21_SDAUIRS926_SDAUIRS1238_Home screen is displayed on completing the initial setup";

	// Settings_T003_AdultAccountSettings
	public static final String Settings_T003_AdultAccountSettings_Step1= "Step1_SDAUIRS925_The App Navigates to Account Settings screen and has an option to modify the following fields:First Name,Last Name,Date of birth, Password except email";
	public static final String Settings_T003_AdultAccountSettings_Step2= "Step2_SDAUIRS925_The app will show a message to the user that,You cannot change your account type from adult to minor. Please edit your date of birth accordingly with OK button";
	public static final String Settings_T003_AdultAccountSettings_Step3= "Step3_SDAUIRS925_The App displays the Setting screen after accepting the adult date entry";
	public static final String Settings_T003_AdultAccountSettings_Step4= "Step4_SDAUIRS925_The following fields are edited:First Name,Last Name and saved";
	public static final String Settings_T003_AdultAccountSettings_Step5= "Step5_SDAUIRS926_The App Navigates to Account Password Screen and has the following fields:Current Password,New Password,Confirm password,SUBMIT button is disabled.";     
	public static final String Settings_T003_AdultAccountSettings_Step6= "Step6_SDAUIRS926_SDAUIRS1255_Error message is displayed for invalid password and App does not allow the user to change the password.";
	public static final String Settings_T003_AdultAccountSettings_Step7= "Step7_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without numbers and App does not allow the user to change the password.";
	public static final String Settings_T003_AdultAccountSettings_Step8= "Step8_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without letters and App does not allow the user to change the password.";
	public static final String Settings_T003_AdultAccountSettings_Step9= "Step9_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without any lower case letters and App does not allow the user to change the password.";
	public static final String Settings_T003_AdultAccountSettings_Step10= "Step10_SDAUIRS926_SDAUIRS1255_Error message is displayed for password without any upper case letters and App does not allow the user to change the password.";
	public static final String Settings_T003_AdultAccountSettings_Step11= "Step11_SDAUIRS926_SDAUIRS1255_Error message is displayed for password with 7 characters and App does not allow the user to change the password.";
	public static final String Settings_T003_AdultAccountSettings_Step12= "Step12_SDAUIRS926_SDAUIRS1255_The app does not allow the user to enter 37 characters in a password";
	public static final String Settings_T003_AdultAccountSettings_Step13= "Step13_SDAUIRS926_SDAUIRS1255_The app does not allow the user to progress when passwords mismatch.";
	public static final String Settings_T003_AdultAccountSettings_Step14= "Step14_SDAUIRS926_SDAUIRS1255_The app allows the user to change the password when it is valid and Settings screen is displayed on success";

	/* 
	 * Sensor Interactions
	 */

	//SensorActivation_T001_Mock1UI_ErrorMessages
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step1= "Step1_SDAUIRS1174_Check Glucose is displayed ";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step2= "Step2_SDAUIRS1174_Scan new sensor screen is displayed on clicking NEXT";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step3= "Step3_SDAUIRS1084_Sensor ended dialog is displayed for Sensor Expired error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step4= "Step4_SDAUIRS1084_App returns back to Home screen";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step5= "Step5_SDAUIRS1085_Sensor Already in Use dialog is displayed for SensorAlreadyStarted error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step6= "Step6_SDAUIRS1085_App returns back to Home screen";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step7= "Step7_SDAUIRS1087_Scan Error dialog is displayed for  ResponseCorrupt error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step8= "Step8_SDAUIRS1087_App returns back to Home screen";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step9= "Step9_SDAUIRS1088_Replace Sensor dialog is displayed for SensorTerminated error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step10= "Step10_SDAUIRS1088_App returns back to Home screen";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step11= "Step11_SDAUIRS1089_Replace Sensor dialog is displayed for SensorRemoved error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step12= "Step12_SDAUIRS1089_App returns back to Home screen";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step13= "Step13_SDAUIRS1090_Incompatible Sensor dialog is displayed SensorNotCompatble error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step14= "Step14_SDAUIRS1090_App returns back to Home screen";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step15= "Step15_SDAUIRS1083_Scan Error dialog is displayed for SensorRFTransmission error";
	public static final String SensorActivation_T001_Mock1UI_ErrorMessages_Step16= "Step16_SDAUIRS1083_App returns back to Home screen";


	//SensorScanning_T001_Mock1UI__ErrorMessages
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step1= "Step1_Home screen shows Check Glucose  on the bottom, 130 mg/dL or 7.2 mmol/L for Last Scan, 110 mg/dL or 6.2 mmol/L for average.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step2= "Step2_SDAUIRS1097_Scan Error dialog is shown for SensorRfTransmission error ";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step3= "Step3_SDAUIRS1097_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step4= "Step4_SDAUIRS1096_New Sensor Found dialog is shown for SensorNotActive Error ";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step5= "Step5_SDAUIRS1096_App returns to Home screen, My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step6= "Step6_SDAUIRS1096_App returns to 'Scan New Sensor' screen.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step7= "Step7_SDAUIRS1096_App shows Home screen.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step8= "Step8_SDAUIRS1103_SDAISRS330_Sensor Too Hot dialog is shown for SensorTemperatureTooHigh error ";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step9= "Step9_SDAUIRS1103_SDAISRS330_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step10= "Step10_SDAUIRS1104_SDAISRS330_Sensor Too Cold dialog is shown for SensorTemperatureTooLow error ";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step11= "Step11_SDAUIRS1104_SDAISRS330_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step12= "Step12_SDAUIRS1105_SDAISRS827_Sensor Error dialog is shown for SensorTemporaryProblem error";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step13= "Step13_SDAUIRS1105_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step14= "Step14_SDAUIRS1108_Incompatible Sensor dialog is shown for SensorNotCompatible error";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step15= "Step15_SDAUIRS1108_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step16= "Step16_SDAUIRS1101_Sensor Starting Up dialog is shown for SensorInWarmup error";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step17= "Step17_SDAUIRS1101_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step18= "Step18_SDAUIRS1099_Scan Error dialog is shown forResponseCorrupt error";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step19= "Step19_SDAUIRS1099_App returns to Home screen. My glucose screen is not displayed.";
	public static final String SensorScanning_T001_Mock1UI__ErrorMessages_Step20= "Step20_SDAISRS257 SDAISRS368_Event log should display the error messages";


	//SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step1= "Step1_Home screen shows Check Glucose on the bottom, 130 mg/dL or 7.2 mmol/L for Last Scan, 110 mg/dL or 6.2 mmol/L for average.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step2= "Step2_SDAUIRS1098_Replace Sensor dialog is displayed for SensorTerminated error";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step3= "Step3_SDAUIRS1098_App returns to Home screen, My glucose screen is not displayed.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step4= "Step4_SDAISRS257_Event log should display the error messages";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step5= "Step5_Home screen shows Check Glucose on the bottom, 130 mg/dL or 7.2 mmol/L for Last Scan, 110 mg/dL or 6.2 mmol/L for average.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step6= "Step6_SDAUIRS1102_Sensor Ended dialog is displayed for sensor expired error ";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step7= "Step7_SDAUIRS1102_App returns to Home screen, no result screen is displayed.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step8= "Step8_SDAISRS257_Event log should display the error messages";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step9= "Step9_Home screen shows Check Glucose on the bottom, 130 mg/dL or 7.2 mmol/L for Last Scan, 110 mg/dL or 6.2 mmol/L for average.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step10= "Step10_SDAUIRS1106_Check Sensor dialog is displayed for InsertionFailure error";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step11= "Step11_SDAUIRS1106_App returns to Home screen, My glucose screen is not displayed.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step12= "Step12_SDAISRS257_Event log should display the error messages";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step13= "Step13_Home screen shows Check Glucose on the bottom, 130 mg/dL or 7.2 mmol/L for Last Scan, 110 mg/dL or 6.2 mmol/L for average.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step14= "Step14_SDAUIRS1107_Replace Sensor dialog is displayed for Sensor Removed error";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step15= "Step15_SDAUIRS1107_App returns to Home screen, My glucose screen is not displayed.";
	public static final String SensorScanning_T002_Mock1UI_ErrorMessages_Change_Sensor_State_Step16= "Step16_SDAISRS257_Event log should display the error messages";

	// A1c_T001_View_Display_calculation
	public static final String A1c_T001_View_Display_calculation_Step1= "Step1_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from Home Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step2= "Step2_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from Logbook Scn : Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step3= "Step3_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from Reminders Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step4_1= "Step4.1_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from DailyPattern Report Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step4_2= "Step4.2_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from TimeInTarget Report Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step4_3= "Step4.3_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from LowGlucoseEvents Report Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step4_4= "Step4.4_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from AverageGlucose Report Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step4_5= "Step4.5_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from DailyGraph Report Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step4_6= "Step4.6_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from SensorUsage Report Scn: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step5_1= "Step5.1_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from DailyPattern Report from dropdown: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step5_2= "Step5.2_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from TimeInTarget Report from dropdown: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step5_3= "Step5.3_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from LowGlucoseEvents Report from dropdown: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step5_4= "Step5.4_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from AverageGlucose Report from dropdown: 'Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step5_5= "Step5.5_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from DailyGraph Report from dropdown: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step5_6= "Step5.6_SDAUIRS1016_SDAISRS1164_SDAISRS1186_A1cReport from SensorUsage Report from dropdown: Estimated A1c report is displayed and can be viewed ";
	public static final String A1c_T001_View_Display_calculation_Step6= "Step6_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 24 Feb -24 May  2013 displayed on top of the screen ";
	public static final String A1c_T001_View_Display_calculation_Step7= "Step7_SDAUIRS1249_A1cReport_Cal_%_5d : A1c % displayed:8.5% ";
	public static final String A1c_T001_View_Display_calculation_Step8= "Step8_SDAUIRS1249_A1cReport_Cal_mmol : The estimated A1C in mmol/mol is displayed as:69 mmol/mol ";
	public static final String A1c_T001_View_Display_calculation_Step9= "Step9_SDAUIRS1018_A1cReport_DataSpan_5d : 'Estimated A1c report displays the reporting period: Data spans 5 of 90 days ";
	public static final String A1c_T001_View_Display_calculation_Step10= "Step10_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 22 Feb -22 May  2013 is displayed on top of the screen";
	public static final String A1c_T001_View_Display_calculation_Step11= "Step11_SDAUIRS1249_A1cReport_Cal_%_7d : A1c % displayed:For mg/dL unit: 8.6% or For mmol/L unit: 8.5% ";
	public static final String A1c_T001_View_Display_calculation_Step12= "Step12_SDAUIRS1249_A1cReport_Cal_mmol: The estimated A1C in mmol/mol is displayed as:For mg/dL unit: 70 mmol/mol or For mmol/L unit: 69 mmol/mol ";
	public static final String A1c_T001_View_Display_calculation_Step13= "Step13_SDAUIRS1018_A1cReport_DataSpan_7d : Estimated A1c report displays the reporting period: Data spans 7 of 90 days ";
	public static final String A1c_T001_View_Display_calculation_Step14= "Step14_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 15 Feb -15 May  2013 is displayed on top of the screen";
	public static final String A1c_T001_View_Display_calculation_Step15= "Step15_SDAUIRS1249_A1cReport_Cal_%_14d : A1c % displayed:8.1% ";
	public static final String A1c_T001_View_Display_calculation_Step16= "Step16_SDAUIRS1249_A1cReport_Cal_mmol : The estimated A1C in mmol/mol is displayed as:65 mmol/mol ";
	public static final String A1c_T001_View_Display_calculation_Step17= "Step17_SDAUIRS1018_A1cReport_DataSpan_14d : Estimated A1c report displays the reporting period: Data spans 14 of 90 days ";
	public static final String A1c_T001_View_Display_calculation_Step18= "Step18_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 30 Jan -29 Apr  2013 is displayed on top of the screen";
	public static final String A1c_T001_View_Display_calculation_Step19= "Step19_SDAUIRS1249_A1cReport_Cal_%_30d : A1c % displayed:6.8% ";
	public static final String A1c_T001_View_Display_calculation_Step20= "Step20_SDAUIRS1249_A1cReport_Cal_mmol : The estimated A1C in mmol/mol is displayed as:51 mmol/mol ";
	public static final String A1c_T001_View_Display_calculation_Step21= "Step21_SDAUIRS1018_A1cReport_DataSpan_30d : Estimated A1c report displays the reporting period: Report displays Data spans 30 of 90 days ";
	public static final String A1c_T001_View_Display_calculation_Step22= "Step22_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 1 Dec 2012 -28 Feb  2013 is displayed on top of the screen";
	public static final String A1c_T001_View_Display_calculation_Step23= "Step23_SDAUIRS1249_A1cReport_Cal_%_90d : 'A1c % displayed:7.4% ";
	public static final String A1c_T001_View_Display_calculation_Step24= "Step24_SDAUIRS1249_A1cReport_Cal_mmol : The estimated A1C in mmol/mol is displayed as:57 mmol/mol ";
	public static final String A1c_T001_View_Display_calculation_Step25= "Step25_SDAUIRS1018_A1cReport_DataSpan_90d : Estimated A1c report displays the reporting period: Data spans 59 of 90 days ";
	public static final String A1c_T001_View_Display_calculation_Step26= "Step26_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 8 Oct 2012 -5 Jan 2013 is displayed on top of the screen";
	public static final String A1c_T001_View_Display_calculation_Step27= "Step27_SDAUIRS1249_A1cReport_Cal_%_5d : A1c % displayed:5.7% ";
	public static final String A1c_T001_View_Display_calculation_Step28= "Step28_SDAUIRS1249_A1cReport_Cal_mmol_5d : The estimated A1C in mmol/mol is displayed as:39 mmol/mol ";
	public static final String A1c_T001_View_Display_calculation_Step29= "Step29_SDAUIRS1018_A1cReport_DataSpan_5d : Estimated A1c report displays the reporting period: Report displays Data spans 5 of 90 days ";
	public static final String A1c_T001_View_Display_calculation_Step30= "Step30_SDAUIRS955_SDAUIRS1017_A1cReport_Date : The reporting period begins 89 days before the current date and ending on the current date.Date 7 Oct 2012 -4 Jan 2013 is displayed on top of the screen";

	// A1c_T002_View_Display
	public static final String A1c_T002_View_Display_Step1= "Step1_SDAUIRS1250_A1cReport_less20hrAGP: Estimated A1c report displays Not Enough Sensor Data";
	public static final String A1c_T002_View_Display_Step1_2= "Step1.2_SDAUIRS1250_A1cReport_less20hrAGP: Less than 20 hours AGP is displayed on Daily Patterns Report";
	public static final String A1c_T002_View_Display_Step2= "Step2_SDAUIRS1250_A1cReport_20hrAGP: Estimated A1c report displays A1C calculated value";
	public static final String A1c_T002_View_Display_Step2_2= "Step2.2_SDAUIRS1250_A1cReport_20hrAGP: 20 hours AGP is displayed on Daily Patterns Report";
	public static final String A1c_T002_View_Display_Step3= "Step3_SDAUIRS1017_A1cReport_Date: Date 6 Jan -  5 Apr  2014 is displayed on top of the screen";
	public static final String A1c_T002_View_Display_Step4= "Step4_SDAUIRS1018_A1cReport_DataSpan5: Data spans 5 of 90 days' is displayed";
	public static final String A1c_T002_View_Display_Step5= "Step5_SDAUIRS1017_A1cReport_Date: Date 9 Jan - 8 Apr  2014 is displayed on top of the screen";
	public static final String A1c_T002_View_Display_Step6= "Step6_SDAUIRS1018_A1cReport_DataSpan7: Data spans 7 of 90 days is displayed";
	public static final String A1c_T002_View_Display_Step7= "Step7_SDAUIRS1017_A1cReport_Date : Date 12 Jan - 11 Apr  2014 is displayed on top of the screen";
	public static final String A1c_T002_View_Display_Step8= "Step8_SDAUIRS1018_A1cReport_DataSpan10 : Data spans 10 of 90 days is displayed";

	// AverageGlucose_T001_View_Display_Xaxis
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step1= "Step1_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from Home Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step2= "Step2_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from Logbook Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step3= "Step3_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from Reminder Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step4_1= "Step4.1_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from DailyPattern Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step4_2= "Step4.2_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from TimeInTarget Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step4_3= "Step4.3_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from LowGlucoseEvents Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step4_4= "Step4.4_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from DailyGraph Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step4_5= "Step4.5_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from EstimatedA1c Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step4_6= "Step4.6_SDAUIRS991_SDAISRS1164_SDAISRS1168_Average Glucose report from SensorUsage Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step5_1= "Step5.1_SDAUIRS991_SDAISRS1164_SDAISRS1168_Select Average Glucose report from drop down in DailyPattern Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step5_2= "Step5.2_SDAUIRS991_SDAISRS1164_SDAISRS1168_Select Average Glucose report from drop down in TimeInTarget Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step5_3= "Step5.3_SDAUIRS991_SDAISRS1164_SDAISRS1168_Select Average Glucose report from drop down in LowGlucoseEvents Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step5_4= "Step5.4_SDAUIRS991_SDAISRS1164_SDAISRS1168_Select Average Glucose report from drop down in DailyGraph Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step5_5= "Step5.5_SDAUIRS991_SDAISRS1164_SDAISRS1168_Select Average Glucose report from drop down in EstimatedA1c Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step5_6= "Step5.6_SDAUIRS991_SDAISRS1164_SDAISRS1168_Select Average Glucose report from drop down in SensorUsage Report Scn:Average Glucose report is displayed and can be viewed";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step6= "Step6_SDAUIRS955_SDAUIRS992_Average Glucose report_DateDisplay_90d:Date 1 Dec 2012 - 28 Feb 2013  displayed on top of the screen";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step7= "Step7_SDAUIRS955_SDAUIRS992_Average Glucose report_DateDisplay_30d:Date 30 Jan-28 Feb 2013 displayed on top of the screen";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step8= "Step8_SDAUIRS955_SDAUIRS992_Average Glucose report_DateDisplay_7d:Date 22-28 February 2013 displayed on top of the screen";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step9= "Step9_SDAUIRS955_SDAUIRS992_Average Glucose report_DateDisplay_14d:Date 15-28 February 2013 displayed on top of the screen";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step10= "Step10_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_24hr_14d:bar graph has an X-axis from midnight to midnight.00:00-00:00 and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step11= "Step11_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_24hr_90d:bar graph has an X-axis from midnight to midnight.00:00-00:00 and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step12= "Step12_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_24hr_30d:bar graph has an X-axis from midnight to midnight.00:00-00:00 and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step13= "Step13_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_24hr_7d:bar graph has an X-axis from midnight to midnight.00:00-00:00 and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step14= "Step14_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_12hr_90d:bar graph has an X-axis from midnight to midnight.12am-12am and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step15= "Step15_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_12hr_30d:bar graph has an X-axis from midnight to midnight.12am-12am and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step16= "Step16_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_12hr_14d:bar graph has an X-axis from midnight to midnight.12am-12am and one bar per 3-hour period";
	public static final String AverageGlucose_T001_View_Display_Xaxis_Step17= "Step17_SDAUIRS996_SDAUIRS998_Average Glucose report_X-axis_12hr_7d:bar graph has an X-axis from midnight to midnight.12am-12am and one bar per 3-hour period";

	// AverageGlucose_T002_DataAvailable
	public static final String AverageGlucose_T002_DataAvailable_Step1= "Step1_SDAUIRS994_Average Glucose report_Data Available_7 days:Data Available for 4 of 7 days";
	public static final String AverageGlucose_T002_DataAvailable_Step2= "Step2_SDAUIRS994_Average Glucose report_Data Available_14 days:Data Available for 6 of 14 days";
	public static final String AverageGlucose_T002_DataAvailable_Step3= "Step3_SDAUIRS994_Average Glucose report_Data Available_30 days:Data Available for 6 of 30 days";
	public static final String AverageGlucose_T002_DataAvailable_Step4= "Step4_SDAUIRS994_Average Glucose report_Data Available_90 days:Data Available for 6 of 90 days";

	// AverageGlucose_T003_Calculation_Distinguish_Data_mg
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step1= "Step1_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 14 days: 185 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step2= "Step2_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 7 days: 199 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step3= "Step3_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 90 days: 165 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step4= "Step4_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 30 days: 149 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step5= "Step5_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_30d:The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 133 ;03:00-06:00: 149;06:00-09:00: 154;09:00-12:00: 160;12:00-15:00: 158;15:00-18:00: 153;18:00-21:00: 147;21:00-00:00: 138";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step6= "Step6_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_7d:The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 185;03:00-06:00: 196;06:00-09:00: 201;09:00-12:00: 214;12:00-15:00: 205;15:00-18:00: 199;18:00-21:00: 201;21:00-00:00: 187";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step7= "Step7_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_90d:The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 146;03:00-06:00: 159;06:00-09:00: 170;09:00-12:00: 175;12:00-15:00: 175;15:00-18:00: 172;18:00-21:00: 165;21:00-00:00: 153";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step8= "Step8_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_14d:The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 172;03:00-06:00: 184;06:00-09:00: 191;09:00-12:00: 197;12:00-15:00: 193;15:00-18:00: 189;18:00-21:00: 184;21:00-00:00: 173";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step9= "Step9_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 7 days: 250 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step10= "Step10_SDAUIRS995_Average Glucose report_bar graph_DailyAverage_High-1data_7d:The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 501;03:00-06:00: 241;06:00-09:00: 500;09:00-12:00: 240;12:00-15:00: 239;15:00-18:00:  70;18:00-21:00: 140;21:00-00:00: 180";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step11= "Step11_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_7d:The Average Glucose report displays a Y-axis range from 0 to 501 mg/dL contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step12= "Step12_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_14d:The Average Glucose report displays a Y-axis range from 0 to 500 mg/dL contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step13= "Step13_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_30d:The Average Glucose report displays a Y-axis range from 0 to 500 mg/dL contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step14= "Step14_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_90d:The Average Glucose report displays a Y-axis range from 0 to 500 mg/dL contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step15= "Step15_SDAUIRS1000_The Average Glucose report displays the average glucose corresponding to each bar.00:00-03:00: 393;03:00-06:00: 241;06:00-09:00: 500;09:00-12:00: 240;12:00-15:00: 239;15:00-18:00:  70;18:00-21:00: 129;21:00-00:00: 180";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_1= "Step16.1_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_90d:The software distinguishes bars with values 70-154 mg/dL in yellow;values 155-180 mg/dL in green;values 181-240 mg/dL in yellow;values >240 mg/dL in orange";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_2= "Step16.2_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_30d:The software distinguishes bars with values 70-154 mg/dL in yellow;values 155-180 mg/dL in green;values 181-240 mg/dL in yellow;values >240 mg/dL in orange";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_3= "Step16.3_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_14d:The software distinguishes bars with values 70-154 mg/dL in yellow;values 155-180 mg/dL in green;values 181-240 mg/dL in yellow;values >240 mg/dL in orange";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step16_4= "Step16.4_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_7d:The software distinguishes bars with values 70-154 mg/dL in yellow;values 155-180 mg/dL in green;values 181-240 mg/dL in yellow;values >240 mg/dL in orange";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step17= "Step17_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_7d:The Average Glucose report displays the average glucose corresponding to each bar:00:00-03:00: 501";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step18= "Step18_SDAUIRS993_Average Glucose report_Display_TotalDailyAve-only501:The Average Glucose report displays the average value of all historic glucose readings in 7 days: 501 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step19= "Step19_SDAUIRS997_Average Glucose report_bar graph_Y-axis_LOW_7d:The Average Glucose report displays a Y-axis range from 0 to around 39 mg/dL contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step20= "Step20_SDAUIRS997_Average Glucose report_bar graph_Y-axis_LOW_30d:The Average Glucose report displays a Y-axis range from 0 to around 100 mg/dL and Y axis is not labelled";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step21_1= "Step21.1_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_14d:The Average Glucose report displays the average glucose corresponding to each bar.time in 24 hour format:00:00-03:00: 39;03:00-06:00: 69;06:00-09:00: 39;09:00-12:00: 70;12:00-15:00: 71;15:00-18:00: 100;18:00-21:00: null;21:00-00:00: null";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step21_2= "Step21.2_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_14d:The Average Glucose report displays the average glucose corresponding to each bar.Time in 12 hour format:12am-3am: 39;3am-6am: 69;6am-9am: 39;9am-12pm: 70;12pm-3pm: 71;3pm-6pm: 100;6pm-9pm: null;9pm-12am: null";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step22= "Step22_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_The software distinguishes bars with values < 70 mg/dL in red; values 70-71 mg/dL in green;values 72-240 mg/dL in yellow";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step23= "Step23_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 7 days: 39 mg/dL";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_1= "Step24.1_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Bar graph_distinguish_7d:The software distinguishes bars with values < 70 mg/dL in red; values 70-71 mg/dL in green;values 72-240 mg/dL in yellow ";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_2= "Step24.2_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Bar graph_distinguish_14d:The software distinguishes bars with values < 70 mg/dL in red; values 70-71 mg/dL in green;values 72-240 mg/dL in yellow";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_3= "Step24.3_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Bar graph_distinguish_30d:The software distinguishes bars with values < 70 mg/dL in red; values 70-71 mg/dL in green;values 72-240 mg/dL in yellow";
	public static final String AverageGlucose_T003_Calculation_Distinguish_Data_mg_Step24_4= "Step24.4_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Bar graph_distinguish_90d:The software distinguishes bars with values < 70 mg/dL in red; values 70-71 mg/dL in green;values 72-240 mg/dL in yellow";

	// AverageGlucose_T004_Calculation_Distinguish_Data_mmol
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step1= "Step1_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 14 days: 10.3 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step2= "Step2_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 7 days: 11.0 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step3= "Step3_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 90 days:  9.1 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step4= "Step4_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 30 days: 8.3 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step5= "Step5_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_30d: The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 7.4;03:00-06:00: 8.3;06:00-09:00: 8.6;09:00-12:00: 8.9;12:00-15:00: 8.8;15:00-18:00: 8.5;18:00-21:00: 8.2;21:00-00:00: 7.7";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step6= "Step6_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_7d: The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 10.3;03:00-06:00: 10.9;06:00-09:00: 11.2;09:00-12:00: 11.9;12:00-15:00: 11.4;15:00-18:00: 11.0;18:00-21:00: 11.2;21:00-00:00: 10.4";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step7= "Step7_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_90d: The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 8.1;03:00-06:00: 8.9;06:00-09:00: 9.5;09:00-12:00: 9.7;12:00-15:00: 9.7;15:00-18:00: 9.6;18:00-21:00: 9.2;21:00-00:00: 8.5";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step8= "Step8_SDAUIRS995_SDAUIRS1000_Average Glucose report_bar graph_DailyAverage_14d: The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 9.5;03:00-06:00: 10.2;06:00-09:00: 10.6;09:00-12:00: 11.0;12:00-15:00: 10.7;15:00-18:00: 10.5;18:00-21:00: 10.2;21:00-00:00: 9.6";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step9= "Step9_SDAUIRS993_The Average Glucose report displays the average value of all historic glucose readings in 7 days: 13.9 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step10= "Step10_SDAUIRS995_The Average Glucose report displays a bar graph showing the average of all historic glucose readings within each time period of the day:00:00-03:00: 27.8;03:00-06:00: 13.4;06:00-09:00: 27.8;09:00-12:00: 13.3;12:00-15:00: 13.3;15:00-18:00:  3.9;18:00-21:00: 7.8;21:00-00:00: 10.0";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step11= "Step11_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_7d: The Average Glucose report displays a Y-axis range from 0 to  27.8 mmol/L contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step12= "Step12_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_14d: The Average Glucose report displays a Y-axis range from 0 to  27.8 mmol/L contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step13= "Step13_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_30d: The Average Glucose report displays a Y-axis range from 0 to  27.8 mmol/L contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step14= "Step14_SDAUIRS997_Average Glucose report_bar graph_Y-axis_High-1data_90d: The Average Glucose report displays a Y-axis range from 0 to  27.8 mmol/L contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step15= "Step15_SDAUIRS1000_The Average Glucose report displays the average glucose corresponding to each bar.00:00-03:00: 21.8;03:00-06:00: 13.4;06:00-09:00: 27.8;09:00-12:00: 13.3;12:00-15:00: 13.3;15:00-18:00:  3.9;18:00-21:00: 7.2;21:00-00:00: 10.0";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_1= "Step16.1_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_90d:The software distinguishes bars with:values 3.9-8.5 mmol/L in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3 mmol/L in yellow;values >13.3 mmol/L in orange";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_2= "Step16.2_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_30d:The software distinguishes bars with:values 3.9-8.5 mmol/L in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3 mmol/L in yellow;values >13.3 mmol/L in orange";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_3= "Step16.3_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_14d:The software distinguishes bars with:values 3.9-8.5 mmol/L in yellow;values 8.6-10.0 mmol/L in green;values 10.1-13.3 mmol/L in yellow;values >13.3 mmol/L in orange";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step16_4= "Step16.4_SDAUIRS1200_SDAUIRS1197_SDAUIRS1198_ SDAUIRS1199_Bar graph_distinguish_7d:The software distinguishes bars with:values >13.3 mmol/L in orange";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step17= "Step17_SDAUIRS1000_The Average Glucose report displays the average glucose corresponding to each bar.00:00-03:00: 27.8";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step18= "Step18_SDAUIRS993_Average Glucose report_Display: The Average Glucose report displays the average value of all historic glucose readings in 7 days:  27.8 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step19= "Step19_SDAUIRS997_Average Glucose report_bar graph_Y-axis_LOW_7d: The Average Glucose report displays a Y-axis range from 0 to around 2.2 mmol/L contained within the graph and Y axis is not labelled";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step20= "Step20_SDAUIRS997_Average Glucose report_bar graph_Y-axis_LOW_30d: The Average Glucose report displays a Y-axis range from 0 to around 5.6 mmol/L and Y axis is not labelled";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step21_1= "Step21.1_SDAUIRS1000_Average Glucose report displays the value 00:00-03:00 2.2, 03:00-06:00 3.8, 06:00-09:00 2.2, 09:00-12:00 3.9, 12:00-15:00 3.9, 15:00-18:00 5.6, 18:00-21:00 null, 21:00-00:00 null";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step21_2= "Step21.2_SDAUIRS1000_Average Glucose report displays the value 12am-3am 2.2, 3am-6am 3.8, 6am-9am 2.2, 9am-12pm 3.9, 12pm-3pm 3.9, 3pm-6pm 5.6, 6pm-9pm null, 9pm-12am null";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step22= "Step22_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Bar graph_distinguish_30d: The software distinguishes bars with values < 3.9 mmol/L in red; values 3.9-4.0 mmol/L in green;values 4.1- 13.3 mmol/L in yellow ";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step23= "Step23_SDAUIRS993_Average Glucose report_Display_TotalDailyAve-only39: The Average Glucose report displays the average value of all historic glucose readings in 7 days: 2.2 mmol/L";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_1= "Step24.1_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Average Glucose report_7d_The software distinguishes bars with values < 3.9 mmol/L in red; values 3.9-4.0 mmol/L in green;values 4.1- 13.3 mmol/L in yellow ";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_2= "Step24.2_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Average Glucose report_14d_The software distinguishes bars with values < 3.9 mmol/L in red; values 3.9-4.0 mmol/L in green;values 4.1- 13.3 mmol/L in yellow ";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_3= "Step24.3_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Average Glucose report_30d_The software distinguishes bars with values < 3.9 mmol/L in red; values 3.9-4.0 mmol/L in green;values 4.1- 13.3 mmol/L in yellow ";
	public static final String AverageGlucose_T004_Calculation_Distinguish_Data_mmol_Step24_4= "Step24.4_SDAUIRS1196_SDAUIRS1200_SDAUIRS1197_ SDAUIRS1198_Average Glucose report_90d_The software distinguishes bars with values < 3.9 mmol/L in red; values 3.9-4.0 mmol/L in green;values 4.1- 13.3 mmol/L in yellow ";

	// SensorUsage_T001_View_Display
	public static final String SensorUsage_T001_View_Display_Step1= "Step1_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from Home Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step2= "Step2_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from Logbook Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step3= "Step3_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from Reminder Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step4_1= "Step4.1_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from DailyPattern Report Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step4_2= "Step4.2_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from TimeInTarget Report Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step4_3= "Step4.3_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from LowGlucoseEvents Report Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step4_4= "Step4.4_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from AverageGlucose Report Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step4_5= "Step4.5_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from DailyGraph Report Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step4_6= "Step4.6_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from Estimated A1c Report Scn:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step5_1= "Step5.1_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from DailyPattern Report Scn from dropdown:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step5_2= "Step5.2_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from TimeInTarget Report Scn from dropdown:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step5_3= "Step5.3_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from LowGlucoseEvents Report Scn from dropdown:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step5_4= "Step5.4_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from AverageGlucose Report Scn from dropdown:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step5_5= "Step5.5_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from DailyGraph Report Scn from dropdown:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step5_6= "Step5.6_SDAUIRS1020_SDAISRS1164_SDAISRS1170_Sensor Usage report from Estimated A1c Report Scn from dropdown:Sensor Usage report is displayed and can be viewed";
	public static final String SensorUsage_T001_View_Display_Step6= "Step6_SDAUIRS955_SDAUIRS1021_Sensor Usage report_DateDisplay_90d: Date 1 Dec-28 Feb 2013 is displayed on top of the screen of the screen";
	public static final String SensorUsage_T001_View_Display_Step7= "Step7_SDAUIRS955_SDAUIRS1021_Sensor Usage report_DateDisplay_30d: Date 30 Jan-28 Feb 2013 is displayed on top of the screen";
	public static final String SensorUsage_T001_View_Display_Step8= "Step8_SDAUIRS955_SDAUIRS1021_Sensor Usage report_DateDisplay_7d: Date 22-28 February 2013 is displayed on top of the screen";
	public static final String SensorUsage_T001_View_Display_Step9= "Step9_SDAUIRS955_SDAUIRS1021_Sensor Usage report_DateDisplay_14d: Date 15-28 February 2013 is displayed on top of the screen";
	public static final String SensorUsage_T001_View_Display_Step10= "Step10_SDAUIRS955_SDAUIRS1021_Sensor Usage report_DateDisplay_14d_Add2d: Date 17 Feb - 2 Mar 2013 is displayed on top of the screen";
	public static final String SensorUsage_T001_View_Display_Step11= "Step11_SDAUIRS955_SDAUIRS1021_Sensor Usage report_DateDisplay_14d_LeapYr: Date 18 Feb - 2 Mar 2016 is displayed on top of the screen";

	// SensorUsage_T002_Calculation
	public static final String SensorUsage_T002_Calculation_Step1= "Step1_SDAUIRS1022_SDAUIRS1023_SDAUIRS1024_Sensor Usage report_7d: Total number of successful scan attempts:18, average scans:3 and percent of historical glucose data: 74%";
	public static final String SensorUsage_T002_Calculation_Step2= "Step2_SDAUIRS1022_SDAUIRS1023_SDAUIRS1024_Sensor Usage report_14d: Total number of successful scan attempts:49, average scans:4 and percent of historical glucose data: 88%";
	public static final String SensorUsage_T002_Calculation_Step3= "Step3_SDAUIRS1022_SDAUIRS1023_SDAUIRS1024_Sensor Usage report_30d: Total number of successful scan attempts:109, average scans:4 and percent of historical glucose data: 96%";
	public static final String SensorUsage_T002_Calculation_Step4= "Step4_SDAUIRS1022_SDAUIRS1023_SDAUIRS1024_Sensor Usage report_90d: Total number of successful scan attempts:227, average scans:3 and percent of historical glucose data: 68%";

	// TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step1= "Step1_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from Home Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step2= "Step2_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from Logbook Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step3= "Step3_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from Reminder Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_1= "Step4.1_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from DailyPattern Report Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_2= "Step4.2_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from LowGlucoseEvents Report Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_3= "Step4.3_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from AverageGlucose Report Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_4= "Step4.4_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from DailyGraph Report Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_5= "Step4.5_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from EstimatedA1c Report Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step4_6= "Step4.6_SDAUIRS969_SDAISRS1164_SDAISRS1166_Time In Target report from SensorUsage Report Scn:Time In Target report is displayed and can be viewed ";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_1= "Step5.1_SDAUIRS969_SDAISRS1164_SDAISRS1166_Select from dropdown Time In Target report from DailyPattern Report Scn:Time In Target report is displayed and can be viewed";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_2= "Step5.2_SDAUIRS969_SDAISRS1164_SDAISRS1166_Select from dropdown Time In Target report from LowGlucoseEvents Report Scn:'Time In Target report is displayed and can be viewed";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_3= "Step5.3_SDAUIRS969_SDAISRS1164_SDAISRS1166_Select from dropdown Time In Target report from AverageGlucose Report Scn:Time In Target report is displayed and can be viewed";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_4= "Step5.4_SDAUIRS969_SDAISRS1164_SDAISRS1166_Select from dropdown Time In Target report from DailyGraph Report Scn:Time In Target report is displayed and can be viewed";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_5= "Step5.5_SDAUIRS969_SDAISRS1164_SDAISRS1166_Select from dropdown Time In Target report from EstimatedA1c Report Scn:Time In Target report is displayed and can be viewed";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step5_6= "Step5.6_SDAUIRS969_SDAISRS1164_SDAISRS1166_Select from dropdown Time In Target report from SensorUsage Report Scn:Time In Target report is displayed and can be viewed";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step6= "Step6_SDAUIRS955_SDAUIRS970_Time In Target report DateDisplay_90d: 1 Dec 2012 - 28 Feb 2013  displayed on top of the screen";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step7= "Step7_SDAUIRS955_SDAUIRS970_Time In Target report DateDisplay_30d: Date 30 Jan-28 Feb 2013 displayed on top of the screen";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step8= "Step8_SDAUIRS955_SDAUIRS970_Time In Target report DateDisplay_7d: Date 22-28 February 2013 displayed on top of the screen";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step9= "Step9_SDAUIRS955_SDAUIRS970_Time In Target report DateDisplay_14d: 'Date 15-28 February 2013 displayed on top of the screen";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_1= "Step10.1_SDAUIRS1193_Time In Target report_display_target Range for 7days: Target Range is displayed: 100-140 mg/dL or 5.6-7.8 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_2= "Step10.2_SDAUIRS1193_Time In Target report_display_target Range for 14days: Target Range is displayed: 100-140 mg/dL or 5.6-7.8 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_3= "Step10.3_SDAUIRS1193_Time In Target report_display_target Range for 30days: Target Range is displayed: 100-140 mg/dL or 5.6-7.8 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step10_4= "Step10.4_SDAUIRS1193_Time In Target report_display_target Range for 90days: Target Range is displayed: 100-140 mg/dL or 5.6-7.8 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_1= "Step11.1_SDAUIRS1193_Time In Target report_display_target Range for 7days: Target Range is displayed: 70-180 mg/dL or 3.9-10.0 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_2= "Step11.2_SDAUIRS1193_Time In Target report_display_target Range for 14days: Target Range is displayed: 70-180 mg/dL or 3.9-10.0 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_3= "Step11.3_SDAUIRS1193_Time In Target report_display_target Range for 30days: Target Range is displayed: 70-180 mg/dL or 3.9-10.0 mmol/L";
	public static final String TimeInTarget_T001_ViewReport_ReportPeriods_TargetRange_Step11_4= "Step11.4_SDAUIRS1193_Time In Target report_display_target Range for 90days: Target Range is displayed: 70-180 mg/dL or 3.9-10.0 mmol/L";

	// TimeInTarget_T002_DataAvailable
	public static final String TimeInTarget_T002_DataAvailable_Step1= "Step1_SDAUIRS971_Time In Target report_Data Available_7 days:Data Available for 4 of 7 days ";
	public static final String TimeInTarget_T002_DataAvailable_Step2= "Step2_SDAUIRS971_Time In Target report_Data Available_90 days:Data Available for 6 of 90 days ";
	public static final String TimeInTarget_T002_DataAvailable_Step3= "Step3_SDAUIRS971_Time In Target report_Data Available_30 days:Data Available for 6 of 30 days ";
	public static final String TimeInTarget_T002_DataAvailable_Step4= "Step4_SDAUIRS971_Time In Target report_Data Available_14 days:Data Available for 6 of 14 days ";

	// TimeInTarget_T003_Percentage_DistinguishTargetRange_mg
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step1= "Step1_SDAUIRS974_Time In Target report_percentage_within Target_7d: percentage Within Target is 0%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step2= "Step2_SDAUIRS973_Time In Target report_percentage_below70_7d: percentage below70 is 0%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step3= "Step3_SDAUIRS975_Time In Target report_percentage_70-lowTarget_7d: percentage of 70-99 is 0%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step4= "Step4_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-240_7d: percentage of 141-240 is 96%;Bar in yellow color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step5= "Step5_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above240_7d: percentage above240 is 4%;Bar in orange color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step6= "Step6_SDAUIRS972_SDAUIRS974_Time In Target report_percentage_within Target_14d: percentage Within Target is 1%;Bar of the target range is in green color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step7= "Step7_SDAUIRS973_Time In Target report_percentage_below70_14d: percentage below70 is 0%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step8= "Step8_SDAUIRS975_Time In Target report_percentage_70-lowTarget_14d: percentage of 70-99 is 0%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step9= "Step9_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-240_14d: percentage of 141-240 is 97%;Bar in yellow color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step10= "Step10_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above240_14d: percentage above240 is 2%;Bar in orange color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step11= "Step11_SDAUIRS972_SDAUIRS974_Time In Target report_percentage_within Target_30d: percentage Within Target is 20% with unit mg/dL;Bar of the target range is in green color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step12= "Step12_SDAUIRS972_SDAUIRS973_Time In Target report_percentage_below70_30d: percentage below70 is 7%;Bar in red color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step13= "Step13_SDAUIRS972_SDAUIRS975_Time In Target report_percentage_70-lowTarget_30d: percentage of 70-99 is 12%;Bar in yellow color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step14= "Step14_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-240_30d: percentage of 141-240 is 60%;Bar in yellow color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step15= "Step15_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above240_30d: percentage above240 is 1%;Bar in orange color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step16= "Step16_SDAUIRS972_SDAUIRS974_Time In Target report_percentage_within Target_90d: percentage Within Target is 17% with unit mg/dL;Bar of the target range is in green color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step17= "Step17_SDAUIRS972_SDAUIRS973_Time In Target report_percentage_below70_90d: percentage below70 is 3%;Bar in red color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step18= "Step18_SDAUIRS972_SDAUIRS975_Time In Target report_percentage_70-lowTarget_90d: percentage of 70-99 is 11% ;Bar in yellow color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step19= "Step19_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-240_90d: percentage of 141-240 is 60%;Bar in yellow color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step20= "Step20_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above240_90d: percentage above240 is 9%;Bar in orange color";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step21= "Step21_SDAUIRS1124_Time In Target report_percentage_70-180_90d: does not display percentage of historical glucose points in the reporting period that are greater than or equal to 70 mg/dL and less than the lower target: percentage of >240 is 9%; percentage of 181-240 is 27%; percentage of 70-180 is 61%; percentage of <70 is 3%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step22= "Step22_SDAUIRS1124_Time In Target report_percentage_70-180_30d: does not display percentage of historical glucose points in the reporting period that are greater than or equal to 70 mg/dL and less than the lower target: percentage of >240 is 1%; percentage of 181-240 is 25%; percentage of 70-180 is 67%;he percentage of <70 is 7%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step23= "Step23_SDAUIRS1124_Time In Target report_percentage_70-180_14d: does not display percentage of historical glucose points in the reporting period that are greater than or equal to 70 mg/dL and less than the lower target: percentage of >240 is 2%; percentage of 181-240 is 51%; percentage of 70-180 is 47%; percentage of <70 is 0%";
	public static final String TimeInTarget_T003_Percentage_DistinguishTargetRange_mg_Step24= "Step24_SDAUIRS1124_Time In Target report_percentage_70-180_7d: does not display percentage of historical glucose points in the reporting period that are greater than or equal to 70 mg/dL and less than the lower target: percentage of >240 is 4%; percentage of 181-240 is 74%; percentage of 70-180 is 22%; percentage of <70 is 0%";

	// TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step1= "Step1_SDAUIRS974_Time In Target report_percentage_within Target_7d: percentage Within Target is 0%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step2= "Step2_SDAUIRS972_SDAUIRS974_Time In Target report_percentage_within Target_14d: percentage Within Target is 1%;Bar of the target range is in green color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step3= "Step3_SDAUIRS972_SDAUIRS974_Time In Target report_percentage_within Target_30d: percentage Within Target is 21% with unit mmol/L;Bar of the target range is in green color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step4= "Step4_SDAUIRS972_SDAUIRS974_Time In Target report_percentage_within Target_90d: percentage Within Target is 18% with unit mmol/L;Bar of the target range is in green color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step5= "Step5_SDAUIRS973_Time In Target report_percentage_below3.9_14d:percentage below 3.9 is 0%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step6= "Step6_SDAUIRS972_SDAUIRS973_Time In Target report_percentage_below3.9_30d: percentage below 3.9 is 7%;Bar in red color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step7= "Step7_SDAUIRS972_SDAUIRS973_Time In Target report_percentage_below3.9_90d: percentage below 3.9 is 3%;Bar in red color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step8= "Step8_SDAUIRS973_Time In Target report_percentage_below3.9_7d: percentage below 3.9 is 0%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step9= "Step9_SDAUIRS972_SDAUIRS975_Time In Target report_percentage_3.9-lowTarget_30d: percentage of 3.9-5.5 is 12%;Bar in yellow color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step10= "Step10_SDAUIRS972_SDAUIRS975_Time In Target report_percentage_3.9-lowTarget_90d: percentage of 3.9-5.5 is 11% ;Bar in yellow color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step11= "Step11_SDAUIRS975_Time In Target report_percentage_3.9-lowTarget_7d: percentage of 3.9-5.5 is 0%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step12= "Step12_SDAUIRS975_Time In Target report_percentage_3.9-lowTarget_14d: percentage of 3.9-5.5 is 0%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step13= "Step13_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-13.3_90d: percentage of 7.9-13.3 is 59%;Bar in yellow color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step14= "Step14_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-13.3_7d: percentage of 7.9-13.3 is 96%;Bar in yellow color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step15= "Step15_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-13.3_14d: percentage of 7.9-13.3 is 97%;Bar in yellow color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step16= "Step16_SDAUIRS972_SDAUIRS976_Time In Target report_percentage_HighTarget-13.3_30d: percentage of 7.9-13.3 is 59%;Bar in yellow color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step17= "Step17_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above13.3_90d: percentage above13.3 is 9%;Bar in orange color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step18= "Step18_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above13.3_7d: percentage above13.3 is 4%;Bar in orange color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step19= "Step19_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above13.3_14d: percentage above13.3 is 2%;Bar in orange color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step20= "Step20_SDAUIRS972_SDAUIRS1194_Time In Target report_percentage_above13.3_30d: percentage above13.3 is 1%;Bar in orange color";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step21= "Step21_SDAUIRS1124_Time In Target report_percentage_3,9-10_90d:'Time In Target report does not display  percentage of historical glucose points in the reporting period that are greater than or equal to 3.9 mmol/L and less than the lower target. percentage of >13.3 is 9%; percentage of 10.1-13.3 is 27%; percentage of 3.9-10 is 61%; percentage of <3.9 is 3%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step22= "Step22_SDAUIRS1124_Time In Target report_percentage_3,9-10_30d:Time In Target report does not display  percentage of historical glucose points in the reporting period that are greater than or equal to 3.9 mmol/L and less than the lower target: percentage of >13.3 is 1%; percentage of 10.1-13.3 is 25%; percentage of 3.9-10 is 67%; percentage of <3.9 is 7%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step23= "Step23_SDAUIRS1124_Time In Target report_percentage_3,9-10_14d:Time In Target report does not display  percentage of historical glucose points in the reporting period that are greater than or equal to 3.9 mmol/L and less than the lower target: percentage of >13.3 is 2%; percentage of 10.1-13.3 is 51%; percentage of 3.9-10 is 47%; percentage of <3.9 is 0%";
	public static final String TimeInTarget_T004_Percentage_DistinguishTargetRange_mmol_Step24= "Step24_SDAUIRS1124_Time In Target report_percentage_3,9-10_7d:Time In Target report does not display  percentage of historical glucose points in the reporting period that are greater than or equal to 3.9 mmol/L and less than the lower target: percentage of >13.3 is 4%; percentage of 10.1-13.3 is 74%; percentage of 3.9-10 is 22%; percentage of <3.9 is 0%";

	// TimeInTarget_T005_TotalPercentage_mg
	public static final String TimeInTarget_T005_TotalPercentage_mg_Step1= "Step1_SDAUIRS977_Time In Target report_Total Percentage99:All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >240 is 9%; percentage of 173-240 is 35%; percentage of 76-172 is 52%; percentage of 70-75 is 1%; percentage of <70 is 3% ";
	public static final String TimeInTarget_T005_TotalPercentage_mg_Step2= "Step2_SDAUIRS977_Time In Target report_Total Percentage101:All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >240 is 2%; percentage of 173-240 is 87%; percentage of 76-172 is 11%; percentage of 70-75 is 0%; percentage of <70 is 0%";
	public static final String TimeInTarget_T005_TotalPercentage_mg_Step3= "Step3_SDAUIRS977_Time In Target report_Total Percentage102:'All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >240 is 20%; percentage of 141-240 is 20%; percentage of 100-140 is 31%; percentage of 70-99 is 20%; percentage of <70 is 9%";
	public static final String TimeInTarget_T005_TotalPercentage_mg_Step4= "Step4_SDAUIRS977_Time In Target report_2 high Percentage101:All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >240 is 12%; percentage of 141-240 is 36%; percentage of 100-140 is 35%; percentage of 70-99 is 12%; percentage of <70 is 5% ";

	// TimeInTarget_T006_Total Percentage_mmol
	public static final String TimeInTarget_T006_TotalPercentage_mmol_Step1= "Step1_SDAUIRS977_Time In Target report_Total Percentage99: All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >13.3 is 9%; percentage of 9.6-13.3 is 36%; percentage of 6.1-9.5 is 37%; percentage of  3.9-6.0 is 15%; percentage of <3.9 is 3% ";
	public static final String TimeInTarget_T006_TotalPercentage_mmol_Step2= "Step2_SDAUIRS977_Time In Target report_Total Percentage101: All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >13.3 is 4%; percentage of  9.6-13.3 is 87%; percentage of 6.1-9.5 is 9%; percentage of  3.9-6.0 is 0%; percentage of <3.9 is 0%";
	public static final String TimeInTarget_T006_TotalPercentage_mmol_Step3= "Step3_SDAUIRS977_Time In Target report_Total Percentage101: All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >13.3 is 4%; percentage of 10.0-13.3 is 75%; percentage of 9.5-9.9 is 13%; percentage of  3.9-9.4 is 8%; percentage of <3.9 is 0%";
	public static final String TimeInTarget_T006_TotalPercentage_mmol_Step4= "Step4_SDAUIRS977_Time In Target report_Total Percentage101: All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >13.3 is 2%; percentage of 10.0-13.3 is 52%; percentage of 9.5-9.9 is 17%; percentage of  3.9-9.4 is 29%; percentage of <3.9 is 0% ";
	public static final String TimeInTarget_T006_TotalPercentage_mmol_Step5= "Step5_SDAUIRS977_Time In Target report_Total Percentage99: All percentages displayed in the Time In Target report add to 100% according to the number of significant digits being displayed: percentage of >13.3 is 1%; percentage of 10.0-13.3 is 26%; percentage of 9.5-9.9 is 9%; percentage of  3.9-9.4 is 57%; percentage of <3.9 is 7% ";

	// LowGlucoseEvents_T001_View_Display_Date_Xaxis
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step1= "Step1_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from Home Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step2= "Step2_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from Logbook  Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step3= "Step3_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from Reminder  Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_1= "Step4.1_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from DailyPattern Report Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_2= "Step4.2_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from TimeInTarget Report Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_3= "Step4.3_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from AverageGlucose Report Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_4= "Step4.4_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from DailyGraph Report Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_5= "Step4.5_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from EstimatedA1c Report Scn:Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step4_6= "Step4.6_SDAUIRS979_SDAISRS1164_SDAISRS1167_Low Glucose Events report from SensorUsage Report Scn:Low Glucose Events report is displayed and can be viewed  ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_1= "Step5.1_SDAUIRS979_SDAISRS1164_SDAISRS1167_Select from dropdown Low Glucose Events report from other DailyPattern Scn: Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_2= "Step5.2_SDAUIRS979_SDAISRS1164_SDAISRS1167_Select from dropdown Low Glucose Events report from other TimeInTarget Scn: Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_3= "Step5.3_SDAUIRS979_SDAISRS1164_SDAISRS1167_Select from dropdown Low Glucose Events report from other AverageGlucose Scn: Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_4= "Step5.4_SDAUIRS979_SDAISRS1164_SDAISRS1167_Select from dropdown Low Glucose Events report from other DailyGraph Scn: Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_5= "Step5.5_SDAUIRS979_SDAISRS1164_SDAISRS1167_Select from dropdown Low Glucose Events report from other EstimatedA1c Scn: Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step5_6= "Step5.6_SDAUIRS979_SDAISRS1164_SDAISRS1167_Select from dropdown Low Glucose Events report from other SensorUsage Scn: Low Glucose Events report is displayed and can be viewed ";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step6= "Step6_SDAUIRS955_SDAUIRS981_Low Glucose Events report_DateDisplay_90d:Date 1 Dec 2012-28 Feb 2013 displayed on top of the screen";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step7= "Step7_SDAUIRS955_SDAUIRS981_Low Glucose Events report_DateDisplay_30d:Date 30 Jan-28 Feb 2013 is displayed on top of the screen";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step8= "Step8_SDAUIRS955_SDAUIRS981_Low Glucose Events report_DateDisplay_7d:Date 22-28 February 2013 is displayed on top of the screen";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step9= "Step9_SDAUIRS955_SDAUIRS981_Low Glucose Events report_DateDisplay_14d:Date 15-28 February 2013 is displayed on top of the screen";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step10= "Step10_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_24hr_14d:bar graph has an X-axis from midnight to midnight. 00:00-00:00 and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step11= "Step11_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_24hr_90d:bar graph has an X-axis from midnight to midnight. 00:00-00:00 and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step12= "Step12_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_24hr_30d:bar graph has an X-axis from midnight to midnight. 00:00-00:00 and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step13= "Step13_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_24hr_7d:bar graph has an X-axis from midnight to midnight. 00:00-00:00 and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step14= "Step14_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_12hr_90d:bar graph has an X-axis from midnight to midnight. 12am-12am and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step15= "Step15_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_12hr_30d:bar graph has an X-axis from midnight to midnight. 12am-12am and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step16= "Step16_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_12hr_14d:bar graph has an X-axis from midnight to midnight. 12am-12am and one bar per 3-hour period";
	public static final String LowGlucoseEvents_T001_View_Display_Date_Xaxis_Step17= "Step17_SDAUIRS985_SDAUIRS987_Low Glucose Events report_X-axis_12hr_7d:bar graph has an X-axis from midnight to midnight. 12am-12am and one bar per 3-hour period";

	// LowGlucoseEvents_T002_DataAvailable
	public static final String LowGlucoseEvents_T002_DataAvailable_Step1= "Step1_SDAUIRS983_Low Glucose Events report_Data Available_7 days:Data Available for 4 of 7 days";
	public static final String LowGlucoseEvents_T002_DataAvailable_Step2= "Step2_SDAUIRS983_Low Glucose Events  report_Data Available_14 days:Data Available for 6 of 14 days";
	public static final String LowGlucoseEvents_T002_DataAvailable_Step3= "Step3_SDAUIRS983_Low Glucose Events  report_Data Available_30 days:Data Available for 6 of 30 days";
	public static final String LowGlucoseEvents_T002_DataAvailable_Step4= "Step4_SDAUIRS983_Low Glucose Events  report_Data Available_90 days:Data Available for 6 of 90 days";

	// LowGlucoseEvents_T003_Calculation_Yaxis
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step1= "Step1_SDAUIRS982_Low Glucose Events report_Display_Total-events_14d:The total number of low glucose events  in 14 days: 0";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step2= "Step2_SDAUIRS982_Low Glucose Events report_Display_Total-events_7d:The total number of low glucose events in 7 days: 0";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step3= "Step3_SDAUIRS982_Low Glucose Events report_Display_Total-events_90d:The total number of low glucose events in 90 days: 8";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step4= "Step4_SDAUIRS982_Low Glucose Events report_Display_Total-events_30d:The total number of low glucose events in 30 days: 8";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step5_1= "Step5.1_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_30d:The Low Glucose Events report displays a bar graph showing the count of events corresponding to each bar - 24 hour format";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step5_2= "Step5.2_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_30d:The Low Glucose Events report displays a bar graph showing the count of events corresponding to each bar - 12 hour format";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step6= "Step6_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_7d:The Low Glucose Events report displays a bar graph showing no events";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step7_1= "Step7.1_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_90d:The Low Glucose Events report displays a bar graph showing the count of events corresponding to each bar - 24 hour format";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step7_2= "Step7.2_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_90d:The Low Glucose Events report displays a bar graph showing the count of events corresponding to each bar - 12 hour format";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step8_1= "Step8.1_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_14d: 24 hour format";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step8_2= "Step8.2_SDAUIRS984_SDAUIRS989_Low Glucose Events report_count_EachBar_14d: 12 hour format";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step9= "Step9_SDAUIRS986_Low Glucose Events_Graph_Y-axis_7d:The Low Glucose Events report bar graph has a Y-axis whose range is higher than highest bar(1) and Y axis is not labelled";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step10= "Step10_SDAUIRS986_Low Glucose Events_Graph_Y-axis_14d:The Low Glucose Events report bar graph has a Y-axis whose range is higher than highest bar(2) and Y axis is not labelled";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step11= "Step11_SDAUIRS986_Low Glucose Events_Graph_Y-axis_30d:The Low Glucose Events report bar graph has a Y-axis whose range is higher than highest bar(5) and Y axis is not labelled";
	public static final String LowGlucoseEvents_T003_Calculation_Yaxis_Step12= "Step12_SDAUIRS986_Low Glucose Events_Graph_Y-axis_90d:The Low Glucose Events report bar graph has a Y-axis whose range is higher than highest bar(7) and Y axis is not labelled";


	// DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step1= "Step1_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Home Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step2= "Step2_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from LogBook Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step3= "Step3_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Reminder Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_1= "Step4.1_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Time In Target Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_2= "Step4.2_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Low Glucose Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_3= "Step4.3_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Average Glucose Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_4= "Step4.4_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Daily Graph Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_5= "Step4.5_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Estimated Graph Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step4_6= "Step4.6_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Sensor Usage Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_1= "Step5.1_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Time In target Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_2= "Step5.2_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Low Glucose Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_3= "Step5.3_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Average Glucose Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_4= "Step5.4_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Daily Graph Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_5= "Step5.5_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Estimated A1c Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step5_6= "Step5.6_SDAUIRS961_SDAISRS1164_SDAISRS1165_Daily Patterns Report from Sensor Usage Scn: The Daily Patterns Report is displayed and can be viewed";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step6= "Step6_SDAUIRS962_AGP Graph_90d_ScreenShotCaptured";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step7= "Step7_SDAUIRS962_AGP Graph_30d_ScreenShotCaptured";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step8= "Step8_SDAUIRS962_AGP Graph_14d_ScreenShotCaptured";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step9= "Step9_SDAUIRS962_AGP Graph_7d_ScreenShotCaptured";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step10= "Step10_SDAUIRS955_SDAUIRS963_date 30 Jan-28 Feb 2013 displayed on top of the screen";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step11= "Step11_SDAUIRS955_SDAUIRS963_date 22-28 February 2013 displayed on top of the screen";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step12= "Step12_SDAUIRS955_SDAUIRS963_date 1 Dec 2012 -28 Feb 2013 displayed on top of the screen";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step13= "Step13_SDAUIRS955_SDAUIRS963_date 15-28 February 2013 displayed on top of the screen";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step14= "Step14_SDAUIRS964_X axis range is from 00:00 to 00:00";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step15= "Step15_SDAUIRS964_X axis range is from 00:00 to 00:00";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step16= "Step16_SDAUIRS964_X axis range is from 00:00 to 00:00";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step17= "Step17_SDAUIRS964_X axis range is from 00:00 to 00:00";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step18= "Step18_SDAUIRS964_X axis range is from 12AM to 12AM";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step19= "Step19_SDAUIRS964_X axis range is from 12AM to 12AM";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step20= "Step20_SDAUIRS964_X axis range is from 12AM to 12AM";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step21= "Step21_SDAUIRS964_X axis range is from 12AM to 12AM";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step22= "Step22_SDAUIRS966_The glucose target range 70-71mg/dL or 3.9-4.0 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step23= "Step23_SDAUIRS966_The glucose target range 70-71mg/dL or 3.9-4.0 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step24= "Step24_SDAUIRS966_The glucose target range 70-71mg/dL or 3.9-4.0 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step25= "Step25_SDAUIRS966_The glucose target range 70-71mg/dL or 3.9-4.0 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step26= "Step26_SDAUIRS966_The glucose target range 100-140 mg/dL or 5.6-7.8 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step27= "Step27_SDAUIRS966_The glucose target range 100-140  mg/dL  or 5.6-7.8 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step28= "Step28_SDAUIRS966_The glucose target range 150-180 mg/dL or 8.3-10.0 mmol/L is distinguished";
	public static final String DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange_Step29= "Step29_SDAUIRS966_The glucose target range 150-180 mg/dL or 8.3-10.0 mmol/L is distinguished";

	// Daily_Patterns_Report_T002_Y_axis_range
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step1= "Step1_SDAUIRS965_Daily Patterns report_Y axis range_7d_AGP graph has a Y axis range of 0 to 350 mg/dL or 21 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step2= "Step2_SDAUIRS965_Daily Patterns report_Y axis range_14d_AGP graph has a Y axis range of 0 to 350 mg/dL or 21 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step3= "Step3_SDAUIRS965_Daily Patterns report_Y axis range_30d_AGP graph has a Y axis range of 0 to 350 mg/dL or 21 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step4= "Step4_SDAUIRS965_Daily Patterns report_Y axis range_90d_AGP graph has a Y axis range of 0 to 350 mg/dL or 21 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step5= "Step5_SDAUIRS965_Daily Patterns report_Y axis range Max_90d_AGP graph has a Y axis range of 0 to 500 mg/dL  or 27 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step6= "Step6_SDAUIRS965_Daily Patterns report_Y axis range Max_14d_AGP graph has a Y axis range of 0 to 500 mg/dL  or 27 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step7= "Step7_SDAUIRS965_Daily Patterns report_Y axis rangeMax_30d_AGP graph has a Y axis range of 0 to 500 mg/dL  or 27 mmol/L";
	public static final String Daily_Patterns_Report_T002_Y_axis_range_Step8= "Step8_SDAUIRS965_Daily Patterns report_Y axis range Max_7d_AGP graph has a Y axis range of 0 to 500 mg/dL  or 27 mmol/L";

	// Daily_Patterns_Report_T003_data_Available
	public static final String Daily_Patterns_Report_T003_data_Available_Step1= "Step1_SDAUIRS967_Verifying DailyPatterns Report for 7 days:Data Available for 4 of 7 days";
	public static final String Daily_Patterns_Report_T003_data_Available_Step2= "Step2_SDAUIRS967_Verifying DailyPatterns Report for 90 days:Data Available for 6 of 90 days";
	public static final String Daily_Patterns_Report_T003_data_Available_Step3= "Step3_SDAUIRS967_Verifying DailyPatterns Report for 30 days:Data Available for 6 of 30 days";
	public static final String Daily_Patterns_Report_T003_data_Available_Step4= "Step4_SDAUIRS967_Verifying DailyPatterns Report for 14 days:Data Available for 6 of 14 days";

	// DailyPatterns_T004_S24Req_Test
	public static final String DailyPatterns_T004_S24Req_Test_Step1= "Step1_SDAUIRS956, SDAUIRS941, SDAUIRS928 - One-hour bar chart is shown from 20:30 to 21:30. The bar chart  are between 70 mg/dL and 180 mg/dL or 3.9-10.0 mmol/L";
	public static final String DailyPatterns_T004_S24Req_Test_Step2= "Step2_SDAUIRS956, SDAUIRS941, SDAUIRS928 -3 hours graph is shown from 20:30 to 23:30, Graph is smooth, no sharp angle around 22:00";
	public static final String DailyPatterns_T004_S24Req_Test_Step3= "Step3_SDAUIRS941- Cross Check for extrapolated values.The graph is drawn from 20:30 to 23:30";

	// General_T001_insufficientData_ViewDescription
	public static final String General_T001_insufficientData_ViewDescription_Step1= "Step1_SDAUIRS953_SDAISRS299_Average Glucose report: The description of Average Glucose report is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step2= "Step2_SDAUIRS953_SDAISRS299_Daily Graph report: The description of Daily Graph report is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step3= "Step3_SDAUIRS953_SDAISRS299_Sensor Usage report: The description of Sensor Usage report is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step4= "Step4_SDAUIRS953_SDAISRS299_Low Glucose Events report: The description of Low Glucose Events report is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step5= "Step5_SDAUIRS953_SDAISRS299_Time In Target report: The description of Time In Target report is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step6= "Step6_SDAUIRS953_SDAISRS299_DailyPatterns report: The description of DailyPatterns report is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step7= "Step7_SDAUIRS953_SDAISRS299_A1c report: The description of Estimated A1c report is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step8= "Step8_SDAUIRS957_insufficient_data_Average Glucose report_30d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step9= "Step9_SDAUIRS957_insufficient_data_Average Glucose report_90d: 'Not Enough Sensor Data' message is displayed";
	public static final String General_T001_insufficientData_ViewDescription_Step10= "Step10_SDAUIRS957_insufficient_data_Average Glucose report_14d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step11= "Step11_SDAUIRS957_insufficient_data_Average Glucose report_7d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step12= "Step12_SDAUIRS957_insufficient_data_Daily Patterns report_7d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step13= "Step13_SDAUIRS957_insufficient_data_Daily Patterns report_30d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step14= "Step14_SDAUIRS957_insufficient_data_Daily Patterns report_14d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step15= "Step15_SDAUIRS957_insufficient_data_Daily Patterns report_90d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step16= "Step16_SDAUIRS957_insufficient_data_Time In Target report_90d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step17= "Step17_SDAUIRS957_insufficient_data_Time In Target report_7d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step18= "Step18_SDAUIRS957_insufficient_data_Time In Target report_14d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step19= "Step19_SDAUIRS957_insufficient_data_Time In Target report_30d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step20= "Step20_SDAUIRS957_insufficient_data_Daily Graph report: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step21= "Step21_SDAUIRS957_insufficient_data_Daily Graph report: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step22= "Step22_SDAUIRS957_insufficient_data_Sensor Usage report_7d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step23= "Step23_SDAUIRS957_insufficient_data_Sensor Usage report_14d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step24= "Step24_SDAUIRS957_insufficient_data_Sensor Usage report_90d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step25= "Step25_SDAUIRS957_insufficient_data_Sensor Usage report_30d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step26= "Step26_SDAUIRS957_insufficient_data_Estimated A1c_report: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step27= "Step27_SDAUIRS957_insufficient_data_Low Glucose Events report_90d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step28= "Step28_SDAUIRS957_insufficient_data_Low Glucose Events report_30d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step29= "Step29_SDAUIRS957_insufficient_data_Low Glucose Events report_14d: 'Not Enough Sensor Data' message is displayed ";
	public static final String General_T001_insufficientData_ViewDescription_Step30= "Step30_SDAUIRS957_insufficient_data_Low Glucose Events report_7d: 'Not Enough Sensor Data' message is displayed";

	// General_T002_DateDisplay_ScreenCapture
	public static final String General_T002_DateDisplay_ScreenCapture_Step1= "Step1_Average Glucose report_DateRange_30d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step2= "Step2_SDAUIRS954_SDAISRS1171_Average Glucose report_Share_ScreenCapture_30d:The screenshot is captured.Shared bitmap is saved. ";
	public static final String General_T002_DateDisplay_ScreenCapture_Step3= "Step3_Average Glucose report_DateRange_90d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step4= "Step4_SDAUIRS954_SDAISRS1171_Average Glucose report_Share_ScreenCapture_90d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step5= "Step5_Average Glucose report_DateRange_7d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step6= "Step6_SDAUIRS954_SDAISRS1171_Average Glucose report_Share_ScreenCapture_7d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step7= "Step7_Average Glucose report_DateRange_14d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step8= "Step8_SDAUIRS954_SDAISRS1171_Average Glucose report_Share_ScreenCapture_14d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step9= "Step9_Sensor Usage report_DateRange_30d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step10= "Step10_SDAUIRS954_SDAISRS1171_Sensor Usage report_Share_ScreenCapture_30d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step11= "Step11_Sensor Usage report_DateRange_90d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step12= "Step12_SDAUIRS954_SDAISRS1171_Sensor Usage report_Share_ScreenCapture_90d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step13= "Step13_Sensor Usage report_DateRange_7d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step14= "Step14_SDAUIRS954_SDAISRS1171_Sensor Usage report_Share_ScreenCapture_7d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step15= "Step15_Sensor Usage report_DateRange_14d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step16= "Step16_SDAUIRS954_SDAISRS1171_Sensor Usage report_Share_ScreenCapture_14d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step17= "Step17_Time In Target  report_DateRange_30d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step18= "Step18_SDAUIRS954_SDAISRS1171_Time In Target report_Share_ScreenCapture_30d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step19= "Step19_Time In Target report_DateRange_90d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step20= "Step20_SDAUIRS954_SDAISRS1171_Time In Target repor_Share_ScreenCapture_90d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step21= "Step21_Time In Target report_DateRange_7d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step22= "Step22_SDAUIRS954_SDAISRS1171_Time In Target report_Share_ScreenCapture_7d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step23= "Step23_Time In Target report_DateRange_14d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step24= "Step24_SDAUIRS954_SDAISRS1171_Time In Target report_Share_ScreenCapture_14d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step25= "Step25_Low Glucose Event  report_DateRange_30d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step26= "Step26_SDAUIRS954_SDAISRS1171_Low Glucose Event report_Share_ScreenCapture_30d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step27= "Step27_Low Glucose Event report_DateRange_90d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step28= "Step28_SDAUIRS954_SDAISRS1171_Low Glucose Event report_Share_ScreenCapture_90d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step29= "Step29_Low Glucose Event report_DateRange_7d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step30= "Step30_SDAUIRS954_SDAISRS1171_Low Glucose Event report_Share_ScreenCapture_7d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step31= "Step31_Low Glucose Event report_DateRange_14d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step32= "Step32_SDAUIRS954_SDAISRS1171_Low Glucose Event report_Share_ScreenCapture_14d:The screen is captured Compare the captured screen with one on phone or one from prevous step";
	public static final String General_T002_DateDisplay_ScreenCapture_Step33= "Step33_Daily Patterns  report_DateRange_30d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step34= "Step34_SDAUIRS954_SDAISRS1171_Daily Patterns report_Share_ScreenCapture_30d:The screen is captured Compare the captured screen with one on phone or one from prevous step";
	public static final String General_T002_DateDisplay_ScreenCapture_Step35= "Step35_Daily Patterns report_DateRange_90d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step36= "Step36_SDAUIRS954_SDAISRS1171_Daily Patterns  report_Share_ScreenCapture_90d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step37= "Step37_Daily Patterns report_DateRange_7d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step38= "Step38_SDAUIRS954_SDAISRS1171_Daily Patterns  report_Share_ScreenCapture_7d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step39= "Step39_Daily Patterns report_DateRange_14d: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step40= "Step40_SDAUIRS954_SDAISRS1171_Daily Patterns report_Share_ScreenCapture_14d:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step41= "Step41_Estimated A1c  Report_DateRange: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step42= "Step42_SDAUIRS954_SDAISRS1171_Estimated A1c Report_Share_ScreenCapture:The screenshot is captured.Shared bitmap is saved";
	public static final String General_T002_DateDisplay_ScreenCapture_Step43= "Step43_Daily Graph report_Date1: Report is displayed";
	public static final String General_T002_DateDisplay_ScreenCapture_Step44= "Step44_Daily Graph report_Date2: Report is displayed with previous date";
	public static final String General_T002_DateDisplay_ScreenCapture_Step45= "Step45_SDAUIRS954_SDAISRS1171_Daily Graph report_Share_ScreenCapture:The screenshot is captured.Shared bitmap is saved";

	// General_T003_Data_Distinguish
	public static final String General_T003_Data_Distinguish_Step1= "Step1_SDAUIRS1152_distinguish_HG_below70: Graph that show individual historical glucose traces distinguishes the sections of those traces that are < 70 mg/dL or 3.9 mmol/L:The section of HG traces around 6am and beginning of the day: Historic glucose values are displayed in red color line; After 6am: Historic glucose values are displayed in black color line when values >69 mg/d  or >3.8 mmol/L ";

	// General_T004_Time_Timezone_Settings
	public static final String General_T004_Time_Timezone_Settings_Step1= "Step1_SDAUIRS1148_Auto Date & Time disabled: Automatic Date and Time error message pop up is displayed ";
	public static final String General_T004_Time_Timezone_Settings_Step2= "Step2_SDAUIRS1148_Auto Date & Time enabled: The Home screen is displayed ";
	// General_T005_Data_HistoricUserTime_TimeZoneChange
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step1= "Step1_SDAUIRS958_PDTtoPST_Daily Patterns report: report displays the graph for glucose values according to their historic user time";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step2= "Step2_SDAUIRS958_historic user time_Time In Target report: Time In Target report displays graph for glucose values according to their historic user time:3.9-10.0: 75% ;<3.9: 25% or 70-180: 75%;<70: 25% ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step3= "Step3_SDAUIRS958_historic user time_Low Glucose Event  report : Low Glucose Event report displays graph for glucose values according to their historic user time: 6am-9am: 5 ; 9am-12pm: 5 ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step4= "Step4_SDAUIRS958_historic user time_Average Glucose report : Average Glucose report displays graph for glucose values according to their historic user time:  6am-9am: 107 or 6.0 ; 9am-12pm: 100 or 5.6 ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step5= "Step5_SDAUIRS958_historic user time_Daily Graph report : Daily Graph report displays graph for glucose values according to their historic user time: Four hours HG data around 6am-10am ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step6= "Step6_SDAUIRS958_historic user time_Sensor Usage report : Sensor Usage  report displays graph for glucose values according to their historic user time: 10 Total Scans ; 1 scans Per Day ;12 % of Sensor Data Captured ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step7= "Step7_SDAUIRS958_historic user time_Daily Patterns report_TZ_Change: Daily Patterns report displays graph for glucose values according to their historic user time";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step8= "Step8_SDAUIRS958_historic user time_Time In Target report_TZ_Change: Time In Target report displays graph for glucose values according to their historic user time:70-180: 75%;<70: 25% or 3.9-10.0: 75% ;<3.9: 25% ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step9= "Step9_SDAUIRS958_historic user time_Low Glucose Event  report_TZ_Change : Low Glucose Event report displays graph for glucose values according to their historic user time: 3am-6am: 1;6am-9am: 4 ;9am-12pm: 5 ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step10= "Step10_SDAUIRS958_historic user time_Average Glucose report_TZ_Change: Average Glucose report displays graph for glucose values according to their historic user time:  3am-6am: 80 or 4.5 ;6am-9am: 109 or 6.1 ;9am-12pm: 100 or 5.6 ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step11= "Step11_SDAUIRS958_historic user time_Daily Graph report_TZ_Change: Daily Graph report displays graph for glucose values according to their historic user time:Two hours HG data around 5am-7am;Two hours HG data around 8am-10am;There is a gap between 7am-8am ";
	public static final String General_T005_Data_HistoricUserTime_TimeZoneChange_Step12= "Step12_SDAUIRS958_historic user time_Sensor Usage report_TZ_Change : Sensor Usage  report displays graph for glucose values according to their historic user time:  10 Total Scans;1 scans Per Day;12 % of Sensor Data Captured ";

	// General_T006_CorruptSASDatabase
	public static final String General_T006_CorruptSASDatabase_Step1= "Step1_TestSetUp_Preconditions";
	public static final String General_T006_CorruptSASDatabase_Step2= "Step2_SDASRS829:Navigate to DailyPatterns Report Select 90 Days: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";
	public static final String General_T006_CorruptSASDatabase_Step3= "Step3_SDASRS829:Navigate to TimeInTarget Report Select 90 Days: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";
	public static final String General_T006_CorruptSASDatabase_Step4= "Step4_SDASRS829:Navigate to LowGlucoseEvents Report Select 90 Days: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";
	public static final String General_T006_CorruptSASDatabase_Step5= "Step5_SDASRS829:Navigate to AverageGlucose Report Select 90 Days: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";
	public static final String General_T006_CorruptSASDatabase_Step6= "Step6_SDASRS829:Navigate to DailyGraph Report: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";
	public static final String General_T006_CorruptSASDatabase_Step7= "Step7_SDASRS829:Navigate to EstimatedA1C Report: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";
	public static final String General_T006_CorruptSASDatabase_Step8= "Step8_SDASRS829:Navigate to SensorUsage Report Select 90 Days: 1. 'Error loading data' failure is notified ; 2. No Report or Data calculations are displayed. ";

	// General_T007_DistinguishDataAvailable
	public static final String General_T007_DistinguishDataAvailable_Step1= "Step1_SDAUIRS1257_LowGlucose_Date Available for 7 of 7 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step2= "Step2_SDAUIRS1257_LowGlucose_Date Available for 14 of 14 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step3= "Step3_SDAUIRS1257_LowGlucose_Date Available for 30 of 30 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step4= "Step4_SDAUIRS1257_LowGlucose_Date Available for 90 of 90 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step5= "Step5_SDAUIRS1257_AverageGlucose_Date Available for 7 of 7 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step6= "Step6_SDAUIRS1257_AverageGlucose_Date Available for 14 of 14 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step7= "Step7_SDAUIRS1257_AverageGlucose_Date Available for 30 of 30 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step8= "Step8_SDAUIRS1257_AverageGlucose_Date Available for 90 of 90 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step9= "Step9_SDAUIRS1257_TimeInTarget_Date Available for 90 of 90 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step10= "Step10_SDAUIRS1257_TimeInTarge_Date Available for 30 of 30 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step11= "Step11_SDAUIRS1257_TimeInTarge_Date Available for 14 of 14 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step12= "Step12_SDAUIRS1257_TimeInTarge_Date Available for 7 of 7 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step13= "Step13_SDAUIRS1257_DailyPattern_Date Available for 90 of 90 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step14= "Step14_SDAUIRS1257_DailyPattern_Date Available for 30 of 30 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step15= "Step15_SDAUIRS1257_DailyPattern_Date Available for 14 of 14 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step16= "Step16_SDAUIRS1257_DailyPattern_Date Available for 7 of 7 days in black color";
	public static final String General_T007_DistinguishDataAvailable_Step17= "Step17_SDAUIRS1257_LowGlucose_Date Available for 0 of 7 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step18= "Step18_SDAUIRS1257_LowGlucose_Date Available for 7 of 14 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step19= "Step19_SDAUIRS1257_LowGlucose_Date Available for 23 of 30 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step20= "Step20_SDAUIRS1257_LowGlucose_Date Available for 83 of 90 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step21= "Step21_SDAUIRS1257_AverageGlucose_Date Available for 0 of 7 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step22= "Step22_SDAUIRS1257_AverageGlucose_Date Available for 7 of 14 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step23= "Step23_SDAUIRS1257_AverageGlucose_Date Available for 23 of 30 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step24= "Step24_SDAUIRS1257_AverageGlucose_Date Available for 83 of 90 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step25= "Step25_SDAUIRS1257_TimeInTarget_Date Available for 76 of 90 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step26= "Step26_SDAUIRS1257_TimeInTarge_Date Available for 16 of 30 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step27= "Step27_SDAUIRS1257_TimeInTarge_Date Available for 0 of 14 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step28= "Step28_SDAUIRS1257_TimeInTarge_Date Available for 0 of 7 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step29= "Step29_SDAUIRS1257_DailyPattern_Date Available for 61 of 90 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step30= "Step30_SDAUIRS1257_DailyPattern_Date Available for 1 of 30 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step31= "Step31_SDAUIRS1257_DailyPattern_Date Available for 0 of 14 days in red color";
	public static final String General_T007_DistinguishDataAvailable_Step32= "Step32_SDAUIRS1257_DailyPattern_Date Available for 0 of 7 days in red color";

	// DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step1= "Step1_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from Home Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step2= "Step2_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from Logbook Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step3= "Step3_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph  report from Reminder Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_1= "Step4.1_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from DailyPattern Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_2= "Step4.2_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from TimeInTarget Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_3= "Step4.3_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from LowGlucoseEvents Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_4= "Step4.4_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from AverageGlucose Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_5= "Step4.5_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from EstimatedA1c Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step4_6= "Step4.6_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Daily Graph report from SensorUsage Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_1= "Step5.1_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Select from dropdown Daily Graph report from DailyPattern Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_2= "Step5.2_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Select from dropdown Daily Graph report from TimeInTarget Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_3= "Step5.3_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Select from dropdown Daily Graph report from LowGlucoseEvents Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_4= "Step5.4_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Select from dropdown Daily Graph report from AverageGlucose Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_5= "Step5.5_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Select from dropdown Daily Graph report from EstimatedA1c Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step5_6= "Step5.6_SDAUIRS1003_SDAISRS1164_SDAISRS1169 Select from dropdown Daily Graph report from SensorUsage Report Scn: Daily Graph report is displayed and can be viewed ";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step6= "Step6_SDAUIRS955_SDAUIRS1004_Daily Graph report_View Date-90Day:Date 2 December 2012 is displayed on top of the Daily Graph report screen. No arrow at left side of the Date";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step7= "Step7_SDAUIRS955_SDAUIRS1004_Daily Graph report_View Date-89Day:Date 3 December 2012 is displayed on top of the Daily Graph report screen. Arrow at left side of the Date is enabled";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step8= "Step8_SDAUIRS1004_Daily Graph report_View Date-91Day:Cannot select day outside of 90 day range";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step9= "Step9_SDAUIRS1004_Daily Graph report_View Date-FutureDay:Cannot select day outside of 90 day range";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step10= "Step10_SDAUIRS955_SDAUIRS1004_Daily Graph report_View Date-Day:Date 1 January 2013 is displayed on top of the Daily Graph report screen";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step11= "Step11_SDAUIRS955_SDAUIRS1004_Daily Graph report_View Date-Day:Date 2 January 2013 is displayed on top of the Daily Graph report screen";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step12= "Step12_SDAUIRS1005_Daily Graph report_Display_graph:The Daily Graph report displays a glucose graph";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step13= "Step13_SDAUIRS1004_Daily Graph report_View Date-arrow-left:Date 18 February 2013 is displayed on top of the Daily Graph report screen";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step14= "Step14_SDAUIRS1004_Daily Graph report_View Date-arrow-right:Date 23 February 2013 is displayed on top of the Daily Graph report screen";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step15= "Step15_SDAUIRS1195_Daily Graph report_display_target Range 100-140 mg/dL or 5.6-7.8 mmol/L:Target Range is shaded in green color on glucose graph";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step16= "Step16_SDAUIRS1195_Daily Graph report_display_target Range 70-180 mg/dL or 3.9-10.0 mmol/L:Target Range is shaded in  green color on glucose graph";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step17= "Step17_SDAUIRS1006_Daily Graph report_X-axis_24hr:The graph has an X-axis from midnight to midnight. 00:00-00:00";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step18= "Step18_SDAUIRS1006_Daily Graph report_X-axis_12hr:The graph has an X-axis from midnight to midnight. 12am-12am";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step19= "Step19_SDAUIRS1011_Daily Graph report_distinguish_HG_below70_1: The Daily Graph report glucose graph displays the historic glucose values below 70 mg/dL or 3.9 mmol/L as connected lines in red color: around 1am and 11pm";
	public static final String DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes_Step20= "Step20_SDAUIRS1011_Daily Graph report_distinguish_HG_below70_2: The Daily Graph report glucose graph displays the historic glucose values below 70 mg/dL or 3.9 mmol/L as connected lines in red color: around 9am, 4pm and 11pm";

	// DailyGraph_T002_Gap_LowG_YaxisRange
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step1= "Step1_SDAUIRS1007_Daily Graph report_displays Y-axis range from 0 to 500 mg/dLor 0-27 mmol/L ";
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step2= "Step2_SDAUIRS1007_Daily Graph report_displays Y-axis range from 0 to 350 mg/dL or 0-21 mmol/L";
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step3= "Step3_SDAUIRS1007_Daily Graph report_displays Y-axis range from 0 to 500 mg/dL or 0-27 mmol/L ";
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step4= "Step4_SDAUIRS1009_Daily Graph report_displays Historic glucose values: Black color when values >69 mg/dL or 3.8 mmol/L, and red when values <70 mg/dL or 3.9 mmol/L is displayed";
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step5= "Step5_SDAUIRS1010_Daily Graph report_HG:The graph connects historical glucose values that were recorded consecutively, in the same time epoch, and have user timestamps within 20 minutes of each other There is a continuous line from 00:00 to 10:45";
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step6= "Step6_SDAUIRS1010_Daily Graph report_HG_Gap:The Daily Graph connects historical glucose values that were recorded consecutively, in the same time epoch, and have user timestamps within 20 minutes of each other:No gaps around 09:19 to 09:39;No gaps around 12:30 to 12:50 ;Note: HG < or = 20 mins apart";
	public static final String DailyGraph_T002_Gap_LowG_YaxisRange_Step7= "Step7_SDAUIRS1010_Daily Graph report_HG_Gap:The Daily Graph connects historical glucose values that were recorded consecutively, in the same time epoch, and have user timestamps within 20 minutes of each other: Gap around 07:39 to 08:00 and ;Gap around10:54 to 11:15 ;Note: HG > 20 mins apart ";

	// DailyGraph_T003_TimeChange
	public static final String DailyGraph_T003_TimeChange_Step1= "Step1_SDAUIRS1012_Daily Graph report_displays a time-change icon around 8:00 am";
	public static final String DailyGraph_T003_TimeChange_Step2= "Step2_SDAUIRS1012_Daily Graph report_displays a time-change icon around 8:00 am";
	public static final String DailyGraph_T003_TimeChange_Step3= "Step3_SDAUIRS1013_Daily Graph report_does not allow historical glucose traces from before a time change event to overlap with those after a time change event:Two hours HG data before Time change not displayed.;There is No overlap traces on graph ";

	// Notes_T001_Adding_Remove_attributes 
	public static final String Notes_T001_Adding_Remove_attributes_Step1 = "Step1_SDAUIRS893_Add Note Page is displayed";
	public static final String Notes_T001_Adding_Remove_attributes_Step2 = "Step2_SDAUIRS850_The Note entry displayed  the date and time of a Note";
	public static final String Notes_T001_Adding_Remove_attributes_Step3 = "Step3_SDAUIRS897_The Note dialog provides a means to add the Food attribute";
	public static final String Notes_T001_Adding_Remove_attributes_Step4 = "Step4_SDAUIRS898_ Breakfast, Lunch, Dinner and Snack options are displayed";
	public static final String Notes_T001_Adding_Remove_attributes_Step5 = "Step5_SDAUIRS899_SDAUIRS848_SDAUIRS1134_Carb amount 400 grams is set for Breakfast ";
	public static final String Notes_T001_Adding_Remove_attributes_Step6 = "Step6_SDAUIRS904_The Note entry provides a means to add the Exercise attribute";
	public static final String Notes_T001_Adding_Remove_attributes_Step7 = "Step7_SDAUIRS905_Low, Medium , High Intensity are displayed";
	public static final String Notes_T001_Adding_Remove_attributes_Step8 = "Step8_SDAUIRS905_SDAUIRS906_New Note created with exercise attribute Low intensity with no duration";
	public static final String Notes_T001_Adding_Remove_attributes_Step9 = "Step9_SDAUIRS899_SDAUIRS848_SDAUIRS1134_Carb amount 400 grams is set for Lunch .";
	public static final String Notes_T001_Adding_Remove_attributes_Step10 = "Step10_SDAUIRS905 SDAUIRS906_New Note created with exercise attribute Medium intensity with no duration";
	public static final String Notes_T001_Adding_Remove_attributes_Step11 = "Step11_SDAUIRS899_SDAUIRS848_SDAUIRS1134_Carb amount 400 grams is set for  Dinner";
	public static final String Notes_T001_Adding_Remove_attributes_Step12 = "Step12_SDAUIRS905_SDAUIRS906_The Note edited with exercise attribute High intensity with no duration";
	public static final String Notes_T001_Adding_Remove_attributes_Step13_1 = "Step13.1_SDAUIRS1134_The Note can't be created with food attribute 401 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step13_2 = "Step13.2_SDAUIRS1134_The Note can't be created with food attribute 100.5 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step14 = "Step14_SDAUIRS899_SDAUIRS848_SDAUIRS1134 New Note created with food attribute Snack 400 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step15 = "Step15_SDAUIRS899_SDAUIRS848_SDAUIRS1134_Min Carb amount 0 grams is set for  Lunch";
	public static final String Notes_T001_Adding_Remove_attributes_Step16 = "Step16_SDAUIRS905_SDAUIRS906_New Note created with exercise attribute Low '12' hrs '59' mins duration";
	public static final String Notes_T001_Adding_Remove_attributes_Step17 = "Step17_SDAUIRS899_SDAUIRS848_SDAUIRS1134_New Note created with food attribute Dinner 0  grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step18 = "Step18_SDAUIRS905_SDAUIRS906_New Note created with exercise attribute Medium '12' hrs '59' mins duration";
	public static final String Notes_T001_Adding_Remove_attributes_Step19_1 = "Step19.1_SDAUIRS1134_The Note can't be created with food attribute 401 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step19_2 = "Step19.2_SDAUIRS1134_The Note can't be created with food attribute 100.5 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step20 = "Step20_SDAUIRS899_SDAUIRS848_SDAUIRS1134_New Note created with food attribute Snack 0 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step21 = "Step21_SDAUIRS905_SDAUIRS906_New Note created with exercise attribute High '12' hrs '59' mins duration";
	public static final String Notes_T001_Adding_Remove_attributes_Step22 = "Step22_SDAUIRS899_SDAUIRS848_SDAUIRS1134_New Note created with food attribute Breakfast 0 grams";
	public static final String Notes_T001_Adding_Remove_attributes_Step23 = "Step23_SDAUIRS902_Long-Acting Insulin is selected from note entry.";
	public static final String Notes_T001_Adding_Remove_attributes_Step24 = "Step24_SDAUIRS900_Note entry provides a means to add the Rapid-Acting Insulin attribute";
	public static final String Notes_T001_Adding_Remove_attributes_Step25 = "Step25_SDAUIRS849_SDAUIRS901 SDAUIRS1201_New Note created with Rapid-Acting Insulin attribute 0.1 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step26 = "Step26_SDAUIRS849_SDAUIRS901_SDAUIRS903 _SDAUIRS1201_SDAUIRS1202_New Note created with both Insulin attribute 200 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step27 = "Step27_SDAUIRS901_SDAUIRS903_SDAUIRS1201 SDAUIRS1202_New Note created with Insulin attribute 199.9 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step28 = "Step28_SDAUIRS903_SDAUIRS1202_New Note created with Long-Acting Insulin attribute 0.1 unit";
	public static final String Notes_T001_Adding_Remove_attributes_Step29_1 = "Step29.1_SDAUIRS901 SDAUIRS903_SDAUIRS1201_SDAUIRS1202_The Note can't be created with Long Acting Insulin attribute for 0 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step29_2 = "Step29.2_SDAUIRS901 SDAUIRS903_SDAUIRS1201_SDAUIRS1202_The Note can't be created with Long Acting Insulin attribute for 200.1 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step29_3 = "Step29.3_SDAUIRS901 SDAUIRS903_SDAUIRS1201_SDAUIRS1202_The Note can't be created with Long Acting Insulin attribute for 5.01 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step29_4 = "Step29.4_SDAUIRS901 SDAUIRS903_SDAUIRS1201_SDAUIRS1202_The Note can't be created with Rapid Acting Insulin attribute for 200.1 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step29_5 = "Step29.5_SDAUIRS901 SDAUIRS903_SDAUIRS1201_SDAUIRS1202_The Note can't be created with Rapid Acting Insulin attribute for 0 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step29_6 = "Step29.6_SDAUIRS901 SDAUIRS903_SDAUIRS1201_SDAUIRS1202_The Note can't be created with Rapid Acting Insulin attribute for 5.01 units";
	public static final String Notes_T001_Adding_Remove_attributes_Step30 = "Step30_SDAUIRS1179_Rapid-Acting Insulin attribute is removed from note.";
	public static final String Notes_T001_Adding_Remove_attributes_Step31 = "Step31_SDAUIRS1180_Long-Acting Insulin attribute from note is removed";
	public static final String Notes_T001_Adding_Remove_attributes_Step32 = "Step32_SDAUIRS899_SDAUIRS848_SDAUIRS1135 SDAUIRS905_SDAUIRS906_New Note created with food attribute Lunch 0 svg(or ptn for UK)  and with Exercise attribute High Intensity 2 hrs";
	public static final String Notes_T001_Adding_Remove_attributes_Step33 = "Step33_SDAUIRS899_SDAUIRS848_SDAUIRS1135 SDAUIRS905_SDAUIRS906_New Note created with food attribute Breakfast 0 svg(or ptn for UK) and with Exercise attribute Medium 1 hour";
	public static final String Notes_T001_Adding_Remove_attributes_Step34 = "Step34_SDAUIRS899_SDAUIRS848_SDAUIRS1135 SDAUIRS905_SDAUIRS906_New Note created with food attribute Snack 0 svg(or ptn for UK) and with Exercise attribute Low 12 hrs";
	public static final String Notes_T001_Adding_Remove_attributes_Step35 = "Step35_SDAUIRS850_The Note entry displays time as 23:00";
	public static final String Notes_T001_Adding_Remove_attributes_Step36 = "Step36_SDAUIRS899_SDAUIRS848_SDAUIRS1135_New Note created with food attribute Dinner 0 svg(or ptn for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step37_1 = "Step37.1_SDAUIRS899_SDAUIRS848_SDAUIRS1135_The Note can't be created with Food/Breakfast attribute for 0.4 servings(or portions for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step37_2 = "Step37.2_SDAUIRS899_SDAUIRS848_SDAUIRS1135_The Note can't be created with Food/Breakfast attribute for 40.5 servings(or portions for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step37_3 = "Step37.3_SDAUIRS899_SDAUIRS848_SDAUIRS1135_The Note can't be created with Food/Breakfast attribute for 40.1 servings(or portions for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step37_4 = "Step37.4_SDAUIRS899_SDAUIRS848_SDAUIRS1135_The Note can't be created with Food/Dinner attribute for 0.4 servings(or portions for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step37_5 = "Step37.5_SDAUIRS899_SDAUIRS848_SDAUIRS1135_The Note can't be created with Food/Dinner attribute for 40.5 servings(or portions for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step37_6 = "Step37.6_SDAUIRS899_SDAUIRS848_SDAUIRS1135_The Note can't be created with Food/Dinner attribute for 40.1 servings(or portions for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step38 = "Step38_SDAUIRS899_SDAUIRS848_SDAUIRS1135 SDAUIRS905 SDAUIRS906_New Note created with food attribute Lunch 40 svg(or ptn for UK) & with Exercise attribute High Intensity 1 min";
	public static final String Notes_T001_Adding_Remove_attributes_Step39 = "Step39_SDAUIRS899_SDAUIRS848_SDAUIRS1135_SDAUIRS905 SDAUIRS906_New Note created with food attribute Dinner 40 svg(or ptn for UK) & with Exercise attribute Medium Intensity 59 mins";
	public static final String Notes_T001_Adding_Remove_attributes_Step40 = "Step40_SDAUIRS899_SDAUIRS848_SDAUIRS1135 SDAUIRS905 SDAUIRS906_New Note created with food attribute Snack 40 svg(or ptn for UK) and wth Exercise attribute Low Intensity 11 mins";
	public static final String Notes_T001_Adding_Remove_attributes_Step41 = "Step41_SDAUIRS899_SDAUIRS848_SDAUIRS1135_New Note created with food attribute Breakfast 40 svg(or ptn for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step42 = "Step42_SDAUIRS899_SDAUIRS848_SDAUIRS1135_New Note created with food attribute Breakfast 10.5 svg(or ptn for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step43 = "Step43_SDAUIRS894_SDAUIRS907_Comment with 256 characters displayed in the Note entry";
	public static final String Notes_T001_Adding_Remove_attributes_Step44 = "Step44_SDAUIRS899_SDAUIRS848_SDAUIRS1135 New Note created with food attribute Lunch 39.5 svg(or ptn for UK)";
	public static final String Notes_T001_Adding_Remove_attributes_Step45 = "Step45_SDAUIRS907_Comment with 256 characters displayed in the Note entry";
	public static final String Notes_T001_Adding_Remove_attributes_Step46 = "Step46_SDAUIRS907_Comment with special characters displayed in the Note entry";
	public static final String Notes_T001_Adding_Remove_attributes_Step47 = "Step47_SDAUIRS893_The Logbook List View provides a means to invoke the Note entry feature to add a note.";
	public static final String Notes_T001_Adding_Remove_attributes_Step48 = "Step48_SDAUIRS907_Comment with numbers, upper case, lower case characters, spaces,  3 Line returns displayed in the Note entry";
	public static final String Notes_T001_Adding_Remove_attributes_Step49 = "Step49_SDAUIRS1178_The Food attribute of the edited note is removed";
	public static final String Notes_T001_Adding_Remove_attributes_Step50 = "Step50_SDAUIRS1181_Exercise attribute of the edited note is removed";
	public static final String Notes_T001_Adding_Remove_attributes_Step51 = "Step51_SDAUIRS905_SDAUIRS906_New Note created with High Intensity  1 hr and 1 min";


	//Notes_T002_Home_MyGlucose_Logbook_DailyReport  
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step1 = "Step1_SDAUIRS893_SDAISRS219_The Logbook screen provides a means to invoke the Note dialog to add a note.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step2_1 = "Step2.1_SDAUIRS879_SDAUIRS893_SDAISRS219_A note with 5 attributes on graph associated with glucose test result at 7 AM displayed in Result Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step2_2 = "Step2.2_SDAUIRS879_SDAUIRS893_SDAISRS219_A note with 5 attributes on graph associated with glucose test result at 7 AM displayed in Home Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step2_3 = "Step2.3_SDAUIRS879_SDAUIRS893_SDAISRS219_A note with 5 attributes on graph associated with glucose test result at 7 AM displayed in Logbook list Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step2_4 = "Step2.4_SDAUIRS879_SDAUIRS893_SDAISRS219_A note with 5 attributes on graph associated with glucose test result at 7 AM displayed in Logbook Detail Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step3 = "Step3_SDAUIRS895_SDAISRS219_The Result screen provides a means to invoke the Note dialog to add a note.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step4 = "Step4_SDAUIRS895_SDAISRS219_ A note associated with glucose test result at 8:35AM displayed on graph";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step5 = "Step5_SDAUIRS1252_SDAISRS1188_The Result screen provides a means to invoke the Note dialog to edit a note.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step6_1 = "Step6.1_SDAUIRS1252_SDAISRS1188_A note displayed from graph at 7:00AM with a badge indicating 2 notes_Result Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step6_2 = "Step6.2_SDAUIRS1252_SDAISRS1188_Exercise attribute 1hour 1minute  is displayed in Note Pop-Up";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step7_1 = "Step7.1_SDAUIRS895_SDAUIRS1252_SDAISRS219 SDAISRS1188_A note displayed from graph around 7 AM with a badge indicating 7 notes  in Home Screen_Graph";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step7_2 = "Step7.2_SDAUIRS895_SDAUIRS1252_SDAISRS219 SDAISRS1188_A note displayed from graph at 7:00 AM with a badge indicating 2 notes and  A note displayed from graph at 8:35AM with a badge indicating 5 notes in Logbook list Screen ";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step7_3= "Step7.3_SDAUIRS895_SDAUIRS1252_SDAISRS219 SDAISRS1188_A note displayed from graph around 7 AM with a badge indicating 7 notes  in Logbook Detail Screen ";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step8 = "Step8_SDAUIRS850_SDAUIRS896_Note entry feature provides a means to set the date and time of a Note when adding it: Date September 11 and time 7:01 AM displayed at top of the Note entry";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step9 = "Step9_SDAUIRS893_SDAISRS837_SDAISRS1189_A note displayed from list at 7:01 AM with a badge indicating 2 notes";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step10 = "Step10_SDAUIRS850_SDAUIRS896_Note entry feature provides a means to set the date and time of a Note when adding it:Date September 11 and time 8:34 AM displayed at top of the Note entry";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step11 = "Step11_SDAUIRS893_SDAISRS837_SDAISRS1189_A note displayed at 8:34 am with a badge indicating 3 notes";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step12 = "Step12_SDAUIRS850_SDAUIRS896_Note entry feature provides a means to set the date and time of a Note when adding it:Date June 15 and time 12:00 AM displayed at top of the Note entry";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step13 = "Step13_SDAUIRS893_SDAISRS837_SDAISRS1189_A note  associated without glucose test result displayed at 12:00AM with a badge indicating 4 notes";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step14 = "Step14_SDAUIRS850_SDAUIRS896_Note entry feature provides a means to set the date and time of a Note when adding it:Date June 14 and time 11:59 PM displayed at top of the Note entry";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step15 = "Step15_SDAUIRS893_SDAISRS837_ SDAISRS1189_A note displayed at 11:59 PM";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step16 = "Step16_SDAUIRS850_The Note entry feature  provides a means to display the date and time of a Note: September 11th 12:00 PM";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step17 = "Step17_SDAUIRS850_The Note entry feature  provides a means to display the date and time of a Note: September 11th 12:00 PM";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step18_1 = "Step18.1_SDAUIRS871_SDAUIRS1125_Notes around 3:00AM with a badge indicating 3 notes;Notes around 7 AM with a badge indicating 12 notes;A note around 10:00 AM ;Notes around 12:00 PM with a badge indicating 2 notes displays in HomeScreen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step18_2 = "Step18.2_SDAUIRS891_Notes around 3:00AM with a badge indicating 3 notes;Notes around 7 AM with a badge indicating 12 notes;A note around 10:00 AM ;Notes around 12:00 PM with a badge indicating 2 notes displays in Logbook detail screen.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step18_3 = "Step18.3_SDAUIRS1014_Notes around 3:00AM with a badge indicating 3 notes;Notes around 7 AM with a badge indicating 12 notes;A note around 10:00 AM ;Notes around 12:00 PM with a badge indicating 2 notes displays in Daily Graph report screen.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step19 = "Step19_SDAUIRS910_The Note dialog provides a means to delete an existing note and all of its attributes and Delete icon displayed on top of screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step20_1 = "Step20.1_SDAUIRS910_Notes displayed at 8:34 AM with a badge indicating 7 notes";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step20_2 = "Step20.2_SDAUIRS910_Note at 8:35 AM  is not displayed on the Note detail popup";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step21_1 = "Step21.1_SDAUIRS910_Notes displayed at 7:00 AM with a badge indicating 4 notes which merges 2 notes of 7:01 AM";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step21_2 = "Step21.2_SDAUIRS910_The Note dialog provides a means to delete an existing note and all of its attributes and Delete icon displayed on top of screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step22 = "Step22_SDAUIRS910_ Notes displayed at 7:00 AM with a badge indicating 2 notes and Note at 7:01 AM  is not displayed on the Note Dialog.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step23 = "Step23_SDAUIRS910_The Note dialog provides a means to delete an existing note and all of its attributes and Delete icon displayed on top of screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step24 = "Step24_SDAUIRS910_Note at 3:00 AM  is not displayed on the Logbook list";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step25_1 = "Step25.1_SDAUIRS1251_The Home Screen provides a means to invoke the Note dialog to edit a note for Rapid-Acting Insulin.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step25_2 = "Step25.2_SDAUIRS1251_The Home Screen provides a means to invoke the Note dialog to edit a note for Long-Acting Insulin.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step26_1 = "Step26.1_SDAUIRS1252_The Result Screen provides a means to invoke the Note dialog to edit a note.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step26_2 = "Step26.2_SDAUIRS1252_The Result Screen provides a means to invoke the Note dialog to edit a note in Pop-UP.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step27_1 = "Step27.1_SDAUIRS1252_The graph indicates the approximate times when notes were recorded:At 07:00 AM Rapid_Acting Insulin;At 08:34A M Long_Acting Insulin;At 10:00 AM Exercise;At 12:00 PM Food in My Glucose Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step27_2 = "Step27.2_SDAUIRS871_SDAUIRS1251_The graph indicates the approximate times when notes were recorded:At 7 AM Rapid and Long_Acting Insulin;At 10:00 AM Exercise;At 12:00 PM Food in Home Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step27_3 = "Step27.3_SDAUIRS891_The graph indicates the approximate times when notes were recorded:At 7 AM Rapid and Long_Acting Insulin;At 10:00 AM Exercise;At 12:00 PM Food in Logbook Detail Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step27_4 = "Step27.4_SDAUIRS1014_The graph indicates the approximate times when notes were recorded:At 7 AM Rapid and Long_Acting Insulin;At 10:00 AM Exercise;At 12:00 PM Food in Daily Graph Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step28_1 = "Step28.1_SDAUIRS894_The Logbook Detail View  provides a means to invoke the Note dialog to edit a note in Logbook detail page.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step28_2 = "Step28.2_SDAUIRS894_The Logbook Detail View  provides a means to invoke the Note dialog to edit a note in Editnote.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step29_1 = "Step29.1_The graph indicates the approximate times when notes were recorded:07:00 AM note with a badge indicating 2 notes ;08:34 AM note with a badge indicating 3 notes;10:00 AM note with a badge indicating 4 notes;12:00 PM note with a badge indicating 5 notes in Result Screen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step29_2 = "Step29.2_SDAUIRS871_SDAUIRS1125_The graph indicates the approximate times when notes were recorded:around 7 AM note with a badge indicating 5 notes;10:00 AM note with a badge indicating 4 notes;12:00 PM note with a badge indicating 5 notes in HomeScreen";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step29_3 = "Step29.3_SDAUIRS891_SDAUIRS894_The graph indicates the approximate times when notes were recorded:around 7 AM note with a badge indicating 5 notes;10:00 AM note with a badge indicating 4 notes;12:00 PM note with a badge indicating 5 notes in Logbook detail screen.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step29_4 = "Step29.4_SDAUIRS1014_The graph indicates the approximate times when notes were recorded:around 7 AM note with a badge indicating 5 notes;10:00 AM note with a badge indicating 4 notes;12:00 PM note with a badge indicating 5 notes in Daily Graph report screen.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step30 = "Step30_SDAISRS219_The software provides a means to add notes (RA insulin, LA insulin, carbohydrates, custom notes, exercise) associated with a glucose test result.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step31 = "Step31_SDAUIRS837_The software provides a means to add notes (RA insulin, LA insulin, carbohydrates, custom notes, exercise) that are not associated with a glucose test result.";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step32 = "Step32_SDAUIRS891_The Logbook glucose graph indicates the Notes around 00:00  with a badge indicating 10 notes";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step33 = "Step33_SDAUIRS891_The Logbook glucose graph indicates the Notes around 00:00  with a badge indicating 7 notes ";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step34 = "Step34_SDAUIRS1014_Daily graph displays the Note icon around 00:00  with a badge indicating 10 notes";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step35 = "Step35_SDAUIRS1014_Daily graph displays the Note icon around 00:00  with a badge indicating 7 notes ";
	public static final String Notes_T002_Home_MyGlucose_Logbook_DailyReport_Step36 = "Step36_SDAUIRS871_SDAUIRS1125_Home Screen glucose graph displays the Note icon around 00:00 with a badge indicating 17 notes";


	// ManualBG_T001
	public static final String ManualBG_T001_Step1= "Step1_SDAUIRS908_The Manual BG Page is displayed";
	public static final String ManualBG_T001_Step2= "Step2_SDAUIRS1182_SDAUIRS909_SDAUIRS259_A manual BG '20' mg/dL on 9/14/2017 at 00:00 displayed on Logbook Page";
	public static final String ManualBG_T001_Step3= "Step3_SDAUIRS1182_SDAUIRS909_SDAUIRS259_A manual BG '500' mg/dL displayed on top of the list on 9/13/2017 at 23:59 on Logbook Page";
	public static final String ManualBG_T001_Step4= "Step4_SDAUIRS1182_SDAUIRS909_SDAUIRS259_A manual BG '499' mg/dL displayed on 9/13/2017 at 21:30";
	public static final String ManualBG_T001_Step5= "Step5_SDAUIRS1219_SDAUIRS1220_The Logbook distinguishes manually entered blood glucose values and notes from scan results";
	public static final String ManualBG_T001_Step6= "Step6_SDAUIRS1182_SDAUIRS909_SDAUIRS259_A manual BG '50' mg/dL displayed on top of the list on 6/17/2017 at 12:00 AM";
	public static final String ManualBG_T001_Step7= "Step7_SDAUIRS1182_SDAUIRS909_SDAUIRS259_ Two manual BG '50' mg/dL displayed from list on 6/17/2017 both at 12:00 AM";
	public static final String ManualBG_T001_Step8= "Step8_SDAUIRS1219_ One manual BG '50' mg/dL displayed on the list on 6/17/2017 at 12:00 PM  PDT ; Two manual BG '50' mg/dL displayed on the list on 6/17/2017 at 12:00 AM PDT";
	public static final String ManualBG_T001_Step9= "Step9_SDAUIRS1188_Manual BG with value '19' cannot be created";
	public static final String ManualBG_T001_Step10= "Step10_SDAUIRS1188_Manual BG with value '501' cannot be created";


	// Logbook_T001_Logbook_Navigation
	public static final String Logbook_T001_Logbook_Navigation_Step1= "Step1_SDAUIRS877_SDAISRS1162_Logbook screen displays current date, title, Calendar icon, tool bar, options to add note and blood glucose (for applicable countries)";
	public static final String Logbook_T001_Logbook_Navigation_Step2= "Step2_SDAUIRS877_SDAISRS1162_In Menu screen, Logbook option highlighted in blue color";
	public static final String Logbook_T001_Logbook_Navigation_Step3= "Step3_SDAUIRS877_navigation from Reminder:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step4= "Step4_SDAUIRS877_navigation from Daily Patterns:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step5= "Step5_SDAUIRS877_navigation from Time in Target:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step6= "Step6_SDAUIRS877_navigation from Low Glucose Events:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step7= "Step7_SDAUIRS877_navigation from Average Glucose:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step8= "Step8_SDAUIRS877_navigation from Daily Graph:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step9= "Step9_SDAUIRS877_navigation from Sensor Usage:Logbook screen is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step10= "Step10_SDAUIRS877_Logbook screen is displayed with the created Note";
	public static final String Logbook_T001_Logbook_Navigation_Step11_1= "Step11.1_SDAUIRS877_SDAISRS1162_navigation from Reminder:Logbook with Note is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step11_2= "Step11.2_SDAUIRS877_SDAISRS1162_navigation from Daily Patterns:Logbook with Note is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step11_3= "Step11.3_SDAUIRS877_SDAISRS1162_navigation from Time in Target:Logbook with Note is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step11_4= "Step11.4_SDAUIRS877_SDAISRS1162_navigation from Low Glucose Events:Logbook with Note is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step11_5= "Step11.5_SDAUIRS877_SDAISRS1162_navigation from Average Glucose:Logbook with Note is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step11_6= "Step11.6_SDAUIRS877_SDAISRS1162_navigation from Daily Graph:Logbook with Note is displayed";
	public static final String Logbook_T001_Logbook_Navigation_Step11_7= "Step11.7_SDAUIRS877_SDAISRS1162_navigation from Sensor Usage:Logbook with Note is displayed";

	// Logbook_T002_Graph_Axis_Display
	public static final String Logbook_T002_Graph_Axis_Display_Step1= "Step1_SDAUIRS878_Logbook displayed  information about scan results, including glucose value, UOM, Trend arrow, Time and TimeZone";
	public static final String Logbook_T002_Graph_Axis_Display_Step2= "Step2_SDAUIRS885_Logbook Detail graph dispalys 8 real time scan results";
	public static final String Logbook_T002_Graph_Axis_Display_Step3= "Step3_SDAUIRS886_The historical glucose values displayed on Logbook Detail graph";
	public static final String Logbook_T002_Graph_Axis_Display_Step4= "Step4_SDAUIRS883_Logbook Detail screen displays graph with X-axis range from midnight (00:00) to midnight (00:00) in 24-Hours (HH:MM) format";
	public static final String Logbook_T002_Graph_Axis_Display_Step5= "Step5_SDAUIRS884_Logbook Detail screen displays graph with Y-Axis range from 0 to 500 mg/dL or 0 to 27 mmol/L";
	public static final String Logbook_T002_Graph_Axis_Display_Step6= "Step6_SDAUIRS878_Logbook displayed  information about scan results, including glucose value, UOM, Trend arrow, Time and TimeZone.";
	public static final String Logbook_T002_Graph_Axis_Display_Step7= "Step7_SDAUIRS883_Logbook Detail screen displays graph with X-axis range from midnight 12 am to midnight 12 am in 12-Hours (am/pm) format";
	public static final String Logbook_T002_Graph_Axis_Display_Step8= "Step8_SDAUIRS884_Logbook Detail screen displays graph with Y-axis from 0 to 350 mg/dL or 0 to 21.0 mmol/L";

	// Logbook_T003_Logbook_Glucose_Graph_for_90_days
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step1= "Step1_SDAUIRS882_Logbook screen displays Current date scan result, notes, Date ,Calendar icon next to current date, left navigation button on the left corner of Date Label box.";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step2= "Step2_SDAUIRS882_Logbook calendar displays 89 days before the current date is enabled for selection";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step3= "Step3_SDAUIRS882_Logbook screen displays Previous date scan result and notes values, Date,Calendar icon ,left and right navigation button ";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step4= "Step4_SDAUIRS882_A change to the Logbook calendar date still displays 89 days before the current date";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step5= "Step5_SDAUIRS882_Logbook screen displays date, scan result, right and left arrows, calendar icon for Two days before current date";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step6= "Step6_SDAUIRS882_Logbook screen displays scan result and note values for one day before current date";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step7= "Step7_SDAUIRS882_Logbook details screen displays previous date and scanned time for the selected scan value with glucose graph";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step8= "Step8_SDAUIRS882_Logbook details screen displays current date and Note time for the selected Note with glucose graph";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step9= "Step9_SDAUIRS881_Logbook screen displays scan result and note values for selected date in Leap year";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step10= "Step10_SDAUIRS881_Logbook Leapyear calendar displays 89 days before current date is enabled for selection. ";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step11= "Step11_SDAUIRS881_Logbook screen displays scan result and note values for the selected date in Non-Leapyear";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step12= "Step12_SDAUIRS881_Logbook Non-Leapyear calendar displays 89 days before current date is enabled for selection. ";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step13= "Step13_SDAUIRS881_LogBook detail screen displays the glucose graph for the scan result";
	public static final String Logbook_T003_Logbook_Glucose_Graph_for_90_days_Step14= "Step14_SDAUIRS881_No entries exist for this date' message is displayed when there are no notes or manually entered glucose values";

	/**
	 * Scanning function steps constants
	 */    
	// Scanning_T001_Low_and_High_Glucose_Alarm test protocol
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step1= "Step1_SDAUIRS1127_My Glucose screen displayed the glucose value is 69 mg/dL  or 3.8 mmol/L with Low Glucose message and caution symbol";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step2= "Step2_SDAUIRS1127_The app displays a pop up with low glucose warning message and recommending to check glucose again after some time with options CANCEL and SET";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step3= "Step3_SDAUIRS1127_Pop up disappeared and My Glucose screen remains same with 69 mg/dL or 3.8 mmol/L glucose value";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step4= "Step4_SDAUIRS1127_Reminder screen is displayed on clicking SET from Low Glucose warning dialog box";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step5= "Step5_SDAUIRS1127_Set Reminder screen displays options to set reminder time, CANCEL and START button";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step6= "Step6_SDAUIRS1127_App navigated to My Glucose screen on clicking Cancel and My Glucose screen remains same with 69 mg/dL  or 3.8 mmol/L glucose value";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step7= "Step7_SDAUIRS1127_Alarm time drop down displayed the alarm times as 15 mins and 30 mins and able to select any one of it";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step8= "Step8_SDAUIRS1127_Alarm Check Glucose reminder displays 15 mins countdown";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step9= "Step9_SDAUIRS1127_Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step10= "Step10_SDAUIRS1127_Alarm Check Glucose reminder displays 30 mins countdown";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step11= "Step11_SDAUIRS1127_Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step12= "Step12_SDAUIRS1127_My Glucose screen is displayed the glucose value as LO with LOW GLUCOSE message and caution symbol";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step13= "Step13_SDAUIRS1127_The app displays a pop up with low glucose warning message and The Timer Reminder set is not displayed";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step14= "Step14_SDAUIRS1127_My Glucose screen is displayed the glucose value as 40mg/dL or  2.2 mmol/L with LOW GLUCOSE  message with caution symbol";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step15= "Step15_SDAUIRS1127_Alarm time drop down displayed the alarm times as 15 mins and 30 mins and able to select any one of it";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step16= "Step16_SDAUIRS1127_Reminders screen displayed Check Glucose reminder with timer reminder started from 30 mins";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step17= "Step17_SDAUIRS1127_My Glucose screen is displayed the glucose value as 70 mg/dL or  3.9 mmol/L with no LOW GLUCOSE";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step18= "Step18_SDAUIRS1128_My Glucose screen is displayed the glucose value as 355 mg/dL or 19.7 mmol/L with HIGH GLUCOSE message with caution symbol";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step19= "Step19_SDAUIRS1128_The app displayed a pop up with high glucose warning message and recommending to check glucose again after some time with options CANCEL and SET";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step20= "Step20_SDAUIRS1128_Pop up disappeared and My Glucose screen remains same with 355 mg/dL or 19.7 mmol/L glucose value";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step21= "Step21_SDAUIRS1128_Reminder screen is displayed on clicking SET from High Glucose warning dialog box";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step22= "Step22_SDAUIRS1128_Set Reminder screen displays option to set reminder time, CANCEL and START button";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step23= "Step23_SDAUIRS1128_App navigated to My Glucose screen and My Glucose screen remains same with 355 mg/dL or 19.7 mmol/L glucose value";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step24= "Step24_SDAUIRS1128_Alarm time dropdown displayed the alarm times as 1hr, 2hrs, 3hrs and 4hrs and able to select any one of it";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step25= "Step25_SDAUIRS1128_Alarm set for 1hr and the Reminders screen displayed Check Glucose reminder with timer reminder started from 1hr";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step26= "Step26_SDAUIRS1128_1 hour Timer expired notification is displayed with message Check Glucose";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step27= "Step27_SDAUIRS1128_2 hours alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step28= "Step28_SDAUIRS1128_3 hours alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step29= "Step29_SDAUIRS1128_My Glucose screen is displayed the glucose value as HI with HIGH GLUCOSE(OUT OF RANGE)  message with caution symbol, The Timer Reminder set is not displayed";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step30= "Step30_SDAUIRS1128_My Glucose screen is displayed the glucose value as 401 mg/dL or  22.3 mmol/L with HIGH GLUCOSE  message with caution symbol";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step31= "Step31_SDAUIRS1128_Alarm time dropdown displayed the alarm times as 1hr, 2hrs, 3hrs and 4hrs and able to select any one of it";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step32= "Step32_SDAUIRS1128_4 hours alarm Timer expired notification is displayed with message Check Glucose";
	public static final String Scanning_T001_Low_and_High_Glucose_Alarm_Step33= "Step33_SDAUIRS1128_My Glucose screen is displayed the glucose value as 240 mg/dL or  13.3 mmol/L without message";

	// Scanning_T002_Low_and_High_Projected_Glucose_Alarm test protocol
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step1= "Step1_SDAUIRS1129_My Glucose screen displayed glucose value is 70 mg/dL or 3.9 mmol/L with Glucose going low message and caution symbol.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step2= "Step2_SDAUIRS1129_Low Glucose warning dialog box is displayed";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step3= "Step3_SDAUIRS1129_Low Glucose warning dialog box disappears on clicking Cancel";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step4= "Step4_SDAUIRS1129_Add Reminder screen is displayed on clicking SET from Low Glucose warning dialog box";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step5= "Step5_SDAUIRS1129_Set Reminder screen displays option to set reminder time, CANCEL and START button";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step6= "Step6_SDAUIRS1129_App navigated to My Glucose screen on clicking Cancel and My Glucose screen remains same with 70 mg/dL or 3.9 mmol/L  projected glucose value.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step7= "Step7_SDAUIRS1129_Alarm time dropdown displayed the alarm times as 15 mins and 30 mins and able to select any one of it.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step8= "Step8_SDAUIRS1129_Alarm Check Glucose reminder displays 15 mins countdown";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step9= "Step9_SDAUIRS1129_15 mins alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step10= "Step10_SDAUIRS1129_30 mins alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step11= "Step11_SDAUIRS1130_My Glucose screen displayed the glucose value as 240 mg/dL or 13.3 mmol/L with GLUCOSE GOING HIGH message and caution symbol.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step12= "Step12_SDAUIRS1130_High Glucose warning dialog box is displayed";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step13= "Step13_SDAUIRS1130_High Glucose warning dialog box disappears on clicking Cancel";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step14= "Step14_SDAUIRS1130_Add Reminder screen is displayed on clicking SET from High Glucose warning dialog box";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step15= "Step15_SDAUIRS1130_Set Reminder screen displays option to set reminder time, CANCEL and START button";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step16= "Step16_SDAUIRS1130_App navigated to My Glucose screen on clicking Cancel and My Glucose screen remains same with  240 mg/dL or 13.3 mmol/L  projected glucose value.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step17= "Step17_SDAUIRS1130_Alarm time dropdown displayed the alarm times as 1hr, 2hrs, 3hrs and 4hrs and able to select any one of it.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step18= "Step18_SDAUIRS1130_Alarm Check Glucose reminder displays 1 hr countdown";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step19= "Step19_SDAUIRS1130_1 hr alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step20= "Step20_SDAUIRS1130_2 hrs alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step21= "Step21_SDAUIRS1130_3 hrs alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step22= "Step22_SDAUIRS1130_4 hrs alarm Timer expired notification is displayed with message Check Glucose.";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step23= "Step23_SDAUIRS1190 SDAISRS395_My Glucose screen displayed result with Non-Actionable indication icon";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step24= "Step24_SDAUIRS1190_Check Blood Glucose information dialog pops up";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step25= "Step25_SDAUIRS1227_The software displays the numeric glucose result digits after the decimal separator in a smaller font than the digits before the decimal separator";
	public static final String Scanning_T002_Low_and_High_Projected_Glucose_Alarm_Step26= "Step26_SDAUIRS1227_The software displays the numeric glucose result digits after the decimal separator in a smaller font than the digits before the decimal separator";

	/**
	 * Home Screen function steps constants
	 */   
	// HomeScreen_T001_Sensor_Status_WithoutData
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step1= "Step1_SDAUIRS852,SDAUIRS1276_Warmup completion time 13:00 and Sensor warmup remaining time 60 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step2= "Step2_SDAUIRS852,SDAUIRS859_Warmup completion time 13:00 and Sensor warmup remaining time 30 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step3= "Step3_SDAUIRS852,SDAUIRS859_Warmup completion time 1:00 pm and Sensor warmup remaining time 29 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step4= "Step4_SDAUIRS852,SDAUIRS859_Warmup completion time 1:00 pm and Sensor warmup remaining time 29 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step5= "Step5_SDAUIRS852_Warmup completion time 13:00  and Sensor warmup remaining time 1 min displayed on the home screen";   
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step6= "Step6_SDAUIRS852,SDAUIRS856_Sensor life on the home screen displayed: 14 days";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step7= "Step7_SDAUIRS852_SDAUIRS856_SDAUIRS874_Sensor life on the home screen displayed: 2 days";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step8= "Step8_SDAUIRS852,SDAUIRS857_Sensor life on the home screen displayed: 24 hours";   
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step9= "Step9_SDAUIRS852,SDAUIRS857_Sensor life on the home screen displayed: 2 hours";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step10= "Step10_SDAUIRS852,SDAUIRS858_Sensor life on the home screen displayed: 60 mins";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step11= "Step11_SDAUIRS852_SDAUIRS858_SDAUIRS874_Sensor life on the home screen displayed: 1min";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_Step12= "Step12_SDAUIRS875_Home screen displays scan new sensor button";

	// HomeScreen_T001_Sensor_Status_WithoutData_US10d
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step1= "Step1_SDAUIRS852,SDAUIRS1276_Warmup completion time 00:00 and Sensor warmup remaining time 12 hrs 0 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step2= "Step2_SDAUIRS852,SDAUIRS859,SDAUIRS1276_Warmup completion time 00:00 and Sensor warmup remaining time 11 hrs 30 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step3= "Step3_SDAUIRS852,SDAUIRS859,SDAUIRS1276_Warmup completion time 12:00 am and Sensor warmup remaining time 11 hrs 29 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step4= "Step4_SDAUIRS852,SDAUIRS859,SDAUIRS1276_Warmup completion time 12:00 am and Sensor warmup remaining time 11 hrs ~29-28 mins displayed on the home screen";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step5= "Step5_SDAUIRS852_Sensor warmup remaining time displayed on the home screen: 1min";   
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step6= "Step6_SDAUIRS852,SDAUIRS856_Sensor life on the home screen displayed: 10 days";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step7= "Step7_SDAUIRS852_SDAUIRS856_SDAUIRS874_Sensor life on the home screen displayed: 2 days";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step8= "Step8_SDAUIRS852,SDAUIRS857_Sensor life on the home screen displayed: 24 hours";   
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step9= "Step9_SDAUIRS852,SDAUIRS857_Sensor life on the home screen displayed: 2 hours";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step10= "Step10_SDAUIRS852,SDAUIRS858_Sensor life on the home screen displayed: 60 mins";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step11= "Step11_SDAUIRS852_SDAUIRS858_SDAUIRS874_Sensor life on the home screen displayed: 1min";
	public static final String HomeScreen_T001_Sensor_Status_WithoutData_US10d_Step12= "Step12_SDAUIRS875_Home screen displays scan new sensor button";

	// HomeScreen_T002_Sensor_Status_WithData
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step1= "Step1_SDAUIRS852,SDAUIRS865,SDAUIRS1271_Sensor warmup time remaining displayed on  bottom of the home screen with Graph.";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step2= "Step2_SDAUIRS852,SDAUIRS859_Sensor warmup remaining time displayed on the home screen: ~30-29 mins on waiting for 30 minutes";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step3= "Step3_SDAUIRS852,SDAUIRS859_Sensor warmup remaining time displayed on the home screen: ~29-28 mins on waiting for a mintue";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step4= "Step4_SDAUIRS852,SDAUIRS859_Sensor warmup remaining time displayed on the home screen: ~29-28 mins on waiting for 20 seconds";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step5= "Step5_SDAUIRS852_Sensor warmup remaining time displayed on the home screen: 1min";   
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step6= "Step6_SDAUIRS852,SDAUIRS856_Sensor life on the home screen displayed: 14 days";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step7= "Step7_SDAUIRS874_Home screen displays a message instructing the user to scan their sensor";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step8= "Step8_SDAUIRS852,SDAUIRS856_Sensor life on the home screen displayed: 2 days";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step9= "Step9_SDAUIRS1271_A glucose graph is displayed in home screen ";   
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step10= "Step10_SDAUIRS852,SDAUIRS857_Sensor life on the home screen displayed: 24 hours";   
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step11= "Step11_SDAUIRS852,SDAUIRS857,SDAUIRS865_Sensor life on the home screen displayed: 2 hours with Graph";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step12= "Step12_SDAUIRS852,SDAUIRS858,SDAUIRS865_Sensor life on the home screen displayed: 60 mins with Graph";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step13= "Step13_SDAUIRS852,SDAUIRS858_Sensor life on the home screen displayed: 1 min";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step14= "Step14_SDAUIRS855_App UI notifies the user within 1 minute after sensor expiration";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step15= "Step15_SDAUIRS865_SDAUIRS875_Home screen displays Scan new Sensor button with Graph";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step16= "Step16_SDAUIRS875_Home screen displays scan new sensor button";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step17= "Step17_SDAUIRS1271_A glucose graph is displayed in HomeScreen with real time glucose point";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step18= "Step18_SDAUIRS1271_A glucose graph is displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step19= "Step19_SDAUIRS1271_A glucose graph is not displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step20= "Step20_SDAUIRS865_A glucose graph is displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step21= "Step21_SDAUIRS865_A glucose graph is displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_Step22= "Step22_SDAUIRS865_A glucose graph is not displayed in HomeScreen";         

	// HomeScreen_T002_Sensor_Status_WithData_US10d
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step1= "Step1_SDAUIRS852,SDAUIRS865,SDAUIRS1271_Sensor warmup time remaining '12 hours' displayed on  bottom of the home screen with Graph.";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step2= "Step2_SDAUIRS852,SDAUIRS859_Sensor warmup time remaining displayed on bottom of the home screen: 11 hours";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step3= "Step3_SDAUIRS852,SDAUIRS859_Sensor warmup time remaining displayed on bottom of the home screen: 10 hours";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step4= "Step4_SDAUIRS852,SDAUIRS859_Sensor warmup time remaining displayed on bottom of the home screen: 60 minutes";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step5= "Step5_SDAUIRS852_Sensor warmup time remaining displayed on bottom of the home screen: 1 minute";   
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step6= "Step6_SDAUIRS852,SDAUIRS856_Sensor life on the home screen displayed: 10 DAYS";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step7= "Step7_SDAUIRS874_Sensor life on the home screen is displayed as 2 DAYS and glucose graph is NOT displayed";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step8= "Step8_SDAUIRS852,SDAUIRS856_Sensor life on the home screen displayed as 2 DAYS";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step9= "Step9_SDAUIRS1271_A glucose graph is displayed in home screen ";   
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step10= "Step10_SDAUIRS852,SDAUIRS857_Sensor life on the home screen displayed: 24 hours";   
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step11= "Step11_SDAUIRS852,SDAUIRS857,SDAUIRS865_Sensor life on the home screen displayed as 2 hours with Graph";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step12= "Step12_SDAUIRS852,SDAUIRS858,SDAUIRS865_Sensor life on the home screen displayed as 60 mins with Graph";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step13= "Step13_SDAUIRS852,SDAUIRS858_Sensor life on the home screen displayed: 1 MINUTE";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step14= "Step14_SDAUIRS855_App UI notifies the user within 1 minute after sensor expiration";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step15= "Step15_SDAUIRS865_SDAUIRS875_Home screen displays Scan new Sensor button with Graph";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step16= "Step16_SDAUIRS875_Home screen displays scan new sensor button";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step17= "Step17_SDAUIRS1271_A glucose graph is displayed in HomeScreen with real time glucose point";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step18= "Step18_SDAUIRS1271_A glucose graph is displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step19= "Step19_SDAUIRS1271_A glucose graph is not displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step20= "Step20_SDAUIRS865_A glucose graph is displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step21= "Step21_SDAUIRS865_A glucose graph is displayed in HomeScreen";
	public static final String HomeScreen_T002_Sensor_Status_WithData_US10d_Step22= "Step22_SDAUIRS865_A glucose graph is not displayed in HomeScreen";             

	// HomeScreen_T003_LastScan_UOM_Average_percentage_Axis
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step1= "Step1_SDAUIRS860,SDAUIRS1221_Home Screen displays the most recent scan result 500 mg/dL or 27.8 mmol/L for LAST SCAN";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step2= "Step2_SDAUIRS861_Home Screen displays the time of most recent scan for LAST SCAN: 23:59";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step3= "Step3_SDAUIRS866_X-axis displays 24-hour period ending at the current time.(24 hour format)";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step4= "Step4_SDAUIRS867_Y-axis from 0 to 500 mg/dL or 0-27 mmol/L";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step5= "Step5_SDAUIRS861_Home Screen displays the time of most recent scan for LAST SCAN: 11:59 pm";   
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step6= "Step6_SDAUIRS866_X-axis displays 24-hour period ending at the current time.(12 hour format)";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step7= "Step7_SDAUIRS861_Home Screen displays the time of most recent scan for LAST SCAN: 02:59 am";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step8= "Step8_SDAUIRS861_Home Screen displays the time of most recent scan for LAST SCAN: 10:59 pm";   
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step9= "Step9_SDAUIRS860_Home Screen displays the most recent scan result HI for LAST SCAN";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step10= "Step10_SDAUIRS860_Home Screen displays the most recent scan result LO for LAST SCAN";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step11= "Step11_SDAUIRS860,SDAUIRS1221_Home Screen displays the most recent scan result 40 mg/dL or 2.2 mmol/L for LAST SCAN";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step12= "Step12_SDAUIRS864_Home screen displays: Average = 111 mg/dL or 6.2 mmol/L";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step13= "Step13_SDAUIRS866_X-axis displays 24-hour period ending at the current time.(24 hour format)";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step14= "Step14_SDAUIRS867_Y-axis from 0 to 350 mg/dL or 0-21 mmol/L";       
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step15= "Step15_SDAUIRS863_Home screen displays: Time In Target =  100%";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step16= "Step16_SDAUIRS863_Home screen displays: Time In Target =  0%";
	public static final String HomeScreen_T003_LastScan_UOM_Average_percentage_Axis_Step17= "Step17_SDAUIRS863_Home screen displays: Time In Target =  50%";

	/**
	 * General function steps constants
	 */
	//General_T001_GlucoseGraph_TimeZoneChange
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step1= "Step1_SDAUIRS1168_The software displays a scan results screen containing the current Real-time glucose value and Trend Arrow as 50 mg/dL or 2.8 mmol/L and glucose is falling";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step2= "Step2_SDAUIRS1168_The software displays a scan results screen containing a glucose graph of 8 hours HG displayed from graph ending around 14:50";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step3= "Step3_SDAUIRS869_Home screen glucose graph displays the most recent realtime glucose 50 mg/dL or 2.8 mmol/L around 14:50";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step4= "Step4_SDAUIRS868_Home screen glucose graph displays 9 hours Historical Glucose values ending aroung 14:50.";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step5= "Step5_SDAUIRS1168_Glucose graph displays 8 hours Historical glucose values ending around 17:50";    
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step6= "Step6_SDAUIRS1168_Verify the current Real-time glucose in My Glucose screen Around 17:50, 50 mg/dL or 2.8 mmol/L and Trend Arrow going low";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step7= "Step7_SDAUIRS869_Home screen glucose graph displays the most recent realtime glucose values as 50 mg/dL or 2.8 mmol/L around 17:50.";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step8= "Step8_SDAUIRS868_Home screen glucose graph displays 9 hours Historical Glucose values ending around 17:50";   
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step9= "Step9_Change phone time 4 hrs ahead and launch the App";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step10= "Step10_SDAUIRS868_Home screen glucose graph displays 9 hours Historical Glucose values ending around 17:50";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step11= "Step11_SDAUIRS1243_Timezone change indicator displayed around 11:00 in My Glucose screen";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step12= "Step12_SDAUIRS1244_Timezone change indicator displayed Time zone change from CDT/CST to PDT/PST (-2h) or GMT-5/GMT-6 to GMT-7/GMT-8 (-2h)";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step13= "Step13_SDAUIRS870_Timezone change indicator displayed around 11:00 in Home screen";      
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step14= "Step14_SDAUIRS1241_Timezone change indicator displayed Time zone change from CDT/CST to PDT/PST (-2h) or GMT-5/GMT-6 to GMT-7/GMT-8 (-2h)";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step15= "Step15_SDAUIRS880_Timezone change indicator displayed in the list, and the information Time zone change from CDT/CST to PDT/PST (-2h) or GMT-5/GMT-6 to GMT-7/GMT-8 (-2h) can be viewed in Logbook";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step16= "Step16_SDAUIRS889,SDAISRS307_Timezone change indicator displayed around 11:00 in Logbook Details page";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step17= "Step17_SDAUIRS890_The line of HG on graph has a gap around TimeZone change Indicator.HG with 150 and 200 mg/dL or 8.3 and 11.1 mmol/L not displayed on graph";     
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step18= "Step18_SDAUIRS1243_Timezone change indicators displayed around 11:00 and 13:00 in  My Glucose screen";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step19= "Step19_SDAUIRS1168_My Glucose screen displays current real time glucose value as 50 mg/dL or 2.8 mmol/L around 14:50 and Trend arrow as Glucose is falling.";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step20= "Step20_SDAUIRS1168_My Glucose screen Glucose graph displays 8 hours Historical Glucose values ending around 14:50";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step21= "Step21_SDAUIRS868_Home screen Gucose graph displays 9 hours historical glucose values ending around 14:50";      
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step22= "Step22_SDAUIRS869_Home screen Glucose graph displays most recent real time glucose value as 50 mg/dL or 2.8 mmol/L around 14:50 ";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step23= "Step23_SDAUIRS870_Timezone change indicators displayed around 11:00 and 13:00";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step24= "Step24_SDAUIRS880_Timezone change indicators displayed in the list";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step25= "Step25_SDAUIRS889,SDAISRS307_Timezone change indicators displayed around 11:00 and 12:00";
	public static final String General_T001_GlucoseGraph_TimeZoneChange_Step26= "Step26_SDAUIRS1242_Time change magnitude is displayed as Time zone change from PDT/PST to AKDT/AKST (-1h) or GMT-7/GMT-8 to GMT-8/GMT-9 (-1h) and vice versa (1h)";

	//General_T002_GlucoseGraph_HG-21mGap_Connect35m
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step1= "Step1_SDAUIRS1192_My Glucose Screen displays No gaps around 09:19 to 09:39; No gaps around 12:30 to 12:50 ; Gap around 07:39 to 08:00 and Gap around 10:54 to 11:15";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step2= "Step2_SDAUIRS873_Home screen glucose graph displays No gaps from 09:19 to 09:39;No gaps from 12:30 to 12:50 ; Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step3= "Step3_SDAUIRS887_Logbook Detail screen glucose graph displays No gaps from 09:19 to 09:39;No gaps from 12:30 to 12:50 ;Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step4= "Step4_SDAUIRS1192_My Glucose Screen displays No gaps from 09:19 to 09:39;No gaps from 12:30 to 12:50 with TZ change icon; Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step5= "Step5_SDAUIRS873_Home screen glucose graph displays No gaps from 09:19 to 09:39 ;No gaps from 12:30 to 12:50 with TZ change icon ;Gap from 07:39 to 08:00 ;Gap from 10:54 to 11:15";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step6= "Step6_SDAUIRS887_Logbook Detail Screen glucose graph No gaps from 09:19 to 09:39;Gaps from 11:40 to 12:40 with TZ change icon ;Gap from 06:39 to 07:00;Gap from 09:54 to 10:15";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step7= "Step7_SDAUIRS1232_The scan results screen glucose graph connects the scan result and the last historical glucose";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step8= "Step8_SDAUIRS1230_The Home screen glucose graph connects the scan result and the last historical glucose";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step9= "Step9_SDAUIRS1231_The Logbook Details screen glucose graph connects the scan result and the last historical glucose";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step10= "Step10_SDAUIRS1232_The scan results screen glucose graph doesn't connect the scan result and the last historical glucose as the time difference is greater than 35 mins";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step11= "Step11_SDAUIRS1230_The Home screen glucose graph doesn't connect  the scan result and the last historical glucose as the time difference is greater than 35 mins";
	public static final String General_T002_GlucoseGraph_HG_21mGap_Connect35m_Step12= "Step12_SDAUIRS1231_The Logbook Details screen glucose graph doesn't connect  the scan result and the last historical glucose as the time difference is greater than 35 mins";

	//General_T003_GlucoseValue_distinguish
	public static final String General_T003_GlucoseValue_distinguish_Step1_1= "Step1.1_SDAUIRS1169 SDAISRS325_ The software displays the most recent scan result as LO_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step1_2= "Step1.2_SDAUIRS1169 SDAISRS325_ The software displays the most recent scan result as LO_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step1_3= "Step1.3_SDAUIRS1169 SDAISRS325_ The software displays the most recent scan result as LO_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step1_4= "Step1.4_SDAUIRS1169 SDAISRS325_ The software displays the most recent scan result as LO_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step2_1= "Step2.1_SDAUIRS888_ Software distinguishes the historical glucose values and connecting lines that fall below 70 mg/dL or 3.9 mmol/L on graph from around 00:00 to 09:00_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step2_2= "Step2.2_SDAUIRS888_ Software distinguishes the historical glucose values and connecting lines that fall below 70 mg/dL or 3.9 mmol/L on graph from around 00:00 to 09:00_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step2_3= "Step2.3_SDAUIRS888_ Software distinguishes the historical glucose values and connecting lines that fall below 70 mg/dL or 3.9 mmol/L on graph from around 00:00 to 09:00_LogBook Detail Screen";  
	public static final String General_T003_GlucoseValue_distinguish_Step3_1= "Step3.1_SDAUIRS1170_SDAISRS325_ The software displays the  most recent scan result as HI_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step3_2= "Step3.2_SDAUIRS1170_SDAISRS325_ The software displays the  most recent scan result as HI_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step3_3= "Step3.3_SDAUIRS1170_SDAISRS325_ The software displays the  most recent scan result as HI_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step3_4= "Step3.4_SDAUIRS1170_SDAISRS325_ The software displays the  most recent scan result as HI_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step4_1= "Step4.1_SDAUIRS1131 _ Verify the software distinguishes the most recent scan result <70 mg/dL or 3.9 mmol/L_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step4_2= "Step4.2_SDAUIRS1209_ Verify the software distinguishes the most recent scan result <70 mg/dL or 3.9 mmol/L_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step4_3= "Step4.3_SDAUIRS1204_ Verify the software distinguishes the most recent scan result <70 mg/dL or 3.9 mmol/L_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step4_4= "Step4.4_SDAUIRS1204_ Verify the software distinguishes the most recent scan result <70 mg/dL or 3.9 mmol/L_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step5_1= "Step5.1_SDAUIRS1132_ Verify the software distinguishes the most recent scan result >240 mg/dL or 13.3 mmol/L_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step5_2= "Step5.2_SDAUIRS1213_ Verify the software distinguishes the most recent scan result >240 mg/dL or 13.3 mmol/L_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step5_3= "Step5.3_SDAUIRS1208_ Verify the software distinguishes the most recent scan result >240 mg/dL or 13.3 mmol/L_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step5_4= "Step5.4_SDAUIRS1208_ Verify the software distinguishes the most recent scan result >240 mg/dL or 13.3 mmol/L_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step6_1= "Step6.1_SDAUIRS1133_ The glucose graph distinguishes the target glucose range_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step6_2= "Step6.2_SDAUIRS1211 SDAUIRS872_ The glucose graph distinguishes the target glucose range_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step6_3= "Step6.3_SDAUIRS1206_ The logbook list distinguishes the target glucose range in the left hand side bar";
	public static final String General_T003_GlucoseValue_distinguish_Step6_4= "Step6.4_SDAUIRS1206_ The glucose graph distinguishes the target glucose range_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step7_1= "Step7.1_SDAUIRS1176_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step7_2= "Step7.2_SDAUIRS1210_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step7_3= "Step7.3_SDAUIRS1205_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step7_4= "Step7.4_SDAUIRS1205_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step8_1= "Step8.1_SDAUIRS1133_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step8_2= "Step8.2_SDAUIRS1211_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step8_3= "Step8.3_SDAUIRS1206_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step8_4= "Step8.4_SDAUIRS1206_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step9_1= "Step9.1_SDAUIRS1177_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step9_2= "Step9.2_SDAUIRS1212_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step9_3= "Step9.3_SDAUIRS1207_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step9_4= "Step9.4_SDAUIRS1207_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step10_1= "Step10.1_SDAUIRS1176_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step10_2= "Step10.2_SDAUIRS1210_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step10_3= "Step10.3_SDAUIRS1205_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step10_4= "Step10.4_SDAUIRS1205_ Verify the software distinguishes the most recent scan result NOT within the Target Glucose Range_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step11_1= "Step11.1_SDAUIRS1133_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step11_2= "Step11.2_SDAUIRS1211_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step11_3= "Step11.3_SDAUIRS1206_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step11_4= "Step11.4_SDAUIRS1206_ Verify the software distinguishes the most recent scan result within the Target Glucose Range_LogBook Detail Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step12_1= "Step12.1_SDAUIRS1177_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_MyGlucose Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step12_2= "Step12.2_SDAUIRS1212_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_HomeScreen";
	public static final String General_T003_GlucoseValue_distinguish_Step12_3= "Step12.3_SDAUIRS1207_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_LogBook List Screen";
	public static final String General_T003_GlucoseValue_distinguish_Step12_4= "Step12.4_SDAUIRS1207_ Verify the software distinguishes the most recent scan result > the high glucose target and <= 240 mg/dL or 13.3 mmol/L_LogBook Detail Screen";

	// General_T004_DefaultLang_SysInfo
	public static final String General_T004_DefaultLang_SysInfo_Step1= "Step1_SDAUIRS1167_SDAISRS133_Welcome Screen all strings are displayed in selected language that is supported by App";
	public static final String General_T004_DefaultLang_SysInfo_Step2= "Step2_SDAUIRS1167,SDAISRS133_Terms of Use and  Privacy Notice all strings are displayed in selected language that is supported by App";
	public static final String General_T004_DefaultLang_SysInfo_Step3= "Step3_SDAUIRS1167,SDAISRS133_Create My Account screen all Strings are displayed in selected language that is supported by App";
	public static final String General_T004_DefaultLang_SysInfo_Step4= "Step4_SDAUIRS1167,SDAISRS133_Home,Logbook,Reminders, all reports all Strings are displayed in selected language that is supported by App";
	public static final String General_T004_DefaultLang_SysInfo_Step5= "Step5_SDAUIRS1167,SDAISRS133_App Settings,Account Settings,Change Password,Help,About are displayed in selected language that is supported by App";
	public static final String General_T004_DefaultLang_SysInfo_Step6= "Step6_SDAISRS668 SDAISRS133_App displayed all the strings in default language US English when unsupported language is selected";
	public static final String General_T004_DefaultLang_SysInfo_Step7= "Step7_SDAUIRS1166_About screen displays the smart device OS version details";

	// General_T005_Results_Resolution
	public static final String General_T005_Results_Resolution_Step1= "Step1_SDAISRS322_SDAUIRS323_SDAUIRS847 _SDAUIRS1222_My Glucose screen shows glucose value as 500 mg/dL ( or 27.8 mmol/L for mmol/L)";
	public static final String General_T005_Results_Resolution_Step2= "Step2_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_The Last Scan display 500 mg/dL (or 27.8 mmol/L for mmol/L)";
	public static final String General_T005_Results_Resolution_Step3= "Step3_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_All Glucose Values in mg/dL are displayed as whole number (or All glucose values in mmol/L are displayed as one decimal for mmol/L)";
	public static final String General_T005_Results_Resolution_Step4= "Step4_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_Manual Blood glucose value in mg/dL are displayed as whole number";
	public static final String General_T005_Results_Resolution_Step5= "Step5_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_Glucose value in mg/dL are displayed as whole number (or Glucose value in mmol/L are displayed as one decimal for mmol/L)";
	public static final String General_T005_Results_Resolution_Step6= "Step6_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_SDAISRS133_Glucose Target Range values in mg/dL are displayed as whole number (or Glucose Target Range values in mmol/L are displayed as one decimal for mmol/L)";
	public static final String General_T005_Results_Resolution_Step7= "Step7_SDAISRS322_SDAISRS323_SDAUIRS847 _SDAUIRS1222_All glucose values in mg/dL are displayed as whole numbers (or all glucose values in mmol/L are displayed as one decimal for mmol/L)";

	//General_T006_Results_WithUOM
	public static final String General_T006_Results_WithUOM_Step1= "Step1_SDAISRS1175_ About screen is displayed the smart device Model and OS version details.";
	public static final String General_T006_Results_WithUOM_Step2= "Step2_SDAISRS354_SDAUIRS842_ The Add Note screen unit-of-measure is displays as:Breakfast - grams,Rapid-Acting Insulin - units,Long-acting Insulin - units ";
	public static final String General_T006_Results_WithUOM_Step3= "Step3_SDAISRS354_SDAUIRS842_ In Logbook Details screen, the numerical values unit of measurements are displayed for selected attributes";
	public static final String General_T006_Results_WithUOM_Step4= "Step4_SDAISRS354_SDAUIRS842_ The Average Glucose readings displayed with unit of measurement mg/dL or mmol/L";
	public static final String General_T006_Results_WithUOM_Step5= "Step5_SDAISRS354_SDAUIRS842_ DAILY PATTERNS report Y-axis Glucose values are displayed with unit of measurement mg/dL or mmol/L  for ";
	public static final String General_T006_Results_WithUOM_Step6= "Step6_SDAISRS354 _SDAUIRS842_ The Target Glucose Range glucose values displays with UOM mg/dL or mmol/L and The Target Glucose Range report display each bar with numerical % for ";
	public static final String General_T006_Results_WithUOM_Step7= "Step7_SDAISRS354_SDAUIRS842_ AVERAGE GLUCOSE report is displayed the Average  Glucose value with unit of measurement mg/dL or mmol/L for ";
	public static final String General_T006_Results_WithUOM_Step8= "Step8_SDAISRS354_SDAUIRS842_ DAILY GRAPH report is displayed  the Y-axis Glucose values with unit of measurement mg/dL or mmol/L";
	public static final String General_T006_Results_WithUOM_Step9= "Step9_SDAISRS354_SDAUIRS842_ In Target Glucose Range screen, the Target Glucose Range values are displayed with UOM as mg/dL or mmol/L";
	public static final String General_T006_Results_WithUOM_Step10= "Step10_SDAISRS354_ The UOM for Carbohydrate is displayed as grams and servings. ( for UK, it is displayed as gram and portions)";
	public static final String General_T006_Results_WithUOM_Step11= "Step11_SDAISRS354_ The unit-of-measure for Breakfast is displayed as servings. ( for UK , it is displayed as portions)";
	public static final String General_T006_Results_WithUOM_Step12= "Step12_SDAISRS354_ The unit-of-measure for Breakfast is displayed as svg (servings); For UK, it is displayed as ptn (portions).";
	public static final String General_T006_Results_WithUOM_Step13= "Step13_SDAISRS354_SDAUIRS842_ My Glucose screen is displayed the values with UOM as:Breakfast servings(20.0svg)  ( or Portions( 20.0 ptns) for UK build ),Rapid-Acting Insulin units(2 units),Long-acting Insulin units(3 units),Exercise Low Intensity Hrs(12 hours 2 minutes). ";
	public static final String General_T006_Results_WithUOM_Step14= "Step14_SDAISRS354_ Home screen is displayed the values with UOM as:Breakfast servings(20.0svg)  ( or Portions( 20.0 ptns) for UK build ),Rapid-Acting Insulin units(2 units),Long-acting Insulin units(3 units),Exercise Low Intensity Hrs(12 hours 2 mins). ";
	public static final String General_T006_Results_WithUOM_Step15= "Step15_SDAISRS354_SDAUIRS842_ Home screen is displayed Sensor Life in 'DAYS' and UOM for Glucose Reading as mg/dL or mmol/L";
	public static final String General_T006_Results_WithUOM_Step16= "Step16_SDAISRS354_ Home screen displayed the Sensor life in HOURS.";
	public static final String General_T006_Results_WithUOM_Step17= "Step17_SDAISRS354_ Home screen displayed the Sensor life in MINUTES.";
	public static final String General_T006_Results_WithUOM_Step18= "Step18_SDAUIRS842_ No unit of measure for numerical value with a percentage";
	public static final String General_T006_Results_WithUOM_Step19= "Step19_SDAUIRS842_ No unit of measure for numerical value with Time";
	public static final String General_T006_Results_WithUOM_Step20= "Step20_SDAUIRS842_ No unit of measure for numerical value with a count";
	public static final String General_T006_Results_WithUOM_Step21= "Step21_SDAUIRS842_ No unit of measure for numerical value with a date";
	public static final String General_T006_Results_WithUOM_Step22= "Step22_SDAUIRS842_ No unit of measure for the numerical value is associated with a bar in a graph";

	//GeneralFunction_T001_ReleaseBuild_Part1
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step1="Step1_SDAUIRS937_SDAUIRS938_Verify the Initial Wizard sreens";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step2="Step2_SDAUIRS939_Verify Confirm Country screen";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step3="Step3_SDAUIRS939_Verify Terms of Use screen";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step4="Step4_SDAUIRS939_Verify Privacy Notice screen";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step5="Step5_SDAUIRS939_Verify agreement of Privacy Notice in the pop-up screen";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step6="Step6_SDAUIRS939_Verify Create Account screen is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step7="Step7_SDAUIRS1238_SDAUIRS938_On providing adult DOB adult login screen is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step8="Step8_SDAUIRS1238_SDAUIRS1239_UOM screen is displayed on providing valid email and password and clicking on submit";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step9="Step9_SDAUIRS943_Verify Target Glucose Range default values";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step10="Step10_SDAUIRS943_Modify Target Glucose Range and click on Next, Carbohydrate Units screen is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step11="Step11_SDAUIRS1292_Select gram option and click on Done, Welcome screen is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step12="Step12_SDAUIRS1292_Safety Information content is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step13="Step13_SDAUIRS1217_My Glucose information screen is displayed on clicking Next";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step14="Step14_SDAUIRS1293_Glucose Background Color Screen displays the target glucose range levels";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step15="Step15_SDAUIRS1247_Glucose Trend Arrow screen is displayed.";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step16="Step16_SDAUIRS1294_Treatment Decisions screen is displayed and it shows Non-Actionable Icon image";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step17="Step17_SDAUIRS1295_Treatment Decisions screen is is displayed and it shows the action to be performed on observing Non-actionable result";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step18="Step18_SDAUIRS943_On Allowing notification, Home Screen is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step19="Step19_SDAUIRS1137_How to apply a sensor link from Help Page will display the 10 information screens on swiping";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step20="Step20_SDAUIRS1137_Applying a Sensor section contains total 10 screens with instructions for How to Apply a new sensor.";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step21="Step21_SDAUIRS1138_How to scan a sensor link from Home screen displays 3 informational screens";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step22="Step22_SDAUIRS1138_How to scan a sensor link from Help screen displays 3 informational screens";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step23="Step23_SDAUIRS1283_SDAUIRS1284_Glucose Reading link displays My Glucose information screen and access to other glucose information screens";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step24="Step24_SDAUIRS1285_Verify Glucose Reading second screen displays Background color explanation";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step25="Step25_SDAUIRS1286_Glucose Reading third screen displays Trend Arrow explanation";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step26="Step26_SDAUIRS1287_Glucose Reading fourth screen displays Non-Actionable Icon image";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step27="Step27_SDAUIRS1288_Glucose Reading 5th screen displays the action to be performed on observing Non-actionable result";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step28="Step28_SDAUIRS1140_click on User Manual link from help and verify User Manual is not blank";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step29="Step29_SDAUIRS1187_click on Terms of Use link from help and verify it gets displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step30="Step30_SDAUIRS1191_click on Privacy Notice link from help and verify it gets displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step31="Step31_SDAUIRS1289_App displays an option to access the Safety Information and on clicking Safety information link it takes to web page";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step32="Step32_SDAUIRS1290_App displays an option to access the Quick start guide,On click Quick start guide is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step33="Step33_SDAUIRS1291 SDAISRS249_App displays an option to access the Quick Reference Guide,on click Quick reference guide is displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step34="Step34_SDAUIRS893_The Note created with food attribute Breakfast 400 grams with today date and time 05:30";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step35="Step35_SDAUIRS1134_Edit note and enter value 401. Error msg will be displayed";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step36="Step36_SDAUIRS894_Food note is created with value 0g of carbs";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step37="Step37_SDAUIRS893_Create a note with Rapid acting insulin";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step38="Step38_SDAUIRS1201_Error message is displayed when value is greater than 200 for units";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step39="Step39_SDAUIRS894_Rapid acting insulin note created with 0.1 units";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step40="Step40_SDAUIRS893_Create a note with Long acting insulin";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step41="Step41_SDAUIRS1201_Error message is displayed when value is greater than 200 for units";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step42="Step42_SDAUIRS894_Long acting insulin note created with 200 units";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step43="Step43_SDAUIRS909_SDAUIRS908_Create a manual BG note";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step44="Step44_SDAUIRS1188_Error message is displayed when value is less than 20 for manual entry Blood glucose";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step45="Step45_SDAUIRS909_SDAUIRS1182_Create a manual BG note with 500 mg/dL value";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step46="Step46_SDAUIRS893_Create a note with exercise attribute";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step47="Step47_SDAUIRS894_Unselect exercise attribute and create note with comments alone";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step48_1="Step48_1_SDAUIRS879_SDAUIRS1219_Verify Notes on Logbook list screen_Today";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step48_2="Step48_2_SDAUIRS879_SDAUIRS1219_Verify Notes on Logbook list screen_Previous Day";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step49_1="Step49_1_SDAUIRS891_SDAUIRS1014_Verify Notes on Logbook graph_Previous Day ";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step49_2="Step49_2_SDAUIRS891_SDAUIRS1014_Verify Notes on Logbook graph_Today ";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step49_3="Step49_3_SDAUIRS891_SDAUIRS1014_Verify Notes on Daily Graph_Today";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step49_4="Step49_4_SDAUIRS891_SDAUIRS1014_Verify Notes on Daily Graph_Previous Day";
	public static final String GeneralFunction_T001_ReleaseBuild_Part1_Step50="Step50_SDAUIRS1239_SDAUIRS1145 SDAUIRS1146_Home Screen is displayed after successful sign In using the same created account and completing the inital setup operations";


	//GeneralFunction_T002_ReleaseBuild_Part2
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step1="Step1_SDAUIRS912_SDAUIRS914_SDAUIRS917 SDAUIRS1156_SDAUIRS1203_Create Reminders with and without repeat options";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step2="Step2_SDAUIRS912_SDAUIRS917 SDAUIRS1158_Verify Reminder Notifications and next reminder set for repeat options";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step3="Step3_SDAUIRS260_SDAUIRS918_SDAUIRS1183_Verify Reminders in reminder list and next reminder text";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step4="Step4_SDAUIRS1123_Delete Reminders_6 once and 44 once";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step5="Step5_SDAUIRS877_SDAUIRS879_Verify Logbook screen";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step6="Step6_SDAUIRS893_SDAUIRS905_SDAUIRS906_Verify created notes (Food 12am and Exercise 2pm) on Logbook detail screen";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step7="Step7_SDAUIRS909_Create a manual BG note";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step8="Step8_SDAUIRS1135_Create a note with Food attribute for 41 svg, error message is displayed";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step9="Step9_SDAUIRS881_SDAUIRS1135_Note with Food attribute 40 svg is displayed on Logbook detail page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step10="Step10_SDAUIRS883_SDAUIRS884_SDAUIRS1144_Verify Logbook graph X and Y axis and Target glucose range highlighted to default value";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step11="Step11_SDAUIRS909_Create Manual BG note for previous day and verify in the logbook list";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step12="Step12_SDAUIRS1144_SDAUIRS1253_Modify Target Glucose Range settings to 70-180 mg/dL or 3.9-10.0 mmol/L";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step13="Step13_SDAUIRS1145_SDAUIRS1146_Update Carbohydrate units to grams";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step14="Step14_SDAUIRS1245_Update Text to Speech settings";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step15="Step15_SDAUIRS925_Verify if account settings have option to edit fields (Email id and Country cannot be edited)";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step16="Step16_SDAUIRS925_Update user details and verify the updated details";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step17="Step17_SDAUIRS926_Update Password and submit";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step18="Step18_SDAUIRS1134_SDAUIRS1135_Create a new note (Food+insulin) and verify if the new note and previously created note 12am is also displayed";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step19="Step19_SDAUIRS891_Verify the attribute count for each note on the Logbook detail graph";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step20="Step20_SDAUIRS883_SDAUIRS884_SDAUIRS1144_Verify Logbook graph X and Y axis and Target glucose range highlighted to 70-180 mg/dL or 3.9-10.0 mmol/L";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step21="Step21_SDAUIRS879_Verify the attributes of all notes in logbook list page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step22="Step22_SDAUIRS1014_Verify the notes position and attributes count in Daily graph report";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step23="Step23_SDAUIRS894_SDAUIRS910_Edit 12am note and delete 7am note and Verify the same in logbook list page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step24="Step24_SDAUIRS1014_Verify the notes position and attributes count in Daily graph report, deleted note should not be present and edited note attribute should be updated";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step25="Step25_SDAUIRS1004_Can view last 90 days in Daily Graph Calendar";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step26="Step26_SDAUIRS1006_SDAUIRS1007_SDAUIRS1195_Verify Daily graph X and Y axis and Target glucose range highlighted to 70-180 mg/dL or 3.9-10.0 mmol/L";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step27="Step27_SDAUIRS953_Verify Daily graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step28="Step28_SDAUIRS954_Share the report through email";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step29="Step29_SDAUIRS955_Verify the current date of the Daily Graph header and no right arrow icon is displayed";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step30="Step30_SDAUIRS957_Not enough sensor data message is displayed on navigating to previous day";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step31="Step31_SDAUIRS961 SDAUIRS967_Verify 0 of 14 days data available text on Daily patterns page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step32="Step32_SDAUIRS961_SDAUIRS967_Swipe to verify 0 of 7 days data available text on Daily patterns page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step33="Step33_SDAUIRS953_Verify Daily Patterns graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step34="Step34_SDAUIRS969_SDAUIRS970_SDAUIRS995 SDAUIRS997_Verify 0 of 30 days data available text on Time In Target page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step35="Step35_SDAUIRS969_SDAUIRS971_Swipe to verify 0 of 90 days data available text on Time In Target page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step36="Step36_SDAUIRS953_Verify Time In Target graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step37="Step37_SDAUIRS1193_SDAUIRS957_Verify Target Glucose range below the graph 70-180 mg/dL or 3.9-10.0 mmol/L and not enough sensor data text";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step38="Step38_SDAUIRS979_SDAUIRS957_ SDAUIRS967_Verify 0 of 7 days data available text, not enough sensor data text on Low Glucose Events page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step39="Step39_SDAUIRS953_Verify Low Glucose Events graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step40="Step40_SDAUIRS991_SDAUIRS994_SDAUIRS957_Verify 0 of 90 days data available text, not enough sensor data text on Average Glucose page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step41="Step41_SDAUIRS953_Verify Average Glucose graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step42="Step42_SDAUIRS1020_SDAUIRS957_Verify not enough sensor data text displayed on Sensor Usage page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step43="Step43_SDAUIRS953_Verify Sensor Usage graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step44="Step44_SDAUIRS1016_SDAUIRS957_Verify not enough sensor data text is displayed on Estimated A1c page";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step45="Step45_SDAUIRS953_Verify Estimated A1c graph information by tapping on i icon";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step46="Step46_SDAUIRS929_Verify Application version, UDI, CE Mark, Registeration Number as applicable to build";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step47="Step47_SDAUIRS929_Verify Customer service link is displayed and accessible";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step48="Step48_SDAUIRS1148_Network error pop up not displayed when time difference between smartphone and network is less than 5 mins";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step49="Step49_SDAUIRS1148_Network error pop up is displayed when time difference between smartphone and network is greater than 5 mins";
	public static final String GeneralFunction_T002_ReleaseBuild_Part2_Step50="Step50_SDAUIRS1148_Network error pop up not displayed when time settings is set to automatic date and time";


	//GeneralFunction_T003_DebugBuild_Part3
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step1="Step1_SDAUIRS861 SDAUIRS863 SDAUIRS864 SDAUIRS868 SDAUIRS871_Home Screen displays graph with HG results and 2 notes";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step2="Step2_SDAUIRS963 SDAUIRS967_Daily Patterns report is displayed with a graph";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step3="Step3_SDAUIRS1021_Sensor Usage report is displayed with values and not blank or zero";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step4="Step4_SDAUIRS970 SDAUIRS971 SDAUIRS977_Time In Target graph is displayed and values add to 100%";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step5="Step5_SDAUIRS992 SDAUIRS993 SDAUIRS995_Average Glucose report is displayed with historical glucose values in 30 days";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step6="Step6_SDAUIRS1004 SDAUIRS1005 SDAUIRS1195_Daily graph distinguishes target glucose range and X axis from midnight to midnight";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step7="Step7_SDAUIRS1250 SDAUIRS1018_Estimated A1c is displayed as percentage and unit as mmol/mol and also displays data avilability";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step8="Step8_SDAUIRS1131 SDAUIRS1243 SDAUIRS1168_My Glucose displays glucose value, notes icons, time zone change event on graph around 12 pm and HG results";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step9_1="Step9_1_SDAUIRS1127_Low Glucose alert pop displays options to set reminder";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step9_2="Step9_2_SDAUIRS1127_Low Glucose alarm set for 15 mins";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step10="Step10_SDAUIRS860 SDAUIRS870_Home Screen displays Time In Target with value, average as value and unit, last scan with value, graph with HG results and time zone change icon";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step11="Step11_SDAUIRS1241_Clicking on time zone icon should display time zone change event";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step12="Step12_SDAUIRS1127_On advancing time to 15 mins it should display the Timer Expired notification";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step13="Step13_SDAUIRS878 SDAUIRS879 SDAUIRS880_Logbook screen should display Notes associated with glucose value and stand alone Notes, also displays trend, time zone change events, time and time zone";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step14="Step14_SDAUIRS884 SDAUIRS885 SDAUIRS886 SDAUIRS888 SDAUIRS889_Logbook detail should display glucose value, graph, time zone icon, time and date, trend, graph with Y axis 0-500mg/dL or 0-27.8 mmol/L";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step15="Step15_SDAUIRS981 SDAUIRS982 SDAUIRS983 SDAUIRS984_Low Glucose event report displays graph with 1 event";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step16="Step16_SDAUIRS1007 SDAUIRS1011 SDAUIRS1012 SDAUIRS1014_Daily Graph distinguishes target glucose value, Y axis 0-350 mg/dL or 0-21 mmol/L, graph with HG results, time zone change icon";
	public static final String GeneralFunction_T003_DebugBuild_Part3_Step17="Step17_SDAUIRS954_Daily Graph is shared using Add To Notes";


}