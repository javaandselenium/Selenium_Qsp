package dataDrivenTestting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("./Excel/exceldatat.xlsx");
	Workbook wb = WorkbookFactory.create(f);
	String s = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(s);

	}

}
