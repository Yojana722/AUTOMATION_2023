package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// A FileInputStream obtains input bytes from a file in a file system.
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\October2022\\ExcelSheets\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//5. getCellType()
		CellType cellType = sh.getRow(0).getCell(2).getCellType();
		System.out.println(cellType);//STRING, NUMERIC, BOOLEAN
	}
}
