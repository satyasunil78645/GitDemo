
  package com.Selenium.Practice;
  
  import java.io.File; import java.io.FileInputStream; import
  java.io.IOException;
  
  import org.apache.poi.EncryptedDocumentException; import
  org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.Row;
  import org.apache.poi.ss.usermodel.Sheet; import
  org.apache.poi.ss.usermodel.Workbook; import
  org.apache.poi.ss.usermodel.WorkbookFactory;
  
  
  public class ExcelReader {
  
  public static void main(String[] args) throws EncryptedDocumentException,
  IOException{ File f=new File("D:\\T-Learn\\Selenium\\ExecelReadFile.xlsx");
  FileInputStream fin=new FileInputStream(f); 
  Workbook wb=WorkbookFactory.create(fin); 
  Sheet sh=wb.getSheet("satyasunil"); 
  Row r= sh.getRow(2); 
  Cell c=r.getCell(2); 
  String value=c.getStringCellValue();
  System.out.println(value); }
  
  
  }
  
