package org.cbang.test;

import java.util.ArrayList;

import org.cbang.util.DownloadExcelUtil;
import org.cbang.util.GenerateExcel;
import org.codehaus.plexus.logging.Logger;

public class ExcelTest {
	public static void main(String[] args){
		ArrayList<String> tableHeads=new ArrayList<String>();
		tableHeads.add("���");
		tableHeads.add("ְ����");
		tableHeads.add("����");
		tableHeads.add("ְ��");
		tableHeads.add("���֤��");
		tableHeads.add("�Ƿ���������λ��ְ");
		String path=DownloadExcelUtil.saveExcelToWindwowServer(tableHeads);
		System.out.println(path+"ִ�гɹ�������");
	}
}
