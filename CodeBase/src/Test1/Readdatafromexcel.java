package Test1;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readdatafromexcel {

	 public void readExcel(String filePath,String fileName,String sheetName) throws IOException  {

		    //Create an object of File class to open xlsx file

		    //File file =    new File(filePath);
		    String filepath = ("D:\\SAI\\C# Contents.xlsx");

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(filepath);

		    Workbook book = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name

		    String fileExtensionName = fileName.substring(fileName.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    book = new XSSFWorkbook(inputStream);

		    }

		    //Check condition if the file is xls file

		    else if(fileExtensionName.equals(".xls")){

		        //If it is xls file then create object of XSSFWorkbook class

		        book = new HSSFWorkbook(inputStream);

		    }

		    //Read sheet inside the workbook by its name

		    Sheet guru99Sheet = book.getSheet(sheetName);

		    //Find number of rows in excel file

		    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it

		    for (int i = 0; i < rowCount+1; i++) {

		        Row row = guru99Sheet.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

		        }

		        System.out.println();

		    }
	 }

WebDriver driver = new FirefoxDriver();
driver.fi


	
	public static void main(String[] args) throws IOException {
		Readdatafromexcel excelread = new Readdatafromexcel();

		    //Prepare the path of excel file

		   // String filePath = System.getProperty("D:\\SAI\\C# Contents.xlsx\"");

		    //Call read file method of the class to read data

		    String filePath = null;
			excelread.readExcel(filePath, "C# Contents.xlsx", "Contents");


	}

}
