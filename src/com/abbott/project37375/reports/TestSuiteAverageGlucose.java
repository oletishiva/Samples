package com.abbott.project37375.reports;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.abbott.project37375.main.PreRequisite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PreRequisite.class,AverageGlucose_T001_View_Display_Xaxis.class, AverageGlucose_T002_DataAvailable.class,
	AverageGlucose_T004_Calculation_Distinguish_Data_mmol.class
	})
//AverageGlucose_T003_Calculation_Distinguish_Data_mg.class
public class TestSuiteAverageGlucose {
  //nothing
}
