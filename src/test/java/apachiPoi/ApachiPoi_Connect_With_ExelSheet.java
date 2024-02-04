package apachiPoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachiPoi_Connect_With_ExelSheet {
	
	public static void main(String[] args) throws Throwable{
		final String file="C:\\\\Users\\\\Zahidul Haque\\\\eclipse-workspace\\\\Loop.Collection\\\\testData\\\\TestData.xlsx";
		FileInputStream location= new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(location);
		XSSFSheet sheet=book.getSheet("TestData");
		Iterator<Row>row=sheet.iterator();
		row.next();
		ArrayList<String> list= new ArrayList<String>();
		while(row.hasNext()) {
			list.add(row.next().getCell(1).getStringCellValue());
			System.out.println(list);
		}
		
		
		}
		
	}
	


