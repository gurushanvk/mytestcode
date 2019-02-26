package com.selenium.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class interactWithExcel {
	
	@Test
	public static void findFile() throws EncryptedDocumentException, IOException, InvalidFormatException {
		String Fileloc = "C:\\JAVA software-GFT\\Excel\\OpenToReadData.xlsx";
		
		File myFile = new File(Fileloc);
		FileInputStream fIS = new FileInputStream(myFile);
		
		XSSFWorkbook myWB = new XSSFWorkbook(fIS);
		Sheet myS = myWB.getSheetAt(0);
		int rownum =myS.getPhysicalNumberOfRows();
		
		ArrayList<Object[]> values = new ArrayList<Object[]>();
		for(int rownumv = 0;rownumv< rownum ;rownumv++) {
			values.add(new Object[]{myS.getRow(rownumv).getCell(0).getStringCellValue(),myS.getRow(rownumv).getCell(1).getStringCellValue()});	
		}
		
		Iterator<Object[]> iter =  values.iterator();
		while(iter.hasNext())
		{

			Object[] vtest = iter.next();
			System.out.println(vtest.length);

			SeleniumActions browser =  new SeleniumActions();
			browser.setaction((String) vtest[0], (String) vtest[1]);
			
			/*for (int i=0;i<vtest.length;i++) {
				System.out.println(vtest[i]);
			}*/
		}
		
        FileOutputStream out = new FileOutputStream(Fileloc);
        myWB.write(out);
        out.close();
		
        myWB.close();
	}
}
