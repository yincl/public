package com.yincl.core;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.yincl.utils.SSLHttpClient;

public class Query {
	private static final Logger log = Logger.getLogger(Query.class);

	public static String doGet(String fromStation, String toStation, String date) throws Exception {
		ReqMsg msg = new ReqMsg();
		String url = msg.getUrl(fromStation, toStation, date);

		log.info("请求URL:\n" + url);
		HttpGet httpGet = new HttpGet(url);

		httpGet.setHeader("Cookie",
				"JSESSIONID=B613BCBC1155A105FFDE49E87258264D; BIGipServerotsweb=2647916810.22560.0000");
		try {

			/**
			 * 获取代理请求
			 */
			HttpClient httpClient = new SSLHttpClient().getInstance("10.9.1.10", 8080);
			HttpResponse response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			String rsp = EntityUtils.toString(entity);
			
			return rsp;
		} finally {
			httpGet.abort();
		}

	}

}
