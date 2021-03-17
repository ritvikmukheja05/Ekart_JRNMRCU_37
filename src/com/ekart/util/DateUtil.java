package com.ekart.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Date convertToDate(String datestring) {
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(datestring);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return date;
	}
}