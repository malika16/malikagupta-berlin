package com.ubs.opsit.interviews.extractor;

import org.junit.Assert;
import org.junit.Test;


public class MinutesExtractorTest {
	
private TimeUnitExtractor extractor = new MinutesExtractor();
	
	@Test
	public void shouldGetHours(){
		String timeUnit = extractor.getTimeUnit(14);
		Assert.assertTrue("YYOOOOOOOOO\r\nYYYY".equals(timeUnit));
	}
	

}


