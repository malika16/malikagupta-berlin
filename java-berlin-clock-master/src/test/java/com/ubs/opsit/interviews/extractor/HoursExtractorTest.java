package com.ubs.opsit.interviews.extractor;


import org.junit.Assert;
import org.junit.Test;


public class HoursExtractorTest {
	
	private HoursExtractor extractor = new HoursExtractor();
	
	@Test
	public void shouldGetHours(){
		String timeUnit = extractor.getTimeUnit(14);
		Assert.assertTrue("RROO\r\nRRRR".equals(timeUnit));
	}
	
	@Test
	public void shouldNotGetHours(){
		String timeUnit = extractor.getTimeUnit(null);
		Assert.assertNull(timeUnit);;
	}
	
	

}
