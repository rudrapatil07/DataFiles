package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Sample1 {
	
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream File=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\html\\New Microsoft Excel Worksheet.xlsx");
		
		String xl = WorkbookFactory.create(File).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(xl); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
