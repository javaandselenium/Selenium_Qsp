package dataDrivenTestting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./Excel/exceldatat.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet sheet = wb.getSheet("Sheet1");
		int lastrouwnum = sheet.getPhysicalNumberOfRows();
		int lastcellnum = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<lastrouwnum;i++) {
			for(int j=0;j<lastcellnum;j++) {
				String v = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(v);
			}
		}
		

	}

}
