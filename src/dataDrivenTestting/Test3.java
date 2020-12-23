package dataDrivenTestting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// create object for excel file
		FileInputStream f = new FileInputStream("./Excel/exceldatat.xlsx");
		// open the workbook in readmode
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("Sheet1");
		//get last row index from sheet
		int rowIndex = sh.getLastRowNum();
		System.out.println(rowIndex);
      //go to every row and get 1st and 2nd colum data from sheet2
       for(int i=0;i<=rowIndex;i++) {
    	   Row row = sh.getRow(i);
    	   String data1 = row.getCell(1).getStringCellValue();
           String data2=row.getCell(2).getStringCellValue();
           System.out.println(data1+"\t"+data2);
       }
	}

}
