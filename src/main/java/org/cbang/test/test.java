package org.cbang.test;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.cbang.model.Html;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSONObject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Html html=new Html();
		//html.getComment("https://www.baidu.com", "WB_text");
	    String url = "http://www.baidu.com/s?wd=site:(www.sina.com)&rn=50";
	    Document doc;
		try {
			doc = Jsoup.connect(url).get();
			 Elements divs = doc.select("div#content_left div[data-tools]");
			 int i=0;
			    for (Element element : divs) {
			    	String json = element.attr("data-tools");
			    	//System.out.println(json);
			    	if(StringUtils.isNotBlank(json) && json.trim().startsWith("{")){
			    		//获取到json
			    		JSONObject jsonObj = JSONObject.parseObject(json.trim());
			    		//获取url
			    		System.out.println(jsonObj);
			    		//String durl = jsonObj.getString("url");//内容url
			    		//do something
			    		//System.out.println(durl);
			    		i++;
			    	}
			    }
			    System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}

}
