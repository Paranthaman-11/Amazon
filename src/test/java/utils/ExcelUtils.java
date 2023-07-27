package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public  ExcelUtils(String excelPath,String sheetName) {
		try {
			projectPath= System.getProperty("user.dir");
			 workbook = new XSSFWorkbook(excelPath);
			 sheet= workbook.getSheet(sheetName);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	 
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static void getRowCount() {
		
		try {
			
			int rowCount= sheet.getPhysicalNumberOfRows();
			System.out.println("No.of Rows: "+rowCount);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}		
	}
	
	public static void getCellDataString(int rownum,int colNum) {
		try {
			
			 String cellData= sheet.getRow(rownum).getCell(colNum).getStringCellValue();
			System.out.println("No.of Rows: "+cellData);
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
		public static void getCellDataNumber(int rownum,int colNum) {
			try {
				projectPath= System.getProperty("user.dir");
				 workbook = new XSSFWorkbook(projectPath+"/Excel/SAMPLE EXCEL.xlsx");
				 sheet= workbook.getSheet("Sheet1");
				  double celldata1= sheet.getRow(rownum).getCell(colNum).getNumericCellValue();				
				System.out.println(celldata1);
			}catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
		
		
	}

}
