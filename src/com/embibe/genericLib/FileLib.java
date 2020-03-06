package com.embibe.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * This class contains generic reusable methods for handling property file and excel file
 * @author Bhaskar Singh
 *
 */
public class FileLib {
	
	/**
	 * This generic reusable method is used to read the data from Property File
	 * @param propPath
	 * @param key
	 * @return propValue
	 * @throws Throwable
	 */
	public String getKeyPropValue(String propPath, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "No such key present in PropertyFile");
		return propValue;
	}
	
	
	
	/**
	 * This generic reusable method is used to read the data from the Excel File
	 * @param excelPath
	 * @param sheet
	 * @param r
	 * @param c
	 * @return excelValue
	 * @throws Throwable
	 */
	public String getCellData(String excelPath, String sheet,int r,int c) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String excelValue = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return excelValue;
	}
	
	
	/**
	 * This generic reusable method is used to count the number of filled rows in a sheet
	 * @param excelPath
	 * @param sheet
	 * @return rowCount
	 * @throws Throwable
	 */
	public int getRowCount(String excelPath, String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
		
	}
	
	
	/**
	 * This generic method is used to write the data into the excel file
	 * @param excelPath
	 * @param sheet
	 * @param r
	 * @param c
	 * @param data
	 * @throws Throwable
	 */
	public  void setCellData(String excelPath,String sheet,int r,int c,String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}

}
