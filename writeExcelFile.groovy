package com.utilities

import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration

public class writeExcelFile {
	@Keyword
	public void demoWriteExcel (String strTest) throws IOException {
		String path  =RunConfiguration.getProjectDir()
		FileInputStream fis=new FileInputStream (path+'\\Test Data\\Login_13d.xlsx')
		XSSFWorkbook workbook=new XSSFWorkbook (fis)
		XSSFSheet sheet =workbook.getSheet('Sheet1')
		XSSFRow row = sheet.getRow(1)
		int colNum=row.getLastCellNum()
		println('Total number of columns : '+colNum)
		println('Value in strTest is :' +strTest)
		XSSFCell cell =null
		if (cell==null)
			cell=row.createCell(colNum)
		cell.setCellValue(strTest)
		FileOutputStream fos = new FileOutputStream(path+'\\Test Data\\Login_13d.xlsx')
		workbook.write(fos)
		fos.close()
	}
}
