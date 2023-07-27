package job.practice.restart;

import utils.ExcelUtils;

public class excelUtils {
	
	public static void main(String[] args) {
		String projectPath=System.getProperty("user dir");
		ExcelPractice excel=new ExcelPractice(projectPath+"/Excel/SAMPLE EXCEL.xlsx","sheet1");
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
	}
//		String projectPath= System.getProperty("user.dir"); 
//		ExcelPractice excel=new ExcelPractice(projectPath+"/Excel/SAMPLE EXCEL.xlsx", "Sheet1");
//		//excel.getRowCount();
//		excel.getCellDataString(0, 0);
//		excel.getCellDataNumber(1, 1);
//		
//	}
	
//	public static void main(String[] args) {
//		String projectPath= System.getProperty("user.dir");
//		ExcelUtils excel=new ExcelUtils(projectPath+"/Excel/SAMPLE EXCEL.xlsx", "Sheet1");
//		excel.getRowCount();
//		excel.getCellDataNumber(1, 1);
//		excel.getCellDataString(0, 0);
//
//}
	}
