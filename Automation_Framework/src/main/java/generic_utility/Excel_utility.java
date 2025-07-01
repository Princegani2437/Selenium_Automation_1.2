package generic_utility;

import java.io.FileInputStream;
import java.time.LocalDateTime;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Ganesh N Bhat
 */
public class Excel_utility {
/**
 * This method is used to read data from excel file in string format
 * @param sheetName
 * @param Rowindex
 * @param Columnindex
 * @return value
 * @throws Exception
 */
	public String getDataFromexcel(String sheetName,int Rowindex,int Columnindex) throws Exception{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/DMShop Testecase.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(Rowindex).getCell(Columnindex).getStringCellValue();
	}
	
	/**
	 * This method is used to read data from excel file in Boolean format
	 * @param sheetName
	 * @param Rowindex
	 * @param Columnindex
	 * @return value
	 * @throws Exception
	 */
	
	public boolean getDataFromexcelbool(String sheetName,int Rowindex,int Columnindex) throws Exception{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/DMShop Testecase.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(Rowindex).getCell(Columnindex).getBooleanCellValue();
	}
	
	/**
	 * This method is used to read data from excel file in number format
	 * @param sheetName
	 * @param Rowindex
	 * @param Columnindex
	 * @return value
	 * @throws Exception
	 */
	public double getDataFromexcelnumber(String sheetName,int Rowindex,int Columnindex) throws Exception{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/DMShop Testecase.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(Rowindex).getCell(Columnindex).getNumericCellValue();
}
	/**
	 * This method is used to read data from excel file in Local Date Time Cell format
	 * @param sheetName
	 * @param Rowindex
	 * @param Columnindex
	 * @return
	 * @throws Exception
	 */
	public LocalDateTime getDataFromexcelLTD(String sheetName,int Rowindex,int Columnindex) throws Exception{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/DMShop Testecase.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(Rowindex).getCell(Columnindex).getLocalDateTimeCellValue();
}
}