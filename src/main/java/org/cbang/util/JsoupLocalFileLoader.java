package org.cbang.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.cbang.api.JsoupLoader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupLocalFileLoader implements JsoupLoader{
	public Document getDocument(String filePath){
		try {
			File file=new File(filePath);
			Document document=Jsoup.parse(file,"UTF-8","");
			System.out.println(document.title());
			return document;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到文件");
			e.printStackTrace();
		}
		return null;
	}
	public void getContent(String classType,String filePath){
		Elements elements=getDocument(filePath).select(classType);
		for(Element element:elements){
			String content=element.attr("href");
			if(content.trim().startsWith("http"))System.out.println(content);
		}
	}
	@Override
	public ArrayList<String> getHref() {
		return null;
		
	}
}
