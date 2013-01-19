package com.ticket.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @TODO 读取投保单文件
 * @author qdyincl
 * @date 2012-9-12
 * 
 */
public class IOUtil {
	/**
	 * @todo 读取PDF文件
	 * @param String
	 *            pdfUrl 传入
	 * 
	 * @return byte[] 返回字节流
	 */
	public static byte[] loadPdfCache(String absolutePath) throws Exception {
		byte[] cache = null;
		// 1、参数检查
		if (absolutePath == null || "".equals(absolutePath.trim())) {
			throw new Exception("非法参数异常，请检查并确保入口参数不能为空或null！");
		}
		// 2、业务逻辑处理
		File file = new File(absolutePath);
		if (file.exists()) {
			InputStream is = null;
			try {
				is = new FileInputStream(file);
				cache = new byte[is.available()];
				is.read(cache);
			} finally {
				if (is != null) {
					is.close();
				}
			}
		} else {
			throw new Exception("非法PDF文档路径，模板信息不存在，请检查并确保以下路径信息正确！\n" + absolutePath);
		}
		return cache;
	}

	/**
	 * @todo 将pdf文件写到本地磁盘
	 * @param pdfBytes
	 *            byte[] pdf文件
	 * @param absolutePath
	 *            String 绝对路径
	 * @throws Exception
	 *             异常
	 */
	public static void writePdf(byte[] pdfBytes, String absolutePath) throws Exception {
		// 1、参数检查
		if (pdfBytes == null || absolutePath == null || "".equals(absolutePath.trim())) {
			throw new Exception("非法参数异常，请检查并确保入口参数不能为空或null！");
		}

		File file = new File(absolutePath);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			os.write(pdfBytes);
		} finally {
			if (os != null) {
				os.close();
			}
		}
	}
}
