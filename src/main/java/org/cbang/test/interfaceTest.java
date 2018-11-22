package org.cbang.test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.cbang.util.GenerateFile;
import org.cbang.util.RESTfulUtil;

public class interfaceTest {
	public static void main(String[] args) throws MalformedURLException, URISyntaxException{
		String url="http://if.nii.cn:7783/Dts/Intf/intf_ifo_Info_GetList.ashx?a=[Lib={{scutgz}}][DataSet={{xscj}}][_PageNo={{1}}][_PageCount={{100}}]&y=04";
		//URI uri=new URI(urlString);
		//URL url=uri.toURL();
		String jsonInfo=RESTfulUtil.getRESTInfo(url);
		String fileName="xw";
		GenerateFile.generateFile(fileName, jsonInfo);
	}
}
