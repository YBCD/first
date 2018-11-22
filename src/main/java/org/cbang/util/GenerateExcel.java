package org.cbang.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerateExcel {
	private static Random random = new Random();
	
	public static XSSFWorkbook generateExcel(ArrayList<String> tableHeads){
		XSSFWorkbook wb = new XSSFWorkbook();	//����excel
		int columnSize=tableHeads.size();	
		XSSFSheet sheet=wb.createSheet("���Թ�����");
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,4));	//int firstRow, int lastRow, int firstCol, int lastCol
		XSSFRow row0=sheet.createRow(0);
		XSSFCell title=row0.createCell(0);
		XSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
		title.setCellStyle(style);
		title.setCellValue("�������ֵ");
		
		XSSFRow row1 = sheet.createRow(1);
		for(int i=0;i<columnSize;i++){
			row1.createCell(i).setCellValue(tableHeads.get(i));
		}
		/**
		 * ��Ϊ������ݲ���
		 */
		
		return wb;
	}
}
