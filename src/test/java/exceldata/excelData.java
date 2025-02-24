package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import net.bytebuddy.matcher.BooleanMatcher;

public class excelData {
	public static FileInputStream ip ;
	public static XSSFWorkbook workbook ;
	public static XSSFSheet sheet;
	

	public static Object[][] readDataFromExcel1(String sheetname) throws IOException {
	 ip = new FileInputStream("C:\\Users\\Sagar\\OneDrive\\Desktop\\Testing\\Testng 123.xlsx");
	workbook = new XSSFWorkbook(ip);
		 sheet = workbook.getSheet(sheetname);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object [][] data = new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0; j<cols;j++) {
				XSSFCell cell=row.getCell(j);
				
				org.apache.poi.ss.usermodel.CellType cellType= cell.getCellType();
				
				switch(cellType) {
				case STRING:
				data[i][j]= cell.getStringCellValue();
				break;
				case NUMERIC:
					data[i][j]= Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j]= cell.getBooleanCellValue();
					break;
					
				}
				
			}
		}
		return data;
	}
	
	
}