package com.yincl.utils;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

/**
 * @todo 创建HTTPS请求Client
 * @author qdyincl
 * @since 2013-01-17
 */
public class SSLHttpClient {
	protected Logger log = Logger.getLogger(this.getClass());
	/**
	 * http请求客户端
	 */
	private HttpClient httpClient;

	public SSLHttpClient() {
		this.httpClient = new DefaultHttpClient();
		configureSSLHandling();
	}

	/**
	 * @todo 配置代理服务器
	 * @param ip
	 *            String IP地址
	 * @param port
	 *            int 端口号
	 */
	private void configureProxy(String ip, int port) {
		HttpHost proxy = new HttpHost(ip, port);
		this.httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
	}

	/**
	 * @todo 注册请求协议
	 */
	private void configureSSLHandling() {
		Scheme http = new Scheme("http", 80, PlainSocketFactory.getSocketFactory());
		SSLSocketFactory sf = buildSSLSocketFactory();
		Scheme https = new Scheme("https", 443, sf);
		SchemeRegistry sr = this.httpClient.getConnectionManager().getSchemeRegistry();
		sr.register(http);
		sr.register(https);
	}

	/**
	 * @todo 创建无证认证的SSL连接
	 * @return SSLSocketFactory
	 */
	private SSLSocketFactory buildSSLSocketFactory() {
		TrustStrategy ts = new TrustStrategy() {
			@Override
			public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
				return true; // heck yea!
			}
		};

		SSLSocketFactory sf = null;
		try {
			/* 关闭SSL认证 */
			sf = new SSLSocketFactory(ts, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
		} catch (NoSuchAlgorithmException e) {
			log.error("Failed to initialize SSL handling.", e);
		} catch (KeyManagementException e) {
			log.error("Failed to initialize SSL handling.", e);
		} catch (KeyStoreException e) {
			log.error("Failed to initialize SSL handling.", e);
		} catch (UnrecoverableKeyException e) {
			log.error("Failed to initialize SSL handling.", e);
		}
		return sf;
	}

	/**
	 * @todo 获取无代理的客户端请求
	 * @return HttpClient
	 */
	public HttpClient getInstance() {
		return this.httpClient;
	}

	/**
	 * @todo 获取包含代理服务器的请求客户端
	 * @param ip
	 *            String ip地址
	 * @param port
	 *            int 端口号
	 * @return HttpClient
	 */
	public HttpClient getInstance(String ip, int port) {
		this.configureProxy(ip, port);
		return this.httpClient;
	}
}