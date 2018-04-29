package com.ubs.opsit.interviews.extractor;

import static com.ubs.opsit.interviews.util.BerlinConstants.NEW_LINE;
import static com.ubs.opsit.interviews.util.BerlinConstants.OFF_MINUTE_ROW;
import static com.ubs.opsit.interviews.util.BerlinConstants.OFF_ROW;
import static com.ubs.opsit.interviews.util.BerlinLampEnum.RED;
import static com.ubs.opsit.interviews.util.BerlinLampEnum.YELLOW;

import java.util.stream.IntStream;

public class MinutesExtractor implements TimeUnitExtractor {

	@Override
	public String getTimeUnit(Integer minutes) {
		StringBuilder rowOneMinutes = new StringBuilder(OFF_MINUTE_ROW);
		StringBuilder rowTwoMinutes = new StringBuilder(OFF_ROW);

		IntStream.range(0, minutes / 5).forEach(i -> {
			if (i == 2 || i == 5 || i == 8) {
				rowOneMinutes.setCharAt(i, RED.getColor());
			} else {
				rowOneMinutes.setCharAt(i, YELLOW.getColor());
			}
		});

		IntStream.range(0, minutes % 5).forEach(
				i -> rowTwoMinutes.setCharAt(i, YELLOW.getColor()));

		return rowOneMinutes + NEW_LINE + rowTwoMinutes;
	}

}
