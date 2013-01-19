package com.yincl.test;

import com.yincl.constants.City;
import com.yincl.core.Query;

public class QueryTest {
	
	public static void main(String[] args) throws Exception {
		String rps= Query.doGet(City.BEIJING.getCityCode(),City.QINGDAO.getCityCode(),"2013-02-03");
		System.out.println(rps);
		
	}
}
