package com.facebook.generic.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	
	public String getExceldata(String excelpath, String  sheet, int r, int c) throws Throwable
	
	{
		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 String cellvalue = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		 return cellvalue;
	}
    public int getrowcount(String excelpath, String  sheet, int r, int c) throws Throwable
    {
    	 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 int rowcount = wb.getSheet(sheet).getLastRowNum();
		 return rowcount;
    }
    public void setExcelData
    (String excelpath, String  sheet, int r, int c,String data) throws Throwable
    {
    	FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		 FileOutputStream fos = new FileOutputStream(excelpath);
		 wb.write(fos);
		 wb.close();
    }
    
    public String getPropertyKeyValue(String proPath,String key ) throws Throwable
    {
    	FileInputStream fis = new FileInputStream(proPath);
    	Properties prop = new Properties();
    	prop.load(fis);
    	return prop.getProperty(key, "Incorrect key");
    	
    }
 
    
}
