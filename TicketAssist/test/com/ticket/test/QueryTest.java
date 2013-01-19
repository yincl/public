package com.ticket.test;

import com.ticket.constants.City;
import com.ticket.query.TicketQuery;

public class QueryTest {
	
	public static void main(String[] args) throws Exception {
		String rps= TicketQuery.doGet(City.BEIJING.getCityCode(),City.QINGDAO.getCityCode(),"2013-02-03");
		System.out.println(rps);
		
	}
}
