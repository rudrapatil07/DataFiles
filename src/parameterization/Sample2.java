package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream File=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\html\\Uchiha.xlsx");
		
		Sheet Sheet = WorkbookFactory.create(File).getSheet("Sheet2");
		
		String name = Sheet.getRow(0).getCell(0).getStringCellValue();
		
		double pass = Sheet.getRow(1).getCell(0).getNumericCellValue();
		
		System.out.println(name);
		
		System.out.println(pass);
	
		String sirname = Sheet.getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(sirname);
		
		
		boolean Result = Sheet.getRow(1).getCell(1).getBooleanCellValue();
		
		
		System.out.println(Result);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
