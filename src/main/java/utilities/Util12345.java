package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Base;

public class Util12345 extends Base {

	public static long IMPLICIT_WAIT = 20;
	public static long PAGE_LOAD_TIMEOUT = 20;

	public static String TEST_DATA = "C:\\Users\\Jayap\\eclipse-workspace2\\nationality.com\\testdata\\New Microsoft Excel Worksheet.xlsx";
	static Workbook book;
	static XSSFSheet sheet;
	static JavascriptExecutor js;

	public static Object[][] getTestData(String sheetname) {

		FileInputStream file = null;
		try {
			file = new FileInputStream(TEST_DATA);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet=(XSSFSheet) book.getSheet(sheetname);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				
				
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();				
			}
		}
		return data;
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
