package com.abbott.project37375.reports;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({General_T001_insufficientData_ViewDescription.class, General_T002_DateDisplay_ScreenCapture.class,General_T003_Data_Distinguish.class,
	General_T004_Time_NetworkTime_Setting_Check.class,General_T005_Data_HistoricUserTime_TimeZoneChange.class,General_T006_CorruptSASDatabase.class,
	General_T007_DistinguishDataAvailable.class})
public class TestSuiteGeneralReports {
  //nothing
}
