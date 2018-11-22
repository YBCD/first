package org.cbang.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.alibaba.fastjson.JSONObject;

public class RESTfulUtil {
	public static String getRESTInfo(String url){
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(builder.build().encode().toUri(), String.class);
		String body = responseEntity.getBody();
		//JSONObject jsonTest=JSON.parseObject(body);
		//System.out.println("获取token"+jsonTest.get("access_token"));
		HttpStatus statusCode = responseEntity.getStatusCode();
		HttpHeaders header=new HttpHeaders();
		StringBuilder result=new StringBuilder();
		/*
		result.append("消息体：").append(body).append('\n')
				.append("状态码：").append(statusCode).append("\n")
				.append("headers").append(header);
		*/
		result.append(body);
		return result.toString();
	}
	public static JSONObject getJsonInfoBody(String url){
		JSONObject jsonBody=JSONObject.parseObject(getRESTInfo(url));
		return jsonBody;
	}
}

