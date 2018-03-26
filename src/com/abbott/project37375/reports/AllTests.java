package com.abbott.project37375.reports;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({/* A1c_T001_View_Display_calculation.class, A1c_T002_View_Display.class,
		DailyGraph_T001_View_Display_Xaxis_Distinguish_Data_Notes.class, DailyGraph_T002_Gap_LowG_YaxisRange.class,*/
		DailyGraph_T003_TimeChange.class,
		DailyPatterns_T001_ViewReport_DisplayAGP_ReportPeriods_Xaxis_targetRange.class, DailyPatterns_T002_Yaxis.class,
		DailyPatterns_T003_DataAvailable.class, DailyPatterns_T004_S24Req_Test.class,
		LowGlucoseEvents_T002_DataAvailable.class, LowGlucoseEvents_T003_Calculation_Yaxis.class,
		})
public class AllTests {

}
