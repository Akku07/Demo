package testmvn.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class MvnExcel {
	private static Logger logInf= LogManager.getLogger(MvnExcel.class.getName());
	public static void main(String args[]) throws Exception
	{
		logInf.info("Action Performed");
		logInf.fatal("Action is fatal");
	File file=new File("C:\\Users\\Nidhi Gupta\\Desktop\\Gaurav\\Akku.xlsx");
 XSSFWorkbook wrkBook= new XSSFWorkbook(file);
 int i=wrkBook.getNumberOfSheets();
 System.out.println("No of Sheets:"+i);
   XSSFSheet wrkSheet=null;
 wrkSheet=wrkBook.getSheetAt(0);
          Iterator<Row> rowSheet=wrkSheet.iterator();
          Row rowNo = null;
          while(rowSheet.hasNext())
          {
        	  rowNo=rowSheet.next();
          }
          int rowNum=rowNo.getRowNum();
          System.out.println(rowNum);
          Iterator<Cell> cell=rowNo.iterator();
          Cell cellNo=null;
          ArrayList<String> arrList=new ArrayList<String>();
          while(cell.hasNext())
          {
        	  cellNo=cell.next();
        	  if(cellNo.getCellTypeEnum()==CellType.NUMERIC)
        	  {
        		  arrList.add(NumberToTextConverter.toText(cellNo.getNumericCellValue()));
        	  }
        	  arrList.add(cellNo.getStringCellValue());
          }
          
          String cellString=cellNo.getStringCellValue();
          System.out.println(cellString);
          System.out.println(arrList);

	}
	
}
