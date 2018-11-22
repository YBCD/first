package org.cbang.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.cbang.api.JsoupLoader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupUrlLoader implements JsoupLoader{
	public Document getDocument(String url){
		try {		
			Document document=Jsoup.connect(url).get();
			return document;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到文件");
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void getContent(String classType, String url) {
		Elements elements=getDocument(url).select(classType);
		for(Element element:elements){
			String content=element.text();
			System.out.println(content);
		}
	}

	@Override
	public ArrayList<String> getHref() {
		return null;
		
	}

	
}
