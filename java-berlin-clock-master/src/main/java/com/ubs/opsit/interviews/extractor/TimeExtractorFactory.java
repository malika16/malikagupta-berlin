package com.ubs.opsit.interviews.extractor;

import com.ubs.opsit.interviews.util.TimeUnitEnum;

public class TimeExtractorFactory {

	public static TimeUnitExtractor getTimeExtractor(TimeUnitEnum timeUnit) {

		switch (timeUnit) {
		case HOURS:
			return new HoursExtractor();
		case MINUTES:
			return new MinutesExtractor();
		case SECONDS:
			return new SecondsExtractor();
		}
		return null;

	}

}
