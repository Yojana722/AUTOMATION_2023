package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//A FileInputStream obtains input bytes from a file in a file system. 
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\October2022\\ExcelSheets\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//1. getStringCellValue() - String, Char
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);//Quantum Academy
		
		String data2 = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data2);//A
		
		//2. getNumericCellValue()
		double data3 = sh.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data3);//100.0

		//explicit casting
		int d3 = (int)data3;
		System.out.println(d3);//100
		
		//3. getBooleanCellValue()
		boolean data4 = sh.getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data4);//true
		
		String data5 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data5);//abc100
		
		String data6 = sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data6);//200
		
		//4. getLastRowNum() - used to identify row size
		int rowSize = sh.getLastRowNum();//counts row from 0th index
		System.out.println(rowSize);//2, actual row size = rowSize(getLastRowNum())+1
		
		//5. getLastCellNum() - used to identify cell size
		short cellSize = sh.getRow(2).getLastCellNum();//cell size = no. of values present in specific row
		System.out.println(cellSize);//1
	}
}
