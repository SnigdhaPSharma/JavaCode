package com.automation.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class LoginData {

	/*
	 * @DataProvider annotation marks the getLoginData() method as a data provider
	 * It will provide the test data to the test methods in the LoginTests class.
	 */
	@DataProvider(name = "validLoginData")

	/*
	 * getLoginData() method reads the test data from the Excel file using the
	 * Apache POI library to open and read Excel files.
	 */
	public Object[][] getValidLoginData() throws IOException {
		return readExcelData("src/main/resources/testdata/LoginTestData.xlsx", "LoginData");
	}

	@DataProvider(name = "invalidLoginData")
	public Object[][] getInvalidLoginData() throws IOException {
		return readExcelData("src/main/resources/testdata/LoginTestData.xlsx", "InvalidLoginData");
	}

	/*
	 * readExcelData() private method takes the file path of the Excel file and the
	 * name of the sheet containing the test data. It returns a 2D array of Object
	 * representing the test data.
	 */
	private Object[][] readExcelData(String filePath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(fis); // workbook represents the entire Excel file
		Sheet sheet = workbook.getSheet(sheetName); // method obtains the sheet within the workbook by its name
		int rowCount = sheet.getLastRowNum(); // calculates the number of rows and columns in the sheet
		int columnCount = sheet.getRow(0).getLastCellNum();

		/*
		 * method initializes a 2D array data to store the test data. It iterates over
		 * the rows and columns of the sheet, extracts the cell values, and populates
		 * the data array.
		 */
		Object[][] data = new Object[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = cell.toString();
			}
		}

		workbook.close();
		fis.close();
		return data;
	}

}
