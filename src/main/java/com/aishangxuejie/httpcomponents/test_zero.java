package com.aishangxuejie.httpcomponents;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
 * @author: Cuigm
 * @ClassName:  test_zero
 * @Description: TODO
 * @date: 2018年12月28日下午1:59:08
 */
public class test_zero {

	/**
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 * @throws UnsupportedEncodingException 
	 * @Author: Cuigm
	 * @Title: test_zero   
	 * @Description: TODO   
	 * @param:   
	 * @throws
	 */
	/**
	 * @Author: Cuigm
	 * @Title: maintest   
	 * @Description: TODO   
	 * @param:       
	 * @return: void  
	 * @date: 2018年12月28日下午2:23:05    
	 * @throws
	 */
	@Test
	public void test_zero() throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://192.168.123.111/sys/index.php?entryID=2&entryUrl=%2Foa%2Findex.php%3Fm%3Dattend%26f%3Dpersonal");
		CloseableHttpResponse response1 = httpclient.execute(httpGet);
		try {
		    System.out.println(response1.getStatusLine());
		    HttpEntity entity1 = response1.getEntity();
		    // do something useful with the response body
		    // and ensure it is fully consumed
		    EntityUtils.consume(entity1);
		} finally {
		    response1.close();
		}

		/*HttpPost httpPost = new HttpPost("http://192.168.123.111/sys/index.php?m=user&f=login");
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
		nvps.add(new BasicNameValuePair("username", "cuigm"));
		nvps.add(new BasicNameValuePair("password", "cuigm123"));
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
		CloseableHttpResponse response2 = httpclient.execute(httpPost);

		try {
		    System.out.println(response2.getStatusLine());
		    HttpEntity entity2 = response2.getEntity();
		    // do something useful with the response body
		    // and ensure it is fully consumed
		    EntityUtils.consume(entity2);
		} finally {
		    response2.close();
		}*/
	}
}
