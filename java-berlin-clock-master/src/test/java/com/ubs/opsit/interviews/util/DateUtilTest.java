package com.ubs.opsit.interviews.util;


import org.junit.Assert;
import org.junit.Test;


public class DateUtilTest {
	
	
	@Test
	public void shouldGiveTrueForValidTime(){
		Assert.assertTrue(DateUtil.isValidTimeFormat("10:10:10"));
	}
	
	@Test
	public void shouldGiveFalseForInValidTime(){
		Assert.assertFalse(DateUtil.isValidTimeFormat("10:10"));
	}
	
	@Test
	public void shouldGiveFalseForNull(){
		Assert.assertFalse(DateUtil.isValidTimeFormat(null));
	}
	
	@Test
	public void shouldGiveFalseForString(){
		Assert.assertFalse(DateUtil.isValidTimeFormat("test"));
	}

}
