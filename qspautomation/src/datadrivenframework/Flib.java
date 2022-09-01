package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExceldata(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException{
	  FileInputStream fis = new FileInputStream(excelPath);
	   Workbook wh = WorkbookFactory.create(fis);
	    Sheet sh = wh.getSheet(sheetName);
	     Row row = sh.getRow(rowCount);
	      Cell cell = row.getCell(cellCount);
	     String data = cell.getStringCellValue();
	     return data;
	      
	}
	
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		   Workbook wh = WorkbookFactory.create(fis);
		    Sheet sh = wh.getSheet(sheetName);
		        int rc = sh.getLastRowNum();
		        return rc;
		    
		
	}
}
