package com.ubs.opsit.interviews.extractor;

import static com.ubs.opsit.interviews.util.BerlinConstants.NEW_LINE;
import static com.ubs.opsit.interviews.util.BerlinLampEnum.RED;

import java.util.stream.IntStream;

import com.ubs.opsit.interviews.util.BerlinConstants;

public class HoursExtractor implements TimeUnitExtractor {

	@Override
	public String getTimeUnit(Integer hours) {
		if (null == hours) {
			return null;
		}

		StringBuilder rowOneHour = new StringBuilder(BerlinConstants.OFF_ROW);
		StringBuilder rowTwoHour = new StringBuilder(BerlinConstants.OFF_ROW);

		IntStream.range(0, hours / 5)
				.forEach(i -> rowOneHour.setCharAt(i, RED.getColor()));

		IntStream.range(0, hours % 5)
				.forEach(i -> rowTwoHour.setCharAt(i, RED.getColor()));

		return rowOneHour + NEW_LINE + rowTwoHour;
	}

}
