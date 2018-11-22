package org.cbang.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GenerateFile {
	public static void generateFile(String fileName,String fileContent){
		String filePath="E://play//"+fileName+".txt";
		File file=new File(filePath);
		if(!file.exists()){
			try {
				file.createNewFile();
				writeContentToFile(filePath,fileContent);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}else{
			System.out.println("文件已存在");
		}
	}
	
	public static boolean writeContentToFile(String filePath,String newLine) throws IOException{
		Boolean result=false;
		String input=newLine+"\r\n";
		BufferedReader bufferedReader=null;
		PrintWriter printWriter=null;
		String temp="";
		try {
			File file=new File(filePath);
			bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			StringBuilder stringBuilder=new StringBuilder();
			while((temp=bufferedReader.readLine())!=null){
				stringBuilder.append(temp);
				stringBuilder=stringBuilder.append(System.getProperty("line.separator"));
			}
			stringBuilder.append(input);
			printWriter=new PrintWriter(new FileOutputStream(file));
			printWriter.write(stringBuilder.toString().toCharArray());
			printWriter.flush();
			result=true;
		} catch(FileNotFoundException e){
			System.out.println("路径错误");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(printWriter!=null){
				printWriter.close();
			}
			if(bufferedReader!=null){
				bufferedReader.close();
			}
		}
		return result;	
	}
}
