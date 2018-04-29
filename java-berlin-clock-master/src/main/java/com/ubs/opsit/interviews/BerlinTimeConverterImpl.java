package com.ubs.opsit.interviews;

import static com.ubs.opsit.interviews.extractor.TimeExtractorFactory.getTimeExtractor;
import static com.ubs.opsit.interviews.util.BerlinConstants.TIME_SPLITTER;
import static com.ubs.opsit.interviews.util.DateUtil.isValidTimeFormat;
import static com.ubs.opsit.interviews.util.TimeUnitEnum.HOURS;
import static com.ubs.opsit.interviews.util.TimeUnitEnum.MINUTES;
import static com.ubs.opsit.interviews.util.TimeUnitEnum.SECONDS;
import static org.apache.commons.lang.StringUtils.isNotEmpty;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.interviews.builder.BerlinTimeBuilder;

public class BerlinTimeConverterImpl implements TimeConverter {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BerlinTimeConverterImpl.class);
	private BerlinTimeBuilder builder;
	@Override
	public String convertTime(String inputTime) {
		if (isNotEmpty(inputTime) && isValidTimeFormat(inputTime)) {
			try {
				Integer[] timeSplitter = Stream.of(inputTime.split(TIME_SPLITTER))
						.map(x -> Integer.parseInt(x)).toArray(Integer[]::new);
				builder = new BerlinTimeBuilder.BerlinBuilder(
						getTimeExtractor(HOURS).getTimeUnit(timeSplitter[0]),
						getTimeExtractor(MINUTES).getTimeUnit(timeSplitter[1]),
						getTimeExtractor(SECONDS).getTimeUnit(timeSplitter[2]))
						.build();
				return builder.getBerlinTime().toString();
			} catch (Exception e) {
				LOGGER.error("Exception while converting to berlin time :"
						+ e.getMessage());
			}
		}
		return null;
	}

}
