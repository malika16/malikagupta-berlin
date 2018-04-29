package com.ubs.opsit.interviews.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

	public static boolean isValidTimeFormat(String aTime) {
		DateFormat format = new SimpleDateFormat("h:mm:ss");
		if (StringUtils.isEmpty(aTime)){
			return false;
		}
		try {
			format.parse(aTime);
		} catch (ParseException e) {
			LOGGER.error("Invalid time format entered, Please use h:mm:ss");
			return false;
		}
		return true;
}

}
