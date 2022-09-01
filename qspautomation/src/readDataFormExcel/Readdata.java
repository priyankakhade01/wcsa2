package readDataFormExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		   FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		    Workbook wh = WorkbookFactory.create(fis);
		    Sheet sh = wh.getSheet("cityTour");
		     Row row = sh.getRow(2);
		     Cell cell = row.getCell(0);
		      String data = cell.getStringCellValue();
		      System.out.println(data);

	}

}
