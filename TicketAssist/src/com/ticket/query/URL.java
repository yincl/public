package com.ticket.query;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @todo URL代理
 * @author qdyincl
 * @since 2013-01-16
 */
public class URL {
	/**
	 * 初始化参数
	 */
	private Map<String, String> params;
	{
		params = new HashMap<String, String>();
		params.put("method", "queryLeftTicket");
		params.put("orderRequest.train_no", "");
		params.put("trainPassType", "QB");
		params.put("trainPassType", "");
		params.put("trainClass", "QB#D#Z#T#K#QT#");
		params.put("includeStudent", "00");
		params.put("seatTypeAndNum", "");
		params.put("orderRequest.start_time_str", "00:00--24:00");
	}

	private String baseUrl = "https://dynamic.12306.cn/otsweb/order/querySingleAction.do";

	/**
	 * @todo 生成GET请求URL
	 * @param startStation
	 *            始发站
	 * @param finalStation
	 *            终点站
	 * @param date
	 *            出发日期
	 * @return URL
	 * @throws UnsupportedEncodingException
	 */
	public String getUrl(String startStation, String finalStation, String date) throws Exception {
		StringBuilder sb = new StringBuilder(this.baseUrl);
		sb.append("?");
		Set<String> paramKeys = this.params.keySet();
		try {
			for (Iterator<String> iterator = paramKeys.iterator(); iterator.hasNext();) {
				String key = iterator.next();
				sb.append(key).append("=").append(java.net.URLEncoder.encode(this.params.get(key), "UTF-8"));
				sb.append("&");
			}
			sb.append("orderRequest.train_date").append("=").append(java.net.URLEncoder.encode(date, "UTF-8"))
					.append("&");
			sb.append("orderRequest.from_station_telecode").append("=")
					.append(java.net.URLEncoder.encode(startStation, "UTF-8")).append("&");
			sb.append("orderRequest.to_station_telecode").append("=")
					.append(java.net.URLEncoder.encode(finalStation, "UTF-8"));

			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new Exception("URL编码异常！");
		}
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	/**
	 * @todo 生成URL测试
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		URL msg = new URL();
		String url = msg.getUrl("BJP", "QDK", "2013-02-04");
		System.out.println(url);

		String sessionId = "JSESSIONID=DF45C8125ACB363C1A5C12B87AD04CCF; BIGipServerotsweb=2396258570.36895.0000; BIGipServerportal=3084124426.17183.0000";
		System.out.println(java.net.URLEncoder.encode(sessionId, "UTF-8"));
	}

}
