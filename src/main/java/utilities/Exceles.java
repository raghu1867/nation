package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Exceles {
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	private static HSSFCell cell;

	public void setExcelFile(String excelFilePath, String sheetName) {
		// Create an object of File class to open xls file
		File file = new File(excelFilePath);

		try {
			// Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			// creating workbook instance that refers to .xls file
			workbook = new HSSFWorkbook(inputStream);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		// creating a Sheet object
		sheet = workbook.getSheet(sheetName);

	}

	public String getCellData(int rowNumber, int cellNumber) {
		// getting the cell value from rowNumber and cell Number
		cell = sheet.getRow(rowNumber).getCell(cellNumber);

		// returning the cell value as string
		return cell.getStringCellValue();
	}

	public int getRowCountInSheet() {
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		return rowcount;
	}

	public void setCellValue(int rowNum, int cellNum, String cellValue, String excelFilePath) {
		// creating a new cell in row and setting value to it
		sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);

		try {
			FileOutputStream outputStream = new FileOutputStream(excelFilePath);

			workbook.write(outputStream);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
