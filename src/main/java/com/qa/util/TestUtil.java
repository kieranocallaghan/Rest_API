package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TestUtil extends TestBase{
	
	public final static int RESPONSE_CODE_200 = 200;
	public final static int RESPONSE_CODE_201 = 201;
	public final static int RESPONSE_CODE_400 = 400;
	public final static int RESPONSE_CODE_401 = 401;
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	
	

	static Workbook book;
	static Sheet sheet;
	//static JavascriptExecutor js;
	static String homePage = null; // "http://bavarianinn.snipp.ie/home/"; // Changed
	static String url = "";
	static HttpURLConnection huc = null;
	int respCode = 200;

	//public void switchToFrame() {
		//driver.switchTo().frame("mainpanel");
	//}

	public static ArrayList<String> getTestDataArray(String sheetName, String TESTDATA_SHEET_PATH) throws Exception { 
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Spreadsheet tab not found, please check the Tab parameter");
		}
		sheet = book.getSheet(sheetName);
		ArrayList<String> data = new ArrayList<String>();
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
data.add(sheet.getRow(i + 1).getCell(k).toString());
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	//Excel reader
	public static Object[][] getTestData(String sheetName, String TESTDATA_SHEET_PATH) throws Exception { 
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Spreadsheet tab not found, please check the Tab parameter");
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	public static void PrintArrayList(ArrayList<String> tableData) {
		for (int i = 0; i < tableData.size(); i++) {
			System.out.println(tableData.get(i));
		}
	}

}
