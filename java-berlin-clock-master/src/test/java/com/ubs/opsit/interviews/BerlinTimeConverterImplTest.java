package com.ubs.opsit.interviews;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BerlinTimeConverterImplTest {

	private BerlinTimeConverterImpl berlinTimeConverter = new BerlinTimeConverterImpl();

	@Test
	public void shouldNotGetBerlinTimeWithNullInput() {
		String convertTime = berlinTimeConverter.convertTime(null);
		assertNull(convertTime);
	}

	@Test
	public void shouldNotBerlinTimeWithInValidTimeFormat() {
		String convertTime = berlinTimeConverter.convertTime("00:00");
		assertNull(convertTime);
	}

	@Test
	public void shouldBerlinTime() {
		String convertTime = berlinTimeConverter.convertTime("14:14:14");
		assertNotNull(convertTime);
		assertThat(convertTime).isEqualTo(
				"Y\r\nRROO\r\nRRRR\r\nYYOOOOOOOOO\r\nYYYY");
	}

}
