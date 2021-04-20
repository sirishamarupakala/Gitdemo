import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	public ArrayList<String> getdata(String TC) throws IOException   
	{
	
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\Users\\Ravi\\Downloads\\Sirisha Selenium notes\\original.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
			XSSFSheet sheet=workbook.getSheetAt(i);
			//first identify required column by scanning the entire first row
			Iterator<Row> rows=sheet.iterator();
			Row firstrow =rows.next();
			Iterator<Cell> cells=firstrow.cellIterator();
			int k=0;
			int column = 0;
			
			while(cells.hasNext())
			{
				Cell value=cells.next();
				if(value.getStringCellValue().contains("Evey"))
				{
				
				column =k;
			}
				k++;
			}
			System.out.println(column);
			
			
			while(rows.hasNext())
			{
			Row r=rows.next();
			if(r.getCell(column).getStringCellValue().contains("numeric"))
			{
				
				Iterator<Cell> cv=r.cellIterator();
				
				while(cv.hasNext())
				{
					Cell c=cv.next();
					if(c.getCellType()==CellType.STRING)
				
				{
					a.add(cv.next().getStringCellValue());
				}
					else
					{
						a.add(NumberToTextConverter.toText(cv.next().getNumericCellValue()));
					}
			}
			}
			
			}
			
			
	}

}
		
		return a;
	}
}



