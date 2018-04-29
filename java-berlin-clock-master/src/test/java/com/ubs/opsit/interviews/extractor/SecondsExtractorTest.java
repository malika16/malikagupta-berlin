package com.ubs.opsit.interviews.extractor;


import org.junit.Assert;
import org.junit.Test;

public class SecondsExtractorTest {
	
	private SecondsExtractor secondsExtractorTest = new  SecondsExtractor();
	
	@Test
	public void shouldGetYellowLightOnEvenSecond(){
		String timeUnit = secondsExtractorTest.getTimeUnit(10);
		Assert.assertNotNull(timeUnit);
		Assert.assertTrue("Y".equals(timeUnit));
	}
	
	@Test
	public void shouldNotGetYellowLightOnOddSecond(){
		String timeUnit = secondsExtractorTest.getTimeUnit(1);
		Assert.assertNotNull(timeUnit);
		Assert.assertTrue("O".equals(timeUnit));
	}
	
	@Test
	public void shouldNotGetYellowLightWhenInputIsNull(){
		String timeUnit = secondsExtractorTest.getTimeUnit(null);
		Assert.assertNotNull(timeUnit);
		Assert.assertTrue("O".equals(timeUnit));
	}

}
