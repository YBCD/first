package org.cbang.test;

import java.util.ArrayList;

import org.cbang.util.DownloadExcelUtil;
import org.cbang.util.GenerateExcel;
import org.codehaus.plexus.logging.Logger;

public class ExcelTest {
	public static void main(String[] args){
		ArrayList<String> tableHeads=new ArrayList<String>();
		tableHeads.add("序号");
		tableHeads.add("职工号");
		tableHeads.add("姓名");
		tableHeads.add("职称");
		tableHeads.add("身份证号");
		tableHeads.add("是否在其他单位任职");
		String path=DownloadExcelUtil.saveExcelToWindwowServer(tableHeads);
		System.out.println(path+"执行成功。。。");
	}
}
