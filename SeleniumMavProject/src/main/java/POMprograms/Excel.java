package POMprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\Vinay\\Documents\\Book1.xlsx");
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet= xsf.getSheetAt(0);
		String entry1 = sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println(entry1);
		xsf.close();

	}

}
