package org.cbang.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DownloadExcelUtil {
	private Logger logger = Logger.getLogger(this.getClass());
	private static Random random=new Random();
	
	public static String saveExcelToWindwowServer(ArrayList<String> tableHeads){
		XSSFWorkbook wb=GenerateExcel.generateExcel(tableHeads);
		//String path=request.getSession().getServletContext().getRealPath("/excel/");
		//String fileName = path +System.currentTimeMillis()+"-"+ (10000+random.nextInt(9999)) +".xlsx"; 
		String path="E://play//"+"测试值"+random.nextInt(16888)+".xlsx";
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			wb.write(fileOutputStream);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return path;		//返回下载的路径
	}
}
