package org.cbang.api;

import java.util.ArrayList;

import org.jsoup.nodes.Document;

public interface JsoupLoader {
	public Document getDocument(String path);
	public void getContent(String classType,String path);
	public ArrayList<String> getHref();
}
