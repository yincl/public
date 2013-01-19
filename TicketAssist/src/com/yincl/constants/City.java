package com.yincl.constants;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * @todo 城市转码表
 * @author qdyincl
 */
public enum City {
	
	BEIJING("BJP", "北京"),

	QINGDAO("QDK", "青岛");

	private String cityCode;

	private String cityName;

	private City(String cityCode, String cityName) {
		this.cityCode = cityCode;
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	/**
	 * @todo 通过城市名称获取城市编码
	 * @param cityName
	 *            String 城市名称
	 * @return String cityCode
	 * @throws Exception
	 *             异常
	 */
	public static String getCodeByName(String cityName) throws Exception {
		// 参数检查
		if (cityName == null || "".equals(cityName.trim())) {
			throw new Exception("非法参数异常，请检查并确保入口参数不能为空或null！");
		}

		String cityCode = null;
		EnumSet<City> cities = EnumSet.allOf(City.class);
		for (Iterator<City> iterator = cities.iterator(); iterator.hasNext();) {
			City city = iterator.next();
			if (cityName.equals(city.getCityName())) {
				cityCode = city.getCityCode();
				break;
			}
		}
		return cityCode;
	}
}
