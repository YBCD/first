package org.cbang.test;

import org.cbang.api.JsoupLoader;
import org.cbang.util.JsoupLocalFileLoader;
import org.cbang.util.JsoupUrlLoader;

public class LocalFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="http://www.yiibai.com";
		String classType="a[href]";
		JsoupLoader jl=new JsoupUrlLoader();
		jl.getContent(classType, path);
	}

}
