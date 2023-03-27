package com.utils.poojastore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.interactions.Actions;

import com.base.poojastore.BaseClass;

public class Utils extends BaseClass {

	public static String images = "D:\\jakkam sairam\\Downloads\\pic.webp";

	public Utils() {
		super();
	}

	public static String TESTDATA_EXCEL_PATH = "C:\\Users\\jakkam sairam\\workspace\\PooojaStore\\src\\main\\java\\com\\testdata\\poojastore\\pooja.xlsx";
	static Workbook book;
	static Sheet sheet;

	public static Object[][] getExcelData(String sheetname) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_EXCEL_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
		}
		sheet = book.getSheet(sheetname);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {

			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {

				DataFormatter df = new DataFormatter();

				data[i][k] = df.formatCellValue(sheet.getRow(i + 1).getCell(k));

			}
		}
		return data;
	}

	public void action() {

		Actions ac = new Actions(driver);

	}

}
