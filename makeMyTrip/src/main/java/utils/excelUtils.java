package utils;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils
{
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	int rowCount;
	int colCount;
	XSSFRow row;
	XSSFCell cell;


	public excelUtils(String excelPath, String sheetName)
	{
		try
		{
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}

		catch(Exception e)
		{
			e.getMessage();
		}
	}


	public int getRowCount()
	{
		try
		{
			rowCount = sheet.getLastRowNum()+1;
			System.out.println("# of rows : "+rowCount);
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		return rowCount;
	}

	public int getColCount()
	{
		try
		{
			for(int i=0; i<rowCount; i++)
			{
				colCount = sheet.getRow(i).getLastCellNum();
				System.out.println("# of rows in "+i+" are : "+colCount);
			}
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return colCount;

		
	}

	/*String getCellData(String sheetName, String colName, int colNum)
	{
		try
		{
			
		}
		
		catch(Exception e)
		{
			return 
		}
		
	}*/


	public void getUserName()
	{
		try
		{
			for(int i=1; i<=rowCount; i++)
			{
				System.out.println("Username "+i+" : "+sheet.getRow(i).getCell(0).getStringCellValue());
			}	
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public void getPassword()
	{
		try
		{
			System.out.println("Password : "+sheet.getRow(1).getCell(1).getStringCellValue());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	

	public void getFromCity()
	{
		for(int i=0; i<rowCount; i++)
		{
			colCount = sheet.getRow(i).getLastCellNum();
			for(int j = 0; j < colCount; j++)
			{
				System.out.println("Row values are : "+sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
			

			/*if(sheet.getRow(i).getCell(i).getStringCellValue().equalsIgnoreCase("fromCity"))
				{
					for(int j=0; j<rowCount; j++)
					{
						System.out.println("From city values are : "+sheet.getRow(i).getCell(j).getStringCellValue());
					}
				}*/
		//}
		/*try
			{
				System.out.println("From City : "+sheet.getRow(1).getCell(2).getStringCellValue());
			}
			catch(Exception e)
			{
				e.getMessage();
			}*/
		
	}

	public void getToCity()
	{
		try
		{
			System.out.println("To City : "+sheet.getRow(1).getCell(3).getStringCellValue());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public void getTravellingMonth()
	{
		try
		{
			System.out.println("Travelling Month : "+sheet.getRow(1).getCell(4).getStringCellValue());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public void getTravellingDate()
	{
		try
		{
			System.out.println("Travelling Date : "+sheet.getRow(1).getCell(5).getStringCellValue());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public void getReturnMonth()
	{
		try
		{
			System.out.println("Return Month : "+sheet.getRow(1).getCell(6).getStringCellValue());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public void getReturnDate()
	{
		try
		{
			System.out.println("Return Date : "+sheet.getRow(1).getCell(7).getStringCellValue());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
